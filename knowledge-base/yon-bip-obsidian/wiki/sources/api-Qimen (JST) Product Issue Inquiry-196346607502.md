---
title: "奇门(JST)销售出库查询"
apiId: "1963466075020984325"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "WMS Inventory Status"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, WMS Inventory Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 奇门(JST)销售出库查询

>  请求方式	POST | WMS Inventory Status (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/jushuitan/saleout/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
customer_id	string	否	是	商家链接标识，获取方式参考：https://open.jushuitan.com/document.aspx?doc_id=2355 示例：123644
page_index	string	否	是	页索引 示例：1
page_size	string	否	是	页长度，最大100 示例：20
start_time	string	否	否	开始时间 示例：2019-01-02 00:00:00
end_time	string	否	否	结束时间 示例：2019-01-02 00:00:00
status	string	否	否	出库单状态：Archive:归档,WaitConfirm:待出库,Confirmed:已出库,Cancelled:取消,Delete:作废,OuterConfirming:外部发货中 示例：WaitConfirm
date_type	string	否	否	时间类型 0:修改时间modified，2:出库时间io_date;默认0 示例：1
o_ids	string	否	否	内部单号列表 示例：111,222
io_ids	string	否	否	销售出库单号列表 示例：111,222
archive	boolean	否	否	是否查归档订单 示例：false
shop_id	string	否	否	店铺编号 示例：12252
wms_co_id	string	否	否	分仓编号 示例：12252
so_ids	string	否	否	线上单号列表，多个线上单号以逗号分开 示例：null
is_get_supplier	boolean	否	否	是否获取天猫分销信息 示例：false
is_get_total	boolean	否	否	是否查询总条数 示例：true
start_ts	string	否	否	开始时间戳 示例：0
end_ts	string	否	否	结束时间戳 示例：0
is_get_cbfinance	string	否	否	是否获取跨境财务信息 示例：false

## 3. 请求示例

Url: /yonbip/sd/dst/jushuitan/saleout/query?access_token=访问令牌
Body: {
	"customer_id": "123644",
	"page_index": "1",
	"page_size": "20",
	"start_time": "2019-01-02 00:00:00",
	"end_time": "2019-01-02 00:00:00",
	"status": "WaitConfirm",
	"date_type": "1",
	"o_ids": "111,222",
	"io_ids": "111,222",
	"archive": false,
	"shop_id": "12252",
	"wms_co_id": "12252",
	"so_ids": "null",
	"is_get_supplier": false,
	"is_get_total": true,
	"start_ts": "0",
	"end_ts": "0",
	"is_get_cbfinance": "false"
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
page_size	number
小数位数:0,最大长度:10	否	页大小 示例：1
page_index	number
小数位数:0,最大长度:10	否	页索引 示例：20
data_count	number
小数位数:0,最大长度:10	否	数据总数 示例：1
page_count	number
小数位数:0,最大长度:10	否	总页数 示例：1
has_next	boolean	否	是否有下一页 示例：true
datas	object	是	数据列表
co_id	number
小数位数:0,最大长度:10	否	公司编号 示例：1
io_id	number
小数位数:0,最大长度:10	否	出库单号 示例：1
shop_id	number
小数位数:0,最大长度:10	否	店铺编号 示例：1
o_id	string	否	内部订单号
so_id	string	否	线上订单号 示例：null
created	string	否	登记时间 示例：null
modified	string	否	修改时间 示例：null
status	string	否	出库单状态：Archive:归档,WaitConfirm:待出库,Confirmed:已出库,Cancelled:取消,Delete:作废,OuterConfirming:外部发货中 示例：null
invoice_title	string	否	发票抬头 示例：null
shop_buyer_id	string	否	买家帐号 示例：null
receiver_country	string	否	国家 示例：null
receiver_state	string	否	省 示例：null
receiver_city	string	否	市 示例：null
receiver_district	string	否	区 示例：null
buyer_message	string	否	买家留言 示例：null
remark	string	否	卖家留言 示例：null
is_cod	string	否	是否货到付款
pay_amount	string	否	应付金额 示例：null
l_id	string	否	快递单号 示例：null
io_date	string	否	出库日期 示例：null
lc_id	string	否	快递公司编码 示例：null
stock_enabled	string	否	是否启用库存管理,on=使用库存；off=不使用 示例：null
labels	string	否	多标签 示例：null
paid_amount	string	否	已付金额 示例：null
free_amount	string	否	优惠金额 示例：null
freight	string	否	运费 示例：null
weight	string	否	预估重量 示例：null
warehouse	string	否	仓库名称 示例：null
drp_co_id_from	string	否	分销商编号 示例：null
f_weight	string	否	实际重量 示例：null
order_type	string	否	单据类型 示例：null
batchs	object	是	批次信息
open_id	string	否	买家唯一id 示例：null
is_print_express	string	否	快递单已打印 示例：null
is_print	string	否	订单已打印 示例：null
drp_info	string	否	供分销信息 示例：null
buyer_tax_no	string	否	发票税号 示例：null
logistics_company	string	否	快递公司名称 示例：null
sns	object	是	SN唯一码信息
merge_so_id	string	否	被合并的线上单号 示例：null
wms_co_id	string	否	分仓编号
items	object	是	明细列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"page_size": 1,
		"page_index": 20,
		"data_count": 1,
		"page_count": 1,
		"has_next": true,
		"datas": [
			{
				"co_id": 1,
				"io_id": 1,
				"shop_id": 1,
				"o_id": "",
				"so_id": "null",
				"created": "null",
				"modified": "null",
				"status": "null",
				"invoice_title": "null",
				"shop_buyer_id": "null",
				"receiver_country": "null",
				"receiver_state": "null",
				"receiver_city": "null",
				"receiver_district": "null",
				"buyer_message": "null",
				"remark": "null",
				"is_cod": "",
				"pay_amount": "null",
				"l_id": "null",
				"io_date": "null",
				"lc_id": "null",
				"stock_enabled": "null",
				"labels": "null",
				"paid_amount": "null",
				"free_amount": "null",
				"freight": "null",
				"weight": "null",
				"warehouse": "null",
				"drp_co_id_from": "null",
				"f_weight": "null",
				"order_type": "null",
				"batchs": [
					{
						"batch_no": "null",
						"sku_id": "null",
						"qty": "",
						"product_date": "null",
						"supplier_id": "",
						"supplier_name": "null",
						"expiration_date": "null"
					}
				],
				"open_id": "null",
				"is_print_express": "null",
				"is_print": "null",
				"drp_info": "null",
				"buyer_tax_no": "null",
				"logistics_company": "null",
				"sns": [
					{
						"sku_id": "null",
						"sn": "null"
					}
				],
				"merge_so_id": "null",
				"wms_co_id": "",
				"items": [
					{
						"i_id": "null",
						"sale_base_price": "null",
						"is_gift": "",
						"oi_id": "",
						"outer_oi_id": "null",
						"raw_so_id": "null",
						"pay_amount": "null",
						"combine_sku_id": "null",
						"ioi_id": "",
						"pic": "null",
						"sku_id": "null",
						"qty": "",
						"name": "null",
						"properties_value": "null",
						"sale_price": "null",
						"sale_amount": "null"
					}
				]
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
999	查询异常	请联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
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

