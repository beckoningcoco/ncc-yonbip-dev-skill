---
title: "根据指定范围对象查询全员应用授权的服务列表"
apiId: "2027198012406628361"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据指定范围对象查询全员应用授权的服务列表

>  请求方式	GET | BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/getBySubjectIdAndSubjectTyp
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
subjectId	string	query	是	范围对象的Id（比如用户Id、组织部门Id、用户组Id、身份类型，特别注意：若按照组织部门包含下级查询时候，可以按照child://组织部门Id作为入参）    示例: 4094253b-9c44-4de4-be1a-8865f6346b9a
subjectType	string	query	是	范围对象类型（部门：org，用户：user，身份类型：userType，用户组：userGroup，兼职组织部门：partTimeOrg，组织：staffOrg）    示例: user
pageIndex	number
小数位数:2,最大长度:10	query	是	当前页码（从1开始计数）    示例: 1    默认值: 1
pageSize	number
小数位数:2,最大长度:10	query	是	每页显示条数（一页最多1000条）    示例: 20    默认值: 20

## 3. 请求示例

Url: /yonbip/digitalModel/getBySubjectIdAndSubjectTyp?access_token=访问令牌&subjectId=4094253b-9c44-4de4-be1a-8865f6346b9a&subjectType=user&pageIndex=1&pageSize=20

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页显示条数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总条数 示例：1
recordList	string	是	服务Id集合 示例：["3d36c6ab-d79c-470a-89b1-0d8136c60e03"]
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			"3d36c6ab-d79c-470a-89b1-0d8136c60e03"
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

