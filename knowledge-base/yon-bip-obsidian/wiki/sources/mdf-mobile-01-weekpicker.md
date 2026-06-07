---
title: "年周日历 WeekPicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-weekpicker"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 年周日历 WeekPicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-weekpicker | 所属：移动组件

# [](#年周日历-weekpicker)年周日历 WeekPicker

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/WeekPickernianzhourili-image1.6f262c18.jpeg)

## [](#2-基本属性)2. 基本属性

### [](#21-在单据中)2.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||bShowIt||是否显示||boolean||true-显示 false -隐藏|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||cDefaultValue||默认值||数组||默认设置状态，结构如下图|
||showType||年周日历类型||string||month月显示（默认），week周显示|
||disableWeekView||禁用周视图面板||boolean||true禁用，false不禁用（默认）|
||mutiple||多选||boolen||选择多个日期|
||extraCell||扩展组件脚本||funciton||自定义日期组件|
||extraCellHeight||扩展组件高度设置||number||自定义高度显示|
||onTouchEnd||左右滑动事件||function||接收2个参数，当前月/周的第一天和最后一天|
||onClick||点击日期||function|||
||changeMonth||操作栏切换月份||function|||
||flag||当前是否是周日历，操作栏切换使用||boolen||false默认月视图，true是周日历|

### [](#22-拓展属性-cstyle)2.2. 拓展属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||specialWeekPicker||日期显示提前一周或2周||Number||7提前一周，14提前2周|
||disableMoveY||禁止纵向滑动||boolean||false默认不禁用，true 禁用|

### [](#23-markdatas数据格式及说明)2.3. markDatas数据格式及说明

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||markType||圆形状态||string||circle空心圆、dotted虚线圆|
||markText||文本设置||数组||文本及颜色方位设置|
||markDot||底部显示圆点||数组||圆点颜色及个数，表示任务个数|
||style||设置css属性||object||圆形的边框色、以及日期的颜色等。|

[

 { markType: ['circle'], date: '2022-4-21', markText: ['起', 'green', 'topRight'], markDot: ['red', 'blue'], style: { borderColor: 'blue' } },

 { markType: ['circle', 'dotted'], date: '2022-4-22', style: { borderColor: 'red' } },

 { markType: ['dotted'], date: '2022-4-24', style: { borderColor: 'green' } },

 { markType: ['dotted'], date: '2022-4-25' },

 { date: '2022-4-26', style: { color: 'green' } },

]

## [](#3-控制示例)3. 控制示例

### [](#31-在卡片中)3.1. 在卡片中

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

 

// 设置值

viewmodel.get(cItemName).setValue(value)

 

// 点击事件

viewmodel.get(cItemName).on('cellExtraDate', (time) => {})

 

// 作右滑动事件

viewmodel.get(cItemName).on('touchEnd', (time) => {})

 

// 上下滑动切换月周事件

viewmodel.get(cItemName).on('pickerToggle', (time) => {})

 

// 操作栏切换月事件

viewmodel.get(cItemName).on('changeMonth', (currentMonth) => {})

 

// 设置markData

viewmodel.get(cItemName).setState('markDatas',[{ date: '2022-4-26', style: { color: 'green' } }])

 

// 取当前面板的日历数据

viewmodel.get(cItemName).get('cacheCurrentArray')

 

// 默认当前展示的月份面板

viewmodel.get(cItemName).setState({'setDate':'2023-3-01'})

 

// 当前日历月份提前一周展示

viewmodel.get(cItemName).setState({'specialWeekPicker': 7})

 

// 禁用月份切换

viewmodel.doPropertyChange('disableMonthToggle', {disableOperate: 'prev/next', disabledMonth: '2024-05'})

### [](#32-在查询区中)3.2. 在查询区中

在查询区中，我们可以通过间接的方式获取到组件模型，然后对其进行页面操作，查询区模型获取方式参考文档[ConvenientQuery查询区](#/components-web/05-convenientquery)，获取到查询区模型之后，可以通过查询区模型获取到下面挂载的子模型。

const itemModel = filterViewModel.get(itemName).getFromModel()

 

// 设置查询条件禁用

itemModel.setDisabled(true)

 

// 设置查询条件只读

itemModel.setReadOnly(true)

 

// 改变值

itemModel.setValue('新的value')

 

filterViewModel.get(itemName).getFromModel().on('afterValueChange', () => {

 viewmodel.on('cellExtraDate', (time) => {})

})