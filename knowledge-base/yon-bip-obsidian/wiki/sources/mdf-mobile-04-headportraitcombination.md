---
title: "头像组合 HeadPortraitCombination"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-headportraitcombination"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 头像组合 HeadPortraitCombination

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-headportraitcombination | 所属：移动组件

# [](#头像组合-headportraitcombination)头像组合 HeadPortraitCombination

## [](#1-功能说明)1. 功能说明

头像展示组件，提供 纯姓名，纯头像，头像+姓名，头像+姓名+职位
几种展示方式。

展示类组件，不提供编辑上传更改等功能。对应模型为 TagModal,
数据按tag类型存储在拓展子表上。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/HeadPortraitCombinationtouxiangzuhe_image1.de0aa598.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/HeadPortraitCombinationtouxiangzuhe_image2.0c680664.png)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||visible||可见状态||bool||true||-|
||bShowIt||是否展示||bool||true||-|
||cControlType||HeadPortraitCombination||string||-||-|

## [](#4-扩展属性)4. 扩展属性

||属性名称||属性含义||值类型||默认值||属性说明|
||subUiType||展现形式||string||pureName||pureName (纯姓名)pureAvatar (纯头像)avatarName (头像+姓名) avatarNameJobTitle (头像+姓名+职位)|
||multipleDataSets||多数据聚合方式||string||concentrated||concentrated (集中) scattered (分散)|
||nameField||姓名字段||string||name||控制效果与 disabled 相反|
||genderField||性别字段||string||gender||true 不必输，false 必输|
||jobTitleField||职位字段||string||jobTitle||按输入框内容搜索|
||HeadPortraitUrlField||头像url字段||string||HeadPortraitUrl||false 时点输入框直接打开参照|
||showNameLen||名字显示字数 倒数||number||2||默认显示姓名后两位|
||concentratedOverviewShowLen||展示时概览展示的数量||number||3||--|

## [](#5-事件)5. 事件

**点击人员**

model.on('perSonClick', (perSonInfo) => {

 // perSonInfo 为点击的人员的全部信息，交互逻辑自定义拓展

 ...

 xxx

 ...

})