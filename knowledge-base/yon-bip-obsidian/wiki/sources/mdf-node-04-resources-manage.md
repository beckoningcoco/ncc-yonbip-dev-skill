---
title: "MDF扩展资源统一管理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-resources-manage"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF扩展资源统一管理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-resources-manage | 所属：MDF服务

# [](#mdf-扩展资源统一管理)MDF 扩展资源统一管理

MDF 扩展资源统一 Nginx 是新一代平台的重要工作部分，内容包括 YMS 适配、YPR 公有云专属云一体化出盘。

## [](#1-背景)1. **背景**

### [](#11-现状)1.1. **现状**

目前 YonBIP 项目前端项目是 Node 方式启动，承担以下功能：

- 请求路由功能；
- 静态资源托管；

目前已经去 iframe 的领域(请求路由功能由公共前端 mdf-node 提供)，各个领域的前端项目只剩余静态资源托管功能。

### [](#12-实现目标)1.2. **实现目标**

目前在进行前端去 Node，静态化资源以及静态资源使用 OSS 方式存储，方案有如下步骤：

- Dockerfile 修改；
- 静态资源上传到 OSS；
- 使用 CDN 进行加速；
- 改造 YMS，使配置文件与环境无关；
- 输出 YPR 制品；

### [](#13-整体设计)1.3. **整体设计**

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-12-13_14-9-241.bbc29174.png)

### [](#14-公有云)1.4. **公有云**

