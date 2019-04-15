/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : 192.168.26.20:3306
 Source Schema         : wtf

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 15/04/2019 23:42:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `apartment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 53 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'addres}', 'May', '2018-12-19 10:18:51', '123456', '12', NULL, '张三');
INSERT INTO `user` VALUES (2, '北京', 'may', '2018-12-19 10:40:07', '123456', '13', 2, '李四');
INSERT INTO `user` VALUES (3, '上海', 'Maybe', '2018-12-19 10:40:13', '123456', '43', 1, '王五');
INSERT INTO `user` VALUES (4, '山东', 'bamay', '2018-12-19 10:43:22', '123456', '32', 3, '赵六');
INSERT INTO `user` VALUES (5, '北京', 'whey', '2018-12-19 10:43:39', '12', '12', 1, '李强');
INSERT INTO `user` VALUES (7, '北京', 'wome', '2019-03-21 01:37:49', '123456', '13', 2, '张强立');
INSERT INTO `user` VALUES (8, '南充', 'you', '2019-03-21 02:50:12', '123456', '43', 1, '这');
INSERT INTO `user` VALUES (9, '山东', '12', '2019-03-28 14:41:58', '123', '43', 1, '323');

SET FOREIGN_KEY_CHECKS = 1;
