---
title: "U9C结算回写费控单据API"
apiId: "1977709105706958855"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# U9C结算回写费控单据API

>  请求方式	POST | Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/u9c/settle/back
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
parent	object	否	否	付款结算单表头
dcostdate	string	否	否	发生日期 示例：2023-04-03 00:00:00
code	string	否	否	单据编号 示例：TERD2304032771
cfinacecostcenter	string	否	否	费用承担成本中心
pk_billtype	string	否	否	单据类型 示例：znbzbx_travelexpbill
bustype	string	否	否	交易类型 示例：1559599777714798597
creatorId	string	否	否	创建人 示例：283041
expensebilluserdefs!define2	string	否	否	自定义项2
vmemo	string	否	否	备注
vreason	string	否	否	说明 示例：报销差旅费
id	string	否	否	单据主键 示例：1694765576802533432
createDate	string	否	否	创建日期 示例：2023-04-03 00:00:00
caccountorg	string	否	否	会计主体 示例：ab756309feca4c708af760ca14b34a91
vdef1	string	否	否	自定义项1 示例：18601096090
define7	string	否	否	主表用户自定义项7
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期 示例：2023-04-03 00:00:00
pk_org	string	否	否	付款财务组织
bill_date	string	否	否	单据日期
memo	string	否	否	备注
pk_upbill	string	否	否	上游单据主键
up_billno	string	否	否	上游单据编号
up_tradetype	string	否	否	上游单据交易类型
up_billtype	string	否	否	上游单据单据大类
billmaker_date	string	否	否	制单日期
billmaker	string	否	否	制单人
def1	string	否	否	自定义项1
creator	string	否	否	创建人 示例：张三
sign	string	否	否	签名
def21	string	否	否	自定义项21
olcratedate	string	否	否	汇率日期
tradeTypeCode	string	否	否	交易类型编码
children	object	是	否	付款结算单表体
pk_enterprisebankacct	string	否	否	付款银行账户 示例：1561479667718815852
id	string	否	否	结算明细单据 示例：1694765576802533432
cfinacecostcenter	string	否	否	成本中心
centerpriseorg	string	否	否	支付组织 示例：ab756309feca4c708af760ca14b34a91
pk_enterprisecashacct	string	否	否	企业现金账户PK
nnatexchrate	string	否	否	本币汇率 示例：1
accttype	string	否	否	账号类型 示例：BAT00004
vmemo	string	否	否	报账事由
vfinacedeptid	string	否	否	部门 示例：2789581324341504
pk_cusdoc	string	否	否	供应商
nlineno	string	否	否	行号 示例：10
pk_customerbank	string	否	否	收款客户银行账户
vnatexchratetype	string	否	否	组织本币汇率类型 示例：qyic8c7o
vreason	string	否	否	说明 示例：报销差旅费
igathertype	string	否	否	收款类型 示例：0
createTime	string	否	否	创建日期 示例：2023-04-03 12:38:03
pk_cusdocbank	string	否	否	收款供应商银行账户
cfinaceorg	string	否	否	业务组织 示例：ab756309feca4c708af760ca14b34a91
vsettlecurrency	string	否	否	结算币种 示例：G001ZM0000DEFAULTCURRENCT00000000001
pk_handlepsn	string	否	否	报销人 示例：df12607ea5d445be897582695bf80da7
pk_balatype	string	否	否	结算方式 示例：1564291625767665679
pk_upperbill	string	否	否	上层来源单据ID
nsettlesummny	string	否	否	期望付款金额 示例：90
pk_busimemo	string	否	否	费用项目 示例：1560605659051327556
vbankaccname	string	否	否	收款方户名 示例：张三
pk_billtype	string	否	否	上层来源单据类型 示例：znbzbx_travelexpbill
pk_customer	string	否	否	客户
creatorId	string	否	否	创建人 示例：283041
pk_handlepsnbank	string	否	否	收款个人银行账户 示例：2983793813377288
vbankdocname	string	否	否	开户行名称 示例：招商银行报销支行
ReturnBillUserdefVO.define1	string	否	否	友费控-NC
vbankaccount	string	否	否	收款方账号 示例：6214830139344237
vdef1	string	否	否	自定义 示例：18601096090
dexpectpaydate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	期望结算日期
pk_bankdoc	string	否	否	开户行pk 示例：1001A110000000001CEJ
pk_handlepsn_name	string	否	否	报销人名称 示例：张三
memo	string	否	否	摘要
pk_currtype	string	否	否	币种
pk_org	string	否	否	财务组织
pk_oppaccount	string	否	否	付方银行账号
mon_account	string	否	否	现金账户
pay_primal	string	否	否	付款原币金额
local_rate	string	否	否	组织本币汇率
pay_local	string	否	否	付款组织本币金额
objecttype	string	否	否	交易对象类型
accounttype	string	否	否	收款账户性质
pk_supplier	string	否	否	供应商
accountname	string	否	否	收款账户户名
pk_account	string	否	否	收款银行账户
pk_recproject	string	否	否	收支项目
pk_dept	string	否	否	部门
pk_busiman	string	否	否	业务员
pk_busiorg	string	否	否	业务组织
pk_upperbill_detail	string	否	否	上层来源单据行ID
creator	string	否	否	创建人 示例：张三
creationtime	string	否	否	创建时间
pk_customerAccount	string	否	否	收款客户银行账户
pk_supplierAccount	string	否	否	收款供应商银行账户
pk_busimanAccount	string	否	否	收款个人银行账户
accountcode	string	否	否	收款银行账户编码
accountopenbank	string	否	否	收款银行名称
olcratetype	string	否	否	组织汇率类型
olcratedate	string	否	否	汇率日期

