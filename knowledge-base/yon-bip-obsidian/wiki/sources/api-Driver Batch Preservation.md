---
title: "司机批量保存V2"
apiId: "2230811614274125828"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Driver"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Driver]
platform_version: "BIP"
source_type: community-api-docs
---

# 司机批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Driver (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/driver/batchSave

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
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理 示例：add 默认值：add |
| data | object | 是 | 是 | 业务数据 |
| sourceUnique | string | 否 | 是 | 业务唯一标识 示例：2245416916851621895 |
| id | string | 否 | 否 | 主键ID 示例：2245416916851621895 |
| pk_carrier | string | 否 | 否 | 承运商id。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：2226832773753077761 |
| pk_carrier___code | string | 否 | 否 | 承运商编码。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：A123 |
| name | string | 否 | 是 | 姓名 示例：123rf |
| gender | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 性别。0：男，1：女 示例：0 |
| ymsenc_phone | string | 否 | 否 | 电话 示例：12345678901 |
| address | string | 否 | 否 | 联系地址 示例：北京市海淀区 |
| cartype | string | 否 | 否 | 准驾车型id。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：2245416916851621897 |
| cartype___code | string | 否 | 否 | 准驾车型编码。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：1 |
| loginname | string | 否 | 否 | 登录账号 示例：123rf |
| pwd | string | 否 | 否 | 密码 示例：123456 |
| benable | string | 否 | 否 | 启用状态。1：启用，2：停用。 示例：1 |
| remark | string | 否 | 否 | 备注 |
| carrierList | object | 是 | 否 | 可用承运商 |
| certificateList | object | 是 | 否 | 司机证件 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/driver/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"sourceUnique": "2245416916851621895",
			"id": "2245416916851621895",
			"pk_carrier": "2226832773753077761",
			"pk_carrier___code": "A123",
			"name": "123rf",
			"gender": 0,
			"ymsenc_phone": "12345678901",
			"address": "北京市海淀区",
			"cartype": "2245416916851621897",
			"cartype___code": "1",
			"loginname": "123rf",
			"pwd": "123456",
			"benable": "1",
			"remark": "",
			"carrierList": [
				{
					"carrierid": "2226832773753077761",
					"carrierid___code": "A123",
					"is_default": 0
				}
			],
			"certificateList": [
				{
					"licensetype": "1",
					"cardno": "3601112345420",
					"expirydate": "2027-04-23",
					"remark": "",
					"attachmentId": "20a48df2-ed25-44dc-adb8-af6d5e147acd"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功是返回200 示例：200 |
| success | boolean | 否 | 是否成功 示例：true |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：0 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"created": true,
				"sourceUnique": "124555",
				"targetUnique": "2227602792669249539",
				"id": "2227602792669249539"
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

