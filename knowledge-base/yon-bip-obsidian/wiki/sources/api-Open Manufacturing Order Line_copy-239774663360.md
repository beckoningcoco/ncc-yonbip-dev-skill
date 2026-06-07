---
title: "计划独立需求行打开"
apiId: "2397746633601712137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Independent Demand"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Independent Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划独立需求行打开

>  请求方式	POST | Planned Independent Demand (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/salesforecast/lineopen
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	计划独立需求Id 示例：2211732336611584
code	string	否	否	计划独立需求编码 示例：YCD20251117000093
salesForecastDetail	object	否	是	计划独立需求子表

## 3. 请求示例

Url: /yonbip/MFC/salesforecast/lineopen?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2211732336611584,
		"code": "YCD20251117000093",
		"salesForecastDetail": {
			"id": 2211732336611585
		}
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
code	string	否	单据编号
code	string	否	单据编号
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
id	long	否	计划独立需求id 示例：2301067198714880
verifystate	long	否	审批状态：0-开立，1-已提交，2-已审批，-1-驳回 示例：2
code	string	否	计划独立需求编码 示例：YCD20251028007
isWfControlled	boolean	否	是否审批流控制: true-是, false-否 示例：false
transTypeId	string	否	交易类型id 示例：1248018423173547
pubts	string	否	时间戳 示例：2021-07-05 21:58:08
orgId	string	否	组织id 示例：1890903916826591237
status	long	否	单据状态： 0-开立，1-已审核，2-已关闭，3-审核中，4-已锁定，5-已开工, 6-已完工 示例：1
ytenant	string	否	租户id 示例：0000LQGG8J4V5JGR2C0000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2301067198714880,
		"verifystate": 2,
		"code": "YCD20251028007",
		"isWfControlled": false,
		"transTypeId": "1248018423173547",
		"pubts": "2021-07-05 21:58:08",
		"orgId": "1890903916826591237",
		"status": 1,
		"ytenant": "0000LQGG8J4V5JGR2C0000"
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
999	取决于错误类型，不同错误信息不同	

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

