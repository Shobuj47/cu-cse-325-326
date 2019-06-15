/*
SQLyog Community v12.3.2 (32 bit)
MySQL - 10.1.37-MariaDB : Database - libmanagment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`libmanagment` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `libmanagment`;

/*Table structure for table `bookcategories` */

DROP TABLE IF EXISTS `bookcategories`;

CREATE TABLE `bookcategories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(100) NOT NULL,
  `parentcatagory` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bookcategories` */

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serialno` varchar(100) NOT NULL,
  `bookname` varchar(150) NOT NULL,
  `publishername` varchar(100) DEFAULT NULL,
  `authorname` varchar(150) DEFAULT NULL,
  `publishdate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `books` */

insert  into `books`(`id`,`serialno`,`bookname`,`publishername`,`authorname`,`publishdate`) values 
(1,'46422A978D','Systems Analysis Design UML Version 2.0 ','John Wiley & Sons',NULL,'2009-05-01'),
(3,'4DE2A978D','Systems Analysis Design UML Version 1.0 ','John Wiley & Sons',NULL,'2005-05-01');

/*Table structure for table `depertment` */

DROP TABLE IF EXISTS `depertment`;

CREATE TABLE `depertment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departmentname` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `depertment` */

insert  into `depertment`(`id`,`departmentname`) values 
(1,'CSE'),
(2,'BBA'),
(3,'Textail');

/*Table structure for table `userbooks` */

DROP TABLE IF EXISTS `userbooks`;

CREATE TABLE `userbooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `bookid` int(11) NOT NULL,
  `borrowdate` date DEFAULT NULL,
  `lastdate` date DEFAULT NULL,
  `returndate` date DEFAULT NULL,
  `availabilit` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `userbooks` */

/*Table structure for table `userdepertment` */

DROP TABLE IF EXISTS `userdepertment`;

CREATE TABLE `userdepertment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) NOT NULL,
  `deptid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `userdepertment` */

insert  into `userdepertment`(`id`,`userid`,`deptid`) values 
(1,1,1),
(2,2,1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  `cardno` varchar(150) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `role` varchar(10) NOT NULL,
  `valid` tinyint(1) DEFAULT '1',
  `validity` date DEFAULT NULL,
  `maxbookcount` int(11) DEFAULT NULL,
  `borrowedbookcount` int(11) DEFAULT NULL,
  `lastlogin` datetime DEFAULT NULL,
  `lastupdated` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`fname`,`lname`,`email`,`address`,`cardno`,`birthdate`,`role`,`valid`,`validity`,`maxbookcount`,`borrowedbookcount`,`lastlogin`,`lastupdated`) values 
(1,'admin','admin','admin','admin','admin@localhost',NULL,'0001','2019-05-18','Admin',1,'2020-12-18',0,0,'2019-05-18 22:02:55','2019-05-18 22:02:58'),
(8,'patwary','123','rubel','patwary','rubel@bd.com','Chandpur','56A6441D','2001-05-01','Student',1,NULL,0,0,'2019-06-10 22:31:48',NULL),
(9,'Mehedi','admin','Mehedi hasan','Shobuj','mehedi@bd.com','Dhaka','56A6545D','2000-01-01','Teacher',1,NULL,0,0,'2019-06-03 16:33:43',NULL),
(11,'Hasan','hasan','Mehedi hasan','Shobuj','mehedi@bd.com','Tejgaon','56A6545D','2000-01-01','Student',1,NULL,0,0,'2019-06-10 22:12:38',NULL),
(12,'dennis','','Dennnis','Ritchie','abc@example.com','asdfas','345K0L',NULL,'Student',1,NULL,0,0,NULL,NULL),
(13,'fredy','','fredy','combata','fredy@i.com','asdfasdfasdf','23423423',NULL,'Teacher',1,NULL,0,0,NULL,NULL),
(14,'emsuc','23','emanuala','success','em@ks.com','asdfasdfasdfasdfasd','aldkfjal',NULL,'Admin',1,NULL,0,0,NULL,NULL),
(15,'','',NULL,NULL,NULL,NULL,NULL,NULL,'',1,NULL,NULL,NULL,NULL,'2019-06-16 01:56:19');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
