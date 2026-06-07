---
title: "供应链费用单单个详情查询"
apiId: "1481891011559424006"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Supply Chain Expense Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Chain Expense Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应链费用单单个详情查询

> `ContentType` 请求方式	GET | 分类: Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/scmmp/expense/detail

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 供应链费用单单据编码（编码和id二选一必填，同时填入时以id为准）    示例: QSQR202204290001 |
| id | string | query | 否 | 供应链费用单单据id（编码和id二选一必填，同时填入时以id为准）    示例: 1904806103110400 |

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/detail?access_token=访问令牌&code=QSQR202204290001&id=1904806103110400

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
| defines | object | 否 | 表头自由自定义项 |
| headItem | object | 否 | 表头自定义项 |
| currency_priceDigit | BigDecimal | 否 | 原币单价精度 示例：4 |
| masterOrgKeyField | string | 否 | 主组织字段编码 示例：orgId |
| operator_name | string | 否 | 业务员名称 示例：员工业务员98528542 |
| operator | string | 否 | 业务员id 示例：2578617669423616 |
| modifier | string | 否 | 修改人 示例：wangwenfeng |
| modifierId | long | 否 | 修改人id 示例：2510689921126656 |
| orgId_name | string | 否 | 费用发生组织 示例：AAA |
| natCurrency | string | 否 | 本币id 示例：2351874939032064 |
| id | long | 否 | 供应链费用单主表id 示例：1477567190661595100 |
| isWfControlled | boolean | 否 | 是否审批流控制（true 审批流控制 ,false 非审批流控制） 示例：false |
| deptId | string | 否 | 部门id 示例：2352179229348096 |
| deptId_name | string | 否 | 部门 示例：菲菲 |
| auditorId | long | 否 | 审批人id 示例：2510689921126656 |
| natCurrency_moneyDigit | BigDecimal | 否 | 本币金额精度 示例：2 |
| sourceType | string | 否 | 来源单据类型(udinghuo.voucher_order 销售订单 ustock.st_salesout 销售出库单 quote.quote_salesquotation 销售报价单) 示例：quote_salesquotation |
| auditTime | string | 否 | 审批时间 示例：2022-06-15 13:33:36 |
| natCurrency_priceDigit | BigDecimal | 否 | 本币单价精度 示例：4 |
| exchRateType | string | 否 | 汇率类型id 示例：0000KRBF48WG59AUYJ0000 |
| settlementOrg_name | string | 否 | 费用核算组织 示例：AAA |
| natCurrency_code | string | 否 | 本币简称 示例：CNY |
| status | long | 否 | 单据状态(0开立，3审批中，1，已审核) 示例：1 |
| tenant_id | long | 否 | 租户id 示例：2351873187860736 |
| verifystate | long | 否 | 审核状态(0：开立，1：审核中，2：已审核) 示例：2 |
| currency_moneyDigit | BigDecimal | 否 | 原币金额精度 示例：2 |
| code | string | 否 | 费用单编号 示例：FYD20220623000001 |
| modify_time | string | 否 | 修改时间 示例：2022-06-15 13:20:17 |
| creatorId | long | 否 | 创建人id 示例：2510689921126656 |
| exchRate | BigDecimal | 否 | 汇率 示例：1 |
| orgId | string | 否 | 费用发生组织id 示例：2353226125496576 |
| settlementOrg | string | 否 | 费用核算组织id 示例：2353226125496576 |
| vouchdate | string | 否 | 单据日期 示例：2022-06-23 |
| postAccountStatus | long | 否 | 过账状态(-1过账失败 99未过账 0不过账 1过账中 2过账成功) 示例：1 |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| postAccountVersion | long | 否 | 过账版本 示例：3 |
| exchRateDate | string | 否 | 汇率日期 示例：2022-06-14 |
| currency | string | 否 | 币种pk 示例：2351874939032064 |
| pubts | string | 否 | 时间戳 示例：2022-06-15 13:33:38 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据(true 核心单据 false 非核心单据) 示例：false |
| exchRateType_digit | BigDecimal | 否 | 汇率类型精度 示例：6 |
| invoicingAgentId_name | string | 否 | 开票客户 示例：小苹果商家 |
| auditDate | string | 否 | 审批日期 示例：2022-06-20 |
| sourceid | long | 否 | 来源单据主表id 示例：1473142695732969500 |
| creator | string | 否 | 创建人 示例：wangwenfeng |
| currency_name | string | 否 | 币种 示例：人民币 |
| oriSum | BigDecimal | 否 | 费用含税金额 示例：122 |
| exchRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| auditor | string | 否 | 审批人 示例：wangwenfeng |
| transTypeKeyField | string | 否 | 交易类型字段编码 示例：busitype |
| createTime | string | 否 | 创建时间 示例：2022-06-14 20:57:41 |
| upcode | string | 否 | 来源单据号 示例：BJD20220801000006 |
| invoicingAgentId | long | 否 | 开票客户id 示例：2380606800040192 |
| expenseDetail | object | 是 | 费用明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"defines": {
			"define1": "22",
			"id": 1477567190661595100
		},
		"headItem": {
			"id": 1442569451948998700,
			"define1": "22"
		},
		"currency_priceDigit": 4,
		"masterOrgKeyField": "orgId",
		"operator_name": "员工业务员98528542",
		"operator": "2578617669423616",
		"modifier": "wangwenfeng",
		"modifierId": 2510689921126656,
		"orgId_name": "AAA",
		"natCurrency": "2351874939032064",
		"id": 1477567190661595100,
		"isWfControlled": false,
		"deptId": "2352179229348096",
		"deptId_name": "菲菲",
		"auditorId": 2510689921126656,
		"natCurrency_moneyDigit": 2,
		"sourceType": "quote_salesquotation",
		"auditTime": "2022-06-15 13:33:36",
		"natCurrency_priceDigit": 4,
		"exchRateType": "0000KRBF48WG59AUYJ0000",
		"settlementOrg_name": "AAA",
		"natCurrency_code": "CNY",
		"status": 1,
		"tenant_id": 2351873187860736,
		"verifystate": 2,
		"currency_moneyDigit": 2,
		"code": "FYD20220623000001",
		"modify_time": "2022-06-15 13:20:17",
		"creatorId": 2510689921126656,
		"exchRate": 1,
		"orgId": "2353226125496576",
		"settlementOrg": "2353226125496576",
		"vouchdate": "2022-06-23",
		"postAccountStatus": 1,
		"natCurrency_name": "人民币",
		"postAccountVersion": 3,
		"exchRateDate": "2022-06-14",
		"currency": "2351874939032064",
		"pubts": "2022-06-15 13:33:38",
		"isFlowCoreBill": false,
		"exchRateType_digit": 6,
		"invoicingAgentId_name": "小苹果商家",
		"auditDate": "2022-06-20",
		"sourceid": 1473142695732969500,
		"creator": "wangwenfeng",
		"currency_name": "人民币",
		"oriSum": 122,
		"exchRateType_name": "基准汇率",
		"auditor": "wangwenfeng",
		"transTypeKeyField": "busitype",
		"createTime": "2022-06-14 20:57:41",
		"upcode": "BJD20220801000006",
		"invoicingAgentId": 2380606800040192,
		"expenseDetail": [
			{
				"expenseSupplier": 2380606800040111,
				"expenseSupplier_name": "供应商",
				"dividSource": true,
				"expenseItemId": 2568433328771584,
				"oriTax": 0,
				"priceUom_name": "件",
				"natTax": 0,
				"source": "quote.quote_salesquotation",
				"expenseAccountBill": "0",
				"subQty": 1,
				"taxItems": "2351874942177792",
				"id": 1477567190661595100,
				"productId_code": "000017",
				"priceUom_code": "01",
				"productId": 2360418570113280,
				"oriUnitPrice": 1,
				"natSum": 1,
				"unit_name": "件",
				"taxRate": 0,
				"expenseAfford_name": "小苹果商家",
				"unit": 2352410771869952,
				"qty": 1,
				"settlementOrg_name": "AAA",
				"oriTaxUnitPrice": 1,
				"isDivided": true,
				"oriMoney": 1,
				"mainId": 1477567190661595100,
				"invExchRate": 1,
				"unitExchangeTypePrice": 0,
				"natUnitPrice": 1,
				"expenseItemId_name": "管理费",
				"expenseAfford": 2380606800040192,
				"bTax": false,
				"makeRuleCode": "quotation_expense",
				"productId_name": "虚拟物料1",
				"taxItems_code": "NO VAT",
				"settlementOrg": "2353226125496576",
				"priceUom": 2352410771869952,
				"invPriceExchRate": 1,
				"pubts": "2022-06-15 13:20:18",
				"expenseIdent": "1",
				"expenseItemTypeId": "1473142695732969110",
				"sourceid": 1473142695732969500,
				"unit_precision": 5,
				"oriSum": 1,
				"expenseAccountMethod": "0",
				"unitExchangeType": 0,
				"taxItems_name": "不征税",
				"expenseAffordType": "0",
				"lineno": 10,
				"priceQty": 1,
				"upcode": "BJD20220801000006",
				"natTaxUnitPrice": 1,
				"natMoney": 1,
				"bodyItem": {
					"define5": "1",
					"id": 1477567190661595100
				},
				"costCenter": 1477567190661594422,
				"costCenter_code": "JS110",
				"costCenter_name": "成本中心",
				"providerProfitCenter": "1477567190661595533",
				"providerProfitCenter_code": "1001",
				"providerProfitCenter_name": "供方利润中心",
				"consumerProfitCenter": "1477567190661596611",
				"consumerProfitCenter_code": "zr001",
				"consumerProfitCenter_name": "需方利润中心",
				"isDividedAccount": true,
				"invExchRateDen": 1,
				"invExchRateNum": 1,
				"invPriceExchRateDen": 1,
				"invPriceExchRateNum": 1
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务器逻辑错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-11

更新

请求说明

新增

返回参数 (4)

更新

返回参数 (9)

补充换算率分子分母


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

