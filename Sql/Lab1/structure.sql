-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Team` (
  `id` TINYINT(3) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Player`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Player` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `team_id` TINYINT(3) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Player_Team_idx` (`team_id` ASC),
  CONSTRAINT `fk_Player_Team`
    FOREIGN KEY (`team_id`)
    REFERENCES `mydb`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pledge`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pledge` (
  `id` TINYINT(3) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `amount` INT NOT NULL,
  `address` VARCHAR(100) NULL,
  `Player_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Pledge_Player1_idx` (`Player_id` ASC),
  CONSTRAINT `fk_Pledge_Player1`
    FOREIGN KEY (`Player_id`)
    REFERENCES `mydb`.`Player` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Game`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Game` (
  `home` TINYINT(3) UNSIGNED NOT NULL,
  `away` TINYINT(3) UNSIGNED NOT NULL,
  `court` ENUM('A', 'B', 'C') NOT NULL,
  `gametime` DATETIME NOT NULL,
  `winner` TINYINT(3) UNSIGNED NOT NULL,
  INDEX `fk_Game_Team1_idx` (`home` ASC),
  INDEX `fk_Game_Team2_idx` (`away` ASC),
  PRIMARY KEY (`home`, `away`),
  INDEX `fk_Game_Team3_idx` (`winner` ASC),
  CONSTRAINT `fk_Game_Team1`
    FOREIGN KEY (`home`)
    REFERENCES `mydb`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Game_Team2`
    FOREIGN KEY (`away`)
    REFERENCES `mydb`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Game_Team3`
    FOREIGN KEY (`winner`)
    REFERENCES `mydb`.`Team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
