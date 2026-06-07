---
title: "附件扩展案例"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujiankuozhananli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 附件扩展案例

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-fujiankuozhananli | 所属：指南

# [](#附件扩展案例)附件扩展案例

## [](#1-web端)1 Web端

### [](#11-根据单据状态控制它附件是否允许删除)1.1 根据单据状态控制它附件是否允许删除

- 监听组件加载事件

let ecsuiteComponent;

// 根据状态判断是不是要更新组件状态

const updateAuth = () => {

 setTimeout(() => {

 if (ecsuiteComponent) {

 const obj = {

 auth: {

 canUpload: true,

   canDelete: true,

 },

 beforeTsDelete: '这个时间之前的不能删除，之后的才可以删除'

 }

 ecsuiteComponent.updateAuth({

 ...obj

 })

 }

 }, 500)

}

// 监听事件获取组件实例

viewModel.on(`ecsuiteDidMount`, ({ecsuiteComponent}) => {

 ecsuiteComponent.then((data) => {

 ecsuiteComponent = data; // data就是组件实例

 updateAuth();

 });

});

viewModel.on('afterLoadData', () => {

 updateAuth();

})

### [](#12-获取协作套件上传businessid和删除的附件id)1.2 获取协作套件上传businessId和删除的附件ID

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujiankuozhananli_image1.189b3bd4.png)

viewmodel.execute('customEventBeforeSave');

const mainFieldsCache = viewmodel.getCache('fileListSaveCache') || {}; // 主表

const ecsuite = mainFieldsCache._ecsuite || {};

const bindInfo = ecsuite.bindList?.[0]; // 上传的的businessId

const deleteList = ecsuite.deleteList; // 删除的文件列表

### [](#13-附件绑定前事件)1.3 附件绑定前事件

// 处理绑定前数据

viewmodel.on('beforeBindAttachment', () => {

 // 主表的数据存到viewmodel.__data.cache.fileListSaveCache

 const fileListSaveCache = viewmode.getCache('fileListSaveCache') || {};

 // _ecsuite这个key是协作套件的，修改绑定值可以修改fileListSaveCache['_ecsuite'].bindCItemName:'xxxx'

})

fileListSaveCache的数据格式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujiankuozhananli_image2.b72bbdd1.png)

### [](#14-filelist组件扩展)1.4 filelist组件扩展 

// 1、获取实例

let ecsuiteIns;

viewModel.on(`filelist${cItemName}DidMount`, async({ecsuiteComponent}) => {

 ecsuiteComponent.then((data) => {

 ecsuiteIns = data;

 })

});

let tempObjectId;

viewModel.on('beforeCreateAttachmentData', ({ data, config }) => {

 if (!ecsuiteIns) {

   data.tempObjectId = 'tempObjectId'; //

 }

})

// 需要使用实例的地方

if (ecsuiteIns) {

 // 组件加载了

 tempObjectId =

 viewmodel.get(cItemName).__data.listeners[0].data.tempObjectId; // 注意判空

 ecsuiteIns.update({

 isSearch: true

 }, true)

} else {

 // 组件没有加载

 tempObjectId = 'xxxxx'

}

 // 更新组件按钮权限

ecsuiteIns.updateAuth({

 auth: {

 canDelete: false, // 是否可以删除

 canUpload: false, // 是否可以上传

 canDownLoad: true, // 是否可以下载

}

})

### [](#15-filelist组件上传使用领域自己的服务)1.5 filelist组件上传使用领域自己的服务

1、首先获取到附件组件的实例

如上面获取方式

let ecsuiteIns;

viewModel.on(`filelist${cItemName}DidMount`, async ({ecsuiteComponent}) => {

 ecsuiteComponent.then((data) => {

 ecsuiteIns = data; // 组件实例

 })

});

2、监听beforeFileListUpload

// @params fileData 上传返回的参数

// @params obj 当前filelist组件的一些参数

viewmodel.on('beforeFileListUpload', function ({ fileData, ...obj}) {

 // 写自己的上传逻辑

 return false;

})

3、 上传完成整合数量

ecsuiteIns.update({

 listData: [], // 整合的数据，具体数据格式需要按照协同的格式来

 updateListData: true

});

