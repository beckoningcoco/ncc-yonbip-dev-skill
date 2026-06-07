---
title: "实盘单保存"
apiId: "af52ee4fd59944419f0145ed6fb5dbbe"
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

# 实盘单保存

> `ContentType	application/json` 请求方式	POST | 分类: Physical Inventory Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckreality/save

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
| data | object | 否 | 是 | 实盘单主表[st.storecheckreality.StoreCheckReality] |
| id | string | 否 | 否 | 主表id，更新操作时必填 |
| stockOrg | string | 否 | 是 | 库存组织id |
| stockOrg_name | string | 否 | 否 | 库存组织名称 |
| code | string | 否 | 是 | 单据编号 |
| accountOrg | string | 否 | 否 | 会计主体id |
| accountOrg_name | string | 否 | 否 | 会计主体名称 |
| vouchdate | string | 否 | 是 | 实盘时间，格式为:yyyy-MM-dd HH:mm:ss |
| status | string | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| businesstype | string | 否 | 是 | 交易类型id |
| businesstype_name | string | 否 | 否 | 交易类型名称 |
| storecheckplan | string | 否 | 否 | 对应盘点计划id,是否快盘为true则storecheckplan为空，否则必输。 |
| shop | string | 否 | 否 | 商家 |
| store | string | 否 | 否 | 门店id |
| store_name | string | 否 | 否 | 门店名称 |
| warehouse | string | 否 | 是 | 仓库id |
| warehouse_name | string | 否 | 否 | 仓库名称 |
| storeCheckRange | string | 否 | 是 | 实盘范围, 0:整仓盘点、1:指定品类、2:指定物料、 |
| department | string | 否 | 否 | 部门id |
| department_name | string | 否 | 否 | 部门名称 |
| stockMgr | string | 否 | 否 | 库管员id |
| stockMgr_name | string | 否 | 否 | 库管员名称 |
| operator | string | 否 | 否 | 业务员id |
| operator_name | string | 否 | 否 | 业务员名称 |
| creator | string | 否 | 是 | 创建人 |
| warehouse_iSerialManage | string | 否 | 否 | 仓库是否序列号严格管理，true:是，false:否 |
| isMaterial | string | 否 | 否 | 是否材料盘点，true:是，false:否 |
| isFastStoreCheck | string | 否 | 是 | 是否快盘，true: 是，false:否 |
| storecheckplan_vouchStatus | string | 否 | 否 | 计划状态，实盘单的上游单据盘点计划的单据状态，接口无需传值。 |
| isGoodsPosition | string | 否 | 否 | 是否货位盘点，true:是，false:否 |
| goodsPositionRange | string | 否 | 否 | 货位范围, 0:全部货位、1:指定货位、 |
| total_number | string | 否 | 否 | 整单件数 |
| total_quantity | int | 否 | 否 | 整单数量 |
| memo | string | 否 | 否 | 备注 |
| createTime | string | 否 | 否 | 创建时间，格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间，格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 否 | 审批人 |
| auditTime | string | 否 | 否 | 审批时间，格式为:yyyy-MM-dd HH:mm:ss |
| pubts | string | 否 | 否 | 时间戳 |
| totalQuantity | int | 否 | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| storecheckplanpubts | string | 否 | 否 | 盘点计划时间戳 |
| warehouse_isInvertedScour | string | 否 | 否 | 是否倒冲仓库，true:是，false:否 |
| storeCheckRealityCustomItem | object | 否 | 否 | 表头自定义项 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| details | object | 是 | 是 | 实盘单子表[st.storecheckreality.StoreCheckRealityDetail] |
| realityProductClass | object | 是 | 否 | 实盘商品分类子表[st.storecheckreality.RealityProductClass] |
| realityGoodsPosition | object | 是 | 否 | 实盘货位子表[st.storecheckreality.RealityGoodsPosition] |

## 3. 请求示例

