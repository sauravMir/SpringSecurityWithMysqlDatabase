CREATE TABLE `SecurityDB`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` INT NOT NULL,
  `created` DATETIME NOT NULL,
  `updated` DATETIME NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `SecurityDB`.`user_session` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `token` VARCHAR(45) NOT NULL,
  `created` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `id_idx` (`user_id` ASC),
  CONSTRAINT `id`
    FOREIGN KEY (`user_id`)
    REFERENCES `SecurityDB`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);