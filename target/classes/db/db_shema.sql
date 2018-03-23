-- -----------------------------------------------------
-- Schema work_pakages
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `work_pakages` DEFAULT CHARACTER SET utf8 ;
USE `work_pakages` ;

-- -----------------------------------------------------
-- Table `work_pakages`.`permission`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`permission` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`permission` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` TINYINT(1),
  `nr` TINYINT(1),
  `user_id` TINYINT(1),  
  `priority` TINYINT(1),
  `last_update` TINYINT(1),
  `status` TINYINT(1),
  `belt` TINYINT(1),
  `customer` TINYINT(1),
  `customer_plant` TINYINT(1),
  `line` TINYINT(1),
  `location` TINYINT(1),
  `description_change` TINYINT(1),
  `unit` TINYINT(1) ,
  `aqcdt` TINYINT(1),
  `etp_test` TINYINT(1),
  `jatco_release_meth` TINYINT(1),
  `pic` TINYINT(1),
  `counter_part` TINYINT(1),
  `npc_s` TINYINT(1),
  `mqs` TINYINT(1),
  `risk_review` TINYINT(1),
  `p_dr01` TINYINT(1),
  `p_dr2` TINYINT(1),
  `npc_r` TINYINT(1),
  `isr` TINYINT(1),
  `quality_resp` TINYINT(1),
  `psw_submit` TINYINT(1),
  `p_dr_3_5` TINYINT(1),
  `master_belt_delivery` TINYINT(1),
  `psw_approval` TINYINT(1),
  `rb_orig_sop` TINYINT(1),
  `rb_sop` TINYINT(1),
  `ckd_dispatch_date` TINYINT(1),
  `dispatch_from_bosch_plant` TINYINT(1),
  `arrival_at_customer` TINYINT(1),
  `frozen_period` TINYINT(1),
  `traffic_light` TINYINT(1),
  `qg1` TINYINT(1),
  `qg2` TINYINT(1),
  `qg3` TINYINT(1),
  `qg4` TINYINT(1),
  `qg5` TINYINT(1),
  `project_nr` TINYINT(1),
  `ecr_status` TINYINT(1),
  `customer_inform` TINYINT(1),
  `es` TINYINT(1),
  `npc_s_old` TINYINT(1),
  `p_dr01_old` TINYINT(1),
  `p_dr2_old` TINYINT(1),
  `npc_r_old` TINYINT(1),
  `psw_submit_old` TINYINT(1) ,
  `psw_approval_old` TINYINT(1) ,
  `type_of_change` TINYINT(1),
  `lessons_learned` TINYINT(1),
  `uniqu` TINYINT(1),
  `notes` TINYINT(1),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`role` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`role` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(50) NULL,
  `label` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`roles_permissions`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`roles_permissions` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`roles_permissions` (
  `role_id` BIGINT(20) NOT NULL,
  `permission_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`role_id`, `permission_id`),
  INDEX `FK_Permission_idx` (`permission_id` ASC),
  CONSTRAINT `FK_Permission`
    FOREIGN KEY (`permission_id`)
    REFERENCES `work_pakages`.`permission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Role_Permission`
    FOREIGN KEY (`role_id`)
    REFERENCES `work_pakages`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`user` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NULL,
  `credentials_expired_date` DATE NULL,
  `enabled` TINYINT(1) NULL,
  `password` VARCHAR(50) NULL,
  `email` VARCHAR(50) NULL,
  `date_created` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`users_roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`users_roles` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`users_roles` (
  `role_id` BIGINT(20) NOT NULL,
  `user_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`role_id`, `user_id`),
  INDEX `fk_role_idx` (`role_id` ASC),
  INDEX `fk_user_idx` (`user_id` ASC),
  CONSTRAINT `fk_role`
    FOREIGN KEY (`role_id`)
    REFERENCES `work_pakages`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `work_pakages`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`releases`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`releases` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`releases` (
  `nr` BIGINT(20) NOT NULL,
  `user_id` BIGINT(20) NULL, 
  `last_update` DATE NULL,
  `status` VARCHAR(50) NULL ,
  `belt` VARCHAR(50) NULL,
  `customer` VARCHAR(50) NULL ,
  `line` VARCHAR(50) NULL,
  `location` VARCHAR(50) NULL ,
  `description_change` VARCHAR(255) NULL,
  `uniqu` VARCHAR(50) NULL,
  `unit` VARCHAR(50) NULL ,
  `aqcdt` VARCHAR(50) NULL,
  `etp_test` VARCHAR(50) NULL,
  `jatco_release_meth` VARCHAR(50) NULL,
  `pic` VARCHAR(50) NULL,
  `counter_part` VARCHAR(50) NULL,
  `npc_s` DATE NULL,
  `mqs` VARCHAR(50) NULL,
  `risk_review` DATE NULL,
  `p_dr01` DATE NULL,
  `p_dr2` DATE NULL,
  `npc_r` DATE NULL,
  `isr` DATE NULL,
  `quality_resp` VARCHAR(50) NULL,
  `psw_submit` DATE NULL,
  `p_dr_3_5` DATE NULL,
  `master_belt_delivery` DATE NULL,
  `psw_approval` DATE NULL,
  `rb_orig_sop` DATE NULL,
  `rb_sop` DATE NULL,
  `ckd_dispatch_date` DATE NULL,
  `dispatch_from_bosch_plant` DATE NULL,
  `arrival_at_customer` DATE NULL,
  `frozen_period` INT NULL,
  `traffic_light` VARCHAR(50) NULL,
  `qg1` DATE NULL,
  `qg2` DATE NULL,
  `qg3` DATE NULL,
  `qg4` DATE NULL,
  `qg5` DATE NULL,
  `project_nr` VARCHAR(50) NULL,
  `ecr_status` INT NULL,
  `ecr_nr` INT NULL,
  `customer_inform` VARCHAR(50) NULL,
  `notes` VARCHAR(255) NULL,
  `npc_s_old` DATE NULL,
  `p_dr01_old` DATE NULL,
  `p_dr2_old` DATE NULL,
  `npc_r_old` DATE NULL,
  `psw_submit_old` DATE NULL,
  `psw_approval_old` DATE NULL,
  `type_of_change` VARCHAR(50) NULL,
  `etp_testing` VARCHAR(50) NULL,
  PRIMARY KEY (`nr`),
  INDEX `fk_releases_user_idx` (`user_id` ASC),
  CONSTRAINT `fk_releases_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `work_pakages`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`lessons_learn`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`lessons_learned` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`lessons_learned` (
  `releases_id` BIGINT(20) NULL,
  `category` VARCHAR(50) NULL,
  `problem_description` VARCHAR(255) NULL,
  `root_cause` VARCHAR(255) NULL,
  `lesson_learned` VARCHAR(255) NULL,
  `who_should_get_inform` VARCHAR(255) NULL,
  `transferable` VARCHAR(255) NULL,
  `action_for` VARCHAR(255) NULL,
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `action_for_el_7` VARCHAR(255) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`type_of_change`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`type_of_change` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`type_of_change` (
  `name` VARCHAR(50) NULL,
  `id` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`unit`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`unit` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`unit` (
  `id` VARCHAR(50) NOT NULL,
  `description` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`location`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`location` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`location` (
  `id` VARCHAR(50) NOT NULL,
  `name` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`customer` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`customer` (
  `id` VARCHAR(50) NOT NULL,
  `name` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`priority`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`priority` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`priority` (
  `id` VARCHAR(50) NOT NULL,
  `name` VARCHAR(50) NULL,
  `releases_id` BIGINT(20) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`counter_part`
-- -----------------------------------------------------
-- DROP TABLE IF EXISTS `work_pakages`.`counter_part` ;
--
-- CREATE TABLE IF NOT EXISTS `work_pakages`.`counter_part` (
--  `id` VARCHAR(50) NOT NULL,
--  `name` VARCHAR(50) NULL,
--  PRIMARY KEY (`id`))
-- ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`project_review`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`project_review` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`project_review` (
  `releases_id` BIGINT(20) NULL,
  `current_highlights` VARCHAR(255) NULL,
  `risks_issues` VARCHAR(255) NULL,
  `activities_planned` VARCHAR(255) NULL,
  `mitigation` VARCHAR(255) NULL,
  `status` VARCHAR(255) NULL,
  `title` VARCHAR(255) NULL,
  `dateCreated` DATE NULL,
  `dateUpdated` DATE NULL,
  `dateUpdatedLight` VARCHAR(255) NULL,
  `dateCreatedLight` VARCHAR(255) NULL,
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_releases_review_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_releases_review`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`stearing_committee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`stearing_committee` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`stearing_committee` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `releases_id` BIGINT(20) NULL,
  `kpi_t` VARCHAR(255) NULL,
  `kpi_s` VARCHAR(255) NULL,
  `kpi_b` VARCHAR(255) NULL,
  `risk_if` VARCHAR(255) NULL,
  `status` VARCHAR(255) NULL,
  `risk_then` VARCHAR(255) NULL,
  `risk_rating` VARCHAR(50) NULL,
  `risk_corrective_action` VARCHAR(255) NULL,
  `risk_due` DATE NULL,
  `qg_actual_0` DATE NULL,
  `qg_actual_1` DATE NULL,
  `qg_actual_2` DATE NULL,
  `qg_actual_3` DATE NULL,
  `qg_actual_4` DATE NULL,
  `qg_actual_5` DATE NULL,
  `project_highlight_issue` VARCHAR(255) NULL,
  `project_highlight_reason` VARCHAR(255) NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_stearing_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_stearing_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`highlight`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`highlight` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`highlight` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `releases_id` BIGINT(20) NULL,
  `color` VARCHAR(50) NULL,
  `column_name` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_highlight_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_highlight_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`row_formatting`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`row_formatting` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`row_formatting` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `releases_id` BIGINT(20) NULL,
  `run_pos` INT NULL,
  `run_len` INT NULL,
  `font_index` INT NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_row_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_row_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`pic`
-- -----------------------------------------------------
-- DROP TABLE IF EXISTS `work_pakages`.`pic` ;
--
-- CREATE TABLE IF NOT EXISTS `work_pakages`.`pic` (
--  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
--  `releases_id` BIGINT(20) NULL,
--  `name` VARCHAR(50) NULL,
--  `department` VARCHAR(50) NULL,
--  PRIMARY KEY (`id`),
--  INDEX `fk_pic_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_pic_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
-- ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `work_pakages`.`testing_capacity`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`testing_capacity` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`testing_capacity` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `releases_id` BIGINT(20) NULL,
  `test_location` VARCHAR(50) NULL,
  `date_of_notes` DATE NULL,
  `notes` VARCHAR(255) NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_testing_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_testing_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `work_pakages`.`porfolio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`porfolio` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`porfolio` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `releases_id` BIGINT(20) NULL,
  `planned_start_time` DATE NULL,
  `planned_isr` DATE NULL,
  `planned_sop` DATE NULL,
  `last_quality_gate` VARCHAR(50) NULL,
  `scope_short_description` VARCHAR(255) NULL,
  `remark_for_closed_projects` VARCHAR(255) NULL,
  `pgl` TINYINT(1) NULL,
  `pia` DATE NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_porfolio_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_porfolio_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `work_pakages`.`customer_plant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`customer_plant` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`customer_plant` (
  `id` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `releases_id` BIGINT(20) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `work_pakages`.`ETPTesting`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`ETPTesting` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`ETPTesting` (
  `id` VARCHAR(50) NOT NULL,  
  `value` VARCHAR(50) NULL,
  PRIMARY KEY (`id`))
--  ,
--  INDEX `fk_ETPTesting_releases_idx` (`releases_id` ASC),
--  CONSTRAINT `fk_ETPTesting_releases`
--    FOREIGN KEY (`releases_id`)
--    REFERENCES `work_pakages`.`releases` (`nr`)
--    ON DELETE NO ACTION
--    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `work_pakages`.`releases_priorities`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`releases_priorities` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`releases_priorities` (
  `releases_nr` BIGINT(20) NOT NULL,
  `priority_id` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`releases_nr`, `priority_id`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `work_pakages`.`releases_customerPlants`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `work_pakages`.`releases_customerPlants` ;

CREATE TABLE IF NOT EXISTS `work_pakages`.`releases_customerPlants` (
  `releases_nr` BIGINT(20) NOT NULL,
  `customer_plant_id` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`releases_nr`, `customer_plant_id`))
ENGINE = InnoDB;
