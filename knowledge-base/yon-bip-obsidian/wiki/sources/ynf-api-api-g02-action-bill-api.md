---
title: "单据类Action"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-bill-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 单据类Action

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-bill-api | 所属：YNF-API

# [](#单据类action)单据类Action

## [](#1-add新增)1. add(新增)

### [](#主要功能介绍卡片详情场景使用到的action)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：将当前卡片页状态置为新增态并从后台初始化新增态的数据`

此action依次执行了下面几个步骤：

- 调用add接口获取卡片新增态的初始化数据
- 拿到数据回填到卡片页
- 将当前卡片页的状态置为add

### [](#手动调用方式)手动调用方式

import { add } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

add(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||add接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||add接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#2-stop停用)2. stop(停用)

### [](#主要功能介绍卡片详情场景使用到的action-1)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：把当前详情页数据，通过调用后台接口的方式置为停用`

此action依次执行了下面几个步骤：

- 包装请求的数据requestData
- 执行钩子beforeStopHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 执行钩子afterStopHook

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-1)手动调用方式

import { stop } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

stop(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-1)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||successTips||action执行成功的提示||string||否||停用成功|

## [](#3-unstop启用)3. unstop(启用)

### [](#主要功能介绍卡片详情场景使用到的action-2)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：把当前详情页数据，通过调用后台接口的方式置为启用`

此action依次执行了下面几个步骤：

- 包装请求的数据requestData
- 执行钩子beforeUnstopHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 执行钩子afterUnstopHook

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-2)手动调用方式

import { unstop } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

unstop(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-2)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||successTips||action执行成功的提示||string||否||启用成功|

## [](#4-batchstopbyrow批量停用)4. batchStopByRow(批量停用)

### [](#主要功能介绍列表场景使用到的action)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式置为停用`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的停用按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量停用按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeStopHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 若点击的是批量停用按钮，清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-3)手动调用方式

import { batchStopByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchStopByRow(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-3)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||停用成功|

## [](#5-batchunstopbyrow批量启用)5. batchUnstopByRow(批量启用)

### [](#主要功能介绍列表场景使用到的action-1)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式置为启用`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的启用按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量启用按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeUnstopHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 若点击的是批量启用按钮，清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-4)手动调用方式

import { batchUnstopByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchUnstopByRow(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-4)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||启用成功|

## [](#6-batcheeacsendbyrow批量过账)6. batchEeacSendByRow(批量过账)

### [](#主要功能介绍列表场景使用到的action-2)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行过账操作`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的过账按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量过账按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeBatchEeacSendHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 执行钩子afterBatchEeacSendHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-5)手动调用方式

import { batchEeacSendByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchEeacSendByRow(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-5)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||过账成功|

## [](#7-batcheeacreversebyrow批量取消过账)7. batchEeacReverseByRow(批量取消过账)

### [](#主要功能介绍列表场景使用到的action-3)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据，通过调用后台接口的方式进行取消过账操作`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的取消过账按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量取消过账按钮，使用table上选中的行数据包装请求的数据requestData
- 执行钩子beforeBatchEeacreverseHook，传入requestData，钩子的返回值当作新的requestData
- 用requestData去调用batchDo接口，拿到result
- 执行钩子afterBatchEeacreverseHook
- 清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-6)手动调用方式

import { batchEeacReverseByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchEeacReverseByRow(rootStore, { tableStoreKey: 'xxxxx', dataSourceAlias: 'xxx' })

### [](#参数-6)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||取消过账成功|

## [](#8-cancelbusinesstasks取消过账)8. cancelBusinessTasks(取消过账)

### [](#主要功能介绍卡片详情场景使用到的action-3)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：把当前详情页数据，通过调用后台接口的方式进行取消过账操作`

此action依次执行了下面几个步骤：

- 包装请求数据的option
- 调用eeacreverse接口，拿到result
- 页面刷新

### [](#手动调用方式-7)手动调用方式

import { cancelBusinessTasks } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

cancelBusinessTasks(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-7)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||eeacreverse接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||eeacreverse接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||data||接口传递的data||object||否||当前卡片详情页的所有值|

## [](#9-generatebusinesstasks过账)9. generateBusinessTasks(过账)

### [](#主要功能介绍卡片详情场景使用到的action-4)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：把当前详情页数据，通过调用后台接口的方式进行过账操作`

此action依次执行了下面几个步骤：

- 包装请求数据的option
- 调用eeacsend接口，拿到result
- 页面刷新

### [](#手动调用方式-8)手动调用方式

import { generateBusinessTasks } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

generateBusinessTasks(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-8)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||eeacsend接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||eeacsend接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||data||接口传递的data||object||否||当前卡片详情页的所有值|

## [](#10-copy复制)10. copy(复制)

### [](#主要功能介绍卡片详情场景使用到的action-5)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：打开一个新增态的空白单据，把当前详情页的数据复制到新增态空白单据上`

此action依次执行了下面几个步骤：

- 调用detail接口，拿到result
- 调用copy接口，拿到result
- 按照规则合并两个接口返回的数据，得到mergeResult
- 执行afterCopyHook钩子事件，传入mergeResult，钩子的返回值当作新的mergeResult
- 将mergeResult数据填到卡片详情数据里
- 设置cardStore为新增态

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-9)手动调用方式

import { copy } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

copy(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-9)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||两个接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||successTips||action执行成功的提示||string||否||复制成功|

## [](#11-copybyrow列表行复制)11. copyByRow(列表行复制)

### [](#主要功能介绍列表场景使用到的action-4)主要功能介绍：(列表场景使用到的action)

`适用场景：打开一个新增态的空白单据，把当前选中的行数据复制到新增态空白单据上`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow不存在就报错，存在就调用openBill方法跳转到新增态详情页
- 复制后的详情页调用了copy的action将数据复制过来

### [](#手动调用方式-10)手动调用方式

import { copyByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

copyByRow(rootStore, { billNo: 'xxxx' })

### [](#参数-10)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||否||'tableStore'|
||billNo||详情页面的billNo||string||是||--|

## [](#12-deleteins删除)12. deleteIns(删除)

### [](#主要功能介绍卡片详情场景使用到的action-6)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：将卡片详情页数据在后台删除，并回到上一页`

此action依次执行了下面几个步骤：

- 弹出二次确认的提示，客户确定之后再执行后续删除操作
- 包装请求的数据deleteData
- 执行钩子beforeDeleteHook，传入deleteData，钩子的返回值当作新的deleteData
- 用deleteData去调用delete接口，拿到result
- 执行钩子afterDeleteHook
- 调用pageStore.goBack返回上一页

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-11)手动调用方式

import { deleteIns } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

deleteIns(rootStore, { cardStoreKey: 'xxxx', dataSourceAlias: 'xxxx' })

### [](#参数-11)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||delete接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||delete接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||successTips||action执行成功的提示||string||否||删除成功|

## [](#13-batchdeletebyrow批量删除)13. batchDeleteByRow(批量删除)

### [](#主要功能介绍列表场景使用到的action-5)主要功能介绍：(列表场景使用到的action)

`适用场景：将列表页批量选中的数据在后台删除，并刷新页面`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的删除按钮，使用悬停行的数据包装请求的数据deleteData
- hoverRow没值，说明点击的是批量删除按钮，使用table上选中的行数据包装请求的数据deleteData
- 弹出二次确认的提示，客户确定之后再执行后续删除操作
- 执行钩子beforeDeleteHook，传入deleteData，钩子的返回值当作新的deleteData
- 用deleteData去调用batchdelete接口，拿到result
- 执行钩子afterDeleteHook
- 若点击的是批量删除，清空table上选中的行
- 页面刷新

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-12)手动调用方式

import { batchDeleteByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchDeleteByRow(rootStore, { tableStoreKey: 'xxxx', dataSourceAlias: 'xxxx' })

### [](#参数-12)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||batchDo接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||batchDo接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|
||successTips||action执行成功的提示||string||否||删除成功|

## [](#14-detail请求详情)14. detail(请求详情)

### [](#主要功能介绍卡片详情场景使用到的action-7)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：卡片详情页请求detail接口，并将请求到的数据填入到卡片页中`

此action依次执行了下面几个步骤：

- 包装请求的数据detailParams
- 执行钩子beforeDetailHook，传入detailParams，钩子的返回值当作新的detailParams
- 用detailParams去调用detail接口，拿到result
- 执行钩子afterDetailHook，传入result，钩子的返回值当作新的result
- result数据回写到详情页主表和子表的store中

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-13)手动调用方式

import { detail } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

detail(rootStore, { cardStoreKey: 'xxxx' })

### [](#参数-13)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||两个接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|

## [](#15-detailpaging请求详情的分页信息)15. detailPaging（请求详情的分页信息）

### [](#主要功能介绍卡片详情场景使用到的action-8)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：卡片详情页请求detail接口，并将请求到的分页数据填入到卡片页的分页器中`

此action依次执行了下面几个步骤：

- 包装请求的数据queryParams
- 执行钩子beforeDetailPagingHook，传入queryParams，钩子的返回值当作新的queryParams
- 用queryParams去调用detail接口，拿到result
- 执行钩子afterDetailPagingHook，传入result，钩子的返回值当作新的result
- result的分页数据回写到详情页的主表和子表的分页器store中

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-14)手动调用方式

