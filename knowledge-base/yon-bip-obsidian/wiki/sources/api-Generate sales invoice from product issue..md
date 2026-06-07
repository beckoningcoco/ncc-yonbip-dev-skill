---
title: "销售出库推销售发票生单"
apiId: "7b20186f51524535b5b4d20245507b1d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Invoice"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售出库推销售发票生单

> `ContentType	application/json` 请求方式	POST | 分类: Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersaleinvoice/saveForSalesOut

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售发票[voucher.invoice.SaleInvoice] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| invoiceSrcSystem | long | 否 | 否 | 来源系统, 1:销售、2:U订货门户、3:其他外部系统、 示例：2 |
| erpSystem | long | 否 | 否 | 外部系统, 1:NC、2:U8、3:U9、4:U8cloud、 示例：4 |
| transactionTypeId | string | 否 | 是 | 交易类型ID 示例：1248018423173393 |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：TI4816210603000003 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-06-03 00:00:00 |
| invoiceAsynTaxMark | boolean | 否 | 是 | 已同步待开票明细，默认为false 示例：false |
| isNotSendTax | boolean | 否 | 是 | 是否与税务集成，为true的时候，后面的开票明细相关字段才以传入的数据为准，为false的时候，开票明细相关字段为空 示例：true |
| blueEinvoiceNo | string | 否 | 否 | 蓝字税票代码 示例：11111 |
| einvoiceNo | string | 否 | 否 | 税票代码 示例：1111 |
| einvoiceHm | string | 否 | 否 | 税票号码 示例：1111 |
| modifyInvoiceType | boolean | 否 | 是 | 发票类型是否可改，为true的时候，后面发票设置相关的字段以传入的数据为准，为false的时候，以上游单据带过来的信息为准 示例：false |
| invoiceType | short | 否 | 否 | 发票类型, 0:收据,1:增值税专用发票,2:增值税普通发票,3:增值税电子普通发票,4:机动车销售销售统一发票,5：增值税电子普通发票(成品油),6：增值税普通发票(成品油),7：增值税专用发票(成品油),8：电子收购发票,9：增值税电子专用发票,10：电子发票（增值税专用发票）,11:电子发票（普通发票）,12:数电纸质发票（增值税专用发票）,13:数电纸质发票（普通发票） 示例：0 |
| invoiceTitleType | short | 否 | 否 | 发票抬头类型, 0:企业、1:个人、2:非营利组织、 示例：0 |
| invoiceTitle | string | 否 | 否 | 发票抬头 发票类型是收据时非必填，其他类型必填 示例：2 |
| invAgentId | long | 否 | 否 | 开票客户 示例：2282507926999296 |
| invAgentName | string | 否 | 否 | 开票客户名称 示例：lcy客户0531 |
| invAgentTaxNo | string | 否 | 否 | 纳税人识别号 发票类型是收据时非必填，其他类型必填 示例：123456789012345 |
| invAgentAdress | string | 否 | 否 | 开票客户纳税人地址 发票类型是增值税专用发票必填，其他类型非必填 示例：1111 |
| invAgentTel | string | 否 | 否 | 开票客户纳税人电话 发票类型是增值税专用发票必填，其他类型非必填 示例：1111 |
| invAgentBank | string | 否 | 否 | 开票客户纳税人开户银行 发票类型是增值税专用发票必填，其他类型非必填 示例：中国工商银行 |
| invAgentSubBank | string | 否 | 否 | 开票客户纳税人开户支行 发票类型是增值税专用发票必填，其他类型非必填 示例：中国工商银行股份有限公司濮阳兴工支行 |
| invAgentBankNo | string | 否 | 否 | 开票客户纳税人开户银行账号 发票类型是增值税专用发票必填，其他类型非必填 示例：11111 |
| memo | string | 否 | 否 | 备注 示例：销售发票备注 |
| headItem | object | 否 | 否 | 表头自定义项(1-60) |
| headFreeItem | object | 否 | 否 | 表头自由自定义项(1-60) |
| saleInvoiceDetails | object | 是 | 是 | 销售发票子表 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/sd/vouchersaleinvoice/saveForSalesOut?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"invoiceSrcSystem": 2,
		"erpSystem": 4,
		"transactionTypeId": "1248018423173393",
		"code": "TI4816210603000003",
		"vouchdate": "2021-06-03 00:00:00",
		"invoiceAsynTaxMark": false,
		"isNotSendTax": true,
		"blueEinvoiceNo": "11111",
		"einvoiceNo": "1111",
		"einvoiceHm": "1111",
		"modifyInvoiceType": false,
		"invoiceType": 0,
		"invoiceTitleType": 0,
		"invoiceTitle": "2",
		"invAgentId": 2282507926999296,
		"invAgentName": "lcy客户0531",
		"invAgentTaxNo": "123456789012345",
		"invAgentAdress": "1111",
		"invAgentTel": "1111",
		"invAgentBank": "中国工商银行",
		"invAgentSubBank": "中国工商银行股份有限公司濮阳兴工支行",
		"invAgentBankNo": "11111",
		"memo": "销售发票备注",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"headFreeItem": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"saleInvoiceDetails": [
			{
				"makeRuleCode": "salesout_saleinvoicelist",
				"taxRate": 1,
				"qty": 6,
				"oriTaxUnitPrice": 22,
				"sourceid": 2274590767485440,
				"sourceautoid": 2274590767501825,
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"bodyFreeItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| orgId | string | 否 | 开票组织 |
| id | string | 否 | 主体ID |
| invoiceSrcSystem | string | 否 | 来源系统, 1:销售、2:U订货门户、3:其他外部系统、 |
| erpSystem | string | 否 | 外部系统, 1:NC、2:U8、3:U9、4:U8cloud、 |
| transactionTypeId | string | 否 | 交易类型 |
| blueInvId | string | 否 | 蓝字发票ID |
| settlementId | string | 否 | 结算方式 |
| settlementId_name | string | 否 | 结算方式名称 |
| agentId | string | 否 | 客户 |
| orgName | string | 否 | 开票组织 |
| invAgentId | string | 否 | 开票客户 |
| billStationId | string | 否 | 开票点ID |
| code | string | 否 | 单据编号 |
| saleUserId | string | 否 | 销售业务员 |
| saleUserName | string | 否 | 销售业务员 |
| currency | string | 否 | 原币pk |
| currency_priceDigit | string | 否 | 原币价格精度 |
| currency_moneyDigit | string | 否 | 原币金额精度 |
| natCurrency | string | 否 | 本币 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| submmitAccountDate | string | 否 | 立账日 |
| maturityDate | string | 否 | 到期日 |
| pubts | string | 否 | 时间戳 |
| isWfControlled | string | 否 | 是否受审批流控制 |
| verifystate | string | 否 | 审批流状态 |
| headItem | object | 否 | 表头自定义项 |
| vouchdate | string | 否 | 单据日期 |
| auditDate | string | 否 | 审批日期 |
| source | string | 否 | 来源单据 |
| agentName | string | 否 | 客户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| retailAgentName | string | 否 | 散户名称 |
| invAgentName | string | 否 | 开票客户名称 |
| agentContacts | string | 否 | 客户联系人 |
| agentContactsTel | string | 否 | 联系电话 |
| invDirection | string | 否 | 单据方向, 1:红票、2:蓝票、 |
| blueInvNo | string | 否 | 蓝字发票号 |
| isIssueRedInvoice | string | 否 | 已开红票, true:是、false:否、 |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税普通发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票 |
| invoiceType | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税普通发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票 |
| invoiceTitle | string | 否 | 发票抬头 |
| invoiceTitleType | string | 否 | 发票抬头类型, 0:企业、1:个人、2:非营利组织、 |
| modifyInvoiceType | string | 否 | 发票类型可改 |
| invAgentTaxNo | string | 否 | 纳税人识别号 |
| invAgentAdress | string | 否 | 营业地址 |
| invAgentTel | string | 否 | 营业电话 |
| invAgentBank | string | 否 | 开户银行 |
| invAgentSubBank | string | 否 | 开户支行 |
| invAgentBankNo | string | 否 | 银行账号 |
| currency_code | string | 否 | 原币简称 |
| currency_name | string | 否 | 币种名称 |
| exchangeRateType | object | 否 | 汇率类型Id |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 |
| natCurrency_code | string | 否 | 本币简称 |
| natCurrency_name | string | 否 | 本币名称名称 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 无税金额 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 税额 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 |
| billStationName | string | 否 | 开票点 |
| billStationCode | string | 否 | 开票点编码 |
| einvoiceDownUrl | string | 否 | 税票下载地址 |
| einvoiceHm | string | 否 | 税票号码 |
| einvoiceNo | string | 否 | 税票代码 |
| einvoiceRequestNo | string | 否 | 税票请求流水号 |
| einvoiceFailMemo | string | 否 | 开票失败原因 |
| blueEinvoiceHm | string | 否 | 蓝字税票号码 |
| blueEinvoiceNo | string | 否 | 蓝字税票代码 |
| bizFlow_name | string | 否 | 流程名称名称 |
| bizFlow_version | string | 否 | 版本信息 |
| status | string | 否 | 单据状态, 0:开立、3:审核中、1:已审核、2:已关闭、 |
| businessState | string | 否 | 发票业务状态, 0:开票中、1:未开税票、2:已开税票、3:已作废、4:已红冲、5:作废中、6:红冲中、7:开票失败、 |
| creator | string | 否 | 制单人 |
| createTime | string | 否 | 制单时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 审核人 |
| auditTime | string | 否 | 审批时间 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| bizFlow | string | 否 | 流程ID |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| voucher_saleinvoicedetails | object | 是 | 销售发票子表[voucher.invoice.SaleInvoiceDetail] |
| count | int | 否 | 总条数，执行保存动作的总条数 |
| failCount | string | 否 | 失败条数，执行保存动作失败的条数 |
| sucessCount | string | 否 | 成功条数，执行保存动作成功的条数 |
| messages | object | 是 | 返回消息 |
| infos | object | 是 | 数据体 |
| successCountAI | int | 否 | 成功条数，执行保存动作成功的条数 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"orgId": "",
		"id": "",
		"invoiceSrcSystem": "",
		"erpSystem": "",
		"transactionTypeId": "",
		"blueInvId": "",
		"settlementId": "",
		"settlementId_name": "",
		"agentId": "",
		"orgName": "",
		"invAgentId": "",
		"billStationId": "",
		"code": "",
		"saleUserId": "",
		"saleUserName": "",
		"currency": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"natCurrency": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"transactionTypeId_name": "",
		"submmitAccountDate": "",
		"maturityDate": "",
		"pubts": "",
		"isWfControlled": "",
		"verifystate": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define60": ""
		},
		"vouchdate": "",
		"auditDate": "",
		"source": "",
		"agentName": "",
		"retailInvestors": "",
		"retailAgentName": "",
		"invAgentName": "",
		"agentContacts": "",
		"agentContactsTel": "",
		"invDirection": "",
		"blueInvNo": "",
		"isIssueRedInvoice": "",
		"bdInvoiceTypeId": "",
		"invoiceType": "",
		"invoiceTitle": "",
		"invoiceTitleType": "",
		"modifyInvoiceType": "",
		"invAgentTaxNo": "",
		"invAgentAdress": "",
		"invAgentTel": "",
		"invAgentBank": "",
		"invAgentSubBank": "",
		"invAgentBankNo": "",
		"currency_code": "",
		"currency_name": "",
		"exchangeRateType": {
			"name": ""
		},
		"exchRate": 0,
		"natCurrency_code": "",
		"natCurrency_name": "",
		"oriSum": 0,
		"oriMoney": 0,
		"oriTax": 0,
		"natSum": 0,
		"natMoney": 0,
		"natTax": 0,
		"billStationName": "",
		"billStationCode": "",
		"einvoiceDownUrl": "",
		"einvoiceHm": "",
		"einvoiceNo": "",
		"einvoiceRequestNo": "",
		"einvoiceFailMemo": "",
		"blueEinvoiceHm": "",
		"blueEinvoiceNo": "",
		"bizFlow_name": "",
		"bizFlow_version": "",
		"status": "",
		"businessState": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"bizFlow": "",
		"isFlowCoreBill": "",
		"voucher_saleinvoicedetails": [
			{
				"id": "",
				"columnNo": "",
				"mainid": "",
				"saleOrgId": "",
				"srcVoucherColumnNo": "",
				"srcVoucherChildColumnNo": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"makeRuleCode": "",
				"productId": "",
				"skuId": "",
				"skuCode": "",
				"skuName": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"cusProductCode": "",
				"cusProductName": "",
				"cusProductVersion": "",
				"cusSkuCode": "",
				"projectId": "",
				"unitId": "",
				"unit_Precision": "",
				"chargeUnitId": "",
				"priceUOM_Precision": "",
				"subQty": 0,
				"invExchRate": 0,
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"taxId": "",
				"taxStartDate": "",
				"taxEndDate": "",
				"saleDeptId": "",
				"saleUserId": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define60": ""
				},
				"invoiceSource": "",
				"saleOrgId_name": "",
				"srcVoucherNo": "",
				"productCode": "",
				"productName": "",
				"modelDescription": "",
				"model": "",
				"speciDes": "",
				"invProductType": "",
				"chargeUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"unitName": "",
				"qty": 0,
				"batchNo": "",
				"projectCode": "",
				"projectName": "",
				"oriTaxUnitPrice": 0,
				"oriUnitPrice": 0,
				"oriSum": 0,
				"oriMoney": 0,
				"taxItems": "",
				"taxCode": "",
				"taxRate": "",
				"oriTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0,
				"accOrigReceiveMoney": 0,
				"natAccReceiveMoney": 0,
				"saleDeptName": "",
				"saleUserName": "",
				"memo": "",
				"stockOrgId": 0,
				"checkByRevenueManagement": true,
				"calBase": {},
				"priceDate": "",
				"noTaxSalePrice": 0,
				"noTaxSaleCost": 0,
				"carryOverOfCostMethod": "",
				"sourcesys": ""
			}
		],
		"count": 0,
		"failCount": "",
		"sucessCount": "",
		"messages": [
			{}
		],
		"infos": [
			{}
		]
	},
	"successCountAI": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

更新

请求参数 qty

2	2025-08-20

新增

返回参数 carryOverOfCostMethod

新增

返回参数 sourcesys

更新

返回参数 (5)

NBJY-33521-【日常环境】【发出商品】销售发票单个保存和出库推发票接口没有增加结转成本和出库来源系统字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

