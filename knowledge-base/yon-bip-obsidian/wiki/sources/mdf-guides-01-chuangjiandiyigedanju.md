---
title: "创建第一个单据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/01-chuangjiandiyigedanju"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 15
---

# 创建第一个单据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/01-chuangjiandiyigedanju | 所属：指南

# [](#创建第一个单据)创建第一个单据

## [](#1-前端环境)1. 前端环境

### [](#11-环境准备)1.1. 环境准备

首先得有 [node](https://nodejs.org/en/)，并确保 node
版本是 14 或以上，建议安装最新稳定版

$ node -v

v14.18.1

必须使用 **[ynpm](https://package.yonyoucloud.com/home)**
管理npm依赖。

$ sudo npm i ynpm-tool -g

$ ynpm -v

Yonyou Package Manager(ynpm) Version : 3.2.22

### [](#12-脚手架)1.2. 脚手架

拉取代码，本地自动生成mdf-server-app目录。

$ git clone http://***/yonyou-mdf/mdf-server-app

Cloning into 'mdf-server-app'...

remote: Counting objects: 1054, done.

remote: Compressing objects: 100% (630/630), done.

remote: Total 1054 (delta 545), reused 849 (delta 375)

Receiving objects: 100% (1054/1054), 8.32 MiB | 2.13 MiB/s, done.

Resolving deltas: 100% (545/545), done.

### [](#13-安装依赖)1.3. 安装依赖

进入目录安装依赖

$ cd mdf-server-app

$ ynpm install

...

...

...

√ Finish, Happy enjoy coding!

### [](#14-启动项目)1.4. 启动项目

$ npm run debug

> @mdf/server-app@3.0.0 debug

/Users/limingyang/Documents/life/mdf-server-app

> concurrently "npm run debug:extend" "npm run debug:server"

...

...

...

ℹ ｢wdm｣: Compiled successfully.

[1] >>>>>>>>>>>> Node服务启动成功!

[1] >>>>>>>>>>>> Node服务地址：http://<HOST域名>:3003 当前环境：development

[1] >>>>>>>>>>>> Java接口地址：https://xxx.xxx.com

[1] appServer is: https://xxx.xxx.com

[1] staticHost is: http://localhost:3004/static/

在浏览器打开
[http://127.0.0.1:3003/demo](http://127.0.0.1:3003/demo)
就能看到如下界面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju1.d6715df8.png)

## [](#2-后端环境)2. 后端环境

### [](#21-软件安装)2.1. 软件安装

||依赖软件||版本||用途||下载地址|
||Java SDK||1.8+||Java开发运行环境||下载链接|
||Apache Maven||3.2+||Java工程依赖包管理||下载链接|
||Eclipse/IntelliJ IDEA||4.5+/2018+||Java开发IDE||下载链接/下载链接|
||Mysql||5.7+||mysql数据库||下载链接|
||Mysql Workbench||8.0+||mysql数据库IDE||下载链接|

### [](#22-环境变量)2.2. 环境变量

编辑 .bash_profile，jdk和Apache Maven参考如下配置

# jdk相关配置

# 设置jdk8

export JAVA_8_HOME="$(/usr/libexec/java_home -v 1.8)"

# 设置jdk13

export JAVA_13_HOME="$(/usr/libexec/java_home -v 13)"

# 设置jdk17

export JAVA_17_HOME="$(/usr/libexec/java_home -v 17)"

# alias命令动态切换jdk版本

alias jdk8='export JAVA_HOME=$JAVA_8_HOME'

alias jdk13='export JAVA_HOME=$JAVA_13_HOME'

alias jdk17='export JAVA_HOME=$JAVA_17_HOME'

# 默认jdk为jdk17

export JAVA_HOME=$JAVA_17_HOME

export PATH=/usr/bin:$PATH

export M2_HOME=/Users/******/Documents/soft/apache-maven

export PATH=$PATH:$M2_HOME/bin

### [](#23-脚手架)2.3. 脚手架

git clone http://***/mdd-pub/ucf-mdf-pub

### [](#24-数据库初始化)2.4. 数据库初始化

http://***/mdd-pub/ucf-mdf-pub/blob/develop/mddfw-be-3.0.8-dev/docs/MDD-DEMO/sql/%E6%A1%86%E6%9E%B6%E5%88%9D%E5%A7%8B%E5%8C%96sql/mdd-init.sql

### [](#25-项目启动)2.5. 项目启动

#### [](#251-ide配置)2.5.1. IDE配置

以IDEA为例，Apache Maven路径

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju2.652e0bd0.png)

jdk路径 File -> Project Structure

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju3.7526809d.png)

