---
title: "领域前端多语性能优化方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-lingyuqianduanduoyuxingnengyouhuafangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 领域前端多语性能优化方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-lingyuqianduanduoyuxingnengyouhuafangan | 所属：指南

# [](#领域前端多语性能优化方案)领域前端多语性能优化方案

### [](#1-背景)1 背景

多语性能优化背景经过统计，目前生产环境开启了3种语言的租户有27万，其中简体中文为启用状态、并且有租户级多语词条的仅3000租户，即只有这些租户需要开启多语，其他27万租户都不需要默认开启多语。关闭多语后性能优化收益较大。产品考虑后，不做商务形态的修改，仅增加租户参数：是否启用多语，根据这个租户参数，在未启用多语的时候，不请求多语服务获取词条，整体提升页面访问效率（预计500ms-700ms优化收益）

### [](#2-产品需求设计)2 产品需求设计

- 初始化时，如果系统语种选择英语或繁体，则打开参数
- 增加是否启用多语参数，只有启用多语后才能启用其他语种并支持词条在租户下个性化翻译。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyuqianduanduoyuxingnengyouhuafangan_image1.52eca8dd.png)

### [](#3-语言设置新增支持是否多语参数)3 语言设置新增支持是否多语参数

- 进入语言设置后，界面上增加是否启用多语言参数和提示，从后台读出参数值加载。
- 参数=F时，不允许启用停用语言；是否启用=T时，按原有逻辑，即可启用列表上的语言，系统语言不允许停用。
- T->F：如果系统语言为非简体，则提示“系统语言非简体不允许关闭多语”，否则关闭所有其他语种。切换时弹框提示：“是否关闭多语”。
- F->T：不提示。切换时弹窗提示：“是否打开多语言”。5) 提示是因为本界面没有保存按钮。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyuqianduanduoyuxingnengyouhuafangan_image2.82672415.png)

### [](#4-技术方案设计)4 技术方案设计

#### [](#41-是否开启多语标识前端获取)4.1 是否开启多语标识前端获取

- 工作台上下文提供是否启用多语的信息工作台在上下文中新增了是否开启多语的标记字段multilingualFlag，两种方式会影响改字段的值：租户管理员在语言设置节点进行启用或停用多语言时（设置操作请参见本文三）；工作台刷租户级的默认字段值以上两种方式将会影响该字段的值，进而整体影响各领域是否拉取多语词条的业务逻辑。
- multilingualFlag 业务含义字段业务含义类型说明multilingualFlag当前租户是否开启多语言Booleantrue 开启了多语false 未启用多语，需默认中文开发可以在控制台中执行以下代码判断该租户是否启用多语（也可以直接去语言设置节点查看）

jDiwork.getContext((data)=>{ console.log(data.ext.multilingualFlag) });

#### [](#42-多语抽取方案调整)4.2 多语抽取方案调整

##### [](#421-已经在开发者中心流水线进行多语抽取的项目)4.2.1 已经在开发者中心流水线进行多语抽取的项目

1）修改config.properties文件内多语替换规则

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyuqianduanduoyuxingnengyouhuafangan_image3.ac474756.png)

MDD单据：

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid") /* "%resvalue" */","js":"cb.lang.template("%resid") /* "%resvalue" */","jsx":"cb.lang.template("%resid") /* "%resvalue" */"}

// 改成

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid", "%resvalue") /* "%resvalue" */","js":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */","jsx":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */","ts":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */"}

CN项目：

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid") /* "%resvalue" */","js":"lang.template("%resid") /* "%resvalue" */","jsx":"lang.template("%resid") /* "%resvalue" */"}

// 改成

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid", "%resvalue") /* "%resvalue" */","js":"lang.template("%resid", "%resvalue") /* "%resvalue" */","jsx":"lang.template("%resid", "%resvalue") /* "%resvalue" */","ts":"lang.template("%resid", "%resvalue") /* "%resvalue" */"}

改这个的目的是：会将 "你好"抽取成cb.lang.template('YS_PF_UCFMDF_00000***', '你好'); 第二个参数为默认值，如果后端多语资源未拉取回来，则走默认中文

2）删除本地pack.js繁体和英文资源，保留中文拼接资源

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyuqianduanduoyuxingnengyouhuafangan_image4.36863bbf.png)

将pack.js文件内容精简为

module.exports = {

 "zhcn":{

 P_YS_FED_FW_0001026038: '确定要<%=abandonText%>么'

 ... // 如果你们没有拼接资源则不需要加上

 },

 "zhtw":{},

 "enus":{}

}

备注：只留下拼接字段，源代码里面拼接字段还走以前的逻辑，不做处理, 如果没有拼接字段，zhcn都是空对象即可

##### [](#422-本地代码手动多语抽取的项目)4.2.2 本地代码手动多语抽取的项目

- 同"在开发者中心流水线进行多语抽取"
- 修改本地代码

