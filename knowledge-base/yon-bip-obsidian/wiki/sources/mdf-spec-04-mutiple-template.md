---
title: "运行时多模板"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/04-mutiple-template"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 13
---

# 运行时多模板

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/04-mutiple-template | 所属：协议

# [](#运行时多模板)运行时多模板

（文档作者：前端框架开发部 李明阳）

同一个领域同一个单据billNo，会存在多个不同的模板，运行时通过特定匹配规则来加载不同的模板。

MDF框架多模板匹配逻辑，历史上共出现过四代匹配方式，目前每一代都可能使用到，以后使用直接用第四代就行。下面一一说明方便大家快速定位模板相关的问题。

## [](#1-模板类型)1. 模板类型

先介绍下 **模板种类大全** (按照匹配优先级由低到高排序)：

||模板种类||创建方式||介绍||出现在第几代|
||系统级模板||最原始的模板||数据库最原始模板||1|
||租户级模板||系统级模板，第一次配置（初始化）会生成租户级模板||可以配置，会被当做默认模板使用||1|
||组织级模板||UI模板界面创建||不同组织下的不同模板||2|
||角色级模板||UI模板界面分配||不同角色下的不同模板||2|
||用户级模板||UI模板界面分配||不同用户下的不同模板||2|
||指定类型模板||UI模板界面分配||可以指定交易类型或者任意类型模板||2|
||交易类型模板||交易类型节点创建||交易类型模板||2|
||systemCode模板||数据库创建||基于系统级模板创建的模板||1|
||多态模板||数据库创建||浏览态编辑态模板不同，卡片页面状态变化会进行切换||1|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image1.be88d23b.png)

## [](#2-模板匹配)2. 模板匹配

打开列表页或者卡片页，卡片页切换主组织参照，切换交易类型参照会切换模板。

### [](#21-第一代)2.1. 第一代

**特型开关：** 无

**出现原因：** 可以匹配多态模板，systemCode模板。

**匹配方式：** 前端匹配

**运行时：** 列表进卡片会调用billmeta/tpllist接口返回所有模板，MDF框架根据systemCode和iTplMode匹配出tplid，作为参数传到meta接口，后端根据tplid参数匹配模板。

**模型：** 前端会进行view覆盖viewmodel操作（参见cb.utils.resetViewModelByViewMeta方法）

**现象：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image2.cdb9728f.png)

### [](#22-第二代)2.2. 第二代

**特型开关：UImobans**

**出现原因：** 需要匹配组织级模板，用户级，角色级，指定类型模板，交易类型模板等所有类型的多模板。切换组织和交易类型会切换到对应模板。

**匹配方式：** 前端匹配

**运行时：** 列表进卡片会调用billmeta/assignedtpllist接口返回所有模板，MDF框架根据orgId，transtype等（参见 **findDefaultTplid** 方法）匹配出tplid，作为参数传到meta接口，后端根据tplid参数匹配模板。

**模型：** 前端会进行view覆盖viewmodel操作（参见cb.utils.resetViewModelByViewMeta方法）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image3.48d72273.png)

### [](#23-第三代)2.3. 第三代

**特型开关：newUImobans**（过渡版本，目前不支持多态模板匹配，发布多交易类型类型模板匹配等，**后续废弃**，目前只有人力生产环境在使用）

**出现原因：** 新版UI模板界面下，匹配规则更复杂，从前端匹配转到后端去匹配。

**匹配方式：** 后端匹配

**运行时：** 列表进卡片直接调用meta接口，query上传**isNewTpl=true**，再加上orgId，transtype，businessStepCode等，让后端匹配出对应的模板。

**模型：** 前端会进行view覆盖viewmodel操作（参见cb.utils.resetViewModelByViewMeta方法）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image4.4d4c10e7.png)

### [](#24-第四代)2.4. 第四代

**特型开关：**

**getTplIdFirst：**

(保证后端版本309+才能打开，原则上不要关闭。**如果后端版本过低，getTplid接口404，框架会删掉getTplidFirst特性然后重新走选模板逻辑**。开启了就代表用使用/billmeta/getTplId获取tplid，传递给detail、querytree、meta等接口。如果同时开启newUImobans，会以第三代方式匹配模板。除了人力建议删掉newUImobans开关。)

