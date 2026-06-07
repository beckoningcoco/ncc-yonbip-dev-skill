---
title: "调出来源生单保存"
apiId: "1778019050877092009"
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

# 调出来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-out Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storeout/mergeSourceData/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 调出单[st.storeout.StoreOut] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| mergeSourceData | boolean | 否 | 是 | 是否合并上游数据，固定值为true。 示例：true |
| vouchdate | string | 否 | 否 | 单据日期 示例：2023-01-01 00:00:00 |
| outwarehouse | string | 否 | 否 | 调出仓库id或编码，上游无值时必传，上游有值不可以传。 |
| code | string | 否 | 否 | 单据编号 设置手工编号时必输，自动编号时输入无效 |
| bustype | string | 否 | 是 | 交易类型id或编码 |
| details | object | 是 | 是 | 调出单子表[st.storeout.StoreOutDetail] |
| _status | string | 否 | 是 | 操作标识, Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/scm/storeout/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"mergeSourceData": true,
		"vouchdate": "2023-01-01 00:00:00",
		"outwarehouse": "",
		"code": "",
		"bustype": "",
		"details": [
			{
				"_status": "Insert",
				"qty": 0,
				"sourceid": 0,
				"sourceautoid": 0,
				"batchno": "",
				"makeRuleCode": "",
				"goodsposition": "",
				"storeOutDetailSNs": [
					{
						"sn": "",
						"_status": "Insert"
					}
				]
			}
		],
		"_status": "Insert"
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
| outorg | string | 否 | 调出组织id |
| outorg_name | string | 否 | 调出组织名称 |
| outaccount | string | 否 | 调出会计主体id |
| outaccount_name | string | 否 | 调出会计主体名称 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| breturn | boolean | 否 | 调拨退货, true:是、false:否、 |
| outStore | long | 否 | 调出门店id |
| outStore_name | string | 否 | 调出门店名称 |
| outwarehouse | long | 否 | 调出仓库id |
| outwarehouse_name | string | 否 | 调出仓库名称 |
| inStore | long | 否 | 调入门店id |
| inStore_name | string | 否 | 调入门店名称 |
| inwarehouse | long | 否 | 调入仓库id |
| inwarehouse_name | string | 否 | 调入仓库名称 |
| inorg | string | 否 | 调入组织id |
| inorg_name | string | 否 | 调入组织名称 |
| inaccount | string | 否 | 调入会计主体id |
| inaccount_name | string | 否 | 调入会计主体名称 |
| outdepartment | string | 否 | 调出部门id |
| outdepartment_name | string | 否 | 调出部门名称 |
| outbizperson | string | 否 | 调出业务员id |
| outbizperson_name | string | 否 | 调出业务员名称 |
| indepartment | string | 否 | 调入部门id |
| indepartment_name | string | 否 | 调入部门名称 |
| inbizperson | string | 否 | 调入业务员id |
| inbizperson_name | string | 否 | 调入业务员名称 |
| outwarehouse_iSerialManage | boolean | 否 | 调出仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理 |
| status | int | 否 | 单据状态, 0:开立、1:已入库、 |
| totalPieces | BigDecimal | 否 | 整单件数 |
| memo | string | 否 | 备注 |
| srcBill | long | 否 | 来源单据id |
| srcBillNO | string | 否 | 来源单据 |
| srcBillType | string | 否 | 来源上级单据类型, st_transferapply:调拨订单 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| id | long | 否 | 主表ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| totalQuantity | BigDecimal | 否 | 整单数量 |
| receiver | string | 否 | 收货人 |
| receivemobile | string | 否 | 收货人电话 |
| receiveaddr | string | 否 | 收货人地址 |
| receivezipcode | string | 否 | 邮编 |
| natCurrency_priceDigit | int | 否 | 币种单价精度 |
| natCurrency_moneyDigit | int | 否 | 币种金额精度 |
| details | object | 是 | 调出单子表[st.storeout.StoreOutDetail] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"outorg": "",
		"outorg_name": "",
		"outaccount": "",
		"outaccount_name": "",
		"vouchdate": "",
		"code": "",
		"bustype": "",
		"bustype_name": "",
		"breturn": true,
		"outStore": 0,
		"outStore_name": "",
		"outwarehouse": 0,
		"outwarehouse_name": "",
		"inStore": 0,
		"inStore_name": "",
		"inwarehouse": 0,
		"inwarehouse_name": "",
		"inorg": "",
		"inorg_name": "",
		"inaccount": "",
		"inaccount_name": "",
		"outdepartment": "",
		"outdepartment_name": "",
		"outbizperson": "",
		"outbizperson_name": "",
		"indepartment": "",
		"indepartment_name": "",
		"inbizperson": "",
		"inbizperson_name": "",
		"outwarehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": true,
		"status": 0,
		"totalPieces": 0,
		"memo": "",
		"srcBill": 0,
		"srcBillNO": "",
		"srcBillType": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"id": 0,
		"pubts": "",
		"totalQuantity": 0,
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"details": [
			{
				"isSerialNoManage": true,
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
				"expireDateNo": 0,
				"expireDateUnit": 0,
				"mainid": 0,
				"rowno": 0,
				"id": 0,
				"pubts": "",
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
				"unitExchangeType": 0,
				"unit_Precision": 0,
				"stockUnitId_Precision": 0,
				"memo": "",
				"storeOutDetailSNs": [
					{
						"id": 0,
						"pubts": "",
						"grandpaid": 0,
						"detailid": 0,
						"sn": ""
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	检查必输项或根据返回错误信息做相应处理


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

