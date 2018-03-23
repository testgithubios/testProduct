/**
 * 
 */
package com.bosch.wrd;

import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configurable
@EnableJpaRepositories(basePackages = { "com.bosch.wrd.entity", "com.bosch.wrd.dao" })
@EnableTransactionManagement
@EnableSpringDataWebSupport
// @EnableScheduling
public class ApplicationConfiguration {
	/**
	 * @return H2 DB console web servlet
	 */
	@Bean
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
}