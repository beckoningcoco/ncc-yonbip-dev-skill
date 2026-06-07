---
title: "资产卡片保存"
apiId: "361c831734c240ed80630d7e2d7258b2"
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

# 资产卡片保存

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/aimEquipCard/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 资产卡片参数对象 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pk_org | string | 否 | 是 | 资产组织id或编码 示例：1986894553420032 |
| equip_code | string | 否 | 否 | 资产编码（按照编码规则处理） 示例：2020112502 |
| equip_name | muti_lang | 否 | 是 | 资产名称 |
| spec | string | 否 | 否 | 规格 示例：a |
| model | string | 否 | 否 | 型号 示例：b |
| pk_priority | string | 否 | 否 | 关键程度id或编码 示例：PRESET01_ohgfkm6i |
| pk_used_status | string | 否 | 是 | 资产状态id或编码 示例：PRESET01_ohgfkm6i |
| pk_category | string | 否 | 是 | 资产类别id或编码 示例：9903 |
| start_used_date | string | 否 | 否 | 投用日期 示例：2020-11-25 |
| pk_supplier | string | 否 | 否 | 供应商，id或编码 示例：3333333 |
| facturer_name | string | 否 | 否 | 生产厂商 示例：索尼公司 |
| precoding | string | 否 | 否 | 出厂编码 示例：XH1080P |
| borrow_flag | boolean | 否 | 否 | 借用标记 示例：false |
| fa_flag | boolean | 否 | 否 | 固定资产核算 示例：false |
| special_flag | boolean | 否 | 否 | 特种设备 示例：false |
| pk_ownerorg | string | 否 | 是 | 资产管理组织id或编码 示例：1986894553420032 |
| pk_ownerunit | string | 否 | 是 | 所有权id或编码 示例：YYJT10001 |
| pk_mandept | string | 否 | 是 | 管理部门，id或code |
| pk_manager | string | 否 | 否 | 管理人，id或编码 示例：ZS10001 |
| pk_usedorg | string | 否 | 是 | 使用单位，id或编码 示例：YYJT10001 |
| pk_usedept | string | 否 | 否 | 使用部门，id或编码 示例：RZB1001 |
| pk_user | string | 否 | 否 | 责任人，id或编码 示例：ZS10001 |
| pk_jobmngfil | string | 否 | 否 | 项目，id或编码 示例：XM1001 |
| pk_specialty | string | 否 | 否 | 专业,id或编码 示例：01 |
| pk_location | string | 否 | 否 | 位置，id或编码 |
| map_location | string | 否 | 否 | 资产坐标位置 示例：sdafadfasdf |
| lat | string | 否 | 否 | 纬度 示例：102.989821 |
| lng | string | 否 | 否 | 精度 示例：90.9893223 |
| pk_icorg | string | 否 | 否 | 库存组织，id或编码 示例：YYJT10001 |
| pk_material | string | 否 | 否 | 物料id或编码 示例：2013848593240320 |
| pk_material_sku | string | 否 | 否 | 物料sku 示例：SKU100 |
| pk_material_batchno | string | 否 | 否 | 批次号 示例：201110220001 |
| serial_num | string | 否 | 否 | 序列号 示例：aaaaa |
| pk_fiorg | string | 否 | 否 | 会计主体，id或编码 示例：YYJT10001 |
| transi_type | string | 否 | 否 | 交易类型 默认值：4A00-01 |
| _status | string | 否 | 是 | 状态Insert目前只支持新增数据 示例：Insert |
| spare_part | object | 是 | 否 | 零部件 |
| special_asset | object | 是 | 否 | 特种设备 |
| modelData | object | 是 | 否 | 技术参数对象 |
| measurepoint | object | 是 | 否 | 测量点对象 |
| rentobject | object | 是 | 否 | 租赁对象 |
| subvos | object | 是 | 否 | 子资产 |

## 3. 请求示例

