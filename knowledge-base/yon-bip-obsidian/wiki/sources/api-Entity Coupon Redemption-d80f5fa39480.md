---
title: "批量销售实体卡券"
apiId: "d80f5fa3948049e18c90001ec74036a6"
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

# 批量销售实体卡券

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/batch/activate
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
data	object	是	是	请求参数对象
sn	string	否	是	卡券编码 示例：55883707933970455
sell_store_id	long	否	否	售卖门店 示例：33
coupon_buy_money	Decimal	否	否	实销金额 示例：4444
sell_rebate_sum	Decimal	否	否	销售折扣(折扣金额) 示例：33
action_type	int	否	否	领用类型(0:其他;1:后台发放;2:首次关注;3:微信墙;4:会员注册;5:营销类领取;6:红包领取;7:易联商城领取;20:领用优惠券(自领);21:积分兑换(商城);22:买赠;8:签到奖励;9:储值奖励;10:交易奖励;23:商城售卖;24:累计积分奖励;25:预发放;26:完善信息送券;28:集点卡兑换;29:全员营销推广;30:excel导入;31:期初导入;32:会员关怀;33:门店售卖;34:微信卡券领取;35:订货商城;36:商城粉丝领用;37:积分兑换;38:自动化营销;) 示例：33
trade_code	string	否	否	售卡单号 示例：O-237428-12345

## 3. 请求示例

Url: /yonbip/sd/coupon/batch/activate?access_token=访问令牌
Body: {
	"data": [
		{
			"sn": "55883707933970455",
			"sell_store_id": 33,
			"coupon_buy_money": 4444,
			"sell_rebate_sum": 33,
			"action_type": 33,
			"trade_code": "O-237428-12345"
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
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	返回信息 示例：success
data	string	否	返回数据，值为null时，表示不返回数据 示例：null

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": "null"
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
999	以下传入的券号不存在或者已生效	只要有一个卡券生效异常，接口直接抛问题，不往下执行，请检查sn卡券号

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (7)
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

