---
title: "基于采购订单生成服务确认"
apiId: "2211994013916987393"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Confirmation"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Confirmation]
platform_version: "BIP"
source_type: community-api-docs
---

# 基于采购订单生成服务确认

>  请求方式	POST | Service Confirmation (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/supplierSettlement/generateByPurchaseOrder
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
purchaseOrderId	string	否	否	采购订单主表id，该参数与订单主表code必须填一个，若两个参数都存在，以采购订单主表id为准 示例：2045283664324460544
purchaseOrderCode	string	否	否	采购订单主表code，该参数与采购订单主表id必须填一个，如果两个参数都存在，以采购订单主表id为准 示例：CGDD250224000002
makeBillRuleCode	string	否	否	单据转换规则编码 示例：purchaseorder2SupplierSettlement 默认值：purchaseorder2SupplierSettlement
settlementDate	date
格式:yyyy-MM-dd	否	否	结算日期 示例：2025-02-29
handlingPersonId	string	否	否	经办人id，该参数与经办人code同时存在时，以经办人id为准，必填一个。 示例：1851282946610692105
handlingPersonCode	string	否	否	经办人code，该参数与经办人id同时存在时，以经办人id为准 示例：000000000000000000000001
handlingDepartmentId	string	否	否	经办部门id，该参数与经办部门code同时存在时，以经办部门id为准，必填一个。 示例：1851280086150414344
handlingDepartmentCode	string	否	否	经办部门code，该参数与经办部门id同时存在时，以经办部门id为准 示例：11
purchaseDepartmentId	string	否	否	采购部门id，该参数与采购部门code同时存在时，以采购部门id为准，必填一个。 示例：1593053878993027079
purchaseDepartmentCode	string	否	否	采购部门code，该参数与采购部门id同时存在时，以采购部门id为准 示例：testwang2
purchaseId	string	否	否	采购业务员id，该参数与采购业务员code同时存在时，以采购业务员id为准，必填一个。 示例：1863890857468887048
purchaseCode	string	否	否	采购业务员code，该参数与采购业务员id同时存在时，以采购业务员id为准 示例：000000000000000000000011
supplierId	string	否	否	供应商id，该参数与供应商code同时存在时，以供应商id为准，必填一个。 示例：1970183257844088833
supplierCode	string	否	否	供应商code，该参数与供应商id同时存在时，以供应商id为准 示例：00000000000027
settlementItemList	object	是	是	采购订单子表

## 3. 请求示例

Url: /yonbip/pm/supplierSettlement/generateByPurchaseOrder?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"purchaseOrderId": "2045283664324460544",
		"purchaseOrderCode": "CGDD250224000002",
		"makeBillRuleCode": "purchaseorder2SupplierSettlement",
		"settlementDate": "2025-02-29",
		"handlingPersonId": "1851282946610692105",
		"handlingPersonCode": "000000000000000000000001",
		"handlingDepartmentId": "1851280086150414344",
		"handlingDepartmentCode": "11",
		"purchaseDepartmentId": "1593053878993027079",
		"purchaseDepartmentCode": "testwang2",
		"purchaseId": "1863890857468887048",
		"purchaseCode": "000000000000000000000011",
		"supplierId": "1970183257844088833",
		"supplierCode": "00000000000027",
		"settlementItemList": [
			{
				"purchaseOrderDetailId": "2058328777067331585",
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
supplierSettlementId	string	否	服务确认id 示例：2058370043044954116
supplierSettlementCode	string	否	服务确认code 示例：0JSD20240805000002
status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
orderId	string	否	订单id 示例：3049470043044954555
natTotalTaxMny	number
小数位数:7,最大长度:10	否	含税结算金额(本币) 示例：1.7699115
itemList	object	是	返回子表数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"supplierSettlementId": "2058370043044954116",
		"supplierSettlementCode": "0JSD20240805000002",
		"status": 0,
		"orderId": "3049470043044954555",
		"natTotalTaxMny": 1.7699115,
		"itemList": [
			{
				"itemId": "2058370043044954117",
				"orderDetailId": "3049470043044954556"
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
0	未传入优惠券档案id	coupon_id值填写有误
1032001990002	采购订单主表id和code不能同时为空	采购订单主表id和code必须填一个，都填的时候以id为准
1032001990003	采购订单子表id不存在，请检查	采购订单子表id必填
1032001990004	采购订单子表id不能为空	采购订单子表id不能为空
1032001990005	采购订单子表结算数量不能为空	采购订单子表结算数量不能为空
1032001990006	采购订单不存在，请检查订单id和编码	采购订单不存在，请检查订单id和编码
1032001990010	结算数量不能大于采购数量	结算数量不能大于采购数量
1032001990099	其他异常	请联系开发人员
1032001990011	获取经办人失败，请检查经办人id或code	获取经办人失败，请检查经办人id或code
1032001990012	获取经办部门失败，请检查经办部门id或code	获取经办部门失败，请检查经办部门id或code
1032001990013	获取采购业务员失败，请检查采购业务员id或code	获取采购业务员失败，请检查采购业务员id或code
1032001990014	获取采购部门失败，请检查采购部门id或code	获取采购部门失败，请检查采购部门id或code
1032001990015	获取供应商失败，请检查供应商id或code	获取供应商失败，请检查供应商id或code
1032001990018	推单失败，请检查单据转换规则	推单失败，请检查单据转换规则
1032001990007	经办人id和code不能同时为空	经办人id和code必须填一个，都填的时候以id为准
1032001990008	经办部门id和code不能同时为空	经办部门id和code必须填一个，都填的时候以id为准
1032001990009	采购员id和code不能同时为空	采购员id和code必须填一个，都填的时候以id为准
1032001990019	采购部门id和code不能同时为空	采购部门id和code必须填一个，都填的时候以id为准
1032001990020	供应商id和code不能同时为空	供应商id和code必须填一个，都填的时候以id为准

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

