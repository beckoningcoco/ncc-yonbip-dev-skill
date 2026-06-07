---
title: "领域扩展打印"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-lingyukuozhandayin"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 17
---

# 领域扩展打印

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-lingyukuozhandayin | 所属：指南

# [](#领域扩展打印)领域扩展打印

## [](#基本信息)基本信息

描述：打印功能

背景信息：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=213455049](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=213455049)

## [](#配置方法)配置方法

配置打印按钮， 将按钮的action如下

(如何配置按钮可以找下部门负责人）

||**行动名称**||**描述**|
||`printnow`||打印预览|
||`printpreview`||直接打印|

## [](#页面展示)页面展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image1.f9fdb760.png)

### [](#打印预览)打印预览

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image2.74ea6ae2.png)

### [](#直接打印)直接打印

（第一次需安装三方软件）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image3.80033bb2.png)

## [](#扩展脚本)扩展脚本

使用扩展脚本可干预调打印接口传参

**示例**

vm.on('beforePrint', (args) => {

  args.domainParams.xxx = 'xxxx';

});

args参数说明

||**参数**||**说明**||**备注**|
||`sysParams`||系统参数||框架自动获取|
||`domainParams`||业务参数||领域可以将需要的参数放到这个对象里|

## [](#faq)FAQ

##### [](#q1-打印的参数包括组织id交易类型等是怎么获取的流程是什么)Q1: 打印的参数包括（**组织id，**交易类型等）是怎么获取的？流程是什么？

**A:打印的接口流程涉及到3方协作，即*领域*配置参数，*MDF框架*获取参数组装参数，传递给*打印*后端**

其中**领域配置**的参数分为**meta**接口模型返回的，和**打印按钮上配置**的2种，
按钮配置的结合这篇文档了解和配置【[领域打印配置】](file:////pages/viewpage.action%3fpageId=22512666)

打印按照单据类型分为**列表页**和**卡片页，即列表和卡片都可以配置打印功能**

**列表页：打印预览，直接打印**

**卡片页：打印预览，直接打印， 选择模版打印**

- 列表打印

无

- 卡片页打印

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image4.739cda05.png)

- 卡片页选择模版打印

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image5.f8d47e7a.png)

- 关于**打印预览**和**直接打印**

列表和卡片获取参数 都是走的一样的公共的逻辑

- 是否添加orgId需要打开前端特性开关：printOrgTemplate，orgId的值取的是 vm.get(masterOrgKeyField).getValue(), 其中masterOrgKeyField的值来自vm.getParams().masterOrgKeyField
- 是否添加subClassifyCode，会先从按钮配置里获取默认值。当打开前端特性printTransType时，subClassifyCode的值取的是 vm.get(transTypeKeyField).getValue() , 其中transTypeKeyField的值来自vm.getParams().transTypeKeyField
- 是否添加transTypeCode来源于2方面，如果打开前端特性开关：printTransTypeCode，transTypeCode的值取的是 vm.get(transTypeKeyField).getValue() , 其中transTypeKeyField的值来自vm.getParams().transTypeKeyField，**但如果vm.getParams()?.query?.transtype ||viewmodel.getParams()?.printTranstype 能获取到值，那么无论开关是否开启， 都会取这里的值，并且还会再加一个参数transtype，值和transTypeCode值一样**

- 关于卡片页的**选择模版打印**

选择模版打印分为2步，即，先获取**打印模版**，在选择**模版**进行**打印预览**和**直接打印**

1. **获取打印模版**也需要传递参数

- 是否添加orgId需要打开前端特性开关(只针对卡片页)：printOrgTemplate，orgId的值取的是 vm.get(masterOrgKeyField).getValue() , 其中masterOrgKeyField的值来自vm.getParams().masterOrgKeyField
- 是否添加subClassifyCode需要打开前端特性开关(只针对卡片页)：printTransType，subClassifyCode的值取的是 vm.get(transTypeKeyField).getValue() , 其中transTypeKeyField的值来自vm.getParams().transTypeKeyField，同时会传递isTransType为false，**但如果viewModel.getParams()?.query?.transtype || viewModel.getParams()?.printTranstype能获取到值，会取这里的值，并且会传isTransType为true** 
- **关于接口：如果开启了printOrgTemplate或者printTransType，获取模版的接口会调/print-template，否则调/sprint/getTemplateByBo**

