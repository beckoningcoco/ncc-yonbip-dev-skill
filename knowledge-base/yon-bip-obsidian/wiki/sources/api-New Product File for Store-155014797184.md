---
title: "店铺商品档案新增"
apiId: "1550147971849912323"
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

# 店铺商品档案新增

>  请求方式	POST | Store Product File (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/platgoods/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	店铺商品对象
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
shop_id	string	否	否	店铺ID，店铺ID或者店铺编码二选一必填
shopCode	string	否	否	店铺编码，店铺ID或者店铺编码二选一必填
goodsname	string	否	否	商品名称
goodsTitle	string	否	是	店铺商品名称
shopChannelCode	string	否	是	店铺商品编码
skuChannelCode	string	否	否	店铺商品SKU
goodsdescription	string	否	否	店铺商品描述
businessOutCode	string	否	否	商家编码
skuOutCode	string	否	否	商家SKU编码
warehouse	string	否	否	默认仓库ID
warehouseCode	string	否	否	默认仓库编码
cExpressCoID	string	否	否	物流网点ID
expressCode	string	否	否	物流网点编码
synchroOnlineStock	string	否	否	同步线上库存，1：是、0：否
isDropshipping	string	否	否	是否一件代发，1：是、0：否
_status	string	否	否	状态，新增:Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/sd/dst/platgoods/add?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"shop_id": "",
		"shopCode": "",
		"goodsname": "",
		"goodsTitle": "",
		"shopChannelCode": "",
		"skuChannelCode": "",
		"goodsdescription": "",
		"businessOutCode": "",
		"skuOutCode": "",
		"warehouse": "",
		"warehouseCode": "",
		"cExpressCoID": "",
		"expressCode": "",
		"synchroOnlineStock": "",
		"isDropshipping": "",
		"_status": ""
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
message	string	否	返回信息 操作成功 示例：操作成功
data	object	否	返回数据
count	long	否	请求数据数量 示例：2
sucessCount	long	否	成功的数量 示例：2
failCount	long	否	失败的数量 示例：0
messages	object	是	返回的信息清单
infos	object	是	成功的数据体
failInfos	object	是	失败的数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"shopCode": "rxt080503",
				"goodsname": "商品名称001",
				"goodsTitle": "店铺商品名称001",
				"shopChannelCode": "shopChannelCode0023",
				"skuChannelCode": "skuChannelCode001",
				"goodsdescription": "goodsdescription001",
				"businessOutCode": "businessOutCode001",
				"skuOutCode": "skuOutCode001",
				"warehouseCode": "rxtck",
				"expressCode": "001",
				"cExpressCoID": 1865165875384576,
				"shop_id": 1471409641989603339,
				"warehouse": 1472054703122546694,
				"id": 1550873872852582408,
				"org": "1471407700648656896",
				"pubts": "2022-09-21 15:31:21",
				"tenant": 1857881280057600,
				"yTenantId": "h6q8321v"
			}
		],
		"failInfos": [
			{}
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
999	服务端逻辑异常	

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

