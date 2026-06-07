---
title: "固定资产调入详情查询"
apiId: "1945587509155069952"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-In"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-In]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调入详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Transfer-In (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateIn/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id    示例: 1676456946972491779 |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateIn/detail?access_token=访问令牌&id=1676456946972491779

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产调入数据 |
| verifystate | number |
| 小数位数:0,最大长度:10 | 否 | 审核状态(枚举,0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| code | string | 否 | 调入编码 示例：ZCDR010032 |
| outAccentityId_name | string | 否 | 调出会计主体名称 示例：中艺(香港)有限公司 |
| creator_userName | string | 否 | 确认调入人 示例：测试管理员 |
| inAccentityId | string | 否 | 调入会计主体ID 示例：1525652227072458756 |
| FaBillAllocateInAssetList | object | 是 | 调入固定资产信息表体 |
| vouchdate | string | 否 | 调入日期 示例：2027-03-21 |
| allocatePriceType | string | 否 | 调拨价格(枚举,1:本币原值, 2:本币账面净值,3:本币账面价值,4:手工录入) 示例：1 |
| FaAllocateInDtlList | object | 是 | 固定资产调入明细表体 |
| oriBillNo | string | 否 | 调出编码 示例：ZCDC015007 |
| id | string | 否 | 主键 示例：1676456946972491779 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-03-20 12:36:58 |
| inAccentityId_name | string | 否 | 调入会计主体名称 示例：收入中台演示销售组织1 |
| outAccentityId | string | 否 | 调出会计主体ID 示例：1525772228455038981 |
| creator | string | 否 | 确认调入人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| allocateOutAssetId | string | 否 | 原固定资产ID 示例：1676258029863436293 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| createTime | string | 否 | 创建时间 示例：2023-03-09 16:20:31 |
| blnConfirmAllocate | boolean | 否 | 是否确认调入(枚举,true: 是, false: 否) 示例：false |
| remarks | object | 否 | 调入原因 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"verifystate": 0,
		"code": "ZCDR010032",
		"outAccentityId_name": "中艺(香港)有限公司",
		"creator_userName": "测试管理员",
		"inAccentityId": "1525652227072458756",
		"FaBillAllocateInAssetList": [
			{
				"assetId_assetModel": "茅台",
				"assetId_specification": "飞天",
				"assetId_beginTime": "2022-07-01",
				"quantity": 1,
				"assetId_name": "调拨资产12",
				"assetId_code": "0005230309068559",
				"unitId": "1529342892468862979",
				"id": "1676456946972491781",
				"assetId_id": "1676258029863436293",
				"unitId_name": "米"
			}
		],
		"vouchdate": "2027-03-21",
		"allocatePriceType": "1",
		"FaAllocateInDtlList": [
			{
				"accbookCurrtypeId_name": "人民币2jklifhd",
				"assetId_assetCategoryId_name": "测试线程缓存",
				"deprConventionId_name": "惯例01",
				"assetCalcId_accbook_name": "A pet",
				"orgAccumDeprAmount": 0,
				"assetCalcId_accbook_code": "A pet",
				"accruedPeriod": 0,
				"accCurrtypeOriAmount": 300000,
				"accAccumImpAmount": 2000,
				"id": "1676456946972491782",
				"orgNetAmount": 0,
				"disposalConventionId_name": "惯例01",
				"assetCalcId_accbook_id": "1526191958421143557",
				"accNetAmount": 295000,
				"accbookCurrtypeId_moneyDigit": 8,
				"accbookCurrtypeId_priceDigit": 8,
				"blnFirstAccbook": true,
				"lifeMonth": 3,
				"accNetValue": 297000,
				"createAssetDate": "2022-08-01",
				"allocateSettleCurrtypeId": "1525643705855773169",
				"accbookId_name": "A pet",
				"orgNetValue": 0,
				"allocateSettleCurrtypeId_name": "人民币2jklifhd",
				"yearOrMonth": "3/3",
				"allocateSettleCurrtypeId_moneyDigit": 8,
				"accAccumDeprAmount": 3000,
				"beginDate": "2022-07-01",
				"reduceWayId": "1668951586093665325",
				"orgAccumImpAmount": 0,
				"assetCalcId_accbook": "1526191958421143557",
				"settleAllocateAmount": 300000,
				"accbookCurrtypeId": "1525643705855773169"
			}
		],
		"oriBillNo": "ZCDC015007",
		"id": "1676456946972491779",
		"pubts": "2023-03-20 12:36:58",
		"inAccentityId_name": "收入中台演示销售组织1",
		"outAccentityId": "1525772228455038981",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"allocateOutAssetId": "1676258029863436293",
		"verifyState": 0,
		"createTime": "2023-03-09 16:20:31",
		"blnConfirmAllocate": false,
		"remarks": {
			"zh_CN": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	单据详情查询失败，未获取到单据id	查看请求单据是否存在或请求用户是否有权限


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

