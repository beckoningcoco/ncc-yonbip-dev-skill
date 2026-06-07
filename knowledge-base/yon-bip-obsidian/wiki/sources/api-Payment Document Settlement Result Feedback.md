---
title: "资金付款单结算结果回传"
apiId: "1905847808858521602"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金付款单结算结果回传

> `ContentType	application/json` 请求方式	POST | 分类: Payment Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/commonapi/updateSettleDataAndGeneratorVoucher

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 资金付款单数据 |
| id | string | 否 | 是 | 资金付款单明细行id 示例：1905863330859843588 |
| settlestatus | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 资金付款单明细状态，（结算成功为3，结算止付为4，部分成功为5） 示例：3 默认值：3 |
| settlesuccessSum | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 结算成功金额，（注：为空时传0） 示例：20.04 默认值：0 |
| settleerrorSum | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 结算止付金额，（注：为空时传0） 示例：10.2 默认值：0 |
| settleSuccessTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 结算成功时间 示例：2023-01-24 12:12:12 |

## 3. 请求示例

Url: /yonbip/ctm/commonapi/updateSettleDataAndGeneratorVoucher?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1905863330859843588",
			"settlestatus": 3,
			"settlesuccessSum": 20.04,
			"settleerrorSum": 10.2,
			"settleSuccessTime": "2023-01-24 12:12:12"
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
| data | string | 否 | 入参 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": "",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	批量操作通常不存在错误码，如果删除失败，请参照messages的提示处理	参照返回messages的提示处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-23

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

