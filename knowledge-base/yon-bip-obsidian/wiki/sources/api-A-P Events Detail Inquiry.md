---
title: "应付事项详情查询"
apiId: "8aea27ab82754e79a486c4a4369d7030"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "A/P Events"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/P Events]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付事项详情查询

> `ContentType	application/json` 请求方式	GET | 分类: A/P Events (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/oap/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 应付事项ID |

## 3. 请求示例

Url: /yonbip/fi/oap/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回应付事项数据 |
| id | string | 否 | 应付事项ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| busiaccbook | string | 否 | 会计账簿 |
| initflag | string | 否 | 期初标志, true:是、false:否、 |
| accentity_code | string | 否 | 会计主体编码 |
| accentity | string | 否 | 会计主体id |
| accentity_name | string | 否 | 会计主体名称 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| billdirection | string | 否 | 单据方向, 1:红字、2:蓝字、 |
| payprotocol_code | string | 否 | 付款协议编码 |
| basebilltype_code | string | 否 | 事项类型编码 |
| basebilltype | string | 否 | 事项类型id |
| payprotocol_name | string | 否 | 付款协议名称 |
| payprotocol | string | 否 | 付款协议id |
| basebilltype_name | string | 否 | 事项类型名称 |
| accountrule | string | 否 | 立账规则id |
| accountrule_name | string | 否 | 立账规则名称 |
| tradetype | string | 否 | 交易类型id |
| tradetype_code | string | 否 | 交易类型编码 |
| tradetype_name | string | 否 | 交易类型名称 |
| currency | string | 否 | 币种id |
| natCurrency | string | 否 | 本币币种id |
| currency_name | string | 否 | 币种名称 |
| natCurrency_name | string | 否 | 本币币种名称 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| accountdate | string | 否 | 立账日期 |
| supplier_retailInvestors | string | 否 | 供应商是否散户 |
| supplier_code | string | 否 | 供应商编码 |
| supplier | string | 否 | 供应商id |
| supplier_name | string | 否 | 供应商名称 |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 汇率类型id |
| exchangeRateType_code | string | 否 | 汇率类型编码 |
| exchRate | int | 否 | 汇率 |
| vendor_name | string | 否 | 供货供应商名称 |
| vendor | string | 否 | 供货供应商id |
| maturitydate | string | 否 | 到期日 |
| retailer | string | 否 | 散户 |
| org_code | string | 否 | 采购组织编码 |
| org | string | 否 | 采购组织id |
| org_name | string | 否 | 采购组织名称 |
| period | string | 否 | 会计期间id |
| period_code | string | 否 | 会计期间 |
| project_code | string | 否 | 项目编码 |
| project | string | 否 | 项目id |
| project_name | string | 否 | 项目名称 |
| dept_code | string | 否 | 部门编码 |
| dept | string | 否 | 部门id |
| dept_name | string | 否 | 部门名称 |
| operator_code | string | 否 | 业务员编码 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| srcitem | string | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| billtype | string | 否 | 应收事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| caobject | string | 否 | 收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、 |
| oriSum | double | 否 | 金额 |
| natSum | double | 否 | 本币金额 |
| balance | double | 否 | 余额 |
| localbalance | double | 否 | 本币余额 |
| invoicetype | string | 否 | 发票类型, 1:增值税电子普通发票、2:增值税普通发票、3:增值税专用发票、4:账单、6:机动车销售统一发票、5:收据、 |
| invoiceno | string | 否 | 发票编号 |
| invoicedate | string | 否 | 发票日期 |
| orderno | string | 否 | 订单编号 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批、 |
| writeoffstatus | string | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销、 |
| voucherstatus | string | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、 |
| description | string | 否 | 备注 |
| provisionalestimateflag | string | 否 | 是否暂估, true:是、false:否、 |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| auditDate | string | 否 | 审批日期 |
| oapProtocol | object | 是 | 其它应付事项孙表 |
| oapDetail | object | 是 | 详细信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"pubts": "",
		"busiaccbook": "",
		"initflag": "",
		"accentity_code": "",
		"accentity": "",
		"accentity_name": "",
		"vouchdate": "",
		"code": "",
		"billdirection": "",
		"payprotocol_code": "",
		"basebilltype_code": "",
		"basebilltype": "",
		"payprotocol_name": "",
		"payprotocol": "",
		"basebilltype_name": "",
		"accountrule": "",
		"accountrule_name": "",
		"tradetype": "",
		"tradetype_code": "",
		"tradetype_name": "",
		"currency": "",
		"natCurrency": "",
		"currency_name": "",
		"natCurrency_name": "",
		"natCurrency_moneyDigit": "",
		"currency_moneyDigit": "",
		"currency_priceDigit": "",
		"natCurrency_priceDigit": "",
		"accountdate": "",
		"supplier_retailInvestors": "",
		"supplier_code": "",
		"supplier": "",
		"supplier_name": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchangeRateType_code": "",
		"exchRate": 0,
		"vendor_name": "",
		"vendor": "",
		"maturitydate": "",
		"retailer": "",
		"org_code": "",
		"org": "",
		"org_name": "",
		"period": "",
		"period_code": "",
		"project_code": "",
		"project": "",
		"project_name": "",
		"dept_code": "",
		"dept": "",
		"dept_name": "",
		"operator_code": "",
		"operator": "",
		"operator_name": "",
		"srcitem": "",
		"billtype": "",
		"caobject": "",
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"localbalance": 0,
		"invoicetype": "",
		"invoiceno": "",
		"invoicedate": "",
		"orderno": "",
		"auditstatus": "",
		"writeoffstatus": "",
		"voucherstatus": "",
		"description": "",
		"provisionalestimateflag": "",
		"status": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"oapProtocol": [
			{
				"id": "",
				"pubts": "",
				"grandpaid": "",
				"parentid": "",
				"payplanrow": "",
				"invoiceno": "",
				"invoicerow": "",
				"deliveryorder": "",
				"deliveryrow": "",
				"linkedorder": "",
				"orderrow": "",
				"begindate": "",
				"accountdate": "",
				"maturitydate": "",
				"paypercent": 0,
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"localbalance": 0,
				"isprepay": "",
				"deposit": "",
				"verifymethod": "",
				"currency_moneyDigit": "",
				"natCurrency_moneyDigit": ""
			}
		],
		"oapDetail": [
			{
				"id": "",
				"pubts": "",
				"mainid": "",
				"expenseitem_code": "",
				"expenseitem": "",
				"expenseitem_name": "",
				"material": "",
				"material_code": "",
				"material_name": "",
				"unit": "",
				"unit_Precision": "",
				"unit_code": "",
				"unit_name": "",
				"qty": 0,
				"batchno": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"taxsubject": "",
				"taxRate": "",
				"oriSum": 0,
				"oriTax": 0,
				"oriMoney": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natSum": 0,
				"natTax": 0,
				"natMoney": 0,
				"balance": 0,
				"localbalance": 0,
				"supplier": "",
				"supplier_retailInvestors": "",
				"supplier_name": "",
				"dept": "",
				"dept_code": "",
				"dept_name": "",
				"operator": "",
				"operator_code": "",
				"operator_name": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"orderno": "",
				"payprotocol_code": "",
				"payprotocol_name": "",
				"payprotocol": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"begindate": "",
				"description": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"srcbilltype": ""
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

1	2025-06-25

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

