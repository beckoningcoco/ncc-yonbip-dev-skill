---
title: "收款协议批量保存V4"
apiId: "2201176460175081478"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Agreement"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款协议批量保存V4

> `ContentType	application/json` 请求方式	POST | 分类: Collection Agreement (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/receiveagreement/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| insertAutoApplyRange | boolean | 否 | 否 | 适用范围是否自动分配，新增数据时有效。true-根据所属组织计算适用范围，和传入的适用范围合并后作为最终结果，false-传入的适用范围即是最终结果。 示例：true 默认值：true |
| data | object | 是 | 否 | 请求体 |
| id | string | 否 | 否 | 收款协议主键 示例：1672031094834200582 |
| code | string | 否 | 是 | 编码 示例：00000001 |
| name | object | 否 | 是 | 收款协议名称,根据租户开通的语种传入，当前为开通中英繁情况下传入格式 |
| instalment | boolean | 否 | 否 | 是否分期收款，true-是 false-否 示例：false |
| oadayConfirmType | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 出账日确定方式，0-按月，1-按周 示例：0 默认值：0 |
| orgId | string | 否 | 否 | 管理组织主键，与管理组织编码二选一，必填 示例：666666 |
| orgId___code | string | 否 | 否 | 管理组织编码，与管理组织主键二选一，必填 示例：global00 |
| receivableDates | object | 是 | 否 | 收款账期 |
| expiredayConfirmType | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 到期日确定方式，0-按月，1-按周 示例：0 |
| rec_apply_range | object | 是 | 否 | 适用范围 |
| order | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 排序 示例：0 |
| sourceUnique | string | 否 | 是 | 源系统唯一 |
| preReceiveType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 预收折算方式，0-先到先用 1-比例折算，非分期付款时，固定传0。分期付款时可传0,1或者不传 示例：0 |
| comment | string | 否 | 否 | 说明 示例：收款协议说明 |
| enableStartDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 有效期起始时间yyyy-MM-DD 示例：2023-12-18 |
| enableEndDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 有效期截止时间yyyy-MM-DD 示例：2023-12-18 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/receiveagreement/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"insertAutoApplyRange": true,
	"data": [
		{
			"id": "1672031094834200582",
			"code": "00000001",
			"name": {
				"zh_TW": "收款协议01",
				"en_US": "ReceiveAgreemnet01",
				"zh_CN": "收款协议01"
			},
			"instalment": false,
			"oadayConfirmType": 0,
			"orgId": "666666",
			"orgId___code": "global00",
			"receivableDates": [
				{
					"settleWay": "1672030940203843590",
					"settleWay___code": "12",
					"receivePercent": 100,
					"accountType": 0,
					"controlLink": 0,
					"preReceive": false,
					"receiveStartBase": "1604976699624129617",
					"receiveStartBase___code": "NotSet",
					"accountUnit": 0,
					"accountDay": 30,
					"delayMonths": 0,
					"delayDays": 0,
					"deposit": false,
					"receiveName": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"order": 0,
					"controlOppt": 0,
					"controlMode": 0,
					"fixedoaday": 0,
					"fixedoaday1": 4,
					"fixedoaday2": 11,
					"fixedoaday3": 13,
					"fixedoaday4": 19,
					"fixedexpireday": 0,
					"fixedexpireday1": 3,
					"fixedexpireday2": 8,
					"fixedexpireday3": 12,
					"fixedexpireday4": 15
				}
			],
			"expiredayConfirmType": 0,
			"rec_apply_range": [
				{
					"rangeOrgId___code": "GBCO"
				}
			],
			"order": 0,
			"sourceUnique": "",
			"preReceiveType": 0,
			"comment": "收款协议说明",
			"enableStartDate": "2023-12-18",
			"enableEndDate": "2023-12-18"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：9 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：1 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
}

## 6. 业务异常码

000-525-000066

传入的数据列表为空或存在空对象，请检查代码

000-525-000067

执行批量操作时，数据必须包含sourceUnique


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

