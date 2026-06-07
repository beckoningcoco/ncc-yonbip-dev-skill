---
title: "出库申请批量保存"
apiId: "00e5b9b494e845e3be86e6741b610495"
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

# 出库申请批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/pickingrequisition/save

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
| data | object | 是 | 是 | 出库申请[st.pickingrequisition.PickingRequisition] |
| id | long | 否 | 否 | 主表id 如果状态是update，id要必传 示例：2430202243059968 |
| orgId | string | 否 | 是 | 申请组织id或申请组织code 示例：2345083323961856 |
| requisitionType | string | 否 | 是 | 申请类型1：出库申请；2：领料申请；3：借出申请 示例：1 |
| transTypeId | string | 否 | 是 | 交易类型id或交易类型code 示例：2343689668104726 |
| bizFlow | string | 否 | 否 | 业务流程ID（Insert时不传，Update时传值原流程ID不同会根据交易类型更新流程ID） 示例：fd4394c9-e51f-11eb-a68a-0624d60000dc |
| vouchdate | string | 否 | 是 | 单据日期 示例："2021-09-10" |
| code | string | 否 | 否 | 单据编号（自动编码可不传，手动编码必传） 示例：CKSQ202109130002 |
| productionDepartmentId | string | 否 | 否 | 申请部门id或申请部门code |
| operatorId | string | 否 | 否 | 申请人id或申请人code 示例：2343687910576384 |
| remark | string | 否 | 否 | 备注 示例：库存部门提交申请 |
| pickingRequisitionUserdefItem | object | 否 | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| requisitionDetail | object | 是 | 是 | 出库申请子表[st.pickingrequisition.PickingRequisitionDetail] |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Insert |
| lendType | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 借用对象类型 0:客户 1:部门 2:人员 3:供应商 (借出申请时必填) 示例：0 |
| lendCustom | string | 否 | 否 | 借用客户id或code 示例：2370369475350784 |
| lendDept | string | 否 | 否 | 借用部门id或code 示例：2374771464655104 |
| lendUser | string | 否 | 否 | 借用人员id或code 示例：2364653363433728 |
| lendSupplier | string | 否 | 否 | 借用供应商id或code 示例：1758687566287077376 |

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2430202243059968,
			"orgId": "2345083323961856",
			"requisitionType": "1",
			"transTypeId": "2343689668104726",
			"bizFlow": "fd4394c9-e51f-11eb-a68a-0624d60000dc",
			"vouchdate": "\"2021-09-10\"",
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
					"warehouseId": "ck001",
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
| data | object | 否 | 返回详细信息 |
| count | long | 否 | 操作单据条数 示例：1 |
| sucessCount | long | 否 | 操作成功条数 示例：1 |
| failCount | long | 否 | 操作失败条数 示例：0 |
| messages | string | 是 | 操作失败信息 |
| infos | object | 是 | 单据数据 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"vouchdate": "2021-09-10 00:00:00",
				"masterOrgKeyField": "orgId",
				"requisitionDetail": [
					{
						"rowno": 1,
						"mainUnit": 2344814373523712,
						"auxiliaryQuantity": 1,
						"quantity": 1,
						"productId": 2346458226446592,
						"changeType": 1,
						"skuId": 2346458234851584,
						"stockUnitId": 2344814382682368,
						"mainUnitName": "千克",
						"batchno": "",
						"producedate": "",
						"returnDate": "2025-01-15 00:00:00",
						"invaliddate": "",
						"isBatchManage": false,
						"stockUnitPrecision": "4",
						"stockUnitName": "吨",
						"mainUnitPrecision": "3",
						"id": 2431428037644801,
						"requisitionId": 2431428037644800,
						"reserveid": 0,
						"orgId": "2345083323961856",
						"pubts": "2021-09-14 14:56:30",
						"yTenantId": "0000KR35O47SBNNR4I0000"
					}
				],
				"transTypeId": "2343689668104726",
				"requisitionType": "1",
				"orgId": "2345083323961856",
				"fromApi_ustock": true,
				"transTypeName": "出库申请",
				"orgName": "王章宇全职能",
				"bizFlow": "fd4394c9-e51f-11eb-a68a-0624d60000dc",
				"isFlowCoreBill": true,
				"bizFlow_name": "出库申请",
				"bizFlow_version": "V1.0",
				"id": 2431428037644800,
				"code": "CKSQ202109100004",
				"pubts": "2021-09-14 14:56:30",
				"status": 0,
				"creator": "YonSuite默认用户",
				"creatorId": 2343687910576384,
				"createTime": "2021-09-14 14:56:30",
				"createDate": "2021-09-14 14:56:30",
				"barCode": "po_picking_requisition|2431428037644800",
				"isWfControlled": false,
				"tenant": 2343687878611200,
				"yTenantId": "0000KR35O47SBNNR4I0000",
				"lendType": 0,
				"lendCustom": 2370369475350784,
				"lendDept": "2374771464655104",
				"lendUser": "2364653363433728",
				"lendSupplier": 1758687566287077376
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据返回提示信息做相应处理


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

