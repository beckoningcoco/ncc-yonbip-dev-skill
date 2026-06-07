---
title: "日期时间 DateTimePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-datetimepicker"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 日期时间 DateTimePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-datetimepicker | 所属：Web组件

# [](#日期时间-datetimepicker)日期时间 DateTimePicker

## [](#1-功能说明)1. 功能说明

通过鼠标选择日期和时间，是最基础的表单域组件

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/DateTimePickerriqishijian-image1.eeb8d084.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||cFormatData||日期时间格式||||YYYY-MM-DD HH:mm:ss|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||style||自定义日期框的样式||object||{width: '200px',height:'20px' }|
||showTime||时间面板的设置||object||时、分、秒的隐藏以及间隔详细使用可查看tinpernext官网|
||timeRules||时间面板的禁用设置，类似于日期组件的rules||object||时分秒面板的禁用控制规则时间区间均为闭区间timeRules: {  disabledHours: [8, 18], // 禁止的小时范围  disabledMinutes: [30, 60], // 禁止的分钟范围  disabledSeconds: [10, 30], // 禁止的秒范围  enabledHours: [8, 18], // 允许的小时范围  enabledMinutes: [0, 30], // 允许的分钟范围  enabledSeconds: [0, 30] // 允许的秒范围}map中的六个key随便组合，但是尽量精简，按需配置，别多配也别少配，此属性可以配置到cStyle中，也可以通过脚本修改viewmodel.get('对应字段').setState('timeRules', {组装好的timeRules对象})示例：viewmodel.get('对应字段').setState('timeRules', {disabledMinutes: [30, 60]})|

其他属性设置及方法参考 [DatePicker日期](#/components-web/01-datepicker)

||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||disabled||禁用（置灰）||string||false||是否可用删除、上传|
||bCanModify||是否可编辑||boolean||true||是否可用删除、上传|
||readOnly||是否只读||boolean||false||是否可用删除、上传|
||className||容器元素的className||string||无|||
||visible||是否显示||boolean||true|||
||hideTitle||是否隐藏label||boolean||false|||
||cShowCaption||label说明文字||string||无|||
||bIsNull||是否允许为空||boolean||true|||

## [](#5-faq)5. FAQ

**常见问题1
详情页中的日期组件我想在选择的时候，时分秒面板不是当前时间，是00:00:00或者我指定的时间怎么做呢？**

配置showTime即可，showTime对象中defaultValue指定一个时间就可以了，可以配置cStyle，也可以通过脚本直接拿到对应字段的模型model.setState('showTime',
{defaultValue: '00:00:00'})

MDF设计器中这样配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/DateTimePickerriqishijian-image2.75df845f.png)