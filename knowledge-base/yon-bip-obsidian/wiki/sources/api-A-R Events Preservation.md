---
title: "应收事项保存"
apiId: "567a72085f074ab798eb102b87fc5d3f"
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

# 应收事项保存

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/oar/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 应收事项信息 |
| id | string | 否 | 否 | 应收事项主表id，新增时不填，修改时必填 |
| accentity_name | string | 否 | 否 | 会计主体名称 |
| code | string | 否 | 是 | 单据编号，自动编码时新增可不填，修改时必填 |
| accentity_code | string | 否 | 是 | 会计主体编码 |
| vouchdate | string | 否 | 是 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss |
| basebilltype_name | string | 否 | 否 | 事项类型名称 |
| billtype | string | 否 | 是 | 收付事项类型,固定为2, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| basebilltype_code | string | 否 | 是 | 事项类型编码 |
| billdirection | int | 否 | 否 | 单据方向, 1:红字、2:蓝字、 |
| receiveprotocol_code | string | 否 | 否 | 收款协议编码 |
| accountrule_name | string | 否 | 否 | 立账规则名称 |
| receiveprotocol_name | string | 否 | 否 | 收款协议名称 |
| tradetype_name | string | 否 | 否 | 交易类型名称 |
| tradetype_code | string | 否 | 是 | 交易类型编码 |
| currency_priceDigit | string | 否 | 否 | 币种单价精度 |
| accountdate | string | 否 | 否 | 立账日期,格式为:yyyy-MM-dd HH:mm:ss |
| customer | string | 否 | 否 | 客户id，客户id和客户编码不能同时为空，id和编码同时存在，以id为准 |
| customer_code | string | 否 | 否 | 客户编码，客户id和客户编码不能同时为空，id和编码同时存在，以id为准 |
| customer_name | string | 否 | 否 | 客户名称 |
| customer_retailInvestors | boolean | 否 | 否 | 客户是否散户 |
| exchangeRateType_digit | string | 否 | 否 | 汇率精度 |
| exchRate | Decimal | 否 | 是 | 汇率 |
| exchangeRateType_name | string | 否 | 否 | 汇率类型名称 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型编码 |
| maturitydate | string | 否 | 否 | 到期日,格式为:yyyy-MM-dd HH:mm:ss |
| currency | string | 否 | 否 | 币种id，currency和currency_name二选一必填 |
| currency_name | string | 否 | 否 | 币种名称，currency和currency_name二选一必填 |
| natCurrency_name | string | 否 | 否 | 本币币种名称 |
| retailer | string | 否 | 否 | 散户 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币币种金额精度 |
| currency_moneyDigit | string | 否 | 否 | 币种金额精度 |
| natCurrency_priceDigit | string | 否 | 否 | 本币币种单价精度 |
| org | string | 否 | 否 | 销售组织id |
| org_code | string | 否 | 否 | 销售组织编码 |
| org_name | string | 否 | 否 | 销售组织名称 |
| project_code | string | 否 | 否 | 项目编码 |
| project_name | string | 否 | 否 | 项目名称 |
| dept_code | string | 否 | 否 | 部门编码 |
| dept_name | string | 否 | 否 | 部门名称 |
| oriSum | double | 否 | 是 | 金额 |
| invoicetype | string | 否 | 否 | 发票类型, 1:增值税电子普通发票、2:增值税普通发票、3:增值税专用发票、4:账单、6:机动车销售统一发票、5:收据、 |
| operator | string | 否 | 否 | 业务员id |
| operator_code | string | 否 | 否 | 业务员编码 |
| operator_name | string | 否 | 否 | 业务员名称 |
| natSum | double | 否 | 是 | 本币金额 |
| invoiceno | string | 否 | 否 | 发票号 |
| orderno | string | 否 | 否 | 订单编号 |
| description | string | 否 | 否 | 备注 |
| srcitem | int | 否 | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| balance | double | 否 | 否 | 余额 |
| provisionalestimateflag | string | 否 | 否 | 是否暂估, true:是、false:否、 |
| localbalance | double | 否 | 否 | 本币余额 |
| caobject | string | 否 | 否 | 收款对象, 1:客户 |
| redflag | string | 否 | 否 | 是否红冲 |
| initflag | boolean | 否 | 否 | 期初标志 |
| voucherno | string | 否 | 否 | 凭证号 |
| srcbillid | string | 否 | 否 | 来源单据id，接口不支持关联来源单据，不建议传值。 |
| accpurpose | string | 否 | 否 | 核算目的 |
| auditor | string | 否 | 否 | 审批人 |
| auditTime | string | 否 | 否 | 审批时间 |
| auditDate | string | 否 | 否 | 审批日期,格式为:yyyy-MM-dd HH:mm:ss |
| headItem | object | 是 | 否 | 表头固定自定义项（1-60） |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| oarDetail | object | 是 | 是 | 其他应收事项明细 |

## 3. 请求示例

