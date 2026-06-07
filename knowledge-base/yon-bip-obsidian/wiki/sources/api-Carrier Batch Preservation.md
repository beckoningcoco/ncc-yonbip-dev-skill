---
title: "承运商批量保存V2"
apiId: "2226385667632922626"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Carrier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Carrier]
platform_version: "BIP"
source_type: community-api-docs
---

# 承运商批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Carrier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/carrier/batchSave

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
| data | object | 是 | 否 | 业务数据 |
| code | string | 否 | 是 | 承运商编码 示例：A123 |
| name | string | 否 | 是 | 承运商名称 示例：A承运商 |
| shortname | string | 否 | 否 | 承运商简称 示例：AC |
| license | string | 否 | 否 | 营业执照 示例：AC242156 |
| legalperson | string | 否 | 否 | 法人 示例：张三 |
| legalpersonIdentity | string | 否 | 否 | 法人身份证 示例：110111195602040011 |
| contacts | string | 否 | 否 | 联系人 示例：张三 |
| contactsphone | string | 否 | 否 | 联系人电话 示例：13122223333 |
| email | string | 否 | 否 | 邮箱 示例：abbccc@yonyou.com |
| fax | string | 否 | 否 | 传真 示例：13122223333 |
| address | string | 否 | 否 | 地址 示例：北京市海淀区AABBCC |
| supplier | string | 否 | 否 | 关联供应商ID 示例：2013255131129708551 |
| supplier___code | string | 否 | 否 | 关联供应商编码 示例：112 |
| startbill | date |
| 格式:yyyy-MM-dd | 否 | 否 | 账单开始时间 示例：2024-09-12 |
| endbill | date |
| 格式:yyyy-MM-dd | 否 | 否 | 账单结束时间 示例：2025-09-12 |
| generatebill | date |
| 格式:yyyy-MM-dd | 否 | 否 | 账单生成时间 示例：2024-09-11 |
| benable | string | 否 | 否 | 启用状态，停用：0，启用：1。 示例：1 |
| remark | string | 否 | 否 | 备注 示例：备注 |
| transportlicence | string | 否 | 否 | 运输经营许可证 |
| dangerouslicence | string | 否 | 否 | 危险货物运输许可证 示例： |
| taxpayerlicence | string | 否 | 否 | 一般纳税人证 示例： |
| carrierRelationList | object | 是 | 否 | 承运关系 |
| id | string | 否 | 否 | 主键ID 示例：1554602256549016914 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：1554602256549016914 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/carrier/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"code": "A123",
			"name": "A承运商",
			"shortname": "AC",
			"license": "AC242156",
			"legalperson": "张三",
			"legalpersonIdentity": "110111195602040011",
			"contacts": "张三",
			"contactsphone": "13122223333",
			"email": "abbccc@yonyou.com",
			"fax": "13122223333",
			"address": "北京市海淀区AABBCC",
			"supplier": "2013255131129708551",
			"supplier___code": "112",
			"startbill": "2024-09-12",
			"endbill": "2025-09-12",
			"generatebill": "2024-09-11",
			"benable": "1",
			"remark": "备注",
			"transportlicence": "",
			"dangerouslicence": " ",
			"taxpayerlicence": " ",
			"carrierRelationList": [
				{
					"logistics_org": "2013255131129708551",
					"logistics_org___code": "1114"
				}
			],
			"id": "1554602256549016914",
			"sourceUnique": "1554602256549016914"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值，成功返回200 示例：200 |
| success | boolean | 否 | 是否成功 示例：true |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：0 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 返回结构体 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
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
				"sourceUnique": "2226833538257256455",
				"message": "java.lang.NullPointException: xxxx"
			}
		],
		"infos": [
			{
				"created": true,
				"sourceUnique": "2424652576772",
				"targetUnique": "2226833538257256455",
				"id": "2226833538257256455"
			}
		]
	},
	"displayCode": "000-525-000066",
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

