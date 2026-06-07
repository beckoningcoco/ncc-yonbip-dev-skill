---
title: "配置迁移按钮 SandBoxButton"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-sandboxbutton"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 12
---

# 配置迁移按钮 SandBoxButton

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-sandboxbutton | 所属：Web组件

# [](#配置迁移按钮-sandboxbutton)配置迁移按钮 SandBoxButton

**注：目前已支持voucherlist，editvoucherlist，voucher，树卡类型的单据，其他类型暂未支持。如需适配配置迁移能力可以参考下文扩展脚本方式实现**   

如果配置后没有生效，清先排查下文档中标红项是否配置正确，（常见错误：大小写不一致，存在多余空格等情况），推荐复制粘贴

支持的单据类型已将加入迁移清单功能集成到框架中 
只需要在数据库中配置sandBoxButton按钮以及下文提到的action即可使用
不需要编写扩展脚本 详情请参考本文档 1.接入配置迁移按钮

## [](#1接入配置迁移按钮)1. 接入配置迁移按钮

### [](#11-ui模板配置)1.1 ui模板配置

在bill_toolbaritem表中添加对应按钮 以特征节点为例
btnAddList为表格顶部按钮执行批量迁移操作  Sandbox按钮展示配置迁移弹窗
btnAddSingleList按钮为表格行按钮执行单行迁移数据

注意按钮的类型
配置迁移弹窗按钮的type为SandBoxButton其他的按钮配置button即可 

## [](#)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image1.361a9f7f.png)

### [](#12-配置迁移参数配置)1.2 配置迁移参数配置

#### [](#121-绑定按钮action)1.2.1 绑定按钮action

在bill_command表中 批量选择的action配置为batchmigration
单行选择配置为singlemigration 树卡类型统一配置为cardmigration

在parmameter中可以配置thirdType type
以及extData三个参数，各领域按需配置即可。thirdtype框架默认为busi_obj，

type请按照各服务对应code填写 参考下图
参考配置文档[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image2.502d3fba.png)

extData 对接的时候确定
注：extData只需要添加跟后端确定好的字段，不要加入不相关数据，容易对数据库造成负担

**thirdtype类型**

"原子服务":"service",

 

"交易类型":"trans_type",

 

"单据类型":"bill_type",

 

"业务对象":"busi_obj",

 

"自定义数据":"custom"

svcurl中分别配置/bill/batchMigration /bill/singleMigration
/bill/cardMigration 
参考下图示例配置即可
（图中以特征为例具体参数领域可以自定义，不传自定义属性会取工作台接口返回的默认值）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image3.afadfa16.png)

## [](#2支持领域自定义传递字段名称)2.支持领域自定义传递字段名称

有关表格行数据的字段，有自定义字段名称需求 ，可以在parameter中配置
{"name":"自定义的字段名xxx","code":"自定义的字段名xxx"}。

目前开放自定义code和name， 优先使用自定义name和code

示例：{"thirdType":"service","name":"bussinessName","type":"character"}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image4.3f2fcd55.png)

## [](#3-支持树卡类型配置迁移)3. 支持树卡类型配置迁移

支持树卡类型配置迁移 迁移单个节点的数据

billcommand表中的action配置为cardmigration 其他配置与前文相同

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image5.517ca5df.png)

**备注：树卡类型未支持根据公共参数控制迁移按钮显示和隐藏，需领域在扩展脚本中自行添加，可以参考如下示例**

const setEnableMigration = function(data) {

 if (data.migrationVersion === 'compare' && !cb.context.getCommonOptionValue('enableMigration')) {

 viewmodel.get('xxx')?.setVisible(false) // xxx为领域自定义的迁移按钮的cItemName字段

 }

 }

 window.jDiwork?.getContext(data => setEnableMigration(data));

## [](#4设计器手动补足fieldname)4.设计器手动补足fieldname

**使用设计器配置的单据，在配置action的时候如果没有自动带入fieldName，需要手动补足fieldName**

例：

"actions": [

 {

 "cAction": "batchmigration" ,

 "cCommand": "cmdAddList",

 "title": "cmdAddList" ,

 "fieldName": "btnAddList"

 },

 {

 "cAction": "singlemigration" ,

 "cCommand": "cmdAddSingleList",

 "title": "cmdAddSingleList" ,

 "fieldName": "btnAddSingleList"

 }

]

## [](#5其他单据类型以及特殊场景接入扩展脚本实现)5.其他单据类型以及特殊场景接入，扩展脚本实现

总体逻辑：扩展脚本收集数据，注入收集的数据到sessionstorage中（详细方法可参考文档[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630)）

**使用扩展脚本实现不要再绑定action，会有冲突**

### [](#51-ui模板配置)5.1 ui模板配置

加入迁移清单按钮和正常按钮配置方式一样，添加普通按钮，ccontroltype为button

**sandboxbutton按钮正常配置，参考1.1**

### [](#52-扩展脚本接入方法)5.2 扩展脚本接入方法

#### [](#521-收集数据注入sessiondtorage)5.2.1 收集数据注入sessiondtorage

加入迁移清单按钮的点击事件绑定以下方法将收集的数据注入sessionstorage（详细方法可参考文档[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630)）

例：

