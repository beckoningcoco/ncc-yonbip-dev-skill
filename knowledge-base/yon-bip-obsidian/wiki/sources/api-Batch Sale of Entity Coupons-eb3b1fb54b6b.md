---
title: "优惠券核销"
apiId: "eb3b1fb54b6b405eab72ea8232ad51b8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Coupon"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Coupon]
platform_version: "BIP"
source_type: community-api-docs
---

# 优惠券核销

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/consume
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
mid	long	否	否	会员统一id 示例：10000001
expense_type	long	否	是	优惠券核销类型（1:线上交易,2:线下交易,3:O2O自闭环,4:U会员PC端,5:第三方） 示例：1
sns	object	是	是	优惠券流水码集合
ts	string	否	是	优惠券最后一次更新的时间 示例：2016-03-03 20:53:27
sn	string	否	是	卡券编码 示例：926150422164516
pwd	string	否	否	卡密码 示例：123
offset_sum	BigDecimal	否	否	实际核销金额 示例：66
callback_rebate_sum	BigDecimal	否	否	回收金额 示例：55
use_times	long	否	否	使用次数(计次卡必传) 示例：5
source1	string	否	是	来源依据（单据编号） 示例：201512120000001
source2	string	否	否	来源依据（单据编号） 示例：201512120000001
member_scope_level	long	否	否	核销维度 0：平台（默认） 1：组织 2：商家 示例：2
member_scope_id	string	否	否	核销商家(或 组织)id维度 示例：67
store_id	long	否	否	核销门店id 示例：1442
store_employee_id	long	否	否	核销店员id 示例：101
consume_code	string	否	否	核销单号(核销卡券的零售单号/商城订单号) 示例：sc89999

## 3. 请求示例

Url: /yonbip/sd/coupon/consume?access_token=访问令牌
Body: {
	"mid": 10000001,
	"expense_type": 1,
	"sns": [
		{
			"ts": "2016-03-03 20:53:27",
			"sn": "926150422164516",
			"pwd": "123",
			"offset_sum": 66,
			"callback_rebate_sum": 55,
			"use_times": 5
		}
	],
	"source1": "201512120000001",
	"source2": "201512120000001",
	"member_scope_level": 2,
	"member_scope_id": "67",
	"store_id": 1442,
	"store_employee_id": 101,
	"consume_code": "sc89999"
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
message	string	否	提示信息 示例：操作成功
data	string	否	返回数据 示例：核销成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "核销成功"
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
404	优惠券核销失败	请求参数填写有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-03	
更新
请求说明
更新
请求参数 mid
优惠券核销会员变化为非必填

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

