---
title: "固定资产调出详情查询"
apiId: "1899707371441618949"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-Out"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-Out]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调出详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateOut/detail

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
| id | string | query | 否 | 单据id    示例: 1209039845 |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/detail?access_token=访问令牌&id=1209039845

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产调出单 |
| verifystate | long | 否 | 审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：2 |
| code | string | 否 | 调出单编码 示例：ZCDC002502 |
| auditor_name | string | 否 | 审核人 示例：唐审核 |
| creator_userName | string | 否 | 创建人 示例：唐创建 |
| allocateRequestId | string | 否 | 调拨申请单ID 示例：1795242290629312512 |
| inAccentityId | string | 否 | 调入会计主体ID 示例：1789807481966821384 |
| accentity_name | string | 否 | 调出会计主体名称 示例：0125 |
| accentity | string | 否 | 调出会计主体ID 示例：1794969671868350472 |
| vouchdate | string | 否 | 单据日期 示例：2023-08-16 |
| allocatePriceType | string | 否 | 调拨价格, 枚举(1:本币原值, 2:本币账面净值,3:本币账面价值,4:手工录入) 示例：2 |
| modifyTime | string | 否 | 修改时间 示例：2023-09-21 13:30:23 |
| busiPostStatus | string | 否 | 过账状态(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：2 |
| allocate_request_code | string | 否 | 调拨申请单编码 示例：DBSQ000003 |
| id | string | 否 | 主键 示例：1821703438116847617 |
| inAccentityId_name | string | 否 | 调入会计主体名称 示例：第一食品 |
| accentity_code | string | 否 | 调出会计主体编码 示例：0125 |
| verifyState | long | 否 | 审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：2 |
| auditTime | string | 否 | 审核时间 示例：2023-10-13 13:37:50 |
| createTime | string | 否 | 创建时间 示例：2023-09-21 13:29:21 |
| inAccentityId_code | string | 否 | 调入会计主体编码 示例：01 |
| FaAllocateOutAssetList | object | 是 | 固定资产调出单卡片明细信息 |
| FaAllocateOutDtlList | object | 是 | 固定资产调出单明细信息 |
| remarks | object | 否 | 调出原因 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": 2,
		"code": "ZCDC002502",
		"auditor_name": "唐审核",
		"creator_userName": "唐创建",
		"allocateRequestId": "1795242290629312512",
		"inAccentityId": "1789807481966821384",
		"accentity_name": "0125",
		"accentity": "1794969671868350472",
		"vouchdate": "2023-08-16",
		"allocatePriceType": "2",
		"modifyTime": "2023-09-21 13:30:23",
		"busiPostStatus": "2",
		"allocate_request_code": "DBSQ000003",
		"id": "1821703438116847617",
		"inAccentityId_name": "第一食品",
		"accentity_code": "0125",
		"verifyState": 2,
		"auditTime": "2023-10-13 13:37:50",
		"createTime": "2023-09-21 13:29:21",
		"inAccentityId_code": "01",
		"FaAllocateOutAssetList": [
			{
				"quantity": 1,
				"assetId_name": "弃审测试",
				"assetId": "1795121395889864707",
				"assetId_code": "0202230816000038",
				"id": "1821703704404819974"
			}
		],
		"FaAllocateOutDtlList": [
			{
				"accRateTypeId": "0000LKMAE85K35S5J90000",
				"allocateSettleCurrtypeId_id": "1780959454188011553",
				"assetCalcId": "1795121395889864712",
				"accbook_name": "1234",
				"accruedPeriod": 1,
				"accAccumImpAmount": 0,
				"id": "1821703704404819973",
				"accNetAmount": 40000,
				"orgAllocateAmount": 0,
				"lifeMonth": 0,
				"accNetValue": 40000,
				"createAssetDate": "2023-08-16",
				"allocateSettleCurrtypeId": "1780959454188011553",
				"assetCategoryId_name": "房屋及建筑物.办公楼",
				"accAccumDeprAmount": 0,
				"accbookId": "1794985202485821461",
				"assetCategoryId": "1780959548702982260",
				"disposalConventionId": "1789819464910372865",
				"settleAllocateAmount": 40000,
				"accRateTypeId_name": "基准汇率",
				"accbookCurrtypeId": "1780959454188011553",
				"deprDonventionId": "1789819464910372865",
				"accbookCurrtypeId_name": "人民币",
				"deprConventionId_name": "基准期间分摊惯例",
				"reduceWayId_name": "调拨调出",
				"accRate": 1,
				"assetId": "1795121395889864707",
				"reduceWayId_code": "20",
				"accCurrtypeOriAmount": 40000,
				"orgNetAmount": 0,
				"disposalConventionId_name": "基准期间分摊惯例",
				"orgNetValue": 0,
				"lifeYear": 25,
				"beginDate": "2023-08-16",
				"reduceWayId": "1780959462799442267",
				"accAllocateAmount": 40000,
				"accRateOps": 1
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

999	当前单据被删除或没有权限	查看请求单据是否存在或请求用户是否有权限


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-18

新增

返回参数 accRateOps

2	2025-06-26

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

