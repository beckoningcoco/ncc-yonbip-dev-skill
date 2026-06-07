---
title: "附件 Filelist"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-filelist"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 附件 Filelist

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-filelist | 所属：Web组件

# [](#附件-filelist)附件 Filelist

## [](#1-功能说明)1. 功能说明

主子表的附件组件，属于基础组件。在billitem_base中配置，cControlType:
'filelist'表中配置

关键参数：objectId: uuid 关联附件的关键字 |
objectName：业务类型（到协同注册）

objectName = env环境变量中的appCode || 'mdf'.
appCode配置在consul配置中心

## [](#2-效果展示)2. 效果展示

说明：支持在新增、编辑、浏览态下使用（默认在浏览态下不可以上传、删除操作）

### [](#21-主表中展示)2.1. 主表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Filelistfujian-image1.da0b4c9b.jpeg)

### [](#22-子表中展示)2.2. 子表中展示

#### [](#221-只展示上传文字)2.2.1. 只展示上传文字

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Filelistfujian-image2.bc862f43.png)

#### [](#222-数值类型展示)2.2.2. 数值类型展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Filelistfujian-image3.7e609bdb.jpeg)

#### [](#223-行附件弹窗)2.2.3. 行附件弹窗

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Filelistfujian-image4.66e0ac0a.jpeg)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||disabled||禁用（置灰）||string||false||附件操作按钮是否可用删除、上传|
||bCanModify||是否可编辑||boolean||true||附件操作按钮是否可用删除、上传|
||uncopyable||是否可复制||boolean||true||0 可以 1 不可以 默认不可以|
||className||容器元素的className||string||无|||

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||bindEcsuite||是否展示附件个数||boolean||false||适用于子表|
||bindEcsuite||是否展示附件个数||boolean||false||适用于列表页voucherlist同时要配置|
||columnId||列表页附件展示数量配置||string||’‘||对应字断的cItemName|
||disabledBatchDownload||禁止批量下载||boolean||false||默认不禁止|
||enablePersonalLimit||是否限制删除别人上传的附件||boolean||true||默认true|
||examinedNoUpload||审批成功后是否继续上传|||||||
||hideTitle||是否展示左侧label||boolean||true|||
||objectName||调用方业务类型||string||'mdf'||领域自己到协同注册,然后配置到consul配置中心的appCode字断上|
||otherSetting||协同附件组件支持参数||object||{}||具体可参考说明：这里的参数参考协同的文档，或者咨询宋磊这里配置的参数会透传给协同组件，平台不是每个属性都单独对接了|
||privateTableUploadInBrowse||是不是可以在浏览态上传附件||boolean||false||适用于子表|
||privateUploadInBrowse||是不是可以在浏览态上传附件||boolean||false||适用于主表|
||showFileName||行附件限制一个附件时是否展示名称||boolean||false||默认不展示|
||uploadFile||是不是可以在浏览态上传附件||boolean||false||适用于子表需要很多条件满足uploadInBrowse: true(prams里的), uploadFile: true, readOnly: true|

## [](#5-othersetting--otherssettings)5. otherSetting || otherSsettings

### [](#51-扩展字断)5.1. 扩展字断

||||属性名称||属性含义||值类型||默认值||属性说明|
||||属性名称||属性含义||值类型||默认值||属性说明|
||1||canDownloadSecurityFile||是否允许下载密级附件||boolean||true||默认允许|
||2||uploadText||主表附件上图1位置文字||string||无||见上图|
||3||enableSecurityLevel||是否展示密级||boolean||false|||
||4||foldStatus||是否展开||boolean||true||默认展开|
||5||maxCount||可上传最大数量||number||无|||
||6||maxSize||文件最大size||number||102400||默认（100M）单位kb, 注意是数字类型，并且xM就是 1024* x|
||7||format||支持上传的文件类型||array||无||默认无限制 可以设置eg:["jpg","png","pdf"]|
||8||canEdit||是否可编辑||boolean||false||默认不可编辑|
||9||canSetValueOnFirst||是否初始化的时候生成值||boolean||faslse||默认是false,在上传后生成值|
||10||usePrivateBucket||是否使用私有桶上传||boolean||true||默认私有上传|
||11||enableBatchDelete||是否开启批量删除||boolean||false||默认不开启|

### [](#52-扩展属性-extprops)5.2. 扩展属性 ExtProps

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||deleteable||是否可删除||boolean||true||附件删除按钮是否可用|
||downloadable||是否可下载||boolean||true||附件下载按钮是否可用|
||subuitype||套件类型||string||无||取值范围 'file'|
||batchDownload||是否可以批量下载||boolean||false||附件批量下载是否可用，默认不可以|

### [](#53-其他配置)5.3. 其他配置

单据上所有附件浏览态都可上传、删除文件配置：在parameter列上配置uploadInBrowse
：true

根据组件区分可以通过上面配置单独设置

- 使用子表行附件需配置：viewmodel._set_data('addAttachment', true)

### [](#54-附件常见问题说明)5.4. 附件常见问题说明

- Q：附件上传成功保存单据，再次查看发现附件上传的找不到了

A：页面不走平台绑定领域需要主动调
cb.utils.bindAttachmentAfterSave(viewmodel, 保存后数据) 保存后数据 =
{id: 'XXXXX', ....}