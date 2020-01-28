/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : community

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 28/01/2020 15:02:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) NOT NULL,
  `type` int(11) NOT NULL,
  `commentator` bigint(20) NOT NULL,
  `gmt_create` bigint(255) NOT NULL,
  `gmt_modified` bigint(255) NOT NULL,
  `like_count` bigint(255) DEFAULT '0',
  `content` varchar(1024) DEFAULT NULL,
  `comment_count` int(255) unsigned DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
INSERT INTO `comment` VALUES (5, 11, 1, 8, 1577251225973, 1577251225973, 0, '这是一个回复', 0);
INSERT INTO `comment` VALUES (6, 11, 1, 8, 1577251346563, 1577251346563, 0, '这是第2个回复', 0);
INSERT INTO `comment` VALUES (7, 11, 1, 8, 1577257019652, 1577257019652, 0, '这是第3个回复', 0);
INSERT INTO `comment` VALUES (8, 11, 1, 8, 1577260678823, 1577260678823, 0, 'asd', 0);
INSERT INTO `comment` VALUES (9, 11, 1, 8, 1577260752666, 1577260752666, 0, 'AJAX请求', 0);
INSERT INTO `comment` VALUES (10, 11, 1, 8, 1577260986871, 1577260986871, 0, '隐藏输入框', 0);
INSERT INTO `comment` VALUES (11, 11, 1, 8, 1577262563279, 1577262563279, 0, 'asd', 0);
INSERT INTO `comment` VALUES (12, 11, 1, 8, 1577262839131, 1577262839131, 0, 'dadas', 0);
INSERT INTO `comment` VALUES (13, 11, 1, 8, 1577262984553, 1577262984553, 0, '展示回复', 0);
INSERT INTO `comment` VALUES (14, 11, 1, 8, 1577267903142, 1577267903142, 0, 'asdasd', 0);
INSERT INTO `comment` VALUES (15, 63, 1, 8, 1577269283695, 1577269283695, 0, '看视频', 0);
INSERT INTO `comment` VALUES (16, 11, 1, 8, 1577274775037, 1577274775037, 0, '', 0);
INSERT INTO `comment` VALUES (17, 11, 1, 8, 1577276365461, 1577276365461, 0, '提交新问题', 0);
INSERT INTO `comment` VALUES (18, 11, 1, 8, 1577426664405, 1577426664405, 0, 'hahahah', 1);
INSERT INTO `comment` VALUES (19, 11, 1, 8, 1577426691024, 1577426691024, 0, '不登录行不行', 2);
INSERT INTO `comment` VALUES (20, 11, 1, 8, 1577432148245, 1577432148245, 0, '重构后的新评论', 1);
INSERT INTO `comment` VALUES (21, 20, 2, 8, 1577432916726, 1577432916726, 0, '这是我的第一个评论回复', 0);
INSERT INTO `comment` VALUES (22, 20, 2, 8, 1577434621143, 1577434621143, 0, 'hahahah', 0);
INSERT INTO `comment` VALUES (23, 20, 2, 8, 1577434794804, 1577434794804, 0, '这是一条新回复', 0);
INSERT INTO `comment` VALUES (24, 20, 2, 8, 1577436630404, 1577436630404, 0, '哈哈哈终于成功了', 0);
INSERT INTO `comment` VALUES (69, 69, 1, 8, 1577608603226, 1577608603226, 0, '可以了吗', 1);
INSERT INTO `comment` VALUES (70, 69, 2, 8, 1577608633614, 1577608633614, 0, '这样呢', 0);
INSERT INTO `comment` VALUES (71, 69, 1, 8, 1577609100449, 1577609100449, 0, '设置mysql数据库字段初始值', 1);
INSERT INTO `comment` VALUES (72, 71, 2, 8, 1577609111592, 1577609111592, 0, 'OK了', 0);
INSERT INTO `comment` VALUES (73, 71, 1, 8, 1577619416174, 1577619416174, 0, '这是公有云的方式', 1);
INSERT INTO `comment` VALUES (74, 73, 2, 8, 1577619428613, 1577619428613, 0, '那私有云的方式上传图片呢', 0);
INSERT INTO `comment` VALUES (75, 71, 1, 8, 1577619450777, 1577619450777, 0, '怎么评论时间出问题了', 0);
INSERT INTO `comment` VALUES (76, 71, 1, 8, 1577619458898, 1577619458898, 0, '？？', 0);
INSERT INTO `comment` VALUES (77, 69, 1, 8, 1577619509143, 1577619509143, 0, '这个评论时间也出问题了吗', 0);
INSERT INTO `comment` VALUES (78, 68, 1, 8, 1577620266515, 1577620266515, 0, '回复时间出问题了？', 0);
INSERT INTO `comment` VALUES (79, 68, 1, 8, 1577620274996, 1577620274996, 0, '怎么回事', 0);
INSERT INTO `comment` VALUES (80, 68, 1, 8, 1577620300840, 1577620300840, 0, '热启动的问题吗？', 0);
INSERT INTO `comment` VALUES (81, 72, 1, 8, 1577620630080, 1577620630080, 0, '？？？', 0);
INSERT INTO `comment` VALUES (82, 72, 1, 8, 1577621062935, 1577621062935, 0, '啊啊啊', 0);
INSERT INTO `comment` VALUES (83, 72, 1, 8, 1577621075250, 1577621075250, 0, '什么情况', 2);
INSERT INTO `comment` VALUES (84, 83, 2, 8, 1577621211010, 1577621211010, 0, '怎么回事', 0);
INSERT INTO `comment` VALUES (85, 83, 2, 8, 1577621220043, 1577621220043, 0, '这这这', 0);
INSERT INTO `comment` VALUES (86, 73, 1, 8, 1577621447134, 1577621447134, 0, '图片这回也没了。。。', 0);
INSERT INTO `comment` VALUES (87, 73, 1, 8, 1577621751754, 1577621751754, 0, '时间问题还不行吗', 0);
INSERT INTO `comment` VALUES (88, 73, 1, 8, 1577621789929, 1577621789929, 0, '可以了嘛', 0);
INSERT INTO `comment` VALUES (89, 73, 1, 8, 1577621938798, 1577621938798, 0, '字段类型长度也不行吗', 1);
INSERT INTO `comment` VALUES (90, 89, 2, 8, 1577622008318, 1577622008318, 0, '怎么回事啊', 0);
INSERT INTO `comment` VALUES (91, 38, 1, 8, 1577622077574, 1577622077574, 0, '玩了', 0);
INSERT INTO `comment` VALUES (92, 73, 1, 8, 1577622955312, 1577622955312, 0, '。。。', 0);
INSERT INTO `comment` VALUES (93, 73, 1, 8, 1577623845330, 1577623845330, 0, '${#dates.format(comment.gmtCreate,\'yyyy-MM-dd HH:mm\')}写成${#dates.format(comment.gmtCreate,\'yyyy-MM-dd HH:hh\')}了', 0);
INSERT INTO `comment` VALUES (94, 74, 1, 8, 1577631433633, 1577631433633, 0, 'keyilema', 0);
INSERT INTO `comment` VALUES (95, 74, 1, 8, 1577632715770, 1577632715770, 0, '自己回复自己', 0);
INSERT INTO `comment` VALUES (96, 74, 1, 8, 1577632731775, 1577632731775, 0, '还有吗', 0);
INSERT INTO `comment` VALUES (97, 74, 1, 8, 1577633053633, 1577633053633, 0, '改了下setCommentor', 0);
INSERT INTO `comment` VALUES (98, 75, 1, 8, 1577680182916, 1577680182916, 0, '自己回复自己有通知吗', 1);
INSERT INTO `comment` VALUES (99, 98, 2, 8, 1577680192441, 1577680192441, 0, '没有', 0);
INSERT INTO `comment` VALUES (100, 82, 1, 8, 1577717841002, 1577717841002, 0, '也可以回复', 0);
INSERT INTO `comment` VALUES (101, 82, 1, 8, 1577717853515, 1577717853515, 0, '基本的功能实现了', 1);
INSERT INTO `comment` VALUES (102, 101, 2, 8, 1577772907929, 1577772907929, 0, '这里也可以评论', 0);
INSERT INTO `comment` VALUES (103, 82, 1, 8, 1578320269683, 1578320269683, 0, 'dsad', 0);
INSERT INTO `comment` VALUES (104, 82, 1, 8, 1578320530146, 1578320530146, 0, '2', 0);
INSERT INTO `comment` VALUES (105, 85, 1, 8, 1578321247000, 1578321247000, 0, '1', 0);
INSERT INTO `comment` VALUES (106, 85, 1, 8, 1578321263328, 1578321263328, 0, '1', 0);
COMMIT;