## 3. 请求示例

Url: /yonbip/znbz/u9c/settle/back?access_token=访问令牌
Body: [{
	"parent": {
		"dcostdate": "2023-04-03 00:00:00",
		"code": "TERD2304032771",
		"cfinacecostcenter": "",
		"pk_billtype": "znbzbx_travelexpbill",
		"bustype": "1559599777714798597",
		"creatorId": "283041",
		"expensebilluserdefs!define2": "",
		"vmemo": "",
		"vreason": "报销差旅费",
		"id": "1694765576802533432",
		"createDate": "2023-04-03 00:00:00",
		"caccountorg": "ab756309feca4c708af760ca14b34a91",
		"vdef1": "18601096090",
		"define7": "",
		"vouchdate": "2023-04-03 00:00:00",
		"pk_org": "",
		"bill_date": "",
		"memo": "",
		"pk_upbill": "",
		"up_billno": "",
		"up_tradetype": "",
		"up_billtype": "",
		"billmaker_date": "",
		"billmaker": "",
		"def1": "",
		"creator": "张三",
		"sign": "",
		"def21": "",
		"olcratedate": "",
		"tradeTypeCode": ""
	},
	"children": [
		{
			"pk_enterprisebankacct": "1561479667718815852",
			"id": "1694765576802533432",
			"cfinacecostcenter": "",
			"centerpriseorg": "ab756309feca4c708af760ca14b34a91",
			"pk_enterprisecashacct": "",
			"nnatexchrate": "1",
			"accttype": "BAT00004",
			"vmemo": "",
			"vfinacedeptid": "2789581324341504",
			"pk_cusdoc": "",
			"nlineno": "10",
			"pk_customerbank": "",
			"vnatexchratetype": "qyic8c7o",
			"vreason": "报销差旅费",
			"igathertype": "0",
			"createTime": "2023-04-03 12:38:03",
			"pk_cusdocbank": "",
			"cfinaceorg": "ab756309feca4c708af760ca14b34a91",
			"vsettlecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"pk_handlepsn": "df12607ea5d445be897582695bf80da7",
			"pk_balatype": "1564291625767665679",
			"pk_upperbill": "",
			"nsettlesummny": "90",
			"pk_busimemo": "1560605659051327556",
			"vbankaccname": "张三",
			"pk_billtype": "znbzbx_travelexpbill",
			"pk_customer": "",
			"creatorId": "283041",
			"pk_handlepsnbank": "2983793813377288",
			"vbankdocname": "招商银行报销支行",
			"ReturnBillUserdefVO.define1": "",
			"vbankaccount": "6214830139344237",
			"vdef1": "18601096090",
			"dexpectpaydate": "2026-06-07 12:50:58",
			"pk_bankdoc": "1001A110000000001CEJ",
			"pk_handlepsn_name": "张三",
			"memo": "",
			"pk_currtype": "",
			"pk_org": "",
			"pk_oppaccount": "",
			"mon_account": "",
			"pay_primal": "",
			"local_rate": "",
			"pay_local": "",
			"objecttype": "",
			"accounttype": "",
			"pk_supplier": "",
			"accountname": "",
			"pk_account": "",
			"pk_recproject": "",
			"pk_dept": "",
			"pk_busiman": "",
			"pk_busiorg": "",
			"pk_upperbill_detail": "",
			"creator": "张三",
			"creationtime": "",
			"pk_customerAccount": "",
			"pk_supplierAccount": "",
			"pk_busimanAccount": "",
			"accountcode": "",
			"accountopenbank": "",
			"olcratetype": "",
			"olcratedate": ""
		}
	]
}]

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
data	object	否	业务数据体
code	string	否	业务状态码 示例：2000
message	string	否	业务返回信息
data	object	否	详细业务数据返回，部分成功场景使用，此接口不支持
displayCode	string	否	异常码
message	string	否	返回信息 示例：操作成功
code	string	否	返回状态 示例：200

## 5. 正确返回示例

{
	"data": {
		"code": "2000",
		"message": "",
		"data": {
			"count": 5,
			"successCount": 1,
			"failCount": 4,
			"messages": [
				{
					"sourceUnique": "",
					"message": ""
				}
			],
			"infos": [
				{
					"data": {
						"sourceUnique": "",
						"targetUnique": ""
					}
				}
			]
		}
	},
	"displayCode": "",
	"message": "操作成功",
	"code": "200"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	请联系系统管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
更新
请求说明
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

