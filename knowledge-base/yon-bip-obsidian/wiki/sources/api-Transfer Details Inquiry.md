---
title: "调入详情查询"
apiId: "a7fc12f5c3044705b04b50465c4c017f"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Transfer-in Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-in Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调入详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Transfer-in Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storein/detail

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

Url: /yonbip/scm/storein/detail?access_token=访问令牌&id=

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
| outorg | string | 否 | 调出组织id |
| outorg_name | string | 否 | 调出组织名称 |
| outaccount | string | 否 | 调出会计主体id |
| outaccount_name | string | 否 | 调出会计主体名称 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| breturn | string | 否 | 调拨退货, true:是、false:否、 |
| merchant | string | 否 | 商家id |
| merchant_name | string | 否 | 商家名称 |
| store | string | 否 | 所属门店 |
| outStore | string | 否 | 调出门店id |
| outStore_name | string | 否 | 出库门店名称 |
| outwarehouse | string | 否 | 调出仓库id |
| outwarehouse_name | string | 否 | 出库仓名称 |
| bustype_storeOutType | string | 否 | 出库交易类型扩展字段1：调拨出库；2：门店退货；3：领料出库 |
| inStore | string | 否 | 调入门店id |
| inStore_name | string | 否 | 入库门店名称 |
| inStore_org | string | 否 | 调入门店组织id |
| inwarehouse | string | 否 | 调入仓库id |
| inwarehouse_name | string | 否 | 入库仓名称 |
| inwarehouse_org | string | 否 | 调入仓库组织id |
| inwarehouse_org_name | string | 否 | 调入仓库组织名称 |
| inorg | string | 否 | 调入组织id |
| inorg_name | string | 否 | 调入组织名称 |
| inaccount | string | 否 | 调入会计主体id |
| inaccount_name | string | 否 | 调入会计主体名称 |
| outdepartment | string | 否 | 调出部门id |
| outdepartment_name | string | 否 | 调出部门名称 |
| outbizperson | string | 否 | 调出业务员id |
| outbizperson_name | string | 否 | 调出业务员名称 |
| outStorekeeper | string | 否 | 调出库管员id |
| outStorekeeper_name | string | 否 | 调出库管员名称 |
| indepartment | string | 否 | 调入部门id |
| indepartment_name | string | 否 | 调入部门名称 |
| inbizperson | string | 否 | 调入业务员id |
| inbizperson_name | string | 否 | 调入业务员名称 |
| outwarehouse_iSerialManage | boolean | 否 | 调出仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理 |
| status | string | 否 | 单据状态, 0:开立、1:已入库、 |
| operator | string | 否 | 经办人id |
| operator_name | string | 否 | 经办人名称 |
| totalPieces | long | 否 | 整单件数 |
| memo | string | 否 | 备注 |
| srcBill | string | 否 | 来源单据id |
| srcBillNO | string | 否 | 来源单据 |
| srcBillType | string | 否 | 来源上级单据类型, st_transferapply:调拨订单、st_storeout:调出单、st_storein:调入单、 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| id | string | 否 | 主表ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| totalQuantity | long | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| receiver | string | 否 | 收货人 |
| receivemobile | string | 否 | 收货人电话 |
| receiveaddr | string | 否 | 收货人地址 |
| receivezipcode | string | 否 | 邮编 |
| natCurrency_priceDigit | string | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 币种金额精度 |
| bizType | long | 否 | 自动调拨 (0:手工；1：订单审核自动调出调入；2：调出保存自动调入；5：订单审核自动调出) |
| masterOrgKeyField | string | 否 | 主组织属性 |
| extend_attrs_json | string | 否 | 交易类型扩展字段 |
| warehouse_isGoodsPositionStock | boolean | 否 | 调出仓库是否开启货位记存量 |
| stockStatusDoc | long | 否 | 库存状态id |
| stockStatusDoc_name | string | 否 | 库存状态名称 |
| outreserveid | long | 否 | 调出预留对象id |
| inreserveid | long | 否 | 调入预留对象id |
| isUpdateCost | boolean | 否 | 是否更新成本 |
| transTypeKeyField | string | 否 | 交易类型属性名 |
| details | object | 是 | 调出单子表[st.storeout.StoreOutDetail] |
| expenseNatSum | number |
| 小数位数:8,最大长度:28 | 否 | 主表费用本币含税金额 |
| expenseNatMoney | number |
| 小数位数:8,最大长度:28 | 否 | 主表费用本币无税金额 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"outorg": "",
		"outorg_name": "",
		"outaccount": "",
		"outaccount_name": "",
		"vouchdate": "",
		"code": "",
		"bustype": "",
		"bustype_name": "",
		"breturn": "",
		"merchant": "",
		"merchant_name": "",
		"store": "",
		"outStore": "",
		"outStore_name": "",
		"outwarehouse": "",
		"outwarehouse_name": "",
		"bustype_storeOutType": "",
		"inStore": "",
		"inStore_name": "",
		"inStore_org": "",
		"inwarehouse": "",
		"inwarehouse_name": "",
		"inwarehouse_org": "",
		"inwarehouse_org_name": "",
		"inorg": "",
		"inorg_name": "",
		"inaccount": "",
		"inaccount_name": "",
		"outdepartment": "",
		"outdepartment_name": "",
		"outbizperson": "",
		"outbizperson_name": "",
		"outStorekeeper": "",
		"outStorekeeper_name": "",
		"indepartment": "",
		"indepartment_name": "",
		"inbizperson": "",
		"inbizperson_name": "",
		"outwarehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": true,
		"status": "",
		"operator": "",
		"operator_name": "",
		"totalPieces": 0,
		"memo": "",
		"srcBill": "",
		"srcBillNO": "",
		"srcBillType": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"id": "",
		"pubts": "",
		"tplid": "",
		"totalQuantity": 0,
		"ecsuiteperson": "",
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"bizType": 0,
		"masterOrgKeyField": "",
		"extend_attrs_json": "",
		"warehouse_isGoodsPositionStock": true,
		"stockStatusDoc": 0,
		"stockStatusDoc_name": "",
		"outreserveid": 0,
		"inreserveid": 0,
		"isUpdateCost": true,
		"transTypeKeyField": "",
		"details": [
			{
				"isSerialNoManage": true,
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"isExpiryDateManage": true,
				"isBatchManage": true,
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"recorddate": "",
				"mainid": "",
				"rowno": 0,
				"id": "",
				"pubts": "",
				"srcBillRow": 0,
				"markPrice": 0,
				"goodsposition": "",
				"goodsposition_cName": "",
				"autoCalcCost": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"qty": 0,
				"unit": "",
				"unitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"costprice": 0,
				"costmoney": 0,
				"natUnitPrice": 0,
				"natMoney": 0,
				"finishinqty": 0,
				"finishinnum": 0,
				"project": "",
				"project_name": "",
				"source": "",
				"sourceid": "",
				"sourceautoid": "",
				"upcode": "",
				"makeRuleCode": "",
				"firstsource": "",
				"firstsourceid": "",
				"firstsourceautoid": "",
				"firstupcode": "",
				"unitExchangeType": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"memo": "",
				"returnsourceid": "",
				"returnsourceautoid": "",
				"storeInDetailSNs": [
					{
						"id": "",
						"pubts": "",
						"grandpaid": "",
						"detailid": "",
						"sn": ""
					}
				],
				"expenseNatSum": 0,
				"expenseNatMoney": 0,
				"sfee": 0
			}
		],
		"expenseNatSum": 0,
		"expenseNatMoney": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	入参格式错误等异常	根据返回错误信息做出相应调整


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

