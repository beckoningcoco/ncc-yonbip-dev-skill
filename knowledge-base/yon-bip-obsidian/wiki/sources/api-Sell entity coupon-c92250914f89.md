---
title: "优惠券领取"
apiId: "c92250914f894a38ab6fb239b353352a"
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

# 优惠券领取

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/receive
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
mid	long	否	是	会员id 示例：234
coupon_id	long	否	是	优惠券id 示例：345
quantity	int	否	否	领用数量 示例：25
action_type	int	否	是	发放类型（0:其他;1:后台发放;2:首次关注;3:微信墙;4:会员注册;5:营销类领取;6:红包领取;7:易联商城领取;20:领用优惠券(自领);21:积分兑换(商城);22:买赠;8:签到奖励;9:储值奖励;10:交易奖励;23:商城售卖;24:累计积分奖励;25:预发放;26:完善信息送券;28:集点卡兑换;29:全员营销推广;30:excel导入;31:期初导入;32:会员关怀;33:门店售卖;34:微信卡券领取;35:订货商城;36:商城粉丝领用;37:积分兑换;38:自动化营销;） 示例：1
coupon_buy_money	Decimal	否	是	卡券的实销金额（总额） 示例：23.33
sell_store_id	long	否	否	售卖门店 示例：67
sell_rebate_sum	Decimal	否	否	销售折扣(总额) 示例：23.45
rollback_rebate_sum	Decimal	否	否	回收折扣(零售回写) 示例：12.32
refund_count	int	否	否	退货次数(零售回写) 示例：5
refund_sum	Decimal	否	否	退货金额(零售回写) 示例：5
effect_date	DateTime	否	否	生效时间 示例：2011-01-01 11:11:11
trade_code	string	否	否	交易单号(售卖卡券的零售单号/商城订单号) 示例：sc0001
remarks	string	否	否	备注 示例：备注

## 3. 请求示例

