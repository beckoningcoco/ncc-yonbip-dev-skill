---
title: "店铺商品查询"
apiId: "08e3266066da4b8b9605dfcf1be50c75"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Store Product File"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Store Product File]
platform_version: "BIP"
source_type: community-api-docs
---

# 店铺商品查询

>  请求方式	POST | Store Product File (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/shop/itemquery
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
partParam	object	否	是	查询条件集合
retailStoreCode	string	否	是	零售店铺编码
pageIndex	int	否	是	页码 示例：0
pageSize	int	否	是	每页数据行数 示例：10
skuChannelCode	string	否	否	店铺商品SKU
goodsTitle	string	否	否	商品标题
shopChannelCode	string	否	否	店铺商品编码
product_code	string	否	否	关联商品编码
logisticName	string	否	否	物流网点商品SKU
saleStatus	string	否	否	线上商品状态 0-在售 1-下架
productSku	long	否	否	商品SKUID
businessOutCode	string	否	否	商家编码
productSku_code	string	否	否	关联商品SKU编码
platSku	string	否	否	平台SKU属性
size	string	否	否	商品规格
warehouseCode	string	否	否	仓库编码
skuOutCode	string	否	否	商家SKU编码

## 3. 请求示例

Url: /yonbip/sd/dst/shop/itemquery?access_token=访问令牌
Body: {
	"partParam": {
		"retailStoreCode": "",
		"pageIndex": 0,
		"pageSize": 10,
		"skuChannelCode": "",
		"goodsTitle": "",
		"shopChannelCode": "",
		"product_code": "",
		"logisticName": "",
		"saleStatus": "",
		"productSku": 0,
		"businessOutCode": "",
		"productSku_code": "",
		"platSku": "",
		"size": "",
		"warehouseCode": "",
		"skuOutCode": ""
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用提示信息 示例：操作成功
data	object	否	调用返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页数据条数 示例：10
totalCount	long	否	查询数据总条数 示例：2
info	object	是	返回具体数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"totalCount": 2,
		"info": [
			{
				"shopCode": "0905001",
				"shop_id": 1902332170768640,
				"org": "1902304867029504",
				"productSku": 2591501159272704,
				"adaptTime": "2022-01-05 16:52:50",
				"synchroOnlineStock": 0,
				"goodsname": "奇门商品",
				"goodsTitle": "123",
				"saleStatus": 0,
				"shopChannelCode": "1269823500",
				"businessOutCode": "",
				"skuChannelCode": "",
				"id": 2573295319323649,
				"pubts": "2022-01-05 16:52:49",
				"tenant": 1900744152355072
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
999	根据零售店铺编码未查询到店铺信息	请输入当前租户存在的零售店铺编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (16)
更新
返回参数 (22)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

