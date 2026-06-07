---
title: "日期 DatePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-datepicker"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 日期 DatePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-datepicker | 所属：Web组件

# [](#日期-datepicker)日期 DatePicker

## [](#1-功能说明)1. 功能说明

通过鼠标选择日期，是最基础的表单域组件

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/DatePickerriqiimage1.6040a8cb.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||cDefaultValue||默认值||string||默认日期|
||showTime||时分秒面板参数||boolean/Object||参考tinper基础组件的参数及效果|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":
true}

||属性名称||属性含义||值类型||属性说明|
||cFormatData||日期面板格式-支持年、月、日||||面板选项默认YYYY-MM-DD、可设置YYYY-MM，YYYY，自定义组件格式需要配合bEnableFormat属性*|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||dropdownClassName||日期面板类名||string||日期弹窗类名|
||className||扩展class类名||string||用来处理扩展样式|
||size||按钮大小||string||默认default，可选 small、large|
||footerDom||支持日期面板底部扩展||||用来处理日期弹窗底部扩展dom|
||rules||日期支持配置不可用区间||||['before','today','after']|
||bEnableFormat||控制日期格式读取cFormatData或工作台首选项格式||||默认为false，false的时候组件格式以工作台首选项为标准，不以cFormatData格式为准*|
||minuteStep||分钟步长||||默认1|

bEnableFormat和cFormatData是配合使用的一对属性；当bEnableFormat为false的时候，组件的格式取工作台首选项值，cFormatData只决定组件面板类型（比如年，年-月，年月日等选择器），当bEnableFormat为true的时候，cFormatData既决定面板类型，又决定组件格式，请悉知。

## [](#5-控制示例)5. 控制示例

### [](#51-在卡片中)5.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get('xxx').setVisible(false)

// 设置条件禁用

viewmodel.get('xxx').setDisabled(true)

// 设置值

viewmodel.get('xxx').setValue('设置的值')

### [](#52-设置禁用日期可以在cstyle中配置也可以通过扩展脚本干预)5.2. 设置禁用日期(可以在cstyle中配置,也可以通过扩展脚本干预)

//1、设置禁用今天之前的日期

viewmodel.get('xxx').setState("rules",['after', 'today'])

//2、设置禁用今天之后的日期

viewmodel.get('xxx').setState("rules",['before'])

//3、设置禁用今天之前的日期，今天不能选择

viewmodel.get('xxx').setState("rules",['after'])

//4、设置区间日期可以选择

viewmodel.get('xxx').setState("rules",['2022-08-10','2022-08-31'])

//5、设置固定日期前的日期不可选,比如设置2022-07-15前的日期不可选

viewmodel.get('xxx').setState("rules",['2022-07-15','9999-12-31'])

//6、设置区间日期不可选

cStyle里配置ruleType为and

viewmodel.get('xxx').setState("rules",['2022-07-15','9999-12-31'])

## [](#6-faq)6. FAQ

### [](#61-查询区日期组件比较符为区间时组件将换为rangepicker1框架内部组件这个时候如何设置禁用日期呢)6.1. 查询区日期组件比较符为区间时，组件将换为Rangepicker1（框架内部组件），这个时候如何设置禁用日期呢？

规则还是和Datepicker的一致，需要在扩展脚本中配置rules，具体代码如下：

FilterViewModel.get('对应的itemName').getFromModel().setState('rules',['before', 'today']) // 设置未来日期不可选（包含今天和过去）

// 这里fromModel和toModel无所谓，哪个都行，一般用fromModel去改state

// FilterViewModel是查询区的viewModel

### [](#62-rules规则不满足业务需求如何解决)6.2. rules规则不满足业务需求，如何解决？

自行扩展disabledDate function，怎么写参考TinperNext
组件官网的datepicker组件，扩展方式支持cStyle和扩展脚本；

cStyle方式：在cStyle中配置{"extDisabledDate":"自定义function的字符串"}，这种方式可能会对数据库造成较大存储压力，因此不推荐。

推荐扩展脚本方式：

viewModel.get('vouchdate').setState('extDisabledDate', function mydisabled (current, args) {

 // TODO

});

 

// current为钉耙组件传的参数，当前moment对象，args是MDF日期组件的整个state，按需自取