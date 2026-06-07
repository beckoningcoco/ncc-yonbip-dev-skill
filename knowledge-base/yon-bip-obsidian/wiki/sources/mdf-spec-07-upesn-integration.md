---
title: "与友空间集成"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-upesn-integration"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 11
---

# 与友空间集成

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-upesn-integration | 所属：协议

# [](#与友空间集成)与友空间集成

# [](#1-工作台)1. 工作台

- 友空间端
- 应用规格
- 阅读对象：各领域MDF框架使用者

## [](#11-背景效果)1.1. 背景&效果

MDF移动端显示形式分为友空间轻应用和友空间小程序两种形式。区别在于轻应用从网络下载前端静态资源等，小程序从本地加载静态资源，提升加载效率。更好的与友空间交互。小程序更符合友空间规范与UE目标。

- **转小程序是实现连续扫码的前提**
- **转小程序实现了静态资源本地加载，可以提升页面打开效率**
- **转小程序也是UE要求的目标，交互体验会更好**

两种显示效果如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng1.3cf58e1a.png)

## [](#12-mdf小程序推荐)1.2. MDF小程序【推荐】

### [](#121-名词解释)1.2.1. 名词解释

- 资源包：工程包与应用包的统称。
- 工程包：MDF脚手架打包后的资源文件，一般指mobile.extend.js+mobile.extend.css，需打包成zip上传资源包管理平台。
- 应用包：各个轻应用的配置问题，一般指config.json，config.json中包含domainkey、homePage等信息，用以说明应用信息，需打包成zip上传资源包管理平台。

### [](#122-开发资料)1.2.2. 开发资料

日常环境地址为例

**1、资源包管理平台：**

https://<工作台域名>/iuap-apcom-file/ucf-wh/sourcerecord/index.html#/login

账号密码：咨询友空间

**2、应用包config.json模板：**

{

 "projectName":"示例小程序",

 "appId":"应用id",

 "minNativeVersion":"要求的原生应用最低版本可为空",

 "maxNativeVersion":"要求的原生应用最高版本可为空",

 "setting":{

 "isCapsuleStyle":true,

 "capsuleStyle":0,

 "customCapsuleBgColor":"#BFBFBF",

 "customCapsuleBgAlpha":0.6,

 "customCapsuleImgColor":"#111111",

 "customCapsuleBorderColor":"#BFBFBF"

 },

 "homepage":"common/v9.0/index.html",//修改此处版本号为MDF公共资源版本号（日常是v9.0，预发和生产是1.0.0）

 "params":"?domainKey=upu&noShowLeft=true#/meta/voucherlist/pu_applyorderlist" //修改domainkey,修改轻应用首页地址（meta后地址）

}

config.json(1 KB)

### [](#123-操作步骤)1.2.3. 操作步骤

#### [](#1231-上传工程包)1.2.3.1. 上传工程包

**1、登录资源包管理平台**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng2.9f7c6047.png)

**2、新建工程包**

点击`新增资源包`，资源包编码填写`domainKey`，版本类别选择`多版本`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng3.a2015b48.png)

**3、新增工程包版本**

选择步骤2保存的资源包，点击`版本管理`，`新增版本`，版本号标准为3位数，例如`1.0.0`，后续版本可新增为1.0.1，以此类推

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng4.69a3f45e.png)

**4、上传工程包zip**

选择步骤2保存的资源包，点击上传~~，选择步骤3新增的版本号，勾选Andriod和IOS平台，解压路径填写domainKey/版本号，例如u9c/1.0.0。~~

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng5.9654c3a5.png)

点击安卓/IOS上传~~，选择MDF脚手架打包后的拓展资源文件，压缩javascripts和stylesheets文件夹，压缩文件后缀名为zip,勿压缩外层文件夹。验证压缩文件：右键解压到当前文件夹应该生成javascripts和stylesheets文件夹。~~

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng6.e859afa1.png)

检查无误，点击保存

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng7.873d8e44.png)

#### [](#1232-上传应用包)1.2.3.2. 上传应用包

**1、登录资源包管理平台**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng2.9f7c6047.png)

**2、新建应用包**

点击`新增资源包`，资源包编码填写`serviceCode或domainKey+appId`，统一标准为serviceCode，版本类别选择`仅使用默认版本`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng8.703dd81e.png)

