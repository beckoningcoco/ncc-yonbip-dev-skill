---
title: "货位保存"
apiId: "cf4d1ccd68a2476bba64be6b0f62e936"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Storage Bin File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Storage Bin File]
platform_version: "BIP"
source_type: community-api-docs
---

# 货位保存

> `ContentType	application/json` 请求方式	POST | 分类: Storage Bin File (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/goodsposition/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 请求数据 |
| code | string | 否 | 是 | 货位编码 示例：huowei1 |
| name | object | 否 | 是 | 货位名称 |
| erpCode | string | 否 | 否 | erp编码 示例：testhuowei1 |
| warehouseId_name | string | 否 | 是 | 货位所属仓库编码 示例：eee |
| parent_name | string | 否 | 否 | 上级货位名称 |
| level | long | 否 | 否 | 货位层级 示例：1 |
| isEnd | boolean | 否 | 否 | 是否末级货位，true：是，false：不是 示例：true |
| stopstatus | boolean | 否 | 否 | true：停用，false：启用 示例：false |
| _status | string | 否 | 否 | Insert：新增，Update：修改 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/goodsposition/save?access_token=访问令牌
Body: {
	"data": {
		"code": "huowei1",
		"name": {
			"zh_CN": "testoo",
			"en_US": "testoo",
			"zh_TW": ""
		},
		"erpCode": "testhuowei1",
		"warehouseId_name": "eee",
		"parent_name": "",
		"level": 1,
		"isEnd": true,
		"stopstatus": false,
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| successCountAI | long | 否 | 成功条数 示例：0 |
| failCountAI | long | 否 | 失败条数 示例：0 |
| count | long | 否 | 总操作条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 请求结果信息 |
| infos | object | 是 | 保存的实体信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "huowei1",
				"name": {
					"zh_CN": "testoo",
					"en_US": "testoo",
					"zh_TW": "",
					"__orginSheetName": "GoodsPosition(+2+)",
					"__rowNum": "1"
				},
				"erpCode": "testhuowei1",
				"warehouseId": 1916524028399872,
				"warehouseId_name": "eee",
				"level": 1,
				"isEnd": true,
				"stopstatus": false,
				"id": 2063352916087040,
				"isEnabled": true,
				"creator": "u8c_vip@163.com",
				"creatorId": 1430419077140736,
				"createTime": "2020-12-28 14:31:08",
				"createDate": "2020-12-28 14:31:08",
				"pubts": "2020-12-29 04:31:08",
				"tenant": 1292161350684928
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

