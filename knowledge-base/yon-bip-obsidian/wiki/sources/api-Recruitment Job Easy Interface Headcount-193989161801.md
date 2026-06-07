---
title: "招聘职位大易对接编制校验接口"
apiId: "1939891618011676673"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Vacancy"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Vacancy]
platform_version: "BIP"
source_type: community-api-docs
---

# 招聘职位大易对接编制校验接口

>  请求方式	POST | Job Vacancy (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/recruitCheckCount
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
startDate	date
格式:yyyy-MM-dd	否	否	开始日期，判断编制期间 示例：2024-02-27
recruitPostList	object	是	是	招聘职位集合
recruitNum	number
小数位数:0,最大长度:5	否	是	需求人数 示例：5
id	string	否	否	职位id 示例：1233444
code	string	否	否	职位编码 示例：23444444
orgId	string	否	是	组织id或code 示例：23456222
deptId	string	否	否	部门id或code 示例：231233
personCategoryCode	string	否	否	员工类别编码 示例：22323828
empFormCode	string	否	否	用工形式编码 示例：34533
degreeCode	string	否	否	学位编码 示例：34322267
educationCode	string	否	否	学历编码 示例：1733638775847780352
jobrankCode	string	否	否	职级编码 示例：54666
jobgradeCode	string	否	否	职等编码 示例：2221233
positionCode	string	否	否	岗位编码 示例：432
locationCode	string	否	否	工作地点编码 示例：54322
current	boolean	否	否	是否当前保存数据（区别于历史职位数据，历史数据如果传true，会造成校验不准确）：是true 否 false 示例：true 默认值：false

## 3. 请求示例

Url: /yonbip/hrcloud/recruitCheckCount?access_token=访问令牌
Body: {
	"startDate": "2024-02-27",
	"recruitPostList": [
		{
			"recruitNum": 5,
			"id": "1233444",
			"code": "23444444",
			"orgId": "23456222",
			"deptId": "231233",
			"personCategoryCode": "22323828",
			"empFormCode": "34533",
			"degreeCode": "34322267",
			"educationCode": "1733638775847780352",
			"jobrankCode": "54666",
			"jobgradeCode": "2221233",
			"positionCode": "432",
			"locationCode": "54322",
			"current": true
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
code	string	否	返回码 示例：200
message	string	否	返回提示信息
data	object	否	编制校验返回数据
code	number
小数位数:0,最大长度:10	否	返回码
msg	string	否	返回信息
detail	string	否	编制校验提示信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": 0,
		"msg": "",
		"detail": ""
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
暂时没有数据哦~

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