Url: /yonbip/am/aimEquipCard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"pk_org": "1986894553420032",
			"equip_code": "2020112502",
			"equip_name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"spec": "a",
			"model": "b",
			"pk_priority": "PRESET01_ohgfkm6i",
			"pk_used_status": "PRESET01_ohgfkm6i",
			"pk_category": "9903",
			"start_used_date": "2020-11-25",
			"pk_supplier": "3333333",
			"facturer_name": "索尼公司",
			"precoding": "XH1080P",
			"borrow_flag": false,
			"fa_flag": false,
			"special_flag": false,
			"pk_ownerorg": "1986894553420032",
			"pk_ownerunit": "YYJT10001",
			"pk_mandept": "",
			"pk_manager": "ZS10001",
			"pk_usedorg": "YYJT10001",
			"pk_usedept": "RZB1001",
			"pk_user": "ZS10001",
			"pk_jobmngfil": "XM1001",
			"pk_specialty": "01",
			"pk_location": "",
			"map_location": "sdafadfasdf",
			"lat": "102.989821",
			"lng": "90.9893223",
			"pk_icorg": "YYJT10001",
			"pk_material": "2013848593240320",
			"pk_material_sku": "SKU100",
			"pk_material_batchno": "201110220001",
			"serial_num": "aaaaa",
			"pk_fiorg": "YYJT10001",
			"transi_type": "",
			"_status": "Insert",
			"spare_part": [
				{
					"pk_material": "WL10001",
					"ass_unit": "1001",
					"ass_num": 1,
					"_status": "Insert",
					"memo": "备注信息"
				}
			],
			"special_asset": [
				{
					"check_period_num": 0,
					"check_period_unit": 1,
					"pre_check_date": "2021-11-22",
					"next_check_date": "2021-11-22",
					"check_content": "平整度检查",
					"_status": "Insert"
				}
			],
			"modelData": [
				{
					"tech_showvalue": "q",
					"tech_index": 1
				}
			],
			"measurepoint": [
				{
					"pk_meas_items": "002",
					"measure_point_name": "测量点",
					"meas_item_explain": "测量点",
					"identifier": "测量标识符",
					"work_upper": 20,
					"work_lower": 10,
					"warning_upper": 15,
					"warning_lower": 11,
					"memo": "",
					"_status": "Insert"
				}
			],
			"rentobject": [
				{
					"rent_object": "楼房",
					"rent_object_explain": "楼房",
					"spec": "三室一厅",
					"model": "三室一厅",
					"building_number": "5",
					"unit": "3",
					"floor": "12",
					"memo": "楼房",
					"_status": "Insert"
				}
			],
			"subvos": [
				{
					"pk_equip": "1524242636064948227",
					"_status": "Insert"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功！！ |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | 消息 |
| infos | object | 是 | 详细信息 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"bill_type_src": "origin",
				"borrow_flag": true,
				"pk_usedept": "2364596592136448",
				"special_asset": [
					{
						"pre_check_date": "2021-12-02 00:00:00",
						"_status": "",
						"yTenantId": "0000KRMV35GL665MOG0000",
						"pk_org": "2364595800790272",
						"next_check_date": "2022-12-02 00:00:00",
						"check_period_num": 12,
						"check_content": "检验内容",
						"id": "2592982444708354",
						"tenant": "0000KRMV35GL665MOG0000"
					}
				],
				"precoding": "出厂编码",
				"source": "origin",
				"pk_location": "2403088792047872",
				"spec": "规格0106",
				"pk_org": "2364595800790272",
				"pk_supplier": 2404610114703616,
				"pk_material": 2404282925437184,
				"equip_code": "EAM-202201060109",
				"equip_coordinate": [
					{
						"latitude": 44,
						"type": "point",
						"yTenantId": "0000KRMV35GL665MOG0000",
						"pk_org": "2364595800790272",
						"pk_equip": "2592982444691968",
						"id": "2592982444708355",
						"tenant": "0000KRMV35GL665MOG0000",
						"group": "1",
						"longitude": 55
					}
				],
				"pk_icorg": "2364595800790272",
				"map_location": "北京市海淀区用友产业园",
				"epc": "450000002592982444298752",
				"model": "型号0106",
				"id": "2592982444691968",
				"creator__name": "YonSuite默认用户",
				"pk_used_status": "PRESET01_0000KRMV35GL665MOG0000",
				"lat": 44,
				"tenant": "0000KRMV35GL665MOG0000",
				"facturer_name": "生产厂商",
				"branchcode": "4J2BYSFC",
				"lng": 55,
				"audittime": "2022-01-06 17:58:09",
				"isWfControlled": false,
				"special_flag": true,
				"equip_name": {
					"zh_CN": "资产名称-0106"
				},
				"billmaker__name": "YonSuite默认用户",
				"yTenantId": "0000KRMV35GL665MOG0000",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"pk_specialty": "2540502420377856",
				"creationtime": "2022-01-06 17:58:08",
				"assign_flag": true,
				"equip_extend": {
					"print_sum": 0,
					"coordinate_group": "{\"type\":\"point\",\"groups\":[{\"longitude\":55,\"latitude\":44}]}",
					"id": "2592982444708356",
					"tenant": "0000KRMV35GL665MOG0000",
					"yTenantId": "0000KRMV35GL665MOG0000",
					"pk_org": "2364595800790272"
				},
				"verifystate": 0,
				"pk_usedorg": "2364595800790272",
				"pk_material_batchno": "PC0001",
				"pk_priority": "PRESET02_0000KRMV35GL665MOG0000",
				"pk_user": "2366166969520384",
				"innercode": "4J2BYSFC",
				"pk_mandept": "2364596592136448",
				"pk_ownerorg": "2364595800790272",
				"modelData": [
					{
						"tech_showvalue": "888",
						"tech_index": 1
					}
				],
				"pk_fiorg": "2364595800790272",
				"spare_part": [
					{
						"num": 170,
						"memo": "memo1",
						"change_rate": 17,
						"ass_unit": 2403491837956352,
						"pk_org": "2364595800790272",
						"pk_material": 2590289209364736,
						"unit": 2363277698027776,
						"ass_num": 10,
						"pk_equip": "2592982444691968",
						"id": "2592982444708352"
					}
				],
				"start_used_date": "2021-12-02 00:00:00",
				"fa_flag": true,
				"pubts": "2022-01-06 17:58:09",
				"pk_ownerunit": "2364595800790272",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaketime": "2022-01-06 17:58:08",
				"auditor": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"auditor__name": "YonSuite默认用户",
				"pk_category": "2402914023821568",
				"serial_num": "serial123",
				"bill_status": 1,
				"pk_jobmngfil": "2543254674265088",
				"pk_material_sku": 2404282925437185,
				"pk_manager": "2366166969520384",
				"measurepoint": [
					{
						"id": "1539781913668485127",
						"pk_meas_items": "1536160483120775168",
						"measure_point_name": "测量点",
						"meas_item_explain": "测量点",
						"identifier": "测量点",
						"work_upper": 20,
						"work_lower": 10,
						"warning_upper": 15,
						"warning_lower": 11,
						"memo": "测量点",
						"pk_equip": "1539781913668485126",
						"pk_org": "1535430690862006274"
					}
				],
				"rentobject": [
					{
						"id": "1539781913668485128",
						"rent_object": "楼房",
						"rent_object_explain": "楼房",
						"spec": "三室一厅",
						"model": "三室一厅",
						"building_number": "5",
						"unit": "3",
						"floor": "12",
						"memo": "",
						"pk_equip": "1539781913668485126",
						"pk_org": "1535430690862006274"
					}
				],
				"subvos": [
					{
						"pk_equip": "1524242636064948227",
						"fk_parent": "1542089719836311562",
						"pk_org": "1535430690862006274"
					}
				]
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

1	2025-10-27

更新

请求参数 start_used_date

更新

返回参数 bill_status


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

