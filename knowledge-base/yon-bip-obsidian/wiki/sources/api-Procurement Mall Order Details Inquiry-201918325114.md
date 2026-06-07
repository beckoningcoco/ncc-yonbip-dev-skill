---
title: "采购商城订单详情查询"
apiId: "2019183251145883656"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Mall Order"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mall Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购商城订单详情查询

>  请求方式	POST | Mall Order (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/mdd/openapi/order/query/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
access_token	string	header	否	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	采购商城订单id（与采购商城订单号二选一必填，id和code同时填写为且的关系） 示例：1111111
code	string	否	否	采购商城订单订单号（与采购商城id二选一必填，id和code同时填写为且的关系） 示例：000349

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/mdd/openapi/order/query/detail?access_token=访问令牌
Header: 
	access_token : ""
Body: {
	"id": "1111111",
	"code": "000349"
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
code	string	否	响应码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	数据
id	number
小数位数:0,最大长度:20	否	订单id
code	string	否	订单编码
afterDeductionAmount	number
小数位数:8,最大长度:28	否	积分抵扣后支付金额
allowsaleAmountPrice	number
小数位数:8,最大长度:28	否	允销无税总价
amount	number
小数位数:8,最大长度:28	否	无税金额
applyPurchaseDeptId	string	否	需求部门id
applyPurchaseDeptName	string	否	需求部门名称
applyPurchaseOrgCode	string	否	需求组织编码
applyPurchaseOrgId	string	否	需求组织id
applyPurchaseOrgName	string	否	需求组织名称
applyPurchaserId	string	否	申请人id
applyPurchaserName	string	否	申请人名称
approveType	string	否	审批类型
assignPurchaserContact	string	否	联系方式
assignPurchaserId	string	否	采购员id
assignPurchaserName	string	否	采购员名称
assignPurDeptId	string	否	采购部门id
assignPurDeptName	string	否	采购部门名称
assignPurOrgId	string	否	采购组织id
assignPurOrgName	string	否	采购组织名称
auditorName	string	否	审批人
auditTime	number
小数位数:0,最大长度:13	否	审批时间
canReturnProd	string	否	是否可以售后
carriage	number
小数位数:8,最大长度:28	否	运费
changeStatus	number
小数位数:0,最大长度:1	否	变更状态
channelType	string	否	是否电商(YC:非电商, EC:电商)
checkStatus	string	否	对账状态
closedBy	string	否	关闭人
commentStatus	number
小数位数:0,最大长度:1	否	评价状态（0:可评未评价;1:不可评价;2:评价完成;3:已评可追评;4:不可追评）
commiterName	string	否	提交人
commitFailReason	string	否	提交失败原因
committedTime	number
小数位数:0,最大长度:13	否	提交时间
consigneeDeptId	string	否	收货人部门ID
consigneeDeptName	string	否	收货人部门名称
consigneeEmail	string	否	收货人邮箱
consigneeId	string	否	收货人id
consigneeInfo	string	否	收货人信息
consigneeMobile	string	否	收货人手机号
consigneeName	string	否	收货人名称
consigneeOrgId	string	否	收货人所在组织ID
consigneeOrgName	string	否	收货人所在组织名称
consigneeZip	string	否	收货人邮编
conversionAccuracy	number
小数位数:0,最大长度:10	否	换算率精度
costMaterialId	number
小数位数:0,最大长度:20	否	费用物料ID
costMaterialName	string	否	费用物料
createTime	number
小数位数:0,最大长度:13	否	制单时间
creatorName	string	否	下单人
currencyCode	string	否	币种编码
currencyId	string	否	币种id
currencyName	string	否	币种名称
currencySign	string	否	币种符号
deductionAmount	number
小数位数:8,最大长度:28	否	抵扣金额
deliverAddress	string	否	收货地址
deliverAddressId	number
小数位数:0,最大长度:20	否	收货地址id
deliverAddressType	string	否	发货地址类型(0:个人地址;1:企业地址)
ecSaleOrderCode	string	否	电商订单编号
enableLineAddress	string	否	是否开启行地址
endTime	number
小数位数:0,最大长度:13	否	确认收货时间
enterpriseId	number
小数位数:0,最大长度:20	否	采购商企业id
financialOrgCode	string	否	财务组织编码
financialOrgId	string	否	财务组织id
financialOrgName	string	否	财务组织名称
formatDeliverAddress	string	否	收货地址(格式化后)
integral	number
小数位数:8,最大长度:28	否	抵扣积分
integralRule	string	否	积分抵扣规则
integralRuleId	string	否	积分抵扣规则ID
invcStatus	string	否	开票状态
invoiceCompanyName	string	否	发票抬头
invoiceDetailAddress	string	否	收票地址
invoiceInfo	string	否	发票信息
invoiceMobile	string	否	收票人联系方式
invoicePersonId	string	否	收票人ID
invoicePersonName	string	否	收票人
invoiceRegistAddress	string	否	发票注册地址
invoiceRegistBank	string	否	发票注册银行
invoiceRegistBankAccount	string	否	发票注册银行账号
invoiceRegistTelephone	string	否	发票注册电话
invoiceTaxNo	string	否	纳税人识别号
invoiceState	number
小数位数:0,最大长度:1	否	开票类型(0:不开发票;1:随货开票,2:统一开票)
invoiceType	number
小数位数:0,最大长度:1	否	发票类型(1:增值税普通发票,2:增值税专用发票)
isEmergency	boolean	否	是否紧急采购
isNeedReconciliation	boolean	否	是否需要对账
isOuterCustomer	boolean	否	是否外部客户
isPayAgreement	boolean	否	是否按协议付款
isWfControlled	boolean	否	是否开启审批流
mallType	string	否	区分公共超市和专有超市
memo	string	否	备注
masterOrgKeyField	string	否	主组织
modifierName	string	否	修改人
modifyTime	number
小数位数:0,最大长度:13	否	修改时间
moneydigit	number
小数位数:0,最大长度:2	否	金额精度
operatingOrderType	string	否	订单运营类型(0:允销订单;1:运营订单,2:福利购订单)
operatingOrgId	string	否	运营组织ID
operatingOrgName	string	否	运营组织
orderStatus	string	否	订单状态
orderType	string	否	订单类型
outerCode	string	否	ERP订单号
outerId	string	否	ERP订单ID
ownerId	number
小数位数:0,最大长度:20	否	制单人id
ownerName	string	否	制单人名称
paidErrMsg	string	否	发布销售订单失败
payerId	number
小数位数:0,最大长度:20	否	支付人ID
payInfo	string	否	支付信息
paySN	string	否	支付流水号
payWay	string	否	付款方式
pricedigit	number
小数位数:0,最大长度:10	否	单价精度
processType	string	否	订单流程
projectId	string	否	项目ID
projectName	string	否	项目
pubts	number
小数位数:0,最大长度:13	否	时间戳
purchaserEmail	string	否	采购员邮箱
purchaserId	string	否	采购员id
purchaserInfo	string	否	采购员信息
purchaserMobile	string	否	采购员手机号
purchaserPhone	string	否	采购员电话
pushERP	string	否	是否推送erp
pushERPFailReason	string	否	推ERP失败原因
quantitydigit	number
小数位数:0,最大长度:10	否	数量精度
quotaType	string	否	报价方式(1:面议;2:直接报价;3:阶梯价)
refCancelReaStatus	string	否	供应商拒绝取消状态
refReaStatus	string	否	供应商拒绝状态
rejectCancelReason	string	否	供应商拒绝取消理由
rejectCloseReason	string	否	供应商拒绝关闭理由
rejectReason	string	否	供应商拒绝理由
remaindReturnCarriage	number
小数位数:8,最大长度:28	否	剩余可退运费
remainingPackageMsg	string	否	还差XX件/元包邮
returncount	number
小数位数:0,最大长度:3	否	退回次数
ruleIntegral	number
小数位数:0,最大长度:8	否	积分抵扣规则-多少积分
ruleYuan	number
小数位数:8,最大长度:28	否	积分抵扣规则-抵扣多少金额
settleWay	string	否	结算方式
showOperateOrg	boolean	否	是否显示供应商
status	number
小数位数:0,最大长度:1	否	mdd单据状态
stockOrgId	string	否	库存组织ID
supplierDefaultContact	string	否	供应商默认联系人
supplierDefaultTelephone	string	否	供应商默认联系方式
supplierdocCode	string	否	供应商编码
supplierdocId	number
小数位数:0,最大长度:20	否	供应商档案id
supplierdocName	string	否	供应商档案名称
supplierId	number
小数位数:0,最大长度:20	否	供应商企业id
supplierInfo	string	否	供应商信息
supplierPaymentBankAccount	string	否	供应商收款账号银行账号
supplierPaymentBankName	string	否	供应商收款账号开户行
taxAllowsaleAmountPrice	number
小数位数:8,最大长度:28	否	允销含税总价
taxAmount	number
小数位数:8,最大长度:28	否	含税金额(含运费)
taxAmountWithoutCarriage	number
小数位数:8,最大长度:28	否	不含运费合计
transtypeCode	string	否	交易类型编码
transtypeId	string	否	交易类型id
transtypeName	string	否	交易类型名称
truthCollectCarriage	string	否	是否按实际情况收取运费
userPoints	string	否	剩余可用积分
verifystate	string	否	审批状态
vouchdate	date
格式:yyyy-MM-dd	否	单据日期
warehouseId	number
小数位数:0,最大长度:20	否	仓库档案ID
warehouseName	string	否	收货仓库
ycSaleOrderCode	string	否	销售订单号
ytenant	string	否	租户id
orderdetail	object	是	订单子表
arriveOrder	object	是	到货单
signed	object	是	已签收订单，参数内容同arriveOrder
toDelivery	object	是	待发货订单，参数内容同arriveOrder
toSign	object	是	待签收订单，参数内容同arriveOrder

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 0,
		"code": "",
		"afterDeductionAmount": 0,
		"allowsaleAmountPrice": 0,
		"amount": 0,
		"applyPurchaseDeptId": "",
		"applyPurchaseDeptName": "",
		"applyPurchaseOrgCode": "",
		"applyPurchaseOrgId": "",
		"applyPurchaseOrgName": "",
		"applyPurchaserId": "",
		"applyPurchaserName": "",
		"approveType": "",
		"assignPurchaserContact": "",
		"assignPurchaserId": "",
		"assignPurchaserName": "",
		"assignPurDeptId": "",
		"assignPurDeptName": "",
		"assignPurOrgId": "",
		"assignPurOrgName": "",
		"auditorName": "",
		"auditTime": 0,
		"canReturnProd": "",
		"carriage": 0,
		"changeStatus": 0,
		"channelType": "",
		"checkStatus": "",
		"closedBy": "",
		"commentStatus": 0,
		"commiterName": "",
		"commitFailReason": "",
		"committedTime": 0,
		"consigneeDeptId": "",
		"consigneeDeptName": "",
		"consigneeEmail": "",
		"consigneeId": "",
		"consigneeInfo": "",
		"consigneeMobile": "",
		"consigneeName": "",
		"consigneeOrgId": "",
		"consigneeOrgName": "",
		"consigneeZip": "",
		"conversionAccuracy": 0,
		"costMaterialId": 0,
		"costMaterialName": "",
		"createTime": 0,
		"creatorName": "",
		"currencyCode": "",
		"currencyId": "",
		"currencyName": "",
		"currencySign": "",
		"deductionAmount": 0,
		"deliverAddress": "",
		"deliverAddressId": 0,
		"deliverAddressType": "",
		"ecSaleOrderCode": "",
		"enableLineAddress": "",
		"endTime": 0,
		"enterpriseId": 0,
		"financialOrgCode": "",
		"financialOrgId": "",
		"financialOrgName": "",
		"formatDeliverAddress": "",
		"integral": 0,
		"integralRule": "",
		"integralRuleId": "",
		"invcStatus": "",
		"invoiceCompanyName": "",
		"invoiceDetailAddress": "",
		"invoiceInfo": "",
		"invoiceMobile": "",
		"invoicePersonId": "",
		"invoicePersonName": "",
		"invoiceRegistAddress": "",
		"invoiceRegistBank": "",
		"invoiceRegistBankAccount": "",
		"invoiceRegistTelephone": "",
		"invoiceTaxNo": "",
		"invoiceState": 0,
		"invoiceType": 0,
		"isEmergency": true,
		"isNeedReconciliation": true,
		"isOuterCustomer": true,
		"isPayAgreement": true,
		"isWfControlled": true,
		"mallType": "",
		"memo": "",
		"masterOrgKeyField": "",
		"modifierName": "",
		"modifyTime": 0,
		"moneydigit": 0,
		"operatingOrderType": "",
		"operatingOrgId": "",
		"operatingOrgName": "",
		"orderStatus": "",
		"orderType": "",
		"outerCode": "",
		"outerId": "",
		"ownerId": 0,
		"ownerName": "",
		"paidErrMsg": "",
		"payerId": 0,
		"payInfo": "",
		"paySN": "",
		"payWay": "",
		"pricedigit": 0,
		"processType": "",
		"projectId": "",
		"projectName": "",
		"pubts": 0,
		"purchaserEmail": "",
		"purchaserId": "",
		"purchaserInfo": "",
		"purchaserMobile": "",
		"purchaserPhone": "",
		"pushERP": "",
		"pushERPFailReason": "",
		"quantitydigit": 0,
		"quotaType": "",
		"refCancelReaStatus": "",
		"refReaStatus": "",
		"rejectCancelReason": "",
		"rejectCloseReason": "",
		"rejectReason": "",
		"remaindReturnCarriage": 0,
		"remainingPackageMsg": "",
		"returncount": 0,
		"ruleIntegral": 0,
		"ruleYuan": 0,
		"settleWay": "",
		"showOperateOrg": true,
		"status": 0,
		"stockOrgId": "",
		"supplierDefaultContact": "",
		"supplierDefaultTelephone": "",
		"supplierdocCode": "",
		"supplierdocId": 0,
		"supplierdocName": "",
		"supplierId": 0,
		"supplierInfo": "",
		"supplierPaymentBankAccount": "",
		"supplierPaymentBankName": "",
		"taxAllowsaleAmountPrice": 0,
		"taxAmount": 0,
		"taxAmountWithoutCarriage": 0,
		"transtypeCode": "",
		"transtypeId": "",
		"transtypeName": "",
		"truthCollectCarriage": "",
		"userPoints": "",
		"verifystate": "",
		"vouchdate": "2026-06-07",
		"warehouseId": 0,
		"warehouseName": "",
		"ycSaleOrderCode": "",
		"ytenant": "",
		"orderdetail": [
			{
				"amount": 0,
				"applyPurchaseDeptId": "",
				"applyPurchaseDeptName": "",
				"applyPurchaserId": "",
				"applyPurchaserName": "",
				"arrivedMainQty": 0,
				"arrivedPurQty": 0,
				"arrivedQty": 0,
				"budgetSubjectId": "",
				"budgetSubjectName": "",
				"calculateCoefficient": 0,
				"carriage": true,
				"carriageAmount": 0,
				"carriagePrice": 0,
				"carriageUnit": 0,
				"cartId": "",
				"categoryAllName": "",
				"categoryCode": "",
				"categoryId": "",
				"categoryName": "",
				"channelId": 0,
				"checkStatus": "",
				"consigneeCode": "",
				"consigneeDeptId": "",
				"consigneeEmail": "",
				"consigneeId": "",
				"consigneeMobile": "",
				"consigneeName": "",
				"consigneeOrgId": "",
				"consigneeOrgName": "",
				"consigneeZip": "",
				"contractBillno": "",
				"contractId": 0,
				"contractMaterialId": 0,
				"costProjectId": 0,
				"costProjectName": "",
				"deliverAddress": "",
				"deliverAddressId": 0,
				"detailTaxAmount": 0,
				"enterpriseId": 0,
				"expenseCenterId": 0,
				"expenseCenterName": "",
				"formula": "",
				"formulaCode": "",
				"formulaId": 0,
				"formulaName": "",
				"formulaPrice": "",
				"formulaShow": "",
				"giftsFlag": 0,
				"id": 0,
				"innercode": "",
				"inventory": 0,
				"inventoryStatus": "",
				"isPackage": 0,
				"lineno": 0,
				"mallType": "",
				"materialCode": "",
				"materialId": 0,
				"materialInfo": "",
				"materialMainDigit": 0,
				"materialMainNum": 0,
				"materialMainRount": 0,
				"materialMainUnitCode": "",
				"materialMainUnitId": 0,
				"materialMainUnitName": "",
				"materialName": "",
				"materialPriceDigit": 0,
				"materialPriceRount": 0,
				"materialPriceUnitCode": "",
				"materialPriceUnitId": 0,
				"materialPriceUnitName": "",
				"materialPurDigit": 0,
				"materialPurRount": 0,
				"materialPurUnitCode": "",
				"materialPurUnitId": 0,
				"materialPurUnitName": "",
				"materialUnit": "",
				"memo": "",
				"mergeField": "",
				"minOrderQuantity": 0,
				"openPrice": 0,
				"openTaxprice": 0,
				"orderId": 0,
				"originAmount": 0,
				"originDetailTaxAmount": 0,
				"originPrice": 0,
				"originTaxPrice": 0,
				"origPrice": 0,
				"origTaxprice": 0,
				"outerCode": "",
				"outerId": "",
				"parentCartId": "",
				"payWay": "",
				"planDeliverDate": 0,
				"price": 0,
				"priceExchRate": 0,
				"priceExchRateDen": 0,
				"priceExchRateNum": 0,
				"priceId": 0,
				"priceMark": "",
				"productId": 0,
				"productMainPicture": "",
				"productName": "",
				"productTitle": "",
				"productUnit": "",
				"pubts": 0,
				"purchaseMultiple": 0,
				"purchaseOrgId": "",
				"purchaseQuantity": 0,
				"purchaseQuantityOrigin": 0,
				"purExchRate": 0,
				"purExchRateDen": 0,
				"purExchRateNum": 0,
				"purposeId": 0,
				"purposeName": "",
				"quantity": 0,
				"quotaType": "",
				"receivedMainQty": 0,
				"receivedPurQty": 0,
				"receivedQty": 0,
				"receivedTime": 0,
				"rs": true,
				"showOperateOrg": true,
				"skuCode": "",
				"skuId": 0,
				"sourceId": 0,
				"sourceInfo": "",
				"sourceType": "",
				"status": "",
				"supCategoryId": 0,
				"supplierId": 0,
				"supplierName": "",
				"supplierTaxAmount": 0,
				"taxAmount": 0,
				"taxAmountWithoutCarriage": 0,
				"taxCategoryId": "",
				"taxCategoryTaxrate": 0,
				"taxCategoryValue": 0,
				"taxPrice": 0,
				"taxRate": 0,
				"taxType": "",
				"warehouseCode": "",
				"warehouseId": 0,
				"warehouseName": "",
				"wareInfo": "",
				"ytenant": ""
			}
		],
		"arriveOrder": [
			{
				"arriveOrderCode": "",
				"arriveOrderId": 0,
				"canSign": true,
				"createTime": 0,
				"deliverOrderId": 0,
				"deliveryDate": 0,
				"deliveryMainNum": 0,
				"deliveryNum": 0,
				"deliveryPrice": 0,
				"deliveryPurNum": 0,
				"detailLogisticalCode": "",
				"detailLogisticalComp": "",
				"erpArriveCode": "",
				"erpArriveId": "",
				"id": 0,
				"isServiceMaterial": true,
				"link": "",
				"logisticalCode": "",
				"logisticalComp": "",
				"mallOrderDetailId": 0,
				"materialMainDigit": 0,
				"materialMainRount": 0,
				"materialPriceDigit": 0,
				"materialPriceRount": 0,
				"materialPurDigit": 0,
				"materialPurRount": 0,
				"memo": "",
				"needPushERP": true,
				"planArriveDate": 0,
				"priceExchRate": 0,
				"priceExchRateDen": 0,
				"priceExchRateNum": 0,
				"productSubject": "",
				"purExchRate": 0,
				"purExchRateDen": 0,
				"purExchRateNum": 0,
				"receiveMemo": "",
				"sendErpCode": "",
				"sendErpRsmsg": "",
				"signInBIP": "",
				"signNum": 0,
				"signPrice": 0,
				"signStatus": "",
				"signUser": "",
				"status": "",
				"taxPrice": 0,
				"totalDeliveryPrice": 0,
				"totalSignPrice": 0,
				"trainCode": "",
				"transportCode": "",
				"transportType": ""
			}
		],
		"signed": [
			{}
		],
		"toDelivery": [
			{}
		],
		"toSign": [
			{}
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
999	订单不存在	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-27	
新增
返回参数 (198)
更新
返回参数 (161)
	2	2025-11-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

