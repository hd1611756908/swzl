-- 创建数据库
CREATE DATABASE wx_swzl DEFAULT CHARACTER SET UTF8;

-- 切换库
USE wx_swzl;

-- 创建数据库表
CREATE TABLE user(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  open_id VARCHAR(255) DEFAULT NULL COMMENT '微信唯一用户ID',
  name VARCHAR(100) NOT NULL COMMENT '用户名', 
  password VARCHAR(255) DEFAULT NULL COMMENT '密码',
  gender INT(2) NOT NULL DEFAULT 0 COMMENT '性别',
  role_id INT NOT NULL COMMENT '角色ID关联角色表ROLE的主键'
)ENGINE=InnoDB AUTO_INCREMENT=1000 CHARSET=UTF8 COMMENT='用户表';

-- 角色表
CREATE TABLE role(
  role_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  role_name VARCHAR(100) NOT NULL COMMENT '角色名'
)ENGINE=InnoDB AUTO_INCREMENT=1000 CHARSET=UTF8 COMMENT='角色表';

--添加角色
INSERT INTO role(role_name) VALUES('admin'),('public');


--外键关联
ALTER TABLE user ADD FOREIGN KEY(`role_id`) REFERENCES role(`role_id`);


-- 项目类型表
CREATE TABLE itemtype(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  name VARCHAR(50) NOT NULL COMMENT '项目类型表'
)ENGINE=InnoDB AUTO_INCREMENT=1000 CHARSET=UTF8 COMMENT='项目类型表';

-- 插入项目类型
INSERT INTO itemtype(name) VALUES('寻人启事'),('寻物启事'),('寻宠启事'),('失物招领');

--项目表
CREATE TABLE item(
  item_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  itemtype_id INT NOT NULL COMMENT '项目类型ID关联项目类型表的主键',
  user_id INT NOT NULL COMMENT '关联用户表主键',
  provider VARCHAR (20) NOT NULL COMMENT '发布人',
  title VARCHAR(100) NOT NULL COMMENT '项目标题',
  category VARCHAR(100) NOT NULL COMMENT '丢失物品种类 如: 笔记本、手机',
  province VARCHAR(100) NOT NULL COMMENT '丢失区域 如: 黑龙江省-哈尔滨市-南岗区',
  address VARCHAR(255) NOT NULL COMMENT '丢失详细地址',
  createtime DATETIME NOT NULL COMMENT '创建时间',
  losetime VARCHAR(100) NOT NULL COMMENT '丢失时间',
  detaildesc VARCHAR(255) NOT NULL COMMENT '丢失物品详细过程介绍',
  img1 VARCHAR(255) NOT NULL COMMENT '图片1',
  img2 VARCHAR(255) NOT NULL COMMENT '图片2',
  img3 VARCHAR(255) NOT NULL COMMENT '图片3'
)ENGINE=InnoDB AUTO_INCREMENT=1000 CHARSET=UTF8 COMMENT='项目表';

--外键关联
ALTER TABLE item ADD FOREIGN KEY(`itemtype_id`) REFERENCES itemtype(`id`);
ALTER TABLE item ADD FOREIGN KEY(`user_id`) REFERENCES user(`id`);











