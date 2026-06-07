---
title: "固定资产盘点单列表查询"
apiId: "f4014cf8e351497b98c957eddd922663"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Stocktaking Sheet"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Stocktaking Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Stocktaking Sheet (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/faInventory/queryListc

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
| pageIndex | string | 否 | 是 | 查询当前第几页 |
| pageSize | string | 否 | 是 | 查询每页多少条 |
| status | string | 否 | 否 | 盘点状态，枚举0 未盘点，1 相符，2 不符，3盘盈，4盘亏 |
| accentity | string | 否 | 否 | 会计主体 |
| accentity_code | string | 否 | 否 | 会计主体编码 |
| open_planDate_begin | string | 否 | 否 | 盘点开始日期 如：2022-01-21 |
| open_planDate_end | string | 否 | 否 | 盘点结束日期 如：2022-02-21 |
| code | string | 否 | 否 | 单据编码 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时，必填 |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/faInventory/queryListc?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"status": "",
	"accentity": "",
	"accentity_code": "",
	"open_planDate_begin": "",
	"open_planDate_end": "",
	"code": "",
	"simpleVOs": [
		{
			"logicOp": "",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页行数 示例：20 |
| recordCount | long | 否 | 总页数 示例：1 |
| recordList | object | 是 | 固定资产列表数据 |
| pageCount | long | 否 | 总数 示例：1 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"verifystate": 0,
				"code": "ZCPD00000178",
				"isWfControlled": false,
				"accbook": "",
				"accbook_name": "mm003新_默认业务账簿",
				"auditor": "闹闹",
				"auditorId": "2714017530106468",
				"accentity": "2237573161603328",
				"accentity_name": "mm003新",
				"accentity_code": "mm003",
				"planDate": "2022-01-21 00:00:00",
				"createTime": "2022-01-21 14:36:08",
				"id": 2614017530106368,
				"pubts": "2022-01-21 14:36:08",
				"status": 0,
				"remarks": "",
				"auditDate": "2022-01-21 14:36:08"
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

999	后台逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 (11)

更新

返回参数 (27)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

