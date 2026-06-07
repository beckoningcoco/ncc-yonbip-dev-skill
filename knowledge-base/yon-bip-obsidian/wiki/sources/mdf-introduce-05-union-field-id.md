---
title: "统一fieldId方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-union-field-id"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 统一fieldId方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-union-field-id | 所属：介绍

# [](#统一fieldid方案)统一fieldId方案

## [](#1-原则)1. 原则

- 保证唯一且刷新单据后不能变
- 加到根dom上
- 按照固定维度加

**结构：** 页面+字段+行+列+组件内部  比如：

- 主表 [billNo]+'|'+[cItemName]+('_xxxxx')
- 子表[billNo]+ '|' + [childrenField] + '|' + [rowIndex] + '|' + [cItemName]+('_xxxxx')

## [](#2-维度抽象)2. 维度抽象

### [](#21-mdf需要添加元素)2.1. MDF需要添加元素

- 按钮，包含Button，DropdownButton等
- 表单元素，包含Input，InputNumber等
- 下拉组件，下拉选项
- 弹窗提示信息
- 树
- 多页签标签
- 下拉参照
- 弹窗，包含参照弹窗侧滑弹窗
- 查询区，里面各种小模块
- 表体元素 区域 行 单元格 小按钮

### [](#22-维度)2.2. 维度

- 单据号 billNO
- 字段 cItemName
- 表体 childrenField
- 表体下标 index
- 枚举下拉下标 index
- 容器 cGroupCode
- 查询区 filterId
- 参照 referCode
- 单元格编辑态/浏览态 editCell/textCell

### [](#23-进一步抽象)2.3. 进一步抽象

- 单据 参照 查询区 容器 页签 billNO/cGroupCode
- 主表 cItemName 或 按钮key
- 子表 childrenField
- 子表某行某个字段 childrenField|index|cItemName

### [](#24-代码实现)2.4. 代码实现

cb.utils.getFieldID = function (args) {

 try {

 if (args?.fieldid) return args?.fieldid;

 

 const billNo = args?.billNo || args?.model?.getCache?.('billNo') || args?.model?.getRootParent?.()?.getParams?.()?.billNo || args?.model?.getParams?.()?.billNo || args?.model?.get?.('serviceCode') || args?.model?.get('billnum') || args?.data?.billNum || args?.viewModel?.getParams?.()?.billNo;

 const cItemName = args?.cItemName || args?.model?.get?.('cItemName') || args?.model?.get?.('itemName') || args?.model?.getCache?.('name') || args?.model?.get('cRefType');

 const childrenField = args?.model?.modelType === 'GridRowModel' ? args?.model?.getParent?.()?.get?.('childrenField') : args?.childrenField || args?.model?.get?.('childrenField') || args?.model?.getParent?.()?.getParent?.()?.get?.('childrenField');

 const index = args?.hasOwnProperty?.('index') ? args?.index : args?.model?.getCache?.('rowIndex');

 let fieldID = billNo;

 if (childrenField) fieldID += '|' + childrenField;

 if (cItemName) fieldID += '|' + cItemName;

 if (index || index == 0) fieldID += '|' + index;

 return fieldID;

 } catch {}

}

给钉耙组件传fieldid

<Input fieldid={cb.utils.getFieldID(this.props)} />

比如参照组件里内有个显示停用按钮，fieldid规则为组件fieldid + _xxx

export class ReferTree extends React.Component {

 constructor (props) {

 this.fieldid = cb.utils.getFieldID(this.props);

 }

 componentDidMount() {

 const modalFoot = <span className='refer-toolbar-checkbox' style={{marginLeft: '10px', color: '#474d54', lineHeight:'26px'}}>

 <Checkbox onChange={(e) => this.handleCheckboxChange(e, '2', 'stop')} fieldid={this.fieldid + '|stop'} checked={stop === '2'}>{cb.lang.templateByUuid('UID:P_FW_174E6C8C052809FC','显示停用')}</Checkbox>

 </span>}

 ...

 }

}