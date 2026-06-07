---
title: "日历 Calendar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-calendar"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 日历 Calendar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-calendar | 所属：Web组件

# [](#日历-calendar)日历 Calendar

## [](#1-功能说明)1. 功能说明

日历月组件。

**配置方式 : "cControlType": "calendar"**

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Calendarrili_image1.dfe84c5f.jpeg)

headerRender

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|
||headerRender||顶部右侧按扩展区域|||||
||strideValue||月模式拖拽事件中显示数据格式||array||拖拽后弹窗编辑后保存的数据|

silderModalBody、onModalOk、onCreateEvent、onCellClick、onMoreEvent、moreRender等详细使用请查看钉耙文档，下边附录有链接地址

**【排版情况+最大化按钮】是基于多页签LineTabs一起使用的，配置方式如下：**

**注意：**

- 配置标题和按钮，参考文档：[LineTabs配置]
- 需要配置个className值，值是basedTitle，其目的是样式兼容日历头部按钮区域。

`"cStyle": "{"className":"basedTitle"}"`

**说明：**

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName) 的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

### [](#32-日历-设置月)3.2. 日历-设置月

viewmodel.get(cItemName).setValue({

 'listDataArr': [{

 '2023-01-10': [

 { code: 'xx01', content: '重型机械维修组织' },

 { code: 'xx02', content: '轻型机械维修组织' },

 { code: 'xx03', content: '高危机械维修组织' },

 { code: 'xx04', content: '机械维修组织' },

 ]

 }]

})

### [](#33-日历-设置日)3.3. 日历-设置日

viewmodel.get(cItemName).setValue({

 'timeEvents': [{

 start: '2023-01-11 04:00',

 end: '2023-01-11 18:00',

 content: '测试当天的日期数据啦啦啦111'

 }]

})

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||属性说明|
||className||扩展class类名||string||用来处理扩展样式|
||disabledHoverStyle||不使用日历格悬停||boolean||默认false，true禁止使用|
||isDragEvent||是否为拖拽事件||boolean||默认false，true可拖拽|

## [](#5-控制示例)5. 控制示例

[SimpleModel简单模型](#/api/02-simple-model) //

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName) 的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 支持的事件名

afterMonthCellRender ------ 月份内容渲染回调函数

afterClick

afterDoubleClick

afterMouseEnter

afterMouseLeave

afterGetMore

afterSelect ------ 日期选中回调函数

afterTimeEventsClick ------ 日视图中点击事件

silderModalBody // 拖拽弹窗内容区

onModalOk // 拖拽弹窗确定按钮

onMoreEvent // 拖拽弹窗更多事件

moreRender // 点击更多或者每条事件时弹窗的回调

onMouseHandle // 拖拽后的事件

onCellClick // 点击每条任务的回调

 // 事件触发方式

viewmodel.get(cItemName).on('事件名',function(){

// 回调函数

})

// 鼠标划上去的title值显示，配置在cStyle的popTitle

"cStyle": "{\"popTitle\":\"提示消息"}"

## [](#6-附录)6. 附录：

TinperNext - calendar 链接地址：[https://yondesign.yonyou.com/website/#/detail/component/wui-calendar/other](https://yondesign.yonyou.com/website/#/detail/component/wui-calendar/other)

## [](#7-faq)7. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...