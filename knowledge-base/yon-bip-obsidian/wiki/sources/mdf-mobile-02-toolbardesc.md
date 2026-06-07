---
title: "--按钮组中的按钮顺序"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-toolbardesc"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 9
---

# --按钮组中的按钮顺序

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-toolbardesc | 所属：移动组件

# [](#按钮组中的按钮顺序)按钮组中的按钮顺序

## [](#实现规则)实现规则

### [](#1-默认状态)1. 默认状态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image1.e0970b73.png)

### [](#2-倒序-desc)2. 倒序 desc

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image2.0bda4b00.jpeg)

### [](#3-正序-asc)3. 正序 asc

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image3.a0e35b23.png)

### [](#4-viewmodelhasfeaturebuttonsort)4. viewModel?.hasFeature('buttonSort')

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image2.0bda4b00.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image4.f50caf53.jpeg)

### [](#5-说明)5. **说明**

**因为目前toolbar按钮顺序混乱，导致维护困难，配置困难，现在需要领域自行排查，框架不做统一默认处理，领域需要对照下图有问题的调整toolbar顺序，首先配置sort:
'desc',然后按照优先级越高序号越小调整。没问题的可以不用动，调整目前暂定截止530，530以后框架不在支持下面第一种展示。请各位同事注意时间。**

**目前toolbar顺序展现状态：**

**1.需要领域修改的toolbar（注意序号）**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image5.ba5c4a29.png)

**2. 不需要调整的toolbar（注意序号），领域配置了sort: 'desc' 或者
配置了特性buttonSort**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image6.527d67b8.png)

**3. 不需要调整的toolbar(注意序号)，领域配置了 sort: 'asc'**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniushunxu_image7.b265fc2b.png)

## [](#常见问题)常见问题

### [](#同意不在最右边)同意不在最右边

- 可能场景

toolbar的cStyle配置了sort：'asc'，
并且按钮顺序调整为审批按钮几乎在最后面。同时还开启了特性 buttonSort 

说明：根据上面这种场景实际单据就是正序的，从下到上，从右到左。因为游配了buttonSort
需要领域更正toolbar里buttonSort这个值，所以要在cStyle里buttonSort：false

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbarlishenpitongyituihuianniushunxuwenti_image1.e977dcb0.png)