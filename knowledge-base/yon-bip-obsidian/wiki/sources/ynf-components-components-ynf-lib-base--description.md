---
title: "描述文本 Description"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--description"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 5
---

# 描述文本 Description

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--description | 所属：YNF-组件

# [](#描述文本-description)描述文本 Description

直观展示文本、图片等信息，增强内容可读性。

import { Description } from "ynf-lib-base"

## [](#何时使用)何时使用

- 常见于详情页的信息展示

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本数据源||dataSource||string||自定义描述文本的内容||-|||
||类型||type||'img-text-url' | 'img-text' | 'text'||图片+文本+链接 | 图片+文本 | 纯文本||img-text-url|||
||上传图片||upload||IframeModal||上传图片|||||
||链接名称||funNames||object||链接名称||["功能入口一","功能入口二"]|||
||跳转链接||urls||object||跳转链接可以配置链接名称需要跳转的地址||["",""]|||
||允许折叠||collapse||boolean||允许折叠||true|||
||允许关闭||closeable||boolean||允许关闭||true|||

### [](#文本数据源datasource)文本数据源（dataSource）

自定义描述文本的内容

![image-20240731104514706](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240731104514706.7251bfa9.png)

### [](#上传图片upload)上传图片（upload）

上传图片指的是描述文本左侧的图片，可以通过上传图片属性来更改描述文本左侧的图片

![image-20240731103226458](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240731103226458.0b3ea282.png)

### [](#链接名称funnames)链接名称（funNames）

链接名称是一个数组，可通过配置数组内容来更改链接名称

![image-20240731103702716](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240731103702716.89b8da73.png)

### [](#允许折叠collapse)允许折叠（collapse）

控制折叠图标的显示和隐藏，默认显示折叠图标

![image-20240731104104830](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240731104047437.dbe73cac.png)

### [](#允许关闭closeable)允许关闭（closeable）

控制关闭按钮的显示和隐藏，默认显示关闭图标

![image-20240731104258093](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240731104258093.8d1f6064.png)