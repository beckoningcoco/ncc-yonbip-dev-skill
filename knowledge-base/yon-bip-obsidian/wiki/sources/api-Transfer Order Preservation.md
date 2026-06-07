---
title: "调拨订单保存"
apiId: "81fbf446c09c4bcda7123c9a42c0bac2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨订单保存

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/save

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 调拨订单[st.transferapply.TransferApply] |
| autoGetPrice | boolean | 否 | 否 | 自动询价：是否自动获取内部交易价，自动询价时为true，仅内部交易调拨订单传入生效 |
| barcode | string | 否 | 否 | 条码 |
| outorg | string | 否 | 是 | 调出组织id或code |
| outorg_name | string | 否 | 否 | 调出组织名称 |
| outaccount | string | 否 | 是 | 调出会计主体id或code |
| outaccount_name | string | 否 | 否 | 调出会计主体名称 |
| code | string | 否 | 是 | 单据编号 |
| vouchdate | string | 否 | 是 | 单据日期 |
| bustype | string | 否 | 是 | 交易类型id或code |
| bustype_name | string | 否 | 否 | 交易类型名称 |
| breturn | string | 否 | 否 | 调拨退货, true:是、false:否、 |
| merchant | string | 否 | 否 | 商家id |
| merchant_name | string | 否 | 否 | 商家名称 |
| outstore | string | 否 | 否 | 调出门店id或code |
| outstore_name | string | 否 | 否 | 调出门店名称 |
| instore | string | 否 | 否 | 调入门店id或code |
| instore_name | string | 否 | 否 | 调入门店名称 |
| outwarehouse | string | 否 | 否 | 调出仓库id或code（调出仓库和调入仓库不能相同） |
| outwarehouse_name | string | 否 | 否 | 调出仓库名称 |
| inorg | string | 否 | 是 | 调入组织id或code |
| inorg_name | string | 否 | 否 | 调入组织名称 |
| inaccount | string | 否 | 是 | 调入会计主体id或code |
| inaccount_name | string | 否 | 否 | 调入会计主体名称 |
| inwarehouse | string | 否 | 否 | 调入仓库id或code（调出仓库和调入仓库不能相同） |
| inwarehouse_name | string | 否 | 否 | 调入仓库名称 |
| status | string | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| bizstatus | string | 否 | 否 | 单据状态，由系统业务自动生成，接口无需传值。 |
| outdepartment | string | 否 | 否 | 调出部门id或code |
| outdepartment_name | string | 否 | 否 | 调出部门名称 |
| outbizperson | string | 否 | 否 | 调出业务员id或code |
| outbizperson_name | string | 否 | 否 | 调出业务员名称 |
| indepartment | string | 否 | 否 | 调入部门id或code |
| indepartment_name | string | 否 | 否 | 调入部门名称 |
| inbizperson | string | 否 | 否 | 调入业务员id或code |
| inbizperson_name | string | 否 | 否 | 调入业务员名称 |
| operator | string | 否 | 否 | 经办人id或code |
| operator_name | string | 否 | 否 | 经办人名称 |
| settlementAccount | string | 否 | 否 | 结算主体id |
| settlementAccount_name | string | 否 | 否 | 结算主体名称 |
| id | int | 否 | 否 | 主表ID |
| pubts | string | 否 | 否 | 时间戳（update时必填） |
| tplid | string | 否 | 否 | 模板id |
| totalQuantity | int | 否 | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| cust | string | 否 | 否 | 客户id |
| cust_name | string | 否 | 否 | 客户名称 |
| vendor | string | 否 | 否 | 供应商id |
| vendor_name | string | 否 | 否 | 供应商名称 |
| currency | string | 否 | 否 | 币种id |
| currency_name | string | 否 | 否 | 币种名称 |
| natCurrency | string | 否 | 否 | 本币id |
| natCurrency_name | string | 否 | 否 | 本币名称 |
| exchRate | string | 否 | 否 | 汇率 |
| srcBillType | string | 否 | 否 | 来源类型, st_transferreq：调拨申请、po_picking_requisition：领料申请、po_production_order：生产订单、productionorder.po_subcontract_order_ustock：委外订单、po_replenish_demand：备料工作台 |
| totalPieces | int | 否 | 否 | 整单件数 |
| dplanshipmentdate | string | 否 | 是 | 计划发货日期 |
| dplanarrivaldate | string | 否 | 是 | 计划到货日期 |
| receiver | string | 否 | 否 | 收货人 |
| receivemobile | string | 否 | 否 | 收货人电话 |
| receiveaddr | string | 否 | 否 | 收货人地址 |
| receivezipcode | string | 否 | 否 | 邮编 |
| memo | string | 否 | 否 | 备注 |
| creator | string | 否 | 否 | 创建人，新增时填写，修改时不填 |
| createTime | string | 否 | 否 | 创建时间，新增时填写，修改时不填 |
| createDate | string | 否 | 否 | 创建日期，新增时填写，修改时不填 |
| modifier | string | 否 | 否 | 修改人，修改时填写，新增时不填 |
| modifyTime | string | 否 | 否 | 修改时间，修改时填写，新增时不填 |
| modifyDate | string | 否 | 否 | 修改日期，修改时填写，新增时不填 |
| auditor | string | 否 | 否 | 审批人，新增修改都不可填写 |
| auditTime | string | 否 | 否 | 审批时间，新增修改都不可填写 |
| auditorId | string | 否 | 否 | 审核人 |
| auditDate | string | 否 | 否 | 审批日期，新增修改都不可填写 |
| closer | string | 否 | 否 | 关闭人，新增修改都不可填写 |
| closeTime | string | 否 | 否 | 关闭时间，新增修改都不可填写 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币金额精度 |
| headItem | object | 否 | 否 | 表头自定义项 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| transferApplys | object | 是 | 是 | 调拨订单子表[st.transferapply.TransferApplys] |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |

