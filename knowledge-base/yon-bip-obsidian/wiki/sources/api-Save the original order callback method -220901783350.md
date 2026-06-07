---
title: "商超订货原单回调方式保存"
apiId: "2209017833503326214"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Order Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Order Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超订货原单回调方式保存

>  请求方式	POST | Supermarket Order Original Document (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/ka/kaorderorig/callback/save
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
messageId	string	否	否	消息唯一ID 示例：0a0c1f29k3za52bo-1
topic	string	否	否	消息对外开放订阅的topic 示例：dmall.order.test
appKey	string	否	否	appKey 示例：13d7ccb5d7514d5cb9e239a78e758ac3
message	string	否	否	单据数据 示例：{"vender_id":"69","operation":0,"order":{"po_no":"PO69216P22370074","order_items":[{"item_code":"60151641","with_tax_price":"0.0000","base_unit":"KG","po_no":"PO69216P22370074","quantity":"1.000","unit":"EA"}],"supplier_code":"D103","status":30}}
vendorId	string	否	否	消息推送的商家ID，如果是群发消息，该字段为空 示例：222236
timestamp	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳 示例：2019-12-10 11:05:19
signMethod	string	否	否	signMethod 示例：HmacSHA256
sign	string	否	否	sign 示例：3IkKjioxtMq709VOWUYG1RJLYQl1EfuXFQD25PWdRxQ=

## 3. 请求示例

Url: /yonbip/sd/api/ka/kaorderorig/callback/save?access_token=访问令牌
Body: {
	"messageId": "0a0c1f29k3za52bo-1",
	"topic": "dmall.order.test",
	"appKey": "13d7ccb5d7514d5cb9e239a78e758ac3",
	"message": "{\"vender_id\":\"69\",\"operation\":0,\"order\":{\"po_no\":\"PO69216P22370074\",\"order_items\":[{\"item_code\":\"60151641\",\"with_tax_price\":\"0.0000\",\"base_unit\":\"KG\",\"po_no\":\"PO69216P22370074\",\"quantity\":\"1.000\",\"unit\":\"EA\"}],\"supplier_code\":\"D103\",\"status\":30}}",
	"vendorId": "222236",
	"timestamp": "2019-12-10 11:05:19",
	"signMethod": "HmacSHA256",
	"sign": "3IkKjioxtMq709VOWUYG1RJLYQl1EfuXFQD25PWdRxQ="
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
小数位数:0,最大长度:12	否	状态码，200-成功；999-失败 示例：200
message	string	否	状态信息 示例：ok
messageId	string	否	消息唯一ID 示例：0a0c1f29k3za52bo-1
topic	string	否	消息对外开放订阅的topic 示例：dmall.order.test
vendorId	string	否	消息推送的商家ID，如果是群发消息，该字段为空 示例：222236
timestamp	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2019-12-10 11:05:19
data	object	否	消息反馈
request	string	否	推送时调用三方推送地址的入参，即示例请求结构体里的message字段内容 示例：{"orderId":"1200897812792015983","address":"开封市"}
response	string	否	推送时调用三方推送地址返回的业务自定义处理结果，即推送协议第5项中的data字段内容 示例：{"example":"中国"}

## 5. 正确返回示例

{
	"code": 200,
	"message": "ok",
	"messageId": "0a0c1f29k3za52bo-1",
	"topic": "dmall.order.test",
	"vendorId": "222236",
	"timestamp": "2019-12-10 11:05:19",
	"data": {
		"request": "{\"orderId\":\"1200897812792015983\",\"address\":\"开封市\"}",
		"response": "{\"example\":\"中国\"}"
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
999	响应结果错误	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-01	
新增
请求参数 kaOrderOrigDefineCharacter
新增
请求参数 kaOrderOrigGoodsDefineCharacter
删除
请求参数 bip_rpa_ka_tz
新增
返回参数 (6)
更新
返回参数 (5)
删除
返回参数 (7)
添加特征字段
	2	2026-01-13	
新增
请求参数 kaVendorCode
新增
请求参数 kaVendorName
添加供应商字段
	3	2025-12-15	
更新
请求说明
新增
请求参数 kaOrderBizType
更新
返回参数 (4)
修改原单交易类型字段类型

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

