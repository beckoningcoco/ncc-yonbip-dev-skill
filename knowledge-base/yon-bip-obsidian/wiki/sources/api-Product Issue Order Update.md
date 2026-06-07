---
title: "销售出库单更新"
apiId: "1460895347239288832"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Issue"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Issue]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售出库单更新

> `ContentType	application/json` 请求方式	POST | 分类: Sales Issue (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/salesout/single/update

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 销售出库单[st.salesout.SalesOut] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 是 | 销售出库单id |
| _status | string | 否 | 是 | Update:更新 示例：Update 默认值：Update |
| memo | string | 否 | 否 | 备注 |
| headItem | object | 否 | 否 | 表头固定自定义项 |
| headDefine | object | 否 | 否 | 表头自由自定义项 |
| details | object | 是 | 否 | 销售出库单子表[st.salesout.SalesOuts] |
| ignoreValidation | boolean | 否 | 否 | 参数设置为true时，请慎重使用，允许仅更新当前单据的自定义项特征字段值，不改变下游单据，不重新过账财务事项。 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/scm/salesout/single/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"_status": "Update",
		"memo": "",
		"headItem": {
			"id": 0,
			"_status": "",
			"define1": "",
			"define2": ""
		},
		"headDefine": {
			"id": 0,
			"_status": "",
			"define1": "",
			"define2": ""
		},
		"details": [
			{
				"id": 0,
				"_status": "Update",
				"memo": "",
				"bodyItem": {
					"id": 0,
					"_status": "",
					"define1": "",
					"define2": ""
				},
				"bodyDefine": {
					"id": 0,
					"_status": "",
					"define1": "",
					"define2": ""
				}
			}
		],
		"ignoreValidation": false
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| invoiceOrg | string | 否 | 开票组织ID 示例：2578616857580032 |
| modifier | string | 否 | 修改人 示例：YonSuite默认用户 |
| modifierId | long | 否 | 修改人id 示例：2491026089398528 |
| memo | string | 否 | 备注 示例：memo1 |
| isDayEnd | boolean | 否 | 是否已生成日报 示例：false |
| realMoney | double | 否 | 应付金额(含运费) 示例：0 |
| modifyTime | string | 否 | 修改时间 示例：2022-06-10 16:09:46 |
| natCurrency | string | 否 | 本币id 示例：2578464720327424 |
| sourcesys | string | 否 | 来源系统 示例：udinghuo |
| details | object | 是 | 销售出库单子表 |
| id | long | 否 | 单据id 示例：1474413937164812300 |
| tenant | long | 否 | 租户id 示例：2491026088726784 |
| internalSign | boolean | 否 | 是否内部交易的标识 示例：false |
| modifyDate | string | 否 | 修改时间 示例：2022-06-10 16:09:46 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| barcodeRecord | string | 是 | 扫码明细 |
| srcBillNO | string | 否 | 来源单据号 示例：66BG-0000000000-20220610-000077 |
| warehouse | long | 否 | 仓库id 示例：2578616969810432 |
| srcBillType | string | 否 | 来源类型, 0:无来源、st_purinrecord:采购入库单、1:发货单、2:销售订单、3:退货单、tradeorder:电商订单、refundorder:电商退换货订单、retailvouch:零售单、mallvouch:商城发货单 示例：1 |
| barCode | string | 否 | 条码 示例：st_salesout|1474413937164812291 |
| diliverStatus | string | 否 | 发货状态，DELIVERED 已收货，DELIVERING 待收货 示例：DELIVERING |
| exchRateType | string | 否 | 汇率类型id 示例：2578616843981824 |
| invoiceCust | long | 否 | 开票客户ID 示例：2590006989394176 |
| inventoryowner | long | 否 | 货主id 示例：0 |
| status | long | 否 | 单据状态，0开立，1已审核，2已关闭，3审核中 示例：0 |
| isUpdateCost | boolean | 否 | 是否更新存货成本 示例：true |
| shop | long | 否 | 商家id 示例：-1 |
| code | string | 否 | 单据编号 示例：XSCK20220610000034 |
| receiveAccountingBasis | string | 否 | 立账开票依据, voucher_order:销售订单、voucher_delivery:销售发货单、st_salesout:销售出库单、unsettle:不结算 示例：voucher_delivery |
| extend_attrs_json | string | 否 | 交易类型扩展属性 示例：{"isUpdateCost":"true","sendtowms":"false"} |
| apiUpdate | boolean | 否 | 是否api更新接口 示例：true |
| sendtowms | boolean | 否 | 是否是传wms业务 示例：false |
| creatorId | long | 否 | 创建人ID 示例：2491026089398528 |
| exchRate | double | 否 | 汇率 示例：1 |
| salesOrg | string | 否 | 销售组织id 示例：2578616857580032 |
| vouchdate | string | 否 | 单据日期 示例：2022-06-10 00:00:00 |
| currency | string | 否 | 币种id 示例：2578464720327424 |
| department | string | 否 | 部门 示例：2578616882778368 |
| pubts | string | 否 | 时间戳 示例：2022-06-10 16:09:46 |
| isUpdateStock | boolean | 否 | 是否更新存量 示例：true |
| createDate | string | 否 | 创建日期 示例：2022-06-10 00:00:00 |
| fromApi_ustock | boolean | 否 | 是否来源于api 示例：true |
| creator | string | 否 | 创建人id 示例：YonSuite默认用户 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 发货组织id 示例：2578616857580032 |
| carryOverOfCostMethod | string | 否 | 结转成本方式，summary 汇总结转，details 明细结转 示例：details |
| accountOrg | string | 否 | 会计主体id 示例：2578616857580032 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号管理 示例：false |
| batchnoISUnlock | boolean | 否 | 是否批次锁定 示例：false |
| bustype | string | 否 | 交易类型 示例：2491027558388237 |
| createTime | string | 否 | 创建时间 示例：2022-06-10 14:59:34 |
| ownertype | long | 否 | 货权归属，0 自有，1 供应商，2 客户寄存(CMI) 示例：0 |
| cust | long | 否 | 客户id 示例：2590006989394176 |
| agentId | long | 否 | 客户id 示例：2590006989394176 |
| headItem | object | 否 | 表头固定自定义项 |
| headDefine | object | 否 | 表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"invoiceOrg": "2578616857580032",
		"modifier": "YonSuite默认用户",
		"modifierId": 2491026089398528,
		"memo": "memo1",
		"isDayEnd": false,
		"realMoney": 0,
		"modifyTime": "2022-06-10 16:09:46",
		"natCurrency": "2578464720327424",
		"sourcesys": "udinghuo",
		"details": [
			{
				"oriTax": 0,
				"orderId": 1474413885644079000,
				"memo": "memo2",
				"firstsource": "voucher_order",
				"firstupcode": "QbOJ-000000000-20220610-000045",
				"natTax": 0,
				"source": "1",
				"subQty": 1,
				"invaliddate": "2021-06-30 00:00:00",
				"isExpiryDateManage": true,
				"id": 1474413937164812300,
				"mainid": 1474413937164812300,
				"isSerialNoManage": false,
				"tenant": 2491026088726784,
				"invaliddateTime": 1624982400000,
				"oriUnitPrice": 0,
				"natSum": 0,
				"isScrap": false,
				"taxRate": 0,
				"unit": 2578617118151168,
				"productsku": 2599920732951041,
				"qty": 1,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"invExchRate": 1,
				"preretailqty": 0,
				"inventoryowner": 0,
				"stockUnitId": 2578617118151168,
				"natUnitPrice": 0,
				"isGiftProduct": false,
				"isUpdateCost": true,
				"batchno": "CCCC1116",
				"autoCalcCost": true,
				"reserveid": 0,
				"producedate": "2021-06-01 00:00:00",
				"firstsourceautoid": 1474413885644079000,
				"producedateTime": 1622476800000,
				"makeRuleCode": "deliveryTostoreout",
				"stockStatusDoc": 2490273290604990,
				"priceUOM": 2578617118151168,
				"isBatchManage": true,
				"sourceid": 1474413902823948300,
				"rowno": 1,
				"product": 2599920733344256,
				"oriSum": 0,
				"rebateFlag": false,
				"orderDetailId": 1474413885644079000,
				"sourceautoid": 1474413902823948300,
				"lineno": 10,
				"priceQty": 1,
				"taxUnitPriceTag": true,
				"ownertype": 0,
				"upcode": "66BG-0000000000-20220610-000077",
				"saleStyle": "SALE",
				"propertyRightsTransferred": false,
				"orderCode": "QbOJ-000000000-20220610-000045",
				"bInvoiceAfterReceipt": false,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"bodyItem": {
					"poiExcelRowNum": "1",
					"poiExcelSheetName": "SalesOutsCustomItem(1)",
					"define1": "1define1",
					"id": 1474413937164812300
				},
				"bodyDefine": {
					"poiExcelRowNum": "1",
					"poiExcelSheetName": "SalesOutsDefine(1)",
					"id": 1474413937164812300,
					"define1": "4gai"
				}
			}
		],
		"id": 1474413937164812300,
		"tenant": 2491026088726784,
		"internalSign": false,
		"modifyDate": "2022-06-10 16:09:46",
		"isWfControlled": false,
		"barcodeRecord": [
			""
		],
		"srcBillNO": "66BG-0000000000-20220610-000077",
		"warehouse": 2578616969810432,
		"srcBillType": "1",
		"barCode": "st_salesout|1474413937164812291",
		"diliverStatus": "DELIVERING",
		"exchRateType": "2578616843981824",
		"invoiceCust": 2590006989394176,
		"inventoryowner": 0,
		"status": 0,
		"isUpdateCost": true,
		"shop": -1,
		"code": "XSCK20220610000034",
		"receiveAccountingBasis": "voucher_delivery",
		"extend_attrs_json": "{\"isUpdateCost\":\"true\",\"sendtowms\":\"false\"}",
		"apiUpdate": true,
		"sendtowms": false,
		"creatorId": 2491026089398528,
		"exchRate": 1,
		"salesOrg": "2578616857580032",
		"vouchdate": "2022-06-10 00:00:00",
		"currency": "2578464720327424",
		"department": "2578616882778368",
		"pubts": "2022-06-10 16:09:46",
		"isUpdateStock": true,
		"createDate": "2022-06-10 00:00:00",
		"fromApi_ustock": true,
		"creator": "YonSuite默认用户",
		"resubmitCheckKey": "12",
		"org": "2578616857580032",
		"carryOverOfCostMethod": "details",
		"accountOrg": "2578616857580032",
		"warehouse_iSerialManage": false,
		"batchnoISUnlock": false,
		"bustype": "2491027558388237",
		"createTime": "2022-06-10 14:59:34",
		"ownertype": 0,
		"cust": 2590006989394176,
		"agentId": 2590006989394176,
		"headItem": {
			"poiExcelSheetName": "SalesOutCustomItem(1)",
			"define50": "固定自定义项",
			"poiExcelRowNum": "1",
			"id": 1474413937164812300
		},
		"headDefine": {
			"id": 1474413937164812300,
			"poiExcelSheetName": "SalesOutDefine(1)",
			"define1": "资料37760155define1",
			"poiExcelRowNum": "1"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1001001000003	参照message信息提示	根据message信息提示修改请求数据


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

