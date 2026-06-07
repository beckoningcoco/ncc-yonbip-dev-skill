---
title: "专业版开发"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-extend-page"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 专业版开发

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-extend-page | 所属：YNF-开发指南

# [](#专业版开发)专业版开发

`YNF`应用扩展是针对`yonbuilder`单据进行页面级业务逻辑扩展开发。`ynf init`指令创建的时候可以创建前端业务应用类型的二方包

## [](#1规范说明)1.规范说明

### [](#11工程目录说明)1.1.工程目录说明

├── dist # 构建产物

├── src # 源码目录

│ ├── assets # 静态资源

│ ├── components # 组件目录

│ ├── pages # 扩展页面

│ │ ├── ${BillNo}

│ │ │ ├── components # 组件目录

│ │ │ ├── services # 接口处理

│ │ │ ├── stores # store目录

│ │ │ │ ├── ext # 扩展脚本

│ │ │ │ └── gen # 【基于协议生成】Store目录

│ │ │ ├── utils # 工具

│ │ │ ├── index.ts # 页面入口

│ │ │ ├── extend.ts # 页面扩展入口

│ │ │ ├── template.json # UI模版协议

│ ├── services # 接口处理

│ ├── utils # 工具

│ ├── designer.ts # 设计器脚本入口文件

│ ├── index.ts # 组件包入口文件

│ └── manifest.js # 组件包manifest描述

├── README.md

├── module.xml

├── ynf.config.js # 项目配置文件

└── package.json

### [](#12扩展页面目录说明)1.2.扩展页面目录说明

├── ${BillNo} # 扩展页面，规范是以BillNo命名

│ ├── components # 组件目录

│ ├── services # 接口处理

│ ├── stores # store目录

│ │ ├── ext # 扩展脚本

│ │ │ ├── GenActions.ts # Action扩展脚本

│ │ │ ├── GenReactions.ts # Reaction扩展脚本

│ │ │ ├── GenRootStore.ts # RootStore扩展脚本

│ │ │ └── GenStore.ts # 自定义Store扩展脚本

│ │ └── gen # 【基于协议生成】Store目录

│ ├── utils # 工具

│ ├── index.ts # 页面入口

│ ├── extend.ts # 页面扩展入口

│ └── template.json # UI模版协议

### [](#13命令说明)1.3.命令说明

#### [](#131npm-run-build)1.3.1.`npm run build`

说明：构建命令，用于构建资源，默认情况下：资源输出目录 `ROOT/dist/`、mode=production、devtool=false，可通过 `ROOT/ynf.config.js`工程配置文件进行修改，或者通过命令行参数形式进行修改

#### [](#132npm-run-builddev)1.3.2.`npm run build:dev`

说明：作用同 `npm run build`，这是系统开发模式的快捷方式，通过初始化开发模式的参数实现：mode=development、devtool=cheap-module-source-map

#### [](#133npm-run-start)1.3.3.`npm run start`

说明：调试命令，本地通过webpack-dev-server开启服务、实时编译资源，该模式下可通过设置资源代理联调相应环境，访问方式：`http://localhost:[port]/index.js`