import { detailPaging } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

detailPaging(rootStore, { cardStoreKey: 'xxxx' })

### [](#参数-14)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||两个接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|

## [](#16-savedraft保存草稿)16. saveDraft（保存草稿）

### [](#主要功能介绍卡片详情场景使用到的action-9)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：将当前卡片页的数据保存到草稿箱中`

此action依次执行了下面几个步骤：

- 收集页面的数据data
- 判断是否开启了服务端存储saveInServer
- 若开启服务端存储，调用billtempdata/save接口，将data保存在后端
- 若未开启服务端存储，将数据保存在indexDB中

### [](#手动调用方式-15)手动调用方式

import { saveDraft } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

saveDraft(rootStore, {})

### [](#参数-15)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||否||'cardStore'|
||saveInServer||是否开启服务端存储||bool||否||false|
||dataSourceAlias||卡片数据源主表alias||string||否||'mainEntity'|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|

## [](#17-draftselectandadd选择草稿并新增)17. draftSelectAndAdd（选择草稿并新增）

### [](#主要功能介绍卡片详情场景使用到的action-10)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：打开草稿箱，用户可以从草稿箱里选取一个草稿，点击确定，将草稿数据填到页面中`

此action依次执行了下面几个步骤：

- 判断是否开启了服务端存储saveInServer
- 若开启服务端存储，调用billtempdata/list接口，获取草稿列表信息
- 若未开启服务端存储，执行钩子beforeDBQueryHook，之后从indexDB获取草稿列表信息
- 打开选择草稿的弹窗
- 用户选中了某个草稿，调用draftAdd这个action进行草稿新增

### [](#手动调用方式-16)手动调用方式

import { draftSelectAndAdd } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

draftSelectAndAdd(rootStore, {})

### [](#参数-16)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||否||'cardStore'|
||saveInServer||是否开启服务端存储||bool||否||false|
||dataSourceAlias||卡片数据源主表alias||string||否||'mainEntity'|
||billNo||接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|

## [](#18-draftadd草稿新增)18. draftAdd（草稿新增）

### [](#主要功能介绍此action是集成在draftselectandadd中不能单独使用)主要功能介绍：(此action是集成在draftSelectAndAdd中，不能单独使用)

`适用场景：将草稿数据填到页面中`

此action依次执行了下面几个步骤：

- 拿到draftSelectAndAdd这个action传来的草稿
- 判断是否开启了服务端存储saveInServer
- 若开启服务端存储，调用billtempdata/detail接口，获取草稿详情信息
- 若未开启服务端存储，从indexDB获取草稿详情信息
- 调用add这个action，将读取的草稿信息和add接口的数据合并填到卡片页

### [](#手动调用方式-17)手动调用方式

不推荐单独调用，建议使用draftSelectAndAdd

## [](#19-edit编辑)19. edit（编辑）

