---
title: "三方消费账单保存"
apiId: "1768279920470392834"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tripartite Consumption Invoice"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tripartite Consumption Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 三方消费账单保存

>  请求方式	POST | Tripartite Consumption Invoice (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/consumecheck/save
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
allCount	int	否	是	子表总数量(用于验证单据是否传输完成) 示例：1
id	long	否	否	单据id(_status为Update时必填)
bustype	string	否	否	交易类型(支持Id和code) 示例：RBSM018
isourcemode	string	否	否	来源(0代表OpenApi传入) 示例：0 默认值：0
vsourcesyscode	string	否	是	来源系统编码 示例：SLY
vsourcesysname	string	否	是	来源系统名称 示例：商旅云
vthirdsysflag	string	否	是	来源系统标识 示例：tripcloud
pk_thirdsysbill	string	否	是	来源系统单据ID 示例：yytest101200001_1
dvouchdate	Date	否	是	创建日期 示例：2023-10-17 00:00:00
vbillperiod	string	否	是	账单期间 示例：2023-08
vbillcode	string	否	是	账单编号 示例：yytest101200001_1
caccountorg	string	否	是	会计主体ID(支持id和code)) 示例：2536246218019840
pk_cusdoc	string	否	是	供应商ID(支持id和code) 示例：1680078497861074944
dbillbegindate	Date	否	是	账单开始日期 示例：2023-08-01 00:00:00
dbillenddate	Date	否	是	账单截止日期 示例：2023-08-31 00:00:00
vbillmemo	string	否	是	账单说明 示例：同程-2-10账单
pk_handlepsn	string	否	是	经办人ID(支持id和code)) 示例：41730146301177856
chandleorg	string	否	是	经办人组织ID(支持Id和code)) 示例：2536246218019840
vhandledeptid	string	否	是	经办人部门ID(支持Id和code)) 示例：2536246958018816
ninvoicemny	BigDecimal	否	是	本期账单金额(小数位为2位) 示例：2062.5
ndeducttaxmny	BigDecimal	否	是	可抵扣税额(小数位为2位) 示例：71
nuntaxmny	BigDecimal	否	是	不含税金额(小数位为2位) 示例：1991.5
ntotalservicemny	BigDecimal	否	是	服务费总额(小数位为2位) 示例：5
ntrainservicemny	BigDecimal	否	否	火车服务费(小数位为2位) 示例：20
ntraininvoicemny	BigDecimal	否	否	账单金额-火车(小数位为2位) 示例：844.5
ntraindeducttaxmny	BigDecimal	否	否	可抵扣税额-火车(小数位为2位) 示例：47.8
ntrainuntaxmny	BigDecimal	否	否	不含税金额-火车(小数位为2位) 示例：796.7
nflightservicemny	BigDecimal	否	否	飞机服务费(小数位为2位) 示例：5
nflightinvoicemny	BigDecimal	否	否	账单金额-飞机(小数位为2位) 示例：678
nflightdeducttaxmny	BigDecimal	否	否	可抵扣税额-飞机(小数位为2位) 示例：19.75
nflightuntaxmny	BigDecimal	否	否	不含税金额-飞机(小数位为2位) 示例：658.25
nhotelservicemny	BigDecimal	否	否	酒店服务费(小数位为2位) 示例：5
nhotelinvoicemny	BigDecimal	否	否	账单金额-酒店(小数位为2位) 示例：510
nhoteldeducttaxmny	BigDecimal	否	否	可抵扣税额-酒店(小数位为2位) 示例：0
nhoteluntaxmny	BigDecimal	否	否	不含税金额-酒店(小数位为2位) 示例：510
ncarservicemny	BigDecimal	否	否	用车服务费(小数位为2位) 示例：5
ncarinvoicemny	BigDecimal	否	否	账单金额-用车(小数位为2位) 示例：30
ncardeducttaxmny	BigDecimal	否	否	可抵扣税额-用车(小数位为2位) 示例：3.45
ncaruntaxmny	BigDecimal	否	否	不含税金额-用车(小数位为2位) 示例：26.55
vcurrency	string	否	是	币种ID(支持Id和code) 示例：2533086218409216
invoicenum	int	否	是	订单数量 示例：7
creatorId	string	否	是	创建人Id 示例：2608134158180096
vdef1	string	否	否	自定义项1(支持vdef1~vdef10，可自行添加自定义项)
ndefnum1	BigDecimal	否	否	自定义项小数1(支持ndefnum1~ndefnum5，可自行添加自定义项小数)
consumecheckbs	object	是	是	三方消费账单子表集合
_status	string	否	是	操作标识, Insert:新增、Update:更新 示例:Insert 示例：Insert

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/consumecheck/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"allCount": 1,
		"id": 0,
		"bustype": "RBSM018",
		"isourcemode": "0",
		"vsourcesyscode": "SLY",
		"vsourcesysname": "商旅云",
		"vthirdsysflag": "tripcloud",
		"pk_thirdsysbill": "yytest101200001_1",
		"dvouchdate": "2023-10-17 00:00:00",
		"vbillperiod": "2023-08",
		"vbillcode": "yytest101200001_1",
		"caccountorg": "2536246218019840",
		"pk_cusdoc": "1680078497861074944",
		"dbillbegindate": "2023-08-01 00:00:00",
		"dbillenddate": "2023-08-31 00:00:00",
		"vbillmemo": "同程-2-10账单",
		"pk_handlepsn": "41730146301177856",
		"chandleorg": "2536246218019840",
		"vhandledeptid": "2536246958018816",
		"ninvoicemny": 2062.5,
		"ndeducttaxmny": 71,
		"nuntaxmny": 1991.5,
		"ntotalservicemny": 5,
		"ntrainservicemny": 20,
		"ntraininvoicemny": 844.5,
		"ntraindeducttaxmny": 47.8,
		"ntrainuntaxmny": 796.7,
		"nflightservicemny": 5,
		"nflightinvoicemny": 678,
		"nflightdeducttaxmny": 19.75,
		"nflightuntaxmny": 658.25,
		"nhotelservicemny": 5,
		"nhotelinvoicemny": 510,
		"nhoteldeducttaxmny": 0,
		"nhoteluntaxmny": 510,
		"ncarservicemny": 5,
		"ncarinvoicemny": 30,
		"ncardeducttaxmny": 3.45,
		"ncaruntaxmny": 26.55,
		"vcurrency": "2533086218409216",
		"invoicenum": 7,
		"creatorId": "2608134158180096",
		"vdef1": "",
		"ndefnum1": 0,
		"consumecheckbs": [
			{
				"id": 0,
				"vtriptype": "car",
				"vorderid": "345701656702222336",
				"vordercode": "C_764861928878112768",
				"vparentorderid": "C_764861928878112768",
				"vorgorderid": "C_764861928878112768",
				"vorderstatus": "N",
				"vbooker": "41730146301177856",
				"vbookerphone": "15566666666",
				"dbookdate": "2023-10-12 00:00:00",
				"vinvoiceno": "C_764861928878112768",
				"vtravelerid": "41730146301177856",
				"vpassenger": "刘家安",
				"vcardtype": "中国居民身份证",
				"vcardnum": "31011019560416545X",
				"cfinaceorg": "2536246218019840",
				"vfinacedeptid": "2536246958018816\"",
				"pk_project": "2655024660223744",
				"nticketmny": 832.5,
				"ncadevelopmentfund": 0,
				"nfuelsurcharge": 0,
				"nexpressfee": 0,
				"ninsurance": 0,
				"nservicemny": 5,
				"nrefundfee": 0,
				"nchangefee": 0,
				"ngrabticketfee": 0,
				"nsentticketfee": 0,
				"ntaxfee": 3.45,
				"npaperticketfee": 0,
				"nordermny": 30,
				"npaymentmny": 510,
				"nprice": 0,
				"nstandardprice": 510,
				"vdiscount": "0",
				"ntotalunservicemny": 505,
				"vcurrency": "2533086218409216",
				"vpaytype": "prePay",
				"ncompanypaymny": 30,
				"npersonpayprice": 0,
				"ndeducttaxmny": 3.45,
				"nuntaxmny": 26.55,
				"vairline": "东方航空",
				"vairtype": "直达航班",
				"vtrainno": "G422",
				"vlevelname": "经济仓",
				"departuredate": "2023-10-12 17:55:00",
				"departuretime": "2023-10-12 00:00:00",
				"dhappentime": "2023-10-12 15:58:29",
				"darrivaldate": "2023-10-12 20:53:00",
				"darrivaltime": "2023-10-12 00:00:00",
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"vstartaddr": "北京南站",
				"pk_endaddr": "bfbcef54-5cf3-11e9-817e-7cd30abea0c0",
				"vdestaddr": "天津站",
				"itranstools": 1,
				"dhotelindate": "2023-10-12 00:00:00",
				"dhoteloutdate": "2023-10-13 00:00:00",
				"vhoteltype": "经济型",
				"vhotelname": "七天连锁酒店",
				"ninnightnum": 1,
				"vstarts": "4",
				"nroomnum": 1,
				"vroomtype": "大床房",
				"icarscenario": 1,
				"vtrainseat": "5",
				"vusecarsrv": "宝马535",
				"vlicenseplate": "鄂A888888",
				"nmileage": 5,
				"vrefundreason": "有事",
				"vchangereason": "有事",
				"isDomc": 1,
				"vpremiumreason": "距离较远",
				"vdef1": "",
				"ndefnum1": 0,
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
code	string	否	返回编码 示例：200
displayCode	string	否	异常码
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
id	long	否	单据ID 示例：2381855452254464

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"id": 2381855452254464
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

