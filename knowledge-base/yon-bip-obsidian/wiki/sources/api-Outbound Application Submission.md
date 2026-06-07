---
title: "出库申请提交"
apiId: "2024395142525353990"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Issue Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库申请提交

> `ContentType	application/json` 请求方式	POST | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/pickingrequisition/batchsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 出库申请[st.pickingrequisition.PickingRequisition] |
| id | number |
| 小数位数:0,最大长度:30 | 否 | 是 | 出库申请单主表id 示例：22827969960554455 |

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/batchsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 22827969960554455
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
| code | string | 否 | 返回码，调用成功时返回200。 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 示例：0 |
| messages | object | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 返回数据体 |
| failInfos | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"verifystate": 1,
				"shop": -1,
				"pubts": "2022-05-06 16:28:30",
				"id": 2762748637384960,
				"status": 3,
				"code": "XSCK-2024-000054",
				"creatorId": 2353514945827072,
				"vouchdate": "2022-05-06 00:00:00",
				"tenant": 2352473431068928,
				"createDate": "2022-05-06 00:00:00",
				"creator": "名字",
				"org": "2370726716642816",
				"isWfControlled": true,
				"accountOrg": "2370726716642816",
				"warehouse": 2355082071216384,
				"bustype": "2352475250610689",
				"barCode": "po_picking_requisition|2762748637384960",
				"createTime": "2022-05-06 16:13:15",
				"isUpdateCost": true
			}
		],
		"failInfos": [
			{}
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

