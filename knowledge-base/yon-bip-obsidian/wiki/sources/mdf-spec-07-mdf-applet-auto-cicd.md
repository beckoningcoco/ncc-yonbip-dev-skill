---
title: "MDF小程序自动化 CICD"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-mdf-applet-auto-cicd"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 9
---

# MDF小程序自动化 CICD

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-mdf-applet-auto-cicd | 所属：协议

# [](#mdf小程序自动化-cicd)MDF小程序自动化 CICD

## [](#1-写在前面)1. 写在前面

**本文档功能需要接入MDF最新脚手架工程（目前版本为4.1）**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua1.5f7e4b63.png)

## [](#2-接入流程)2. 接入流程

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua2.c86cf17f.png)

## [](#3-新建资源包应用包)3. 新建资源包/应用包

日常 登录对应环境的小程序资源包管理平台=>新建资源包
（按照资源包编码命名规范新建资源包）

小程序资源管理平台地址
[https://bip-test.yonyoucloud.com](https://bip-test.yonyoucloud.com/)/iuap-apcom-file/ucf-wh/sourcerecord/index.html#/index

账号密码 可联系何艳阳提供

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua3.8dbfa43b.png)

**注：**

- 资源包归属**选MDF**
- **可以对照已有的资源包新建一个，如果是新建应用包必须同时新建或者更新规格中的资源包编码！！！（重点）**

## [](#4-资源包编码命名规范)4. 资源包编码命名规范

- 资源包-为领域的domainKey
- 应用包-为领域的domainKey和单据编码的组合, domainKey + *0*+ billno

示例：以domainKey为exceltraincenter， 单据编码为billno1为例

// 资源包

资源包编码: "exceltraincenter"

 

// 应用包

资源包编码: "exceltraincenter_0_billno1"

## [](#5-前端工程新建配置文件)5. 前端工程新建配置文件

在根目录下新建conf文件夹，包括了2个主要文件app.applet.json和apps

以domainKey为exceltraincenter， 单据编码为billno1和billno2为例

conf

├── app.applet.json --------------------------------- 小程序配置文件（必须有）

└── apps -------------------------------------------- 小程序应用包配置文件

 ├── billno1--------------------------------------（应用包配置文件1）

 │ └── config.json

 └── billno2------------------------------------- （应用包配置文件2）

 └── config.json

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua4.2db23125.png)

### [](#51-新建小程序配置文件)5.1. 新建小程序配置文件

在conf目录下新建app.applet.json配置文件

**app.applet.json**

{

 "enableResPackage": true,

 "resPackages": [

 {

 "sourceCode": "exceltraincenter"

 }

 ],

 "enableAppPackage": true,

 "appPackages": [

 {

 "sourceCode": "billno1"

 },

 {

 "sourceCode": "billno2"

 }

 ]

}

#### [](#511-参数说明)5.1.1. 参数说明

||**参数**||**值类型**||**是否必填**||**说明**|
||**enableResPackage**||Boolean||是||是否开启小程序自动上传功能|
||**resPackages**||Array||否||资源包信息，可以不传，一般情况下不要传值|
||resPackages.sourceCode||String||取决于resPackages如果有值，则为必填||资源包编码，默认为domainkey|
||resPackages.version||String||否||资源包版本，默认为1.0.0|
||resPackages.neceUpdate||Boolean||否||是否开启强制更新资源，默认为false|
||**enableAppPackage**||Boolean||否||是否上传应用包，如果值为false，配置的appPackages无效|
||**appPackages**||Array||取决于enableAppPackage如果为ture则为必填||应用包信息，允许传多个应用包|
||appPackages.sourceCode||String||取决于enableAppPackage如果为ture则为必填||应用包编码|

**备注：**

**1、resPackages：为资源包信息**

- 一般情况下不建议传参，会默认打包到当前领域domainKey和版本为1.0.0下
- 如果传值了也建议将sourceCode命名为领域domainkey（必须是在mdf注册过的）
- 这是个数组类型，允许传多个资源包，会将本工程生产的小程序静态资源同时生成在对应的资源包节点里

**2、appPackages：应用包信息**

- appPackages下每一个map结构都对应一个应用包

### [](#52-新建应用包配置文件)5.2. 新建应用包配置文件

在conf目录下新建apps配置文件夹，包含了应用包文件信息

- apps里创建的文件夹名需要和app.applet.json里appPackages下的sourceCode参数一一对应，**以每一个sourceCode作为apps里的文件夹名称**（**重点**）

例如

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua5.aa6b1bf4.png)

- 创建应用包里的配置文件config.json

**config.json**

