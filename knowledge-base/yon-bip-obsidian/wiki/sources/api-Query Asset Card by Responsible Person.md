---
title: "根据责任人查询资产卡片"
apiId: "5a30ed9f195346bda3062c61ab046bdf"
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

# 根据责任人查询资产卡片

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/aimEquipCard/getEquipInfoByStaff

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
| commonVOs | object | 是 | 否 | 查询条件组 |
| itemName | string | 否 | 否 | 条件项，查询条件，值为id（人员主键）、code（人员编码）、mobile（人员手机号）、email（人员邮箱），四个条件为或的关系 示例：id |
| value1 | string | 是 | 否 | 条件值，条件对应的值，值为在列表中的关系 示例：["2643468970497024","2659044463137280","2680865636651520"] |

## 3. 请求示例

Url: /yonbip/am/aimEquipCard/getEquipInfoByStaff?access_token=访问令牌
Body: {
	"commonVOs": [
		{
			"itemName": "id",
			"value1": [
				"2643468970497024",
				"2659044463137280",
				"2680865636651520"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功！！ |
| data | object | 否 | 响应数据 |
| count | long | 否 | 查询条数 示例：1 |
| infos | object | 是 | 数据集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！！",
	"data": {
		"count": 1,
		"infos": [
			{
				"pk_ownerorg": "",
				"pk_ownerorg__name": "likun-OrgName-All",
				"pk_usedorg": "",
				"pk_usedorg__name": "likun-OrgName-All",
				"equip_code": "likun-testCard-EM",
				"equip_name": "likun-testCard-EM",
				"pk_used_status__status_name": "封存",
				"start_used_date": "2021-12-02 00:00:00",
				"spec": "规格0106",
				"model": "型号0106",
				"pk_category__category_name": "LIKUNTEST-工程设备",
				"pk_priority__priority_name": "关键资产",
				"pk_mandept": "",
				"pk_mandept__name": "likun-DP.Name-02",
				"pk_manager": "",
				"pk_manager__name": "李坤-员工-01（自己）",
				"pk_usedept": "",
				"pk_usedept__name": "likun-DP.Name-04",
				"pk_user": "",
				"pk_user__name": "李坤-员工-01（自己）",
				"pk_location__location_name": "LIKUNTEST-数字体验馆",
				"origin_value": "100",
				"accu_dep": "",
				"new_value": "",
				"service_month": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

