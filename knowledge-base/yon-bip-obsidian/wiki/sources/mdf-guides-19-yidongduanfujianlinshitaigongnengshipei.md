---
title: "移动端附件临时态功能适配"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-yidongduanfujianlinshitaigongnengshipei"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 移动端附件临时态功能适配

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-yidongduanfujianlinshitaigongnengshipei | 所属：指南

# [](#移动端附件临时态功能适配)移动端附件临时态功能适配

### [](#)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanfujianlinshitaigongnengshipei_image1.c7d7d621.png)

### [](#背景)背景

移动端附件在之前是不会根据单据的取消或者返回恢复到之前的状态。附件的上传和删除都是实时的，当单据想需要恢复之前的数据时是无法实现的。

PC的附件支持了附件临时的功能，为了一致性移动也要支持

### [](#临时态原理)临时态原理

参考看下
《[附件绑定不走平台公共处理](#/guides/19-fujianbangdingbuzoupingtaigonggongchuli)》

简单讲

比如单据上存了一个附件字段 file = uuid1

编辑态的时候上传附件关联的值是uuid2,
删除的附件不调用接口只是本地删除。当保存动作结束以后
会调用协同的bind接口将uuid2的附件绑定到uuid1上，将本地删除的文件调用接口删除

### [](#需要领域配合检查或者修改)需要领域配合检查或者修改

因为附件几乎强依赖保存动作，所以当保存动作不是走的平台的save action
需要领域排查下附件功能是不是正确

### [](#不走平台保存的领域怎么处理)不走平台保存的领域怎么处理

- 保存前手动触发事件 viewmode.execute('customEventBeforeSave')
- 保存后调用 cb.utils.bindAttachmentAfterSave(viewmodel, 保存后数据) 保存后数据 = {id: 'XXXXX', ....} // 说明：这个方法返回个promise，只有当这个成功以后在更新页面，附件才能展示正确的值。如果不等这个请求完就刷新页面，可能上传的附件无法展示或者删除的附件没被删除。

使用示例：

cb.utils.bindAttachmentAfterSave(viewmodel, data).then(() => {

 // 保存以后的逻辑

})