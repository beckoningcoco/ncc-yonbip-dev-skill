---
title: "商机单个保存"
apiId: "1690311137171079168"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 商机单个保存

>  请求方式	POST | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/opptsave
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
data	object	否	是	请求数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	是	商机编号 示例：20230328040003
name	string	否	是	商机名称 示例：商机名称openapi
customer	string	否	是	客户ID，支持传入id或者code其中一项 示例：1523258263940890626
settleCustomer	string	否	否	开票客户ID，支持传入id或者code其中一项 示例：1604380498121981956
finalUser	string	否	否	最终客户ID，支持传入id或者code其中一项 示例：1531576120942002176
opptDate	string	否	是	商机日期 示例：2023-03-28
opptTransType	string	否	是	商机交易类型ID，支持传入id或者code其中一项 示例：1515900160325451785
opptStage	string	否	是	商机阶段ID，支持传入id或者code其中一项 示例：1490076360216937189
winningRate	long	否	是	赢单率% 示例：10
opptSource	string	否	否	商机来源ID，支持传入id或者code其中一项 示例：1490076368806871111
industry	string	否	否	行业ID，支持传入id或者code其中一项 示例：1492186082424389640
opptState	long	否	是	商机状态，0-进行中； 示例：0
expectSignNum	long	否	否	预计签单数量 示例：1
currency	string	否	否	币种ID，支持传入id或者code其中一项 示例：1490075982273445927
expectSignMoney	BigDecimal	否	是	预计签单金额 示例：1
expectSignDate	string	否	是	预计签单日期 示例：2023-03-29
expectFee	BigDecimal	否	否	预计费用 示例：111
actualFee	BigDecimal	否	否	实际费用 示例：111
country	string	否	否	国家id，支持传入id或者code其中一项 示例：bf8fe438-f309-11e8-817e-7cd30abea0c0
regionCode	string	否	否	省市区编码 示例：110101000000
longitude	double	否	否	经度 示例：116.40112
latitude	double	否	否	纬度 示例：39.91721
address	string	否	否	详细地址 示例：北京市东城区织女桥东河沿
expectTenderDate	string	否	否	预计投标日期 示例：2023-03-30
ower	string	否	否	负责人ID，支持传入id或者code其中一项 示例：1492105156729765896
dept	string	否	否	部门ID，支持传入id或者code其中一项 示例：1492103576208015367
saleArea	string	否	否	销售区域ID，支持传入id或者code其中一项 示例：1492186984367521798
org	string	否	是	销售组织ID，支持传入id或者code其中一项 示例：1492102528208207880
description	string	否	否	描述 示例：描述
cust	string	否	否	伙伴ID，支持传入id或者code其中一项 示例：1604380498121981956
opptItemList	object	是	否	商机子表数据
_status	string	否	是	单据状态，必须传Insert 示例：Insert
systemCode	string	否	是	openapi标识，必须传 opptOpenApIAdd 示例：opptOpenApIAdd

## 3. 请求示例

