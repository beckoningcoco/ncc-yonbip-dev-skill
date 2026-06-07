---
title: "入库通知单新增"
apiId: "e1eaa4701acd4af999e8d3505691bbf9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Receipt Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Receipt Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库通知单新增

> `ContentType	application/json` 请求方式	POST | 分类: Receipt Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/storenotice/save

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
| data | object | 是 | 是 | 表头参数 |
| outWarehouse | string | 否 | 是 | 调出仓库编码 示例：0025 |
| inWarehouse | string | 否 | 是 | 调入仓库编码 示例：txd01 |
| srcTop | string | 否 | 否 | 要货申请单主表主键 示例：4849344109160961 |
| srcTopNO | string | 否 | 否 | 要货申请单编码 示例：DCCK00062019053100021 |
| srcBillNO | string | 否 | 否 | 调拨出库单编码 示例：RKTZ00022019071200091 |
| id__pk | string | 否 | 否 | 来源单据主键 示例：2001A110000000000KWK1 |
| srcBill | string | 否 | 是 | 调拨出库单主表主键 示例：1001A110000000000KWK1 |
| srcBillType | string | 否 | 否 | 来源单据类型（0要货申请1调拨申请2请购要货） 示例：1 |
| bustype | string | 否 | 否 | 业务类型编码 示例：30-Cxx-CI01 |
| vouchdate | string | 否 | 否 | 单据日期 示例：2017-11-21 15:21:24 |
| headItem | object | 是 | 否 | 单据头自定义项1-30 |
| details | object | 是 | 否 | 表体参数 |
| logs | object | 是 | 否 | 物流参数 |
| _status | string | 否 | 是 | 数据状态（insert） 示例：Insert |
| inorg | string | 否 | 是 | 入库组织code 示例：0716003 |
| outorg | string | 否 | 否 | 出库组织code 示例：0716001 |
| vendor | string | 否 | 否 | 供应商 示例：cc001 |
| invoiceVendor | string | 否 | 否 | 开票供应商 示例：pp001 |
| currency | string | 否 | 否 | 币种 示例：rmb |
| natCurrency | string | 否 | 否 | 本币 示例：rmb |
| unit | string | 否 | 否 | 主计量 示例：EA |
| stockUnitId | string | 否 | 否 | 辅计量 示例：EA |
| isGift | string | 否 | 否 | 是否赠品(1是 0否) 示例：0 |
| key | string | 否 | 否 | 主键字段 示例：id__pk |

## 3. 请求示例

Url: /yonbip/sd/stock/storenotice/save?access_token=访问令牌
Body: {
	"data": [
		{
			"outWarehouse": "0025",
			"inWarehouse": "txd01",
			"srcTop": "4849344109160961",
			"srcTopNO": "DCCK00062019053100021",
			"srcBillNO": "RKTZ00022019071200091",
			"id__pk": "2001A110000000000KWK1",
			"srcBill": "1001A110000000000KWK1",
			"srcBillType": "1",
			"bustype": "30-Cxx-CI01",
			"vouchdate": "2017-11-21 15:21:24",
			"headItem": [
				{
					"define1": "单据头自定义项1",
					"define2": "单据头自定义项2",
					"_status": "Insert"
				}
			],
			"details": [
				{
					"product": "0000000028",
					"productsku": "0000000028",
					"qty": "1.00000000",
					"srcBillRow": "1001A11000000000213456123",
					"define30": 123,
					"srcTopRow": "480769288212737",
					"bodyItem": [
						{
							"define1": "单据体自定义项1",
							"define2": "单据体自定义项2",
							"_status": "Insert"
						}
					],
					"_status": "Insert"
				}
			],
			"logs": [
				{
					"_status": "Insert",
					"company": "EMS",
					"billno": "0001",
					"mobileNo": "15810568888"
				}
			],
			"_status": "Insert",
			"inorg": "0716003",
			"outorg": "0716001",
			"vendor": "cc001",
			"invoiceVendor": "pp001",
			"currency": "rmb",
			"natCurrency": "rmb",
			"unit": "EA",
			"stockUnitId": "EA",
			"isGift": "0"
		}
	],
	"key": "id__pk"
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
| code | long | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回提示信息 示例：操作成功 |
| data | object | 否 | 请求返回数据集 |
| count | long | 否 | 返回总数 示例：3 |
| sucessCount | long | 否 | 返回成功总数 示例：0 |
| failCount | long | 否 | 返回失败总数 示例：3 |
| messages | object | 是 | 提示信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 3,
		"sucessCount": 0,
		"failCount": 3,
		"messages": [
			{
				"message": "org.springframework.jdbc.BadSqlGrammarException",
				"key": "1001A110000000000870"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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

