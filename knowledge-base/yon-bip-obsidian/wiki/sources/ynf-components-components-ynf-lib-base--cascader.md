---
title: "级联选择 Cascader"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--cascader"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 级联选择 Cascader

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--cascader | 所属：YNF-组件

# [](#级联选择-cascader)级联选择 Cascader

级联选择框。

import { Cascader } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要从一组相关联的数据集合进行选择，例如省市区，公司层级，事物分类等。
- 从一个较大的数据集合中进行选择时，用多级分类进行分隔，方便选择。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据源||dataSource||object||自定义级联选择的内容||[{"label":"基础组件","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803AE","value":"jczj","children":[{"label":"导航","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803AF","value":"dh","children":[{"label":"面包屑","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803B4","value":"mbx"},{"label":"分页","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803B6","value":"fy"},{"label":"标签","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803BC","value":"bq"},{"label":"菜单","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803BD","value":"cd"}]},{"label":"反馈","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803BF","value":"fk","children":[{"label":"模态框","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803C3","value":"mtk"},{"label":"通知","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803C4","value":"tz"}]},{"label":"表单","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803C7","value":"bd"}]},{"label":"应用组件","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803C8","value":"yyzj","children":[{"label":"参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803CB","value":"ref","children":[{"label":"树参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803CC","value":"reftree","children":[{"label":"树参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803CC","value":"reftree"},{"label":"表参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803D0","value":"reftable"},{"label":"穿梭参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803D1","value":"reftransfer"}]},{"label":"表参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803D0","value":"reftable"},{"label":"穿梭参照","label_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048803D1","value":"reftransfer"}]}]}]|||
||展开方式||expandTrigger||'click' | 'hover'||点击展开 | 移入展开||click|||
||浮层预设位置||popupPlacement||'bottomLeft' | 'bottomRight' | 'topLeft' | 'topRight'||左下 | 右下 | 左上 | 右上||左下|||
||清除按钮||allowClear||boolean||清除按钮||true|||
||是否支持搜索||showSearch||boolean||是否支持搜索||false|||
||级联选择模式||dropdownType||0 | 1||默认 | 平铺||1|||
||点击搜索回调||onSearch||Function(value, selectedOptions)||点击搜索时的事件。||-|||
||内容改变||onCascaderChange||Function(value, selectedOptions)||内容改变的事件。||-|||
||内容改变后||onAfterValueChange||Function(value, selectedOptions)||内容改变的事件。||-|||