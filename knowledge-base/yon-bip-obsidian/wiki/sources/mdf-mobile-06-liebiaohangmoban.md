---
title: "列表行模板"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-liebiaohangmoban"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 列表行模板

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-liebiaohangmoban | 所属：移动组件

# [](#列表行模板)列表行模板

## [](#1-上下结构)1. 上下结构

### [](#11-codehead)1.1 CodeHead

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaohangmobanimage1.3bc52cd2.png)、

#### [](#组件规范)组件规范

- 

第一个字段后面默认加上复制按钮

- 

第二个字段为枚举类的字段

### [](#12-extendbody)1.2 ExtendBody

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaohangmobanimage2.1257e224.png)

#### [](#组件规范-1)组件规范

1.可以设置改组件拆分为几列，设计规范只有1列或者2列

- 提供columns,默认为1 ,如需更改,需要在excel中的cStyle中配置
{"columns":2}

2.组件内的相关子item

- 

设计规范统一居左。需把 iAlign设置为1, 可设置左中右 iAlign 1、2、3
对应左、中、右

- 

当columns为1时，item的label最多显示8个中文,多余8个字折行,右侧根据实际宽度自动折行

- 

当columns为2时，item的label最多显示6个中文,多余6个字折行，右侧根据实际宽度自动折行

## [](#2-左中右结构)2. 左中右结构

### [](#21-tplthreecols)2.1 TplThreeCols

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaohangmobanimage3.1f7c4b93.png)

红色第一个为Left, 第二个位Middle,第三个位Right。

#### [](#组件规范-2)组件规范

Left 为左侧显示区域-一般为图片组件-Image

Middle为中间显示区域

Right为右侧显示区域