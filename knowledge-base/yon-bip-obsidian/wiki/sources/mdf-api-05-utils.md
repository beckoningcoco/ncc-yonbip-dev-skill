---
title: "常用工具 Utils"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-utils"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 常用工具 Utils

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-utils | 所属：API

# [](#常用工具-utils)常用工具 Utils

## [](#1-类型校验)1. 类型校验

### [](#11-是否为空-isempty)1.1. 是否为空 isEmpty

// value == null || value === ''

cb.utils.isEmpty(value)

### [](#12-是否空对象)1.2. 是否空对象

cb.utils.isEmptyObject(value)

### [](#13-对象比较)1.3. 对象比较

cb.utils.compareObject(value1, value2)

### [](#14-是否数组)1.4. 是否数组

const reselt = cb.utils.isArray(arr) // reselt --> Boolearn

### [](#15-是否对象)1.5. 是否对象

const reselt = cb.utils.isPlainObject(obj) // reselt --> Boolearn

### [](#16-是否ios)1.6. 是否ios

cb.utils.isIos()

### [](#17-是否ie)1.7. 是否IE

cb.utils.isIE() // res --> Boolean

 

const reselt = cb.utils.browser() // reselt --> IE

### [](#18-是否mac)1.8. 是否mac

cb.utils.isMac()

### [](#19-是否edge)1.9. 是否Edge

cb.utils.isEdge() // // 老版Edge浏览器，新版是Edg

### [](#110-是否是--型数据)1.10. 是否是 `<%.*%>` 型数据

const reselt = cb.utils.isMatchValue(value) // reselt --> Boolearn

## [](#2-环境信息)2. 环境信息

### [](#21-修改服务地址)2.1. 修改服务地址

cb.rest.setServiceUrl(url)

 

// 将服务地址更新成Node服务地址，解决CN使用MDF功能时的跨域问题

cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

## [](#3-数据转换)3. 数据转换

### [](#31-json字符串转json对象)3.1. JSON字符串转JSON对象

const json = cb.utils.stringToJSON(value)

### [](#32-把科学技数法转换成数字-其它数据返回原数据)3.2. 把科学技数法转换成数字, 其它数据返回原数据

cb.utils.getFullNum(num)

### [](#33-把科学技数法转换成数字-其它数据返回原数据)3.3. 把科学技数法转换成数字, 其它数据返回原数据

cb.utils.decimalFormatter(valueObj, options)

### [](#34-url格式化)3.4. URL格式化

// url || location.search

const qry = new cb.utils.queryString(url)

{ pathname, query } // 地址， 参数

||API||说明||类型||结果|
||`qry.set(key, value)`||添加参数||`key: string`|||
||`qry.get(key)`||获取query里的参数||`string`|||
||`qry.del(key)`||删除query里的参数||`string`|||
||`qry.has(key)`||判断参数是否存在||`string`||`Boolean`|
||`qry.toStr()`||拼接query里的参数||||`?a=1&b=2`|

### [](#35-对象深合并)3.5. 对象深合并

// 对象合并到newObj里

const result = cb.utils.extend(Boolean, newObj, obj1, obj2, ...)

 

// 合并到obj1里， 如果obj1不是对象 返回一个合并的新对象 

const result = cb.utils.extend(obj1, obj2, ...)

### [](#36-数组项枚举)3.6. 数组项枚举

const res = cb.utils.changeUserDefineTypeEnumValue(list, bToName)

 

// 枚举项

enum { String: '文本', Integer: '整型',Double: '数值',Date: '日期',Time: '时间',Datetime: '日期时间',Archive: '档案',}

 

cb.utils.changeUserDefineTypeEnumValue([{type: 'String'}], true) // [{type: '文本'}]

cb.utils.changeUserDefineTypeEnumValue([{type: '文本'}], false) // [{type: 'String'}]

### [](#37-删除对象中空值或空对象引用)3.7. 删除对象中空值或空对象引用

cb.utils.removeEmplyAttr(obj) // 修改原值

### [](#38-转换成boolean)3.8. 转换成Boolean

// '1' ||'y' || 'true'