**3、配置应用包config文件**

- **projectName**

应用名称

- **appId**

申请的友空间应用id

- minNativeVersion

要求的原生应用最低版本可为空

- maxNativeVersion

要求的原生应用最高版本可为空

- **homepage**

公共资源版本号：日常是v9.0，预发和生产是1.0.0（2021.10.28更新）

common/MDF公共资源版本号/index.html

- **params**

?domainKey=领域domainkey&noShowLeft=true#/meta/单据类型/单据编码

{

 "projectName":"U9C考勤查询",

 "appId":"1446",//申请的友空间应用id

 "minNativeVersion":"",

 "maxNativeVersion":"",

 "setting":{

 "isCapsuleStyle":true,

 "capsuleStyle":0,

 "customCapsuleBgColor":"#BFBFBF",

 "customCapsuleBgAlpha":0.6,

 "customCapsuleImgColor":"#111111",

 "customCapsuleBorderColor":"#BFBFBF"

 },

 "homepage":"common/v9.0/index.html",//修改此处版本号为MDF公共资源版本号（日常是v9.0，预发和生产是1.0.0，2021.10.28更新）

 "params":"?domainKey=u9c&noShowLeft=true#/meta/voucherlist/u9c_hr_attendencequery_list" //修改domainkey,修改轻应用首页地址（meta后地址）

}

**4、上传应用包zip**

选择步骤2保存的资源包，点击上传~~，勾选Andriod和IOS平台，解压路径填写domainKey/版本号，例如u9c/DEFAULT_VERSION。~~

检查无误，点击保存

#### [](#1233-包关联)1.2.3.3. 包关联

点击应用包右侧`包关联`，工程包无需包关联。新增的资源包数量应为应用包（轻应用数量）+工程包（MDF脚手架项目）总数，例如有10个应用，其拓展js与css在一个MDF脚手架项目中，那么资源包应为10个应用包+1个工程包=11个资源包，应用包至少应关联以下基础包：

- MDF公共资源包

**1、选择关联包**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng10.6a4b5319.png)

**2、更改关联包版本**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuyoukongjianjicheng11.ad352f87.png)

确认无误后点击`保存`，等待关联结果。

#### [](#1234-更改友空间应用类型)1.2.3.4. 更改友空间应用类型

更改友空间应用类型为小程序类型，联系友空间

需要注意的点：

- 转友空间小程序后，旧租户升级问题
- 新旧应用过度期的授权问题
- 目前需要领域手动上传小程序资源包和扩展资源包，接下来会做自动化
- 需要在友空间提申请预置新的应用（需要提供第3点的上传资源包编码）
- MDF小程序是新版本友空间的能力，需要考虑旧版本看到的还是旧的轻应用，新版本友空间看到的是新版本小程序，这个可以联系友空间 配置显示规则

### [](#124-上线流程)1.2.4. 上线流程

在预发、生产环境重复以上操作步骤，后续有自动化计划，实施进度咨询姚磊老师。

### [](#125-自动化更新资源包)1.2.5. 自动化更新资源包

目前需要以上操作创建资源包和维护资源包的依赖关系（后期规划在规格服务管理中维护）

代码更新可以使用下面的文档接入自动化

[《MDF小程序自动化》](#/spec/07-mdf-applet-auto-cicd)

## [](#13-mdf轻应用)1.3. MDF轻应用

### [](#131-申请应用标识)1.3.1. 申请应用标识

联系友空间产品经理申请AppId

### [](#132-预置应用规格)1.3.2. 预置应用规格

找本领域产品经理在运营管理平台上预置应用规格，把应用类型修改为MDF小程序

注意关注现有租户新旧版本更替问题

# [](#2-审批代办)2. 审批代办

- 代办消息 负责人 胡连平
- 审批中心 负责人 张宝斌

## [](#21-配置url规则)2.1. 配置URL规则

在审批中心配置审批代办消息对应的URL，URL即为MDF开发的单据地址

## [](#22-添加mdf标记)2.2. 添加MDF标记

在URL添加apptype=mdf参数，消息打开时走MDF预加载，使得页面打开速度更快

## [](#23-以小程序方式)2.3. 以小程序方式

以小程序方式打开代办和审批消息，暂不支持