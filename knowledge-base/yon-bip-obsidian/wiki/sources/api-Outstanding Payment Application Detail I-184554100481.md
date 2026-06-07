---
title: "挂账付款申请单详情查询"
apiId: "1845541004811173897"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payables Payment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payables Payment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 挂账付款申请单详情查询

>  请求方式	GET | Payables Payment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/paymentapply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。）    示例: 1809885285921062918
billNo	string	query	否	单据编号(单据id和单据编号二选一必填)    示例: FKSQ23090500001

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/paymentapply/detail?access_token=访问令牌&id=1809885285921062918&billNo=FKSQ23090500001

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
displayCode	string	否	异常码
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
vhandledeptid	string	否	申请人部门id 示例：2534726016913664
chandleorg	string	否	申请人组织id 示例：2534724219212032
iauditdealstatus	short	否	稽核处理状态(0:未处理；1：已初核) 示例：0
caccountorg_name	string	否	会计主体名称 引用：会计主体 FinanceOrgVO 示例：费控A有限公司
masterOrgKeyField	string	否	主组织字段 示例：cfinaceorg
bustype_name	string	否	交易类型名称 示例：挂账付款申请单
modifier	string	否	修改人名称 示例：王五
modifierId	long	否	修改人id 示例：2573122818902272
irejectstatus	short	否	驳回状态(0:正常;1:驳回） 示例：0
modifyTime	string	否	修改时间 示例：2023-09-08 11:17:15
vcurrency_moneyDigit	int	否	币种精度 示例：3
vcurrency_name	string	否	报销币种 示例：人民币
id	string	否	挂账付款申请单id 示例：1809885285921062918
vattachmentass	string	否	单据附件id 示例：815d2eb19c2545d5a61962f0303941e5
isdeferpaymentapply	boolean	否	是否分摊（false：否；true：是） 示例：false
modifyDate	string	否	修改日期 示例：2023-09-08 00:00:00
isWfControlled	boolean	否	是否审批流控制(true:是;false:不是) 示例：false
vcurrency_currTypeSign	string	否	报销币种货币符号 示例：¥
barCode	string	否	条形码 示例：znbzbx_paymentapply|1809885285921062918
caccountorg	string	否	会计主体id 示例：2534724219212032
vnatcurrency	string	否	组织本币id 示例：2533329091532288
nnatexchrate	BigDecimal	否	汇率 示例：1
pk_handlepsn	string	否	报销人id 示例：2534748814774528
pk_billtype	string	否	单据类型 示例：znbzbx_paymentapply
status	short	否	单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0
returncount	int	否	退回次数 示例：0
verifystate	short	否	审批状态(0:未提交；1：已提交；2：已审批) 示例：0
paymentapplysettleinfos	object	是	挂账付款申请单结算信息
code	string	否	单据编码 示例：FKSQ23090500001
ibillmakemethod	short	否	填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0
vnatexchratetype_digit	int	否	汇率精度 示例：6
pk_handlepsn_name	string	否	报销人/申请人 引用：员工 Staff 示例：王五
creatorId	long	否	创建人id 示例：2573122818902272
chandleorg_name	string	否	报销人组织 示例：预算对了吧有限公司
vcurrency	string	否	币种id 示例：2533329091532288
vouchdate	string	否	单据日期 示例：2023-09-05 00:00:00
cfinaceorg	string	否	费用承担组织id 示例：2534724219212032
isettlestatus	short	否	结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0
vnatcurrency_name	string	否	组织本币 示例：人民币
nnatbaseexchrate	long	否	基准汇率 示例：1
ismulticurrency	boolean	否	是否多币种(true:是;false:不是) 示例：true
pubts	string	否	时间戳 示例：2023-09-08 11:17:15
vreason	string	否	申请原因 示例：11
createDate	string	否	创建日期 示例：2023-09-05 00:00:00
vfinacedeptid_name	string	否	费用承担部门 示例：YS人力部
creator	string	否	创建人 示例：王五
iauditresult	short	否	系统稽核结果,0:稽核待处理、1:系统稽核检测通过、2:系统稽核检测柔性不通过、3:系统稽核检测刚性不通过、4:财务稽核检测通过、5:财务稽核检测柔性不通过、6:财务稽核检测刚性不通过、7:无需稽核 示例：7
vfinacedeptid	string	否	费用承担部门id 示例：2534726016913664
vnatcurrency_moneyDigit	int	否	组织本币金额精度 示例：3
nexpensemny	BigDecimal	否	申请总额 示例：50
transTypeKeyField	string	否	交易类型字段名 示例：bustype
bustype	string	否	交易类型id 示例：1658463224516313092
vnatexchratetype_name	string	否	汇率类型 示例：基准汇率
cfinaceorg_name	string	否	费用承担组织 示例：预算对了吧有限公司
createTime	string	否	创建时间 示例：2023-09-05 15:19:38
dnatexchratedate	string	否	汇率日期 示例：2023-09-05 00:00:00
vnatexchratetype	string	否	汇率类型id 示例：0000KWEKXNNQCPWIRL0000
nnatexpensemny	BigDecimal	否	申请总额-本币 示例：50
vhandledeptid_name	string	否	报销人（申请人）部门 示例：YS人力部
vnatcurrency_currTypeSign	string	否	组织本币货币符号 示例：¥

## 5. 正确返回示例

{
	"displayCode": "",
	"code": 200,
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2534726016913664",
		"chandleorg": "2534724219212032",
		"iauditdealstatus": 0,
		"caccountorg_name": "费控A有限公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "挂账付款申请单",
		"modifier": "王五",
		"modifierId": 2573122818902272,
		"irejectstatus": 0,
		"modifyTime": "2023-09-08 11:17:15",
		"vcurrency_moneyDigit": 3,
		"vcurrency_name": "人民币",
		"id": "1809885285921062918",
		"vattachmentass": "815d2eb19c2545d5a61962f0303941e5",
		"isdeferpaymentapply": false,
		"modifyDate": "2023-09-08 00:00:00",
		"isWfControlled": false,
		"vcurrency_currTypeSign": "¥",
		"barCode": "znbzbx_paymentapply|1809885285921062918",
		"caccountorg": "2534724219212032",
		"vnatcurrency": "2533329091532288",
		"nnatexchrate": 1,
		"pk_handlepsn": "2534748814774528",
		"pk_billtype": "znbzbx_paymentapply",
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"paymentapplysettleinfos": [
			{
				"vbankaccname": "王五",
				"pk_currency_opp": "2533329091532288",
				"vbanktypename": "中国工商银行",
				"pk_bankdoc": "2534746472863233",
				"iaraptype": 0,
				"pk_expensebill": "1804753968232923146",
				"vbankdocname": "中国工商银行股份有限公司北京望京支行",
				"ipaystartpoint": 1,
				"vcurrency_moneyDigit": 3,
				"vcurrency_name": "人民币",
				"nlineno": 10,
				"bcansettlesysmodify": true,
				"vbankaccname_opp": "测试A有限公司",
				"nnatapplypaymny": 50,
				"id": "1809885285921062919",
				"pk_balatype": 2533158186881284,
				"napplypaymny": 50,
				"pk_paymentapply": "1809885285921062918",
				"vbankaccount": "6210000000000",
				"balatypesrvattr": 0,
				"pk_currency": "2533329091532288",
				"pk_handlepsnbank": "2534748814790912",
				"bjournalizing": true,
				"vcurrency_currTypeSign": "¥",
				"pk_expsettleinfo": "1804753968232923150",
				"accttype": "BAT00001",
				"vbanktypename_opp": "中国工商银行",
				"vnatcurrency": "2533329091532288",
				"pk_balatype_name": "银行转账",
				"nnatexchrate": 1,
				"pk_handlepsn": "2534748814774528",
				"pk_currency_opp_name": "人民币",
				"pk_bankdoc_opp": "2534746472863233",
				"vnatexchratetype_digit": 6,
				"pk_handlepsn_name": "王五",
				"pk_enterprisebankacct": "1471569698145959937",
				"vcurrency": "2533329091532288",
				"pk_enterprisebankacct_name": "测试A有限公司",
				"isettlestatus": 0,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"pk_currency_name": "人民币",
				"vbankaccount_opp": "12121111111111111",
				"pk_banktype": "2534745953146370",
				"accttype_opp": "0",
				"expbill_code": "GRRD230829000000001",
				"vnatcurrency_moneyDigit": 3,
				"settleform": 0,
				"vnatexchratetype_name": "基准汇率",
				"igathertype": 0,
				"vbankdocname_opp": "中国工商银行股份有限公司北京望京支行",
				"pk_banktype_opp": "2534745953146370",
				"dnatexchratedate": "2023-08-29 00:00:00",
				"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
				"centerpriseorg": "2534724219212032",
				"vnatcurrency_currTypeSign": "¥",
				"centerpriseorg_name": "测试A有限公司",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"code": "FKSQ23090500001",
		"ibillmakemethod": 0,
		"vnatexchratetype_digit": 6,
		"pk_handlepsn_name": "王五",
		"creatorId": 2573122818902272,
		"chandleorg_name": "预算对了吧有限公司",
		"vcurrency": "2533329091532288",
		"vouchdate": "2023-09-05 00:00:00",
		"cfinaceorg": "2534724219212032",
		"isettlestatus": 0,
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": true,
		"pubts": "2023-09-08 11:17:15",
		"vreason": "11",
		"createDate": "2023-09-05 00:00:00",
		"vfinacedeptid_name": "YS人力部",
		"creator": "王五",
		"iauditresult": 7,
		"vfinacedeptid": "2534726016913664",
		"vnatcurrency_moneyDigit": 3,
		"nexpensemny": 50,
		"transTypeKeyField": "bustype",
		"bustype": "1658463224516313092",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "预算对了吧有限公司",
		"createTime": "2023-09-05 15:19:38",
		"dnatexchratedate": "2023-09-05 00:00:00",
		"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
		"nnatexpensemny": 50,
		"vhandledeptid_name": "YS人力部",
		"vnatcurrency_currTypeSign": "¥"
	}
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