**newBillMeta：(未接入新版UI模板可不开)**

(主要作用是开启后后端meta接口会进行优化，接口调用从原来的/billmeta/getbill变成/billmeta/getfebill。想要使用新版UI模板，就必须开启。如果还是使用老UI模板，可以不用打开。newBillMeta日常和预发目前默认开启，生产领域单独打开)

**综上所述，忽略人力特例，想要使用新版UI模板，必须开启getTplIdFirst+newBillMeta，不使用开不开无所谓，使用旧版UI模板，如果开启了getTplIdFirst，通过接口获取tplid匹配模板，如果没开用第一或二代方式匹配。**

**出现原因：** getTplIdFirst开启情况下，meta和billData会并行加载，meta调用时就拿不到三代那样的参数。并且列表也需要支持多模板，detail也要传tplid匹配对应模板数据。在这个背景下，诞生了调用/billmeta/getTplId服务直接从后端拿tplid。

**匹配方式：** 后端匹配

**运行时：** MDF框架整理好参数调用/billmeta/getTplId获取到tplid，作为参数传到meta接口，后端根据tplid参数匹配模板。

**模型：** 开启了newBillMeta开关，后端进行view覆盖viewmodel操作，特殊场景（主子关系一对一，gridModel实体需要配置parentRelation=single）前端才会进行view覆盖viewmodel操作（参见cb.utils.resetViewModelByViewMeta方法）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image5.277b857a.png)

### [](#25-核心代码)2.5. 核心代码 ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image6.49446f2a.png)

## [](#3-运行时模板切换)3. 运行时模板切换

模板切换，调用
[viewmodel.biz.do](http://viewmodel.biz.do)('reloadbytplid',
viewmodel, args);

类似代码

function callback(){}

viewModel.biz.do('reloadbytplid', viewModel, {

 tplid: '123231312323123123123',

 orgId: orgId,

 transtype: transtype,

 businessStepCode: businessStepCode,

 ignoreInitData: false, // 必传

 carryData: carryData,

 callback: callback.bind(this)

});

### [](#31-页面初始化)3.1. 页面初始化

新增，下推，进详情等，只要是列表，卡片，可编辑列表，FreeView等页面初始化都会加载不同的模板。

### [](#32-主组织切换)3.2. 主组织切换

主组织字段切换，如果该组织有配置模板，运行时会切换到对应模板。

### [](#33-交易类型切换)3.3. 交易类型切换

交易类型字段，如果该交易类型有配置模板，运行时会切换到对应模板。发布交易类型节点，query上有transtype标识，所有的请求都会带上transtype做权限控制，所以进去卡片运行时不让切换交易类型。

### [](#34-保存编辑)3.4. 保存/编辑

保存操作，如果配置有浏览态和编辑态模板，会进行切换。

### [](#35-翻页)3.5. 翻页

浏览态翻页，不同数据可能对应不同的模板，会进行切换。

## [](#4-模板创建)4. 模板创建

### [](#41-新版ui模板)4.1. 新版UI模板 ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image7.ffaf8910.png)

### [](#42-旧版ui模板)4.2. 旧版UI模板

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image8.46cc0ae4.png)

### [](#43-交易类型模板创建)4.3. 交易类型模板创建 ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image9.3710bb52.png)

## [](#5-运行时查看模板配置)5. 运行时查看模板配置

### [](#51-交易类型模板)5.1. 交易类型模板

- 

**列表页**
有发布过交易类型的节点才有交易类型模版，看5.2。

- 

**卡片页**
卡片配置交易类型id字段和name字段，id字段配置isTransTypeKey=true，name字段配置isTransType=true（对应元数据上打标记，打上标记后会自动生成配置），对应运行时通过yya可以查看（yya.getParams().transTypeKeyField和yya.getParams().transTypeField）。作用是标记出交易类型字段，切换该字段可以切换模板。新增或推单时add接口需要返回transTypeKeyField，标记哪个字段是交易类型字段，用来取交易类型的值来匹配模版。
未发布的交易类型节点，进卡片getTplid接口参数名为extTranstype。进到卡片页后交易类型字段可以编辑。

### [](#52-发布交易类型模板)5.2. 发布交易类型模板

- 

