---
title: "到货单拒收"
apiId: "1577468550872301577"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Arrival Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货单拒收

> `ContentType	application/json` 请求方式	POST | 分类: Arrival Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/arrivalorder/refuse

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
| data | object | 否 | 是 | 传参 |
| id | long | 否 | 是 | 到货单id 示例：1598979980472614913 |
| arrivalOrders | object | 是 | 是 | 到货单子表数据 |

## 3. 请求示例

Url: /yonbip/scm/arrivalorder/refuse?access_token=访问令牌
Body: {
	"data": {
		"id": 1598979980472614913,
		"arrivalOrders": [
			{
				"id": 1598979980472614914,
				"acceptqty": 0,
				"purchaseAcceptQty": 0.1,
				"refuseqty": 0.1,
				"purchaseRefuseQty": 0.1,
				"replenishQty": 0.1,
				"purchaseReplenQty": 0.1,
				"warehouse": 1600439847407872,
				"warehouse_code": "000001",
				"batchno": "000035",
				"producedate": "2022-11-09 00:00:00",
				"invaliddate": "2022-11-09 00:00:00"
			}
		]
	}
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | long | 否 | 主表id 示例：2226185570210048 |
| isWfControlled | boolean | 否 | 是否审批流控制，true：开启审批流程，false表示不开启 示例：false |
| isContract | boolean | 否 | 是否需要与供应商协同，true：是，false：否 示例：false |
| status | long | 否 | 单据状态：0:未审核、1:已审核、2:已关闭、3:审核中 示例：0 |
| modifier | string | 否 | 最后修改人 示例：张三 |
| modifierId | long | 否 | 修改人id 示例：1595966923530567684 |
| modifyTime | Date | 否 | 最后修改时间 示例：2022-12-01 09:57:42 |
| arrivalOrders | object | 是 | 子表数据 |
| pubts | string | 否 | 时间戳 示例：2021-04-22 15:13:06 |
| headParallel | object | 否 | 主表平行表返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2226185570210048,
		"isWfControlled": false,
		"isContract": false,
		"status": 0,
		"modifier": "张三",
		"modifierId": 1595966923530567684,
		"modifyTime": "2022-12-01 09:57:42",
		"arrivalOrders": [
			{
				"subQty": 0.1,
				"valuationRefuseQty": 0.1,
				"refuseqty": 0.1,
				"id": 2226185570226432,
				"mainid": 2226185570210048,
				"valuationAcceptQty": 0.1,
				"qty": 0.1,
				"purchaseRefuseQty": 0.1,
				"sourceid": 2222029029429504,
				"purchaseAcceptQty": 0.1,
				"acceptqty": 0.1
			}
		],
		"pubts": "2021-04-22 15:13:06",
		"headParallel": {
			"status": 2,
			"yuncaiStatus": "refuse",
			"signTime": "2022-12-01 09:50:51",
			"signUser": "张三"
		}
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

