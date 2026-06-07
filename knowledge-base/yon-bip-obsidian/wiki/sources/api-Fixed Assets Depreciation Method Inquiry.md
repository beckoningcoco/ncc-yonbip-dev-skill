---
title: "固定资产折旧方法查询"
apiId: "6091c475995b47adbbd79f7261e58ea2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Assets"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产折旧方法查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Assets (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/depreciation_method/refc

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
| pageIndex | string | 否 | 是 | 请求第几页页 示例：1 |
| pageSize | string | 否 | 是 | 请求每页多少条 示例：2 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或)，当使用conditions查询条件时，必填 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/depreciation_method/refc?access_token=访问令牌
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
					"value1": "01",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| pageIndex | long | 否 | 请求的是第几页 示例：1 |
| pageSize | long | 否 | 请求每页数 示例：1 |
| recordCount | long | 否 | 请求数据统计 示例：1 |
| recordList | object | 是 | 列表返回数据 |
| pageCount | long | 否 | 请求数据统计 示例：1 |
| beginPageIndex | long | 否 | 页码开始数 示例：1 |
| endPageIndex | long | 否 | 页码结束数 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 1,
		"recordList": [
			{
				"code": "01",
				"presetdate": true,
				"monthdepreciation": "0",
				"description": "单位折旧=(本币原值-净残值-累计折旧-减值准备)/(工作总量-累计工作量)",
				"monthdeprate": "月折旧额/(本币原值-减值准备)",
				"name": "不计提折旧",
				"id": 69714,
				"pubts": "2021-08-23 19:20:50"
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

999	后端服务异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

