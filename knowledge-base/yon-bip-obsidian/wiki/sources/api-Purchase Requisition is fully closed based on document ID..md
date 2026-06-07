---
title: "请购单根据单据id整单关闭"
apiId: "5aed34ec4c0b493e97297d60d58b1ed0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单根据单据id整单关闭

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/applyorder/close

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
| data | object | 是 | 是 | 请求参数 |
| id | long | 否 | 是 | 请购单id 示例：1245356676546643 |

## 3. 请求示例

Url: /yonbip/scm/applyorder/close?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1245356676546643
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回值 |
| id | long | 否 | 请购单id 示例：2396042065973760 |
| closer | string | 否 | 关闭人 示例：YonSuite默认用户 |
| closerId | long | 否 | 关闭人系统ID 示例：关闭人系统ID |
| closeDate | DateTime | 否 | 关闭日期 示例：2021-08-20 00:00:00 |
| status | string | 否 | 关闭对应码，0：关闭、1：已审核、2：已关闭、3：审核中 示例：0 |
| pubts | DateTime | 否 | 操作时间戳 示例：2021-08-20 20:12:00 |
| tenant | long | 否 | 租户id 示例：1212684362977536 |
| closeTime | DateTime | 是 | 关闭时间 示例：2021-08-20 20:12:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 2396042065973760,
			"closer": "YonSuite默认用户",
			"closerId": NaN,
			"closeDate": "2021-08-20 00:00:00",
			"status": "0",
			"pubts": "2021-08-20 20:12:00",
			"tenant": 1212684362977536,
			"closeTime": [
				"2021-08-20 20:12:00"
			]
		}
	]
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

