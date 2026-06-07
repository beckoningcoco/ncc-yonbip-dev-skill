---
title: "固定资产拆分批量保存并审核"
apiId: "1958996457187966984"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Splitting"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Splitting]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产拆分批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Splitting (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaSplit/batchSaveAndAudit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| sourceId | string | 否 | 否 | 来源单据号 示例：1 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| reduceWayId | string | 否 | 否 | 减少方式id,减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| reduceWayId_code | string | 否 | 否 | 减少方式编码,减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| addWayId | string | 否 | 否 | 增加方式id,增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| addWayId_code | string | 否 | 否 | 增加方式编码,增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| code | string | 否 | 否 | 拆分单编码（手工编码方式时必输） 示例：1 |
| splitAssetCount | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 拆分数量 示例：1 |
| vouchdate | string | 否 | 是 | 单据日期(yyyy-MM-dd) 示例：2024-04-04 |
| splitWay | string | 否 | 是 | 拆分方式 :0-水平拆分,1-自定义拆分 示例：0 |
| blnRetainAsset | boolean | 否 | 是 | 是否保留原卡片 示例：false |
| remarksDTO | object | 否 | 否 | 拆分原因 |
| zh_CN | string | 否 | 否 | 中文 |
| assetId | string | 否 | 否 | 拆分前固定资产卡片id,拆分前固定资产卡片id和拆分前固定资产卡片编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| assetId_code | string | 否 | 否 | 拆分前固定资产卡片编码,拆分前固定资产卡片id和拆分前固定资产卡片编码不能同时为空，id和编码同时存在，以id为准 示例：1 |
| faSplitDtlDTOList | object | 是 | 是 | 拆分后记录按账薄分组,多账薄多条,单账薄1条 |
| accbookId | string | 否 | 否 | 账簿id,账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：1 |
| accbookId_code | string | 否 | 否 | 账簿编码，账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：1 |
| blnCurPeriodDeprRetain | boolean | 否 | 否 | 折旧是否归属原卡片(一般折旧账薄必输) 示例：false |
| faSplitAfterDtlDTOList | object | 是 | 是 | 拆分后记录(平均拆分+保留原卡场景下,条数=拆分数量-1,其余场景,条数=拆分数量;保留原卡场景下,默认第1条记录为原卡拆分后记录) |
| creator | string | 否 | 否 | 创建人ID 示例：3028835 |
| createTime | string | 否 | 否 | 创建时间, 格式: yyyy-MM-dd HH:mm:ss 示例：2024-05-12 12:00:00 |
| auditor | string | 否 | 否 | 审核人ID 示例：363477434 |
| auditTime | string | 否 | 否 | 审核时间, 格式:yyyy-MM-dd HH:mm:ss 示例：2024-03-10 12:00:00 |

## 3. 请求示例

Url: /yonbip/EFI/FaSplit/batchSaveAndAudit?access_token=访问令牌
Body: [{
	"sourceId": "1",
	"accentity": "1",
	"accentity_code": "1",
	"reduceWayId": "1",
	"reduceWayId_code": "1",
	"addWayId": "1",
	"addWayId_code": "1",
	"code": "1",
	"splitAssetCount": 1,
	"vouchdate": "2024-04-04",
	"splitWay": "0",
	"blnRetainAsset": false,
	"remarksDTO": {
		"zh_CN": ""
	},
	"assetId": "1",
	"assetId_code": "1",
	"faSplitDtlDTOList": [
		{
			"accbookId": "1",
			"accbookId_code": "1",
			"blnCurPeriodDeprRetain": false,
			"faSplitAfterDtlDTOList": [
				{
					"assetCode": "1",
					"assetNameDTO": {
						"zh_CN": ""
					},
					"quantity": 2,
					"orgOriValueAmount": 100,
					"accOriAmount": 10
				}
			]
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回值 示例：操作成功 |
| data | object | 否 | 返回信息 |
| success | object | 是 | 成功记录 |
| failed | object | 是 | 失败记录 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1",
				"code": "1",
				"sourceId": "1",
				"billData": {
					"vouchdate": "2024-07-01",
					"assetCode": "littlepp0062240417000144",
					"reduceWayId": "1848769256678752301",
					"assetId": "1976879876267311112",
					"blnRetainAsset": false,
					"accentity": "1525772228455038981",
					"splitAssetCount": 4,
					"remarks": "API测试",
					"splitWay": "0",
					"splitAfterDtl": [
						{
							"assetCode": "littlepp0062240717000410",
							"assetId": "2044261238755033101",
							"assetName": "split测试分配科目001",
							"id": "2044261255934902281"
						}
					]
				}
			}
		],
		"failed": [
			{
				"sourceId": "1",
				"message": "会计主体不允许为空"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	补充会计主体入参


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-10

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

