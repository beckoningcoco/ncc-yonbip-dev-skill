---
title: "收款保存"
apiId: "11dc3ea1aaf74641b9872625450d3ce4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款保存

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/receivebill/save

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
| data | object | 是 | 是 | 收款单信息 |
| id | string | 否 | 否 | 收款单id, 新增时无需填写，修改时必填 |
| code | string | 否 | 是 | 单据编号 |
| accentity_code | string | 否 | 是 | 会计主体编码 |
| accentity_name | string | 否 | 否 | 会计主体名称 |
| vouchdate | string | 否 | 是 | 单据日期, 格式为:yyyy-MM-dd HH:mm:ss |
| customer | string | 否 | 否 | 客户id，客户id和客户编码不能同时为空，id和编码同时存在，以id为准 |
| customer_code | string | 否 | 否 | 客户编码，客户id和客户编码不能同时为空，id和编码同时存在，以id为准 |
| customer_name | string | 否 | 否 | 客户名称 |
| customer_retailInvestors | boolean | 否 | 否 | 客户是否散户，true:是、false:否 |
| customerbankaccount | string | 否 | 否 | 付款银行账户id |
| customerbankaccount_bankAccountName | string | 否 | 否 | 付款银行账户 |
| settlemode_code | string | 否 | 否 | 结算方式编码 |
| settlemode | string | 否 | 否 | 结算方式id |
| settlemode_name | string | 否 | 否 | 结算方式名称 |
| period_code | string | 否 | 否 | 会计期间 |
| retailer | string | 否 | 否 | 散户 |
| enterprisebankaccount_code | string | 否 | 否 | 收款银行账户编码 |
| enterprisebankaccount | string | 否 | 否 | 收款银行账户id |
| enterprisebankaccount_name | string | 否 | 否 | 收款银行账户名称 |
| cashaccount_code | string | 否 | 否 | 收款现金账户编码 |
| cashaccount | string | 否 | 否 | 收款现金账户id |
| cashaccount_name | string | 否 | 否 | 收款现金账户名称 |
| tradetype | string | 否 | 是 | 交易类型id |
| tradetype_name | string | 否 | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 否 | 交易类型编码 |
| currency | string | 否 | 是 | 币种id |
| currency_name | string | 否 | 否 | 币种名称 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| natCurrency_name | string | 否 | 否 | 本币币种名称 |
| natCurrency_priceDigit | string | 否 | 否 | 本币币种单价精度 |
| exchangeRateType_digit | string | 否 | 是 | 汇率精度 |
| exchangeRateType_name | string | 否 | 否 | 汇率类型名称 |
| exchangeRateType | string | 否 | 是 | 汇率类型id |
| exchangeRateType_code | string | 否 | 是 | 汇率类型编码 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币币种金额精度 |
| exchRate | int | 否 | 是 | 汇率 |
| oriSum | double | 否 | 是 | 收款金额 |
| natSum | double | 否 | 是 | 本币金额 |
| balance | double | 否 | 否 | 余额 |
| org_code | string | 否 | 否 | 销售组织编码 |
| bookAmount | int | 否 | 否 | 预占用金额 |
| org_name | string | 否 | 否 | 销售组织名称 |
| dept_code | string | 否 | 否 | 部门编码 |
| dept_name | string | 否 | 否 | 部门名称 |
| operator_code | string | 否 | 否 | 业务员编码 |
| operator_name | string | 否 | 否 | 业务员名称 |
| orderno | string | 否 | 否 | 订单编号 |
| customerbankname | string | 否 | 否 | 付款银行名称 |
| invoiceno | string | 否 | 否 | 票据号 |
| project_code | string | 否 | 否 | 项目编码 |
| project_name | string | 否 | 否 | 项目名称 |
| description | string | 否 | 否 | 备注 |
| localbalance | double | 否 | 否 | 本币余额 |
| srcitem | int | 否 | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方。调用时无需输入值，系统自动产生 |
| srcbillid | string | 否 | 否 | 来源单据id ，接口不支持关联来源单据，不建议传值。 |
| busiaccbook_name | string | 否 | 否 | 业务账簿名称 |
| accpurpose | string | 否 | 否 | 核算目的id |
| accpurpose_name | string | 否 | 否 | 核算目的名称 |
| store | string | 否 | 否 | 门店id |
| store_name | string | 否 | 否 | 门店名称 |
| basebilltype_name | string | 否 | 否 | 事项类型名称 |
| billtype | string | 否 | 否 | 收付事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| supplierbankname | string | 否 | 否 | 收款银行名称 |
| signer | string | 否 | 否 | 签字人id |
| signer_name | string | 否 | 否 | 签字人名称 |
| signdate | string | 否 | 否 | 签字日期,格式为:yyyy-MM-dd HH:mm:ss |
| caobject | int | 否 | 否 | 收付款对象类型,1:客户 |
| srcflag | string | 否 | 否 | 来源标识 |
| supplier_name | string | 否 | 否 | 供应商名称 |
| srctypeflag | string | 否 | 否 | 来源类型标识 |
| employee_name | string | 否 | 否 | 员工名称 |
| redflag | string | 否 | 否 | 是否红冲, true:是、false:否 |
| creator | string | 否 | 否 | 创建人 |
| initflag | string | 否 | 否 | 期初标志, true:是、false:否、 |
| createTime | string | 否 | 否 | 创建时间, 格式为:yyyy-MM-dd HH:mm:ss |
| createDate | string | 否 | 否 | 创建日期, 格式为:yyyy-MM-dd HH:mm:ss |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间, 格式为:yyyy-MM-dd HH:mm:ss |
| modifyDate | string | 否 | 否 | 修改日期, 格式为:yyyy-MM-dd HH:mm:ss |
| auditor | string | 否 | 否 | 审批人 |
| auditTime | string | 否 | 否 | 审批时间, 格式为:yyyy-MM-dd HH:mm:ss |
| auditDate | string | 否 | 否 | 审批日期, 格式为:yyyy-MM-dd HH:mm:ss |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| ReceiveBill_b | object | 是 | 是 | 收款明细 |

