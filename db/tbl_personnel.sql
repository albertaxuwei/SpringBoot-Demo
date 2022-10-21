/*
Navicat MySQL Data Transfer

Source Server         : ww
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ssm2022

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2022-10-02 20:16:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_personnel`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_personnel`;
CREATE TABLE `tbl_personnel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of tbl_personnel
-- ----------------------------
INSERT INTO `tbl_personnel` VALUES ('1', '软件工程师', '徐飞龙', '服务器后端开发，SpringMVC，Hibernate!');
INSERT INTO `tbl_personnel` VALUES ('2', 'JAVA程序员', '张海洋', '资深JAVA程序员');
INSERT INTO `tbl_personnel` VALUES ('3', '前端工程师', '刘杰毅', 'JavaScript，CSS,HTML');
