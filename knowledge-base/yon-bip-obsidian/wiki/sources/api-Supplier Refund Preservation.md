---
title: "供应商退款保存"
apiId: "0e7429100a3747f4bd1273d737e9760e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Payable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Payable]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商退款保存

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Payable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/refundbill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 供应商退款单 |
| id | string | 否 | 否 | 供应商退款单ID 新增时无需填写，修改时必填 |
| accentity | string | 否 | 是 | 会计主体id |
| code | string | 否 | 否 | 单据编号, 新增时填写，修改时无需填写 |
| accentity_code | string | 否 | 是 | 会计主体编码 |
| accentity_name | string | 否 | 否 | 会计主体名称 |
| vouchdate | string | 否 | 是 | 单据日期, 格式为:yyyy-MM-dd HH:mm:ss |
| supplier | string | 否 | 否 | 供应商id |
| supplier_code | string | 否 | 是 | 供应商编码 |
| supplier_name | string | 否 | 否 | 供应商名称 |
| supplier_retailInvestors | boolean | 否 | 否 | 供应商是否散户 |
| settlemode | string | 否 | 否 | 结算方式id |
| settlemode_code | string | 否 | 否 | 结算方式编码 |
| settlemode_name | string | 否 | 否 | 结算方式名称 |
| period | string | 否 | 是 | 会计期间id |
| period_code | string | 否 | 是 | 会计期间, 格式为:yyyy-MM |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| retailer | string | 否 | 否 | 散户 |
| enterprisebankaccount | string | 否 | 否 | 收款银行账户id |
| enterprisebankaccount_code | string | 否 | 否 | 收款银行账户编码 |
| enterprisebankaccount_name | string | 否 | 否 | 收款银行账户名称 |
| cashaccount | string | 否 | 否 | 收款现金账户id |
| cashaccount_code | string | 否 | 否 | 收款现金账户编码 |
| cashaccount_name | string | 否 | 否 | 收款现金账户名称 |
| natCurrency | string | 否 | 是 | 本币币种id |
| tradetype | string | 否 | 是 | 交易类型id |
| tradetype_name | string | 否 | 是 | 交易类型名称 |
| natCurrency_name | string | 否 | 是 | 本币币种名称 |
| tradetype_code | string | 否 | 是 | 交易类型编码 |
| currency | string | 否 | 是 | 币种id |
| currency_name | string | 否 | 是 | 币种名称 |
| natCurrency_priceDigit | string | 否 | 是 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币币种金额精度 |
| exchangeRateType_digit | string | 否 | 是 | 汇率精度 |
| exchangeRateType_name | string | 否 | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 是 | 汇率类型id |
| exchRate | int | 否 | 是 | 汇率 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型编码 |
| oriSum | double | 否 | 否 | 收款金额 |
| natSum | double | 否 | 否 | 本币金额 |
| balance | double | 否 | 否 | 余额 |
| org | string | 否 | 否 | 采购组织id |
| org_code | string | 否 | 否 | 采购组织编码 |
| org_name | string | 否 | 否 | 采购组织名称 |
| dept | string | 否 | 否 | 部门id |
| dept_code | string | 否 | 否 | 部门编码 |
| dept_name | string | 否 | 否 | 部门名称 |
| operator | string | 否 | 否 | 业务员id |
| operator_code | string | 否 | 否 | 业务员编码 |
| operator_name | string | 否 | 否 | 业务员名称 |
| orderno | string | 否 | 否 | 订单编号 |
| customerbankname | string | 否 | 否 | 付款银行名称 |
| supplierbankaccount | string | 否 | 否 | 付款银行账户id |
| supplierbankaccount_accountname | string | 否 | 否 | 付款银行账户 |
| invoiceno | string | 否 | 否 | 票据号 |
| project | string | 否 | 否 | 项目id |
| project_code | string | 否 | 否 | 项目编码 |
| project_name | string | 否 | 否 | 项目名称 |
| description | string | 否 | 否 | 备注 |
| localbalance | double | 否 | 否 | 本币余额 |
| srcitem | string | 否 | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| srcbillid | string | 否 | 否 | 来源单据id ，接口不支持关联来源单据，不建议传值。 |
| busiaccbook | string | 否 | 否 | 业务账簿id |
| busiaccbook_name | string | 否 | 否 | 业务账簿名称 |
| accpurpose | string | 否 | 否 | 核算目的id |
| accpurpose_name | string | 否 | 否 | 核算目的名称 |
| store | string | 否 | 否 | 门店id |
| store_name | string | 否 | 否 | 门店名称 |
| billtype | string | 否 | 否 | 收付事项类型，固定值11, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| basebilltype | string | 否 | 否 | 事项类型id |
| basebilltype_name | string | 否 | 否 | 事项类型名称 |
| supplierbankname | string | 否 | 否 | 收款银行名称 |
| signer | string | 否 | 否 | 签字人id |
| signer_name | string | 否 | 否 | 签字人名称 |
| signdate | string | 否 | 否 | 签字日期, 格式为:yyyy-MM-dd HH:mm:ss |
| caobject | string | 否 | 否 | 收付款对象类型,2:供应商 |
| redflag | string | 否 | 否 | 是否红冲, true:是、false:否、 |
| initflag | string | 否 | 否 | 期初标志, true:是、false:否、 |
| srctypeflag | string | 否 | 否 | 来源类型标识 |
| creator | string | 否 | 否 | 创建人 |
| createTime | string | 否 | 否 | 创建时间, 格式为:yyyy-MM-dd HH:mm:ss |
| createDate | string | 否 | 否 | 创建日期, 格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间, 格式为:yyyy-MM-dd HH:mm:ss |
| modifyDate | string | 否 | 否 | 修改日期, 格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 否 | 审批人 |
| auditTime | string | 否 | 否 | 审批时间, 格式为:yyyy-MM-dd HH:mm:ss |
| auditDate | string | 否 | 否 | 审批日期, 格式为:yyyy-MM-dd HH:mm:ss |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| ecsuiteperson | string | 否 | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 否 | 气泡联系人 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| ReceiveBill_b | object | 是 | 否 | 供应商退款单明细 |

