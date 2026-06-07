---
title: "混合云BIP供应链到货单同步生成ERP到货单"
apiId: "1759419480243437575"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 混合云BIP供应链到货单同步生成ERP到货单

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorArriveOrders
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
purchaseOrg	string	header	否	组织路由
Body参数
名称	类型	数组	必填	描述
headParallel	object	是	否	到货单表主表平行表
cooperationProcessArrival	string	否	否	到货协同流程
needRetObj	boolean	否	否	是否需要retObj
yuncaiCooperationProcessArrival	string	否	否	云采到货协同流程
createDate	string	否	否	创建日期
modifyDate	string	否	否	修改日期
memo	string	否	否	备注
vendor	float	否	否	供货供应商id
retailInvestors	boolean	否	否	是否散户
purchaseOrg	string	否	否	采购组织id
natCurrency_priceDigit	float	否	否	本币单价精度
contactPhone	string	否	否	联系电话
natCurrency_name	string	否	否	本币名称
creatorId	float	否	否	创建人id
auditTime	string	否	否	审核时间
busType_name	string	否	否	交易类型名称
auditorId	string	否	否	审批人id
exchRateType_name	string	否	否	汇率类型名称
verifystate	String	否	否	审批状态
currency_name	string	否	否	币种名称
srcBill	float	否	否	来源单据id
currency_moneyDigit	float	否	否	币种金额精度
exchRateType	string	否	否	汇率类型id
auditor	string	否	否	审核人
currency	string	否	否	币种id
natCurrency	string	否	否	本币币种id
nativeSum	float	否	否	本币含税金额
inInvoiceOrg	string	否	否	收票组织id
modifyTime	string	否	否	修改时间
isWfControlled	boolean	否	否	是否审批流控制
returncount	float	否	否	退回次数
bizFlow	string	否	否	流程ID
isReturn	boolean	否	否	退货
isFlowCoreBill	boolean	否	否	是否流程核心单据
bizFlow_version	string	否	否	版本信息
createTime	string	否	否	创建时间
exchRate	float	否	否	汇率
currency_code	string	否	否	币种编码
inInvoiceOrg_name	string	否	否	收票组织名称
status	float	否	否	单据状态
org	string	否	否	组织id
auditDate	string	否	否	提交日期
id	float	否	否	到货单id
exchRateType_Digit	float	否	否	汇率类型精度
invoiceSupplier	float	否	否	开票供应商
purchaseAgent	string	否	否	采购员id
receiver	string	否	否	收货人
arrivalOrders	object	是	否	到货单子表信息
upLineno	string	否	否	来源单据行号
yuncaiArrivalOrderId	string	否	否	云采到货单主键
yuncaiArrivalOrderBodyId	string	否	否	云采到货单行主键
yuncaiOrderCode	string	否	否	云采到货单编码
memo	string	否	否	备注
purchaseSourceAutoId	int	否	否	采购订单子表id
batchno	string	否	否	批号
bodyParallel	object	是	否	到货单表体平行表
purchaseRefuseQty	float	否	否	拒绝数量
_status	string	否	是	Insert
sourceMainPubts	string	否	否	时间戳
taxitems_code	string	否	是	税目税率id
warehouse	float	否	否	仓库id
firstsource	string	否	否	源头单据类型
discountTaxType	float	否	否	扣税类别
project_code	string	否	否	项目名称
sourceProDescFlag	string	否	否	来源描述物料标识
isLogisticsRelated	boolean	否	是	物流相关
unitExchangeTypePrice	float	否	是	计价单位转换率的换算方式
makeRule	string	否	否	生单规则
DemandOrg_name	string	否	否	需求组织名称
unit_Precision	float	否	否	主计量精度
purUOM_Name	string	否	否	采购单位名称
productsku_cName	string	否	否	物料sku名称
realProductAttributeType	float	否	否	实物商品属性
sourceid	float	否	否	来源单据id
invExchRate	float	否	否	销售换算率
firstupcode	string	否	否	源头单据号
firstsourceid	float	否	否	源头单据主表id
totalInQuantity	float	否	否	累计入库数量
natMoney	float	否	否	本币无税金额
priceUOM_Name	string	否	否	计价单位名称
unit	float	否	否	主计量单位ID
product	float	否	否	物料id
id	float	否	否	到货单id
isGift	boolean	否	否	赠品
product_cName	string	否	否	物料名称
product_cCode	string	否	否	物料编码
valuationRefuseQty	float	否	否	计价拒收数量
pubts	string	否	否	时间戳字符串
oriTax	float	否	否	税额
acceptqty	float	否	否	到货数量accept
oriTaxUnitPrice	float	否	否	含税成交价
rowno	float	否	否	行号
makeRuleCode	string	否	否	生单规则编号
realProductAttribute	float	否	否	物料属性
natTaxUnitPrice	float	否	否	本币含税单价
source	string	否	否	来源单据类型
purchaseAcceptQty	float	否	否	到货数量purchase
firstsourceautoid	float	否	否	源头单据子表id
refuseqty	float	否	否	拒收数量
purUOM_Code	string	否	否	采购单位编码
upcode	string	否	否	来源单据号
natTax	float	否	否	本币税额
subQty	float	否	否	件数
oriMoney	float	否	否	无税金额
mainid	float	否	否	主表id
oriSum	float	否	否	含税金额
productsku	float	否	否	商品SKUid
isBatchManage	boolean	否	否	是否批次管理
isExpiryDateManage	boolean	否	否	是否效期管理
qty	float	否	否	数量
product_productOfflineRetail_purchaseUnit	float	否	否	采购单位id
sourceautoid	float	否	否	上游单据子表id
maxLimitPrice	float	否	否	最高限价
natUnitPrice	float	否	否	本币无税单价
virtualProductAttribute	float	否	否	虚拟物料类型
valuationAcceptQty	float	否	否	计价实收数量
natSum	float	否	否	本币金额
purUOM	float	否	否	pur采购单位id
priceUOM_Precision	float	否	否	计价单位精度
invPriceExchRate	float	否	否	计价换算率
priceUOM_Code	string	否	否	计价单位编码
productsku_cCode	string	否	否	物料sku编码
priceQty	float	否	否	计价数量
unit_name	string	否	否	主计量单位
oriUnitPrice	float	否	否	无税单价
DemandOrg	string	否	否	需求组织id
priceUOM	float	否	否	计价单位id
unitExchangeType	float	否	否	换算方式
purUOM_Precision	float	否	否	销售单位精度
taxRate	float	否	否	税率
totalQuantity	float	否	否	总数量
resubmitCheckKey	string	否	是	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
_status	string	否	是	操作标识
pubts	string	否	否	时间戳字符串
natCurrency_code	string	否	否	本币编码
modifierId	string	否	否	修改人id
creator	string	否	否	创建者
invoiceSupplier_name	string	否	否	支持发票名称
busType	string	否	否	业务类型id
code	string	否	否	单据编码
isContract	boolean	否	是	是否需要与供应商协同
natCurrency_moneyDigit	float	否	否	本币金额精度
modifier	string	否	否	修改人
vouchdate	string	否	否	单据日期
vendor_name	string	否	否	供应商名称
purchaseOrg_name	string	否	否	采购组织名称
org_name	string	否	否	销售组织名称
currency_priceDigit	float	否	否	原币单价精度

