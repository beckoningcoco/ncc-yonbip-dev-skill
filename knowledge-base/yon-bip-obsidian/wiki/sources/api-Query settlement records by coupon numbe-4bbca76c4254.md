---
title: "按卡券号查询核销记录"
apiId: "4bbca76c425444508c04f7cd7b4b090e"
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

# 按卡券号查询核销记录

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/consume/query
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
startTime	DateTime	否	否	开始时间 示例：2021-07-01 00:00:00
endTime	DateTime	否	否	结束时间 示例：2021-07-02 00:00:00
snList	string	是	是	卡券编码集合 示例：["123","124"]

## 3. 请求示例

Url: /yonbip/sd/coupon/consume/query?access_token=访问令牌
Body: {
	"startTime": "2021-07-01 00:00:00",
	"endTime": "2021-07-02 00:00:00",
	"snList": [
		"123",
		"124"
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
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	是	数据对象
sn	string	否	卡券编码 示例：1234
archiveId	long	否	卡券档案ID 示例：1111
archiveName	string	否	卡券名称 示例：代金券001
totalUsedTimes	int	否	使用次数 示例：1
details	object	是	卡券详情

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"sn": "1234",
			"archiveId": 1111,
			"archiveName": "代金券001",
			"totalUsedTimes": 1,
			"details": [
				{
					"store": {
						"id": 1233444
					},
					"storeEmployee": {
						"id": 1222111
					},
					"voucherCode": "单号001",
					"ownerId": "12344",
					"isMember": ""
				}
			]
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
404	未查询到传入卡号的核销数据!	snList值填写有误！

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-23	
更新
请求说明
新增
请求参数 appId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

