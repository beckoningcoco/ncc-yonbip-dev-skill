---
title: "到货计划保存"
apiId: "1619799877378637831"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货计划保存

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purchaseorder/saveArrivalPlan

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| purOrderId | string | 否 | 是 | 采购订单主表id 示例：2678837338198784 |
| mainid | string | 否 | 是 | 采购订单子表id 示例：2678837338198785 |
| orderCode | string | 否 | 否 | 采购订单编号，手工录入已存在的采购订单编号 示例：CGA20001000575 |
| recieveDate | string | 否 | 是 | 收货日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-24 00:00:00 |
| qty | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 数量，最多是20位数，最大精度为8位 示例：100 |
| erpArrivalPlanId | string | 否 | 否 | ERP到货计划ID 示例：2678837338666666 |
| orderRowNO | string | 否 | 否 | 订单行号 示例：10 |
| memo | string | 否 | 否 | 备注 示例：测试111 |
| arrivalPlanId | string | 否 | 否 | 到货计划id：新增时无需填写，修改时必填 示例：111 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/saveArrivalPlan?access_token=访问令牌
Body: [{
	"purOrderId": "2678837338198784",
	"mainid": "2678837338198785",
	"orderCode": "CGA20001000575",
	"recieveDate": "2022-12-24 00:00:00",
	"qty": 100,
	"erpArrivalPlanId": "2678837338666666",
	"orderRowNO": "10",
	"memo": "测试111",
	"arrivalPlanId": "111"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 单据信息 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 数量 示例：2 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数量 示例：2 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数量 示例：0 |
| messages | string | 是 | 信息 |
| infos | object | 是 | 返回数据 |
| failInfos | string | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"product": 1856530125321404400,
				"purUOM": 1753668390187171800,
				"ytenant": "0000LJ5I3I7H6YAPZ90000",
				"recieveDate": "2025-07-01 00:00:00",
				"subQty": 2,
				"purOrderId": 1971070099894304800,
				"isContract": false,
				"unit": 1753668390187171800,
				"productsku": 1856530125321404400,
				"priceUOM": 1753668390187171800,
				"priceQty": 0,
				"invPriceExchRate": 1,
				"qty": 2,
				"orderCode": "CGDD240409000011",
				"id": 1971079377023664000,
				"mainid": 1971070099894304800,
				"pubts": "2024-04-09 19:57:21",
				"invExchRate": 1,
				"tenant": 3344613997991184,
				"status": 1
			}
		],
		"failInfos": [
			""
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

1	2026-01-23

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

