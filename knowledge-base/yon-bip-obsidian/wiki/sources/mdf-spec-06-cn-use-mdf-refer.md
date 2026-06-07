---
title: "CN使用MDF参照"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-refer"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用MDF参照

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-refer | 所属：协议

# [](#cn使用mdf参照)CN使用MDF参照

### [](#1-原理)1. 原理

参照依赖MDF.js，MDF.js依赖工作台的加载，只要我们的节点是在工作台中打开，即会走缓存，减少参照代码的二次加载问题。

目前提供API的调用方式。

### [](#2-优点)2. 优点

- 领域代码中不用再安装任何@mdf的包。
- 框架代码走工作台加载，减少二次加载问题，提升加载速度。
- CN项目不再需要加载ac-lang-cn，走他的多语方式，可以走cb.lang的多语调动。

### [](#3-适配手册)3. 适配手册

#### [](#31-资源加载)3.1. 资源加载

加载必要的js文件，区分本地调试和上线环境(以daily为例)，在项目的index.html目录中加入如下代码(如果在工作台内，去iframe了，则无需调用)

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true&lang=true"></script>

 

// 生产地址

https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true&lang=true

**注意：**

- 以上示例是日常环境，其它环境域名可通过在控制台打印 **cb.utils.getNodeServerUrl()** 获取
- 如果存在跨域问题请在onyxywebready中执行 **cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())**

#### [](#32-示例html)3.2. 示例HTML

修改index.html 的DOM结构

<body>

 <div id='xx'></div> <!--挂载业务容器的id,随便定义-->

 ...

 // 工作台内去iframe无需添加

 <div id="yxyweb-support-container"><!--# yxyweb-support-container 为固定ID-->

 <div id="yxyweb-support-mount-popover"></div><!--popover/select挂载容器 固定ID-->

 <div id="yxyweb-support-mount-model"></div><!--model挂载容器固定ID -->

 </div>

</body>

#### [](#33-调用时机)3.3. 调用时机

在加载项目的时候，使用 window.onyxywebready 的api，MDF 的index.js
加载完以后，会执行onyxywebready
方法，避免MDF未加载完，导致程序报错（工作台内去iframe则不需要）

window.onyxywebready = ()=>{

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

 // todo: create dom

}

#### [](#34-调用方法)3.4. 调用方法

参照提供API的调用方式，以React为例

import React, { Component } from 'react';

 

class xxRefer extends Component {

 constructor(props) {

 super(props);

 //实例化参照模型

 this.model = new cb.models.ReferModel({

 cRefType: props.refcode || '', // 参照编码 必填

 multiple: props.multiSelect, // 是否多选 必填

 displayname: 'name', // 显示字段

 valueField: 'id', // 存储字段

 domainKey: '***', // 用来统一node转发使用，找参照提供方要,

 diworkCode: '', // 工作台内打开需要传这个，也是用来挂载弹窗dom的， 前端是通过doucument.getElementById(diworkCode) 作为弹窗挂载的位置

 serviceCode: '**', // 必传，否则有越权问题

 billnum: '**', // 如果需要参照收藏，必须配置

 inReport: true

 });

 //设置参照config

 this.config = {

 modelconfig: {

 title: '参照title',

 placeholder: '请选择***',

 hideCollect: false, // 打开参照收藏

 fieldid: '**'

 }

 }

 this.model.on('beforeValueChange', function (arg) { }) // 值改变前事件

 this.model.on('afterValueChange', function (arg) { }) // 值改变后事件

 this.model.on('beforeBrowse', function (arg) {

 this.setValue([{id:**,name:**}]) // 设置默认值

 

 }) // 弹出前事件

 // 更多用法参考https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20772632

 

 }

 

 // 组件渲染后调用初始化参照组件，如果是vue也需要在响应生命周期函数中设置即可。

 componentDidMount() {

 let id = this.props.continerId;

 cb.utils.initMdfRefer('refer', this.model, document.getElementById('获取下面render的ID'), this.config);

 }

 

 render() {

 let { refcode, record, beforeGetData } = this.props

 return (<div >

 <div id='自定义id'></div>

 </div>)

 }

}

### [](#4-按钮弹出当前参照)4. 按钮弹出当前参照

this.model.setVisibile(false); // 将参照框隐藏

 

 this.model.on('beforeBrowse', function (arg) {

 this.setValue([{id:**,name:**}]); // 参照回显

 }) // 弹出前事件

 this.model.browse(true)

### [](#5-最简单demo本地可启动)5. 最简单demo本地可启动

- 将以下js赋值到一个文件夹内server.js内，执行node server.js

// 引入相应模块

var http = require('http'),

 url = require('url'),

 path = require('path'),

 fs = require('fs');

 

var port = process.argv[2] || 8888;

 

var types = {

 'mp3': 'audio/mpeg',

 'html': 'text/html',

 'css': 'text/css',

 'js': 'application/javascript'

},

site = 'http://localhost:' + port;

 

http.createServer(function (request, response) {

 var uri = url.parse(request.url).pathname,

 filename = path.join(__dirname, uri);

 

 fs.exists(filename, function (exists) {

 if (!exists) {

 response.writeHead(404, {'Content-Type': 'text/plain', 'X-my-param':'zcyue'});

 response.write('404 Not Found\n');

 response.end();

 return;

 }

 

 if(!fs.lstatSync(filename).isDirectory()) {

 var type = filename.split('.');

 type = type[type.length - 1];

 response.writeHead(200, { 'Content-Type': types[type] + '; charset=utf-8' });

 fs.createReadStream(filename).pipe(response);

 } else {

 response.writeHead(301, {'Location': site + '/www/app.html' });

 response.end();

 }

 });

}).listen(parseInt(port, 10));

 

console.log('Static file server running at\n => ' + site + '/\nCTRL + C to shutdown');

- 将以下html复制到server.js平级的refer.js内

<!DOCTYPE html>

<html lang="en">

<head>

 <meta charset="UTF-8">

 <meta name="viewport" content="width=device-width, initial-scale=1.0">

 <title>参照示例</title>

 

 <script src="https://bip-daily.yyuap.com/mdf-node/mdf/resource?mdfrefer=true"></script>

 

</head>

<body>

 参照示例：

 <div id="refer"></div>

 <div id="yxyweb-support-container">

 <div id="yxyweb-support-mount-popover"></div>

 <div id="yxyweb-support-mount-model"></div>

 <script>

 window.onyxywebready = ()=>{

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl()) 

 this.model = new cb.models.ReferModel({

 cRefType: 'ucfbasedoc.bd_bankcard',

 displayname: 'name',

 valueField: 'id',

 domainKey: 'basedoccenter'

 });

 this.config = {};

 cb.utils.initMdfRefer('refer', this.model, document.getElementById('refer'), this.config);

 }

 </script>

</body>

</html>

- 本地访问
[http://zhouleim.yyuap.com:8888/refer.html](http://zhouleim.yyuap.com:8888/a.html) 
（需要解决浏览器跨域问题，如果mac终端访问

open -n /Applications/Google Chrome.app/ --args
--disable-web-security
--user-data-dir=/Users/换成你电脑名字/MyChromeDevUserData/ 

### [](#6-附录)6. 附录

- [《ReferCode字典汇总》](#/guides/05-refercodezidianhuizong)
- [《Refer参照常用扩展梳理》](#/guides/05-canzhaochangyongkuozhanshuli)