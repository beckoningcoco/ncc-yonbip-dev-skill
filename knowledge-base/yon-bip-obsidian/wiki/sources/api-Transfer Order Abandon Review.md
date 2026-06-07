---
title: "调拨订单弃审"
apiId: "3762329a01044417a79d295ace5fa494"
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

# 调拨订单弃审

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/batchunaudit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 调拨订单列表[st.transferapply.TransferApply] |
| id | long | 否 | 是 | 主表id |
| pubts | string | 否 | 否 | 时间戳 |

## 3. 请求示例

Url: /yonbip/scm/transferapply/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 0,
			"pubts": ""
		}
	]
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| successCountAI | string | 否 | 成功次数 |
| failCount | string | 否 | 失败次数 |
| sucessCount | string | 否 | 成功次数 |
| infos | object | 是 | 详细信息 |
| failCountAI | string | 否 | 失败次数 |
| count | string | 否 | 总数 |
| messages | object | 是 | 返回消息 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| outstore | string | 否 | 调出门店id |
| outstore_name | string | 否 | 调出门店名称 |
| inwarehouse | string | 否 | 调入仓库id |
| inwarehouse_name | string | 否 | 调入仓库名称 |
| store | string | 否 | 调入门店id |
| ss | string | 否 | 调入门店 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| status | string | 否 | 单据状态, 0:开立、1:已审核、2:关闭、4:出库、 |
| operator | string | 否 | 经办人id |
| operator_name | string | 否 | 经办人名称 |
| memo | string | 否 | 备注 |
| creator | string | 否 | 创建人 |
| exchangestatus | string | 否 | 交换状态, 0:处理中、1:处理失败、2:处理成功、 |
| createDate | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| id | string | 否 | 主表id |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id |
| breturn | string | 否 | 调拨退货, true:是、false:否、 |
| outwarehouse | string | 否 | 调出仓库id |
| outwarehouse_name | string | 否 | 调出仓库名称 |
| merchant | string | 否 | 商家id |
| merchant_name | string | 否 | 商家名称 |
| outorg | string | 否 | 调出组织id |
| outorg_name | string | 否 | 调出组织名称 |
| outaccount | string | 否 | 调出会计主体id |
| outaccount_name | string | 否 | 调出会计主体名称 |
| outdepartment | string | 否 | 调出部门id |
| outdepartment_name | string | 否 | 调出部门名称 |
| outbizperson | string | 否 | 调出业务员id |
| outbizperson_name | string | 否 | 调出业务员名称 |
| inorg | string | 否 | 调入组织id |
| inorg_name | string | 否 | 调入组织名称 |
| inaccount | string | 否 | 调入会计主体id |
| inaccount_name | string | 否 | 调入会计主体名称 |
| indepartment | string | 否 | 调入部门id |
| indepartment_name | string | 否 | 调入部门名称 |
| inbizperson | string | 否 | 调入业务员id |
| inbizperson_name | string | 否 | 调入业务员名称 |
| cust | string | 否 | 客户id |
| cust_name | string | 否 | 客户名称 |
| vendor | string | 否 | 供应商id |
| vendor_name | string | 否 | 供应商名称 |
| taxRate | string | 否 | 税率 |
| currency | string | 否 | 币种id |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_name | string | 否 | 原币名称 |
| natCurrency | string | 否 | 本币id |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_name | string | 否 | 本币名称 |
| exchRate | string | 否 | 汇率 |
| payAgreement | string | 否 | 立账规则id |
| payAgreement_name | string | 否 | 立账规则名称 |
| accountDate | string | 否 | 立账日 |
| maturityDate | string | 否 | 到期日 |
| accountDays | string | 否 | 账期 |
| srcBillType | string | 否 | 来源类型 |
| totalQuantity | string | 否 | 整单数量 |
| totalPieces | string | 否 | 整单件数 |
| dplanshipmentdate | string | 否 | 计划发货日期 |
| dplanarrivaldate | string | 否 | 计划到货日期 |
| receiver | string | 否 | 收货人 |
| receivemobile | string | 否 | 收货人电话 |
| receiveaddr | string | 否 | 收货人地址 |
| receivezipcode | string | 否 | 邮编 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| returncount | string | 否 | 退回次数 |
| closer | string | 否 | 关闭人 |
| closeTime | string | 否 | 关闭时间 |
| product_cCode | string | 否 | 物料编码 |
| product_cName | string | 否 | 物料名称 |
| productsku_cCode | string | 否 | sku编码 |
| productsku_cName | string | 否 | sku名称 |
| propertiesValue | string | 否 | 规格 |
| batchno | string | 否 | 批次号 |
| invaliddate | string | 否 | 有效期至 |
| qty | int | 否 | 数量 |
| unitName | string | 否 | 计量单位 |
| transferApplys_id | int | 否 | 子表id |
| subQty | int | 否 | 件数 |
| stockUnitId | string | 否 | 库存单位id |
| stockUnit_name | string | 否 | 库存单位 |
| project | string | 否 | 项目id |
| project_code | string | 否 | 项目编码 |
| project_name | string | 否 | 项目名称 |
| natUnitPrice | int | 否 | 单价 |
| natMoney | int | 否 | 金额 |
| unit_Precision | string | 否 | 主计量精度 |
| stockUnitId_Precision | string | 否 | 库存单位精度 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"successCountAI": "",
		"failCount": "",
		"sucessCount": "",
		"infos": [
			{
				"headItem": {},
				"stockUnitId": "",
				"bodyItem": [
					{}
				],
				"auditor": "",
				"outorg": "",
				"tenant": "",
				"id": "",
				"auditDate": "",
				"verifystate": 0,
				"inorg_name": "",
				"code": "",
				"status": "",
				"outorg_name": "",
				"outwarehouse": "",
				"qty": "",
				"auditTime": "",
				"transferApplys_id": "",
				"pubts": "yyyy-MM-dd HH:mm:ss",
				"finishoutqty": "",
				"auditorId": "",
				"isWfControlled": "",
				"propertiesValue": "",
				"inorg": ""
			}
		],
		"failCountAI": "",
		"count": "",
		"messages": [
			{}
		],
		"vouchdate": "",
		"code": "",
		"outstore": "",
		"outstore_name": "",
		"inwarehouse": "",
		"inwarehouse_name": "",
		"store": "",
		"ss": "",
		"bustype": "",
		"bustype_name": "",
		"status": "",
		"operator": "",
		"operator_name": "",
		"memo": "",
		"creator": "",
		"exchangestatus": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"id": "",
		"pubts": "",
		"tplid": "",
		"breturn": "",
		"outwarehouse": "",
		"outwarehouse_name": "",
		"merchant": "",
		"merchant_name": "",
		"outorg": "",
		"outorg_name": "",
		"outaccount": "",
		"outaccount_name": "",
		"outdepartment": "",
		"outdepartment_name": "",
		"outbizperson": "",
		"outbizperson_name": "",
		"inorg": "",
		"inorg_name": "",
		"inaccount": "",
		"inaccount_name": "",
		"indepartment": "",
		"indepartment_name": "",
		"inbizperson": "",
		"inbizperson_name": "",
		"cust": "",
		"cust_name": "",
		"vendor": "",
		"vendor_name": "",
		"taxRate": "",
		"currency": "",
		"currency_moneyDigit": "",
		"currency_priceDigit": "",
		"currency_name": "",
		"natCurrency": "",
		"natCurrency_moneyDigit": "",
		"natCurrency_priceDigit": "",
		"natCurrency_name": "",
		"exchRate": "",
		"payAgreement": "",
		"payAgreement_name": "",
		"accountDate": "",
		"maturityDate": "",
		"accountDays": "",
		"srcBillType": "",
		"totalQuantity": "",
		"totalPieces": "",
		"dplanshipmentdate": "",
		"dplanarrivaldate": "",
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"isWfControlled": "",
		"verifystate": "",
		"returncount": "",
		"closer": "",
		"closeTime": "",
		"product_cCode": "",
		"product_cName": "",
		"productsku_cCode": "",
		"productsku_cName": "",
		"propertiesValue": "",
		"batchno": "",
		"invaliddate": "",
		"qty": 0,
		"unitName": "",
		"transferApplys_id": 0,
		"subQty": 0,
		"stockUnitId": "",
		"stockUnit_name": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"natUnitPrice": 0,
		"natMoney": 0,
		"unit_Precision": "",
		"stockUnitId_Precision": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据提示检查，再操作即可


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-26

更新

请求说明

更新

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

