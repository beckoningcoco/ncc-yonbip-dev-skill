---
title: "差旅费报销单保存"
apiId: "a031422cd1684ed5a7225c26ca1a0038"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 差旅费报销单保存

>  请求方式	POST | Travel Expense Report (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/travelexpbill/save
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
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
ismulticurrency	boolean	否	否	是否多币种(true:是;false:不是) 示例：false
id	string	否	否	单据id(_status为Update更新时必填)
code	string	否	否	单据号(设置手工编号时必输，自动编号时输入无效) 示例：0219
dcostdate	string	否	是	发生日期(格式：yyyy-MM-dd) 示例：2021-09-27
vouchdate	string	否	是	单据日期(格式：yyyy-MM-dd) 示例：2021-09-27
cfinaceorg	string	否	是	费用承担组织(支持id和code) 示例：2184854309114112
cfinacecostcenter	string	否	否	费用承担成本中心（支持id和code）
profitcenter	string	否	否	利润中心(支持id或code；非特征租户不填，特征租户可填)
vfinacedeptid	string	否	是	费用承担部门(支持id和code) 示例：2184856228794624
caccountorg	string	否	是	会计主体(支持id和code，所有页签会计主体需一致) 示例：2184854309114112
pk_project	string	否	否	项目(支持id和code) 示例：2184864426185472
pk_busimemo	string	否	否	费用项目id 示例：2184860029718784
pk_busimemo_code	string	否	否	费用项目编码
pk_busimemotype	long	否	否	费用项目类别id 示例：2184858240700672
pk_busimemotype_code	string	否	否	费用项目类别编码
vcurrency	string	否	是	原币(支持id和code，没有启用多币种时与组织本币保持一致) 示例：2183687327011840
bustype	string	否	是	交易类型(支持id和code) 示例：2183687370051850
ntaxmny	BigDecimal	否	否	税额 示例：3.87
ntotalmny	BigDecimal	否	否	报销总额 示例：632.74
pk_handlepsn	string	否	是	报销人(支持id和code) 示例：2185003811393792
vnatcurrency	string	否	是	组织本币(支持id和code，没有启用多币种时与原币保持一致) 示例：2183687327011840
vnatcurrency_moneyDigit	string	否	否	组织本币金额精度 示例：2
vnatexchratetype	string	否	是	组织本币汇率类型(支持id和code) 示例：py7y8nze
vnatexchratetype_digit	long	否	否	组织本币汇率精度 示例：6
dnatexchratedate	string	否	是	组织本币汇率日期(格式：yyyy-MM-dd) 示例：2021-09-27
nnatbaseexchrate	BigDecimal	否	是	组织本币企业汇率 示例：1
nnatexchrate	BigDecimal	否	是	组织本币汇率 示例：1
nnatexpensemny	BigDecimal	否	是	不含税总额-本币 示例：628.87
nnattaxmny	BigDecimal	否	否	税额-本币 示例：3.87
nnatsummny	BigDecimal	否	是	报销价税总额-本币 示例：632.74
nnatshouldpaymny	BigDecimal	否	是	应付总额-本币(应付总额-本币=报销价税总额-本币) 示例：500
nnatpaymentmny	BigDecimal	否	否	付款总额-本币 示例：500
nnataccpaymny	BigDecimal	否	否	累计付款额-本币 示例：500
nnattotalmny	BigDecimal	否	否	报销总额-本币 示例：632.74
vhandledeptid	string	否	是	报销人部门(支持id和code) 示例：2184856228794624
chandleorg	string	否	是	报销人组织(支持id和code) 示例：2184854309114112
vreason	string	否	是	报销说明 示例：测试
nsummny	BigDecimal	否	是	报销价税总额 示例：632.74
nexpensemny	BigDecimal	否	是	不含税总额 示例：628.87
nshouldpaymny	BigDecimal	否	是	应付总额(应付总额=报销价税总额) 示例：500
npaymentmny	BigDecimal	否	否	付款总额 示例：500
naccpaymny	BigDecimal	否	否	累计付款额 示例：500
vmemo	string	否	否	备注 示例：测试
vattachmentass	string	否	否	单据附件id 示例：o1LsudfDQ5N7pRhLykZc9aDTz4ZpJsr2
isoverstd	boolean	否	否	是否超标(true:是;false:不是) 示例：false
creatorId	long	否	否	创建人id(不传值默认YonSuite默认用户) 示例：2185004199465216
creator_code	string	否	否	创建人编码(不传值默认YonSuite默认用户)
creator	string	否	否	创建人名称 示例：王建斌
ntotaltaxmny	number
小数位数:8,最大长度:20	否	否	报销总额(含企业支付)可抵扣税额 示例：报销明细表体合计值 示例：3.87
ntotaluntaxmny	number
小数位数:8,最大长度:20	否	否	报销总额(含企业支付)不含税金额 示例：报销明细表体合计值 示例：628.87
nnattotaltaxmny	number
小数位数:8,最大长度:20	否	否	报销总额(含企业支付)可抵扣税额-本币 示例：报销明细表体合计值 示例：3.87
nnattotaluntaxmny	number
小数位数:8,最大长度:20	否	否	报销总额(含企业支付)不含税金额-本币 示例：报销明细表体合计值 示例：628.87
expensebillbs	object	是	是	报销单明细
loancavs	object	是	否	报销单借款核销
expapportions	object	是	是	报销单费用分摊集合
expsettleinfos	object	是	是	报销单结算信息集合
_status	string	否	是	操作标识, Insert:新增、Update:更新 示例:Insert 示例：Insert
expinvoicedetails	object	是	否	账单明细

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/travelexpbill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": false,
		"id": "",
		"code": "0219",
		"dcostdate": "2021-09-27",
		"vouchdate": "2021-09-27",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "",
		"profitcenter": "",
		"vfinacedeptid": "2184856228794624",
		"caccountorg": "2184854309114112",
		"pk_project": "2184864426185472",
		"pk_busimemo": "2184860029718784",
		"pk_busimemo_code": "",
		"pk_busimemotype": 2184858240700672,
		"pk_busimemotype_code": "",
		"vcurrency": "2183687327011840",
		"bustype": "2183687370051850",
		"ntaxmny": 3.87,
		"ntotalmny": 632.74,
		"pk_handlepsn": "2185003811393792",
		"vnatcurrency": "2183687327011840",
		"vnatcurrency_moneyDigit": "2",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": 6,
		"dnatexchratedate": "2021-09-27",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"nnatexpensemny": 628.87,
		"nnattaxmny": 3.87,
		"nnatsummny": 632.74,
		"nnatshouldpaymny": 500,
		"nnatpaymentmny": 500,
		"nnataccpaymny": 500,
		"nnattotalmny": 632.74,
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vreason": "测试",
		"nsummny": 632.74,
		"nexpensemny": 628.87,
		"nshouldpaymny": 500,
		"npaymentmny": 500,
		"naccpaymny": 500,
		"vmemo": "测试",
		"vattachmentass": "o1LsudfDQ5N7pRhLykZc9aDTz4ZpJsr2",
		"isoverstd": false,
		"creatorId": 2185004199465216,
		"creator_code": "",
		"creator": "王建斌",
		"ntotaltaxmny": NaN,
		"ntotaluntaxmny": NaN,
		"nnattotaltaxmny": NaN,
		"nnattotaluntaxmny": NaN,
		"expensebillbs": [
			{
				"id": "",
				"pk_busimemo": "2184860029718784",
				"pk_busimemo_code": "",
				"vcurrency": "2183687327011840",
				"vnatcurrency": "2183687327011840",
				"vnatexchratetype": "py7y8nze",
				"dnatexchratedate": "2021-09-27",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vcurrency_moneyDigit": "2",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype_digit": "6",
				"isMatchInvoice": true,
				"nhotelinvtaxmny": 3.87,
				"nothermny": 132.74,
				"pk_handlepsn": "2185003900997888",
				"vhandledeptid": "2184857314742528",
				"chandleorg": "2184855433367808",
				"caccountorg": "2184854309114112",
				"cfinaceorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"profitcenter": "",
				"nwelfaredays": 4,
				"iintranswelfaretype": 1,
				"nintransbasestdmny": 0,
				"nintransstdmny": 0,
				"nstdintranscostmny": 0,
				"nintransmny": 100,
				"nintransuntaxmny": 100,
				"imealwelfaretype": 1,
				"nmealbasestdmny": 0,
				"nmealstandard": 0,
				"nstdmealcostmny": 0,
				"nmealmny": 100,
				"nmealuntaxmny": 100,
				"nmiscellansexpbasestd": 0,
				"nmiscellansexpstd": 0,
				"nmiscellansexp": 100,
				"ntotalwelfaremny": 100,
				"nhoteldays": 4,
				"ihotelwelfaretype": 1,
				"nhotelbasestdmny": 0,
				"nhotelstdmny": 0,
				"nhotelmny": 100,
				"nhotelinvuntaxmny": 96.13,
				"ntotalmny": 632.74,
				"ntotaltaxmny": 3.87,
				"ntotaluntaxmny": 628.87,
				"nsummny": 632.74,
				"ntaxmny": 3.87,
				"nexpensemny": 628.87,
				"nshouldpaymny": 500,
				"npaymentmny": 500,
				"naccpaymny": 500,
				"notheruntaxmny": 132.74,
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"nnattransmny": 100,
				"nnattransuntaxmny": 100,
				"nnattickettaxmny": 0,
				"nnathotelinvmny": 100,
				"nnathotelmny": 100,
				"nnathotelinvtaxmny": 3.87,
				"nnathotelinvuntaxmny": 96.13,
				"nnatmealmny": 100,
				"nnatmealtaxmny": 0,
				"nnatmealuntaxmny": 100,
				"nnatmealcostmny": 0,
				"nnatintranscostmny": 100,
				"nnatintransmny": 100,
				"nnatintranstaxmny": 0,
				"nnatintransuntaxmny": 100,
				"nnatstationtransmny": 0,
				"nnatstationtranstaxmny": 0,
				"nnatstationtransuntaxmny": 0,
				"nnatmiscellansexp": 100,
				"nnatothermny": 132.74,
				"nnatothertaxmny": 0,
				"nnatotheruntaxmny": 132.74,
				"nnattotalwelfaremny": 100,
				"nnatexpensemny": 628.87,
				"nnattaxmny": 3.87,
				"nnatsummny": 632.74,
				"nnatcavwithholdingmny": "",
				"nnatshouldpaymny": 500,
				"nnatpaymentmny": 500,
				"nnataccpaymny": 500,
				"nnatservicemny": 0,
				"nnatservicetaxmny": 0,
				"nnatserviceuntaxmny": 0,
				"nnattotalmny": 632.74,
				"nnattotaltaxmny": 3.87,
				"nnattotaluntaxmny": 628.87,
				"chandlecostcenter": "",
				"chandlecostcenter_code": "",
				"pk_project": "2184864426185472",
				"pk_memoapply": 2186578396598528,
				"vmemoapplybilltype": "znbzbx_busistrip",
				"vapplycurrency": "2183687327011840",
				"vapplycurrency_moneyDigit": "2",
				"napplymny": 0,
				"dbegindate": "2021-09-01",
				"nbusitravalday": 5,
				"denddate": "2021-09-05",
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_endaddr": "bfcb5dbe-5cf3-11e9-817e-7cd30abea0c0",
				"ntransmny": 100,
				"ntransuntaxmny": 100,
				"nhotelinvmny": 100,
				"nstdhotelinvmny": 0,
				"nintranscostmny": 100,
				"vmemo": "测试报销明细",
				"itranstools": "4",
				"_status": "Insert"
			}
		],
		"loancavs": [
			{
				"id": "",
				"bcav": true,
				"pk_loanbill": "1598409643230494726",
				"pk_loanbill_b": "1598409643230494728",
				"pk_loanbilltype": "znbzbx_loanbill",
				"loanno": "PLNS2211240003",
				"pk_memoapply": "1598397651696484358",
				"pk_project": "2184864426185472",
				"pk_loanpsn": "2185003811393792",
				"vloandeptid": "2534726016913664",
				"vloanchandleorg": "1534545738714841092",
				"pk_cusdoc": "2185034480177408",
				"pk_cusdoc_code": "",
				"pk_customer": "",
				"pk_customer_code": "",
				"loandate": "2022-11-24 00:00:00",
				"pk_busimemo": "1464090373393481736",
				"pk_busimemo_code": "",
				"nloanmny": "400",
				"nnatloanmny": "400",
				"nfinalsummnybody": "400",
				"nnatfinalsummnybody": "400",
				"nacccavmny": "0",
				"nnatacccavmny": "0",
				"naccreturnmny": "0",
				"nnataccreturnmny": "0",
				"nacctransferloanmny": "0",
				"nnatacctransferloanmny": "0",
				"ntotalcavmny": "400",
				"nnattotalcavmny": "400",
				"ncavmny": "0",
				"nnatcavmny": "0",
				"nuncavmny": "400",
				"nnatuncavmny": "400",
				"vreason": "立项红冲",
				"vloancurrency": "2533329091532288",
				"vloancurrency_moneyDigit": "3",
				"vnatcurrency": "2533329091532288",
				"vnatcurrency_moneyDigit": "3",
				"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2022-12-12",
				"nnatexchrate": "1",
				"vloanfinacedeptid": "2534726016913664",
				"cloanfinaceorg": "2534724219212032",
				"cloancostcenter": "1549410586072186888",
				"cloancostcenter_code": "A002",
				"cloanfinacecostcenter": "1549410586072186888",
				"cloanfinacecostcenter_code": "A002",
				"profitcenter": "",
				"_status": "Insert"
			}
		],
		"expapportions": [
			{
				"id": "",
				"vfinacedeptid": "2184856228794624",
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"profitcenter": "",
				"pk_project": "2184864426185472",
				"caccountorg": "2184854309114112",
				"pk_busimemo": "2184860029718784",
				"pk_busimemo_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-27",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"napportmny": 632.74,
				"napporttaxmny": 3.87,
				"napportnotaxmny": 628.87,
				"nnatapportmny": 632.74,
				"nnatapporttaxmny": 3.87,
				"nnatapportnotaxmny": 628.87,
				"napportrate": 100,
				"_status": "Insert"
			}
		],
		"expsettleinfos": [
			{
				"id": "",
				"vbankaccount": "100000022",
				"vbankaccname": "毛月",
				"pk_bankdoc": "2184878273385216",
				"pk_banktype": "2184875898393344",
				"pk_currency": "2183687327011840",
				"pk_handlepsnbank": "2185003901210881",
				"pk_handlepsn": "2185003900997888",
				"pk_balatype": "2183682241614081",
				"pk_balatype_code": "",
				"balatypesrvattr": "0",
				"centerpriseorg": "2184854309114112",
				"pk_currency_opp": "2183687327011840",
				"vmemo_opp": "",
				"pk_enterprisebankacct": "2325222650122752",
				"vbankaccount_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"pk_bankdoc_opp": "2186831417381637",
				"pk_enterprisecashacct": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": 2,
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-27",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_moneyDigit": 2,
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nsummny": 500,
				"nsettlesummny": 500,
				"nnatsettlesummny": 500,
				"_status": "Insert",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"_status": "Insert",
		"expinvoicedetails": [
			{
				"pk_tallydata": "12343455",
				"vinvoicecode": "",
				"vinvoiceno": "",
				"pk_invoicetype": 0,
				"invstatus": 0,
				"pk_consumekind": 0,
				"dopendate": "2026-06-07 12:51:18",
				"nuntaxmny": 0,
				"ntaxmny": 0,
				"nothertaxmny": 0,
				"nmny": 0,
				"nexpmny": 0,
				"nservicemny": 0,
				"ncompanypaymny": 0,
				"bocrmodify": true,
				"vinvoicecurrency": "",
				"vnatcurrency": "",
				"vnatexchratetype": "",
				"dnatexchratedate": "2026-06-07 12:51:18",
				"nnatbaseexchrate": 0,
				"nnatexchrate": 0,
				"dcostdate": "2026-06-07 12:51:18",
				"dupdate": "2026-06-07 12:51:18",
				"pk_costaddr": "",
				"pk_costpsndoc": "",
				"seatgrade": 0,
				"pk_startaddr": "",
				"vcustname": "",
				"vcusttaxid": "",
				"isEleInvoice": 0,
				"collectionWay": 0,
				"vname": "",
				"vtrainnum": "",
				"vuserid": "",
				"vparentsourcesysid": "",
				"icarscenario": "",
				"pk_expenserecord": "",
				"buyerName": "",
				"buyerTaxId": "",
				"startAddr": "",
				"destAddr": "",
				"ndeductrate": 0,
				"ndeducttaxmny": 0,
				"pk_taxrate": 0,
				"nservicetaxrate": 0,
				"nservicetaxmny": 0,
				"isallowmannualmerge": true,
				"vtriprelatefield": "",
				"pk_expensetrip": "",
				"mergegroupid": "",
				"nnatuntaxmny": 0,
				"nnattaxmny": 0,
				"nnatmny": 0,
				"nnatdeducttaxmny": 0,
				"nnatservicemny": 0,
				"nnatservicetaxmny": 0,
				"nnatcompanypaymny": 0,
				"nnatexpmny": 0,
				"_status": ""
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
code	long	否	返回编码 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
ismulticurrency	boolean	否	是否多币种(true:是;false:不是) 示例：false
code	string	否	单据编号 示例：0219
vouchdate	string	否	单据日期 示例：2021-09-27 00:00:00
cfinaceorg	string	否	费用承担组织id 示例：2184854309114112
cfinaceorg_name	string	否	费用承担组织 示例：北京天元股份有限公司
cfinacecostcenter	string	否	费用承担成本中心id 示例：2184854309114112
profitcenter	string	否	利润中心 示例：2184854309114112
vfinacedeptid	string	否	费用承担部门id 示例：2184856228794624
vfinacedeptid_name	string	否	费用承担部门 示例：筹资部-规划部
caccountorg	string	否	会计主体id 示例：2184854309114112
caccountorg_name	string	否	会计主体 引用：会计主体 FinanceOrg 示例：北京天元股份有限公司
pk_project	string	否	项目id 示例：2184864426185472
pk_project_name	string	否	项目 示例：股东大会
pk_busimemo	long	否	费用项目id 示例：2184860029718784
pk_busimemo_name	string	否	费用项目 示例：华侨招待费
pk_busimemotype	long	否	费用项目类别id 示例：2184858240700672
vcurrency	string	否	报销币种id 示例：2183687327011840
vcurrency_name	string	否	报销币种 示例：人民币
vcurrency_moneyDigit	string	否	报销币种金额精度 示例：2
bustype	string	否	交易类型id 示例：2183687370051850
ntaxmny	BigDecimal	否	可抵扣税额 示例：3.87
ntotalmny	BigDecimal	否	报销总额(含企业支付) 示例：632.74
bustype_name	string	否	交易类型 示例：差旅费报销单
pk_handlepsn	string	否	报销人id 示例：2185003811393792
vnatcurrency	string	否	组织本币id 示例：2183687327011840
vnatcurrency_name	string	否	组织本币 示例：人民币
vnatcurrency_moneyDigit	string	否	组织本币金额精度 示例：2
vnatexchratetype	string	否	汇率类型id 示例：py7y8nze
vnatexchratetype_name	string	否	汇率类型 示例：基准汇率
vnatexchratetype_digit	string	否	汇率精度 示例：6
dnatexchratedate	string	否	汇率日期 示例：2021-09-27 00:00:00
nnatbaseexchrate	BigDecimal	否	企业汇率 示例：1
nnatexchrate	BigDecimal	否	汇率 示例：1
nnatexpensemny	BigDecimal	否	不含税总额-本币 示例：628.87
nnattaxmny	BigDecimal	否	可抵扣税额-本币 示例：3.87
nnatsummny	BigDecimal	否	价税总额-本币 示例：632.74
nnatshouldpaymny	BigDecimal	否	应付总额-本币 示例：500
nnatcavmny	BigDecimal	否	核销总额-本币 示例：132.74
nnatpaymentmny	BigDecimal	否	付款总额-本币 示例：500
nnataccpaymny	BigDecimal	否	累计付款额-本币 示例：500
pk_handlepsn_name	string	否	报销人 引用：员工 Staff 示例：王建斌
nnattotalmny	BigDecimal	否	报销总额(含企业支付)价税合计 示例：632.74
vhandledeptid	string	否	报销人部门id 示例：2184856228794624
vhandledeptid_name	string	否	报销人部门 示例：筹资部-规划部
chandleorg	string	否	报销人组织id 示例：2184854309114112
chandleorg_name	string	否	报销人组织 示例：北京天元股份有限公司
vreason	string	否	报销说明 示例：测试
nexpensemny	BigDecimal	否	不含税总额 示例：628.87
nsummny	BigDecimal	否	价税总额 示例：632.74
nshouldpaymny	BigDecimal	否	应付总额 示例：500
ncavmny	BigDecimal	否	核销总额 示例：132.74
npaymentmny	BigDecimal	否	付款总额 示例：500
naccpaymny	BigDecimal	否	累计付款额 示例：500
ishaveloanbill	boolean	否	是否有借款(true:有借款;false:没有借款) 示例：true
iswithholdingcav	boolean	否	是否手工预提冲销(true:是手工;false:不是手工) 示例：false
isfinished	boolean	否	是否结束(true:结束;false:未结束) 示例：false
isettlestatus	long	否	结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0
vmemo	string	否	备注 示例：测试
status	long	否	单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0
irejectstatus	long	否	驳回状态(0:正常;1:驳回) 示例：0
ibillmakemethod	long	否	填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0
pk_billtype	string	否	单据类型 示例：znbzbx_travelexpbill
vattachmentass	string	否	单据附件id 示例：o1LsudfDQ5N7pRhLykZc9aDTz4ZpJsr2
isoverstd	boolean	否	是否超标(true:是;false:不是) 示例：false
vdef2	string	否	自定义项2 示例：测试2
isWfControlled	boolean	否	是否审批流控制(true:是;false:不是) 示例：true
verifystate	long	否	审批状态(0:待提交;1:审批完成;3:审批中) 示例：0
returncount	long	否	退回次数 示例：0
creatorId	long	否	创建人id 示例：2185004199465216
creator	string	否	创建人 示例：王建斌
createDate	string	否	创建日期 示例：2021-09-27 15:27:39
createTime	string	否	创建时间 示例：2021-09-27 15:27:39
expensebillbs	object	是	差旅费报销单子表
loancavs	object	是	报销单借款核销
expapportions	object	是	报销单费用分摊
expsettleinfos	object	是	报销单结算信息
id	long	否	报销单id 示例：2449861146972416
barCode	string	否	条形码 示例：znbzbx_travelexpbill|2449861146972416
pubts	string	否	时间戳 示例：2021-09-27 15:27:40
tenant	long	否	租户id 示例：2183682413744384
yTenantId	string	否	租户 示例：py7y8nze
iauditresult	long	否	系统稽核结果(0:稽核待处理; 1:系统稽核检测通过,系统自动稽核规则--全部通过; 2:系统稽核检测柔性不通过,系统自动稽核规则--不通过的稽核规则全部都是柔性控制; 3:系统稽核检测刚性不通过,系统自动稽核规则--不通过的稽核规则存在刚性控制的; 4:财务稽核检测通过,财务初核时--稽核规则全部通过; 5:财务稽核检测柔性不通过,财务初核时--稽核规则不通过的稽核规则全部都是柔性控制; 6:财务稽核检测刚性不通过,财务初核时--稽核规则不通过的稽核规则存在刚性控制的; 7:无需稽核;) 示例：2
iauditdealstatus	long	否	稽核处理状态(0:待处理;1:通过;2:不通过) 示例：0
displayCode	string	否	异常码

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"ismulticurrency": false,
		"code": "0219",
		"vouchdate": "2021-09-27 00:00:00",
		"cfinaceorg": "2184854309114112",
		"cfinaceorg_name": "北京天元股份有限公司",
		"cfinacecostcenter": "2184854309114112",
		"profitcenter": "2184854309114112",
		"vfinacedeptid": "2184856228794624",
		"vfinacedeptid_name": "筹资部-规划部",
		"caccountorg": "2184854309114112",
		"caccountorg_name": "北京天元股份有限公司",
		"pk_project": "2184864426185472",
		"pk_project_name": "股东大会",
		"pk_busimemo": 2184860029718784,
		"pk_busimemo_name": "华侨招待费",
		"pk_busimemotype": 2184858240700672,
		"vcurrency": "2183687327011840",
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": "2",
		"bustype": "2183687370051850",
		"ntaxmny": 3.87,
		"ntotalmny": 632.74,
		"bustype_name": "差旅费报销单",
		"pk_handlepsn": "2185003811393792",
		"vnatcurrency": "2183687327011840",
		"vnatcurrency_name": "人民币",
		"vnatcurrency_moneyDigit": "2",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_name": "基准汇率",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2021-09-27 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"nnatexpensemny": 628.87,
		"nnattaxmny": 3.87,
		"nnatsummny": 632.74,
		"nnatshouldpaymny": 500,
		"nnatcavmny": 132.74,
		"nnatpaymentmny": 500,
		"nnataccpaymny": 500,
		"pk_handlepsn_name": "王建斌",
		"nnattotalmny": 632.74,
		"vhandledeptid": "2184856228794624",
		"vhandledeptid_name": "筹资部-规划部",
		"chandleorg": "2184854309114112",
		"chandleorg_name": "北京天元股份有限公司",
		"vreason": "测试",
		"nexpensemny": 628.87,
		"nsummny": 632.74,
		"nshouldpaymny": 500,
		"ncavmny": 132.74,
		"npaymentmny": 500,
		"naccpaymny": 500,
		"ishaveloanbill": true,
		"iswithholdingcav": false,
		"isfinished": false,
		"isettlestatus": 0,
		"vmemo": "测试",
		"status": 0,
		"irejectstatus": 0,
		"ibillmakemethod": 0,
		"pk_billtype": "znbzbx_travelexpbill",
		"vattachmentass": "o1LsudfDQ5N7pRhLykZc9aDTz4ZpJsr2",
		"isoverstd": false,
		"vdef2": "测试2",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"creatorId": 2185004199465216,
		"creator": "王建斌",
		"createDate": "2021-09-27 15:27:39",
		"createTime": "2021-09-27 15:27:39",
		"expensebillbs": [
			{
				"isfinished": false,
				"hasDefaultInit": true,
				"pk_busimemo": 2184860029718784,
				"vcurrency": "2183687327011840",
				"vnatcurrency": "2183687327011840",
				"vnatexchratetype": "py7y8nze",
				"dnatexchratedate": "2021-09-27 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": "2",
				"vcurrency_currTypeSign": "?",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"isMatchInvoice": true,
				"nhotelinvtaxmny": 3.87,
				"nothermny": 132.74,
				"pk_handlepsn": "2185003900997888",
				"vhandledeptid": "2184857314742528",
				"chandleorg": "2184855433367808",
				"chandleorg_name": "天津外侨科技有限公司",
				"caccountorg": "2184854309114112",
				"caccountorg_name": "北京天元股份有限公司",
				"cfinaceorg": "2184854309114112",
				"cfinaceorg_name": "北京天元股份有限公司",
				"cfinacecostcenter": "2184854309114112",
				"profitcenter": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"vfinacedeptid_name": "筹资部-规划部",
				"nwelfaredays": 4,
				"iintranswelfaretype": 1,
				"nintransmny": 100,
				"nintransuntaxmny": 100,
				"imealwelfaretype": 1,
				"nmealmny": 100,
				"nmealuntaxmny": 100,
				"nmiscellansexp": 100,
				"ntotalwelfaremny": 100,
				"nhoteldays": 4,
				"ihotelwelfaretype": 1,
				"nhotelmny": 100,
				"nhotelinvuntaxmny": 96.13,
				"ntotalmny": 632.74,
				"ntotaltaxmny": 3.87,
				"ntotaluntaxmny": 628.87,
				"nsummny": 632.74,
				"ntaxmny": 3.87,
				"nexpensemny": 628.87,
				"nshouldpaymny": 500,
				"npaymentmny": 500,
				"naccpaymny": 500,
				"notheruntaxmny": 132.74,
				"pk_handlepsn_name": "毛月",
				"vhandledeptid_name": "外侨办事处-接待部",
				"pk_busimemo_name": "华侨招待费",
				"pk_begaddr_name": "北京市",
				"pk_endaddr_name": "石家庄市",
				"pk_busimemotype": 2184858240700672,
				"nnattransmny": 100,
				"nnattransuntaxmny": 100,
				"nnathotelinvmny": 100,
				"nnathotelmny": 100,
				"nnathotelinvtaxmny": 3.87,
				"nnathotelinvuntaxmny": 96.13,
				"nnatmealmny": 100,
				"nnatmealuntaxmny": 100,
				"nnatintranscostmny": 100,
				"nnatintransmny": 100,
				"nnatintransuntaxmny": 100,
				"nnatmiscellansexp": 100,
				"nnatothermny": 132.74,
				"nnatotheruntaxmny": 132.74,
				"nnattotalwelfaremny": 100,
				"nnatexpensemny": 628.87,
				"nnattaxmny": 3.87,
				"nnatsummny": 632.74,
				"nnatcavmny": 132.74,
				"nnatshouldpaymny": 500,
				"nnatpaymentmny": 500,
				"nnataccpaymny": 500,
				"nnattotalmny": 632.74,
				"nnattotaltaxmny": 3.87,
				"nnattotaluntaxmny": 628.87,
				"nlineno": 10,
				"pk_project": "2184864426185472",
				"pk_project_name": "股东大会",
				"ncavmny": 132.74,
				"pk_memoapply_code": "0018",
				"pk_memoapply": 2186578396598528,
				"vmemoapplybilltype": "znbzbx_busistrip",
				"vapplycurrency": "2183687327011840",
				"vapplycurrency_name": "人民币",
				"vapplycurrency_moneyDigit": "2",
				"napplymny": 0,
				"dbegindate": "2021-09-01 00:00:00",
				"nbusitravalday": 5,
				"denddate": "2021-09-05 00:00:00",
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_endaddr": "bfcb5dbe-5cf3-11e9-817e-7cd30abea0c0",
				"ntransmny": 100,
				"ntransuntaxmny": 100,
				"nhotelinvmny": 100,
				"nstdhotelinvmny": 0,
				"nintranscostmny": 100,
				"vmemo": "测试报销明细",
				"vdef2": "测试2",
				"itranstools": 4,
				"id": 2449861146972417,
				"pk_expensebill": 2449861146972416,
				"pubts": "2021-09-27 15:27:39",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"loancavs": [
			{
				"pk_loanbill": "1598409643230494726",
				"vmemo": "测试",
				"cloanfinacecostcenter": "",
				"loandate": "2022-11-24 00:00:00",
				"nloanmny": "400",
				"vloancurrency_moneyDigit": "3",
				"pk_project": "",
				"profitcenter": "",
				"pk_cusdoc": "",
				"pk_expensebill": "1619970336121421828",
				"bcav": true,
				"id": "",
				"tenant": "2183682413744384",
				"loanno": "PLNS2211240003",
				"cloanfinaceorg": "2534724219212032",
				"nnatuncavmny": "400",
				"vloanfinacedeptid": "2534726016913664",
				"pk_busimemo": "1464090373393481736",
				"yTenantId": "0000KV7VR8GU3W81730000",
				"nnattotalcavmny": "400",
				"vnatcurrency": "2533329091532288",
				"caccountorg": "2643821317837312",
				"nnatexchrate": "1",
				"vloandeptid": "2534726016913664",
				"vnatexchratetype_digit": "6",
				"pk_loanbilltype": "znbzbx_loanbill",
				"nnatcavmny": "0",
				"vloanchandleorg": "1534545738714841092",
				"pk_loanbill_b": "1598409643230494728",
				"nnatbaseexchrate": "1",
				"nuncavmny": "400",
				"vreason": "立项红冲",
				"ncavmny": "0",
				"vnatcurrency_moneyDigit": "3",
				"nnatloanmny": "400",
				"vloancurrency": "2533329091532288",
				"pk_loanpsn": "2534726016913664",
				"ntotalcavmny": "400",
				"dnatexchratedate": "2022-12-12",
				"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
				"vnatcurrency_currTypeSign": "?",
				"nnataccreturnmny": "",
				"pk_memoapply": "1598397651696484358",
				"pk_memoapply_code": "GAPL2211240004",
				"pk_customer": "",
				"vloancurrency_currTypeSign": "?",
				"nnatacccavmny": "0",
				"cloancostcenter": "",
				"pk_apct": "",
				"pk_apct_code": "",
				"pk_apct_plan": "",
				"pk_apct_plan_code": ""
			}
		],
		"expapportions": [
			{
				"hasDefaultInit": true,
				"vfinacedeptid": "2184856228794624",
				"vfinacedeptid_name": "筹资部-规划部",
				"cfinaceorg": "2184854309114112",
				"cfinaceorg_name": "北京天元股份有限公司",
				"cfinacecostcenter": "2184854309114112",
				"profitcenter": "2184854309114112",
				"pk_project": "2184864426185472",
				"caccountorg": "2184854309114112",
				"caccountorg_name": "北京天元股份有限公司",
				"pk_project_name": "股东大会",
				"pk_busimemo": 2184860029718784,
				"pk_busimemo_name": "华侨招待费",
				"pk_busimemotype": 2184858240700672,
				"vcurrency": "2183687327011840",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-27 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"napportmny": 632.74,
				"napporttaxmny": 3.87,
				"napportnotaxmny": 628.87,
				"nnatapportmny": 632.74,
				"nnatapporttaxmny": 3.87,
				"nnatapportnotaxmny": 628.87,
				"napportrate": 100,
				"nlineno": 10,
				"id": 2449861146972420,
				"pk_expensebill": 2449861146972416,
				"pubts": "2021-09-27 15:27:39",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"expsettleinfos": [
			{
				"ipaystartpoint": 1,
				"bcansettlesysmodify": true,
				"bjournalizing": true,
				"iaraptype": 0,
				"hasDefaultInit": true,
				"vbankaccount": "100000022",
				"vbankaccname": "毛月",
				"pk_bankdoc": "2184878273385216",
				"vbankdocname": "用友银行",
				"pk_banktype": "2184875898393344",
				"vbanktypename": "万安洪都村镇银行",
				"pk_currency": "2183687327011840",
				"pk_currency_name": "人民币",
				"accttype": "BAT00001",
				"pk_handlepsnbank": "2185003901210881",
				"pk_handlepsn": "2185003900997888",
				"pk_handlepsn_name": "毛月",
				"igathertype": 0,
				"pk_balatype": 2183682241614081,
				"pk_balatype_name": "银行转账",
				"balatypesrvattr": 0,
				"centerpriseorg": "2184854309114112",
				"centerpriseorg_name": "北京天元股份有限公司",
				"pk_currency_opp": "2183687327011840",
				"pk_currency_opp_name": "人民币",
				"pk_enterprisebankacct": "2325222650122752",
				"pk_enterprisebankacct_name": "1",
				"vbankaccount_opp": "1",
				"vbankaccname_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"vbanktypename_opp": "中国工商银行",
				"pk_bankdoc_opp": "2186831417381637",
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行",
				"accttype_opp": "0",
				"isettlestatus": 0,
				"vcurrency": "2183687327011840",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-27 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_name": "人民币",
				"vsettlecurrency_moneyDigit": "2",
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nlineno": 10,
				"nsummny": 500,
				"nsettlesummny": 500,
				"nnatsettlesummny": 500,
				"id": 2449861146972421,
				"pk_expensebill": 2449861146972416,
				"pubts": "2021-09-27 15:27:39",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"id": 2449861146972416,
		"barCode": "znbzbx_travelexpbill|2449861146972416",
		"pubts": "2021-09-27 15:27:40",
		"tenant": 2183682413744384,
		"yTenantId": "py7y8nze",
		"iauditresult": 2,
		"iauditdealstatus": 0
	},
	"displayCode": ""
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

