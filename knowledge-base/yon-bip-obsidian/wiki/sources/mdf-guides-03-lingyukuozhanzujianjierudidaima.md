---
title: "领域扩展组件接入低代码"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanzujianjierudidaima"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 15
---

# 领域扩展组件接入低代码

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanzujianjierudidaima | 所属：指南

## [](#领域扩展组件接入低代码)领域扩展组件接入低代码

MDF扩展组件接入低代码设计器内，需要改造脚手架只许几步即可

**该功能需要开启领域特性：【hasDesignLoadExtend】[详情移步特性文档页面](#/node/02-config-item-desc)**

**该功能需要开启领域特性：【hasDesignLoadExtend】[详情移步特性文档页面](#/node/02-config-item-desc)**

**该功能需要开启领域特性：【hasDesignLoadExtend】[详情移步特性文档页面](#/node/02-config-item-desc) ！！！**

**当前环境上线进度：测试环境**

# [](#个别领域接入自定义扩展组件或本地开启了代理插件resourceoverride后导致画布区异常崩溃需要对组件进行画布区模式的改造使用常量cbdiwork_integration_mode)**个别领域接入自定义扩展组件或本地开启了代理插件ResourceOverride后，导致画布区异常崩溃，需要对组件进行画布区模式的改造，使用常量【cb.**DIWORK_INTEGRATION_MODE**

'design'】来判断出低代码设计器模式，或者在URL中删除GET参数feDomainKey来关闭自定义组件加载**

## [](#1-mdf41脚手架首先修改packagejson-必填)1. MDF4.1脚手架首先修改package.json **(必填)**

**package.json**

"@mdf/create-app": "snapshot" // 使用测试的包，后续可以使用3.1、3.4

// 20240326已部署日常环境可以使用3.1的包

## [](#2-增加低代码打包入口废弃)2. 增加低代码打包入口（废弃）

**以下步骤当前无需处理，框架已经使用原有的扩展资源文件：extend.min.js、extend.min.css**

修改script命令，找到构建资源产物的 build:extend
增加一个环境变量BUILD_MODE=designer

本地调试设计器组件的话，同理就把 debug:extend 的命令增加环境变量
BUILD_MODE=designer

**package.json**

"debug:extend": "cross-env BABEL_ENV=production NODE_ENV=development

SCRIPT_PORT=3006 MDF_LANG=true BUILD_MODE=designer webpack serve

--progress --config webpack.config.js",

**package.json**

"build:extend": "cross-env BABEL_ENV=production NODE_ENV=production

ZIP=true MDF_LANG=true BUILD_MODE=designer node

--max-old-space-size=4096 node_modules/webpack/bin/webpack.js --config

webpack.config.js --progress && echo '前端扩展：编译完成'"

**以下步骤当前无需处理，框架已经使用原有的扩展资源文件：extend.min.js、extend.min.css**

在src/client/designer.jsx创建文件，作为入口

**src/client/designer.jsx**

// 低代码设计器打包入口

cb.extend.loadExtendResource(process.env.__DOMAINKEY__,

import('./web/designer'));

// 引入扩展样式

import './web/styles';

创建打包内容文件 src/client/web/designer.jsx

这里的内容使用web.jsx里的内容，去除busniess、route、action、等和组件设计器无关的

**src/client/web/designer.jsx**

// 本地调试和普通打包时加载扩展组件，组件单独打包时扩展组件不在此处注册

// 去除扩展脚本

// 注册扩展组件

const extendComponents = require('./components').default;

cb.extend.registerComponents(process.env.__DOMAINKEY__,

extendComponents);

// 注册reducer

const extendReducers = require('./redux/reducers').default;

cb.extend.registerReducers(process.env.__DOMAINKEY__,

extendReducers);

// 去除扩展action

//

注册变量（框架使用的变量前后添加__）此方式和在Consul中配置等效且优先级大于Consul

cb.extend.registerEnv(process.env.__DOMAINKEY__, { //

registerEnv的第2个参数可以是个方法，接收一个当前环境env参数

currentEnv: 'test' //

领域自定义变量示例（小驼峰规范），变量使用：viewmodel.getEnv('currentEnv')

});

// 注册多语，第三个参数不能为空，为空可能会导致页面白屏

cb.lang.registerLang(process.env.__DOMAINKEY__,

require('../../pack'), 'YS_YC_SUPPLIER-MDF-FE');

// 样式引入

通过改造后，脚手架执行构建命令后，会在产出目录下生成如下资源：

-rw-r--r-- 1 yueming staff 313K 11 22 09:59

extend.118.99e02495e7.min.js

-rw-r--r-- 1 yueming staff 664K 11 22 09:59

extend.118.99e02495e7.min.js.map

-rw-r--r-- 1 yueming staff 7.7K 11 22 09:59

extend.132.00f8471d8d.min.js

-rw-r--r-- 1 yueming staff 18K 11 22 09:59

extend.132.00f8471d8d.min.js.map

-rw-r--r-- 1 yueming staff 285K 11 22 09:59

extend.153.01223a0d82.min.js

-rw-r--r-- 1 yueming staff 1.0M 11 22 09:59

extend.153.01223a0d82.min.js.map

-rw-r--r-- 1 yueming staff 1.8K 11 22 09:59

extend.527.285679434a.min.js

-rw-r--r-- 1 yueming staff 5.6K 11 22 09:59

extend.527.285679434a.min.js.map

-rw-r--r-- 1 yueming staff 30K 11 22 09:59

extend.582.0308123d96.min.js

-rw-r--r-- 1 yueming staff 177K 11 22 09:59

extend.582.0308123d96.min.js.map

-rw-r--r-- 1 yueming staff 7.8K 11 22 09:59

extend.888.3f5fe2a34b.min.js

-rw-r--r-- 1 yueming staff 13K 11 22 09:59

extend.888.3f5fe2a34b.min.js.map

-rw-r--r-- 1 yueming staff 998K 11 22 09:59

extend.933.54bd2296ef.min.js

-rw-r--r-- 1 yueming staff 3.4M 11 22 09:59

extend.933.54bd2296ef.min.js.map

-rw-r--r-- 1 yueming staff 7.4K 11 22 09:59 extend.designer.min.js //

------> 这里的designer就是设计器画布加载的扩展组件

-rw-r--r-- 1 yueming staff 31K 11 22 09:59 extend.designer.min.js.map

// ------> 对应的源码映射

-rw-r--r-- 1 yueming staff 7.7K 11 22 09:59 extend.min.js

-rw-r--r-- 1 yueming staff 32K 11 22 09:59 extend.min.js.map

-rw-r--r-- 1 yueming staff 7.4K 11 22 09:59 mobile.extend.min.js

-rw-r--r-- 1 yueming staff 31K 11 22 09:59 mobile.extend.min.js.map

经过脚手架的改造产出资源后，MDF加载器就会按照当前领域domainKey去加载对应的资源

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image1.cedd1b49.png)

## [](#3-画布区如何显示左侧组件库以及右侧属性面板)3. 画布区如何显示左侧组件库以及右侧属性面板

以上步骤一系列完成后，正常是可以看到扩展组件在画布区呈现，当前只是设计展示，点击该组件后，发现右侧面板是空白的，下面就需要如何在资源中心去创建属于自己的扩展组件库，设计相应属性等

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image2.09c56ebd.png)

打开资源中心节点，【新建】弹出框

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image3.1b6a80d6.png)

