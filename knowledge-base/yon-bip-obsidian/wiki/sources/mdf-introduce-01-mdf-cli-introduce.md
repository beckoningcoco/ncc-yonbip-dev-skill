---
title: "前端脚手架介绍 ☆"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/01-mdf-cli-introduce"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 前端脚手架介绍 ☆

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/01-mdf-cli-introduce | 所属：介绍

# [](#前端脚手架介绍-)前端脚手架介绍 ☆

## [](#1-使用文档)1. 使用文档

- 新工程请使用此[《MDF脚手架》](#/introduce/01-mdf-cli-introduce)

## [](#2-开始准备)2. 开始准备

### [](#21-安装)2.1. 安装

- 需要安装ynpm工具使用内网镜像源进行安装私有包@mdf/xxx

$ npm install ynpm-tool -g

- 内网执行ynpm install安装即可

$ ynpm install

### [](#22-环境配置)2.2. 环境配置

src/common/config.env.js 修改启动接口地址

### [](#23-调试部署)2.3. 调试、部署

- MDF3.0启动两个服务、前端和后端node.js部分，命令整合之后可以启动一套命令；
- MDF3.0部署方式有两种，一种是独立Node、另一种则是统一Node，官方强烈建议使用统一Node；
- 如果流水线和统一Node启用了扩展资源上传OSS，则只需要启动前端debug:extend命令即可；
- 统一Node中内置了大量的变量可配置，如：是否使用异步导出、是否开启缓存、是否开启UI模板，详细请移步：[《统一Node配置项说明》](#/node/02-config-item-desc)；

**用户可根据部署环境不同，自由扩展；需要在src/common/config.env.js中配置对应的服务地址**

**本地调试启动：**

- 启动默认调试，会开启前后端服务，默认接口为src/web/common/config.env.js中的daily

npm run debug

- 单独启动前端工程

npm run debug:extend

- 单独启动后端node.js服务

npm run debug:server

**部署上线服务：**

- 构建web端部署

npm run build

- 启动服务

npm run start

## [](#3-辅助工具配置)3. 辅助工具配置

### [](#31-启用代码检查)3.1. 启用代码检查

- MDF脚手架默认是没有开启代码检查的，升级到MDF 4.1
版本脚手架后可以执行 npx init-lint
命令初始化代码检查（如有报错请拉取最新的依赖）
- 初始化后会在每次代码提交时会针对变更的文件进行eslint规范检查并自动修复
- 如需对全部文件进行代码检查可以手动执行 npm run lint 和 npm run
lint:fix 命令

npx init-lint

### [](#32-打包内容分析)3.2. 打包内容分析

package.json文件中的构建命令中添加ANALYZE参数，如：

"build:extend": "cross-env BABEL_ENV=production NODE_ENV=production ANALYZE=true ZIP=true MDF_LANG=true node --max-old-space-size=4096 node_modules/webpack/bin/webpack.js --config webpack.config.js --progress && echo '前端扩展：编译完成'",

根据webpack-bundle-analyzer输出分析打包内容是否必要，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao1.24d6ab98.png)

### [](#33-调试源码)3.3. 调试源码

专属化默认屏蔽了所有sourcemap，公有云默认开放了低品质的sourcemap，如需调试进行以下操作：

- [https://xxx/mdf-node/sourcemap/mdfjs/666666](https://xxx/mdf-node/sourcemap/mdfjs/666666)  
 浏览器访问开启源码（包含框架和领域的）
- [https://xxx/?debug=true](https://xxx/?debug=true)    开启调试模式和高品质源码

## [](#4-开发注意事项)4. 开发注意事项

### [](#41-遵守如下规范)4.1. 遵守如下规范

**1、为减小构建产物体量，组件包不再单独引入，如果需要使用metaui-web或metaui-mobile中的组件，可通过控制台打印cb.components查看支持的内容，引入示例如下：**

1）组件依赖

PC端：

const { Form, Button, Card } = window.YonuiYs; // 不需要单独引入yonui-ys

const { TreeRefer, Label, Input } = require('mdf-metaui-web').basic;

// 不需要单独引入@mdf/metaui-web

移动端：

const { Button, DatePicker } = window.AntdMobile; //

//需要单独引入@mdf/baseui-mobile

const { Refer } = require('mdf-metaui-mobile').basic; //

//不需要单独引入@mdf/metaui-mobile

2）脚本依赖

const { setMode, getWebUrl } = viewmodel.biz.action().common; //

不需要单独引入@mdf/cube

**2、修改package.json中的domainKey为本领域**

**3、访问单据**

**移动端访问简易门户（PC无）：**

环境地址：用 cb.utils.getNodeServerUrl() 在控制台打印出来就是

**访问统一Node单据页面（PC和移动通用）：**

示例：https://<工作台域名>/mdf-node/meta/voucherlist/st_purchaseorderlist?domainKey=upu

**访问本地单据页面（PC和移动通用）：**

示例：[http://local.xxx.com:3003/meta/voucherlist/st_purchaseorderlist](http://local.xxx.com:3003/meta/voucherlist/st_purchaseorderlist)

**4、调试本地扩展代码**

- 方式1：在url上添加 scriptUrl=[http://localhost:3004/static](http://localhost:3004/static) 参数即可加载本地扩展代码
- 方式2：通过Resource Override替换线上资源

**5、独立Node配置框架版本（统一Node不需要）**

process.env.MDF_RESOURCE_VERSION

process.env.MDF_MOBILE_RESOURCE_VERSION

独立Node需要在package.json或流水线环境变量中配置框架版本，以上具体变量值请向MDF框架开发团队索取

### [](#42-版本说明)4.2. 版本说明

需要区分MDF脚手架和MDF框架版本是不同的概念。MDF脚手架版本是指yonyou-mdf-server-app的版本，主要体现在@mdf/create-app包的版本；MDF框架的版本是yonyou-mdf-framework的版本。

#### [](#421-mdf脚手架版本)4.2.1. MDF脚手架版本

常见的脚手架版本：

- 1.0  早期yxyweb的版本（未分包时期）
- 2.0  19年-20的脚手架版本（分包后）
- 3.0  21年的版本（统一去iframe之后的版本）
- 4.1  22年的版本（统一接入TNS后的版本）

#### [](#422-mdf框架版本)4.2.2. MDF框架版本

DMF框架版本比较复杂，详见：《[MDF框架版本说明](#/node/04-framework-version)》

## [](#5-高级功能)5. 高级功能

### [](#51-扩展机制)5.1. 扩展机制

- 扩展脚本在src/business中扩展
- 扩展组件在src/client/web|mobile/components中扩展
- 扩展reducers在src/client/mobile/redux/reducers.jsx中扩展
- 扩展路由在src/client/mobile/routes/index.jsx中扩展
- 扩展样式在src/client/mobile/styles中扩展
- 扩展Actionsrc/client/common/biz/actions.js中扩展
- 在src/client/web|mobile.jsx中还可以注入多语资源和变量

         
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao2.87a25796.jpeg)

详见：《[第六章
领域前端扩展开发](#/guides/03-kuozhanjizhijieshao)》

### [](#52-扩展webpackconfigjs)5.2. 扩展webpack.config.js

《[MDF
4.1脚手架升级指南#Webpack配置](#/introduce/03-mdf-cli41-upgrade#4-webpack%E9%85%8D%E7%BD%AE)》

### [](#53-静态资源托管)5.3. 静态资源托管

#### [](#531-资源存放)5.3.1. **资源存放**

    方案一：服务中使用的第三方资源 或
租户级扩展资源可以放到脚手架/static/public/resources目录下，此方式无版本处理，使用者可在resources目录下创建1.0.0、1.0.1多个目录用来管理版本

    方案二：服务中使用的第三方资源 或
租户级扩展资源可以放到脚手架/static/public/目录下，此方式资源随扩展脚本资源一起放到对应的版本目录下，使用时需要使用cb.cache.baseUrls.get(domainKey)获取版本号（前提是打开过当前领域的单据）

#### [](#532-如何访问)5.3.2. **如何访问**

**方案一：**

查看项目流水线的镜像构建的日志

![](data:image/png;base64,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8i4Sqjwto9G2llNk8DmuQ+AA7omsCXqAAs0fD63eGIDNhgePz2mAiIQS/15Dn9N5MKu9kDpwA5w1IRGgze/J/KTyNHf2Atg8Zhe0iISYlmrT9xfv8evx2MxT+lAR6KwJiQCFlk5oozPXeBfmJ0Io/SuISIvmY9UcxG4+LQ7VYzaQWRMyAet8qSgAAAFvSURBVGpo+2kmIiHN5vej1whE1gT/SiQRkV5KASoiYpECVETEIgWoiIhFClAREYsUoCIiFilARUQsUoCKiFikABURsUgBKiJikQJURMQiBaiIiEUKUBERixSgIiIWKUBFRCxSgIqIWKQAFRGxSAEqImKRAlRExCIFqIiIRQpQERGLFKAiIhYpQEVELFKAiohYpAAVEbFIASoiYpECVETEIgWoiIhFClAREYsUoCIiFilARUQsUoCKiFikABURsUgBKiJikQJURMQiBaiIiEUKUBERixSgIiIWKUBFRCxSgIqIWKQAFRGxSAEqImKRAlRExCIFqIiIRQpQERGLFKAiIhYpQEVELFKAiohYpAAVEbFIASoiYpECVETEIgWoiIhFClAREYsUoCIiFilARUQsUoCKiFikABURsUgBKiJikQJURMQiBaiIiEUKUBERixSgIiIWKUBFRCxSgIqIWKQAFRGxSAEqImKRAlRExKL/AcK/07/rbhFHAAAAAElFTkSuQmCC)

找到静态资源上传的地址

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao4.698e9262.png)

早期的脚手架.gitignore会忽略resources目录，可将脚手架中的.gitignore更新到最新

**.gitignore**

# Created by .ignore support plugin (hsz.mobi)

autogenerate

bin

logs

node_modules

npm-debug.log

static/styles/default

package-lock.json

# Exclude compiled files

build

output

static/project.json

tns.log

# Exclude IDE project folders

.happypack

.idea

.vscode

.project

*.sublime-project

*.sublime-workspace

# OS files

.DS_STORE

.js.map

# vi files

.tern-project

*.swp

static/public/*

!static/public/resources/

static/viewmodel

# webpack stats

stats.json

design.yonyoucloud.com

**方案二：**

const resourceUrl = cb.cache.baseUrls.get(domainKey) + '/resource/1.0.0/index.html'

#### [](#533-建构资源)5.3.3. 建构资源

- 可自行编写webpack或shell代码将想要资源构建到以上目录下
- 如果resources目录被git忽略，可更新.gitignore

## [](#6-常见问题)6. 常见问题

### [](#61-加载不到扩展代码)6.1. 加载不到扩展代码

- 如果控制台信息中报call...字样的错误，则说明是MANIFEST版本不对
- 此时应注意区分，调试本地Node中的代码用npm run
- debug:extend，调试线上Node中的代码应该用npm run debug:extend:prod
- 两个命名的区分就是MANIFEST不一样

注意：确保扩展文件的文件夹和文件名正确，曾经有人因为文件夹的名称前面多了个空格导致加载不到

### [](#62-扩展脚本版本号丢失)6.2. 扩展脚本版本号丢失

扩展脚本路径中的版本号丢失，如：[https:///mdf-wh///javascripts/mobile.extend.min.js](https://bip-redhat.yyuap.com/mdf-wh/hrcloud-talent-mobile//javascripts/mobile.extend.min.js)

这种问题一般只有2个原因：

- nginx的mdf-webhome目录下如果没有对应的目录，则是对应服务的制品安装有问题（服务制品本身有问题、安装器有问题）
- nginx的mdf-webhome目录下如果有对应的目录，则是nginx转发有问题

详见：《[MDF扩展资源统一管理](#/node/04-resources-manage#3-%E6%B5%81%E6%B0%B4%E7%BA%BF%E6%9E%84%E5%BB%BA)》

### [](#63-扩展代码语法错误)6.3. 扩展代码语法错误

- 此问题应先排查是否问题1导致的，判断依据就是刷新整个浏览器，再打开单据看控制台有无call...字样的错误
- 如果不是上面的问题，则就一定是扩展代码有真正的语法错误，此时还是找控制台报错信息，一定会有其它的报错信息
- 再有就是排查扩展脚本第一行cb.define的第一个参数是否process.env.**DOMAINKEY**

### [](#64-mdf正在加载中)6.4. MDF正在加载中

#### [](#641-检查控制台是否有报错)6.4.1. 检查控制台是否有报错

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao5.9f29a786.png)

如果是以上错误，则需要更新TNS补丁

#### [](#642-检查mdfresource和loadextend接口)6.4.2. 检查mdf/resource和loadExtend接口

如果接口有报错，则看错误信息，大概率是redis问题

#### [](#643-检查mdfassets资源加载是否有错误)6.4.3. 检查mdf/assets资源加载是否有错误

如图，在https下加载了http的资源，联系运维修复yms中domain.url配置为https的

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao6.94f4197d.png)

### [](#65-tinpernext-not-undefined)6.5. TinperNext not undefined

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanjiaoshoujiajieshao7.e8295742.png)

- 方法一：锁定@mdf/create-app的版本为当前环境版本（通过业务中台控制台输入mdfjs.version查看）；如mdfjs.version输出的branch为release/3.9，则把脚手架package.json中@mdf/create-app后面的版本号改成3.9
- 方法二：更新TNS补丁，补丁中心搜索对应版本的TNS补丁安装