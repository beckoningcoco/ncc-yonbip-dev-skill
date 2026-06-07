---
title: "采购商城订单保存"
apiId: "2027178495986106370"
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

# 采购商城订单保存

>  请求方式	POST | Mall Order (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/mdd/openapi/order/save
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
deliverAddressId	number
小数位数:0,最大长度:19	否	是	收货地址ID 示例：1733488503422976000
applyPurchaseOrgCode	string	否	是	需求组织编码 示例：0000000001
applyPurchaseDeptCode	string	否	是	需求部门编码 示例：yyjtbm
applyPurchaserCode	string	否	是	申请人编码 示例：00009768
assignPurchaserCode	string	否	是	采购员编码 示例：00009768
assignPurOrgCode	string	否	是	采购组织编码 示例：pkm04
assignPurDeptCode	string	否	是	采购部门编码 示例：pkm04
financialOrgCode	string	否	是	财务组织编码 示例：pkm00
invoiceState	number
小数位数:0,最大长度:10	否	是	开票类型(0:不开票，1:随货开票，2:统一开票) 示例：2
invoiceType	number
小数位数:0,最大长度:10	否	否	发票类型(当不开票时传此值无效,1:增值税普通发票，2:增值税专用发票) 示例：2
assignPurchaserContact	string	否	否	联系方式 示例：13788888888
transtypeCode	string	否	否	交易类型编码 示例：wbyycg
costMaterialCode	string	否	否	费用物料编码(必须是虚拟物料,订单产生产运费时必输) 示例：00000002
memo	string	否	否	备注 示例：临时采购
orderdetail	object	是	是	商品子表
supCategoryId	number
小数位数:0,最大长度:19	否	是	供货目录id 示例：1993179457557364700
skuId	number
小数位数:0,最大长度:19	否	否	skuId,与supCategoryId二选一必填，建议传supCategoryId 示例：1478854504031453195
purchaseOrgCode	string	否	否	允销组织编码，同一个sku可能允销给多个组织，需要用此区分，传skuId时，此字段必输 示例：0000000001
priceId	number
小数位数:0,最大长度:19	否	否	运营商品的价格协议ID，传skuid时，用此字段区分是否为运营商品，不传则认为是允销商品 示例：1786543987614562
giftsFlag	string	否	否	赠品标识(0:普通商品，1:赠品) 示例：0
materialCode	string	否	否	物料编码 示例：st01000001
memo	string	否	否	备注 示例：加急发货
planDeliverDate	string	否	否	计划收货日期 示例：2023-04-10
quantity	number
小数位数:0,最大长度:10	否	是	数量 示例：5
purposeId	number
小数位数:0,最大长度:19	否	否	采购用途id 示例：1773495780108140500

## 3. 请求示例

Url: /yonbip/cpu/mdd/openapi/order/save?access_token=访问令牌
Body: {
	"deliverAddressId": 1733488503422976000,
	"applyPurchaseOrgCode": "0000000001",
	"applyPurchaseDeptCode": "yyjtbm",
	"applyPurchaserCode": "00009768",
	"assignPurchaserCode": "00009768",
	"assignPurOrgCode": "pkm04",
	"assignPurDeptCode": "pkm04",
	"financialOrgCode": "pkm00",
	"invoiceState": 2,
	"invoiceType": 2,
	"assignPurchaserContact": "13788888888",
	"transtypeCode": "wbyycg",
	"costMaterialCode": "00000002",
	"memo": "临时采购",
	"orderdetail": [
		{
			"supCategoryId": 1993179457557364700,
			"skuId": 1478854504031453195,
			"purchaseOrgCode": "0000000001",
			"priceId": 1786543987614562,
			"giftsFlag": "0",
			"materialCode": "st01000001",
			"memo": "加急发货",
			"planDeliverDate": "2023-04-10",
			"quantity": 5,
			"purposeId": 1773495780108140500
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
message	string	否	提示信息
code	string	否	返回值编码

## 5. 正确返回示例

{
	"message": "",
	"code": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	第1行商品未匹配到供货目录	请求参数有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-24	
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

