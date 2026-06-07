---
title: "附件绑定不走平台公共处理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianbangdingbuzoupingtaigonggongchuli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 11
---

# 附件绑定不走平台公共处理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujianbangdingbuzoupingtaigonggongchuli | 所属：指南

# [](#附件绑定不走平台公共处理)附件绑定不走平台公共处理

## [](#1-单据中附件的值)1. 单据中附件的值

附件和其他字断不同，关联单据的值只是一个索引关系，不是真正附件的信息

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image1.f4c92d22.png)

从上图可以看出，两个附件只有一个值，因为这个值不是真正附件的信息，当组件接收到这个值以后会触发接口搜索出真正的附件信息，如下图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image2.a99f6fae.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image3.84479f11.png)

## [](#2-为什么要走绑定)2. 为什么要走绑定

如上所示，和单据关联的附件字断的值始终是一个不变的字符串，所以通过这个字符串上传成功的附件，不管任何时候都会被搜回来，但是我们单据的场景在编辑取消后数据要恢复到之前。所以我们不能将附件直接上传到这个字符串上，我们会在利用一个新的字符串，上传的附件都关联到这个新的上。在需要真正变更的时候在关联到原来单据上的那个值上。所以只有保存以后才会真正的将数据同步上去。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image4.9ac033d7.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image5.78212667.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image6.27061660.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image7.46fd758f.png)

## [](#3-如何实现绑定的)3. 如何实现绑定的

为了实现绑定操作，我们需要区分两种组件形式。

一、主表附件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image8.d8577cdd.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image9.7c4b28cd.png)

二、子表附件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image10.e18e25f0.png)

- 主表：因为主表附件一般只加载一次，所以将新生成的关联ID（oldObjectId）存在组件中。组件监听beforeSave事件，将数据整合处理，存入缓存，为了后面保存成功后bindFiles接口使用。
- 子表附件：将新生成的关联ID（oldObjectId）存在行数据中，可以通过getData(）查看行数据。__tempObjectId

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbangdingbuzoupingtaigonggongchuli_image11.901e453e.png)

## [](#4-不走平台保存的领域怎么处理)4. 不走平台保存的领域怎么处理

- 保存前手动触发事件 viewmode.execute('customEventBeforeSave')
- 保存后调用 cb.utils.bindAttachmentAfterSave(viewmodel, 保存后数据)
保存后数据 = {id: 'XXXXX', ....} // 说明：这个方法返回个promise，只有当这个成功以后在更新页面，附件才能展示正确的值。如果不等这个请求完就刷新页面，可能上传的附件无法展示或者删除的附件没被删除。

使用示例：

cb.utils.bindAttachmentPromise(viewmodel, data).then(() => {

 // 保存以后的逻辑

})