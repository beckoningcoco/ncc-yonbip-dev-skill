---
title: "附件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-filelistimagelist"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 附件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-filelistimagelist | 所属：移动组件

# [](#附件图片-filelistimagelist)附件|图片 FileList｜ImageList

## [](#1-功能说明)1. 功能说明

- **功能：支持多张图片上传，或者附件上传， 也可进行删除重新上传**
- **说明： 服务端需要存储附件字断 ，是个字符串 uuid**
- **示例：ea02b3db-9670-4194-95df-b39a6058a551**

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FileListImageListfujian_tupian-image1.4bda5fdb.jpeg)

## [](#3-适用范围)3. 适用范围

- 

### [](#31-主表附件)3.1. 主表附件

- 

### [](#32-子表附件)3.2. 子表附件

## [](#4-使用配置)4. 使用配置

### [](#41-使用组件基础配置)4.1. 使用组件基础配置

- **[billitem_base]**表中 **cControlType: "filelist" | "imagelist"**
- **consul**配置中心配置**appCode**每个领域独立的**code**

## [](#5-基本属性)5. 基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||cShowCaption||附件title展示文字||string||''|||

## [](#6-扩展属性-cstyle)6. 扩展属性 cStyle

[协同文件服务组件说明](https://ec-u8c-daily.yyuap.com/fe/fileservice-doc/mobile/components/params.html)

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||maxCount||最多上传附件个数||number||无|||
||maxSize||附件最大上传||number||100M|||
||uploadType||image||||file 默认是image类型 什么类型展示||string|
||imageSourceType||['album', 'camera', 'file'] uploadType是image类型时图片来源是什么图片来源（图库/拍照），数组类型, album：图库；camera：'拍照'；file：'打开本地文件'；video：'拍照视频 '能否上传文件取决于 mtl 桥接方式。具体可以咨询王英良老师。查看支持情况||array||['album', 'camera', 'file]|||
||watermark||水印||object||{text:' ', font: 20, position:'5', color: '#ffffff', alpha: '0.5'}|||
||isCompress||上传是否启用压缩||boolean||false|||
||showCount||默认显示几张图片||number||4|||
||privateUploadInBrowseuploadInBrowseCanDisabledenablePersonalLimit||浏览态是否可上传浏览态是否可上传并且不受disabled的限制自己上传的附件是否限制别人可以删除||booleanbooleanboolean||falsefalse审批状态下默认是true，其他默认false||false 不可以 true 可以false 不可以 true 可以true 别人不可以删除，false|
||listItemCanUpload||是不是在子表行上可以上传附件||boolean||false||true可以 false不行|
||customBindInfo||关联pc单据附件配置如下||object||无||customBindInfo : {needBind: true, // 是不是要关联单据ID}|
||needTemp||是不是使用临时态||boolean||true||false 不使用临时上传 true 使用临时上传附件默认是要使用临时态的，所以当特殊的单据 编辑后不走平台公共保存需要领域扩展处理1、移动端附件临时态功能适配2、或者配置这个字段让他不使用临时态|
||otherSetting||协同附件组件支持参数||object||{}||具体可参考下表|

### [](#61-othersetting-扩展字段)6.1. otherSetting 扩展字段

**附件新增的一些配置属性可以通过这个配置，与上面的cStyle里的关系是取并集，这里的配置优先级高**

||属性名称||属性含义||值类型||默认值||说明|
||usePrivateBucket||是否使用私有桶上传||boolean||true ||默认私有上传|

#### [](#611-1扩展脚本动态控制组件水印)6.1.1. 1.扩展脚本动态控制组件水印

// 协同附件组件加载完成触发组件的componentDidMount事件，扩展脚本监听该事件,

// 组件将当前协同附件的实例传入监听事件ecsuiteComponentInstance

this.props.model.on('componentDidMount', (ecsuiteComponentInstance) => {

 ecsuiteComponentInstance.updateConfig({

 isMustUpload: 'false', // 是不是必输 动态设置

 isCompress: false, // 非必传

 imageSourceType: ['album', 'camera'] // 非必传

 watermarkCallBack: () => { // 动态改水印

 return {

 text: ' ',

 font: 20,

 position: '5',

 color: '#ffffff',

 alpha: 0.5

 }

 }

 })

})

#### [](#612-2组件按钮权限)6.1.2. 2.组件按钮权限

// 配置参数

1. downloadable: 是否可下载 [billitem_base]表中cExtProps字断配置downloadable：true 默认可以下载

2. deleteable: 是否可删除 [billitem_base]表中cExtProps字断配置deleteable：true,默认可以删除

3. disabled // 是否禁止

4. bCanModify // 是否可修改

5. isBrowse = mode === env.VOUCHER_STATE_BROWSE; 是不是浏览态

// 按钮权限判断组成

canDownload：downloadable，

canDelete：!disabled && bCanModify && deleteable && !isBrowse

canUpload: !disabled && bCanModify && !isBrowse

#### [](#613-3扩展脚本动态控制按钮权限)6.1.3. 3.扩展脚本动态控制按钮权限

// 协同附件组件加载完成触发组件的componentDidMount事件，扩展脚本监听该事件,

// 组件将当前协同附件的实例传入监听事件ecsuiteComponentInstance

this.props.model.on('componentDidMount', (ecsuiteComponentInstance) => {

 ecsuiteComponentInstance.updateAuth({

 auth: {

 canDownload: true, // 自己控制

 canDelete: true,

 canUpload: true, 

 }

 })

})

#### [](#614-4获取附件数量)6.1.4. 4.获取附件数量

this.props.model.on('componentDidMount', (ecsuiteComponentInstance) => {

 const count = ecsuiteComponentInstance.getFileListCount();

})