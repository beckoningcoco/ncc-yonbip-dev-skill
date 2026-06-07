---
title: "查看商机详情"
apiId: "6f244e4acdfb4c50bea6adf483fed4ae"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看商机详情

>  请求方式	GET | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/oppt/getbyid
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	商机主键    示例: 12345

## 3. 请求示例

Url: /yonbip/crm/oppt/getbyid?access_token=访问令牌&id=12345

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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
country	string	否	国家id 示例：0040be98-735b-44c0-afe5-54d11a96037b
currency_priceDigit	long	否	币种单价精度 示例：3
masterOrgKeyField	string	否	主组织字段 示例：org
modifier	string	否	修改人 示例：刘灿
opptDate	string	否	商机日期 示例：2021-03-24 00:00:00
opptTransType_isLostBillApproved	boolean	否	丢单需要审核(true：需要；false:不允许) 示例：false
modifyTime	string	否	修改时间 示例：2021-03-24 14:41:43
attachmentGroupId	long	否	附件分组ID 示例：2104491253027072
id	long	否	id 示例：2185102492553472
customer_isPotential	boolean	否	是否潜客（true:是;false:不是） 示例：false
winningRate	long	否	赢单率% 示例：10
actualFee	long	否	实际费用 示例：7
attachmentGroupId_Name	string	否	附件分组 示例：商机附件1
stageDuration	string	否	当前阶段时长 示例：0天0小时
longitude	double	否	经度 示例：116.243543
ower	string	否	负责人ID 示例：2095941795828736
stageStartTime	string	否	当前阶段开始时间 示例：2021-03-24 14:38:09
expectFee	long	否	预计费用 示例：8
modifyDate	string	否	最后修改日期 示例：2021-03-24 00:00:00
expectTenderDate	string	否	预计投标日期 示例：2021-03-25 00:00:00
opptItemList	object	是	商机明细
saleArea	long	否	销售区域ID 示例：2095888084340992
winLoseOrderState	long	否	赢丢单状态(0:赢单；1:丢单;2:未定) 示例：2
opptAttachmentList	object	是	商机附件子表
currTotalDuration	string	否	商机总时长 示例：0天0小时
firstStageStartTime	string	否	第一个阶段的开始时间 示例：2021-03-24 14:38:09
expectSignDate	string	否	预计签单日期 示例：2021-03-26 00:00:00
name	string	否	商机名称 示例：api测试商机
currency_moneyDigit	long	否	币种金额精度 示例：4
code	string	否	商机编号 示例：2021032400992
latitude	double	否	纬度 示例：40.083249
description	string	否	描述 示例：描述
opptTransType_name	string	否	商机交易类型 示例：合同商机
industry	long	否	行业ID 示例：2095907552137472
finalUser	long	否	最终用户ID 示例：2185071104020736
opptState	long	否	商机状态(0:进行中;1:暂停;2:作废;3:关闭) 示例：0
ower_name	string	否	负责人 示例：刘灿
regionCode	string	否	省市区编码 示例：110108000000
nonFollowUpDuration	string	否	未跟进时长 示例：未跟进
opptStage_name	string	否	商机阶段 示例：挖掘商机
expectSignMoney	long	否	预计签单金额 示例：40
country_name	string	否	国家 示例：中国大陆
currency	string	否	币种ID 示例：2095650790495488
opptTransType	long	否	商机交易类型ID 示例：2178073016635648
pubts	string	否	时间戳 示例：2021-03-24 14:41:43
org_name	string	否	销售组织 示例：集团
expectSignNum	long	否	预计签单数量 示例：10
createDate	string	否	创建时间 示例：2021-03-24 00:00:00
process	long	否	流程id 示例：2181998989971712
creator	string	否	创建人 示例：刘灿
industry_name	string	否	行业 示例：互联网
address	string	否	详细地址 示例：北京市海淀区西北旺镇永捷北路激光显示产业园
currency_name	string	否	币种 示例：人民币
org	string	否	销售组织ID 示例：2095880010126336
saleArea_name	string	否	销售区域 示例：北京
processStage	long	否	商机流程阶段ID 示例：2181998989988096
dept_name	string	否	部门 示例：销管部门
finalUser_name	string	否	最终用户 示例：茜茜客户-3
dept	string	否	部门ID 示例：2095882496889088
opptTransType_bustype	string	否	交易类型ID 示例：2178072714350848
createTime	string	否	创建时间 示例：2021-03-24 14:41:12
opptTransType_isWinBillApproved	boolean	否	赢单需要审核(true:是;false:否) 示例：false
opptStage	long	否	商机阶段ID 示例：2095595396124929
customer_name	string	否	客户 示例：客户啦啦啦测试
customer	long	否	客户ID 示例：2185019869679872
pictureSettingDetail	object	否	图片设置详情
processDetail	object	否	商机流程信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"currency_priceDigit": 3,
		"masterOrgKeyField": "org",
		"modifier": "刘灿",
		"opptDate": "2021-03-24 00:00:00",
		"opptTransType_isLostBillApproved": false,
		"modifyTime": "2021-03-24 14:41:43",
		"attachmentGroupId": 2104491253027072,
		"id": 2185102492553472,
		"customer_isPotential": false,
		"winningRate": 10,
		"actualFee": 7,
		"attachmentGroupId_Name": "商机附件1",
		"stageDuration": "0天0小时",
		"longitude": 116.243543,
		"ower": "2095941795828736",
		"stageStartTime": "2021-03-24 14:38:09",
		"expectFee": 8,
		"modifyDate": "2021-03-24 00:00:00",
		"expectTenderDate": "2021-03-25 00:00:00",
		"opptItemList": [
			{
				"saleUnit_precision": 2,
				"productClass_name": "饮品",
				"itemCurrency": "2095650790495488",
				"num": 10,
				"discount": 100,
				"remark": "备注",
				"itemCurrency_priceDigit": 3,
				"saleUnit": 2095887618756864,
				"productLine": 2095886103040256,
				"manageClass_name": "饮品",
				"manageClass": 2095884649091328,
				"itemCurrency_name": "人民币",
				"id": 2185102492553473,
				"brand": 2095886744408320,
				"unitPrice": 4,
				"product": 2167832097952000,
				"productClass": 2095885246779648,
				"expectPaymentDate": "2021-03-29 00:00:00",
				"expectDeliveryDate": "2021-03-27 00:00:00",
				"opptId": 2185102492553472,
				"brand_name": "康师傅",
				"discountMoney": 0,
				"product_name": "康师傅冰红茶",
				"productLine_name": "饮品",
				"money": 40,
				"saleUnit_name": "瓶",
				"itemCurrency_moneyDigit": 4
			}
		],
		"saleArea": 2095888084340992,
		"winLoseOrderState": 2,
		"opptAttachmentList": [
			{
				"fileName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/c49356b4-4acd-4f01-abd5-271e6d2b3010.png",
				"size": 84885,
				"opptId": 2185102492553472,
				"id": 2185102492553474,
				"type": "image/png"
			}
		],
		"currTotalDuration": "0天0小时",
		"firstStageStartTime": "2021-03-24 14:38:09",
		"expectSignDate": "2021-03-26 00:00:00",
		"name": "api测试商机",
		"currency_moneyDigit": 4,
		"code": "2021032400992",
		"latitude": 40.083249,
		"description": "描述",
		"opptTransType_name": "合同商机",
		"industry": 2095907552137472,
		"finalUser": 2185071104020736,
		"opptState": 0,
		"ower_name": "刘灿",
		"regionCode": "110108000000",
		"nonFollowUpDuration": "未跟进",
		"opptStage_name": "挖掘商机",
		"expectSignMoney": 40,
		"country_name": "中国大陆",
		"currency": "2095650790495488",
		"opptTransType": 2178073016635648,
		"pubts": "2021-03-24 14:41:43",
		"org_name": "集团",
		"expectSignNum": 10,
		"createDate": "2021-03-24 00:00:00",
		"process": 2181998989971712,
		"creator": "刘灿",
		"industry_name": "互联网",
		"address": "北京市海淀区西北旺镇永捷北路激光显示产业园",
		"currency_name": "人民币",
		"org": "2095880010126336",
		"saleArea_name": "北京",
		"processStage": 2181998989988096,
		"dept_name": "销管部门",
		"finalUser_name": "茜茜客户-3",
		"dept": "2095882496889088",
		"opptTransType_bustype": "2178072714350848",
		"createTime": "2021-03-24 14:41:12",
		"opptTransType_isWinBillApproved": false,
		"opptStage": 2095595396124929,
		"customer_name": "客户啦啦啦测试",
		"customer": 2185019869679872,
		"pictureSettingDetail": {
			"isAllowAlbum": true,
			"isUseWatermark": true,
			"isAllowPhotograph": true,
			"watchmarkvalues": "[\"creator\", \"customer_name\", \"currentTime\", \"currentLocation\"]"
		},
		"processDetail": {
			"businessObject": "0",
			"code": "2021033000563",
			"id": "2193718951072000",
			"isPreset": "false",
			"name": "商机_商机0330_002",
			"opptTransType": "2193714787422464",
			"opptTransType_bustype": "2193712635040000",
			"opptTransType_name": "商机0330",
			"stageList": {},
			"stageRelationList": {},
			"stopstatus": false
		}
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
999	获取失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-05-15	
更新
请求说明
更新
	2	2025-06-25	
更新
返回参数 (118)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

