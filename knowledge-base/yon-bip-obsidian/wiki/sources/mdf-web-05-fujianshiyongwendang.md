---
title: "--附件使用文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-fujianshiyongwendang"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 16
---

# --附件使用文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-fujianshiyongwendang | 所属：Web组件

# [](#附件使用文档)附件使用文档

## [](#1-功能说明)1. 功能说明

- 主要支持编辑临时上传
- 附件复制
- 协同附件新增 编辑态上传文件

## [](#2-验证点)2. 验证点

- 原有功能和数据是否可以正常显示

领域协作套件附件，在原有浏览态上传附件前提下，支持了新增和编辑态的上传；
- 原来有部分领域，自己做了协作附件页签的控制，新增和编辑不展现，这个需要领域元数据去掉后验证
- 低代码附件（主表附件），原来没有临时上传和取消，所以比如：删除附件后，单据取消，附件就没了，这种问题也修复了

<!-- -->

- 附件新增了临时上传，验证上传、删除、预览、下载是否满足需求。功能是否正常使用
- 多种运行态切换是否功能正常，浏览、新增、编辑
- 单据保存，保存并新增，保存并提交等是否附件展示正常
- 单据复制，单据上的附件是否能够正常复制，并且是否能够新增保存成功。
- 行附件多种使用场景是否可以支持，行上附件、icon式附件、行上按钮附件，弹窗选择附件，是否可以正常回显，功能是否正常
- 行附件，想要展现最新交互，需要按照下面子表的说明配置
- 附件新增了对上传类型，上传数量和上传个数的限制，验证配置是否生效

## [](#3-注意事项)3. 注意事项

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage1.da2b391c.png)

- 附件临时上传实现原理

（1）单据新建或者编辑的时候 附件上传到一个临时的id, 保存成功以后
调用接口将临时的ID和真实的ID绑定起来

（2）绑定操作写在voucher卡片的action里，如果领域单据使用了附件并且自己复写了save方法，就不会触发附件的绑定操作，导致附件保存不上

（3）给予以上设计，当出现上面这种情况，领域在save成功以后需要手动调用一下绑定操作

### [](#31-主表组件)3.1. 主表组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage2.2136c881.png)

在billitem_base表里配置

### [](#32-子表组件)3.2. 子表组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage3.735a8921.png)

在billitem_base表里配置

### [](#33-协作套件)3.3. 协作套件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage4.0e7b9554.png)

在billtplgroup_base表里配置

- 审批成功以后协作套件不让上传附件 可以在 cStyle
配examinedNoUpload=false 放开这个限制

### [](#34-不走平台save绑定事件)3.4. 不走平台save绑定事件

cb.utils.bindAttachmentAfterSave(viewmodel, 保存后数据) 保存后数据 =
{id: 'XXXXX', ....}

保存后数据 如下

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage5.56952e75.png)

## [](#4-子表)4. 子表

- 

使用子表行附件的column 的cStyle中配置bindEcsuite = true

- 

使用表体附件上传的在column 的cStyle中配置一个columnId, columnId
是当前行上的数据 提交数据时 单据要收集这个字段对应的数据

- 

表格column 字段的 cStyle中配置可以配置 maxCount 最大上传数量,
maxSize 最大上传限制, format 支持上传格式 数组 eg: maxCount: 6,
maxSize: 20Kb, format:['png', 'jpg'] eg:
"{"format":["png","jpg","jpeg","gif"],"maxCount":1,"hideTitle":false,"maxSize":10000}"

- 

使用行附件必须在前端扩展脚本初始化 init中加一行代码
viewmodel._set_data('addAttachment', true)

- 

上面这一行一定要前置执行 不要放在setTimeout里

- 

uploadFile 禁止上传cStyle 中配置 false 默认true

- 

元数据配置bIsNull = false 开启保存前校验是否为空，为空提示错误

- 

objectName取值逻辑 appCode = this.viewModel?.getEnv('appCode')
|| 'mdf'

- 

