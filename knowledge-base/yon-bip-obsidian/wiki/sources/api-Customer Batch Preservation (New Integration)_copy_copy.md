---
title: "客户使用组织保存/更新V1"
apiId: "2456281703501004803"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户使用组织保存/更新V1

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/merchant/belongOrg/v1/batchSave

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
| subEntityUpdateStrategy | string | 否 | 否 | 子表更新策略：全量覆盖（OVERWRITE）、增量更新（INCREMENT） 1）全量覆盖（OVERWRITE） 按主键或匹配规则查找数据库中的旧数据（优先主键：主键不为空时用主键匹配，主键为空时按匹配规则字段组合匹配）： - 匹配成功（前端子表数据在数据库中找到对应记录）：将主键覆盖为数据库主键，状态设为 UPDATED，前端未传入的属性从数据库补充 - 匹配失败（前端子表数据在数据库中找不到对应记录）：状态设为 NEW - 差异数据处理（数据库中有但前端未匹配到的记录）：按差异策略（SubEntityDiffDataStrategy）处理，默认为 DELETE 2）增量更新（INCREMENT） 按主键或匹配规则查找数据库中的旧数据（优先规则同全量覆盖）： - 匹配成功：将主键覆盖为数据库主键，前端未传入的属性从数据库补充；再按前端数据的 op_status 判断——非删除态（active）设为 UPDATED，删除态（delete）设为 DELETED - 匹配失败（前端子表数据在数据库中找不到对应记录）：按前端数据的 op_status 判断——删除态（delete）设为 DELETED，非删除态（active）设为 NEW - 差异数据处理（数据库中有但前端未匹配到的记录）：差异策略固定为 UNCHANGED，不可配置 示例：overwrite 默认值：overwrite |
| data | object | 是 | 否 | 传参集合 |
| sourceUnique | string | 否 | 是 | 来源数据唯一标识; 示例：id |
| id | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 客户id；更新时需要更改客户编码需要传值。优先级高于客户编码；跟_status控制是否为更新或者新增；客户id有值或者_status字段为Update将做更新保存； 示例：123456 |
| code | string | 否 | 是 | 客户编码；必填。更新时，不传客户id，客户编码作为唯一条件去更新 示例：code |
| belongOrg | string | 否 | 否 | 使用组织id；填写组织id；更新时必填，不传默认为管理组织id 示例：666666 |
| belongOrg___code | string | 否 | 否 | 使用组织；填写组织编码；更新时必填，不传默认为管理组织 示例：使用组织编码 |
| merchantAppliedDetail | object | 否 | 否 | 客户档案业务信息(客户适用范围详情) |
| customerAreas | object | 是 | 否 | 客户档案销售区域 |
| principals | object | 是 | 否 | 客户档案负责人 |
| invoicingCustomers | object | 是 | 否 | 客户档案开票客户 |

## 3. 请求示例

Url: /yonbip/PFC/merchant/belongOrg/v1/batchSave?access_token=访问令牌
Body: {
	"subEntityUpdateStrategy": "overwrite",
	"data": [
		{
			"sourceUnique": "id",
			"id": 123456,
			"code": "code",
			"belongOrg": "666666",
			"belongOrg___code": "使用组织编码",
			"merchantAppliedDetail": {
				"searchCode": "助记码",
				"merchantLevelId": 1733407568979558408,
				"merchantLevelId___code": "客户级别",
				"merchantTypeId": 1733407568979558408,
				"merchantTypeId___code": "销售渠道",
				"deliveryWarehouseId": 1733407568979558408,
				"deliveryWarehouseId___code": "发货仓库",
				"transactionCurrencyId": "交易币种id",
				"transactionCurrencyId___code": "交易币种",
				"exchangeRateTypeId": "汇率类型id",
				"exchangeRateTypeId___code": "汇率类型",
				"taxRateId": 1733407568979558408,
				"taxRateId___code": "销项税率",
				"payway": 0,
				"creditServiceDayId": 10,
				"collectionAgreementId": 1733407568979558408,
				"collectionAgreementId___code": "收款协议",
				"settlementMethodId": 1733407568979558408,
				"settlementMethodId__code": "结算方式",
				"shipmentMethod": 1733407568979558408,
				"shipmentMethod___code": "发运方式",
				"signBack": true,
				"isTradeCustomers": "\"0\"",
				"stopstatus": false
			},
			"customerAreas": [
				{
					"id": 123456,
					"saleAreaId": 1733407568979558408,
					"saleAreaId___code": "销售区域",
					"isDefault": true,
					"op_status": "active"
				}
			],
			"principals": [
				{
					"id": 123456,
					"specialManagementDep": "专管部门id",
					"specialManagementDep___code": "专管部门",
					"professSalesman": "专管业务员id",
					"professSalesman___code": "专管业务员",
					"isDefault": true,
					"op_status": "active"
				}
			],
			"invoicingCustomers": [
				{
					"id": 123456,
					"invoicingCustomersId": "1733407568979558408",
					"invoicingCustomersId___code": "开票客户",
					"isDefault": true,
					"op_status": "active"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 是 | messages 示例：[] |
| infos | object | 是 | infos |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [],
		"infos": [
			{
				"created": true,
				"sourceUnique": "2217416229843369990",
				"targetUnique": "2217416229843369991",
				"id": "2217416229843369991"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

