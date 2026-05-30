---
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/XGNBDQDYNF1
extracted: 2026-05-28
title: 本地前端开发环境搭建（YNF）
version: BIP5
images: 11
---

概述
快速入门
操作指南
开发指南
开发介绍
新功能开发
新应用开发（YDS）
后端插件开发YDS
前端开发(MDF)
前端典型示例开发(MDF)
新应用开发YNF
本地前端开发环境搭建（YNF）
前端开发（YNF）
前端典型示例开发（YNF）
移动端开发
扩展开发
全球化
组织
权限
特征
基础数据
审批流
业务流
规则引擎
公式
UI模板
参照
导入导出
打印
对象建模
编码规则
调度任务
监控与预警
日志
消息平台
工作台
事件中心
文件服务
YonBuilder应用开发
前端开发
后端开发
移动开发
安全
数据库
DevOps技术
容器云技术
区块链云技术
YMS开发
智能应用开发
专项开发
成果迁移
技术方案
最佳实践
参考手册
常见问题
视频教程
专业开发/开发指南/新功能开发/本地前端开发环境搭建（YNF）
本地前端开发环境搭建（YNF）
最后更新时间：2025-06-05
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	是
专属云	客户化定制开发	是
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	是
业务场景

在本文档中，将重点讲解如何使用ynf命令行工具，构建YNF前端脚手架，来搭建一个基于YNF的本地开发环境。

关键词

YNF、命令行、脚手架、ynpm、local

YNF前端脚手架搭建
准备开发者工具

YNF前端脚手架使用ynf-dx-cli开发者工具创建扩展脚本工程，首先需要准备开发工具：

// 1.全局安装ynpm工具

$ npm install ynpm-tool -g

// 2.全局安装ynf-dx-cli工具

$ ynpm install ynf-dx-cli -g

开发工具安装完毕，使用以下命令测试工具是否安装成功

$ ynf -v

若能成功输出ynf工具的版本号，证明开发工具已经顺利安装。

准备资源编码libCode

资源编码libCode非常重要，它就是资源的ID，它贯穿了整个开发、流水线部署、资源中心发布、CDN访问等等过程

libCode的编码规范为：ynf-${domainKey}

在本次课程实例中即为ynf-c-cpu-fn-kflx

初始化扩展开发脚手架

使用ynf命令初始化扩展开发的脚手架，命令的格式为：

ynf init [libType] [libCode]

其中：

libType为需要初始化的脚手架类型

app ：初始化应用二方包脚手架
lib ：初始化组件二方包脚手架
sdk ：初始化SDK二方包脚手架

此处我们需要初始化应用扩展二方包，libType为app

libCode即上一小节中准备好的ynf-c-cpu-fn-kflx

安装项目依赖

脚手架初始化完毕后，进入项目根目录，使用ynpm包管理工具，安装项目依赖

// 命令行执行

$ ynpm install

添加扩展页面

应用扩展二方包下，页面扩展存放目录src/pages下。使用ynf add命令，向脚手架中添加页面扩展文件，命令格式为：

ynf add

其中libName为对应页面的单据编码，以本次演示环境上的应用为例，即为以下两项

终端提示需要选择创建的资源类型，此处选择【页面扩展】：

扩展脚本的使用

在执行完添加命令后，工具已经自动为我们添加好对应页面的扩展脚本，存放在src/pages//stores/ext目录下

YNF主要概念介绍

rootStore: 运行时每个页面都有一个rootStore，类似mdf的viewModel，页面所有的信息都挂在rootStore上，管理着该页面中的基础数据、各个模块的store和页面上的动作(action)和交互反馈(reaction)。可以在控制台打印rootStore

store: 页面的各种模型，比如主表的formStore，子表/列表的tableStore、筛选filterStore、页面信息pageStore、单卡页cardStore等。挂载位置大部分都在rootStore.xxxStore下，Store里主要存放的就是模型的属性和API

action: 页面中的事件，包括单据增删改查、工作流、导航等。一部分是设计器预置，一部分来自扩展脚本的定义。组件协议和脚本里都可以直接通过rootStore.actions.xxxx.doAction来执行某个事件

reaction: 页面的副作用，可以理解为页面某个状态发生变化后执行的逻辑。每种类型的页面都有自己对应的副作用文件，比如单卡cardReaction、列表ListReaction、树卡TreeCardReaction等。reaction里对store的可观测属性做监听，属性变化后会做出相应的反应，比如cardReaction里有对formStore主组织字段的监听，当主组织变化可以进行模板刷新

YNF本地调试
谷歌代理插件配置

YNF本地调试，需要将线上扩展脚本，通过谷歌插件Resource Override插件代理到本地调试。

插件下载地址：

https://github.com/kylepaulsen/ResourceOverride/archive/refs/heads/master.zip

插件安装完毕后，需对代理地址做配置：

线上资源地址格式：

https://${YMS_HOST}/${libCode}/ucf-wh/**

本地资源地址格式：

https://localhost:9090/**

具体实例如下：

启动本地前端工程

启动命令： npm run start

重新刷新浏览器后，我们发现目标二方包的线上资源已经成功的代理到本地资源，接下来我们就可以修改代码并保存实现本地调试效果。

YNF前端工程部署

目前YNF工程的部署过程尚不成熟，一般通过手动上传至Nginx的方式部署。

若有自动化部署需要，前端工程接入流水线步骤可参考文档：

统一前端引擎(Nginx)接入指南

使用ynpm安装ynf-dx-cli时报错：

如上图所示，这个报错是因为 ynpm默认的内核是pnpm(一个通用的包管理工具，类似npm),而此时pnpm没有指定全局bin目录。可以在命令行执行：

ynpm set usein=npm

将内核转换为常用的npm

使用ynf命令 初始化时报错：

解决的方法就是全局安装typescript:

npm install -g typescript