---
title: "科目辅助全景查询"
apiId: "604d1cdf7ff947b99972a6847d46dde7"
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

# 科目辅助全景查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/api/report/allAuxiliaryBalanceQuery

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
| requestid | string | 否 | 否 | 每次请求的id,不校验唯一 示例：12345 |
| accbook_id | string | 否 | 是 | 账簿主键 示例：4E998884-F918-4BDA-8126-37CF072F5FA3 |
| startperiod | string | 否 | 否 | 起始期间 示例：2020-01 |
| endperiod | string | 否 | 否 | 终止期间 示例：2020-09 |
| currency | string | 否 | 否 | 币种 示例：standard |
| auxiliary | string | 否 | 否 | 辅助项档案编码，多个用逗号隔开,严格按档案编码的大小写填写，多个的话，仅查同时存在这多个辅助项的科目，不写则默认查当前账簿对应科目表的全部 示例：customer |
| auxIdsMap | object | 否 | 否 | 辅助项主键列表（常用辅助项编码如下，项目：project，物料：material，人员：personnel，客户：customer，供应商：supplier，部门：dept，物料分类：materialclass） |
| startaccsubject | string | 否 | 否 | 起始科目 示例：1002 |
| endaccsubject | string | 否 | 否 | 终止科目 示例：6900 |
| tally | string | 否 | 否 | 是否包含未记账凭证 N:不包含;Y包含;默认不包含,不区分大小写 示例：Y |
| displayflag | string | 否 | 否 | 1:无余额无发生不返回;2:无发生不返回；默认都返回 示例：1 |
| page | int | 否 | 否 | 页码 |
| pageSize | int | 否 | 否 | 每页数量 |

## 3. 请求示例

Url: /yonbip/fi/api/report/allAuxiliaryBalanceQuery?access_token=访问令牌
Body: {
	"requestid": "12345",
	"accbook_id": "4E998884-F918-4BDA-8126-37CF072F5FA3",
	"startperiod": "2020-01",
	"endperiod": "2020-09",
	"currency": "standard",
	"auxiliary": "customer",
	"auxIdsMap": {},
	"startaccsubject": "1002",
	"endaccsubject": "6900",
	"tally": "Y",
	"displayflag": "1",
	"page": 0,
	"pageSize": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 返回状态 示例：true |
| total | long | 否 | 总数 示例：37 |
| message | string | 否 | 返回信息 示例：查询成功！ |
| requestID | string | 否 | 每次请求的id,不校验唯一 示例：12345 |
| page | int | 否 | 页码 示例：1 |
| pageSize | int | 否 | 每页数量 示例：10 |
| data | object | 是 | 返回数据 |
| accumulationthisyear_qty_debit | long | 否 | 本年累计借方数量 示例：0 |
| currentperiodamt_oc_credit | long | 否 | 本期发生原币贷方金额 示例：1 |
| accumulationthisyear_fc_credit | long | 否 | 本年累计本币贷方金额 示例：1 |
| currentperiodamt_qty_credit | long | 否 | 本期发生贷方数量 示例：0 |
| currentperiodamt_oc_debit | long | 否 | 本期发生原币借方金额 示例：46 |
| accproperty | string | 否 | 会计要素 示例：流动资产 |
| closingbalance_fc_debit | long | 否 | 期末余额本币借方金额 示例：45 |
| accsubject_class | string | 否 | 科目分类 示例：资产 |
| closingbalance_qty_debit | long | 否 | 期末余额借方数量 示例：0 |
| axiliaryItems | object | 是 | 辅助项明细 |
| accsubject_id | string | 否 | 科目主键 示例：254F4612-CDD4-4C4C-86E8-1189D3E19CA9 |
| currentperiodamt_fc_debit | long | 否 | 本期发生本币借方金额 示例：46 |
| tenantid | string | 否 | 租户 示例：ictu6geb |
| firstaccsubject_name | string | 否 | 一级科目名称 示例：人生何处不相逢1 |
| direction | string | 否 | 方向 示例：Debit |
| firstaccsubject_code | string | 否 | 一级科目编码 示例：1002 |
| currentperiodamt_fc_credit | long | 否 | 本期发生本币贷方金额 示例：1 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| currentperiodamt_qty_debit | long | 否 | 本期发生借方数量 示例：0 |
| accumulationthisyear_oc_credit | long | 否 | 本年累计原币贷方金额 示例：1 |
| accsubject_name | string | 否 | 科目名称 示例：人生何处不相逢1 |
| closingbalance_oc_debit | long | 否 | 期末余额原币借方金额 示例：45 |
| accsubject_code | string | 否 | 科目code 示例：100201 |
| accumulationthisyear_qty_credit | long | 否 | 本年累计贷方数量 示例：0 |
| accumulationthisyear_fc_debit | long | 否 | 本年累计本币借方金额 示例：46 |
| currency_id | string | 否 | 币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"success": true,
		"total": 37,
		"message": "查询成功！",
		"requestID": "12345",
		"page": 1,
		"pageSize": 10,
		"data": [
			{
				"accumulationthisyear_qty_debit": 0,
				"currentperiodamt_oc_credit": 1,
				"accumulationthisyear_fc_credit": 1,
				"currentperiodamt_qty_credit": 0,
				"currentperiodamt_oc_debit": 46,
				"accproperty": "流动资产",
				"closingbalance_fc_debit": 45,
				"accsubject_class": "资产",
				"closingbalance_qty_debit": 0,
				"axiliaryItems": [
					{
						"axiliaryName": "客户",
						"axiliaryCode": "customer",
						"items": {
							"customer_name": "客-租户19902388888",
							"customer_id": "1771744527700224",
							"customer_code": "0001000002"
						}
					}
				],
				"accsubject_id": "254F4612-CDD4-4C4C-86E8-1189D3E19CA9",
				"currentperiodamt_fc_debit": 46,
				"tenantid": "ictu6geb",
				"firstaccsubject_name": "人生何处不相逢1",
				"direction": "Debit",
				"firstaccsubject_code": "1002",
				"currentperiodamt_fc_credit": 1,
				"currency_name": "人民币",
				"currentperiodamt_qty_debit": 0,
				"accumulationthisyear_oc_credit": 1,
				"accsubject_name": "人生何处不相逢1",
				"closingbalance_oc_debit": 45,
				"accsubject_code": "100201",
				"accumulationthisyear_qty_credit": 0,
				"accumulationthisyear_fc_debit": 46,
				"currency_id": "G001ZM0000DEFAULTCURRENCT00000000001"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-02-17

更新

请求参数 startperiod

更新

请求参数 endperiod

更新

请求参数 currency

调整入参必填项，设置账簿主键为必填项


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

