---
title: "采购发票列表查询"
apiId: "7f33e93a14d44dceb1af10d882b59712"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Invoice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购发票列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinvoice/list

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
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| inInvoiceOrg | long | 否 | 否 | 收票组织id 示例：1997044215261954053 |
| org | long | 否 | 否 | 采购组织id 示例：1997044215261954054 |
| vendor | long | 否 | 否 | 供应商id 示例：1997044387060645895 |
| code | string | 否 | 否 | 单据编码 示例：FP240514000014 |
| product | long | 否 | 否 | 物料id 示例：1847911200329984 |
| status | int | 否 | 否 | 发票状态,0 :开立 1: 已审核 3:审核中 示例：0 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期查询开始时间格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据日期查询截止时间格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-13 00:00:00 |
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件) ，1：bustype(交易类型id)、2：invoiceVendor(开票供应商id)、3：operator(采购业务员id)、4：department(部门id) 、5：purInvoices.project(项目id)、6：otherInvoiceCode(对方发票号)、7；purInvoices.upcode(来源单据号)、8：purInvoices.productsku(物料skuID)、 pubts(时间戳)、9；headItem.define1(表头自定义项1)、10：purInvoices.bodyItem.define1(表体自定义项1) 示例：1 |
| logicOp | string | 否 | 否 | 逻辑符(分级) |
| value1 | string | 否 | 否 | 值1(条件) 示例：2024-05-13 00:00:00 |
| value2 | string | 否 | 否 | 值2(条件) 示例：2024-05-13 00:00:00 |
| op | string | 否 | 否 | 比较符(条件)，1：eq(等于)、2：gt(大于)、3：lt(小于)等等 示例:eq 默认值:eq 示例：1 |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：purInvoices.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code) 示例：id |
| order | string | 否 | 否 | 顺序:正序(asc);倒序(desc) 示例：asc |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"inInvoiceOrg": 1997044215261954053,
	"org": 1997044215261954054,
	"vendor": 1997044387060645895,
	"code": "FP240514000014",
	"product": 1847911200329984,
	"status": 0,
	"open_vouchdate_begin": "2024-05-13 00:00:00",
	"open_vouchdate_end": "2024-05-13 00:00:00",
	"isSum": false,
	"simpleVOs": [
		{
			"field": "1",
			"logicOp": "",
			"value1": "2024-05-13 00:00:00",
			"value2": "2024-05-13 00:00:00",
			"op": "1"
		}
	],
	"queryOrders": [
		{
			"field": "id",
			"order": "asc"
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| recordCount | long | 否 | 总记录数 示例：1 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 起始页码 示例：1 |
| sumRecordList | object | 是 | 汇总 |
| pubts | string | 否 | 时间戳 示例：2020-09-08 19:42:51 |
| pageSize | long | 否 | 分页大小 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordList": [
			{
				"org": "1511040517705984",
				"taxRateBody": 0,
				"product_cName": "物料名称01",
				"sourceid": 1511376853930240,
				"org_name": "yontest云创股份",
				"invoiceVendor": 1511106976321792,
				"currency_code": "CNY222",
				"isBeginning": false,
				"currency_moneyDigit": 2,
				"productsku": 1511111509479680,
				"unit_Code": "jldw01",
				"vendor": 1511106976321792,
				"createTime": "2019-12-04 16:12:36",
				"qty": 1000,
				"isInvBack": false,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"upcode": "CGRK0005",
				"demandOrg": 1511040517705984,
				"inOrg": 1511040517705984,
				"inInvoiceOrg": 1511040517705984,
				"product_modelDescription": "45#",
				"status": 0,
				"oriTaxUnitPrice": 1000,
				"sourceautoid": 1511376853946624,
				"realProductAttribute": 1,
				"vendor_name": "供应商01",
				"pubts": "2020-08-18 16:39:22",
				"unit_Precision": 3,
				"id": 1511377408151808,
				"natTax": 33.7,
				"natMoney": 33.9,
				"natTaxUnitPrice": 33.9,
				"exchRate": 1,
				"exchRateType": 110000000000032,
				"exchRateType_name": "基准汇率",
				"otherInvoiceDate": "2019-12-04 00:00:00",
				"bustype": "110000000000032",
				"oriUnitPrice": 1000,
				"code": "FP0002",
				"listOriMoney": 1000000,
				"vouchdate": "2019-12-04 00:00:00",
				"isFlowCoreBill": false,
				"listOriSum": 1000000,
				"isWfControlled": false,
				"bustype_name": "通用采购发票",
				"product_model": "45#",
				"product_cCode": "fl010003",
				"productsku_modelDescription": "45#",
				"product": 1511111502991616,
				"listOriTax": 0,
				"demandOrg_name": "yontest云创股份",
				"inOrg_name": "yontest云创股份",
				"inInvoiceOrg_name": "yontest云创股份",
				"natCurrency_priceDigit": 7,
				"otherInvoiceCode": "0123456",
				"currency_priceDigit": 7,
				"creditStatus": 0,
				"source": "ustock.st_purinrecord",
				"invoiceType": 0,
				"bdInvoiceTypeId": "0",
				"bdInvoiceTypeCode": "0",
				"bdInvoiceTypeName": "增值税专用发票",
				"unit_Name": "个数",
				"invoiceVendor_name": "供应商01",
				"natCurrency_code": "CNY222",
				"productsku_cName": "物料名称01",
				"unit": 1511083492184320,
				"realProductAttributeType": 1,
				"productsku_cCode": "fl010003",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"creator": "YS测试1",
				"natCurrency_moneyDigit": 2
			}
		],
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"sumRecordList": [
			{
				"natCurrency_priceDigit": 7,
				"currency_priceDigit": 7,
				"unit_Precision": 3,
				"currency_moneyDigit": 2,
				"listOriMoney": 1000000,
				"natCurrency_moneyDigit": 2,
				"listOriTax": 0,
				"listOriSum": 1000000
			}
		],
		"pubts": "2020-09-08 19:42:51",
		"pageSize": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	Can't find attribute [pu.purinvoice.PurInvoice/sss]


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

