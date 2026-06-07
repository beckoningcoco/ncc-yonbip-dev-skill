---
title: "委外退货单新增"
apiId: "2391576251667054597"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Return Document"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Return Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外退货单新增

>  请求方式	POST | Subcontracting Return Document (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/returnorder/save
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
code	string	否	否	单据编号。设置手工编号时必输，自动编号时输入无效 示例：WWTH202201250001
vouchdate	string	否	否	单据日期。为空取默认业务日期，格式“2022-01-01” 示例：2022-01-25
transTypeId	string	否	否	交易类型id或code 示例：2325273783079171
rcvOrgId	string	否	否	退货组织id或code 示例：2325273783079176
orgId	string	否	否	委外组织id或code 示例：2325273783079176
subcontractVendorId	string	否	是	委外商id或code 示例：2325273783079676
departmentId	string	否	是	委外部门id或code 示例：2325510494064896
operatorId	string	否	否	委外业务员id或code 示例：1866605942198527
rcvDepartmentId	string	否	否	退货部门id或code 示例：2325510494064566
rcvStaffId	string	否	否	退货人id或code 示例：1866605942198527
tcId	string	否	是	币种id或code 示例：1866605942198525
fcId	string	否	是	本币id或code 示例：1866605942198525
invoiceVendorId	string	否	是	开票委外商id或code 示例：1866605942198527
tcOrgId	string	否	否	收票组织id或code 示例：1866605942198527
vendorContactName	string	否	否	委外商联系人名称 示例：张三
tcFCExchRateType	string	否	是	汇率类型id或code 示例：2326642944332036
tcFCExchRate	double	否	是	汇率 示例：1
taxRateId	string	否	否	税率id或code 示例：1361029789812345
remark	string	否	否	备注 示例：表头备注
osmReturnOrderProduct	object	是	是	委外退货单产品行数据集合

## 3. 请求示例

Url: /yonbip/MFC/returnorder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "WWTH202201250001",
		"vouchdate": "2022-01-25",
		"transTypeId": "2325273783079171",
		"rcvOrgId": "2325273783079176",
		"orgId": "2325273783079176",
		"subcontractVendorId": "2325273783079676",
		"departmentId": "2325510494064896",
		"operatorId": "1866605942198527",
		"rcvDepartmentId": "2325510494064566",
		"rcvStaffId": "1866605942198527",
		"tcId": "1866605942198525",
		"fcId": "1866605942198525",
		"invoiceVendorId": "1866605942198527",
		"tcOrgId": "1866605942198527",
		"vendorContactName": "张三",
		"tcFCExchRateType": "2326642944332036",
		"tcFCExchRate": 1,
		"taxRateId": "1361029789812345",
		"remark": "表头备注",
		"osmReturnOrderProduct": [
			{
				"demandOrgId": "2326642944332036",
				"productId": "",
				"warehouseId": "2326642944332056",
				"isPresent": false,
				"arriveQuantity": 100,
				"mainUnitId": "2325505713575686",
				"subcontractUnitId": "2325505713575686",
				"changeRate": 1,
				"priceUnitId": "2325505713575686",
				"subcontractToPrice": 1,
				"batchNo": "PC2022031501",
				"produceDate": "2022-03-15",
				"expirationDate": "2023-03-15",
				"isTaxPrice": true,
				"taxRateId": "2325505713575680",
				"oriTaxUnitPrice": 10,
				"oriUnitPrice": 8.7,
				"sourceautoid": 2325505713575681,
				"discountTaxType": "1",
				"remark": "产品行备注",
				"productionType": "",
				"osmArriveOrderProductExt": [
					{
						"changeRateNum": 1,
						"changeRateDen": 1,
						"subcontractToPriceNum": 1,
						"subcontractToPriceDen": 1
					}
				]
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
				"transTypeName": "委外退货",
				"transTypeCode": "WWTH01",
				"vouchdate": "2022-03-19 00:00:00",
				"code": "WWTH202203190003",
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
				"osmReturnOrderProduct": [
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
						"productionType": "0",
						"warehouseId": 2322675344163468,
						"warehouseName": "成品仓",
						"isPresent": false,
						"arriveQuantity": 1,
						"arriveSubQuantity": 1,
						"arriveQuantityPU": 1,
						"mainUnit": 2322545814343936,
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
						"sourceType": "7",
						"source": "po_subcontract_order",
						"makeRuleCode": "subcontractOrderToReturnOrder",
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-03	
更新
请求参数 rcvOrgId
更新
请求参数 op
新增
返回参数 orderProduct_materialName
新增
返回参数 orderProduct_mainUnitName
入参simpleVOs的比较符改为必填，返参顺序调整

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

