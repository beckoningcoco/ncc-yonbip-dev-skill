---
title: "车型批量保存V2"
apiId: "2226963701512011783"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Vehicle Model"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle Model]
platform_version: "BIP"
source_type: community-api-docs
---

# 车型批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle Model (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/cartype/batchSave

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
| vcode | string | 否 | 是 | 车型编码 示例：C612 |
| vname | string | 否 | 是 | 车型名称 示例：MPV C612 |
| vdesc | string | 否 | 否 | 车型描述 示例：aa |
| vtype | string | 否 | 是 | 类型。微型货车：1，轻型货车：2，中型货车：3，重型货车：4，其他：5 示例：2 |
| vuse | string | 否 | 是 | 用途。普货：1，危货：2，其他：3 示例：2 |
| nload | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 载重 示例：34.24 |
| nlength | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 车长 示例：2.30 |
| nwidth | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 车宽 示例：1.51 |
| nheight | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 车高 示例：1.96 |
| nvolume | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 载货体积(m³) 示例：7.62 |
| volumetric | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 容积系数(方) 示例：13.58 |
| maxvolumetric | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 最大容积(方) 示例：23.24 |
| vunit | string | 否 | 否 | 计量单位ID 示例：1554602256549019654 |
| vunit___code | string | 否 | 否 | 计量单位编码 示例：KGM |
| benable | string | 否 | 是 | 启用状态，0：停用，1：启用。 示例：1 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：1554602256549016914 |
| id | string | 否 | 否 | 主键id 示例：1554602256549019123 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/cartype/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"vcode": "C612",
			"vname": "MPV C612",
			"vdesc": "aa",
			"vtype": "2",
			"vuse": "2",
			"nload": 34.24,
			"nlength": 2.3,
			"nwidth": 1.51,
			"nheight": 1.96,
			"nvolume": 7.62,
			"volumetric": 13.58,
			"maxvolumetric": 23.24,
			"vunit": "1554602256549019654",
			"vunit___code": "KGM",
			"benable": "1",
			"sourceUnique": "1554602256549016914",
			"id": "1554602256549019123"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值，成功返回200 示例：200 |
| success | boolean | 否 | 是否成功 示例：true |
| data | object | 否 | 调用成功返回的数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：0 |
| messages | string | 是 | 失败信息 |
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
			""
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

