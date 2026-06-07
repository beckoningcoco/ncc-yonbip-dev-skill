---
title: "MDF 4.1脚手架升级指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-cli41-upgrade"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF 4.1脚手架升级指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-cli41-upgrade | 所属：介绍

# [](#mdf-41脚手架升级指南)MDF 4.1脚手架升级指南

MDF4.1脚手架是MDF推出的最新版本的脚手架，较3.0增加Webpack5、TNS、Tinper-Next和组件中心4块主要功能。

## [](#1-更新说明)1. 更新说明

### [](#11-目标)1.1. 目标

- 统一前端基础组件库、统一三方包，降低资源加载
- 统一组件中心管理，实现组件共享

### [](#12-重点更新)1.2. 重点更新

- Webpack升级到了Webpack5.x版本
- 接入了统一三方包TNS
- 接入了Tinper-Next
- 适配YMS配置
- 脚手架公共化，抽取脚手架公共的部分到**@mdf/create-app**

## [](#2-脚手架介绍)2. 脚手架介绍

### [](#21-脚手架获取)2.1. 脚手架获取

MDF4.1脚手架：[脚手架](http://git.yyrd.com/yonyou-mdf/mdf-server-app)（master分支）

**注意：**

**一定别忘修改下项目package.json里面name的值
比如基本档案：yonbip-xxx-xxx（微服务编码） 避免和别的领域重复**

### [](#22-目录说明)2.2. 目录说明

lang 多语抽取工具包

src 源码

--business 扩展脚本

--client 客户端源码

----common

------biz 扩展biz actions

------redux 扩展redux actoins

----mobile 

------components 扩展组件

------redux 扩展reducers

------routes 扩展路由

------styles 扩展样式

------index.jsx

----web 

------components 扩展组件

------redux 扩展reducers

------routes 扩展路由

------styles 扩展样式

------index.jsx 

----mobile.js mobile打包入口

----web.js web打包入口

--common 公共源码

----config.env.js 领域环境配置

static 静态资源

babel.config.js 个性化babel配置

package.json 

webpack.config.js 个性化webpack配置

## [](#3-升级指导)3. 升级指导

原工程迁移是指将旧工程中有用的内容往新脚手架上迁移

- 优点是：简化工程、结构更清晰、不易出错和遗漏
- 缺点是：会丢失commit信息

- 为防止丢失commit信息，可以新建一个分支，把文件全部删除，再拷贝新脚手架全部文档过来，再把原工程有用的文件拷贝到新目录结构对应的位置
- 迁移只需要关注src/business、src/client目录和config.env.js文件中后端服务地址的配置（通常用于本地调试）

### [](#31-迁移扩展脚本)3.1. 迁移扩展脚本

将原工程中的business目录拷贝到新脚手架src/business目录

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDF41jiaoshoujiashengjizhinan_image1.ddb50ec1.png)

### [](#32-迁移扩展组件)3.2. 迁移扩展组件

把有用的组件迁移到src/client/web/components目录，按现有目录或自建目录分类存放

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDF41jiaoshoujiashengjizhinan_image2.6b9dfdf2.png)

### [](#33-迁移其它内容)3.3. 迁移其它内容

- 把扩展的样式迁移到styles目录下（迁移时随便检查扩展样式是否做了领域隔离，即在样式最外层包了一层domainKey）
- 把其它如redux、routes迁移到对应的目录下（极少有领域对此扩展，稍微关注即可）
- 原工程中有大量无用的文件确认没用后都可以删除，如：static\ueditor、webpack.support*.js、manifest*.json

### [](#34-迁移重点关注)3.4. 迁移重点关注

- 基础组件与MDF组件的主要区别是MDF组件和编程模型结合了，使用MDF组件需要new模型传入。
- 以下关注内容可以降低包大小，减少资源重复加载。

#### [](#341-pc端)3.4.1. PC端

// 基础组件引入方式（Tinper-Next）

const { Form, Button, Card } = window.TinperNext;

 

// MDF组件引入方式

const { TreeRefer, Label, Input } = require('mdf-metaui-web').basic;

 

// 脚本依赖

const { setMode, getWebUrl } = viewmodel.biz.action().common;

