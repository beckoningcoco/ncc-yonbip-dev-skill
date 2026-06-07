---
title: "元素分组 GroupOnePageContainer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-grouponepagecontainer"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 元素分组 GroupOnePageContainer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-grouponepagecontainer | 所属：Web组件

# [](#元素分组-grouponepagecontainer)元素分组 GroupOnePageContainer

## [](#1-功能说明)1. 功能说明

如业务场景中需要把元素进行一个分组处理，如下图所示：长度公差，MIN,MAX本是单独存在的，因业务需求要放在一组进行展示，那么这个就派上用场啦。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GroupOnePageContaineryuansufenzuimg1.6c023e49.jpg)

只需简单两步即可完成：

第一步：声明类型，也就是容器层配置GroupOnePageContainer；

container.cControlType：grouponepagecontainer；

第二步：建立字段之间的关联关系，即配置相同的cGroupKey；

cExtProps中配置下{"groupKey":xxx}，通过循环billitem，groupKey相同的会被分到一组，没有配置groupKey的默认自己一组；

## [](#3-基本属性)3. 基本属性

||属性名称||值类型||属性含义|
||cGroupKey||String||控制billitem的分组,值相同的会被分到同一组中；|
||iColWidth||Number||每个billitem所占宽度比例（值为：1，2，3，4，例如：值为1，所占宽度为48px）；|

## [](#4-控制示例)4. 控制示例

**示例：**

// 控制组的隐藏

viewmodel.execute('updateViewMeta',{groupKey:'group1',groupState:{visible: false}})；

// 给组添加背景色

// 通过添加特殊的类名写样式控制

viewmodel.execute('updateViewMeta',{groupKey:'group1',groupState:{className: '**'}})；

**连接元素之间的通配符配置（支持'-，～'）：**

先设置类型：cControlType:'span'
；分隔符的字段名是：separatTag:'～'；