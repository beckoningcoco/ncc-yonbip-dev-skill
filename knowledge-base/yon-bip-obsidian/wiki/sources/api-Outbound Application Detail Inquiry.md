---
title: "出库申请详情查询"
apiId: "3570a5d4428d42bab37e9fb73cd680ef"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Issue Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库申请详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/pickingrequisition/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据id |

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/detail?access_token=访问令牌&id=

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
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | data |
| creator | string | 否 | 创建人姓名 |
| bizFlow_version | string | 否 | 流程版本 |
| bizFlow_name | string | 否 | 流程名称 |
| isFlowCoreBill | boolean | 否 | 是否核心单据 |
| remark | string | 否 | 备注 |
| bizFlow | string | 否 | 流程ID |
| closeTime | DateTime | 否 | 关闭时间 |
| closer | string | 否 | 关闭人 |
| auditTime | DateTime | 否 | 审核时间 |
| auditor | string | 否 | 审核人 |
| modifyTime | DateTime | 否 | 最后修改时间 |
| modifier | string | 否 | 最后修改人 |
| closeDate | DateTime | 否 | 关闭日期 |
| auditDate | DateTime | 否 | 审核日期 |
| orgName | string | 否 | 申请组织名称 |
| code | string | 否 | 申请单编码 |
| pickingRequisitionUserdefItem | object | 否 | 表头固定自定义项 |
| masterOrgKeyField | string | 否 | 主组织主键名 示例：orgId |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| creatorId | long | 否 | 创建人ID |
| transTypeKeyField | string | 否 | 交易类型主键名 示例：transTypeId |
| verifystate | string | 否 | 审批状态 |
| returncount | long | 否 | 退回次数 |
| orgId | string | 否 | 申请组织ID |
| vouchdate | string | 否 | 单据日期 |
| operatorId | string | 否 | 申请人ID |
| productionDepartmentId | string | 否 | 申请部门Id |
| operatorName | string | 否 | 申请人姓名 |
| departmentName | string | 否 | 申请部门名称 |
| createTime | string | 否 | 创建时间 |
| requisitionDetail | object | 是 | 出库申请子表 |
| transTypeId | string | 否 | 交易类型ID |
| requisitionType | string | 否 | 申请类型1：出库申请；2：领料申请 |
| id | long | 否 | 出库申请主表id |
| transTypeName | string | 否 | 交易类型名称 |
| pubts | string | 否 | 时间戳字符串 |
| transTypeCode | string | 否 | 交易类型编码 |
| status | long | 否 | 单据状态0：开立；1：已审核；2：已关闭；3：审核中 示例：0 |
| costAccountingMethod | string | 否 | 委外成本核算方式：0按委外入库核算成本，1 按委外订单核算成本 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"creator": "",
		"bizFlow_version": "",
		"bizFlow_name": "",
		"isFlowCoreBill": true,
		"remark": "",
		"bizFlow": "",
		"closeTime": "",
		"closer": "",
		"auditTime": "",
		"auditor": "",
		"modifyTime": "",
		"modifier": "",
		"closeDate": "",
		"auditDate": "",
		"orgName": "",
		"code": "",
		"pickingRequisitionUserdefItem": {
			"id": "",
			"define1": ""
		},
		"masterOrgKeyField": "orgId",
		"isWfControlled": false,
		"creatorId": 0,
		"transTypeKeyField": "transTypeId",
		"verifystate": "",
		"returncount": 0,
		"orgId": "",
		"vouchdate": "",
		"operatorId": "",
		"productionDepartmentId": "",
		"operatorName": "",
		"departmentName": "",
		"createTime": "",
		"requisitionDetail": [
			{
				"auxiliaryQuantity": 0,
				"materialModelDescription": "",
				"manufacturingSpecification": "",
				"sku": {
					"define1": "",
					"dedine2": ""
				},
				"productDefine1": "",
				"define1": "",
				"pickingRequisitionDetailUserdefItem": {
					"id": "",
					"define1": ""
				},
				"engineeringDrawingNo": "",
				"stockUnitPrecision": 0,
				"warehouseName": "",
				"stockUnitName": "",
				"orgId": "",
				"requisitionId": 0,
				"skuName": "",
				"materialModel": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"isBatchManage": false,
				"mainUnitPrecision": 0,
				"id": 0,
				"changeRate": 0,
				"skuId": 0,
				"mainUnit": 0,
				"quantity": 0,
				"orgName": "",
				"productId": 0,
				"changeType": "",
				"materialCode": "",
				"isExpiryDateManage": "",
				"materialId": 0,
				"requirementDate": "",
				"mainUnitName": "",
				"materialName": "",
				"warehouseId": 0,
				"skuCode": "",
				"stockQuantity": 0,
				"auxiliaryStockQuantity": 0,
				"makeRuleCode": "",
				"rowno": "",
				"stockUnitId": 0,
				"pickingRequisitionDetailExtend": {
					"wipOpSn": "",
					"wipOperationId": ""
				},
				"isWip": "",
				"pickingRequisitionDetailExtend_wipOperationCode": "",
				"pickingRequisitionDetailExtend_wipOperationName": ""
			}
		],
		"transTypeId": "",
		"requisitionType": "",
		"id": 0,
		"transTypeName": "",
		"pubts": "",
		"transTypeCode": "",
		"status": 0,
		"costAccountingMethod": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-11-08

更新

返回参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

