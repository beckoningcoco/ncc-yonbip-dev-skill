---
title: "导航类Action"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-navigate-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 6
---

# 导航类Action

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g02-action-navigate-api | 所属：YNF-API

# [](#导航类action)导航类Action

## [](#1-goback回到上一页)1. goBack(回到上一页)

### [](#主要功能介绍)主要功能介绍：

`适用场景：任何ynf页面，回到上一页的场景`


此action依次执行了下面几个步骤：

- 判断当前页是否是卡片页
- 如果是卡片页，且卡片页处于编辑态，弹出二次确认提示
- 调用pageStore.goBack回到上一页

### [](#手动调用方式)手动调用方式

import { goBack } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

goBack(rootStore, {})

### [](#参数)参数

无

## [](#2-refresh刷新整个页面)2. refresh(刷新整个页面)

### [](#主要功能介绍-1)主要功能介绍：

`适用场景：任何ynf页面，刷新整个页面的场景`


此action依次执行了下面几个步骤：

- 调用pageStore.refresh重新拉取meta

### [](#手动调用方式-1)手动调用方式

import { refresh } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

refresh(rootStore, {})

### [](#参数-1)参数

无

## [](#3-bneedrefresh刷新页面数据)3. bNeedRefresh(刷新页面数据)

### [](#主要功能介绍-2)主要功能介绍：

`适用场景：任何ynf页面，刷新页面数据的场景`


此action依次执行了下面几个步骤：

- 设置了pageStore.bNeedRefresh = true
- 不同的类型页面监听bNeedRefresh并进行响应，比如列表页会重新拉取列表数据

### [](#手动调用方式-2)手动调用方式

import { bNeedRefresh } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

bNeedRefresh(rootStore, {})

### [](#参数-2)参数

无

## [](#4-openbill打开单据)4. openBill(打开单据)

### [](#主要功能介绍-3)主要功能介绍：

`适用场景：任何ynf页面，调用此api以弹窗或者路由跳转方式打开新的ynf单据`


此action依次执行了下面几个步骤：

- 获取options中的type属性
- type为modal，调用openBillByModal这个action
- type为tab且在工作台，调用openBillByTabs这个action
- type为其他情况，调用openBillByRoute这个action

### [](#手动调用方式-3)手动调用方式

import { openBill } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openBill(rootStore, { type: 'modal' })

### [](#参数-3)参数

||参数||说明||类型  ||必填||默认值|
||type||打开单据方式||string||否||--|

- 其他参数看具体调用的哪个action

## [](#5-openbillbymodal弹窗方式打开ynf单据)5. openBillByModal（弹窗方式打开ynf单据）

### [](#主要功能介绍-4)主要功能介绍：

`适用场景：任何ynf页面，以弹窗方式打开新的ynf单据`


此action依次执行了下面几个步骤：

- 若modalPadding开关关闭，则去掉弹窗内部内边距样式
- 调用pageStore.openModal打开ynf单据

### [](#手动调用方式-4)手动调用方式

import { openBillByModal } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openBillByModal(rootStore, { billNo: 'xxx', query: {...}, modalProp: {...} })

### [](#参数-4)参数

||参数||说明||类型  ||必填||默认值|
||billNo||打开单据billNo||string||是||--|
||query||打开单据的query||object||是||--|
||modalProps||弹窗的参数(参数参考tinper的Modal)||object||否||{}|

- 其他自定义参数会带到下一个页面的params里

## [](#6-openbillbytabs工作台新页签方式打开ynf单据)6. openBillByTabs（工作台新页签方式打开ynf单据）

### [](#主要功能介绍-5)主要功能介绍：

`适用场景：在工作台ynf页面，以工作台新页签的方式打开新的ynf单据`


此action依次执行了下面几个步骤：

- 调用jDiwork.openService打开新的ynf单据页签

### [](#手动调用方式-5)手动调用方式

import { openBillByTabs } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openBillByTabs(rootStore, { serviceCode: 'xxx', billNo: 'xxxx', title: 'xxxx', query: {...}, filterPermission: false })

