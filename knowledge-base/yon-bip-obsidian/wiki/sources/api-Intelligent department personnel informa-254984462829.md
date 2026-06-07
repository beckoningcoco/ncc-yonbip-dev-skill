---
title: "智能人员信息管理列表查询"
apiId: "2549844628294074376"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能人员信息管理列表查询

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/staff/translateList
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数，不超过500 示例：20 默认值：10
mobile	string	否	否	手机号 示例：15827777772
name	string	否	否	姓名 示例：赵
email	string	否	否	邮箱
psnclId	string	是	否	员工类别ID 示例：["724d586afe854cee9ac5c39fa31df8a3"]
psnclName	string	是	否	员工类别
postId	string	是	否	岗位ID 示例：["2527392360479850496"]
postName	string	是	否	岗位
code	string	否	否	员工编码 示例：001
orgDepartment	string	是	否	部门ID集合 示例：["1233"]
orgDepartmentName	string	是	否	部门集合
simple	object	否	否	自定义参数
newPostId	string	是	否	职位ID 示例：["2527392360479850496"]
newPostName	string	是	否	职位名称
jobGradeId	string	是	否	职级ID 示例：["2527392360479850496"]
jobGradeName	string	是	否	职级名称
certNo	string	否	否	证件号码
open_joinedDate_begin	date
格式:yyyy-MM-dd	否	否	入职开始日期
open_joinedDate_end	date
格式:yyyy-MM-dd	否	否	入职结束日期
basePostSequenceId	string	是	否	职位序列ID
basePostSequenceName	string	是	否	职位序列名称

## 3. 请求示例

Url: /yonbip/HCC/staff/translateList?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
	"mobile": "15827777772",
	"name": "赵",
	"email": "",
	"psnclId": [
		"724d586afe854cee9ac5c39fa31df8a3"
	],
	"psnclName": [
		""
	],
	"postId": [
		"2527392360479850496"
	],
	"postName": [
		""
	],
	"code": "001",
	"orgDepartment": [
		"1233"
	],
	"orgDepartmentName": [
		""
	],
	"simple": {
		"newPostId": [
			"2527392360479850496"
		],
		"newPostName": [
			""
		],
		"jobGradeId": [
			"2527392360479850496"
		],
		"jobGradeName": [
			""
		],
		"certNo": "",
		"open_joinedDate_begin": "2026-06-07",
		"open_joinedDate_end": "2026-06-07",
		"basePostSequenceId": [
			""
		],
		"basePostSequenceName": [
			""
		]
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页面大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总记录数 示例：1
recordList	object	是	记录列表
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：1
traceId	string	否	追踪ID 示例：deadbaad8a8ef6fc
uploadable	string	否	是否可上传 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"name": "赵一宝",
				"code": "00000001",
				"orgName": "260427预发R6专业版核心人力",
				"deptName": "BM01",
				"joinedDate": "2026-04-27 00:00:00",
				"staffJob_orgPath": "260427预发R6专业版核心人力",
				"staffJob_deptPath": "260427预发R6专业版核心人力/BM01",
				"psnclName": "自有员工",
				"mobile": "+86-15500100010"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "deadbaad8a8ef6fc",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	后端错误,联系开发人员	

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

