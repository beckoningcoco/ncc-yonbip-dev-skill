---
title: "图片上传 PictureUpLoad"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-pictureuploadt"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 图片上传 PictureUpLoad

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-pictureuploadt | 所属：Web组件

# [](#图片上传-pictureupload)图片上传 PictureUpLoad

## [](#1-功能说明)1. 功能说明

主子表的图片组件，属于基础组件。在billitem_base中配置，cControlType等于'pictureupload'

关键参数：objectId: uuid 关联附件的关键字 | objectName：业务类型（到协同注册）

objectName = cStyle.objectName || 'caep'

数据格式
"{"fileID":"4bede9a0-19ed-11ed-b7fa-0b149e92c695","fileList":[{"name":"d.jpg"},{"name":"d.jpg"},{"name":"d.jpg"},{"name":"d.jpg"},{"name":"d.jpg"},{"name":"d.jpg"}]}"

## [](#2-效果展示)2. 效果展示

### [](#21-主表中展示)2.1. 主表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PictureUpLoadtupianzujian-image1.b5eb0689.jpeg)

### [](#22-子表中展示)2.2. 子表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PictureUpLoadtupianzujian-image2.06ca1a55.jpeg) →点击即可预览![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PictureUpLoadtupianzujian-image3.a28ac7aa.jpeg)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
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

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||objectName||调用方业务类型||string||'caep'||领域自己到协同注册,然后配置到consul配置中心的appCode字断上|
||singleImageSize||单个文件最大上传size||number||5242880||单位kb|
||maxQuantity||最大上传个数||number||5|||
||uploadable||是否允许上传||boolean||true||默认允许上传|
||deleteable||是否允许删除||boolean||true||默认允许删除|
||uploadButIcon||上传图标||string||tianjiashuliang||上传按钮iconName|
||fileType||上传类型||string||'image/gif,image/jpeg,image/png,image/x-ms-bmp'|||
||uploadButText||上传控件说明文字||string||点击上传|||

## [](#5-扩展事件)5. 扩展事件

||事件名称||事件说明||传递参数||参数说明|
||onChange||图片上传中触发事件||predicateValue||选择的是那一项|
||beforeUpload||图片上传之前触发事件||info||![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PictureUpLoadtupianzujian-image4.e5ed4666.jpeg)|

## [](#6-faq)6. FAQ

**常见问题1 ?**[附件使用文档](#/components-web/05-fujianshiyongwendang)

解答内容...

**常见问题2 ?**

解答内容...