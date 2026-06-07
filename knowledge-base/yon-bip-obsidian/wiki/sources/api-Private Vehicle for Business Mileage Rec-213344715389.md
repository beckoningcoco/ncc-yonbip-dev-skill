---
title: "私车公用里程记事保存"
apiId: "2133447153893244929"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Journal Entry"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Journal Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 私车公用里程记事保存

>  请求方式	POST | Expense Journal Entry (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/znbz/rbsm/api/bill/expenserecord/save
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
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	单据号(设置手工编号时必输，自动编号时输入无效) 示例：F24111400005
vouchdate	string	否	是	单据日期(格式：yyyy-MM-dd) 示例：2024-11-14 00:00:00
blongdistance	boolean	否	是	是否长途交通 示例：true
travelalgorithmgranularity	string	否	是	参与行程算法 示例：mileage
dbegindate	date
格式:yyyy-MM-dd	否	是	开始日期 示例：2024-03-01
dbegintime	date
格式:HH:mm:ss	否	是	开始时间 示例：00:00:00
pk_begaddr	string	否	否	出发地id（支持id和code） 示例：bfad101d-5cf3-11e9-817e-7cd30abea0c0
pk_begaddr_name	string	否	否	出发地名称 示例：北京市
pk_beglocation_modify_name	string	否	是	出发地名称（修改后） 示例：北京市东城区北京站
denddate	date
格式:yyyy-MM-dd	否	是	结束日期 示例：2024-03-06
dendtime	date
格式:HH:mm:ss	否	是	结束时间 示例：00:00:00
pk_endaddr	string	否	否	到达城市id 示例：c19282f9-5cf3-11e9-817e-7cd30abea0c0
pk_endaddr_name	string	否	否	到达城市名称 示例：合肥市
bustype	string	否	是	交易类型 示例：1893636924792900673
pk_endlocatin_modify_name	string	否	是	到达地点（修改后） 示例：安徽省合肥市瑶海区合肥站
cfinaceorg	string	否	是	费用承担组织(支持id和code) 示例：1894560634790477825
cfinaceorg_name	string	否	否	费用承担组织名称 示例：my费控1
vfinacedeptid	string	否	是	费用承担部门(支持id和code) 示例：1894561158776487938
vfinacedeptid_name	string	否	否	费用承担部门名称 示例：部门1
caccountorg	string	否	是	会计主体(支持id和code) 示例：1894560634790477825
caccountorg_name	string	否	否	会计主体名称 示例：my费控1
pk_handlepsn	string	否	是	报销人id（支持id和code） 示例：1894563314869469185
pk_handlepsn_name	string	否	否	报销人 示例：毛月
pk_costpsndoc	string	否	否	费用归属人id（支持id和code） 示例：1894563314869469185
pk_costpsndoc_name	string	否	否	费用归属人 示例：毛月
chandleorg	string	否	是	报销人组织（支持id和code） 示例：1894560634790477825
chandleorg_name	string	否	否	报销人组织 示例：my费控1
vhandledeptid	string	否	是	报销人部门id(支持id和code) 示例：1894561158776487938
vhandledeptid_name	string	否	否	报销人部门名称 示例：部门1
pk_busimemo	string	否	否	费用项目id 示例：1893636916201914721
pk_busimemo_name	string	否	否	费用项目 示例：采购费用
pk_project	string	否	否	项目id（支持id和code）
pk_project_name	string	否	否	项目名称
nmileage	number
小数位数:2,最大长度:10	否	是	里程(参考里程) 示例：896.5
nmileagemodify	number
小数位数:2,最大长度:10	否	是	里程(修改后) 示例：896.5
imileageunit	string	否	否	里程单位 示例：0
nrecordsubsidymny	number
小数位数:8,最大长度:20	否	否	记事补贴金额 示例：8965
ninvsummny	number
小数位数:8,最大长度:20	否	否	发票价税合计 示例：626
ninvtaxmny	number
小数位数:8,最大长度:20	否	否	发票可抵扣税额 示例：51.69
ninvuntaxmny	number
小数位数:8,最大长度:20	否	否	发票不含税金额 示例：574.31
nexpensemny	number
小数位数:8,最大长度:20	否	是	可报销金额 示例：626
ntaxmny	number
小数位数:8,最大长度:20	否	否	可抵扣税额 示例：51.69
vcurrency	string	否	否	币种（支持id和code） 示例：1893636916204011568
vcurrency_name	string	否	否	币种名称 示例：人民币
vcurrency_moneyDigit	number
小数位数:8,最大长度:20	否	否	币种金额精度 示例：2
vnatcurrency	string	否	否	组织本币（支持id和code） 示例：1893636916204011568
vnatcurrency_name	string	否	否	组织本币名称 示例：人民币
vnatcurrency_moneyDigit	string	否	否	组织本币金额精度 示例：2
vnatexchratetype	string	否	否	组织本币汇率类型（支持id和code） 示例：0000LQN86NI6G62KUO0000
vnatexchratetype_name	string	否	否	组织本币汇率类型名称 示例：基准汇率
vnatexchratetype_digit	string	否	否	组织本币汇率精度 示例：6
dnatexchratedate	string	否	否	组织本币汇率日期 示例：2024-11-01 00:00:00
nnatbaseexchrate	number
小数位数:8,最大长度:20	否	否	组织本币企业汇率 示例：1
nnatexchrate	number
小数位数:8,最大长度:20	否	否	组织本币汇率 示例：1
nnatrecordsubsidymny	number
小数位数:8,最大长度:20	否	否	记事补贴金额-本币 示例：8965
nnatinvsummny	number
小数位数:8,最大长度:20	否	否	发票价税合计-本币 示例：626
nnatinvtaxmny	number
小数位数:8,最大长度:20	否	否	发票可抵扣税额-本币 示例：51.69
nnatinvuntaxmny	number
小数位数:8,最大长度:20	否	否	发票不含税金额-本币 示例：574.31
nnatexpensemny	number
小数位数:8,最大长度:20	否	否	可报销金额-本币 示例：626
nnattaxmny	number
小数位数:8,最大长度:20	否	否	税额-本币 示例：51.69
creatorId	string	否	否	创建人id(不传值默认YonSuite默认用户) 示例：1894563323466219525
creator	string	否	否	创建人名称 示例：毛月
createDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建日期(格式：yyyy-MM-dd HH:mm:ss) 示例：2024-11-14 15:28:39
createTime	string	否	否	创建时间(格式：yyyy-MM-dd HH:mm:ss) 示例：2024-11-14 15:28:39
vreason	string	否	是	事由 示例：测试
expenserecordbs	object	是	否	里程明细（只能引用里程记录，不能编辑里程内容，可编辑特征）
exprecordinvdetails	object	是	否	费用记事账单明细
_status	string	否	是	操作标识, Insert:新增、Update:更新 Delete:删除 示例：Insert
pk_billtype	string	否	是	单据类型 默认值：znbzbx_expenserecord
id	number
小数位数:0,最大长度:20	否	否	记事id，新增时不填，编辑时必填

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expenserecord/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "F24111400005",
		"vouchdate": "2024-11-14 00:00:00",
		"blongdistance": true,
		"travelalgorithmgranularity": "mileage",
		"dbegindate": "2024-03-01",
		"dbegintime": "00:00:00",
		"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
		"pk_begaddr_name": "北京市",
		"pk_beglocation_modify_name": "北京市东城区北京站",
		"denddate": "2024-03-06",
		"dendtime": "00:00:00",
		"pk_endaddr": "c19282f9-5cf3-11e9-817e-7cd30abea0c0",
		"pk_endaddr_name": "合肥市",
		"bustype": "1893636924792900673",
		"pk_endlocatin_modify_name": "安徽省合肥市瑶海区合肥站",
		"cfinaceorg": "1894560634790477825",
		"cfinaceorg_name": "my费控1",
		"vfinacedeptid": "1894561158776487938",
		"vfinacedeptid_name": "部门1",
		"caccountorg": "1894560634790477825",
		"caccountorg_name": "my费控1",
		"pk_handlepsn": "1894563314869469185",
		"pk_handlepsn_name": "毛月",
		"pk_costpsndoc": "1894563314869469185",
		"pk_costpsndoc_name": "毛月",
		"chandleorg": "1894560634790477825",
		"chandleorg_name": "my费控1",
		"vhandledeptid": "1894561158776487938",
		"vhandledeptid_name": "部门1",
		"pk_busimemo": "1893636916201914721",
		"pk_busimemo_name": "采购费用",
		"pk_project": "",
		"pk_project_name": "",
		"nmileage": 896.5,
		"nmileagemodify": 896.5,
		"imileageunit": "0",
		"nrecordsubsidymny": 8965,
		"ninvsummny": 626,
		"ninvtaxmny": 51.69,
		"ninvuntaxmny": 574.31,
		"nexpensemny": 626,
		"ntaxmny": 51.69,
		"vcurrency": "1893636916204011568",
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"vnatcurrency": "1893636916204011568",
		"vnatcurrency_name": "人民币",
		"vnatcurrency_moneyDigit": "2",
		"vnatexchratetype": "0000LQN86NI6G62KUO0000",
		"vnatexchratetype_name": "基准汇率",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2024-11-01 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"nnatrecordsubsidymny": 8965,
		"nnatinvsummny": 626,
		"nnatinvtaxmny": 51.69,
		"nnatinvuntaxmny": 574.31,
		"nnatexpensemny": 626,
		"nnattaxmny": 51.69,
		"creatorId": "1894563323466219525",
		"creator": "毛月",
		"createDate": "2024-11-14 15:28:39",
		"createTime": "2024-11-14 15:28:39",
		"vreason": "测试",
		"expenserecordbs": [
			{
				"pk_mileagerecord": "1947040805821087747",
				"id": "",
				"_status": "Insert"
			}
		],
		"exprecordinvdetails": [
			{
				"vinvoiceno": "24319166100000036128",
				"vinvoicecode": "",
				"pk_invoicetype": 9987,
				"pk_invoicetype_name": "火车票",
				"pk_consumekind": 9998,
				"pk_consumekind_name": "交通",
				"dopendate": "2024-11-11 00:00:00",
				"nuntaxmny": 574.31,
				"ntaxmny": 51.69,
				"nmny": 626,
				"nservicemny": "",
				"bocrmodify": false,
				"dnatexchratedate": "2024-11-01 00:00:00",
				"nnatbaseexchrate": "",
				"nnatexchrate": 1,
				"vnatcurrency": "1893636916204011568",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "0000LQN86NI6G62KUO0000",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"dcostdate": "2024-11-10 00:00:00",
				"dupdate": "2024-11-12 00:00:00",
				"pk_costaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_costaddr_name": "北京市",
				"pk_costpsndoc": "1894563314869469185",
				"pk_costpsndoc_name": "毛月",
				"pk_seatgrade": 9996,
				"pk_seatgrade_name": "高铁二等座",
				"pk_startaddr": "c10ea0c4-5cf3-11e9-817e-7cd30abea0c0",
				"vcustname": "",
				"vname": "刘硕",
				"vtrainnum": "G28",
				"vuserid": "6590011984****0056",
				"vparentsourcesysid": "",
				"ncadevelopmentfund": "",
				"pk_tallydata": "2132020254078926859",
				"invstatus": 12,
				"nexpmny": 626,
				"collectionWay": 3,
				"ncompanypaymny": "",
				"vcurrency": "1893636916204011568",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"ndeductrate": 9,
				"pk_taxrate": "",
				"nservicetaxrate": "",
				"ndeducttaxmny": 51.69,
				"nservicetaxmny": 0,
				"nnatuntaxmny": 574.31,
				"nnattaxmny": 51.69,
				"nnatmny": 626,
				"nnatdeducttaxmny": 51.69,
				"nnatservicemny": 0,
				"nnatservicetaxmny": 0,
				"nnatcompanypaymny": 0,
				"nnatexpmny": 626,
				"_status": "Insert",
				"id": ""
			}
		],
		"_status": "Insert",
		"pk_billtype": "",
		"id": 0
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
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
displayCode	string	否	异常码

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {},
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
	2	2025-03-05	
更新
请求参数 nexpensemny
更新
请求参数 expenserecordbs
更新
请求参数 nuntaxmny
删除
请求参数 nexpmny
修改文档字段描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