## 3. 请求示例

Url: /yonbip/fi/refundbill/save?access_token=访问令牌
Body: {
	"data": {
		"id": "",
		"accentity": "",
		"code": "",
		"accentity_code": "",
		"accentity_name": "",
		"vouchdate": "",
		"supplier": "",
		"supplier_code": "",
		"supplier_name": "",
		"supplier_retailInvestors": true,
		"settlemode": "",
		"settlemode_code": "",
		"settlemode_name": "",
		"period": "",
		"period_code": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"retailer": "",
		"enterprisebankaccount": "",
		"enterprisebankaccount_code": "",
		"enterprisebankaccount_name": "",
		"cashaccount": "",
		"cashaccount_code": "",
		"cashaccount_name": "",
		"natCurrency": "",
		"tradetype": "",
		"tradetype_name": "",
		"natCurrency_name": "",
		"tradetype_code": "",
		"currency": "",
		"currency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchRate": 0,
		"exchangeRateType_code": "",
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"org": "",
		"org_code": "",
		"org_name": "",
		"dept": "",
		"dept_code": "",
		"dept_name": "",
		"operator": "",
		"operator_code": "",
		"operator_name": "",
		"orderno": "",
		"customerbankname": "",
		"supplierbankaccount": "",
		"supplierbankaccount_accountname": "",
		"invoiceno": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"description": "",
		"localbalance": 0,
		"srcitem": "",
		"srcbillid": "",
		"busiaccbook": "",
		"busiaccbook_name": "",
		"accpurpose": "",
		"accpurpose_name": "",
		"store": "",
		"store_name": "",
		"billtype": "",
		"basebilltype": "",
		"basebilltype_name": "",
		"supplierbankname": "",
		"signer": "",
		"signer_name": "",
		"signdate": "",
		"caobject": "",
		"redflag": "",
		"initflag": "",
		"srctypeflag": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"pubts": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"_status": "",
		"ReceiveBill_b": [
			{
				"id": "",
				"mainid": "",
				"quickType_name": "",
				"quickType": "",
				"quickType_code": 0,
				"oriSum": 0,
				"natSum": 0,
				"supplier_code": "",
				"supplier": "",
				"supplier_name": "",
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
				"description": "",
				"balance": 0,
				"localbalance": 0,
				"srcbilltype": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"srcbillitemid": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"pubts": "",
				"hangflag": "",
				"subject": "",
				"delegation": "",
				"expenseitem": "",
				"expenseitem_code": "",
				"expenseitem_name": "",
				"_status": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 供应商退款单ID |
| accentity | string | 否 | 会计主体id |
| accentity_code | string | 否 | 会计主体编码 |
| accentity_name | string | 否 | 会计主体名称 |
| vouchdate | string | 否 | 单据日期 |
| code | string | 否 | 单据编号 |
| supplier | string | 否 | 供应商id |
| supplier_code | string | 否 | 供应商编码 |
| supplier_name | string | 否 | 供应商名称 |
| supplier_retailInvestors | string | 否 | 供应商是否散户 |
| settlemode | string | 否 | 结算方式id |
| settlemode_code | string | 否 | 结算方式编码 |
| settlemode_name | string | 否 | 结算方式名称 |
| period | string | 否 | 会计期间id |
| period_code | string | 否 | 会计期间 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| retailer | string | 否 | 散户 |
| enterprisebankaccount | string | 否 | 收款银行账户id |
| enterprisebankaccount_code | string | 否 | 收款银行账户编码 |
| enterprisebankaccount_name | string | 否 | 收款银行账户名称 |
| cashaccount | string | 否 | 收款现金账户id |
| cashaccount_code | string | 否 | 收款现金账户编码 |
| cashaccount_name | string | 否 | 收款现金账户名称 |
| natCurrency | string | 否 | 本币币种id |
| tradetype | string | 否 | 交易类型id |
| tradetype_name | string | 否 | 交易类型名称 |
| natCurrency_name | string | 否 | 本币币种名称 |
| tradetype_code | string | 否 | 交易类型编码 |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| natCurrency_priceDigit | string | 否 | 本币币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币币种金额精度 |
| exchangeRateType_digit | string | 否 | 汇率精度 |
| exchangeRateType_name | string | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 汇率类型id |
| exchRate | int | 否 | 汇率 |
| exchangeRateType_code | string | 否 | 汇率类型编码 |
| oriSum | double | 否 | 收款金额 |
| natSum | double | 否 | 本币金额 |
| balance | double | 否 | 余额 |
| org | string | 否 | 采购组织id |
| org_code | string | 否 | 采购组织编码 |
| org_name | string | 否 | 采购组织名称 |
| dept | string | 否 | 部门id |
| dept_code | string | 否 | 部门编码 |
| dept_name | string | 否 | 部门名称 |
| operator | string | 否 | 业务员id |
| operator_code | string | 否 | 业务员编码 |
| operator_name | string | 否 | 业务员名称 |
| orderno | string | 否 | 订单编号 |
| customerbankname | string | 否 | 付款银行名称 |
| supplierbankaccount | string | 否 | 付款银行账户id |
| supplierbankaccount_accountname | string | 否 | 付款银行账户 |
| invoiceno | string | 否 | 票据号 |
| project | string | 否 | 项目id |
| project_code | string | 否 | 项目编码 |
| project_name | string | 否 | 项目名称 |
| description | string | 否 | 备注 |
| auditstatus | string | 否 | 审批状态, 1:已审批、2:未审批、 |
| writeoffstatus | string | 否 | 核销状态, 1:已核销、2:未核销、3:部分核销、 |
| voucherstatus | string | 否 | 凭证状态, 3:已接收未生成、4:不生成、1:已生成、2:未生成、 |
| localbalance | double | 否 | 本币余额 |
| srcitem | string | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| srcbillid | string | 否 | 来源单据id |
| busiaccbook | string | 否 | 业务账簿id |
| busiaccbook_name | string | 否 | 业务账簿名称 |
| accpurpose | string | 否 | 核算目的id |
| accpurpose_name | string | 否 | 核算目的名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| billtype | string | 否 | 收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| basebilltype | string | 否 | 事项类型id |
| basebilltype_name | string | 否 | 事项类型名称 |
| supplierbankname | string | 否 | 收款银行名称 |
| signer | string | 否 | 签字人id |
| signer_name | string | 否 | 签字人名称 |
| signdate | string | 否 | 签字日期 |
| caobject | string | 否 | 收付款对象类型, 4:其他、1:客户、2:供应商、3:人员、 |
| employee | string | 否 | 员工id |
| employee_name | string | 否 | 员工名称 |
| redflag | string | 否 | 是否红冲, true:是、false:否、 |
| initflag | string | 否 | 期初标志, true:是、false:否、 |
| srctypeflag | string | 否 | 来源类型标识 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| auditDate | string | 否 | 审批日期 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ReceiveBill_b | object | 是 | 供应商退款单子表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"accentity": "",
		"accentity_code": "",
		"accentity_name": "",
		"vouchdate": "",
		"code": "",
		"supplier": "",
		"supplier_code": "",
		"supplier_name": "",
		"supplier_retailInvestors": "",
		"settlemode": "",
		"settlemode_code": "",
		"settlemode_name": "",
		"period": "",
		"period_code": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"retailer": "",
		"enterprisebankaccount": "",
		"enterprisebankaccount_code": "",
		"enterprisebankaccount_name": "",
		"cashaccount": "",
		"cashaccount_code": "",
		"cashaccount_name": "",
		"natCurrency": "",
		"tradetype": "",
		"tradetype_name": "",
		"natCurrency_name": "",
		"tradetype_code": "",
		"currency": "",
		"currency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"exchangeRateType_digit": "",
		"exchangeRateType_name": "",
		"exchangeRateType": "",
		"exchRate": 0,
		"exchangeRateType_code": "",
		"oriSum": 0,
		"natSum": 0,
		"balance": 0,
		"org": "",
		"org_code": "",
		"org_name": "",
		"dept": "",
		"dept_code": "",
		"dept_name": "",
		"operator": "",
		"operator_code": "",
		"operator_name": "",
		"orderno": "",
		"customerbankname": "",
		"supplierbankaccount": "",
		"supplierbankaccount_accountname": "",
		"invoiceno": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"description": "",
		"auditstatus": "",
		"writeoffstatus": "",
		"voucherstatus": "",
		"localbalance": 0,
		"srcitem": "",
		"srcbillid": "",
		"busiaccbook": "",
		"busiaccbook_name": "",
		"accpurpose": "",
		"accpurpose_name": "",
		"store": "",
		"store_name": "",
		"billtype": "",
		"basebilltype": "",
		"basebilltype_name": "",
		"supplierbankname": "",
		"signer": "",
		"signer_name": "",
		"signdate": "",
		"caobject": "",
		"employee": "",
		"employee_name": "",
		"redflag": "",
		"initflag": "",
		"srctypeflag": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"pubts": "",
		"status": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"ReceiveBill_b": [
			{
				"mainid": "",
				"quickType": "",
				"oriSum": 0,
				"natSum": 0,
				"supplier_code": "",
				"supplier": "",
				"supplier_name": "",
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
				"description": "",
				"balance": 0,
				"localbalance": 0,
				"srcbilltype": "",
				"srcbillno": "",
				"srcbillitemno": "",
				"srcbillitemid": "",
				"topsrcbillno": "",
				"topsrcbillitemno": "",
				"id": "",
				"pubts": "",
				"hangflag": "",
				"subject": "",
				"delegation": "",
				"expenseitem": "",
				"expenseitem_code": "",
				"expenseitem_name": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前会计期间已经结账,单据不能维护	单据在会计期间已经结账，不能退款保存


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

