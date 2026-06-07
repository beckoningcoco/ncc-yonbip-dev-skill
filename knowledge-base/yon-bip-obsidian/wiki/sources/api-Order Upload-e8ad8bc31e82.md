---
title: "订单上传"
apiId: "e8ad8bc31e8240299c3bab8bcedf2b50"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 订单上传

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/upload
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
externalData	object	否	否	订单支持修改的部分内容
Modify	object	是	否	支持修改的数据
partParam	object	否	是	订单-时间戳关系映射
ids	string	否	是	需要发货订单id，多张用“,”分隔

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/upload?access_token=访问令牌
Body: {
	"externalData": {
		"Modify": [
			{
				"id": 2340706280658688,
				"cuser": "张三"
			}
		]
	},
	"partParam": {},
	"ids": ""
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
cpickrowno	string	否	波次号
message	string	否	调用失败时的错误信息
data	object	否	失败的订单会从data返回
id	string	否	订单ID
cShopID	string	否	店铺
Shop_Code	string	否	店铺编码
Shop_Name	string	否	店铺名称
tid	string	否	交易编号
doctype	string	否	订单类别，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
pay_time	DateTime	否	付款时间，格式"2019-06-28 11:04:22"
total_num	string	否	商品数量
cApproveFlag	string	否	审核旗标
seller_memo_online	string	否	线上卖家备注
buyer_message	string	否	买家留言
seller_memo	string	否	卖家备注
total_fee	Decimal	否	商品金额
payment	Decimal	否	实收金额
discount_fee	Decimal	否	系统优惠金额
adjust_fee	Decimal	否	手工调整金额
post_fee	string	否	运费金额
cExpressCoID	string	否	快递公司ID
logisticName	string	否	快递公司名称
cExpressCode	string	否	快递单号
receiver_name	string	否	收货人姓名
receiver_card_id	string	否	收货人证件号
receiver_state	string	否	收货人省
receiver_city	string	否	收货人城市
receiver_district	string	否	收货人地区
receiver_address	string	否	收货人地区
receiver_zip	string	否	收货人邮编
receiver_mobile	string	否	收货人手机号
receiver_phone	string	否	收货人电话
receiver_town	string	否	收货人城镇
receiver_country	string	否	收货人国家
buyer_nick	string	否	买家会员号
cApproveLog	string	否	审核提示
cUnApproveReason	string	否	弃审原因
srctype	string	否	订单来源，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
status	string	否	交易状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
type	string	否	交易类型，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
cShipMode	string	否	发货模式，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
cTradeCode	string	否	电商订单编号
order_tax_fee	string	否	关税
ipackagecnt	string	否	包裹数
consign_time	DateTime	否	线上发货时间，格式"2019-06-28 11:04:22"
iinvoicetype	string	否	发票类型，1 电子发票，2 纸质发票
deposit_bank	string	否	开户银行
taxpayer_ident	string	否	纳税人识别号
bank_account	string	否	银行账户
registered_address	string	否	注册地址
iEBPlatDiscount	string	否	商城折扣
coupon_card	string	否	礼品卡抵扣额
coupon_point	string	否	积分抵扣额
coupon_ticket	string	否	优惠券抵扣额
isInvoice	string	否	是否需要发票
invoice_name	string	否	发票抬头名称
cInvoiceCode	string	否	发票号
is_sh_ship	string	否	是否平台仓订单
cshipcode	string	否	发货单号
cpickcode	string	否	拣货单号
cpickrowno	string	否	波次号
cShipPrintStatus	string	否	发货单打印状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
cExcoPrintStatus	string	否	快递单打印状态，枚举值参考：快递单打印状态
cpickprintstatus	string	否	拣货单打印状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
cConfirmer	string	否	制单人
dConfirmTime	DateTime	否	制单时间，格式"2019-06-28 11:04:22"
cModifier	string	否	修改人
dModifyTime	DateTime	否	修改时间，格式"2019-06-28 11:04:22"
cBizAuditer	string	否	业务审核人
dBizAuditTime	DateTime	否	业务审核时间，格式"2019-06-28 11:04:22"
cFinAuditer	string	否	财务审核人
dFinAuditTime	DateTime	否	财务审核时间，格式"2019-06-28 11:04:22"
print_operator	string	否	打印人
dprinttime	DateTime	否	打印时间，格式"2019-06-28 11:04:22"
iprintsn	string	否	打印次数
cinspecter	string	否	验货人
dinspecttime	DateTime	否	验货时间，格式"2019-06-28 11:04:22"
cshipper	string	否	发货人
dShipTime	DateTime	否	发货时间，格式"2019-06-28 11:04:22"
autoupdtimes	DateTime	否	自动上传时间，格式"2019-06-28 11:04:22"
dUploadTime	DateTime	否	回传平台时间，格式"2019-06-28 11:04:22"
dCollectionTime	DateTime	否	收款结算时间，格式"2019-06-28 11:04:22"
cposter	string	否	过账人
dposttime	DateTime	否	过账时间，格式"2019-06-28 11:04:22"
cCloser	string	否	关闭人
dCloseTime	DateTime	否	关闭时间，格式"2019-06-28 11:04:22"
cBlender	string	否	对账人
dBlendTime	DateTime	否	对账时间，格式"2019-06-28 11:04:22"
isbizaudited	string	否	是否客审
isfinaudited	string	否	是否财审
isUpload	string	否	是否上传
isHold	string	否	是否挂起
isClosed	string	否	是否关闭
isBlend	string	否	是否勾对
isTradePosted	string	否	是否已过账
isconfirmed	string	否	是否已转单
iholdtype	string	否	是否挂起类型
cHoldReason	string	否	挂起原因
cuploader	string	否	上传错误信息
created	DateTime	否	交易时间，格式"2019-06-28 11:04:22"
modified	DateTime	否	交易修改时间，格式"2019-06-28 11:04:22"
end_time	DateTime	否	交易结束时间，格式"2019-06-28 11:04:22"
shipping_type	string	否	物流方式
seller_cod_fee	string	否	卖家货到付款服务费
buyer_cod_fee	string	否	买家货到付款服务费
cod_fee	string	否	货到付款服务费
express_agency_fee	string	否	快递代收费
has_post_fee	string	否	含运费
trade_memo	string	否	交易备注
seller_flag	string	否	卖家备注旗帜
coupon_fee	string	否	红包优惠金额
point_fee	string	否	买家使用积分
real_point_fee	string	否	买家实际使用积分
buyer_obtain_point_fee	string	否	买家获得返点积分
buyer_flag	string	否	买家备注旗帜
commission_fee	Decimal	否	交易佣金
available_confirm_fee	string	否	交易中剩余的确认收货金额
received_payment	Decimal	否	收款金额
sys_Status	string	否	系统状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
isCollection	string	否	是否对账
cBlendGUID	string	否	勾对标识
bCreatePost	string	否	是否生成快递明细
isPickSelf	string	否	是否自提订单
cFenxiaoType	string	否	分销订单类型，1原单 2经销 3分销
applier_nick	string	否	分销商昵称
tc_order_id	string	否	分销订单对应后台交易子订单号
buyer_payment	string	否	代销订单买家实付金额
invoice_amount	Decimal	否	线上开票金额
clocker	string	否	锁定人
iweight	string	否	包裹重量
cpickrowno	string	否	拣货行号
iprintcount	string	否	打印次数
ismainorder	string	否	是否主订单
registered_phone	string	否	注册电话
igoldtaxcount	string	否	导出次数
dgoldtaxtime	DateTime	否	导出时间，格式"2019-06-28 11:04:22"
iBillingStatus	string	否	生成电子发票
dBillingtime	DateTime	否	电子发票开票时间，格式"2019-06-28 11:04:22"
cBillingCode	string	否	电子发票号
cBillingNum	string	否	电子发票号
iMergeType	string	否	是否合并订单
iinvoicestatus	string	否	金税开票状态
cinvoicepdfpatch	string	否	电子发票PDF-URL
cinvoiceurlpatch	string	否	电子发票URL
cinvoiceextractcode	string	否	发票提取码
isSplitTrade	string	否	拆分单据数
autoholdtimes	DateTime	否	自动锁定时间，格式"2019-06-28 11:04:22"
iAutoDistributeBillCount	string	否	自动分配面单次数
is_part_consign	string	否	部分发货
org	string	否	组织
tradeorderdetail	object	是	电商订单子表[ec.ec_tradeorder.TradeOrderDetail]

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"cShopID": "",
		"Shop_Code": "",
		"Shop_Name": "",
		"tid": "",
		"doctype": "",
		"pay_time": "",
		"total_num": "",
		"cApproveFlag": "",
		"seller_memo_online": "",
		"buyer_message": "",
		"seller_memo": "",
		"total_fee": 0,
		"payment": 0,
		"discount_fee": 0,
		"adjust_fee": 0,
		"post_fee": "",
		"cExpressCoID": "",
		"logisticName": "",
		"cExpressCode": "",
		"receiver_name": "",
		"receiver_card_id": "",
		"receiver_state": "",
		"receiver_city": "",
		"receiver_district": "",
		"receiver_address": "",
		"receiver_zip": "",
		"receiver_mobile": "",
		"receiver_phone": "",
		"receiver_town": "",
		"receiver_country": "",
		"buyer_nick": "",
		"cApproveLog": "",
		"cUnApproveReason": "",
		"srctype": "",
		"status": "",
		"type": "",
		"cShipMode": "",
		"cTradeCode": "",
		"order_tax_fee": "",
		"ipackagecnt": "",
		"consign_time": "",
		"iinvoicetype": "",
		"deposit_bank": "",
		"taxpayer_ident": "",
		"bank_account": "",
		"registered_address": "",
		"iEBPlatDiscount": "",
		"coupon_card": "",
		"coupon_point": "",
		"coupon_ticket": "",
		"isInvoice": "",
		"invoice_name": "",
		"cInvoiceCode": "",
		"is_sh_ship": "",
		"cshipcode": "",
		"cpickcode": "",
		"cpickrowno": "",
		"cShipPrintStatus": "",
		"cExcoPrintStatus": "",
		"cpickprintstatus": "",
		"cConfirmer": "",
		"dConfirmTime": "",
		"cModifier": "",
		"dModifyTime": "",
		"cBizAuditer": "",
		"dBizAuditTime": "",
		"cFinAuditer": "",
		"dFinAuditTime": "",
		"print_operator": "",
		"dprinttime": "",
		"iprintsn": "",
		"cinspecter": "",
		"dinspecttime": "",
		"cshipper": "",
		"dShipTime": "",
		"autoupdtimes": "",
		"dUploadTime": "",
		"dCollectionTime": "",
		"cposter": "",
		"dposttime": "",
		"cCloser": "",
		"dCloseTime": "",
		"cBlender": "",
		"dBlendTime": "",
		"isbizaudited": "",
		"isfinaudited": "",
		"isUpload": "",
		"isHold": "",
		"isClosed": "",
		"isBlend": "",
		"isTradePosted": "",
		"isconfirmed": "",
		"iholdtype": "",
		"cHoldReason": "",
		"cuploader": "",
		"created": "",
		"modified": "",
		"end_time": "",
		"shipping_type": "",
		"seller_cod_fee": "",
		"buyer_cod_fee": "",
		"cod_fee": "",
		"express_agency_fee": "",
		"has_post_fee": "",
		"trade_memo": "",
		"seller_flag": "",
		"coupon_fee": "",
		"point_fee": "",
		"real_point_fee": "",
		"buyer_obtain_point_fee": "",
		"buyer_flag": "",
		"commission_fee": 0,
		"available_confirm_fee": "",
		"received_payment": 0,
		"sys_Status": "",
		"isCollection": "",
		"cBlendGUID": "",
		"bCreatePost": "",
		"isPickSelf": "",
		"cFenxiaoType": "",
		"applier_nick": "",
		"tc_order_id": "",
		"buyer_payment": "",
		"invoice_amount": 0,
		"clocker": "",
		"iweight": "",
		"iprintcount": "",
		"ismainorder": "",
		"registered_phone": "",
		"igoldtaxcount": "",
		"dgoldtaxtime": "",
		"iBillingStatus": "",
		"dBillingtime": "",
		"cBillingCode": "",
		"cBillingNum": "",
		"iMergeType": "",
		"iinvoicestatus": "",
		"cinvoicepdfpatch": "",
		"cinvoiceurlpatch": "",
		"cinvoiceextractcode": "",
		"isSplitTrade": "",
		"autoholdtimes": "",
		"iAutoDistributeBillCount": "",
		"is_part_consign": "",
		"org": "",
		"tradeorderdetail": [
			{
				"id": "",
				"citemID": "",
				"product_code": "",
				"product_name": "",
				"oriItemCode": "",
				"oriItemName": "",
				"oriItemNum": "",
				"price": 0,
				"num": "",
				"refund_status": "",
				"total_fee": 0,
				"discount_fee": 0,
				"adjust_fee": 0,
				"post_fee": "",
				"isGift": "",
				"sku_properties_name": "",
				"sku_id": "",
				"sub_order_tax_fee": "",
				"payment": 0,
				"refund_num": "",
				"refund_fee": 0,
				"cWhCode": "",
				"Whouse_Name": "",
				"invoice_no": "",
				"iorderweight": "",
				"oid": "",
				"ref_order_id": "",
				"num_iid": "",
				"outer_iid": "",
				"parentid": "",
				"outer_sku_id": "",
				"modified": "",
				"status": "",
				"refund_id": "",
				"is_service_order": "",
				"buyer_nick": "",
				"tid": "",
				"belongProductsPromoID": "",
				"cRefundState": "",
				"isInPromotion": "",
				"tc_order_id": "",
				"part_mjz_discount": 0,
				"divide_order_fee": "",
				"isPtoSplit": "",
				"exorderid": "",
				"logistics_company": "",
				"store_code": "",
				"order_memo": "",
				"igroupid": "",
				"cproducttype": "",
				"consign_time": "",
				"shipping_type": "",
				"goodtype": ""
			}
		]
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
999	没有符合条件的单据或当前单据不是最新状态	请检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (204)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

