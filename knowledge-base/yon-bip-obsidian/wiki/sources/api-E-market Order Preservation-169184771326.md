---
title: "云采超市订单保存"
apiId: "1691847713260306435"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市订单保存

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/savemallorder
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
deliverAddressId	long	否	是	收货地址id 示例：1536609015170072582
applyPurchaseOrgCode	string	否	是	需求组织编码 示例：default_org
applyPurchaseDeptcode	string	否	是	需求部门编码 示例：default_dept
applyPurchaserCode	string	否	是	申请人编码 示例：00000001
assignPurchaserCode	string	否	是	采购员编码 示例：00000001
assignPurorgCode	string	否	是	采购组织编码 示例：default_org
assignPurdeptCode	string	否	是	采购部门编码 示例：default_dept
financialOrgCode	string	否	是	财务组织编码 示例：default_org
invoiceState	int	否	是	开票类型:0不开票，1随货开票，2统一开票 示例：2
invoiceType	int	否	否	发票类型,当不开票时，传此值无效:1增值税普通发票，2增值税专用发票 示例：1
assignPurchaserContact	string	否	否	联系方式 示例：13788888888
transtypeCode	string	否	否	交易类型编码 示例：tradetypecode
memo	string	否	否	订单备注 示例：临时采购
detailList	object	是	是	超市订单明细
skuId	long	否	否	sku的主键id,与supplyCategoryId二选一必填，建议传supplyCategoryId
purchaseOrgCode	string	否	否	允销组织编码，来源于供货目录的允销组织，当同一sku在超市商品上架有多条时，建议传这个来唯一确定
supplyCategoryId	long	否	否	供货目录id，与skuId二选一必填，建议使用这个 示例：1478854504031453195
giftsFlag	string	否	否	赠品标识：1是赠品，0表示非赠品，默认为0 示例：0
materialCode	string	否	否	物料编码 示例：code001
memo	string	否	否	订单行备注 示例：加急发货
planDeliverDate	string	否	否	期望交期 示例：2023-04-10
purchaseQuantity	BigDecimal	否	是	采购数量 示例：1
purposeId	long	否	否	用途id 示例：1478854504031453133
priceId	long	否	否	运营商品的价格协议ID，如果传supplyCategoryId可不传，如果传skuid且下单运营商品，则必须传 示例：1786543987614562

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/savemallorder?access_token=访问令牌
Body: {
	"deliverAddressId": 1536609015170072582,
	"applyPurchaseOrgCode": "default_org",
	"applyPurchaseDeptcode": "default_dept",
	"applyPurchaserCode": "00000001",
	"assignPurchaserCode": "00000001",
	"assignPurorgCode": "default_org",
	"assignPurdeptCode": "default_dept",
	"financialOrgCode": "default_org",
	"invoiceState": 2,
	"invoiceType": 1,
	"assignPurchaserContact": "13788888888",
	"transtypeCode": "tradetypecode",
	"memo": "临时采购",
	"detailList": [
		{
			"skuId": 0,
			"purchaseOrgCode": "",
			"supplyCategoryId": 1478854504031453195,
			"giftsFlag": "0",
			"materialCode": "code001",
			"memo": "加急发货",
			"planDeliverDate": "2023-04-10",
			"purchaseQuantity": 1,
			"purposeId": 1478854504031453133,
			"priceId": 1786543987614562
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
code	string	否	响应码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	是	保存成功后，会对账期支付的超市单据自动提交，如果失败，会在这里返回失败的相关信息，如果全部提交成功，则返回null
failOrderCode	string	否	自动提交失败的超市订单号 示例：111
failCause	string	否	自动提交失败原因 示例：部分商品已经无货，请刷新查看

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"failOrderCode": "111",
			"failCause": "部分商品已经无货，请刷新查看"
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
999	地址不存在!	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求参数 deliverAddressId
更新
请求参数 applyPurchaseOrgCode
更新
返回参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

