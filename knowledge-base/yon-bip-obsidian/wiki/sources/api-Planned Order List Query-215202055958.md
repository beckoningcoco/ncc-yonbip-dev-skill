---
title: "查询计划名称"
apiId: "2152020559581937665"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询计划名称

>  请求方式	POST | Planned Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/requirementsplanning/getPlanParamResult
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	参数
orgId	string	否	否	组织id，组织 Id 与组织编码不能同时为空，优先级：orgId>orgCode 示例：1495236170705010690
orgCode	string	否	否	组织编码，组织 Id 与组织编码不能同时为空，优先级：orgId>orgCode 示例：122701
planType	string	否	否	计划参数类型 1,MRP 2,LRP 3,手工 4,MPS 10,INVP 示例：1
runPlanStatus	string	否	否	运行状态 1,未运算 2,运算中 3,运算成功 4,运算失败 5,已运算 示例：3
planStartDate	string	否	否	计划开始日期 示例：2022-12-07
planEndDate	string	否	否	计划截止日期 示例：2022-12-07

## 3. 请求示例

Url: /yonbip/mfg/requirementsplanning/getPlanParamResult?access_token=访问令牌
Body: {
	"data": {
		"orgId": "1495236170705010690",
		"orgCode": "122701",
		"planType": "1",
		"runPlanStatus": "3",
		"planStartDate": "2022-12-07",
		"planEndDate": "2022-12-07"
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
code	string	否	返回状态码，200 成功 999 失败 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	操作通知信息 示例：操作成功
data	object	是	数据
recentPlanStartDate	string	否	最近计划起始时间 示例：2022-12-07 10:35:30
creator	string	否	创建人 示例：昵称-18510959384
planType	long	否	计划参数类型 示例：1
code	string	否	计划名称编码 示例：LRP20221207000008
orgId	string	否	组织id 示例：1495236170705010690
orgCode	string	否	组织编码 示例：amy
enabled	boolean	否	启用状态 true,启用 false,停用 示例：true
orgName	string	否	工厂名称 示例：工厂hhh
modifier	string	否	修改人 示例：昵称-18510959384
modifyTime	string	否	修改时间 示例：2022-12-07 10:35:29
runPlanStatus	long	否	运算状态 示例：3
createTime	string	否	创建时间 示例：2022-12-07 10:35:29
name	string	否	计划名称 示例：LRP20221207000008
recentPlanEndDate	string	否	最近计划结束时间 示例：2022-12-07 10:35:32
planStartDate	string	否	计划开始日期 示例：2022-12-06 00:00:00
planEndDate	string	否	计划截止日期 示例：2023-01-06 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"recentPlanStartDate": "2022-12-07 10:35:30",
			"creator": "昵称-18510959384",
			"planType": 1,
			"code": "LRP20221207000008",
			"orgId": "1495236170705010690",
			"orgCode": "amy",
			"enabled": true,
			"orgName": "工厂hhh",
			"modifier": "昵称-18510959384",
			"modifyTime": "2022-12-07 10:35:29",
			"runPlanStatus": 3,
			"createTime": "2022-12-07 10:35:29",
			"name": "LRP20221207000008",
			"recentPlanEndDate": "2022-12-07 10:35:32",
			"planStartDate": "2022-12-06 00:00:00",
			"planEndDate": "2023-01-06 00:00:00"
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
0	未传入优惠券档案id	coupon_id值填写有误
310008	取决于错误类型，不同错误信息不同	

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

