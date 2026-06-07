---
title: "表格整列全选适配文档（不支持树表）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-biaogezhengliequanxuanshipeiwendang"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 表格整列全选适配文档（不支持树表）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-biaogezhengliequanxuanshipeiwendang | 所属：指南

# [](#表格整列全选适配文档不支持树表)表格整列全选适配文档（不支持树表）

**首先声明：不支持树表！！！不支持树表！！！不支持树表！！！不要乱塞缓存！**

## [](#需求背景)需求背景

支持表格整列的数据全选，其中该列为自定义组件列，框架提供一个全选/反选事件，扩展监听此事件并且组装相应的状态返回，框架根据相应状态赋予表头checkbox选择状态。

## [](#配置方式)配置方式

首先列扩展字段cStyle添加showCheckBox为true，类型ctrlType为scheckbox，列属性bCanModify为true。具体配置方式见文档[Table 表格](#/components-web/04-table)

配置成功后，表头会多一个checkbox选项，点击checkbox会触发事件selectAllColumn，示例代码如下：

// 框架提供checkbox勾选动作

gridModel.execute('selectAllColumn', {value, columnKey})

 

// 扩展代码示例

gridModel.on('selectAllColumn', (args) => {

 console.log(args)

 const { value, columnKey } = args; // value是true和false，表示勾选与否，columnKey是表头字段的cItemName

 

 /**

 * TODO: 扩展逻辑

 */

 

 // 重点！！！ 需要扩展组装cache，以决定表头checkbox最终的勾选状态

 const colsCheckedStatus = gridModel.getCache('colsCheckedStatus') || {}

 colscheckedStatus[columnKey] = 你想要让表头变成的状态 0 不选 1 全选 2 半选 这里的 0 1 2 是数字，不是字符串

 // 比如下面这么写，根据业务逻辑，我这个列想让他半选态：

 // colsCheckedStatus[columnKey] = 2

 gridModel.setCache('colsCheckedStatus', colsCheckedStatus)

})

如果想一开始进页面决定表头的选择状态，请在列的cStyle中配置allColumnCheckboxStatus，规则和扩展中的一样 0 不选 1 全选 2 半选，即可决定某列初始选择态。