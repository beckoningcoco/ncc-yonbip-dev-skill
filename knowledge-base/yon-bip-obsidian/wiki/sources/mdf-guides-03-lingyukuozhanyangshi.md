---
title: "领域扩展样式"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanyangshi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 领域扩展样式

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyukuozhanyangshi | 所属：指南

# [](#领域扩展样式)领域扩展样式

## [](#1-常用方式)1. 常用方式

最常用的方式是在脚手架工程里的extend.less文件中写css样式：

**注意：写css样式一定要做好样式隔离，可以用domainKey作为最外层的类名；**

**如果是只针对某个单据生效，可以用domainKey和billnum共同隔离。**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanyangshi_image1.0248acc1.png)

## [](#2-在设计器中为元素增加classname)2. 在设计器中为元素增加className

在元素的扩展属性里面，增加属性className，填写值为在当前元素上添加的className

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanyangshi_image2.f442221d.png)

配置完成之后会在dom上添加class，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanyangshi_image3.4343ab04.png)

## [](#3-扩展脚本动态插入css片段不推荐使用)3. 扩展脚本动态插入css片段（不推荐使用）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhanyangshi_image4.04d98775.png)

viewModel.on('customInit', function (data) {

// 采购订单--页面初始化

let styleHTML = `

.customClass .label-control,.customClass input{

color: red;

}

`

let styleDom = document.createElement('style')

styleDom.innerHTML = styleHTML

document.head.appendChild(styleDom)

});