import { toggleLoadingStatus } = '@mdf/metaui-web/lib/redux/loading';

// 替换为

const { toggleLoadingStatus } = require('mdf-metaui-web').actions.loading;

 

import SvgIcon from 'SvgIcon'

// 替换为

const { SvgIcon } = require('mdf-metaui-web').common;

#### [](#342-移动端)3.4.2. 移动端

// 基础组件引入方式

const { Button, DatePicker } = window.BaseuiMobile;

 

// MDF组件引入方式

const { Refer, Input } = require('mdf-metaui-mobile').basic;

 

// 脚本依赖

const { setMode, getWebUrl } = viewmodel.biz.action().common;

import Icon from 'SvgIcon'

// 替换为

const { SvgIcon } = require('mdf-metaui-mobile').common;

## [](#4-webpack配置)4. Webpack配置

### [](#41-默认配置)4.1. 默认配置

默认情况下不需要修改Webpack配置，默认配置如下：

const common = require('@mdf/create-app/lib/webpack.common');

const parts = require('@mdf/create-app/lib/webpack.parts');

 

const configEnv = require("./src/common/config.env");

 

const domainDefine = parts.domainDefine({

 domainKey: configEnv.DOMAIN_KEY // 领域domainKey

})

 

module.exports = parts.uniquePlugin(common, domainDefine)

### [](#42-webpack配件api)4.2. Webpack配件API

除了上一章节默认配置之外框架提供了Webpack
Parts配件机制，目前支持配件有：

#### [](#421-输出配件)4.2.1. 输出配件

const domainDefine = parts.domainDefine({

 domainKey: configEnv.DOMAIN_KEY, // 领域domainKey

 defines: { // 领域自定义变量

 'process.env.__DEFINE1__': '变量1' // 示例

 },

 // enableTNS: false, // 关闭TNS

 // enableMobile: false, // 关闭移动端

 // tnsOptions: { libraryEnv: 'online', ...其它TNS支持的参数 } // TNS参数

 // extStanProEntry: { entry1: 'https//:xx.js' } // 扩展entry入口

})

#### [](#422-tns配件)4.2.2. TNS配件

const pluginTNS = parts.pluginTNS({

 libraryEnv: 'online', // TNS环境，详见TNS文档，默认值 ''

 excludeModules: ['redux', 'react-redux'], // 不被TNS替换的三方包清单，默认值 无

 ... // 其它TNS支持的参数

})

#### [](#423-module-loader配件)4.2.3. Module Loader配件

const moduleLoader = parts.moduleLoader({

 reg: /\.less/, // loader匹配正则

 use: ['less-loader'], // loader名称

 include: '', // 包含目录

 exclude: '' // 排除目录

})

#### [](#424-其它配置更新)4.2.4. 其它配置更新

const common = require('@mdf/create-app/lib/webpack.common');

const parts = require('@mdf/create-app/lib/webpack.parts');

 

const configEnv = require("./src/common/config.env");

 

const domainDefine = parts.domainDefine({

 domainKey: configEnv.DOMAIN_KEY // 领域domainKey

})

 

const config = {

 optimization: {

 chunkIds:'named', // 拆包命名规则

 moduleIds:'named', // 模块命名规则

 splitChunks: {

 minSize: 1024 * 8 * 800, // 最小拆包大小

 chunks: 'initial' // 拆分类型

 }

 },

 performance: {

 maxEntrypointSize: 10000000, // 资源限制配置

 maxAssetSize: 30000000 // 资源限制配置

 },

 ... // 其它Webpack支持的参数，最好了解一下框架有没有默认，是否适合添加到框架默认中

}

 

module.exports = parts.uniquePlugin(common, domainDefine, config)

#### [](#425-修改端口)4.2.5. 修改端口

**可以通过在命令中添加SCRIPT_PORT=3005参数修改端口**，通过devServer.port修改不行

"debug:extend": "cross-env BABEL_ENV=production NODE_ENV=development SCRIPT_PORT=3005 MDF_LANG=true webpack serve --progress --config webpack.config.js",

## [](#5-参考文档)5. 参考文档

[《统一前端三方包TNS接入指南》](https://docs.yonyoucloud.com/l/4cde7dc9E79f)