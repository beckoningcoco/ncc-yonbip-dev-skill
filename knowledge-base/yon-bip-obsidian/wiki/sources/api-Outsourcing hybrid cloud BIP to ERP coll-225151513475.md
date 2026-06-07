---
title: "purchaseRemark	string	否	否	买方备注"
apiId: "2251515134751014913"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order]
platform_version: "BIP"
source_type: community-api-docs
---

# purchaseRemark	string	否	否	买方备注

>  请求方式	POST | Subcontract Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractorder/coordination/ycSupplyConfirm
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
routeid	string	header	否	路由
Body参数
名称	类型	数组	必填	描述
serviceUpdate	boolean	否	否	标识服务更新
sourceType	string	否	否	单据来源
exchDate	string	否	否	汇率日期
code	string	否	否	单据编号
vouchdate	string	否	否	单据日期
vouchdateStr	string	否	否	日期字符串
autoUnAudit	boolean	否	否	自动弃审
orgCode	string	否	否	组织code
orgId	string	否	否	组织id
transTypeCode	string	否	否	交易类型code
transTypeId	string	否	否	交易类型id
status	string	否	否	状态
defineDts	elastic	否	否	自定义项表头特征
remark	string	否	否	备注
_status	string	否	否	主表数据状态
orderSubcontract	object	否	否	委外信息
departmentCode	string	否	否	部门code
departmentId	string	否	否	部门id
operatorCode	string	否	否	业务员code
subcontractVendorCode	string	否	否	委外商code
subcontractVendorId	string	否	否	委外商id
fcId	string	否	否	本币ID
fcIdName	string	否	否	本币Name
tcCode	string	否	否	币种code
tcId	string	否	否	币种id
invoiceVendorCode	string	否	否	开票委外商code
invoiceVendorId	string	否	否	开票委外商id
tcOrgCode	string	否	否	收票组织code
tcOrgId	string	否	否	收票组织id
subcontractVendorContactId	string	否	否	委外商联系人
tcFCExchRateTypeCode	string	否	否	汇率类型code
tcFCExchRateType	string	否	否	汇率类型id
tcFCExchRate	float	否	否	汇率
isTaxPrice	float	否	否	价格含税
_status	string	否	否	主表协同数据状态
orderProduct	object	是	否	委外订单产品行数据集合
id	string	否	否	子表主键
productCode	string	否	否	物料code
productId	string	否	否	物料id
changeRate	float	否	否	委外换算率
versionCode	string	否	否	物料清单版本
startDate	string	否	否	开工日期
orgCode	string	否	否	收货组织code
orgId	string	否	否	收货组织id
warehouseCode	string	否	否	仓库code
remark	string	否	否	备注
freeCharacteristics	elastic	否	否	自由项特征组
productDefineDts	elastic	否	否	自定义项表体特征
_status	string	否	否	子表数据行状态
orderSubcontractProduct	object	否	否	委外产品信息
orderMaterial	object	是	否	材料行
orderSubcontractProductConsult	object	否	否	子表协同信息
lineNo	string	否	否	行号
orderSubcontractConsult	object	否	否	委外订单协同
requireConsult	boolean	否	否	是否协同
requireConfirm	boolean	否	否	是否确认
externalSystemId	string	否	否	外部系统id
orderTitle	string	否	否	订单标题
consultFlag	int	否	否	协同订单
consultProcess	int	否	否	协同订单流程
consultMode	int	否	否	协同方式
consultStatus	int	否	否	订单协同状态
allowConfirmQty	boolean	否	否	允许确认数量
allowConfirmPrice	boolean	否	否	允许确认价格
saleConfirmTime	string	否	否	卖方确认时间
salePerson	string	否	否	卖方确认人
salePersonContact	string	否	否	卖方确认人联系方式
publishTime	string	否	否	发布时间
buyerConfirmerTime	string	否	否	代确认时间
buyerConfirmerName	string	否	否	代确认人姓名
id	float	否	否	委外订单ID
orderProductId	string	否	否	订单行id
nbacknumAuxiliary	string	否	否	退货件数
nbacknum	string	否	否	退货数量
linecloseReasonIdReason	string	否	否	关闭原因
linecloseReasonId	string	否	否	关闭原因档案id

## 3. 请求示例

Url: /yonbip/mfg/subcontractorder/coordination/ycSupplyConfirm?access_token=访问令牌
Header: 
	routeid : ""
