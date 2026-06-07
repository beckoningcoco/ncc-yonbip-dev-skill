---
title: "实盘单详情查询"
apiId: "d7e9cd7b1b5a415fb130c9889fc2085e"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Physical Inventory Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Physical Inventory Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 实盘单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Physical Inventory Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckreality/detail

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

Url: /yonbip/scm/storecheckreality/detail?access_token=访问令牌&id=

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
| vouchdate | string | 否 | 实盘时间,格式为:yyyy-MM-dd HH:mm:ss |
| status | string | 否 | 单据状态, 0:未确认、1:已确认、2:已审核、 |
| businesstype | string | 否 | 交易类型id |
| businesstype_name | string | 否 | 交易类型名称 |
| shop | string | 否 | 商家 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | string | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| storecheckplan | string | 否 | 实盘计划ID |
| storecheckplan_code | string | 否 | 实盘计划单号 |
| storeCheckRange | string | 否 | 实盘范围, 0:整仓盘点、1:指定品类、2:指定物料、 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| creator | string | 否 | 创建人 |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| isMaterial | string | 否 | 是否材料盘点 |
| isFastStoreCheck | string | 否 | 是否快盘 |
| storecheckplan_vouchStatus | string | 否 | 计划状态 |
| isGoodsPosition | string | 否 | 货位盘点 |
| goodsPositionRange | string | 否 | 货位范围, 0:全部货位、1:指定货位、 |
| total_number | string | 否 | 整单件数 |
| total_quantity | int | 否 | 整单数量 |
| memo | string | 否 | 备注 |
| createTime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间,格式为:yyyy-MM-dd HH:mm:ss |
| id | string | 否 | 主表id |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| totalQuantity | int | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| storecheckplanpubts | string | 否 | 盘点计划时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| warehouse_isInvertedScour | string | 否 | 是否倒冲仓库 |
| details | object | 是 | 实盘单子表[st.storecheckreality.StoreCheckRealityDetail] |
| realityProductClass | object | 是 | 实盘商品分类子表[st.storecheckreality.RealityProductClass] |
| realityGoodsPosition | object | 是 | 实盘货位子表[st.storecheckreality.RealityGoodsPosition] |

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
		"status": "",
		"businesstype": "",
		"businesstype_name": "",
		"shop": "",
		"store": "",
		"store_name": "",
		"warehouse": "",
		"warehouse_name": "",
		"storecheckplan": "",
		"storecheckplan_code": "",
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
		"id": "",
		"pubts": "",
		"totalQuantity": 0,
		"ecsuiteperson": "",
		"storecheckplanpubts": "",
		"warehouse_isInvertedScour": "",
		"details": [
			{
				"mainid": "",
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
				"id": "",
				"memo": "",
				"unitExchangeType": 0,
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
						"define30": ""
					}
				],
				"stockUnitId_Precision": "",
				"unit_Precision": "",
				"project": "",
				"project_code": "",
				"project_name": ""
			}
		],
		"realityProductClass": [
			{
				"productClass": "",
				"productClass_name": "",
				"id": "",
				"mainidinclass": ""
			}
		],
		"realityGoodsPosition": [
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

