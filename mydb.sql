/*
 Navicat Premium Data Transfer

 Source Server         : swinManage
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 16/05/2020 20:03:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for banners
-- ----------------------------
DROP TABLE IF EXISTS `banners`;
CREATE TABLE `banners`  (
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of banners
-- ----------------------------
INSERT INTO `banners` VALUES ('https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1374020793,2172269866&fm=26&gp=0.jpg', 1, NULL);
INSERT INTO `banners` VALUES ('https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2495109191,3732015943&fm=26&gp=0.jpg', 2, NULL);
INSERT INTO `banners` VALUES ('https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2549725145,1335981059&fm=26&gp=0.jpg', 3, NULL);
INSERT INTO `banners` VALUES ('https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3598721383,4015803055&fm=26&gp=0.jpg', 4, NULL);

-- ----------------------------
-- Table structure for table_eval
-- ----------------------------
DROP TABLE IF EXISTS `table_eval`;
CREATE TABLE `table_eval`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create` bigint(255) NOT NULL,
  `eval` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `uid` int(5) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 59 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of table_eval
-- ----------------------------
INSERT INTO `table_eval` VALUES (1, '张三', 1588059949200, '上次比赛结果出来了吗？', 1);
INSERT INTO `table_eval` VALUES (2, 'aaaa', 1588060013708, '上次没发挥好，下次我一定....', 3);
INSERT INTO `table_eval` VALUES (3, '吕布', 1588179170444, '轻轻松松第一名', 21);
INSERT INTO `table_eval` VALUES (4, 'aaaa', 1588180302387, '厉害了我的布...', 3);
INSERT INTO `table_eval` VALUES (5, '刘备', 1588180502859, '小贼你怕是没遇上我二弟', 19);
INSERT INTO `table_eval` VALUES (19, '吕小布', 1588215828658, 'biubiubiubibi', 23);
INSERT INTO `table_eval` VALUES (20, '吕小布', 1588215870610, '哥 别扯上我啊 你和二爷讲明白了', 23);
INSERT INTO `table_eval` VALUES (21, '刘备', 1588216300998, '.....', 19);
INSERT INTO `table_eval` VALUES (22, '曹操', 1588217137823, '红红火火恍恍惚惚', 14);
INSERT INTO `table_eval` VALUES (24, '曹操', 1588217279587, '快来求我 我和二爷关系不错', 14);
INSERT INTO `table_eval` VALUES (25, '张三丰', 1588217458214, '喂喂你们跑题了哇', 22);
INSERT INTO `table_eval` VALUES (53, '关羽', 1588262308054, '关某在此，谁敢放肆', 28);
INSERT INTO `table_eval` VALUES (54, '吕小布', 1588330040189, '123', 23);
INSERT INTO `table_eval` VALUES (55, 'aaaa', 1588330047312, '111', 3);
INSERT INTO `table_eval` VALUES (56, '张三', 1588835041970, 'hello\n', 1);
INSERT INTO `table_eval` VALUES (58, 'aaaa', 1589438121155, '叽里咕噜', 3);
INSERT INTO `table_eval` VALUES (59, '李四', 1589555007679, '我要留言', 2);
INSERT INTO `table_eval` VALUES (60, '李四', 1589556388000, '12345', 2);

-- ----------------------------
-- Table structure for table_user
-- ----------------------------
DROP TABLE IF EXISTS `table_user`;
CREATE TABLE `table_user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(3) NULL DEFAULT NULL,
  `birth` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bodyhel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `score1` int(3) NULL DEFAULT NULL,
  `score2` int(3) NULL DEFAULT NULL,
  `score3` int(3) NULL DEFAULT NULL,
  `qx` int(2) NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of table_user
-- ----------------------------
INSERT INTO `table_user` VALUES (1, '张三', '123', '男', 18, '5/5', '要多吃点高蛋白的食物', 90, 80, 88, 1);
INSERT INTO `table_user` VALUES (2, '李四', '123', '男', 77, '6/17', '平时多注意练练立地跳远', 100, 89, 59, 0);
INSERT INTO `table_user` VALUES (3, 'aaaa', '123', '女', 98, '5/6', '祖国的未来就靠你了', 100, 100, 100, 2);
INSERT INTO `table_user` VALUES (4, '王五', '123', '男', 19, '3/24', '多跳绳', 66, 77, 33, 0);
INSERT INTO `table_user` VALUES (5, '赵六', '123', '男', 33, '6/6', '平时多注意练练立地跳远', 99, 33, 89, 0);
INSERT INTO `table_user` VALUES (6, '赵7', '123', '男', 33, '6/6', '垫步跳跃，立定跳远多练练', 66, 55, 77, 0);
INSERT INTO `table_user` VALUES (7, '赵8', '123', '男', 33, '6/6', '仰卧抛球，对墙爆发性胸前传球练习', 78, 56, 90, 0);
INSERT INTO `table_user` VALUES (8, '赵9', '123', '男', 33, '6/6', '游泳中手腿分解配合练习来进行游泳中的协调性训练', 87, 60, 78, 0);
INSERT INTO `table_user` VALUES (9, '赵10', '123', '男', 33, '6/6', '俯卧撑，平板支撑多练练', 99, 60, 69, 0);
INSERT INTO `table_user` VALUES (10, '赵11', '123', '男', 66, '6/6', '平时多注意练练立地跳远', 97, 60, 83, 0);
INSERT INTO `table_user` VALUES (11, '赵云', '123', '男', 150, '10/10', '游泳中手腿分解配合练习来进行游泳中的协调性训练', 93, 66, 33, 0);
INSERT INTO `table_user` VALUES (12, 'sa', '123', '男', 10, '10/10', '游泳中手腿分解配合练习来进行游泳中的协调性训练', 98, 65, 19, 0);
INSERT INTO `table_user` VALUES (13, 'sasa', '123', '女', 56, '3/10', '继续保持', 88, 64, 77, 0);
INSERT INTO `table_user` VALUES (14, '曹操', '123', '男', 111, '10/10', '垫步跳跃，立定跳远多练练', 76, 98, 88, 0);
INSERT INTO `table_user` VALUES (15, 'test', '123', '男', 0, '10/10', '多练练长跑 训练耐力', 69, 66, 89, 0);
INSERT INTO `table_user` VALUES (18, 'test3', '123', '男', 0, '10/10', '游泳中手腿分解配合练习来进行游泳中的协调性训练', 65, 45, 83, 0);
INSERT INTO `table_user` VALUES (19, '刘备', '123', '男', 0, '10/10', '要多吃点高蛋白的食物', 61, 69, 81, 0);
INSERT INTO `table_user` VALUES (20, '关于', '123', '男', 0, '10/10', '垫步跳跃，立定跳远多练练', 62, 67, 82, 0);
INSERT INTO `table_user` VALUES (21, '吕布', '123', '男', 28, '10/10', '要多吃点高蛋白的食物', 67, 88, 80, 1);
INSERT INTO `table_user` VALUES (22, '张三丰', '123', '男', 100, '9/16', '垫步跳跃，立定跳远多练练', 98, 79, 46, 0);
INSERT INTO `table_user` VALUES (23, '吕小布', '123', '男', 22, '10/10', '平时多注意练练立地跳远', 58, 95, 76, 2);
INSERT INTO `table_user` VALUES (25, '华雄', '123', '男', 56, '10/10', '垫步跳跃，立定跳远多练练', 78, 76, 79, 0);
INSERT INTO `table_user` VALUES (28, '关羽', '123', '男', 58, '10/10', '要多吃点高蛋白的食物', 98, 77, 99, 1);
INSERT INTO `table_user` VALUES (30, '赵云111', '123', '男', 66, '10/10', '未测定', 0, 0, 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
