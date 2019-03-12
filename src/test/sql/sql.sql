/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.39 : Database - zhaojie
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zhaojie` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zhaojie`;

/*Table structure for table `z_enews_point` */

DROP TABLE IF EXISTS `z_enews_point`;

CREATE TABLE `z_enews_point` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT '观点id',
  `user_id` int(50) NOT NULL COMMENT '用户ID',
  `p_title` varchar(50) NOT NULL COMMENT '观点标题',
  `p_modification_date` date DEFAULT NULL COMMENT '修改时间',
  `p_issue_date` date NOT NULL COMMENT '发布时间',
  `p_context` blob NOT NULL COMMENT '发布内容',
  `p_accessory_img` varchar(100) DEFAULT NULL COMMENT '附件图片',
  `p_accessory_video` varchar(100) DEFAULT NULL COMMENT '附件视频',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `z_enews_point` */

insert  into `z_enews_point`(`id`,`user_id`,`p_title`,`p_modification_date`,`p_issue_date`,`p_context`,`p_accessory_img`,`p_accessory_video`) values (1,1,'这是一个开始','2019-03-12','2019-03-12','大噶耗，我吸渣渣辉，贪玩篮阅，这是一个船新的版本，是兄弟就来砍我',NULL,NULL);

/*Table structure for table `z_enews_user` */

DROP TABLE IF EXISTS `z_enews_user`;

CREATE TABLE `z_enews_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `e_name` varchar(15) NOT NULL COMMENT '用户昵称',
  `e_account` varchar(50) NOT NULL COMMENT '登陆账号',
  `e_password` varchar(50) NOT NULL COMMENT '登陆密码',
  `e_photo` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `e_intro` varchar(255) DEFAULT NULL COMMENT '个人简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `z_enews_user` */

insert  into `z_enews_user`(`id`,`e_name`,`e_account`,`e_password`,`e_photo`,`e_intro`) values (1,'桔梗','123456','admin',NULL,NULL),(2,'其其','654321','admin',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
