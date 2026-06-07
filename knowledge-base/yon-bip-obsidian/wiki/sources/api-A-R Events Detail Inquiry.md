---
title: "应收事项详情查询"
apiId: "5702b44c60a54b1791390ade72f2bac6"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收事项详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oar/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 应收事项ID |

## 3. 请求示例

Url: /yonbip/fi/oar/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回应收事项数据 |
| accentity | string | 否 | 会计主体id |
| accentity_name | string | 否 | 会计主体名称 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| accentity_code | string | 否 | 会计主体编码 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| basebilltype | string | 否 | 事项类型id |
| basebilltype_name | string | 否 | 事项类型名称 |
| billtype | string | 否 | 收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| basebilltype_code | string | 否 | 事项类型编码 |
| billdirection | string | 否 | 单据方向, 1:红字、2:蓝字、 |
| accountrule | string | 否 | 立账规则id |
| receiveprotocol_code | string | 否 | 收款协议编码 |
| receiveprotocol | string | 否 | 收款协议id |
| accountrule_name | string | 否 | 立账规则名称 |
| receiveprotocol_name | string | 否 | 收款协议名称 |
| tradetype | string | 否 | 交易类型id |
| tradetype_name | string | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 交易类型编码 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| accountdate | string | 否 | 立账日期 |
| customer | string | 否 | 客户id |
| customer_code | string | 否 | 客户编码 |
| customer_name | string | 否 | 客户名称 |
| customer_retailInvestors | string | 否 | 客户是否散户 |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchRate | int | 否 | 汇率 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 汇率类型id |
| exchangeRateType_code | string | 否 | 汇率类型编码 |
| natCurrency | string | 否 | 本币币种id |
| maturitydate | string | 否 | 到期日 |
| natCurrency_name | string | 否 | 本币币种名称 |
| retailer | string | 否 | 散户 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| org | string | 否 | 销售组织id |
| org_code | string | 否 | 销售组织编码 |
| org_name | string | 否 | 销售组织名称 |
| period | string | 否 | 会计期间id |
| period_code | string | 否 | 会计期间 |
| project | string | 否 | 项目id |
| project_code | string | 否 | 项目编码 |
| project_name | string | 否 | 项目名称 |
| dept | string | 否 | 部门id |
| dept_code | string | 否 | 部门编码 |
| dept_name | string | 否 | 部门名称 |
| oriSum | double | 否 | 金额 |
| invoicetype | string | 否 | 发票类型, 1:增值税电子普通发票、2:增值税普通发票、3:增值税专用发票、4:账单、6:机动车销售统一发票、5:收据、 |
| operator | string | 否 | 业务员id |
| operator_code | string | 否 | 业务员编码 |
| operator_name | string | 否 | 业务员名称 |
| natSum | double | 否 | 本币金额 |
| invoiceno | string | 否 | 发票号 |
| orderno | string | 否 | 订单编号 |
| description | string | 否 | 备注 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批、 |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| voucherstatus | string | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、 |
| writeoffstatus | string | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销、 |
| srcitem | string | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| balance | double | 否 | 余额 |
| provisionalestimateflag | string | 否 | 是否暂估, true:是、false:否、 |
| localbalance | double | 否 | 本币余额 |
| caobject | string | 否 | 收款对象 |
| redflag | string | 否 | 是否红冲 |
| initflag | string | 否 | 期初标志 |
| srcbillid | string | 否 | 来源单据id |
| busiaccbook | string | 否 | 业务账簿 |
| accpurpose | string | 否 | 核算目的 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| auditDate | double | 否 | 审批日期 |
| oarDetail | object | 是 | 其它应收事项明细 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity": "",
		"accentity_name": "",
		"accentity_code": "",
		"vouchdate": "",
		"code": "",
		"basebilltype": "",
		"basebilltype_name": "",
		"billtype": "",
		"basebilltype_code": "",
		"billdirection": "",
		"accountrule": "",
		"receiveprotocol_code": "",
		"receiveprotocol": "",
		"accountrule_name": "",
		"receiveprotocol_name": "",
		"tradetype": "",
		"tradetype_name": "",
		"tradetype_code": "",
		"currency": "",
		"currency_name": "",
		"currency_priceDigit": "",
		"accountdate": "",
		"customer": "",
		"customer_code": "",
		"customer_name": "",
		"customer_retailInvestors": "",
		"exchangeRateType_digit": "",
		"exchRate": 0,
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"natCurrency": "",
		"maturitydate": "",
		"natCurrency_name": "",
		"retailer": "",
		"natCurrency_moneyDigit": "",
		"currency_moneyDigit": "",
		"natCurrency_priceDigit": "",
		"org": "",
		"org_code": "",
		"org_name": "",
		"period": "",
		"period_code": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"dept": "",
		"dept_code": "",
		"dept_name": "",
		"oriSum": 0,
		"invoicetype": "",
		"operator": "",
		"operator_code": "",
		"operator_name": "",
		"natSum": 0,
		"invoiceno": "",
		"orderno": "",
		"description": "",
		"auditstatus": "",
		"status": "",
		"voucherstatus": "",
		"writeoffstatus": "",
		"srcitem": "",
		"balance": 0,
		"provisionalestimateflag": "",
		"localbalance": 0,
		"caobject": "",
		"redflag": "",
		"initflag": "",
		"srcbillid": "",
		"busiaccbook": "",
		"accpurpose": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": 0,
		"oarDetail": [
			{
				"mainid": "",
				"expenseitem_code": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"material": "",
				"material_code": "",
				"material_name": "",
				"unit": "",
				"unit_name": "",
				"unit_Precision": "",
				"qty": 0,
				"mainunit": "",
				"mainunit_name": "",
				"batchno": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"taxsubject": "",
				"taxsubject_name": "",
				"taxRate": "",
				"oriSum": 0,
				"oriTax": 0,
				"oriMoney": 0,
				"balance": 0,
				"localbalance": 0,
				"rebate": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natTax": 0,
				"natMoney": 0,
				"natSum": 0,
				"natrebate": 0,
				"customer_code": "",
				"customer": "",
				"customer_name": "",
				"org_code": "",
				"org": "",
				"org_name": "",
				"dept_code": "",
				"dept": "",
				"dept_name": "",
				"operator_code": "",
				"operator": "",
				"operator_name": "",
				"project_code": "",
				"project": "",
				"project_name": "",
				"orderno": "",
				"receiveprotocol_code": "",
				"srcbillno": "",
				"receiveprotocol_name": "",
				"receiveprotocol": "",
				"srcbillitemid": "",
				"begindate": "",
				"description": "",
				"srcbillitemno": "",
				"srcbilltype": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"id": "",
				"pubts": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

