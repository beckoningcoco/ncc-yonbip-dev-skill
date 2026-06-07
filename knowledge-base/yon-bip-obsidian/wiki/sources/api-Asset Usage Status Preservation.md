---
title: "资产使用状态保存"
apiId: "2300463365206573058"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Usage Status"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Usage Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产使用状态保存

> `ContentType	application/json` 请求方式	POST | 分类: Asset Usage Status (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/usagestate/save

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
| data | object | 是 | 否 | data |
| status_code | string | 否 | 是 | 使用状态编码 示例：如001，需要租户内唯一 |
| status_name | object | 否 | 是 | 使用状态名称 示例：如：维修中，需要租户内唯一 |
| status_type | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 状态类型 0：在用 1：封存 2：闲置 3：报废 4：处置 示例：0 |
| cbg_color | string | 否 | 否 | 背景颜色 示例：资产使用状态字段的背景颜色，如#FF0000 |
| cfg_color | string | 否 | 否 | 字体颜色 示例：资产使用状态字段的字体颜色，如#FF0000 |
| memo | string | 否 | 否 | 备注 示例：备注 |
| enablestate | string | 否 | 否 | 启用状态 1-未启用 2-已启用 3-已停用 示例：2 默认值：2 |

## 3. 请求示例

Url: /yonbip/PFC/usagestate/save?access_token=访问令牌
Body: {
	"data": [
		{
			"status_code": "如001，需要租户内唯一",
			"status_name": {
				"0": "如",
				"1": "：",
				"2": "维",
				"3": "修",
				"4": "中",
				"5": "，",
				"6": "需",
				"7": "要",
				"8": "租",
				"9": "户",
				"10": "内",
				"11": "唯",
				"12": "一",
				"zh_CN": "自定义状态1",
				"en_US": "",
				"zh_TW": ""
			},
			"status_type": 0,
			"cbg_color": "资产使用状态字段的背景颜色，如#FF0000",
			"cfg_color": "资产使用状态字段的字体颜色，如#FF0000",
			"memo": "备注",
			"enablestate": "2"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回Http状态码（200：成功，其他：失败） 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回的数据实体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 详细信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 错误的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"_entityName": "ampub.equipbase.StatusVO",
				"status_code": "9999",
				"status_name": {
					"zh_CN": "测试AAA",
					"en_US": "",
					"zh_TW": ""
				},
				"status_type": 2,
				"pre_flag": false,
				"memo": "测试AAAAA",
				"enablestate": 2,
				"id": "2002231023928606721",
				"sysid": "AMBD",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2024-05-21 19:19:29",
				"pubts": "2024-05-21 19:19:29"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	报错具体提示信息，例如：输入的长度不能超过40位


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

