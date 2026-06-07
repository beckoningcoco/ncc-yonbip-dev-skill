---
title: "组件开发指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-how-to-create-ynf-component"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 10
---

# 组件开发指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-how-to-create-ynf-component | 所属：YNF-开发指南

# [](#组件开发指南)组件开发指南

`YNF`组件开发展是针对`yonbuilder`单据进行自定义组件的开发，自定义组件开发之后，可以在资源中心进行发布和管理，发布之后，可以在设计器左侧找到自定义组件进行拖拽。`ynf init`指令创建的时候可以创建前端组件类型的二方包

目前，`YNF`前端组件其本质就是`React`组件，`React`组件是`React`开发中的基本单元，表示页面中的部分功能。组件可以组合起来构建复杂的用户界面，每个组件负责处理自己的逻辑和渲染，并且可以独立地更新，组件具有以下特点：

- 可复用：可以将组件在其他地方使用，实现代码复用。
- 独立：组件独立处理自己的逻辑和渲染，与其他组件无关。
- 可组合：可以将多个组件组合起来构建复杂的页面。

我们在这个技术的基础上封装了基础类组件、业务类组件等：

- 基础组件：抽象了页面当中可操作的、最小的基础功能单元，例如：按钮、输入框、数字输入框、图标、选择框、模态框、表格、列表、分页器、时间选择器、日期选择器等等；
- 业务组件：根据某个独立的、尽可能小的业务场景下的若干个基础组件的有序组合，通常用来解决一个小场景的问题形成的场景化组件；

**说明**：YNF组件开发指南适用于低代码和零代码，只不过不同点在于协议的配置，以下流程为通用的自定义组件开发流程。

## [](#1架构设计)1.架构设计

![组件开发标准](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/how-to-create-component.bc3552ab.jpg)

## [](#2规范说明)2.规范说明

### [](#21工程目录说明)2.1.工程目录说明

├── dist # 构建产物

├── src # 源码目录

│ ├── assets # 静态资源

│ ├── components # 组件目录

│ │ ├── Button

│ │ │ ├── index.module.less # 样式文件

│ │ │ ├── index.tsx # 组件入口文件 

│ │ │ └── manifest.js # 组件manifest描述

│ ├── services # 接口处理

│ ├── utils # 工具

│ ├── designer.ts # 设计器脚本入口文件

│ ├── index.ts # 组件包入口文件

│ └── manifest.js # 组件包manifest描述

├── README.md

├── module.xml

├── ynf.config.js # 项目配置文件

└── package.json

### [](#22组件目录和样板文件说明)2.2.组件目录和样板文件说明

- libName：组件名称
- pascalCase(libName)：将名称转换大驼峰形式

├── Button

│ ├── demo

│ │ └── index.stories.tsx # demo样板

│ ├── index.module.less # 样式文件

│ ├── index.tsx # 组件入口文件 

│ └── manifest.js # 组件manifest描述

#### [](#221组件样板文件indextsx)2.2.1.组件样板文件`index.tsx`

index.tsx为组件的入口文件，以下例子为类组件，可自行改写为函数组件

import React, { Component } from 'react';

import styles from './index.module.less';

export default class <%= pascalCase(libName) %> extends Component {

 render () {

 const { designDomAttr = {} } = this.props;

 return (<div className={styles['wrapper']} { ...designDomAttr }>

 { 'I am <%= pascalCase(libName) %> Component' }

 </div>);

 }

}

#### [](#222组件样板文件indexmoduleless)2.2.2.组件样板文件`index.module.less`

index.module.less为组件的样式文件，可在此文件下定义组件的样式

@import '../../assets/style/index.less';

.wrapper {

 :global {

 // ...

 }

}

#### [](#223组件样板文件manifestjs)2.2.3.组件样板文件`manifest.js`

