---
title: "仓库批量保存V7"
apiId: "2173570609418076166"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Warehouse"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Warehouse]
platform_version: "BIP"
source_type: community-api-docs
---

# 仓库批量保存V7

> `ContentType	application/json` 请求方式	POST | 分类: Warehouse (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/warehouse/batchSave

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
| matchRule | string | 否 | 否 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 否 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| data | object | 是 | 否 | 业务数据 |
| joinStockQuery | boolean | 否 | 否 | 参与可用量查询，true：是，false：否 示例：false |
| stockCheckType | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 可用控制方式，0：按业务参数，1：允许超可用库存出库，2：不允许超可用库存出库 示例：0 |
| countCost | boolean | 否 | 否 | 计算成本，true：是，false：否 示例：false |
| isSubcontractW | boolean | 否 | 否 | 委外仓，true：是，false：否 示例：false |
| isGoodsPositionStock | boolean | 否 | 否 | 货位记存量，true：是，false：否 示例：false |
| eStore | boolean | 否 | 否 | 电商仓，true：是，false：否 示例：false |
| bWMS | boolean | 否 | 否 | WMS仓 true:是、false:否 示例：false |
| wStore | boolean | 否 | 否 | 门店仓 true:是、false:否 示例：false |
| code | string | 否 | 是 | 仓库编码 示例：q |
| isInvertedScour | boolean | 否 | 否 | 倒冲仓，true：是，false：否 示例：false |
| isGoodsPosition | boolean | 否 | 否 | 货位管理，true：是，false：否 示例：false |
| iSerialManage | boolean | 否 | 否 | 序列号严格管理，true：是，false：否 示例：false |
| bMRP | boolean | 否 | 否 | 计划可用, bMRP：true:是、false:否 示例：false |
| iUsed | string | 否 | 否 | 状态,enable：已启用，disable：已停用 示例：enable |
| isWasteWarehouse | boolean | 否 | 否 | 废品仓，true：是，false：否 示例：false |
| isCarSales | boolean | 否 | 否 | 车销仓，true：是、false：否 示例：false |
| stocks | object | 是 | 否 | 仓库库存组织，填写该参数则该参数子参数都必填 |
| department___code | string | 否 | 否 | 负责部门编码 示例：ds |
| department | string | 否 | 否 | 负责部门id 示例：2211575684096589833 |
| org___code | string | 否 | 否 | 主库存组织编码 示例：a |
| org | string | 否 | 否 | 主库存组织id 示例：2211575684096589833 |
| ownerorg___code | string | 否 | 否 | 所属组织编码 示例：a |
| ownerorg | string | 否 | 否 | 所属组织id 示例：2211575684096589833 |
| regionCode | string | 否 | 否 | 地区编码 示例：a |
| longitude | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 经度 示例：1 |
| latitude | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 纬度 示例：1 |
| address | string | 否 | 否 | 详细地址 示例：1 |
| linkman | string | 否 | 否 | 联系人 示例：1 |
| phone | string | 否 | 否 | 联系电话 示例：1 |
| erpCode | string | 否 | 否 | 仓库外部编码 示例：1 |
| operator___code | string | 否 | 否 | 负责人编码 示例：1 |
| operator | string | 否 | 否 | 负责人id 示例：2211575684096589833 |
| country___code | string | 否 | 否 | 国家/地区编码 示例：1 |
| country | string | 否 | 否 | 国家/地区id 示例：2211575684096589833 |
| vendor | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 委外供应商id 示例：2211575684096589833 |
| vendor___code | string | 否 | 否 | 委外供应商编码 示例：1 |
| isConsignment | boolean | 否 | 否 | 寄售仓，true：是、false：否 示例：false |
| consignmentCustomer | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 寄售客户id 示例：2211575684096589833 |
| consignmentCustomer___code | string | 否 | 否 | 寄售客户编码 示例：1 |
| isPDAStorage | boolean | 否 | 否 | PDA仓储作业，true：是、false：否 示例：false |
| name | object | 否 | 是 | 仓库名称 |
| id | string | 否 | 否 | id 示例：2211575684096589833 |
| sourceUnique | string | 否 | 是 | 来源系统id 示例：2211575684096589833 |

## 3. 请求示例

Url: /yonbip/digitalModel/warehouse/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"joinStockQuery": false,
			"stockCheckType": 0,
			"countCost": false,
			"isSubcontractW": false,
			"isGoodsPositionStock": false,
			"eStore": false,
			"bWMS": false,
			"wStore": false,
			"code": "q",
			"isInvertedScour": false,
			"isGoodsPosition": false,
			"iSerialManage": false,
			"bMRP": false,
			"iUsed": "enable",
			"isWasteWarehouse": false,
			"isCarSales": false,
			"stocks": [
				{
					"org": "2211575684096589833",
					"org___code": "000",
					"isDefault": false
				}
			],
			"department___code": "ds",
			"department": "2211575684096589833",
			"org___code": "a",
			"org": "2211575684096589833",
			"ownerorg___code": "a",
			"ownerorg": "2211575684096589833",
			"regionCode": "a",
			"longitude": 1,
			"latitude": 1,
			"address": "1",
			"linkman": "1",
			"phone": "1",
			"erpCode": "1",
			"operator___code": "1",
			"operator": "2211575684096589833",
			"country___code": "1",
			"country": "2211575684096589833",
			"vendor": 2211575684096589833,
			"vendor___code": "1",
			"isConsignment": false,
			"consignmentCustomer": 2211575684096589833,
			"consignmentCustomer___code": "1",
			"isPDAStorage": false,
			"name": {
				"zh_CN": "a",
				"en_US": "a",
				"zh_TW": "a"
			},
			"id": "2211575684096589833",
			"sourceUnique": "2211575684096589833"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| success | boolean | 否 | 保存成功时返回true |
| data | object | 否 | 保存数据记录 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功记录数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败记录数 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功详情 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
| level | number |
| 小数位数:0,最大长度:2 | 否 | 异常级别 示例：0：错误，1：警告 |

## 5. 正确返回示例

{
	"code": "",
	"success": true,
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "",
				"targetUnique": "",
				"id": ""
			}
		]
	},
	"displayCode": "000-525-000066",
	"level": NaN
}

## 6. 业务异常码

暂时没有数据哦~


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

