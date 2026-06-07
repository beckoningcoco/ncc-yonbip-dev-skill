---
title: "业务对象属性树(MDF)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-businiess-tree-for-mdf"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 业务对象属性树(MDF)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-businiess-tree-for-mdf | 所属：协议

# [](#业务对象属性树mdf)业务对象属性树(MDF)

## [](#1-功能简介)1. 功能简介

根据业务对象id/实体id/业务对象编码获取当前业务对象具备哪些属性的树结构

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuduixiangshuxingshuMDFimage1.a1b49652.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuduixiangshuxingshuMDFimage2.3a1c7525.png)

### [](#21-使用方式)2.1. 使用方式

#### [](#211-扩展组件方式)2.1.1. 扩展组件方式

扩展工程脚手架安装最新的依赖包:"@mdf/botree": "~1.0"。

- businessId：实体id
- boCode：业务对象编码
- boid：业务对象id

上面三个参数根据使用场景传其中任何一个即可.

后端接口参数说明:
https://<wiki域名>/pages/viewpage.action?pageId=153191483

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuduixiangshuxingshuMDFimage3.9df6fa5b.png)

import BusinessObjectTree from '@mdf/botree'

 

export default class xxxx extends Component {

 //点击选中事件

 onBotreeSelect=(obj)=>{

 //obj

 }

 //展开事件

 onBotreeExpand=(obj)=>{

 //obj

 }

 //checkbox事件

 onBotreeCheck=(obj)=>{

 //obj

 }

 //参照选择的数据

 afterReferOkClick = (data) => {

 //data是当前选中的数据

 }

 render () {

 const config = {

 titleShowFormatStr: "title",

 maxExpendLevel:3,

 showValueType:true

 }

 return (

 <div>

 <BusinessObjectTree

 businessId='c7c0beb4-f830-486d-83e1-51072b319fd2'

 filterTypes={['base.user.User']}

 titleShowFormatStr='title,,code'

 showValueType={true}

 expr='agentId.orgId'

 expandedKeys={['agentId', 'agentId.orgId']}

 handleScrollTop={this.handleScrollTop}

 onBotreeSelect={this.onBotreeSelect}

 onBotreeExpand={this.onBotreeExpand}

 onBotreeCheck={this.onBotreeCheck}

 afterReferOkClick={this.afterReferOkClick}

 others={{ checkStrictly: true }}//父子节点选择互不受影响

 showAllNode={true} //是否显示根节点

 allNodeTitle='全部' //如果设置了显示根节点,这里可以设置根节点的名字

 />

 //<BusinessObjectTree boCode="xxxxx" {...config} />

 //<BusinessObjectTree boid="xxxxx" {...config} />

 </div>

 );

 }

}

#### [](#212-非mdf使用方式)2.1.2. 非MDF使用方式

- 使用实体id获取树结构

cb.cn.botree.render({businessId: xxx}, dom， config)

- 使用业务对象编码获取树结构

cb.cn.botree.render({boCode: xxx}, dom, config)

- 使用业务对象id获取树结构

cb.cn.botree.render({boid: xxx}, dom, config)

**注：参数3config为非必须参数(参考下面扩展属性)，参数1为3选1，根据自己使用场景进行使用即可，参数2为必传参数**

### [](#22-可扩展属性)2.2. 可扩展属性

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
||isShowNewStructureData||Boolean||支持按照新老架构进行过滤||默认false,展示全部数据;true:展示包含cDataRule的数据|
||showCountryFilter||Boolean||是否显示国家筛选（1.0.52版本支持）||默认false不显示，注意：如果设置了true，需要多增加一个参数传递给组件，参数为domainKey|

### [](#23-可扩展方法)2.3. 可扩展方法

||属性名称||含义||类型||返回参数|
||onBotreeExpand||展开事件||function||allData：{}，//所有节点的数据expendKeys："",展开的节点item:{}，当前展开节点的数据|
||onBotreeSelect||点击选中事件||function||allData：{}，//所有节点的数据selectedKeys：[],当前点击的节点item:{}，当前点击节点的数据|
||onBotreeCheck||多选事件||function||allData：{}，//所有节点的数据checkedKeys：[],当前选中的所有节点checkArr:[],当前选中的所有节点的数据|
||chooseClick||选用按钮||function||obj：当前的节点数据|
||handleScrollTop||获取选中的节点距离浏览器顶部的距离||function||{top: 0}|
||afterReferOkClick||参照选择的数据||function||参数是当前选中的参照数据|

### [](#24-搜索框吸顶的处理方法)2.4. 搜索框吸顶的处理方法

找到滚动容器的classname，给搜索框增加position:fixed，通过top调整位置。