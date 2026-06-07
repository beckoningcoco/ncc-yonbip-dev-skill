---
title: "前端框架调试方法 ①"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-framework-debug"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 前端框架调试方法 ①

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-framework-debug | 所属：介绍

# [](#前端框架调试方法-)前端框架调试方法 ①

## [](#1-下载框架代码)1. 下载框架代码

git clone http://***/yonyou-mdf/yonyou-mdf-framework.git

## [](#2-安装resource-override)2. 安装Resource Override

谷歌浏览器安装Resource
Override，[下载地址](https://github.com/kylepaulsen/ResourceOverride)

## [](#3-调试插件)3. 调试插件

### [](#31-脚手架启动)3.1. 脚手架启动

cd packages/mdf-app

ynpm install

npm run debug:mdf:https

生成的1个js文件和一个css文件，通过Resource
Override工具跟线上文件进行替换，即可开始调试。

||From||To|
||https://*/static/mdf/assets/javascripts/index.*.min.js||[https://127.0.0.1:3004/static/javascripts/index.js](https://127.0.0.1:3004/static/javascripts/index.js)|
||https://*/static/mdf/assets/stylesheets/index.*.min.css||[https://127.0.0.1:3004/static/stylesheets/index.css](https://127.0.0.1:3004/static/stylesheets/index.css)|

### [](#32-调试css)3.2. 调试css

脚手架启动后即可调试CSS。

### [](#33-调试mdfcube插件)3.3. 调试@mdf/cube插件

cd mdf-cube

npm run debug

### [](#34-调试mdfmetaui-web插件)3.4. 调试@mdf/metaui-web插件

cd mdf-metaui-web

npm run debug

### [](#35-调试mdfmetaui-mobile插件)3.5. 调试@mdf/metaui-mobile插件

cd mdf-metaui-mobile

npm run debug

### [](#36-调试node)3.6. 调试Node

启动mdf-server脚手架，用来调试mdf/plugin-meta插件

git clone http://***/yonyou-mdf/mdf-server cd mdf-server ynpm

install npm run debug:daily

通过访问下面地址打开对应单据:
[http://localshot:3003/meta/xxx/xxxxx?domainKey=xx](http://localshot:3003/meta/xxx/xxxxx?domainKey=xx) 登录日常环境，

将这个cookie粘过来 yht_access_token。
谷歌浏览器会出现一个调试Node的工具，点开即可调试。

## [](#4-其他技巧)4. 其他技巧

### [](#41-查看更多调试信息)4.1. 查看更多调试信息

控制台执行

cb.debug=true

### [](#42-查看ajax加密参数)4.2. 查看ajax加密参数

默认check接口参数进行了压缩和加密

控制台执行

cb.debug=true

### [](#43-屏蔽扩展脚本)4.3. 屏蔽扩展脚本

**小技巧：** 领域页面存在BUG时，配置extend为false，要是没问题的话就是扩展脚本问题。

工作台url上添加参数

比如：https://***/?extend=false

### [](#44-交互规则相关)4.4. 交互规则相关

**屏蔽交互规则**

控制台录入cb.extendRule=false或者url上添加参数 extendRule=false

**查看打印信息**

控制台录入cb.debugRule=true或者url上添加参数 debugRule=true

**查看公式赋值打印信息**

控制台录入cb.debugRuleValue=true或者url上添加参数 debugRuleValue=true

### [](#45-查看node转发路径及后端返回数据)4.5. 查看Node转发路径及后端返回数据

- 浏览器控制台查看network，拷贝接口的cRUL
- 粘贴到POSTNAM工具上
- url上添加 &debugNode=true

此方法可以不仅查看Java端返回的数据，还可以查看转发后的路径以及请求耗时等

### [](#46-调试专属化环境tns报错xss如何解决)4.6. 调试专属化环境TNS报错XSS如何解决

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduankuangjiatiaoshifangfa1.6bcfbdef.png)

前端调试专属化环境遇到xss报错的，把

专属化的tnsSdk.js：[https://ywbip-sit2.walsin.com/iuap-tns/ucf-wh/share/runtime/tnsSdk.js](https://ywbip-sit2.walsin.com/iuap-tns/ucf-wh/share/runtime/tnsSdk.js)

替换成：

核心二的tnsSdk.js：[https://design.yonyoucloud.com/static/ucf/iuap-tns.share-fe/release/runtime/tnsSdk.js](https://design.yonyoucloud.com/static/ucf/iuap-tns.share-fe/release/runtime/tnsSdk.js)