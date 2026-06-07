---
title: "应收事项单个保存"
apiId: "d62792b768324a6fa9c6ef2eb563b8de"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收事项单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oar/single/save

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
| data | object | 否 | 是 | 应收事项信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 应收事项主表id，新增时不填，修改时必填 |
| accentity_code | string | 否 | 是 | 会计主体（支持id和code）示例：2672016821114370 |
| vouchdate | string | 否 | 是 | 单据日期,格式为:yyyy-MM-dd |
| code | string | 否 | 否 | 单据编号，设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值 |
| billdirection | int | 否 | 否 | 单据方向, 1:红字、2:蓝字，默认根据金额判断单据方向，金额为正是蓝单，反之是红单 |
| receiveprotocol_code | string | 否 | 否 | 收款协议编码（支持id和code）示例：7779999 |
| tradetype_code | string | 否 | 是 | 交易类型（支持id和code）示例：arap_oar_other |
| currency_name | string | 否 | 是 | 币种（支持id、code、name）示例：CNY |
| accountdate | string | 否 | 否 | 立账日期,格式为:yyyy-MM-dd |
| customer_code | string | 否 | 是 | 客户（支持id和code）示例：7779999 |
| exchRate | Decimal | 否 | 是 | 汇率 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型编码（支持id和code） |
| maturitydate | string | 否 | 否 | 到期日,格式为:yyyy-MM-dd |
| retailer | string | 否 | 否 | 散户，客户是散户时才可能传，非散户时无需传 |
| org_code | string | 否 | 否 | 销售组织（支持id和code）示例：12345 |
| project_code | string | 否 | 否 | 项目（支持id和code）示例：12345 |
| dept_code | string | 否 | 否 | 部门（支持id和code）示例：1231-2 |
| oriSum | double | 否 | 是 | 金额，等于明细行含税金额合计值 |
| invoicetype | string | 否 | 否 | 发票类型, 1:增值税电子普通发票、2:增值税普通发票、3:增值税专用发票、4:账单、5:收据、6:机动车销售统一发票、7:通行费增值税电子普通发票、8:增值税电子专用发票 |
| operator_code | string | 否 | 否 | 业务员（支持id和code）示例：00000012 |
| natSum | double | 否 | 是 | 本币金额，等于明细行本币含税金额合计值 |
| invoiceno | string | 否 | 否 | 发票号 |
| orderno | string | 否 | 否 | 订单编号 |
| contractno | string | 否 | 否 | 合同编号 |
| description | string | 否 | 否 | 备注 |
| provisionalestimateflag | string | 否 | 否 | 是否暂估, true:是、false:否（单据是暂估传true，否则写false） |
| initflag | boolean | 否 | 否 | 期初标志，true:是、false:否（启动收付系统日期之前的单据传true，反之传false） |
| headItem | object | 否 | 否 | 表头固定自定义项（1-60） |
| headfree | object | 否 | 否 | 表头自由自定义项(1-60) |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| oarDetail | object | 是 | 是 | 其他应收事项明细 |

## 3. 请求示例

