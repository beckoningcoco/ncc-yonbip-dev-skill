---
title: "固定资产处置批量保存并审核"
apiId: "2096326412987269120"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产处置批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/disposal_bill/batchSaveAndAudit

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
| disposalBillDtos | object | 是 | 否 | disposalBillDtos |
| sourceId | string | 否 | 否 | 来源id 示例：123 |
| code | string | 否 | 否 | 单据编码(手工输入，系统设置为处置单编码为手工编号时，导入以手工输入处置单编码为准； 系统设置为自动编号时，系统自动编号并替代输入的编号) 示例：DP002508 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1796677711656648705 |
| accentityCode | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：gl00048 |
| vouchdate | string | 否 | 否 | 处置单日期,格式yyyy-MM-dd 示例：2022-09-30 |
| disposalType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 处置类型,枚举值：1-原值处置;2-数量处置 示例：1 |
| remarks | object | 否 | 否 | 备注(字符,长度255) |
| bodies | object | 是 | 否 | 处置表体明细 |

## 3. 请求示例

Url: /yonbip/EFI/disposal_bill/batchSaveAndAudit?access_token=访问令牌
Body: {
	"disposalBillDtos": [
		{
			"sourceId": "123",
			"code": "DP002508",
			"accentity": "1796677711656648705",
			"accentityCode": "gl00048",
			"vouchdate": "2022-09-30",
			"disposalType": 1,
			"remarks": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"bodies": [
				{
					"assetId": "1815806757245026320",
					"assetIdCode": "gl00048",
					"accbook": "1796686164160675863",
					"accbookCode": "gl00048",
					"isDisposalcurdepr": "1",
					"reduceDate": "2022-09-30",
					"reduceWayId": "1234455",
					"reduceWayIdCode": "123",
					"disposalConvention": "1796029051344257025",
					"disposalConventionCode": "",
					"disposalAmount": 5,
					"orgDisposalOriValue": 0,
					"orgCleanIncomeTaxAmount": 0,
					"orgCleanCostAmount": 0,
					"orgTaxAmount": 0,
					"orgRemainRentAmount": 0,
					"orgRemainUnreFinCharge": 0,
					"discription": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"disposalOriValue": 0,
					"cleanIncomeTaxAmount": 0,
					"cleanCostAmount": 0,
					"outputValueAddedTax": 0,
					"orgCurrtypeId": "12312"
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
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | data |
| success | object | 是 | 生成成功的数据 |
| failed | object | 是 | 生成失败的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1231231",
				"code": "CZ12312",
				"sourceId": "12312"
			}
		],
		"failed": [
			{
				"sourceId": "1234567808",
				"message": "失败信息"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	请求参数中输入会计主体id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-15

新增

请求参数 oriBillId

更新

请求参数 (25)

更新

返回参数 data

更新

返回参数 success

更新

返回参数 failed

添加入参，业务幂等id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

