---
title: "CN使用MDF懒加载树"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-lazy-tree"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用MDF懒加载树

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-lazy-tree | 所属：协议

# [](#cn使用mdf懒加载树)CN使用MDF懒加载树

## [](#1-功能简介)1. 功能简介

根据统一规范进行树结构的展示

### [](#11-使用方式)1.1. 使用方式

import LazyTree from '@mdf/lazytree';

 

export default class xxxx extends Component {

 render () {

 return (

 <div>

 <LazyTree {...config} /> // config为配置项

 </div>

 );

 }

}

### [](#12-可扩展属性)1.2. 可扩展属性

||属性名称||类型||作用|
||showTitleByKeys||string||使用表达式进行字段拼接|
||maxLevel||string||限制最多展开几层|

### [](#13-可扩展方法)1.3. 可扩展方法

||属性名称||类型||返回参数|
||init||function||节点初始化时调用，需配合async/await语法，返回一个当前树展示的根节点的数据|
||expand||function||节点展开时调用，接收一个参数为当前展开节点的id，需配合async/await语法，返回一个包含当前展开节点所有子级数据的数组|
||search||function||搜索时调用，接收一个参数为当前搜索框中的内容，需配合async/await语法，返回一个满足当前搜索条件的所有数据的列表|
||select||function||选中节点时调用，接收一个参数为当前点击节点的数据|

### [](#14-配置示例)1.4. 配置示例

const config = {

 init: async function (args) {

 console.log(args)

 const datas = await axios.post('/jasion/v1', {}).then(res => {

 console.log(res)

 return res.data.data

 }).catch(err => {

 console.log(err)

 })

 return datas

 },

 search: async function (value) {

 console.log(value)

 let datas;

 datas = await axios.post('http://local.xxx.com:3003/jasion/v3', { searchValue: value }).then(res => {

 return res.data.data

 }).catch(err => {

 console.log(err)

 })

 return datas;

 },

 expand: async function (id) {

 let datas;

 datas = await axios.post('http://local.xxx.com:3003/jasion/v2', { id: id }).then(res => {

 return res.data.data

 }).catch(err => {

 console.log(err)

 })

 return datas;

 },

 select: function (args) {

 console.log(args)

 },

 showTitleByKeys: '<%name%>-<%code%>|<%id%>'

}

export default class Demo extends Component {

 render() {

 return (

 <div>

 <LazyTree {...config} />

 </div>

 )

 }

}