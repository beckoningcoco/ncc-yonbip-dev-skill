---
title: "薪资支付工作台单据保存"
apiId: "1526396527803629571"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "薪资支付工作台"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 薪资支付工作台]
platform_version: "BIP"
source_type: community-api-docs
---

# 薪资支付工作台单据保存

>  请求方式	POST | 薪资支付工作台 (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/salarypay/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	薪资支付工作台主表[cmp.payapplicationbill.PayApplicationBill]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	薪资支付单ID 新增时无需填写，修改时必填 示例：1529184373900836871
accentity_code	string	否	是	资金组织ID,或资金组织code 示例：2163953039315200
accentityRaw_code	string	否	否	核算会计主体ID,或核算会计主体code
code	string	否	否	单据编号 示例：CTM00210708000001
vouchdate	string	否	是	单据日期 示例：2021-07-08 00:00:00
tradetype_code	string	否	是	交易类型id,或交易类型code 示例：2284477806645504
settlemode_code	string	否	否	结算方式id,或结算方式编码code 示例：system_0001
currency_code	string	否	是	付款币种id,或付款币种code,或付款币种name 示例：CNY
exchangeRateType_code	string	否	是	汇率类型id,或汇率类型code 示例：01
org_code	string	否	否	业务组织id,或业务组织code 示例：110
dept_code	string	否	否	部门id,或部门code 示例：1212
project_code	string	否	否	项目id,或项目code 示例：1112
expenseitem_code	string	否	否	费用项目id,或费用项目code 示例：12121
payBankAccount_code	string	否	是	付款银行账户ID,或付款银行账户code,或付款银行账号 示例：2163968715100928
oriSum	double	否	是	付款金额 示例：666
exchRate	double	否	是	汇率 示例：1
numline	int	否	是	付款总笔数 示例：1
summary	string	否	否	摘要
purpose	string	否	否	用途
otherbankflag	string	否	否	收方跨行标识("0": "本行", "1": "跨行") 示例：1
headItem	object	否	否	表头固定自定义项
_status	string	否	是	操作标识, Insert:新增、 Update:更新 示例：Insert
defines	object	否	否	表头自由自定义项
Salarypay_b	object	是	是	薪资支付工作台子表[cmp.salarypay.Salarypay_b]

## 3. 请求示例

Url: /yonbip/ctm/salarypay/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1529184373900836871,
		"accentity_code": "2163953039315200",
		"accentityRaw_code": "",
		"code": "CTM00210708000001",
		"vouchdate": "2021-07-08 00:00:00",
		"tradetype_code": "2284477806645504",
		"settlemode_code": "system_0001",
		"currency_code": "CNY",
		"exchangeRateType_code": "01",
		"org_code": "110",
		"dept_code": "1212",
		"project_code": "1112",
		"expenseitem_code": "12121",
		"payBankAccount_code": "2163968715100928",
		"oriSum": 666,
		"exchRate": 1,
		"numline": 1,
		"summary": "",
		"purpose": "",
		"otherbankflag": "1",
		"headItem": {
			"define1": "",
			"define2": "",
			"id": ""
		},
		"_status": "Insert",
		"defines": {
			"id": "2763855623180544",
			"define1": "c_name",
			"define2": "c_orisum"
		},
		"Salarypay_b": [
			{
				"id": 2763855623180545,
				"showpersonnum": "A10001",
				"identitytype": "01",
				"identitynum": "142225199303090098",
				"crtacc": "98452013",
				"crtaccname": "王克",
				"crtcombine": "",
				"crtbank": "中国银行",
				"postscript": "工资",
				"salarydetail": "",
				"tradestatus": "1",
				"amount": 666,
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"_status": "Insert",
				"defines": {
					"id": "2763855623180545",
					"define1": "example01",
					"define2": "example02"
				}
			}
		]
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	调用成功时的返回数据
accentity	string	否	会计主体 示例：2163953039315200
natCurrency	string	否	本币币种 示例：2163654411424512
vouchdate	string	否	单据日期 示例：2022-08-22 00:00:00
tradetype	string	否	交易类型 示例：2284477806645504
currency	string	否	币种 示例：2163654411424512
exchangeRateType	string	否	汇率类型id或编号 示例：jrig9o3z
payBankAccount	string	否	付款银行账户 示例：2163968715100928
oriSum	double	否	付款金额 示例：666
exchRate	double	否	汇率 示例：1
natSum	string	否	本币金额 示例：666
numline	int	否	付款总笔数 示例：1
srcitem	int	否	来源事项(9：导入) 示例：9
billtype	int	否	单据类型(15:薪资支付单) 示例：15
Salarypay_b	object	是	薪资支付单子表
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
auditstatus	short	否	审批状态（1:审批;2:未审批） 示例：2
paystatus	short	否	支付状态(0:待支付;1:预下单成功;2:预下单失败;3:支付成功;4:支付失败;5:支付中;6:支付不明;7:线下支付成功;8:部分成功;) 示例：0
settlestatus	short	否	结算状态(1:未结算;2:已结算;) 示例：1
voucherstatus	short	否	凭证状态(1:已生成;2:未生成;3:已接收未成功;4:不生成;5:过账中;6:过账成功;7:过账失败;8:不过账;) 示例：2
busitype	long	否	业务类型 示例：1
exchangeRateType_digit	double	否	汇率精度 示例：6
exchangeRateType_name	string	否	汇率类型 示例：基准汇率
payBankAccount_account	string	否	付款银行账号 示例：50011224043
signature	string	否	签名 示例：sAA25U1JpJPRgjKdvySXdwrO3IxUZa7K4B3i0bUAiqVZPctF7hAu0joaTHJFgdRW\nJlZ4uY6Hk1COGIWPXgcjv1T2ZDZbdz1THrgE2k661qWokJl7hY09L9H9WKsioVa7\n82V1A/rBrT2ls6RPEQwgvZ08UCV4r1998vAul87RMKkIpiRVD6DDtSRvRhwk9Nds\n6l6u3TQ0aV7vQDmLuw8NIntqfdQ/zLV0ViS4JtV9/DvE8x1PDmAwRcX2lLss0PLM\nP2K9ShN/1EpbAtAe4/uuU8Hh7mjj7TL3mKwAzPbRd4uaPMrQ5W04g0KbsrlcJjV3\nKHwgwlLTcsfY2qxUhmNYmw==
id	long	否	主表ID 示例：1529184373900836870
code	string	否	单据编号 示例：SALDF220823000103
creatorId	long	否	创建人ID 示例：2163654054252800
creator	string	否	创建人 示例：默认用户
createTime	string	否	创建时间 示例：2022-08-23 10:08:11
createDate	string	否	创建日期 示例：2022-08-23 10:08:11
status	short	否	单据状态(1:开立;2:审核;3:结算) 示例：1
isWfControlled	boolean	否	是否审批流控制 示例：false
pubts	string	否	时间戳 示例：2022-08-23 10:08:12
tenant	long	否	租户ID 示例：2163654053351680
yTenantId	string	否	租户 示例：jrig9o3z

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "2163953039315200",
		"natCurrency": "2163654411424512",
		"vouchdate": "2022-08-22 00:00:00",
		"tradetype": "2284477806645504",
		"currency": "2163654411424512",
		"exchangeRateType": "jrig9o3z",
		"payBankAccount": "2163968715100928",
		"oriSum": 666,
		"exchRate": 1,
		"natSum": "666",
		"numline": 1,
		"srcitem": 9,
		"billtype": 15,
		"Salarypay_b": [
			{
				"showpersonnum": "A0000012",
				"identitytype": "01",
				"identitynum": "142225199303090098",
				"crtacc": "98452013",
				"crtaccname": "王克",
				"amount": 666,
				"tradestatus": 1,
				"id": 1529184373900836871,
				"mainid": 1529184373900836870,
				"pubts": "2022-08-23 10:08:11",
				"yTenantId": "jrig9o3z"
			}
		],
		"resubmitCheckKey": "OPENAPI_1526396527803629571_jrig9o3z_112",
		"auditstatus": 2,
		"paystatus": 0,
		"settlestatus": 1,
		"voucherstatus": 2,
		"busitype": 1,
		"exchangeRateType_digit": 6,
		"exchangeRateType_name": "基准汇率",
		"payBankAccount_account": "50011224043",
		"signature": "sAA25U1JpJPRgjKdvySXdwrO3IxUZa7K4B3i0bUAiqVZPctF7hAu0joaTHJFgdRW\\nJlZ4uY6Hk1COGIWPXgcjv1T2ZDZbdz1THrgE2k661qWokJl7hY09L9H9WKsioVa7\\n82V1A/rBrT2ls6RPEQwgvZ08UCV4r1998vAul87RMKkIpiRVD6DDtSRvRhwk9Nds\\n6l6u3TQ0aV7vQDmLuw8NIntqfdQ/zLV0ViS4JtV9/DvE8x1PDmAwRcX2lLss0PLM\\nP2K9ShN/1EpbAtAe4/uuU8Hh7mjj7TL3mKwAzPbRd4uaPMrQ5W04g0KbsrlcJjV3\\nKHwgwlLTcsfY2qxUhmNYmw==",
		"id": 1529184373900836870,
		"code": "SALDF220823000103",
		"creatorId": 2163654054252800,
		"creator": "默认用户",
		"createTime": "2022-08-23 10:08:11",
		"createDate": "2022-08-23 10:08:11",
		"status": 1,
		"isWfControlled": false,
		"pubts": "2022-08-23 10:08:12",
		"tenant": 2163654053351680,
		"yTenantId": "jrig9o3z"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	付款申请金额不能小于等于0	调整付款申请金额大于0

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

