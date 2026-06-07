---
title: "委外订单详情查询"
apiId: "3435427cca9240eab9f84bc6a7d0efca"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Subcontract Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外订单详情查询

>  请求方式	GET | Subcontract Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractorder/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	委外单据ID, ，委外订单ID和委外订单编码不能同时为空，ID和编码同时存在，以ID为准    示例: 2184924571914496
code	string	query	否	委外订单单号    示例: WWDD202505010001

## 3. 请求示例

Url: /yonbip/mfg/subcontractorder/detail?access_token=访问令牌&id=2184924571914496&code=WWDD202505010001

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
code	long	否	返回码，成功时返回200 示例：200
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
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回信息
orderSubcontract	object	否	委外信息
id	long	否	委外订单Id 示例：2391890331374336
orgId	string	否	组织Id 示例：2325505713575680
orgName	string	否	组织 示例：资产管理公司
operatorIdName	string	否	业务员 示例：刘龙
invoiceVendorIdName	string	否	开票委外商 示例：CL
fcIdName	string	否	本币 示例：人民币
fcIdPriceDigit	int	否	本币单价精度 示例：4
fcIdMoneyDigit	int	否	本币金额精度 示例：4
taxRateIdName	string	否	税率名称 示例：13%
taxRateIdNtaxRate	double	否	税率 示例：13
tcIdName	string	否	币种 示例：人民币
tcIdPriceDigit	int	否	币种单价精度 示例：4
tcIdMoneyDigit	int	否	币种金额精度 示例：4
isWfControlled	boolean	否	是否审批流控制, true:控制, false:不控制; 示例：true
locker	string	否	锁定人 示例：Yanjha
lockTime	string	否	锁定时间 示例：2021-08-17 16:36:41
lockDate	string	否	锁定日期 示例：2021-08-17 00:00:00
status	int	否	状态: 0-开立; 1:已审核; 2-已关闭; 3-审核中; 4-已锁定; 示例：1
returncount	int	否	退回次数 示例：0
verifystate	int	否	审批状态: 0-开立; 1-已提交; 2-已审批; 4-驳回; 示例：2
code	string	否	单号 示例：WWDD20210817000002
departmentIdName	string	否	部门 示例：财务部
subcontractVendorIdName	string	否	委外商 示例：CL
tcOrgName	string	否	收票组织 示例：资产管理公司
remark	string	否	备注 示例：demo
vouchdate	string	否	单据日期 示例：2021-08-17 00:00:00
transTypeId	string	否	交易类型Id 示例：2326374049730816
transTypeName	string	否	交易类型编码 示例：标准委外
transTypeCode	string	否	交易类型名称 示例：WWDD10
pubts	string	否	时间戳 示例：2021-08-17 16:38:19
auditor	string	否	审核人 示例：Yanjha
auditTime	string	否	审核时间 示例：2021-08-17 16:37:02
auditDate	string	否	审核日期 示例：2021-08-17 00:00:00
creatorId	long	否	创建人Id 示例：2325478401872128
creator	string	否	创建人 示例：Yanjha
createTime	string	否	创建时间 示例：2021-08-17 16:36:40
tcFCExchRateTypeName	string	否	汇率类型 示例：基准汇率
out_sys_id	string	否	外部来源线索 示例：10000
out_sys_code	string	否	外部来源编码 示例：WBWWDD01
out_sys_version	string	否	外部来源版本 示例：V1.0.0
out_sys_type	string	否	外部来源类型 示例：Type001
orderProduct	object	是	产品
isBeginning	number
小数位数:0,最大长度:1	否	期初订单标识:0-否，1-是 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"orderSubcontract": {
			"id": 2391890331374336,
			"isRework": false,
			"operatorId": "2326642944332032",
			"invoiceVendorId": "2325540845818112",
			"fcId": "2325273777082880",
			"taxRateId": "2325273779868160",
			"tcId": "2325273777082880",
			"tcFCExchRate": 1,
			"totalMoneyTC": 2,
			"totalMoneyFC": 2,
			"netMoneyTC": 2,
			"netMoneyFC": 2,
			"taxTC": 0,
			"taxFC": 0,
			"isTaxPrice": false,
			"expenseOriSum": 2,
			"expenseOriMoney": 2,
			"expenseNatSum": 2,
			"expenseNatMoney": 2,
			"tcFCExchRateType": "0000KQKKGB992MV76L0000",
			"tcFCExchRateTypeName": "基准汇率",
			"departmentId": "2325510494064896",
			"subcontractVendorId": 2325540845818112,
			"tcOrgId": "2325505713575680",
			"mixConsultRole": 0,
			"tradePath": 1852042374122307592,
			"tradePathName": "01路径",
			"tcOrgAccount": 0
		},
		"id": 2391890331374336,
		"orgId": "2325505713575680",
		"orgName": "资产管理公司",
		"operatorIdName": "刘龙",
		"invoiceVendorIdName": "CL",
		"fcIdName": "人民币",
		"fcIdPriceDigit": 4,
		"fcIdMoneyDigit": 4,
		"taxRateIdName": "13%",
		"taxRateIdNtaxRate": 13,
		"tcIdName": "人民币",
		"tcIdPriceDigit": 4,
		"tcIdMoneyDigit": 4,
		"isWfControlled": true,
		"locker": "Yanjha",
		"lockTime": "2021-08-17 16:36:41",
		"lockDate": "2021-08-17 00:00:00",
		"status": 1,
		"returncount": 0,
		"verifystate": 2,
		"code": "WWDD20210817000002",
		"departmentIdName": "财务部",
		"subcontractVendorIdName": "CL",
		"tcOrgName": "资产管理公司",
		"remark": "demo",
		"vouchdate": "2021-08-17 00:00:00",
		"transTypeId": "2326374049730816",
		"transTypeName": "标准委外",
		"transTypeCode": "WWDD10",
		"pubts": "2021-08-17 16:38:19",
		"auditor": "Yanjha",
		"auditTime": "2021-08-17 16:37:02",
		"auditDate": "2021-08-17 00:00:00",
		"creatorId": 2325478401872128,
		"creator": "Yanjha",
		"createTime": "2021-08-17 16:36:40",
		"tcFCExchRateTypeName": "基准汇率",
		"out_sys_id": "10000",
		"out_sys_code": "WBWWDD01",
		"out_sys_version": "V1.0.0",
		"out_sys_type": "Type001",
		"orderProduct": [
			{
				"orderSubcontractProduct": {
					"id": 2391890331374337,
					"demandOrgId": "2325505713575680",
					"demandOrgIdName": "资产管理公司",
					"demandQuantityDU": 1,
					"subcontractUnitId": 2325529461018880,
					"subcontractUnitIdName": "袋",
					"priceUnitId": 2325529461018880,
					"subcontractQuantityMU": 1,
					"subcontractQuantitySU": 1,
					"subcontractQuantityPU": 1,
					"subcontractToPrice": 1,
					"oriUnitPrice": 2,
					"natUnitPrice": 2,
					"oriTaxUnitPrice": 2,
					"natTaxUnitPrice": 2,
					"oriMoney": 2,
					"natMoney": 2,
					"oriSum": 2,
					"natSum": 2,
					"oriTax": 0,
					"natTax": 0,
					"taxRateId": "2325273779868161",
					"invoicedQuantityMU": 0,
					"invoicedMoneyTC": 0,
					"payedMoneyTC": 0,
					"payedMoneyFC": 0,
					"returnQuantityMU": 0,
					"returnQuantitySU": 0,
					"cfmReturnQuantityMU": 0,
					"cfmReturnQuantitySU": 0,
					"isPresent": false,
					"discountTaxType": "0",
					"deliveryDate": "2021-08-17 00:00:00",
					"taxRate": 0,
					"priceSource": "1",
					"rcvAddrType": 0,
					"rcvVendor": 0,
					"rcvCustomer": 0,
					"tradePath": 1852042374122307592,
					"tradePathName": "01路径",
					"cooperateDocNo": "UO-20231102000019",
					"cooperateDocId": 1852955192105369602,
					"cooperateLineNo": "10",
					"cooperateLineId": 1852955192105369603,
					"throwStatus": 0,
					"isVendorInnerOrg": false,
					"subcontractVendorInnerOrg": "1680766680455708673",
					"tcOrgIdSon": "1631969031461273603",
					"tcOrgNameSon": "收票组织",
					"tcOrgAccountSon": 0,
					"expenseOriSum": 2,
					"expenseOriMoney": 2,
					"expenseNatSum": 2,
					"expenseNatMoney": 2
				},
				"id": 2391890331374337,
				"orderId": 2391890331374336,
				"productId_reservation": true,
				"isExpiryDateManage": false,
				"mainUnit": 2325529461018880,
				"mainUnitName": "袋",
				"mainUnitPrecision": 1,
				"subcontractUnitIdPrecision": 1,
				"osPriceUnitIdName": "袋",
				"osPriceUnitIdPrecision": 1,
				"changeType": 0,
				"changeRate": 1,
				"osTaxRateIdName": "免税",
				"productId": 2325533913174272,
				"productCode": "000001",
				"materialId": 2325533924905472,
				"materialCode": "000001",
				"materialName": "P10",
				"skuId": 2325533922283776,
				"skuCode": "000001",
				"skuName": "P10",
				"incomingAuxiliaryQuantity": 1,
				"incomingQuantity": 1,
				"cfmIncomingQty": 0,
				"cfmIncomingAuxQty": 0,
				"isHold": false,
				"startDate": "2021-07-28 00:00:00",
				"makeRuleCode": "planOrderToSubcontractOrder",
				"FixedLeadTime": 20,
				"orgId": "2325505713575680",
				"orgName": "资产管理公司",
				"warehouseId": "",
				"warehouseName": "",
				"reserveid": "",
				"reserveid_demandtype": "",
				"reserveid_name": "",
				"reserveid_reservecust": "",
				"reserveid_reservecust_code": "",
				"reserveid_reservecust_name": "",
				"mrpQuantity": 1,
				"scrap": 0,
				"isBatchManage": false,
				"bomId": 2330866391552256,
				"versionCode": "1.00",
				"sourceType": "2",
				"upcode": "GEN000091",
				"sourceid": 2330854167007488,
				"sourceautoid": 2391565079892224,
				"retMaterialApplyFlag": 0,
				"out_sys_lineid": "10010",
				"out_sys_rowno": "10",
				"orderMaterial": [
					{
						"pubts": "2021-08-17 16:38:19",
						"id": 2391890331374338,
						"orderProductId": 2391890331374337,
						"orgId": "2325505713575680",
						"orgName": "资产管理公司",
						"productId": 2325569972998400,
						"materialId": 2325569983681024,
						"materialCode": "000002",
						"materialName": "CaiL-1",
						"skuId": 2325569980780800,
						"skuCode": "000002",
						"bomId": 2330866391552256,
						"bomMaterialId": 2330866391552257,
						"mainUnit": 2325530395463936,
						"mainUnitName": "千克",
						"mainUnitPrecision": 4,
						"changeRate": 1,
						"changeType": 0,
						"stockUnitId": 2325530395463936,
						"stockUnitName": "千克",
						"stockUnitPrecision": 4,
						"subcontractSupplyType": 0,
						"alternateType": 0,
						"supplyType": "0",
						"fixedQuantity": 0,
						"truncUp": 0,
						"scrap": 1,
						"numeratorQuantity": 1.667,
						"denominatorQuantity": 1,
						"unitUseQuantity": 1.68367,
						"recipientQuantity": 1.6837,
						"auxiliaryRecipientQuantity": 1.6837,
						"receivedQuantity": 1.6837,
						"auxiliaryReceivedQuantity": 1.6837,
						"cfmReceivedQty": 0,
						"cfmAuxReceivedQty": 0,
						"supDirectShip": false,
						"requirementDate": "2021-07-28 00:00:00",
						"warehouseId": "",
						"warehouseName": "",
						"tranferOutOrgId": "",
						"tranferOutOrgIdName": "",
						"transferOutWarehouseId": "",
						"transferOutWarehouseIdName": "",
						"verificationBy": "0",
						"bomUnitUseQuantityInloss": 1.68367,
						"bomUnitUseQuantityNoloss": 1.667
					}
				],
				"orderSubcontractProductConsult": {
					"requireSign": true,
					"signType": 0,
					"signerTenant": "",
					"signerEnterpriseId": 0
				},
				"orderSubcontractProductExt": {
					"autoClose": 0,
					"payClose": false,
					"payClosePersonId": 2349999026817990657,
					"payClosePerson": "Tom",
					"payCloseDateTime": "2025-08-31 16:37:02"
				},
				"offChartReceiptIsAllowed": false,
				"batchNo": "CSEPC236050021030",
				"expirationDate": "2025-08-31 00:00:00",
				"produceDate": "2025-08-31 00:00:00"
			}
		],
		"isBeginning": 0
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-30	
新增
返回参数 batchNo
新增
返回参数 expirationDate
新增
返回参数 produceDate
	2	2025-09-12	
更新
请求说明
新增
返回参数 (13)
更新
返回参数 (40)
	3	2025-06-24	
新增
返回参数 isBeginning

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

