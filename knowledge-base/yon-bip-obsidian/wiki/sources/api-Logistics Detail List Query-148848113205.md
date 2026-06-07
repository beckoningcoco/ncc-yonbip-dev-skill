---
title: "物流明细列表查询"
apiId: "1488481132050644997"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Logistics Details"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Logistics Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 物流明细列表查询

>  请求方式	POST | Logistics Details (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/expressdetail/list
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
cExpressCoID	string	否	否	物流网点ID(物流网点ID和物流网点编码不能同时为空!)
cExpressCoCode	string	否	否	物流网点编码(物流网点ID和物流网点编码不能同时为空!)
dDate_start	string	否	是	日期开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00
dDate_end	string	否	是	日期结束时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-13 00:00:00
cExpressCode	string	否	否	快递单号
cReceiverName	string	否	否	收货人姓名
cReceiverAddress	string	否	否	收货人地址
cReceiverMobile	string	否	否	收货人手机号码
pageSize	string	否	否	每页行数 示例：10 默认值：10
pageIndex	string	否	否	页号 示例：1 默认值：1
cExpressCoName	string	否	否	物流网点名称

## 3. 请求示例

Url: /yonbip/sd/dst/expressdetail/list?access_token=访问令牌
Body: {
	"partParam": {
		"cExpressCoID": "",
		"cExpressCoCode": "",
		"dDate_start": "2022-05-13 00:00:00",
		"dDate_end": "2022-05-13 00:00:00",
		"cExpressCode": "",
		"cReceiverName": "",
		"cReceiverAddress": "",
		"cReceiverMobile": "",
		"pageSize": "10",
		"pageIndex": "1",
		"cExpressCoName": ""
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
code	long	否	返回状态码，200表示调用成功 示例：200
cpickrowno	string	否	波次号
message	string	否	操作提示信息 示例：操作成功
data	object	否	调用返回数据
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
pageIndex	long	否	页号 示例：1
pageSize	long	否	每页行数 示例：10
totalCount	long	否	查询数据总条数 示例：2
info	object	是	返回具体数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"totalCount": 2,
		"info": [
			{
				"srctype": 1,
				"cExpressCoName": "顺丰-上海",
				"cAreaName": "赛罕区",
				"srcdocno": "215920220626000000033493",
				"cProvinceName": "内蒙古自治区",
				"cShopID": 2159681119344384,
				"cCityName": "呼和浩特市",
				"cReceiverMobile": "131****7353",
				"cReceiverAddress": "**古自治区呼和浩特市赛罕区内蒙古**",
				"regionCode": "1856503919580810",
				"dDate": "2022-06-29 14:25:07",
				"cExpressCode": "SF1321450641653",
				"logisticId": 1856648501973753,
				"id": 1488497435762753500,
				"cShopName": "韩后小红书",
				"iPostFee": 0,
				"cAreaId": 1856503919580810,
				"cExpressCoCode": "SF0001",
				"isblend": 0,
				"iWeight": 0,
				"iExpressFee": 0,
				"org": "1862532516188416",
				"cBlender": "",
				"cProvinceId": 1856503919580804,
				"cshipcode": "215920220626000000033493",
				"iBlendFee": 0,
				"cEBPlatform": 6,
				"cMemo": "",
				"cReceiverName": "乌***",
				"cShopCode": "xhscs",
				"cCityId": 1856503919580805,
				"cTradeID": 1488489575953727500,
				"cExpressCoID": 1877684124799232,
				"cTradeCode": "DD999920220629000010"
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

