package com.bosch.wrd.version;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Autowired
	private CopyEnties copy;
	
	@Scheduled(cron = "0 0/1 * * * ?")
	public void excuteVersioning() {
		LOG.info(">>>>>>>>>>>>>> Versioning is now {}", dateFormat.format(new Date()));
		
		try {
			copy.run();
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	}
}