{

 "projectName": "示例小程序",

 "appId": "应用id",

 "appletVersion": "小程序版本",

 "minNativeVersion": "要求的原生应用最低版本可为空",

 "maxNativeVersion": "要求的原生应用最高版本可为空",

 "setting": {

 "isCapsuleStyle": true,

 "capsuleStyle": 0,

 "customCapsuleBgColor": "#BFBFBF",

 "customCapsuleBgAlpha": 0.6,

 "customCapsuleImgColor": "#111111",

 "customCapsuleBorderColor": "#BFBFBF"

 },

 "homepage": "common/1.0.0/index.html",

 "params": "?domainKey=ustock#/meta/voucherlist/st_inrecordlist"

}

config.json文件里的参数具体含义
请阅读参考文章2里的文档【上传应用包】章节

config.json里setting里的具体参数解释 ↓

**设置小程序胶囊样式**

<font size="1" color="gray">更新时间：2020-02-02</font>

 

**setAppletCapsuleStyle** <font size="2" color="gray">API_AVAILABLE(友空间6.2.0及以上版本)</font><br/>

设置小程序胶囊样式

**入参**

||名称||类型||默认值||必填||说明|
||capsuleStyle||int||0||否||胶囊样式，0浅色 1深色 2自定义颜色|
||customCapsuleBgColor||string||#BFBFBF||否||自定义胶囊背景色值 例:#00ff00|
||customCapsuleBgAlpha||float||0||否||自定义胶囊背景透明度 0-1，默认0-完全透明|
||customCapsuleImgColor||string||#111111||否||自定义胶囊图片色值 例:#00ff00|
||customCapsuleBorderColor||string||#BFBFBF||否||自定义胶囊边框色值 例:#00ff00|
||success||function||||否||调用成功的回调函数|
||fail||function||||否||调用失败的回调函数|
||complete||function||||否||调用结束的回调函数（调用成功、失败都会执行）|

**调用代码示例**

YYEsnBridge.ready(function (){

 YYEsnBridge.do('setAppletCapsuleStyle', {

 'success': function(res){alert('调用成功');},

 'fail': function(err){alert('调用失败');},

 'complete': function(res){alert('调用完成后执行');}

 });

});

### [](#53-检查domainkey)5.3. 检查domainKey

以上配置完成后，需要检查下本工程里src/common/config.env.js的DOMAIN_KEY参数，**这个参数必须有且为本工程的domainKey**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua6.914e9af6.png)

## [](#6-流水线配置)6. 流水线配置

### [](#61-第一步检查命令)6.1. 第一步：检查命令

一般情况下升级了最新的MDF脚手架，在项目工程根目录下的package.json会有build:extend:applet的命令，如果没有请按照图示添加

（有的工程里有build:extend:notns命令，也直接替换为build:extend:applet）

**package.json**

"build:extend:applet": "cross-env BABEL_ENV=production NODE_ENV=production ZIP=true MDF_LANG=true BUILD_MODE=applet node --max-old-space-size=4096 node_modules/webpack/bin/webpack.js --config webpack.config.js --progress && echo '前端扩展：编译完成'",

### [](#62-第二步更新dockfile启动命令)6.2. 第二步：更新dockfile启动命令

在npm run build:extend 后在加一个命令：npm run build:extend:applet
然后保存配置执行流水线即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua7.1f17b882.png)

## [](#7-结语)7. 结语

**至此配置已经完成。提交代码后执行完流水线，在下次打开小程序时，会自动下载最新的资源包**

## [](#8-参考文章)8. 参考文章

参1：https://<云文档域名>/l/e3760eaa7f6e YonBIP资源包增量架构设计文档

## [](#9-faq)9. FAQ

### [](#91-q-小程序资源加载及问题排查链路)9.1. Q: 小程序资源加载及问题排查链路？

**A:
小程序的加载链路很长，涉及到了跨部门的合作，很多领域遇到了问题不知道是哪里报错的，或者不知道该找哪个部门解决,
如下是具体链路。**

- **小程序的静态资源提供方：各个领域**
- **小程序静态资源的上传方：MDF**
- **小程序静态资源的获取(存储)方：协同-集成**
- **小程序静态资源的加载方：协同-移动开发**

**流程图**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua8.f8fccd87.png)

**所以一般出现问题按照上述流程排查**

### [](#92-q-如何排查是否是mdf资源上传问题)9.2. Q: 如何排查是否是MDF资源上传问题？

**A:
在浏览器地址栏访问${domain}/mdf-node/mdf/getAppletResource?resourceCode=${sourceCode}**

**其中:**

