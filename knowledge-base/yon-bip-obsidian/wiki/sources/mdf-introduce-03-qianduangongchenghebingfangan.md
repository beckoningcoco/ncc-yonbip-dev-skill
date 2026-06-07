---
title: "前端工程合并方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-qianduangongchenghebingfangan"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 前端工程合并方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-qianduangongchenghebingfangan | 所属：介绍

# [](#前端工程合并方案)前端工程合并方案

## [](#1-合并原则)1. 合并原则

- MDF扩展工程与MDF扩展工程合并
- YNF扩展工程与YNF扩展工程合并
- MDF扩展工程与YNF扩展工程不合并
- 一个后端微服务只允许存在一个同一类型的前端微服务（MDF和YNF是不同类型、二方包不算）
- 组件工程与组件工程合并（同一个组件MDF与YNF公用）
- 原扩展工程中的扩展组件，领域评估逐步迁移到新的组件工程中（也就是TNE二方包中）

## [](#2-合并规范)2. 合并规范

### [](#21-命名规范)2.1. 命名规范

- 一方包（前端工程）命名规范参考 [TNE一方包命名规范](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/devops-frontend/application-service-code)
- 二方包（不同应用的可复用能力，通常包括扩展组件 SDK、API等 ）命名规范参考 [TNE二方包命名规范](https://c2.yonyoucloud.com/iuap-tinper/ucf-wh/lightning-docs/index.html#/best-practice/tnf2nd-intro)

### [](#22-工程结构)2.2. 工程结构

**1. 合并前后对比：**

------------------合并前-----------------

MDF扩展工程A.git

MDF扩展工程B.git

MDF扩展工程C.git

YNF扩展工程A.git

组件二方包工程A.git

------------------合并后-----------------

领域工程.git

--apps

----MDF前端服务（微服务编码命名）

------MDF扩展工程A（domainKey命名）

------MDF扩展工程B（domainKey命名）

------MDF扩展工程C（domainKey命名）

----YNF扩展工程A（微服务编码命名）

--packages

------组件二方包工程A

**2. 以基础档案为例：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image1.6c347b50.jpg)

**3. 工程结构说明：**

- 多个MDF工程合并时，可以申请一个新的前端微服务编码（推荐），也可以延用旧的某一个前端微服务编码
- 多个MDF工程合并时，需要在apps下新建一个文件夹， **新建文件夹以微服务编码命名** ，将需要合并的多个工程放到该目录下，用domainKey做子目录名称，在此目录下新建一个module.xml
- 多个MDF工程合并时，需要consul里增加mergeFeCode配置，值为合并后的前端微服务编码
- 单个MDF工程时，apps下面直接放MDF工程即可，名字以前端微服务编码命名
- 单个MDF工程无须额外新建一层文件夹，apps下面直接放MDF工程即可，名字以前端微服务编码命名

## [](#3-操作步骤)3. 操作步骤

### [](#31-创建工程)3.1. 创建工程

ynpm install -g yds

**初始化工程**

yds init iuap-apdoc-basedoc-fe

// iuap-apdoc-basedoc-fe为仓库名称，注意和后面的前端服务编码不同

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image2.23642c68.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image3.f97fbcce.png)

### [](#32-删除示例工程)3.2. 删除示例工程

如果init后apps下有iuap-yms-demo和packages下有iuap-gp-ui目录可以删除，这2个目录是示例工程不需要
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image4.c3ca8d98.png)

### [](#33-迁移工程)3.3. 迁移工程

将合并前的工程区分出来

- 如果是扩展组件工程，则迁移到packages目录下作为一个前端二方包
- 如果是扩展脚本工程不需要合并时，则迁移到apps目录下作为一个前端微服务
- 如果是扩展脚本工程需要合并时，在apps目录下创建一个以新申请的前端微服务编码为名称的目录，将原有的多个工程迁移到新的目录下，参考上一章节中的工程结构（ **迁移时将.git目录一并迁移过来可以保留原工程的提交记录** ）

以下为基础档案服务示例：

├── apps // 前端微服务

│   └── iuap-apdoc-basedoc-fe           // MDF合并工程

│ ├── basedoccenter           // domainKey1

│ ├── customerdocfe           // domainKey2

│     ├── transtype                     // domainKey3

│ └── module.xml                     // module.xml

│   └── iuap-apdoc-basedocynf-fe         // YNF前端工程

├── packages // 前端二方包

│ └── iuap-ap-basedocsdk-fe            // 不同应用的可复用能力，包括组件等 不同应用的可复用能力，包括SDK、API等

├── README.md                            // 工程说明

├── package.json

└── pnpm-workspace.yaml // 工作空间描述关系

工程迁移示例：

准备工作：一个如上结构的初始化的新工程，一个待迁移工程A，一个带迁移工程B

工程A新建一个分支branchA，将目录架构改成和新工程的目录结构一致

在新工程执行命令

git remote add 仓库别名(随便取) A工程仓库地址

git pull 仓库别名 branchA --allow-unrelated-histories // 将旧仓库建的分支branchA clone到本地 历史记录不会丢失

循环对待迁移工程做以上操作即可

### [](#34-修改配置)3.4. 修改配置

多个MDF工程合并时，需要在consul中增加mergeFeCode配置 `(每个被合并的工程都需要添加)`

`mergeFeCode的值会作为扩展资源的访问路径的一部分`，如：*/iuap-apdoc-basedoc-fe/20250109-180629/basedoccenter/javascripts/extend.min.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image5.cd2b9ffb.png)

## [](#4-流水线配置)4. 流水线配置

可在一条流水线下配置多个构建命令，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFheYNFqianduangongchenghebingfangan_image6.bf8911e7.png)

流水线其它步骤配置不变

## [](#5-常见问题)5. 常见问题

### [](#51-待补充)5.1 待补充