excel中billitem_base 表中配置cControlType = filelist

- 

审批成功以后协作套件不让上传附件 可以在 cStyle
配examinedNoUpload=false 放开这个限制

### [](#41-行按钮形式的)4.1. 行按钮形式的

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage6.6502a88a.png)

- 

新增上传到 attachmentId上 保存时将
attachmentId提交到后端，浏览时要返回这个值

- 

只在浏览态上传时 附件关联到id字断上

### [](#42-表体行附件)4.2. 表体行附件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage7.d91d7f39.png)

### [](#43-点击按钮弹出展示)4.3. 点击按钮弹出展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage8.1757693d.png)

## [](#5-主表)5. 主表

1.主表附加传参 cControlType = 'filelist'

- 

主表附件，要求在提交时收集当前字段对应的字段 cStyle里可以配置
maxCount 最大上传数量, maxSize 最大上传限制, format 支持上传格式
数组，enableSecurityLevel是否展示密级默认false不展示

- 

cStyle 这中设置 hideTitle = true 展示左侧 label字段, 默认隐藏

- 

objectName取值逻辑 appCode = this.viewModel?.getEnv('appCode')
|| 'mdf'

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage9.aa24be76.png)

5.密级展示样式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage10.9d02eaa2.png)

密级功能是协同组件

## [](#6-协作套件)6. 协作套件

**说明**：协作套件说的cStyle都是指元数据里ecsuite的cStyle,请参考下面配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage11.6649620c.png)

excel在[billtplgroup_base]表里cType 是ecsuite这个容器组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage12.a8fc6bb6.png)

主表附件 cControlType = 'ecsuite'

- 

cStyle里可以配置 maxCount 最大上传数量, maxSize 最大上传限制, format
支持上传格式 数组

- 

eg: maxCount: 6, maxSize: 20Kb, format:['png', 'jpg'] eg:
"{"format":["png","jpg","jpeg","gif"],"maxCount":1,"hideTitle":false,"maxSize":10000}"

- 

enableSecurityLevel是否展示密级默认false不展示

- 

在cStyle配置objectName，修改对应业务线

- 

objectName = cStyle?.objectName || 'YonSuite';

- 

审批成功以后协作套件默认不允许上传
可以在cStyle中配置examinedNoUpload：false, 取消该规则

- 

配置显示下图的附件 评论 任务 参考协同套件fileType配置

在上述cStyle中配置

isEnableAttachGroup: false, // 是否开启分组

attachGroupType: 'xx', // 附件分组对应的业务对象 ---- xx这两个值目前需要手动配置

attachGroupCode: 'xx', // 附件分组对应的业务类型编码 --- 找协同开发协助配置一下 songjier@yonyou.com

authGroup: {

 canAddRowGroup: true, // 是否可以添加分组

 canAddSubRowGroup: true, // 是否可以添加子分组

 canEditGroup: true, // 是否可以编辑分组

 canDeleteGroup: true // 是否可以删除分组

}

 

以后所有的新增设置都在cStyle里设置

otherSsettings

eg: otherSsettings: {

 xxx: 'xxxx'

 

}

### [](#61-手动修改附件的objectid主表附件)6.1. 手动修改附件的objectId(主表附件)

viewModel.on('beforeCreateAttachmentData', function({ data, config }) {

 // 修改data里的objectId为自己的objectId

 const { objectId } = data;

 data.tempObjectId = data.objectId;

});

## [](#7-用户手动获取当前附件个数)7. 用户手动获取当前附件个数

