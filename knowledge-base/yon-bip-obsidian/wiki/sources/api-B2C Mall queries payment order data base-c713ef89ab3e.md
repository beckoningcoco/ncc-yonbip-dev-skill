---
title: "B2C商城根据支付单号查询支付单数据"
apiId: "c713ef89ab3e418c9cb7bc08e5876821"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城根据支付单号查询支付单数据

>  请求方式	GET | Collection (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/paymentvouchers/info
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pay_no	string	query	是	收款单号 因需求支付单号后面需添加两位字符    示例: P-107ad210514005AA

## 3. 请求示例

Url: /yonbip/sd/paymentvouchers/info?access_token=访问令牌&pay_no=P-107ad210514005AA

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
code	long	否	成功标识 示例：200
message	string	否	返回消息提示 示例：操作成功
data	object	否	数据对象信息
iCorpId	long	否	企业id 示例：2000049
iMemberId	long	否	会员id 示例：32355
cOrderNo	string	否	订单号 示例：O-2000049-32355-20191107-001
iOrderId	long	否	订单id 示例：9779
iPayType	long	否	支付类型 线上、线下 示例：1
cPayNo	string	否	支付单号 示例：P-2000049-32355-20191107-001
cPayBusinessCode	string	否	支付类型，业务号 示例：ORDER
iPayMentStatusCode	long	否	支付状态 示例：2
iAmount	long	否	付款金额 示例：12
dPayCreateDate	string	否	支付创建 示例：2019-11-07 16:47:26.000
dPayCompleteDate	string	否	支付完成时间 示例：2019-11-07 16:47:26.000
iPayUserId	long	否	付款人Id 示例：32355
remark	string	否	备注 示例：钱包支付
iDeleted	long	否	删除标志 示例：0
bAllUsed	boolean	否	支付单是否已经完全使用 示例：false
trade_type	string	否	微信中支付方式 示例：STORAGE
payAttach	string	否	支付附件信息 (微信支付时，wid)
paymentVoucherType	string	否	支付单类型 示例：normal
isSeperate	boolean	否	是否已拆单 false: 未拆 示例：false
wallet_id	long	否	钱包id 示例：19
cWalletName	string	否	钱包名称 示例：赠送账户（北清路店）
dailyStatus	string	否	日报状态 示例：0
cProductProperty	string	否	商品性质和属性 示例：BUSINESS
cPaymentErpCode	string	否	支付方式商家编码 示例：dede
storageDiscount	long	否	钱包折扣金额 示例：12
cPayType	string	否	支付类型 （畅捷支付、支付宝支付） 示例：storagecard
pubuts	string	否	时间戳 示例：2019-11-07 16:47:25.000
id	long	否	收款单id 示例：7248

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"iCorpId": 2000049,
		"iMemberId": 32355,
		"cOrderNo": "O-2000049-32355-20191107-001",
		"iOrderId": 9779,
		"iPayType": 1,
		"cPayNo": "P-2000049-32355-20191107-001",
		"cPayBusinessCode": "ORDER",
		"iPayMentStatusCode": 2,
		"iAmount": 12,
		"dPayCreateDate": "2019-11-07 16:47:26.000",
		"dPayCompleteDate": "2019-11-07 16:47:26.000",
		"iPayUserId": 32355,
		"remark": "钱包支付",
		"iDeleted": 0,
		"bAllUsed": false,
		"trade_type": "STORAGE",
		"payAttach": "",
		"paymentVoucherType": "normal",
		"isSeperate": false,
		"wallet_id": 19,
		"cWalletName": "赠送账户（北清路店）",
		"dailyStatus": "0",
		"cProductProperty": "BUSINESS",
		"cPaymentErpCode": "dede",
		"storageDiscount": 12,
		"cPayType": "storagecard",
		"pubuts": "2019-11-07 16:47:25.000",
		"id": 7248
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
999	未传支付单号	必传支付单号

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

