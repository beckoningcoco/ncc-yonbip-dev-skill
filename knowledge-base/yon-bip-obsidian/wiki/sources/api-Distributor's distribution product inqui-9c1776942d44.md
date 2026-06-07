---
title: "会员查询V3"
apiId: "9c1776942d44447a931b36aa6160d2c6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Distribution Order"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Distribution Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 会员查询V3

>  请求方式	POST | Distribution Order (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/member/queryList
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
pageSize	long	否	否	每页数量 示例：10 默认值：10
pageIndex	long	否	否	当前页 示例：1 默认值：1
simpleVOs	object	是	否	自定义查询条件
field	string	否	否	属性名(条件)（如：cCardNo(卡号)、iLevelID（等级id）、dRegisterTime（注册时间 yyyy-MM-dd HH:mm:ss 格式）、iStop(0:启用，1：停用)） 示例：iStop
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：in
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为dRegisterTime，op值为egt或gt或el或lt)el或lt)
value2	string	否	否	查询条件值2
cRealName	string	否	否	会员名称 示例：小明
cPhone	string	否	否	会员手机号 示例：13111111111

## 3. 请求示例

Url: /yonbip/sd/member/queryList?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"simpleVOs": [
		{
			"field": "iStop",
			"op": "in",
			"value1": "",
			"value2": ""
		}
	],
	"cRealName": "小明",
	"cPhone": "13111111111"
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
code	string	否	返回编码 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	页面大小 示例：20
pageCount	long	否	页码总数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1
recordCount	long	否	列表行数 示例：1
recordList	object	是	列表数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordCount": 1,
		"recordList": [
			{
				"cRealName": "小明",
				"dLevelTime": "2022-07-07 09:48:20",
				"cMemberLevelName": "高级",
				"iSex": 0,
				"dFirstTradeTime": "1970-01-01 08:00:00",
				"iStoreEmployeeID": "",
				"iPoints": 0,
				"iCorpID": 2530,
				"id": 1494292136906981384,
				"iConsumeCount": 0,
				"cAppDesc": "U会员",
				"cAppName": "默认会员体系",
				"iFrozenPoints": 0,
				"iAbandonCount": 0,
				"fStorageBalance": 0,
				"fConsumeAmount": 0,
				"iCouponCount": 1,
				"iBirthdayType": "公历",
				"dBirthdayDate": "2016-01-09 09:45:00",
				"dBirthdayMonth": 0,
				"dMemLevelValidDate": "2023-07-07 23:59:59",
				"cCity": "晋中",
				"storeCode": "001",
				"iAvailableCount": 0,
				"cPhone": "18616060060",
				"iCountUseCoupons": 0,
				"fRealConsumeAmount": 0,
				"iLevelID": 2403209876427264,
				"dReceiveDate": "2022-07-07 09:48:20",
				"bImport": 0,
				"cCountryCode": "86",
				"Phone": "86-18616060060",
				"iStoreID": 1836576755126528,
				"iExpiredCount": 0,
				"storeName": "海淀一门店",
				"pubts": "2022-07-07 10:54:16",
				"cCardNo": "18616060060",
				"dRegisterDate": "2022-07-07 09:48:20",
				"iSourceType": 0,
				"cMemberLevelCode": "000123",
				"cAppID": "yl_yjPAYw1pxdmK",
				"iStoreCSID": "",
				"iStop": 0,
				"bStorageExemptPwd": 0,
				"iMemberProperty": 1,
				"fStorageDisaccount": 0,
				"iStorageExemptMoney": 0,
				"WXStatus": 0,
				"createTime": "2022-07-07 10:54:16",
				"iSourceTypeDetail": 1,
				"memberattach": {
					"id": 1494326118683508738,
					"fStorageBalanceDisaccount": 0,
					"fFirstTradeAmount": 0,
					"iTradeCount": 0,
					"bCreditSale": 0,
					"fCreditAmount": 0,
					"fAvailableCreditAmount": 0,
					"iFirstTradeStoreID": 1836576755126528,
					"fRefundSum": 0,
					"iRefundCount": 0
				},
				"membersFreeDefine": {
					"id": 1494292136906981384,
					"define1": "d1d260f0-fd96-11ec-9ff2-1bab4faa4723"
				}
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
0	未传入优惠券档案id	coupon_id值填写有误
999	服务端逻辑异常!	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
更新
返回参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

