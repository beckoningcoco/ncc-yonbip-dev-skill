---
title: "结算信息批量新增"
apiId: "1946432896167837697"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算信息批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Information (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/fiercl/rclSettleInfo/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 入参 |
| accentity | string | 否 | 否 | 会计主体id 示例：1525652227072458756 |
| accentity_code | string | 否 | 是 | 会计主体编码 示例：xmhs |
| billDate | Date | 否 | 是 | 单据日期 示例：2023-03-24 |
| code | string | 否 | 否 | 编码(手动输入时必填) 示例：SEI20230324001112 |
| settleType | string | 否 | 否 | 结算类型id 示例：1658667158153986049 |
| settleType_code | string | 否 | 是 | 结算类型编码 示例：A05001 |
| customer | string | 否 | 否 | 客户id 示例：1526228774896533510 |
| customer_code | string | 否 | 是 | 客户编码 示例：00000000013470 |
| oriCurrtype | string | 否 | 否 | 币种id 示例：1525643705855773169 |
| oriCurrtype_code | string | 否 | 是 | 币种code 示例：CNY |
| exchangeRateType | string | 否 | 否 | 汇率类型id 示例：1679114604013158401 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型code 示例：0000001 |
| exchangeRateDate | Date | 否 | 是 | 汇率日期 示例：2023-03-14 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| _status | string | 否 | 是 | 接口状态(Insert-新增) 示例：Insert 默认值：Insert |
| extSrcSystems | string | 否 | 是 | 来源单据系统(外) 示例：履约义务信息 |
| extSrcBillcode | string | 否 | 是 | 来源单据编码(外) 示例：test1 |
| rclSettleInfoBodyList | object | 是 | 是 | 结算信息子表 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/rclSettleInfo/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525652227072458756",
			"accentity_code": "xmhs",
			"billDate": "2023-03-24",
			"code": "SEI20230324001112",
			"settleType": "1658667158153986049",
			"settleType_code": "A05001",
			"customer": "1526228774896533510",
			"customer_code": "00000000013470",
			"oriCurrtype": "1525643705855773169",
			"oriCurrtype_code": "CNY",
			"exchangeRateType": "1679114604013158401",
			"exchangeRateType_code": "0000001",
			"exchangeRateDate": "2023-03-14",
			"exchRateOps": NaN,
			"exchangeRate": 1,
			"remarks": "备注",
			"_status": "Insert",
			"extSrcSystems": "履约义务信息",
			"extSrcBillcode": "test1",
			"rclSettleInfoBodyList": [
				{
					"contractNum": "RECONRECON20230324003733",
					"rowNo": 1,
					"contractId": "1698405630106664967",
					"contractDetailId": "1698405630106664969",
					"project": "1535891386155401216",
					"project_code": "000004",
					"materialCode": "0105000002",
					"material": "手机1",
					"dept": "1525655517005348867",
					"dept_code": "bu1",
					"staff": "1563528487077150729",
					"staff_code": "00000001",
					"costCenter": "1580525167313420290",
					"costCenterCode": "010101001",
					"profitCenter": "1525652227072458756",
					"profitCenterCode": "pkm00",
					"otherProCenter": "1525652227072458756",
					"otherProCenterCode": "pkm00",
					"expenseItem": "1587803487610077193",
					"expenseItemCode": "pols",
					"quantity": 10,
					"noTaxMoney": 10,
					"money": 100,
					"taxRateId": "1607403072771850292",
					"taxRateCode": "NO VAT",
					"tax": 10,
					"oriCurrency": "152564370585577316",
					"oriCurrencyCode": "CNY",
					"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
					"exchangeRateTypeCode": "01",
					"exchangeRateDate": "2023-03-24",
					"exchRateOps": NaN,
					"exchangeRate": 1,
					"conExchRateOps": NaN,
					"contractCurExchangeRate": 1,
					"noTaxLocalMoney": 200,
					"localTax": 300,
					"localMoney": 400,
					"remarks": "备注",
					"_status": "Insert",
					"extSrcSystems": "NC65",
					"extSrcBillcode": "test1",
					"extSrcBilltypeCode": "prjl_schedule",
					"extSrcTranstypeCode": "rcl_businessct",
					"extSrcBillNo": "test1",
					"extSrcBillId": "1819572782035894279",
					"extSrcBodyId": "1821063539425542157",
					"extOriBilltypeCode": "prjl_schedule",
					"extOriBillNo": "test1",
					"extOriTranstypeCode": "rcl_businessct",
					"extOriBillId": "1821063530835607552",
					"extOriBodyId": "1821063539425542157",
					"localPrice": "1",
					"settleStartPeriod": "1556256609240350736",
					"settleStartPeriod_code": "1980-01",
					"settleEndPeriod": "1556256609240350736",
					"settleEndPeriod_code": "1980-01",
					"localmnyChargeoff": 0,
					"localmnyChargeoffNotax": 0,
					"localmnyChargeoffTax": 0,
					"orimnyChargeoff": 0,
					"orimnyChargeoffNotax": 0,
					"orimnyChargeoffTax": 0
				}
			]
		}
	],
	"isAsync": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 操作码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | number |