- **domain为各个环境域名 （测试环境，日常环境等）**
- **sourceCode为资源包编码
一般为domainKey（参考[资源包编码命名规范](#/spec/07-mdf-applet-auto-cicd#kwQCb)）**

**示例：**

**https://<工作台域名>/mdf-node/mdf/getAppletResource?resourceCode=ustock**

**如返回下图接口形式，即为上传成功了，到MDF链路通了。反之失败**

{

 "id": "xxxxx",

 "resourceid": "ustock_0_st_purinrecord",

 "version": "DEFAULT_VERSION",

 "zipdetailurl": "xxxxx.xxx.com/static/mdf/ustock/prod_785bda2a6_20230110213935/applets/ustock_0_st_purinrecord.zip",

 "zipPath": ""

}

### [](#93-q-访问小程序资源上传接口报错403)9.3. Q: 访问小程序资源上传接口报错403？

**A:
一般是静态资源提供方出的问题，参考[流水线配置](#/spec/07-mdf-applet-auto-cicd#MExNj)，领域前端工程里没有配置**build:extend:applet**或者流水线没有配置**npm
run build:extend:applet

### [](#94-q-友空间加载资源接口)9.4. Q: 友空间加载资源接口

**A:
在浏览器地址栏访问${domain}/iuap-apcom-file/esn-resource/mobile/resource/get_newest?applicationcode=AMCM04008&resourceid=${resourceid}&tag=v1&vercode=2-6.5.5-2-1&version=DEFAULT_VERSION**

**其中:**

- **domain为各个环境域名 （测试环境，日常环境等）**
- **resourceid为资源包编码，例如：ucf-amc-aom_0_sim_pcspec_list_mobile**

**返回值：data**

- **data.zipdetailurl 为应用包资源， 确保资源能正常下载**
- **data.resourceList 为依赖资源，依赖资源在友空间小程序资源平台绑定，确认依赖关系，确保zipdetailurl能正常下载**

{

 "error_code": "0",

 "error": "success",

 "error_description": "",

 "data": {

 "id": "51e59d3480d0159dbd6ae8b5b47bf088",

 "resourceid": "20220531112116625-8067",

 "version": "DEFAULT_VERSION",

 "zipdetailurl": "https://design.xxxxx.com/static/mdf/ucf-amc-aom/20240124-134214/applets/ucf-amc-aom_0_sim_pcspec_list_mobile.zip",

 "zipPath": "",

 "neceUpdate": false,

 "multiPack": true,

 "resourceList": [

 {

 "id": "2e45d83c43",

 "resourceid": "20210508170443649-7476",

 "version": "1.0.0",

 "zipdetailurl": "https://design.xxxxx.com/static/mdf/assets/applets/applet.mdfjs.2e45d83c43.zip",

 "zipPath": "common/1.0.0",

 "neceUpdate": false

 },

 {

 "id": "20240124-134214",

 "resourceid": "20220602185640135-9321",

 "version": "1.0.0",

 "zipdetailurl": "https://design.xxxxx.com/static/mdf/ucf-amc-aom/20240124-134214/applets/ucf-amc-aom.zip",

 "zipPath": "ucf-amc-aom/1.0.0",

 "neceUpdate": true

 },

 {

 "id": "380b9a83017541b59f356fd949219b3f",

 "resourceid": "20220630095718867-9759",

 "version": "1.0.0",

 "zipdetailurl": "https://design.xxxxx.com/static/ucf/iuap-tns.share-fe/20240119-171623/resource/iuap-tns-for-moblie.zip",

 "zipPath": "iuap-tns/ucf-wh/share/",

 "neceUpdate": false

 },

 {

 "id": "20240124-130738",

 "resourceid": "20221025190908981-2521",

 "version": "1.0.0",

 "zipdetailurl": "https://design.xxxxx.com/static/mdf/yonbip-am-ampub/20240124-130738/applets/yonbip-am-ampub.zip",

 "zipPath": "yonbip-am-ampub/1.0.0",

 "neceUpdate": true

 },

 {

 "id": "2024010506135334052-1959",

 "resourceid": "20230705135334051-4813",

 "version": "1.2.0",

 "zipdetailurl": "https://bip-pre.xxx.com/iuap-apcom-file/ucf-wh/fileservice/app/fileservice.zip",

 "zipPath": "fileservice-app",

 "neceUpdate": true

 }

 ]

 }

}

### [](#95-q-点击页面白屏资源接口mobileextendminjs报错)9.5. Q: 点击页面白屏，资源接口mobile.extend.min.js报错

**A: 排查步骤**

**在打开这个离线小程序的时候，会先调用iuap-apcom-file/esn-resource/mobile/resource/get_newest接口去请求应用所需的资源，看下是否有该压缩资源包，请检查后端配置是否上传或依赖了该压缩资源包，**

**如果有的话，在查看下运营平台预制的小程序下载包id是否和资源包id一致
(命名规则为domainkey_0_billno)**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxiaochengxuzidonghua9.1bc45b27.png)