const res = cb.utils.getBooleanValue(value)

### [](#39-删除对象中空值或空对象引用)3.9. 删除对象中空值或空对象引用

cb.utils.removeEmplyAttr(obj)

### [](#310-处理--的数据)3.10. 处理 `<%.*?%>` 的数据

// 获取数据

cb.utils.getPredicateValue(formatValue, dataSource)

const result = cb.utils.getPredicateValue('<%test%>', {test: 1}) // result => 1

 

// cb.rest.AppContext

const result = cb.utils.getPredicateValue('<%user.userId%>') // result => userId

### [](#311-数据算术运算)3.11. 数据算术运算

const res = cb.utils.FloatCalc.Fn(val1, val2) // res|String

||操作符||说明|
||`add`||加|
||`sub`||减|
||`mult`||乘|
||`divide`||除|

### [](#312-兼容多语object对象返回当前语种)3.12. 兼容多语object对象，返回当前语种

const res = cb.utils.getLocalValue(obj, locale)

### [](#313-删除对象中空值或空对象引用)3.13. 删除对象中空值或空对象引用

cb.utils.removeEmplyAttr(obj)

### [](#314-删除对象json字符串中元素)3.14. 删除对象/json字符串中元素

cb.utils.omitAttr(target, key)

### [](#315-处理cstyle)3.15. 处理cStyle

// throwOnError是否抛出错误

cb.utils.parseCStyle(cStyle: string, throwOnError = false)

 

// 同一个方法

cb.utils.parseCParameter

cb.utils.stringToJSON

### [](#316-url拼接)3.16. URL拼接

const res = cb.utils.setQueryString = (url, obj)

 

cb.utils.setQueryString('https://baidu.com?c=0', {aaa: 0, bb: 111}) // 'https://baidu.com?c=0&aaa=0&bb=111'

## [](#4-获取信息)4. 获取信息

### [](#41-获取用户组织交易类型)4.1. 获取用户、组织、交易类型...

// 获取用户信息

const user = cb.utils.getUser(domainKey)

// 用户类型：user.userType

// 0-企业管理员；1-企业人员；2-客户；3-客户子账号；4-商家管理员；5-商家的人员

 

// 组织ID

cb.utils.getOrgId(daminKey)

 

// 获取租户ID

cb.utils.getTenantId(domainKey) // domainKey非必传

 

// 获取交易类型

cb.utils.getTransType(viewmodel)

 

// 获取Token

cb.utils.getToken(domainKey)

 

// 获取Cookie

cb.utils.getCookie(name)

 

// 获取？？？ cb.rest.AppContext.predicateDate // 完善

cb.utils.changePredicateDate(defaultValue)

 

// 默认业务单元

cb.rest.AppContext.tenant.defaultOrg

### [](#42-获取当前日期)4.2. 获取当前日期

// 获取日期

const res = cb.utils.getNowFormatDate() // '2021-10-26 14:11:00'

### [](#43-获取全球化上下文信息)4.3. 获取全球化上下文信息

const res = cb.utils.getGlobalzition(callback)

### [](#44-获取字符串长度)4.4. 获取字符串长度

const reselt = cb.utils.getValueLength(text)// text|String

### [](#45-获取模型及操作)4.5. 获取模型及操作

const reselt = cb.utils.getVmByServiceCode(serviceCode) //

 

// 是上面一个 serviceCode = cb.rest._activeTabCode 的情况

cb.utils.getActiveVm()

 

// 当前激活的模型的 domainKey

cb.utils.getActiveDomainKey()

 

 

// 根据serviceCode，获取所有vm

cb.utils.getVmListByServiceCode()

 

//触发 viewmodel.get('cDefaultValueItems')里 ListModel/SimpleModel 的afterValueChange事件

cb.utils.afterDefaultValueChange(viewmodel)

## [](#5-其它)5. 其它

### [](#51-生成自增长id)5.1. 生成自增长ID

const reselt = cb.utils.getNewId(prefix)

 

cb.utils.getNewId('rowId') // rowId_2

### [](#52-原型继承)5.2. 原型继承

