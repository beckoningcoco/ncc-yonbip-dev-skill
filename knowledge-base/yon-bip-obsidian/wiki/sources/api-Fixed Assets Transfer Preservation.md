---
title: "固定资产调出保存"
apiId: "1893619281043128323"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-Out"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-Out]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调出保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateOut/save

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
| data | object | 否 | 是 | 固定资产调出单信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1809103344096509961 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：mm001 |
| vouchdate | string | 否 | 是 | 单据日期, 格式: yyyy-MM-dd 示例：2023-08-25 |
| remarks | string | 否 | 否 | 调出原因 示例：人员异动 |
| reduceWayId | string | 否 | 否 | 减少方式id，减少方式id和减少方式编码至少有一个必填 示例：1848769256678752294 |
| reduceWayId_code | string | 否 | 否 | 减少方式编码，若减少方式id和减少方式编码都填了，以减少方式id为准 示例：01 |
| FaAllocateOutAssetList | object | 是 | 否 | 固定资产调出单卡片明细信息 |
| FaAllocateOutDtlList | object | 是 | 否 | 固定资产调出单明细信息 |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1809103344096509961",
		"accentity_code": "mm001",
		"vouchdate": "2023-08-25",
		"remarks": "人员异动",
		"reduceWayId": "1848769256678752294",
		"reduceWayId_code": "01",
		"FaAllocateOutAssetList": [
			{
				"assetId": "1893119355454488581",
				"quantity": 10,
				"_status": "Insert",
				"assetId_code": "0202231226005079",
				"unitId": "0930388502",
				"unitId_code": "01",
				"allocatePriceType": "1",
				"inAccentityId": "123",
				"inAccentityId_code": "123",
				"remarks": "123"
			}
		],
		"FaAllocateOutDtlList": [
			{
				"assetId": "1893119355454488581",
				"assetCalcId": "1893119355454488586",
				"accbookId": "1809115756560384020",
				"assetCategoryId": "1780959548702982259",
				"accbookCurrtypeId": "1780959454188011553",
				"accCurrtypeOriAmount": 1000.33,
				"accAccumDeprAmount": 3.17,
				"accAccumImpAmount": 20,
				"accNetValue": 997.16,
				"accNetAmount": 977.16,
				"deprDonventionId": "1789819464910372865",
				"disposalConventionId": "1789819464910372865",
				"beginDate": "2023-07-31",
				"createAssetDate": "2023-07-31",
				"lifeYear": 25,
				"lifeMonth": 0,
				"accruedPeriod": 1,
				"_status": "Insert",
				"accRateTypeId": "0000LKMAE85K35S5J90000",
				"adjustmentDepreciation": 0,
				"accAllocateIncome": 1000.33,
				"accAllocateAmount": 1000.33,
				"settleAllocateAmount": 1000.33,
				"allocateSettleCurrtypeId": "1780959454188011553",
				"allocateSettleCurrtypeId_id": "1780959454188011553",
				"allocateSettleCurrtypeId_code": "01",
				"accRate": "1",
				"accRateOps": 0,
				"assetId_code": "0202231226005079",
				"accbook_code": "091",
				"assetCategoryId_code": "01",
				"accbookCurrtypeId_code": "01",
				"deprConventionId_code": "001",
				"disposalConventionId_code": "01",
				"accRateTypeId_code": "01",
				"orgAllocateAmount": 1000.23
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
| code | long | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产调拨单信息 |
| accentity | string | 否 | 会计主体id 示例：1809103344096509961 |
| allocatePriceType | string | 否 | 调拨价格 示例：1 |
| id | string | 否 | 主键 示例：1893579105937915911 |
| verifyState | long | 否 | 单据状态 示例：0 |
| FaAllocateOutDtlList | object | 是 | 固定资产调出单明细信息 |
| FaAllocateOutAssetList | object | 是 | 固定资产调出单卡片明细信息 |
| code | string | 否 | 单据编码 示例：ZCDC002514 |
| allocateRequestId | string | 否 | 调拨申请单id 示例：1893575154568003586 |
| inAccentityId | string | 否 | 调入会计主体ID 示例：1783121197124812805 |
| vouchdate | string | 否 | 单据日期 示例：2023-08-25 |
| createTime | string | 否 | 创建时间 示例：2023-12-27 09:46:05 |
| remarks | object | 否 | 调出原因 |
| allocate_request_code | string | 否 | 调拨申请单编码 示例：DBSQ002506 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accentity": "1809103344096509961",
		"allocatePriceType": "1",
		"id": "1893579105937915911",
		"verifyState": 0,
		"FaAllocateOutDtlList": [
			{
				"accRateTypeId": "0000LKMAE85K35S5J90000",
				"assetCalcId": "1893119355454488586",
				"accruedPeriod": 1,
				"accAccumImpAmount": 20,
				"id": "1893579105937915912",
				"accNetAmount": 977.16,
				"lifeMonth": 0,
				"accNetValue": 997.16,
				"createAssetDate": "2023-07-31",
				"allocateSettleCurrtypeId": "1780959454188011553",
				"accAccumDeprAmount": 3.17,
				"accbookId": "1809115756560384020",
				"assetCategoryId": "1780959548702982259",
				"settleAllocateAmount": 1000.33,
				"accbookCurrtypeId": "1780959454188011553",
				"accRate": 1,
				"assetId": "1893119355454488581",
				"accCurrtypeOriAmount": 1000.33,
				"pubts": "2023-12-27 09:47:01",
				"adjustmentDepreciation": 0,
				"lifeYear": 25,
				"beginDate": "2023-07-31",
				"reduceWayId": "1780959462799442267",
				"accAllocateIncome": 1000.33,
				"accAllocateAmount": 1000.33,
				"createTime": "2023-12-27 09:47:01",
				"allocateSettleCurrtypeId_id": "1780959454188011553"
			}
		],
		"FaAllocateOutAssetList": [
			{
				"assetId": "1893119355454488581",
				"id": "1893579105937915914",
				"pubts": "2023-12-27 09:47:01",
				"quantity": 10,
				"createTime": "2023-12-27 09:47:01"
			}
		],
		"code": "ZCDC002514",
		"allocateRequestId": "1893575154568003586",
		"inAccentityId": "1783121197124812805",
		"vouchdate": "2023-08-25",
		"createTime": "2023-12-27 09:46:05",
		"remarks": {
			"zh_CN": "人员异动"
		},
		"allocate_request_code": "DBSQ002506"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310008	参数校验失败，参数[datalvouchdate]是必填的。	查看请求数据中调出单日期是否为空或者没有传入该字段


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

请求参数 accRateOps

4	2025-04-15

新增

请求参数 orgAllocateAmount

更新

请求参数 accAllocateAmount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

