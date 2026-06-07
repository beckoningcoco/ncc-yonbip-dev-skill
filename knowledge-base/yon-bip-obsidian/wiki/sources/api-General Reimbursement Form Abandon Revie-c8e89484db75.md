---
title: "通用报销单弃审"
apiId: "c8e89484db75442f8ac9db9d5f60c0bc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用报销单弃审

>  请求方式	POST | General Expense Report (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/expensebill/unaudit
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
data	object	否	是	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	是	单据id 示例：2431516334969088
vdef1	string	否	否	表头自定义项1(支持vdef1-vdef10) 示例：自定义项测试1
userdefs	object	否	否	表头用户自定义项

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expensebill/unaudit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2431516334969088,
		"vdef1": "自定义项测试1",
		"userdefs": {
			"define1": "用户自定义项测试1"
		}
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
code	string	否	返回编码 示例：200
displayCode	string	否	异常码
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
verifystate	long	否	审批状态(0:待提交;1:审批完成;3:审批中) 示例：0
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
expsettleinfos	object	是	报销单结算信息
isettlestatus	long	否	结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0
id	long	否	单据ID 示例：2431516334969088
pubts	string	否	时间戳 示例：2021-09-17 17:03:03
status	long	否	单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"verifystate": 0,
		"resubmitCheckKey": "OPENAPI_c8e89484db75442f8ac9db9d5f60c0bc_xtikzjvp_324",
		"expsettleinfos": [
			{
				"vbankaccname": "光大户名123456789",
				"pk_currency_opp": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vbanktypename": "中国光大银行",
				"pk_enterprisebankacct": "2066497347195392",
				"pk_bankdoc": "2013860238217984",
				"vsettlecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsettlebaseexchrate": 1,
				"iaraptype": 0,
				"pk_expensebill": 2431516334969088,
				"nsettlesummny": 100,
				"vbankdocname": "银行网点",
				"ipaystartpoint": 1,
				"nlineno": 10,
				"isettlestatus": 0,
				"bcansettlesysmodify": true,
				"nnatbaseexchrate": 1,
				"nfinalsummny": 0,
				"vbankaccname_opp": "福建中烟开户名1",
				"id": 2431516334969091,
				"pk_balatype": 1951599879852298,
				"vbankaccount_opp": "FJ123456",
				"pk_banktype": "2013694194815744",
				"tenant": 1951632932835584,
				"pk_customerbank": 2013866654077184,
				"vbankaccount": "客户A-默认光大账号123456789",
				"accttype_opp": "0",
				"balatypesrvattr": 0,
				"pk_currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_customer": 1994185141932288,
				"nsettleexchrate": 1,
				"bjournalizing": true,
				"vmemo_opp": "福建中烟银行账户1备注",
				"_status": "Update",
				"accttype": "0",
				"vbanktypename_opp": "中国光大银行",
				"nnatsettlesummny": 100,
				"igathertype": 2,
				"vbankdocname_opp": "银行网点",
				"pk_banktype_opp": "2013694194815744",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsummny": 100,
				"dnatexchratedate": "2021-09-14 00:00:00",
				"vnatexchratetype": "2227642332419328",
				"centerpriseorg": "1961970750984448",
				"nnatexchrate": 1,
				"pk_bankdoc_opp": "2013860238217984"
			}
		],
		"isettlestatus": 0,
		"id": 2431516334969088,
		"pubts": "2021-09-17 17:03:03",
		"status": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
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

