---
title: "固定资产调出批量保存并审核"
apiId: "1956856463965552647"
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

# 固定资产调出批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateOut/batchsaveandaudit

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
| sourceId | string | 否 | 是 | 来源单据唯一id 示例：1234567809 |
| accentity | string | 否 | 否 | 调出会计主体id，调出会计主体id和调出会计主体编码至少必填一个 示例：1525772228455038981 |
| accentity_code | string | 否 | 否 | 调出会计主体编码，调出会计主体编码与调出会计主体id同时存在时，以id为准 示例：accentity02 |
| vouchdate | string | 否 | 是 | 调出单日期，格式: yyyy-MM-dd 示例：2022-08-10 |
| reduceWayId | string | 否 | 否 | 减少方式id，减少方式id和减少方式编码至少有一个必填 示例：1848769256678752294 |
| reduceWayId_code | string | 否 | 否 | 减少方式编码，若减少方式id和减少方式编码都填了，以减少方式id为准 示例：01 |
| code | string | 否 | 否 | 调出编码，编码规则为手工编码时必填 示例：ZCDC000002 |
| remarks | object | 否 | 否 | 调出原因 |
| zh_CN | string | 否 | 否 | 调出原因-简体中文 示例：部门异动 |
| assetDtls | object | 是 | 否 | 固定资产调出明细 |
| assetId | string | 否 | 否 | 固定资产卡片id,系统参数-是否启用调拨申请管理，为否时固定资产卡片id和固定资产卡片编码至少必填一个 示例：1888568373644099589 |
| assetId_code | string | 否 | 否 | 固定资产卡片编码，固定资产卡片编码和固定资产卡片id同时存在时，以id为准 示例：9345454533454 |
| allocatePriceType | string | 否 | 是 | 调拨价格, 枚举(1:本币原值, 2:本币账面净值,3:本币账面价值,4:手工录入) 示例：1 |
| inAccentityId | string | 否 | 否 | 调入会计主体id，系统参数-是否启用调拨申请管理，为否时，id和编码不能同时为空 示例：123 |
| inAccentityId_code | string | 否 | 否 | 调入会计主体编码，系统参数-是否启用调拨申请管理，为否时，id和编码不能同时为空 示例：1234 |
| reduceWayId_code | string | 否 | 否 | 调入会计主体编码，调入会计主体编码和调入会计主体id同时存在时，以id为准 示例：123 |
| remarks | object | 否 | 否 | 备注 |
| details | object | 是 | 否 | 固定资产调出明细 |
| allocateSettleCurrtypeId | string | 否 | 否 | 调拨结算币种id,调拨价格为“手工录入”时，调拨结算币种id和调拨结算币种编码至少必填一个 示例：1525643705855773169 |
| settleAllocateAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 结算币调拨金额，调拨价格为“手工录入”时必填 示例：1222.33 |
| allocateSettleCurrtypeId_code | string | 否 | 否 | 调拨结算币种编码，调拨结算币种编码和调拨结算币种id同时存在时，以id为准 示例：CNY |
| assetId | string | 否 | 否 | 固定资产卡片id,卡片id和固卡片编码不能同时为空，都填时，以卡片id为准，如果填了子表特征，该字段需要填 示例：1888568373644099589 |
| assetId_code | string | 否 | 否 | 固定资产卡片编码,卡片id和固卡片编码不能同时为空，都填时，以卡片id为准 示例：9345454533454 |
| accbookId | string | 否 | 否 | 账簿ID, 账簿编码与ID不可同时为空, 同时传入以ID为准，请填写对应卡片的所有账簿 示例：1809115756560384020 |
| accbook_code | string | 否 | 否 | 账簿编码, 账簿ID与编码不可同时为空, 同时传入以ID为准，请填写对应卡片的所有账簿 示例：accbook1 |
| orgAllocateAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 组织币调拨金额，仅在组织币启用时录入，如果录入会反算出组织币汇率，也可以不填，按结算币调拨金额计算值 示例：1000.23 |
| accAllocateAmount | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 本币调拨金额，如果录入会反算出本币汇率，也可以不填，按结算币调拨金额计算值 示例：1000.23 |
| creator | string | 否 | 否 | 创建人ID 示例：3028835 |
| createTime | string | 否 | 否 | 创建时间, 格式: yyyy-MM-dd HH:mm:ss 示例：2024-05-12 12:00:00 |
| auditor | string | 否 | 否 | 审核人ID 示例：363477434 |
| auditTime | string | 否 | 否 | 审核时间, 格式:yyyy-MM-dd HH:mm:ss 示例：2024-03-10 12:00:00 |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/batchsaveandaudit?access_token=访问令牌
Body: [{
	"sourceId": "1234567809",
	"accentity": "1525772228455038981",
	"accentity_code": "accentity02",
	"vouchdate": "2022-08-10",
	"reduceWayId": "1848769256678752294",
	"reduceWayId_code": "01",
	"code": "ZCDC000002",
	"remarks": {
		"zh_CN": "部门异动"
	},
	"assetDtls": [
		{
			"assetId": "1888568373644099589",
			"assetId_code": "9345454533454",
			"allocatePriceType": "1",
			"inAccentityId": "123",
			"inAccentityId_code": "1234",
			"reduceWayId_code": "123",
			"remarks": {
				"zh_CN": "123"
			}
		}
	],
	"details": [
		{
			"allocateSettleCurrtypeId": "1525643705855773169",
			"settleAllocateAmount": 1222.33,
			"allocateSettleCurrtypeId_code": "CNY",
			"assetId": "1888568373644099589",
			"assetId_code": "9345454533454",
			"accbookId": "1809115756560384020",
			"accbook_code": "accbook1",
			"orgAllocateAmount": 1000.23,
			"accAllocateAmount": 1000.23
		}
	],
	"creator": "3028835",
	"createTime": "2024-05-12 12:00:00",
	"auditor": "363477434",
	"auditTime": "2024-03-10 12:00:00"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回生成固定资产调出信息 |
| success | object | 是 | 生成成功的数据 |
| failed | object | 是 | 生成失败的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1956863017997565954",
				"code": "ZCDC012587",
				"sourceId": "1234567809"
			}
		],
		"failed": [
			{
				"sourceId": "1234567808",
				"message": "卡片已经完全处置"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	处理过程中遇到未知错误	未填写必填的相关信息，比如固定资产调出明细子表数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-11

更新

请求说明

新增

请求参数 oriBillId

3	2025-04-15

新增

请求参数 orgAllocateAmount

新增

请求参数 accAllocateAmount

固定资产调出批量保存并审核：结算币种和结算金额补充手工录入逻辑，接口参数添加字段，固定资产调出明细子表details里添加参数orgAllocateAmount、accAllocateAmount，非必填


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

