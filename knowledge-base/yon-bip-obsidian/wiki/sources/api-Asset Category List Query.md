---
title: "资产类别列表查询"
apiId: "2084236818774491143"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产类别列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/category/batchquery

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| page | object | 否 | 是 | 分页 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页条数 示例：10 默认值：10 |
| condition | object | 否 | 是 | 查询条件 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| isExtend | boolean | 否 | 是 | 是否扩展条件，默认值为true，若填simpleVOs不能修改isExtend，isExtend为false会全量查询数据 默认值：true |

## 3. 请求示例

Url: /yonbip/am/category/batchquery?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "category_name",
				"op": "like",
				"value1": "类别"
			}
		],
		"isExtend": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回http状态码(200:正常，其他：异常) 示例：200 |
| message | string | 否 | 返回的信息 示例：操作成功！ |
| data | object | 否 | 查询到的数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 第几页 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页数量 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 示例：1 |
| recordList | object | 是 | 资产类别数据 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"category_name": {
					"zh_TW": "",
					"zh_CN": "测试编码规则",
					"en_US": ""
				},
				"category_code": "000145646565786856786",
				"special_flag": true,
				"fk_parent": "1982187055693168647",
				"line_category": false,
				"assetBusiness": 2,
				"associate_fa_flag": true,
				"avg_use_life": 4,
				"design_life": 4,
				"parent": "1982187055693168647",
				"portrait_flag": 0,
				"memo": "备注1",
				"enablestate": 2,
				"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"creator__name": "昵称-haoxxia",
				"creationtime": "2024-03-07 16:45:05",
				"modifier": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"modifier__name": "昵称-haoxxia",
				"modifiedtime": "2024-03-18 10:45:59",
				"innercode": "26CC",
				"path": "1946488670492557320|",
				"name_pre_flag": false,
				"id": "1946488670492557320",
				"tenant": "0000LG25MNTF769SSI0000",
				"pubts": "2024-12-26 17:33:27",
				"level": 1,
				"isEnd": true,
				"category_global": {
					"zh_TW": "",
					"zh_CN": "测试编码规则",
					"en_US": ""
				},
				"inv_flag": false,
				"cooperate_flag": false,
				"sync_status": 0,
				"keyparts": [
					{
						"name": "456346",
						"memo": "36564",
						"pk_category": "1946488670492557320",
						"id": "1950826149400543239"
					}
				],
				"bodyvos": [
					{
						"param_index": 2,
						"classid__entity_name": "基本档案",
						"archive_name": "位置",
						"param_name": {
							"zh_TW": "",
							"zh_CN": "测试参数",
							"en_US": ""
						},
						"show_name": {
							"zh_TW": "",
							"zh_CN": "测试参数",
							"en_US": ""
						},
						"archive_domain": "ucf-amc-ambd",
						"pk_category": "1946488670492557320",
						"classid__entity_code": "BaseArchive",
						"archive_return": "location_name",
						"classid": "PRESET08_0000LG25MNTF769SSI0000",
						"archive_code": "ampub_location_ref",
						"nullflag": false,
						"id": "1950826149400543238",
						"pk_measuredoc": "",
						"pk_measuredoc__name": "",
						"input_length": "10",
						"input_digit": "",
						"default_value": "22"
					}
				],
				"attachgroup": [
					{
						"enablestate": 2,
						"code": "1",
						"name": "1",
						"level": 1,
						"mapId": "f31e68d2-aa4a-46d5-9c1b-e2c44d905cb5",
						"pk_category": "1946488670492557320",
						"sync_status": 0,
						"id": "1950826338379104265",
						"isEnd": false,
						"describe": "1",
						"attachmentId": ""
					}
				]
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-20

新增

返回参数 (86)

更新

返回参数 data

删除

返回参数 (79)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

