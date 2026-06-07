---
title: "移动端临时态改动影响点"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-yidongduanlinshitaigaidongyingxiangdian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 移动端临时态改动影响点

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-yidongduanlinshitaigaidongyingxiangdian | 所属：指南

# [](#移动端临时态改动影响点)移动端临时态改动影响点

### [](#修改涉及组件)修改涉及组件

**filelist**

### [](#)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image1.08dbd287.png)

**imagelist**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image2.4e9915df.png)

### [](#验证点)验证点

附件或者图片组件上传、删除，点击单据保存是否正常存储和删除，点击单据取消是否恢复到编辑前状态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image3.0a966950.png)

### [](#领域怎么修改可以查看文档)领域怎么修改可以查看文档

由于MDF移动端附件适配临时态，修改了移动端附件的交互，可以对某些没有走平台公共的保存，但是使用了附件的场景有影响。

《[移动端附件临时态功能适配](#/guides/19-yidongduanfujianlinshitaigongnengshipei)》

### [](#需要排查场景)需要排查场景

#### [](#场景一)场景一：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image4.bf0203da.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image5.468fefc6.png)

**单据里的附件需要保存，但是保存的动作是领域自己扩展的**

#### [](#场景二)场景二：

领域的写了扩展脚本处理了beforeSave并且阻断了后续的beforeSave事件

#### [](#场景三)场景三：

领域扩展脚本调用协同的api获取了当前的附件

比如：window.YYCooperationBridge?.YYFormFileGetAllListByObjectId
这些接口

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanlinshitaigaidongyingxiangdian_image6.a3ead825.png)