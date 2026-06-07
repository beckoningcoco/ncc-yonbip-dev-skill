---
title: "现金流量查询"
apiId: "4a9c33cd3bff4eda98b2282554afef1f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Ledger"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ficloud/cashflowdetail/queryapi

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accbook | string | 否 | 是 | 账簿信息 示例：042B8199-117B-4B6A-BE52-D9A8F2698FF1 |
| begin | long | 否 | 否 | 开始数 示例：0 |
| groupnum | long | 否 | 否 | 每页查询多少条 示例：50 |
| conditions | object | 是 | 否 | 查询条件 |
| field | string | 否 | 否 | 列,period期间、currency币种、cashflowitem现金流量项目 示例：period |
| operator | string | 否 | 否 | 运算符,目前只支持等于 示例：= |
| value | string | 否 | 否 | 值 示例：2020-01--2020-12 |

## 3. 请求示例

Url: /yonbip/fi/ficloud/cashflowdetail/queryapi?access_token=访问令牌
Body: {
	"accbook": "042B8199-117B-4B6A-BE52-D9A8F2698FF1",
	"begin": 0,
	"groupnum": 50,
	"conditions": [
		{
			"field": "period",
			"operator": "=",
			"value": "2020-01--2020-12"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 返回成功标识 示例：true |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| list | object | 是 | 列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"success": true,
		"message": "",
		"data": {
			"list": [
				{
					"amountorg": 111,
					"voucherrecordnumber": 2,
					"accsubject": "1002",
					"voucher": "3937AE2F-F976-45B6-87F9-738666E35D51",
					"voucherdescription": "收款",
					"amountoriginal": 111,
					"manual": false,
					"dr": 0,
					"cashflowitem": "53C24B1F-E291-4E73-9200-120B59AE5185",
					"modifiedtime": "2020-06-10 13:44:17",
					"vouchertype": "8c3a19b1-a95e-11ea-9e88-060cee0005d2",
					"periodunion": "2020-06",
					"tenantid": "l94ez4nq",
					"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
					"id": "0703A846-6D7C-41D6-BFDA-D09F76475A6D",
					"direction": "IN",
					"vouchermaketime": "2020-06-09 00:00:00",
					"period": "2020-06",
					"creator": "42610f8f-c235-47b5-82d0-13f6f6893a35",
					"def2": "~",
					"accbook": "042B8199-117B-4B6A-BE52-D9A8F2698FF1",
					"voucherbillcode": 9,
					"voucherstatus": "01",
					"voucherrecord": "54247A49-7A2B-43B5-8F2B-97CB0EF1D216",
					"creationtime": "2020-06-10 13:44:17",
					"innerorg": "22ddd-2eda-233ds-23",
					"version": "12132-32131-3123-1",
					"ts": 1591767857000
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code	0


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