Url: /yonbip/fi/oar/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"accentity_name": "",
			"code": "",
			"accentity_code": "",
			"vouchdate": "",
			"basebilltype_name": "",
			"billtype": "",
			"basebilltype_code": "",
			"billdirection": 0,
			"receiveprotocol_code": "",
			"accountrule_name": "",
			"receiveprotocol_name": "",
			"tradetype_name": "",
			"tradetype_code": "",
			"currency_priceDigit": "",
			"accountdate": "",
			"customer": "",
			"customer_code": "",
			"customer_name": "",
			"customer_retailInvestors": true,
			"exchangeRateType_digit": "",
			"exchRate": 0,
			"exchangeRateType_name": "",
			"exchangeRateType_code": "",
			"maturitydate": "",
			"currency": "",
			"currency_name": "",
			"natCurrency_name": "",
			"retailer": "",
			"natCurrency_moneyDigit": "",
			"currency_moneyDigit": "",
			"natCurrency_priceDigit": "",
			"org": "",
			"org_code": "",
			"org_name": "",
			"project_code": "",
			"project_name": "",
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
			"srcitem": 0,
			"balance": 0,
			"provisionalestimateflag": "",
			"localbalance": 0,
			"caobject": "",
			"redflag": "",
			"initflag": true,
			"voucherno": "",
			"srcbillid": "",
			"accpurpose": "",
			"auditor": "",
			"auditTime": "",
			"auditDate": "",
			"headItem": [
				{
					"id": "",
					"define1": "",
					"define2": ""
				}
			],
			"_status": "",
			"oarDetail": [
				{
					"mainid": "",
					"id": "",
					"expenseitem_code": "",
					"expenseitem_name": "",
					"material_code": "",
					"material_name": "",
					"unit_name": "",
					"unit_Precision": "",
					"qty": 0,
					"mainunit_name": "",
					"batchno": "",
					"oriUnitPrice": 0,
					"oriTaxUnitPrice": 0,
					"taxsubject_name": "",
					"taxRate": 0,
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
					"customer": "",
					"customer_code": "",
					"customer_name": "",
					"org_code": "",
					"org_name": "",
					"dept_code": "",
					"dept_name": "",
					"operator_code": "",
					"operator_name": "",
					"project_code": "",
					"project_name": "",
					"orderno": "",
					"receiveprotocol_code": "",
					"srcbillno": "",
					"receiveprotocol_name": "",
					"begindate": "",
					"description": "",
					"srcbillitemno": "",
					"srcbilltype": "",
					"topsrcbillno": "",
					"topsrcbillitemno": "",
					"pubts": "",
					"bodyItem": [
						{
							"id": "",
							"define1": "",
							"define2": ""
						}
					],
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
| data | object | 否 | 调用成功时的返回应收事项数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| successCountAI | int | 否 | 保存成功条数 |
| failCountAI | int | 否 | 保存失败条数 |
| count | int | 否 | 保存总条数 |
| sucessCount | string | 否 | 保存成功条数 |
| failCount | string | 否 | 保存失败条数 |
| messages | string | 是 | 提示消息 |
| infos | object | 是 | 返回值 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 0,
		"sucessCount": "",
		"failCount": "",
		"messages": [
			""
		],
		"infos": [
			{
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
				"exchRate": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"exchangeRateType_code": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"maturitydate": "",
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
				"invoicetype": "",
				"natSum": 0,
				"oriSum": 0,
				"operator": "",
				"operator_code": "",
				"operator_name": "",
				"invoiceno": "",
				"orderno": "",
				"description": "",
				"auditstatus": "",
				"voucherstatus": "",
				"writeoffstatus": "",
				"status": "",
				"srcitem": "",
				"provisionalestimateflag": "",
				"balance": "",
				"localbalance": "",
				"caobject": "",
				"redflag": "",
				"initflag": "",
				"voucherno": "",
				"srcbillid": "",
				"busiaccbook": "",
				"accpurpose": "",
				"creator": "",
				"createDate": "",
				"createTime": "",
				"modifier": "",
				"modifyDate": "",
				"modifyTime": "",
				"auditor": "",
				"auditDate": "",
				"auditTime": "",
				"oarDetail": [
					{
						"oarProtocol": [
							{
								"currency_moneyDigit": "",
								"begindate": "",
								"parentid": "",
								"whetherprereceive": "",
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
								"deposit": "",
								"receiveplanrow": "",
								"accountdate": ""
							}
						],
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
						"oriUnitPrice": "",
						"oriTaxUnitPrice": "",
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
						"natrebate": 0,
						"natSum": 0,
						"customer_code": "",
						"customer": "",
						"customer_name": "",
						"org": "",
						"org_code": "",
						"org_name": "",
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
						"srcbillno": "",
						"receiveprotocol": "",
						"receiveprotocol_code": "",
						"receiveprotocol_name": "",
						"srcbillitemid": "",
						"begindate": "",
						"description": "",
						"srcbillitemno": "",
						"topsrcbillno": "",
						"id": "",
						"topsrcbillitemno": "",
						"srcbilltype": "",
						"pubts": ""
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