输入编码如【mdf-iuap-demo-comp】，规范可以参考【mdf-领域编码-组件库名称-自定义含义】这种即可（这里推荐使用自己领域在MDF
Node注册的domainKey）

名称填写组件标准名称文字即可，在设计器是可以看到的文字，运行脚本当前MDF已经默认集成加载进去了，无需这块处理，但是必填上传一个标准的js产物即可，描述文件就是属性的manifest.json文件，后面可以在组件自行设计即可，这里也不填。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image4.7e2d8297.png)

引擎版本选择5版本，领域按照自己的选择，行业也是一样，输入组件描述，确定即可，这样我们MDF扩展组件库就创建好了，但是当前只是一个空的组价库。

创建成功后，点击组件设计图标进入到我们组件设计模式。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image5.b13ee91d.png)

点击添加组件按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image6.d30884bd.png)

输入编码，这里的编码就是我们MDF领域扩展组件的cControlType，举例：领域upu扩展了一个组件类型是basic，组件名是MyCustomComponent，那么这里就输入组件名称MyCustomComponent，名称输入组件的描述即可，组件类型按需选择，确定。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image7.81fa7d36.png)

点击创建的组件，右侧切换到属性管理，点击新建创建属性，选择相应的类型，保存即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image8.0a44848e.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image9.9ab7191b.png)