Url: /yonbip/crm/bill/opptsave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "20230328040003",
		"name": "商机名称openapi",
		"customer": "1523258263940890626",
		"settleCustomer": "1604380498121981956",
		"finalUser": "1531576120942002176",
		"opptDate": "2023-03-28",
		"opptTransType": "1515900160325451785",
		"opptStage": "1490076360216937189",
		"winningRate": 10,
		"opptSource": "1490076368806871111",
		"industry": "1492186082424389640",
		"opptState": 0,
		"expectSignNum": 1,
		"currency": "1490075982273445927",
		"expectSignMoney": 1,
		"expectSignDate": "2023-03-29",
		"expectFee": 111,
		"actualFee": 111,
		"country": "bf8fe438-f309-11e8-817e-7cd30abea0c0",
		"regionCode": "110101000000",
		"longitude": 116.40112,
		"latitude": 39.91721,
		"address": "北京市东城区织女桥东河沿",
		"expectTenderDate": "2023-03-30",
		"ower": "1492105156729765896",
		"dept": "1492103576208015367",
		"saleArea": "1492186984367521798",
		"org": "1492102528208207880",
		"description": "描述",
		"cust": "1604380498121981956",
		"opptItemList": [
			{
				"discount": 100,
				"itemCurrency": "1490075982273445927",
				"product": "",
				"brand": "",
				"productLine": "1618534202067124226",
				"saleUnit": "1492246942088429580",
				"unitPrice": 1,
				"num": 1,
				"money": 1,
				"discountMoney": 0,
				"expectDeliveryDate": "2023-03-30 00:00:00",
				"expectPaymentDate": "2023-04-01 00:00:00",
				"remark": "子表备注",
				"_status": "Insert",
				"manageClass": "160438049812185757",
				"productClass": "1604380498125858"
			}
		],
		"_status": "Insert",
		"systemCode": "opptOpenApIAdd"
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
code	string	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
code	string	否	商机编号 示例：20230328040003
name	string	否	商机名字 示例：商机名称openapi
customer	long	否	客户ID 示例：1523258263940890626
settleCustomer	long	否	开票客户ID 示例：1604380498121981956
finalUser	long	否	最终客户ID 示例：1531576120942002176
opptDate	string	否	商机日期 示例：2023-03-28 00:00:00
opptTransType	long	否	商机交易类型ID 示例：1515900160325451785
opptStage	long	否	商机阶段ID 示例：1490076360216937189
processStage	long	否	商机流程ID 示例：1653296207075737616
winningRate	long	否	赢单率% 示例：10
opptSource	long	否	商机来源ID 示例：1490076368806871111
stageStartTime	string	否	当前阶段开始时间 示例：2023-03-28 12:09:02
firstStageStartTime	string	否	第一个阶段的开始时间 示例：2023-03-28 12:09:02
industry	long	否	行业ID 示例：1492186082424389640
opptState	long	否	商机状态，0-进行中； 示例：0
expectSignNum	long	否	预计签单数量 示例：1
currency	string	否	币种ID 示例：1490075982273445927
expectSignMoney	BigDecimal	否	预计签单金额 示例：1
expectSignDate	string	否	预计签单日期 示例：2023-03-29 00:00:00
expectFee	BigDecimal	否	预计费用 示例：111
actualFee	BigDecimal	否	实际费用 示例：111
country	string	否	国家id 示例：bf8fe438-f309-11e8-817e-7cd30abea0c0
regionCode	string	否	省市区编码 示例：110101000000
longitude	float	否	经度 示例：116.40112542
latitude	float	否	纬度 示例：39.9172139
address	string	否	详细地址 示例：北京市东城区织女桥东河沿
expectTenderDate	string	否	预计投标日期 示例：2023-03-30 00:00:00
ower	string	否	负责人ID 示例：1492105156729765896
dept	string	否	部门id 示例：1492103576208015367
saleArea	long	否	销售区域id 示例：1492186984367521798
org	string	否	组织id 示例：1492102528208207880
description	string	否	描述 示例：描述
winLoseOrderState	long	否	赢丢单状态，0-赢单；1-丢单；2-未定 示例：0
process	long	否	流程id 示例：1653296207075737615
creatorId	long	否	创建人ID 示例：1492105577654910979
creator	string	否	创建人 示例：昵称-马继铖
createTime	string	否	创建时间 示例：2023-03-28 12:16:35
createDate	string	否	创建日期 示例：2023-03-28 12:16:35
cust	long	否	伙伴ID 示例：1604380498121981956
picture1	string	否	图片1 示例：3666b663-d5b9-4ada-8b5a-dd62f0066ac3
opptItemList	object	是	子表数据
id	long	否	商机ID 示例：1690301516455870466
transType	string	否	商机交易类型ID 示例：1515900057236275205
pubts	string	否	时间戳 示例：2023-03-28 12:16:36
tenant	long	否	租户 示例：2842093859478512
yTenantId	string	否	租户 示例：0000L5294VDVGTIHVM0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "20230328040003",
		"name": "商机名称openapi",
		"customer": 1523258263940890626,
		"settleCustomer": 1604380498121981956,
		"finalUser": 1531576120942002176,
		"opptDate": "2023-03-28 00:00:00",
		"opptTransType": 1515900160325451785,
		"opptStage": 1490076360216937189,
		"processStage": 1653296207075737616,
		"winningRate": 10,
		"opptSource": 1490076368806871111,
		"stageStartTime": "2023-03-28 12:09:02",
		"firstStageStartTime": "2023-03-28 12:09:02",
		"industry": 1492186082424389640,
		"opptState": 0,
		"expectSignNum": 1,
		"currency": "1490075982273445927",
		"expectSignMoney": 1,
		"expectSignDate": "2023-03-29 00:00:00",
		"expectFee": 111,
		"actualFee": 111,
		"country": "bf8fe438-f309-11e8-817e-7cd30abea0c0",
		"regionCode": "110101000000",
		"longitude": 116.40112542,
		"latitude": 39.9172139,
		"address": "北京市东城区织女桥东河沿",
		"expectTenderDate": "2023-03-30 00:00:00",
		"ower": "1492105156729765896",
		"dept": "1492103576208015367",
		"saleArea": 1492186984367521798,
		"org": "1492102528208207880",
		"description": "描述",
		"winLoseOrderState": 0,
		"process": 1653296207075737615,
		"creatorId": 1492105577654910979,
		"creator": "昵称-马继铖",
		"createTime": "2023-03-28 12:16:35",
		"createDate": "2023-03-28 12:16:35",
		"cust": 1604380498121981956,
		"picture1": "3666b663-d5b9-4ada-8b5a-dd62f0066ac3",
		"opptItemList": [
			{
				"discount": 100,
				"itemCurrency": "1490075982273445927",
				"productLine": 1618534202067124226,
				"saleUnit": 1492246942088429580,
				"unitPrice": 1,
				"num": 1,
				"money": 1,
				"discountMoney": 0,
				"expectDeliveryDate": "2023-03-30 00:00:00",
				"expectPaymentDate": "2023-04-01 00:00:00",
				"remark": "子表备注",
				"id": 1690301516455870467,
				"opptId": 1690301516455870466,
				"pubts": "2023-03-28 12:16:35",
				"tenant": 2842093859478512,
				"yTenantId": "0000L5294VDVGTIHVM0000",
				"manageClass": 1690301516455870988,
				"productClass": 169030151645574932
			}
		],
		"id": 1690301516455870466,
		"transType": "1515900057236275205",
		"pubts": "2023-03-28 12:16:36",
		"tenant": 2842093859478512,
		"yTenantId": "0000L5294VDVGTIHVM0000"
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
999	商机名称 (商机openapi)已经存在	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (47)
更新
返回参数 (67)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

