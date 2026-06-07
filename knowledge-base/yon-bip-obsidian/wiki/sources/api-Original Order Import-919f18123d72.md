---
title: "原单导入"
apiId: "919f18123d724211b7c06181d116b5eb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Original Transaction Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Original Transaction Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 原单导入

>  请求方式	POST | Original Transaction Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradevouch/import
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
externalData	object	是	是	导入数据，其中OrderInfo节点表示表体信息，表体信息可以是多条
receiver_phone	string	否	否	收货电话 示例：17774250881
receiver_town	string	否	是	收货人所在乡镇/街道 示例：北清路58号
plat	string	否	否	平台 示例：淘宝
bank_account	string	否	否	购方银行账户 示例：6220622210101234095
tid	string	否	是	交易编号 示例：JY202004103000937001713464004
buyer_nick	string	否	是	买家昵称 示例：200227937
pay_time	DateTime	否	是	付款的时间（交易类型为在线支付非空，交易类型为货到付款可空），格式"2019-06-28 11:04:22" 示例：2020-04-10 11:11:54
registered_phone	string	否	否	购方注册电话 示例：18596901596
type	string	否	是	交易类型（”在线支付”，”货到付款”,”门店支付”） 示例：在线支付
store_id	string	否	否	门店id(友零售调用必输) 示例：24503370
buyer_message	string	否	否	买家留言 示例：留言
deposit_bank	string	否	否	购方开户银行 示例：招商银行
receiveInvoiceMail	string	否	否	接收发票邮箱 示例：zhouwb@xfnano.cn
receiver_zip	string	否	否	邮编 示例：435200
advance_paytime	DateTime	否	否	预付定金时间，格式"2019-06-28 11:04:22" 示例：2020-08-23 11:30:39
status	string	否	是	线上交易状态：待付款、待发货、已发货、交易完成、交易关闭、部分发货、暂停 示例：交易关闭
storeorder_id	string	否	否	门店订单id(友零售调用必输) 示例：2018058758443264
created	DateTime	否	是	下单时间，格式"2019-06-28 11:04:22" 示例：2020-04-10 11:11:33
receiver_city	string	否	是	收货人所在城市 示例：金华市
registered_address	string	否	否	购方注册地址 示例：北京市海淀区用友软件园
coupon_ticket	string	否	否	优惠券抵扣额 示例：1.88
shopcode	string	否	是	店铺编码 示例：test
receiver_state	string	否	否	省 示例：浙江省
receiver_address	string	否	是	详细地址 示例：人民法院
receiver_district	string	否	是	收货人所在地区 示例：义乌市
invoice_name	string	否	否	发票抬头 示例：个人
receiver_mobile	string	否	是	收货手机号 示例：17774250881
invoice_kind	string	否	否	发票类型（发票抬头非空，则发票类型非空 可选，传编码1、2、3、4，1-”纸质普票”、2-”纸质专票”、3-”电子普票”、4-”电子专票”） 示例：1
receiver_country	string	否	否	国籍 示例：中国
coupon_card	string	否	否	礼品卡抵扣额 示例：4.00
post_fee	string	否	否	运费 示例：0.01
taxpayer_ident	string	否	否	购买方税号 示例：91371624MA3NCN6N8L
seller_memo	string	否	否	卖家备注 示例：卖家备注
receiver_name	string	否	是	收货人姓名 示例：龚XX
applier_nick	string	否	否	分销商昵称 示例：香芬李
isPromotion	string	否	否	是否参与促销 （是-否） 示例：true
creator	string	否	否	创建人 示例：liyyf
create_time	string	否	否	创建时间 示例：2020-02-07 18:18:00
updator	string	否	否	更新人 示例：liyyf
update_time	string	否	否	更新时间 示例：2020-02-07 18:18:00
tradeVouchCustomItem_define1~60	string	否	否	表头自定义项
delivery	int	否	否	是否送装 示例：1
etd	string	否	否	预计发货时间 示例：2022-08-05 15:42:44
idCardNo	string	否	否	身份证号 示例：429999287898765678
idCardName	string	否	否	身份证姓名 示例：刘洁
channel_trx_no	string	否	否	第三方支付单号 示例：1902345678901
OrderInfo	object	是	是	表体信息
PromotionDetail	object	否	否	促销信息表体
customerCode	string	否	否	客户编码
departmentCode	string	否	否	部门编码
salesmanCode	string	否	否	业务员编码
consign_time	DateTime	否	否	卖家发货时间，格式"2019-06-28 11:04:22"
shipping_type	string	否	否	物流方式（”物流发货”，”自提”）
coupon_point	string	否	否	积分抵扣额
ys_currency	string	否	否	币种ID，若输入的币种ID不为空，优先按币种ID匹配处理，若币种ID为空，则按币种简称匹配，若币种ID、币种简称都为空，则取店铺档案的币种信息 示例：1764885247009226775
currencyCode	string	否	否	币种简称，若币种ID为空，则按币种简称优先匹配，币种ID和币种简称都为空，则默认获取店铺档案的币种 示例：CNY
channelmid	string	否	否	第三方支付商户号
ipackagecnt	number
小数位数:2,最大长度:10	否	否	包裹数 示例：3
partParam	object	否	是	额外数据
orgCode	string	否	是	组织编码 示例：123

