---
title: "出库申请单个保存"
apiId: "9d48ec82fa7d4617ace5022aa6b5211f"
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

# 出库申请单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/pickingrequisition/single/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 出库申请[st.pickingrequisition.PickingRequisition] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 主表id 如果状态是update，id要必传 示例：2430202243059968 |
| orgId | string | 否 | 是 | 申请组织id或申请组织code 示例：2345083323961856 |
| requisitionType | string | 否 | 是 | 申请类型1：出库申请；2：领料申请；3：借出申请；8：出库退回申请；9：退料申请 示例：1 |
| transTypeId | string | 否 | 是 | 交易类型id或交易类型code 示例：2343689668104726 |
| bizFlow | string | 否 | 否 | 业务流程ID（Insert时不传，Update时传值原流程ID不同会根据交易类型更新流程ID） 示例：fd4394c9-e51f-11eb-a68a-0624d60000dc |
| vouchdate | string | 否 | 是 | 单据日期 示例："2021-09-09" |
| code | string | 否 | 否 | 单据编号（自动编码可不传，手动编码必传） 示例：CKSQ202109130002 |
| productionDepartmentId | string | 否 | 否 | 申请部门id或申请部门code |
| operatorId | string | 否 | 否 | 申请人id或申请人code 示例：2343687910576384 |
| remark | string | 否 | 否 | 备注 示例：库存部门提交申请 |
| pickingRequisitionUserdefItem | object | 否 | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| requisitionDetail | object | 是 | 是 | 出库申请子表[st.pickingrequisition.PickingRequisitionDetail] |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Insert |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 借用对象类型 0:客户 1:部门 2:人员 3:供应商 (借出申请时必填) 示例：0 |
| lendCustom | string | 否 | 否 | 借用客户id或code 示例：2370369475350784 |
| lendDept | string | 否 | 否 | 借用部门id或code 示例：2374771464655104 |
| lendUser | string | 否 | 否 | 借用人员id或code 示例：2364653363433728 |
| lendSupplier | string | 否 | 否 | 借用供应商id或code 示例：1758687566287077376 |

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2430202243059968,
		"orgId": "2345083323961856",
		"requisitionType": "1",
		"transTypeId": "2343689668104726",
		"bizFlow": "fd4394c9-e51f-11eb-a68a-0624d60000dc",
		"vouchdate": "\"2021-09-09\"",
		"code": "CKSQ202109130002",
		"productionDepartmentId": "",
		"operatorId": "2343687910576384",
		"remark": "库存部门提交申请",
		"pickingRequisitionUserdefItem": {
			"id": 2430202243059968,
			"define1": "自定义项1",
			"define2": "自定义项2"
		},
		"defines": {
			"id": 2430202243059968,
			"define1": "自由自定义项1",
			"define2": "自由自定义项2"
		},
		"requisitionDetail": [
			{
				"id": 2430202243059969,
				"productId": "000001",
				"stockUnitId": "2344814433767680",
				"skuId": "000001",
				"batchNo": "pc001",
				"producedate": "2022-05-06",
				"invaliddate": "2022-07-06",
				"changeRate": 1,
				"changeType": 0,
				"quantity": 10,
				"auxiliaryQuantity": 10,
				"warehouseId": "ck01",
				"requirementDate": "2021-09-09",
				"projectId": "",
				"remark": "申请表体",
				"pickingRequisitionDetailUserdefItem": {
					"id": 2430202243059969,
					"define1": "自定义项1",
					"define2": "自定义项2"
				},
				"defines": {
					"id": 2430202243059969,
					"define1": "自由自定义项1",
					"define2": "自由自定义项2"
				},
				"_status": "Insert",
				"expenseItems": "fy001",
				"budgetUnitPrice": 10,
				"budgetMoney": 10,
				"pickingRequisitionDetailExtend": {
					"returnStockReasonId": 1834229126116933638,
					"id": 2430202243059969
				},
				"returnDate": "2025-01-15"
			}
		],
		"_status": "Insert",
		"lendType": 0,
		"lendCustom": "2370369475350784",
		"lendDept": "2374771464655104",
		"lendUser": "2364653363433728",
		"lendSupplier": "1758687566287077376"
	}
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
| data | object | 否 | 返回单据 |
| orgId | string | 否 | 申请组织id |
| orgName | string | 否 | 申请组织名称 |
| transTypeId | string | 否 | 交易类型id |
| transTypeName | string | 否 | 交易类型名称 |
| transTypeCode | string | 否 | 交易类型编码 |
| bizFlow | string | 否 | 业务流流程ID |
| isFlowCoreBill | boolean | 否 | 是否核心单据 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow_version | string | 否 | 流程版本 |
| vouchdate | string | 否 | 申请日期 |
| code | string | 否 | 申请单编号 |
| status | long | 否 | 单据状态0：开立；1：已审核；2：已关闭；3：审核中 |
| requisitionType | string | 否 | 申请类型1：出库申请；2：领料申请；3：借出申请；8：出库退回申请；9：退料申请 |
| isWfControlled | boolean | 否 | 是否审批流控制false：否；true：是 |
| verifystate | long | 否 | 审核状态0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单 |
| returncount | long | 否 | 退回次数 |
| barCode | string | 否 | 单据条码 |
| creatorId | long | 否 | 创建人Id |
| creator | string | 否 | 创建人姓名 |
| createTime | string | 否 | 创建时间 |
| requisitionDetail | object | 是 | 出库申请子表 |
| id | long | 否 | 出库申请主表ID |
| pubts | string | 否 | 操作时间 |
| createDate | string | 否 | 创建时间 |
| tenant | long | 否 | 租户ID |
| yTenantId | string | 否 | 租户编码 |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 借用对象类型 0:客户 1:部门 2:人员 3:供应商 |
| lendCustom | number |
| 小数位数:0,最大长度:20 | 否 | 借用客户id |
| lendDept | string | 否 | 借用部门id |
| lendUser | string | 否 | 借用人员id |
| lendSupplier | number |
| 小数位数:0,最大长度:20 | 否 | 借用供应商id |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "",
		"orgName": "",
		"transTypeId": "",
		"transTypeName": "",
		"transTypeCode": "",
		"bizFlow": "",
		"isFlowCoreBill": true,
		"bizFlow_name": "",
		"bizFlow_version": "",
		"vouchdate": "",
		"code": "",
		"status": 0,
		"requisitionType": "",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"barCode": "",
		"creatorId": 0,
		"creator": "",
		"createTime": "",
		"requisitionDetail": [
			{
				"orgId": "",
				"orgName": "",
				"materialCode": "",
				"materialId": 0,
				"productId": 0,
				"materialName": "",
				"mainUnit": 0,
				"mainUnitName": "",
				"mainUnitPrecision": 0,
				"stockUnitId": 0,
				"stockUnitName": "",
				"stockUnitPrecision": 0,
				"changeRate": 0,
				"changeType": 0,
				"skuId": 0,
				"skuCode": "",
				"skuName": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"isBatchManage": true,
				"quantity": 0,
				"auxiliaryQuantity": 0,
				"warehouseName": "",
				"warehouseId": 0,
				"id": 0,
				"requisitionId": 0,
				"reserveid": 0,
				"pubts": "",
				"yTenantId": "",
				"expenseItems": 0,
				"expenseItems_name": "",
				"expenseItems_code": "",
				"budgetUnitPrice": 0,
				"budgetMoney": 0,
				"pickingRequisitionDetailExtend": {
					"id": 0,
					"returnStockReasonId": 0,
					"returnDate": "2026-06-07 12:15:39"
				}
			}
		],
		"id": 0,
		"pubts": "",
		"createDate": "",
		"tenant": 0,
		"yTenantId": "",
		"lendType": 0,
		"lendCustom": 0,
		"lendDept": "",
		"lendUser": "",
		"lendSupplier": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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

