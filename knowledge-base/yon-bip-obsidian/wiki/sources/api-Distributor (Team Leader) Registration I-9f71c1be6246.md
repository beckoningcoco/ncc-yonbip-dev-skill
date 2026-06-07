---
title: "会员钱包充值"
apiId: "9f71c1be62464f4693ef396188eaaea9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Community Leader"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Community Leader]
platform_version: "BIP"
source_type: community-api-docs
---

# 会员钱包充值

>  请求方式	POST | Community Leader (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/wallet/deposit
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
mid	string	否	是	会员ID 示例：2301716730695936
archiveId	string	否	是	钱包账户ID 示例：1909149483307264
sum	BigDecimal	否	是	充值到账金额,充值为正数(必须满足sum=settleSum+discount)，直接余额退款为负数（如1300.00,-1300.00） 示例：1300.00
settleSum	BigDecimal	否	是	结算金额\实收金额(sum为正数时有意义，sum为负数时传入0) 示例：1300
discount	BigDecimal	否	是	折扣额\赠送金额(isExternalDiscount为1且sum为正数时有效，否则传入0) 示例：1
actionTypes	int	否	是	交易类型(1:充值 10:退款转充值 4:余额退款)，sum为负数时必须传入4 示例：1
isExternalDiscount	int	否	是	是否外部系统决定赠送（1:是，0:否），若为0，则会尝试匹配系统维护的储值活动完成赠送 示例：0
voucherCode	string	否	是	相关单据号(不作为判重标志) 示例：001
source1	string	否	是	外部系统单据主键标识(不作为判重标志) 示例：x0001
paymentWay	long	否	是	支付方式(1:现金 2：支付宝 3：微信支付 5:银联 101:会员钱包 1000:企业赠送)，若settleSum=0且sum=discount，传入1000，表示本次充值没有实收金额，全部记入折扣金额,若sum 为负数，传入101，表示会员钱包金额扣减 示例：1

## 3. 请求示例

Url: /yonbip/sd/wallet/deposit?access_token=访问令牌
Body: {
	"mid": "2301716730695936",
	"archiveId": "1909149483307264",
	"sum": 1300,
	"settleSum": 1300,
	"discount": 1,
	"actionTypes": 1,
	"isExternalDiscount": 0,
	"voucherCode": "001",
	"source1": "x0001",
	"paymentWay": 1
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
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	提示信息 示例：success
data	object	是	返回数据对象
id	string	否	流水ID 示例：2383431372853504
mid	string	否	会员ID 示例：2301716730695936
archiveId	string	否	账户档案ID 示例：1909149483307264
walletId	string	否	账户ID 示例：2383288022913280
sum	BigDecimal	否	充值到账金额 示例：1400
settleSum	BigDecimal	否	结算金额 示例：1300
discount	long	否	折扣额(总赠送金额） 示例：100
balance	long	否	余额 示例：2600
discountBalance	long	否	折扣余额 示例：180
actionType	int	否	交易类型（1:充值 10:退款转充值） 示例：1
paymentWay	long	否	支付方式(1:现金 2：支付宝 3：微信支付 5:银联) 示例：1
outSystemKey	string	否	相关单据号 示例：001
source1	string	否	外部系统单据主键标识 示例：x0001
createTime	DateTime	否	创建时间 示例：2021-08-11 17:11:46
systemFlag	string	否	业务发生系统标志 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{
			"id": "2383431372853504",
			"mid": "2301716730695936",
			"archiveId": "1909149483307264",
			"walletId": "2383288022913280",
			"sum": 1400,
			"settleSum": 1300,
			"discount": 100,
			"balance": 2600,
			"discountBalance": 180,
			"actionType": 1,
			"paymentWay": 1,
			"outSystemKey": "001",
			"source1": "x0001",
			"createTime": "2021-08-11 17:11:46",
			"systemFlag": "0"
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
404	未查询到数据	查询条件填写有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (10)
更新
返回参数 (18)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

