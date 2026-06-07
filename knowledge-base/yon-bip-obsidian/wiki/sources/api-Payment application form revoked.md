---
title: "付款申请单弃审"
apiId: "1632546094767407106"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Application"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请单弃审

> `ContentType	application/json` 请求方式	POST | 分类: Payment Application (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/paymentApply/unaudit

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 单据id 示例：1483387421116596230 |

## 3. 请求示例

Url: /yonbip/EFI/paymentApply/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回消息编码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 付款申请单id 示例：1628191813978816514 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1628191813978816514"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据已弃审, 不允许重复操作!	输入有效且未弃审的单据id


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

