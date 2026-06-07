---
title: "调出列表查询"
apiId: "89d11ee3d4414b54b928e8500ab70ea0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer-out Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-out Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调出列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-out Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storeout/list

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
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 默认为false 默认值：false |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例:2020-09-09 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期 示例:2020-09-25 23:59:59 |
| code | string | 否 | 否 | 单据编号 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| bustype | string | 否 | 否 | 交易类型id |
| srcBillNO | string | 否 | 否 | 来源单据号 |
| breturn | boolean | 否 | 否 | 调拨退货, true:是、false:否、 |
| outorg | string | 否 | 否 | 调出组织id |
| outwarehouse | long | 否 | 否 | 调出仓库id |
| inwarehouse | long | 否 | 否 | 调入仓库id |
| outdepartment | string | 是 | 否 | 调出部门id |
| outbizperson | string | 否 | 否 | 调出业务员id |
| outStorekeeper | string | 否 | 否 | 调出库管员id |
| inorg | string | 否 | 否 | 调入组织id |
| productClass | long | 是 | 否 | 物料分类id |
| product | long | 是 | 否 | 物料id |
| outStore_name | string | 否 | 否 | 调出门店名称 |
| inStore_name | string | 否 | 否 | 调入门店名称 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| value1 | object | 否 | 否 | 值1(条件) |
| value2 | object | 否 | 否 | 值2(条件) |
| field | string | 否 | 否 | 属性名（例：code，vouchdate，status，inwarehouse，operator，bustype，outorg，inorg，outwarehouse，outdepartment，outbizperson，indepartment，inbizperson，product，productClass） |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |

## 3. 请求示例

Url: /yonbip/scm/storeout/list?access_token=访问令牌
Body: {
	"isSum": true,
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"code": "",
	"pageIndex": 0,
	"pageSize": 0,
	"bustype": "",
	"srcBillNO": "",
	"breturn": true,
	"outorg": "",
	"outwarehouse": 0,
	"inwarehouse": 0,
	"outdepartment": [
		""
	],
	"outbizperson": "",
	"outStorekeeper": "",
	"inorg": "",
	"productClass": [
		0
	],
	"product": [
		0
	],
	"outStore_name": "",
	"inStore_name": "",
	"simpleVOs": [
		{
			"value1": {},
			"value2": {},
			"field": "",
			"op": ""
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
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页显示行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页数 |
| endPageIndex | int | 否 | 结束页数 |
| recordCount | int | 否 | 总行数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 数据集合 |

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
				"vouchdate": "",
				"code": "",
				"store": "",
				"outStore": "",
				"outStore_name": "",
				"outwarehouse": "",
				"outwarehouse_name": "",
				"inStore": "",
				"inStore_name": "",
				"inwarehouse": "",
				"inwarehouse_name": "",
				"bustype": "",
				"bustype_name": "",
				"status": "",
				"totalQuantity": 0,
				"exchangestatus": "",
				"operator": "",
				"logistics": "",
				"operator_name": "",
				"memo": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"srcbill": "",
				"srcbillno": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"id": "",
				"pubts": "",
				"tplid": "",
				"breturn": true,
				"merchant": "",
				"merchant_name": "",
				"outorg": "",
				"outorg_name": "",
				"outaccount": "",
				"outaccount_name": "",
				"outdepartment": "",
				"outdepartment_name": "",
				"outbizperson": "",
				"outbizperson_name": "",
				"outStorekeeper": "",
				"outStorekeeper_name": "",
				"inorg": "",
				"inorg_name": "",
				"inaccount": "",
				"inaccount_name": "",
				"indepartment": "",
				"indepartment_name": "",
				"inbizperson": "",
				"inbizperson_name": "",
				"totalPieces": 0,
				"receiver": "",
				"receivemobile": "",
				"receiveaddr": "",
				"receivezipcode": "",
				"details_id": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"qty": 0,
				"unitName": "",
				"finishinqty": 0,
				"subQty": 0,
				"stockUnit_name": "",
				"project_name": "",
				"project_code": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
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
				"natCurrency_moneyDigit": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请联系管理员


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

