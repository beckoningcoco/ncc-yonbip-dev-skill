---
title: "调拨订单更新自定义项特征"
apiId: "1877315851496456195"
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

# 调拨订单更新自定义项特征

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 调拨订单[st.transferapply.TransferApply] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 是 | 主表ID |
| _status | string | 否 | 是 | 操作标识, Update:更新 示例：Update 默认值：Update |
| transferApplys | object | 是 | 否 | 调拨订单子表[st.transferapply.TransferApplys] |

## 3. 请求示例

Url: /yonbip/scm/transferapply/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"_status": "Update",
		"transferApplys": [
			{
				"id": 0,
				"_status": "Update"
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
| creatorId | long | 否 | 创建人id |
| tenant | long | 否 | 租户 |
| outorg | string | 否 | 调出组织id |
| outorg_name | string | 否 | 调出组织名称 |
| outaccount | string | 否 | 调出会计主体id |
| outaccount_name | string | 否 | 调出会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| breturn | boolean | 否 | 调拨退货, true:是、false:否、 |
| merchant | string | 否 | 商家id |
| merchant_name | string | 否 | 商家名称 |
| outstore | string | 否 | 调出门店id |
| outstore_name | string | 否 | 调出门店名称 |
| instore | string | 否 | 调入门店id |
| instore_name | string | 否 | 调入门店名称 |
| outwarehouse | long | 否 | 调出仓库id |
| outwarehouse_name | string | 否 | 调出仓库名称 |
| inorg | string | 否 | 调入组织id |
| inorg_name | string | 否 | 调入组织名称 |
| inaccount | string | 否 | 调入会计主体id |
| inaccount_name | string | 否 | 调入会计主体名称 |
| inwarehouse | long | 否 | 调入仓库id |
| inwarehouse_name | string | 否 | 调入仓库名称 |
| status | int | 否 | 单据状态, 3:审核中、0:开立、1:已审核、2:关闭、 |
| outdepartment | string | 否 | 调出部门id |
| outdepartment_name | string | 否 | 调出部门名称 |
| outbizperson | string | 否 | 调出业务员id |
| outbizperson_name | string | 否 | 调出业务员名称 |
| indepartment | string | 否 | 调入部门id |
| indepartment_name | string | 否 | 调入部门名称 |
| inbizperson | string | 否 | 调入业务员id |
| inbizperson_name | string | 否 | 调入业务员名称 |
| operator | string | 否 | 经办人id |
| operator_name | string | 否 | 经办人名称 |
| settlementAccount | string | 否 | 结算主体id |
| settlementAccount_name | string | 否 | 结算主体名称 |
| id | long | 否 | 主表ID |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id |
| totalQuantity | long | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| cust | long | 否 | 客户id |
| cust_name | string | 否 | 客户名称 |
| vendor | long | 否 | 供应商id |
| vendor_name | string | 否 | 供应商名称 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| natCurrency | string | 否 | 本币id |
| natCurrency_name | string | 否 | 本币名称 |
| exchRate | long | 否 | 汇率 |
| srcBillType | string | 否 | 来源类型, st_transferreq：调拨申请、po_picking_requisition：领料申请、po_production_order：生产订单、productionorder.po_subcontract_order_ustock：委外订单、po_replenish_demand：备料工作台 |
| totalPieces | long | 否 | 整单件数 |
| dplanshipmentdate | string | 否 | 计划发货日期 |
| dplanarrivaldate | string | 否 | 计划到货日期 |
| receiver | string | 否 | 收货人 |
| receivemobile | string | 否 | 收货人电话 |
| receiveaddr | string | 否 | 收货人地址 |
| receivezipcode | string | 否 | 邮编 |
| memo | string | 否 | 备注 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| headItem | object | 否 | 表头自定义项 |
| transferApplys | object | 是 | 调拨订单子表集合 |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
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
			"define2": ""
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
					"define2": ""
				},
				"isSerialNoManage": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"skudefine1": "",
				"skudefine2": "",
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
					"define2": ""
				},
				"out_sys_rowno": "",
				"out_sys_lineid": ""
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