## 3. 请求示例

Url: /yonbip/sd/dst/tradevouch/import?access_token=访问令牌
Body: {
	"externalData": [
		{
			"receiver_phone": "17774250881",
			"receiver_town": "北清路58号",
			"plat": "淘宝",
			"bank_account": "6220622210101234095",
			"tid": "JY202004103000937001713464004",
			"buyer_nick": "200227937",
			"pay_time": "2020-04-10 11:11:54",
			"registered_phone": "18596901596",
			"type": "在线支付",
			"store_id": "24503370",
			"buyer_message": "留言",
			"deposit_bank": "招商银行",
			"receiveInvoiceMail": "zhouwb@xfnano.cn",
			"receiver_zip": "435200",
			"advance_paytime": "2020-08-23 11:30:39",
			"status": "交易关闭",
			"storeorder_id": "2018058758443264",
			"created": "2020-04-10 11:11:33",
			"receiver_city": "金华市",
			"registered_address": "北京市海淀区用友软件园",
			"coupon_ticket": "1.88",
			"shopcode": "test",
			"receiver_state": "浙江省",
			"receiver_address": "人民法院",
			"receiver_district": "义乌市",
			"invoice_name": "个人",
			"receiver_mobile": "17774250881",
			"invoice_kind": "1",
			"receiver_country": "中国",
			"coupon_card": "4.00",
			"post_fee": "0.01",
			"taxpayer_ident": "91371624MA3NCN6N8L",
			"seller_memo": "卖家备注",
			"receiver_name": "龚XX",
			"applier_nick": "香芬李",
			"isPromotion": "true",
			"creator": "liyyf",
			"create_time": "2020-02-07 18:18:00",
			"updator": "liyyf",
			"update_time": "2020-02-07 18:18:00",
			"tradeVouchCustomItem_define1~60": "",
			"delivery": 1,
			"etd": "2022-08-05 15:42:44",
			"idCardNo": "429999287898765678",
			"idCardName": "刘洁",
			"channel_trx_no": "1902345678901",
			"OrderInfo": [
				{
					"num_iid": "2053500000112484",
					"oid": "839048577707768357",
					"discount_fee": "0",
					"total_fee": "199",
					"tid": "JY202004103000937001713464004",
					"itemcode": "1559411932844288",
					"ebskuid": "355689422",
					"shopcode": "002",
					"sub_order_tax_fee": "10.00",
					"sku_id": "2053500000112484",
					"payment": "199",
					"warehouseErpCode": "asdasd",
					"price": "199",
					"dealPrice": "150",
					"num": "1",
					"tradeVouchDetailCustomItem_define1~60": "",
					"adjust_fee": "",
					"warehouseCode": "",
					"batchno": "20250227"
				}
			],
			"PromotionDetail": {
				"promotion_details_id": "1223341",
				"promotion_name": "暖春战疫",
				"discount_fee": "2.00",
				"gift_item_name": "送30元店铺优惠券",
				"gift_item_id": "122321",
				"gift_item_num": "2",
				"promotion_desc": "暖春战疫:省46.20元",
				"promotion_id": "Tmall$bigMarkdown-11226504290_117930088703"
			},
			"customerCode": "",
			"departmentCode": "",
			"salesmanCode": "",
			"consign_time": "",
			"shipping_type": "",
			"coupon_point": "",
			"ys_currency": "1764885247009226775",
			"currencyCode": "CNY",
			"channelmid": "",
			"ipackagecnt": 3
		}
	],
	"partParam": {
		"orgCode": "123"
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
code	int	否	code 示例：200
message	string	否	返回信息 示例：导入原单成功
data	object	否	返回数据 示例：data: 1692286593290496为oms系统中生成的原单id，JY202004103000937001713464004为传入单据的tid

## 5. 正确返回示例

{
	"code": 200,
	"message": "导入原单成功  ",
	"data": "data: 1692286593290496为oms系统中生成的原单id，JY202004103000937001713464004为传入单据的tid"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	导入原单失败	请检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-16	
新增
请求参数 ipackagecnt
	2	2025-03-10	
新增
请求参数 batchno

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

