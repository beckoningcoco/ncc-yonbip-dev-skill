---
title: "新增质检信息"
apiId: "b64fe5f7ea7c4c39aa9e6c36fb5d747f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quality Inspection Result"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quality Inspection Result]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增质检信息

>  请求方式	POST | Quality Inspection Result (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectioninfoapi/insertInspectInfo
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
data	object	是	是	质检信息数据
pk_apply_org	string	否	否	请检组织id,请检组织id和请检组织编码不能同时为空，id和编码同时存在，以id为准 示例：2296731543949568
pk_apply_org_code	string	否	否	请检组织编码,请检组织id和请检组织编码不能同时为空，id和编码同时存在，以id为准
check_sourcetrowID	string	否	是	请检单据行id：完工报告行id/到货单行id/工序任务汇报id/委外到货单行id/销售发货行id/销售退货行id 示例：2373711808401665
check_sourcetype	string	否	是	请检单据类型：pu_arrivalorder-采购到货，po_finishedreport-完工报告，IMPSFC_proceTaskReport-工序任务汇报，po_osm_arrive_order-委外到货，voucher_delivery-销售发货，voucher_salereturn-销售退货 示例：po_finishedreport
num	double	否	是	请检单据数量：到货单-到货数量，完工报告-完工数量,工序任务汇报-完成数量 示例：100
dataList	object	是	是	质检信息明细集合

## 3. 请求示例

Url: /yonbip/imcs/inspectioninfoapi/insertInspectInfo?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_apply_org": "2296731543949568",
			"pk_apply_org_code": "",
			"check_sourcetrowID": "2373711808401665",
			"check_sourcetype": "po_finishedreport",
			"num": 100,
			"dataList": [
				{
					"pk_org": "2296731543949568",
					"orgCode": "",
					"check_sourcetype": "po_finishedreport",
					"check_sourcetnum": "WGBG20210804000001",
					"check_sourcetindex": "",
					"check_sourcetID": "2373711808401664",
					"check_sourcetrowID": "2373711808401665",
					"insres_sourcetype": "",
					"insres_sourcenum": "",
					"insres_sourceID": "",
					"insres_sourceBodyID": "",
					"inspectType": "002",
					"inspectDate": "2021-09-05 00:00:00",
					"pk_dept": "",
					"deptCode": "",
					"pk_initmaterial": 2297533966323968,
					"initmaterialCode": "",
					"main_num": 10,
					"treat_method": "2315035088359680",
					"treatmethodCode": "",
					"is_qualified": false,
					"is_storage": false,
					"pk_baditem": "2301226605613312",
					"baditemCode": "",
					"pk_inventorystate": 2281541914235490,
					"pk_material": 2297533966323968,
					"materialCode": "",
					"pk_batchcode": "PCDA0000000020220607000002",
					"workCenterId": "1458847876213374982",
					"workCenterCode": "",
					"orderProcessId": "1476677539725312009",
					"orderProcessCode": "",
					"orderProcessSn": "10",
					"batchno": "",
					"product_date": "",
					"shelflife": 0,
					"shelflife_unit": "1",
					"valid_until": "",
					"changed_product_date": "",
					"changed_shelflife": 0,
					"changed_shelflife_unit": "1",
					"changed_valid_until": "",
					"h_define1": "",
					"h_define2": "",
					"h_define3": "",
					"h_define4": "",
					"h_define5": "",
					"h_define6": "",
					"h_define7": "",
					"h_define8": "",
					"h_define9": "",
					"h_define10": "",
					"h_define11": "",
					"h_define12": "",
					"h_define13": "",
					"h_define14": "",
					"h_define15": "",
					"h_define16": "",
					"h_define17": "",
					"h_define18": "",
					"h_define19": "",
					"h_define20": "",
					"h_define21": "",
					"h_define22": "",
					"h_define23": "",
					"h_define24": "",
					"h_define25": "",
					"h_define26": "",
					"h_define27": "",
					"h_define28": "",
					"h_define29": "",
					"h_define30": ""
				}
			]
		}
	]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	long	否	接口调用返回码，成功时返回200 示例：200
message	string	否	接口调用返回信息 示例：操作成功
data	object	是	接口调用返回数据
check_sourcetnum	string	否	请检单据号 示例：WGBG20210804000001
inspectType	string	否	检验类型：001-采购检验，002-产品检验，003-在库检验，004-发货检验，005-退货检验，007-委外检验，008-工序检验，009-工序委外检验 示例：002
main_num	double	否	数量 示例：10
inspectDate	string	否	检验日期 示例：2021-09-05 00:00:00
createmethod	string	否	创建方式：0-系统创建，1-手工创建，2-外部质检系统 示例：1
check_sourcetype	string	否	请检来源单据类型：pu_arrivalorder-采购到货，po_finishedreport-完工报告，IMPSFC_proceTaskReport-工序任务汇报，po_osm_arrive_order-委外到货，voucher_delivery-销售发货，voucher_salereturn-销售退货 示例：po_finishedreport
check_sourcetID	string	否	请检来源单据id：完工报告id/到货单id/工序任务汇报id/委外到货单id/销售发货单id/销售退货单id 示例：2373711808401664
pk_unit	long	否	主计量id 示例：2297527422652672
pk_inventorystate	long	否	库存状态id 示例：2281541914235490
check_sourcetrowID	string	否	请检来源单据行id：完工报告行id/采购到货单行id/工序任务汇报id/委外到货单行id/销售发货单行id/销售退货单行id 示例：2373711808401665
pk_org	string	否	主组织id 示例：2296731543949568
pk_initmaterial	long	否	物料id 示例：2297533966323968
pk_material	long	否	改判物料id 示例：2297533966323968
pk_baditem	string	否	不良项目id 示例：2301226605613312
treat_method	string	否	处理方式id 示例：2315035088359680
is_storage	boolean	否	是否可以入库：true-是，false-否 示例：false
is_qualified	boolean	否	是否合格：true-是，false-否 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"check_sourcetnum": "WGBG20210804000001",
			"inspectType": "002",
			"main_num": 10,
			"inspectDate": "2021-09-05 00:00:00",
			"createmethod": "1",
			"check_sourcetype": "po_finishedreport",
			"check_sourcetID": "2373711808401664",
			"pk_unit": 2297527422652672,
			"pk_inventorystate": 2281541914235490,
			"check_sourcetrowID": "2373711808401665",
			"pk_org": "2296731543949568",
			"pk_initmaterial": 2297533966323968,
			"pk_material": 2297533966323968,
			"pk_baditem": "2301226605613312",
			"treat_method": "2315035088359680",
			"is_storage": false,
			"is_qualified": false
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	请检来源单据行对应的处理数量之和不能超过请检来源单据行的数量	输入正确参数

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

