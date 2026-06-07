---
title: "开票申请查询"
apiId: "1858904649533751297"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Request"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请查询

>  请求方式	POST | Invoicing Request (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/invoice/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	查询条件集合
tid	string	否	否	交易编号
shopId	string	否	否	店铺id
shopCode	string	否	否	店铺编码
createDateStart	DateTime	否	否	单据日期(开始)
createDateEnd	DateTime	否	否	单据日期(结束)
verifystate	string	否	否	单据状态 示例：0-开立、2-已审核
code	string	否	否	单据编号
invoiceType	string	否	否	发票类型 示例：1-纸质普票、2-纸质专票、3-电子普票、4-电子专票、5-数电普通发票、6-数电专用发票、7-数电纸质普票、8-数电纸质专票
normalInvoiceNo	string	否	否	发票号码
pageSize	int	否	是	每页显示行数
pageIndex	int	否	是	页码

## 3. 请求示例

Url: /yonbip/sd/dst/invoice/query?access_token=访问令牌
Body: {
	"partParam": {
		"tid": "",
		"shopId": "",
		"shopCode": "",
		"createDateStart": "",
		"createDateEnd": "",
		"verifystate": "0-开立、2-已审核",
		"code": "",
		"invoiceType": "1-纸质普票、2-纸质专票、3-电子普票、4-电子专票、5-数电普通发票、6-数电专用发票、7-数电纸质普票、8-数电纸质专票",
		"normalInvoiceNo": "",
		"pageSize": 0,
		"pageIndex": 0
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
bizInvoiceDetailAmount	string	否	商品金额
bizInvoiceDetailDiscountFee	string	否	商家优惠金额
bizInvoiceDetailGoodType	string	否	商品类型
bizInvoiceDetailInvoiceAmount	string	否	开票金额
bizInvoiceDetailIsGift	string	否	赠品
bizInvoiceDetailItemName	string	否	货物和劳务名称
bizInvoiceDetailNoTaxAmount	string	否	无税金额
bizInvoiceDetailPrice	string	否	商品价格
bizInvoiceDetailProductCode	string	否	商品编码
bizInvoiceDetailProductName	string	否	商品名称
bizInvoiceDetailQuantity	string	否	购买数量
bizInvoiceDetailSkuCode	string	否	SKU编码
bizInvoiceDetailTax	string	否	税额
bizInvoiceDetailTaxRate	string	否	销项税率%
bizInvoiceDetailTid	string	否	来源单据交易编号
bizInvoiceDetailUnit	string	否	单位
bizInvoiceStatus	string	否	业务发票状态
buyerMobil	string	否	收货人手机号
buyerName	string	否	收货人姓名
code	string	否	单据编号
createDate	string	否	单据日期
creator	string	否	创建人
ctradecode	string	否	订单编号
financeOrg	string	否	开票组织id
financeOrgName	string	否	开票组织
id	string	否	主表id
invoiceAmount	string	否	开票金额
invoiceStatus	string	否	开票状态
invoiceType	string	否	发票类型
isInvoice	string	否	需要开票
isRedInvoice	string	否	已开红票
makeInvoiceType	string	否	单据方向
org	string	否	销售组织ID
orgName	string	否	销售组织
payerAddress	string	否	注册地址
payerMobile	string	否	接收发票手机号
payerName	string	否	发票抬头
payerPhone	string	否	注册电话
pubts	string	否	时间戳
serialNo	string	否	开票请求流水号
shopCode	string	否	店铺编码
shopId	string	否	店铺ID
shopName	string	否	店铺名称
tid	string	否	交易编码
transtype	string	否	交易类型ID
transtypeName	string	否	交易类型
verifystate	string	否	单据状态

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"bizInvoiceDetailAmount": "",
		"bizInvoiceDetailDiscountFee": "",
		"bizInvoiceDetailGoodType": "",
		"bizInvoiceDetailInvoiceAmount": "",
		"bizInvoiceDetailIsGift": "",
		"bizInvoiceDetailItemName": "",
		"bizInvoiceDetailNoTaxAmount": "",
		"bizInvoiceDetailPrice": "",
		"bizInvoiceDetailProductCode": "",
		"bizInvoiceDetailProductName": "",
		"bizInvoiceDetailQuantity": "",
		"bizInvoiceDetailSkuCode": "",
		"bizInvoiceDetailTax": "",
		"bizInvoiceDetailTaxRate": "",
		"bizInvoiceDetailTid": "",
		"bizInvoiceDetailUnit": "",
		"bizInvoiceStatus": "",
		"buyerMobil": "",
		"buyerName": "",
		"code": "",
		"createDate": "",
		"creator": "",
		"ctradecode": "",
		"financeOrg": "",
		"financeOrgName": "",
		"id": "",
		"invoiceAmount": "",
		"invoiceStatus": "",
		"invoiceType": "",
		"isInvoice": "",
		"isRedInvoice": "",
		"makeInvoiceType": "",
		"org": "",
		"orgName": "",
		"payerAddress": "",
		"payerMobile": "",
		"payerName": "",
		"payerPhone": "",
		"pubts": "",
		"serialNo": "",
		"shopCode": "",
		"shopId": "",
		"shopName": "",
		"tid": "",
		"transtype": "",
		"transtypeName": "",
		"verifystate": ""
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
999	查询异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-05-20	
更新
请求参数 invoiceType
开放平台Bug需要重新抽脚本发布

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