**列表页**
工作台菜单上url上会有一个transtype参数。会根据这个参数调用getTplid接口返回交易类型模版。list接口也会拼上simpleVOs参数用来查询。对应UI元数据需要打上交易类型标识（打上标记后后端返回的数据，参照id字段isTransTypeKey=true和参照name字段isTranstype=true）。

- 

**卡片页
**发布的交易类型节点，进卡片getTplid接口参数为transtype。进到卡片页后交易类型字段不允许编辑。

### [](#53-组织级模板)5.3. 组织级模板

- 

**列表页**
列表url上条件orgId参数可以匹配到组织级模版。

- 

**卡片页**
卡片配置组织id字段和name字段，组织id字段配置isMasterOrgKey=true，name字段配置isMasterOrg=true（对应元数据上打标记就行，打上标记后会自动生成配置），对应运行时通过yya可以查看（yya.getParams().masterOrgKeyField和yya.getParams().masterOrgField）。作用是标记出主组织字段，切换该字段可以切换模板。新增或推单时add接口需要返回masterOrgKeyField，标记哪个字段是主组织字段，用来取组织的值来匹配模版。

## [](#6-常见问题)6. 常见问题

### [](#61-设计器配置不生效)6.1. 设计器配置不生效？

排查过程：

- 检查设计器编辑的模板tplid跟运行时加载的meta接口tplid是否一致，高级设计器预览可以看到tplid，简版设计器点【配置】查看接口传的tplid参数，**meta接口看返回的数据里的iTplid。**
- 看下是否扩展脚本影响 url加 ?extend=false，屏蔽扩展脚本
- 看下是否交互规则影响 禁用交互规则 cb.extendRule=false，或url上加&extendRule=false
- 看下特性或接口请求判断是哪一代，判断是否是模板覆盖逻辑有问题。
- group容器上发现有childrenField，代表是主子一对一关系，展现形式是卡片但模型是表格。表格实体需要配置parentRelation=single，前端根据这个标识再进行view覆盖vm。
- 可能设计器可以配置，但是运行时还没来得及支持

### [](#62-模板匹配错误)6.2. 模板匹配错误

先检查用的哪一代，以后都会用第四代。判断是前端匹配问题还是后端匹配，前端匹配看前面写的
模板匹配，后端匹配问题，直接联系UI模版部门

### [](#63-查看模板生成的前端模型)6.3. 查看模板生成的前端模型

查看页面模型

cb.viewmodels

查看页面的UI元数据 （需要提前使用window.__yya_debug=true）

yya_[billNo].get('viewmeta')
查看页面的UI元数据容器平铺

yya_[billNo].getCache('viewMeta')

查看表头字段的模型

yya_[billNo].get([cItemName])._*data
查看表体字段模型
yya*[billNo].get([childrenField]).getEditRowModel().get('cItemName')

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image10.a73cf10f.png)

### [](#64-查看java端返回的模板数据)6.4. 查看java端返回的模板数据

浏览器直接录入：

https://***/mdf-node/uniform/billmeta/getbill?billno=bd_admindepttree&bIncludeViewModel=true&domainKey=orgcenter
如果开启了newBillMeta，调用的是getfebill
https://***/mdf-node/uniform/billmeta/getfebill?billno=bd_admindepttree&bIncludeViewModel=true&domainKey=orgcenter&tplid=21028085

或者postman导入
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image11.bdb4640d.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image12.59dd4b71.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yunxingshiduomuban_image13.a9fa1475.png)

### [](#65-看不到meta请求)6.5. 看不到meta请求？

meta缓存有indexDb缓存和内存缓存。第一次加载读indexDb缓存，第二次加载读内存缓存。
解决办法： 清下indexdb缓存，重新刷新浏览器。

### [](#66-tplid传对了但是模板返回不对)6.6. tplid传对了，但是模板返回不对？

如果没开启newBillMeta特性，会按照transtype和tplid等参数进行匹配模板，transtype优先级会高于tplid，所以可能会导致模板匹配失败，现象就是返回的模板数据中tplid和传的tplid参数没对上。

所以如果使用了新版UI模板界面中的交易类型模板，得 **打开newBillMeta特性** 。目前测试日常预发已全量开启了newBillMeta。
类似案例：[https://gfjira.yyrd.com/browse/DDMPT-84947](https://gfjira.yyrd.com/browse/DDMPT-84947)