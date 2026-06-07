---
title: "物料需求单详情查询"
apiId: "2126932109399425033"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material Demand Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Demand Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料需求单详情查询

>  请求方式	GET | Material Demand Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/ycpraybill/details
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	需求申请单id    示例: 3975928553181440

## 3. 请求示例

Url: /yonbip/cpu/ycpraybill/details?access_token=访问令牌&id=3975928553181440

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
vbillCode	string	否	vbillCode 示例：PB240909000002
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：1
isNewFlow	number
小数位数:0,最大长度:10	否	isNewFlow 示例：1
creatorUserId	string	否	creatorUserId 示例：1909350466371190788
prayBillDetails	object	是	prayBillDetails
code	string	否	code 示例：PB240909000002
subject	string	否	subject 示例：ycc
reqContactsId	string	否	reqContactsId 示例：1753606912025296898
creatorId	string	否	creatorId 示例：1659807841362378756
creatorName	string	否	creatorName 示例：ljl
handlerPsnId	string	否	handlerPsnId 示例：2051036927722258437
currency_id_priceDigit	number
小数位数:0,最大长度:10	否	currency_id_priceDigit 示例：4
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
creatorUserId_name	string	否	creatorUserId_name 示例：ljl
pricedigit	number
小数位数:0,最大长度:10	否	pricedigit 示例：4
currency_id_priceRount	number
小数位数:0,最大长度:10	否	currency_id_priceRount 示例：4
currencyName	string	否	currencyName 示例：人民币
jsid	number
小数位数:0,最大长度:16	否	jsid 示例：3975928553181440
moneydigit	number
小数位数:0,最大长度:10	否	moneydigit 示例：2
praybillFilesId	string	否	praybillFilesId 示例：addc1f3c-4925-4e9f-bcec-315d6d8f5b79
id	number
小数位数:0,最大长度:16	否	id 示例：3975928553181440
reqOrgId	string	否	reqOrgId 示例：1753605503279693830
handlerPsnId_name	string	否	handlerPsnId_name 示例：ljl
reqCycleYear	string	否	reqCycleYear 示例：1
reqCycleType	string	否	reqCycleType 示例：1
isWfControlled	boolean	否	isWfControlled 示例：true
reqContactsId_name	string	否	reqContactsId_name 示例：姜小宝
reqContactsId_code	string	否	reqContactsId_code 示例：00000001
commitDate	string	否	commitDate 示例：2024-09-09 00:00:00
reqOrgId_name	string	否	reqOrgId_name 示例：采购云
createTime	string	否	createTime 示例：2024-09-09 16:43:40
reqContactsName	string	否	reqContactsName 示例：姜小宝
currency_id_moneyRount	number
小数位数:0,最大长度:10	否	currency_id_moneyRount 示例：4
canWithDraw	number
小数位数:0,最大长度:10	否	canWithDraw 示例：1
currency_id_moneyDigit	number
小数位数:0,最大长度:10	否	currency_id_moneyDigit 示例：2
enterpriseId	string	否	enterpriseId 示例：1753541851851784194
planTotalMny	number
小数位数:0,最大长度:10	否	planTotalMny 示例：0
currencyCode	string	否	currencyCode 示例：CNY
currency_id	string	否	currency_id 示例：1753541800320040992
status	string	否	status 示例：5
ts	string	否	ts 示例：2024-09-09 16:43:40
masterOrgKeyField	string	否	masterOrgKeyField 示例：reqOrgId
transTypeKeyField	string	否	transTypeKeyField 示例：transactionTypeId
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true
traceId	string	否	traceId 示例：60a937eedd88eb96
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"vbillCode": "PB240909000002",
		"verifystate": 1,
		"isNewFlow": 1,
		"creatorUserId": "1909350466371190788",
		"prayBillDetails": [
			{
				"purchaseUnitPrecision": 2,
				"unitid_name": "克",
				"materialClassName": "分类1",
				"mainNum": 11,
				"invPurExchRateType": "0",
				"invPriceExchRateType": "0",
				"purchaseUnitCode": "GRM",
				"reqdate": "2024-09-09 00:00:00",
				"productName": "yc物料1",
				"dr": "0",
				"mainUnitPrecision": 2,
				"productDocId_model": "3123",
				"id": 3975928553197824,
				"productDocId_name": "yc物料1",
				"mainUnitId": "1753668373007302672",
				"purchaseUnitId": "1753668373007302672",
				"unitidPrecision": 2,
				"materialClassCode": "000001",
				"productDesc": "3123122",
				"mainUnitName": "克",
				"puOrgDocId_name": "采购云",
				"purchaseUnitId_precision": 2,
				"unit": "克",
				"puOrgDocId": "1753605503279693830",
				"mainUnitId_truncationType": 4,
				"productDocId": "1753668570587856905",
				"invPurExchRate": 1,
				"planMoney": 0,
				"productDocId_modelDescription": "122",
				"praybillId": 3975928553181440,
				"mainUnitId_name": "克",
				"invPriceExchRate": 1,
				"isBatchManage": false,
				"mainUnitId_precision": 2,
				"mainUnitCode": "GRM",
				"productSpec": "122",
				"productType": "3123",
				"purchaseUnitId_truncationType": 4,
				"rowno": "1",
				"quantity": 11,
				"materialClassId": "1753667952100507655",
				"unitcode": "GRM",
				"unitid_precision": 2,
				"praybillbFilesId": "2c658b00-c9d3-4021-b2db-c1081f60e2ff",
				"purchaseUnitName": "克",
				"productCode": "0001000001-111",
				"productDocId_manageClass_name": "分类1",
				"unitid_truncationType": 4,
				"unitid": "1753668373007302672",
				"purchaseNum": 11,
				"purchaseUnitId_name": "克"
			}
		],
		"code": "PB240909000002",
		"subject": "ycc",
		"reqContactsId": "1753606912025296898",
		"creatorId": "1659807841362378756",
		"creatorName": "ljl",
		"handlerPsnId": "2051036927722258437",
		"currency_id_priceDigit": 4,
		"dr": 0,
		"creatorUserId_name": "ljl",
		"pricedigit": 4,
		"currency_id_priceRount": 4,
		"currencyName": "人民币",
		"jsid": 3975928553181440,
		"moneydigit": 2,
		"praybillFilesId": "addc1f3c-4925-4e9f-bcec-315d6d8f5b79",
		"id": 3975928553181440,
		"reqOrgId": "1753605503279693830",
		"handlerPsnId_name": "ljl",
		"reqCycleYear": "1",
		"reqCycleType": "1",
		"isWfControlled": true,
		"reqContactsId_name": "姜小宝",
		"reqContactsId_code": "00000001",
		"commitDate": "2024-09-09 00:00:00",
		"reqOrgId_name": "采购云",
		"createTime": "2024-09-09 16:43:40",
		"reqContactsName": "姜小宝",
		"currency_id_moneyRount": 4,
		"canWithDraw": 1,
		"currency_id_moneyDigit": 2,
		"enterpriseId": "1753541851851784194",
		"planTotalMny": 0,
		"currencyCode": "CNY",
		"currency_id": "1753541800320040992",
		"status": "5",
		"ts": "2024-09-09 16:43:40",
		"masterOrgKeyField": "reqOrgId",
		"transTypeKeyField": "transactionTypeId",
		"_mddFormulaExecuteFlag": "true"
	},
	"traceId": "60a937eedd88eb96",
	"uploadable": "0"
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

