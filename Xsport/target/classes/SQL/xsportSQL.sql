SELECT * FROM xsport.user;

CREATE DATABASE xsport;

DROP TABLE `xsport`.`user`;
DROP TABLE `xsport`.`emp`;
  
  CREATE TABLE `xsport`.`user` (
  `user_account` VARCHAR(50) NOT NULL,
  `user_password` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(50) NOT NULL,
  `user_image` LONGTEXT NULL,
  `email` VARCHAR(45) NULL,
  `tel` VARCHAR(45) NULL,
  PRIMARY KEY (`user_account`));

insert into user(user_account,user_password,user_name,user_image,email,tel) values('linchehong@gmail.com','123456','林哲弘','userImage','linchehong@gmail.com','0933157973')


CREATE TABLE `xsport`.`emp` (
  `emp_no` INT NOT NULL,
  `emp_account` VARCHAR(45) NOT NULL,
  `emp_pwd` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`emp_no`));
  
  
insert into emp(emp_no,emp_account,emp_pwd) values('10001','uatemp','1qaz!QAZ')