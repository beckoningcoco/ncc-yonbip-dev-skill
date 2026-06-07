---
title: "基于销售订单生成服务交付"
apiId: "2055597031968735235"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Delivery"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Delivery]
platform_version: "BIP"
source_type: community-api-docs
---

# 基于销售订单生成服务交付

>  请求方式	POST | Service Delivery (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/settlement/generateBySaleOrder
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
data	object	否	是	传入数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
saleOrderId	string	否	否	销售订单主表id，该参数与订单主表code必须填一个，若两个参数都存在，以销售订单主表id为准 示例：2045283664324460544
saleOrderCode	string	否	否	销售订单主表code，该参数与销售订单主表id必须填一个，如果两个参数都存在，以销售订单主表id为准 示例：UO-000020240808000001
makeBillRuleCode	string	否	否	单据转换规则编码 示例：voucherOrder2Settlement 默认值：voucherOrder2Settlement
settledDate	date
格式:yyyy-MM-dd	否	否	结算日期 示例：2024-08-01
handlingPersonId	string	否	否	经办人id，该参数与经办人code同时存在时，以经办人id为准 示例：1851282946610692105
handlingPersonCode	string	否	否	经办人code，该参数与经办人id同时存在时，以经办人id为准 示例：000000000000000000000001
handlingDepartmentId	string	否	否	经办部门id，该参数与经办部门code同时存在时，以经办部门id为准 示例：1851280086150414344
handlingDepartmentCode	string	否	否	经办部门code，该参数与经办部门id同时存在时，以经办部门id为准 示例：11
saleDepartmentId	string	否	否	销售部门id，该参数与销售部门code同时存在时，以销售部门id为准 示例：1593053878993027079
saleDepartmentCode	string	否	否	销售部门code，该参数与销售部门id同时存在时，以销售部门id为准 示例：testwang2
corpContact	string	否	否	销售业务员id，该参数与销售业务员code同时存在时，以销售业务员id为准 示例：1863890857468887048
corpContactCode	string	否	否	销售业务员code，该参数与销售业务员id同时存在时，以销售业务员id为准 示例：000000000000000000000011
invoiceAgentId	string	否	否	开票客户id，该参数与开票客户code同时存在时，以开票客户id为准 示例：1970183257844088833
invoiceAgentCode	string	否	否	开票客户code，该参数与开票客户id同时存在时，以开票客户id为准 示例：00000000000027
settleRadio	number
小数位数:2,最大长度:10	否	否	结算比例 示例：60
settlementItemList	object	是	否	销售订单子表，当结算方式为按交付物结算时，子表为必填

## 3. 请求示例

Url: /yonbip/pm/settlement/generateBySaleOrder?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"saleOrderId": "2045283664324460544",
		"saleOrderCode": "UO-000020240808000001",
		"makeBillRuleCode": "voucherOrder2Settlement",
		"settledDate": "2024-08-01",
		"handlingPersonId": "1851282946610692105",
		"handlingPersonCode": "000000000000000000000001",
		"handlingDepartmentId": "1851280086150414344",
		"handlingDepartmentCode": "11",
		"saleDepartmentId": "1593053878993027079",
		"saleDepartmentCode": "testwang2",
		"corpContact": "1863890857468887048",
		"corpContactCode": "000000000000000000000011",
		"invoiceAgentId": "1970183257844088833",
		"invoiceAgentCode": "00000000000027",
		"settleRadio": 60,
		"settlementItemList": [
			{
				"saleOrderDetailId": "2058328777067331585",
				"settlementQty": 10
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	请求响应编码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回数据
projectId	string	否	项目id 示例：34242342342
settlementId	string	否	服务交付id 示例：2058370043044954116
orderId	number
小数位数:0,最大长度:32	否	销售订单id 示例：1342546456342342
settlementCode	string	否	服务交付code 示例：0JSD20240805000002
status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
natSettlementMny	number
小数位数:7,最大长度:10	否	结算金额(本币) 示例：1.7699115
items	object	否	服务交付子表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"projectId": "34242342342",
		"settlementId": "2058370043044954116",
		"orderId": 1342546456342342,
		"settlementCode": "0JSD20240805000002",
		"status": 0,
		"natSettlementMny": 1.7699115,
		"items": {
			"settlementItemId": "2378342924",
			"orderDetailId": "324242342323"
		}
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
0	未传入优惠券档案id	coupon_id值填写有误
1032001990002	销售订单主表id和code不能同时为空	销售订单主表id和code必须填一个，都填的时候以id为准
1032001990003	销售订单子表不能为空	销售订单子表id和结算量必填
1032001990004	销售订单子表id不能为空	销售订单子表id不能为空
1032001990005	销售订单子表结算数量不能为空或0	销售订单子表结算数量不能为空或0
1032001990006	销售订单不存在，请检查订单id和编码	销售订单不存在，请检查订单id和编码
1032001990010	不支持按里程碑结算	服务交付按里程碑结算不支持手动新增
1032001990099	其他异常	请联系开发人员
1032001990007	服务交付确认方式为收款时点时不支持手动服务交付	服务交付确认方式为收款时点时不支持手动服务交付
1032001990008	本次确认数量超过可确认数量	本次确认数量超过可确认数量
1032001990011	获取经办人失败，请检查经办人id或code	获取经办人失败，请检查经办人id或code
1032001990012	获取经办部门失败，请检查经办部门id或code	获取经办部门失败，请检查经办部门id或code
1032001990013	获取销售业务员失败，请检查销售业务员id或code	获取销售业务员失败，请检查销售业务员id或code
1032001990014	获取销售部门失败，请检查销售部门id或code	获取销售部门失败，请检查销售部门id或code
1032001990015	获取开票客户失败，请检查开票客户id或code	获取开票客户失败，请检查开票客户id或code
1032001990016	不能同时存在两个进行中的服务交付单	不能同时存在两个进行中的服务交付单
1032001990017	结算比例的值需大于0，小于等于100，请检查	结算比例的值需大于0，小于等于100，请检查
1032001990018	推单失败，请检查单据转换规则	推单失败，请检查单据转换规则
1032001990019	本次结算比例未超过已结算比例，请调整本次结算比例	本次结算比例未超过已结算比例，请调整本次结算比例

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

