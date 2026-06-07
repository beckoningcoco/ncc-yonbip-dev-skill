---
title: "位置保存"
apiId: "2300307732743847938"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Location"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Location]
platform_version: "BIP"
source_type: community-api-docs
---

# 位置保存

> `ContentType	application/json` 请求方式	POST | 分类: Location (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/location/save

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
| data | object | 是 | 否 | 数据data |
| pk_org | string | 否 | 是 | 业务单元id或编码 示例：19899882829910 |
| location_code | string | 否 | 否 | 位置编码 示例：20250101001 |
| location_name | object | 否 | 是 | 位置名称 |
| fk_parent | string | 否 | 否 | 父级位置主键 示例：19899882829910 |
| location_type | string | 否 | 是 | 1-运行位置，2-仓库位置 示例：1 |
| pk_icorg | string | 否 | 否 | 库存组织仅当位置类型为仓库位置时，可以录入，库存组织ID或编码， 示例：1999882828 |
| pk_warehouse | string | 否 | 否 | 仓库仅当位置类型为仓库位置时，可以录入，仓库ID或编码， 示例：CK001 |
| install_limit | string | 否 | 是 | 安装限制，0-不安装资产，1-安装一个资产，2-安装多个资产 示例：2 |
| memo | string | 否 | 否 | 备注 示例：测试位置 |
| enablestate | string | 否 | 是 | 启用状态 1-未启用 2-已启用 3-已停用 示例：2 默认值：2 |
| measurepoint | object | 是 | 否 | 测量点(如果有的话) |

## 3. 请求示例

Url: /yonbip/PFC/location/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "19899882829910",
			"location_code": "20250101001",
			"location_name": {
				"zh_CN": "八号楼",
				"en_US": "",
				"zh_TW": ""
			},
			"fk_parent": "19899882829910",
			"location_type": "1",
			"pk_icorg": "1999882828",
			"pk_warehouse": "CK001",
			"install_limit": "2",
			"memo": "测试位置",
			"enablestate": "2",
			"measurepoint": [
				{
					"pk_meas_items": "EM001",
					"measure_point_code": "",
					"measure_point_name": "用电量",
					"meas_item_explain": "八号楼用电量",
					"identifier": "01、02、03等",
					"work_upper": "",
					"work_lower": "",
					"warning_upper": "",
					"warning_lower": "",
					"pk_last_measpsn__name": "000003",
					"last_meas_result": "",
					"last_meas_time": "2023-11-11 11:11:11",
					"connect_config_code": "iot_002",
					"iot_device_name": "01网关",
					"iot_device_code": "01",
					"iot_property_name": "用电量",
					"start_number_time": "2024-05-29 00:00:00",
					"start_time": "00:00:00",
					"end_time": "23:59:59",
					"frequency": "1、10等正整数",
					"frequency_unit": "0",
					"range": 3,
					"process_no": "F-C-001",
					"memo": "",
					"enablestate": "2"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功！ |
| data | object | 否 | data |
| _realtype | string | 否 | _realtype |
| _entityName | string | 否 | _entityName 示例：ampub.equipbase.LocationVO |
| _keyName | string | 否 | _keyName |
| pk_org | string | 否 | pk_org 示例：1975228435580059658 |
| pk_org__code | string | 否 | pk_org__code 示例：1 |
| pk_org__name | string | 否 | pk_org__name 示例：hxx-全职能组织 |
| location_code | string | 否 | location_code 示例：LOC24050005 |
| location_name | object | 否 | location_name |
| fk_parent | string | 否 | fk_parent 示例：2005853974753181702 |
| fk_parent__location_name | string | 否 | fk_parent__location_name 示例：22 |
| location_type | number |
| 小数位数:0,最大长度:10 | 否 | location_type 示例：1 |
| install_limit | number |
| 小数位数:0,最大长度:10 | 否 | install_limit 示例：2 |
| parent | string | 否 | parent 示例：2005853974753181702 |
| enablestate | number |
| 小数位数:0,最大长度:10 | 否 | enablestate 示例：2 |
| level | number |
| 小数位数:0,最大长度:10 | 否 | level 示例：2 |
| memo | string | 否 | memo 示例：测试位置 |
| isEnd | boolean | 否 | isEnd 示例：false |
| measurepoint | object | 是 | measurepoint |
| _convert_measurepoint | string | 否 | _convert_measurepoint |
| _status | string | 否 | _status |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | id 示例：2007424403784597508 |
| qr_code | string | 否 | qr_code 示例：Location{2007424403784597508} |
| innercode | string | 否 | innercode 示例：4CN12961 |
| path | string | 否 | path 示例：4CN12961 |
| location_global | object | 否 | location_global |
| sysid | string | 否 | sysid 示例：AMBD |
| creator | string | 否 | creator 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| creator__name | string | 否 | creator__name 示例：昵称-haoxxia |
| creationtime | string | 否 | creationtime 示例：2024-05-28 19:15:58 |
| pubts | string | 否 | pubts 示例：2024-05-28 19:15:58 |
| errorDetail | string | 否 | errorDetail |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_realtype": "",
		"_entityName": "ampub.equipbase.LocationVO",
		"_keyName": "",
		"pk_org": "1975228435580059658",
		"pk_org__code": "1",
		"pk_org__name": "hxx-全职能组织",
		"location_code": "LOC24050005",
		"location_name": {
			"zh_CN": "测试位置HAHAH",
			"en_US": ""
		},
		"fk_parent": "2005853974753181702",
		"fk_parent__location_name": "22",
		"location_type": 1,
		"install_limit": 2,
		"parent": "2005853974753181702",
		"enablestate": 2,
		"level": 2,
		"memo": "测试位置",
		"isEnd": false,
		"measurepoint": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"frequency": 1,
				"frequency_unit": 0,
				"statistical_duration": 1,
				"statistical_unit": 2,
				"start_time": "00:00:00",
				"end_time": "23:59:59",
				"synchronous_state": 1,
				"enablestate": 2,
				"hasDefaultInit": true,
				"start_number_time": "2024-05-29 00:00:00",
				"pk_meas_items__item_name": "电表",
				"pk_meas_items": "PRESET02_0000LUT9Q1KVH9R6RM0000",
				"pk_meas_items__result_type": "1",
				"pk_meas_items__pk_measuredoc": "1971569905141022729",
				"pk_meas_items__pk_measuredoc__name": "千瓦时",
				"pk_meas_items__pk_measuredoc__precision": "2",
				"work_upper": "",
				"work_lower": "",
				"warning_upper": "",
				"warning_lower": "",
				"range": 3,
				"measure_point_name": "测量点1",
				"meas_item_explain": "测量点1",
				"identifier": "kw",
				"_status": "",
				"ttt_id": "rowId_11",
				"id": "2007424403784597509",
				"pk_location": "2007424403784597508",
				"main_id": "2007424403784597508",
				"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"creator__name": "昵称-haoxxia",
				"creationtime": "2024-05-28 19:15:58",
				"measure_point_code": "CLD0001",
				"pk_org": "1975228435580059658"
			}
		],
		"_convert_measurepoint": "",
		"_status": "",
		"resubmitCheckKey": "ampub_location_tree_add_665bf14f-b8da-4c1c-89fc-76b12aace105",
		"id": "2007424403784597508",
		"qr_code": "Location{2007424403784597508}",
		"innercode": "4CN12961",
		"path": "4CN12961",
		"location_global": {
			"zh_TW": "-/",
			"en_US": "-/-",
			"zh_CN": "22/测试位置HAHAH"
		},
		"sysid": "AMBD",
		"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"creator__name": "昵称-haoxxia",
		"creationtime": "2024-05-28 19:15:58",
		"pubts": "2024-05-28 19:15:58"
	},
	"errorDetail": ""
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

