---
title: "凭证详情查询"
apiId: "2206424549451890691"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/openapi/voucher/queryVoucherById

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| voucherId | string | 否 | 是 | 凭证ID 示例：1674770115738468360 |

## 3. 请求示例

Url: /yonbip/EFI/openapi/voucher/queryVoucherById?access_token=访问令牌
Body: {
	"voucherId": "1674770115738468360"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码(200成功，404失败) 示例：200 |
| message | string | 否 | 响应信息 示例：OK |
| data | object | 否 | 响应数据 |
| id | string | 否 | 凭证ID 示例：1674770115738468360 |
| accBook | string | 否 | 账簿ID 示例：1674761783506108424 |
| accBookObj | object | 否 | 账簿 |
| externalSourceDataType | string | 否 | 外部来源单据类型 |
| externalSourceDataCode | string | 否 | 外部来源数据编码 |
| externalSourceSystemName | string | 否 | 外部来源系统 |
| externalSourceDataId | string | 否 | 外部来源数据ID |
| code | string | 否 | 凭证编码 示例：202501011101 |
| periodUnion | string | 否 | 期间 示例：2023-03 |
| voucherType | string | 否 | 凭证类型ID 示例：1525643774565285967 |
| voucherTypeObj | object | 否 | 凭证类型 |
| billCode | number |
| 小数位数:0,最大长度:10 | 否 | 凭证号 示例：1 |
| makeTime | string | 否 | 制单日期（yyyy-MM-dd） 示例：2023-03-07 |
| displayName | string | 否 | 凭证名 示例：记-1 |
| displayName2 | string | 否 | 凭证名 示例：Post-1 |
| displayName3 | string | 否 | 凭证名 示例：記-1 |
| displayName4 | string | 否 | 凭证名 示例：记-1 |
| displayName5 | string | 否 | 凭证名 示例：记-1 |
| displayName6 | string | 否 | 凭证名 示例：记-1 |
| voucherStatus | string | 否 | 凭证状态 00:暂存 01:保存 02:纠错 03:审核 04:记账 05:作废 示例：04 |
| description | string | 否 | 凭证摘要 |
| srcSystem | string | 否 | 来源系统ID，多来源以英文逗号分隔 示例：115 |
| srcSystemObj | object | 是 | 来源系统 |
| signStatus | number |
| 小数位数:0,最大长度:10 | 否 | 能否签字(能签字 : 包含银行现金类和现金等价物科目的凭证) -10 不需要签字 0 需要签字未签字 10 已签字 示例：-10 |
| attachmentQuantity | string | 否 | 附件数量 |
| totalDebitOrg | number |
| 小数位数:0,最大长度:10 | 否 | 借方本币合计_账簿 示例：12 |
| organizeDebitTotalAmount | string | 否 | 借方本币合计_组织 |
| totalDebitGroup | number |
| 小数位数:0,最大长度:10 | 否 | 借方本币合计_集团 示例：0 |
| totalDebitGlobal | number |
| 小数位数:0,最大长度:10 | 否 | 借方本币合计_全局 示例：0 |
| totalCreditOrg | number |
| 小数位数:0,最大长度:10 | 否 | 贷方本币合计_账簿 示例：12 |
| organizeCreditTotalAmount | string | 否 | 贷方本币合计_组织 |
| totalCreditGroup | number |
| 小数位数:0,最大长度:10 | 否 | 贷方本币合计_集团 示例：0 |
| totalCreditGlobal | number |
| 小数位数:0,最大长度:10 | 否 | 贷方本币合计_全局 示例：0 |
| maker | string | 否 | 制单人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| makerObj | object | 否 | 制单人 |
| auditor | string | 否 | 审核人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| auditorObj | object | 否 | 审核人 |
| tallyMan | string | 否 | 记账人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| tallyManObj | object | 否 | 记账人 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 示例：2023-03-07 14:01:42 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 示例：2023-03-07 14:01:42 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 数据最后操作时间 示例：2025-02-19 00:00:00 |
| ts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 最后操作时间 示例：2025-02-19 00:00:00 |
| auditTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 审核时间 示例：2024-06-13 00:00:00 |
| tallyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 记账时间 示例：2025-02-19 00:00:00 |
| bodies | object | 是 | 分录行 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "OK",
	"data": {
		"id": "1674770115738468360",
		"accBook": "1674761783506108424",
		"accBookObj": {
			"id": "1674761783506108424",
			"code": "ZZCS",
			"name": "总账测试主账簿"
		},
		"externalSourceDataType": "",
		"externalSourceDataCode": "",
		"externalSourceSystemName": "",
		"externalSourceDataId": "",
		"code": "202501011101",
		"periodUnion": "2023-03",
		"voucherType": "1525643774565285967",
		"voucherTypeObj": {
			"id": "1525643774565285967",
			"code": "01",
			"name": "记账凭证"
		},
		"billCode": 1,
		"makeTime": "2023-03-07",
		"displayName": "记-1",
		"displayName2": "Post-1",
		"displayName3": "記-1",
		"displayName4": "记-1",
		"displayName5": "记-1",
		"displayName6": "记-1",
		"voucherStatus": "04",
		"description": "",
		"srcSystem": "115",
		"srcSystemObj": [
			{
				"id": "115",
				"code": "figl",
				"name": "凭证管理"
			}
		],
		"signStatus": -10,
		"attachmentQuantity": "",
		"totalDebitOrg": 12,
		"organizeDebitTotalAmount": "",
		"totalDebitGroup": 0,
		"totalDebitGlobal": 0,
		"totalCreditOrg": 12,
		"organizeCreditTotalAmount": "",
		"totalCreditGroup": 0,
		"totalCreditGlobal": 0,
		"maker": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"makerObj": {
			"id": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"code": "000005",
			"name": "业务测试"
		},
		"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"auditorObj": {
			"id": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"code": "000005",
			"name": "业务测试"
		},
		"tallyMan": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"tallyManObj": {
			"id": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"code": "000005",
			"name": "业务测试"
		},
		"createTime": "2023-03-07 14:01:42",
		"modifyTime": "2023-03-07 14:01:42",
		"pubts": "2025-02-19 00:00:00",
		"ts": "2025-02-19 00:00:00",
		"auditTime": "2024-06-13 00:00:00",
		"tallyTime": "2025-02-19 00:00:00",
		"bodies": [
			{
				"id": "1674770115738468361",
				"accSubject": "1674760443476312097",
				"accSubjectVid": "1674760443476312097",
				"description": "采购商品",
				"recordNumber": 1,
				"currency": "1525643705855773169",
				"businessDate": "2023-03-07",
				"debitQuantity": 0,
				"debitOriginal": 12,
				"debitOrg": 12,
				"organizeDebitAmount": 0,
				"debitGroup": 0,
				"debitGlobal": "",
				"creditQuantity": 0,
				"creditOriginal": 0,
				"creditOrg": 0,
				"organizeCreditAmount": 0,
				"creditGroup": 0,
				"creditGlobal": "",
				"price": 0,
				"quantity": 0,
				"rateOrg": 1,
				"organizeRate": 0,
				"rateGroup": 0,
				"rateGlobal": 0,
				"rateOrgOp": "mul",
				"rateType": "0000L6YQ8AVLFUZPXD0000",
				"organizeRateType": "",
				"groupRateType": "",
				"globalRateType": "",
				"verifyNo": "",
				"measureDoc": "1526435706415087621",
				"checkFlag": false,
				"coordinationNo": "",
				"auxiliary": {
					"vr1": "",
					"vr2": "",
					"vr3": "",
					"vr4": "1670941916881485828",
					"vr5": "",
					"vr6": "1528468394184015875",
					"vr7": "",
					"vr8": "",
					"vr9": "",
					"vr10": "",
					"vr11": "",
					"vr12": "",
					"vr13": "",
					"vr14": "",
					"vr15": "",
					"vr16": "",
					"vr17": "",
					"vr18": "",
					"vr19": "",
					"vr20": "",
					"vr21": "",
					"vr22": "",
					"vr23": "",
					"vr24": "",
					"vr25": "",
					"vr26": "",
					"vr27": "",
					"vr28": "",
					"vr29": "",
					"vr30": "",
					"vr31": "",
					"vr32": "",
					"vr33": "",
					"vr34": "",
					"vr35": "",
					"vr36": "",
					"vr37": "",
					"vr38": "",
					"vr39": "",
					"vr40": "",
					"vr41": "",
					"vr42": "",
					"vr43": "",
					"vr44": "",
					"vr45": "",
					"vr46": "",
					"vr47": "",
					"vr48": "",
					"vr49": "",
					"vr50": "",
					"vr51": "",
					"vr52": "",
					"vr53": "",
					"vr54": "",
					"vr55": "",
					"vr56": "",
					"vr57": "",
					"vr58": "",
					"vr59": "",
					"vr60": "",
					"vr61": "",
					"vr62": "",
					"vr63": "",
					"vr64": "",
					"vr65": "",
					"vr66": "",
					"vr67": "",
					"vr68": "",
					"vr69": "",
					"vr70": "",
					"vr71": "",
					"vr72": "",
					"vr73": "",
					"vr74": "",
					"vr75": "",
					"vr76": "",
					"vr77": "",
					"vr78": "",
					"vr79": "",
					"vr80": "",
					"vr81": "",
					"vr82": "",
					"vr83": "",
					"vr84": "",
					"vr85": "",
					"vr86": "",
					"vr87": "",
					"vr88": "",
					"vr89": "",
					"vr90": "",
					"vr91": "",
					"vr92": "",
					"vr93": "",
					"vr94": "",
					"vr95": "",
					"vr96": "",
					"vr97": "",
					"vr98": "",
					"vr99": "",
					"vr100": ""
				},
				"clientAuxiliary": [
					{
						"dataType": "doc",
						"docType": "supplier",
						"code": "0004",
						"name": "供应001",
						"value": "1670941916881485828",
						"valueObj": ""
					}
				],
				"cashFlowItem": [
					{
						"itemId": "1674761104901275693",
						"itemCode": "1121",
						"itemName": "购买商品、接受劳务支付的现金",
						"negative": false,
						"amountOriginal": 12,
						"amountOrg": 12,
						"innerOrg": "1674757608802615298"
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-10

更新

请求说明

新增

返回参数 (5)

更新

返回参数 (121)

添加来源系统返回字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

