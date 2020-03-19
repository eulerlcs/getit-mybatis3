/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.7.28
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

CREATE TABLE `teacher` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'teacherID',
  `name` varchar(20) NOT NULL COMMENT 'teacherName',
  `email` varchar(30) DEFAULT NULL COMMENT 'teacherEmail',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

CREATE TABLE `student` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'studentID',
  `name` varchar(20) NOT NULL COMMENT 'studentName',
  `tid` int(10) DEFAULT NULL COMMENT 'teacherID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
