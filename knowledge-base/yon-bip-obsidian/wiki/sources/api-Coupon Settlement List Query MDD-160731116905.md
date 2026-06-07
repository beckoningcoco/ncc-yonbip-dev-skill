---
title: "卡券核销列表查询MDD"
apiId: "1607311169053261832"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Coupon"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Coupon]
platform_version: "BIP"
source_type: community-api-docs
---

# 卡券核销列表查询MDD

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/archives/queryConsumeList
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
field	string	否	否	属性名(条件)（如：cCardNo(卡号)、iLevelID（等级id）、dRegisterTime（注册时间 yyyy-MM-dd HH:mm:ss 格式）、iStop(0:启用，1：停用)） 示例：iCouponID
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：eq
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为dRegisterTime，op值为egt或gt或el或lt)el或lt) 示例：1464819298084061193
value2	string	否	否	查询条件值2

## 3. 请求示例

Url: /yonbip/sd/coupon/archives/queryConsumeList?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"simpleVOs": [
		{
			"field": "iCouponID",
			"op": "eq",
			"value1": "1464819298084061193",
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
code	string	否	返回编码 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	页面大小 示例：20
recordCount	long	否	列表行数 示例：1
pageCount	long	否	页码总数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1
recordList	object	是	列表数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"dCouponReceiveDate": "2022-11-19 16:40:31",
				"cUretailConsumeOrderCode": "LS000920230109000046",
				"cUmallConsumeOrderCode": "O-162180d409f00009221119001",
				"dCouponVerifyDate": "2022-11-19 16:50:07",
				"id": 1594702510851883013,
				"pubts": "2022-11-19 16:50:06",
				"iExpenseType": "1",
				"iSourceType": "线上商城",
				"fOffsetSum": 30,
				"iType": 1,
				"fReduceAmount": 30,
				"cTitle": "新人注册专享优惠券",
				"cConsumeCode": "O-162180d409f00009221119001",
				"cSN": "146481929808406119371414290732284",
				"iMemberID": 1613236591909666820
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
999	服务端逻辑异常!	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
返回参数 cUretailConsumeOrderCode
新增
返回参数 iMemberID
更新
返回参数 (23)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