Body: {
	"serviceUpdate": true,
	"sourceType": "",
	"exchDate": "",
	"code": "",
	"vouchdate": "",
	"vouchdateStr": "",
	"autoUnAudit": true,
	"orgCode": "",
	"orgId": "",
	"transTypeCode": "",
	"transTypeId": "",
	"status": "",
	"defineDts": "",
	"remark": "",
	"_status": "",
	"orderSubcontract": {
		"departmentCode": "",
		"departmentId": "",
		"operatorCode": "",
		"subcontractVendorCode": "",
		"subcontractVendorId": "",
		"fcId": "",
		"fcIdName": "",
		"tcCode": "",
		"tcId": "",
		"invoiceVendorCode": "",
		"invoiceVendorId": "",
		"tcOrgCode": "",
		"tcOrgId": "",
		"subcontractVendorContactId": "",
		"tcFCExchRateTypeCode": "",
		"tcFCExchRateType": "",
		"tcFCExchRate": 0,
		"isTaxPrice": 0,
		"_status": ""
	},
	"orderProduct": [
		{
			"id": "",
			"productCode": "",
			"productId": "",
			"changeRate": 0,
			"versionCode": "",
			"startDate": "",
			"orgCode": "",
			"orgId": "",
			"warehouseCode": "",
			"remark": "",
			"freeCharacteristics": "",
			"productDefineDts": "",
			"_status": "",
			"orderSubcontractProduct": {
				"rcvAddrType": 0,
				"rcvCustomer": 0,
				"rcvVendor": 0,
				"vendorProductCode": "",
				"vendorProductName": "",
				"isPresent": "",
				"discountTaxType": 0,
				"taxRateCode": "",
				"taxRateId": "",
				"subcontractQuantityMU": 0,
				"oriMoney": 0,
				"subcontractUnitCode": "",
				"subcontractUnitId": "",
				"mainUnitName": "",
				"mainUnitId": "",
				"subcontractQuantitySU": 0,
				"priceUnitCode": "",
				"priceUnitId": "",
				"subcontractToPrice": 0,
				"subcontractQuantityPU": 0,
				"oriTaxUnitPrice": 0,
				"oriUnitPrice": 0,
				"oriSum": 0,
				"deliveryDate": "",
				"deliveryDateStr": "",
				"oriTax": "",
				"puReqNo": "",
				"puReqId": 0,
				"priceSource": "",
				"_status": ""
			},
			"orderMaterial": [
				{
					"id": "",
					"_status": "",
					"orderProductId": "",
					"orgName": "",
					"orgId": "",
					"materialId": "",
					"productCode": "",
					"productId": "",
					"changeRate": "",
					"changeType": "",
					"stockUnitNmae": "",
					"stockUnitId": "",
					"mainUnitName": "",
					"subcontractSupplyType": "",
					"alternateType": "",
					"supplyType": "",
					"fixedQuantity": "",
					"truncUp": "",
					"scrap": "",
					"numeratorQuantity": "",
					"denominatorQuantity": "",
					"unitUseQuantity": "",
					"recipientQuantity": "",
					"auxiliaryRecipientQuantity": 0,
					"receivedQuantity": 0,
					"auxiliaryReceivedQuantity": 0,
					"requirementDate": "",
					"warehouseId": "",
					"tranferOutOrgId": "",
					"transferOutWarehouseId": "",
					"verificationBy": "",
					"bomUnitUseQuantityInloss": "",
					"bomUnitUseQuantityNoloss": "",
					"supDirectShip": true
				}
			],
			"orderSubcontractProductConsult": {
				"externalSystemAutoId": "",
				"signType": 0,
				"requireSign": true,
				"signerTenant": ""
			},
			"lineNo": ""
		}
	],
	"orderSubcontractConsult": {
		"requireConsult": true,
		"requireConfirm": true,
		"externalSystemId": "",
		"orderTitle": "",
		"consultFlag": 0,
		"consultProcess": 0,
		"consultMode": 0,
		"consultStatus": 0,
		"allowConfirmQty": true,
		"allowConfirmPrice": true,
		"saleConfirmTime": "",
		"salePerson": "",
		"salePersonContact": "",
		"purchaseRemark": "",
		"publishTime": "",
		"buyerConfirmerTime": "",
		"buyerConfirmerName": ""
	},
	"id": 0,
	"orderProductId": "",
	"nbacknumAuxiliary": "",
	"nbacknum": "",
	"linecloseReasonIdReason": "",
	"linecloseReasonId": ""
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
code	string	否	接口返回码，调用成功时返回200 示例：200
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
data	object	否	接口返回数据
count	long	否	保存单据总数 示例：1
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
messages	string	是	保存失败信息
infos	object	是	保存成功单据信息
failInfos	string	是	失败信息。空集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2695234384843264,
				"rcvOrgId": "2322542927713536",
				"rcvOrgName": "珠海工厂",
				"rcvOrgCode": "200",
				"orgId": "2322542927713536",
				"orgName": "珠海工厂",
				"orgCode": "200",
				"transTypeId": "2384748293935360",
				"transTypeName": "委外到货",
				"transTypeCode": "WWDH01",
				"vouchdate": "2022-03-19 00:00:00",
				"code": "WWDH202203190003",
				"subcontractVendorId": 2324971366895872,
				"subcontractVendorName": "供应商A",
				"departmentId": "2322723746189568",
				"departmentName": "业务一部",
				"operatorId": "2322723746189566",
				"operatorName": "张三",
				"rcvDepartmentId": "2322723746189568",
				"rcvDepartmentName": "业务一部",
				"rcvStaffId": "2322723746189566",
				"rcvStaffName": "张三",
				"sendTransWayId": "2322393516396869",
				"sendTransWayName": "陆运",
				"tcId": "2322393516396800",
				"tcName": "人民币",
				"tcCode": "CNY",
				"tcMoneyDigit": 3,
				"tcPriceDigit": 6,
				"fcId": "2322393516396800",
				"fcName": "人民币",
				"fcCode": "CNY",
				"fcMoneyDigit": 3,
				"fcPriceDigit": 6,
				"invoiceVendorId": 2324971366895872,
				"invoiceVendorName": "供应商A",
				"tcOrgId": "2322540979148032",
				"tcOrgName": "珠海工厂",
				"vendorContactName": "赵武",
				"tcFCExchRateType": "0000KQHNR7XADA8EC70000",
				"tcFCExchRateTypeName": "基准汇率",
				"tcFCExchRateTypeDigit": 6,
				"tcFCExchRate": 1,
				"taxRateId": "2322390811791696",
				"taxRateName": "1.5%",
				"taxRateNtaxRate": 1.5,
				"totalMoneyTC": 7,
				"taxTC": 0,
				"netMoneyTC": 7,
				"totalMoneyFC": 7,
				"taxFC": 0,
				"netMoneyFC": 7,
				"status": 0,
				"remark": "表头备注",
				"pubts": "2022-03-19 23:34:21",
				"isWfControlled": false,
				"sourceType": "7",
				"tenant": 2322390811791616,
				"yTenantId": "0000KQHNR7XADA8EC70000",
				"creatorId": 2323534017974528,
				"creator": "13662080373",
				"createDate": "2022-03-19 23:34:16",
				"createTime": "2022-03-19 23:34:16",
				"osmArriveOrderProduct": [
					{
						"id": 2695234384859648,
						"arriveOrderId": 2695234384843264,
						"lineNo": 10,
						"demandOrgId": "2322542927713536",
						"demandOrgName": "珠海工厂",
						"productId": 2322675338465536,
						"materialId": 2322675347313664,
						"materialName": "P10",
						"materialCode": "000002",
						"skuId": 2322675344167168,
						"skuName": "P10",
						"skuCode": "000002",
						"productionType": "0",
						"warehouseId": 2322675344163468,
						"warehouseName": "成品仓",
						"isPresent": false,
						"arriveQuantity": 1,
						"acceptQuantity": 1,
						"refuseQuantity": 0,
						"replenishQuantity": 0,
						"arriveSubQuantity": 1,
						"acceptSubQuantity": 1,
						"refuseSubQuantity": 0,
						"replenishSubQuantity": 0,
						"arriveQuantityPU": 1,
						"acceptQuantityPU": 1,
						"refuseQuantityPU": 0,
						"replenishQuantityPU": 0,
						"mainUnitId": 2322545814343936,
						"mainUnitName": "袋",
						"mainUnitPrecision": 2,
						"mainUnitTruncationType": 0,
						"subcontractUnitId": 2322545814343936,
						"subcontractUnitName": "袋",
						"subcontractUnitPrecision": 2,
						"subcontractUnitTruncationType": 0,
						"priceUnitId": 2322545814343936,
						"priceUnitName": "袋",
						"priceUnitPrecision": 2,
						"priceUnitTruncationType": 0,
						"changeType": 0,
						"changeRate": 1,
						"priceChangeType": 0,
						"subcontractToPrice": 1,
						"batchNo": "PC0001",
						"produceDate": "2022-03-21",
						"expirationDate": "2023-03-21",
						"isTaxPrice": false,
						"oriTaxUnitPrice": 7,
						"oriUnitPrice": 7,
						"oriMoney": 7,
						"oriSum": 7,
						"oriTax": 0,
						"taxRateId": "2322393519526145",
						"taxRateName": "免税",
						"taxRate": 0,
						"natTaxUnitPrice": 7,
						"natUnitPrice": 7,
						"natMoney": 7,
						"natSum": 7,
						"natTax": 0,
						"deliveryDate": "2021-07-01 00:00:00",
						"sourceType": "7",
						"source": "po_subcontract_order",
						"makeRuleCode": "subcontractOrderToArriveOrder",
						"upcode": "WWDD20210701000004",
						"sourceid": 2325665323176704,
						"sourceMainPubts": "2022-03-19 21:28:37",
						"sourceautoid": 2325665323176705,
						"sourceLineNo": 10,
						"firstSource": "po_subcontract_order",
						"firstUpCode": "WWDD20210701000004",
						"firstSourceAutoId": 2325665323176705,
						"firstLineNo": 10,
						"discountTaxType": 0,
						"rcvAutoVerify": false,
						"kittingCheck": false,
						"kittingCheckPoint": "audit",
						"reserveid": 2322390811791676,
						"remark": "表体备注",
						"tenant": 2322390811791616,
						"yTenantId": "0000KQHNR7XADA8EC70000",
						"pubts": "2022-03-19 23:34:17"
					}
				]
			}
		],
		"failInfos": [
			""
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
暂时没有数据哦~

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

