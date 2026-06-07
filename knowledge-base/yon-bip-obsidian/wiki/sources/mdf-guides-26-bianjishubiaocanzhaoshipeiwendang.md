---
title: "编辑树表参照适配文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-bianjishubiaocanzhaoshipeiwendang"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 编辑树表参照适配文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-bianjishubiaocanzhaoshipeiwendang | 所属：指南

## [](#编辑树表参照适配文档)编辑树表参照适配文档

1 子表区域添加cControlType 为hiddenrefercontainer的可编辑字段分组
原厂单据放到voucherdetail下 设计器单据放到cardboxgroup下面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bianjishubiaocanzhaoshipeiwendang1.9ff70279.png)

hiddenrefercontainer右键插入flex flex内字段关联子表数量
并将改数量字段cControlType和uitype手动改成 stepper

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bianjishubiaocanzhaoshipeiwendang2.cdcc6906.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bianjishubiaocanzhaoshipeiwendang3.1b8a864f.png)

2 参照字段模板上添加"cStyle": "{"useNewReferTree":true,
"useNewReferTree":true}" 开启新版树表参照交互

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bianjishubiaocanzhaoshipeiwendang4.58986d40.png)

3 参照字段模板上添加参照携带配置
将参照行上的字段值带入到子表行上对应的字段上

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bianjishubiaocanzhaoshipeiwendang5.cd54932b.png)