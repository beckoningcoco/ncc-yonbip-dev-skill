---
title: "银行网点批量保存V7"
apiId: "2183195639720968193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Branch"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Branch]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行网点批量保存V7

> `ContentType	application/json` 请求方式	POST | 分类: Bank Branch (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/bankDot/batchSave

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
| data | object | 是 | 否 | 请求体 |
| id | string | 否 | 否 | 主键ID 示例：2211575684096589833 |
| code | string | 否 | 是 | 编码 示例：01000002 |
| name | object | 否 | 是 | 名称，根据租户开通的语种传入，当前为开通中英繁情况下传入格式 |
| bank | string | 否 | 否 | 银行类别主键，与bank___code二选一录入即可，默认id有值时，code字段不生效 示例：2179513899263459335 |
| bank___code | string | 否 | 否 | 银行类别编码，与bank二选一录入即可，deptid为空时，按code匹配银行类别档案 示例：313 |
| country | string | 否 | 否 | 国家主键，与country___code二选一录入即可，默认id有值时，code字段不生效 示例：1001Z01000000005J1WB |
| country___code | string | 否 | 否 | 国家编码，与country二选一录入即可，deptid为空时，按code匹配国家档案 示例：CN |
| detail_address | object | 否 | 否 | 详细地址 |
| IBAN | string | 否 | 否 | IBAN 示例：1121212 |
| linenumber | string | 否 | 否 | 联行号 示例：305393000028 |
| swiftCode | string | 否 | 否 | swift码 示例：BKCHCNBJ |
| enable | number |
| 小数位数:0,最大长度:11 | 否 | 否 | 状态，1:启用、2:停用 示例：1 |
| sourceUnique | string | 否 | 是 | 源系统主键ID 示例：2211575684096589833 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/bankDot/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"id": "2211575684096589833",
			"code": "01000002",
			"name": {
				"zh_CN": "北京银行股份有限公司金汉绿港支行",
				"en_US": "Bank of Beijing Co., Ltd. Jinhan Lvgang Branch",
				"zh_TW": "北京銀行股份有限公司金漢綠港支行"
			},
			"bank": "2179513899263459335",
			"bank___code": "313",
			"country": "1001Z01000000005J1WB",
			"country___code": "CN",
			"detail_address": {
				"province": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
				"province___code": "110000000000",
				"city": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"city___code": "110100000000",
				"district": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
				"district___code": "110101000000",
				"addressone": {
					"zh_CN": "地址1",
					"en_US": "address1",
					"zh_TW": "地址1"
				},
				"addresstwo": {
					"zh_CN": "地址2",
					"en_US": "address2",
					"zh_TW": "地址2"
				},
				"addressthree": {
					"zh_CN": "地址3",
					"en_US": "address3",
					"zh_TW": "地址3"
				},
				"addressfour": {
					"zh_CN": "地址4",
					"en_US": "address4",
					"zh_TW": "地址4"
				},
				"postcode": "100026"
			},
			"IBAN": "1121212",
			"linenumber": "305393000028",
			"swiftCode": "BKCHCNBJ",
			"enable": 1,
			"sourceUnique": "2211575684096589833"
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

2	2025-05-19

新增

请求参数 (24)

银行网点批量保存


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

