---
title: "材料出库列表查询"
apiId: "b483475dfd65499ab122b773eb9a8061"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Issue Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Issue Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 材料出库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Material Issue Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/materialout/list

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
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间 |
| open_vouchdate_end | string | 否 | 否 | 单据结束时间 |
| bustype_name | string | 否 | 否 | 交易类型 |
| stockOrg | long | 是 | 否 | 库存组织id |
| stockOrg_code | string | 是 | 否 | 库存组织编码 |
| stockOrg_name | string | 否 | 否 | 库存组织名称 |
| product_cName | string | 是 | 否 | 物料ID |
| product.productClass.name | string | 是 | 否 | 物料分类ID |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件),子表加前缀[materOuts.];materOuts.upcoded为来源单据号 |
| op | string | 否 | 否 | 条件比较符(eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,and,or) |
| value1 | string | 否 | 否 | 值1(条件),单条件时仅使用这个配置 |
| value2 | string | 否 | 否 | 值2(条件),单条件时此配置无效 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/scm/materialout/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"bustype_name": "",
	"stockOrg": [
		0
	],
	"stockOrg_code": [
		""
	],
	"stockOrg_name": "",
	"product_cName": [
		""
	],
	"product.productClass.name": [
		""
	],
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
	],
	"isSum": false
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
| sumRecordList | object | 是 | sum合计信息 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页条数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |
| recordCount | int | 否 | 总条数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"totalPieces": "",
				"totalQuantity": "",
				"subQty": "",
				"qty": ""
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
				"currency": "",
				"materOuts_product": "",
				"materOuts_unit": "",
				"materOuts_productsku": "",
				"vouchdate": "",
				"code": "",
				"org": "",
				"org_code": "",
				"org_name": "",
				"store": "",
				"bustype": "",
				"bustype_name": "",
				"store_name": "",
				"department_name": "",
				"department": "",
				"warehouse": "",
				"warehouse_name": "",
				"stockMgr_name": "",
				"stockMgr": "",
				"memo": "",
				"bustype_extend_attrs_json": "",
				"accountOrg_name": "",
				"accountOrg": "",
				"totalPieces": "",
				"exchangestatus": "",
				"status": "",
				"totalQuantity": 0,
				"srcbill": "",
				"creator": "",
				"srcbillno": "",
				"srcBillType": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"id": "",
				"pubts": "",
				"tplid": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"materOuts": {
					"id": ""
				},
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"productClass_code": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"qty": 0,
				"product_unitName": "",
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"project_code": "",
				"project_name": "",
				"natUnitPrice": 0,
				"natMoney": 0,
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
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"unit_code": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"isWip": "",
				"costAccountingMethod": "",
				"bodyParallel": {
					"wipOpSn": "",
					"wipOperationId": ""
				},
				"odyParallel_wipOperationCode": "",
				"bodyParallel_wipOperationName": "",
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
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

1	2025-09-28

新增

请求参数 isSum


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

