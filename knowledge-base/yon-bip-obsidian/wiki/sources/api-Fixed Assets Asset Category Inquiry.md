---
title: "固定资产资产类别查询"
apiId: "b02eba0e5c5c459990cea38a3a03baa0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Category Structure"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产资产类别查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Category Structure (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/category/refc

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
| pageIndex | string | 否 | 是 | 页号 示例：1 |
| pageSize | string | 否 | 是 | 每页行数 示例：2 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时，必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/category/refc?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "2",
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "code",
					"op": "eq",
					"value1": "02",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| pageIndex | long | 否 | 反回当前是第几页 示例：1 |
| pageSize | long | 否 | 返回当前的每页数 示例：20 |
| recordCount | long | 否 | 返回列表的总数 示例：57 |
| recordList | object | 是 | 列表请求返回数据 |
| pageCount | long | 否 | 请求数据统计 示例：3 |
| beginPageIndex | long | 否 | 页码开始数 示例：1 |
| endPageIndex | long | 否 | 页码结束数 示例：3 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 57,
		"recordList": [
			{
				"isDisposalCurDepr": true,
				"code": "01",
				"depreciationmethod_name": "平均年限法(二)",
				"level": 1,
				"lifemonth": 600,
				"depreciationmethod": 69716,
				"depreciationMethodPath": "3",
				"isEnd": true,
				"path": "2166949848011574|",
				"name": "类别名称",
				"isNewCurDepr": false,
				"scrapvaluerate": 6,
				"isInventory": true,
				"id": 2166949848011574,
				"pubts": "2021-08-23 19:21:11"
			}
		],
		"pageCount": 3,
		"beginPageIndex": 1,
		"endPageIndex": 3
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

