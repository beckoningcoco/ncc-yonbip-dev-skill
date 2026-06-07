---
title: "打印类Action"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-print-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 打印类Action

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-print-api | 所属：YNF-API

# [](#打印类action)打印类Action

## [](#1-printpreview批量打印预览)1. printPreview（批量打印预览）

### [](#主要功能介绍列表场景使用到的action)主要功能介绍：(列表场景使用到的action)

`适用场景：列表页批量选中数据，进行批量打印预览的场景`


此action依次执行了下面几个步骤：

- 获取批量选中的数据selectedRows
- 调用打印服务的cacheParameter接口，批量缓存selectedRows里的信息，拿到返回的res.key
- 跳转打印服务的预览页面getPreview，路径上携带res.key参数，进行批量打印预览

### [](#手动调用方式)手动调用方式

import { printPreview } from 'ynf-core-engine/actions/print';

// rootStore需要从上下文中拿到再传递

printPreview(rootStore, { billNo: 'xxxx' })

### [](#参数)参数

||参数||说明||类型  ||必填||默认值|
||billNo||详情页billNo||string||否||当前列表页billNo去掉List后缀|
||tableStoreKey||列表store键值||string||否||tableStore|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||printcode||打印模板id，如果传了此参数，就按照指定模板预览，否则打印预览页面会显示全部打印模板，需要切换进行预览||string||否||--|
||classifyCode||未传printcode的情况下，按照此参数匹配所有打印模板||string||否||busiObj|

## [](#2-batchprint批量直接打印)2. batchPrint（批量直接打印）

### [](#主要功能介绍列表场景使用到的action-1)主要功能介绍：(列表场景使用到的action)

`适用场景：列表页批量选中数据，进行批量直接打印的场景`


此action依次执行了下面几个步骤：

- 获取批量选中的数据selectedRows
- 调用打印服务的getTokenInfo接口，拿到调用直接打印功能需要的wb_at、yht_access_token、yonyou_uid
- 拼接directprintParams参数，调用([http://127.0.0.1:9641/directprint)地址进行批量直接打印](http://127.0.0.1:9641/directprint)%E5%9C%B0%E5%9D%80%E8%BF%9B%E8%A1%8C%E6%89%B9%E9%87%8F%E7%9B%B4%E6%8E%A5%E6%89%93%E5%8D%B0)

### [](#手动调用方式-1)手动调用方式

import { batchPrint } from 'ynf-core-engine/actions/print';

// rootStore需要从上下文中拿到再传递

batchPrint(rootStore, { billNo: 'xxxx' })

### [](#参数-1)参数

||参数||说明||类型  ||必填||默认值|
||billNo||详情页billNo||string||否||当前列表页billNo去掉List后缀|
||tableStoreKey||列表store键值||string||否||tableStore|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||printcode||打印模板id，如果传了此参数，就按照指定模板预览，否则打印预览页面会显示全部打印模板，需要切换进行预览||string||否||--|
||classifyCode||未传printcode的情况下，按照此参数匹配所有打印模板||string||否||busiObj|
||dataSourceAlias||卡片数据源主表alias||string||是||--|

## [](#3-print详情页打印预览)3. print（详情页打印预览）

### [](#主要功能介绍卡片详情场景使用到的action)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：卡片页单据打印预览的场景`


此action依次执行了下面几个步骤：

- 判断是否配置了业务阶段不允许打印，若不允许，提示并返回
- 判断页面打印组件是否选了打印模板，没选模板，提示错误并返回
- 获取卡片页的billId，拼接cacheParameter接口需要的参数
- 调用打印服务的cacheParameter接口，批量缓存selectedRows里的信息，拿到返回的res.key
- 跳转打印服务的预览页面getPreview，路径上携带res.key参数，进行批量打印预览

### [](#手动调用方式-2)手动调用方式

import { batchPrint } from 'ynf-core-engine/actions/print';

// rootStore需要从上下文中拿到再传递

batchPrint(rootStore, { printcode: 'xxxx' })

### [](#参数-2)参数

||参数||说明||类型  ||必填||默认值|
||printcode||打印模板id，详情页action，此参数是必填的||string||是||--|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#4-printnow批量直接打印)4. printNow（批量直接打印）

### [](#主要功能介绍卡片详情场景使用到的action-1)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：卡片页单据直接打印的场景`


此action依次执行了下面几个步骤：

- 判断是否配置了业务阶段不允许打印，若不允许，提示并返回
- 判断页面打印组件是否选了打印模板，没选模板，提示错误并返回
- 获取卡片页的billId，拼接directprintParams参数
- 调用打印服务的getTokenInfo接口，拿到调用直接打印功能需要的wb_at、yht_access_token、yonyou_uid
- 拼接directprintParams参数，调用([http://127.0.0.1:9641/directprint)地址进行批量直接打印](http://127.0.0.1:9641/directprint)%E5%9C%B0%E5%9D%80%E8%BF%9B%E8%A1%8C%E6%89%B9%E9%87%8F%E7%9B%B4%E6%8E%A5%E6%89%93%E5%8D%B0)

### [](#手动调用方式-3)手动调用方式

import { printNow } from 'ynf-core-engine/actions/print';

// rootStore需要从上下文中拿到再传递

printNow(rootStore, { printcode: 'xxxx' })

### [](#参数-3)参数

||参数||说明||类型  ||必填||默认值|
||printcode||打印模板id，详情页action，此参数是必填的||string||是||--|
||busiObj||接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||dataSourceAlias||卡片数据源主表alias||string||是||--|