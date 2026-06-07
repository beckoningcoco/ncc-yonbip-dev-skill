---
title: "其他入库列表查询"
apiId: "b71f100dad26459a9f722e7a6d33baf6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Goods Receipt Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Goods Receipt Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他入库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Other Goods Receipt Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/othinrecord/list

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| code | string | 否 | 否 | 单据编号 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| open_hopeReceiveDate_begin | string | 否 | 否 | 开始时间 |
| open_hopeReceiveDate_end | string | 否 | 否 | 结束时间 |
| warehouse_name | string | 否 | 否 | 仓库名称 |
| bustype_name | string | 否 | 否 | 交易类型 |
| org_id | string | 是 | 否 | 库存组织id |
| org_code | string | 是 | 否 | 库存组织编码 |
| org_name | string | 否 | 否 | 库存组织名称 |
| stockMgr_name | string | 是 | 否 | 库管员id |
| operator_name | string | 是 | 否 | 业务员id |
| department_name | string | 是 | 否 | 部门id |
| product_cName | string | 否 | 否 | 物料id |
| product.productClass.name | string | 否 | 否 | 物料分类id |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如仓库编码warehouse.code、时间戳pubts、物料编码details.product.cCode、表头自定义项headItem.define1、表体自定义项details.bodyItem.define1等) |
| value2 | string | 否 | 否 | 值2(条件) |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) |
| value1 | string | 否 | 否 | 值1(条件) |

## 3. 请求示例

Url: /yonbip/scm/othinrecord/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"code": "",
	"pageSize": 0,
	"open_hopeReceiveDate_begin": "",
	"open_hopeReceiveDate_end": "",
	"warehouse_name": "",
	"bustype_name": "",
	"org_id": [
		""
	],
	"org_code": [
		""
	],
	"org_name": "",
	"stockMgr_name": [
		""
	],
	"operator_name": [
		""
	],
	"department_name": [
		""
	],
	"product_cName": "",
	"product.productClass.name": "",
	"isSum": false,
	"simpleVOs": [
		{
			"field": "",
			"value2": "",
			"op": "",
			"value1": ""
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
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页 |
| endPageIndex | int | 否 | 结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 合计对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"othInRecords_stockUnitId": "",
				"currency": "",
				"vouchdate": "",
				"code": "",
				"org_name": "",
				"org_code": "",
				"operator": "",
				"operator_name": "",
				"org": "",
				"department": "",
				"department_name": "",
				"department_code": "",
				"store": "",
				"store_name": "",
				"warehouse": "",
				"warehouse_name": "",
				"bustype": "",
				"bustype_extend_attrs_json": "",
				"warehouse_code": "",
				"bustype_name": "",
				"accountOrg_name": "",
				"accountOrg": "",
				"totalPieces": 0,
				"stockMgr_name": "",
				"stockMgr": "",
				"status": 0,
				"totalQuantity": 0,
				"exchangestatus": "",
				"creator": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"memo": "",
				"id": 0,
				"pubts": "",
				"tplid": 0,
				"othInRecords_product": "",
				"othInRecords_product_cCode": "",
				"othInRecords_product_cName": "",
				"othInRecords_productsku": "",
				"othInRecords_productsku_cCode": "",
				"othInRecords_productsku_cName": "",
				"othInRecords_product_productClass_code": "",
				"othInRecords_productsku_modelDescription": "",
				"othInRecords_product_modelDescription": "",
				"othInRecords_propertiesValue": "",
				"producedate": "",
				"batchno": "",
				"invaliddate": "",
				"othInRecords_qty": 0,
				"othInRecords_subQty": 0,
				"contactsQuantity": "",
				"othInRecords_unit_name": "",
				"othInRecords_unit_code": "",
				"subQty": 0,
				"stockUnitId_name": "",
				"project_code": "",
				"project_name": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"othInRecords_rowno": 0,
				"othInRecords_unit": "",
				"unit_Precision": "",
				"othInRecords_product_oUnitId": "",
				"othInRecords_product_productOfflineRetail_purchaseUnit": "",
				"othInRecords_invExchRate": 0,
				"othInRecords_productOfflineRetail_purchaseRate": 0,
				"othInRecords_product_primeCosts": 0,
				"othInRecords_productsku_primeCosts": 0,
				"othInRecords_memo": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"stockUnitId_precision": "",
				"othInRecords_id": 0,
				"project": "",
				"othInRecords_source": "",
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"sumRecordList": [
			{
				"totalPieces": 0,
				"othInRecords_qty": 0,
				"subQty": 0,
				"natMoney": 0,
				"totalQuantity": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	入参错误等异常	根据返回错误信息做出相应调整


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