添加完属性和事件后，就可以把组件库发布了，发布完成后，就可以在设计器里找到该组件进行布局

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image10.1eb1465a.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image11.b4a0bb19.png)

## [](#4-原有协议上的组件不显示属性面板的问题)4. 原有协议上的组件不显示属性面板的问题

我们新建完组件库后，正常拖拽是可以正常显示的，是因为协议上设计器添加了特有的识别字段，原有的协议是不存在这些字段的，所以不显示，按照下面去做即可正常

![](data:image/png;base64,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)

编辑组件的UI模板协议，添加三个属性即可：

{

"xLibCode": "mdf-iuap-demo-comp", // 替换为你创建的组件库编码

"uiplugin": true,

"uiExtClass": "xcontrol"

}

## [](#5-如何在mdf扩展组件使用-manifestjs-文件来自动生成整体的组件库-manifestjson)5. 如何在MDF扩展组件使用 manifest.js 文件来自动生成整体的组件库 manifest.json

首先在领域脚手架添加核心manifest.js文件，一般包含2部分，其中在src/client/web/下新建
manifest.js
文件，这个文件定义的是整个扩展组件的大的manifest，其内容大致为：

移动端也是一样的道理路径是 src/client/mobile/manifest.js

**src/client/web/manifest.js**

const domainKey = '自己领域的'

module.exports = {

code: domainKey,

name: domainKey,

version: "1.0.0",

domainKey,

keywords: [domainKey, "library"],

description: "XX云XX组件包",

terminalType: 0, // 0:pc, 1:mobile

group: [

{

id: "baseGroup",

name: "基础容器",

children: [

"Demo"

]

}

]

};

然后找到我们的扩展组件库的位置：src/client/web/components/basic/demo 下
新建文件：manifest.js

提示：@yonyou/yon-extension
包已经依赖到MDF脚手架中，领域脚手架无需依赖使用，只需要重新构建拉取新包即可

**src/client/web/components/basic/demo/manifest.js**

const { TypeProps, UIExtClass, FieldTypes, EditTypes, commonControlProps

} = require("@yonyou/yon-extension");

module.exports = {

name: "测试组件",

code: "Demo",

icon: 'ynfcomponent ynfc-demo',

type: TypeProps.BasicControls,

uiExtClass: UIExtClass.Control,

compType: UIExtClass.Control,

libraryGroupId: "baseGroup",

props: [

{

code: "group_base",

name: "基础属性",

metaType: "Group",

metaProps: JSON.stringify({

uiSysNodeProps: { disabled: true }

})

},

...commonControlProps,

{

code: "group_detail",

name: "详细属性",

metaType: "Group",

metaProps: JSON.stringify({

uiSysNodeProps: { disabled: true }

})

}, {

name: "标题样式",

code: "style",

metaProps: JSON.stringify({ styleParams: ["font", "appearance",

"border"] }),

metaType: "Style",

type: FieldTypes.string

}, {

code: "size",

defaultValue: '64',

name: "尺寸",

showDesign: true,

metaType: EditTypes.Select,

type: FieldTypes.number,

metaProps: JSON.stringify({

options: [

{ value: '32', text: '小' },

{ value: '64', text: '中' },

{ value: '128', text: '大' }

]

})

}],

events: [

{

operationCode: "onError",

operationName: "加载失败"

}

]

}

移动端的manifest和PC也是一样的模式，只是不同的文件夹web和mobile的区别，执行构建命令后正常的话是随着构建资源一起产出的

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image13.1296ee19.png)

