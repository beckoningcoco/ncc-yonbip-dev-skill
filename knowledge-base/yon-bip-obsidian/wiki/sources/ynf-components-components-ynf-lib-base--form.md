---
title: "表单 Form"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--form"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 表单 Form

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--form | 所属：YNF-组件

# [](#表单-form)表单 Form

用于创建交互式的表单，允许用户输入和提交数据

import { Form } from "ynf-lib-base"

## [](#何时使用)何时使用

- 数据收集和提交: 当你需要收集用户输入的数据，并将其提交到后端服务或进行处理时;
- 数据展示和编辑: 在展示数据并允许用户进行编辑时，可以使用 Form 组件来展示当前数据状态，并允许用户修改和保存变更

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||是否显示标题||showCaption||boolean||开启后表单左上角展示标题||false|||
||列数||layoutCols||number||每行展示几个子项||-1|||
||自适应布局||spans||object||根据屏幕大小自动计算显示列数, 只有列数为自动时生效
600px以下为xs
600-1000px以下为sm
1000-1340px以下为md
1340-1900px以下为lg
1900-2500px以下为xl
2500px及以上为xxl||{"xxl":6,"xl":5,"lg":4,"md":3,"sm":2,"xs":1}|||
||行间距||rowGap||number||行与行之间的距离||4|||