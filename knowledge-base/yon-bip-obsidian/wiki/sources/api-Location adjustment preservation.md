---
title: "货位调整保存"
apiId: "9bcdd0a7f7aa4fe2946cf680e3910e75"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Storage Bin Adjustment Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Storage Bin Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 货位调整保存

> `ContentType	application/json` 请求方式	POST | 分类: Storage Bin Adjustment Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/goodchange/save

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
| data | object | 否 | 是 | 货位调整单[st.goodchange.GoodChange] |
| org | string | 否 | 是 | 库存组织id 示例：1900568695608832 |
| org_name | string | 否 | 否 | 库存组织名称 示例：王章宇全职能 |
| code | string | 否 | 是 | 单据编码 示例：HWTZ20210522000004 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-05-23 00:00:00 |
| store | string | 否 | 否 | 门店id |
| store_name | string | 否 | 否 | 门店名称 |
| warehouse | string | 否 | 是 | 仓库id 示例：1850797131927808 |
| warehouse_name | string | 否 | 否 | 仓库名称 |
| bustype | string | 否 | 是 | 业务类型id 示例：1917696208982272 |
| bustype_name | string | 否 | 否 | 交易类型名称 |
| status | string | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| memo | string | 否 | 否 | 备注 |
| id | string | 否 | 否 | 调整单主表ID |
| pubts | string | 否 | 否 | 时间戳 |
| tplid | string | 否 | 否 | 模板id |
| extend_attrs_json | string | 否 | 否 | 交易类型扩展 |
| creator | string | 否 | 否 | 创建人 |
| createTime | string | 否 | 否 | 创建时间 |
| createDate | string | 否 | 否 | 创建日期 |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间 |
| modifyDate | string | 否 | 否 | 修改日期 |
| auditor | string | 否 | 否 | 提交人 |
| auditTime | string | 否 | 否 | 提交时间 |
| auditDate | string | 否 | 否 | 提交日期 |
| creatorId | string | 否 | 否 | 创建人 |
| modifierId | string | 否 | 否 | 修改人id |
| auditorId | string | 否 | 否 | 审批人id |
| totalQuantity | int | 否 | 否 | 整单数量 |
| warehouse_iSerialManage | string | 否 | 否 | 仓库是否序列号严格管理，传入false表示否，传入true表示是 |
| warehouse_isGoodsPosition | string | 否 | 否 | 仓库是否货位管理，传入false表示否，传入true表示是 |
| warehouse_isGoodsPositionStock | string | 否 | 否 | 仓库货位是否记存量，传入false表示否，传入true表示是 |
| stockMgr | string | 否 | 否 | 库管员ID |
| stockMgr_name | string | 否 | 否 | 库管员名称 |
| totalPieces | int | 否 | 否 | 整单件数 |
| accountOrg | string | 否 | 是 | 会计主体id 示例：1900568695608832 |
| accountOrg_name | string | 否 | 否 | 会计主体名称 |
| department | string | 否 | 否 | 部门id |
| department_name | string | 否 | 否 | 部门名称 |
| operator | string | 否 | 否 | 业务员id |
| operator_name | string | 否 | 否 | 业务员名称 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Insert |
| goodChanges | object | 是 | 是 | 货位调整单子表[st.goodchange.GoodChanges] |

## 3. 请求示例

