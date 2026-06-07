---
title: "发票号码代码预览"
apiId: "939cf9f08b4a482ab65c0a29d949a7f8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 发票号码代码预览

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/preview/hmdm

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
| fplx | string | 否 | 是 | 发票类型：1:增值税电子普通发票 3:增值税普通发票 4:增值税专用发票 5:机动车销售统一发票 示例：1 |
| orgCode | string | 否 | 是 | 开票点编码，去开票点档案中查询； 示例：12522 |
| forceRefresh | string | 否 | 否 | 是否刷新;Y:刷新;N:不刷新 示例：Y |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/preview/hmdm?access_token=访问令牌
Body: {
	"fplx": "1",
	"orgCode": "12522",
	"forceRefresh": "Y"
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
| message | string | 否 | 提示信息 示例：success |
| data | string | 否 | 响应信息 |
| data | object | 否 | 数据 |
| fpHm | string | 否 | 发票号码 示例：发票号码 |
| fpDm | string | 否 | 发票代码 示例：发票代码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"fpHm": "发票号码",
		"fpDm": "发票代码"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统发生异常错误	根据返回错误信息进行修改排查


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

