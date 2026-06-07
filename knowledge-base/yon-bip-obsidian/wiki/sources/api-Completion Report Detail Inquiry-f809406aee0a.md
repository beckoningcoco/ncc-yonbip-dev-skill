---
title: "完工报告详情查询"
apiId: "f809406aee0a4cb798eb6355e83897b0"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Completion Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Completion Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 完工报告详情查询

>  请求方式	GET | Completion Report (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/finishedreport/detail
请求方式	GET
ContentType	
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	单据id

## 3. 请求示例

Url: /yonbip/mfg/finishedreport/detail?access_token=访问令牌&id=

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
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	message 示例：操作成功
message	string	否	接口返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口返回数据
id	long	否	单据id 示例：2009554140221696
orgId	string	否	工厂id 示例：1904546773012736
orgName	string	否	工厂 示例：Amy测试用
transTypeId	string	否	交易类型id 示例：1871027594744064
transTypeName	string	否	交易类型 示例：完工报告
transTypeCode	string	否	交易类型编码 示例：RF001
code	string	否	单据编号 示例：WGBG202011200003
vouchdate	string	否	单据日期 示例：2020-11-20 00:00:00
productionDepartmentId	string	否	部门id 示例：1870534089855232
departmentName	string	否	部门 示例：生产部
operatorId	string	否	报告人id 示例：1995540547408128
operatorName	string	否	报告人 示例：17600591290
status	long	否	单据状态，0：开立；1：已审核；3：审核中 示例：1
creatorId	long	否	创建人id 示例：1904958398927104
creator	string	否	创建人 示例：17600591290
createDate	string	否	创建日期 示例：2020-11-20 00:00:00
createTime	string	否	创建时间 示例：2020-11-20 14:24:11
modifierId	long	否	修改人id 示例：1904958398927104
modifier	string	否	修改人 示例：17600591290
modifyDate	string	否	修改日期 示例：2020-11-20 00:00:00
modifyTime	string	否	修改时间 示例：2020-11-20 14:24:45
auditorId	long	否	审核人id 示例：1870886213226752
auditor	string	否	审核人 示例：张汉卿
auditDate	string	否	审核日期 示例：2020-11-20 00:00:00
auditTime	string	否	审核时间 示例：2020-11-20 17:22:34
isWfControlled	boolean	否	是否审批流控制，true：是；false：否 示例：false
verifystate	long	否	审批状态，-1：驳回；0：开立；1：已提交；2：已审批 示例：2
returncount	long	否	退回次数 示例：0
isFlowCoreBill	boolean	否	是否核心单据，true：是；false：否 示例：false
remark	string	否	备注 示例：备注
pubts	string	否	时间戳 示例：2020-11-30 10:14:21
finishedReportDetail	object	是	完工报告子表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2009554140221696,
		"orgId": "1904546773012736",
		"orgName": "Amy测试用",
		"transTypeId": "1871027594744064",
		"transTypeName": "完工报告",
		"transTypeCode": "RF001",
		"code": "WGBG202011200003",
		"vouchdate": "2020-11-20 00:00:00",
		"productionDepartmentId": "1870534089855232",
		"departmentName": "生产部",
		"operatorId": "1995540547408128",
		"operatorName": "17600591290",
		"status": 1,
		"creatorId": 1904958398927104,
		"creator": "17600591290",
		"createDate": "2020-11-20 00:00:00",
		"createTime": "2020-11-20 14:24:11",
		"modifierId": 1904958398927104,
		"modifier": "17600591290",
		"modifyDate": "2020-11-20 00:00:00",
		"modifyTime": "2020-11-20 14:24:45",
		"auditorId": 1870886213226752,
		"auditor": "张汉卿",
		"auditDate": "2020-11-20 00:00:00",
		"auditTime": "2020-11-20 17:22:34",
		"isWfControlled": false,
		"verifystate": 2,
		"returncount": 0,
		"isFlowCoreBill": false,
		"remark": "备注",
		"pubts": "2020-11-30 10:14:21",
		"finishedReportDetail": [
			{
				"id": 2009554140221697,
				"finishedReportId": 2009554140221696,
				"lineNo": 10,
				"productionType": "0",
				"materialId": 1996849857614080,
				"productId": 1996849829957888,
				"materialCode": "8002000012",
				"materialName": "测试半成品",
				"materialModelDescription": "物料规格说明",
				"materialModel": "X01",
				"bomId": 1996859756220672,
				"bomVersion": "1.03",
				"bomSubstituteFlag": "1",
				"bomSubstituteDesc": "物料替代说明",
				"skuId": 1996849854583040,
				"skuCode": "8002000012",
				"skuName": "测试半成品",
				"manufacturingSpecification": "物料规格",
				"finishDate": "2020-11-20 14:22:38",
				"mainUnit": 1869676372431104,
				"mainUnitName": "包",
				"mainUnitPrecision": 3,
				"mainUnitTruncationType": 0,
				"productionUnitId": 1869676372431104,
				"productionUnitName": "包",
				"productionUnitPrecision": 3,
				"productionUnitTruncationType": 0,
				"changeRate": 1,
				"changeType": "0",
				"orgId": "1866605942198528",
				"orgName": "L工厂1",
				"warehouseId": 1995236312813824,
				"warehouseName": "材料仓-Amy测试",
				"batchNo": "pici001",
				"trackNo": "genzong001",
				"standardQuantity": 18,
				"quantity": 4,
				"auxiliaryQuantity": 4,
				"qualifiedQuantity": 4,
				"qualifiedAuxiliaryQuantity": 4,
				"returnQuantity": 10,
				"returnAuxiliaryQuantity": 10,
				"returnReasonId": "0012123121",
				"returnReason": "返工原因1",
				"scrapQuantity": 10,
				"scrapAuxiliaryQuantity": 10,
				"scrapReasonId": "1866605942198528",
				"scrapReason": "报废原因1",
				"qualifiedStockQuantity": 4,
				"qualifiedStockAuxiliaryQuantity": 4,
				"scrapStockQuantity": 10,
				"scrapStockAuxiliaryQuantity": 10,
				"returnProduceQuantity": 10,
				"returnProduceAuxiliaryQuantity": 10,
				"sourceType": "4",
				"source": "po_production_order",
				"makeRuleCode": "productionOrderToFinishedReport",
				"upcode": "SCDD20201120000004",
				"sourceid": 2009514194096384,
				"sourceautoid": 2009514194096385,
				"sourceGrandChildId": 0,
				"sourceautoidExt": 2009514194096385,
				"firstSource": "",
				"firstUpCode": "",
				"firstSourceAutoId": "",
				"projectId": "",
				"projectName": "",
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"expireDateNo": "",
				"expireDateUnit": "",
				"produceDate": "2020-11-20 14:22:38",
				"expirationDate": "2020-11-20 14:22:38",
				"reserveid": "2009514194096385",
				"reserveTypeId_name": "客户",
				"reserveid_name": "1231112341_10",
				"reserveid_reservecust_code": "20095141940963823",
				"reserveid_reservecust_name": "用友",
				"finishedReportSn": [
					{
						"id": 20095141940963824,
						"finishedReportId": 20095141940963825,
						"detailId": 20095141940963826,
						"sn": "20095141940963827"
					}
				],
				"scrapReplenishQty": 10,
				"scrapRepAuxQty": 10,
				"scrapNoStockQty": 10,
				"scrapNoStockAuxQty": 10,
				"stockStatus": 0,
				"firstCheck": "0",
				"inspectionCtrlPoint": "0",
				"changeRateNum": 1,
				"changeRateDen": 1
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
999	取决于错误类型，不同错误信息不同	

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

