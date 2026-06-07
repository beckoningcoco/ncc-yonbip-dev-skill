---
title: "采购订单回写数量"
apiId: "1684327371554947080"
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

# 采购订单回写数量

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purchaseorder/purchaseOrderQtyWriteBack

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
| params | object | 否 | 否 | 参数 |
| data | object | 是 | 否 | 采购订单子表需要回写的数量数据 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/purchaseOrderQtyWriteBack?access_token=访问令牌
Body: {
	"params": {
		"data": [
			{
				"id": "13432543246543",
				"totalRecieveQty": 10,
				"totalRecieveSubqty": 10,
				"totalInQty": 12,
				"totalInSubqty": 33,
				"totalReturnInQty": 12,
				"totalReturnInSubQty": 23,
				"rejectReplenishQty": 2,
				"rejectReplenishSubQty": 2,
				"totalReturnAndReturnInQty": 231,
				"totalReturnAndReturnInSubQty": 231,
				"totalReturnQty": 12,
				"totalReturnSubQty": 12,
				"totalRejectQty": 3,
				"totalRejectSubqty": 3,
				"totalAcceptQty": 5,
				"totalAcceptSubqty": 5
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
| code | string | 否 | 接口是否调用成功 200成功，999失败 示例：200 |
| message | string | 否 | 接口调用状态信息 示例：操作成功 |
| data | object | 否 | 回写数据信息 |
| code | string | 否 | 是否回写成功 200成功,999失败 示例：200 |
| message | string | 否 | 回写的日志消息 示例：更新成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "200",
		"message": "更新成功"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

