---
title: "框架中现有附件组件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-kuangjiazhongxianyoufujianzujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 10
---

# 框架中现有附件组件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-kuangjiazhongxianyoufujianzujian | 所属：指南

# [](#框架中现有附件组件)框架中现有附件组件

## [](#1-ecsuite)1. Ecsuite

主表中配置，使用协同接口和组件。对应文件/EcsuiteTable，cControlType：ecsuite，属于容器组件在billtplgroup_base表中配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image1.d2b99fee.png)

## [](#2-filelist)2. FileList

主子表中配置，使用协同接口和组件。对应文件/EcsuiteTable，cControlType：filelist，属于基础组件在bill_base表中配置

- 主表中展示如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image2.84c5f404.png)

- 子表中展示如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image3.081c98ea.png)

## [](#3-pictureupload)3. PictureUpload

主子表中配置，使用协同接口和组件。对应文件/pictureUpload，cControlType：pictureupload，属于基础组件在bill_base表中配置，可以上传多张图片

- 主表中展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image4.9bda7142.png)

- 子表中展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image5.ecd65c7a.png)

## [](#4-avatar)4. Avatar

主子表中配置，使用MDD接口。对应文件/avatar，cControlType:
avatar，属于基础组件在bill_base表中配置

主要用于上传一张图片的需求

- 主表中展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image6.f99a2582.png)

- 子表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image7.dde3d41b.png)

## [](#5-picture)5. Picture

主子表中配置，使用协同接口。对应文件/avatar，cControlType:
picture，属于基础组件在bill_base表中配置

主要用于展示一张静态图片，在设计器端上传图片，在运行时展现

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image8.a08e1b59.png)

## [](#6-attachment)6. Attachment

主表中配置，使用mdd接口，非协同接口。对应文件file-upload，cControlType：attachment，属于基础组件在bill_base表中配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image9.21fd7056.png)

## [](#7-taggroup)7. TagGroup

主子表中配置，使用mdd接口。对应文件/taggroup，cControlType:
taggroup，属于基础组件在bill_base表中配置(目前还没有确切例子)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuangjiazhongxianyoufujianzujian_image10.3aa1d716.png)