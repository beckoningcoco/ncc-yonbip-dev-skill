---
title: "开票申请单查询（原未开票查询）"
apiId: "90dbf3a38c824d7c915a70c8dca96ad8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoice Request"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoice Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请单查询（原未开票查询）

> `ContentType	application/json` 请求方式	POST | 分类: Invoice Request (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/invoice-will/result

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| lyid | string | 否 | 否 | 来源单据号 示例：12215423 |
| djqqlsh | string | 否 | 否 | 单据请求流水号；单据请求流水号和来源单据号不能同时为空 示例：45345324524 |
| orgCode | string | 否 | 是 | 开票点编码：去开票点档案中查询； 示例：qd001 |
| withInvoice | string | 否 | 否 | 查询结果是否附带发票信息。N-不携带；Y-携带。 示例：N 默认值：N |
| pageNum | string | 否 | 是 | 页码 示例：1 |
| pageSize | string | 否 | 是 | 每页数据数量 示例：15 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoice-will/result?access_token=访问令牌
Body: {
	"lyid": "12215423",
	"djqqlsh": "45345324524",
	"orgCode": "qd001",
	"withInvoice": "N",
	"pageNum": "1",
	"pageSize": "15"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作信息 示例：SUCCESS |
| data | object | 否 | 数据 |
| dtos | object | 是 | 申请单数据 |
| totalCount | int | 否 | 记录总数量 |
| invoices | object | 是 | 发票数据 |
| bustype | string | 否 | 交易类型id |
| bustypeCode | string | 否 | 交易类型code |

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": {
		"dtos": [
			{
				"accountNote": "",
				"accountStatus": "",
				"accountTime": "",
				"accountUser": "",
				"accountVoucherNo": "",
				"bz": "",
				"djqqlsh": "",
				"fhr": "",
				"zdzfbz": "",
				"fplx": "",
				"gmfDzdh": "",
				"gmfMc": "",
				"gmfNsrsbh": "",
				"gmfYhzh": "",
				"hisJe": 0,
				"hisSe": 0,
				"je": 0,
				"jshj": 0,
				"kpr": "",
				"lyid": "",
				"orgName": "",
				"se": 0,
				"lc": 0,
				"skr": "",
				"unJe": 0,
				"xsfDzdh": "",
				"xsfNsrsbh": "",
				"xsfYhzh": "",
				"zdrq": "",
				"xsfMc": "",
				"departmentId": "",
				"invoiceWillBs": [
					{
						"dw": "",
						"hh": "",
						"hisSe": 0,
						"hisJshj": 0,
						"se": 0,
						"sl": 0,
						"spbm": "",
						"spssflbm": "",
						"xmje": 0,
						"xmjshj": "",
						"xmmc": "",
						"ggxh": "",
						"records": {
							"bred": "N",
							"fpDm": "",
							"fpHm": "",
							"fplx": "",
							"fpqqlsh": "",
							"hh": "",
							"se": 0,
							"sl": 0,
							"status": "",
							"xmje": 0,
							"xmjshj": 0,
							"zfbz": "",
							"kprq": "2026-06-07 12:03:43",
							"sjkpje": 0,
							"sjkpse": 0
						},
						"xmhsdj": 0,
						"hisSpsl": 0,
						"defineTerm": [
							{
								"code": ""
							}
						]
					}
				],
				"sqbm": "",
				"applyUserId": "",
				"diworkOrgId": "",
				"lydjh": "",
				"lyBillTypeId": "",
				"tspz": "",
				"einvoiceShowSkrShr": "",
				"zdybz": "",
				"revemail": "",
				"revphone": "",
				"gmfDz": "",
				"gmfDh": "",
				"einvoiceShowGxfDzDh": "",
				"gmfYh": "",
				"gmfZh": "",
				"einvoiceShowGxfYhZh": "",
				"zrrbs": "",
				"zjlx": "",
				"zjhm": "",
				"guoji": "",
				"xsfDz": "",
				"xsfDh": "",
				"verifyState": "",
				"invoiceState": "",
				"applyType": "",
				"lylx": "",
				"defineTerm": [
					{
						"code": ""
					}
				],
				"sqr": ""
			}
		],
		"totalCount": 0,
		"invoices": [
			{
				"bsstatus": "0",
				"smsState": "0",
				"emailState": "0",
				"fpDm": "123333",
				"fpHm": "1234567890",
				"shareUrl": "http://bip-pre.yonyoucloud.com/",
				"shareCode": "1234",
				"pdfurl": "",
				"ofdurl": "",
				"xmlurl": "",
				"hjje": 1.23,
				"hjse": 1.23,
				"jshj": 1.23
			}
		],
		"bustype": "",
		"bustypeCode": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1001	单据请求流水号和来源单据号不能同时为空	根据提示修改


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-14

更新

请求说明

新增

返回参数 (36)

更新

返回参数 (68)

修改后端数据映射配置。

2	2026-04-08

更新

请求说明

新增

返回参数 (34)

更新

返回参数 (68)

3	2025-11-20

新增

返回参数 bsstatus

新增

返回参数 smsState

新增

返回参数 emailState

更新

返回参数 (13)

4	2025-08-29

新增

请求参数 withInvoice

新增

返回参数 (11)

开票申请单查询附带发票信息。

5	2025-07-03

更新

请求说明

更新

返回参数 records


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

