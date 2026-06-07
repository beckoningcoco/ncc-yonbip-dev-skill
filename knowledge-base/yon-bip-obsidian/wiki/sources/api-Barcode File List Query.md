---
title: "条码档案列表查询"
apiId: "52562ee44e4f4e1faf0c5086d1e8022f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Barcode Generation"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Barcode Generation]
platform_version: "BIP"
source_type: community-api-docs
---

# 条码档案列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/file/list

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
| pageIndex | long | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页行数 示例：10 默认值：10 |
| product_cCode | string | 否 | 否 | 物料编码 示例：00001 |
| barcodeRule_name | string | 否 | 否 | 条码规则名称 示例：默认规则 |
| barcode | string | 否 | 否 | 条码 示例：123456 |
| open_vouchdate_begin | DateTime | 否 | 否 | 生成日期开始时间，日期格式：YYYY-MM-DD HH:mm:ss 示例：2021-11-19 00:00:00 |
| open_vouchdate_end | DateTime | 否 | 否 | 生成日期结束时间，日期格式：YYYY-MM-DD HH:mm:ss 示例：2021-11-20 23:59:59 |
| barcodeType | string | 是 | 否 | 条码类型，"0"-条码;"1"-箱码 示例：["0","1"] |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) 例如1、pubts(时间戳),2、barcodeRule.code(条码规则编码) 示例：pubts |
| op | string | 否 | 否 | 比较符(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于;is_null:为空;is_not_null:非空) 示例：between |
| value1 | string | 否 | 否 | 值1（条件） 示例：2021-11-19 00:00:00 |
| value2 | string | 否 | 否 | 值2（条件） 示例：2021-11-20 23:59:59 |

## 3. 请求示例

Url: /yonbip/scm/barcode/file/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"product_cCode": "00001",
	"barcodeRule_name": "默认规则",
	"barcode": "123456",
	"open_vouchdate_begin": "2021-11-19 00:00:00",
	"open_vouchdate_end": "2021-11-20 23:59:59",
	"barcodeType": [
		"0",
		"1"
	],
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-11-19 00:00:00",
			"value2": "2021-11-20 23:59:59"
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
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 查询开始页码 示例：1 |
| endPageIndex | long | 否 | 查询结束页 示例：1 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"barcodeRule": 2494909125775616,
				"manageClass_Name": "子分类1",
				"stockUnit_name": "11",
				"product_cCode": "000177",
				"productsku_skuName": "条码档案打印01CSE蓝中",
				"skuShortName": "条码档案打印01",
				"subQty": 1,
				"barcodeTag": "2442440143409408",
				"product_cName": "条码档案打印01",
				"free1": "",
				"requireUnit_Name": "11",
				"stockUnitId_Precision": 2,
				"mnemonicCode": "TMDADY01",
				"id": 2495259664994560,
				"barcode": "00017707",
				"batchRate": 1,
				"productClass": 2371697186902272,
				"weight": 2,
				"stockUnit": 2353298199974144,
				"unit_name": "11",
				"volume": 3,
				"unit": 2353298199974144,
				"netWeight": 3,
				"productsku": 2493727167960065,
				"barcodeRule_name": "1111",
				"productsku_cCode": "123133",
				"qty": 1,
				"unit_Precision": 2,
				"batchPriceUnit_Name": "11",
				"barcodeTag_cCode": "2323",
				"invExchRate": 1,
				"weightUnit": 2353530000216320,
				"offlineUnit_Name": "盎司",
				"barcodeType": 0,
				"skuMnemonicCode": "TMDADY01",
				"weightUnit_Name": "个",
				"vouchdate": "2021-10-29 00:00:00",
				"barcode_qty": 1,
				"barcodeTag_cName": "2311",
				"manageClass": 2404488658325760,
				"detail_batchUnit_Name": "11",
				"pubts": "2021-10-29 17:09:23",
				"org_name": "CSE全职能组织",
				"purchasePriceUnit_Name": "11",
				"netWeightUnit": 2397232616820992,
				"batchUnit_Name": "11",
				"creator": "门浩",
				"product": 2493727167960064,
				"barcode_basis": "1",
				"org": "2353524568904192",
				"manageClass_Code": "21212",
				"productClass_Code": "95spfl",
				"netWeightUnit_Name": "千克",
				"createTime": "2021-10-29 17:09:24",
				"purchaseUnit_Name": "11",
				"source": "",
				"stockStatusDoc_name": "",
				"barcode_packing_quantity": "",
				"warehouse": "",
				"warehouse_name": "",
				"onlineUnit_Name": "盎司",
				"productOfflineRetail_onlineUnireserveidt": "",
				"sourceid": "",
				"upcode": "",
				"skuBarCode": "",
				"product_model": "",
				"vendor_name": "",
				"product_modelDescription": "",
				"markPrice": "",
				"vendor": "",
				"salePrice": "",
				"invaliddate": "",
				"batchno": "",
				"producedate": "",
				"reserveid_name": "",
				"productOfflineRetail_batchPriceUnit": "",
				"productOfflineRetail_offlineUnit": "",
				"productOfflineRetail_purchasePriceUnit": "",
				"productOfflineRetail_onlineUnit": "",
				"productOfflineRetail_purchaseUnit": "",
				"productOfflineRetail_storeOrderUnitKey": "",
				"productOfflineRetail_batchUnit": "",
				"skudefine1": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

