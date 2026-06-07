---
title: "盘点计划详情查询"
apiId: "b6b5d692eb4045989f631e859f871bf0"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Review Plan"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Review Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点计划详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Review Plan (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckplan/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/scm/storecheckplan/detail?access_token=访问令牌&id=

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
| stockOrg | string | 否 | 库存组织id |
| stockOrg_name | string | 否 | 库存组织名称 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| checkStartTime | string | 否 | 盘点开始时间,格式为:yyyy-MM-dd HH:mm:ss |
| status | string | 否 | 单据状态, 0:未复核、1:已复核、2:已作废、 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | string | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| warehouse_isInvertedScour | string | 否 | 是否倒冲仓库 |
| stockCType | string | 否 | 盘点类型 |
| isFastStoreCheck | string | 否 | 是否快盘 |
| businesstype_stockCType | string | 否 | 盘点类型 |
| isGoodsPosition | string | 否 | 货位盘点 |
| goodsPositionRange | string | 否 | 货位范围, 0:全部货位、1:指定货位、 |
| businesstype | string | 否 | 交易类型id |
| businesstype_name | string | 否 | 交易类型名称 |
| shop | string | 否 | 商家 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| stockMgr | string | 否 | 库管员id |
| stockMgr_name | string | 否 | 库管员名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| storeCheckRange | string | 否 | 盘点范围, 0:整仓盘点、1:指定品类、2:指定物料、 |
| memo | string | 否 | 备注 |
| id | string | 否 | 主表id |
| pubts | string | 否 | 时间戳 |
| total_quantity | int | 否 | 整单数量 |
| total_number | string | 否 | 整单件数 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| returncount | string | 否 | 退回次数 |
| storeCheckPlanCustomItem | object | 否 | 表头自定义项 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 复核人 |
| auditTime | string | 否 | 复核时间,格式为:yyyy-MM-dd HH:mm:ss |
| details | object | 是 | 盘点计划子表 |
| resultdetails | object | 是 | 盘点结果子表[st.storecheckplan.StoreCheckResultDetail] |
| productClass | object | 是 | 盘点计划商品分类子表[st.storecheckplan.ProductClass] |
| goodsPosition | object | 是 | 盘点货位子表[st.storecheckplan.GoodsPosition] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"stockOrg": "",
		"stockOrg_name": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"code": "",
		"vouchdate": "",
		"checkStartTime": "",
		"status": "",
		"store": "",
		"store_name": "",
		"warehouse": "",
		"warehouse_name": "",
		"warehouse_iSerialManage": "",
		"warehouse_isInvertedScour": "",
		"stockCType": "",
		"isFastStoreCheck": "",
		"businesstype_stockCType": "",
		"isGoodsPosition": "",
		"goodsPositionRange": "",
		"businesstype": "",
		"businesstype_name": "",
		"shop": "",
		"department": "",
		"department_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"operator": "",
		"operator_name": "",
		"storeCheckRange": "",
		"memo": "",
		"id": "",
		"pubts": "",
		"total_quantity": 0,
		"total_number": "",
		"ecsuiteperson": "",
		"isWfControlled": "",
		"verifystate": "",
		"returncount": "",
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
			"define35": ""
		},
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"details": [
			{
				"product": "",
				"mainid": "",
				"isSerialNoManage": "",
				"product_cCode": "",
				"product_cName": "",
				"product_productOfflineRetail_mnemonicCode": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"product_model": "",
				"product_modelDescription": "",
				"propertiesValue": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"batchno": "",
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
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"accountQty": 0,
				"unitName": "",
				"unit_Precision": "",
				"invExchRate": 0,
				"accountNUM": 0,
				"number": 0,
				"stockUnit_name": "",
				"unitExchangeType": 0,
				"stockUnitId_Precision": "",
				"productClass_name": "",
				"goodsposition_cCode": "",
				"goodsposition_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"rowno": 0,
				"unit": "",
				"accountWeight": 0,
				"accountPrice": "",
				"pubts": "",
				"id": "",
				"goodsposition": "",
				"dexpirydate": "",
				"stockUnitId": "",
				"memo": "",
				"storeCheckPlanDetailCustomItem": {
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
				"quantity": 0,
				"storeCheckPlanDetailSNs": {
					"id": "",
					"pubts": "",
					"grandpaid": "",
					"detailid": "",
					"sn": "",
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
					"define30": ""
				}
			}
		],
		"resultdetails": [
			{
				"product_model": "",
				"product_modelDescription": "",
				"mainid": "",
				"product": "",
				"productsku": "",
				"unit": "",
				"rowno": 0,
				"checkstatus": "",
				"isSerialNoManage": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"batchno": "",
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
				"expireDateNo": "",
				"dexpirydate": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"accountQty": 0,
				"quantity": 0,
				"accountWeight": 0,
				"profitlossqty": 0,
				"unitName": "",
				"unit_Precision": "",
				"accountPrice": 0,
				"weight": 0,
				"price": 0,
				"invExchRate": "",
				"unitExchangeType": "",
				"accountNUM": 0,
				"number": 0,
				"profitlossnumber": 0,
				"stockUnit_name": "",
				"stockUnitId_Precision": "",
				"occurredqty": 0,
				"occurrednum": 0,
				"profitqty": 0,
				"lossqty": 0,
				"profitnumber": 0,
				"lossnumber": 0,
				"productClass_name": "",
				"goodsposition": "",
				"goodsposition_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"resultdetails_pubts": "",
				"resultdetails_id": "",
				"memo": "",
				"stockUnitId": "",
				"markPrice": "",
				"accountAmount": "",
				"amount": "",
				"profitLossAmount": "",
				"storeCheckResultDetailSNs": {
					"id": "",
					"pubts": "",
					"grandpaid": "",
					"detailid": "",
					"ProfitLossType": "",
					"sn": "",
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
					"define30": ""
				},
				"resultCustomItem": {
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
				}
			}
		],
		"productClass": [
			{
				"productClass": "",
				"id": "",
				"mainidinclass": "",
				"productClass_name": ""
			}
		],
		"goodsPosition": [
			{
				"id": "",
				"mainidinposition": "",
				"goodsPosition": "",
				"goodsposition_cCode": "",
				"goodsPosition_name": ""
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