Url: /yonbip/scm/storecheckreality/save?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"stockOrg": "",
		"stockOrg_name": "",
		"code": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"vouchdate": "",
		"status": "",
		"businesstype": "",
		"businesstype_name": "",
		"storecheckplan": "",
		"shop": "",
		"store": "",
		"store_name": "",
		"warehouse": "",
		"warehouse_name": "",
		"storeCheckRange": "",
		"department": "",
		"department_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"operator": "",
		"operator_name": "",
		"creator": "",
		"warehouse_iSerialManage": "",
		"isMaterial": "",
		"isFastStoreCheck": "",
		"storecheckplan_vouchStatus": "",
		"isGoodsPosition": "",
		"goodsPositionRange": "",
		"total_number": "",
		"total_quantity": 0,
		"memo": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"pubts": "",
		"totalQuantity": 0,
		"ecsuiteperson": "",
		"storecheckplanpubts": "",
		"warehouse_isInvertedScour": "",
		"storeCheckRealityCustomItem": {
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
		"_status": "",
		"details": [
			{
				"taxRate": "",
				"virtualProductAttribute": "",
				"hasDefaultInit": "",
				"product_productOfflineRetail_mnemonicCode": "",
				"warehouseMaterialCheckRule": "",
				"daccountnum": "",
				"qty": "",
				"_keyName": "",
				"subQty": "",
				"productClass_name": "",
				"_entityName": "",
				"_realtype": "",
				"mainid": "",
				"id": "",
				"rowno": 0,
				"isSerialNoManage": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"product_cModelDescription": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
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
				"propertiesValue": "",
				"barcode": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"dexpirydate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
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
				"accountQty": 0,
				"accountWeight": 0,
				"unit": "",
				"unitName": "",
				"invExchRate": 0,
				"accountNUM": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"accountPrice": 0,
				"quantity": 0,
				"weight": 0,
				"number": 0,
				"price": 0,
				"goodsposition": "",
				"goodsposition_name": "",
				"pubts": "",
				"memo": "",
				"product_modelDescription": "",
				"unitExchangeType": 0,
				"storeCheckRealityDetailSNs": [
					{
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
						"define30": "",
						"_status": ""
					}
				],
				"storeCheckRealityDetailCustomItem": {
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
				"stockUnitId_Precision": "",
				"unit_Precision": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"_status": "",
				"isStockcheck": true
			}
		],
		"realityProductClass": [
			{
				"productClass": "",
				"id": "",
				"productClass_name": "",
				"mainidinclass": "",
				"_status": ""
			}
		],
		"realityGoodsPosition": [
			{
				"id": "",
				"mainidinposition": "",
				"goodsPosition": "",
				"goodsPosition_name": "",
				"_status": ""
			}
		]
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
| data | object | 否 | 调用时的返回数据 |
| count | int | 否 | 调用时返回的总数量 示例：1 |
| sucessCount | int | 否 | 调用成功时的数量 示例：1 |
| failCount | int | 否 | 调用失败时的数量 示例：0 |
| messages | object | 是 | 调用失败时的错误原因 |
| infos | object | 否 | 调用成功时的返回数据 |
| failInfos | object | 是 | 调用失败时的返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": {
			"modifyDate": "",
			"createDate": "",
			"modifierId": "",
			"creatorId": 0,
			"tenant": 0,
			"stockOrg": "",
			"stockOrg_name": "",
			"accountOrg": "",
			"accountOrg_name": "",
			"code": "",
			"vouchdate": "",
			"status": 0,
			"businesstype": "",
			"businesstype_name": "",
			"shop": 0,
			"store": 0,
			"store_name": "",
			"warehouse": 0,
			"warehouse_name": "",
			"storecheckplan": 0,
			"storecheckplan_code": "",
			"storeCheckRange": 0,
			"department": "",
			"department_name": "",
			"stockMgr": "",
			"stockMgr_name": "",
			"operator": "",
			"operator_name": "",
			"creator": "",
			"warehouse_iSerialManage": true,
			"isMaterial": true,
			"isFastStoreCheck": true,
			"storecheckplan_vouchStatus": "",
			"isGoodsPosition": true,
			"goodsPositionRange": 0,
			"total_number": 0,
			"total_quantity": 0,
			"memo": "",
			"createTime": "",
			"modifier": "",
			"modifyTime": "",
			"id": 0,
			"pubts": "",
			"totalQuantity": 0,
			"ecsuiteperson": "",
			"warehouse_isInvertedScour": "",
			"details": [
				{
					"productClass_name": "",
					"product_productOfflineRetail_mnemonicCode": "",
					"hasDefaultInit": "",
					"taxRate": "",
					"daccountnum": "",
					"warehouseMaterialCheckRule": "",
					"mainid": 0,
					"rowno": 0,
					"isSerialNoManage": true,
					"product": 0,
					"product_cCode": "",
					"product_cName": "",
					"product_model": "",
					"product_cModelDescription": "",
					"productsku": 0,
					"productsku_cCode": "",
					"productsku_cName": "",
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
					"propertiesValue": "",
					"barcode": "",
					"isBatchManage": true,
					"isExpiryDateManage": true,
					"batchno": "",
					"producedate": "",
					"invaliddate": "",
					"dexpirydate": "",
					"expireDateNo": 0,
					"expireDateUnit": 0,
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
					"accountQty": 0,
					"accountWeight": 0,
					"unit": 0,
					"unitName": "",
					"invExchRate": 0,
					"accountNUM": 0,
					"stockUnitId": 0,
					"stockUnit_name": "",
					"accountPrice": 0,
					"quantity": 0,
					"weight": 0,
					"number": 0,
					"price": 0,
					"goodsposition": 0,
					"goodsposition_name": "",
					"pubts": "",
					"id": 0,
					"memo": "",
					"product_modelDescription": "",
					"unitExchangeType": 0,
					"storeCheckRealityDetailSNs": [
						{
							"id": 0,
							"pubts": "",
							"grandpaid": 0,
							"detailid": 0,
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
					],
					"stockUnitId_Precision": 0,
					"unit_Precision": 0,
					"project": "",
					"project_code": "",
					"project_name": "",
					"isStockcheck": true
				}
			],
			"realityProductClass": [
				{
					"productClass": 0,
					"productClass_name": "",
					"id": 0,
					"mainidinclass": 0
				}
			],
			"realityGoodsPosition": [
				{
					"id": 0,
					"mainidinposition": 0,
					"goodsPosition": 0,
					"goodsPosition_name": ""
				}
			]
		},
		"failInfos": [
			{}
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