整合格式必须包含下面

[{"id": "665830f9e9ae6978d84b27aa",

"fileExtension": ".jpg",

"fileName": "171705573527094"}]

### [](#16-阻止附件请求接口方式)1.6 阻止附件请求接口方式

viewmodel.on('beforeCreateAttachmentData', ({data}) => {

 data.isSearch=false;

 data.isTemp= true;

 data.canUpdate = false

})

### [](#17-attachment事件扩展)1.7 attachment事件扩展

viewmodel.on('beforeAttachment', (data) => {

 // data.params.canUpload = false;

 data.params.canDelete = false;

 data.params.canDownload = false;

})

### [](#18-扩展行附件点击事件打开自定义弹窗)1.8 扩展行附件点击事件，打开自定义弹窗

viewModel.on('beforeAttachment', ({ params } ) => {

 debugger

 const { objectName, objectId, rowIndex, childrenField } = params || {};

 // childrenField 当前子表 rowIndex 当前子表行

 const gridModel = viewModel.get(childrenField);

 const columns = gridModel.get('columns');

 const fileItems = [];

 for (const key in columns) {

 const item = columns[key];

 const cControlType = item.cControlType?.toLocaleLowerCase();

 if (cControlType === 'filelist') {

 fileItems.push(key);

 }

 }

 const data = gridModel.getAllData()[rowIndex]; // 当前行数据

 const allTabelFileData = viewModel.getCache('allTabelFileData') || {};

 const allFiles = [];

 fileItems.forEach(item => {

 const value = data[item] || '';

 if (value) {

 const key = `${objectName}_${value}`;

 const list = allTabelFileData[key] || [];

   allFiles.push(...list);

 }

 })

 cb.utils.previewPicture(allFiles || [], 0, '', undefined, viewModel);

 debugger;

 return false;

})

### [](#19-领域扩展组件使用filelist组件)1.9 领域扩展组件使用FileList组件

const { FileList } = cb.components.basic;

const fileListModel = new cb.models.SimpleModel({

 bCanModify: true,

 value: 'objectId',

})

const viewmodel = 单据的viewmodel 或者没有就new一个 new

cb.models.ContainerModel({params: {query: { serviceCode: 'xxxxx' }}});

viewmodel.setCache('dataLoaded', true);

<FileList viewModel={viewmodel} model={fileListModel} cStyle={JSON.stringfiy({objectName: 'xxxxx'})} />

## [](#2-移动端)2 移动端

### [](#21-移动端获取实例方法)2.1 移动端获取实例方法

领域拿附件的实例处理的弊端，因为框架组件内部也是通过附件的实例去处理附件状态，领域控制的时候可能会被框架的覆盖，时机不准确
为了保险，领域可以通过2.1和2.2叠加使用设置附件的状态

let ecsuiteInfo；

viewmodel.get('xxx').on('componentDidMount', (data) => {

 // data组件实例

 console.log(data);

 ecsuiteInfo = data；

})；

// 需要调用的地方

ecsuiteInfo?.getFileListCount();

// 更新组件按钮权限

ecsuiteInfo.updateAuth({

 auth: {

 canDelete: false, // 是否可以删除

 canUpload: false, // 是否可以上传

 canDownLoad: true, // 是否可以下载

 }

})

### [](#22-公有云领域处理附件组件的auth)2.2 公有云领域处理附件组件的auth

说明：组件在调用updateAuth的前会触发beforeEcsuiteSetAuth 这个事件

viewmodel.on('beforeEcsuiteSetAuth', (data, paramse) => {

 if (params.cItemName === 'xxxx某个附件字段') {

 data.auth.canDelete = false;

 data.auth.canUpload = false;

 data.auth.canDownLoad = true;

 }

})

### [](#23-领域自定义引入附件组件)2.3 领域自定义引入附件组件

const FileList = cb.components.basic.FileList

<FileList model={附件的模型} viewModel={外层的viewmoedl} />

<FileList

 cItemName="negotiationAttachment"

 isSearch={true}

 model={viewModel.get('negotiationAttachment')}

 viewModel={viewModel.getRootParent()}

 cStyle={'{"privateUploadInBrowse":true,"uploadType":"file"}'}

/>