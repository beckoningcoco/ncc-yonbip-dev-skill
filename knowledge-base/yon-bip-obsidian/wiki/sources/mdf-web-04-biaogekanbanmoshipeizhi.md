---
title: "--表格看板模式配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogekanbanmoshipeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --表格看板模式配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogekanbanmoshipeizhi | 所属：Web组件

# [](#表格看板模式配置)表格看板模式配置

#### [](#ui模板)UI模板

参考文档：
[表格卡片模式配置](file:////pages/viewpage.action%3fpageId=22512501) 

配置容器listCard，cStyle中添加属性，配置示例如下：

{

 groupFieldType: 'select | refer', // 分组依据字段的类型

 groupField: 'cItemName', // 分组编码 

 groupValueField: 'value', // 分组项key 

 groupTextField: 'text' // 分组项显示文本

}

#### [](#billlist)bill/list

##### [](#数据响应变化内容查数据的list)数据响应变化内容：(查数据的list)

基本与标准list接口返回数据保持一致，需要额外增加字段groupList，结构如下:

{

 ...

 recordList: [{},{},{},{}],// 数据为多个sql拍平数据

 groupList: [{text: '开立', value: 1}, {text: '待审核', value: 2}] // text字段的具体值应与UI模板中配置的 groupTextField保持一致,value字段与groupValueField保持一致

}

请求体可能增加参数

{

 ...

/*

groupPageInfo:分页参数,默认为空(初始化),为空时，每个分组项返回数据以第一页为准,

为非空时返回数据的页码按照groupPageInfo对应分组项的数字进行返回，

这里的key可能是一个也可能是多个，也可能是0个，

如果是0个则默认请求全部分组的数据，

非0则只请求传递的key对应的分组数据，

其中的key为对应枚举/档案的groupValueField字段对应的值

**/

 groupPageInfo: {} | {

 key1: {

 pageSize: 20,

 pageIndex: 3,

 totalCount: 1

 },

 key2: {

 pageSize: 20,

 pageIndex: 1,

 totalCount: 1

 },

 key3: {

 pageSize: 20,

 pageIndex: 1,

 totalCount: 1

 }

 } ,

 groupField: string类型,与UI模板中的groupField一致，用于后端查询全部分组数据使用

 groupFieldType: string类型,与UI模板中的groupFieldType一致，用于通知后端当前分组的类型是枚举还是档案

}

##### [](#数据响应变化内容查分页的list)数据响应变化内容：(查分页的list)

基本与标准list接口返回数据保持一致，需要额外增加字段groupPageInfo，结构如下:

{

 ...

 groupPageInfo: {

 key1: {

 pageIndex: 1,

 pageSize: 20,

 recordCount: 100

 },

 key2: {

 pageIndex: 1,

 pageSize: 20,

 recordCount: 100

 }

 }

}