## 3. 请求示例

Url: /yonbip/scm/transferapply/save?access_token=访问令牌
Body: {
	"data": {
		"autoGetPrice": true,
		"barcode": "",
		"outorg": "",
		"outorg_name": "",
		"outaccount": "",
		"outaccount_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"breturn": "",
		"merchant": "",
		"merchant_name": "",
		"outstore": "",
		"outstore_name": "",
		"instore": "",
		"instore_name": "",
		"outwarehouse": "",
		"outwarehouse_name": "",
		"inorg": "",
		"inorg_name": "",
		"inaccount": "",
		"inaccount_name": "",
		"inwarehouse": "",
		"inwarehouse_name": "",
		"status": "",
		"bizstatus": "",
		"outdepartment": "",
		"outdepartment_name": "",
		"outbizperson": "",
		"outbizperson_name": "",
		"indepartment": "",
		"indepartment_name": "",
		"inbizperson": "",
		"inbizperson_name": "",
		"operator": "",
		"operator_name": "",
		"settlementAccount": "",
		"settlementAccount_name": "",
		"id": 0,
		"pubts": "",
		"tplid": "",
		"totalQuantity": 0,
		"ecsuiteperson": "",
		"cust": "",
		"cust_name": "",
		"vendor": "",
		"vendor_name": "",
		"currency": "",
		"currency_name": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"exchRate": "",
		"srcBillType": "",
		"totalPieces": 0,
		"dplanshipmentdate": "",
		"dplanarrivaldate": "",
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"memo": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditorId": "",
		"auditDate": "",
		"closer": "",
		"closeTime": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"headItem": {
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
		"transferApplys": [
			{
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"manageClass": "",
				"product_productProps": {
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
				"isSerialNoManage": "",
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
				"isExpiryDateManage": "",
				"isBatchManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
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
				"mainid": "",
				"id": 0,
				"pubts": "",
				"qty": 0,
				"unit": "",
				"unitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"unitExchangeType": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"isCanModPrice": "",
				"taxUnitPriceTag": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": "",
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"natTax": 0,
				"project": "",
				"project_name": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"memo": "",
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
				"_status": "",
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"childoutwarehouse": "",
				"childinwarehouse": "",
				"goodsposition": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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
| messages | object | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 否 | 错误信息 |

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
		"infos": [
			{
				"creatorId": 0,
				"tenant": 0,
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
				"outstore": "",
				"outstore_name": "",
				"instore": "",
				"instore_name": "",
				"outwarehouse": 0,
				"outwarehouse_name": "",
				"inorg": "",
				"inorg_name": "",
				"inaccount": "",
				"inaccount_name": "",
				"inwarehouse": 0,
				"inwarehouse_name": "",
				"status": 0,
				"outdepartment": "",
				"outdepartment_name": "",
				"outbizperson": "",
				"outbizperson_name": "",
				"indepartment": "",
				"indepartment_name": "",
				"inbizperson": "",
				"inbizperson_name": "",
				"operator": "",
				"operator_name": "",
				"settlementAccount": "",
				"settlementAccount_name": "",
				"id": 0,
				"pubts": "",
				"tplid": "",
				"totalQuantity": 0,
				"ecsuiteperson": "",
				"cust": 0,
				"cust_name": "",
				"vendor": 0,
				"vendor_name": "",
				"currency": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"exchRate": 0,
				"srcBillType": "",
				"totalPieces": 0,
				"dplanshipmentdate": "",
				"dplanarrivaldate": "",
				"receiver": "",
				"receivemobile": "",
				"receiveaddr": "",
				"receivezipcode": "",
				"memo": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"headItem": {
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
				"transferApplys": [
					{
						"product": 0,
						"product_cCode": "",
						"product_cName": "",
						"product_model": "",
						"modelDescription": "",
						"manageClass": "",
						"product_productProps": {
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
						"isSerialNoManage": "",
						"productsku": 0,
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
						"isExpiryDateManage": true,
						"isBatchManage": true,
						"batchno": "",
						"producedate": "",
						"invaliddate": "",
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
						"mainid": 0,
						"id": 0,
						"pubts": "",
						"qty": 0,
						"unit": 0,
						"unitName": "",
						"invExchRate": 0,
						"subQty": 0,
						"stockUnitId": 0,
						"stockUnit_name": "",
						"unit_Precision": 0,
						"stockUnitId_Precision": 0,
						"isCanModPrice": "",
						"taxUnitPriceTag": "",
						"oriUnitPrice": 0,
						"oriTaxUnitPrice": 0,
						"oriMoney": 0,
						"oriSum": 0,
						"oriTax": 0,
						"taxRate": "",
						"natUnitPrice": 0,
						"natTaxUnitPrice": 0,
						"natMoney": 0,
						"natSum": 0,
						"natTax": 0,
						"project": "",
						"project_name": "",
						"sourceid": "",
						"sourceautoid": "",
						"source": "",
						"upcode": "",
						"memo": "",
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
						"out_sys_rowno": "",
						"out_sys_lineid": "",
						"childoutwarehouse": "",
						"childoutwarehouse_name": "",
						"childinwarehouse": "",
						"childinwarehouse_name": "",
						"goodsposition": "",
						"goodsposition_cName": ""
					}
				],
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": ""
			}
		],
		"failInfos": {}
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

