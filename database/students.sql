/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.1.36-MariaDB : Database - students
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`students` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `students`;

/*Table structure for table `student_record` */

DROP TABLE IF EXISTS `student_record`;

CREATE TABLE `student_record` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(100) DEFAULT NULL,
  `student_email` varchar(50) DEFAULT NULL,
  `student_password` varchar(20) DEFAULT NULL,
  `student_gender` varchar(6) DEFAULT NULL,
  `student_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `student_record` */

insert  into `student_record`(`student_id`,`student_name`,`student_email`,`student_password`,`student_gender`,`student_address`) values (6,'YAW','yaw@yahoo.com','12345','Female','Pasig City'),(7,'ASD','asd@yahoo.com','12345','Male','manila'),(8,'ASDF','asdf@yahoo.com','12345','Female','Quezon city'),(9,'SOFTWAREENGINNER JAY','soft@gmail.com','12345','Male','Manila');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
