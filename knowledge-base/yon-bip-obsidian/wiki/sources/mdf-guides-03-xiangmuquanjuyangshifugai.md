---
title: "项目全局样式覆盖"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-xiangmuquanjuyangshifugai"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 项目全局样式覆盖

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-xiangmuquanjuyangshifugai | 所属：指南

# [](#项目全局样式覆盖)项目全局样式覆盖

## [](#1-样式覆盖)1. 样式覆盖

创建extend.css文件，根据现有的相对类名进行样式覆盖

#### [](#11-查看样式类名)1.1. 查看样式类名

MDF单据中类名一般分为两种：第一种是基础组件的类名，一般是以**"wui-"**开头的；第二种是MDF组件内固定写死的类名。如果要覆盖全局样式，使用这两种类名写相关的css代码即可。

**注意事项：**除了上述两种类名之外，还有第三种类名，是领域配置的类名，这一类className不推荐使用，如何判断是第三种类名需要具体单据具体分析。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xiangmuquanjuyangshifugai_image1.38e7b61f.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xiangmuquanjuyangshifugai_image2.2881cad7.png)

#### [](#12-覆盖示例)1.2. 覆盖示例

以lineTabs为例，实现下面效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xiangmuquanjuyangshifugai_image3.f7e3d14e.png)

实现上面的效果需要把标品默认的选中状态改成带背景色的效果：

.wui-tabs-editable-card{

 .wui-tabs-simple{

 .wui-tabs-nav {

 background: #4E6EF2; // 修改背景

 color: #fff; // 修改字体颜色

 }

 .wui-tabs-ink-bar{

 height: 0; // 去掉默认的红线

 }

 }

}

上述代码会把单据中所有的lineTabs样式覆盖。

**注意：如果写的样式不生效，可以试图通过增加css选择器增加样式的优先级，尽量不要写important覆盖。**

## [](#2-加载样式文件)2. 加载样式文件

#### [](#21-上传样式文件)2.1. 上传样式文件

将上面步骤中产生的extend.css文件，上传到业务中台nginx的/mdf-webhome/project-extend-css/目录下，**文件名和路径要确保正确，不知道如何上传的联系现场运维人员**

**检查方法：**

通过浏览器访问：https://<业务中台>/mdf-wh/project-extend-css/extend.css 可以看到上面看的样式内容

#### [](#22-添加配置)2.2. 添加配置

在MDF服务文件或配置工具中新加公共配置 "loadProjectExtendCSS": true 属性，**注意不要动原有属性，2024年7月20日以后的补丁支持**

R5及以后的文档：《[项目级配置工具（R5 & R6）](file:////pages/viewpage.action%3fpageId=50957631)》

R2及以前的文档：《[项目级配置文件（旧）](file:////pages/viewpage.action%3fpageId=22512589)》

如图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xiangmuquanjuyangshifugai_image4.518bb478.png)

**检查方法：**

打开调试面板，刷新工作台就会加载（不是打开单据才加载），在network页签查看是否加载了 https://<业务中台>/mdf-wh/project-extend-css/extend.css 如果没有加载按文档重新检查