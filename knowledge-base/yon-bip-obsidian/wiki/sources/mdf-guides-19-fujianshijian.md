---
title: "附件事件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianshijian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 附件事件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianshijian | 所属：指南

# [](#附件事件)附件事件

## [](#1-web组件)1 Web组件

### [](#11-初始化或者更新-beforecreateattachmentdata)1.1 初始化或者更新 beforeCreateAttachmentData

附件组件初始化或者更新时候需要修改传入objectId的事件

/**

* data: 当前附件数据

* config: 当前组件配置信息

*/

viewmodel.on('beforeCreateAttachmentData', ({ data, config }) => {

 data.objectId = 'xxxxx'; // 修改objectId

 data.ieTemp = true; // 是不是用临时值上传

 data.tempObjectId = 'xxxx11'; // 临时值

})

### [](#12-beforerenderfilecomponent)1.2 beforeRenderFileComponent

组件加载之前处理authI等权限相关参数， authI不需要可以如下面处理

this.viewModel.on('beforeRenderFileComponent', (obj) => {

 obj.authId = ''; //

});

### [](#13-beforechangecomponentdata)1.3 beforeChangeComponentData

组件加载之前处理给组件添加新参数或修改组件参数

this.viewModel.on('beforeChangeComponentData', (obj) => {

});

### [](#14-获取协作套件实例ecsuitedidmount)1.4 获取协作套件实例ecsuiteDidMount

获取协作套件实例

viewmodel.on('ecsuiteDidMount', function ({ ecsuiteComponent }) {

 ecsuiteComponent.then(function(ins) {

 // ins附件实例

 })

})

### [](#15-获取filelist实例-filelistcitemnamedidmount)1.5 获取filelist实例 filelist${citemName}DidMount

获取filelist实例

eg: 如果citemName=fujian 监听名称就是 'filelistfujianDidMount'

viewmodel.on(`filelist${citemName}DidMount`, function ({ecsuiteComponent }) {

 ecsuiteComponent.then(function(ins) {

 // ins附件实例

 })

})

### [](#16-上传前事件-beforefilelistupload)1.6 上传前事件 beforeFileListUpload

上传前事件

@params fileData 上传返回的参数

@params obj 当前filelist组件的一些参数

viewmodel.on('beforeFileListUpload', function (data) {

 // 领域修改上传附件名称

 const fileData = data.fileData;

 const newNam = '新附件名称'

 const newFile = new File([fileData], newName, { type: file.type });

 data.fileData = newFile;

 // -- end --

})

### [](#17-上传成功事件-afterfileuploadsuccess)1.7 上传成功事件 afterFileUploadSuccess

上传成功事件

filelist或者imagelist组件事件

@params file 上传成功返回的参数

没有模型走这个

viewmodel.on('afterFileUploadSuccess', function ({ file }) {})

有模型走这两个

simpleModel.on('afterFileUploadSuccess', function({ file }) {})

viewmodel.on('ecsuiteFileChange', function ({

 viewModel

 data,

 file,

 type, // 'upload'是上传 'delete'是删除

 childrenFieldId,

 cItemName,

 objectId,

 objectName

 }) {

 // 通过type区分是上传还是删除 upload 上传 delete 删除

 if (type == 'upload') {

		if (!cItemName) {

			// 协作套件

		} else if (cItemName == 'xxx') {

			// 某个主表或者子表的字段

		}

	} else if (type == 'delete') {

		if (!cItemName) {

			// 协作套件

		} else if (cItemName == 'xxx') {

			// 某个主表或者子表的字段

		}

	}

})

ecsuite协作套件删除成功事件

viewmodel.on('afterFileUploadSuccess', ({ file }) => {

	

})

### [](#18-删除前事件-beforedeletecallback)1.8 删除前事件 beforeDeleteCallBack

删除前事件

@params data 返回的参数

viewmodel.on('beforeDeleteCallBack', function (data) {})

### [](#19-删除成功事件-afterfiledeletesuccess)1.9 删除成功事件 afterFileDeleteSuccess

删除成功事件

filelist或者imagelist组件事件

@params file 上传成功返回的参数

没有模型走这个

viewmodel.on('afterFileDeleteSuccess', function ({ file }) {})

有模型走这两个

simpleModel.on('afterFileDeleteSuccess', function({ file }) {})

