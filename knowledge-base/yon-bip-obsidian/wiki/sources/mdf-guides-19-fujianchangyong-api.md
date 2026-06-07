---
title: "附件常用API"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianchangyong-api"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 附件常用API

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianchangyong-api | 所属：指南

# [](#附件常用api)附件常用API

## [](#1-批量绑定附件接口yyuploadedfilesbind)1. 批量绑定附件接口YYUploadedFilesBind

const newBindArr = [{

 oldObjectId: '源',

 objectId:"目标",

 bussinessType: 'xx'

}]

cb.utils.FileApiFormat('YYUploadedFilesBind', {

 bindList: newBindArr,

 callback: commonCallBack, // 绑定成功的回调函数

}, viewModel)()

## [](#2-批量删除附件接口yyformfilestempstatedel)2. 批量删除附件接口YYFormFilesTempStateDel

const fileDeleteList = ['fileid', ....]

cb.utils.FileApiFormat('YYFormFilesTempStateDel', {

 deleteParams: {

 fileIds: [...fileDeleteList],

 },

 callback: commonCallBack, // 删除成功回调函数

}, viewModel)()

## [](#3-批量获取文件详细信息接口yyformfilegetalllistbyobjectid)3. 批量获取文件详细信息接口YYFormFileGetAllListByObjectId

const request = [{

 objectId: 'xx'，// 库里存的值

 objectName: 'xx'

 }, {

 ...

}]

cb.utils.FileApiFormat('YYFormFileGetAllListByObjectId', {

   searchList: request

}, viewModel)().then((data) => {

 // 详细信息

})

## [](#4-获取文件列表yygetfilelist)4. 获取文件列表YYGetFileList

const obj = {

 objectName,

 objectId,

 pageSize,

}

cb.utils.FileApiFormat('YYGetFileList', obj, viewmodel)().then(data => {

 // data 详细数据

})

## [](#5-获取下载地址yygetdownloadurl)5. 获取下载地址YYGetDownloadUrl

cb.utils.FileApiFormat('YYGetDownloadUrl', { fileId: id }, viewmodel)().then((data) => {

 // data：返回信息

});

## [](#6-附件预览yypreviewfiles)6. 附件预览YYPreviewFiles

// files 数组 [{id: ''}, {id: ''}] id是附件ID

// index: 当前附件的索引

cb.utils.FileApiFormat('YYPreviewFiles', {

 files,

 index,

}, viewmodel, true)()

## [](#7-批量下载附件)7. 批量下载附件

// fileIds

// index: 当前附件的索引

cb.utils.FileApiFormat('YYGetBatchDownloadUrl', {

  fileIds: fileIds,

 isWaterMark: false, // 是否水印

 zipName: zipName, // 下载名称

}, viewmodel, true)()

## [](#8-预览附件)8. 预览附件

// fileId

// index: 当前附件的索引

cb.utils.FileApiFormat('YYPreviewFileById', {

  fileId: fileId,

 open: false,

}, viewmodel, true)()

## [](#9-附件复制)9. 附件复制

const newAttachmentIdList = [{

 sourceObjectId: "源ID"

 sourceObjectName: "源objectName",

 targetObjectId: "目标ID",

 targetObjectName: "目标objectName",

}]

cb.utils.FileApiFormat('YYFormFilesCopyAll', {

 copyList: newAttachmentIdList,

 callback: fileCallback, // 复制成功回调

}, vm)()

## [](#10-附件上传)10. 附件上传

参数格式

// data: {file: 文件流}

// authId： 取serviceCode

// onSuccess ：上传成功回调

// onError：上传失败回调

// onProcess： 上传中回调

cb.utils.uploadFile({

 data,

 businessId,

 objectName,

 authId,

 onSuccess,

 onError,

 onProcess,

})