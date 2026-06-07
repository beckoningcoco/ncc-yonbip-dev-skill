---
title: "删除台账及票据"
apiId: "40af6a9aad744278bf19269513af24da"
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

# 删除台账及票据

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/bill-collections/delete

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
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：91110000600001760P |
| orgcode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：10000 |
| bills | object | 是 | 否 | 票面信息，数量不能超过1000 |
| billType | string | 否 | 是 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书/tax_payment_proof:完税证明 示例：taxi |
| invoiceCode | string | 否 | 否 | 发票代码：当有发票代码时必填 示例：11111111 |
| invoiceNum | string | 否 | 是 | 发票号码：当为火车票或航空客票时输入火车票号或电子客票号码 示例：11212 |
| deleteMode | string | 否 | 否 | 删除模式(0:同时删除票据和台账;1:仅删除台账) 示例：0 |
| enableParamCheck | string | 否 | 否 | 是否启用参数设置中的台账删除校验(Y-启用 N-不启用，默认为N) 示例：N |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill-collections/delete?access_token=访问令牌
Body: {
	"nsrsbh": "91110000600001760P",
	"orgcode": "10000",
	"bills": [
		{
			"billType": "taxi",
			"invoiceCode": "11111111",
			"invoiceNum": "11212"
		}
	],
	"deleteMode": "0",
	"enableParamCheck": "N"
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
| data | object | 是 | 删除结果 |
| invoiceCode | string | 否 | 发票代码 示例：001 |
| invoiceNum | string | 否 | 发票号码 示例：001 |
| billType | string | 否 | 票据类型 示例：invoice |
| result | string | 否 | 删除结果 示例：删除成功、台账不存在、发票不存在、台账不存在,发票删除成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"invoiceCode": "001",
			"invoiceNum": "001",
			"billType": "invoice",
			"result": "删除成功、台账不存在、发票不存在、台账不存在,发票删除成功"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1001	数据不合法	检查json格式是否正确

9999	未知错误	按照提示解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

更新

请求说明

更新

请求参数 nsrsbh

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

