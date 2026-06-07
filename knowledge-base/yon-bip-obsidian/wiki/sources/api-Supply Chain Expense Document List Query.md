---
title: "供应链费用单列表查询"
apiId: "1482435424428228608"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Chain Expense Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Chain Expense Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应链费用单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/scmmp/expense/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | long | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页数 示例：10 默认值：10 |
| status | string | 否 | 否 | 单据状态(0开立，3审批中，1，已审核) 示例：0 |
| code | string | 否 | 否 | 费用单号 示例：QSQR202204290001 |
| orgId | string | 否 | 否 | 费用发生组织id 示例：2353226125496576 |
| orgId_code | string | 否 | 否 | 费用发生组织编码 示例：AAA |
| expenseItemId | long | 否 | 否 | 费用项目id 示例：2510729413415168 |
| expenseItem_code | string | 否 | 否 | 费用项目编码 示例：000003 |
| settlementOrg | string | 否 | 否 | 费用核算组织id 示例：2353226125496576 |
| settlementOrg_code | string | 否 | 否 | 费用核算组织编码 示例：AAA |
| expenseSupplier | long | 否 | 否 | 费用供应商id 示例：1458139326867046405 |
| expenseSupplier_code | string | 否 | 否 | 费用供应商编码 示例：0001000078 |
| expenseAfford | long | 否 | 否 | 费用承担对象id 示例：2352124539719936 |
| expenseAfford_code | string | 否 | 否 | 费用承担对象编码 示例：100120 |
| expenseAccountBill | string | 否 | 否 | 费用立账单据（0销售订单 1销售出库单） 示例：0 |
| deptId | string | 否 | 否 | 部门id 示例：2352179229348096 |
| dept_code | string | 否 | 否 | 部门编码 示例：zy001-2 |
| operator | string | 否 | 否 | 业务员id 示例：2352120424288512 |
| operator_code | string | 否 | 否 | 业务员编码 示例：0000000000000001 |
| open_vouchdate_begin | string | 否 | 否 | 开始时间，日期格式：YYYY-MM-DD 示例：2022-06-10 |
| open_vouchdate_end | string | 否 | 否 | 结束时间，日期格式：YYYY-MM-DD 示例：2022-06-22 |
| orderNo | string | 否 | 否 | 来源订单号 示例：UO-657620220617000002 |
| source | string | 否 | 否 | 来源单据类型(udinghuo.voucher_order 销售订单 ustock.st_salesout 销售出库单 quote.quote_salesquotation 销售报价单) 示例：udinghuo.voucher_order |
| upcode | string | 否 | 否 | 来源单号 示例：XSCK20220429000001 |
| isSum | boolean | 否 | 否 | 查询表头或表头+明细，true查询表头，false查询表头+明细 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"status": "0",
	"code": "QSQR202204290001",
	"orgId": "2353226125496576",
	"orgId_code": "AAA",
	"expenseItemId": 2510729413415168,
	"expenseItem_code": "000003",
	"settlementOrg": "2353226125496576",
	"settlementOrg_code": "AAA",
	"expenseSupplier": 1458139326867046405,
	"expenseSupplier_code": "0001000078",
	"expenseAfford": 2352124539719936,
	"expenseAfford_code": "100120",
	"expenseAccountBill": "0",
	"deptId": "2352179229348096",
	"dept_code": "zy001-2",
	"operator": "2352120424288512",
	"operator_code": "0000000000000001",
	"open_vouchdate_begin": "2022-06-10",
	"open_vouchdate_end": "2022-06-22",
	"orderNo": "UO-657620220617000002",
	"source": "udinghuo.voucher_order",
	"upcode": "XSCK20220429000001",
	"isSum": false,
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "pubts",
					"op": "eq",
					"value1": "0",
					"value2": "1"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：10 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 汇总 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"busitype": "1535231593364324356",
				"busitype_name": "销售费用",
				"expenseDetail_expenseItemId": 2568433328771584,
				"currency_priceDigit": 4,
				"expenseDetail_oriTax": 0,
				"expenseDetail_priceUom_name": "件",
				"expenseDetail_natTax": 0,
				"expenseDetail_source": "quote.quote_salesquotation",
				"expenseDetail_subQty": 1,
				"orgId_name": "AAA",
				"expenseDetail_taxItems": "8b99f589-bc47-4c3a-bf1c-13d78caa2060",
				"natCurrency": "2351874939032064",
				"id": 1482613364916486100,
				"create_date": "2022-06-21",
				"expenseDetail_productId_code": "000017",
				"expenseDetail_priceUom_code": "01",
				"create_time": "2022-06-21 16:08:32",
				"expenseDetail_productId": 2360418570113280,
				"isWfControlled": false,
				"deptId": "2352179229348096",
				"deptId_name": "菲菲",
				"expenseDetail_oriUnitPrice": 10000,
				"natSum": 10000,
				"expenseDetail_unit_name": "件",
				"expenseDetail_taxRate": 0,
				"expenseDetail_expenseAfford_name": "小苹果商家",
				"expenseDetail_unit": 2352410771869952,
				"natCurrency_moneyDigit": 2,
				"sourceType": "quote_salesquotation",
				"natCurrency_priceDigit": 4,
				"exchRateType": "0000KRBF48WG59AUYJ0000",
				"expenseDetail_qty": 1,
				"expenseDetail_settlementOrg_name": "AAA",
				"expenseDetail_oriTaxUnitPrice": 10000,
				"expenseDetail_isDivided": false,
				"expenseDetail_oriMoney": 10000,
				"expenseDetail_mainId": 1482613364916486100,
				"expenseDetail_invExchRate": 1,
				"expenseDetail_unitExchangeTypePrice": 0,
				"natCurrency_code": "CNY",
				"status": 0,
				"expenseDetail_natUnitPrice": 10000,
				"tenant_id": 2351873187860736,
				"currency_moneyDigit": 2,
				"expenseDetail_expenseItemId_name": "管理费",
				"code": "FYD20220621000001",
				"expenseDetail_expenseAfford": 2380606800040192,
				"expenseDetail_bTax": false,
				"expenseDetail_makeRuleCode": "quotation_expense",
				"expenseDetail_productId_name": "虚拟物料1",
				"creatorId": 1437883445064237000,
				"exchRate": 1,
				"expenseDetail_taxItems_code": "VAT FREE",
				"orgId": "2353226125496576",
				"settlementOrg": "2353226125496576",
				"vouchdate": "2022-06-21",
				"natCurrency_name": "人民币",
				"expenseDetail_priceUom": 2352410771869952,
				"expenseDetail_invPriceExchRate": 1,
				"expenseDetail_expenseAccountBill": "0",
				"currency": "2351874939032064",
				"exchRateDate": "2022-06-21",
				"pubts": "2022-06-21 16:08:32",
				"isFlowCoreBill": false,
				"exchRateType_digit": 6,
				"expenseDetail_expenseIdent": "1",
				"expenseDetail_expenseItemTypeId": "费用类别",
				"expenseDetail_expenseSupplier_name": "委外供应商",
				"expenseDetail_expenseSupplier": 1557470238131879941,
				"invoicingAgentId_name": "小苹果商家",
				"expenseDetail_sourceid": 1473142695732969500,
				"creator": "zhaozitong",
				"currency_name": "人民币",
				"oriSum": 10000,
				"expenseDetail_expenseAccountMethod": "0",
				"exchRateType_name": "基准汇率",
				"expenseDetail_unitExchangeType": 0,
				"expenseDetail_taxItems_name": "免税",
				"expenseDetail_settlementOrg": "2353226125496576",
				"expenseDetail_expenseAffordType": "0",
				"expenseDetail_lineno": 10,
				"expenseDetail_priceQty": 1,
				"upcode": "BJD20220801000006",
				"invoicingAgentId": 2380606800040192,
				"bodyItem": {
					"define1": "",
					"id": ""
				},
				"expenseDetail_natTaxUnitPrice": 10000,
				"headItem": {
					"define1": "",
					"id": ""
				},
				"expenseDetail_natMoney": 10000,
				"expenseDetail": {
					"id": 1482613364916486100,
					"oriSum": 10000
				},
				"expenseDetail_costCenter": "1519577227933515785",
				"expenseDetail_costCenter_code": "JS110",
				"expenseDetail_costCenter_name": "成本中心",
				"expenseDetail_providerProfitCenter": "1525458799087321089",
				"expenseDetail_providerProfitCenter_code": "1001",
				"expenseDetail_providerProfitCenter_name": "供方利润中心",
				"expenseDetail_consumerProfitCenter": "1529171781139038212",
				"expenseDetail_consumerProfitCenter_code": "zr001",
				"expenseDetail_consumerProfitCenter_name": "需方利润中心",
				"expenseDetail_isDividedAccount": true
			}
		],
		"sumRecordList": [
			{
				"oriSum": 10000,
				"natSum": 15000
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

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