用以下备注的替换脚本，将 lang.template('P_YS_PF_AUTHF_0000112875') || cb.lang.template('P_YS_PF_AUTHF_0000112875');
还原成"角色视角"，然后改成走流水线多语抽取，参考以下(1)||(2)

（2.1）lang-replace.js （适用于CN开发的前端工程）

const fs = require('fs');

const path = require('path');

const ROOT = path.join(__dirname, 'src')

 

const scanDir = ROOT;

 

let paths = [];

function addFileToOSSSync(src) {

 var docs = fs.readdirSync(src);

 docs.forEach(function (doc) {

 var _src = src + '/' + doc;

 var st = fs.statSync(_src);

 if (st.isFile()) {

 if (_src.endsWith('.js') || _src.endsWith('.ts') || _src.endsWith('.jsx') || _src.endsWith('.tsx')) {

 paths.push(_src)

 }

 } else if (st.isDirectory()) {

 addFileToOSSSync(_src);

 }

 })

}

addFileToOSSSync(scanDir)

paths.forEach(filePath => {

 let file = fs.readFileSync(filePath).toString('utf-8');

 let publicAssets = file.match("lang.template") || []

 if (publicAssets && publicAssets.length > 0) {

 file = file.replace(/lang.template([^)]*?)[s]*/*[s]*"([^"]*?)"[s]**//g,""$1"")

 }else{

 console.log(filePath)

 }

})

（2.2）lang-replace.js （适用于MDF开发的前端工程）：

const fs = require('fs');

const path = require('path');

const ROOT = path.join(__dirname, 'src')

 

const scanDir = ROOT;

 

let paths = [];

function addFileToOSSSync(src) {

 var docs = fs.readdirSync(src);

 docs.forEach(function (doc) {

 var _src = src + '/' + doc;

 var st = fs.statSync(_src);

 if (st.isFile()) {

 if (_src.endsWith('.js') || _src.endsWith('.ts') || _src.endsWith('.jsx') || _src.endsWith('.tsx')) {

 paths.push(_src)

 }

 } else if (st.isDirectory()) {

 addFileToOSSSync(_src);

 }

 })

}

addFileToOSSSync(scanDir)

paths.forEach(filePath => {

 let file = fs.readFileSync(filePath).toString('utf-8');

 let publicAssets = file.match("cb.lang.template") || []

 if (publicAssets && publicAssets.length > 0) {

 file = file.replace(/cb.lang.template([^)]*?)[s]*/*[s]*"([^"]*?)"[s]**//g,""$1"")

 }else{

 console.log(filePath)

 }

 fs.writeFileSync(filePath, file);

})

console.log("已调整完成")

#### [](#43-多语请求适配非mdd开发项目适配)4.3 多语请求适配(非mdd开发项目适配)

非mdd开发的项目是使用
ac-lang-cn包实现统一多语请求的，目前该组件实现了在多语开关不开启时默认不请求多语资源（即根据工作台上下文获取到多语开关标识，决定是否调用lang.jsonp即可）。

- 先将ac-lang-cn包升级到3.0.4后版本才有该功能。
- 修改原调用lang.jsonp的代码逻辑，参考如下：

window.jDiwork.getContext((data) => { 

 const { ext: {multilingualFlag},ymsHost } = data;

 const lang_servers_centre = ymsHost + "/iuap-apcom-i18n"; 

 if(multilingualFlag){ 

 lang.jsonp(0, 'YS_FED_MDF-COMPS', lang_servers_centre, (data) => { 

 require("入口文件名称"); 

 }); 

 }else{ 

 require("入口文件名称"); 

 } 

});

特别说明：以下代码依赖工作台提供的jdiwork.js，请确保已加载该文件。如果是以浏览器页签方式打开，没有加载jdiwork.js的场景，请参考4.1内容，自行获取multilanglfag参数。

#### [](#44-多语录入组件适配非mdd开发项目适配)4.4 多语录入组件适配(非mdd开发项目适配)

多语录入组件适配非mdd开发的项目单独使用平台提供统一的多语录入组件@mdf/inputmultilang
（具体信息可查看：[https://package.yonyoucloud.com/package/detail/@mdf/inputmultilang](https://package.yonyoucloud.com/package/detail/@mdf/inputmultilang)）。在多语开启时，多语录入组件UI模式和数据结构不变；在多语关闭时，多语录入组件变为普通输入框组件，数据结构不变。多语录入组件@mdf/inputmultilang适配多语性能优化后的版本为3.0.29，请各CN项目前端工程升级。该组件后续可纳入
TNS 统一管理、统一升级。

- 先将@mdf/inputmultilang包升级到 3.0.29；
- @mdf/inputmultilang组件引用时props增加一个属性showIcon，同上4.1方式获取multilingualFlag值判断多语是否启用，如果multilingualFlag为true时showIcon的值也为true，反之showIcon的值也为false。