---
title: "YNF开发者工具介绍"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g014-devtool"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# YNF开发者工具介绍

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g014-devtool | 所属：YNF-介绍

# [](#ynf开发者工具介绍)YNF开发者工具介绍

简介：YNF DX开发者工具主要用于实现YNF前端开发云+端一体化的开发体验，实现开发全流程。YNF DX开发者工具提供两个npm模块，并发布到YNPM镜像管理。

## [](#1ynf-dx-cli)1.ynf-dx-cli

简介：用于人机交互的命令行工具，帮助开发者快速新建YNF前端业务应用、前端组件库、前端SDK等场景化的前端标准工程。

主页：[https://package.yonyoucloud.com/package/detail/ynf-dx-cli](https://package.yonyoucloud.com/package/detail/ynf-dx-cli)

### [](#11安装)1.1.安装

// 1.全局安装ynpm工具

npm install ynpm-tool -g

// 2.全局安装ynf-dx-cli工具

ynpm install ynf-dx-cli -g

### [](#12命令说明)1.2.命令说明

ynf [ -v | -V | --version ] 查看版本信息

ynf [ -h | --help ] 查看帮助文档 

ynf [command] [options]

 Options:

 -h, --help 查看帮助文档

 -V, --version 查看版本信息

 Commands:

 init [libType] [libCode] 初始化二方包脚手架

 add <libName> 创建组件或者页面扩展

 translate 国际化翻译

 gen 在应用二方包根目录下，生成静态化

ynf init [command] [libCode] [options]

 Options:

 -h, --help 查看帮助文档

 -V, --version 查看版本信息

 Commands:

 app [libCode] 初始化应用二方包脚手架

 lib [libCode] 初始化组件二方包脚手架

 sdk [libCode] 初始化SDK二方包脚手架

ynf add <libName> [options]

 Options:

 -h, --help 查看帮助文档

 -V, --version 查看版本信息

 libNames:

 billNo 在应用二方包根目录下，创建对应billNo的页面

 componentName 在组件二方包根目录下，创建组件的名称

ynf translate 国际化翻译

ynf gen 在应用二方包根目录下，生成静态化

## [](#2ynf-dx-scirpts)2.ynf-dx-scirpts

简介：用于不同场景的前端资源的开发调试和资源构建，主要实现为对webpack等工具和配置的收敛管理和浅封装。

主页：[https://package.yonyoucloud.com/package/detail/ynf-dx-scripts](https://package.yonyoucloud.com/package/detail/ynf-dx-scripts)

### [](#21安装)2.1.安装

注意：通常，我们采用ynf-dx-cli命令行工具进行项目的初始化工作，该种情况下，ynf-dx-scripts开发工具默认集成在初始化在脚手架内，不必显示的安装。

// 1.全局安装ynpm工具

npm install ynpm-tool -g

// 2.安装ynf-dx-scripts工具

ynpm install ynf-dx-scripts --save-dev

### [](#22命令说明)2.2.命令说明

ynf-scripts -v 查看当前安装版本

ynf-scripts [-h|--help] 查看帮助 

ynf-scripts [command] [options]

 Commands:

 build 资源构建

 server 开启本地调试服务，实时编译资源

 Options:

 --mode 配置：webpack.mode，默认：production（build），development（server）

 --devtool 配置：webpack.devtool，默认：source-map（build），eval-source-map（server）

 --devServer 配置：webpack.devServer

 --port 配置：webpack.devServer.port

 --bundleAnalyzer 配置是否开启webpack-bundle-analyzer插件

## [](#3工程配置ynfconfigjs)3.工程配置ynf.config.js

使用ynf-dx-cli里的ynf init指令可以创建一个二方包，创建二方包之后，最外层文件夹下就有ynf.config.js

/**

 * argv = process.argv

 * env = process.env

 * */

module.exports = ({ argv, env, cmd }) => {

 return {

 appType: 'sdk', // 应用类型: [lib、sdk、app], 默认: lib

 tnsCfg: { // TNSClientPlugin插件配置

 enable: true, // 是否开启TNSClientPlugin, 默认: true

 providerPackage: 'ynf-core-engine', // 包名，默认：package.name

 providerEntry: { // 提供方导出声明

 './': 'src/index',

 './axios': './src/axios/index'

 },

 providerGlobal: { // 国际化相关配置

 langGroupCode: 'YS_FED_CORE-YNF-FE'

 }

 },

 babelPresets: [], // babel presets

 babelPlugins: [], // babel plugins

 cssLoaderOptions: {}, // CSS loader 控制选项

 lessLoaderOptions: {}, // Less loader 控制选项

 urlLoaderOptions: {}, // URL loader 控制选项

 globalEnv: { // 全局环境变量

 // GROBAL_HTTP_CTX: JSON.stringify("/iuap_demo")

 },

 alias: { // 别名, webpack.alias

 // '@assets': path.resolve(__dirname, 'src/assets')

 },

 externals: { // 构建排除指定包, webpack.externals

 // react: 'React'

 },

 multilangConfig: { // 国际化相关配置

 productline: 'YS', // 产品线标识

 domain: 'FED', // 领域标识

 project: 'CORE-YNF-FE' // 项目标识

 },

 devServer: { // webpack.devServer

 // port: 9090, // 默认: 9090

 headers: {}, // webpack.devServer.headers

 proxy: [ // webpack.devServer.proxy

 {

 // 要代理访问的对方路由

 context: ['/iuap-tns'],

 target: `https://bip-test.yyuap.com`,

 changeOrigin: true

 }

 ]

 },

 loader: [], // 加载器Loader, webpack.module.rules

 devPlugins: [], // 调试服务需要运行的插件

 buildPlugins: [], // 构建服务需要运行的插件

 }

}

### [](#31配置扩展规则)3.1.配置扩展规则

- 规则一：配置项值类型为Array、Object等，如果用户配置与默认配置值类型不相同，那么采用覆盖式，否则采用合并式，用户配置优先级高，例如：{ ...defaultConfig, ...userConfig }；
- 规则二：配置项值类型为Function即为configHook，内部通过hook的参数传递默认配置值，用户接收到默认配置，自行整理，通过返回值的形式决定合并、覆盖、扩展、删除某项等等操作，如没有返回值，那么继续采用默认配置值；
- 规则三：配置项值类型为除上述三种类型外，那么采用覆盖式原则，例如：userConfig ?? defaultConfig；

### [](#32confighook)3.2.configHook

ynf.config.js 根目录下的配置选项可以写成configHook函数，主要用于用户获取系统内部默认配置信息，内部通过hook的函数参数传递默认配置值，用户接收到默认配置，自行整理，通过返回值的形式决定合并、覆盖、扩展、删除某项等等操作，如没有返回值，那么继续采用默认配置值。

Example1:

// 通常的配置

alias: { // 别名, webpack.alias

 '@assets': path.resolve(__dirname, 'src/assets')

}

// configHook

// 1.默认式，无返回值

alias (defaultAlias) {

 // return 

}

// 2.覆盖式，自定义返回值

alias (defaultAlias) {

 return {

 '@assets': path.resolve(__dirname, 'src/assets')

 }

}

// 3.扩展式，继承默认值并添加自定义返回值

alias (defaultAlias) {

 return {

 ...defaultAlias,

 '@assets': path.resolve(__dirname, 'src/assets')

 }

}

Example2:

// 通常的配置

appType: 'lib'

// configHook

appType (defaultAppType) {

 return 'lib'

}

Example3:

// 通常的配置

buildPlugins: [

 new WriteManifestPlugin({

 srcPath: path.join(__dirname, 'src'),

 distPath: path.join(__dirname, 'dist')

 })

]

// configHook

buildPlugins (defaultPlugins) {

 return [

 ...defaultPlugins,

 new WriteManifestPlugin({

 srcPath: path.join(__dirname, 'src'),

 distPath: path.join(__dirname, 'dist')

 })

 ]

}

### [](#33配置优先级从上到下优先级递减)3.3.配置优先级（从上到下优先级递减）

- 命令行（仅部分配置支持，mode、devtool、port、env）

npm run build -- --mode=development --devtool=source-map

- package.json >> scripts

"scripts": {

 "build": "ynf-scripts build --mode=development --devtool=source-map"

 // ...

},

- ynf.config.js

mode: 'development',

devtool: 'source-map'

## [](#qa)Q&A

- ynf translate 执行报错，该如何处理？

目前要求执行translate命令node版本不高于18，请检查node版本，该问题会在后续版本中得到改善

## [](#参考)参考

- ynf-dx-cli：[https://package.yonyoucloud.com/package/detail/ynf-dx-cli](https://package.yonyoucloud.com/package/detail/ynf-dx-cli)
- ynf-dx-scripts：[https://package.yonyoucloud.com/package/detail/ynf-dx-scripts](https://package.yonyoucloud.com/package/detail/ynf-dx-scripts)
- 《YNF二方包管理及接入指南》[https://docs.yonyoucloud.com/l/77c3ca1ecb16](https://docs.yonyoucloud.com/l/77c3ca1ecb16)