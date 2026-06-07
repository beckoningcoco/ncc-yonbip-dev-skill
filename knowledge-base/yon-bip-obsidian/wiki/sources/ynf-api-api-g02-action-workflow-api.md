---
title: "流程类Action"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-workflow-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 流程类Action

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-workflow-api | 所属：YNF-API

# [](#流程类action)流程类Action

## [](#1-approval审批)1. approval（审批）

### [](#主要功能介绍)主要功能介绍：

`适用场景：单据详情页或者列表页，调用此api弹出某个单据的审批弹窗`


此action依次执行了下面几个步骤：

- 获取数据的billId
- 获取审批弹窗挂载的dom的id
- 在指定的dom上弹出审批弹窗

### [](#手动调用方式)手动调用方式

import { approval } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

approval(rootStore, { approvalDataSourceAlias: 'dom的id' } })

### [](#参数)参数

||参数||说明||类型  ||必填||默认值|
||approvalDataSourceAlias||审批弹窗挂载的dom的id，不传默认挂在body上||string||否||--|

- 单据详情页可以直接调用此action；列表页想要调用，需要在列表行上增加一个按钮，按钮绑定这个事件，手动调用会因为缺少rowStore而调用失败

## [](#2-audit审核)2. audit（审核）

### [](#主要功能介绍卡片详情场景使用到的action)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：当前详情页数据，通过调用后台接口的方式进行审核操作`


此action依次执行了下面几个步骤：

- 调用audit接口，拿到result
- 把result.data的数据回填到cardStore里

### [](#手动调用方式-1)手动调用方式

import { audit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

audit(rootStore, { cardStoreKey: 'cardStore' } })

### [](#参数-1)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||successTips||action执行成功的提示||string||否||审核成功|

## [](#3-audit弃审)3. audit（弃审）

### [](#主要功能介绍卡片详情场景使用到的action-1)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：当前详情页数据，通过调用后台接口的方式进行弃审操作`


此action依次执行了下面几个步骤：

- 调用unaudit接口，拿到result
- 把result.data的数据回填到cardStore里

### [](#手动调用方式-2)手动调用方式

import { unaudit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

unaudit(rootStore, { cardStoreKey: 'cardStore' } })

### [](#参数-2)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||successTips||action执行成功的提示||string||否||弃审成功|

## [](#4-batchaudit批量审核)4. batchAudit（批量审核）

### [](#主要功能介绍列表场景使用到的action)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行审核操作`


此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的审核按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量审核按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeAuditHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchaudit接口，拿到result
- 执行钩子afterAuditHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-3)手动调用方式

import { batchAudit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

batchAudit(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-3)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchaudit接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchaudit接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||审核成功|

## [](#5-batchunaudit批量弃审)5. batchUnAudit（批量弃审）

### [](#主要功能介绍列表场景使用到的action-1)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行弃审操作`


此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的弃审按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量弃审按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeUnAuditHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchunaudit接口，拿到result
- 执行钩子afterUnAuditHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-4)手动调用方式

import { batchUnAudit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

batchUnAudit(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-4)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchunaudit接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchunaudit接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||弃审成功|

## [](#6-submit提交)6. submit（提交）

### [](#主要功能介绍卡片详情场景使用到的action-2)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：当前详情页数据，通过调用后台接口的方式进行提交操作`


此action依次执行了下面几个步骤：

- 调用bpmAssign/assignCheck接口，判断是否配置了审批指派
- 如果配置了审批指派，弹出指派弹窗，选择了指派人之后继续下面的提交操作
- 调用submit接口，进行提交操作
- 把result.data的数据回填到cardStore里
- 把cardStore的状态设置为浏览态

### [](#手动调用方式-5)手动调用方式

import { submit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

submit(rootStore, { cardStoreKey: 'cardStore' } })

### [](#参数-5)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||stopMessage||是否不弹出提示||bool||否||false|
||successTips||action执行成功的提示||string||否||提交成功|

## [](#7-unsubmit撤回)7. unsubmit（撤回）

### [](#主要功能介绍卡片详情场景使用到的action-3)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：当前详情页数据，通过调用后台接口的方式进行撤回操作`


此action依次执行了下面几个步骤：

- 调用unsubmit接口，拿到result
- 把result.data的数据回填到cardStore里
- 把cardStore的状态设置为浏览态

### [](#手动调用方式-6)手动调用方式

import { unsubmit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

unsubmit(rootStore, { cardStoreKey: 'cardStore' } })

### [](#参数-6)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||successTips||action执行成功的提示||string||否||撤回成功|

## [](#8-batchsubmit批量提交)8. batchSubmit（批量提交）

### [](#主要功能介绍列表场景使用到的action-2)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行提交操作`


此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的提交按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量提交按钮，使用table上选中的行数据包装请求的数据requestData
- 调用bpmAssign/assignBatchCheck接口，判断是否配置了审批指派
- 如果配置了审批指派，弹出指派弹窗，选择了指派人之后继续下面的提交操作
- 执行钩子beforeSubmitHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchsubmit接口，拿到result
- 执行钩子afterSubmitHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-7)手动调用方式

import { batchSubmit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

batchSubmit(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-7)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchaudit接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchaudit接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||提交成功|

## [](#9-batchunsubmit批量撤回)9. batchUnSubmit（批量撤回）

### [](#主要功能介绍列表场景使用到的action-3)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行撤回操作`


此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的撤回按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量撤回按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeUnSubmitHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchunsubmit接口，拿到result
- 执行钩子afterUnSubmitHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-8)手动调用方式

import { batchUnSubmit } from 'ynf-core-engine/actions/workflow';

// rootStore需要从上下文中拿到再传递

batchUnSubmit(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-8)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchunsubmit接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchunsubmit接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||撤回成功|