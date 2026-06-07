---
title: "期初收款列表查询"
apiId: "1835919960242651138"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Collection"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 期初收款列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Opening Collection (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiear_collection_init/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 当前页码 示例：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 |
| state | string | 是 | 否 | 事务状态(枚举值 0: 未审核； 1: 已审核) 示例：["0","1"] |
| open_accDate_begin | string | 否 | 否 | 记账日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-09 00:00:00 |
| open_accDate_end | string | 否 | 否 | 记账日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-08 23:59:59 |
| code | string | 否 | 否 | 会计事务编号 示例：AR03230630000125 |
| financeOrg | string | 是 | 否 | 会计主体id 示例：["1474252334897823749"] |
| objectType | string | 是 | 否 | 往来对象类型 (枚举值 1：客户；2:员工；3:资金业务对象) 示例：["1"] |
| employee | string | 是 | 否 | 员工id 示例：[ "1530038402281373696", "1530461052833103872" ] |
| customer | string | 是 | 否 | 客户id 示例：[ "1526228774896533510", "1526313007795142662" ] |
| funder | string | 是 | 否 | 资金业务对象id 示例：[ "1553108286546378756", "1553115673901137927" ] |
| oriCurrency | string | 是 | 否 | 币种id 示例：[ "1623643074168094746", "1529920642871197705" ] |
| postState | string | 是 | 否 | 过账状态(枚举值 0:未过账;1:过账中;2:过账成功;3:过账失败;4:不过账) 示例：[ "0", "1", "2" ] |
| bodyItem.arSubject | string | 是 | 否 | 应收账款科目id 示例：[ "1527070519744528390", "1618990988911443971" ] |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 否 | 否 | 会计主体编码 示例："0909" |
| employee.code | string | 否 | 否 | 员工编码 示例："100011" |
| customer.code | string | 否 | 否 | 客户编码 示例："0000test000004" |
| funder.code | string | 否 | 否 | 资金业务对象编码 示例："100011" |
| oriCurrency.code | string | 否 | 否 | 币种简称 示例："CNY" |
| bodyItem.arSubject.code | string | 否 | 否 | 应收账款科目编码 示例："112201" |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/fiear_collection_init/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"state": [
		"0",
		"1"
	],
	"open_accDate_begin": "2022-11-09 00:00:00",
	"open_accDate_end": "2022-12-08 23:59:59",
	"code": "AR03230630000125",
	"financeOrg": [
		"1474252334897823749"
	],
	"objectType": [
		"1"
	],
	"employee": [
		"1530038402281373696",
		"1530461052833103872"
	],
	"customer": [
		"1526228774896533510",
		"1526313007795142662"
	],
	"funder": [
		"1553108286546378756",
		"1553115673901137927"
	],
	"oriCurrency": [
		"1623643074168094746",
		"1529920642871197705"
	],
	"postState": [
		"0",
		"1",
		"2"
	],
	"bodyItem.arSubject": [
		"1527070519744528390",
		"1618990988911443971"
	],
	"isSum": false,
	"simple": {
		"financeOrg.code": "\"0909\"",
		"employee.code": "\"100011\"",
		"customer.code": "\"0000test000004\"",
		"funder.code": "\"100011\"",
		"oriCurrency.code": "\"CNY\"",
		"bodyItem.arSubject.code": "\"112201\"",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24",
		"open_auditTime_begin": "2023-04-13 14:59:24",
		"open_auditTime_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回期初收款数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：20 |
| recordCount | int | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | int | 否 | 总页数 示例：1 |
| beginPageIndex | int | 否 | 起始页码 示例：1 |
| endPageIndex | int | 否 | 最终页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"oriCurrency": "1525643705855773169",
				"financeOrg": "1649571233377812482",
				"bodyItem_accExchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"creator_userName": "测试管理员",
				"objectType": "1",
				"srcBillDate": "2022-12-31",
				"orgCurrency": "1525643705855773169",
				"entryCode": "00597269A",
				"eventType_name": "期初收款",
				"id": "1809193821771661315",
				"eventType": "1436623525031968768",
				"bodyItem_arSubjectVid": "1649572075179868173",
				"srcApp": "95",
				"bodyItem_id": "1809193821771661319",
				"bodyItem_accBalance": 98,
				"bodyItem_localBalanceState": "2",
				"entry": "1809193916280340484",
				"accBook": "1649573105972019221",
				"srcApp_name": "应收管理",
				"status": "1",
				"code": "AR03221231002006",
				"bodyItem_settleState": "2",
				"bodyItem_oriCurrency": "1525643705855773169",
				"bodyItem_objectBankAccountNo": "123456789098876",
				"writeOffState": "0",
				"bodyItem_oriOcupyAmount": 0,
				"quickType": 1525643714430500878,
				"accExchangeRate": 1,
				"settleMode": "1525649083156923163",
				"accTaxIncludedAmount": 100,
				"bodyItem_staff": "3213131",
				"bodyItem_customerBankAccount": 1628623294906236935,
				"pubts": "2023-09-04 17:15:07",
				"bodyItem_balanceState": "2",
				"financeOrg_name": "味多美组织",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"bodyItemId": "1809193821771661319",
				"bizBillCode": "AR03221231002006",
				"accPeriod_code": "2023-01",
				"arapEventType": "106",
				"postState": "2",
				"accBookName": "味多美",
				"accDate": "2022-12-31",
				"accPeriod": "1529511366840287239",
				"partner": "1539685586018762760",
				"exchangeRateDate": "2022-12-31",
				"createTime": "2023-09-04 16:57:34",
				"bodyItem_oriBalance": 98,
				"accYearCode": "2023",
				"customer_name": "客户A",
				"customer": "1526228774896533510"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

