---
title: "销售结算列表查询"
apiId: "1691222322968002561"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Settlement"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售结算列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Settlement (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/settlement/list

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
| open_srcVouchDate_begin | string | 否 | 是 | 来源单据开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| open_srcVouchDate_end | string | 否 | 是 | 来源单据截止时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00 |
| orgId | string | 是 | 否 | 开票组织id 示例：["1676477734594281477"] |
| source | string | 否 | 否 | 来源单据类型 销售出库:st_salesout 销售订单:voucher_order 销售退货:voucher_salereturnlist 示例：voucher_order |
| unQtyIsShow | boolean | 否 | 否 | 余量为0是否显示 false 否 true 是 示例：false 默认值：false |
| upcode | string | 否 | 否 | 来源单据编号 示例：SO-20230406-000004 |
| agentId | long | 是 | 否 | 行客户id 示例：["1676881461542649863"] |
| invAgentId | long | 是 | 否 | 开票客户id 示例：["1676881461542649863"] |
| productId | long | 是 | 否 | 商品id 示例：["1676509147989803013"] |
| skuId | long | 是 | 否 | skuId 示例：["1676509156579737776"] |
| invoiceTransactionType | string | 是 | 否 | 发票交易类型 示例：["1676884476592914433"] |
| saleOrgId | string | 是 | 否 | 销售组织id 示例：["1676477734594281477"] |
| saleDeptId | string | 是 | 否 | 销售部门id 示例：["1677182564510990345"] |
| saleUserId | string | 是 | 否 | 销售业务员id 示例：["cfc60114cfcf11edae1008c0ebd50df6"] |
| creatorId | long | 是 | 否 | 创建人id 示例：[1676382145806860289] |
| calBase | object | 否 | 否 | 计算基准 示例：1 |
| projectId | string | 是 | 否 | 项目id 示例：["1676896296346583048"] |
| stockId | long | 是 | 否 | 仓库id 示例：[1664264350954160134] |
| pageSize | long | 否 | 否 | 每页数量 示例：10 默认值：20 |
| pageIndex | long | 否 | 否 | 页号 示例：1 默认值：1 |
| isSum | boolean | 否 | 否 | 查询表头 true 是 false 否 示例：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| field | string | 否 | 否 | 属性名(条件) 1：agentId.code(客户编码) 2：invAgentId.code(开票客户编码) 3:（商品编码、sku编码、销售组织编码、销售部门编码、销售业务员编码、创建人编码、项目编码）使用示例：settlementDetails.productId.code、settlementDetails.stockId.code ...4：pubts(时间戳) 示例：srcVouchDate |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于;is_null:为空;is_not_null:非空) 示例：between |
| value1 | string | 否 | 否 | 值1 示例：2021-11-17 00:00:00 |
| value2 | string | 否 | 否 | 值2 示例：2021-12-16 23:59:59 |

## 3. 请求示例

Url: /yonbip/sd/settlement/list?access_token=访问令牌
Body: {
	"open_srcVouchDate_begin": "2022-05-13 00:00:00",
	"open_srcVouchDate_end": "2022-05-13 00:00:00",
	"orgId": [
		"1676477734594281477"
	],
	"source": "voucher_order",
	"unQtyIsShow": false,
	"upcode": "SO-20230406-000004",
	"agentId": [
		"1676881461542649863"
	],
	"invAgentId": [
		"1676881461542649863"
	],
	"productId": [
		"1676509147989803013"
	],
	"skuId": [
		"1676509156579737776"
	],
	"invoiceTransactionType": [
		"1676884476592914433"
	],
	"saleOrgId": [
		"1676477734594281477"
	],
	"saleDeptId": [
		"1677182564510990345"
	],
	"saleUserId": [
		"cfc60114cfcf11edae1008c0ebd50df6"
	],
	"creatorId": [
		1676382145806860289
	],
	"calBase": "1",
	"projectId": [
		"1676896296346583048"
	],
	"stockId": [
		1664264350954160134
	],
	"pageSize": 10,
	"pageIndex": 1,
	"isSum": false,
	"simpleVOs": [
		{
			"field": "srcVouchDate",
			"op": "between",
			"value1": "2021-11-17 00:00:00",
			"value2": "2021-12-16 23:59:59"
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
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页记录数 示例：10 |
| recordCount | long | 否 | 总共记录数 示例：1 |
| recordList | object | 是 | 记录列表 |
| sumRecordList | object | 是 | 合计 |
| pageCount | long | 否 | 总共记录数 示例：1 |
| beginPageIndex | long | 否 | 页码列表的开始索引 示例：1 |
| endPageIndex | long | 否 | 页码列表的结束索引 示例：1 |

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
				"invoiceTransactionType_name": "销售发票",
				"currency_priceDigit": 2,
				"invAgentId": 1676883402867867600,
				"agentContacts": "刘德华",
				"source": "voucher_order",
				"natCurrency": "1676384430742044707",
				"invoiceTitleType": 0,
				"bdInvoiceTypeName": "增值税电子普通发票",
				"modifyInvoiceType": true,
				"invoiceType": 3,
				"id": 1696932069666979800,
				"invoiceTitle": "加气枪",
				"orgName": "lcy-all",
				"bdInvoiceTypeId": 1,
				"agentName": "自动化_内部交易客户",
				"agentRelationId": 1691931568113188900,
				"barCode": "voucher_order|1696931966587764745",
				"invoiceTransactionType": "1676384430748862619",
				"wholeDiscountRate": 100,
				"receievInvoiceMobile": "18596523322",
				"natCurrency_moneyDigit": 2,
				"natCurrency_priceDigit": 2,
				"invAgentTaxNo": "123456789032156",
				"invAgentName": "自动化_内部交易客户",
				"natCurrency_code": "CNY",
				"status": 0,
				"currency_moneyDigit": 2,
				"agentId": 1676883402867867600,
				"agentContactsTel": "18888888888",
				"creatorId": 1676382145806860300,
				"bizFlow": "995d96a3-d2af-11ed-9817-08c0ebd51afa",
				"exchRate": 1,
				"orgId": "1691867323972452355",
				"vouchdate": "2023-04-06 00:00:00",
				"natCurrency_name": "人民币",
				"bizFlow_version": "V1.0",
				"currency": "1676384430742044707",
				"exchRateDate": "2023-03-30 00:00:00",
				"pubts": "2023-04-06 10:41:34",
				"isFlowCoreBill": 0,
				"createDate": "2023-04-06 10:41:33",
				"sourceid": 1696931966587764700,
				"creator": "yonyou2023test2",
				"currency_name": "人民币",
				"discountMoney": 0,
				"retailInvestors": false,
				"receiverCustId_name": "自动化_内部交易客户",
				"exchangeRateType": {
					"name": "基准汇率"
				},
				"createTime": "2023-04-06 10:41:33",
				"upcode": "SO-20230406-000004",
				"receiverCustId": 1676883402867867600,
				"bizFlow_name": "lcy（勿动）",
				"checkByRevenueManagement": false,
				"costBillNoType": "voucher_saleinvoice",
				"calBase": "0"
			}
		],
		"sumRecordList": [
			{
				"wholeDiscountRate": 100,
				"discountMoney": 0
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

999	服务端逻辑异常	请检查传入数据的正确性


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