Url: /yonbip/fi/oar/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"accentity_code": "",
		"vouchdate": "",
		"code": "",
		"billdirection": 0,
		"receiveprotocol_code": "",
		"tradetype_code": "",
		"currency_name": "",
		"accountdate": "",
		"customer_code": "",
		"exchRate": 0,
		"exchangeRateType_code": "",
		"maturitydate": "",
		"retailer": "",
		"org_code": "",
		"project_code": "",
		"dept_code": "",
		"oriSum": 0,
		"invoicetype": "",
		"operator_code": "",
		"natSum": 0,
		"invoiceno": "",
		"orderno": "",
		"contractno": "",
		"description": "",
		"provisionalestimateflag": "",
		"initflag": true,
		"headItem": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"headfree": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"_status": "",
		"oarDetail": [
			{
				"id": "",
				"expenseitem_code": "",
				"material_code": "",
				"qty": 0,
				"batchno": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"taxRate": 0,
				"oriSum": 0,
				"oriTax": 0,
				"oriMoney": 0,
				"rebate": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natTax": 0,
				"natMoney": 0,
				"natSum": 0,
				"natrebate": 0,
				"customer_code": "",
				"org_code": "",
				"dept_code": "",
				"operator_code": "",
				"project_code": "",
				"contractno": "",
				"orderno": "",
				"receiveprotocol_code": "",
				"begindate": "",
				"description": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"bodyfree": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回应收事项数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| accentity | string | 否 | 会计主体id |
| accentity_code | string | 否 | 会计主体编码 |
| vouchdate | string | 否 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss |
| billnum | string | 否 | 单据编码 |
| code | string | 否 | 单据编号 |
| basebilltype | string | 否 | 事项类型id |
| billtype | string | 否 | 收付事项类型,2:其它应收事项 |
| oriMoneyDigit | string | 否 | 原币精度 |
| basebilltype_code | string | 否 | 事项类型编码 |
| billdirection | string | 否 | 单据方向, 1:红字、2:蓝字 |
| receiveprotocol_code | string | 否 | 收款协议编码 |
| receiveprotocol | string | 否 | 收款协议id |
| basebilltypecode | string | 否 | 事项类型编码 |
| moneyRount | string | 否 | 本币精度舍入方式，取值自BigDecimal，例如：0：ROUND_UP、1：ROUND_DOWN、2：ROUND_CEILING、3：ROUND_FLOOR、4：ROUND_HALF_UP、5：ROUND_HALF_DOWN、6：ROUND_HALF_EVEN、7：ROUND_UNNECESSARY |
| moneyDigit | string | 否 | 本币精度 |
| oriMoneyRount | string | 否 | 原币精度舍入方式，取值自BigDecimal，例如：0：ROUND_UP、1：ROUND_DOWN、2：ROUND_CEILING、3：ROUND_FLOOR、4：ROUND_HALF_UP、5：ROUND_HALF_DOWN、6：ROUND_HALF_EVEN、7：ROUND_UNNECESSARY |
| tradetype | string | 否 | 交易类型id |
| creatorId | string | 否 | 创建人id |
| checkBillCode | string | 否 | 单据检查标识 |
| tradetype_code | string | 否 | 交易类型编码 |
| isWfControlled | boolean | 否 | 审批流标志, true:是、false:否 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| accountdate | string | 否 | 立账日期,格式为:yyyy-MM-dd HH:mm:ss |
| customer | string | 否 | 客户id |
| customer_code | string | 否 | 客户编码 |
| headItem | object | 否 | 表头固定自定义项（1-60） |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchRate | string | 否 | 汇率 |
| exchangeRateType | string | 否 | 汇率类型id |
| exchangeRateType_code | string | 否 | 汇率类型编码 |
| natCurrency | string | 否 | 本币币种id |
| maturitydate | string | 否 | 到期日,格式为:yyyy-MM-dd HH:mm:ss |
| retailer | string | 否 | 散户 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| org | string | 否 | 销售组织id |
| org_code | string | 否 | 销售组织编码 |
| period | string | 否 | 会计期间id |
| project | string | 否 | 项目id |
| project_code | string | 否 | 项目编码 |
| dept | string | 否 | 部门id |
| dept_code | string | 否 | 部门编码 |
| invoicetype | string | 否 | 发票类型, 1:增值税电子普通发票、2:增值税普通发票、3:增值税专用发票、4:账单、6:机动车销售统一发票、5:收据 |
| natSum | BigDecimal | 否 | 本币金额 |
| oriSum | BigDecimal | 否 | 金额 |
| operator | string | 否 | 业务员id |
| operator_code | string | 否 | 业务员编码 |
| invoiceno | string | 否 | 发票号 |
| orderno | string | 否 | 订单编号 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批 |
| voucherstatus | string | 否 | 凭证状态, 1:已生成、2:未生成、3:已接收未生成、4:不生成 |
| writeoffstatus | string | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销 |
| srcitem | string | 否 | 事项来源,1:销售管理、2:B2C订单中心、3:在线商城、4:零售、5:库存、6:应收应付、7:采购管理、 8:现金管理、9:导入、10:费用管理、11:总账、12:内部交易、20:第三方 |
| provisionalestimateflag | string | 否 | 是否暂估, true:是、false:否 |
| description | string | 否 | 备注 |
| balance | BigDecimal | 否 | 余额 |
| localbalance | BigDecimal | 否 | 本币余额 |
| caobject | string | 否 | 收款对象,1:客户 |
| initflag | string | 否 | 期初标志, true:是、false:否 |
| busiaccbook | string | 否 | 业务账簿 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| modifier | string | 否 | 修改人 |
| modifyDate | string | 否 | 修改日期,格式为:yyyy-MM-dd HH:mm:ss |
| modifyTime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |
| oarDetail | object | 是 | 其它应收事项明细 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity": "",
		"accentity_code": "",
		"vouchdate": "",
		"billnum": "",
		"code": "",
		"basebilltype": "",
		"billtype": "",
		"oriMoneyDigit": "",
		"basebilltype_code": "",
		"billdirection": "",
		"receiveprotocol_code": "",
		"receiveprotocol": "",
		"basebilltypecode": "",
		"moneyRount": "",
		"moneyDigit": "",
		"oriMoneyRount": "",
		"tradetype": "",
		"creatorId": "",
		"checkBillCode": "",
		"tradetype_code": "",
		"isWfControlled": true,
		"currency": "",
		"currency_name": "",
		"accountdate": "",
		"customer": "",
		"customer_code": "",
		"headItem": {
			"id": "",
			"define1": ""
		},
		"exchangeRateType_digit": "",
		"exchRate": "",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"natCurrency": "",
		"maturitydate": "",
		"retailer": "",
		"natCurrency_moneyDigit": "",
		"currency_moneyDigit": "",
		"org": "",
		"org_code": "",
		"period": "",
		"project": "",
		"project_code": "",
		"dept": "",
		"dept_code": "",
		"invoicetype": "",
		"natSum": 0,
		"oriSum": 0,
		"operator": "",
		"operator_code": "",
		"invoiceno": "",
		"orderno": "",
		"auditstatus": "",
		"voucherstatus": "",
		"writeoffstatus": "",
		"srcitem": "",
		"provisionalestimateflag": "",
		"description": "",
		"balance": 0,
		"localbalance": 0,
		"caobject": "",
		"initflag": "",
		"busiaccbook": "",
		"resubmitCheckKey": "",
		"modifier": "",
		"modifyDate": "",
		"modifyTime": "",
		"oarDetail": [
			{
				"id": "",
				"mainid": "",
				"expenseitem_code": "",
				"expenseitem": "",
				"material": "",
				"material_code": "",
				"qty": 0,
				"batchno": "",
				"oriUnitPrice": "",
				"oriTaxUnitPrice": "",
				"taxsubject": "",
				"taxsubject_name": "",
				"taxRate": "",
				"oriSum": 0,
				"oriTax": 0,
				"oriMoney": 0,
				"bodyItem": {
					"id": "",
					"define1": ""
				},
				"bodyfree": {
					"id": "",
					"define1": ""
				},
				"balance": 0,
				"localbalance": 0,
				"rebate": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natTax": 0,
				"natMoney": 0,
				"natrebate": 0,
				"natSum": 0,
				"customer_code": "",
				"customer": "",
				"org": "",
				"org_code": "",
				"dept": "",
				"dept_code": "",
				"operator": "",
				"operator_code": "",
				"project": "",
				"project_code": "",
				"orderno": "",
				"receiveprotocol": "",
				"receiveprotocol_code": "",
				"begindate": "",
				"description": "",
				"pubts": "",
				"oarProtocol": [
					{
						"currency_moneyDigit": "",
						"begindate": "",
						"parentid": "",
						"invoicerow": "",
						"deliveryrow": "",
						"linkedorder": "",
						"deliveryorder": "",
						"orderrow": "",
						"balance": 0,
						"amountpercent": "",
						"oriSum": 0,
						"localbalance": 0,
						"maturitydate": "",
						"verifymethod": "",
						"natSum": 0,
						"grandpaid": "",
						"natCurrency_moneyDigit": "",
						"verifyamount": 0,
						"receiveplanrow": "",
						"accountdate": ""
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前会计期间已经结账,单据不能维护	会计期间已结账，不能录单校验


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

