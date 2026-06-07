---
title: "附件常见问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianchangjianwenti"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# 附件常见问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianchangjianwenti | 所属：指南

# [](#附件常见问题)附件常见问题

## [](#1-协作套件没有上传按钮)1. 协作套件没有上传按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image1.944c18c5.png)

## [](#2-附件删除不了报错)2. 附件删除不了报错

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image2.aa5a3d92.png)

### [](#21-情况1附件不是当前人上传的)2.1 情况1：附件不是当前人上传的

单据的verifyState状态不是0或者4，这个时候只允许上传人删除附件

### [](#22-情况2附件是当前人上传的)2.2. 情况2：附件是当前人上传的

根据文档查一下是不是补丁不够新

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image3.5789f357.png)

**630SP之后**

关于文件删除权限增加了性能优化，删除权限在未进行安全权限改造之前，上传，下载，删除业务控制的权限由文件服务后端管控，
修正为文件服务前端组件控制，减少前后端接口调用次数，如果仅安装了文件服务前端补丁，未安装对应文件服务后端补丁，
会产生部分文件删除依然受后端错误数据控制，无法删除

两个解决方案（选择其中一个）：

- 安装文件服务后端最新后端补丁；优先使用解决方案 aPaaS_iuap-apcom-file_iuap.V6.R2_2302_80_QP20240104-7
- 清理数据库无效的权限控制数据

mongo：lightapp_one_for_all.cooperation.file.binding 表中的 attributes

downloadenable 设为1 uploadenable设为1，deleteenable设为1 或者直接删除attributes所有属性

mysql：清空表 iuap_apcom_file.file_business_setting

## [](#3-附件是否上传)3. 附件是否上传

如果是基础模型的附件字段，可以先判断模型是否有值，没有值就没附件，如果有值但是还没附件可以通过api获取

如果不是基础模型只能通过api方式判断

const request = [{

 objectId,

 objectName

}];

cb.utils.FileApiFormat('YYFormFileGetAllListByObjectId', {

 searchList: request, }, vm)().then((data) => {

 if (data.length) {

 // 有附件

 }

})

## [](#4-判断是否变更)4. 判断是否变更

看下附件变更的实现方式
《[附件变更历史](#/guides/10-fujianbiangenglishi)》

可以通过关联的字段的变化判断附件是否变化

## [](#5-领域runcommandline打开单据没有传正确的servicecode)5. 领域runCommandLine打开单据没有传正确的serviceCode 

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image4.62da3a80.png)

## [](#6-下推打开的单据附件传递的不正确)6. 下推打开的单据附件传递的不正确

说明：传递目标页面的serviceCode，配置方式是在该下推按钮的command表的cSvcUr|字段携带下推单据的servicecode参数名称为targetServiceCode

示例：采购合同 下推 对公预付单 传递对公预付单的targetServiceCode:xxxxx

cSvcUrl:blilpulVoucherdo?code=PurchaseConteact2PubprePav&targetllNo=znbzbxpubprepav&domaine=znbzbx&targetServiceCode=xXxXX

## [](#7-openservice-怎么传递servicecode)7. openService 怎么传递serviceCode

window.jDiwork.openService('st_purchaseorderlist', {

 billtype: 'voucher',

 billno: 'st_purchaseorder',

 }, {

 code: new Date().getTime(),

 title: '标题',

 data: {

 query: {

 serviceCode: '需要传递的serviceCode'

 },

 }

})

## [](#8-附件在微信小程序下使用问题)8. 附件在微信小程序下使用问题

原因：因为微信小程序权限问题 使用附件需要配置微信小程序参数

具体参数问题：可以咨询协同 宋磊

**方式一**

在附件的cStyle里配置： otherSetting: { wxConfig: { appId：'XX',
secret：'Xx',  url：window.location
origin+'/iuap-yonbuilder-mobile/rest/v1/wechat/api/getticket' } }

**方式二**

写扩展脚本

// 注意是viewmodel.不是simpleModel

viewmodel.on('beforeFileListDidMount', function (obj) {

 // 比如需要给组件传微信相关参数

 obj.wxConfig = {

 appId:'Xx'

 secret：Xx

 url：window.location.origin+'/iuap-yonbuilder-mobile/rest/v1/wechat/api/getticket

 }

})

## [](#9-linetabs里配置的附件和协作在ui模版设计器里设置了是否可见不生效)9. lineTabs里配置的附件和协作在UI模版设计器里设置了是否可见不生效

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image5.df45a941.png)

检查lineTabs里的cStyle里 states配置，这里有对这两个页签的配置以这里为主

这里应该处理了浏览态、编辑、新增态下这两个页签的控制。不需要就删除这里的控制

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image6.44736810.png)

## [](#10-页面上提示-当前操作权限不足)10. 页面上提示 当前操作权限不足

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image7.f7e1bd8e.png)

1、查看files接口里传如的authId是否在协同注册。这里的authId取的是单据的serviceCode

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianchangjianwenti_image8.f35e4035.png)

## [](#11-子表行附件清空)11. 子表行附件清空

// 给子表第一行的new8字段设置空值

在当前选中行

const gridModel = yya.get('ceshi002List');

gridModel.setCellValue(0, 'new8', '11', false) 

gridModel.setCellValue(0, 'new8', '', false)

 

连续设置两遍