---
title: "查询发票勾选发票"
apiId: "3337e1a7616e4b5ab949aa32f8ffaaee"
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

# 查询发票勾选发票

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/vat/queryInvoice

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
| fpdm | string | 否 | 否 | 发票代码 示例：1122334 |
| fphm | string | 否 | 否 | 发票号码 示例：12343123 |
| rq_q | string | 否 | 是 | 开票起始日期 yyyy-MM-dd 示例：2023-01-01 |
| rq_z | string | 否 | 是 | 开票截止日期 yyyy-MM-dd 示例：2023-01-01 |
| xsfnsrsbh | string | 否 | 否 | 销售人税号 示例：11233322333 |
| fpzt | string | 否 | 否 | 发票状态：空：全部，0：正常，1：失控，2：作废，3：红冲，4：异常（往期不填） 示例：1 |
| fplx | string | 否 | 否 | 发票类型：1增值税电子普通发票;3增值税普通发票;4增值税专用发票;8成品油电子发票;9成品油普通发票(卷式);10成品油普通发票;11成品油专用发票;12增值税普通发票(卷式)（往期不填） 示例：1 |
| period | string | 否 | 否 | 认证期间：否（不填时，查询已认证数据默认查询当期，yyyyMM） 示例：202301 |
| nsrsbh | string | 否 | 否 | 纳税人识别号(纳税人识别号与税务组织编码至少传入一项) 示例:SWOPENAPI519354 示例：112333123123 |
| orgcode | string | 否 | 否 | 税务组织编码(原:会计主体编码，纳税人识别号与税务组织编码至少传入一项) 示例: SWOPENAPI 示例：1233 |
| page | long | 否 | 否 | 页数 示例：1 |
| size | long | 否 | 否 | 当前页数量 示例：50 |
| rzztList | string | 是 | 否 | 认证状态：空：全部，2：未勾选，3：已勾选未认证，4：已认证 （往期不填） 示例：["2","3"] |
| projectCodes | string | 是 | 否 | 项目编码,来自【数字化建模-基础数据-项目】菜单 示例：["1234"] |
| verifyTimeEnd | string | 否 | 否 | 认证时间结束：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 13:00:00 |
| verifyTimeBegin | string | 否 | 否 | 认证时间开始：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 12:00:00 |
| selectTimeEnd | string | 否 | 否 | 勾选时间结束：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 13:00:00 |
| selectTimeBegin | string | 否 | 否 | 勾选时间开始：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 12:00:00 |
| createtimeEnd | string | 否 | 否 | 创建时间结束：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 13:00:00 |
| createtimeBegin | string | 否 | 否 | 创建时间开始：yyyy-MM-dd HH:mm:ss 示例：2024-03-21 12:00:00 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/vat/queryInvoice?access_token=访问令牌
Body: {
	"fpdm": "1122334",
	"fphm": "12343123",
	"rq_q": "2023-01-01",
	"rq_z": "2023-01-01",
	"xsfnsrsbh": "11233322333",
	"fpzt": "1",
	"fplx": "1",
	"period": "202301",
	"nsrsbh": "112333123123",
	"orgcode": "1233",
	"page": 1,
	"size": 50,
	"rzztList": [
		"2",
		"3"
	],
	"projectCodes": [
		"1234"
	],
	"verifyTimeEnd": "2024-03-21 13:00:00",
	"verifyTimeBegin": "2024-03-21 12:00:00",
	"selectTimeEnd": "2024-03-21 13:00:00",
	"selectTimeBegin": "2024-03-21 12:00:00",
	"createtimeEnd": "2024-03-21 13:00:00",
	"createtimeBegin": "2024-03-21 12:00:00"
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
| data | object | 否 | 数据 |
| contents | object | 是 | 数据 |
| totalNum | long | 否 | 总数量 示例：1286 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"contents": [
			{
				"fpDm": "3300162130",
				"fpHm": "15414913",
				"kprq": "20170831",
				"xsfMc": "杭州目庭酒店管理有限公司",
				"hjje": 175.47,
				"hjse": 10.53,
				"verifyStatus": 2,
				"selectTime": "2023-01-01",
				"verifyTime": "2023-01-01",
				"verifyType": 1,
				"fplx": "4",
				"fpzt": "0",
				"xsfNsrsbh": "9133010659309462XE",
				"period": "202010"
			}
		],
		"totalNum": 1286
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	系统发生异常错误，请联系管理员查看日志


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-07

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

