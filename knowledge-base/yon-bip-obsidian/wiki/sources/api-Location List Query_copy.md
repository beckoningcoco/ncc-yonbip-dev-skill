---
title: "位置详情查询"
apiId: "2388599667516506115"
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

# 位置详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Location (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/location/detail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 是 | 位置ID 默认值：234545324534545422 |

## 3. 请求示例

Url: /yonbip/PFC/location/detail?access_token=访问令牌
Body: {
	"id": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回http状态码(200:正常，其他：异常) 示例：200 |
| message | string | 否 | 返回的信息 示例：操作成功！ |
| data | object | 否 | 查询到的数据 |
| id | string | 否 | 主键 示例：2007447339017437188 |
| pk_org | string | 否 | 业务单元 示例：1985761782828367878 |
| pk_org__code | string | 否 | 业务单元编码 示例：WUHF会计主体 |
| pk_org__name | string | 否 | 业务单元名称 示例：WUHF会计主体 |
| location_code | string | 否 | 位置编码 示例：0000 |
| location_name | object | 否 | 位置名称 |
| fk_parent | string | 否 | 父手工码 示例：1908442441525493765 |
| fk_parent__location_code | string | 否 | 父位置编码 示例：test2 |
| fk_parent__location_name | string | 否 | 父位置 示例：测试位置 |
| location_global | string | 否 | 全级次位置 |
| location_type | number |
| 小数位数:0,最大长度:10 | 否 | 位置类型 示例：1 |
| pk_icorg | string | 否 | 库存组织版本主键 |
| pk_icorg__code | string | 否 | 库存组织编码 |
| pk_icorg__name | string | 否 | 库存组织 |
| pk_warehouse | string | 否 | 仓库主键 |
| pk_warehouse__code | string | 否 | 仓库编码 |
| pk_warehouse__name | string | 否 | 仓库 |
| install_limit | string | 否 | 安装限制 |
| pk_cost_center | string | 否 | 成本中心主键 |
| pk_cost_center__code | string | 否 | 成本中心编码 |
| pk_cost_center__name | string | 否 | 成本中心名称 |
| qr_code | string | 否 | 二维码 |
| memo | string | 否 | 备注 示例：01 |
| enablestate | number |
| 小数位数:0,最大长度:10 | 否 | 启用状态 示例：2 |
| innercode | string | 否 | 内部编码 示例：85ZQ |
| path | string | 否 | 路径 示例：85ZQ |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 层级 示例：1 |
| isEnd | string | 否 | 是否末级 |
| sort | string | 否 | 排序号 |
| relationEquipCard | string | 否 | 添加资产 |
| pubts | string | 否 | 时间戳 示例：2024-06-17 18:22:36 |
| creator | string | 否 | 创建人ID 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b |
| creator__name | string | 否 | 创建人 示例：昵称-武慧峰 |
| modifier | string | 否 | 修改人 示例：1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16 |
| modifiedtime | string | 否 | 修改时间 示例：2024-06-17 18:22:36 |
| modifier__name | string | 否 | 修改人名称 示例：昵称-郝小侠 |
| creationtime | string | 否 | 创建时间 示例：2024-05-28 20:00:28 |
| failurelocation | object | 是 | 故障记录 |
| measurepoint | object | 是 | 测量点 |
| relation_equip_card | object | 是 | 关联资产 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"id": "2007447339017437188",
		"pk_org": "1985761782828367878",
		"pk_org__code": "WUHF会计主体",
		"pk_org__name": "WUHF会计主体",
		"location_code": "0000",
		"location_name": {
			"zh_CN": "成本中心导入有效性"
		},
		"fk_parent": "1908442441525493765",
		"fk_parent__location_code": "test2",
		"fk_parent__location_name": "测试位置",
		"location_global": "",
		"location_type": 1,
		"pk_icorg": "",
		"pk_icorg__code": "",
		"pk_icorg__name": "",
		"pk_warehouse": "",
		"pk_warehouse__code": "",
		"pk_warehouse__name": "",
		"install_limit": "",
		"pk_cost_center": "",
		"pk_cost_center__code": "",
		"pk_cost_center__name": "",
		"qr_code": "",
		"memo": "01",
		"enablestate": 2,
		"innercode": "85ZQ",
		"path": "85ZQ",
		"level": 1,
		"isEnd": "",
		"sort": "",
		"relationEquipCard": "",
		"pubts": "2024-06-17 18:22:36",
		"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"creator__name": "昵称-武慧峰",
		"modifier": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
		"modifiedtime": "2024-06-17 18:22:36",
		"modifier__name": "昵称-郝小侠",
		"creationtime": "2024-05-28 20:00:28",
		"failurelocation": [
			{
				"id": "",
				"pk_org": "",
				"pk_org__name": "",
				"bill_code": "112233",
				"bill_status": 0,
				"pk_recorder": "",
				"pk_recorder__name": "",
				"record_date": "",
				"memo": "",
				"pk_equip": "",
				"pk_equip__equip_code": "",
				"pk_equip__equip_name": "",
				"pk_equip__pk_category": "",
				"pk_ownerorg": "",
				"pk_ownerorg__name": "",
				"pk_mandept": "",
				"pk_mandept__name": "",
				"pk_manager": "",
				"pk_manager__name": "",
				"pk_usedorg": "",
				"pk_usedorg__name": "",
				"pk_usedept": "",
				"pk_usedept__name": "",
				"pk_user": "",
				"pk_user__name": "",
				"trouble_location": "",
				"failure_time": "",
				"pk_failure_detect": "",
				"pk_failure_detect__name": "",
				"pk_failure_type": "",
				"pk_failure_type__name": "",
				"failure_scene": "",
				"pk_failure_symptom": "",
				"pk_failure_symptom__name": "",
				"failure_expound": "",
				"intend_repair_time": "",
				"pk_maintainorg": "",
				"pk_maintainorg__name": "",
				"restore_time": "",
				"pk_failure_reason": "",
				"pk_failure_reason__name": "",
				"pk_service_step": "",
				"pk_service_step__name": "",
				"deal_result": "",
				"direct_loss": "",
				"indirect_loss": "",
				"pk_project": "",
				"pk_project__name": "",
				"pk_wo": "",
				"pk_wo__pk_wo_status__name": "",
				"validity": "",
				"description": "",
				"influence": "",
				"effect": "",
				"treat_type": "",
				"direct_clause": "",
				"indirect_clause": "",
				"primary_clause": "",
				"minor_clause": "",
				"manage_clause": "",
				"close_flag": "",
				"failure_reason_name": "",
				"failure_reason_name__name": "",
				"coordinate": "",
				"coordinate_desc": "",
				"merged_pk_failure_b": "",
				"bill_gen_type": "",
				"summary_flag": ""
			}
		],
		"measurepoint": [
			{
				"id": "",
				"main_id": "",
				"pk_location": "",
				"pk_equip": "",
				"pk_meas_items__item_name": "",
				"pk_meas_items": "",
				"pk_meas_items__result_type": "",
				"pk_meas_items__pk_measuredoc": "",
				"pk_meas_items__pk_measuredoc__name": "",
				"pk_meas_items__pk_measuredoc__precision": "",
				"measure_point_code": "",
				"measure_point_name": "",
				"meas_item_explain": "",
				"iot_device_name": "",
				"iot_device_code": "",
				"connect_config_code": "",
				"iot_property_name": "",
				"process_no": "",
				"identifier": "",
				"work_upper": "",
				"work_lower": "",
				"warning_upper": "",
				"warning_lower": "",
				"pk_last_measpsn": "",
				"pk_last_measpsn__name": "",
				"last_meas_result": "",
				"last_meas_time": "",
				"frequency": "",
				"frequency_unit": "",
				"range": "",
				"start_number_time": "",
				"statistical_duration": "",
				"statistical_unit": "",
				"start_time": "",
				"end_time": "",
				"synchronous_state": "",
				"cause_synchronization": "",
				"last_sync_time": "",
				"the_last_time": "",
				"memo": "",
				"enablestate": "",
				"creator": "",
				"creator__name": "",
				"creationtime": "",
				"modifier": "",
				"modifier__name": "",
				"modifiedtime": ""
			}
		],
		"relation_equip_card": [
			{
				"id": "",
				"pk_org": "",
				"pk_org__name": "",
				"equip_code": "",
				"equip_name": "",
				"pk_category": "",
				"pk_category__category_name": "",
				"pk_used_status": "",
				"pk_used_status__status_name": "",
				"pk_priority": "",
				"pk_priority__priority_name": "",
				"spec": "",
				"model": "",
				"start_used_date": "",
				"pk_mandept": "",
				"pk_mandept__name": "",
				"pk_usedept": "",
				"pk_usedept__name": "",
				"pk_user": "",
				"pk_user__name": "",
				"verifystate": "",
				"billmaker": "",
				"billmaker__name": "",
				"billmaketime": "",
				"auditor": "",
				"auditor__name": "",
				"audittime": "",
				"modifier": "",
				"modifier__name": "",
				"modifiedtime": ""
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

