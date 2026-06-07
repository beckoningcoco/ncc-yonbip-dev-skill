---
title: "盘点差异单撤回"
apiId: "1441832401209655296"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Variance Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Variance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点差异单撤回

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Variance Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckdifference/batchunsubmit

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
| data | object | 是 | 是 | 请求体 |
| id | long | 否 | 是 | 盘点差异单主表id 示例：2282796996055296 |

## 3. 请求示例

Url: /yonbip/scm/storecheckdifference/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2282796996055296
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | object | 否 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": {},
		"infos": [
			{
				"id": 2750087354176256,
				"returncount": 0,
				"verifystate": 0,
				"creator": "王章宇",
				"shop": -1,
				"isWfControlled": true,
				"stockOrg": "2367785652474624",
				"creatorId": 2648147090740992,
				"memo": "备注",
				"accountOrg": "2367785652474624",
				"warehouse": 2367840045125888,
				"businesstype": "2364609089605888",
				"vouchdate": "2022-04-27 00:00:00",
				"wmsBillno": "P123456777",
				"createTime": "2022-04-27 17:33:31",
				"isGoodsPosition": false,
				"storeCheckInputMode": 0,
				"pubts": "2022-04-27 17:42:14",
				"tplid": 0,
				"tenant": 2364607263428864,
				"status": 0,
				"createDate": "2022-04-27 00:00:00"
			}
		],
		"failInfos": [
			{
				"id": 2292630096614144,
				"messages": "未找到id为 2292630096614144 的单据，请重新确认",
				"code": "PDCYD20220513000001"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

