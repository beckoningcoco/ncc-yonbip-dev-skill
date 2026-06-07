---
title: "待结算数据导入-批量代发业务"
apiId: "1841869271656300546"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Pending Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Pending Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 待结算数据导入-批量代发业务

>  请求方式	POST | Data Pending Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/api/datasettled/innerAccessDetail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
wdataOrigin	string	否	是	数据来源，只支持第三方 示例：20 默认值：20
publicPrivate	short	否	否	对公对私：2：对公，1：对私 示例：2
oribilldate	Date	否	是	原单据日期
recpaytype	string	否	是	收付类型 收款1 付款 2 示例：2
expectPayDate	Date	否	否	期望日期
oricurrency_code	string	否	否	原币币种编码 示例：CNY
oricurrency	string	否	否	原币币种id 示例：1815794130058480086
oriCurrencyAmount	BigDecimal	否	是	原币金额 示例：100
natcurrency_code	string	否	否	本币币种编码 示例：CNY
natcurrency	string	否	否	本币币种id 示例：1815794130058480086
tradeType_code	string	否	否	交易类型编码 示例：stwb_datasettledlist
tradeType	string	否	否	交易类型id 示例：1499503976625209348
businessBillType	string	否	是	业务单据类型, 其他收款单（6）、其他单笔付款单（8）、其他批量付款单（9） 示例：6
businessBillNum	string	否	是	第三方业务单据编号 示例：test01
businessId	string	否	是	第三方业务单据id
businessdetailsid	string	否	是	第三方业务单据明细id+来源系统+单据类型需要唯一
issettlementcanmodified	string	否	是	是否结算方式可修改 示例：1
expectsettlemethod_code	string	否	否	期望结算方式编码 示例：system_0001
expectsettlemethod	string	否	否	期望结算方式id 示例：1815794155828281464
issinglebatch	string	否	是	单笔/批量 0单笔 1批量 示例：1
remark	string	否	否	备注 示例：备注
enterpriseBankAccount_code	string	否	否	本方银行账号编码 示例：00001
enterpriseBankAccount	string	否	否	本方银行账号id 示例：1817927423115657219
openwsettlestatus	string	否	是	来源数据结算状态 一般结算 0 自动结算 1 已结算补单 2 示例：2
paySettlementMode	string	否	否	付款结算模式 主动结算1 对方付款2 示例：1
issplit	string	否	否	是否可拆分 否 0 是 1 示例：0
ismerge	string	否	否	是否可合并结算 否 0 是 1 示例：0
isjournalregistered	string	否	是	是否登记日记账 否 0 是 1 示例：0
isGenerateVoucher	string	否	否	是否生成结算凭证 否 0 是 1 示例：0
linkpayment	string	否	否	是否联动支付 否 0 是 1 示例：0
batchtype	string	否	是	批量代发类型 （"PROXYSALARY", "代发工资"),("BYXH", "代发通讯费"), ("BYXG", "代发交通费"), ("BYXF", "代发差旅费"), ("BYXK", "代发餐费"),("BYXM", "代发会议费"),("BYXN", "代发招待费"),("BYWK", "代发加班费"); 示例：PROXYSALARY
csplBizCode	string	否	否	资金计划业务对照编码
csplProject	string	否	否	资金计划项目ID（计划编制子表ID）
batchcount	string	否	否	批量总笔数 示例：1
csplSummaryDetail	string	否	否	资金计划明细主键id
externaloutdefine1	string	否	是	外部系统自定义字段 传1才会插入数据 示例：1
agencyProvideVOList	object	是	否	收方对象集合
recbankid	string	否	否	收方银行账号id 示例：1817277268166180872
recbankno	string	否	是	收方银行账号 示例：66666
oricurrencyamount	BigDecimal	否	是	金额 示例：100
postscript	string	否	否	附言 示例：附言
purpose	string	否	否	用途 示例：用途
dept	string	否	否	部门 示例：1815803570402885637
staff	string	否	否	员工id 示例：1824843222427893763
staffCode	string	否	否	员工编码 示例：00000002
personName	string	否	否	姓名 示例：王小二
certType	string	否	否	证件类型 示例：证件
certNo	string	否	否	证件号码 示例：666666
recaccountname	string	否	是	收款账户名称 示例：test01
bankname	string	否	否	收方银行网点 示例：中国银行北京支行
recbankcombine	string	否	否	收方银行联行号 示例：666666
bussBatchDetailId	string	否	是	子表业务明细id
oppAccType	string	否	否	对方账户类型（现金=2，银行=3，虚拟=4） 为空时取银行） 示例：2
accentity_code	string	否	否	资金组织编码 示例：ZSZB
accentity	string	否	否	资金组织id 示例：1815802977668562947
isdirectacc	boolean	否	否	是否直联支付 示例：false
dataSettledCrossBorder	object	否	否	待结算数据跨境信息
recbankswift	string	否	否	收款银行SWIFT码 示例：字符串类型
paybankcountry	string	否	否	付款银行所在国家(地区)
recbankcountry	string	否	否	收款银行所在国家(地区) 示例：对应国家档案的主键
reccity	string	否	否	收方城市 示例：对应城市档案的主键
recaddress	string	否	否	收方地址 示例：字符串类型
recaccountnamenoncn	string	否	否	收款银行户名(非中文)
recbanknamenoncn	string	否	否	收款开户行名(非中文)
recbankaddressnoncn	string	否	否	收款开户行地址(非中文)
receivercountry	string	否	否	收款人常驻国家(地区) 示例：对应国家档案的主键
urgentFlag	string	否	否	加急标志 示例：H High(快),L Low(慢),N Normal(正常)
paymenttype	string	否	否	付款类型 示例：A 预付货款 C 信用卡支付 F 资金转移 H 分期付款 L 贷款支付 O 其他 P 货到付款 R 退款 S 信贷资金支付 T 非信贷资金支付
paymentnature	string	否	否	付款性质 示例：保税区 A, 出口加工区 B, 钻石交易所 C, 其他特殊经济区域 D, 深加工结转 E, 经常项目贸易 F, 经常项目非贸易 G, 资本项目 H, 代理进口 I, 其他(默认) J, 保税监管区域 K, 离岸账户 L
remittancepurpose	string	否	否	汇款用途 示例：货物运输费 C0, 货款 C1 , 货物运输费 C2, 运营服务租赁费 C3, 旅费(个人/商务) C4, 通讯服务 C5, 电子设备的建设及安装 C6, 保险类服务 C7, 金融类服务 C8, 电脑资讯服务 C9, 特许费(涉及版权、专利权等) CA, 进出口贸易 CB, 行政管理费 CC, 研发费(研究及发展) CD, 建筑设计、工程和其他技术方面的服务费 CE, 农业、采矿业、实地加工业服务费 CF, 商务服务费 CG, 律师费 CH , 会计费 CI , 管理咨询服务费 CJ,
isagencybank	number
小数位数:0,最大长度:1	否	否	是否通过代理行 示例：0为否，1为是
agencybankaccount	string	否	否	代理行账号
agencybankname	string	否	否	代理行名称
agencybankaddress	string	否	否	代理行地址
agencybankcountry	string	否	否	代理行所在国家(地区) 示例：对应国家档案的主键
agencybankswift	string	否	否	代理行SWIFT码
bankexpense	string	否	否	银行费用
chargingmethod	string	否	否	手续费/代理费收取方式 示例：BEN 收款人,OUR 汇款人,SHA 共同
chargingbankaccount	string	否	否	银行费用扣费银行账号 示例：对应企业银行账户档案主键
foreignchargingbankaccount	string	否	否	银行费用扣费银行账号(外币) 示例：对应企业银行账户档案主键
isbondedgoodspay	number
小数位数:0,最大长度:1	否	否	是否为保税货物项下付款 示例：0为否，1为是
contractnumber	string	否	否	合同号
invoicenumber	string	否	否	发票号
exchangeratecontract	string	否	否	汇率合约
extendscript	string	否	否	扩展附言
usercomment	string	否	否	用户说明
fileinfo	string	否	否	文件信息(文件名)
appliername	string	否	否	申请人姓名
appliercontactinfo	string	否	否	申请人联系方式
transactioncodeA	string	否	否	交易编码1
transactioncurrencyA	string	否	否	交易币种1 示例：对应币种档案主键
transactionamountA	string	否	否	交易金额1
tradepostscriptA	string	否	否	交易附言1
transactioncodeB	string	否	否	交易编码2
transactioncurrencyB	string	否	否	交易币种2
transactionamountB	string	否	否	交易金额2
tradepostscriptB	string	否	否	交易附言2
organizationCode	string	否	否	组织机构代码
recPerCountryCode	string	否	否	收款方常驻国家地区代码
OriDeclarationNum	string	否	否	原申报号
remitAddress	string	否	否	汇款人地址
capitalSource	string	否	否	资金来源
ncPayBankAccName	string	否	否	付方银行户名(非中文)
regionNo	string	否	否	外汇局批件号/备案号/业务编号

