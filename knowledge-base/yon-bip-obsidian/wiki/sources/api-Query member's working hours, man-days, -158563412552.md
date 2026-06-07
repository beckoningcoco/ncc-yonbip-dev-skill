---
title: "根据项目成员查询成员在项目上的工时、人天、人工成本"
apiId: "1585634125520306182"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Working Hour"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Working Hour]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据项目成员查询成员在项目上的工时、人天、人工成本

>  请求方式	POST | Project Working Hour (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/workHour/queryWorkHourByStaff
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
staffId	string	否	否	项目成员ID，项目成员ID和编码至少录入一项，项目成员ID和项目成员编码同时存在，以项目成员ID为准 示例：1538863426321252358
staffCode	string	否	否	项目成员编码 示例：000000000000000000000024

## 3. 请求示例

Url: /yonbip/pm/workHour/queryWorkHourByStaff?access_token=访问令牌
Body: {
	"staffId": "1538863426321252358",
	"staffCode": "000000000000000000000024"
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	long	否	请求状态编码 示例：200
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
projectId	string	否	项目ID 示例：1547763878433128449
beginDate	string	否	开始日期 示例：2022-09-16
endDate	string	否	结束日期 示例：2022-09-17
equivalentDays	double	否	人天 示例：2.25
workhours	double	否	工时 示例：18
totalRankcost	double	否	人工成本 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"projectId": "1547763878433128449",
			"beginDate": "2022-09-16",
			"endDate": "2022-09-17",
			"equivalentDays": 2.25,
			"workhours": 18,
			"totalRankcost": 0
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
1032001990092	项目成员ID和项目成员编码不允许同时为空	检查员工ID和员工编码是否为空
1032001990098	查询结果为空	检查参数是否录入正确
1032001990099	服务端逻辑异常	联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-26	
更新
请求参数 staffId
更新
请求参数 staffCode
更新
返回参数 (9)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

