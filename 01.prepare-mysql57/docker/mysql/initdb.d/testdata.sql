/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 5.7.28
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

insert into `teacher` (`id`, `name`, `email`) values('1','孔子','kongzi@gmail.com');
insert into `teacher` (`id`, `name`, `email`) values('2','孟子','mengzi@gmail.com');
insert into `teacher` (`id`, `name`, `email`) values('3','老子','laozi@gmail.com');
insert into `teacher` (`id`, `name`, `email`) values('4','庄子','zhuang_zi@163.com');
insert into `teacher` (`id`, `name`, `email`) values('5','韩非子','han_fei_zi@163.com');

insert into `student` (`id`, `name`, `tid`) values('1','张三','1');
insert into `student` (`id`, `name`, `tid`) values('2','张三丰','1');
insert into `student` (`id`, `name`, `tid`) values('3','李四','1');
insert into `student` (`id`, `name`, `tid`) values('4','王五','2');
insert into `student` (`id`, `name`, `tid`) values('5','王安石','1');
insert into `student` (`id`, `name`, `tid`) values('6','贾宝玉','2');
