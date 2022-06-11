/*
Navicat MySQL Data Transfer

Source Server         : JdbcTest
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : charity

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2022-06-11 12:52:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class_of_service
-- ----------------------------
DROP TABLE IF EXISTS `class_of_service`;
CREATE TABLE `class_of_service` (
  `sid` int(11) NOT NULL,
  `service_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of class_of_service
-- ----------------------------
INSERT INTO `class_of_service` VALUES ('1', '其他');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `perid` int(11) DEFAULT NULL,
  `pername` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '管理员');
INSERT INTO `permission` VALUES ('2', '志愿者');

-- ----------------------------
-- Table structure for personal_data
-- ----------------------------
DROP TABLE IF EXISTS `personal_data`;
CREATE TABLE `personal_data` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin NOT NULL,
  `uname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `idCard` varchar(18) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `nation` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `political` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `nativePlace` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `profile` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `country` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `mailbox` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `education` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `QQ` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `WeiXin` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `employment` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `area` varchar(255) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of personal_data
-- ----------------------------
INSERT INTO `personal_data` VALUES ('1', '黄某', 'admin', '511230134514132056', '02', '01', '重庆永川', '19056732342', 'https://img0.baidu.com/it/u=512340543,3139277133&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=281', '男', '156', '11223344@qq.com', '14', '1234564457', '123456', '寝室楼1', '31', '重庆');
INSERT INTO `personal_data` VALUES ('2', '程某', 'Test', '1234142324244', 'Test', '无', '重庆永川', '12223456756', '', null, null, null, null, null, null, null, null, '');
INSERT INTO `personal_data` VALUES ('3', '1', '1', '1', '1', '1', '1', '1', '', '1', '1', '11', '1', '1', '1', '1', '1', '1');
INSERT INTO `personal_data` VALUES ('4', '2', '2', '2', '2', '2', '2', '2', '', '2', '2', '2', '2', '2', '2', '2', '2', '2');
INSERT INTO `personal_data` VALUES ('5', '3', null, null, null, null, null, '124', '', null, null, null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `postid` int(11) NOT NULL,
  `post_desc` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `post_condition` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `post_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '布置场地、陪伴孩子参与爱心课堂', '山城志愿者注册志愿者', '陪伴志愿者');
INSERT INTO `post` VALUES ('2', '1', '1', '1');

-- ----------------------------
-- Table structure for post_num
-- ----------------------------
DROP TABLE IF EXISTS `post_num`;
CREATE TABLE `post_num` (
  `pid` int(11) DEFAULT NULL,
  `postid` int(11) DEFAULT NULL,
  `target_num` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `enrolled_num` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of post_num
-- ----------------------------
INSERT INTO `post_num` VALUES ('1', '1', '1', '0');
INSERT INTO `post_num` VALUES ('1', '2', '1', '1');

-- ----------------------------
-- Table structure for project_service
-- ----------------------------
DROP TABLE IF EXISTS `project_service`;
CREATE TABLE `project_service` (
  `pid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of project_service
-- ----------------------------
INSERT INTO `project_service` VALUES ('1', '1');

-- ----------------------------
-- Table structure for project_status
-- ----------------------------
DROP TABLE IF EXISTS `project_status`;
CREATE TABLE `project_status` (
  `project_status` int(11) NOT NULL,
  `status_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`project_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of project_status
-- ----------------------------
INSERT INTO `project_status` VALUES ('1', '进行中');

-- ----------------------------
-- Table structure for team_service
-- ----------------------------
DROP TABLE IF EXISTS `team_service`;
CREATE TABLE `team_service` (
  `teamid` int(11) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of team_service
-- ----------------------------
INSERT INTO `team_service` VALUES ('1', '1');

-- ----------------------------
-- Table structure for territory
-- ----------------------------
DROP TABLE IF EXISTS `territory`;
CREATE TABLE `territory` (
  `territoryid` int(11) NOT NULL AUTO_INCREMENT,
  `territorydes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`territoryid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of territory
-- ----------------------------
INSERT INTO `territory` VALUES ('1', '万州区');
INSERT INTO `territory` VALUES ('2', '涪陵区');
INSERT INTO `territory` VALUES ('3', '渝中区');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `telephone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `perid` int(11) DEFAULT '2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123', '12345678912', '1');
INSERT INTO `user` VALUES ('2', 'Test', '123', '12223456756', '2');

-- ----------------------------
-- Table structure for volunteers_project
-- ----------------------------
DROP TABLE IF EXISTS `volunteers_project`;
CREATE TABLE `volunteers_project` (
  `id` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `postid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of volunteers_project
-- ----------------------------
INSERT INTO `volunteers_project` VALUES ('2', '1', '1');

-- ----------------------------
-- Table structure for volunteers_teamid
-- ----------------------------
DROP TABLE IF EXISTS `volunteers_teamid`;
CREATE TABLE `volunteers_teamid` (
  `id` int(11) DEFAULT NULL,
  `teamid` int(11) DEFAULT NULL,
  `joinTime` datetime DEFAULT NULL,
  `mark` int(10) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of volunteers_teamid
-- ----------------------------
INSERT INTO `volunteers_teamid` VALUES ('2', '1', '2022-06-16 16:35:11', '1');
INSERT INTO `volunteers_teamid` VALUES ('1', '1', null, '1');
INSERT INTO `volunteers_teamid` VALUES ('3', '1', null, '1');
INSERT INTO `volunteers_teamid` VALUES ('4', '1', null, '1');

-- ----------------------------
-- Table structure for volunteer_program_details
-- ----------------------------
DROP TABLE IF EXISTS `volunteer_program_details`;
CREATE TABLE `volunteer_program_details` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `posts` int(11) DEFAULT NULL,
  `target_number` int(11) DEFAULT NULL,
  `enrolled_number` int(11) DEFAULT NULL,
  `location` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `release_date` datetime DEFAULT NULL,
  `project_date` datetime DEFAULT NULL,
  `service_object` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `volunteer_upport` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `recruit_date` datetime DEFAULT NULL,
  `service_description` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `project_details` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `teamid` int(11) DEFAULT NULL,
  `project_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of volunteer_program_details
-- ----------------------------
INSERT INTO `volunteer_program_details` VALUES ('1', '缙云山景区旅游志愿服务', '1', '30', '0', '重庆市北碚区缙云山景区-售票处', '2022-05-28 00:00:00', '2022-06-03 00:00:00', '1', '交通补贴,志愿者服装', '2022-06-26 00:00:00', '2022年6月3日-26日上午9：30-16：30', '【招募条件】： 1、已注册的志愿者；（仅限山城志愿者注册编号/山城之友月捐编号/公益小天使亲子义工编号） 2、年龄在16岁及其以上； 3、性格开朗，热情大方，服务周到。 【活动地点】 ： 缙云山保护区大门处 【活动内容】 ： 1、听从景区管理局安排，态度良好，服务游客热情周到； 2、为游客提供服务及咨询。 ', '1', '1');
INSERT INTO `volunteer_program_details` VALUES ('2', 'Test', '2', '30', '0', 'TEst', '2022-06-07 15:32:38', '2022-06-07 15:32:43', '1', '没有', '2022-06-03 15:33:04', '？', '？？？', '1', '1');

-- ----------------------------
-- Table structure for volunteer_team
-- ----------------------------
DROP TABLE IF EXISTS `volunteer_team`;
CREATE TABLE `volunteer_team` (
  `teamid` int(11) NOT NULL,
  `contact` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `team_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `regis_department` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `registration_authority` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `telephone` varchar(11) COLLATE utf8_bin DEFAULT NULL,
  `register_date` datetime DEFAULT NULL,
  `detailed_address` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `liaison_organization` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `team_profile` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`teamid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of volunteer_team
-- ----------------------------
INSERT INTO `volunteer_team` VALUES ('1', '2', '测试队伍', '无', '无', '无', null, '2022-06-07 09:42:48', '重庆市永川区', '中山街道志愿队', null);
INSERT INTO `volunteer_team` VALUES ('2', '2', 'Test', '1', '1', '1', '1', '2022-06-08 21:31:55', '1', '12e1', '131');
