/*
Navicat MySQL Data Transfer

Source Server         : ww
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ssm2022

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2022-10-02 20:16:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_account`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_account`;
CREATE TABLE `tbl_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `other` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_account
-- ----------------------------
INSERT INTO `tbl_account` VALUES ('1', 'xuwei21', 'xuwei2015', null);
