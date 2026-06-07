---
title: "产品入库详情查询"
apiId: "7a8ffab29db743e29cadeafc50c08ef5"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Product Receipt"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 产品入库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Product Receipt (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/storeprorecord/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 业务数据id |

## 3. 请求示例

Url: /yonbip/scm/storeprorecord/detail?access_token=访问令牌&id=

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
| warehouse | string | 否 | 仓库id |
| tenant | string | 否 | 租户 |
| accountOrg | string | 否 | 会计主体id |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| store | string | 否 | 门店id |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理, true:是、false:否、 |
| factoryOrg | string | 否 | 工厂id |
| factory_name | string | 否 | 工厂名称 |
| factoryFiOrg | string | 否 | 工厂会计主体id |
| factoryFiOrg_name | string | 否 | 工厂会计主体名称 |
| bustype | string | 否 | 交易类型id |
| bustype_code | string | 否 | 交易类型编码 |
| bustype_name | string | 否 | 交易类型名称 |
| bustype_extend_attrs_json | string | 否 | 产品入库类型 |
| shop | string | 否 | 商家 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| memo | string | 否 | 备注 |
| srcBillType | string | 否 | 来源类型，po_production_order：生产订单、po_finished_report：完工报告、rm_storeworkorder：加工单 |
| srcBill | string | 否 | 来源单据(系统使用) |
| srcBillNO | string | 否 | 来源单据号(系统使用) |
| status | string | 否 | 单据状态, 0:未提交、1:已提交、 |
| natCurrency_priceDigit | string | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 币种金额精度 |
| totalQuantity | int | 否 | 整单数量(废弃) |
| totalPieces | int | 否 | 整单件数(废弃) |
| totalMaterial | string | 否 | 已材料出, true:是、false:否、(废弃) |
| id | int | 否 | 主表id |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id(废弃) |
| creator | string | 否 | 创建人 |
| creatorId | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 最后修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| modifierId | string | 否 | 修改人 |
| auditorId | string | 否 | 审批人 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理, true:是、false:否、 |
| storeProRecords | object | 是 | 产品入库单子表[st.storeprorecord.StoreProRecords] |
| barcodeRecord | object | 是 | 扫码明细 |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"warehouse": "",
		"tenant": "",
		"accountOrg": "",
		"org": "",
		"org_name": "",
		"accountOrg_name": "",
		"code": "",
		"vouchdate": "",
		"store": "",
		"warehouse_name": "",
		"warehouse_isGoodsPosition": "",
		"factoryOrg": "",
		"factory_name": "",
		"factoryFiOrg": "",
		"factoryFiOrg_name": "",
		"bustype": "",
		"bustype_code": "",
		"bustype_name": "",
		"bustype_extend_attrs_json": "",
		"shop": "",
		"department": "",
		"department_name": "",
		"operator": "",
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"memo": "",
		"srcBillType": "",
		"srcBill": "",
		"srcBillNO": "",
		"status": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"totalMaterial": "",
		"id": 0,
		"pubts": "",
		"tplid": "",
		"creator": "",
		"creatorId": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"modifierId": "",
		"auditorId": "",
		"warehouse_iSerialManage": true,
		"storeProRecords": [
			{
				"warehouseMaterialCheckRule": "",
				"unit_name": "",
				"rowno": "",
				"taxRate": "",
				"isSerialNoManage": "",
				"productClass": 0,
				"productClassName": "",
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
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
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
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
				"product_model": "",
				"product_modelDescription": "",
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
				"expireDateNo": "",
				"expireDateUnit": "",
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
				"qty": 0,
				"unit": "",
				"unit_Precision": "",
				"product_unitName": "",
				"invExchRate": 0,
				"unitExchangeType": "",
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"stockUnitId_Precision": "",
				"autoCalcCost": "",
				"goodsposition": "",
				"goodsposition_cName": "",
				"costUnitPrice": 0,
				"costMoney": 0,
				"natUnitPrice": 0,
				"natMoney": 0,
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"project_name": "",
				"project": "",
				"recorddate": "",
				"memo": "",
				"incomingQuantity": 0,
				"sourceid": "",
				"sourceautoid": "",
				"sourceGrandchildrenId": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"mrpQuantity": 0,
				"mainid": "",
				"id": 0,
				"pubts": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"StoreProRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": "",
						"grandpaid": 0,
						"detailid": 0
					}
				],
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"barcodeRecord": [
			{
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"modelDescription": "",
				"batchno": "",
				"source": "",
				"upcode": "",
				"scanQty": "",
				"contactsQty": "",
				"differQty": "",
				"code": "",
				"barcode": "",
				"snCode": "",
				"scanType": "",
				"qty": 0,
				"unit": 0,
				"unit_name": "",
				"unit_Precision": 0,
				"subQty": 0,
				"stockUnit": 0,
				"stockUnit_name": "",
				"stockUnit_Precision": 0,
				"mosource": "",
				"mocode": "",
				"productClass": 0,
				"productClassName": "",
				"boxCode": "",
				"vouchDetailId": 0,
				"id": 0
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	根据返回提示信息做相应处理


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

