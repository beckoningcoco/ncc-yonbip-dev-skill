---
title: "固定资产合并详情查询"
apiId: "1899829743649816580"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Consolidation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产合并详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Consolidation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetMerge/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 单据id    示例: 10292883774 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetMerge/detail?access_token=访问令牌&id=10292883774

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产合并单 |
| verifystate | long | 否 | 审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| code | string | 否 | 合并单编码 示例：HB002507 |
| FixedAssetMergeDtlAssetList | object | 是 | 固定资产合并卡片明细信息 |
| creator_userName | string | 否 | 创建人名称 示例：唐 |
| accentity_name | string | 否 | 会计主体名称 示例：固定资产盘点 |
| accentity | string | 否 | 会计主体ID 示例：1852258943573164042 |
| verifyState | long | 否 | 审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| vouchdate | string | 否 | 单据日期 示例：2023-01-25 |
| createTime | string | 否 | 创建时间 示例：2023-12-20 15:19:36 |
| additionId | string | 否 | 新增单ID 示例：1888556820287979526 |
| id | string | 否 | 合并单ID 示例：1888556820287979531 |
| FixedAssetMergeDtlAccbookList | object | 是 | 固定资产合并账簿明细信息 |
| remarks | object | 否 | 合并原因 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": 0,
		"code": "HB002507",
		"FixedAssetMergeDtlAssetList": [
			{
				"quantity": 1,
				"reduceWayId": "1780959462799442266",
				"assetId_name": "新增固资",
				"reduceWayId_name": "合并减少",
				"assetId": "1852972767133564930",
				"assetId_code": "231102005003",
				"id": "1888556820287979532"
			}
		],
		"creator_userName": "唐",
		"accentity_name": "固定资产盘点",
		"accentity": "1852258943573164042",
		"verifyState": 0,
		"vouchdate": "2023-01-25",
		"createTime": "2023-12-20 15:19:36",
		"additionId": "1888556820287979526",
		"id": "1888556820287979531",
		"FixedAssetMergeDtlAccbookList": [
			{
				"yearDeprAmount": 0,
				"assetId_name": "新增固资",
				"accbook_name": "PANDIAN-YB",
				"assetId": "1852972767133564930",
				"curYearImpAmount": 0,
				"accCurrtypeOriAmount": 1000000,
				"accumImpAmountass": 0,
				"id": "1888556820287979534",
				"netAmount": 1000000,
				"netValue": 1000000,
				"accbook": "1852950759698071571",
				"assetCategoryId_categoryId_name": "职工宿舍",
				"blnBelongToBeforeCard": false,
				"accAccumDeprAmount": 0,
				"accbook_code": "202311-01",
				"asset_code": "231102005003",
				"assetCategoryId": "1852952280139563042",
				"assetCategoryId_categoryId_fullname": "房屋及建筑物.职工宿舍",
				"scrapValueAmount": 50000
			}
		],
		"remarks": {
			"zh_CN": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