-- ----------------------------
-- Table structure for nav
-- ----------------------------
DROP TABLE IF EXISTS `nav`;
CREATE TABLE `nav` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `url` varchar(256) DEFAULT NULL,
  `priority` int(11) DEFAULT '0',
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for notification
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `notifier` bigint(20) NOT NULL,
  `receiver` bigint(20) NOT NULL,
  `outer_id` bigint(20) NOT NULL,
  `type` int(11) NOT NULL,
  `gmt_create` bigint(20) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `notifier_name` varchar(100) DEFAULT NULL,
  `outer_title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notification
-- ----------------------------
BEGIN;
INSERT INTO `notification` VALUES (37, 8, 8, 69, 1, 1577609100453, 1, 'ID_Wangqiang', '在线编辑怎么用');
INSERT INTO `notification` VALUES (38, 8, 8, 69, 2, 1577609111597, 1, 'ID_Wangqiang', '在线编辑怎么用');
INSERT INTO `notification` VALUES (39, 8, 8, 71, 1, 1577619416189, 1, 'ID_Wangqiang', '图片上传终于成功了');
INSERT INTO `notification` VALUES (40, 8, 8, 71, 2, 1577619428618, 1, 'ID_Wangqiang', '图片上传终于成功了');
INSERT INTO `notification` VALUES (41, 8, 8, 71, 1, 1577619450783, 1, 'ID_Wangqiang', '图片上传终于成功了');
INSERT INTO `notification` VALUES (42, 8, 8, 71, 1, 1577619458903, 1, 'ID_Wangqiang', '图片上传终于成功了');
INSERT INTO `notification` VALUES (43, 8, 8, 69, 1, 1577619509148, 1, 'ID_Wangqiang', '在线编辑怎么用');
INSERT INTO `notification` VALUES (44, 8, 8, 68, 1, 1577620266520, 1, 'ID_Wangqiang', '这是第一条测试');
INSERT INTO `notification` VALUES (45, 8, 8, 68, 1, 1577620274999, 1, 'ID_Wangqiang', '这是第一条测试');
INSERT INTO `notification` VALUES (46, 8, 8, 68, 1, 1577620300873, 1, 'ID_Wangqiang', '这是第一条测试');
INSERT INTO `notification` VALUES (47, 8, 8, 72, 1, 1577620630083, 1, 'ID_Wangqiang', '是不是发布问题的时间也出问题了');
INSERT INTO `notification` VALUES (48, 8, 8, 72, 1, 1577621062941, 1, 'ID_Wangqiang', '是不是发布问题的时间也出问题了');
INSERT INTO `notification` VALUES (49, 8, 8, 72, 1, 1577621075254, 1, 'ID_Wangqiang', '是不是发布问题的时间也出问题了');
INSERT INTO `notification` VALUES (50, 8, 8, 72, 2, 1577621211016, 1, 'ID_Wangqiang', '是不是发布问题的时间也出问题了');
INSERT INTO `notification` VALUES (51, 8, 8, 72, 2, 1577621220050, 1, 'ID_Wangqiang', '是不是发布问题的时间也出问题了');
INSERT INTO `notification` VALUES (52, 8, 8, 73, 1, 1577621447150, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (53, 8, 8, 73, 1, 1577621751768, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (54, 8, 8, 73, 1, 1577621789942, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (55, 8, 8, 73, 1, 1577621938810, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (56, 8, 8, 73, 2, 1577622008325, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (57, 8, 8, 38, 1, 1577622077579, 1, 'ID_Wangqiang', 'MyBatis');
INSERT INTO `notification` VALUES (58, 8, 8, 73, 1, 1577622955320, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (59, 8, 8, 73, 1, 1577623845344, 1, 'ID_Wangqiang', '这个时间问题到底出在哪里啊');
INSERT INTO `notification` VALUES (60, 8, 8, 74, 1, 1577631433654, 1, 'ID_Wangqiang', '终于可以显示图片了');
INSERT INTO `notification` VALUES (61, 8, 8, 74, 1, 1577632715789, 1, 'ID_Wangqiang', '终于可以显示图片了');
INSERT INTO `notification` VALUES (62, 8, 8, 74, 1, 1577632731781, 1, 'ID_Wangqiang', '终于可以显示图片了');
COMMIT;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `description` text,
  `gmt_create` bigint(255) DEFAULT NULL,
  `gmt_modified` bigint(255) DEFAULT NULL,
  `creator` bigint(20) NOT NULL,
  `comment_count` int(255) unsigned DEFAULT '0',
  `view_count` int(255) unsigned DEFAULT '0',
  `like_count` int(255) unsigned DEFAULT '0',
  `tag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