Url: /yonbip/scm/goodchange/save?access_token=访问令牌
Body: {
	"data": {
		"org": "1900568695608832",
		"org_name": "王章宇全职能",
		"code": "HWTZ20210522000004",
		"vouchdate": "2021-05-23 00:00:00",
		"store": "",
		"store_name": "",
		"warehouse": "1850797131927808",
		"warehouse_name": "",
		"bustype": "1917696208982272",
		"bustype_name": "",
		"status": "",
		"memo": "",
		"id": "",
		"pubts": "",
		"tplid": "",
		"extend_attrs_json": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"creatorId": "",
		"modifierId": "",
		"auditorId": "",
		"totalQuantity": 0,
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPosition": "",
		"warehouse_isGoodsPositionStock": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"totalPieces": 0,
		"accountOrg": "1900568695608832",
		"accountOrg_name": "",
		"department": "",
		"department_name": "",
		"operator": "",
		"operator_name": "",
		"_status": "Insert",
		"goodChanges": [
			{
				"product": "2039290921636096",
				"product_cCode": "",
				"product_cName": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"unit": "",
				"product_unitName": "",
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
				"prodefine1": "",
				"prodefine2": "",
				"prodefine3": "",
				"prodefine4": "",
				"prodefine5": "",
				"prodefine6": "",
				"prodefine7": "",
				"prodefine8": "",
				"prodefine9": "",
				"prodefine10": "",
				"prodefine11": "",
				"prodefine12": "",
				"prodefine13": "",
				"prodefine14": "",
				"prodefine15": "",
				"prodefine16": "",
				"prodefine17": "",
				"prodefine18": "",
				"prodefine19": "",
				"prodefine20": "",
				"prodefine21": "",
				"prodefine22": "",
				"prodefine23": "",
				"prodefine24": "",
				"prodefine25": "",
				"prodefine26": "",
				"prodefine27": "",
				"prodefine28": "",
				"prodefine29": "",
				"prodefine30": "",
				"skudefine1": "",
				"skudefine2": "",
				"skudefine3": "",
				"skudefine4": "",
				"skudefine5": "",
				"skudefine6": "",
				"skudefine7": "",
				"skudefine8": "",
				"skudefine9": "",
				"skudefine10": "",
				"skudefine11": "",
				"skudefine12": "",
				"skudefine13": "",
				"skudefine14": "",
				"skudefine15": "",
				"skudefine16": "",
				"skudefine17": "",
				"skudefine18": "",
				"skudefine19": "",
				"skudefine20": "",
				"skudefine21": "",
				"skudefine22": "",
				"skudefine23": "",
				"skudefine24": "",
				"skudefine25": "",
				"skudefine26": "",
				"skudefine27": "",
				"skudefine28": "",
				"skudefine29": "",
				"skudefine30": "",
				"skudefine31": "",
				"skudefine32": "",
				"skudefine33": "",
				"skudefine34": "",
				"skudefine35": "",
				"skudefine36": "",
				"skudefine37": "",
				"skudefine38": "",
				"skudefine39": "",
				"skudefine40": "",
				"skudefine41": "",
				"skudefine42": "",
				"skudefine43": "",
				"skudefine44": "",
				"skudefine45": "",
				"skudefine46": "",
				"skudefine47": "",
				"skudefine48": "",
				"skudefine49": "",
				"skudefine50": "",
				"skudefine51": "",
				"skudefine52": "",
				"skudefine53": "",
				"skudefine54": "",
				"skudefine55": "",
				"skudefine56": "",
				"skudefine57": "",
				"skudefine58": "",
				"skudefine59": "",
				"skudefine60": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
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
				"recorddate": "",
				"memo": "",
				"mainid": "",
				"id": "",
				"pubts": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"outgoodsposition": "1969746832675072",
				"outgoodsposition_name": "",
				"ingoodsposition": "1969746835722496",
				"ingoodsposition_name": "",
				"isSerialNoManage": "",
				"propertiesValue": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"subQty": 0,
				"invExchRate": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"qty": 2,
				"expireDateNo": "",
				"expireDateUnit": "",
				"unitExchangeType": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"product_model": "",
				"modelDescription": "",
				"goodChangesSNs": [
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
				"rowno": "",
				"_status": "Insert"
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
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 返回数据集 |
| successCountAI | long | 否 | 成功 示例：1 |
| failCountAI | long | 否 | 失败 示例：0 |
| count | long | 否 | 次数 示例：1 |
| sucessCount | long | 否 | 成功次数 示例：1 |
| failCount | long | 否 | 失败次数 示例：0 |
| messages | string | 否 | 返回信息 |
| infos | object | 是 | 信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": "",
		"infos": [
			{
				"org": "1900568695608832",
				"org_name": "王章宇全职能",
				"code": "HWTZ20210522000003",
				"vouchdate": "2021-05-22 10:00:00",
				"store": "",
				"store_name": "",
				"warehouse": "1850797131927808",
				"warehouse_name": "gl_序列号仓",
				"bustype": "1917696208982272",
				"bustype_name": "货位调整",
				"status": "0",
				"memo": "",
				"id": "2268637992063744",
				"pubts": "2021-05-22 14:57:54",
				"tplid": "",
				"extend_attrs_json": "",
				"creator": "YonSuite默认用户",
				"createTime": "2021-05-22 14:57:54",
				"createDate": "2021-05-22 14:57:54",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"creatorId": "",
				"modifierId": "",
				"auditorId": "",
				"totalQuantity": 0,
				"warehouse_iSerialManage": "true",
				"warehouse_isGoodsPosition": "true",
				"warehouse_isGoo": "true",
				"stockMgr": "",
				"stockMgr_name": "",
				"totalPieces": "",
				"accountOrg": "1900568695608832",
				"accountOrg_name": "王章宇全职能",
				"department": "",
				"department_name": "",
				"operator": "",
				"operator_name": "",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"natCurrency_moneyDigit": "3",
				"natCurrency_priceDigit": "2",
				"wStore": "false",
				"tenant": "1849710349897984",
				"yTenantId": "lzu07egu",
				"goodChanges": [
					{
						"product": "2039290921636096",
						"product_cCode": "-001000002",
						"product_cName": "Z-组装子件1",
						"productsku": "",
						"productsku_cCode": "",
						"productsku_cName": "",
						"unit": "",
						"product_unitName": "",
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
						"prodefine1": "",
						"prodefine2": "",
						"prodefine3": "",
						"prodefine4": "",
						"prodefine5": "",
						"prodefine6": "",
						"prodefine7": "",
						"prodefine8": "",
						"prodefine9": "",
						"prodefine10": "",
						"prodefine11": "",
						"prodefine12": "",
						"prodefine13": "",
						"prodefine14": "",
						"prodefine15": "",
						"prodefine16": "",
						"prodefine17": "",
						"prodefine18": "",
						"prodefine19": "",
						"prodefine20": "",
						"prodefine21": "",
						"prodefine22": "",
						"prodefine23": "",
						"prodefine24": "",
						"prodefine25": "",
						"prodefine26": "",
						"prodefine27": "",
						"prodefine28": "",
						"prodefine29": "",
						"prodefine30": "",
						"skudefine1": "",
						"skudefine2": "",
						"skudefine3": "",
						"skudefine4": "",
						"skudefine5": "",
						"skudefine6": "",
						"skudefine7": "",
						"skudefine8": "",
						"skudefine9": "",
						"skudefine10": "",
						"skudefine11": "",
						"skudefine12": "",
						"skudefine13": "",
						"skudefine14": "",
						"skudefine15": "",
						"skudefine16": "",
						"skudefine17": "",
						"skudefine18": "",
						"skudefine19": "",
						"skudefine20": "",
						"skudefine21": "",
						"skudefine22": "",
						"skudefine23": "",
						"skudefine24": "",
						"skudefine25": "",
						"skudefine26": "",
						"skudefine27": "",
						"skudefine28": "",
						"skudefine29": "",
						"skudefine30": "",
						"skudefine31": "",
						"skudefine32": "",
						"skudefine33": "",
						"skudefine34": "",
						"skudefine35": "",
						"skudefine36": "",
						"skudefine37": "",
						"skudefine38": "",
						"skudefine39": "",
						"skudefine40": "",
						"skudefine41": "",
						"skudefine42": "",
						"skudefine43": "",
						"skudefine44": "",
						"skudefine45": "",
						"skudefine46": "",
						"skudefine47": "",
						"skudefine48": "",
						"skudefine49": "",
						"skudefine50": "",
						"skudefine51": "",
						"skudefine52": "",
						"skudefine53": "",
						"skudefine54": "",
						"skudefine55": "",
						"skudefine56": "",
						"skudefine57": "",
						"skudefine58": "",
						"skudefine59": "",
						"skudefine60": "",
						"isBatchManage": "",
						"isExpiryDateManage": "",
						"batchno": "",
						"producedate": "",
						"invaliddate": "",
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
						"recorddate": "",
						"memo": "",
						"mainid": "2271561186054912",
						"id": "2271561186054913",
						"pubts": "2021-05-24 16:31:32",
						"yTenantId": "lzu07egu",
						"bodyItem": {
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
						"sourceid": "",
						"sourceautoid": "",
						"source": "",
						"upcode": "",
						"makeRuleCode": "",
						"inStockStatusDoc": "2006555827382257",
						"outStockStatusDoc": "2006555827382257",
						"outgoodsposition": "1969746832675072",
						"outgoodsposition_name": "05区01架",
						"inreserveid": "0",
						"outreserveid": "0",
						"ingoodsposition": "1969746835722496",
						"ingoodsposition_name": "05区02架",
						"isSerialNoManage": "false",
						"propertiesValue": "",
						"contactsQuantity": 0,
						"contactsPieces": 0,
						"subQty": 0,
						"invExchRate": 0,
						"stockUnitId": "",
						"stockUnit_name": "",
						"project": "",
						"project_code": "",
						"project_name": "",
						"qty": 1,
						"expireDateNo": "",
						"expireDateUnit": "",
						"unitExchangeType": "",
						"unit_Precision": "",
						"stockUnitId_Precision": "",
						"product_model": "",
						"modelDescription": "",
						"goodChangesSNs": [
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
						]
					}
				],
				"rowno": "",
				"_status": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	库存业务不允许数量、应收/发数量同时为空	在数量或者应收/发数量上添加值


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