## [](#6-关于资源中心的组件库流水线拉取的实现方案)6. 关于资源中心的组件库流水线拉取的实现方案

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image14.40b8c211.png)

在创建组件库的界面，输入「编码」字段的时候，该编码实际为领域注册在
MDF-Node 的 domainKey ，MDF领域上传的资源路径是
[https://design.yonyoucloud.com/static/mdf/{domainKey}/{构建时间}/javascripts/extend.designer.min.js](https://design.yonyoucloud.com/static/mdf/%7BdomainKey%7D/%7B%E6%9E%84%E5%BB%BA%E6%97%B6%E9%97%B4%7D/javascripts/extend.designer.min.js)
，需要推算出构建时间，

通过
[https://design.yonyoucloud.com/static/mdf/{domainKey}/version/{环境变量}_version.json](https://design.yonyoucloud.com/static/mdf/%7BdomainKey%7D/version/%7B%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%7D_version.json)
就能得到构建时间

所以实现方式为输入编码，失焦后，得到 domainKey
如：yonbip-cpu-suppliermgr，当前环境假设为 测试环境，那么拼接接口为
[https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/version/test_version.json](https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/version/test_version.json)
返回信息为 

**返回值为构建时间**

{"version": "20231204-101105"}

拿到上面的构建时间后，拼接最终资源也就是extend.designer.min.js以及pc.manifest.json文件，完整路径如下：

运行脚本：[https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/javascripts/extend.designer.min.js](https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/javascripts/extend.designer.min.js)

描述文件：[https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/pc.manifest.json](https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/pc.manifest.json)

文档文件：[https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/pc.manifest.md](https://design.yonyoucloud.com/static/mdf/yonbip-cpu-suppliermgr/20231204-101105/pc.manifest.md)

资源中心新建的时候只要拿到这三个文件即可创建MDF领域扩展，对应的移动端资源就是把pc替换为mobile即可

以下为不同环境下的含义列举：

||序号||名称||含义|
||序号||名称||含义|
||1||test||测试环境|
||2||daily||日常环境|
||3||pre||预发环境|
||4||online||生产环境2|

||序号||名称||含义|
||序号||名称||含义|
||1||pc||电脑端|
||2||mobile||手机端|

## [](#7-常见问题)7. 常见问题

- 在yonbuilder设计器属性区修改值后，在自定义组件中不响应，props中找不到对应属性。 

     
 预制属性在props.meta中获取，自定义属性可以在props中取到（预制属性即数据库表中的保留字段如cFieldName，cShowCaption）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanzujianjierudidaima_image15.da144b0d.png)

常见保留字段

{

"UI##cName": {

"en_US": "Homepage Header Area",

"id_ID": "Area Tajuk Rumah",

"zh_TW": "首頁頭部區域"

},

"bMain": true,

"cCode": "sfc_iworkshop_home_info",

"cControlType": "isfctop",

"cDataSourceName": "sfc.proceTaskReport.ProceTaskReportDetail",

"cGroupCode": "Isfc_top",

"cName": "首页头部区域",

"cName_resid": "UID:P_SFC-UI_1A45F4400550006E",

"cPrimaryKey": "id",

"cSubId": "IMPSFC",

"designId": "group_1913630461281697805",

"groupId": "nid_1705976100725_4",

"iBillEntityId": "1913630461281697799",

"iBillId": "1913630461281697798",

"iOrder": 10,

"iSystem": true,

"iTplId": "1913630461281697800",

"isDeleted": false,

"nid": "nid_1705976100725_4",

"pubts": "1705976101000",

"sysid": "1913047153272946693",

"uiObject": "containers",

"uiTable": "BillTplGroupBase",

"uiisview": true,

"uikey": "123",

"uititle": "",

"uitype": "isfctop",

"UI##controlOrderArr": [],

"UI##otherOrderArr": [],

"UI##isShow": true,

"xLibCode": "mdf-iuap-demo-comp",

"uiplugin": true,

"uiExtClass": "xcontrol",

"key": "key_1706063946641_10",

"cShowCaption": "",

"cCaption": "",

"cFieldName": "123",

"cItemName": "12356"

}