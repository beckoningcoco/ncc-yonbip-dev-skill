---
title: "转库列表查询"
apiId: "ca371648bc59453eb0aa27b9c6dbdcff"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stock Transfer Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stock Transfer Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 转库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Stock Transfer Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storetransfer/list

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
| pageSize | long | 否 | 是 | 总页数 示例：10 |
| pageIndex | long | 否 | 是 | 当前页数 示例：1 |
| code | string | 否 | 否 | 单据编码 示例：ZK00000003 |
| businesstype | string | 是 | 否 | 交易类型名称 示例：["转库单"] |
| outWarehouse | string | 是 | 否 | 出库仓库名称 示例：["北京仓"] |
| inWarehouse | string | 是 | 否 | 入库仓库名称 示例：["总仓"] |
| operator | string | 是 | 否 | 业务员id 示例：["1895296655577344"] |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例：2020-09-11 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期 示例：2020-09-12 23:59:59 |
| org_name | string | 是 | 否 | 库存组织id 示例：["1900568695608832"] |
| status | string | 否 | 否 | 单据状态，0开立、1已审核、3已提交 示例：0 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| value1 | string | 否 | 否 | 值1(条件) 示例：Z-001 |
| op | string | 否 | 否 | 比较符 eq（等于）、in（包含） 示例：eq |
| field | string | 否 | 否 | 属性名 （即cFieldName） 示例：operator.name（业务员名称）、outWarehouse.code（出库仓编码）、inWarehouse.name（入库仓名称）、details.product.cCode（物料编码）、details.productsku.cCode（sku编码） |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/storetransfer/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"code": "ZK00000003",
	"businesstype": [
		"转库单"
	],
	"outWarehouse": [
		"北京仓"
	],
	"inWarehouse": [
		"总仓"
	],
	"operator": [
		"1895296655577344"
	],
	"open_vouchdate_begin": "2020-09-11 00:00:00",
	"open_vouchdate_end": "2020-09-12 23:59:59",
	"org_name": [
		"1900568695608832"
	],
	"status": "0",
	"simpleVOs": [
		{
			"value1": "Z-001",
			"op": "eq",
			"field": "operator.name（业务员名称）、outWarehouse.code（出库仓编码）、inWarehouse.name（入库仓名称）、details.product.cCode（物料编码）、details.productsku.cCode（sku编码）",
			"value2": ""
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| sumRecordList | object | 是 | 返回合计信息 |
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"storeTransDetail_qty": 0,
				"details_unit": 0,
				"details_id": 0,
				"details_stockUnitId": 0,
				"stockUnitId_precision": 0,
				"unit_Precision": 0,
				"subQty": 0
			}
		],
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"details_stockUnitId": 0,
				"vouchdate": "",
				"totalQuantity": 0,
				"code": "",
				"status": "",
				"outWarehouse": "",
				"outWarehouse_name": "",
				"inWarehouse": "",
				"inWarehouse_name": "",
				"businesstype": "",
				"department": "",
				"department_name": "",
				"accountOrg_name": "",
				"accountOrg": "",
				"totalPieces": "",
				"stockMgr_name": "",
				"stockMgr": "",
				"businesstype_name": "",
				"org_name": "",
				"org": "",
				"store": "",
				"operator": "",
				"operator_name": "",
				"store_name": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"memo": "",
				"pubts": "",
				"id": "",
				"returncount": "",
				"verifystate": "",
				"isWfControlled": "",
				"storeTransCustomItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define23": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"storeTransDetail_product": "",
				"storeTransDetail_product_cCode": "",
				"storeTransDetail_product_cName": "",
				"storeTransDetail_productsku_cCode": "",
				"storeTransDetail_productsku_cName": "",
				"storeTransDetail_propertiesValue": "",
				"sBatchNo": "",
				"invaliddate": "",
				"storeTransDetail_qty": 0,
				"storeTransDetail_unit_name": "",
				"subQty": 0,
				"stockUnitId_name": "",
				"project_code": "",
				"project_name": "",
				"storeTransDetail_productsku": "",
				"storeTransDetail_subQty": 0,
				"storeTransDetail_rowno": 0,
				"storeTransDetail_unit": "",
				"unit_Precision": "",
				"storeTransDetail_product_oUnitId": "",
				"storeTransDetail_product_productOfflineRetail_purchaseUnit": "",
				"storeTransDetail_invExchRate": 0,
				"storeTransDetail_productOfflineRetail_purchaseRate": 0,
				"storeTransDetail_product_primeCosts": 0,
				"storeTransDetail_productsku_primeCosts": 0,
				"storeTransDetail_memo": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"stockUnitId_precision": "",
				"details_id": 0,
				"storeTransDetail_productsku_modelDescription": "",
				"storeTransDetail_product_modelDescription": "",
				"project": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310008	参数校验失败，参数[pageSize]是必填的。	正确填写请求参数中的pageSize值


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

