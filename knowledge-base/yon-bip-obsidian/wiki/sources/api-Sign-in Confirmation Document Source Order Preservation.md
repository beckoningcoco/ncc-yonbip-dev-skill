---
title: "签收确认单个来源生单保存"
apiId: "3394371be9814819af539d32661d10e1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sign-in Confirmation Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sign-in Confirmation Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 签收确认单个来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Sign-in Confirmation Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/signconfirmation/mergeSourceData/save

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
| data | object | 否 | 是 | 签收确认单 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2020-11-30 |
| receiveId | string | 否 | 否 | 客户签收人id(参照客户档案地址子集，客户档案详情查询接口取地址数据上的地址信息id) 示例：2713202602414592 |
| cReceiveMobile | string | 否 | 否 | 客户签收人手机 示例：13666666666 |
| contactid | string | 否 | 否 | 客户联系人id(参照客户档案联系人信息子集，客户档案详情查询接口取联系人信息数据上的id) 示例：2713202602414593 |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：VO-20220430001 |
| bustype | string | 否 | 否 | 交易类型id或编码 示例:A30001 示例：2592843724003328 |
| details | object | 是 | 是 | 签收确认子表 |

## 3. 请求示例

Url: /yonbip/scm/signconfirmation/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"vouchdate": "2020-11-30",
		"receiveId": "2713202602414592",
		"cReceiveMobile": "13666666666",
		"contactid": "2713202602414593",
		"code": "VO-20220430001",
		"bustype": "2592843724003328",
		"details": [
			{
				"sourceid": 2714254070420224,
				"sourceautoid": 2714254070420225,
				"receivedQty": 11,
				"varianceQty": "0",
				"makeRuleCode": "saleOutToSignconfirmation:销售出库",
				"sourceType": "销售订单",
				"signConfirmationsDetail": [
					{
						"description": "",
						"cause": "",
						"varianceQty": "",
						"varianceResponsibility": "oneselfBear",
						"varianceType": "resaleThird",
						"varianceResCust": "",
						"nextBustype": "",
						"_status": ""
					}
				]
			}
		]
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 是 | 单据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| returncount | int | 否 | 退回次数 示例：0 |
| verifystate | int | 否 | 审批状态 示例：0 |
| currency_moneyDigit | string | 否 | 币种金额精度 示例：2 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：4 |
| code | string | 否 | 单据编号 示例：QSQR202202280285 |
| invoiceOrg | string | 否 | 开票组织ID 示例：2353226125496576 |
| bustype_name | string | 否 | 交易类型 示例：销售签收确认 |
| creatorId | long | 否 | 创建人 示例：2659650847723776 |
| exchRate | int | 否 | 汇率 示例：1 |
| salesOrg | string | 否 | 销售组织 示例：2353226125496576 |
| invoiceOrg_name | string | 否 | 开票组织 示例：AAA |
| vouchdate | string | 否 | 单据日期 示例：2022-02-28 00:00:00 |
| natCurrency | string | 否 | 本币id 示例：2351874939032064 |
| currencyName | string | 否 | 币种 示例：人民币 |
| cust_name | string | 否 | 客户 示例：商家01 |
| currency | string | 否 | 币种id 示例：2351874939032064 |
| details | object | 是 | 签收确认单子表 |
| id | long | 否 | ID 示例：2667543520416000 |
| headItem!define15 | string | 否 | 表头自定义项15 示例：111 |
| org_name | string | 否 | 库存组织 示例：AAA |
| pubts | string | 否 | 时间戳 示例：2022-02-28 10:05:36 |
| natCurrencyName | string | 否 | 本币 示例：人民币 |
| tenant | long | 否 | 租户 示例：2351873187860736 |
| headItem!define10 | string | 否 | 表头自定义项10 示例：11 |
| salesOrg_name | string | 否 | 销售组织 示例：AAA |
| creator | string | 否 | 创建人 示例：lyz |
| org | string | 否 | 库存组织 示例：2353226125496576 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| exchRateType_name | string | 否 | 汇率类型 示例：基准汇率 |
| headItem!id | long | 否 | 表头自定义项id 示例：2667543520416000 |
| warehouse | long | 否 | 仓库 示例：2411923631034624 |
| bustype | string | 否 | 交易类型 示例：2592843724003328 |
| warehouse_name | string | 否 | 仓库 示例：A仓库 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：2 |
| createTime | string | 否 | 创建时间 示例：2022-02-28 10:05:35 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：4 |
| exchRateType | string | 否 | 汇率类型id 示例：0000KRBF48WG59AUYJ0000 |
| cust | long | 否 | 客户 示例：2353231358169344 |
| status | int | 否 | 单据状态 示例：0 |
| noPostReasonMsg | string | 否 | 不过账原因信息 示例：过账未知 |
| postAccountStatus | number |
| 小数位数:0,最大长度:6 | 否 | 过账状态 0 不过账 1 过账中 2 过账成功 3 过账失败 99 未过账 示例：99 |
| postAccountVersion | number |
| 小数位数:0,最大长度:20 | 否 | 过账版本 示例：1 |
| exchRateDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 汇率日期 示例：2024-04-04 12:12:12 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"returncount": 0,
			"verifystate": 0,
			"currency_moneyDigit": "2",
			"currency_priceDigit": "4",
			"code": "QSQR202202280285",
			"invoiceOrg": "2353226125496576",
			"bustype_name": "销售签收确认",
			"creatorId": 2659650847723776,
			"exchRate": 1,
			"salesOrg": "2353226125496576",
			"invoiceOrg_name": "AAA",
			"vouchdate": "2022-02-28 00:00:00",
			"natCurrency": "2351874939032064",
			"currencyName": "人民币",
			"cust_name": "商家01",
			"currency": "2351874939032064",
			"details": [
				{
					"receivedSubQty": 9,
					"stockUnit_name": "件",
					"oriTax": "",
					"product_cCode": "000288",
					"varianceSubQty": 1,
					"firstsource": "udinghuo.voucher_order",
					"memo": "remark",
					"firstupcode": "UO-657620220223000021",
					"source": "ustock.st_salesout",
					"natTax": "",
					"subQty": 10,
					"product_cName": "多sku02",
					"free1": "吨",
					"stockUnitId_Precision": "2",
					"receivedBilling": false,
					"id": 2667543520416001,
					"mainid": 2667543520416000,
					"tenant": 2351873187860736,
					"varianceQty": 1,
					"unitName": "件",
					"oriUnitPrice": "",
					"natSum": 20,
					"taxCode": "VAT13",
					"taxRate": 13,
					"unit": 2352410771869952,
					"productsku": 2659121912254978,
					"productsku_cCode": "KKKKK吨000001",
					"receivedQty": 9,
					"sourceType": "st_salesout",
					"qty": 10,
					"unit_Precision": "2",
					"oriTaxUnitPrice": 2,
					"oriMoney": "",
					"invExchRate": 1,
					"signConfirmationsDetail": [
						{
							"varianceStatus": "incomplete",
							"product": 2659121912238592,
							"stockUnit_name": "件",
							"unitName": "件",
							"product_cCode": "000288",
							"detailid": 2667543520416001,
							"productsku_cName": "多sku02吨",
							"nextBustype": "2612715779264768",
							"unit": 2352410771869952,
							"productsku": 2659121912254978,
							"productsku_cCode": "KKKKK吨000001",
							"product_cName": "多sku02",
							"invPriceExchRate": "1",
							"nextBustype_name": "销售签收确认02",
							"id": 2667543520416002,
							"pubts": "2022-02-28 10:05:35",
							"invExchRate": 1,
							"stockUnitId": 2352410771869952
						}
					],
					"stockUnitId": 2352410771869952,
					"natUnitPrice": "",
					"receiveableQty": 10,
					"firstsourceautoid": 2660531004068099,
					"makeRuleCode": "saleOutToSignconfirmation",
					"productsku_cName": "多sku02吨",
					"invPriceExchRate": 1,
					"firstsourceid": 2660531004068096,
					"pubts": "2022-02-28 10:05:35",
					"sourceid": 2660542696296960,
					"bodyItem!define5": "1",
					"product": 2659121912238592,
					"oriSum": 20,
					"priceUOM_name": "件",
					"propertiesValue": "重量:吨;",
					"bodyItem!id": 2667543520416001,
					"sourceautoid": 2660542696296962,
					"priceQty": 10,
					"upcode": "XSCK20220223000014",
					"srcBillRow": "2",
					"orderCode": "UO-657620220223000021",
					"natTaxUnitPrice": 2,
					"bodyItem!define9": "1",
					"orderProductType": "SALE",
					"natMoney": "",
					"ptoId": 1909928517413896200,
					"ptoRowId": 1914525249124171800,
					"ptoQty": 1,
					"ptoSonQty": 2,
					"ptoCostScrap": 100,
					"salesoutAccountingMethod": "invoiceConfirm",
					"stockAccount": "beginningBill",
					"isUpdateCost": true,
					"costBillNoType": "st_salesout",
					"costCenter": "1942697846575726593",
					"costCenter_name": "二狗",
					"costCenter_code": "121231",
					"providerProfitCenter": "1942697717723561992",
					"providerProfitCenter_name": "二狗对外",
					"providerProfitCenter_code": "ergdw",
					"consumerProfitCenter": "1942697717723561992",
					"consumerProfitCenter_code": "ergdw",
					"consumerProfitCenter_name": "二狗对外",
					"invoiceCust": "1933704391227867144",
					"invoiceCust_name": "普通客户",
					"receiveAgreementId": "1805618323558656",
					"checkByRevenueManagement": 1,
					"excessiveSigning": 1,
					"inventoryowner": 0,
					"ownertype": 0
				}
			],
			"id": 2667543520416000,
			"headItem!define15": "111",
			"org_name": "AAA",
			"pubts": "2022-02-28 10:05:36",
			"natCurrencyName": "人民币",
			"tenant": 2351873187860736,
			"headItem!define10": "11",
			"salesOrg_name": "AAA",
			"creator": "lyz",
			"org": "2353226125496576",
			"isWfControlled": false,
			"exchRateType_name": "基准汇率",
			"headItem!id": 2667543520416000,
			"warehouse": 2411923631034624,
			"bustype": "2592843724003328",
			"warehouse_name": "A仓库",
			"natCurrency_moneyDigit": "2",
			"createTime": "2022-02-28 10:05:35",
			"natCurrency_priceDigit": "4",
			"exchRateType": "0000KRBF48WG59AUYJ0000",
			"cust": 2353231358169344,
			"status": 0,
			"noPostReasonMsg": "过账未知",
			"postAccountStatus": 99,
			"postAccountVersion": 1,
			"exchRateDate": "2024-04-04 12:12:12"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-23

更新

请求参数 (14)

新增

返回参数 inventoryowner

新增

返回参数 ownertype

更新

返回参数 (9)

调整签收来源生单，ucg_baseapi_api_info表入参转换模式param_transfer_mode为：2 入参映射（透传未知参数），测试日常之前被修改为了0 入参透传，导致页面默认值或用户可见为否的字段不传递值或不传字段

2	2025-05-28

新增

请求参数 (12)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