### [](#主要功能介绍卡片详情场景使用到的action-11)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：将卡片详情页的页面状态置为编辑态`

此action依次执行了下面几个步骤：

- 判断当前store状态如果是非新增态的话，将当前store的状态改为edit

### [](#手动调用方式-18)手动调用方式

import { edit } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

edit(rootStore, {})

### [](#参数-17)参数

||参数||说明||类型  ||必填||默认值|
||targetStoreKey||当前store键值||string||否||cardStoreKey|
||cardStoreKey||卡片store键值||string||否||'cardStore'|

## [](#20-canceledit取消编辑)20. cancelEdit（取消编辑）

### [](#主要功能介绍卡片详情场景使用到的action-12)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：取消卡片详情页的编辑态，此action是取消按钮使用的`

此action依次执行了下面几个步骤：

- 判断当前store状态是否是新增态
- 若不是新增态，将当前store的状态改成浏览态，还原之前的数据
- 若是新增态，再判断当前store是否是cardStore
- 若是cardStore且开启了取消后返回的开关，则调用goback返回上一页，若是cardStore未开启开关，调用add这个action并将表单状态设置为浏览态
- 若不是cardStore，将当前store的状态改成浏览态，还原之前的数据

### [](#手动调用方式-19)手动调用方式

import { cancelEdit } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

cancelEdit(rootStore, {})

### [](#参数-18)参数

||参数||说明||类型  ||必填||默认值|
||targetStoreKey||当前store键值||string||否||cardStoreKey|
||cardStoreKey||卡片store键值||string||否||'cardStore'|
||treeStoreKey||树卡store键值||string||否||'treeStore'|
||pagingStoreKey||分页store键值，行编辑表的情况下才会使用||string||否||'treeStore'|
||isGoBackAfterCancel||是否取消后返回||string||否||true|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||add接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||add接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#21-browsebyrow列表行浏览)21. browseByRow（列表行浏览）

### [](#主要功能介绍列表场景使用到的action-6)主要功能介绍：(列表场景使用到的action)

`适用场景：列表页点击某条数据后，跳到详情页，以浏览的模式打开`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow不存在就报错，存在就调用openBill方法跳转到当前数据详情页，状态是浏览态

### [](#手动调用方式-20)手动调用方式

import { browseByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

browseByRow(rootStore, { billNo: 'xxxx' })

### [](#参数-19)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||否||'tableStore'|
||billNo||详情页面的billNo||string||是||--|

## [](#22-editbyrow列表行编辑)22. editByRow（列表行编辑）

### [](#主要功能介绍列表场景使用到的action-7)主要功能介绍：(列表场景使用到的action)

`适用场景：列表页点击某条数据后，跳到详情页，以编辑的模式打开`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow不存在就报错，存在就调用openBill方法跳转到当前数据详情页，状态是编辑态

### [](#手动调用方式-21)手动调用方式

import { editByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

editByRow(rootStore, { billNo: 'xxxx' })

### [](#参数-20)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||列表store键值||string||否||'tableStore'|
||billNo||详情页面的billNo||string||是||--|

## [](#23-list列表请求)23. list（列表请求）

### [](#主要功能介绍列表场景使用到的action-8)主要功能介绍：(列表场景使用到的action)

`适用场景：请求列表页的数据，将数据返回`

此action依次执行了下面几个步骤：

- 包装请求的数据loadParams
- 执行钩子beforeLoadListHook，传入loadParams，钩子的返回值当作新的loadParams
- 用loadParams去调用list接口，拿到result
- 执行钩子afterLoadListHook，传入result，钩子的返回值当作新的result
- 返回result

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-22)手动调用方式

import { list } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

list(rootStore, { billNo: 'xxxx' })

### [](#参数-21)参数

||参数||说明||类型  ||必填||默认值|
||filter||filterStore键值||string||否||undefined|
||paging||pagingStore键值||string||否||undefined|
||pagingTag||是否只查询数据总数||string||否||false|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||list接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||list接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#24-movenextorprev上翻下翻)24. moveNextOrPrev（上翻/下翻）

### [](#主要功能介绍卡片详情场景使用到的action-13)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：列表页进入详情页后，调用此事件进行上或下翻页，具体向上还是向下由参数决定`

此action依次执行了下面几个步骤：

- 列表页进入详情页后会在sessionStorage中保存列表页所有数据的id数组
- 获取当前详情页的billId
- 判断是否已经是超出了sessionStorage中的id范围
- 如果超出了需要请求接口请求下一页的数据id
- 获取下一个数据的billId，改到pageStore.params里
- 刷新页面，根据新的billId拉取详情页的数据

### [](#手动调用方式-23)手动调用方式

import { moveNextOrPrev } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

moveNextOrPrev(rootStore, { moveMode: 'prev' })

### [](#参数-22)参数

||参数||说明||类型  ||必填||默认值|
||moveMode||上翻下翻的标记||'prev'/'next'||否||''|
||cardStoreKey||卡片store键值||string||否||'cardStore'|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||add接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||add接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#25-movenextorprevbyrow移动端子表页面上翻下翻)25. moveNextOrPrevByRow（移动端子表页面上翻/下翻）

### [](#主要功能介绍移动端卡片页面子表详情页场景使用到的action)主要功能介绍：(移动端卡片页面子表详情页场景使用到的action)

`适用场景：移动端卡片页，进入某个子表的详情页后，调用此事件进行上或下翻页，具体向上还是向下由参数决定`

此action依次执行了下面几个步骤：

- 获取当前这条子表的id
- 如果当前状态是编辑态，要先保存当前这条子表的数据到tableStore里
- 获取下一条子表数据信息
- 展示下一条子表数据

### [](#手动调用方式-24)手动调用方式

import { moveNextOrPrevByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

moveNextOrPrevByRow(rootStore, { subFormStoreKey: 'xxx', tableStoreKey: 'xxxx', moveMode: 'prev' })

### [](#参数-23)参数

||参数||说明||类型  ||必填||默认值|
||subFormStoreKey||子页面暂存的formStore的键值||string||是||--|
||tableStoreKey||子表store键值||string||是||--|
||moveMode||上翻下翻的标记||'prev'/'next'||是||--|
||cardStoreKey||卡片store键值||string||否||'cardStore'|

## [](#26-querytree树查询)26. queryTree（树查询）

### [](#主要功能介绍有树的页面)主要功能介绍：(有树的页面)

`适用场景：查询某个树的数据，将请求到的数据回写到树上`

此action依次执行了下面几个步骤：

- 包装请求的数据loadParams
- 如果树开启了懒加载，处理树的懒加载参数
- 执行钩子beforeQueryTreeHook，传入loadParams，钩子的返回值当作新的loadParams
- 用loadParams去调用querytree接口，拿到result
- 执行钩子afterQueryTreeHook，传入result，钩子的返回值当作新的result
- 将result填入到树上

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-25)手动调用方式

import { queryTree } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

queryTree(rootStore, { filter: 'xxx', treeTable: 'xxxx', dataSourceAlias: 'xxxx' })

### [](#参数-24)参数

||参数||说明||类型  ||必填||默认值|
||filter||filterStore键值||string||是||--|
||table||树表store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||billNo||add接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|

## [](#27-save保存)27. save（保存）

### [](#主要功能介绍卡片详情场景使用到的action-14)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：保存某个卡片详情页的数据/保存某个树的数据`

此action依次执行了下面几个步骤：

- 收集卡片页/树的数据
- 判断是否挂了校验钩子validateHook，如果有就执行钩子，没有就执行默认的校验方法
- 包装请求的数据saveData
- 执行钩子beforeSaveHook，传入saveData，钩子的返回值当作新的saveData
- 用saveData去调用save接口，拿到result
- 执行钩子afterSaveHook，传入result，钩子的返回值当作新的result
- 数据回填到卡片页/树中
- 设置卡片页的状态为浏览态
- 如果卡片页是新增态并开启了保存后返回上一页，返回上一页

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-26)手动调用方式

import { save } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

save(rootStore, { cardStoreKey: 'xxx' })

