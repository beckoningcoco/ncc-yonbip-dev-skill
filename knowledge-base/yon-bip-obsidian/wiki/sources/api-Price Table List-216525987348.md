---
title: "价格表列表"
apiId: "2165259873480605698"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Table"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格表列表

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/price/list
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
pageIndex	number
小数位数:0,最大长度:10	否	否	分页大小 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页尺寸 示例：100 默认值：100
channel	string	否	否	渠道(ap_OffLineStore:线下门店,ap_OnLineShop:线上商城) 示例：ap_OffLineStore
region	string	是	否	地区 示例：["1907861332360167425","1904166466502000645"]
store	string	是	否	门店 示例：["1611803653214044185","1907669270030450693"]
memberlevel	string	是	否	会员级别 示例：[2215973426794752,2215974773428480]
product	string	是	否	商品 示例：["1611803653214044185","1907669270030450693"]
productsku	string	是	否	商品sku 示例：["1611803653214044185","1907669270030450693"]
productbrand	string	是	否	品牌 示例：["1611803653214044185","1907669270030450693"]
cUsedweek	string	是	否	适用星期(1,2,3,4,5,6,7:星期一到星期日) 示例：["1","2"]
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	条件字段 示例：channel
op	string	否	否	比较符（条件）：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：eq
value1	string	否	否	条件值1 示例：ap_OnLineShop
value2	string	否	否	条件值2

## 3. 请求示例

Url: /yonbip/sd/uretail/price/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"channel": "ap_OffLineStore",
	"region": [
		"1907861332360167425",
		"1904166466502000645"
	],
	"store": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"memberlevel": [
		2215973426794752,
		2215974773428480
	],
	"product": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"productsku": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"productbrand": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"cUsedweek": [
		"1",
		"2"
	],
	"simpleVOs": [
		{
			"field": "channel",
			"op": "eq",
			"value1": "ap_OnLineShop",
			"value2": ""
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	结果集
pageIndex	number
小数位数:0,最大长度:10	否	分页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页尺寸 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	截止分页码 示例：1
traceId	string	否	线索ID 示例：97bc28cdb8144f41

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"product": "1550134915035561993",
				"creator": "1529965173081112578",
				"offlineUnitId_name": "个",
				"currency_priceDigit": 2,
				"offlineUnitId": "1546442634748755978",
				"channel": "ap_OffLineStore",
				"product_code": "0001000034",
				"product_name": "Ame多肉",
				"createTime": "2024-08-08 17:03:48",
				"retailprice": 18,
				"currency": "1525603522147516435",
				"creator_name": "郝英杰",
				"id": "2060792542106484741",
				"dEffectiveDate": "2024-08-08 00:00:00",
				"dExpiryDate": "2024-08-10 00:00:00",
				"pubts": "2024-08-08 17:03:47"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "97bc28cdb8144f41"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

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

