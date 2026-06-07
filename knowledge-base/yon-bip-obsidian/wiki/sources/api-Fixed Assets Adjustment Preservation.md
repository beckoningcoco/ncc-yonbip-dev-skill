---
title: "固定资产调整保存"
apiId: "1720778080376586242"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Information Adjustment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Information Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调整保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Information Adjustment (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetAdjustment/save

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
| data | object | 否 | 是 | 固定资产调整信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id 示例：1563514751881838598 |
| accentity_code | string | 否 | 否 | 会计主体code 示例：012511 |
| code | string | 否 | 否 | 固定资产调整单编码(手工编码方式必传) 示例：TZ090322 |
| vouchdate | string | 否 | 是 | 调整日期 格式yyyy-MM-DD 示例：2022-09-30 |
| remarks | object | 否 | 否 | 调整原因，为空时请传null |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| details | object | 是 | 是 | 固定资产调整明细信息 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetAdjustment/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1563514751881838598",
		"accentity_code": "012511",
		"code": "TZ090322",
		"vouchdate": "2022-09-30",
		"remarks": {
			"zh_CN": "测试"
		},
		"_status": "Insert",
		"details": [
			{
				"assetId": "1572351492465098759",
				"assetId_code": "0302221020000052",
				"_status": "Insert",
				"adjustBody": {
					"quantity": 1,
					"name": {
						"zh_CN": "alienware"
					},
					"specification": {
						"zh_CN": "321"
					},
					"assetModel": {
						"zh_CN": "324213"
					},
					"unitId": "321312",
					"addWayId": "1550289989236424709",
					"addWayCode": "123",
					"usageStateId": "1550289997826359313",
					"usageStateCode": "332",
					"mgmtDeptId": "12321321",
					"placeId": "213123",
					"location": {
						"zh_CN": "热污染"
					},
					"userId": "155028999",
					"custodian": "155028999",
					"tagno": "090",
					"profitCenterId": "155028",
					"impairmentunitId": "155028243",
					"vendorId": "32432423",
					"mgmtCostCenterId": "155028",
					"_status": "Insert",
					"sources": [
						{
							"srcAppId": "123",
							"srcProjectId": "123",
							"_status": "Insert",
							"srcProjectCode": "12"
						}
					],
					"bodies": [
						{
							"scrapValueType": "0",
							"scrapValueRate": 1,
							"scrapValue": 2,
							"oriValue": 12,
							"extractedPeriod": 0,
							"isMonthdepr": false,
							"deprMethodId": "1550290015006228502",
							"deprMethodCode": "432",
							"isDepr": true,
							"lifeYear": 25,
							"lifeMonth": 1,
							"amortiAdjustDate": "2022-09-30",
							"accbookStartDate": "2022-09-30",
							"deprConvention": "1550290057955901443",
							"disposalConvention": "1550290057955901444",
							"totalWorkload": 1,
							"existingWorkload": 1,
							"workloadUnit": {
								"zh_CN": "个"
							},
							"_status": "Insert",
							"subjects": [
								{
									"subjectId": "1564985907040223235",
									"subject_code": "101",
									"_status": "Insert"
								}
							],
							"oriCurrtypeCode": "23",
							"orgCurrtypeCode": "23",
							"accbookCurrtypeCode": "23",
							"accbookCode": "23"
						}
					]
				}
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产调整信息 |
| id | string | 否 | 单据id 示例：1629396775637352454 |
| code | string | 否 | 调整单编码 示例：TZ001003 |
| accentity | string | 否 | 会计主体id 示例：1572524545313079302 |
| remarks | object | 否 | 调整原因 |
| vouchdate | string | 否 | 调整日期 示例：2022-09-30 |
| verifyState | int | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2 |
| createTime | string | 否 | 创建时间 示例：2023-01-05 10:44:20 |
| details | object | 是 | 固定资产调整单明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1629396775637352454",
		"code": "TZ001003",
		"accentity": "1572524545313079302",
		"remarks": {
			"zh_CN": "调整1"
		},
		"vouchdate": "2022-09-30",
		"verifyState": 2,
		"createTime": "2023-01-05 10:44:20",
		"details": [
			{
				"adjustId": "1701534814432657412",
				"id": "1701547991392321544",
				"accentity": "1570033155012821001",
				"assetId": "1701547166758600710",
				"code": "0000230412003619",
				"tagno": "323",
				"snaphotId": "1701547982802386947",
				"addWayId": "1550289989236424710",
				"quantity": 1,
				"beginTime": "2022-08-01",
				"adjustType": "4",
				"adjustContent": "折旧参数调整：【账簿】主1：累计折旧:0-->1000;\n"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	请输入会计主体id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-10

更新

请求说明

新增

请求参数 oriBillId

添加入参oriBillId【业务幂等id】

3	2025-06-26

更新

请求参数 amortiAdjustDate

更新

请求参数 freeChId

删除

请求参数 amortiAdjustMark


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

