---
title: "销售合同批量弃审"
apiId: "56b5f484c1d14adab0c00e45a9b0ccfb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同批量弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/sact/batchunaudit

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
| billnum | string | 否 | 否 | 单据编码 示例：sact_salescontract |
| data | object | 是 | 是 | 请求时发送的数据 |
| id | long | 否 | 是 | 单据id 示例：2088849684795648 |
| contractStatus | long | 否 | 否 | 合同状态 示例：1 |

## 3. 请求示例

Url: /yonbip/sd/sact/batchunaudit?access_token=访问令牌
Body: {
	"billnum": "sact_salescontract",
	"data": [
		{
			"id": 2088849684795648,
			"contractStatus": 1
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
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用失败时的错误信息 |
| pubts | string | 否 | 时间戳 示例：2021-02-27 11:29:52 |
| reviselastid | string | 否 | 变更单最新版本 |
| salesOrgId | string | 否 | 销售组织id 示例：2055120235139328 |
| salesOrgId_name | string | 否 | 销售组织 示例：lcy销售 |
| transactionTypeId | string | 否 | 合同类型id 示例：SCT-002 |
| transactionTypeId_name | string | 否 | 合同类型 示例：数量合同 |
| contractCtrlType | long | 否 | 合同控制类型 示例：2 |
| name | string | 否 | 合同名称 示例：报表 |
| code | string | 否 | 合同编号 示例：SACT20210115000165 |
| contractStatus | long | 否 | 合同状态 示例：0 |
| status | long | 否 | 单据状态 示例：0 |
| changestatus | long | 否 | 变更状态 示例：0 |
| vouchdate | string | 否 | 合同日期 示例：2021-01-15 00:00:00 |
| agentId | long | 否 | 客户id 示例：2055132747862272 |
| agentId_name | string | 否 | 客户 示例：lcy客户1112 |
| receiveContacter | string | 否 | 客户联系人 示例：刘德华 |
| receiveContacterPhone | string | 否 | 客户联系电话 示例：17866552356 |
| bussinessTelephone | string | 否 | 营业电话 示例：43244444423 |
| bussinessAddress | string | 否 | 营业地址 示例：萨德飒 |
| deliAddr | long | 否 | 交货地点id 示例：2055132747878656 |
| deliAddr_address | string | 否 | 交货地点 |
| invoiceAgentId | long | 否 | 开票客户id 示例：2055132747862272 |
| invoiceAgentId_name | string | 否 | 开票客户 示例：lcy客户1112 |
| currency | string | 否 | 原币 示例：2008104349012224 |
| currency_priceDigit | string | 否 | 原币单价精度 示例：2 |
| currency_moneyDigit | string | 否 | 原币金额精度 示例：2 |
| currency_priceRount | string | 否 | 原币单价舍入方式 示例：4 |
| currency_moneyRount | string | 否 | 原币金额舍入方式 示例：4 |
| currency_code | string | 否 | 原币简称 示例：god |
| currency_name | string | 否 | 币种 示例： 金币 |
| natCurrency | string | 否 | 本币 示例：2019525047636480 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：2 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：2 |
| natCurrency_priceRount | string | 否 | 本币单价舍入方式 示例：4 |
| natCurrency_moneyRount | string | 否 | 本币金额舍入方式 示例：4 |
| natCurrency_code | string | 否 | 本币简称 示例：水睡会 |
| natCurrency_name | string | 否 | 本币 示例：税币 |
| exchangeRateType | string | 否 | 汇率类型Id 示例：a2ag7si9 |
| exchangeRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| exchangeRateType_digit | string | 否 | 汇率精度 示例：6 |
| exchRate | long | 否 | 汇率 示例：5 |
| planEffectiveDate | string | 否 | 计划生效日期 示例：2021-01-15 00:00:00 |
| saleDepartmentId_name | string | 否 | 销售部门 |
| salesmanId_name | string | 否 | 销售业务员 |
| agreement_name | string | 否 | 收款协议 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| verifystate | long | 否 | 审批状态 示例：0 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据 示例：false |
| totalPriceTax | long | 否 | 合计含税金额 示例：0 |
| payMoneyOrigTaxfree | long | 否 | 合计无税金额 示例：0 |
| totalTax | long | 否 | 合计税额 示例：0 |
| totalOriReceipts | long | 否 | 累计已收款金额 示例：0 |
| creatorId | long | 否 | 制单人ID 示例：2019316048072960 |
| creatorId_name | string | 否 | 制单人 示例：刘依铠 |
| createTime | string | 否 | 制单时间 示例：2021-01-15 14:47:47 |
| auditorId | string | 否 | 审核人id |
| auditorId_name | string | 否 | 审核人 示例：刘依铠 |
| auditTime | string | 否 | 审核时间 |
| childs | object | 是 | 合同标的 |
| orderExecutes | string | 是 | 订单执行情况 |
| _status | string | 否 | 单据状态 |
| tenant | long | 否 | 租户id 示例：1998021102424320 |
| auditor | string | 否 | 审核人 |
| auditDate | string | 否 | 审核日期 |
| createDate | string | 否 | 制单日期 示例：2021-01-15 00:00:00 |
| creator | string | 否 | 制单人 示例：刘依铠 |
| frees | string | 是 | 销售合同自由自定义项 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pubts": "2021-02-27 11:29:52",
		"reviselastid": "",
		"salesOrgId": "2055120235139328",
		"salesOrgId_name": "lcy销售",
		"transactionTypeId": "SCT-002",
		"transactionTypeId_name": "数量合同",
		"contractCtrlType": 2,
		"name": "报表",
		"code": "SACT20210115000165",
		"contractStatus": 0,
		"status": 0,
		"changestatus": 0,
		"vouchdate": "2021-01-15 00:00:00",
		"agentId": 2055132747862272,
		"agentId_name": "lcy客户1112",
		"receiveContacter": "刘德华",
		"receiveContacterPhone": "17866552356",
		"bussinessTelephone": "43244444423",
		"bussinessAddress": "萨德飒",
		"deliAddr": 2055132747878656,
		"deliAddr_address": "",
		"invoiceAgentId": 2055132747862272,
		"invoiceAgentId_name": "lcy客户1112",
		"currency": "2008104349012224",
		"currency_priceDigit": "2",
		"currency_moneyDigit": "2",
		"currency_priceRount": "4",
		"currency_moneyRount": "4",
		"currency_code": "god",
		"currency_name": " 金币",
		"natCurrency": "2019525047636480",
		"natCurrency_priceDigit": "2",
		"natCurrency_moneyDigit": "2",
		"natCurrency_priceRount": "4",
		"natCurrency_moneyRount": "4",
		"natCurrency_code": "水睡会",
		"natCurrency_name": "税币",
		"exchangeRateType": "a2ag7si9",
		"exchangeRateType_name": "基准汇率",
		"exchangeRateType_digit": "6",
		"exchRate": 5,
		"planEffectiveDate": "2021-01-15 00:00:00",
		"saleDepartmentId_name": "",
		"salesmanId_name": "",
		"agreement_name": "",
		"isWfControlled": false,
		"verifystate": 0,
		"isFlowCoreBill": false,
		"totalPriceTax": 0,
		"payMoneyOrigTaxfree": 0,
		"totalTax": 0,
		"totalOriReceipts": 0,
		"creatorId": 2019316048072960,
		"creatorId_name": "刘依铠",
		"createTime": "2021-01-15 14:47:47",
		"auditorId": "",
		"auditorId_name": "刘依铠",
		"auditTime": "",
		"childs": [
			{
				"skuId_code": "000201",
				"masterUnitId_precision": "5",
				"productId_name": "单位测试",
				"taxcCodeId": "8b99f589-bc47-4c3a-bfqw-13d78dda20b0",
				"subQty": 1,
				"masterUnitId_name": "个",
				"cqtUnitId_name": "个",
				"invPriceExchRate": 1,
				"cqtUnitExchangeType": 0,
				"saleunitId_precision": "2",
				"finOrgId_name": "lcy销售",
				"id": 2088849684812032,
				"skuId": 2085782522777856,
				"cqtUnitId": 1999766451556608,
				"saleunitId": 2019551021060352,
				"productId_code": "000201",
				"rowno": 10,
				"cqtUnitId_precision": "5",
				"productId": 2085782515634432,
				"sactVId": 2088849684795648,
				"skuId_name": "单位测试",
				"saleUnitExchangeType": 0,
				"taxRate": 6,
				"masterUnitId": 1999766451556608,
				"priceQty": 10,
				"qty": 10,
				"saleunitId_name": "箱",
				"invExchRate": 10,
				"finOrgId": "2055120235139328",
				"tenant": 1998021102424320
			}
		],
		"orderExecutes": [
			""
		],
		"_status": "",
		"tenant": 1998021102424320,
		"auditor": "",
		"auditDate": "",
		"createDate": "2021-01-15 00:00:00",
		"creator": "刘依铠",
		"frees": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

