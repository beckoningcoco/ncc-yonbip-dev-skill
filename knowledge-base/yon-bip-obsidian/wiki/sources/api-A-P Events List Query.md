---
title: "应付事项单列表查询"
apiId: "1a4c889fc4d14aeba12f65059845e6b2"
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

# 应付事项单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: A/P Events (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oap/list/v2

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 页号 |
| pageSize | string | 否 | 是 | 每页行数 |
| auditstatus | string | 否 | 否 | 审批状态, 1:已审批、2:未审批、不输入时为查询全部 |
| accentity | string | 否 | 否 | 会计主体id |
| accentity_code | string | 否 | 否 | 会计主体编码 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss |
| code | string | 否 | 否 | 单据编号 |
| tradetype | string | 否 | 否 | 交易类型id |
| tradetype_code | string | 否 | 否 | 交易类型编码 |
| supplier | string | 否 | 否 | 供应商id |
| supplier_code | string | 否 | 否 | 供应商编码 |
| dept | string | 否 | 否 | 部门id |
| dept_code | string | 否 | 否 | 部门编码 |
| operator | string | 否 | 否 | 业务员id |
| operator_code | string | 否 | 否 | 业务员编码 |
| orderno | string | 否 | 否 | 订单编号 |
| writeoffstatus | string | 否 | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销 |
| voucherstatus | string | 否 | 否 | 凭证状态, 1:已生成、2:未生成、3:已接收未生成、4:不生成 |
| srcitem | string | 否 | 否 | 事项来源, 1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方 |
| basebilltype | string | 否 | 否 | 事项类型id |
| basebilltype_code | string | 否 | 否 | 事项类型编码 |
| currency | string | 否 | 否 | 币种id |
| currency_code | string | 否 | 否 | 币种简称 |
| period_code | string | 否 | 否 | 会计期间编码 |
| project | string | 否 | 否 | 项目id |
| project_code | string | 否 | 否 | 项目编码 |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或) |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/oap/list/v2?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"auditstatus": "",
	"accentity": "",
	"accentity_code": "",
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"code": "",
	"tradetype": "",
	"tradetype_code": "",
	"supplier": "",
	"supplier_code": "",
	"dept": "",
	"dept_code": "",
	"operator": "",
	"operator_code": "",
	"orderno": "",
	"writeoffstatus": "",
	"voucherstatus": "",
	"srcitem": "",
	"basebilltype": "",
	"basebilltype_code": "",
	"currency": "",
	"currency_code": "",
	"period_code": "",
	"project": "",
	"project_code": "",
	"isSum": true,
	"simpleVOs": [
		{
			"logicOp": "",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
		}
	]
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
| pubts | string | 否 | 时间戳, 格式为:yyyy-MM-dd HH:mm:ss |
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
				"provisionalestimateflag": true,
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
				"natMoney": 0,
				"oriMoney": 0,
				"mainid": "",
				"oriTax": "",
				"id": "",
				"pubts": ""
			}
		],
		"sumRecordList": {
			"currency_moneyDigit": "",
			"currency_priceDigit": "",
			"oriTax": 0,
			"localbalance": 0,
			"currency": "",
			"natMoney": 0,
			"natSum": 0
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

