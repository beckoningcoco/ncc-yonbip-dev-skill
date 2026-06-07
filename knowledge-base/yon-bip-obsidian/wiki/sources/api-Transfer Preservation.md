---
title: "调入保存"
apiId: "09d12777aa514b78858fb8e2d7f907f4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer-in Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-in Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调入保存

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-in Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storein/save

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
| data | object | 否 | 是 | 调入单[st.storein.StoreIn] |
| outorg | string | 否 | 是 | 调出组织id或code |
| id | int | 否 | 否 | ID 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 单据编号 设置手工编号时必输，自动编号时输入无效 |
| outaccount | string | 否 | 是 | 调出会计主体id或code |
| vouchdate | string | 否 | 是 | 单据日期 |
| bustype | string | 否 | 是 | 交易类型id或code |
| bizType | string | 否 | 是 | 自动调拨，0:手工,1:订单审核自动调出调入,2:调出保存自动调入,5:订单审核自动调出 |
| breturn | string | 否 | 是 | 调拨退货, true:是、false:否、 |
| merchant | string | 否 | 否 | 商家 |
| merchant_name | string | 否 | 否 | 商家名称 |
| store | string | 否 | 否 | 所属门店 |
| outStore | string | 否 | 否 | 调出门店id或code |
| outwarehouse | string | 否 | 是 | 调出仓库id或code |
| outdepartment | string | 否 | 否 | 调出部门id或code |
| outbizperson | string | 否 | 否 | 调出业务员id或code |
| inorg | string | 否 | 是 | 调入组织id或code |
| inaccount | string | 否 | 是 | 调入会计主体id或code |
| inStore | string | 否 | 否 | 调入门店id或code |
| inwarehouse | string | 否 | 是 | 调入仓库id或code |
| indepartment | string | 否 | 否 | 调入部门id或code |
| inbizperson | string | 否 | 否 | 调入业务员id或code |
| inStorekeeper | string | 否 | 否 | 调入库管员id或code |
| operator | string | 否 | 否 | 经办人id或code |
| memo | string | 否 | 否 | 备注 |
| srcBill | string | 否 | 否 | 来源单据id |
| srcBillNO | string | 否 | 否 | 来源单据号 |
| srcBillType | string | 否 | 否 | 来源单据类型, st_storeout:调出单 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 整单数量 |
| inwarehouse_iSerialManage | boolean | 否 | 否 | 仓库是否序列号严格管理,true:是、false:否 |
| warehouse_isGoodsPosition | boolean | 否 | 否 | 仓库是否货位管理,true:是、false:否 |
| warehouse_isGoodsPositionStock | string | 否 | 否 | 仓库货位是否记存量，若开启货位管理，则此字段必输，若开启存量，则货位id必输， true:是、false:否 |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| totalPieces | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 整单件数 |
| natCurrency_priceDigit | string | 否 | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| headItem | object | 否 | 否 | 表头自定义项 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| details | object | 是 | 是 | 调入单子表[st.storein.StoreInDetail] |

## 3. 请求示例

