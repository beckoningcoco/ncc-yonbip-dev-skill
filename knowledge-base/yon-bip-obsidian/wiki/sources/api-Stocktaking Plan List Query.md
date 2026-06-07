---
title: "盘点计划列表查询"
apiId: "d11797898d48425b82933a5020e40634"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Review Plan"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Review Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点计划列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Review Plan (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckplan/list

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
| status | string | 否 | 否 | 单据状态, 0:未复核、1:已复核、2:已作废 |
| code | string | 否 | 否 | 单据编号 |
| open_vouchdate_begin | string | 否 | 否 | 开始时间 |
| open_vouchdate_end | string | 否 | 否 | 结束时间 |
| stockOrg_name | string | 否 | 否 | 库存组织 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：20 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件)，1：id(主表id)、2：details.batchno(批次号)、3：isFastStoreCheck(是否是实盘单) |
| op | string | 否 | 否 | 比较符(条件)，1：eq(等于)、2：gt(大于)、3：lt(小于)等等 |
| logicOp | string | 否 | 否 | 逻辑符(分级) |
| value1 | string | 否 | 否 | 值1(条件) |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/storecheckplan/list?access_token=访问令牌
Body: {
	"status": "",
	"code": "",
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"stockOrg_name": "",
	"pageIndex": 0,
	"pageSize": 0,
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"logicOp": "",
			"value1": "",
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
| sumRecordList | object | 是 | 返回汇总对象 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页条数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |
| recordCount | int | 否 | 记录条数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"accountQty": "",
				"details_stockUnitId": "",
				"details_unit": "",
				"unit_precision": "",
				"stockUnitId_Precision": "",
				"accountNUM": ""
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
				"details_product": "",
				"details_productsku": "",
				"details_project": "",
				"details_stockUnitId": "",
				"details_unit": "",
				"vouchdate": "",
				"code": "",
				"stockOrg_name": "",
				"stockOrg": "",
				"checkStartTime": "",
				"status": "",
				"store": "",
				"store_name": "",
				"warehouse": "",
				"warehouse_name": "",
				"businesstype": "",
				"businesstype_name": "",
				"operator": "",
				"operator_name": "",
				"storeCheckRange": "",
				"creator": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"memo": "",
				"storeCheckPlanCustomItem": {
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
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
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
					"define30": ""
				},
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"accountQty": 0,
				"unitName": "",
				"accountNUM": 0,
				"stockUnit_name": "",
				"project_code": "",
				"project_name": "",
				"unit_precision": "",
				"stockUnitId_Precision": "",
				"storeCheckPlanDetailCustomItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
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
					"define60": "",
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
					"define30": ""
				},
				"details_id": "",
				"id": "",
				"pubts": ""
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