BEGIN;
INSERT INTO `question` VALUES (11, '这是第一条测试', '看看什么情况', 1576644163737, 1577468273512, 8, 18, 375, 0, 'Java,Spring,flask,js');
INSERT INTO `question` VALUES (19, '为什么列表没有展示问题描述', '如题', 1576644163737, 1577700092451, 8, 0, 5, 0, 'c#,swift,erlang,coffeescript,ruby');
INSERT INTO `question` VALUES (22, 'SpringBoot', '如何开始', 1576644163737, 1577536942507, 8, 0, 24, 0, 'mongodb,oracle,nosql memcached');
INSERT INTO `question` VALUES (38, 'MyBatis', 'dao层的框架', 1576644163737, 1577536955572, 8, 1, 6, 0, 'html,node.js,shell,typescript');
INSERT INTO `question` VALUES (51, 'SpringMVC', '@Controller', 1577027578557, 1577536908247, 8, 0, 3, 0, 'visual-studio-code,sublime-text,xcode intellij-idea,eclipse,maven');
INSERT INTO `question` VALUES (52, '哈哈哈', '哈哈哈', 1577027714792, 1577536891152, 8, 0, 1, 0, 'express,django,flask,yii,ruby-on-rails,tornado');
INSERT INTO `question` VALUES (59, 'c++', '这是啥', 1577072724457, 1577531149390, 8, 1, 5, 0, 'c++,windows-server,sqlserver');
INSERT INTO `question` VALUES (64, 'SpringBoot', 'SpringBoot', 1577439772835, 1577439814369, 8, 1, 68, 0, 'SpringBoot,Spring,Java');
INSERT INTO `question` VALUES (65, 'SpringMVC', 'SpringMVC', 1577439805872, 1577439805872, 8, 0, 5, 0, 'SpringMVC,Spring,Java');
INSERT INTO `question` VALUES (66, 'Java', 'Java', 1577439847794, 1577468295633, 8, 0, 25, 0, 'Java,Spring,flask,django,js');
INSERT INTO `question` VALUES (67, 'JavaSE', 'Java', 1577502102901, 1577526954336, 8, 1, 25, 0, 'java,spring,docker,mysql');
INSERT INTO `question` VALUES (68, '这是第一条测试', '看看什么情况\r\n```java\r\n```\r\nasdjaksldjaskdjlk', 1577536123227, 1577536123227, 8, 7, 32, 0, 'javascript,php');
INSERT INTO `question` VALUES (69, '在线编辑怎么用', '### 主要特性\r\n\r\n- 支持“标准”Markdown / CommonMark和Github风格的语法，也可变身为代码编辑器；\r\n- 支持实时预览、图片（跨域）上传、预格式文本/代码/表格插入、代码折叠、搜索替换、只读模式、自定义样式主题和多语言语法高亮等功能；\r\n- 支持ToC（Table of Contents）、Emoji表情、Task lists、@链接等Markdown扩展语法；\r\n- 支持TeX科学公式（基于KaTeX）、流程图 Flowchart 和 时序图 Sequence Diagram;\r\n- 支持识别和解析HTML标签，并且支持自定义过滤标签解析，具有可靠的安全性和几乎无限的扩展性；\r\n- 支持 AMD / CMD 模块化加载（支持 Require.js & Sea.js），并且支持自定义扩展插件；\r\n- 兼容主流的浏览器（IE8+）和Zepto.js，且支持iPad等平板设备；\r\n- 支持自定义主题样式；\r\n\r\n# Editor.md\r\n\r\n![](https://pandao.github.io/editor.md/images/logos/editormd-logo-180x180.png)\r\n\r\n![](https://img.shields.io/github/stars/pandao/editor.md.svg) ![](https://img.shields.io/github/forks/pandao/editor.md.svg) ![](https://img.shields.io/github/tag/pandao/editor.md.svg)', 1577598738075, 1577609074378, 8, 12, 58, 0, 'textmate');
INSERT INTO `question` VALUES (71, '图片上传终于成功了', '![](http://q39njwjyt.bkt.clouddn.com/c0bfb35c-6ab4-49bb-acf1-8c5be6dea0cf.jpg)', 1577619285556, 1577619285556, 8, 3, 14, 0, 'java');
INSERT INTO `question` VALUES (72, '是不是发布问题的时间也出问题了', '？？？', 1577620611611, 1577620611611, 8, 3, 14, 0, 'html');
INSERT INTO `question` VALUES (73, '这个时间问题到底出在哪里啊', '![](http://q39njwjyt.bkt.clouddn.com/e29706a3-fd16-412e-84e1-19da0e2ac0d5.jpg)', 1577621433236, 1577621433236, 8, 6, 28, 0, 'php');
INSERT INTO `question` VALUES (74, '终于可以显示图片了', '![](http://q39njwjyt.bkt.clouddn.com/a9aba96e-22cc-4aed-a6ff-020770856859.jpg?e=1577632365&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:uhX3fPnZ3KSZ4SLL8MEezdvs3EI=)', 1577628792910, 1577628792910, 8, 4, 25, 0, 'css');
INSERT INTO `question` VALUES (75, 'ads', 'asd', 1577634656844, 1577634656844, 8, 1, 10, 0, 'node.js');
INSERT INTO `question` VALUES (76, '好看的照片', '发张好看的照片吧\r\n![](http://q39njwjyt.bkt.clouddn.com/46d16190-0c15-4759-b1f9-7ec3cd6cfe2d.jpg?e=1577683824&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:aV75v7mcfDVKoJqu48fsm4pDiRg=)', 1577680271984, 1577680271984, 8, 0, 4, 0, 'vim');
INSERT INTO `question` VALUES (77, '验证发布问题错误提示', '![](http://q39njwjyt.bkt.clouddn.com/6b02e391-97a5-4eb5-b816-717e5f59c5dd.jpg?e=1577684134&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:e6NS9DAc8pvK3_k6ON01I6zvtik=)', 1577680548161, 1577680548161, 8, 0, 5, 0, 'php');
INSERT INTO `question` VALUES (78, '验证搜索框java', 'java\r\n\r\n![](http://q39njwjyt.bkt.clouddn.com/5400e35c-c196-4157-87ac-10806d19fcb5.jpg?e=1577688522&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:RalMNQLqpT9Qvqp2RUxTO-2cUuc=)', 1577684927543, 1577684927543, 8, 0, 2, 0, 'java');
INSERT INTO `question` VALUES (79, '验证Java搜索框2', '图片api调用的成功', 1577684963882, 1577684963882, 8, 0, 0, 0, 'html');
INSERT INTO `question` VALUES (80, 'java', 'a', 1577684998109, 1577684998109, 8, 0, 9, 0, 'php');
INSERT INTO `question` VALUES (81, 'java', 'a', 1577685016060, 1577685016060, 8, 0, 28, 0, 'c');
INSERT INTO `question` VALUES (82, '换了台电脑登录成功了哈哈哈', '![](http://q39njwjyt.bkt.clouddn.com/85b919cd-39e2-4bc0-9e16-4183ed11bc12.jpg?e=1577721418&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:1pwP3MR6KDVKH4ygfI-SS4U_jyE=)', 1577717830785, 1577717830785, 8, 4, 51, 0, 'spring');
INSERT INTO `question` VALUES (83, '怎么只能上传一张照片了', '![](http://q39njwjyt.bkt.clouddn.com/cf081ed4-43d9-4e12-86d4-133419c5d23a.png?e=1577780249&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:GYiF1Ffbpi4imICfqFg9TN1RgMg=)![](http://q39njwjyt.bkt.clouddn.com/f3c67431-56f8-4745-be01-7dbbc9de9182.png?e=1577780400&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:C8SFQp72ch1Xt6DJ2yGk0fn5BDM=)![](http://q39njwjyt.bkt.clouddn.com/2048996c-0342-4223-8d58-9d3ea044f7b6.png?e=1577780425&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:nHjSn75CNpU_d3f0mwczILAybuY=)![](http://q39njwjyt.bkt.clouddn.com/d4a037fd-2684-4fb0-917d-f0337ef23d42.png?e=1577780467&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:tHXL8zL_cVcREvcqO15dyTwsSQY=)![](http://q39njwjyt.bkt.clouddn.com/4facfe2c-b294-4c89-869e-72a4f86798af.jpg?e=1577780535&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:L6ZfocGUksYaOTr9zxJX0rms-gg=)', 1577776672521, 1577777010017, 8, 0, 4, 0, 'javascript');
INSERT INTO `question` VALUES (84, '这个编辑器还是有问题', '![](http://q39njwjyt.bkt.clouddn.com/3b431d06-6f92-4e32-9225-f5145504838d.jpg?e=1577780725&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:650uAY7GphMApXtudm6n9NpH3Wo=)', 1577777148844, 1577777148844, 8, 0, 2, 0, 'java');
INSERT INTO `question` VALUES (85, '123', '![](http://q39njwjyt.bkt.clouddn.com/d620e9d6-c9d8-499d-b4a8-d856f94f317c.jpg?e=1578324649&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:GesFQyftsZlNporJR1lPsGdSpOo=)![](http://q39njwjyt.bkt.clouddn.com/13786676-681c-4163-815e-9b3085e3401f.jpg?e=1578324663&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:GkUKI_VSpdO74bjsoUGySbCjQSY=)![](http://q39njwjyt.bkt.clouddn.com/974edfe7-634d-4106-b879-bbf4ce02fb0f.jpg?e=1578324677&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:ib7PJ2XoRswuhXvzuB1SQyse-10=)\r\n![](http://q39njwjyt.bkt.clouddn.com/7ae7946b-261c-4b5c-88f8-37d3f19af112.jpg?e=1580197775&token=WPCZZBq5ouRkfiIu_cX692QUjymL3fG8xOCqDvUn:Ol6-_60iEkM8vK20SGDXsURCzps=)', 1578321092815, 1580194183119, 8, 2, 12, 0, 'html,express,sql');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `bio` varchar(255) DEFAULT NULL,
  `avatar_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (8, '47856926', 'ID_Wangqiang', '9f9f37d5-6db2-4c91-a84d-3550e71cba2c', 1576634714571, 1580194147982, NULL, 'https://avatars0.githubusercontent.com/u/47856926?v=4');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
