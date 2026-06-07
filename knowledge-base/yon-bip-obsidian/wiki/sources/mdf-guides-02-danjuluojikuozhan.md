---
title: "单据逻辑扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-danjuluojikuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 单据逻辑扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-danjuluojikuozhan | 所属：指南

# [](#单据逻辑扩展)单据逻辑扩展

根据模板生成的页面，不满足当前需求时，我们可以通过增加扩展脚本，在扩展脚本中实现特定交互（例如字段的联动、修改表格数据、动态控制字段的显隐）。扩展脚本是放在business文件夹中。business文件夹根据领域划分，因此在business下建立自己领域code值文件夹，并将所有扩展脚本放置里面。

## [](#1-命名规则)1. 命名规则

### [](#11-模板扩展脚本)1.1. 模板扩展脚本

模板扩展文件名字是有领域编码（配置cSubId，如：bd）和当前的单据号billNo（配置cBillNo，如：org_center_card）组成。eg:
xx_VM.Extend.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjuluojikuozhan_image1.7b3bbace.png)

### [](#12-查询区扩展脚本)1.2. 查询区扩展脚本

查询区的扩展文件名是在excel中配置的。在excel中[pb_meta_filters]表中behaviorObject字段定义当前查询区扩展文件的路径。eg:
emm/emm_emm_inspectstd_list_filterVM.Extend.js。查询区扩展脚本也放在领域Code文件夹下。

默认规范：'领域Code_'+'单据编号_'+'filterVM.Extend.js'。

详见：[《查询区逻辑扩展》](#/guides/02-chaxunquluojikuozhan)

### [](#13-参照扩展脚本)1.3. 参照扩展脚本

详见：[《参照逻辑扩展》](#/guides/02-canzhaoluojikuozhna)

### [](#14-扩展脚本位置)1.4. 扩展脚本位置

扩展脚本存放在前端工程的business目录下，如图所示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjuluojikuozhan_image2.a30460f1.png)

## [](#2-扩展加载流程)2. 扩展加载流程

### [](#21-扩展脚本路径拼接)2.1. 扩展脚本路径拼接

Node端拿到Java传过来的标准协议后，做了如下转换，新增了三个字段传到客户端：

//viewmeta.vmName = viewmeta.cSubId + '_' + viewmeta.cBillNo + '_' + "VM"

viewmeta.vmName = _getVmName(viewmeta);

 

//viewmeta.extendFileName = viewmeta.vmName + '.Extend.js'

viewmeta.extendFileName = _getExtendVmFileName(viewmeta, extendName);

 

//viewmeta.extendVmName = viewmeta.vmName + '_Extend'

viewmeta.extendVmName = _getExtendVmName(viewmeta, extendName);

 

....

 

const _getVmName = (obj) => {

 if (!obj) return;

 return obj.cSubId + '_' + obj.cBillNo + '_' + "VM"

}

||字段说明||字段名称||值||备注|
||模板扩展脚本文件名称||extendFileName||AA_aa_orgtree_VM.Extend.js|||
||模板扩展的vm名称||extendVmName||AA_aa_orgtree_VM_Extend|||
||模板vm名称||vmName||AA_aa_orgtree_VM|||

### [](#22-页面模型中加载扩展脚本)2.2. 页面模型中加载扩展脚本

model.prototype.initData = function () {

 .....

 // 如：RM/RM_rm_retailvouch_VM_billing.Extend.js

 var extendFile = '<%=subId%>/<%=extendFileName%>';

 cb.require([extendFile], function (extend){

 ......

 }, function(error){

 .......

 });

};

使用方式

### [](#23-扩展脚本创建)2.3. 扩展脚本创建

在扩展脚本中，可以获取页面控件层面的model,调用相关model的API实现具体的特定的交互。

cb.define(['common/common_VM.Extend.js'], function (common) {

 var SB_billNolist_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 

 }, 

 

 }

 try {

 module.exports = SB_billNolist_VM_Extend;

 } catch (error) {

 

 }

 return SB_billNolist_VM_Extend;

});

### [](#24-使用示例)2.4. 使用示例

以省市参照联动扩展为例

init: function (viewmodel) {

 // 在城市参照弹出之前，获取省参照的value，通过setFilter将value存放到过滤条件中（在城市参照获取城市列表时，会通过getFilter()获取value，作为过滤参数传到服务端）

 viewmodel.get("bankcity").on('beforeBrowse', function (data) {

 var provinceValue;

 if(!viewmodel.get("bankprovince").getValue()){

 cb.utils.alert("请选择开户省");

 return false;

 }else{

 provinceValue = viewmodel.get("bankprovince").getValue();

 }

 var condition = {

 "isRefreshData": true,

 "parentId":provinceValue,

 "province":provinceValue

 };

 this.setFilter(condition);

 });

 // 如果省参照的值有改变，就将城市参照的值清空

 viewmodel.get("bankprovince").on('afterValueChange', function (data) {

 viewmodel.get("bankcity").setValue(null);

 });

}

- 新建一个文件名为AA_enterprise_VM.Extend.js放到omc_test_web/src/client/business/AA下

- 

里面init函数内代码如下：

"bankcity"为城市选择参照的字段名称（excel表中对应的cFieldName）

- 

"bankprovince"
为省选择参照的字段名称，provinceValue为获取的省选择参照的id。

- 

模版内所有字段名称可在 omc_test_web/autogenerate/viewmodel/AA
下自动生成的对应的渲染模版js文件内找到

- 

"beforeBrowse"为城市选择参照，参照model弹出前的方法

- 

viewmodel对应的方法查看《编程模型与API》章节

### [](#25-扩展公共逻辑)2.5. 扩展公共逻辑

一般会把通用的逻辑进行抽取放到common中。一般会在bussiness中建立一个common文件夹里面放一些公共逻辑。其他各业务节点可以先将公共脚本载入进行依赖。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjuluojikuozhan_image3.4fc61939.png)

## [](#3-web和移动)3. Web和移动

**Web和移动共用同一套扩展脚本（前提是Web和移动的billno相同）**