| 小数位数:-,最大长度:0 | 否 | 总共条件 示例：5 |
| successCount | number |
| 小数位数:-,最大长度:0 | 否 | 成功个数 示例：4 |
| failCount | number |
| 小数位数:-,最大长度:0 | 否 | 失败个数 示例：1 |
| messages | object | 是 | 错误数据列表 |
| infos | object | 是 | 返回值 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 5,
		"successCount": 4,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "1688132214264954887",
				"message": "新增失败"
			}
		],
		"infos": [
			{
				"busiObj": "rclSettleInfo",
				"applyQuantityTotal": 10,
				"accentity": "1525652227072458756",
				"dr": 0,
				"exchangeRate": 1,
				"id": "1688132214264954887",
				"metaFullName": "RCL.RCL.RclSettleInfoHeader",
				"billDate": "2023-03-25",
				"ytenantId": "0000L6YQ8AVLFUZPXD0000",
				"_status": 0,
				"verifyState": 0,
				"code": "SEI20230325001122",
				"cBillNo": "rclSettleInfo",
				"applyAmountTotal": 100,
				"pubts": "2023-03-25 14:07:35",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"postState": "1",
				"oriCurrtype": "1525643705855773169",
				"bustype": "1658667158153986049",
				"exchangeRateType": "1679114604013158401",
				"exchangeRateDate": "2023-03-22",
				"createTime": "2023-03-25 13:56:42",
				"remarks": "备注",
				"customer": "1526228774896533510",
				"contractConversionParams": "1",
				"rclSettleInfoBodyList": [
					{
						"noTaxPrice": 100,
						"project": "1686083437557973001",
						"localTax": 300,
						"dr": 0,
						"exchangeRate": 1,
						"id": "1688132214264954888",
						"taxRateId": "1606725112064638981",
						"metaFullName": "RCL.RCL.RclSettleInfoBody",
						"localMoney": 500,
						"srcBillId": "1686090077559062537",
						"taxSubject": "1606726357605154822",
						"noTaxLocalMoney": 200,
						"noTaxMoney": 1000,
						"tax": 100,
						"ytenantId": "0000L6YQ8AVLFUZPXD0000",
						"_status": 0,
						"taxRate": 10,
						"unit": "1525645209096421378",
						"expenseItem": "1585708076158681089",
						"rclSettleInfoHeader_id": "1688132214264954887",
						"pubts": "2023-03-25 14:07:35",
						"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
						"quantity": 10,
						"orgCurrtype": "1525643705855773169",
						"srcBillDetailId": "1686090077559062539",
						"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
						"material": "1526402386049368074",
						"money": 200,
						"exchangeRateDate": "2023-03-22",
						"createTime": "2023-03-25 14:07:35",
						"srcCode": "RECONRECON20230322003244",
						"contractNum": "RECONRECON20230322003244",
						"exchangeRateTypeCode": "01",
						"verifyState": 0,
						"oriCurrency": "1783169601426161704",
						"rclContractBaseInfo": "1686090077559062539",
						"contractCurrency": "1783169601426161704",
						"contractCurExchangeRate": 1,
						"contractCurExchangeRateType": "1783169601426164193",
						"contractCurMoney": 1000,
						"contractCurNoTaxMoney": 900,
						"contractCurTax": 100,
						"settleStartPeriod": "1556256609240350736",
						"settleEndPeriod": "1556256609240350736"
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	保存错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-10

新增

请求参数 (9)

删除

请求参数 settleEndPeriod

删除

请求参数 settleEndPeriod_code

删除

返回参数 settleEndPeriod


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