- 代理调试设置，如果是 `CDN`地址：[https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/*/**](https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/*/**)[https://localhost:9090/**](https://localhost:9090/**)
- 代理调试设置，如果是 `YMS`地址：
[https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/**](https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/**)[https://localhost:9090/](https://localhost:9090/)**

## [](#2开发指导)2.开发指导

### [](#21准备开发工具)2.1.准备开发工具

// 1.全局安装ynpm工具

npm install ynpm-tool -g

// 2.全局安装ynf-dx-cli工具

ynpm install ynf-dx-cli -g

### [](#22准备资源编码-libcode)2.2.准备资源编码 `libCode`

资源编码 `libCode`非常重要，它就是资源的 `ID`，它贯穿了整个开发、流水线部署、资源中心发布、CDN访问等等过程，编码规范：`ynf-${domainKey}`，定义方式请参考《》，例如：ynf-yonbip-ec-contract

### [](#23采用-ynf命令行工具初始化组件二方包脚手架)2.3.采用 `ynf`命令行工具初始化组件二方包脚手架

关于 `ynf-dx-cli`开发工具的详细使用说明，请移步《》

- 查看 `ynf`命令行工具使用说明

// 命令行执行

$ ynf init app --help

 Usage: ynf init [command] [libCode] [options]

 Options:

 -h, --help 查看帮助文档

 -V, --version 查看版本信息

 Commands:

 app [libCode] 初始化应用二方包脚手架

 lib [libCode] 初始化组件二方包脚手架

 sdk [libCode] 初始化SDK二方包脚手架

- 使用 `ynf`命令行工具初始化 `SDK`二方包脚手架

// 命令行执行

$ ynf init app ynf-demo-app

// 控制台日志

[1/6] 接收参数：{"libType":"app","libCode":"ynf-demo-app"}

[2/6] 检测到工作目录[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app]

Cloning into 'ynf-dx-template-app-template'...

[3/6] git clone -b template git@git.yonyou.com:ynf/ynf-dx-template-app.git

[4/6] 移除.git版本控制文件[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app/.git]

[5/6] 移动脚手架从临时目录到[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app] [

 '.eslintignore', '.eslintrc.js',

 'README.md', 'htmls/index.html',

 'htmls', 'jest.config.js',

 'module.xml', 'package.json',

 'src/actions/README.md', 'src/actions/index.ts',

 'src/actions', 'src/assets/.gitkeep',

 'src/assets', 'src/declares.d.ts',

 'src/pages/.gitkeep', 'src/pages',

 'src/services/index.ts', 'src/services',

 'src', 'tests/index.test.ts',

 'tests', 'tsconfig.json',

 'ynf.config.js'

]

[6/6] 脚手架初始化完成

### [](#24使用-ynpm安装项目依赖)2.4.使用 `ynpm`安装项目依赖

// 命令行执行

$ ynpm install

### [](#25如何添加扩展页面)2.5.如何添加扩展页面？

规范说明，应用扩展二方包下，页面扩展存放目录 `src/pages`，可以采用 `ynf add`添加扩展页面：

// 命令行执行

$ ynf add clmContractList

// 控制台日志

[1/8] 检测到执行命令中存在必要参数<libName>

[2/8] 检测到ynf.config.js文件，此操作在YNF项目根目录下执行

[3/8] 检测到二方包类型[ynf.config.js/appType/app]

[4/8] 检测到工作目录[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app/src/pages/clmContractList]

Cloning into 'ynf-dx-template-app-template-page'...

[5/8] git clone -b template-page git@git.yonyou.com:ynf/ynf-dx-template-app.git

[6/8] 移除.git版本控制文件[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app/src/pages/clmContractList/.git]

[7/8] 移动脚手架从临时目录到[/Users/rongqb/yonyou/ynf-demos/ynf-demo-app/src/pages/clmContractList] [

 'DynamicView.tsx',

 'bootstrap.extend.ts',

 'bootstrap.ts',

 'components/gen/App.tsx',

 'components/gen/Libs.tsx',

 'components/gen',

 'components/index.ts',

 'components',

 'extend.ts',

 'index.tsx',

 'render.tsx',

 'services/index.ts',

 'services',

 'stores/ext/.gitkeep',

 'stores/ext/GenActions.ts',

 'stores/ext/GenReactions.ts',

 'stores/ext/GenRootStore.ts',

 'stores/ext/GenStore.ts',

 'stores/ext',

 'stores/gen/RootStore.ts',

 'stores/gen',

 'stores',

 'template.json'

]

[8/8] 脚手架初始化完成

## [](#3配置说明)3.配置说明

- libCode：资源编码，它就是资源的 `ID`
- yprCode：制品编码，用于流水线制品资源唯一标识
- libCode与yprCode相同，打通ypr制品和组件中心的联系；

### [](#31packagejson)3.1.package.json

- 包描述文件，`name`字段采用 `libCode`，`manifest.code`从此处自动获取：

{

 "name": "<%= libCode %>"

 ...

}

### [](#32modulexml)3.2.`module.xml`

用于出制品说明，name字段采用libCode：

<?xml version="1.0" encoding="utf-8"?>

<module name="<%= libCode %>" description="">

 <nginx_mode>ucf</nginx_mode>

</module>

### [](#33ynfconfigjs)3.3.`ynf.config.js`

关于 `ynf.config.js`工程配置文件详细使用说明，请移步《》

## [](#4产物制品地址说明)4.产物制品地址说明

### [](#42readmemd)4.2.`README.md`

工程说明文档，用以说明工程配置、使用说明、能力提供、对外接口等等

- `${YMS_HOST}/${libCode}/ucf-wh/README.md`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/README.md`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/README.md

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/README.md

### [](#43二方包入口)4.3.二方包入口

目前，所有的二方包入口都是以 `libCode`命名，并且经过大驼峰规范转化命名

- `${YMS_HOST}/${libCode}/ucf-wh/${pascalCase(libCode)}.js`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/${pascalCase(libCode)}.js`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/YnfIuapBasicLib.js

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/YnfIuapBasicLib.js

### [](#44versionjson)4.4.`version.json`

产物制品构建版本信息

- `${YMS_HOST}/${libCode}/ucf-wh/version.json`
- `${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/version.json`

示例：

https://bip-test.yyuap.com/ynf-iuap-basic-lib/ucf-wh/version.json

https://design.yonyoucloud.com/static/ucf/ynf-iuap-basic-lib/20230404-202811/version.json

## [](#5部署流程)5.部署流程

### [](#51git代码提交)5.1.`git`代码提交

本地代码更新，将更新提交到 `git`代码仓库

### [](#52执行-devops流水线)5.2.执行 `devOps`流水线

流水线执行部署，在部署服务器上执行 `npm run build`构建命令

- 问题一：如何创建流水线？

请查看文档《[统一Nginx](https://yundoc.yonyou.com/view/l/thww06c)》

### [](#53ypr制品)5.3.YPR制品

`YPR`制品用来实现给专属化环境打补丁前的操作，相当于将构建资源转化成 `YPR`制品用来出专属化的补丁

### [](#54上传ossobscdn)5.4.上传OSS/OBS/CDN

流水线执行阶段实现上传 `OBS/OSS/CDN`，并通过统一Nginx部署到流水线对应的环境，实现资源的自动部署和更新。

// 二方包入口

${YMS_HOST}/${libCode}/ucf-wh/${pascalCase(libCode)}.js

${CDN_HOST}/static/ucf/${libCode}/${buildVersion}/${pascalCase(libCode)}.js

## [](#qa)Q&A

## [](#参考)参考

- [统一Nginx](https://yundoc.yonyou.com/view/l/thww06c)
- 
- 
- 
- [manifest属性及样式面板配置指南](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=22542653)