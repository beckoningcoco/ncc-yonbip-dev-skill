---
title: "协作套件 Ecsuite"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-ecsuite"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 协作套件 Ecsuite

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-ecsuite | 所属：Web组件

# [](#协作套件-ecsuite)协作套件 Ecsuite

## [](#1-功能说明)1. 功能说明

卡片页关联单据id的主表附件、评论、组件，组件和服务都由协同提供，属于容器组件。在billtplgroup_base表中配置

关键参数：objectId: 单据ID，关联附件的关键字 | objectName：业务类型（到协同注册）

## [](#2-效果展示)2. 效果展示

### [](#21-file-附件套件)2.1. file 附件套件

说明：支持在新增、编辑、浏览态下使用

#### [](#211-正常展示)2.1.1. 正常展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage1.315e6650.png)

#### [](#212-分组展示)2.1.2. 分组展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage2.57735a6a.png)

#### [](#213-密级展示)2.1.3. 密级展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage3.5861466e.png)

### [](#22-ecsuite-评论套件)2.2. ecsuite 评论套件

说明：目前只支持在浏览态下使用

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage4.2eaa9d81.png)

## [](#3-基本属性)3. 基本属性

### [](#31-file附件套件)3.1. file附件套件

||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||disabled||禁用（置灰）||string||false||附件操作按钮是否可用删除、上传|
||bCanModify||是否可编辑||boolean||true||附件操作按钮是否可用删除、上传|
||uncopyable||是否可复制||boolean||true||0 可以 1 不可以 默认不可以|

- 扩展属性 cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||type||套件类型||string||无||type等于attachment渲染成附件|
||subuitype||套件类型||string||无||取值范围 file、ecsuite、comment|
||fileType||附件类型||string||1||渲染的文件类型，0-文件评论任务行文件四个页签；1-文件评论任务三个页签；2-单据文件；3-评论文件；4-任务文件；5-涉密文件；7-块状显示文件|
||objectName||调用方业务类型||string||YonSuite||领域自己到协同注册|
||bindEcsuite||是否展示附件个数||boolean||false||一种附件的展现形态|
||enableSecurityLevel||是否展示密级||boolean||false|||
||isEnableAttachGroup||是否展示分组||boolean||false|||
||attachGroupType||附件分组对应的业务对象||string||''|||
||attachGroupCode||附件分组对应的业务类型编码||string||''|||
||defaultGroupCode||默认分组编码||string||''|||
||authGroup||附件分组操作按钮权限||object||无||启用附件分组时候，对附件分组操作按钮权限进行控制，调用方式如：authGroup: {canAddRowGroup: true,canAddSubRowGroup: true,canEditGroup: true,canDeleteGroup: true},|
||foldStatus||是否展开||boolean||true||默认展开|
||maxCount||可上传最大数量||number||无|||
||maxSize||文件最大size||number||102400 kb||默认（100M）|
||format||支持上传的文件类型||array||无||默认无限制 可以设置eg:["jpg","png","pdf"]|
||examinedNoUpload||是否审批后不允许上传||boolean||true||默认是|
||bIsNull||是否必输||boolean||true||false 必输 true 非必填|
||enablePersonalLimit||是否限制删除别人上传的附件||boolean||true||默认true|
||approvalIngCanUpload||审批中允许上传、删除附件”的参数||boolean||true||默认允许|
||canEditInBrowse||浏览态是不是能操作附件上传和删除 ||boolean||true||默认是可以|
|||||||||||

- 扩展属性 ExtProps

||属性名称||属性含义||值类型||默认值||属性说明|
||deleteable||是否可删除||boolean||true||附件删除按钮是否可用|
||downloadable||是否可下载||boolean||true||附件下载按钮是否可用|
||subuitype||套件类型||string||无||取值范围 file|
||batchDownload||是否可以批量下载||boolean||false||附件批量下载是否可用，默认不可以|

### [](#32-ecsuite-评论套件)3.2. ecsuite 评论套件

||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||subuitype||套件类型||string||无||取值范围 ecsuite|

- 扩展属性 cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||type||套件类型||string||无||type等于attachment渲染成附件|
||subuitype||套件类型||string||无||取值范围 file、ecsuite、comment|
||objectName||调用方业务类型||string||YonSuite||领域自己到协同注册|
||tabscanEdit||页签配置是否可编辑||arrayboolean||['comment', 'task', 'flow']false||comment: 评论, task：任务, flow：协作流程默认不可编辑|
||openAtNotice||是否开启评论时@人 ||boolean||true||默认支持true 开启 false 关闭|
||otherSsettings||协同附件组件支持参数||object||{}||支持的参数可以查看协同文档|

## [](#4-excel配置)4. Excel配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage5.6649620c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/EcsuiteXieZuoTaoJianimage6.daa0f787.png)

## [](#5-领域扩展开发)5. 领域扩展开发

说明：协作套件组件加载完成后触发ecsuiteDidMount事件,
同时将附件实例传入回调函数。协作套件组件实例是个promise所以在引用时要注意他的执行时机（只针对type等于file的类型）

#### [](#511-自定义控制操作按钮)5.1.1. 自定义控制操作按钮

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 componentInstance.then((ecsuiteApi) => {

 ecsuiteApi.updateAuth({

 auth: {

 canDownload: true, // 是否可下载

 canDelete: true, // 是否可删除

 canUpload: true, // 是否可上传

 }

 })

 })

});

#### [](#512-动态刷新组件文件)5.1.2. 动态刷新组件文件

update 组件更新方法

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 const objectId = ecsuiteApi.getAllParams().objectId;

 const objectName = 'YonSuite';

 componentInstance.then((ecsuiteApi) => {

 ecsuiteApi?.update?.({

 objectName,

 objectId,

 }, true) // 第二个参数表示 是否重新请求接口 true:是

 })

});

#### [](#513-动态设置分组)5.1.3. 动态设置分组

updateGroupId 动态更新分组API

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 componentInstance.then((ecsuiteApi) => {

 ecsuiteApi.updateGroupId({

 attachGroupType: 'xxxx',

 attachGroupCode: 'xxxx',

 })

});

[附件使用文档](#/components-web/05-fujianshiyongwendang)

# [](#协作组件事件)协作组件事件

beforeRenderEcsuite 协作组件加载前事件

this.viewModel?.on('beforeRenderEcsuite', (initComponentData) => {

 // initComponentData

});

beforeRenderCommon 评论组件加载前事件

this.viewModel?.on('beforeRenderCommon', (initComponentData) => {

 // initComponentData

});