---
title: "调拨订单详情查询"
apiId: "58fedb7252784655b2a2b9ed1e538f34"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Transfer Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨订单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID 新增时无需填写，修改时必填 新增时无需填写，修改时必填 新增时无需填写，修改时必填 |

## 3. 请求示例

Url: /yonbip/scm/transferapply/detail?access_token=访问令牌&id=

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
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| breturn | string | 否 | 调拨退货, true:是、false:否、 |
| merchant | string | 否 | 商家id |
| merchant_name | string | 否 | 商家名称 |
| outstore | string | 否 | 调出门店id |
| outstore_name | string | 否 | 调出门店名称 |
| instore | string | 否 | 调入门店id |
| instore_name | string | 否 | 调入门店名称 |
| outwarehouse | string | 否 | 调出仓库id |
| outwarehouse_name | string | 否 | 调出仓库名称 |
| inorg | string | 否 | 调入组织id |
| inorg_name | string | 否 | 调入组织名称 |
| inaccount | string | 否 | 调入会计主体id |
| inaccount_name | string | 否 | 调入会计主体名称 |
| inwarehouse | string | 否 | 调入仓库id |
| inwarehouse_name | string | 否 | 调入仓库名称 |
| status | string | 否 | 单据状态, 3:审核中、0:开立、1:已审核、2:关闭、 |
| bizstatus | string | 否 | 单据状态, 3:审核中、0:开立、1:已审核、2:关闭、 |
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
| inttraderule | string | 否 | 内部交易规则id |
| id | string | 否 | 单据主键ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| totalQuantity | number |
| 小数位数:8,最大长度:18 | 否 | 整单数量 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| cust | string | 否 | 客户id |
| cust_name | string | 否 | 客户名称 |
| vendor | string | 否 | 供应商id |
| vendor_name | string | 否 | 供应商名称 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| natCurrency | string | 否 | 本币id |
| natCurrency_name | string | 否 | 本币名称 |
| exchRate | string | 否 | 汇率 |
| payAgreement | string | 否 | 立账规则id |
| payAgreement_name | string | 否 | 立账规则名称 |
| accountDate | string | 否 | 立账日 |
| maturityDate | string | 否 | 到期日 |
| srcBillType | string | 否 | 来源类型, st_transferreq:调拨申请、 |
| totalPieces | number |
| 小数位数:8,最大长度:19 | 否 | 整单件数 |
| dplanshipmentdate | string | 否 | 计划发货日期 |
| dplanarrivaldate | string | 否 | 计划到货日期 |
| receiver | string | 否 | 收货人 |
| receivemobile | string | 否 | 收货人电话 |
| receiveaddr | string | 否 | 收货人地址 |
| receivezipcode | string | 否 | 邮编 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| returncount | string | 否 | 退回次数 |
| accountDays | string | 否 | 账期 |
| memo | string | 否 | 备注 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| auditDate | string | 否 | 审批日期 |
| closer | string | 否 | 关闭人 |
| closeTime | string | 否 | 关闭时间 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| headItem | object | 否 | 单据头自定义项 |
| transferApplys | object | 是 | 调拨订单子表[st.transferapply.TransferApplys] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
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
		"inttraderule": "",
		"id": "",
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
		"payAgreement": "",
		"payAgreement_name": "",
		"accountDate": "",
		"maturityDate": "",
		"srcBillType": "",
		"totalPieces": 0,
		"dplanshipmentdate": "",
		"dplanarrivaldate": "",
		"receiver": "",
		"receivemobile": "",
		"receiveaddr": "",
		"receivezipcode": "",
		"isWfControlled": "",
		"verifystate": "",
		"returncount": "",
		"accountDays": "",
		"memo": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
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
		"transferApplys": [
			{
				"free1": "",
				"free2": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"manageClass": "",
				"isSerialNoManage": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"isExpiryDateManage": "",
				"isBatchManage": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"mainid": "",
				"rowno": 0,
				"id": "",
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
				"settlementPriceBy": "",
				"isCanModPrice": "",
				"taxUnitPriceTag": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"natTax": 0,
				"finishoutqty": 0,
				"finishoutnum": 0,
				"finishinqty": 0,
				"finishinnum": 0,
				"project": "",
				"project_name": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"linecloser": "",
				"linecloseTime": "",
				"memo": "",
				"makeRuleCode": "",
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
					"define23": ""
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

999	入参格式错误等异常	根据返回错误信息做出相应调整


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-11-08

更新

返回参数 (22)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

