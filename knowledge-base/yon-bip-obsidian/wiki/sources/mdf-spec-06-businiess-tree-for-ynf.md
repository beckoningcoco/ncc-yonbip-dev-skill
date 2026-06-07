---
title: "业务对象属性树(YNF)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-businiess-tree-for-ynf"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 业务对象属性树(YNF)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-businiess-tree-for-ynf | 所属：协议

# [](#业务对象属性树ynf)业务对象属性树(YNF)

## [](#1-功能简介)1. 功能简介

根据业务对象id/实体id/业务对象编码获取当前业务对象具备哪些属性的树结构

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuduixiangshuxingshuYNFimage1.a1b49652.png)

## [](#3-使用方式)3. 使用方式

import React from 'react'

import { YNFLoader } from 'ynf-core-loader';

class demo extends React.Component {

 constructor(props) {

 super(props)

 this.state = {

 

 }

 }

 

 render() {

 // providerPackage和providerEntry值固定不变,其余属性参考下面表格 

 return (

 <YNFLoader

 providerPackage='ynf-fw-metadata-lib' // 固定不变

 providerEntry='Botree' // 固定不变

 titleShowFormatStr='title,,code'

 isShowSelectBtn={true}

 />

 )

 }

}

 

export default demo

## [](#4-扩展属性)4. 扩展属性

||属性名称||类型||作用||说明|
||titleShowFormatStr||String||控制title和code"title"：默认值，只显示标题"code"：只显示code"title,,code"：title和code都显示"code,,title"：code显示在title前面"title,A,code,B"：code可以两侧可以自定义符号，A和B表示自定义符号|||
||maxExpendLevel||Number||树的最大展开层级|||
||showValueType||Boolean||是否显示字段类型，默认false|||
||checkable||Boolean||是否显示复选框，默认false|||
||expr||String||根据预制条件加载数据||比如expr='agentId.orgId'不仅会请求agentId层的数据,也会请求它的子集orgId的数据|
||isShowSelectBtn||Boolean||是否显示选用按钮，默认false|||
||expandedKeys||arr||默认展开的节点||expandedKeys={['agentId', 'agentId.orgId']}|
||botreeCheckedKeys||arr||默认选中的节点(有checkbox的情况)|||
||filterTypes||arr||属性过滤类型|||
||selectedKeys||arr||设置选中的树节点|||
||isHideReferIcon||Boolean||是否显示参照图标,不显示为 isHideReferIcon:true|||
||multiple||Boolean||控制参照单选还是多选||true:多选|
||others||object||自定义属性，仅支持true或者false项的配置||具体属性可以参考文档https://<trinpernext域名>/website/#/detail/component/wui-tree/bip?tab=component|
||showAllNode||Boolean||是否显示根节点|||
||allNodeTitle||String||如果设置了showAllNode=true,可以设置根节点的名字||默认显示"全部"|
||filterRule||object||过滤树节点eq：展示等于codeList的节点；nin：展示不等于codeList的节点||{ type:'nin', codeList: ['code1', 'code2'] }{ type:'eq', codeList: ['code1', 'code2'] }|

## [](#5-扩展方法)5. 扩展方法

||属性名称||含义||类型||返回参数|
||onBotreeExpand||展开事件||function||allData：{}，//所有节点的数据expendKeys："",展开的节点item:{}，当前展开节点的数据|
||onBotreeSelect||点击选中事件||function||allData：{}，//所有节点的数据selectedKeys：[],当前点击的节点item:{}，当前点击节点的数据|
||onBotreeCheck||多选事件||function||allData：{}，//所有节点的数据checkedKeys：[],当前选中的所有节点checkArr:[],当前选中的所有节点的数据|
||chooseClick||选用按钮||function||obj：当前的节点数据|