const reselt = cb.utils.getPrototype(prototype) //

### [](#53-生成guid)5.3. 生成GUID

const reselt = cb.utils.getNewGuid() //

### [](#54-生成小数位)5.4. 生成小数位

const reselt = cb.utils.getRoundValue(value, decimal)

 // cb.utils.getRoundValue(5, 8) -->'5.00000000'

### [](#55-对象对比深)5.5. 对象对比(深)

const reselt = cb.utils.compareObject(obj1, obj2) //

### [](#56-playaudio)5.6. playAudio

const res = cb.utils.playAudio(url) //

res = {

 promise: audio.play(),

 element: audio,

 play: async () => audio.play(),

 pause: () => audio.pause(),

 stop: () => audio.remove()

}

### [](#57-构建请求懒加载params)5.7. 构建请求懒加载params

/**

 params 请求参数

 addPageInfo 是否添加分页 默认pageSize 50

*/

 

const reselt = cb.utils.buildLazyLoadSimpleVOs(params, addPageInfo, name = 'condition', isSearch = false) //

### [](#58-调用操作日志)5.8. 调用操作日志

/**

 params 请求参数

 viewmodel 页面模型，没有可以不传

*/

// 使用示例

const params = {

 bClick: true, // 必传，固定参数，用来区分是按钮点击动作还是通过biz.do方式调用

 domainKey: 'xxx', // 必传，领域前端domainKey，用来做接口转发

 serviceCode: 'xxxx', // 必传，领域的服务编码，操作日志记录时后端需要此参数

 cShowCaptionResid: 'xxx', // 和下面的cShowCaption 二选一,值为按钮名称的多语资源编码

 cShowCaption: 'xxx' // 没有cShowCaptionResid时传递，值为按钮名称，比如'search'或'搜索'

}

cb.utils.saveOperationLog(params, viewmodel)

### [](#59-生成fieldid)5.9. 生成fieldid

/*

* model 字段模型或者viewModel

* billNo 页面编码或查询方案编码

* cItemName 字段key

* childrenField 表格childrenField

* index 数据下标或组件内部子组件

* 默认格式

* 表头 [BillNo]|[cItemName]

* 枚举/参照内 [BillNo]|[cItemName]|[index]

* 表体 [BillNo]|[childrenField][cItemName]|[index]

*/

cb.utils.getFieldID = function (args) {

 try {

 const billNo = args?.billNo || args?.model?.getRootParent?.()?.getParams?.()?.billNo || args?.model?.getParams?.()?.billNo || args?.model?.get?.('serviceCode') || cb?.utils?.getActiveVm?.()?.getParams?.()?.billNo || args?.model?.get?.('filtersId');

 const cItemName = args?.cItemName || args?.model?.get?.('cItemName') || args?.model?.get?.('itemName') || args?.model?.getCache?.('name');

 const childrenField = args?.childrenField || args?.model?.get?.('childrenField') || args?.model?.getParent?.()?.getParent?.()?.get?.('childrenField');

 const index = args?.hasOwnProperty?.('index') ? args?.index : args?.model?.getCache?.('rowIndex');

 let fieldID = billNo;

 if (childrenField) fieldID += '|' + childrenField;

 if (cItemName) fieldID += '|' + cItemName;

 if (index || index == 0) fieldID += '|' + index;

 return fieldID;

 } catch {}

}

### [](#510-表格滚动到单元格)5.10. 表格滚动到单元格

// 返回对象{lineno, columnModel, value}

// 方法中使用了yya对象，为自动化测试提供的方法

const results = cb.utils.scrollToTableCell(表格childrenfiled, rowIndex, attr);

### [](#511-特征组值是否变化)5.11. 特征组值是否变化

/**

 *

 * @param gridModel，必填，表格模型

 * @param args，必填，格式参考afterCellValueChange接到的参数

 * @param sensitiveKey ，必填，判断敏感的key，

 * @returns {change,check} ，change:布尔类型，值是否发生变化；check：敏感全填且发生变化

 */

const result = cb.utils.bCharacterChange(表格gridModel, args, sensitiveKey);