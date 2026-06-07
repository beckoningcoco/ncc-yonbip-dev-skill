---
title: "固定资产类别查询"
apiId: "1697866070537797638"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Category Structure"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产类别查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Category Structure (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetsCategoryVO/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | int | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：20 |
| pageIndex | int | 否 | 是 | 当前页码 示例：1 默认值：1 |
| accentity | string | 否 | 否 | 所属组织id 示例：666666 |
| cateStructId | string | 否 | 否 | 所属类别结构 示例：1550290015006228506 |
| categoryFullName | string | 否 | 否 | 固定资产类别 示例：资产类别02 |
| name | string | 否 | 否 | 分类名称(支持模糊查询) 示例：类型1 |
| level | string | 是 | 否 | 层级 1一级类别 2二级类别 3三级类别 4四级类别 |
| enable | string | 否 | 否 | 启用状态 0停用 1启用 示例：1 |
| simple | object | 否 | 否 | 查询条件 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetsCategoryVO/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"accentity": "666666",
	"cateStructId": "1550290015006228506",
	"categoryFullName": "资产类别02",
	"name": "类型1",
	"level": [
		""
	],
	"enable": "1",
	"simple": {
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产使用状态信息 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| recordCount | int | 否 | 总记录数 示例：100 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordCount": 100,
		"pageSize": 1,
		"recordList": [
			{
				"id": "1594672068154097667",
				"code": "000001",
				"cateStructId_name": "固定资产类别结构",
				"categoryFullName": {
					"zh_CN": "资产类别01"
				},
				"accentity_name": "企业账号级",
				"name": {
					"zh_CN": "资产类别01"
				},
				"lifeMonth": 10,
				"description": {
					"zh_CN": "123"
				},
				"scrapValueRate": 10,
				"unitId_name": "千克",
				"lifeYear": 0,
				"blnInventory": true,
				"scrapValueType": "0",
				"scrapValueAmount": 2,
				"pubts": "2022-10-24 17:59:46",
				"enable": "0"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

503	异常	检查服务是否正常运行


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-19

更新

请求参数 level

更新

返回参数 (26)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