viewmodel.on('ecsuiteFileChange', function ({

 viewModel

 data,

 file,

 type,

 childrenFieldId,

 cItemName,

 objectId,

 objectName

 }) {

 // 通过type区分是上传还是删除 upload 上传 delete 删除

 if (type == 'upload') {

		if (!cItemName) {

			// 协作套件

		} else if (cItemName == 'xxx') {

			// 某个主表或者子表的字段

		}

	} else if (type == 'delete') {

		if (!cItemName) {

			// 协作套件

		} else if (cItemName == 'xxx') {

			// 某个主表或者子表的字段

		}

	}

})

ecsuite协作套件删除成功事件

viewmodel.on('afterFileDeleteSuccess', ({ fileId }) => {

	

})

### [](#110-密级事件-beforesecurityattachmentoperation)1.10 密级事件 beforeSecurityAttachmentOperation

密级事件

@params file 返回的参数

viewmodel.on('beforeSecurityAttachmentOperation', function (file) {})

### [](#111-预览前事件-beforepreviewcallback)1.11 预览前事件 beforePreviewCallBack

预览前事件

@params fileData 返回的参数

@params params 附件组件的数据，可能扩展时候需要

viewmodel.on('beforePreviewCallBack', function ({fileData, params}){})

### [](#112-下载前-beforedownloadcallback)1.12 下载前 beforeDownloadCallBack

下载前

@params fileData 下载返回的参数

@params params 当前filelist组件的一些参数

viewModel?.on('beforeDownloadCallBack', (obj) => {

 obj.zipName = 'dddddd'; // 将附件下载的名称修改为dddddd

});

### [](#113-批量下载前-beforebatchdownload)1.13 批量下载前 beforeBatchDownload

批量下载前

@params obj 领域需要修改的数据

@params filesInformation 下载返回的参数

viewmodel.on('beforeBatchDownload', (obj, filesInformation) => {})

## [](#2-行附件)2 行附件

### [](#21-弹窗保存时触发-beforetableattachmenthandleok)2.1 弹窗保存时触发 beforeTableAttachmentHandleOk

弹窗保存时触发

// @params uploadList 上传的数组

// @params deleteList 删除的数组

// @params data 行附件的所有信息

viewmodel.on('beforeTableAttachmentHandleOk', ({

 uploadList,

 deleteList,

 data

 }) => {

})

## [](#3-移动端组件)3 移动端组件

### [](#31-修改水印-beforewatermarkcallback)3.1 修改水印 beforeWatermarkCallBack

修改水印（选择照片或者拍照，会调用）

@params data 当前协同组件组件接收的几乎所有参数

@params config 当前协同组件的所有配置

@params obj 当前需要修改的对象 obj.watermark =

viewModel.on('beforeWatermarkCallBack', (data, config, obj) => {

 // obj = 自己修改

})

### [](#32-上传成功事件-afterfileupload)3.2 上传成功事件 afterFileUpload

上传成功事件

@params file 上传返回的参数

@params model 当前filelist组件的模型

// 注意是viewmodel.不是simpleModel

viewmodel.on('afterFileUpload', function ({ file, model}) {

})

### [](#33-上传失败事件-afterfiledelete)3.3 上传失败事件 afterFileDelete

上传失败事件

@params fileId 删除返回的参数

@params model 当前filelist组件的模型

// 注意是viewmodel.不是simpleModel

viewmodel.on('afterFileDelete', function ({ fileId, model}) {

})

### [](#34-组件实例后事件-componentdidmount)3.4 组件实例后事件 componentDidMount

组件实例后事件

没有模型走这个

viewmodel.on('componentDidMount', function (ins) {

 ins?.getFileListCount();

})

有模型走这两个

simpleModel.on('componentDidMount', function (ins) {

 ins?.getFileListCount();

})

viewmodel.on('componentDidMount', function (ins) {

 ins?.getFileListCount();

})

### [](#35-组件初始化前事件-beforefilelistdidmount)3.5 组件初始化前事件 beforeFileListDidMount

组件初始化前事件，目的是给组件传递特殊参数

// 注意是viewmodel.不是simpleModel

viewmodel.on('beforeFileListDidMount', function (obj) {

 // 比如需要给组件传微信相关参数

 obj.wxConfig = {

 appId:Xx

 secret：Xx

 url：window.location.origin+'/iuap-yonbuilder-mobile/rest/v1/wechat/api/getticket

 }

})

## [](#4-按钮型附件)4 按钮型附件

### [](#41-附件打开事件)4.1 附件打开事件

viewmodel.on('beforeAttachment', (data) => {

 const attachmentObj = data.attachmentObj || {}

 attachmentObj.auth.canDelete = true; // 是否可以删除 可以

 attachmentObj.auth.canUpload = true; // 是否可以上传 可以

})