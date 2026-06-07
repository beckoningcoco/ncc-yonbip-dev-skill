---
title: "分销商档案查询"
apiId: "53efde90d98641ac940bd846c3302337"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Download Distributor File"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Download Distributor File]
platform_version: "BIP"
source_type: community-api-docs
---

# 分销商档案查询

>  请求方式	POST | Download Distributor File (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/distributor/query
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
partParam	object	否	是	查询条件
shopCode	string	否	否	店铺编码
distributorNick	string	否	否	分销商昵称
distributorName	string	否	否	分销商姓名
distributorType	short	否	否	分销商类型，1：代销，2：经销
cooperationStatus	short	否	否	合作状态，1：合作中，2：终止，3：终止中
customerCode	string	否	否	客户编码
mobile	string	否	否	手机号
pageIndex	int	否	是	页码
pageSize	int	否	是	每页记录数

## 3. 请求示例

Url: /yonbip/sd/distributor/query?access_token=访问令牌
Body: {
	"partParam": {
		"shopCode": "",
		"distributorNick": "",
		"distributorName": "",
		"distributorType": 0,
		"cooperationStatus": 0,
		"customerCode": "",
		"mobile": "",
		"pageIndex": 0,
		"pageSize": 0
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	int	否	操作状态，200表示操作成功，其他表示操作失败
message	string	否	操作提示信息
data	object	是	返回数据
shop_id	long	否	店铺ID
shopCode	string	否	店铺编码
shopName	string	否	店铺名称
shopNick	string	否	店铺昵称
shopUrl	string	否	网店地址
cooperationStatus	short	否	合作状态，1：合作中，2：终止，3：终止中
distributorName	string	否	分销商名称
distributorCode	string	否	分销商编码
distributorNick	string	否	分销商昵称
distributorType	short	否	分销商类型，1：代销，2：经销
startTime	DateTime	否	合作起始时间
endTime	DateTime	否	合作终止时间
contact	string	否	联系人
mobile	string	否	手机号
telephone	string	否	电话
email	string	否	电子邮箱
alipayAccount	string	否	分销商支付宝账号
authGoodsLine	string	否	授权商品线
authName	string	否	认证姓名
creatorId	string	否	创建人ID
creator	string	否	创建人
createTime	DateTime	否	创建时间
createDate	DateTime	否	创建日期
modifierId	string	否	修改人ID
platType	short	否	平台类型，平台枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
modifier	string	否	修改人
modifyTime	DateTime	否	修改时间
modifyDate	DateTime	否	修改日期
ys_customer	long	否	客户ID
ys_customer_name	string	否	客户名称
ys_customer_code	string	否	客户编码
tenant	long	否	租户ID
id	long	否	分销商ID
pubts	DateTime	否	时间戳

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": [
		{
			"shop_id": 0,
			"shopCode": "",
			"shopName": "",
			"shopNick": "",
			"shopUrl": "",
			"cooperationStatus": 0,
			"distributorName": "",
			"distributorCode": "",
			"distributorNick": "",
			"distributorType": 0,
			"startTime": "",
			"endTime": "",
			"contact": "",
			"mobile": "",
			"telephone": "",
			"email": "",
			"alipayAccount": "",
			"authGoodsLine": "",
			"authName": "",
			"creatorId": "",
			"creator": "",
			"createTime": "",
			"createDate": "",
			"modifierId": "",
			"platType": 0,
			"modifier": "",
			"modifyTime": "",
			"modifyDate": "",
			"ys_customer": 0,
			"ys_customer_name": "",
			"ys_customer_code": "",
			"tenant": 0,
			"id": 0,
			"pubts": ""
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	查询分销商信息异常	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (9)
更新
返回参数 (37)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

