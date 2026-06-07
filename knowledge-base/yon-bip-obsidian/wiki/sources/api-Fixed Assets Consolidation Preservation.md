---
title: "固定资产合并保存"
apiId: "1898202286038974471"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Consolidation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产合并保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Consolidation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetMerge/save

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
| data | object | 否 | 是 | 固定资产合并单信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1525795008955285506 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：W01 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2022-01-21 |
| FixedAssetMergeDtlAssetList | object | 是 | 否 | 固定资产合并卡片明细信息 |
| FixedAssetMergeDtlAccbookList | object | 是 | 否 | 固定资产合并账簿明细信息 |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| addbillData | object | 否 | 是 | 合并单卡片信息 |
| remark | string | 否 | 否 | 合并原因 示例：合并原因 |
| addWayId | string | 否 | 否 | 增加方式（增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准） 示例：111 |
| reduceWayId | string | 否 | 否 | 减少方式（减少方式id，减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准） 示例：111 |
| addWayId_code | string | 否 | 否 | 增加方式编码（增加方式编码，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准） 示例：111 |
| reduceWayId_code | string | 否 | 否 | 减少方式编码（减少方式编码，减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准） 示例：111 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetMerge/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1525795008955285506",
		"accentity_code": "W01",
		"vouchdate": "2022-01-21",
		"FixedAssetMergeDtlAssetList": [
			{
				"assetId_code": "00231211167382",
				"assetId": "1881900050355847171",
				"quantity": 1,
				"_status": "Insert"
			}
		],
		"FixedAssetMergeDtlAccbookList": [
			{
				"blnBelongToBeforeCard": false
			}
		],
		"_status": "Insert",
		"addbillData": {
			"accentity": "1525795008955285506",
			"accentity_code": "W01",
			"assetCode": "00240102167453",
			"name": "Merge",
			"assetBookCategoryId": "1804577788505620480",
			"assetCategoryId": "1791289752388370437",
			"assetCategoryCode": "01",
			"addWayId": "1689815892968865977",
			"addWayCode": "01",
			"usageStateId": "1525644693693530121",
			"usageStateId_code": "01",
			"custodian": "",
			"beginTime": "2022-01-21",
			"quantity": 1,
			"oriCurrtypeId": "1525643705855773169",
			"oriCurrtypeId_code": "CNY2",
			"fcOriValue": 1000,
			"bodies": [
				{
					"taxRate": "0",
					"scrapValueType": 1,
					"orgAddedTaxAmount": 0,
					"orgYearDeprAmount": 0,
					"orgAccumDeprAmount": 68.28888889,
					"orgCurYearImpAmount": 0,
					"orgAccumImpAmount": 0,
					"addedTaxAmount": 0,
					"yearDeprAmount": 0,
					"deprAmount": 68.28888889,
					"curYearImpAmount": 0,
					"accumImpAmount": 0,
					"lifeYear": 1,
					"lifeMonth": 1,
					"isDepr": "true",
					"monthWorkload": 0,
					"oriValue": 900,
					"scrapValue": "9.00000000",
					"totalWorkload": 0,
					"existingWorkload": 0,
					"subjects": [
						{
							"subjectId": "1526351945946103816",
							"subjectCode": "1001"
						}
					],
					"accbook": "W01",
					"accbook_code": "W01",
					"isMonthdepr": true,
					"extractedPeriod": 0,
					"createAssetDate": "2022-01-21",
					"accbookStartDate": "2022-01-21",
					"accbookCurrtypeId": "1525643705855773169",
					"accbookCurrtypeId_code": "CNY2",
					"oriCurrtypeId": "1525643705855773169",
					"oriCurrtypeId_code": "CNY2",
					"orgCurrtypeId": "1525643705855773169",
					"orgCurrtypeIdCode": "CNY2",
					"exchangeRateType": "1525643714445705224",
					"exchangeRateType_code": "02",
					"exchangeRate": 1,
					"orgRate": 1,
					"amortiAdjustMark": false,
					"fcOriValue": 1000,
					"orgScrapValueAmount": 9,
					"taxItemId": "10002",
					"taxItemId_code": "VATZR",
					"assetBookCategoryId": "1804577831455293442",
					"assetCategoryId": "1791289752388370437",
					"deprMethodId": "1525698312061253427",
					"scrapValueRate": 12,
					"deprMethodId_code": "01",
					"exchangeRateOps": 1,
					"orgRateOps": 1
				}
			],
			"assignments": [
				{
					"_status": "Insert",
					"deptCode": "w001",
					"deptId": "1817166560976437249",
					"costCenterCode": "",
					"costCenterId": "",
					"profitCenterCode": "",
					"profitCenterId": "",
					"proportion": "100"
				}
			],
			"custodianCode": "",
			"mgmtDeptId": "9384892937",
			"mgmtDeptId_code": "0101"
		},
		"remark": "合并原因",
		"addWayId": "111",
		"reduceWayId": "111",
		"addWayId_code": "111",
		"reduceWayId_code": "111"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产合并单信息 |
| accentity | string | 否 | 会计主体id 示例：1525795008955285506 |
| FixedAssetMergeDtlAccbookList | object | 是 | 固定资产合并账簿明细信息 |
| id | string | 否 | 合并单主键 示例：1898084389068734478 |
| code | string | 否 | 合并单编码 示例：HB080132 |
| vouchdate | string | 否 | 单据日期 示例：2022-01-21 |
| additionId | string | 否 | 合并新增单主键 示例：1898084389068734470 |
| FixedAssetMergeDtlAssetList | object | 是 | 固定资产合并卡片明细信息 |
| createTime | string | 否 | 创建时间 示例：2024-01-02 11:26:41 |
| creator_userName | string | 否 | 创建人名称 示例：管理员 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "1525795008955285506",
		"FixedAssetMergeDtlAccbookList": [
			{
				"curYearImpAmount": 0,
				"id": "1898084389068734480",
				"netValue": 809.71111111,
				"accbook": "W01",
				"accAccumDeprAmount": 68.28888889,
				"assetCategoryId": "1804577831455293442",
				"yearDeprAmount": 0.52812856,
				"assetId": "1881900050355847171",
				"accCurrtypeOriAmount": 900,
				"accumImpAmountass": 0,
				"netAmount": 809.71111111,
				"blnBelongToBeforeCard": false,
				"scrapValueAmount": 9,
				"accbookCode": "W01"
			}
		],
		"id": "1898084389068734478",
		"code": "HB080132",
		"vouchdate": "2022-01-21",
		"additionId": "1898084389068734470",
		"FixedAssetMergeDtlAssetList": [
			{
				"assetId": "1881900050355847171",
				"id": "1898084389068734479",
				"quantity": 1,
				"reduceWayId": "1848769256678752302",
				"assetId_code": "00231211167382"
			}
		],
		"createTime": "2024-01-02 11:26:41",
		"creator_userName": "管理员"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	存在重复的资产卡片！	检查合并资产中是否有重复的资产


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

3	2025-09-18

新增

请求参数 exchangeRateOps

新增

请求参数 orgRateOps

4	2025-08-15

新增

请求参数 addWayCode

更新

请求参数 (4)

删除

请求参数 addWayId_code

增加方式，减少方式，默认值修改


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

