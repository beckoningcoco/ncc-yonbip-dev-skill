---
title: "台账疑票操作"
apiId: "1759416207478358023"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 台账疑票操作

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/busi-collection/suspect-operate

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
| orgcode | string | 否 | 是 | 税务组织编码 示例：1112 |
| bills | object | 是 | 是 | 票据列表（疑票批量操作一次性不能超过50） |
| billType | string | 否 | 是 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书 示例：invoice |
| invoiceCode | string | 否 | 否 | 票据代码（有则必填） 示例：123456 |
| invoiceNum | string | 否 | 是 | 票据号码 示例：123566777 |
| suspectOperation | long | 否 | 是 | 疑票操作：1-放行 2-取消放行 3-禁止 4-取消禁止 示例：1 |
| checkCode | string | 否 | 否 | 航空客票-验证码 示例：123 |
| receiptNumber | string | 否 | 否 | 航空客票-行程单号码 示例：568 |
| airType | string | 否 | 否 | 航空票类型 1-1类发票 2-2类发票 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/busi-collection/suspect-operate?access_token=访问令牌
Body: {
	"orgcode": "1112",
	"bills": [
		{
			"billType": "invoice",
			"invoiceCode": "123456",
			"invoiceNum": "123566777",
			"suspectOperation": 1,
			"checkCode": "123",
			"receiptNumber": "568",
			"airType": "1"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

更新

请求说明

更新

请求参数 orgcode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