- 选择**模版**进行**打印预览**和**直接打印**

- **公共参数和也上述的打印预览和直接打印参数获取方式一致，会多加几个参数：**
- **printcode，值为vm.get(cParameter.printTplItemName)?.getValue()，cParameter为打印参数按钮配置的打印模版的cItemName,具体可查看本页FAQ-Q2**
- **添加selected为true**

在调获取打印模版的接口前，如果想对传参进行修改，可以监听 **beforePrinttemplates**

**【打印部门关于上述参数的具体说明文档：[https://docs.diwork.com/l/a84a8856d2e4](https://docs.diwork.com/l/a84a8856d2e4) 2.4章节】**

##### [](#q2-详情页没有显示出打印模版)Q2: 详情页没有显示出打印模版？

**A: 需要检查2步**

- **打印模版tab里是否有打印的模版， 没有请配置**
- **打印模版需要和打印按钮做关联（在打印按钮的属性加个配置："parameter":"{"printTplItemName":"xxx"}"）xxx为打印模版的编码，如图所示**
- **打印按钮的name（设计器里叫cCommond）必须叫cmdpreview（忽略大小写）**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image6.86d7dec6.png)

**检查步骤1**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image7.5a640486.png)

**检查步骤2**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image8.34f3e07c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image9.10fa00ff.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image10.65a4b92b.png)

##### [](#q3-pc端报表打印针对老模版sendtype返回post打不开页面时怎么处理)Q3: pc端报表打印针对老模版sendType返回post打不开页面时，怎么处理？

**A: commond表添加parameter里加个reportPrintNoHandler:true
即可（格式为json对象字符串）**

**（pc端报表打印针对老模版sendType返回post打不开页面时，不需要走接口重新获取sendType(cb.electron.getSharedObject()为true时除外)）**

##### [](#q4-打印模版接口没有传递busiobj参数)Q4: 打印模版接口没有传递busiObj参数？

**A:
ypd单据-搜索我的应用，找到对应节点，看下web端主页是否有busiObj这个属性，如果没有将发布后的busiObj参数，手动添加到url上（设计器方针对930以上版本的应用，发布后会自动添加）**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image11.a400d38d.png)

mdd单据- 登录运营租户-搜索服务管理 找到对应单据- 添加busiObj后，升级租户

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image12.3f2ae15c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image13.62d5f853.png)

##### [](#q5-打印计数接口是哪里来的)Q5: 打印计数接口是哪里来的？

**A:
默认调用，前端框架传递参数printcountswitch为true，打印后端调mdd接口进行更新计数。可以在meta接口上有个__PRINT_META__属性****或者统一node上的env属性里配置__PRINT_META__
里配置printcountswitch为false关闭调打印计数功能。**

**PRINT_META**： { printcountswitch: false }

##### [](#q6-打印提示-单据未审核通过不允许打印)Q6: 打印提示 单据未审核通过，不允许打印？

**A: 一般出现在单据没有审核完成时，这个控制是在【交易类型】节点，
设置【是否审核后打印】， 不想提示，可以设置为否**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image14.cec2db75.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image15.52e8324f.png)

##### [](#q7-单据中有流程节点但是打印出来不显示流程信息)Q7: 单据中有流程节点，但是打印出来不显示流程信息？

**A: 需配置流程节点的billNo， 设计器里的打印按钮，
打开编辑器补充"cmdParameter":
"{"billNoCustom":"xxxxxx"}"**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image16.c2e3929a.png)

##### [](#q8-列表页想支持打印时展示审批历史)Q8: 列表页想支持打印时展示审批历史？

**A: 在打印按钮的bill_command的parameter字段配置卡片页的单据编码billno**

**示例："{ "params": { "billno": "xxx" } }"**

**设计器页面单据 在【动作管理】里添加**

##### [](#q9-打印页面的url如何在最外层传参)Q9: 打印页面的url如何在最外层传参？

**A: 在bill_command表parameter加自定义参数printRootParams**

**示例："{ "printRootParams": { "xx": "xxx" , "classifyCode ": "xxx"} }"**

**设计器页面单据 在【动作管理】里添加**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyukuozhandayin_image17.f40ecc0f.png)