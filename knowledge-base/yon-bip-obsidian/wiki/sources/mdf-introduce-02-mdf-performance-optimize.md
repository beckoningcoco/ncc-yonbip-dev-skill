---
title: "--MDF性能优化记录"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-performance-optimize"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# --MDF性能优化记录

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-performance-optimize | 所属：介绍

# [](#mdf性能优化记录)MDF性能优化记录

## [](#1-单据首次打开速度)1. 单据首次打开速度

### [](#11-减少重绘重排)1.1. 减少重绘重排

#### [](#111-减少表格gettableheight调用次数)1.1.1. 减少表格getTableHeight调用次数

getTableHeight里有操作DOM动态计算表格的高度。

#### [](#112-表格hover显示滚动条交互影响星网项目)1.1.2. 表格hover显示滚动条交互影响星网项目

星网项目使用的是云桌面+奇安信浏览器，表格向下滚动时会卡顿2s左右。原因是由于云桌面+麒麟系统+奇安信浏览器，向下滚动过程中会触发大量的重绘，重绘原因是表格上有一个hover的css，用来动态显示滚动条是否展示。

解决办法：在星网项目将这个交互去掉。

### [](#12-延迟渲染)1.2. 延迟渲染

#### [](#121-使用requestanimationframe)1.2.1. 使用requestAnimationFrame

使用requestAnimationFrame延迟触发布局变化，可以减少单据白屏时间。

### [](#13-减少不必要的组件渲染)1.3. 减少不必要的组件渲染

#### [](#131-隐藏group组件不做渲染)1.3.1. 隐藏Group组件不做渲染

#### [](#132-隐藏的表格组件不做渲染)1.3.2. 隐藏的表格组件不做渲染

单个表格渲染耗时严重，当同时出现多个表格时可以使用折叠隐藏其他表格。

#### [](#133-业务阶段直接进入编辑态)1.3.3. 业务阶段直接进入编辑态

从消息中心进单据会先进入浏览态再根据业务阶段切换为编辑态，可以改为先获取当前业务阶段是浏览态还是编辑态然后再进单据。

#### [](#134-格单元componentwillreceiveprops多余触发渲染)1.3.4. 格单元componentWillReceiveProps多余触发渲染

cellModel.js的生命周期componentWillReceiveProps里，会动态计算单元格高度，但是应该只对富文本这种需要高度计算的组件，普通input组件是不需要渲染的，所以得进行控制。

#### [](#135-对updategcheight和tableresize进行防抖控制)1.3.5. 对updateGCHeight和tableResize进行防抖控制

防抖控制updateGCHeight、tableResize方法的次数减少表格渲染次数，示例：

this._tableResize = cb.utils.debounce(this._tableResize.bind(this), 30);

tableResize = () => {

 this._tableResize();

}

_tableResize = () => { }

#### [](#136-states对按钮的控制渲染多次toolbar改为渲染一次)1.3.6. states对按钮的控制渲染多次toolBar改为渲染一次

控制单个按钮状态会渲染一次toolbar组件，加一个防抖改为批量控制按钮状态后只渲染一次toolbar的展示。下面是前后修改的效果图。

优化前：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu1.20efaa2e.png)

优化后：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu2.ac9a7eb8.png)

#### [](#137-依赖精度builddepends渲染表格次数太多)1.3.7. 依赖精度buildDepends渲染表格次数太多

A字段影响B字段的精度，如果很多字段都有精度影响会控制表格多次，表格会渲染多次。解决办法：将多次渲染合并成一次。

优化前：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu3.715719a4.png)

优化后：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu4.068b613b.png)

### [](#14-串行请求改为并行请求)1.4. 串行请求改为并行请求

#### [](#141-二开脚本和设计器扩展组件脚本加载由原来的串行改为并行触发)1.4.1. 二开脚本和设计器扩展组件脚本加载由原来的串行改为并行触发

这样时间可由原来的a+b降低为max(a,b)

## [](#2-内存优化)2. 内存优化

### [](#21-mdf组件隐藏卸载时对内存进行释放)2.1. MDF组件隐藏卸载时对内存进行释放

组件上绑定的外部事件必须在组件卸载时解绑。

### [](#22-排查工作台其他非mdf服务导致的内存泄露钉耙协同哈勃文件服务)2.2. 排查工作台其他非MDF服务导致的内存泄露（钉耙，协同，哈勃，文件服务）

工作台内的js都会影响到MDF组件得不到卸载，所以都得排查一下。

### [](#23-node端哈勃上报参数收集导致内存增长)2.3. node端哈勃上报参数收集导致内存增长 

哈勃上报有一个功能是2个接口的参数需要合并成一个接口发起，所以之前定义了一个全局变量，但没考虑到报错时全局变量里的变量没得到删除，所以导致node端内存一直增长。所以在node端尽量不要定义全局变量否则得不到删除。

## [](#3-常用api优化)3. 常用API优化

### [](#31-cbutilsisemptyobject)3.1. cb.utils.isEmptyObject

方法里存在for
in遍历字符串行为，这样是不允许的逻辑上也不需要。所以得优化掉！！

### [](#32-cbutilsparsecstyle)3.2. cb.utils.parseCStyle

领域cStyle配一个一个空的字符串，触发大量无用的JSON.parse导致性能损耗，按理来说如果是空字符串函数可以直接返回{}。

## [](#4-缓存重复计算)4. 缓存重复计算

### [](#41-表格组件标题长度计算值缓存)4.1. 表格组件标题长度计算值缓存

### [](#42-前端公式临时计算结果进行缓存)4.2. 前端公式临时计算结果进行缓存 

## [](#5-逻辑优化)5. 逻辑优化

### [](#51-交互规则触发)5.1. 交互规则触发

将要改变的状态存起来，等规则所有动作执行完后再进行统一触发
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu5.7634f701.png)

### [](#52-公式批量触发)5.2. 公式批量触发

优化公式逻辑，将一个个公式请求优化成一个，批量进行触发。可参照批量公式的优化文档。跟之前的公式实现不太一样，所以改动比较大。

## [](#6-用空间换时间优化)6. 用空间换时间优化

### [](#61-二维表组件渲染优化接口缓存提高非首次打开)6.1. 二维表组件渲染优化、接口缓存提高非首次打开

优化前：2-3min
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu6.98ae53f8.png)
优化后：300ms
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFxingnengyouhuajilu7.a83fead6.png)

## [](#7-体验优化)7. 体验优化

### [](#71-按钮区域防止闪烁)7.1. 按钮区域防止闪烁

按钮区属于模版层返回，然后再根据业务数据进行动态显示。这样就会先出现全部按钮再显示当前需要的按钮，有一个闪动的过程。为了避免出现闪动，需要优化将按钮延迟显示，等业务数据回来后再进行显示。