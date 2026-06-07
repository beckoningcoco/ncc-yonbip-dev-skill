---
title: "打印服务接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-dayinfuwujieru"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 9
---

# 打印服务接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-dayinfuwujieru | 所属：指南

# [](#打印服务接入)打印服务接入

## [](#1-打印准备工作)1. 打印准备工作

- 进入
**数字化建模**-**系统管理**-**应用管理**-**我的应用**,在对应的领域(此处我们选择的是采购供应)下新建自建应用.此处我们新建一个询报价的应用.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image1.27345aea.png)

- 新建完成后,可以看到该应用对应的application信息.记下此处的applicationCode信息,后面会用到.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image2.69d35b86.png)

- 

将应用中的applicationcode信息,租户信息,领域信息和excelUI元数据模板的信息发送给李阳.其中applicationcode和租户信息都可以在上图中拿到.领域信息在后台代码的ucf-mdd-bootstrap/resources/application.properties属性中的[spring.application.name](http://spring.application.name)信息,此处使用的是common-mdf

- 

填写如下的excel表信息.此处复用的领域数据信息,所以领域数据格式不需要调整.应用数据格式下的code和分类数据格式的parentcode和code的前缀都是使用的上一步指定的applicationcode信息.分类数据格式code的后半部分是指的excelUI模板的模板名称.将该excel填写完毕后发送给李阳由他进行一个开通.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image3.96abbadc.png)

- 填写如下excel表信息,如果不需要流程,则交易类型所在行信息可以为空,在单据类型名称所在的行信息中的**是否支持流程**选择为0即可.如果需要支持流程,则可以参考下一篇的流程专题.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image4.5be250d2.png)

- 配置完成后,可以通过访问一个url地址来判断配置是否完成.通过这个请求将ExcelUI中的数据源信息注册到打印模板中. [http://xxx.xxx.com/domain/getbillMetaByBillCode?billCode=d1b8c249-99b0-44ad-bc48-96d3a7f83ddd.ucf_cus_quotation_card](http://u8c-baseservice-api.daily.app.yyuap.com/domain/getbillMetaByBillCode?billCode=d1b8c249-99b0-44ad-bc48-96d3a7f83ddd.ucf_cus_quotation_card).
billCode就是applicationcode.ucf_cus_quotation_card就是excelUI模板的卡片模板名称.正确的返回值应该是如下格式:

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image5.ef29427d.png)

## [](#2-打印模板配置)2. 打印模板配置

- 通过上述的准备工作后,就可以在**数字化建模**-**模板管理**-**打印模板**下看到对应的打印模板的标签信息.点击 +
号可以配置多个打印模板.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image6.d31e9cb2.png)

- 配置完打印模板后,可以点击F12看到打印模板的相关信息.在调试信息中可以看到此处配置的两个打印模板的code信息.记下此处的code信息.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image7.e5365116.png)

- 打开 excel UI模板的列表卡片信息,在bill_command下的cmdPrintReview
和 cmdPrintDesign所在行的参数(parameter)列增加如下内容 

{"printcode":"SCM_all1565243016000","params":{"metaurl":"ucf.customer.CusQuotationCard"}}

其中printcode
就是上一步提到的templates对应的code,metaurl为ExcelUI模板的卡片页面的数据源信息.

- 

在excel中重新执行宏,将生成的sql文件导入到数据库中.

- 

修改前端工程代码.在src/client/business目录下,根据xml指定的moduleName新建一个文件夹,此处使用的ucf.在该目录下新增一段扩展代码.用于打印的前端支持.注意文件名为ExcelUI模板的模板名称+
"_VM.Extend.js"的格式,比如此处使用的是ucf_ucf_cus_quotationlist_VM.Extend.js.同时文件内部也需要根据实际情况替换ucf_ucf_cus_quotationlist
和url的信息.

cb.define(['common/common_VM.Extend.js'], function (common) {

 var ucf_ucf_cus_quotationlist_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 viewmodel.on('beforePrintpreview', (params) => {

 let cmdParameter = JSON.parse(params.cmdParameter);

 //动态的修改cmdParameter内容

 const _getSelectRowIds = (gridModel, para, distinct = true) => {

 //默认去重

 if (!gridModel) return

 let selectDatas = para && para.params && para.params.index != null ?

 [gridModel.getRow(para.params.index)] :

 gridModel.getSelectedRows();

 let ids = []

 if (selectDatas && selectDatas.length > 0) {

 selectDatas.forEach(function (row) {

 if (row.id) {

 ids.push(row.id)

 }

 })

 }

 return distinct ? [...new Set(ids)] : ids

 }

 const ids = _getSelectRowIds(viewmodel.getGridModel());

 if (ids && ids.length > 0) {

 let url = 'http://xxx.com/uniform/bill/print';

 let billNo = viewmodel.getParams().cardKey;

 url = url + '?billnum=' + billNo + '&ids=' + ids.join(',');

 cmdParameter.serverUrl = encodeURIComponent(url);

 } else {

 cb.utils.alert("请先选择数据");

 return false;

 }

 console.log(JSON.stringify(cmdParameter));

 //最后将修改后的内容赋值给params；

 params.cmdParameter = JSON.stringify(cmdParameter);

 })

 }

 }

 try {

 module.exports = ucf_ucf_cus_quotationlist_VM_Extend;

 } catch (error) {

 }

 return ucf_ucf_cus_quotationlist_VM_Extend;

});

## [](#3-效果展示)3. 效果展示

通过如上配置,打印就可以正常使用了

打开http://<工作台域名>/mdf-node/meta/archivelist/ucf_cus_quotationlist

点击打印按钮下的打印设计.可以看到如下界面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image8.3aa89476.png)

选中一条记录,点击 预览打印按钮,可以看到预览打印的效果.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dayinfuwujieru_image9.5b487753.png)

## [](#4-注意事项)4. 注意事项

- 因为打印需要走回调,所以打印的预览需要注意服务器要和本地的环境能够互联,或者直接使用线上环境.