#### [](#252-编译)2.5.2. 编译

在 IDE 中导入后端工程，或使用 IDE 直接导入 GIT 工程； 通过 maven
更新下载 jar，并编译通过。

#### [](#253-db配置)2.5.3. DB配置

修改各种 DB 配置等信息

#### [](#254-修改spring配置)2.5.4. 修改spring配置

打开 application.properties
文件，修改注册后的工程名称，防止影响其他的注册

服务。

#spring 基本配置

spring.application.name=[iris-domain]

spring.domain.name=[iris-domain]

修改端口号和上下文，防止与其他服务产生冲突

#配置容器相关参数

server.servlet.context-path=/

server.port=8080

#### [](#255-启动)2.5.5. 启动

执行 bootstrap 项目下 com.yonyou.ucf.mdd.bootstrap.server.Startup 类启动项目

PS:使用 IDEA 启动失败的话，需修改启动参数

#### [](#256-配置host)2.5.6. 配置host

vim /etc/hosts

javascript  127.0.0.1 xxx.xxx.com

#### [](#257-修改后端接口地址)2.5.7. 修改后端接口地址

// package.json

"debug:server": "cross-env BABEL_ENV=production NODE_ENV=development SRV_URL=http://xxx.xxx.com:8080 SERVER_ENV=daily MDF_LANG=true CACHE_META=false nodemon -w src/server -w src/common --exec babel-node --inspect --only=src,node_modules/@mdf src/server/index.js"

或[修改前 端工程]/src/common/config.env.js 修改如下：

HTTP_SERVICE_BASEURL='http://xxx.xxx.com:8080';

#### [](#258-登录测试环境)2.5.8. 登录测试环境

登录成功后，即可在 cookie 中写入 token 等信息，调用 hosts
中映射的测试链接时才能通过验证

#### [](#259-访问对应功能节点)2.5.9. 访问对应功能节点

在测试环境找到对应功能节点，并拼凑可访问的 URL

javascript http://xxx.xxx.com:3003/meta/voucherlist/[测试单据编码]

## [](#3-开始做一个页面)3. 开始做一个页面

做一个图书管理的列表和卡片页，列表有新增按钮，点击进入卡片页，录入数据点击保存回到列表页。

### [](#31-设计元数据)3.1. 设计元数据

#### [](#311-开发流程)3.1.1. 开发流程

### [](#32-元数据配置示例)3.2. 元数据配置示例

### [](#33-设计元数据界面)3.3. 设计元数据界面

https://<工作台域名>/iuap-metadata-designer/ucf-wh/metadata/index.html#/metadata/index?id=8f7ad435-3326-4ad0-9819-de187381fae5&secret=mdd-fw
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju4.91fe1d6a.png)

#### [](#331-xml配置文件生成sql)3.3.1. xml配置文件生成sql

导入数据库，更新或新增相关表（也可通过后端脚手架中ucf-mdf-tools生成）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju5.19ba1f14.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju6.d85f35dd.png)

#### [](#332-元数据api)3.3.2. 元数据API

[《元数据配置说明》](#/spec/02-metadata-manage)

### [](#34-配置ui元数据)3.4. 配置UI元数据

#### [](#341-开发流程)3.4.1. 开发流程

##### [](#3411-配置excel示例)3.4.1.1. 配置Excel，示例

![](data:image/png;base64,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)![](data:image/png;base64,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)![](data:image/png;base64,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)

##### [](#3412-excel生成sql)3.4.1.2. excel生成sql

通过office自带工具宏，将excel生成sql(mac不支持宏，只有window支持)
注意：excel同级必须需要有TenantConfig.xml文件，运行完宏会生成UIExcelCreateSQL文件。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju9.279d0b0d.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju10.d619d3ce.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju11.2f7f6880.png)

##### [](#3413-更新数据库)3.4.1.3. 更新数据库

执行sql语句，将excel配置更新到数据库

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju12.6c6e51ae.png)

#### [](#342-ui元数据api)3.4.2. UI元数据API

UI元数据统一存储服务
[《MDD UI元数据数据字典》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20744879)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju13.93b93930.png)

[《UI模型Excel使用说明》](#/spec/02-view-application-spec)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chuangjiandiyigedanju14.5602fa69.png)

### [](#35-浏览器访问)3.5. 浏览器访问

更新完数据库，刷新页面即可看到效果。

[http://mddtest.yyuap.com:3003/meta/voucherlist/tushuliebiao](http://mddtest.yyuap.com:3003/meta/voucherlist/tushuliebiao)