mannifest.js具体说明和配置请移步[4.4.**mannifest.js**](http://localhost:8000/guides/g01-how-to-create-ynf-component#44mannifestjs)

const { FieldTypes, TypeProps, EditTypes, commonControlProps, UIExtClass } = require("@yonyou/yon-extension");

module.exports = {

 name: "按钮",

 code: "Button",

 icon: "lowcode lcButton",

 type: TypeProps.BasicControls,

 uiExtClass: UIExtClass.Button,

 compType: UIExtClass.Button,

 libraryGroupId: "baseGroup",

 props: [

 // ...

 ],

 events: [

 // ...

 ],

 children: [

 // ... 

 ]

}

### [](#23命令说明)2.3.命令说明

#### [](#231npm-run-build)2.3.1.`npm run build`

说明：构建命令，用于构建资源，默认情况下：资源输出目录`ROOT/dist/`、mode=production、devtool=false，可通过`ROOT/ynf.config.js`工程配置文件进行修改，或者通过命令行参数形式进行修改

#### [](#232npm-run-builddev)2.3.2.`npm run build:dev`

说明：作用同`npm run build`，这是系统开发模式的快捷方式，通过初始化开发模式的参数实现：mode=development、devtool=cheap-module-source-map

#### [](#233npm-run-debug)2.3.3.`npm run debug`

说明：调试命令，本地通过webpack-dev-server开启服务、实时编译资源，该模式下可通过设置资源代理联调相应环境，访问方式：`http://localhost:[port]/index.js`

代理调试工具为Resource Override

- 代理调试设置，如果是`CDN`地址：
[https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/*/**](https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/*/**)
[https://localhost:9090/**](https://localhost:9090/**)
- 代理调试设置，如果是`YMS`地址：
[https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/**](https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/**)
[https://localhost:9090/](https://localhost:9090/)**

调试配置示例：

![image-20240625113027306](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240625113027306.716ae3d1.jpg)

#### [](#234npm-run-start)2.3.4.`npm run start`

说明：本地调试命令，生成本地预览，通过`storeybook`开启组件本地预览效果

- 参数说明：
`--https`：本地开启https 模式；【非必要参数， 不传递则使用 http 协议】
`--host`：使用本地hosts文件里的自定义域名进行访问；【非必要参数，不传递则默认 localhost】
`--port`：自定义本地的调试端口；【非必要参数，如果不传递，内部随机一个当前系统可用的端口】
- 参数使用方式：

// package.json

scripts: {

 "start": "ynf-scripts start --https --host=test.yyuap.com --port=6006", 

}

- 本地调试开启http请求代理：

可以修改`ROOT/.storybook/middleware.js`文件，在此配置需要代理的http 请求；使用实例见项目下的此文件。

## [](#3准备工程)3.准备工程

**说明**：有两种方式可以创建出模版工程

- 1、ynpm 命令行工具；（有用友vpn的可以通过 ynpm 命令行工具进行创建）
- 2、直接下载已有依赖的模版工程；（无法访问用友网络的项目，可以通过此方式进行创建）[点击下载](https://bip-test.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs/template/ynf-ap-package-lib.zip)

### [](#方式1-ynpm命令行工具-初始化)方式1-ynpm命令行工具 初始化

// 1.全局安装ynpm工具

npm install ynpm-tool -g

// 2.全局安装ynf-dx-cli工具

ynpm install ynf-dx-cli -g

#### [](#准备资源编码libcode)准备资源编码`libCode`

资源编码`libCode`非常重要，它就是资源的`ID`，它贯穿了整个开发、流水线部署、资源中心发布、CDN访问等等过程，定义方式请参考[《YNF二方包管理及接入指南》](https://docs.yonyoucloud.com/l/77c3ca1ecb16)，例如：ynf-demo-lib、ynf-demo-app、ynf-demo-api

#### [](#采用ynf命令行工具初始化组件二方包脚手架)采用`ynf`命令行工具初始化组件二方包脚手架

关于`ynf-dx-cli`开发工具的详细使用说明，请移步[https://package.yonyoucloud.com/package/detail/ynf-dx-cli](https://package.yonyoucloud.com/package/detail/ynf-dx-cli)

- 查看`ynf`命令行工具使用说明

// 命令行执行

$ ynf init lib --help

// 命令行说明

ynf init [command] [libCode] [options]

 Options:

 -h, --help 查看帮助文档

 -V, --version 查看版本信息

 Commands:

 app [libCode] 初始化应用二方包脚手架

 lib [libCode] 初始化组件二方包脚手架

 sdk [libCode] 初始化SDK二方包脚手架

- 使用`ynf`命令行工具初始化组件二方包脚手架

// 命令行执行

$ ynf init lib ynf-demo-lib

语言可以自定义选择

![image-20240625134326060](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240625134326060.dd6a0fef.jpg)

控制台日志

// 控制台日志

[1/5] 接收参数：{"libType":"lib","libCode":"ynf-demo-lib"}

[2/5] 检测到工作目录[C:\Users\Administrator\Desktop\学习demo\nodejs\ynf-demo-lib]

[3/5] 解压缩内置脚手架[C:\Program Files\nodejs\node_modules\ynf-dx-cli\lib\template\ynf-dx-template-lib.zip]

[4/5] 替换模版变量完成

[5/5] 脚手架初始化完成

#### [](#使用ynpm安装项目依赖)使用`ynpm`安装项目依赖

// 命令行执行

$ ynpm install

### [](#方式2-已有的模版-初始化)方式2-已有的模版 初始化

**当没有 ynpm 可用时，可以选择已经配置好的工程模版如下。**

#### [](#下载模版工程)下载模版工程

- 模版工程分linux版本和window版本里面内置好了依赖

#### [](#修改模版工程的libcode)修改模版工程的libCode

默认工程唯一标识是ynf-ap-package-lib， 如果要修改只需要对 package.json 中的 name 进行修改即可

{

 "name": "ynf-ap-package-lib",

 "version": "1.0.0",

 "description": "组件包描述",

 "scripts": {

 "start": "ynf-scripts start --https --port=6006",

 "build": "ynf-scripts build",

 "build:dev": "ynf-scripts build --mode=development --devtool=source-map",

 "debug": "ynf-scripts server",

 "lint": "eslint --ext .jsx --ext .js --ext .tsx --ext .ts src/",

 "lint:fix": "npm run lint -- --fix"

 },

 "keywords": [

 "library"

 ],

 "license": "MIT",

 "devDependencies": {

 "@types/react": "^18.0.31",

 "@typescript-eslint/eslint-plugin": "^5.53.0",

 "@typescript-eslint/parser": "^5.53.0",

 "@yonyou/yon-extension": "^1.2.8",

 "ajv": "^8.12.0",

 "eslint": "^8.37.0",

 "eslint-config-standard": "^17.0.0",

 "eslint-plugin-import": "^2.27.5",

 "eslint-plugin-n": "^15.6.1",

 "eslint-plugin-promise": "^6.1.1",

 "eslint-plugin-react": "^7.32.2",

 "eslint-plugin-storybook": "^0.6.11",

 "eslint-webpack-plugin": "^4.0.0",

 "react": "^16.14.0",

 "react-dom": "^16.14.0",

 "ynf-dx-scripts": "1.1.8",

 "ynf-dx-webpack-plugins": "latest"

 }

}

## [](#4开发指导)4.开发指导

### [](#41如何添加组件)4.1.如何添加组件？

规范说明，组件二方包下，组件存放目录`src/comnponents`，可以采用两种方式添加组件：

- 方式一：手动创建组件，必要的文件只有`index.tsx`用来定义`React`组件、`manifest.js`用来定义当前组件的属性、事件和分组信息等等；
- 方式二：采用ynf工具自动创建`React`组件；

// 命令行执行

$ ynf add input

语言可以自定义选择

![image-20240625144251939](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240625144251939.bb6db006.jpg)

控制台日志

// 控制台日志

[1/7] 检测到执行命令中存在必要参数<libName>

[2/7] 检测到ynf.config.js文件，此操作在YNF项目根目录下执行

[3/7] 检测到二方包类型[ynf.config.js/appType/lib]

[4/7] 检测到工作目录[C:\Users\Administrator\Desktop\学习demo\nodejs\ynf-demo-lib\src\components\input]

[5/7] 解压缩内置脚手架[C:\Program Files\nodejs\node_modules\ynf-dx-cli\lib\template\ynf-dx-template-lib-component.zip]

[6/7] 替换模版变量完成

[7/7] 脚手架初始化完成

### [](#42导出组件)4.2.导出组件

组件添加并开发完成后，还需要在组件包的出口文件`src/index.ts`进行导出操作，否则并不能将新增的组件进行构建。

// src/index.ts

import Button from './components/BasicButton';

import Input from './components/input';

export {

 Button,

 Input

};

### [](#43导出组件的designerjs和自定义扩展组件)4.3.导出组件的designer.js和自定义扩展组件

src\designer.ts

// 引入组件的designer.js

import './designer/events'

// 引入自定义扩展组件

import './designer/components'

关于组件的designer.js请移步3.8

关于自定义扩展组件请移步[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080879](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080879)

### [](#44复杂业务场景应用示例)4.4.复杂业务场景应用示例

**在设计器态属性切换的时候其他属性的显示和隐藏**

案例：步骤条组件，当节点样式为默认或者箭头时，显示**是否多步骤条**属性，其他样式不显示**是否多步骤条**属性

![image-20240716103615489](data:image/png;base64,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)

![image-20240716103847170](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716103847170.dcf50e4c.png)

1.在组件目录下新建designer.js

src\components\Step\designer.js

function metaHandler({ metaItem, tplNode }) {

 const { metaProps } = metaItem;

 const baseMetaProps = (metaProps && JSON.parse(metaProps)) || {}

 const { stepType } = tplNode;

 const code=metaItem.code

 switch (code) {

 case 'more' :

 baseMetaProps.showDesign = (stepType !== 'dot' && stepType !== 'number') 

 break;

 default:

 break;

 }

 metaItem.metaProps = JSON.stringify(baseMetaProps)

 

}

if (window.yyds && typeof window.yyds.on === "function") {

 yyds.on(

 "beforeRenderPropMeta",

 (options) => {

 metaHandler(options);

 },

 {

 libCodes: ["ynf-lib-base"],

 controlTypes: ["Step"],

 }

 );

}

2.在src\designer\events\index.js引入designer.js

import '../../components/Step/designer'

具体详细的代码解释请移步[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080882](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080882)

## [](#5配置说明)5.配置说明

- libCode：资源编码，它就是资源的`ID`
- yprCode：制品编码，用于流水线制品资源唯一标识
- libCode与yprCode相同，打通ypr制品和组件中心的联系；

### [](#51packagejson)5.1.package.json

- 包描述文件，`name`字段采用`libCode`，`manifest.code`从此处自动获取：

{

 "name": "<%= libCode %>"

 ...

}

### [](#52modulexml)5.2.`module.xml`

用于出制品说明，name字段采用libCode：

<?xml version="1.0" encoding="utf-8"?>

<module name="<%= libCode %>" description="">

 <nginx_mode>ucf</nginx_mode>

</module>

### [](#53ynfconfigjs)5.3.`ynf.config.js`

关于`ynf.config.js`工程配置文件详细使用说明，请移步《[CLI工具/工程配置ynf.config.js](http://localhost:8000/guides/g01-devtool#3%E5%B7%A5%E7%A8%8B%E9%85%8D%E7%BD%AEynfconfigjs)》

### [](#54mannifestjs)5.4.`mannifest.js`

manifest.js为组件的协议配置文件，此文件可定义组件的属性和动作。

以下5.4.1、5.4.2和5.4.3的配置通用于零代码组件和低代码组件，特殊配置请参考5.4.4

const { FieldTypes, TypeProps, EditTypes, commonControlProps, UIExtClass } = require("@yonyou/yon-extension");

module.exports = {

 name: "按钮",

 code: "Button",

 icon: "lowcode lcButton",

 type: TypeProps.BasicControls,

 uiExtClass: UIExtClass.Button,

 compType: UIExtClass.Button,

 libraryGroupId: "baseGroup",

 props: [

 // ...

 ],

 events: [

 // ...

 ],

 children: [

 // ... 

 ]

}

详细协议描述如下：

||字段名称||字段类型||业务含义||说明（示例）|
||code||String||组件编码（英文）|||
||name||String||组件名称（中文）|||
||type||String||组件分类||TypeProps.LayoutContainer
TypeProps.DataContainer
TypeProps.BasicControls
TypeProps.FormControls
TypeProps.FunctionalControls
TypeProps.BusinessControls
TypeProps.InterfaceControls|
||description||String||组件描述|||
||compType||String||组件类型||UIExtClass.Container：容器
UIExtClass.Control：控件
UIExtClass.Button：按钮|
||libraryGroupId||String||分组ID|||
||props||Array||组件属性结构描述|||
||events||Array||组件事件结构描述|||

#### [](#541组件属性协议)5.4.1.组件属性协议

组件属性协议在props里面进行定义

props: [

 {

 name: "按钮大小",

 code: "size",

 defaultValue: "lg",

 metaType: "Select",

 description: '改变按钮大小'

 metaProps: {

 options: [

 { value: "lg", text: "大号按钮" },

 { value: "md", text: "中号按钮" },

 { value: "sm", text: "小号按钮" }

 ]

 })

 }

],

详细协议描述如下：

||字段名称||字段类型||业务含义||说明（示例）|
||code||String||组件属性编码（英文）|||
||name||String||组件属性名称（中文）|||
||description||String||属性描述|||
||defaultValue||跟随type属性||默认值||默认值最好配置在metaProps里面|
||metaType||String||meta类型||详见2.2.3.2|
||metaProps||Array||meta属性||针对不同metaType会有不同属性，详见2.2.3.2|

#### [](#542metatype和metaprops说明)5.4.2.metaType和metaProps说明

metaProps内的属性配置描述：

||字段名称||字段类型||业务含义||说明（示例）|
||labelCol||Number||label区域占用的栅格比例，一共为24份，**0为不显示标题**，24为占用整行|||
||help||String||帮助信息|||
||computedSet||Boolean||是否支持计算属性配置||就是在右侧可以设置mobx变量|
||defaultValueToData||Boolean||创建组件时是否将defaultValue设置到协议中|||
||objectKey||String||更新属性时是否放到特定的object属性中。||如果设置值为params，则最终属性会更新为：params: {code: 'value'}|
||*defaultValue*||*Any*||默认值只影响属性面板的展示，拖拽生成组件时并不会生成至协议。此处默认值要与组件内部的默认处理保持一致。|||
||*initValue*||*Any*||*协议属性初始值，在节点创建时会写进协议中*||优先级会比defaultValueToData高|
||emptySet||Boolean||是否支持缺省态配置||存在值时，正常展示;协议中该字段不存在，会展示缺省态UI|
||showDesign||Boolean||设计态显示与否|||

**注意**：除上述属性以外，metaProps内还支持配置对应tinperNext的组件的属性

1、**metaType为Text**，对应tinperNext组件为Input，metaProps中支持配置Input组件其所有属性，下面是设计器额外支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||isCopy||Boolean||右侧是否显示复制按钮|||

示例：

props: [

 {

 name: "测试",

 code: "test",

 metaType: "Text",

 metaProps: {

 defaultValue: ""

 }

 }

]

2、**metaType为Bool**，对应tinperNext组件为Switch，metaProps中支持配置Switch组件其所有属性

示例：

props: [

 {

 name: "测试",

 code: "test",

 metaType: "Bool"

 }

]

3、**metaType为Number**，对应tinperNext组件为InputNumber，metaProps中支持配置InputNumber组件其所有属性

示例：

props: [

 {

 name: '精度',

 code: "precision",

 metaType: "Number",

 metaProps: { min: 0, max: 20 } // 设置了精度的最大值和最小值，max和min为InputNumber组件的属性，可配置在metaProps中

 }

]

4、**metaType为Date**，根据compType属性对应tinperNext的对应组件，metaProps中支持配置其所有属性

示例：

props: [

 {

 name: '默认值', 

 code: 'defaultValue',

 metaType: "Date",

 metaProps: {

 format: 'YYYY-MM-DD' // format为DatePicker组件的属性，可配置在metaProps中，设置了默认值的日期展示格式为'YYYY-MM-DD'

 }

 }

]

5、**metaType为Time**，对应tinperNext组件为TimePicker，metaProps中支持配置其所有属性

示例：

props: [

 {

 name: '默认值', 

 code: 'defaultValue',

 metaType: "Time",

 metaProps: {

 format: 'HH:mm:ss'

 }

 }

]

6、**metaType为Radio**，对应tinperNext组件为Radio.Group，metaProps中支持配置其所有属性 ，下面是设计器额外支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||options||Array||内部枚举项|||

示例：

props: [

 {

 name: '标题位置',

 code: 'singleLine',

 metaType: "Radio",

 metaProps: {

 	 defaultValue: 'true',

 options: [

 { value: 'true', text: '左右' },

 { value: 'false', text: '上下' }

 ]

 }

]

7、**metaType为Select**，对应tinperNext组件为Select，metaProps中支持配置其所有属性 ，下面是设计器额外支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||options||Array||内部枚举项|||
||valueKey||String||枚举项value对应的字段||默认为value|
||textKey||String||枚举项显示对应的字段||默认为text|

示例：

props: [

 {

 name: '标题位置',

 code: 'singleLine',

 metaType: "Select",

 metaProps: {

 defaultValue: 'true',

 options: [

 { value: 'true', text: '左右' },

 { value: 'false', text: '上下' }

 ]

 }

 } 

]

8、**metaType为Json**，下面为metaProps中支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||disabled||Boolean||是否禁用|||
||name||String||按钮名称|||
||width||Number||弹框宽度|||
||height||Number||弹框高度|||

示例：

props: [

 {

 name: '默认值',

 code: 'defaultValue',

 metaType: "Json",

 metaProps: {

 width: 500,

 height: 500

 }

 } 

]

9、**metaType为MultiLang**，对应tinperNext组件为Input，metaProps中支置其所有属性。（目前多语右侧点击图标弹出的逻辑由设计器统一控制，暂时不支持配置，此类型配置方式与Text一致）

示例：

props: [

 {

 name: '默认值',

 code: 'defaultValue',

 metaType: "MultiLang"

 } 

]

10、**metatType为IframeModal**，下面为metaProps中支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||iframeId||String||设计器弹窗的唯一标识|||
||caption||String||弹框标题|||
||openType||String||弹框实现方式||目前仅支持function|
||funName||String||designer.js中注册的扩展组件||iuapMdd.Formula|
||width||Number||弹框宽度|||
||height||Number||弹框高度|||
||disabled||Boolean||是否禁用|||

示例：

props: [

 {

 name: '上传图片',

 code: "upload",

 metaType: "IframeModal",

 metaProps: {

 caption: '上传图片',

 funName: "iuapMdd.UploadImg",

 iframeId: "uploadImg",

 footer: true,

 width: 1000,

 openType: 'function'

 }

 }

]

自定义组件实现时props传入的属性如下：

||属性编码||属性说明||备注|
||meta||当前属性的manifest定义信息，其中定义的metaProps如果为字符串会自动转为对象|||
||currNode||当前节点协议信息|||

自定义扩展组件实现方式请移步[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080879](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33080879)

11、**metatType为Custom**，下面为metaProps中支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||funName||String||designer.js中注册的函数名||iuapMdd.Formula|

示例：

props: [

 {

 name: lang.templateByUuid('UID:P_LIB-WEB-YNF-FE_1BEB30FC0488081B', '后缀'),

 code: "suffix",

 metaType: 'Custom',

 metaProps: {

 defaultValue: "",

 funName: "ynf-lib-pro.CustomInput"

 }

 } 

]

自定义组件实现时props传入的属性如下：

||属性编码||属性说明||备注|
||meta||当前属性的manifest定义信息，其中定义的metaProps如果为字符串会自动转为对象|||
||currNode||当前节点协议信息|||

12、**metaType为Group**，表明一个分组的开始，此时仅支持code和name属性，不需要配置metaProps属性。

说明是一个分组占位，其之后的属性都将归为此分组，直到遇到第二个分组。

示例：

props: [

 {

 code: "group_base",

 name: lang.templateByUuid('UID:P_LIB-WEB-YNF-FE_1BEB30FC04880775', '基础属性'),

 metaType: "Group"

 }

 // 其余属性

 ...

]

上述例子表明其余属性都在基础属性这个分组下

**配置分组时，需要props列表中的第一个属性就是分组。**

13、**metatType为Style**，会将此属性渲染至样式面板

||字段名称||字段类型||业务含义||说明（示例）|
||styleParams||Array||样式属性下的子属性，支持内置和自定义两种方式||内置属性支持：layout、font、border、appearance、order、elasticity、rank、position、decoration|

下表为每个内置属性对应支持的样式功能

||内置属性名称||业务含义||支持的具体功能|
||appearance||尺寸||width/height/minWidth/minHeight/maxWidth/maxHeight|
||border||空间||margin/marginTop/marginRight/marginBottom/marginLeft padding/paddingTop/paddingRight/paddingBottom/paddingLeft|
||rank||排列||flexDirection/justifyContent/alignItems/overflow/flexWrap/placeContent/gap|
||order||排序|||
||elasticity||弹性||flexGrow/flexShrink/flexBasis|
||position||定位||position/top/right/bottom/left/zIndex|
||decoration||装饰||backgroundColor/backgroundImage/ borderRadius/borderTopLeftRadius/ borderTopRightRadius/borderBottomLeftRadius/ borderBottomRightRadius borderWidth/borderTopWidth/ borderRightWidth/ borderBottomWidth/ borderLeftWidth borderColor/borderTopColor/borderRightColor/borderBottomColor/borderLeftColor/borderStyle/ borderTopStyle/borderRightStyle/borderBottomStyle/borderLeftStyle/boxShadow|
||font||文字||color/ fontSize/fontWeight/justifyContent|

示例：

props: [

 {

 code: "cStyle",

 name: '日期框样式',

 metaType: "Style",

 metaProps: {

 styleParams: ["font", "decoration"]

 }

 }

]

自定义组件实现时props传入的属性如下：

||属性编码||属性说明||备注|
||meta||当前属性的manifest定义信息，其中定义的metaProps如果为字符串会自动转为对象|||
||currNode||当前节点协议信息|||
||styleProps||当前自定义组件的manifest配置信息|||

14、**metaType为UEditor**，会以弹框方式打开第三方插件UEditor，metaProps中配置如下。

||字段名称||字段类型||业务含义||说明（示例）|
||disabled||Boolean||是否禁用|||
||name||String||按钮名称|||
||width||Number||弹框宽度|||
||height||Number||弹框高度|||
||UEProps||Object||Ueditor属性||以下功能暂时无法支持：template:模板 scrawl:涂鸦 music:音乐 insertframe:插入Iframe webapp:百度应用 snapscreen:截图 map:Baidu地图 gmap:Google地图 insertvideo:视频 attachment:附件 wordimage:图片转存|

示例：

props: [

 {

 code: "showText",

 name: "显示文本",

 metaType: "UEditor",

 metaProps: {

 width: 1000

 }

 }

]

15、**metaType为CheckBox**，会展示一个复选框，功能和Switch一样，就是UI不一样。

下面为metaProps中支持的属性清单

||字段名称||字段类型||业务含义||说明（示例）|
||tip||String||提示||显示在复选框右侧|
||name||String||名称，可以写在外层||显示在最左侧|
||style||Object||样式||支持定义一些样式，如lineHeight等|
||ELSE||any||Tinper的CheckBox组件支持的属性|||

示例：

props: [

 {

 code: "showTip",

 name: "选择",

 metaType: "CheckBox",

 metaProps: {

 tip: '显示'

 }

 }

]

16、**metaType为Drawer**

||字段名称||字段类型||业务含义||说明（示例）|
||funName||String||组件的引用标识||使用方法同Custom组件|
||ELSE||any||Tinper的Drawer组件支持的属性||推荐配置的属性: drawerStyle: 配置整体样式|

示例：

props: [

 {

 code: "test",

 name: "测试",

 metaType: "Drawer",

 metaProps: {

 funName: iuapMdd.ButtonSetIcon,

 width: 400

 }

 }

]

#### [](#543组件事件协议)5.4.3.组件事件协议

events: [{

 code: "onClick",

 name: "点击",

 metaType: "Function(arg)",

 description: "按钮点击事件",

 defaultValue: ""

}]

详细协议描述如下：

||字段名称||字段类型||业务含义||说明（示例）|
||code||String||组件事件编码（英文）|||
||name||String||组件事件名称（中文）|||
||metaType||String||事件类型为函数（固定写法）||Function(arg)，Function内部的参数可根据需求配置多个|
||description||String||描述|||
||defaultValue||String||默认值|||

#### [](#544特殊协议)5.4.4.特殊协议

##### [](#5441自定义扩展组件绑定多个字段)5.4.4.1.自定义扩展组件绑定多个字段

当一个组件需要绑定多个字段时，除了通用的以外，需要在协议中配置storeFields属性，storeFields为一个数组，如果想指定绑定的字段类型，可配置属性storeFieldType，storeFieldType可选，不配置默认绑定的字段类型都为base

**注意**：storeFields和storeFieldType在创建组件时需要设置到协议中，所以需要配置defaultValueToData

||属性名||值||类型||默认值||描述、说明||支持值|
||storeFields||[ "alias1", "alias2" ]||Array||||store上字段的alias的数组|||
||storeFieldType||['type1','type2']||Array||[ "base" ]||store上字段的类型的数组||目前可选类型（后续会逐步增加）：base,number,refer,"characteristics"|

**零代码组件绑定多个字段的协议**

需要绑定几个字段，就在storeFields定义几个值，作为storeFields的默认值

示例：比如开发一个日期范围组件，需要绑定两个字段，开始日期和结束日期，则storeFields中包含两个值

{

 name: "storeFields",

 code: "storeFields",

 metaType: EditTypes.Json,

 metaProps: {

 defaultValue: ['startDateStoreField', 'endDateStoreField'],

 defaultValueToData: true,

 showDesign: false // 不在设计器属性面板展示，如需展示，可改为true

 }

},

{

 name: "storeFieldType",

 code: "storeFieldType",

 metaType: EditTypes.Json,

 metaProps: {

 defaultValue: ["base", "base"],

 defaultValueToData: true,

 showDesign: false // 不在设计器属性面板展示，如需展示，可改为true

 }

}

**低代码组件绑定多个字段的协议**

与零代码配置方式一致，区别点在于需要绑定几个字段，storeFields的默认值还是[]

{

 name: "storeFields",

 code: "storeFields",

 metaType: EditTypes.Json,

 metaProps: {

 defaultValue: [],

 defaultValueToData: true,

 showDesign: false // 不在设计器属性面板展示，如需展示，可改为true

 }

},

{

 name: "storeFieldType",

 code: "storeFieldType",

 metaType: EditTypes.Json,

 metaProps: {

 defaultValue: ["base", "base"],

 defaultValueToData: true,

 showDesign: false // 不在设计器属性面板展示，如需展示，可改为true

 }

}

具体详细介绍请移步[https://gfwiki.yyrd.com/pages/resumedraft.action?draftId=69920185&draftShareId=386e7731-e5a3-4ac2-8c58-b4caa01917e8&](https://gfwiki.yyrd.com/pages/resumedraft.action?draftId=69920185&draftShareId=386e7731-e5a3-4ac2-8c58-b4caa01917e8&)

### [](#55mannifestjs本地代理调试)5.5.`mannifest.js`本地代理调试

组件开发时，每次更改mannifest后，都要提交代码部署，然后去资源中心更新对应的组件包，非常麻烦。在此提供一种便捷的全属性调试功能，适用于调试组件的各种属性。

具体请移步[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=63802322](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=63802322)

## [](#6产物制品地址说明)6.产物制品地址说明

### [](#61designerjs)6.1.`designer.js`

设计器脚本，用于注入关于设计器相关的逻辑

- `${YMS_HOST}/${libCode}/ucf-wh/designer.js`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/designer.js`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/designer.js

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/designer.js

### [](#62readmemd)6.2.`README.md`

工程说明文档，用以说明工程配置、使用说明、能力提供、对外接口等等

- `${YMS_HOST}/${libCode}/ucf-wh/README.md`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/README.md`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/README.md

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/README.md

### [](#63二方包入口)6.3.二方包入口

目前，所有的二方包入口都是以`libCode`命名，并且经过大驼峰规范转化命名

- `${YMS_HOST}/${libCode}/ucf-wh/${pascalCase(libCode)}.js`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/${pascalCase(libCode)}.js`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/YnfIuapBasicLib.js

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/YnfIuapBasicLib.js

### [](#64versionjson)6.4.`version.json`

产物制品构建版本信息

- `${YMS_HOST}/${libCode}/ucf-wh/version.json`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/version.json`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/version.json

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/version.json

## [](#7文档建设)7.文档建设

### [](#71maifestjson)7.1.`maifest.json`

- `dist/manifest.json`文件是用来描述整个组件包的结构和关系，包括组件分组关系、属性介绍、从属关系等等，其生成过程就是一个总分结构的合并过程，组成结构如下：

总：src/manifest.js；
- 分：[ src/components/[组件code1]/manifest.js, ... ]

### [](#72maifestmd)7.2.`maifest.md`

`dist/manifest.md`的生成过程是通过解析`manifest.json`自动获得的，用以文档形式说明`manifest.json`。

### [](#73maifestlog)7.3.`maifest.log`

在`src/manifest.js` 同目录会生成`manifest.log`文件，用以生成`manifest.json`文件的检验信息，并标明错误等级，通常[error]类型问题必须修改，[warn]类型问题不会形成致命错误，最好也要处理，校验过程不会中断构建进程。

## [](#8部署流程)8.部署流程

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/ynf-comp-deploy.bffa0c35.png)

### [](#81git代码提交)8.1.`git`代码提交

本地代码更新，将更新提交到`git`代码仓库

### [](#82执行devops流水线)8.2.执行`devOps`流水线

流水线执行部署，在部署服务器上执行`npm run build`构建命令

- 问题一：如何创建流水线？

请查看文档《[统一Nginx](https://docs.yonyoucloud.com/l/E84eFecEB891?locale=zh_CN)》

### [](#83ypr制品)8.3.YPR制品

`YPR`制品用来实现给专属化环境打补丁前的操作，相当于将构建资源转化成`YPR`制品用来出专属化的补丁

### [](#84上传ossobscdn)8.4.上传OSS/OBS/CDN

流水线执行阶段实现上传`OBS/OSS/CDN`，并通过统一Nginx部署到流水线对应的环境，实现资源的自动部署和更新。

// 二方包入口

${YMS_HOST}/${libCode}/ucf-wh/${pascalCase(libCode)}.js

${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/${pascalCase(libCode)}.js

### [](#85资源中心发布)8.5.资源中心发布

如果是组件二方包，还需要发布到组件注册中心即资源中心管理平台，填写必要信息选择对应流水线构建产出，完成发布即可在单据设计器中使用。

- 问题一：如何在资源中心发布资源？

工作台 >> 资源中心 >> 组件库 >> 新建 >> 填写libCode >> 选择构建版本 >> 发布

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/libray-center-publish.ecf79b5b.png)

## [](#9其他)9.其他

### [](#91writemanifestplugin)9.1.WriteManifestPlugin

自定义`webpack`插件，主要用来处理`manifest`相关的文档生成和转化工作，包括合并`manifest.json`、转换文档`manifest.md`、解析生成`manifest.log`等，`build`构建模式下自动处理，使用方式如下：

const { WriteManifestPlugin } = require('ynf-dx-webpack-plugins');

new WriteManifestPlugin({

 srcPath: path.join(__dirname, 'src'),

 distPath: path.join(__dirname, 'dist'),

})

### [](#92国际化支持)9.2.国际化支持

注：多语使用202304期间新多语方式，支持实时翻译

- 在项目目录下执行`ynf translate`，命令自动读取`ynf.config.js`下的`muitiLangGroupCode`字段，获得多语编码，并将代码翻译
- 如果使用`ynf-core-loader`，可以自动发送多语请求
- 如果在`module.xml`依赖，需要手动发送多语请求

## [](#10commontranslator)10.CommonTranslator

CommonTranslator是将零代码协议转换成低代码协议的核心工具，负责解析零代码NCP协议，通过一定规则，转换成低代码PC列表和详情、移动端列表和详情等使用协议。
在Translator中，我们配置了以下关键信息：

- 组件类型映射：将零代码组件类型与低代码组件类型进行映射
- 属性转换规则：定义了从PC端属性到移动端属性的转换逻辑

### [](#默认转换)默认转换

Translator默认转换规则将零代码属性配置转换成低代码属性，组件库默认使用ynf-lib-base-mobile、ynf-lib-base, 零代码组件编码按照特定规则转换成零代码组件编码。

#### [](#默认配置)默认配置

{ name: '按钮', // 组件名称

code: "NocButton", // 组件编码

props: [ // 组件属性

 {

 code: "caption",

 defaultValue: "",

 name: '标题',

 showDesign: true,

 type: FieldTypes.string

 },

 ...

 ]

 }

#### [](#属性说明)属性说明

||**参数**||**子参数**||**类型**||**说明**|
||code||||String||组件编码|
||name||||String||组件名称|
||props||code||String||属性编码|
||||name||String||属性名称|
||||metaProps||Object||meta属性|
||||type||meta属性||属性类型|
||||defaultValue||Any||属性默认值|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/mind_default.f20a551e.jpeg)

### [](#特殊转换)特殊转换

Translator根据特殊转换规则将零代码配置转换成低代码属性，组件库和组件编码使用配置参数。

#### [](#特殊属性配置规则)特殊属性配置规则

{ name: '按钮', // 组件名称

code: "NocButton", // 组件编码

extProps: JSON.stringify({

 bizType: "image",

 translator: {

 type: "class",

 name: "com.yonyou.iuap.yonbuilder.ncp.template.translators.CommonTranslator",

 params: {libCode: "ynf-fw-apcom-lib", controlType: "PictureUpload"},

 mobileParams: {style: {color: '#111',fontSize: '0.3rem'}}

 }

 })

 }

#### [](#特殊属性说明)特殊属性说明

||**参数**||**子参数**||**说明**||**值**|
||bizType||||运行时默认数据格式||text文本、multiLanuage多语、quote参照 ...|
||translator||type||转换类型||macro 宏、class 类|
||||name||名称||NocReferInputTranslator 宏名称、com....CommonTranslator 类名称|
||||params||通用参数||libCode 库名称、controlType组件名称|
||||mobileParams||移动端参数|||

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/yuque_mind_other.4f9a8615.jpeg)