- 扩展资源上传OSS ：详情查看[MDF上传静态资源设计文档](#/node/04-resource-design)）【上传oss命令】 章节

**【生产环境】**

注意生产环境如果是推的预发镜像，配置参考：《[统一前端CI/CD（推荐）](#/node/04-pipeline-cicd)》

## [](#2-专属化)2. **专属化**

### [](#21-ypr-制品规范)2.1. **YPR 制品规范**

#### [](#211-规范)2.1.1. **规范**

- 在项目根目录下添加 module.xml，详见 3.2 Module 规范
- 流水线制作 YPR 包的名字，要与根目录下 module.xml 里面的 name 相同
- YPR 包下面只有一层目录，那就是 domainKey，domainKey 文件夹下把 module.xml 拷贝进来后一起压缩产生 YPR 包
- 安装器在安装的时候会直接把 YPR 包直接解压到 nginx 指定目录下（安装器不再新建文件夹，所以 YPR 包里要自己规范好文件夹）
- 制作 YPR 包时，类似公有云上传 oss，走多版本策略，version 值取当前时间戳

#### [](#212-示例)2.1.2. 示例

文件夹目录结构示例如下：

basedoccenter # 领域domainKey

├── 20210419173944_01a97880 # 版本目录

│ ├── javascripts

│ │ ├── extend.min.js

│ │ └── mobile.extend.min.js

│ ├── stylesheets

│ │ ├── extend.min.css

│ │ └── mobile.extend.min.css

│ └── version.json

├── module.xml # 模块信息

└── version # 版本信息

 └── private_version.json

20210419173944_01a97880 为版本目录，其中 20210419173944 为时间戳，01a97880 为最后一次代码提交的 commitId

按本文档处理完之后，下载构建产物对比一下是不是上面的目录结构，如果是恭喜你成功了！

### [](#22-module-规范)2.2. Module 规范

#### [](#221-规范)2.2.1. 规范

前端工程根目录放一个 module.xml 文件

<?xml version="1.0" encoding="UTF-8"?>

<module name="iuap-apdoc-basedoc-fe" description="基础档案-前端">

 <nginx_mode>mdf</nginx_mode>

</module>

nginx_mode合法值包括ucf和mdf，ucf为非MDF框架的前端，mdf为使用MDF框架的前端

其中name：[微服务编码]+[.应用ID]+[-fe]；其中应用ID可选，对于MDF来应用ID就是domainKey，后端服务前端是一对一的情况不需要，一对多需要

例如：name="iuap-apdoc-basedoc-fe" iuap-apdoc-basedoc是统一微服务编码
例如：name="iuap-apdoc-basedoc.transtype-fe“ 其中iuap-apdoc-basedoc是统一微服务编码， transtype是应用ID

#### [](#222-示例)2.2.2. 示例

- 后端微服务名称和前端domainKey一致的情况

<?xml version="1.0" encoding="UTF-8"?>

<module name="iuap-apdoc-basedoc-fe" description="基础档案-前端">

 <nginx_mode>mdf</nginx_mode>

</module>

- 后端微服务名称和前端domainKey不一致的情况

<?xml version="1.0" encoding="UTF-8"?>

<module name="iuap-metadata-import.exceltraincenter-fe" description="基础档案-前端">

 <nginx_mode>mdf</nginx_mode>

</module>

- 一个后端微服务名称对应多个前端domainKey的情况

<?xml version="1.0" encoding="UTF-8"?>

<module name="iuap-apdoc-basedoc.transtype-fe" description="基础档案－交易类型-前端">

 <nginx_mode>mdf</nginx_mode>

</module>

<?xml version="1.0" encoding="UTF-8"?>

<module name="iuap-apdoc-basedoc.basedoccenter-fe" description="基础档案－基础数据-前端">

 <nginx_mode>mdf</nginx_mode>

</module>

以上示例中：iuap-apdoc-basedoc、iuap-metadata-import为后端统一微服务名称；exceltraincenter、transtype、basedoccenter为应用ID，即MDF应用中为domainKey

推荐：后端微服务名称和前端domainKey是一一对应 且 值是一样的

### [](#23-开启专属化)2.3. **开启专属化**

流水线执行步骤为
拉取代码、分析代码质量[可选]、前端资源构建、前端资源部署，如图：

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-5-23_19-13-39.9509f4d0.png)

**注意：**

- **用哪个环境出盘，哪个环境的专属化一定要勾上**
- **新建流水线选择 '静态网站'，如果选择 'Node' 不启动服务建康检查无法通过**

## [](#3-流水线构建)3. **流水线构建**

### [](#31-流水线配置)3.1. **流水线配置**

**参考：《[统一前端 CI/CD（推荐）](file:////pages/viewpage.action%3fpageId=50966400)》**

### [](#32-检查安装结果)3.2. 检查安装结果

#### [](#321-公有云)3.2.1. 公有云

浏览器访问
https://***/static/mdf//version/_version.json
查看是否能正常返回版本号

- ***是 CDN 地址
- 替换成 damainKey
- 替换成当前环境

#### [](#322-专属化)3.2.2. 专属化

浏览器访问
http://***.***.com/mdf-wh/***/version/private_version.json
查看是否能正常返回版本号

- ***.***.com 是当前环境主站域名
- ***是 domainKey

#### [](#323-异常检查)3.2.3. 异常检查

- 检查制品是否上传 YPR 仓库成功
- 产品盘检查是否带上制品
- 检查 nginx 的 mdf-webhome 目录下如果没有对应的目录，则是对应服务的制品安装有问题（服务制品本身有问题、安装器有问题）
- 检查 nginx 的 mdf-webhome 目录下如果有对应的目录，则是 nginx 转发有问题

## [](#4-统一-node-配置调整)4. 统一 Node 配置调整

- 配置项说明：[《统一 Node 配置项说明》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771730)
- 开通配置权限：[《统一 Node 配置领域权限》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771722)

适配 YMS 之后要求配置满足环境无关性，即配置中的所有地址及和环境有关的配置都需要移除，以下是领域需要注意调整的配置。

- 专属化调整 premises 环境
- 公有云调整对应的环境，如：测试-test，日常-daily，预发-pre，生产-prod

### [](#41-前端地址)4.1. 前端地址

按以上规范调整之后（有上传 OSS 的步骤），以前的统一 Node 配置中心配置的 staticHost 需要删除，添加"useOSS":
true 属性，调整之后的示例如下：

{

 "features": [

 "autoAddRowAndDeleteRow",

 "asyncBatchOutput",

 "formLayout",

 "autoGenerateLineNo",

 "queryLoginUser",

 "importWorkbench"

 ],

 "useOSS": true, // 添加了此属性，删除了staticHost

 "env": {

 "domainCode": "SCM",

 "applicationCode": "PU"

 }

}

### [](#42-后端地址)4.2. 后端地址

后端服务做完 YMS 改造之后，需要调整后端地址配置，即调整 appServer 属性，分以下 2 种情况：

- **后端微服务名称和前端 domainKey 一致且后端地址只有微服务名称这一层上下文的情况**

- [http://xxx.xxx.com/iuap-metadata-import](http://xxx.xxx.com/iuap-metadata-import) 需要把 appServer 属性删除，调整之后的示例如下：

{

 "features": [

 "autoAddRowAndDeleteRow",

 "asyncBatchOutput",

 "formLayout",

 "autoGenerateLineNo",

 "queryLoginUser",

 "importWorkbench"

 ],

 "useOSS": true, // 添加了此属性，删除了staticHost

 "env": {

 "domainCode": "SCM",

 "applicationCode": "PU"

 }

}

- **后端微服务名称和前端domainKey不一致 或 后端微服务地址存在多层上下文的情况**

- [http://xxx.xxx.com/iuap-metadata-import/exceltrain](http://xxx.xxx.com/iuap-metadata-import/exceltrain) // 多层上下文件的情况
- [http://xxx.xxx.com/iuap-metadata-import](http://xxx.xxx.com/iuap-metadata-import) // 只有一层上下文的情况，需要保留 appServer 属性，但需要删除前面的域名，做到环境无关性，调整之后的示例如下：

{

 "features": [

 "autoAddRowAndDeleteRow",

 "asyncBatchOutput",

 "formLayout",

 "autoGenerateLineNo",

 "queryLoginUser",

 "importWorkbench"

 ],

 "appServer": "/iuap-metadata-import/exceltrain", // 或 "appServer": "/iuap-metadata-import"

 "useOSS": true,

 "env": {

 "domainCode": "SCM",

 "applicationCode": "PU"

 }

}

标准规范是只保留一层上下文，即情况 1 是标准

### [](#43-代理中的地址)4.3. **代理中的地址**

代理 proxyRoutes 中的配置的 target 地址需要改成相对路径，如下：

{

 "proxyRoutes": [

 [

 "/productbill/billImport",

 {

 "dataType":"file",

 "contentType":"default",

 "json": false,

 "target": "/iuap-apdoc-customer"

 }

 ]

 ]

}

### [](#44-变量中的地址)4.4. 变量中的地址

环境变量 env 中的配置的地址大多数情况是领域自己使用的，请确认自己是否在前端代码中使用了配置的地址，如果使用了可以直接改成相对路径，如下：

{

 "env": {

 "HTTP_PRINT_SERVER": "/iuap-yonbuilder-runtime"

 }

}

如果没有使用也按上面的示例改成相对路径，并联系姚磊处理

### [](#45-打印数据回调地址)4.5. 打印数据回调地址

**如果领域代码中注入了这__PRINT_META__这个环境变量且变量中的 printDataServer 地址为绝对路径的情况需要调整**

- **__PRINT_META__下的 domainCode 删除，在统一 Node 中 env 下配置**
- **printDataServer 删除，在统一 Node 中配置 subPath 属性**

**文档：[《统一 Node 配置项说明》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771730)**

**示例：**

{

 ...

 "env": {

 "domainCode": "SD", // 每个领域可能不同，请核对

 "__PRINT_META__" : {

 "subPath":"bill/getPrintData" // 每个领域可能不同，请核对

 }

 }

 ...

}

**说明：**

- **这个回调地址配置有领域级的，就是上面说的这情况，这种适用于当前 domainKey 下所有的单据回调地址都相同（这个 env 注入可以在领域的代码中，也可以在配置中心配置，领域代码中注入优先级大于配置中心）**
- **如果个别单据的打印回调地址和其它单据都不同，则需要在 command 中配置 cSvcUrl，也是相对路径**
- **如果以上 2 种情况都没有配置会走平台默认的回调地址，即：bill/getPrintData**

## [](#5-其它事项)5. **其它事项**

### [](#51-推荐-webpack-配置)5.1. **推荐 webpack 配置**

仅适用于去过 iframe 的领域

// 编译命令

"build:extend": "cross-env ONLY_EXTEND=true BABEL_ENV=production NODE_ENV=production MDF_LANG=false MANIFEST=production node --max-old-space-size=4096 node_modules/webpack/bin/webpack.js --config webpack.config.js --colors --progress && echo '前端扩展：编译完成'",

 

// 不再需要启动命令

### [](#52-特殊场景)5.2. **特殊场景**

- **需要保留 Node 服务的场景**
- **一个代码分支需要产出多个制品的场景**
- **代码目录结构和示例不同的场景**
- **修改 domainKey 的场景（推荐修改）**
**注册新 domainKey**
- **使用 doaminKey 的地方更新**
- **工作台菜单更新**