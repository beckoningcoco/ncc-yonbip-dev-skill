---
title: "查询质检信息明细"
apiId: "4d8cc735f3394b378cdfb4a4964ffba2"
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

# 查询质检信息明细

>  请求方式	POST | Quality Inspection Result (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectioninfoapi/queryInspectResultDetail
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
check_billtype	string	否	否	请检来源单据类型：pu_arrivalorder-到货单，po_finishedreport-完工报告,IMPSFC_proceTaskReport-工序检验 示例：po_finishedreport
check_rowids	string	是	是	请检来源单据行id：到货单行id，完工报告行id 示例：["2415541387137537","2415538621993473"]

## 3. 请求示例

Url: /yonbip/imcs/inspectioninfoapi/queryInspectResultDetail?access_token=访问令牌
Body: {
	"check_billtype": "po_finishedreport",
	"check_rowids": [
		"2415541387137537",
		"2415538621993473"
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
code	long	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	是	调用成功时的返回数据
pk_org	string	否	主组织id 示例：2305654598358272
check_sourcetype	string	否	请检来源单据类型：pu_arrivalorder-到货单，po_finishedreport-完工报告,IMPSFC_proceTaskReport-工序检验 示例：po_finishedreport
check_sourcetnum	string	否	请检来源单据号：到货单，完工报告,工序任务汇报 示例：WGBG20210903000002
check_sourcetID	string	否	请检来源单据id 示例：2415541387137536
check_sourcetrowID	string	否	请检来源单据行id 示例：2415541387137537
check_firstbillcode	string	否	请检源头单据号 示例：SCDD20210903000002
insres_sourcetype	string	否	检验结果来源单据类型 示例：BL001
insres_sourcenum	string	否	检验结果来源单据号 示例：007
insres_sourceID	string	否	检验结果来源单据id 示例：2421238167491072
inspectType	string	否	检验类型：001-来料检验，002-产品检验,008-工序检验 示例：002
inspectDate	string	否	检验日期 示例：2021-09-03 00:00:00
pk_dept	string	否	请检部门：产品检验-生产部门，来料检验-采购部门 示例：2296733216395520
pk_initmaterial	long	否	物料id 示例：2415512354836736
pk_batchcode	string	否	入库批次号
pass_status	string	否	放行状态:未放行/已放行 示例：已放行
storage_num	string	否	累计入库数量
pk_material	string	否	改判物料id
main_num	double	否	处理数量 示例：200
pk_unit	long	否	主计量id 示例：2410278690640128
createmethod	string	否	创建方式：0-系统创建，1-手工创建,2-外部系统创建 示例：0
pk_inventorystate	long	否	库存状态id 示例：2281541914235492
check_firstbilltype	string	否	请检源头单据类型：po_production_order-生产订单，st_purchaseorder-采购订单,IMPSFC_proceOrder-工序检验 示例：po_production_order
pk_inspectinfo	string	否	质检信息表头id 示例：2409118185263360
pk_baditem	string	否	不良项目id 示例：2301226605613312
treat_method	string	否	处理方式id 示例：3c9a8e78-0ef7-11ec-84e3-0c42a1651b44
is_storage	boolean	否	是否可入库：false-否，true-是 示例：true
is_qualified	boolean	否	是否合格：false-否，true-是 示例：false
workCenterId	string	否	工作中心id 示例：1507640843803033604
orderProcessId	string	否	工序id 示例：1507639641212190729
orderProcessSn	string	否	工序顺序号 示例：10
dr	long	否	逻辑删除标志：0-未删除，1-删除 示例：0
id	string	否	质检结果明细id 示例：2421433940676864
pubts	string	否	时间戳 示例：2021-09-07 13:29:58
tenant	string	否	租户 示例：0000KPRO7OGPDLMV4F0000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"pk_org": "2305654598358272",
			"check_sourcetype": "po_finishedreport",
			"check_sourcetnum": "WGBG20210903000002",
			"check_sourcetID": "2415541387137536",
			"check_sourcetrowID": "2415541387137537",
			"check_firstbillcode": "SCDD20210903000002",
			"insres_sourcetype": "BL001",
			"insres_sourcenum": "007",
			"insres_sourceID": "2421238167491072",
			"inspectType": "002",
			"inspectDate": "2021-09-03 00:00:00",
			"pk_dept": "2296733216395520",
			"pk_initmaterial": 2415512354836736,
			"pk_batchcode": "",
			"pass_status": "已放行",
			"storage_num": "",
			"pk_material": "",
			"main_num": 200,
			"pk_unit": 2410278690640128,
			"createmethod": "0",
			"pk_inventorystate": 2281541914235492,
			"check_firstbilltype": "po_production_order",
			"pk_inspectinfo": "2409118185263360",
			"pk_baditem": "2301226605613312",
			"treat_method": "3c9a8e78-0ef7-11ec-84e3-0c42a1651b44",
			"is_storage": true,
			"is_qualified": false,
			"workCenterId": "1507640843803033604",
			"orderProcessId": "1507639641212190729",
			"orderProcessSn": "10",
			"dr": 0,
			"id": "2421433940676864",
			"pubts": "2021-09-07 13:29:58",
			"tenant": "0000KPRO7OGPDLMV4F0000"
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
999	请检单据行不能为空	输入有参单据行

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

