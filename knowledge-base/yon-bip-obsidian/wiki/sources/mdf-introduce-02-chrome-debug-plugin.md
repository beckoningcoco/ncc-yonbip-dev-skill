---
title: "MDF谷歌调试插件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-chrome-debug-plugin"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 18
---

# MDF谷歌调试插件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-chrome-debug-plugin | 所属：介绍

# [](#mdf谷歌调试插件)MDF谷歌调试插件

## [](#1-插件介绍)1. 插件介绍

### [](#11-插件名称)1.1. 插件名称

MDF前端调试插件（MDF Developer Tool ）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian1.95f086eb.png)

### [](#12-功能清单)1.2. 功能清单

打勾代表已支持，未勾选后续版本会支持

- 友智能AI-Chat（支持导出**MarkDown**文档）
- 代理MDF版本
- 开启调试模式
- 禁用原厂扩展脚本/客开扩展脚本
- 新窗口打开MDF单据
- 新窗口打开YonBulider设计器
- 查看当前领域特性
- 查看UI元数据
- 查看单据业务数据
- 查看当前上下文
- 查看扩展组件
- 查看公式信息
- 查看按钮状态
- 查看UI元数据树结构
- MDF框架官方文档
- MDF性能问题排查指南

<!-- -->

- 插件新版本更新机制

## [](#2-如何使用)2. 如何使用

### [](#21-下载安装包)2.1. 下载安装包

**点击链接下载最新插件：[https://design.yonyoucloud.com/static/mdd/mdf-chrome-plugin/mdf-developer-tool-v1.0.11.zip](https://design.yonyoucloud.com/static/mdd/mdf-chrome-plugin/mdf-developer-tool-v1.0.11.zip)**

### [](#22-安装)2.2. 安装

打开谷歌浏览器，输入[chrome://extensions/](chrome://extensions/)打开扩展程序，并启用开发者模式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian2.5a1b489b.png)

刷新下[chrome://extensions/](chrome://extensions/)，先解压，再将文件夹直接拖入到扩展程序中，**如果首次安装点击没反应，关掉浏览器其他窗口，刷新页面后再重试可以解决。**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian3.07725135.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian4.65187415.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian5.c8e60f69.png)

## [](#3-使用帮助)3. 使用帮助

### [](#31-chatgtp聊天记录导出markdown)3.1. ChatGTP聊天记录导出Markdown

通过插件打开[ChartGTP](https://bip-daily.yyuap.com/iuap-aip-console/ucf-wh/index.html#/ai/chat?aiprivate=aiconsole)，ChantGTP网页右上角会自动生成**`导出为Markdown`**按钮，点击该按钮即可下载markdown格式聊天记录。

如果选中左侧单条记录，会导出单条数据，如果未选中会导出所有数据。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian6.5f43591d.png)

ChatGTP界面：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian7.3dd19e95.png)

Markdown预览效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian8.1d33de0e.png)

### [](#32-代理mdf版本)3.2. 代理MDF版本

点开侧滑弹出如下界面，可以查看目前使用的mdf版本，点击对应版本新开窗口打开工作台会加载对应的MDF版本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian9.47bad42a.png)

### [](#33-调试模式)3.3. 调试模式

默认启用，可以选择关闭。查看其他部分功能依赖这个开关，浏览器控制台也会输入更多调试信息。

### [](#34-原厂扩展脚本客开扩展脚本)3.4. 原厂扩展脚本/客开扩展脚本

默认启用，可以选择关闭。**可以排查是否是扩展脚本引发的问题**。

### [](#35-新窗口打开mdf单据)3.5. 新窗口打开MDF单据

工作台先打开一个单据，然后点击可以新窗口打开MDF单据。**注意浏览器可能会拦截弹窗，设置成允许。**

比如会打开地址类似:

[https://xxx.xxx.com/mdf-node/meta/voucherlist/st_purinrecordlist?domainKey=ustock](https://xxx.xxx.com/mdf-node/meta/voucherlist/st_purinrecordlist?domainKey=ustock)

### [](#36-新窗口打开yonbulider设计器)3.6. 新窗口打开YonBulider设计器

工作台先打开一个单据，然后点击可以新窗口打开YonBuilder设计器。**注意浏览器可能会拦截弹窗，设置成允许。**

比如会打开地址类似:

[https://xxx.xxx.com/iuap-yonbuilder-designer/ucf-wh/designer/apps/quickdev/index.html#/onepage/design/udinghuo/PT1887985340480225282/ysmdd?sceneData=simple](https://xxx.xxx.com/iuap-yonbuilder-designer/ucf-wh/designer/apps/quickdev/index.html#/onepage/design/udinghuo/PT1887985340480225282/ysmdd?sceneData=simple)

### [](#37-查看当前领域特性)3.7. 查看当前领域特性

可以快速查看当前领域配置的feature特性开关。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian10.80136883.png)

### [](#38-查看ui元数据)3.8. 查看UI元数据

可以查看当前单据的UI元数据，也可以查看后端meta数据

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian11.f86c6f2c.png)

### [](#39-查看单据业务数据)3.9. 查看单据业务数据

可以查看当前单据的业务数据，也可查看脏数据。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian12.c9472c3b.png)

### [](#310-查看当前上下文)3.10. 查看当前上下文

页签在单据上时会加载当前领域的上下文，工作台没有打开单据时查看全局上下文。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian13.17f4001e.png)

### [](#311-查看扩展组件)3.11. 查看扩展组件

列出领域正在使用的扩展组件。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian14.6e54742e.png)

### [](#312-查看公式)3.12. 查看公式

查看单据配置的所有公式，并且提供了公式文档。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian15.c4b85b3d.png)

### [](#313-查看按钮状态)3.13. 查看按钮状态

可以快速查看states按钮状态，也提供了其他控制按钮状态的排查方法

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian16.23065d82.png)

### [](#314-查看ui元数据树结构)3.14. 查看UI元数据树结构

可以查看前端界面UI元数据的树结构

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian17.374ba920.png)

### [](#315-mdf框架官方文档)3.15. MDF框架官方文档

可以快速跳转到MDF框架官方文档。

### [](#316-mdf性能问题排查指南)3.16. MDF性能问题排查指南

可以快速跳转到MDF框架官方文档。

## [](#4-插件版本更新)4. 插件版本更新

插件有版本更新时会在插件中显示，有更新啦，点击可以下载最新版本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gugetiaoshichajian18.941adb4a.png)

## [](#5-问题反馈)5. 问题反馈

如果使用过程中遇到问题可以在下面评论区进行评论，看到后会第一时间进行回复。
紧急联系人: [limyt@yonyou.com](mailto:limyt@yonyou.com)

**1、安装后点击没反应？**

- 关掉浏览器其他窗口，打开一个页面后再使用插件功能
- 如果上面没用，看下插件安装处是否有报错，如果有报错，尝试升级谷歌浏览器到最新版，[下载地址](https://www.google.cn/intl/zh-CN/chrome/)

**2、插件用一段时间没了**

- 压缩包需要先解压后再使用，不然会出现插件丢失的情况