---
title: "现金流量详情查询"
apiId: "d341c8535a174327802a0ed01384418c"
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

# 现金流量详情查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cashflow/detail

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
| voucher | string | 否 | 是 | 凭证id 示例：2E529A58-2EB7-4C8F-A636-175CEF4F5E11 |

## 3. 请求示例

Url: /yonbip/fi/cashflow/detail?access_token=访问令牌
Body: {
	"voucher": "2E529A58-2EB7-4C8F-A636-175CEF4F5E11"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 是否成功（true：成功；false：失败） 示例：true |
| message | string | 否 | 消息 |
| data | object | 否 | 返回数据 |
| analyzing | boolean | 否 | 是否分析（true：是，false：否） 示例：false |
| subject_accrual | long | 否 | 科目发生 示例：0 |
| cashflowtype | string | 否 | 现金流量类型id 示例：D8BD21AD-2A7F-411A-897C-1FD1FD4E52A2 |
| isbalance | boolean | 否 | 是否平衡（true：是，false：否） 示例：true |
| cashflow_accrual | long | 否 | 现金流量发生 示例：0 |
| list | object | 是 | 现金流量列表 |
| code | long | 否 | 返回编码 示例：1 |
| total | long | 否 | 返回总数 示例：0 |

## 5. 正确返回示例

{
	"success": true,
	"message": "",
	"data": {
		"analyzing": false,
		"subject_accrual": 0,
		"cashflowtype": "D8BD21AD-2A7F-411A-897C-1FD1FD4E52A2",
		"isbalance": true,
		"cashflow_accrual": 0,
		"list": [
			{
				"id": "3AFA5119-6DD4-4164-9C4B-0F41C39ABCEC",
				"creator": {
					"id": "42610f8f-c235-47b5-82d0-13f6f6893a35",
					"code": "YHT-811-4761568623800647",
					"name": "LBT"
				},
				"creationtime": "2020-06-08 15:00:33",
				"modifier": "",
				"modifiedtime": "2020-06-08 15:00:33",
				"pk_org": "",
				"pk_group": "",
				"description": "",
				"ts": "2020-06-08 15:00:33",
				"dr": 0,
				"state": 0,
				"tenantid": "",
				"accbook": "42F88F3D-9251-47D7-A959-AECA9958A3C3",
				"period": "2020-05",
				"periodadjust": "",
				"periodunion": "",
				"voucher": "2E529A58-2EB7-4C8F-A636-175CEF4F5E11",
				"cashflowitem": {
					"id": "48747473-F2DB-4E49-A217-7F5808AD9073",
					"code": "214",
					"name": "经营性应收项目的减少（减：增加）"
				},
				"direction": "IN",
				"accsubject": "1122",
				"oppsubject": "1123",
				"currency": {
					"id": "G001ZM0000DEFAULTCURRENCT00000000001",
					"code": "CNY",
					"name": "人民币"
				},
				"amountoriginal": 11,
				"amountorg": 11,
				"manual": false,
				"rule": "90BE275B-C3F5-456C-B9B4-0A8215F0C57C",
				"voucherrecord": "90F2BCDE-6AE7-422A-B12C-09E3EBD3DC0E",
				"version": "2020-06-08 15:00:31",
				"voucherbillcode": 1,
				"vouchermaketime": "2020-05-15 00:00:00",
				"vouchertype": {
					"id": "2cf8b1a1-a6d8-11ea-9e88-060cee0005d2",
					"code": "1",
					"name": "记账凭证"
				},
				"voucherdescription": "总账流程测试",
				"ismain": 0,
				"def2": "",
				"flag": "",
				"voucherrecordnumber": 4,
				"innerorg": "",
				"voucherstatus": "",
				"accsubjectdirection": "Credit",
				"clientauxiliary": [
					{
						"id": "",
						"field": "vr4",
						"doctype": "supplier",
						"code": "0004",
						"name": "供应商",
						"value": "1771783843565824",
						"data": {
							"code": "0605000002",
							"name": "供-租户19901288888",
							"id": "1771783843565824"
						},
						"auxiliarytype": "",
						"auxiliaryvalue": "",
						"helpname": "",
						"helpcode": "",
						"helpvalue": "",
						"required": false,
						"commoned": false,
						"datatype": "doc"
					}
				],
				"mainitem": "",
				"supitem": {
					"id": "48747473-F2DB-4E49-A217-7F5808AD9073",
					"code": "214",
					"name": "经营性应收项目的减少（减：增加）"
				}
			}
		]
	},
	"code": 1,
	"total": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

