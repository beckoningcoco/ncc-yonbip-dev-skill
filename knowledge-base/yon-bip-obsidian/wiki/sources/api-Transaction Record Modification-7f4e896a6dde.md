---
title: "交易记录修改"
apiId: "7f4e896a6dde4cb8ae3007bb510aba97"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transaction Record"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 交易记录修改

>  请求方式	POST | Transaction Record (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/orders/batch/updateNew
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
add	object	是	否	新增订单信息
promotional_discount	BigDecimal	否	否	促销折扣额 示例：0.000000
mid	string	否	是	会员id 示例：2732903518933248
sum	BigDecimal	否	否	交易金额(退货单为负数) 示例：6200
discount_sum	BigDecimal	否	否	优惠总金额 示例：2480.000000
type	int	否	否	订单类型(0 商家自定,2 商城订单 3商城积分兑换订单) 示例：0
use_points	long	否	否	使用积分数量 示例：0
store_id	long	否	否	门店id 示例：1992269099749632
pay_sum	BigDecimal	否	否	支付金额(退货单为负数) 示例：3720
small_change_discount	BigDecimal	否	否	抹零金额 示例：0.000000
deduction_apportionment	BigDecimal	否	否	抵扣分摊额 示例：0.000000
trade_code	string	否	是	交易订单 示例：LS000120220518000011
spot_discount	BigDecimal	否	否	现场折扣额 示例：0.000000
trade_date	DateTime	否	是	交易日期 示例：2022-05-18 16:51:51
out_sys_main_key	string	否	是	订单外键 示例：2779609419158784
membership_discount	BigDecimal	否	否	会员折扣额 示例：2480.000000
award_points	long	否	否	商品转移给客户的积分 示例：0
coupon_apportionment	BigDecimal	否	否	优惠券分摊额 示例：0.000000
is_storage	boolean	否	否	是否钱包充值 示例：false
status	long	否	是	订单状态(1:已付款、2:已发货、3:已收货、4:已完成、99:已退货) 示例：5
details	object	是	是	交易记录详情
pay_details	object	是	否	支付方式
app_id	string	否	否	会籍id(多会籍租户必传) 示例：yl_z5nqc7bDikBX
remove	object	是	否	要删除订单信息
out_sys_key	string	否	否	订单详情外键
out_sys_main_key	string	否	是	订单外键 示例：2779609419158784

## 3. 请求示例

Url: /yonbip/sd/orders/batch/updateNew?access_token=访问令牌
Body: {
	"add": [
		{
			"promotional_discount": 0,
			"mid": "2732903518933248",
			"sum": 6200,
			"discount_sum": 2480,
			"type": 0,
			"use_points": 0,
			"store_id": 1992269099749632,
			"pay_sum": 3720,
			"small_change_discount": 0,
			"deduction_apportionment": 0,
			"trade_code": "LS000120220518000011",
			"spot_discount": 0,
			"trade_date": "2022-05-18 16:51:51",
			"out_sys_main_key": "2779609419158784",
			"membership_discount": 2480,
			"award_points": 0,
			"coupon_apportionment": 0,
			"is_storage": false,
			"status": 5,
			"details": [
				{
					"goods_code": "000105",
					"promotional_discount": 0,
					"out_sys_key": "2779773552661248",
					"memo": "西城:订单LS000120220518000011,消费2520.0元",
					"sum": 4200,
					"relation_type": 0,
					"discount_rate": 60,
					"use_points": 0,
					"goods_class_code": "02",
					"store_id": 1992269099749632,
					"goods_name": "百龄坛12年苏格兰威士忌（6%）",
					"storage_pay_apportion": 0,
					"pay_sum": 2520,
					"quantity": 2,
					"small_change_discount": 0,
					"wallet_pay_apportion": 0,
					"goods_id": 1992316933804288,
					"original_sum": 4200,
					"sku_id": 1992316949811456,
					"trade_source": "西城",
					"deduction_apportionment": 1680,
					"spot_discount": 0,
					"membership_discount": 1680,
					"award_points": 0,
					"coupon_apportionment": 0,
					"goods_class_name": "洋酒"
				}
			],
			"pay_details": [
				{
					"pay_sum": -959.994,
					"pay_code": "5",
					"pay_name": "会员钱包"
				}
			],
			"app_id": "yl_z5nqc7bDikBX"
		}
	],
	"remove": [
		{
			"out_sys_key": "",
			"out_sys_main_key": "2779609419158784"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	返回状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	返回信息 示例：success
data	object	是	返回信息
promotional_discount	long	否	促销折扣额
memo	string	否	备注 示例：站点名称:1010租户的商城订单：O-8c7362e7b96010513003消费：0.0
source	long	否	来源 示例：999
type	long	否	订单类型(0 商家自定,2 商城订单 3商城积分兑换订单) 示例：2
use_points	long	否	使用积分数量
id	long	否	订单主键 示例：1461754194688475100
app_id	string	否	会籍id 示例：yl_yjPAYw1pxdmK
pay_sum	Decimal	否	支付金额 示例：20.01
trade_code	string	否	订单编码 示例：O-8c7362e7b96010513004
out_sys_main_key	string	否	订单外键 示例：27729665506716162
membership_discount	Decimal	否	会员折扣额
status	int	否	订单状态(1:已付款、2:已发货、3:已收货、4:已完成、99:已退货) 示例：4
express_fee	Decimal	否	运费 示例：12
mid	long	否	会员id 示例：2268414424011008
sum	Decimal	否	交易金额 示例：20.01
is_invoice	boolean	否	是否开发票 示例：false
spot_discount	Decimal	否	现场折扣额
trade_date	string	否	交易日期 示例：2022-05-13 21:27:26
details	object	是	订单详情信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"data": [
		{
			"promotional_discount": 0,
			"memo": "站点名称:1010租户的商城订单：O-8c7362e7b96010513003消费：0.0",
			"source": 999,
			"type": 2,
			"use_points": 0,
			"id": 1461754194688475100,
			"app_id": "yl_yjPAYw1pxdmK",
			"pay_sum": 20.01,
			"trade_code": "O-8c7362e7b96010513004",
			"out_sys_main_key": "27729665506716162",
			"membership_discount": 0,
			"status": 4,
			"express_fee": 12,
			"mid": 2268414424011008,
			"sum": 20.01,
			"is_invoice": false,
			"spot_discount": 0,
			"trade_date": "2022-05-13 21:27:26",
			"details": [
				{
					"goods_code": "WLDA0011",
					"out_sys_key": "27729665516546562",
					"memo": "站点名称:1010租户的商城订单：O-8c7362e7b96010513003消费：0.0",
					"sum": 8.01,
					"goods_class_code": "lcy商品分类",
					"goods_name": "NN青提-秒杀青色酸甜客户共开会感觉看活动价可改行；零售客户端跟结算单会更好了数量可的回归结合各可是到货高脚后跟",
					"pay_sum": 8.01,
					"quantity": 1,
					"goods_id": 2333549355176192,
					"goods_class_name": "lcy商品分类"
				}
			]
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
999	服务器逻辑异常	根据返回信息操作

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-16	
更新
请求说明
新增
请求参数 app_id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

