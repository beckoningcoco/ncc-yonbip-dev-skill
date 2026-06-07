---
title: "调出保存"
apiId: "d60d5d23345c42318d9a5ea2598a1d18"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer-out Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-out Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调出保存

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-out Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/storeout/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 调出单[st.storeout.StoreOut] |
| outorg | string | 否 | 是 | 调出组织id或code |
| id | string | 否 | 否 | ID 新增时无需填写，修改时必填 |
| yhtcreatorId | string | 否 | 否 | 创建人id |
| code | string | 否 | 否 | 单据编号 设置手工编号时必输，自动编号时输入无效 |
| outaccount | string | 否 | 是 | 调出会计主体id或code |
| vouchdate | string | 否 | 是 | 单据日期 |
| bustype | string | 否 | 是 | 交易类型id或code |
| breturn | boolean | 否 | 否 | 调拨退货, true:是、false:否、 |
| bizType | int | 否 | 是 | 自动调拨 默认值为0,0:手工,1:订单审核自动调出调入,2:调出保存自动调入,5:订单审核自动调出 |
| merchant | string | 否 | 否 | 商家 |
| merchant_name | string | 否 | 否 | 商家名称 |
| store | string | 否 | 否 | 所属门店 |
| outStore | string | 否 | 否 | 调出门店id或code |
| outwarehouse | string | 否 | 是 | 调出仓库id或code |
| bustype_storeOutType | string | 否 | 否 | 出库交易类型 |
| inStore | string | 否 | 否 | 调入门店id或code |
| inStore_org | string | 否 | 否 | 调入门店组织id |
| inwarehouse | string | 否 | 否 | 调入仓库id或code |
| inwarehouse_org | string | 否 | 否 | 调入仓库组织id |
| inorg | string | 否 | 是 | 调入组织id或code |
| inaccount | string | 否 | 是 | 调入会计主体id或code |
| outdepartment | string | 否 | 否 | 调出部门id或code |
| outbizperson | string | 否 | 否 | 调出业务员id或code |
| outStorekeeper | string | 否 | 否 | 调出库管员id或code |
| indepartment | string | 否 | 否 | 调入部门id或code |
| inbizperson | string | 否 | 否 | 调入业务员id或code |
| outwarehouse_iSerialManage | boolean | 否 | 否 | 调出仓库是否序列号严格管理， true:是、false:否 |
| warehouse_isGoodsPosition | boolean | 否 | 否 | 仓库是否货位管理， true:是、false:否 |
| warehouse_isGoodsPositionStock | boolean | 否 | 否 | 仓库货位是否记存量，若开启货位管理，则此字段必输，若开启存量，则货位id必输， true:是、false:否 |
| operator | string | 否 | 否 | 经办人id或code |
| totalPieces | BigDecimal | 否 | 否 | 整单件数 |
| memo | string | 否 | 否 | 备注 |
| srcBill | string | 否 | 否 | 来源单据id |
| srcBillNO | string | 否 | 否 | 来源单据 |
| srcBillType | string | 否 | 是 | 来源上级单据类型, st_transferapply:调拨订单 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss，修改时必填 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| receiver | string | 否 | 否 | 收货人 |
| receivemobile | string | 否 | 否 | 收货人电话 |
| receiveaddr | string | 否 | 否 | 收货人地址 |
| receivezipcode | string | 否 | 否 | 邮编 |
| natCurrency_priceDigit | string | 否 | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| details | object | 是 | 是 | 调出单子表[st.storeout.StoreOutDetail] |

## 3. 请求示例

Url: /yonbip/scm/storeout/save?access_token=访问令牌
Body: {
	"data": {
		"outorg": "",
		"id": "",
		"yhtcreatorId": "",
		"code": "",
		"outaccount": "",
		"vouchdate": "",
		"bustype": "",
		"breturn": true,
		"bizType": 0,
		"merchant": "",
		"merchant_name": "",
		"store": "",
		"outStore": "",
		"outwarehouse": "",
		"bustype_storeOutType": "",
		"inStore": "",
		"inStore_org": "",
		"inwarehouse": "",
		"inwarehouse_org": "",
		"inorg": "",
		"inaccount": "",
		"outdepartment": "",
		"outbizperson": "",
		"outStorekeeper": "",
		"indepartment": "",
		"inbizperson": "",
		"outwarehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": true,
		"warehouse_isGoodsPositionStock": true,
		"operator": "",
		"totalPieces": 0,
		"memo": "",
		"srcBill": "",
		"srcBillNO": "",
		"srcBillType": "",
		"pubts": "",
		"totalQuantity": 0,
		"ecsuiteperson": "",
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"_status": "",
		"details": [
			{
				"id": "",
				"isSerialNoManage": true,
				"sourceMainPubts": "",
				"product": "",
				"product_cCode": "",
				"productsku": "",
				"productsku_cCode": "",
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
				"detailid": "",
				"pubts": "",
				"srcBillRow": 0,
				"markPrice": 0,
				"goodsposition": "",
				"autoCalcCost": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"qty": 0,
				"unit": 0,
				"invExchRate": 0,
				"subQty": 0,
				"stockUnitId": 0,
				"costprice": 0,
				"costmoney": 0,
				"natUnitPrice": 0,
				"natMoney": 0,
				"finishinqty": 0,
				"finishinnum": 0,
				"project": "",
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
				"stockUnitId_Precision": "",
				"unit_Precision": "",
				"memo": "",
				"returnsourceid": 0,
				"returnsourceautoid": 0,
				"_status": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"storeOutDetailSNs": [
					{
						"id": "",
						"pubts": "",
						"grandpaid": "",
						"detailid": "",
						"sn": "",
						"_status": "",
						"define1": "",
						"define2": ""
					}
				],
				"externalCode": "",
				"externalSourceid": "",
				"externalSourceautoid": ""
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
				"vouchdate": "",
				"code": "",
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
				"bustype_storeOutType": "",
				"inStore": "",
				"inStore_name": "",
				"inStore_org": "",
				"inwarehouse": 0,
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
				"status": 0,
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
				"id": 0,
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
				"details": [
					{
						"isSerialNoManage": "",
						"product": 0,
						"product_cCode": "",
						"product_cName": "",
						"product_model": "",
						"modelDescription": "",
						"productsku": 0,
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
						"mainid": 0,
						"rowno": 0,
						"id": 0,
						"pubts": "",
						"srcBillRow": 0,
						"markPrice": 0,
						"goodsposition": 0,
						"goodsposition_cName": "",
						"autoCalcCost": true,
						"contactsQuantity": 0,
						"contactsPieces": 0,
						"qty": 0,
						"unit": 0,
						"unitName": "",
						"invExchRate": 0,
						"subQty": 0,
						"stockUnitId": 0,
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
						"returnsourceid": "",
						"returnsourceautoid": "",
						"bodyItem": {
							"define1": "",
							"define2": "",
							"define3": "",
							"define4": "",
							"define5": ""
						},
						"storeOutDetailSNs": [
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

请求参数 totalQuantity

更新

请求参数 markPrice

更新

请求参数 invExchRate

更新

返回参数 totalQuantity

更新

返回参数 markPrice

更新

返回参数 invExchRate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

