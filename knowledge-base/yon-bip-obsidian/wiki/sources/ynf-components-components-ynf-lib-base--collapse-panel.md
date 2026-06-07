---
title: "折叠面板 CollapsePanel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--collapse-panel"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 折叠面板 CollapsePanel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--collapse-panel | 所属：YNF-组件

# [](#折叠面板-collapsepanel)折叠面板 CollapsePanel

带有折叠效果的展示板容器

import { CollapsePanel } from "ynf-lib-base"

## [](#何时使用)何时使用

- 对复杂区域进行分组和隐藏，保持页面的整洁。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||折叠面板||cStyle||Style||折叠面板||-|||
||标题||captionStyle||Style||标题||-|||
||子面板是否可折叠||collapsible||boolean||面板是否可折叠, 关闭后展开收起动作不生效||true|||
||折叠是否展开||expanded||boolean||默认为展开/折叠状态, 可通过该属性动态控制面板折叠状态||true|||
||按钮垂直位置||verticalPosition||string||展开/收起操作按钮位于内容面板的垂直方向的位置||top|||
||按钮水平位置||btnPosition||string||展开/收起操作按钮位于内容面板的水平方向的位置||right|||
||收起文案||closeTxt||string||收起按钮的文案||收起|||
||展开文案||openTxt||string||展开按钮的文案||展开|||
||是否显示图标||isShowIcon||boolean||展开收起按钮前面的图标是否显示||true|||
||头部自由布局||customHeader||boolean||自定义展开/折叠按钮区域||false|||
||分组类型||type||Radio||展示样式分类||list|||