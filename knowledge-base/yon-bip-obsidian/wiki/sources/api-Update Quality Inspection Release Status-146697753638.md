---
title: "更新质检信息放行状态"
apiId: "1466977536387842048"
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

# 更新质检信息放行状态

>  请求方式	POST | Quality Inspection Result (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectioninfoapi/updatePassStatus
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
check_sourcetrowID	string	否	是	请检单据行id：完工报告行id/到货单行id 示例：2373711808401665
dataList	object	是	是	质检信息明细集合

## 3. 请求示例

Url: /yonbip/imcs/inspectioninfoapi/updatePassStatus?access_token=访问令牌
Body: {
	"data": [
		{
			"check_sourcetrowID": "2373711808401665",
			"dataList": [
				{
					"id": "",
					"passStatus": ""
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
id	string	否	质检信息明细id 示例：1455893754760134657
inspectType	string	否	检验类型：001-来料检验，002-产品检验 示例：002
main_num	long	否	主数量 示例：10
inspectDate	string	否	检验日期 示例：2021-09-05 00:00:00
createmethod	string	否	创建方式：0-系统创建，1-手工创建，2-外部质检系统 示例：1
check_sourcetype	string	否	请检单据类型：pu_arrivalorder-到货单，po_finishedreport-完工报告 示例：po_finishedreport
check_sourcetID	string	否	请检单据id:完工报告id/到货单id 示例：2373711808401664
pk_unit	long	否	主计量id 示例：2297527422652672
pk_inventorystate	long	否	库存状态id 示例：2281541914235490
check_sourcetrowID	string	否	请检查单据行主键:完工报告行id/到货单行id 示例：2373711808401665
pk_org	string	否	质检组织 示例：2296731543949568
pk_initmaterial	long	否	物料id 示例：2297533966323968
pk_material	long	否	改判物料id 示例：2297533966323968
pk_baditem	string	否	不良项目id 示例：2301226605613312
treat_method	string	否	处理方式id 示例：2315035088359680
is_storage	boolean	否	是否可入库：true：是；false：否 示例：false
pass_status	string	否	放行状态 示例：已放行
is_qualified	boolean	否	是否合格：true：是；false：否 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "1455893754760134657",
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
			"pass_status": "已放行",
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
code	修改此单据状态不符合规则	输入符合规则的参数

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