addToSandboxList = (objData) => { // objdata为需要迁移的数据参考下图

 const baseKey = `${cb.context.getTenantId()}-${cb.context.getUserId()}`;

 const sandboxListObj = JSON.parse(sessionStorage.getItem('sandboxListObj')) || {};

 const service = this.viewmodel?.getRealServiceCode() + 'showSandboxBadge'

 // 如果传入的是单个对象，将其转换为数组

 if (!Array.isArray(objData)) {

 objData = [objData];

 }

 objData.forEach(obj => {

 if (!sandboxListObj[baseKey]) {

 sandboxListObj[baseKey] = [obj];

 } else {

 const isObjDataExists = sandboxListObj[baseKey].find(o => (

 o.dataPk === obj.dataPk && o.thirdCode == obj.thirdCode

 ));

 if (!isObjDataExists) {

 sandboxListObj[baseKey].push(obj);

 } else {

 // Message.destroy()

 // Message.create({ content: '数据重复请检查数据', color: 'warning' })

 console.error('重复数据');

 }

 }

 });

 sessionStorage.setItem('sandboxListObj', JSON.stringify(sandboxListObj));

 cb.events.execute(service, { thirdName: '数字化建模/特征管理' })

}

#### [](#-1)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image6.77d60f7b.png)

#### [](#522-实时计数能力)5.2.2 实时计数能力

实时计数能力，需要额外添加（例子上已有）

const service = viewmodel?.getRealServiceCode() + 'showSandboxBadge'

cb.events.execute(service,{ thirdName: "对应节点的thirdName" })

#### [](#523-公共参数控制显示隐藏)5.2.3 公共参数控制显示隐藏

根据公共参数控制按钮显示隐藏的示例

const setEnableMigration = function(data) {

 if (data.migrationVersion === 'compare' && !cb.context.getCommonOptionValue('enableMigration')) {

 viewmodel.get('xxx')?.setVisible(false) // xxx为领域自定义的迁移按钮的cItemName字段

 }

 }

 window.jDiwork?.getContext(data => setEnableMigration(data));

## [](#------------------------------------------------------------------------------分割线以下为v3老版使用方式已兼容------------------------------------------------------------------------)------------------------------------------------------------------------------分割线：以下为v3老版使用方式已兼容 -----------------------------------------------------------------------

## [](#1功能说明)1. 功能说明

在专属化环境提供加入迁移清单按钮，实现相应业务逻辑

## [](#2效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image7.a515695c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image8.566026b5.png)

## [](#3使用方法)3. 使用方法

3.1UI模板配置[https://npmmirror.com/package/iuap-sandbox-modal](https://npmmirror.com/package/iuap-sandbox-modal)

在bill_toolbaritem表中添加按钮type配置为 SandBoxButton

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image9.81d6f869.png)

3.2扩展脚本中实现加入迁移按钮的逻辑、

使用方法以及使用示例请参考以下链接

参考链接：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205314630)

3.3 sandBoxButton组件仅在专属化环境显示 

在测试环境验证方法：

在控制台输入cb.sandBoxBtn = true 刷新页签
（已废弃，目前全部环境放开展示）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image10.16ab0bbf.png)

## [](#4-20230705功能更新说明)4. 20230705功能更新说明

4.1为区分不同页签的点击事件 各服务需要调整触发事件
使用本服务servicecode+showSandBoxBtn的方式触发点击事件 在session
storage注入方法中修改事件名称

例：

addToSandboxList = (objData) => {

 const baseKey = `${cb.context.getTenantId()}-${cb.context.getUserId()}`;

 const sandboxListObj = JSON.parse(sessionStorage.getItem('sandboxListObj')) || {};

 const service = this.viewmodel?.getRealServiceCode() + 'showSandboxBadge'

 // 如果传入的是单个对象，将其转换为数组

 if (!Array.isArray(objData)) {

 objData = [objData];

 }

 objData.forEach(obj => {

 if (!sandboxListObj[baseKey]) {

 sandboxListObj[baseKey] = [obj];

 } else {

 const isObjDataExists = sandboxListObj[baseKey].find(o => (

 o.dataPk === obj.dataPk && o.thirdCode == obj.thirdCode

 ));

 if (!isObjDataExists) {

 sandboxListObj[baseKey].push(obj);

 } else {

 // Message.destroy()

 // Message.create({ content: '数据重复请检查数据', color: 'warning' })

 console.error('重复数据');

 }

 }

 });

 sessionStorage.setItem('sandboxListObj', JSON.stringify(sandboxListObj));

 cb.events.execute(service, { thirdName: '数字化建模/特征管理' })

}

主要代码：

const service = viewmodel?.getRealServiceCode() + 'showSandboxBadge'

cb.events.execute(service,{ thirdName: "对应节点的thirdName" })

4.2图标更新 添加计数功能 

![](data:image/png;base64,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)

## [](#5-20230925功能更新说明)5. 20230925功能更新说明

5.1 添加提示
根据公共参数配置cb.context.getCommonOptionValue('enableMigration')
判断迁移功能是否使用

领域扩展脚本需要调整注入逻辑并添加提示弹窗

if (!cb.context.getCommonOptionValue('enableMigration')) {

 cb.utils.alert('提示：当前租户暂未开启配置迁移功能，请联系管理员在公共参数开启。', 'warning');

}

已特征为例 根据公共参数在扩展脚本点击加入迁移清单按钮事件中添加
控制是否弹出提示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SandBoxButtonpeizhiqianyianniu_image12.17187211.png)