Url: /yonbip/sd/coupon/receive?access_token=访问令牌
Body: {
	"mid": 234,
	"coupon_id": 345,
	"quantity": 25,
	"action_type": 1,
	"coupon_buy_money": 23.33,
	"sell_store_id": 67,
	"sell_rebate_sum": 23.45,
	"rollback_rebate_sum": 12.32,
	"refund_count": 5,
	"refund_sum": 5,
	"effect_date": "2011-01-01 11:11:11",
	"trade_code": "sc0001",
	"remarks": "备注"
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
message	string	否	返回信息 示例：success
data	object	是	返回结果数据
receive_date	string	否	领取时间 示例：2022-02-04 12:35:39
avl_times	int	否	可用次数（计次劵使用） 示例：1
receive_source	string	否	领用(发放)来源（0:U会员,1:u8,2:零售,3:u商城,4:CRM） 示例：1
receive_type	string	否	领用(发放)类型（0:其他;1:后台发放;2:首次关注;3:微信墙;4:会员注册;5:营销类领取;6:红包领取;7:易联商城领取;20:领用优惠券(自领);21:积分兑换(商城);22:买赠;8:签到奖励;9:储值奖励;10:交易奖励;23:商城售卖;24:累计积分奖励;25:预发放;26:完善信息送券;28:集点卡兑换;29:全员营销推广;30:excel导入;31:期初导入;32:会员关怀;33:门店售卖;34:微信卡券领取;35:订货商城;36:商城粉丝领用;37:积分兑换;38:自动化营销;） 示例：3
coupon_id	int	否	优惠券档案ID 示例：1519
effect_date	string	否	生效时间 示例：2022-04-20 00:00:00
exp_date	string	否	失效时间 示例：2024-04-06 23:59:59
status	int	否	启用状态（0：停用 1：启用） 示例：0
sn	string	否	sn码 示例：151925741731528251
mid	long	否	会员ID 示例：3542002
corp_id	int	否	企业账户ID 示例：9
app_id	string	否	会籍ID 示例：yl_824be94f968c
qrcode_Url	string	否	二维码图片地址 示例：http://127.0.0.1:8089/app/res/qrcode/gh_824be94f968c/pt/Coupon/151925741731528251.png
barcode_url	string	否	条码图片地址 示例：http://127.0.0.1:8089/app/res/barcode/gh_824be94f968c/pt/Coupon/151925741731528251.png
process_id	long	否	营销任务id 示例：1518
verify_scope_level	int	否	卡券核销维度 示例：0
verify_scope_id	long	否	卡券核销维度Id 示例：12344
sum	Decimal	否	计次卡余额 示例：0.01
sell_store_id	long	否	售卖门店 示例：1234567
trade_code	string	否	交易单号 示例：asssssdd
fact_sell_sum	Decimal	否	实销金额 示例：0.05
fact_rebate	Decimal	否	销售折扣 示例：0.05
remarks	string	否	备注 示例：备注
coupon	object	否	优惠券数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{
			"receive_date": "2022-02-04 12:35:39",
			"avl_times": 1,
			"receive_source": "1",
			"receive_type": "3",
			"coupon_id": 1519,
			"effect_date": "2022-04-20 00:00:00",
			"exp_date": "2024-04-06 23:59:59",
			"status": 0,
			"sn": "151925741731528251",
			"mid": 3542002,
			"corp_id": 9,
			"app_id": "yl_824be94f968c",
			"qrcode_Url": "http://127.0.0.1:8089/app/res/qrcode/gh_824be94f968c/pt/Coupon/151925741731528251.png",
			"barcode_url": "http://127.0.0.1:8089/app/res/barcode/gh_824be94f968c/pt/Coupon/151925741731528251.png",
			"process_id": 1518,
			"verify_scope_level": 0,
			"verify_scope_id": 12344,
			"sum": 0.01,
			"sell_store_id": 1234567,
			"trade_code": "asssssdd",
			"fact_sell_sum": 0.05,
			"fact_rebate": 0.05,
			"remarks": "备注",
			"coupon": {
				"id": 1519,
				"corp_id": 9,
				"app_id": "yl_824be94f968c",
				"type": 5,
				"ep_name": "test576565",
				"ep_logo": "https://ylres.yonyoucloud.com/res/upload/image/yl_824be94f968c/logo/20161226/1482743131429500-2.jpg",
				"pic_url": "",
				"backcolor": "#e69138",
				"title": "test",
				"sub_title": "",
				"remind": "",
				"reduce_amount": 0,
				"start_amount": 0,
				"discount": 0,
				"reference_price": 0,
				"quantity": 100,
				"is_limit_store": false,
				"receive_limit": 0,
				"store_ids": "",
				"effect_date": 1512230400,
				"interval_days_effect": 0,
				"exp_date": 1514390400,
				"interval_days_exp": 0,
				"description": "",
				"use_description": "",
				"service_phone": "",
				"create_time": 1512372608,
				"appoint_times": 0,
				"exp_mode": NaN,
				"amount": 1,
				"ts": "2017-12-28 20:08:27",
				"is_repel_with_points": 0,
				"scope_type": 1,
				"out_import": 0,
				"umall_url": "http://yla.yonyouup.com/app/shop.php/Shop/Order/portal.php?wid=gh_824be94f968c&appid=yl_824be94f968c",
				"interval_unit_expire": 1,
				"dl_paytype": 1,
				"appoint_time_type": 0,
				"can_sell": 0,
				"exchangegoods_count": 1,
				"refund_type": 1,
				"sale_disaccount_type": 1,
				"maxusednum": 10,
				"paymethod_id": 123456,
				"week_days": "MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY",
				"scope_type_exception": 3,
				"limit_member_level_ids": "1835184795521280,1835237574775040,1835238469472512",
				"receive_by_self": 0,
				"discount_type": "\"1\"",
				"hide_expiredate": 1,
				"is_elec": 1,
				"start_amount_scope": 1,
				"receive_count": 100,
				"interval_unit_effect": 1,
				"apply_udh_shop": 0,
				"un_receive_count": 78,
				"is_umall_settlement": 1,
				"sync_wx_coupon": 0,
				"is_online_mall": true,
				"assoc_goods_name": "AA",
				"assoc_goods_id": 1234567,
				"assoc_goods_outer_id": "C001",
				"member_scope_id": 9999,
				"member_scope_level": 0,
				"member_scope_name": "aaa",
				"receive_by_other": 0
			}
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
0	未传入优惠券档案id	coupon_id值填写有误
999	未查询到相关优惠券	检查传入参数是否正确

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

