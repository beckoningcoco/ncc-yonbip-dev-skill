---
title: "发运单详情查询"
apiId: "2d50520e4ea1480fb14401c95ef9bf4b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipping Document Card"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipping Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 发运单详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Shipping Document Card (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/despatch/queryDespatch

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| despatchId | string | 否 | 否 | 发运单id，发运单id和发运单编码不能同时为空，id和编码同时存在，以id为准 |
| despatchCode | string | 否 | 否 | 发运单编码，发运单id和报价单编码不能同时为空，id和编码同时存在，以id为准 |

## 3. 请求示例

Url: /yonbip/scm/despatch/queryDespatch?access_token=访问令牌
Body: [{
	"despatchId": "",
	"despatchCode": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数组 |
| _realtype | string | 否 | 是否是实体 true是 false否 示例：true |
| _entityName | string | 否 | 实体名称 示例：usp.despatchorder.Despatch |
| _keyName | string | 否 | 主键名称 示例：id |
| startArea | long | 否 | 起始地运输区域 示例：1 |
| startArea_name | string | 否 | 起始地运输区域名称 示例：1 |
| planArrivalDate | string | 否 | 计划到货日期 示例：2022-04-18 16:35:58 |
| modifier | string | 否 | 修改人 示例：1 |
| receiverEnterprise | long | 否 | 收货方单位(本企业) 示例：1 |
| modifierId | long | 否 | 修改人id 示例：1 |
| shipperOrgId | string | 否 | 发货方库存组织 示例：1 |
| shipperOrgId_name | string | 否 | 发货方库存组织名称 示例：1 |
| tpDemandEndDate | string | 否 | 运输计划需求完成日期 示例：2022-04-13 00:00:00 |
| dependentStatusType | string | 否 | 依赖状态类型 示例：1 |
| sourceCode | string | 否 | 来源单号 示例：1 |
| modifyTime | string | 否 | 修改时间 示例：2022-04-13 19:26:56 |
| logisticsOrgId | string | 否 | 物流组织 示例：1 |
| shipperSupplier | long | 否 | 发货方单位(带入供应商) 示例：1 |
| shipperSupplier_name | string | 否 | 发货方单位(带入供应商)名称 示例：1 |
| receiverCust | long | 否 | 收货方单位(客户) 示例：1 |
| receiverCust_name | string | 否 | 收货方单位(客户)名称 示例：1 |
| closerId | long | 否 | 关闭人id 示例：1 |
| dependentStatusValue | string | 否 | 依赖状态值 示例：1 |
| id | long | 否 | 主表id 示例：1 |
| transQueryNo | string | 否 | 查询号 示例：1 |
| tplid | long | 否 | 模板id 示例：1 |
| pASPDate | string | 否 | 要求设备到达发货点日期 示例：2022-04-13 00:00:00 |
| transStatus | long | 否 | 运输作业完成状态0未完成 1部分完成 2全部完成 示例：1 |
| tenant | long | 否 | 租户 示例：2044698841370880 |
| planTransRoute | long | 否 | 计划运输路线 示例：1 |
| planTransRoute_name | string | 否 | 计划运输路线名称 示例：1 |
| endArea | long | 否 | 目的地运输区域 示例：1 |
| endArea_name | string | 否 | 目的地运输区域名称 示例：1 |
| planShipDate | string | 否 | 计划发货日期 示例：2022-04-18 00:00:00 |
| receivingPoint | long | 否 | 收货点 示例：1 |
| receivingPoint_name | string | 否 | 收货点名称 示例：1 |
| modifyDate | string | 否 | 修改时间 示例：2022-04-13 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制 true是false否 示例：true |
| planTransSDate | string | 否 | 要求起运日期 示例：2022-04-13 00:00:00 |
| billDate | string | 否 | 单据日期 示例：2022-04-13 00:00:00 |
| planTransEDate | string | 否 | 要求送达日期 示例：2022-04-13 00:00:00 |
| isWMS | long | 否 | 是否下发WMS 0否 1是 示例：1 |
| isWO | long | 否 | 仓储作业相关性 0否1是 示例：1 |
| auditorId | long | 否 | 审批人id 示例：1 |
| wopStrateDate | string | 否 | 要求仓储开始日期 示例：2022-04-13 00:00:00 |
| sourceType | string | 否 | 来源单据 示例：1 |
| dependentTaskType | string | 否 | 过账依赖 示例：1 |
| auditTime | string | 否 | 审批日期 示例：2022-04-13 19:26:45 |
| despatchMode | long | 否 | 发运方式 示例：1 |
| despatchMode_name | string | 否 | 发运方式名称 示例：1 |
| tarnsOperationRelevant | long | 否 | 运输作业相关性 0否 1是 示例：1 |
| status | long | 否 | 审批状态 0开立3审批中 1审批 示例：1 |
| DespatchType | string | 否 | 发运类型（单据类型） 示例：1 |
| returncount | long | 否 | 返回数量 示例：1 |
| transEDate | string | 否 | 运输作业完成日期 示例：2022-04-13 00:00:00 |
| verifystate | long | 否 | 审批状态 0 弃审 2审核 示例：1 |
| code | string | 否 | 单据编码 示例：1 |
| wopEndDate | string | 否 | 要求仓储完成日期 示例：2022-04-13 00:00:00 |
| receivingAddress | string | 否 | 收货地址 示例：1 |
| creatorId | long | 否 | 创建人id 示例：1 |
| bizFlow | string | 否 | 业务流 示例：1 |
| remark | string | 否 | 备注 示例：1 |
| accountStatus | long | 否 | 过账状态 0不过账 1可过账 2过账完成 示例：1 |
| despatchDetails | object | 是 | 子表 |
| _convert_despatchDetails | string | 否 | 转化描述 示例：ok |
| vouchdate | string | 否 | 单据日期 示例：2022-04-13 00:00:00 |
| receiverOrgId | string | 否 | 收货方库存组织 示例：1 |
| receiverOrgId_name | string | 否 | 收货方库存组织名称 示例：1 |
| despatchDirection | long | 否 | 发运方向 示例：1 |
| transPlanRelevant | long | 否 | 运输计划相关性0否 1是 示例：1 |
| woStatus | long | 否 | 仓储作业完成状态0未完成 1部分完成 2全部完成 示例：1 |
| printCount | long | 否 | 打印次数 示例：1 |
| closeTime | string | 否 | 关闭日期 示例：2022-04-13 19:27:05 |
| aASPDate | string | 否 | 实际设备到达发货点日期 示例：2022-04-13 00:00:00 |
| pubts | string | 否 | 时间戳 示例：2022-04-18 16:36:01 |
| isFlowCoreBill | boolean | 否 | 是否核心单据 true是 false否 示例：true |
| auditDate | string | 否 | 提交日期 示例：2022-04-13 00:00:00 |
| createDate | string | 否 | 创建日期 示例：2022-04-13 00:00:00 |
| receivingMobile | string | 否 | 收货联系人电话 示例：1 |
| creator | string | 否 | 创建人 示例：1 |
| org | string | 否 | 组织 示例：1 |
| woaEndDate | string | 否 | 实际仓储完成日期 示例：2022-04-13 00:00:00 |
| tpEndDate | string | 否 | 运输计划实际完成日期 示例：2022-04-13 00:00:00 |
| auditor | string | 否 | 审批人 示例：1 |
| sourceCodeId | long | 否 | 来源单据号id 示例：1 |
| isTMS | long | 否 | 是否下达TMS系统 0否 1是 示例：1 |
| closer | string | 否 | 关闭人 示例：1 |
| shipPoint | long | 否 | 发货点 示例：1 |
| shipPoint_name | string | 否 | 发货点名称 示例：1 |
| shipAddress | string | 否 | 发货地址 示例：11 |
| closeDate | string | 否 | 关闭日期 示例：2022-04-13 00:00:00 |
| shipContact | string | 否 | 发货联系人 示例：1 |
| shipMobile | string | 否 | 发货联系人电话 示例：11 |
| shipperEnterprise | long | 否 | 发货方单位(带入本企业) 示例：1 |
| shipperEnterprise_name | string | 否 | 发货方单位(带入本企业)名称 示例：1 |
| receivingContact | string | 否 | 收货联系人 示例：1 |
| createTime | string | 否 | 创建时间 示例：2022-04-13 19:26:51 |
| tpStatus | long | 否 | 运输计划完成状态0未完成 1完成 示例：1 |
| _status | string | 否 | 数据状态 示例：Unchanged |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"_realtype": "true",
			"_entityName": "usp.despatchorder.Despatch",
			"_keyName": "id",
			"startArea": 1,
			"startArea_name": "1",
			"planArrivalDate": "2022-04-18 16:35:58",
			"modifier": "1",
			"receiverEnterprise": 1,
			"modifierId": 1,
			"shipperOrgId": "1",
			"shipperOrgId_name": "1",
			"tpDemandEndDate": "2022-04-13 00:00:00",
			"dependentStatusType": "1",
			"sourceCode": "1",
			"modifyTime": "2022-04-13 19:26:56",
			"logisticsOrgId": "1",
			"shipperSupplier": 1,
			"shipperSupplier_name": "1",
			"receiverCust": 1,
			"receiverCust_name": "1",
			"closerId": 1,
			"dependentStatusValue": "1",
			"id": 1,
			"transQueryNo": "1",
			"tplid": 1,
			"pASPDate": "2022-04-13 00:00:00",
			"transStatus": 1,
			"tenant": 2044698841370880,
			"planTransRoute": 1,
			"planTransRoute_name": "1",
			"endArea": 1,
			"endArea_name": "1",
			"planShipDate": "2022-04-18 00:00:00",
			"receivingPoint": 1,
			"receivingPoint_name": "1",
			"modifyDate": "2022-04-13 00:00:00",
			"isWfControlled": true,
			"planTransSDate": "2022-04-13 00:00:00",
			"billDate": "2022-04-13 00:00:00",
			"planTransEDate": "2022-04-13 00:00:00",
			"isWMS": 1,
			"isWO": 1,
			"auditorId": 1,
			"wopStrateDate": "2022-04-13 00:00:00",
			"sourceType": "1",
			"dependentTaskType": "1",
			"auditTime": "2022-04-13 19:26:45",
			"despatchMode": 1,
			"despatchMode_name": "1",
			"tarnsOperationRelevant": 1,
			"status": 1,
			"DespatchType": "1",
			"returncount": 1,
			"transEDate": "2022-04-13 00:00:00",
			"verifystate": 1,
			"code": "1",
			"wopEndDate": "2022-04-13 00:00:00",
			"receivingAddress": "1",
			"creatorId": 1,
			"bizFlow": "1",
			"remark": "1",
			"accountStatus": 1,
			"despatchDetails": [
				{
					"_realtype": "true",
					"_entityName": "usp.despatchorder.DespatchDetails",
					"_keyName": "id",
					"allowAccountNum": 1,
					"memo": "1",
					"firstsource": "1",
					"free1": "1",
					"invaliddate": "2022-04-21 00:00:00",
					"isExpiryDateManage": false,
					"id": 1,
					"tenant": 2044698841370880,
					"mainUnitId": 1,
					"mainUnitId_name": "1",
					"availablePack": 1,
					"expireDateNo": "1",
					"toEndDate": "2022-04-21 00:00:00",
					"warehouse": 1,
					"warehouse_name": "1",
					"reserved": 1,
					"mainId": 1,
					"stockUnitId": 1,
					"despatchWarehouseDetails": [
						{
							"_realtype": "true",
							"_entityName": "usp.despatchorder.DespatchWarehouseDetails",
							"_keyName": "id",
							"planSendNum": 1,
							"allowAccountNum": 1,
							"outSysId": "1",
							"replenishRejNum": 1,
							"outSysLineid": "1",
							"detailId": 1,
							"memo": "1",
							"source": "1",
							"woResNum": 1,
							"invaliddate": "2022-04-21 00:00:00",
							"define1": "1",
							"goodsposition": 1,
							"outSysCode": "1",
							"stockStatus": 1,
							"id": 1,
							"actualNum": 1,
							"tenant": 2044698841370880,
							"rejectionNum": 1,
							"mainUnitId": 1,
							"traceMode": "1",
							"availablePack": 1,
							"warehouse": 1,
							"productsku": 1,
							"reserved": 1,
							"mainId": 1,
							"stockUnitId": 1,
							"batchno": "1",
							"producedate": "2022-04-21 00:00:00",
							"makeRuleCode": "1",
							"remark": "1",
							"availableNum": 1,
							"ytenantid": "1",
							"batchId": 1,
							"stockExchangeRate": 1,
							"woStatus": 1,
							"custId": 1,
							"custName": "1",
							"pubts": "2022-04-21 16:56:30",
							"sourceid": 1,
							"rowno": 1,
							"product": 1,
							"product_name": "1",
							"woResPack": 1,
							"woEndDate": "2022-04-21 00:00:00",
							"actualPack": 1,
							"custCode": "1",
							"postAccountNum": 1,
							"sourceautoid": 1,
							"loadMethod": 1,
							"upcode": "1",
							"sourceRowno": "1",
							"_status": "Unchanged"
						}
					],
					"_convert_despatchWarehouseDetails": "ok",
					"batchno": "1",
					"toStatus": 1,
					"makeRuleCode": "1",
					"expireDateUnit": "1",
					"isBatchManage": false,
					"woStatus": 1,
					"custId": 1,
					"custName": "1",
					"pubts": "2022-04-21 16:16:06",
					"sourceid": 1,
					"rowno": 1,
					"product": 1,
					"product_name": "1",
					"loadMethod": 1,
					"despatchTransDetails": [
						{
							"_realtype": "true",
							"_entityName": "usp.despatchorder.DespatchTransDetails",
							"_keyName": "id",
							"planSendNum": 1,
							"allowAccountNum": 1,
							"outSysId": "1",
							"outSysLineid": "1",
							"detailId": 1,
							"memo": "1",
							"source": "1",
							"define1": "1",
							"invaliddate": "2022-04-21 00:00:00",
							"goodsposition": 1,
							"outSysCode": "1",
							"stockStatus": 1,
							"id": 1,
							"actualNum": 1,
							"tenant": 2044698841370880,
							"mainUnitId": 1,
							"rejectionNum": 1,
							"traceMode": "1",
							"availablePack": 1,
							"toEndDate": "2022-04-21 00:00:00",
							"warehouse": 1,
							"toResNum": 1,
							"productsku": 1,
							"reserved": 1,
							"mainId": 1,
							"stockUnitId": 1,
							"batchno": "1",
							"toStatus": 1,
							"producedate": "2022-04-21 00:00:00",
							"makeRuleCode": "1",
							"remark": "1",
							"availableNum": 1,
							"ytenantid": "1",
							"batchId": 1,
							"stockExchangeRate": 1,
							"custId": 1,
							"custName": "1",
							"pubts": "2022-04-21 16:54:54",
							"sourceid": 1,
							"rowno": 1,
							"product": 1,
							"product_name": "1",
							"toResPack": 1,
							"actualPack": 1,
							"custCode": "1",
							"postAccountNum": 1,
							"sourceautoid": 1,
							"sourceRowno": "1",
							"loadMethod": 1,
							"upcode": "1",
							"_status": "Unchanged"
						}
					],
					"_convert_despatchTransDetails": "ok",
					"planSendNum": 1,
					"planArrivalDate": "2022-04-21 16:13:48",
					"firstupcode": "1",
					"source": "1",
					"define1": "1",
					"woResNum": 1,
					"goodsposition": 1,
					"stockStatus": 1,
					"actualNum": 1,
					"traceMode": "1",
					"toResNum": 1,
					"productsku": 1,
					"productsku_name": "1",
					"producedate": "2022-04-21 00:00:00",
					"firstsourceautoid": 1,
					"remark": "1",
					"availableNum": 1,
					"ytenantid": "1",
					"batchId": 1,
					"stockExchangeRate": 1,
					"planDeliverDate": "2022-04-21 00:00:00",
					"firstsourceid": 1,
					"woEndDate": "2022-04-21 00:00:00",
					"custCode": "1",
					"actualPack": 1,
					"postAccountNum": 1,
					"sourceautoid": 1,
					"upcode": "1",
					"sourceRowno": "1",
					"_status": "Unchanged"
				}
			],
			"_convert_despatchDetails": "ok",
			"vouchdate": "2022-04-13 00:00:00",
			"receiverOrgId": "1",
			"receiverOrgId_name": "1",
			"despatchDirection": 1,
			"transPlanRelevant": 1,
			"woStatus": 1,
			"printCount": 1,
			"closeTime": "2022-04-13 19:27:05",
			"aASPDate": "2022-04-13 00:00:00",
			"pubts": "2022-04-18 16:36:01",
			"isFlowCoreBill": true,
			"auditDate": "2022-04-13 00:00:00",
			"createDate": "2022-04-13 00:00:00",
			"receivingMobile": "1",
			"creator": "1",
			"org": "1",
			"woaEndDate": "2022-04-13 00:00:00",
			"tpEndDate": "2022-04-13 00:00:00",
			"auditor": "1",
			"sourceCodeId": 1,
			"isTMS": 1,
			"closer": "1",
			"shipPoint": 1,
			"shipPoint_name": "1",
			"shipAddress": "11",
			"closeDate": "2022-04-13 00:00:00",
			"shipContact": "1",
			"shipMobile": "11",
			"shipperEnterprise": 1,
			"shipperEnterprise_name": "1",
			"receivingContact": "1",
			"createTime": "2022-04-13 19:26:51",
			"tpStatus": 1,
			"_status": "Unchanged"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务器内部错误


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