### [](#参数-5)参数

||参数||说明||类型  ||必填||默认值|
||serviceCode||工作台serviceCode||string||是||--|
||billNo||打开单据billNo||string||是||--|
||query||打开单据的query||object||是||--|
||title||打开的工作台页签的title||string||否||框架按照一定规则生成|
||filterPermission||是否开启权限过滤，开启的话没权限的单据会提示没权限||bool||否||true|

- 其他自定义参数会带到下一个页面的params里

## [](#7-openbillbyroute路由方式打开ynf单据)7. openBillByRoute(路由方式打开ynf单据)

### [](#主要功能介绍-6)主要功能介绍：

`适用场景：任何ynf页面，以路由的方式打开新的ynf单据`


此action依次执行了下面几个步骤：

- 调用pageStore.push跳转到ynf单据

### [](#手动调用方式-6)手动调用方式

import { openBillByRoute } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openBillByRoute(rootStore, { billNo: 'xxxx', query: {...} })

### [](#参数-6)参数

||参数||说明||类型  ||必填||默认值|
||billNo||打开单据billNo||string||是||--|
||query||打开单据的query||object||是||--|

- 其他自定义参数会带到下一个页面的params里

## [](#8-openlink浏览器新开页签打开某个指定url)8. openLink（浏览器新开页签打开某个指定url）

### [](#主要功能介绍-7)主要功能介绍：

`适用场景：任何ynf页面，以浏览器新页签的方式打开任意url`


此action依次执行了下面几个步骤：

- 解析query中的mobx表达式，解析后的参数，拼到url上
- 调用window.open(url)打开浏览器新页签

### [](#手动调用方式-7)手动调用方式

import { openLink } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openLink(rootStore, { url: 'xxxx', query: { param1: 'mobx://rootStore.xxx.xxx' } })

### [](#参数-7)参数

||参数||说明||类型  ||必填||默认值|
||url||url||string||是||--|
||query||url上的自定义query参数||object||否||{}|

- 其他自定义参数会带到下一个页面的params里

## [](#9-opensubpage打开移动端子页面)9. openSubPage（打开移动端子页面）

### [](#主要功能介绍-8)主要功能介绍：

`适用场景：移动端多个子页面的单据，打开指定子页面`


此action依次执行了下面几个步骤：

- 调用pageStore.showPage方法，打开指定pageCode的子页面，pageCode为子页面的alias
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-01.a1f00f31.png)

### [](#手动调用方式-8)手动调用方式

import { openSubPage } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openSubPage(rootStore, { pageCode: 'xxxx' })

### [](#参数-8)参数

||参数||说明||类型  ||必填||默认值|
||pageCode||子页面alias||string||是||--|

## [](#10-closesubpage关闭移动端子页面)10. closeSubPage（关闭移动端子页面）

### [](#主要功能介绍-9)主要功能介绍：

`适用场景：移动端多个子页面的单据，关闭当前子页面`


此action依次执行了下面几个步骤：

- 调用pageStore.closePage方法，关闭当前子页面

### [](#手动调用方式-9)手动调用方式

import { closeSubPage } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

closeSubPage(rootStore, {})

### [](#参数-9)参数

无

## [](#11-addrowbysubpage移动端新增子表数据并打开)11. addRowBySubPage（移动端新增子表数据并打开）

### [](#主要功能介绍-10)主要功能介绍：

`适用场景：移动端带子表的页面，想要给某个子表增加一行空数据，并立即跳转到这条空数据的详情页面的场景`


此action依次执行了下面几个步骤：

- 给对应子表tableStore增加一条空行数据emptyRow
- 将空行数据灌到subFormStore里
- 打开子表详情子页面，对应子表页面会展示subFormStore里的数据

### [](#手动调用方式-10)手动调用方式

import { addRowBySubPage } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