## 3. 请求示例

Url: /yonbip/cpu/connectorArriveOrders?access_token=访问令牌
Header: 
	purchaseOrg : ""
Body: [{
	"headParallel": [
		{
			"cooperationProcessArrival": ""
		}
	],
	"needRetObj": true,
	"yuncaiCooperationProcessArrival": "",
	"createDate": "",
	"modifyDate": "",
	"memo": "",
	"vendor": 0,
	"retailInvestors": true,
	"purchaseOrg": "",
	"natCurrency_priceDigit": 0,
	"contactPhone": "",
	"natCurrency_name": "",
	"creatorId": 0,
	"auditTime": "",
	"busType_name": "",
	"auditorId": "",
	"exchRateType_name": "",
	"verifystate": "",
	"currency_name": "",
	"srcBill": 0,
	"currency_moneyDigit": 0,
	"exchRateType": "",
	"auditor": "",
	"currency": "",
	"natCurrency": "",
	"nativeSum": 0,
	"inInvoiceOrg": "",
	"modifyTime": "",
	"isWfControlled": true,
	"returncount": 0,
	"bizFlow": "",
	"isReturn": true,
	"isFlowCoreBill": true,
	"bizFlow_version": "",
	"createTime": "",
	"exchRate": 0,
	"currency_code": "",
	"inInvoiceOrg_name": "",
	"status": 0,
	"org": "",
	"auditDate": "",
	"id": 0,
	"exchRateType_Digit": 0,
	"invoiceSupplier": 0,
	"purchaseAgent": "",
	"receiver": "",
	"arrivalOrders": [
		{
			"upLineno": "",
			"yuncaiArrivalOrderId": "",
			"yuncaiArrivalOrderBodyId": "",
			"yuncaiOrderCode": "",
			"memo": "",
			"purchaseSourceAutoId": 0,
			"batchno": "",
			"bodyParallel": [
				{
					"erpOrderNo": "",
					"erpOrderBodyId": "",
					"erpOrderId": ""
				}
			],
			"purchaseRefuseQty": 0,
			"_status": "",
			"sourceMainPubts": "",
			"taxitems_code": "",
			"warehouse": 0,
			"firstsource": "",
			"discountTaxType": 0,
			"project_code": "",
			"sourceProDescFlag": "",
			"isLogisticsRelated": true,
			"unitExchangeTypePrice": 0,
			"makeRule": "",
			"DemandOrg_name": "",
			"unit_Precision": 0,
			"purUOM_Name": "",
			"productsku_cName": "",
			"realProductAttributeType": 0,
			"sourceid": 0,
			"invExchRate": 0,
			"firstupcode": "",
			"firstsourceid": 0,
			"totalInQuantity": 0,
			"natMoney": 0,
			"priceUOM_Name": "",
			"unit": 0,
			"product": 0,
			"id": 0,
			"isGift": true,
			"product_cName": "",
			"product_cCode": "",
			"valuationRefuseQty": 0,
			"pubts": "",
			"oriTax": 0,
			"acceptqty": 0,
			"oriTaxUnitPrice": 0,
			"rowno": 0,
			"makeRuleCode": "",
			"realProductAttribute": 0,
			"natTaxUnitPrice": 0,
			"source": "",
			"purchaseAcceptQty": 0,
			"firstsourceautoid": 0,
			"refuseqty": 0,
			"purUOM_Code": "",
			"upcode": "",
			"natTax": 0,
			"subQty": 0,
			"oriMoney": 0,
			"mainid": 0,
			"oriSum": 0,
			"productsku": 0,
			"isBatchManage": true,
			"isExpiryDateManage": true,
			"qty": 0,
			"product_productOfflineRetail_purchaseUnit": 0,
			"sourceautoid": 0,
			"maxLimitPrice": 0,
			"natUnitPrice": 0,
			"virtualProductAttribute": 0,
			"valuationAcceptQty": 0,
			"natSum": 0,
			"purUOM": 0,
			"priceUOM_Precision": 0,
			"invPriceExchRate": 0,
			"priceUOM_Code": "",
			"productsku_cCode": "",
			"priceQty": 0,
			"unit_name": "",
			"oriUnitPrice": 0,
			"DemandOrg": "",
			"priceUOM": 0,
			"unitExchangeType": 0,
			"purUOM_Precision": 0,
			"taxRate": 0,
			"totalQuantity": 0
		}
	],
	"resubmitCheckKey": "",
	"_status": "",
	"pubts": "",
	"natCurrency_code": "",
	"modifierId": "",
	"creator": "",
	"invoiceSupplier_name": "",
	"busType": "",
	"code": "",
	"isContract": true,
	"natCurrency_moneyDigit": 0,
	"modifier": "",
	"vouchdate": "",
	"vendor_name": "",
	"purchaseOrg_name": "",
	"org_name": "",
	"currency_priceDigit": 0
}]

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
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
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

