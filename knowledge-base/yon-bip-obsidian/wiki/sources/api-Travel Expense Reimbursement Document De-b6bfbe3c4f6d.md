---
title: "差旅费报销单详情查询"
apiId: "b6bfbe3c4f6d49b193842bb3774facc2"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Travel Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 差旅费报销单详情查询

>  请求方式	GET | Travel Expense Report (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/znbz/rbsm/api/bill/travelexpbill/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。）    示例: 2481018845958400
billNo	string	query	否	单据编号(单据id和单据编号二选一必填)    示例: TERD211019000017

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/travelexpbill/detail?access_token=访问令牌&id=2481018845958400&billNo=TERD211019000017

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
message	string	否	调用信息 示例：操作成功
data	object	否	数据
vhandledeptid	long	否	报销人部门id 示例：1961982461595904
chandleorg	long	否	报销人组织id 示例：1961970750984448
pk_busimemo_name	string	否	费用项目名称 示例：差旅费无申请
pk_busimemotype_name	string	否	费用项目类型 示例：差旅类
caccountorg_name	string	否	会计主体名称 引用：会计主体FinanceOrg 示例：厦门烟草工业有限责任任公司
masterOrgKeyField	string	否	主组织字段名 示例：cfinaceorg
bustype_name	string	否	报销交易类型名称 示例：差旅报销-无申请1
chandlecostcenter_name	string	否	成本中心名称 示例：fj行政部厦烟
modifier	string	否	修改人名称 示例：黄东发
expsettleinfos	object	是	报销单结算信息
modifierId	long	否	修改人id 示例：1987089360785664
irejectstatus	short	否	驳回状态(0:正常;1:驳回） 示例：0
nshouldpaymny	BigDecimal	否	应付金额 示例：1000
chandlecostcenter	long	否	经办人成本中心id 示例：2434690750747136
modifyTime	string	否	修改时间 示例：2021-10-19 15:57:45
vcurrency_moneyDigit	int	否	币种精度 示例：2
vcurrency_name	string	否	报销币种 示例：人民币-1
id	long	否	报销单id 示例：2481018845958400
ishaveloanbill	boolean	否	是否有借款(true:有借款;false:没有借款) 示例：false
ntotalmny	BigDecimal	否	报销总额(含企业支付)价税合计 示例：1000
vattachmentass	string	否	单据附件id 示例：ge6KDgYlEf1EUehsPQKCrW4n1m5sso2Q
modifyDate	string	否	修改日期 示例：2021-10-19 00:00:00
isWfControlled	boolean	否	是否审批流控制(true:是;false:不是) 示例：false
vcurrency_currTypeSign	string	否	报销币种货币符号 示例：￥
isfinished	boolean	否	是否结束(true:结束;false:未结束) 示例：false
naccpaymny	BigDecimal	否	累计付款额 示例：1000
dcostdate	string	否	发生日期 示例：2021-10-19 00:00:00
pk_busimemo	long	否	费用项目id 示例：1989857697242624
barCode	string	否	条形码 示例：znbzbx_travelexpbill|2481018845958400
cfinacecostcenter	long	否	费用承担成本中心id 示例：2434690750747136
auditorId	long	否	审批人id 示例：1951632934146304
nnataccpaymny	BigDecimal	否	累计付款额-本币 示例：1000
caccountorg	long	否	会计主体id 示例：1961973740130560
ntaxmny	BigDecimal	否	税额 示例：0
vnatcurrency	string	否	组织本币 示例：G001ZM0000DEFAULTCURRENCT00000000001
auditTime	string	否	审批时间 示例：2021-11-01 10:25:19
nnatexchrate	BigDecimal	否	本币汇率 示例：1
nnattaxmny	BigDecimal	否	税额-本币 示例：0
pk_handlepsn	long	否	报销人id 示例：1987089356869888
pk_billtype	string	否	单据类型 示例：znbzbx_travelexpbill
status	short	否	单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：1
returncount	int	否	退回次数 示例：0
verifystate	short	否	审批状态, 1:已审批、2:未审批、 示例：2
code	string	否	单据号 示例：TERD211019000017
ibillmakemethod	short	否	填单方式(0:PC新增;1:移动新增;2:EXCEL导 示例：0
vnatexchratetype_digit	int	否	汇率精度 示例：7
pk_handlepsn_name	string	否	报销人 引用：员工 Staff 示例：黄东发
expapportions	object	是	报销单费用分摊集合
npaymentmny	BigDecimal	否	付款总额 示例：1000
ibudgetexectype	short	否	占用类型(0:预占;1:执行;9:不传预算) 示例：1
nnatpaymentmny	BigDecimal	否	付款额-本币 示例：1000
isoverstd	boolean	否	是否超标(true:是;false:不是) 示例：false
creatorId	long	否	创建人id 示例：1987089360785664
chandleorg_name	string	否	借款人组织 示例：福建中烟工业有限责任公司
pk_busimemotype	long	否	费用项目类别id 示例：1989855665315328
vcurrency	string	否	借款币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001
vouchdate	string	否	单据日期 示例：2021-10-19 00:00:00
cfinaceorg	long	否	费用承担组织id 示例：1961970750984448
isettlestatus	short	否	结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：5
vnatcurrency_name	string	否	组织本币 示例：人民币-1
nnatbaseexchrate	BigDecimal	否	基准汇率 示例：1
ismulticurrency	boolean	否	是否多币种(true:是;false:不是) 示例：false
iswithholdingcav	boolean	否	是否手工预提冲销(true:是手工;false:不是 示例：false
pubts	string	否	时间戳 示例：2021-11-01 10:25:20
vreason	string	否	报销原因 示例：测试
createDate	string	否	创建日期 示例：2021-10-19 00:00:00
auditDate	string	否	审批日期 示例：2021-11-01 00:00:00
nnattotalmny	BigDecimal	否	报销总额(含企业支付)-本币 示例：1000
vfinacedeptid_name	string	否	费用承担部门 示例：行政部-福建中烟
creator	string	否	创建人 示例：黄东发
iauditresult	short	否	系统稽核结果,0:稽核待处理、1:系统稽核检测通过、2:系统稽核检测柔性不通过、3:系统稽核检测刚性不通过、4:财务稽核检测通过、5:财务稽核检测柔性不通过、6:财务稽核检测刚性不通过、7:无需稽核 示例：4
vfinacedeptid	long	否	费用承担部门id 示例：1961982461595904
vnatcurrency_moneyDigit	int	否	组织本币金额精度 示例：2
cfinacecostcenter_name	string	否	费用承担成本中心名称 示例：fj行政部厦烟
profitcenter	string	否	利润中心id 示例：费用承担成本中心id
profitcenter_name	string	否	利润中心 示例：fj行政部厦烟
auditor	string	否	审批人名称 引用：身份信息 User 示例：YonSuite默认用户
expensebillbs	object	是	报销单明细信息
nexpensemny	BigDecimal	否	报销额 示例：1000
transTypeKeyField	string	否	交易类型字段名 示例：bustype
bustype	long	否	交易类型id 示例：1990918562173184
vnatexchratetype_name	string	否	汇率类型 示例：基准汇率
cfinaceorg_name	string	否	费用承担组织 示例：福建中烟工业有限责任公司
nsummny	BigDecimal	否	报销价税总额 示例：1000
createTime	string	否	创建时间 示例：2021-10-19 15:42:53
dnatexchratedate	string	否	汇率日期 示例：2021-10-19 00:00:00
nnatshouldpaymny	BigDecimal	否	应付额-本币 示例：1000
vnatexchratetype	string	否	汇率类型id 示例：xtikzjvp
nnatexpensemny	BigDecimal	否	报销额-本币 示例：1000
vnatcurrency_currTypeSign	string	否	组织本币货币符号 示例：￥
vhandledeptid_name	string	否	报销人部门 示例：行政部-福建中烟
nnatsummny	BigDecimal	否	报销价税合计-本币 示例：1000

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": 1961982461595904,
		"chandleorg": 1961970750984448,
		"pk_busimemo_name": "差旅费无申请",
		"pk_busimemotype_name": "差旅类",
		"caccountorg_name": "厦门烟草工业有限责任任公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "差旅报销-无申请1",
		"chandlecostcenter_name": "fj行政部厦烟",
		"modifier": "黄东发",
		"expsettleinfos": [
			{
				"vbankaccname": "黄东发",
				"pk_currency_opp": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vbanktypename": "MC银行",
				"pk_bankdoc": "ff5a879aa02f4ffcbc4f00f3071aced2",
				"vsettlecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsettlebaseexchrate": 1,
				"iaraptype": 0,
				"pk_expensebill": 2481018845958400,
				"nsettlesummny": 1000,
				"vbankdocname": "MC银行网点",
				"ipaystartpoint": 1,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"bcansettlesysmodify": true,
				"vbankaccname_opp": "厦门开户名1",
				"id": 2481018845958403,
				"vsettlecurrency_currTypeSign": "￥",
				"pk_balatype": 1951599879852298,
				"vbankaccount": "888888",
				"pk_currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"balatypesrvattr": 0,
				"nsettleexchrate": 1,
				"pk_handlepsnbank": "2480936072941824",
				"bjournalizing": true,
				"vcurrency_currTypeSign": "￥",
				"accttype": NaN,
				"vbanktypename_opp": "中国工商银行22222",
				"nnatsettlesummny": 1000,
				"vsettlecurrency_moneyDigit": 2,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_balatype_name": "银行转账",
				"vsettlecurrency_name": "人民币-1",
				"nnatexchrate": 1,
				"pk_handlepsn": 1987089356869888,
				"pk_currency_opp_name": "人民币-1",
				"pk_bankdoc_opp": 2028068467397888,
				"vnatexchratetype_digit": 7,
				"pk_handlepsn_name": "黄东发",
				"pk_enterprisebankacct": 2066500686730496,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"isettlestatus": 5,
				"vnatcurrency_name": "人民币-1",
				"nnatbaseexchrate": 1,
				"pk_currency_name": "人民币-1",
				"pubts": "2021-11-01 10:25:20",
				"vbankaccount_opp": "xm1234568789",
				"pk_banktype": "7b35ad8d263a488a86816775ae33234e",
				"accttype_opp": 0,
				"vnatcurrency_moneyDigit": 2,
				"settleform": 0,
				"vnatexchratetype_name": "基准汇率",
				"igathertype": 0,
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行22222",
				"pk_banktype_opp": 2028068410757632,
				"nsummny": 1000,
				"dnatexchratedate": "2021-10-19 00:00:00",
				"vnatexchratetype": "xtikzjvp",
				"centerpriseorg": 1961973740130560,
				"vnatcurrency_currTypeSign": "￥",
				"centerpriseorg_name": "厦门烟草工业有限责任任公司",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"modifierId": 1987089360785664,
		"irejectstatus": 0,
		"nshouldpaymny": 1000,
		"chandlecostcenter": 2434690750747136,
		"modifyTime": "2021-10-19 15:57:45",
		"vcurrency_moneyDigit": 2,
		"vcurrency_name": "人民币-1",
		"id": 2481018845958400,
		"ishaveloanbill": false,
		"ntotalmny": 1000,
		"vattachmentass": "ge6KDgYlEf1EUehsPQKCrW4n1m5sso2Q",
		"modifyDate": "2021-10-19 00:00:00",
		"isWfControlled": false,
		"vcurrency_currTypeSign": "￥",
		"isfinished": false,
		"naccpaymny": 1000,
		"dcostdate": "2021-10-19 00:00:00",
		"pk_busimemo": 1989857697242624,
		"barCode": "znbzbx_travelexpbill|2481018845958400",
		"cfinacecostcenter": 2434690750747136,
		"auditorId": 1951632934146304,
		"nnataccpaymny": 1000,
		"caccountorg": 1961973740130560,
		"ntaxmny": 0,
		"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"auditTime": "2021-11-01 10:25:19",
		"nnatexchrate": 1,
		"nnattaxmny": 0,
		"pk_handlepsn": 1987089356869888,
		"pk_billtype": "znbzbx_travelexpbill",
		"status": 1,
		"returncount": 0,
		"verifystate": 2,
		"code": "TERD211019000017",
		"ibillmakemethod": 0,
		"vnatexchratetype_digit": 7,
		"pk_handlepsn_name": "黄东发",
		"expapportions": [
			{
				"pk_busimemo_name": "差旅费无申请",
				"pk_busimemotype_name": "差旅类",
				"vnatexchratetype_digit": 7,
				"caccountorg_name": "厦门烟草工业有限责任任公司",
				"pk_busimemotype": 1989855665315328,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_expensebill": 2481018845958400,
				"cfinaceorg": 1961970750984448,
				"nnatapportmny": 1000,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"vnatcurrency_name": "人民币-1",
				"napporttaxmny": 0,
				"nnatbaseexchrate": 1,
				"id": 2481018845958402,
				"pubts": "2021-10-19 15:42:54",
				"napportnotaxmny": 1000,
				"vfinacedeptid_name": "行政部-福建中烟",
				"vfinacedeptid": 1961982461595904,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "fj行政部厦烟",
				"vcurrency_currTypeSign": "￥",
				"pk_busimemo": 1989857697242624,
				"vnatexchratetype_name": "基准汇率",
				"cfinacecostcenter": 2434690750747136,
				"profitcenter": "2434690750747136",
				"profitcenter_name": "福建中烟工业有限责任公司",
				"nnatapporttaxmny": 0,
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"caccountorg": 1961973740130560,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"dnatexchratedate": "2021-10-19 00:00:00",
				"vnatexchratetype": "xtikzjvp",
				"nnatapportnotaxmny": 1000,
				"napportmny": 1000,
				"nnatexchrate": 1,
				"vnatcurrency_currTypeSign": "￥",
				"napportrate": 100
			}
		],
		"npaymentmny": 1000,
		"ibudgetexectype": 1,
		"nnatpaymentmny": 1000,
		"isoverstd": false,
		"creatorId": 1987089360785664,
		"chandleorg_name": "福建中烟工业有限责任公司",
		"pk_busimemotype": 1989855665315328,
		"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"vouchdate": "2021-10-19 00:00:00",
		"cfinaceorg": 1961970750984448,
		"isettlestatus": 5,
		"vnatcurrency_name": "人民币-1",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"iswithholdingcav": false,
		"pubts": "2021-11-01 10:25:20",
		"vreason": "测试",
		"createDate": "2021-10-19 00:00:00",
		"auditDate": "2021-11-01 00:00:00",
		"nnattotalmny": 1000,
		"vfinacedeptid_name": "行政部-福建中烟",
		"creator": "黄东发",
		"iauditresult": 4,
		"vfinacedeptid": 1961982461595904,
		"vnatcurrency_moneyDigit": 2,
		"cfinacecostcenter_name": "fj行政部厦烟",
		"profitcenter": "费用承担成本中心id",
		"profitcenter_name": "fj行政部厦烟",
		"auditor": "YonSuite默认用户",
		"expensebillbs": [
			{
				"vhandledeptid": 1961982461595904,
				"chandleorg": 1961970750984448,
				"vwelfarestdcurrency_currTypeSign": "￥",
				"pk_busimemo_name": "差旅费无申请",
				"ntotaluntaxmny": 1000,
				"nwelfaredays": 4,
				"pk_busimemotype_name": "差旅类",
				"nintransuntaxmny": 0,
				"caccountorg_name": "厦门烟草工业有限责任任公司",
				"chandlecostcenter_name": "fj行政部厦烟",
				"nmealmny": 0,
				"nshouldpaymny": 1000,
				"chandlecostcenter": 2434690750747136,
				"pk_expensebill": 2481018845958400,
				"denddate": "2021-10-05 00:00:00",
				"nhoteldays": 4,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"id": 2481018845958401,
				"ntotalmny": 1000,
				"nnattotalwelfaremny": 0,
				"nnattotaluntaxmny": 1000,
				"vcurrency_currTypeSign": "￥",
				"isfinished": false,
				"naccpaymny": 1000,
				"nbusitravalday": 5,
				"pk_busimemo": 1989857697242624,
				"vwelfarestdcurrency_moneyDigit": 2,
				"cfinacecostcenter": 2434690750747136,
				"profitcenter": "2434690750747136",
				"profitcenter_name": "福建中烟工业有限责任公司",
				"nnathotelinvuntaxmny": 0,
				"nnataccpaymny": 1000,
				"caccountorg": 1961973740130560,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nhotelinvuntaxmny": 0,
				"nintransstdmny": 0,
				"ntaxmny": 0,
				"dbegindate": "2021-10-01 00:00:00",
				"nnatmealmny": 0,
				"nnatexchrate": 1,
				"nnatmealuntaxmny": 0,
				"nnattaxmny": 0,
				"pk_handlepsn": 1987089356869888,
				"nmealuntaxmny": 0,
				"vnatexchratetype_digit": 7,
				"ntotalwelfaremny": 0,
				"pk_handlepsn_name": "黄东发",
				"ntotaltaxmny": 0,
				"npaymentmny": 1000,
				"nnatpaymentmny": 1000,
				"vwelfarestdcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vwelfarestdcurrency_name": "人民币-1",
				"chandleorg_name": "福建中烟工业有限责任公司",
				"pk_busimemotype": 1989855665315328,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"cfinaceorg": 1961970750984448,
				"imealwelfaretype": 2,
				"vnatcurrency_name": "人民币-1",
				"nnatbaseexchrate": 1,
				"pubts": "2021-10-19 15:42:54",
				"nnattotalmny": 1000,
				"vfinacedeptid_name": "行政部-福建中烟",
				"nwelfarestdexchrate": 1,
				"ihotelwelfaretype": 1,
				"vfinacedeptid": 1961982461595904,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "fj行政部厦烟",
				"nexpensemny": 1000,
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"nmealstandard": 0,
				"nsummny": 1000,
				"nnattotaltaxmny": 0,
				"dnatexchratedate": "2021-10-19 00:00:00",
				"nnatshouldpaymny": 1000,
				"vnatexchratetype": "xtikzjvp",
				"nnatexpensemny": 1000,
				"vnatcurrency_currTypeSign": "￥",
				"vhandledeptid_name": "行政部-福建中烟",
				"nnatintransuntaxmny": 0,
				"iintranswelfaretype": 0,
				"nnatsummny": 1000,
				"nmealbasestdmny": 100,
				"nintransbasestdmny": 80
			}
		],
		"nexpensemny": 1000,
		"transTypeKeyField": "bustype",
		"bustype": 1990918562173184,
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "福建中烟工业有限责任公司",
		"nsummny": 1000,
		"createTime": "2021-10-19 15:42:53",
		"dnatexchratedate": "2021-10-19 00:00:00",
		"nnatshouldpaymny": 1000,
		"vnatexchratetype": "xtikzjvp",
		"nnatexpensemny": 1000,
		"vnatcurrency_currTypeSign": "￥",
		"vhandledeptid_name": "行政部-福建中烟",
		"nnatsummny": 1000
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