## 3. 请求示例

Url: /yonbip/ctm/api/datasettled/innerAccessDetail?access_token=访问令牌
Body: {
	"wdataOrigin": "20",
	"publicPrivate": 2,
	"oribilldate": "",
	"recpaytype": "2",
	"expectPayDate": "",
	"oricurrency_code": "CNY",
	"oricurrency": "1815794130058480086",
	"oriCurrencyAmount": 100,
	"natcurrency_code": "CNY",
	"natcurrency": "1815794130058480086",
	"tradeType_code": "stwb_datasettledlist",
	"tradeType": "1499503976625209348",
	"businessBillType": "6",
	"businessBillNum": "test01",
	"businessId": "",
	"businessdetailsid": "",
	"issettlementcanmodified": "1",
	"expectsettlemethod_code": "system_0001",
	"expectsettlemethod": "1815794155828281464",
	"issinglebatch": "1",
	"remark": "备注",
	"enterpriseBankAccount_code": "00001",
	"enterpriseBankAccount": "1817927423115657219",
	"openwsettlestatus": "2",
	"paySettlementMode": "1",
	"issplit": "0",
	"ismerge": "0",
	"isjournalregistered": "0",
	"isGenerateVoucher": "0",
	"linkpayment": "0",
	"batchtype": "PROXYSALARY",
	"csplBizCode": "",
	"csplProject": "",
	"batchcount": "1",
	"csplSummaryDetail": "",
	"externaloutdefine1": "1",
	"agencyProvideVOList": [
		{
			"recbankid": "1817277268166180872",
			"recbankno": "66666",
			"oricurrencyamount": 100,
			"postscript": "附言",
			"purpose": "用途",
			"dept": "1815803570402885637",
			"staff": "1824843222427893763",
			"staffCode": "00000002",
			"personName": "王小二",
			"certType": "证件",
			"certNo": "666666",
			"recaccountname": "test01",
			"bankname": "中国银行北京支行",
			"recbankcombine": "666666",
			"bussBatchDetailId": ""
		}
	],
	"oppAccType": "2",
	"accentity_code": "ZSZB",
	"accentity": "1815802977668562947",
	"isdirectacc": false,
	"dataSettledCrossBorder": {
		"recbankswift": "字符串类型",
		"paybankcountry": "",
		"recbankcountry": "对应国家档案的主键",
		"reccity": "对应城市档案的主键",
		"recaddress": "字符串类型",
		"recaccountnamenoncn": "",
		"recbanknamenoncn": "",
		"recbankaddressnoncn": "",
		"receivercountry": "对应国家档案的主键",
		"urgentFlag": "H\tHigh(快),L\tLow(慢),N\tNormal(正常)",
		"paymenttype": "A\t预付货款 C\t信用卡支付 F\t资金转移 H\t分期付款 L\t贷款支付 O\t其他 P\t货到付款 R\t退款 S\t信贷资金支付 T\t非信贷资金支付",
		"paymentnature": "保税区\tA, 出口加工区\tB, 钻石交易所\tC, 其他特殊经济区域\tD, 深加工结转\tE, 经常项目贸易\tF, 经常项目非贸易\tG, 资本项目\tH, 代理进口\tI, 其他(默认)\tJ, 保税监管区域\tK, 离岸账户\tL",
		"remittancepurpose": "货物运输费\tC0, 货款\tC1    , 货物运输费\tC2, 运营服务租赁费\tC3, 旅费(个人/商务)\tC4, 通讯服务\tC5, 电子设备的建设及安装\tC6, 保险类服务\tC7, 金融类服务\tC8, 电脑资讯服务\tC9, 特许费(涉及版权、专利权等)\tCA, 进出口贸易\tCB, 行政管理费\tCC, 研发费(研究及发展)\tCD, 建筑设计、工程和其他技术方面的服务费\tCE, 农业、采矿业、实地加工业服务费\tCF, 商务服务费\tCG, 律师费\tCH    , 会计费\tCI    , 管理咨询服务费\tCJ,",
		"isagencybank": NaN,
		"agencybankaccount": "",
		"agencybankname": "",
		"agencybankaddress": "",
		"agencybankcountry": "对应国家档案的主键",
		"agencybankswift": "",
		"bankexpense": "",
		"chargingmethod": "BEN\t收款人,OUR\t汇款人,SHA\t共同",
		"chargingbankaccount": "对应企业银行账户档案主键",
		"foreignchargingbankaccount": "对应企业银行账户档案主键",
		"isbondedgoodspay": NaN,
		"contractnumber": "",
		"invoicenumber": "",
		"exchangeratecontract": "",
		"extendscript": "",
		"usercomment": "",
		"fileinfo": "",
		"appliername": "",
		"appliercontactinfo": "",
		"transactioncodeA": "",
		"transactioncurrencyA": "对应币种档案主键",
		"transactionamountA": "",
		"tradepostscriptA": "",
		"transactioncodeB": "",
		"transactioncurrencyB": "",
		"transactionamountB": "",
		"tradepostscriptB": "",
		"organizationCode": "",
		"recPerCountryCode": "",
		"OriDeclarationNum": "",
		"remitAddress": "",
		"capitalSource": "",
		"ncPayBankAccName": "",
		"regionNo": ""
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
wdataOrigin	string	否	数据来源
accentity	string	否	资金组织id
businessbilltype	string	否	业务单据类型；转账付款单 0,转账收款单 1,通用报销单 2,退款单 3,其他收款单 6,收款单 7,其他单笔付款单 8,其他批量付款单 9,付款单 10,差旅费报销单 11,对公预付单 12,还款单 13,个人借款单 14,薪资支付单 15,代理付款单 16,代理收款单 17, 融入单 18, 还本单19,付息单 20,申购单21,赎回单22,收息单 23,资金收款单25,资金付款单26,收款退款单27,付款退款单 28,项目付款单29,资金调度归集付款单 101,资金调度归集收款单 102,资金调度下
businessbillnum	string	否	业务单据编号
businessId	string	否	业务单据id
businessdetailsid	string	否	业务单据明细id
tradetype	string	否	交易类型id
recpaytype	string	否	收付类型 收款1 付款 2
oribilldate	string	否	原单据日期
oricurrency	string	否	原币币种
oricurrencyamount	BigDecimal	否	原币金额
natcurrency	string	否	本币币种
exchangerate	double	否	汇率
natSum	BigDecimal	否	本币金额
issinglebatch	string	否	单笔/批量 单笔 0 批量 1
expectpaydate	Date	否	期望日期
toaccnttype	string	否	对方类型 客户 1 供应商 2 人员 3 其他 4
showtoaccntname	string	否	对方名称
counterpartybankaccount	string	否	对方银行账号
showoppositebankaccount	string	否	对方银行账户
showoppositebankaccountname	string	否	对方账户名称
showoppositebankname	string	否	对方账户开户行名称
showoppositebanklineno	string	否	对方账户开户行
expectsettlemethod	string	否	期望结算方式id
enterpriseBankAccount	string	否	本方银行账号id
openwsettlestatus	string	否	来源数据结算状态 一般结算 0 自动结算 1 已结算补单 2
issettlementcanmodified	string	否	是否结算方式可修改 是 1 否 0
isjournalregistered	string	否	是否登记日记账 是1 否 0
externaloutdefine1	string	否	外部系统自定义字段
issplit	string	否	是否可拆分结算 否 0 是 1
ismerge	string	否	是否可合并结算 否 0 是 1
isGenerateVoucher	string	否	是否生成结算凭证 否 0 是 1
_status	string	否	操作标识
oppositeBankType	string	否	对方银行类别
index	long	否	顺序
serviceAttr	long	否	结算方式 银行业务 0 现金业务 1 票据业务 2 支票 8
linkpayment	string	否	联动支付 是 1 否 0
isIncomeAndExpenditure	boolean	否	是否统收统支 是 true 否 false
successsettlementamount	BigDecimal	否	结算成功金额
isRelateCheckBill	string	否	是否关联对账单 否 0 是 1
receivedate	Date	否	接收日期
id	long	否	生成待结算单据ID
createDate	Date	否	创建日期
createTime	DateTime	否	创建时间
creator	string	否	创建人
modifyDate	Date	否	修改日期
modifyTime	Date	否	修改时间
modifier	string	否	修改人
wsettlestatus	string	否	待结算数据状态 一般结算0 自动结算1 已结算补单2
wsettlementresult	string	否	待结算数据结果 全部成功0 部分成功1 全部失败2 空3
pendingmode	string	否	待处理方式 待处理0 待重新生单1 待业务处理2 成功3
vouchdate	string	否	单据日期
code	string	否	待结算单据编码
tenant	long	否	租户ID
ytenant	string	否	友互通租户ID
dataSettledBatchDetailReqVO	object	是	批量代发明细
amount	BigDecimal	否	金额
bankname	string	否	收款银行网点
banknetId	string	否	收款银行网点id
bussBatchDetailId	string	否	子表业务明细id
certcode	string	否	证件号码
certtype	string	否	证件类型
dept	string	否	部门id
isrefund	short	否	是否退票
paystatus	short	否	支付状态
postscript	string	否	附言
purpose	string	否	用途
recaccountname	string	否	收款账户名称
recbankcombine	string	否	收款银行联行号
recbankno	string	否	收款银行账号
recbankid	string	否	收款银行账户id
staffcode	string	否	员工编码
staffId	string	否	员工Id

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"wdataOrigin": "",
		"accentity": "",
		"businessbilltype": "",
		"businessbillnum": "",
		"businessId": "",
		"businessdetailsid": "",
		"tradetype": "",
		"recpaytype": "",
		"oribilldate": "",
		"oricurrency": "",
		"oricurrencyamount": 0,
		"natcurrency": "",
		"exchangerate": 0,
		"natSum": 0,
		"issinglebatch": "",
		"expectpaydate": "",
		"toaccnttype": "",
		"showtoaccntname": "",
		"counterpartybankaccount": "",
		"showoppositebankaccount": "",
		"showoppositebankaccountname": "",
		"showoppositebankname": "",
		"showoppositebanklineno": "",
		"expectsettlemethod": "",
		"enterpriseBankAccount": "",
		"openwsettlestatus": "",
		"issettlementcanmodified": "",
		"isjournalregistered": "",
		"externaloutdefine1": "",
		"issplit": "",
		"ismerge": "",
		"isGenerateVoucher": "",
		"_status": "",
		"oppositeBankType": "",
		"index": 0,
		"serviceAttr": 0,
		"linkpayment": "",
		"isIncomeAndExpenditure": true,
		"successsettlementamount": 0,
		"isRelateCheckBill": "",
		"receivedate": "",
		"id": 0,
		"createDate": "",
		"createTime": "",
		"creator": "",
		"modifyDate": "",
		"modifyTime": "",
		"modifier": "",
		"wsettlestatus": "",
		"wsettlementresult": "",
		"pendingmode": "",
		"vouchdate": "",
		"code": "",
		"tenant": 0,
		"ytenant": "",
		"dataSettledBatchDetailReqVO": [
			{
				"amount": 0,
				"bankname": "",
				"banknetId": "",
				"bussBatchDetailId": "",
				"certcode": "",
				"certtype": "",
				"dept": "",
				"isrefund": 0,
				"paystatus": 0,
				"postscript": "",
				"purpose": "",
				"recaccountname": "",
				"recbankcombine": "",
				"recbankno": "",
				"recbankid": "",
				"staffcode": "",
				"staffId": ""
			}
		]
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
500	参考message提示	根据message提示修改请求数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-04	
更新
请求参数 (42)
原单据日期为必填项
	2	2025-09-10	
新增
请求参数 (48)
删除
请求参数 dataSettledCharacterSys
更新
返回参数 (73)
超时时间修改。
	3	2025-07-08	
新增
请求参数 dataSettledCharacterSys
删除
请求参数 fundPurposeId
删除
请求参数 fundPurposeCode
更新
返回参数 (73)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

