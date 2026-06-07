---
title: "应付事项列表查询（即将废弃）"
apiId: "919fc8d70213459985e4afaa37d6d40a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/P Events"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Events]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事项列表查询（即将废弃）

> `ContentType	application/json` 请求方式	POST | 分类: A/P Events (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oap/list

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
| currency | string | 否 | 否 | 币种id |
| accentity | string | 否 | 否 | 会计主体 |
| writeoffstatus | string | 否 | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销 |
| tradetype | string | 否 | 否 | 交易类型 |
| project | string | 否 | 否 | 项目 |
| operator | string | 否 | 否 | 业务员 |
| dept | string | 否 | 否 | 部门 |
| supplier | string | 否 | 否 | 供应商id |
| basebilltype | string | 否 | 否 | 事项类型 |
| auditstatus | string | 否 | 否 | 审批状态 |
| voucherstatus | string | 否 | 否 | 凭证状态 |
| isSum | boolean | 否 | 否 | 是否仅表头显示，0:false、1:true 默认值：false |
| pageIndex | string | 否 | 是 | 页号 |
| pageSize | string | 否 | 是 | 每页行数 |
| simple | object | 否 | 否 | 查询条件 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss |
| initflag | string | 否 | 否 | 期初标志,1:0(false)、2:1(true) |
| period | string | 否 | 否 | 会计期间id |
| synergystatus | string | 是 | 否 | 单据协同确认状态, 0:未确认、1:已确认、2:其他 |

## 3. 请求示例

Url: /yonbip/fi/oap/list?access_token=访问令牌
Body: {
	"code": "",
	"orderno": "",
	"currency": "",
	"accentity": "",
	"writeoffstatus": "",
	"tradetype": "",
	"project": "",
	"operator": "",
	"dept": "",
	"supplier": "",
	"basebilltype": "",
	"auditstatus": "",
	"voucherstatus": "",
	"isSum": true,
	"pageIndex": "",
	"pageSize": "",
	"simple": {
		"open_vouchdate_begin": "",
		"open_vouchdate_end": "",
		"initflag": "",
		"period": "",
		"synergystatus": [
			""
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回记录列表 |
| sumRecordList | object | 否 | 记录列表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"vouchdate": "",
				"code": "",
				"basebilltype": "",
				"basebilltype_name": "",
				"tradetype": "",
				"tradetype_name": "",
				"accentity": "",
				"accentity_name": "",
				"period": "",
				"accountdate": "",
				"period_code": "",
				"supplier": "",
				"supplier_name": "",
				"currency": "",
				"currency_name": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"exchangeRateType_digit": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"exchRate": 0,
				"billdirection": "",
				"oriSum": 0,
				"provisionalestimateflag": "",
				"natSum": 0,
				"balance": 0,
				"localbalance": 0,
				"srcitem": "",
				"billtype": "",
				"writeoffstatus": "",
				"voucherstatus": "",
				"auditstatus": "",
				"taxsubject": "",
				"deatil_supplier": "",
				"deatil_supplier_name": "",
				"detail_id": "",
				"natMoney": "",
				"oriMoney": "",
				"mainid": "",
				"oriTax": "",
				"id": "",
				"pubts": ""
			}
		],
		"sumRecordList": {
			"currency_moneyDigit": "",
			"currency_priceDigit": "",
			"oriTax": "",
			"localbalance": "",
			"currency": "",
			"natMoney": "",
			"natSum": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

