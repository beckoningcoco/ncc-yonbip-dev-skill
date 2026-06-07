---
title: "分销商导入"
apiId: "baee804b1b5a4575a8696115104b2d52"
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

# 分销商导入

>  请求方式	POST | Download Distributor File (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/distributor/batch/add
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
data	object	是	是	分销商入参
shopCode	string	否	是	店铺编码
distributorType	short	否	是	分销商类型 1：代销 2：经销
distributorNick	string	否	是	分销商昵称
cooperationStatus	string	否	是	合作状态 1：合作中 2：终止 3：终止中
distributorName	string	否	否	分销商姓名
startTime	string	否	否	合作起始时间
endTime	string	否	否	合作终止时间
authGoodsLine	string	否	否	授权商品线
alipayAccount	string	否	否	分销商支付宝账号
contact	string	否	否	联系人
mobile	string	否	否	手机号
telephone	string	否	否	电话
email	string	否	否	电子邮箱
shopUrl	string	否	否	网店地址
authName	string	否	否	认证姓名

## 3. 请求示例

Url: /yonbip/sd/dst/distributor/batch/add?access_token=访问令牌
Body: {
	"data": [
		{
			"shopCode": "",
			"distributorType": 0,
			"distributorNick": "",
			"cooperationStatus": "",
			"distributorName": "",
			"startTime": "",
			"endTime": "",
			"authGoodsLine": "",
			"alipayAccount": "",
			"contact": "",
			"mobile": "",
			"telephone": "",
			"email": "",
			"shopUrl": "",
			"authName": ""
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
code	int	否	200：成功；其他：失败 示例：200
message	string	否	返回操作信息 示例：插入成功m条,失败n条

## 5. 正确返回示例

{
	"code": 200,
	"message": "插入成功m条,失败n条"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	插入失败	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (15)
更新
返回参数 code
更新
返回参数 message

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

