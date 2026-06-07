---
title: "资产类别列表详情查询"
apiId: "2167430584313839617"
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

# 资产类别列表详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/category/query

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
| condition | object | 否 | 是 | 查询条件 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| isExtend | boolean | 否 | 是 | 是否扩展条件，默认值为true，若填simpleVOs不能修改isExtend，isExtend为false会全量查询数据 默认值：true |
| page | object | 否 | 是 | 分页 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页条数 示例：2 默认值：10 |

## 3. 请求示例

Url: /yonbip/am/category/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "category_code",
				"op": "eq",
				"value1": "0003"
			}
		],
		"isExtend": true
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回http状态码(200:正常，其他：异常) 示例：200 |
| message | string | 否 | 返回的信息 示例：操作成功！ |
| data | object | 否 | 查询到的数据 |
| category_code | string | 否 | 资产类别编码 示例：000145646565786856786 |
| category_name | object | 否 | 资产类别名称 |
| special_flag | boolean | 否 | 特种设备 示例：true |
| fk_parent | string | 否 | 父类别主键 示例：1982187055693168647 |
| line_category | boolean | 否 | 线性类别 示例：false |
| assetBusiness | number |
| 小数位数:0,最大长度:10 | 否 | 资产业务分类 示例：2 |
| associate_fa_flag | boolean | 否 | 固定资产核算 示例：true |
| avg_use_life | number |
| 小数位数:0,最大长度:10 | 否 | 平均使用寿命（月） 示例：4 |
| design_life | number |
| 小数位数:0,最大长度:10 | 否 | 设计寿命（月） 示例：4 |
| parent | string | 否 | 父类别主键 示例：1982187055693168647 |
| portrait_flag | number |
| 小数位数:0,最大长度:10 | 否 | 资产画像 示例：0 |
| memo | string | 否 | 备注 示例：备注1 |
| enablestate | number |
| 小数位数:0,最大长度:10 | 否 | 启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：2 |
| creator | string | 否 | 创建人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| creator__name | string | 否 | 创建人 示例：昵称-haoxxia |
| creationtime | string | 否 | 创建时间 示例：2024-03-07 16:45:05 |
| modifier | string | 否 | 最后修改人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| modifier__name | string | 否 | 最后修改人 示例：昵称-haoxxia |
| modifiedtime | string | 否 | 最后修改时间 示例：2024-03-18 10:45:59 |
| innercode | string | 否 | 内部编码 示例：26CC |
| path | string | 否 | 路径 示例：1946488670492557320| |
| name_pre_flag | boolean | 否 | 下级名称继承标志 示例：false |
| id | string | 否 | 资产类别主键 示例：1946488670492557320 |
| tenant | string | 否 | 租户 示例：0000LG25MNTF769SSI0000 |
| pubts | string | 否 | 时间戳 示例：2024-12-26 17:33:27 |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 层级 示例：1 |
| isEnd | boolean | 否 | 是否末级 示例：true |
| category_global | object | 否 | 全级次资产类别 |
| inv_flag | boolean | 否 | 是否库存管理标记 示例：false |
| cooperate_flag | boolean | 否 | 协同管理 示例：false |
| sync_status | number |
| 小数位数:0,最大长度:10 | 否 | 同步状态 0-已同步 1-未同步 2-未同步 示例：0 |
| keyparts | object | 是 | 资产部位 |
| bodyvos | object | 是 | 技术参数 |
| attachgroup | object | 是 | 附件分组 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"category_code": "000145646565786856786",
		"category_name": {
			"zh_TW": "",
			"zh_CN": "测试编码规则",
			"en_US": ""
		},
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
					"zh_CN": "测试基本档案",
					"en_US": ""
				},
				"show_name": {
					"zh_CN": "测试基本档案",
					"zh_TW": "",
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
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

