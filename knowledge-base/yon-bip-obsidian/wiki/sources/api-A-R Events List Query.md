---
title: "应收事项列表查询"
apiId: "ba8150f3df3744769d5695532cdd7fc5"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收事项列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oar/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 否 | 单据编号 |
| orderno | string | 否 | 否 | 订单编号 |
| period | string | 否 | 否 | 会计期间 |
| currency | string | 否 | 否 | 币种id |
| accentity | string | 否 | 否 | 会计主体ID |
| writeoffstatus | string | 否 | 否 | 核销状态 |
| tradetype | string | 否 | 否 | 交易类型 |
| project | string | 否 | 否 | 项目 |
| operator | string | 否 | 否 | 业务员 |
| basebilltype | string | 否 | 否 | 事项类型 |
| org | string | 否 | 否 | 销售组织 |
| dept | string | 否 | 否 | 部门 |
| auditstatus | string | 否 | 否 | 审批状态, 1:已审批、2:未审批 |
| voucherstatus | string | 否 | 否 | 凭证状态, 1:已生成、2:未生成、3:已接收未生成、4:不生成 |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false或者不传则查询表头+表体 示例：false 默认值：false |
| pageIndex | string | 否 | 是 | 页号 |
| pageSize | string | 否 | 是 | 每页行数 |
| simple | object | 否 | 否 | 查询条件 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_maturitydate_begin | string | 否 | 否 | 到期日开始日期, 格式为:yyyy-MM-dd HH:mm:ss |
| open_maturitydate_end | string | 否 | 否 | 到期日结束日期, 格式为:yyyy-MM-dd HH:mm:ss |
| initflag | string | 否 | 否 | 期初标志,1:0(false)、2:1(true) |
| srcitem | string | 是 | 否 | 事项来源, 1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方 |
| synergystatus | string | 是 | 否 | 单据协同确认状态, 0:未确认、1:已确认、2:其他 |
| customer | string | 是 | 否 | 客户id |

## 3. 请求示例

Url: /yonbip/fi/oar/list?access_token=访问令牌
Body: {
	"code": "",
	"orderno": "",
	"period": "",
	"currency": "",
	"accentity": "",
	"writeoffstatus": "",
	"tradetype": "",
	"project": "",
	"operator": "",
	"basebilltype": "",
	"org": "",
	"dept": "",
	"auditstatus": "",
	"voucherstatus": "",
	"isSum": false,
	"pageIndex": "",
	"pageSize": "",
	"simple": {
		"open_vouchdate_begin": "",
		"open_vouchdate_end": "",
		"open_maturitydate_begin": "",
		"open_maturitydate_end": "",
		"initflag": "",
		"srcitem": [
			""
		],
		"synergystatus": [
			""
		],
		"customer": [
			""
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回应收事项数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| pageIndex | long | 否 | 每页行数 示例：1 |
| pageSize | long | 否 | 页码 示例：2 |
| recordCount | long | 否 | 总条数 示例：221 |
| recordList | object | 是 | 返回数据 |
| sumRecordList | object | 是 | 合计 |
| pageCount | long | 否 | 总页数 示例：111 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：2 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-05-25 10:56:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 221,
		"recordList": [
			{
				"detail_pubts": "2021-05-21 10:55:00",
				"currency_priceDigit": 1,
				"oriTax": 86.58,
				"natTax": 86.58,
				"accentity_name": "外币公司",
				"detail_customer_name": "桃子",
				"accentity": "1899388139246592",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000004",
				"balance": 752.58,
				"period_code": "2021-05",
				"id": 2266983619695104,
				"headItem": {
					"id": "",
					"define32_name": "",
					"define27": "",
					"define32": ""
				},
				"bodyItem": {
					"define6": ""
				},
				"exchangeRateType_digit": 6,
				"period": 2008087276361472,
				"localbalance": 752.58,
				"basebilltype": "HSFWYSGLYY1",
				"natSum": 752.58,
				"unit_name": "吨",
				"unit": 1839741381890304,
				"natCurrency_moneyDigit": 8,
				"natCurrency_priceDigit": 1,
				"unit_Precision": 2,
				"detail_customer": 2077309745189120,
				"oriMoney": 666,
				"status": 0,
				"currency_moneyDigit": 8,
				"code": "OARar210521000001",
				"billdirection": 2,
				"provisionalestimateflag": false,
				"exchRate": 1,
				"taxsubject": "VAT13",
				"vouchdate": "2021-05-21 00:00:00",
				"natCurrency_name": "港元",
				"basebilltype_name": "其他应收事项",
				"billtype": 2,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000004",
				"pubts": "2021-05-21 10:55:00",
				"material_name": "你很特别",
				"auditstatus": 2,
				"currency_name": "港元",
				"oriSum": 752.58,
				"tradetype_name": "其他应收事项",
				"srcitem": 6,
				"voucherstatus": 2,
				"tradetype": "1153091135960128",
				"exchangeRateType": "gppq37wd",
				"oarDetail_id": 2266983619711488,
				"writeoffstatus": 2,
				"material": 1839742290759936,
				"exchangeRateType_name": "基准汇率",
				"customer_name": "桃子",
				"accountdate": "2021-05-21 00:00:00",
				"natMoney": 666,
				"customer": 2077309745189120,
				"material_code": "01000023"
			}
		],
		"sumRecordList": [
			{
				"currency_moneyDigit": 6,
				"currency_priceDigit": 2,
				"oriTax": 11898.239035,
				"localbalance": 233782.84,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"natSum": 233982.84,
				"natTax": 11898.239035,
				"oriMoney": 222084.600965,
				"natMoney": 222084.600965
			}
		],
		"pageCount": 111,
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"pubts": "2021-05-25 10:56:00"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