Url: /yonbip/scm/storein/save?access_token=访问令牌
Body: {
	"data": {
		"outorg": "",
		"id": 0,
		"code": "",
		"outaccount": "",
		"vouchdate": "",
		"bustype": "",
		"bizType": "",
		"breturn": "",
		"merchant": "",
		"merchant_name": "",
		"store": "",
		"outStore": "",
		"outwarehouse": "",
		"outdepartment": "",
		"outbizperson": "",
		"inorg": "",
		"inaccount": "",
		"inStore": "",
		"inwarehouse": "",
		"indepartment": "",
		"inbizperson": "",
		"inStorekeeper": "",
		"operator": "",
		"memo": "",
		"srcBill": "",
		"srcBillNO": "",
		"srcBillType": "",
		"pubts": "",
		"totalQuantity": 0,
		"inwarehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": true,
		"warehouse_isGoodsPositionStock": "",
		"ecsuiteperson": "",
		"totalPieces": 0,
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": ""
		},
		"_status": "",
		"details": [
			{
				"id": 0,
				"isSerialNoManage": true,
				"sourceMainPubts": "",
				"product": "",
				"productsku": "",
				"productsku_cCode": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"contactsQuantity": 0,
				"qty": 0,
				"unit": "",
				"mainid": "",
				"stockUnitId": "",
				"recorddate": "",
				"rowno": 0,
				"srcBillRow": 0,
				"pubts": "",
				"goodsposition": "",
				"autoCalcCost": "",
				"project": "",
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
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": ""
				},
				"_status": "",
				"storeInDetailSNs": [
					{
						"id": "",
						"pubts": "",
						"grandpaid": "",
						"detailid": "",
						"sn": "",
						"sninspect": "",
						"binspect": "",
						"_status": "",
						"define1": "",
						"define2": "",
						"define3": "",
						"define4": "",
						"define5": "",
						"define6": "",
						"define7": "",
						"define8": "",
						"define9": "",
						"define10": ""
					}
				],
				"contactsPieces": 0,
				"allTotalInternalUnit": 0,
				"taxRate": 0,
				"oriTax": 0,
				"natSum": 0,
				"invExchRate": 0,
				"subQty": 0,
				"costprice": 0,
				"costmoney": 0,
				"natUnitPrice": 0,
				"natMoney": 0,
				"natTaxUnitPrice": 0
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
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | string | 否 | 错误信息 |

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
				"outorg": "",
				"outorg_name": "",
				"outaccount": "",
				"outaccount_name": "",
				"code": "",
				"vouchdate": "",
				"bustype": "",
				"bustype_name": "",
				"breturn": true,
				"merchant": "",
				"merchant_name": "",
				"store": "",
				"outStore": "",
				"outStore_name": "",
				"outwarehouse": 0,
				"outwarehouse_name": "",
				"outdepartment": "",
				"outdepartment_name": "",
				"outbizperson": "",
				"outbizperson_name": "",
				"inorg": "",
				"inorg_name": "",
				"inaccount": "",
				"inaccount_name": "",
				"inStore": "",
				"inStore_name": "",
				"inwarehouse": 0,
				"inwarehouse_name": "",
				"indepartment": "",
				"indepartment_name": "",
				"inbizperson": "",
				"inbizperson_name": "",
				"inStorekeeper": "",
				"inStorekeeper_name": "",
				"status": 0,
				"operator": "",
				"operator_name": "",
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
				"id": 0,
				"pubts": "",
				"tplid": "",
				"totalQuantity": 0,
				"inwarehouse_iSerialManage": true,
				"warehouse_isGoodsPosition": true,
				"ecsuiteperson": "",
				"totalPieces": 0,
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": ""
				},
				"details": [
					{
						"isSerialNoManage": "",
						"product": 0,
						"product_cCode": "",
						"product_cName": "",
						"product_model": "",
						"product_modelDescription": "",
						"productsku": 0,
						"productsku_cCode": "",
						"productsku_cName": "",
						"propertiesValue": "",
						"isBatchManage": true,
						"isExpiryDateManage": true,
						"batchno": "",
						"producedate": "",
						"invaliddate": "",
						"expireDateNo": "",
						"expireDateUnit": 0,
						"contactsQuantity": 0,
						"contactsPieces": 0,
						"qty": 0,
						"unit": 0,
						"unitName": "",
						"mainid": 0,
						"invExchRate": 0,
						"subQty": 0,
						"stockUnitId": 0,
						"stockUnit_name": "",
						"recorddate": "",
						"rowno": 0,
						"srcBillRow": 0,
						"id": 0,
						"pubts": "",
						"costprice": 0,
						"costmoney": 0,
						"natUnitPrice": 0,
						"natMoney": 0,
						"natTaxUnitPrice": 0,
						"natSum": 0,
						"oriTax": 0,
						"taxRate": 0,
						"goodsposition": 0,
						"goodsposition_cName": "",
						"autoCalcCost": true,
						"project": "",
						"project_name": "",
						"source": "",
						"sourceid": 0,
						"sourceautoid": 0,
						"upcode": "",
						"makeRuleCode": "",
						"firstsource": "",
						"firstsourceid": 0,
						"firstsourceautoid": 0,
						"firstupcode": "",
						"unitExchangeType": "",
						"unit_Precision": "",
						"stockUnitId_Precision": "",
						"memo": "",
						"allTotalInternalUnit": 0,
						"bodyItem": {
							"id": "",
							"define1": "",
							"define2": "",
							"define3": "",
							"define4": "",
							"define5": ""
						},
						"storeInDetailSNs": [
							{
								"id": 0,
								"pubts": "",
								"grandpaid": 0,
								"detailid": 0,
								"sn": "",
								"sninspect": "",
								"binspect": "",
								"define1": "",
								"define2": "",
								"define3": "",
								"define4": "",
								"define5": "",
								"define6": "",
								"define7": "",
								"define8": "",
								"define9": "",
								"define10": ""
							}
						]
					}
				]
			}
		],
		"failInfos": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	检查必输项或根据返回错误信息做相应处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-11-08

更新

请求参数 (16)

更新

返回参数 (15)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

