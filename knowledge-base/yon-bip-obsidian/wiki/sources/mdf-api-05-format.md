---
title: "格式化 Format"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-format"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 格式化 Format

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-format | 所属：API

# [](#格式化-format)格式化 Format

随着BIP业务范围的开展，MDF结合基础组件改进了新的国际化能力，此API目的是实现日期时间进行时区转换的行为。

## [](#1-约定以及注意事项)1. 约定以及注意事项

- 约定timepicker、datepicker时区不敏感（无需根据首选项转换时区），即纯时间数据，纯日期数据，不对时区敏感，只有日期时间格式对时区敏感。如果业务方需要组装此类数据进行前端回显，需要考虑工作台首选项时区，就用此文的API实现。
- 所有与服务端的数据交互，以及前端模型内的日期时间数据，均为服务端时区，不是工作台首选项时区。工作台首选项时区仅为展示作用。因此，业务方传递给MDF模型，或者传给后端的任何日期时间，一定要处理成服务器时区数据，以及标准日期格式，否则会数据错误。
- 日期时间或者日期或者时间，都是有自己的格式的。MDF严格遵守日期数据和format完全一致，界面展示才能正确。例如：`2023-12-02 12:00:00`（YYYY-MM-DD HH:mm:ss），而不是`2023-12-02 12:00:00`（DD-MM-YYYY HH:mm:ss）这种日期和格式不对应的数据。
- MDF之前时区转换使用的API为`cb.getDateFormat()`，由于历史原因，该API已经废弃，请领域自查并尽快修改为新API。`getDateFormat`有时区转换和格式化的能力，但是参数太复杂且时区转换算法有局限性，因此废弃。替代方案为通过该时区转换API进行时区转换后，再取出value进行format处理。如果简单格式化，无转时区的需求，直接使用moment格式化即可。

**Q: 如何获取工作台首选项格式？**

**A:**
直接通过工作台`cb.context.global.getDataFormat()`获取到的时间格式有小写，前端直接拿这种格式转换是有问题的，因此用另一个API：`cb.format.getGlobalFormat`。

cb.format.getGlobaFormat('dateTimeFormat') // 获取工作台首选项日期时间格式

cb.format.getGlobaFormat('dateFormat') // 获取工作台首选项日期格式

![示例](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuaFormat1.cc754481.png)

## [](#2-js-api说明)2. JS API说明

该方法接收4个参数：`value`，`format`，`timezone`，`serverTimezone`。

- value, format为必填，value为日期，format为对应日期的格式
- timezone，serverTimezone选填，timezone为工作台首选项时区，获取方式为cb.context.global.getDataFormat().timezone, serverTimezone为服务端时区，获取方式为window.jDiwork.diworkContext().serverTimezone

**该API可以将服务器时区的时间转换为工作台首选项时区**

## [](#3-js-api使用方式)3. JS API使用方式

cb.format.transferDatetimeTimezone = ({

 value,

 format,

 timezone = 'Asia/Shanghai',

 serverTimezone = 'Asia/Shanghai'

}: {

 value: string | Moment // string类型视为serverTimezone构造moment， Moment类型将调整为工作台时区显示

 format: string

 timezone?: string // 工作台时区

 serverTimezone?: string // 服务端存储时区

}) => {

 // code

 return {

 deviceUTC, // 设备时区 及 UTC秒差

 diworkUTC, // 工作台时区

 serverUTC, // 服务端存储时区

 valueUTC, // 值对应时区

 value: valueMoment // 调整为工作台时区的时间

 }

}

- cb.format.transferDatetimeTimezone 接受一个对象作为参数，分别是日期时间字符串 value， 日期时间格式 format，工作台首选项时区 timezone， 服务器数据时区 serverTimezone。
- 返回值分别是设备时区以及秒差值，工作台时区及UTC秒差值，服务端时区及UTC秒差值，传入值时区以及UTC秒差值，最后转换为工作台首选项时区的value（moment对象）

示例：

![示例](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuaFormat2.2eec926a.png)

接下来使用上海时区转东京时区进行测试：

![示例](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuaFormat3.cc1c1f15.png)

传入字符串和moment对象都是同样的结果：

![示例](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuaFormat4.cd0601b2.png)

并且支持夏令时问题：

![示例](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuaFormat5.bdca7b30.png)

**Q: 不了解夏令时的同学看到上面的结果可能会疑惑，为什么上海时区转东京时区得到的结果是一致的呢？**

**A:** 原因是，北京在1990年7月1日这个时间是处于夏令时实行时期，在UTC+8的基础上会多加一小时，因此和东京时区是一致的，所以结果一致。

特别说明：timezone和serverTimezone转换的时候，是用作渲染时，如果是自定义的扩展日期时间组件，想回传给后端正确的时区，可以将timezone和servertimezone参数反过来，比如说：

目前客户端是东13区，服务端是东8区，那么用户在选择了客户端的15:00:00的时候，传给服务端的时间应该是15 - 5 = 10:00:00才对，因此可以将serverTimezone传一个东13区的timezone，timezone传一个东八区的timezone，即可完成反向转换。

**可以去工作台，打开浏览器控制台试试，实践出真知！**