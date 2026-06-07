---
title: "账单采集&保存账单"
apiId: "2065909299977125896"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 账单采集&保存账单

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/uploadInvoice

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fileList | object | 是 | 是 | 文件信息，来自协同文件上传接口返回的信息（调用协同文件上传api接口上传时，参数businessType为znbz，businessId为znbzbx_wallet） |
| name | string | 否 | 是 | 文件名称（带后缀） 示例：出租车票.jpg |
| fileId | string | 否 | 是 | 文件id，来自协同文件上传接口返回的fileId字段 示例：66c48c3c0ee2b5075d7634e7 |
| height | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 图片高度，发票为图片时传递 示例：2156 |
| width | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 图片宽度，发票为图片时传递 示例：961 |
| size | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 文件大小，来自协同文件上传接口返回的fileSize字段 示例：123 |
| collectionway | string | 否 | 是 | 采集方式 0：智能识票（可以解析图片格式的发票），3：文件上传（可以解析pdf、ofd、xml格式的发票） 示例：0 |
| vsourcesystemid | string | 否 | 否 | 来源系统原发票id 示例：123456677 |
| ticketType | string | 否 | 否 | 发票类型，国际小票传2，其他类型发票不需要传 示例：2 |
| userId | number |
| 小数位数:-1,最大长度:20 | 否 | 否 | 账单归属人，如果传递则指定归属人，使用用户或用户管理节点用户身份id 示例：1783950701406715906 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/uploadInvoice?access_token=访问令牌
Body: {
	"fileList": [
		{
			"name": "出租车票.jpg",
			"fileId": "66c48c3c0ee2b5075d7634e7",
			"height": 2156,
			"width": 961,
			"size": 123,
			"collectionway": "0",
			"vsourcesystemid": "123456677"
		}
	],
	"ticketType": "2",
	"userId": 1783950701406715906
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| ids | number |
| 小数位数:0,最大长度:19 | 是 | 账单id 示例：[54547539884849] |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"ids": [
			54547539884849
		]
	},
	"displayCode": ""
}

## 6. 业务异常码

035-503-001300

调用文件服务-上传发票失败，原因：{0}

035-503-001577

保存账单失败


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-08

更新

请求说明

新增

异常码 035-503-001300

新增

异常码 035-503-001577

2	2025-07-11

新增

返回参数 displayCode

3	2025-05-30

新增

请求参数 userId

重新添加用户参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

