-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema superheroe
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema superheroe
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `superheroe` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `superheroe` ;

-- -----------------------------------------------------
-- Table `superheroe`.`creador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `superheroe`.`creador` (
  `id_creador` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_creador`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `superheroe`.`personaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `superheroe`.`personaje` (
  `id_personaje` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre_real` VARCHAR(20) NOT NULL,
  `personaje` VARCHAR(20) NOT NULL,
  `inteligencia` INT NOT NULL,
  `fuerza` VARCHAR(10) NOT NULL,
  `velocidad` INT NOT NULL,
  `poder` INT NOT NULL,
  `aparicion` INT NOT NULL,
  `ocupacion` VARCHAR(30) NULL DEFAULT NULL,
  `id_creador` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id_personaje`),
  INDEX `id_creador` (`id_creador` ASC),
  CONSTRAINT `personaje_ibfk_1`
    FOREIGN KEY (`id_creador`)
    REFERENCES `superheroe`.`creador` (`id_creador`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
