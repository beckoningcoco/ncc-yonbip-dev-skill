---
title: "实盘单列表查询"
apiId: "6427c9009e3249758f2ee265640c76ca"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Physical Inventory Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Physical Inventory Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 实盘单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Physical Inventory Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckreality/list

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
| pageSize | int | 否 | 是 | 每页条数 示例：10 默认值：10 |
| pageIndex | int | 否 | 是 | 页码 示例：1 默认值：1 |
| status | int | 否 | 否 | 单据状态，0：未确认、1：已确认、2：已审核 示例：0 |
| code | string | 否 | 否 | 单据编号 示例：SPD20210529000003 |
| open_vouchdate_begin | string | 否 | 否 | 开始时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-01 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 截止时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-01 23:59:59 |
| stockOrg_name | long | 是 | 否 | 库存组织id 示例：[1900568695608832] |
| warehouse_name | long | 是 | 否 | 仓库id 示例：[2003682301759744] |
| department_name | long | 是 | 否 | 部门id 示例：[2924668695607894] |
| productsku | long | 是 | 否 | 物料skuid 示例：[2029115569770752] |
| stockMgr_name | long | 是 | 否 | 库管员id 示例：[1900478695609098] |
| operator | long | 是 | 否 | 业务员id 示例：[3600568695306276] |
| product.productClass.name | long | 是 | 否 | 物料分类id 示例：[2467748695607897] |
| storeCheckRange | int | 否 | 否 | 盘点范围， 0：整仓盘点、1：指定品类、2：指定物料 示例：0 |
| simpleVOs | object | 是 | 是 | 扩展查询条件 |
| field | string | 否 | 是 | 属性名(条件)，1：id(主表id)、2：businesstype(业务类型id)、3：details.unit(主计量id)、4：details.stockUnitId(库存单位id) 、5：details.stockStatusDoc(库存状态id)、6：details.reserveid(预留对象id)、7：details.batchno(批次号)、8：isFastStoreCheck(是否快盘，true：是、false：否)等等 示例：isFastStoreCheck |
| op | string | 否 | 是 | 比较符(条件)，1：eq(等于)、2：gt(大于)、3：lt(小于)等等 示例：eq |
| logicOp | string | 否 | 否 | 逻辑服(分级) |
| value1 | string | 否 | 是 | 值1(条件) 示例：true |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/storecheckreality/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"status": 0,
	"code": "SPD20210529000003",
	"open_vouchdate_begin": "2020-09-01 00:00:00",
	"open_vouchdate_end": "2020-09-01 23:59:59",
	"stockOrg_name": [
		1900568695608832
	],
	"warehouse_name": [
		2003682301759744
	],
	"department_name": [
		2924668695607894
	],
	"productsku": [
		2029115569770752
	],
	"stockMgr_name": [
		1900478695609098
	],
	"operator": [
		3600568695306276
	],
	"product.productClass.name": [
		2467748695607897
	],
	"storeCheckRange": 0,
	"simpleVOs": [
		{
			"field": "isFastStoreCheck",
			"op": "eq",
			"logicOp": "",
			"value1": "true",
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
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 页数 |
| beginPageIndex | int | 否 | 查询开始页码 |
| endPageIndex | int | 否 | 查询结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳字符串 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 返回汇总对象 |

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
				"stockOrg": 0,
				"stockOrg_name": "",
				"store": 0,
				"store_name": "",
				"storecheckplan": 0,
				"storecheckplan_code": "",
				"vouchdate": "",
				"code": "",
				"status": 0,
				"warehouse": 0,
				"warehouse_name": "",
				"total_quantity": 0,
				"storeCheckRange": "",
				"businesstype": 0,
				"businesstype_name": "",
				"operator": 0,
				"operator_name": "",
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
				"id": 0,
				"stockMgr": 0,
				"stockMgr_name": "",
				"department": 0,
				"department_name": "",
				"isFastStoreCheck": "",
				"storecheckplan_vouchStatus": "",
				"realitydetail_id": 0,
				"product": 0,
				"productsku": 0,
				"accountOrg": 0,
				"barCode": "",
				"unit": 0,
				"accountOrg_name": "",
				"invExchRate": 0,
				"unit_precision": "",
				"stockUnitId_Precision": "",
				"details_id": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"quantity": 0,
				"accountQty": 0,
				"unitName": "",
				"number": 0,
				"accountNUM": 0,
				"details_stockUnitId": 0,
				"stockUnit_name": "",
				"st_storecheckrealitylist_userDefine001": "",
				"project_code": "",
				"project_name": "",
				"storeCheckRealityCustomItem": {
					"id": 0,
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
				"storeCheckRealityDetailCustomItem": {
					"id": 0,
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
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
					"define30": ""
				}
			}
		],
		"sumRecordList": [
			{
				"accountQty": "",
				"unit_precision": "",
				"accountNUM": "",
				"number": "",
				"details_unit": "",
				"quantity": "",
				"stockUnitId_Precision": "",
				"details_stockUnitId": ""
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