- 附件组件触发这个事件，this.viewModel.execute(`filelist${cItemName}DidecsuiteComponent:this.ecsuiteComponent
}); 用户接收一个ecsuiteComponent 这个是一个promise
对应协同附件的实例

- 

协同套间监听ecsuiteDidMount事件

扩展脚本init里监听一个 附件组件加载完以后就会触发这个事件

基于你的需求可以保存一个附件实例 实例上提供了很多方法 直接调用就行

注意： ${cItemName} 统一替换成excel中billitem_base表中附件的cItemName --> fujian 如下

举例子：viewModel.on(`filelistfujianDidMount`)

协同套间eg：viewmodel.on('ecsuiteDidMount')

 

 

viewModel.on(`filelist${cItemName}DidMount`, async ({ecsuiteComponent}) => {

 this.ecsuiteComponent = await ecsuiteComponent;

 this.ecsuiteComponent.update({

 isSearch: false,

 listData: listData, // 你要传的列表

 }, false)

});

 

其他地方调用

const data = this.ecsuiteComponent;

const count = data.getFileListCount(); // **当前附件个数**

### [](#71-主表附件上传删除触发事件)7.1. 主表附件上传删除触发事件

通过type区分上传和删除 type: 'delete'删除，type: 'upload' 上传

// 删除事件

this.model?.execute('ecsuiteFileChange', {

 fileId, // 删除的附件ID 类型是string｜number

 viewModel: this.model,

 data: this.props.data,

 type: 'delete',

 childrenFieldId: this.props.data?.childrenField,

 cItemName: this.props.data?.cItemName,

 objectId: this.props.data?.objectId,

 objectName: this.props.data?.objectName

})

// 上传事件

this.model?.execute('ecsuiteFileChange', {

 file, // 上传的附件 类型是object

 viewModel: this.model,

 data: this.props.data,

 type: 'upload',

 childrenFieldId: this.props.data?.childrenField,

 cItemName: this.props.data?.cItemName,

 objectId: this.props.data?.objectId,

 objectName: this.props.data?.objectName

})

行附件始终走搜索（不走临时态）

vm.on('beforeAttachment', (data) => {

 data.params.isTemp = false; // 是否上传到临时变量上

 data.params.isSearch = true // 是否打开时搜索

})

## [](#8-领域动态控制按钮协作套件)8. 领域动态控制按钮（协作套件）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage13.27b80674.png)

协同附件在加载完成以后 组件会触发一个事件 ecsuiteDidMount

在扩展脚本里init里处理监听

let _componentInstance = null;

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 _componentInstance = componentInstance;

 componentInstance.then((ecsuiteApi) => {

 if (mode === 'browse') {

 ecsuiteApi.updateAuth({

 auth: {

 canDownload: true,

 canDelete: true,

 canUpload: true,

 }

 })

 // ---- 上传

 const objectId = ecsuiteApi.getAllParams().objectId;

 const objectName = 'YonSuite';

 // ---- 更新页面

 ecsuiteApi?.update?.({

 objectName,

 objectId,

 }, true)

 }

 

 })

});

// 动态控制canDownload canDelete canUpload

 

切换mode的时候可以监听modeChange事件

 

vm.on('modeChange', (mode) => {

 if (_componentInstance) {

 _componentInstance.then((ecsuiteApi) => {

 if (mode === 'browse') {

 ecsuiteApi.updateAuth({

 auth: {

 canDownload: true,

 canDelete: true,

 canUpload: true,

 }

 })

 } else {

 ....

 }

 })

 }

})

## [](#9-批量获取文件详情)9. 批量获取文件详情

const arr = [{

 businessId: 附件上传的ID

 objectName: 附件上传的标志位

}]

window.YYCooperationBridge.YYFormFileGetAllListByObjectId(arr, false).then((data) => {

 // data附件详情信息

})

## [](#10-浏览态上传附件)10. 浏览态上传附件

// 下面方式一二都需要满足disable=false bCanModify = true readOnly=false;

//无法实现的使用方式三

方式一：所有附件浏览态都可以上传

viewmodel?.getParams?.()?.uploadInBrowse = true;

方式二：指定附件浏览态上传

在附件UI元数据cStyle中配置privateUploadInBrowse: true

方式三：监听vm.on('beforeAttachment', (data) => {

 // canDownload,

 // canDelete,

 // canUpload,

 data.data.canUpload = true;

 data.data.canDelete = true

})

 

vm.on('beforeAttachment', (data) => {

 const rowIndex = data.data.rowIndex

})

voucherlist上的action querysubtablefilelist

 

监听beforequerysubtablefilelist 设置params.params

params.params.searchTable 数组 搜索那几个子表

params.params.serachItemNames // 搜索那几个字断 默认搜id 浏览态上传的需要另外配置'attachmenId'

params.params.serachIndexList // 展示第几行数据

params.params.objectName // 上传时候用的objectName是什么

yya.get('btnQuerySubTableFileList').on('beforeclick', (params = {}) => {

 params.searchTable = ['expenseApplyInfs'];

 params.serachIndexList = [1];

 params.objectName = 'mdf'

})

## [](#11-动态设置行按钮附件objectid-子表)11. 动态设置行按钮附件objectId （子表）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage14.b2f1ca2e.png)

action name 是 attachment

1. 行附件字断默认取行上的attachmentId字断实际上部分情况下attachmentId === 行ID

2. 当需要在点击行按钮弹出附件弹窗之前改变这个默认值可以监听动作的before事件

eg:

viewmodel.on('beforeAttachment', ({

 params,

}) => {

 params.objectId = params?.rowData.settlementApplyInfs_id'; rowData 是当前行数据 挂载附件的ID';

 params.objectName = 'mdf'; 自己看下详情 如上图位置'附件挂载时的业务ID';

})

## [](#12-动态修改行附件展示形式)12. 动态修改行附件展示形式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage15.62bf2cb4.png)

和上面十一相似

eg:

viewmodel.on('beforeAttachment', ({

 params,

}) => {

 params.fileType = 1;

})

### [](#121-获取弹窗点击确定-before事件)12.1. 获取弹窗点击确定 before事件

yya.on('beforeTableAttachmentHandleOk', ({ okCallBack, uploadList, deleteList }) => {

 // uploadList 弹窗打开以后上传的附件数组

 // deleteList 弹窗打开以后删除的附件数组

 // 自定义逻辑成功以后回调okCallBack

 if (uploadList.length) {

 okCallBack()

 } else {

 cb.utils.alert('上传的附件不正确', 'error')

 }

 return false;

})

## [](#13-行附件扩展脚本干预附件按钮状态)13. 行附件扩展脚本干预附件按钮状态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FuJianShiYongWenDangimage16.ae6623b2.png)

// 扩展脚本中加一下这个监听

viewmodel.on('attachemtAfterMount', () => {

 window.componentInstanceInfo.updateAuth({

 auth: {

 enablePersonalLimit: false, // 自己上传的别人也可以删除 传false 否则传true

 canDownload: true,

 canDelete: true,

 canUpload: true,

 }

 })

})

## [](#14-动态设置附件分组)14. 动态设置附件分组

let _componentInstance = null;

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 _componentInstance = componentInstance;

 componentInstance.then((ecsuiteApi) => {

 ecsuiteApi.updateGroupId({

 attachGroupType,

 attachGroupCode,

 defaultGroupCode, // 默认附件分组，不需要可以不传

 })

});

领域例子：-----------------------------------

//初始化协同附件

viewmodel.on('ecsuiteDidMount', async ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 // 可以把这个componentInstance 赋值给作用域下的一个变量 之后直接引用

 _componentInstance = await componentInstance;

 console.log("协同附件初始化")

 if(_componentInstance){

 componentInstance.then((ecsuiteApi) => {

 if(fileGroupInfo && ecsuiteApi.updateGroupId){

 ecsuiteApi.updateGroupId({attachGroupType: fileGroupInfo.attachGroupType, attachGroupCode: fileGroupInfo.attachGroupCode, defaultGroupCode: fileGroupInfo.groupCode});

 }

 })

 }

});

## [](#15-手动修改附件objectid和objectname)15. 手动修改附件objectId和objectName

// 监听要处理的附件保存他的实例，便于之后多次操作实例上的方法

viewModel.on(`filelist${cItemName}DidMount`, async ({ecsuiteComponent}) => {

 this.ecsuiteComponent = await ecsuiteComponent;

 })

});

 

其他地方调用

const data = this.ecsuiteComponent;

data.update({

 objectId: 'xxxx',

 objectName: 'xxxx',

}, true);

## [](#16-编辑态组件不走临时态解决办法协同套件)16. 编辑态组件不走临时态解决办法（协同套件）

场景说明1：单据编辑后不走save直接提交解决方案

协同附件在加载完成以后 组件会触发一个事件 ecsuiteDidMount

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 // componentInstance 是附件的组件实例 是个promise

 componentInstance.then((ecsuiteApi) => {

 if (mode === 'edit') {

 const objectId = vm.get('id').getValue();

 ecsuiteApi.update({

 objectId,

 tempObjectId: objectId,

 isTemp: false,

 isSearch: true,

 }, false)

 }

 })

});

场景说明2：异步保存，获取协作套件零时ID

协同附件在加载完成以后 组件会触发一个事件 ecsuiteDidMount

vm.on('ecsuiteDidMount', () => {

 vm.on('afterSave', () => {

 const fileListSaveCacheObj = vm.getCache('fileListSaveCache')?._ecsuite;

 // fileListSaveCacheObj = {

 //bindList: {[oldObjectId: 'xx', 'objectId': 'xx', 'bussinessType': 'xxx']},

 // deleteList: ['fileId1xxxx',...]}

 // 然后参考17，调用删除和绑定接口

 })

});

## [](#17-协同重要接口领域扩展可使用)17. 协同重要接口，领域扩展可使用

### [](#171-删除接口)17.1. 删除接口

const fileDeleteList = [文件ID，文件ID...];

window.YYCooperationBridge?.YYFormFilesTempStateDel?.({ data: { fileIds: [...fileDeleteList] } })

### [](#172-绑定接口)17.2. 绑定接口

eg: 单据id没生成之前用临时ID上传，单据ID生成以后把零时ID和单据ID绑定

const bindArr = [{

 objectId: 单据ID

 oldObjectId: 临时ID,

 bussinessType: objectName,

}, {

 objectId: 单据ID

 oldObjectId: 临时ID,

 bussinessType: objectName,

}....];

window.YYCooperationBridge?.YYUploadedFilesBind?.(bindArr);

修改绑定接口objectName的方式如下：

const cStyle = yya.getGridModel().get('cStyle') || ''

const parseCstyle = JSON.parse(cStyle || '{}')

parseCstyle.privateBussinssType = 'YonSuite'

yya.getGridModel().setState('cStyle', JSON.stringify(parseCstyle))

### [](#173-获取附件列表)17.3. 获取附件列表

const requestList = [{

 businessId: '单据ID',

 objectName: 'YonSuite', // 具体看默认是YonSuite

}];

window.YYCooperationBridge.YYFormFileGetAllListByObjectId(requestList, false).then((data) => {

 // data 获取到的所有附件

})

 

const requestList = [{

 businessId: '111', // 复制到这个上

 objectName: 'YonSuite',

 

 oldBsinessId: '22',

 oldObjectName: 'YonSuite1', // 原始值

}];

window.YYCooperationBridge.copy(requestList, false).then((data) => {

 // data 获取到的所有附件

})

### [](#174-复制文件接口)17.4. 复制文件接口

const requestList = [{

 "sourceObjectId": "123456",

 "sourceObjectName": "u8c",

 "targetObjectId": "654321",

 "targetObjectName": "u8c"

}]; // 从sourceObjectId 复制一份到 targetObjectId

window.YYCooperationBridge.YYFormFilesCopyAll(requestList, (data) => {

 // data 复制后数据

})

## [](#18-动态设置附件按钮状态)18. 动态设置附件按钮状态

// 监听要处理的附件保存他的实例，便于之后多次操作实例上的方法

setTimeout(() => {

 this.model.setDisabled(false)

}, 10)

## [](#19-动态更新objtecid和objectname)19. 动态更新objtecId和objectName

update({

 objectId: 'xxx',

 objectName: 'xxx'

 isSearch: true

})

## [](#20-获取附件个数)20. 获取附件个数

const checkAttachmentCount = async (viewmodel, requestList) => {

 // requestList = [{objectId: 'xxxx', objectName: 'mdf'}]

 const data = await window?.YYCooperationBridge?.YYFormFileGetAllListByObjectId(requestList, false);

 if (data?.length) {

 return true;

 }

 cb.utils.alert('请您先上传附件', 'error');

 return false;

 }

await checkAttachmentCount(viewmodel, [{objectId: 'xxxx', objectName: 'mdf'}])

移动端按钮类型的扩展

viewmodel.on('beforeAttachment', (data) => {

 if (data.attachmentObj) {

 data.attachmentObj.uploadType = 'image';

 }

 return true;

})

## [](#21-行附件自定义传参)21. 行附件自定义传参

yya.on('beforeAttachment', (obj) => {

 obj.params.otherSetting = {

 groupId: 'xxxx'

 }

})

## [](#22-独立按钮触发附件弹窗)22. 独立按钮触发附件弹窗

// 处理按钮点击事件

viewModel.get('btnAddRowxwr0917s').on('click', function(params){

 var args = cb.utils.extend(true, {}, { params: { ...params, dataReady: true} });

 args.cShowCaption = this._get_data('cShowCaption');

 args.cCaption = this._get_data('cCaption');

 

 var self = this;

 args.disabledCallback = function () {

 self.setDisabled(true);

 }

 args.enabledCallback = function () {

 self.setDisabled(false);

 }

 viewModel.set('addAttachment', true);

 viewModel.biz.do('attachment',viewModel, args)

});

// 监听action的before事件。

viewModel.on('beforeAttachment', (data) => {

 data.params.isTemp = false; // 是否上传到临时变量上

 data.params.isSearch = true // 是否打开时搜索

 data.params.objectId = 'xxx'; // 自己定义

 data.params.objectName = 'mdf'; // 自己定义

})；

// 弹窗确定触发 全文搜 beforeTableAttachmentHandleOk

## [](#23-修改图片组件tag)23. 修改图片组件tag

框架在初始化的时候触发一个事件

this.simpleModel?.execute('beforeFileComponentSetConfig', { config });

 

领域对接

yya.get('fujian').on('beforeFileComponentSetConfig', ({ config }) => {

 config.otherSsettings = {};

 config.otherSsettings.imageTagSettings = { // 图片不合格配置,tagValue不能一样

 optButtons: [

 { name: '不合格', showTag: true, showButton: true, tagValue: 1 },

 { name: '合格', showTag: false, showButton: true, tagValue: 2 }

 ], // 操作按钮：字段名、展示名称

 initData: [{

 id: '61e3ffc9d0e978002c4bdcae',

 tagValue: 1

 }, {

 id: '61e3ffc9d0e978002c4bdcad',

 tagValue: 2

 }],

 confirmCallback: unqualifiedRes => { // 点确认，回传不合格的数据,返回格式与rewriteData一致

 console.log(">>>>>>unqualifiedRes", unqualifiedRes);

 }

})

协同附件在加载完成以后 组件会触发一个事件 ecsuiteDidMount

vm.on('ecsuiteDidMount', ({ecsuiteComponent: componentInstance}) => {

 

 componentInstance.then((ecsuiteApi) => {

 vm.on('beforeSave', () => {

 // 获取当前附件列表

 const fileList = ecsuiteApi.getFileList();

 })

 })

});

## [](#24-常见问题)24. 常见问题

### [](#241-附件保存不上)24.1. 附件保存不上

- 首先确认一下是否走了平台的save方法，只有平台的save处理了附件后续的挂载方法，如果

### [](#242-联系人)24.2. 联系人

- 框架前端：韩婷

- 

协同附件组件前端负责人：王明 ， 陈娅情

- 

协同后端：宋杰