## 3. 请求示例

Url: /yonbip/fi/receivebill/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"code": "",
			"accentity_code": "",
			"accentity_name": "",
			"vouchdate": "",
			"customer": "",
			"customer_code": "",
			"customer_name": "",
			"customer_retailInvestors": true,
			"customerbankaccount": "",
			"customerbankaccount_bankAccountName": "",
			"settlemode_code": "",
			"settlemode": "",
			"settlemode_name": "",
			"period_code": "",
			"retailer": "",
			"enterprisebankaccount_code": "",
			"enterprisebankaccount": "",
			"enterprisebankaccount_name": "",
			"cashaccount_code": "",
			"cashaccount": "",
			"cashaccount_name": "",
			"tradetype": "",
			"tradetype_name": "",
			"tradetype_code": "",
			"currency": "",
			"currency_name": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"natCurrency_name": "",
			"natCurrency_priceDigit": "",
			"exchangeRateType_digit": "",
			"exchangeRateType_name": "",
			"exchangeRateType": "",
			"exchangeRateType_code": "",
			"natCurrency_moneyDigit": "",
			"exchRate": 0,
			"oriSum": 0,
			"natSum": 0,
			"balance": 0,
			"org_code": "",
			"bookAmount": 0,
			"org_name": "",
			"dept_code": "",
			"dept_name": "",
			"operator_code": "",
			"operator_name": "",
			"orderno": "",
			"customerbankname": "",
			"invoiceno": "",
			"project_code": "",
			"project_name": "",
			"description": "",
			"localbalance": 0,
			"srcitem": 0,
			"srcbillid": "",
			"busiaccbook_name": "",
			"accpurpose": "",
			"accpurpose_name": "",
			"store": "",
			"store_name": "",
			"basebilltype_name": "",
			"billtype": "",
			"supplierbankname": "",
			"signer": "",
			"signer_name": "",
			"signdate": "",
			"caobject": 0,
			"srcflag": "",
			"supplier_name": "",
			"srctypeflag": "",
			"employee_name": "",
			"redflag": "",
			"creator": "",
			"initflag": "",
			"createTime": "",
			"createDate": "",
			"modifier": "",
			"modifyTime": "",
			"modifyDate": "",
			"auditor": "",
			"auditTime": "",
			"auditDate": "",
			"pubts": "",
			"_status": "",
			"ReceiveBill_b": [
				{
					"id": "",
					"mainid": "",
					"quickType": "",
					"quickType_code": "",
					"oriSum": 0,
					"natSum": 0,
					"balance": 0,
					"localbalance": 0,
					"material": "",
					"material_code": "",
					"bookAmount": 0,
					"customer": "",
					"customer_code": "",
					"customer_name": "",
					"dept_code": "",
					"org_code": "",
					"org": "",
					"org_name": "",
					"dept_name": "",
					"operator": "",
					"operator_code": "",
					"operator_name": "",
					"project": "",
					"project_code": "",
					"project_name": "",
					"orderno": "",
					"description": "",
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
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回收款单数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| failCountAI | string | 否 | 保存失败数 |
| successCountAI | string | 否 | 保存成功数 |
| count | string | 否 | 总数 |
| sucessCount | string | 否 | 保存成功数 |
| failCount | string | 否 | 保存失败数 |
| messages | string | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 单据信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"failCountAI": "",
		"successCountAI": "",
		"count": "",
		"sucessCount": "",
		"failCount": "",
		"messages": [
			""
		],
		"infos": [
			{
				"id": "",
				"accentity": "",
				"accentity_code": "",
				"accentity_name": "",
				"vouchdate": "",
				"code": "",
				"customer": "",
				"customer_code": "",
				"customer_name": "",
				"customer_retailInvestors": "",
				"customerbankaccount": "",
				"customerbankaccount_bankAccountName": "",
				"natMoney": 0,
				"oriMoney": 0,
				"checkBillCode": true,
				"basebilltypecode": "",
				"basebilltype_code": "",
				"creatorId": "",
				"cmpflag": true,
				"paytype": 0,
				"tenant": "",
				"settlemode_code": "",
				"settlemode": "",
				"settlemode_name": "",
				"period": "",
				"period_code": "",
				"retailer": "",
				"enterprisebankaccount_code": "",
				"enterprisebankaccount": "",
				"enterprisebankaccount_name": "",
				"cashaccount_code": "",
				"cashaccount": "",
				"cashaccount_name": "",
				"tradetype": "",
				"tradetype_name": "",
				"tradetype_code": "",
				"currency": "",
				"currency_name": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"exchangeRateType_digit": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"exchangeRateType_code": "",
				"natCurrency_moneyDigit": "",
				"exchRate": 0,
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"org_code": "",
				"org": "",
				"bookAmount": 0,
				"org_name": "",
				"dept_code": "",
				"dept": "",
				"dept_name": "",
				"operator_code": "",
				"operator": "",
				"operator_name": "",
				"orderno": "",
				"customerbankname": "",
				"settlestatus": 0,
				"invoiceno": "",
				"project_code": "",
				"project": "",
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
				"basebilltype": "",
				"basebilltype_name": "",
				"billtype": "",
				"supplierbankname": "",
				"signer": "",
				"signer_name": "",
				"signdate": "",
				"caobject": "",
				"srcflag": "",
				"supplier": "",
				"supplier_name": "",
				"srctypeflag": "",
				"employee": "",
				"employee_name": "",
				"redflag": true,
				"creator": "",
				"initflag": true,
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"pubts": "",
				"status": 0,
				"ReceiveBill_b": [
					{
						"mainid": "",
						"quickTypeCode": "",
						"quickType_code": "",
						"quickType": "",
						"oriSum": 0,
						"natSum": 0,
						"balance": 0,
						"localbalance": 0,
						"bookAmount": 0,
						"customer": "",
						"customer_code": "",
						"customer_name": "",
						"dept": "",
						"dept_code": "",
						"dept_name": "",
						"org_code": "",
						"org": "",
						"org_name": "",
						"operator": "",
						"operator_code": "",
						"operator_name": "",
						"project": "",
						"project_code": "",
						"project_name": "",
						"orderno": "",
						"description": "",
						"srcbilltype": "",
						"srcbillno": "",
						"srcbillitemno": "",
						"srcbillitemid": "",
						"topsrcbillno": "",
						"topsrcbillitemno": "",
						"id": "",
						"pubts": "",
						"hangflag": true,
						"subject": "",
						"delegation": "",
						"expenseitem": "",
						"expenseitem_code": "",
						"expenseitem_name": ""
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	银行账户和现金账户不能同时有值	cashaccount_code和enterprisebankaccount_code只能一个字段赋值


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

