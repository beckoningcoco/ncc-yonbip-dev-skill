---
title: "设备卡片保存"
apiId: "01c62394345043efa84ac0646756d184"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 设备卡片保存

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/aimEquipCardAss/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 设备卡片参数对象 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pk_org | string | 否 | 否 | 设备主组织id或code 示例：1986894553420032 |
| equip_code | string | 否 | 否 | 设备编码 示例：2020112502 |
| equip_name | muti_lang | 否 | 否 | 设备名称 |
| map_location | string | 否 | 否 | 设备坐标位置 示例：sdafadfasdf |
| spec | string | 否 | 否 | 规格 示例：a |
| model | string | 否 | 否 | 型号 示例：b |
| pk_priority | string | 否 | 否 | 关键程度id或priority_code 示例：PRESET01_ohgfkm6i |
| pk_category | string | 否 | 否 | 设备类别id或category_code 示例：9903 |
| pk_used_status | string | 否 | 否 | 设备状态id或status_code 示例：PRESET01_ohgfkm6i |
| start_used_date | string | 否 | 否 | 投用日期 示例：2020-11-25 |
| facturer_name | string | 否 | 否 | 品牌 示例：c |
| pk_material | string | 否 | 否 | 物料id或code 示例：2013848593240320 |
| serial_num | string | 否 | 否 | 序列号 示例：aaaaa |
| customer | string | 否 | 否 | 客户id或code 示例：2015583619682560 |
| install_address | string | 否 | 否 | 安装具体地址 示例：具体地址 |
| manufacture_date | string | 否 | 否 | 生产日期 示例：2020-11-25 |
| purchase_date | string | 否 | 否 | 购买日期 示例：2020-11-25 |
| _status | string | 否 | 否 | 状态，目前只支持Insert，不支持更新 示例：Insert 默认值：Insert |
| install_location | string | 否 | 否 | 安装地点id或code 示例：110101000000 |
| modelData | object | 是 | 否 | 技术参数对象 |

## 3. 请求示例

Url: /yonbip/am/aimEquipCardAss/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"pk_org": "1986894553420032",
			"equip_code": "2020112502",
			"equip_name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"map_location": "sdafadfasdf",
			"spec": "a",
			"model": "b",
			"pk_priority": "PRESET01_ohgfkm6i",
			"pk_category": "9903",
			"pk_used_status": "PRESET01_ohgfkm6i",
			"start_used_date": "2020-11-25",
			"facturer_name": "c",
			"pk_material": "2013848593240320",
			"serial_num": "aaaaa",
			"customer": "2015583619682560",
			"install_address": "具体地址",
			"manufacture_date": "2020-11-25",
			"purchase_date": "2020-11-25",
			"_status": "Insert",
			"install_location": "110101000000",
			"modelData": [
				{
					"tech_showvalue": "q",
					"tech_index": 1
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码（200：成功，其他：失败） 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | object | 是 | 返回详细信息 |
| infos | object | 是 | 数据详细信息 |
| failInfos | object | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"pk_org": "1653986425502695431",
				"equip_code": "1653986425502695431",
				"equip_name": {
					"zh_CN": "导入资产卡片"
				},
				"map_location": "用友中区",
				"spec": "1080P",
				"model": "1090C",
				"pk_priority": "PRESET01_0000L6VWE12DH6JBPJ0000",
				"pk_category": "1604356532199751707",
				"pk_used_status": "PRESET01_0000L6VWE12DH6JBPJ0000",
				"start_used_date": "2023-04-04 00:00:00",
				"facturer_name": "台式机",
				"pk_material": 1585770894459928600,
				"serial_num": "普通设备",
				"customer": 1557390566603358200,
				"install_address": "北京/北京市/东城区",
				"manufacture_date": "2023-04-04 00:00:00",
				"purchase_date": "2023-04-04 00:00:00",
				"install_location": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
				"modelData": [
					{
						"tech_showvalue": "测试",
						"tech_index": 4
					}
				],
				"bill_type": "4A00",
				"transi_type": "4A00-AS",
				"bill_status": 1,
				"epc": "450001695598654222499845",
				"id": "1695598654222499846",
				"isWfControlled": false,
				"verifystate": 0
			}
		],
		"failInfos": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	报错具体提示信息，例如：输入的长度不能超过40位


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求说明

更新

请求参数 (22)

更新

返回参数 (38)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