### [](#参数-25)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片Store键值||string||是||--|
||treeStoreKey||卡片Store键值||string||否||'treeStore'|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||targetStoreKey||要保存的Store键值||string||否||cardStoreKey|
||dirtyCheck||是否脏检查，不传此参数只保存变化的数据||string||否||--|
||isGoBackAfterSave||保存后是否返回上一页||bool||否||true|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||两个接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|
||successTips||action执行成功的提示||string||否||保存成功|

## [](#28-batchsavebyrow列表批量保存)28. batchSaveByRow（列表批量保存）

### [](#主要功能介绍列表场景使用到的action-9)主要功能介绍：(列表场景使用到的action)

`适用场景：批量保存列表页的数据`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明点击的是行上的保存按钮，使用悬停行的数据包装请求的数据requestData
- hoverRow没值，说明点击的是批量保存按钮，使用table上选中的行数据包装请求的数据requestData
- 判断是否挂了校验钩子validateHook，如果有就执行钩子，没有就执行默认的校验方法
- 调用批量保存接口batchDo
- 数据回写到对应的行上

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-27)手动调用方式

import { batchSaveByRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

batchSaveByRow(rootStore, { tableStoreKey: 'xxx', dataSourceAlias: 'xxxx' })

### [](#参数-26)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片Store键值||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||是||--|
||successTips||action执行成功的提示||string||否||保存成功|
||dataNoChangeTips||未选择任何数据的提示||string||否||没有检测到数据更新需要保存|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|

## [](#29-saveandadd保存并新增)29. saveAndAdd（保存并新增）

### [](#主要功能介绍卡片详情场景使用到的action-15)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：按顺序调用了save(保存)和add(新增)这两个action，查看这两个action即可`

### [](#手动调用方式-28)手动调用方式

import { saveAndAdd } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

saveAndAdd(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-27)参数

`查看这两个action参数即可`

## [](#30-saveandsubmit保存并提交)30. saveAndSubmit（保存并提交）

### [](#主要功能介绍卡片详情场景使用到的action-16)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：按顺序调用了save(保存)和submit(提交)这两个action，查看这两个action即可`

### [](#手动调用方式-29)手动调用方式

import { saveAndSubmit } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

saveAndSubmit(rootStore, { cardStoreKey: 'xxxxx' })

### [](#参数-28)参数

`查看这两个action参数即可`

## [](#31-savesubitem子表单独保存)31. saveSubItem（子表单独保存）

### [](#主要功能介绍卡片详情场景使用到的action-17)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：子表/孙表单独保存的action`

此action依次执行了下面几个步骤：

- 获取父级parentStore，拿到当前这条子表数据所在的数据的id，子表就是拿主表的id，孙表就是拿其所在子表行的行id
- 通过父级paraentStore.getChangedRows()拿到所有修改的子表数据data
- 判断是否挂了校验钩子validateHook，如果有就执行钩子，没有就执行默认的校验方法
- 包装请求的数据saveData
- 执行钩子beforeSaveSubItemHook，传入saveData，钩子的返回值当作新的saveData
- 用saveData去调用save4OneEntity接口，拿到result
- 执行钩子afterSaveSubItemHook，传入result，钩子的返回值当作新的result
- 若当前保存的子表有分页，请求分页数据，初始化分页器total总数
- 将result合并到子表数据行上
- 重新初始化当前页的页码
- 重置页面子表状态为浏览态
- 弹出成功提示

- 上面出现的钩子函数，只在扩展rootStore.actions里的动作的场景下才会使用，定义方式详见扩展开发
- 自己手动调用时无需定义钩子函数，自己能在执行语句前后写扩展代码

### [](#手动调用方式-30)手动调用方式

import { saveSubItem } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

saveSubItem(rootStore, { cardStoreKey: 'xxxxx', targetStoreKey: 'xxx', uri: 'xxxx', parentStore: 'xxxx', parentUri: 'xxxxx' })

### [](#参数-29)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片Store键值||string||是||--|
||targetStoreKey||当前修改数据所在的Store键值||string||是||--|
||uri||当前修改数据所在数据源的uri||string||是||--|
||parentStore||当前修改数据的父级Store键值||string||是||--|
||parentUri||当前修改数据的父级的数据源的uri||string||是||--|
||dataSourceAlias||卡片数据源主表alias||string||否||cardStore.dataSource|
||billNo||两个接口的billNo参数||string||否||当前页面的单据编码：pageStore.params.billNo|
||busiObj||两个接口的busiObj参数||string||否||当前页面的业务对象：pageStore.params.busiObj|
||billId||两个接口的billId参数||string||否||当前页面的billId：pageStore.params.billId|

## [](#32-search移动端列表页的模糊搜索事件)32. search（移动端列表页的模糊搜索事件）

### [](#主要功能介绍移动端列表场景使用到的action)主要功能介绍：(移动端列表场景使用到的action)

`适用场景：移动端列表页的模糊搜索的action`

此action依次执行了下面几个步骤：

- 拼接模糊搜索条件
- 将条件写入filterStore
- 触发搜索事件

### [](#手动调用方式-31)手动调用方式

import { search } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

search(rootStore, { filterStoreKey: 'xxxx' }, { value: 'xxx', selectedFields: ['xxxx'] })

### [](#参数1)参数1

||参数||说明||类型  ||必填||默认值|
||filterStoreKey||过滤器Store键值||string||是||--|
||logic||多个字段条件拼接方式||string||否||'and'|

### [](#参数2)参数2

||参数||说明||类型  ||必填||默认值|
||value||搜索的数据||string||是||--|
||selectedFields||按照哪些字段模糊搜索||array||是||--|

## [](#33-insertrow子表增行)33. insertRow（子表增行）

### [](#主要功能介绍卡片详情场景使用到的action-18)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：给指定子表上增加一个空行`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，就在hoverRow的下面增加一条空行数据
- hoverRow没值，就在整个子表table的最下面增加一行数据
- 处理分页器中的total数据总数和当前空行数据的页码

### [](#手动调用方式-32)手动调用方式

import { insertRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

insertRow(rootStore, { tableStoreKey: 'xxxx' })

### [](#参数-30)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||子表Store键值||string||是||--|
||pagingStoreKey||分页器Store键值||string||否||'pagingStore'|

## [](#34-deleterows删行)34. deleteRows（删行）

### [](#主要功能介绍卡片详情场景使用到的action-19)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：删除指定子表上的行`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow有值，说明是删除一行数据，判断当前行是否有子数据，如果有，提示有下级数据不能删除，如果没有，调用tableStore.deleteNode进行删除
- hoverRow没值，说明是批量删除，判断选中的行是否有子数据，如果有，提示有下级数据不能删除，如果没有，调用tableStore.deleteNode进行删除
- 处理分页器中的total数据总数

### [](#手动调用方式-33)手动调用方式

import { deleteRows } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

deleteRows(rootStore, { tableStoreKey: 'xxxx' })

### [](#参数-31)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||子表Store键值||string||是||--|
||pagingStoreKey||分页器Store键值||string||否||'pagingStore'|
||noSelectRowTips||未选中数据的的提示||string||否||目前没有选中行|

## [](#35-copyrow复制行)35. copyRow（复制行）

### [](#主要功能介绍卡片详情场景使用到的action-20)主要功能介绍：(卡片详情场景使用到的action)

`适用场景：在指定子表上复制其中的一行数据，添加在那行数据的下面`

此action依次执行了下面几个步骤：

- 获取table上悬停的行hoverRow
- hoverRow没值就报错
- hoverRow有值，获取这行数据data
- 执行钩子beforeCopyRowHook，传入data，钩子的返回值当作新的data
- 将data数据插入到table上
- 执行钩子afterCopyRowHook
- 处理分页器中的total数据总数和当前空行数据的页码

### [](#手动调用方式-34)手动调用方式

import { copyRow } from 'ynf-core-engine/actions/bill';

// rootStore需要从上下文中拿到再传递

copyRow(rootStore, { tableStoreKey: 'xxxx' })

### [](#参数-32)参数

||参数||说明||类型  ||必填||默认值|
||tableStoreKey||子表Store键值||string||是||--|
||pagingStoreKey||分页器Store键值||string||否||'pagingStore'|