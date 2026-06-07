---
title: "时间轴 TimeLine"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--time-line"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 时间轴 TimeLine

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--time-line | 所属：YNF-组件

# [](#时间轴-timeline)时间轴 TimeLine

用于当一系列的信息按时间排序的时候或者做个可视化的连接

import { TimeLine } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当有一系列信息需按时间排列时，可正序和倒序;
- 需要有一条时间轴进行视觉上的串联时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||组件||style||string||组件||-|||
||图标尺寸||iconAppearance||string||图标尺寸||-|||
||标题文字||titleStyle||string||标题文字||-|||
||辅助文字||auxiliaryInstructionsStyle||string||辅助文字||-|||
||状态文字||statedeScriptionStyle||string||状态文字||-|||
||数据源||dataSourceCustom||Custom||设置时间节点数据信息||[{"title":"节点标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880420","timeInfo":"2023-01-01","auxiliaryInstructions":"辅助说明","auxiliaryInstructions_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880421"},{"title":"节点标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880420","timeInfo":"2023-01-02","auxiliaryInstructions":"辅助说明","auxiliaryInstructions_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880421"},{"title":"节点标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880420","timeInfo":"2023-01-03","auxiliaryInstructions":"辅助说明","auxiliaryInstructions_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880421"}]|||
||布局模式||mode||string||设置时间轴的布局展示样式||left|||
||节点样式||nodeStyle||string||设置时间节点的样式||stroke|||
||状态说明显示位置||statePosition||string||设置时间节点状态说明的位置||right|||