addRowBySubPage(rootStore, { tableStoreKey: 'xxxx', cardStoreKey: 'xxx', pageCode: 'xxxx', subFormStoreKey: 'xxxxx' })

### [](#参数-10)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||tableStoreKey||列表store键值||string||是||--|
||subFormStoreKey||子表页面formStore键值，查看方式见下图||string||是||--|
||pageCode||子页面alias，查看方式见下图||string||是||--|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-01.a1f00f31.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-02.45262ba4.png)

## [](#12-opensubpagebyrow移动端打开某条子表数据详情)12. openSubPageByRow（移动端打开某条子表数据详情）

### [](#主要功能介绍-11)主要功能介绍：

`适用场景：移动端带子表的页面，点击子表某条数据或者这条数据上的按钮，调用此方法打开`


此action依次执行了下面几个步骤：

- 获取子表行的rowIndex或者当前点击的子表行hoverRow
- 将数据灌到subFormStore里
- 打开子表详情子页面，对应子表页面会展示subFormStore里的数据

### [](#手动调用方式-11)手动调用方式

import { openSubPageByRow } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

openSubPageByRow(rootStore, { tableStoreKey: 'xxxx', cardStoreKey: 'xxx', pageCode: 'xxxx', subFormStoreKey: 'xxxxx' }, 1)

### [](#参数1)参数1

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||tableStoreKey||列表store键值||string||是||--|
||subFormStoreKey||子表页面formStore键值，查看方式见下图||string||是||--|
||pageCode||子页面alias，查看方式见下图||string||是||--|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-01.a1f00f31.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-02.45262ba4.png)

### [](#参数2)参数2

参数2的类型是数字，代表当前要打开子表数据的rowIndex，没传递这个值就会取当前点击的这行hoverRow的数据

## [](#13-savesubrow保存当前子表页面的数据)13. saveSubRow（保存当前子表页面的数据）

### [](#主要功能介绍-12)主要功能介绍：

`适用场景：移动端带子表的页面，在子表详情页修改数据后，调用此方法保存子表数据`


此action依次执行了下面几个步骤：

- 校验对应子表页面subFormStore里的数据
- 拿到对应子表页面subFormStore里的数据更新到tableStore里
- 如果isClose为true，则关闭当前子页面，不传此参数，默认会关闭

### [](#手动调用方式-12)手动调用方式

import { saveSubRow } from 'ynf-core-engine/actions/navigate';

// rootStore需要从上下文中拿到再传递

saveSubRow(rootStore, { tableStoreKey: 'xxxx', cardStoreKey: 'xxx', subFormStoreKey: 'xxxxx' })

### [](#参数-11)参数

||参数||说明||类型  ||必填||默认值|
||cardStoreKey||卡片store键值||string||是||--|
||tableStoreKey||列表store键值||string||是||--|
||subFormStoreKey||子表页面formStore键值，查看方式见下图||string||是||--|
||isClose||保存后是否关闭子页面||bool||否||true|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g02-action-navigate-api-02.45262ba4.png)

## [](#14-openmodalforadd新增档案)14. openModalForAdd（新增(档案)）

### [](#主要功能介绍-13)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#15-openeditmodalbyrow编辑档案)15. openEditModalByRow（编辑(档案)）

### [](#主要功能介绍-14)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#16-openbrowsemodalbyrow浏览档案)16. openBrowseModalByRow（浏览(档案)）

### [](#主要功能介绍-15)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#17-opencopymodalbyrow复制档案)17. openCopyModalByRow（复制(档案)）

### [](#主要功能介绍-16)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#18-saveformmodal保存档案)18. saveFormModal（保存(档案)）

### [](#主要功能介绍-17)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#19-saveformmodalandadd保存并新增档案)19. saveFormModalAndAdd（保存并新增(档案)）

### [](#主要功能介绍-18)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`

## [](#20-closeformmodal关闭窗口档案)20. closeFormModal（关闭窗口(档案)）

### [](#主要功能介绍-19)主要功能介绍：

`适用场景：档案模板页面专用的action，不建议使用`