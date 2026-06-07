---
title: "固定资产变动保存"
apiId: "2331630379496636424"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产变动保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Change (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetChange/save

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
| data | object | 否 | 是 | 固定资产变动信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id 示例：1563514751881838598 |
| accentityCode | string | 否 | 否 | 会计主体code 示例：012511 |
| code | string | 否 | 否 | 固定资产变动单编码(手工编码方式必传) 示例：BG090322 |
| vouchdate | string | 否 | 是 | 变动日期 格式yyyy-MM-DD 示例：2022-09-30 |
| remarks | object | 否 | 否 | 变动原因，为空时请传null |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| details | object | 是 | 是 | 基本信息变动 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetChange/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1563514751881838598",
		"accentityCode": "012511",
		"code": "BG090322",
		"vouchdate": "2022-09-30",
		"remarks": {
			"zh_CN": "测试"
		},
		"_status": "Insert",
		"details": [
			{
				"assetId": "1572351492465098759",
				"assetCode": "0302221020000052",
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
				"beginDate": "2021-03-01",
				"_status": "Insert",
				"assignments": {
					"afProportion": 55,
					"deltaProportion": 55,
					"deptId": "1741446322004688899",
					"costCenterId": "1741446322004688899",
					"profitCenterId": "1741446322004688899",
					"projectId": "1741446322004688899",
					"productId": "1741446322004688899",
					"deptCode": "101",
					"costCenterCode": "101",
					"profitCenterCode": "101",
					"projectCode": "101",
					"productCode": "101"
				},
				"bodies": {
					"scrapValueType": "0",
					"scrapValueRate": 1,
					"scrapValue": 2,
					"scrapValueDifference": 2,
					"fcOriValue": 12,
					"fcOriValueDifference": 12,
					"oriValue": 12,
					"accCurrtypeOriAmountDifference": 12,
					"extractedPeriod": 0,
					"deprMethodId": "1550290015006228502",
					"deprMethodCode": "432",
					"isDepr": true,
					"amortiAdjustDate": "2022-09-30",
					"accbookStartDate": "2022-09-30",
					"deprConvention": "1550290057955901443",
					"disposalConvention": "1550290057955901444",
					"lifeYear": 25,
					"lifeMonth": 1,
					"totalWorkload": 1,
					"totalWorkloadDifference": 1,
					"existingWorkload": 1,
					"existingWorkloadDifference": 1,
					"monthWorkload": 1,
					"monthWorkloadDifference": 1,
					"workloadUnit": {
						"zh_CN": "个"
					},
					"subjects": [
						{
							"subjectId": "1564985907040223235",
							"subjectCode": "101",
							"_status": "Insert"
						}
					],
					"oriCurrtypeCode": "23",
					"accbookCurrtypeCode": "23",
					"accbookCode": "23",
					"assetCategoryId": "1550290015006228502",
					"assetCategoryCode": "432",
					"assetSubCategoryId": "1550290015006228502",
					"assetSubCategoryCode": "432",
					"blnNewRule": true,
					"_status": "Insert",
					"subjectId": "12875412",
					"subjectCode": "1221"
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
| data | object | 否 | 返回固定资产变动信息 |
| id | string | 否 | 单据id 示例：1629396775637352454 |
| code | string | 否 | 变动单编码 示例：BG001003 |
| accentity | string | 否 | 会计主体id 示例：1572524545313079302 |
| remarks | object | 否 | 变动原因 |
| vouchdate | string | 否 | 变动日期 示例：2022-09-30 |
| verifyState | number |
| 小数位数:0,最大长度:5 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2 |
| createTime | string | 否 | 创建时间 示例：2023-01-05 10:44:20 |
| changeType | string | 否 | 变动类型 1基本信息变动 2核算信息变动 3分配信息变动 4资产类别变动 示例：2 |
| details | object | 是 | 固定资产变动单明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1629396775637352454",
		"code": "BG001003",
		"accentity": "1572524545313079302",
		"remarks": {
			"zh_CN": "变动1"
		},
		"vouchdate": "2022-09-30",
		"verifyState": 2,
		"createTime": "2023-01-05 10:44:20",
		"changeType": "2",
		"details": [
			{
				"changeId": "1701534814432657412",
				"id": "1701547991392321544",
				"assetId": "1701547166758600710",
				"assetCode": "0000230412003619",
				"tagno": "323",
				"snaphotId": "1701547982802386947",
				"addWayId": "1550289989236424710",
				"quantity": 1,
				"beginDate": "2022-08-01",
				"changeDetailType": "2",
				"changeContent": "核算信息变动：【账簿】主1：累计折旧:0-->1000;\n",
				"beforeName": {
					"zh_CN": "旧资产名称"
				},
				"afterName": {
					"zh_CN": "新资产名称"
				},
				"beforeSpecification": {
					"zh_CN": "旧规格"
				},
				"afterSpecification": {
					"zh_CN": "新规格"
				},
				"beforeMgntDeptId": "1550289997826359313",
				"afterMgntDeptId": "1550289997826359314",
				"beforeLocation": {
					"zh_CN": "旧存放地点"
				},
				"afterLocation": {
					"zh_CN": "新存放地点"
				},
				"calcChange": {
					"accbookId": "1694727299746234390",
					"beforeOriValue": 10000,
					"afterOriValue": 12000,
					"beforeDeprMethodId": "1550290015006228502",
					"afterDeprMethodId": "1550290015006228503",
					"beforeLifeYear": 10,
					"afterLifeYear": 12,
					"beforeScrapValueRate": 5,
					"afterScrapValueRate": 3,
					"beforeAssetCategoryId": "1550290015006228502",
					"afterAssetCategoryId": "1550290015006228503"
				},
				"asgmtChange": {
					"beforeDeptId": "1550289997826359313",
					"afterDeptId": "1550289997826359314",
					"beforeProjectId": "1550289997826359313",
					"afterProjectId": "1550289997826359314",
					"beforeUsageCostCenterId": "155028",
					"afterUsageCostCenterId": "155029",
					"beforeAsgmtRatio": 50,
					"afterAsgmtRatio": 60
				}
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


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

