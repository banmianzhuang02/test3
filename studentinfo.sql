/*
 Navicat Premium Data Transfer

 Source Server         : fang
 Source Server Type    : MySQL
 Source Server Version : 50529
 Source Host           : localhost:3306
 Source Schema         : studentinfo

 Target Server Type    : MySQL
 Target Server Version : 50529
 File Encoding         : 65001

 Date: 26/03/2020 20:02:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pwd` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES (1, 'zhangsan', '123');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `学号` int(8) NOT NULL AUTO_INCREMENT,
  `姓名` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `学院` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `班级` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `日期` date NULL DEFAULT NULL,
  `是否接触` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否在武汉` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否在湖北` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否疑似` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `是否确诊` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`学号`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 225 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES (1, '**a', '音乐学院', '音乐1班', '2020-02-01', '是', '否', '否', '是', '否');
INSERT INTO `message` VALUES (2, '**b', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (3, '**c', '音乐学院', '音乐1班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (4, '**d', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (5, '**e', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (6, '**f', '音乐学院', '音乐1班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (7, '**g', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '是');
INSERT INTO `message` VALUES (8, '**h', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (9, '**i', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (10, '**j', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '是');
INSERT INTO `message` VALUES (11, '**k', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (12, '**l', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '是', '否');
INSERT INTO `message` VALUES (13, '**m', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (14, '**n', '音乐学院', '音乐1班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (15, '**o', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (16, '**p', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (17, '**q', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (18, '**r', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (19, '**s', '音乐学院', '音乐1班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (20, '**t', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (21, '**u', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (22, '**v', '音乐学院', '音乐1班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (23, '**w', '音乐学院', '音乐1班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (24, '**x', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (25, '**y', '音乐学院', '音乐1班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (26, '**z', '音乐学院', '音乐1班', '2020-02-01', '是', '否', '否', '是', '否');
INSERT INTO `message` VALUES (27, '**a', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (28, '**b', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (29, '**c', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (30, '**d', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (31, '**e', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (32, '**f', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (33, '**g', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (34, '**h', '传媒学院', '传媒2班', '2020-02-01', '是', '否', '否', '是', '否');
INSERT INTO `message` VALUES (35, '**i', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (36, '**j', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (37, '**k', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (38, '**l', '传媒学院', '传媒2班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (39, '**m', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (40, '**n', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (41, '**o', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (42, '**p', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (43, '**q', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (44, '**r', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (45, '**s', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (46, '**t', '传媒学院', '传媒2班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (47, '**u', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (48, '**v', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (49, '**w', '传媒学院', '传媒2班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (50, '**x', '传媒学院', '传媒2班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (51, '**y', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (52, '**z', '传媒学院', '传媒2班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (53, '**a', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (54, '**b', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (55, '**c', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (56, '**d', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (57, '**e', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (58, '**f', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (59, '**g', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (60, '**h', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (61, '**i', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (62, '**j', '美术学院', '美术 一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (63, '**k', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (64, '**l', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '是', '否');
INSERT INTO `message` VALUES (65, '**m', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (66, '**n', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (67, '**o', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (68, '**p', '美术学院', '美术 一班', '2020-02-01', '是', '否', '否', '是', '否');
INSERT INTO `message` VALUES (69, '**q', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (70, '**r', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (71, '**s', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (72, '**t', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (73, '**u', '美术学院', '美术 一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (74, '**v', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (75, '**w', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (76, '**x', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (77, '**y', '美术学院', '美术 一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (78, '**z', '美术学院', '美术 一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (79, '**a', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (80, '**b', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (81, '**c', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (82, '**d', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (83, '**e', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (84, '**f', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (85, '**g', '文学院', '文学一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (86, '**h', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (87, '**i', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (88, '**j', '文学院', '文学一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (89, '**k', '文学院', '文学一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (90, '**l', '文学院', '文学一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (91, '**m', '文学院', '文学一班', '2020-02-01', '是', '是', '是', '否', '是');
INSERT INTO `message` VALUES (92, '**n', '文学院', '文学一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (93, '**o', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (94, '**p', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (95, '**q', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (96, '**r', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (97, '**s', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (98, '**t', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (99, '**u', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (100, '**v', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (101, '**w', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (102, '**x', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (103, '**y', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (104, '**z', '文学院', '文学一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (105, '**a', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (106, '**b', '计算机学院', '计算机一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (107, '**c', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (108, '**d', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (109, '**e', '计算机学院', '计算机一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (110, '**f', '计算机学院', '计算机一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (111, '**g', '计算机学院', '计算机一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (112, '**h', '计算机学院', '计算机一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (113, '**i', '计算机学院', '计算机一班', '2020-02-01', '否', '是', '是', '否', '是');
INSERT INTO `message` VALUES (114, '**j', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (115, '**k', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (116, '**l', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (117, '**m', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (118, '**n', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (119, '**o', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (120, '**p', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (121, '**q', '计算机学院', '计算机一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (122, '**r', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (123, '**s', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (124, '**t', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (125, '**u', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (126, '**v', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (127, '**w', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (128, '**x', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');
INSERT INTO `message` VALUES (129, '**y', '计算机学院', '计算机一班', '2020-02-01', '是', '否', '否', '否', '否');
INSERT INTO `message` VALUES (130, '**z', '计算机学院', '计算机一班', '2020-02-01', '否', '否', '否', '否', '否');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `学号` int(11) NOT NULL AUTO_INCREMENT,
  `姓名` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `学院` varchar(46) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `班级` varchar(46) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `日期` date NOT NULL,
  PRIMARY KEY (`学号`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12428 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (12334, '**a', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12335, '**b', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12336, '**c', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12337, '**d', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12338, '**e', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12339, '**f', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12340, '**g', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12341, '**h', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12342, '**i', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12343, '**j', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12344, '**k', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12345, '**l', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12346, '**m', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12347, '**n', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12348, '**o', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12349, '**p', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12350, '**q', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12351, '**r', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12352, '**s', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12353, '**t', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12354, '**u', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12355, '**v', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12356, '**w', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12357, '**x', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12358, '**y', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12359, '**z', '计算机学院', '计算机二班', '2020-02-01');
INSERT INTO `stu` VALUES (12360, '**a', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12361, '**b', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12362, '**c', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12363, '**d', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12364, '**e', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12365, '**f', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12366, '**g', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12367, '**h', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12368, '**i', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12369, '**j', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12370, '**k', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12371, '**l', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12372, '**m', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12373, '**n', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12374, '**o', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12375, '**p', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12376, '**q', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12377, '**r', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12378, '**s', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12379, '**t', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12380, '**u', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12381, '**v', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12382, '**w', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12383, '**x', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12384, '**y', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12385, '**z', '计算机学院', '计算机三班', '2020-02-01');
INSERT INTO `stu` VALUES (12386, '**a', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12387, '**b', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12388, '**c', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12389, '**d', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12390, '**e', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12391, '**f', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12392, '**g', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12393, '**h', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12394, '**i', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12395, '**j', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12396, '**k', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12397, '**l', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12398, '**m', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12399, '**n', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12400, '**o', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12401, '**p', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12402, '**q', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12403, '**r', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12404, '**s', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12405, '**t', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12406, '**u', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12407, '**v', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12408, '**w', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12409, '**x', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12410, '**y', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12411, '**z', '数统学院', '数学一班', '2020-02-01');
INSERT INTO `stu` VALUES (12412, '**a', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12413, '**b', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12414, '**c', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12415, '**d', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12416, '**e', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12417, '**f', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12418, '**g', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12419, '**h', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12420, '**i', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12421, '**j', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12422, '**k', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12423, '**l', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12424, '**m', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12425, '**n', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12426, '**o', '数统学院', '数学二班', '2020-02-01');
INSERT INTO `stu` VALUES (12427, '**p', '数统学院', '数学二班', '2020-02-01');

SET FOREIGN_KEY_CHECKS = 1;
