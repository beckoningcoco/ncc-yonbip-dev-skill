---
title: "奇门(JST)店铺商品查询"
apiId: "1963467904677052418"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Qi Men Product Synchronization"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Qi Men Product Synchronization]
platform_version: "BIP"
source_type: community-api-docs
---

# 奇门(JST)店铺商品查询

>  请求方式	POST | Qi Men Product Synchronization (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/jushuitan/itemsku/query
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
customer_id	string	否	是	商家链接标识，获取方式参考：https://open.jushuitan.com/document.aspx?doc_id=2352 示例：123456
page_index	string	否	是	页码 示例：1
page_size	string	否	是	每页多少条，默认30，最大50 示例：10
modified_begin	string	否	否	修改起始时间，和结束时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空 示例：2019-01-02 00:00:00
modified_end	string	否	否	修改结束时间，和起始时间必须同时存在，时间间隔不能超过七天，与商品编码不能同时为空 示例：2019-01-02 00:00:00
link_modified_begin	string	否	否	商品对应关系修改开始时间 示例：2021-12-01 13:58:41
link_modified_end	string	否	否	商品对应关系修改结束时间 示例：2021-12-01 13:58:41
sku_ids	string	否	否	商品编码（线上商品编码），与修改时间不能同时为空，最多20 示例：1
shop_id	string	否	否	店铺编号 示例：11
created_end	string	否	否	创建结束时间，和开始时间不能同时为空 示例：2021-12-01 13:58:41
created_begin	string	否	否	创建开始时间，与结束时间不能同时为空 示例：2021-12-01 13:58:41

## 3. 请求示例

Url: /yonbip/sd/dst/jushuitan/itemsku/query?access_token=访问令牌
Body: {
	"customer_id": "123456",
	"page_index": "1",
	"page_size": "10",
	"modified_begin": "2019-01-02 00:00:00",
	"modified_end": "2019-01-02 00:00:00",
	"link_modified_begin": "2021-12-01 13:58:41",
	"link_modified_end": "2021-12-01 13:58:41",
	"sku_ids": "1",
	"shop_id": "11",
	"created_end": "2021-12-01 13:58:41",
	"created_begin": "2021-12-01 13:58:41"
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
小数位数:0,最大长度:10	否	每页多少条 示例：50
page_index	number
小数位数:0,最大长度:10	否	第几页 示例：1
data_count	number
小数位数:0,最大长度:10	否	总条数 示例：1
page_count	number
小数位数:0,最大长度:10	否	总页数 示例：1
has_next	boolean	否	是否有下一页 示例：false
datas	object	是	明细列表
co_id	number
小数位数:0,最大长度:10	否	公司编号 示例：13093720
shop_id	number
小数位数:0,最大长度:10	否	店铺编号 示例：15006839
channel	string	否	来源平台：https://jushuitan.yuque.com/docs/share/d34de6aa-9613-4bc3-8a6e-12b20523925f?# 《channel 来源平台 枚举值》密码：glnu 示例：KWaiShop
i_id	string	否	款式编码（线上款式编码） 示例：21083024474734
sku_id	string	否	商品编码（线上商品编码） 示例：010614006257006
shop_i_id	string	否	店铺款式编码（平台店铺款式编码） 示例：21083024474734
shop_sku_id	string	否	店铺商品编码（平台店铺商品编码） 示例：92242470839734
modified	string	否	修改时间 示例：2024-01-16 09:37:14.733
enabled	boolean	否	是否上架 示例：true
c_id	number
小数位数:0,最大长度:10	否	类目编码（类目ID） 示例：1624
shop_qty	number
小数位数:0,最大长度:10	否	店铺库存 示例：0
type	number
小数位数:0,最大长度:10	否	链接同步设置，0是开启同步，2是禁止同步 示例：0
created	string	否	创建时间 示例：2023-08-31 19:15:10.450
pull_off_time	string	否	下架时间
outer_sku_code	string	否	线上国标码
sale_price_max	string	否	售价上限
sale_price_min	string	否	售价下限
properties_value	string	否	线上颜色规格 示例：黑色;M【100-115斤/155-160CM】
pic	string	否	图片地址 示例：https://u1-203.ecukwai.com/bs2/image-kwaishop-product/SKU_IMAGE-3680093734-41d576d8717f446a8528c4d032609555.jpg
link_sku_id	string	否	对应商品编码（商品对应关系页面）
link_modified	string	否	商品对应关系修改时间
raw_sku_id	string	否	原始商品编码（未经系统处理的线上商品编码原值） 示例：010614006257006
name	string	否	平台商品名称（线上商品名称） 示例：ZMOR+ 凯特大衣高克重羊毛羊绒立体剪裁大衣外套W23DC301001

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"page_size": 50,
		"page_index": 1,
		"data_count": 1,
		"page_count": 1,
		"has_next": false,
		"datas": [
			{
				"co_id": 13093720,
				"shop_id": 15006839,
				"channel": "KWaiShop",
				"i_id": "21083024474734",
				"sku_id": "010614006257006",
				"shop_i_id": "21083024474734",
				"shop_sku_id": "92242470839734",
				"modified": "2024-01-16 09:37:14.733",
				"enabled": true,
				"c_id": 1624,
				"shop_qty": 0,
				"type": 0,
				"created": "2023-08-31 19:15:10.450",
				"pull_off_time": "",
				"outer_sku_code": "",
				"sale_price_max": "",
				"sale_price_min": "",
				"properties_value": "黑色;M【100-115斤/155-160CM】",
				"pic": "https://u1-203.ecukwai.com/bs2/image-kwaishop-product/SKU_IMAGE-3680093734-41d576d8717f446a8528c4d032609555.jpg",
				"link_sku_id": "",
				"link_modified": "",
				"raw_sku_id": "010614006257006",
				"name": "ZMOR+ 凯特大衣高克重羊毛羊绒立体剪裁大衣外套W23DC301001"
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

