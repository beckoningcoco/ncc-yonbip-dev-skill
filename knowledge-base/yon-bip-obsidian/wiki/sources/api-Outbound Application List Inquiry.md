---
title: "出库申请列表查询"
apiId: "e13eac9ce28e4d829c2e9987a939461d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Issue Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库申请列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/pickingrequisition/list

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
| pageIndex | int | 否 | 是 | 页号 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| status | string | 否 | 否 | 单据状态0：开立；1：已审核；2：已关闭；3：审核中 |
| id | string | 是 | 否 | 单据id |
| orgId | string | 是 | 否 | 申请组织id |
| requisitionDetail!materialId | string | 是 | 否 | 物料id |
| requisitionDetail!skuId | string | 是 | 否 | 物料SKUid |
| vouchdate | string | 否 | 否 | 单据日期 区间格式，2021-05-06|2021-05-06 23:00:00。若传入单个时间如：2021-05-06，则查询该时间之后，到当前时间之间的单据 |
| productionDepartmentId | string | 是 | 否 | 申请部门id |
| requisitionDetail!upcode | string | 否 | 否 | 来源单据编码 |
| requisitionDetail!orgId | string | 是 | 否 | 库存组织id |
| requisitionDetail!warehouseId | string | 是 | 否 | 出库仓库id |
| transTypeId | string | 否 | 否 | 交易类型id |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| op | string | 否 | 否 | 比较符(条件eq, neq, lt, gt, elt, egt, between, in, nin, like, leftlike, rightlike, is_null, is_not_null, and, or ) |
| value1 | string | 否 | 否 | 值1(条件) |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如时间戳pubts，库存单位requisitionDetail.stockUnitId，数量requisitionDetail.quantity等) |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"status": "",
	"id": [
		""
	],
	"orgId": [
		""
	],
	"requisitionDetail!materialId": [
		""
	],
	"requisitionDetail!skuId": [
		""
	],
	"vouchdate": "",
	"productionDepartmentId": [
		""
	],
	"requisitionDetail!upcode": "",
	"requisitionDetail!orgId": [
		""
	],
	"requisitionDetail!warehouseId": [
		""
	],
	"transTypeId": "",
	"simpleVOs": [
		{
			"op": "",
			"value1": "",
			"field": "",
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 |
| pageSize | long | 否 | 分页大小 |
| recordCount | long | 否 | 总记录数 |
| recordList | object | 是 | 返回对象 |
| pageCount | long | 否 | 页数 |
| beginPageIndex | long | 否 | 查询开始页码 |
| endPageIndex | long | 否 | 查询结束页 |
| pubts | string | 否 | 时间戳字符串 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"returncount": 0,
				"code": "",
				"auditor": "",
				"auditTime": "",
				"closer": "",
				"closeTime": "",
				"modifier": "",
				"modifyTime": "",
				"remark": "",
				"closeDate": "",
				"auditDate": "",
				"orgId": "",
				"vouchdate": "",
				"transTypeId": "",
				"mainUnitPrecision": 0,
				"requisitionType": "",
				"id": 0,
				"transTypeName": "",
				"pickingRequisitionDetailUserdefItem": {
					"id": "",
					"define1": ""
				},
				"define1": "",
				"bizFlow": "",
				"productDefine1": "",
				"pickingRequisitionUserdefItem": {
					"id": "",
					"define1": ""
				},
				"bizFlow_name": "",
				"bizFlow_version": "",
				"isFlowCoreBill": true,
				"verifystate": "",
				"pubts": "",
				"creator": "",
				"orgName": "",
				"isWfControlled": false,
				"requisitionDetail": {
					"id": 0,
					"quantity": 0,
					"skuId": 0,
					"productUnitPrecision": 0,
					"materialName": "",
					"rauxiliaryQuantity": 0,
					"productUnitName": "",
					"batchNo": "",
					"define1": "",
					"requirementDate": "",
					"rowno": "",
					"materialModel": "",
					"materialModelDescription": "",
					"orgId": 0,
					"materialId": 0,
					"changeRate": 0,
					"stockUnitId": 0,
					"orgName": "",
					"productId": 0,
					"materialCode": "",
					"skuName": "",
					"skuCode": "",
					"pickingRequisitionDetailExtend": {
						"wipOpSn": "",
						"wipOperationId": ""
					},
					"pickingRequisitionDetailExtend_wipOperationCode": "",
					"pickingRequisitionDetailExtend_wipOperationName": "",
					"isWip": ""
				},
				"createTime": "",
				"status": 0,
				"costAccountingMethod": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"pubts": ""
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

