---
title: "加班申请单信息查询"
apiId: "abcd"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "O/T Application"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, O/T Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 加班申请单信息查询

>  请求方式	POST | O/T Application (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/overtime/queryOvertimeByStaffid
请求方式	POST
ContentType	application/x-www-form-urlencoded
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
userId	string	header	是	登录用户id，可在员工信息节点查询到    示例: 68b469ea-e687-4c05-a527-5c13376f62b5
staffId	string	query	是	人员id不能为空，可在假勤档案节点查询到    示例: 1614085268780875784
begindate	DateTime	query	否	开始日期，只有年月日    示例: 2022-12-01
enddate	DateTime	query	否	截止日期，只有年月日    示例: 2022-12-31
pageSize	int	query	否	每页大小 不传默认10    示例: 10

## 3. 请求示例

Url: /yonbip/hrcloud/time/overtime/queryOvertimeByStaffid?access_token=访问令牌&staffId=1614085268780875784&begindate=2022-12-01&enddate=2022-12-31&pageSize=10
Header: 
	userId : "68b469ea-e687-4c05-a527-5c13376f62b5"

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
message	string	否	返回信息 示例：操作成功
data	object	否	具体数据
content	object	是	数据列表
pageable	object	否	分页情况
last	boolean	否	是否最后一条,true：最后一条，false：不是 示例：true
totalPages	int	否	总页数 示例：1
totalElements	int	否	总条数 示例：1
first	boolean	否	是否第一条,true：第一条，false：不是第一条 示例：true
numberOfElements	int	否	每页元素数量 示例：1
sort	object	否	排序情况
size	int	否	每页大小 示例：10
number	int	否	页码减一,第一页显示0 示例：0
empty	boolean	否	是否为空,true：为空，false：不为空 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"id": "3079918968557826",
				"ts": 1628662762000,
				"es": 0,
				"pkotmain": "45a9091e4cf141198ee2d98c5ddf8815",
				"pkotori": "1c1889a277bd40d69ca58f3ab88c879f",
				"staffid": "1614085268780875784",
				"orgid": "2274193235318272",
				"deptid": "2274206868640000",
				"staffjobid": "2326721394086144",
				"overtimetypeid": "ogt91cyx10000000babc",
				"applytype": "5",
				"overtimedate": "2021-08-06 00:00:00",
				"isoverday": false,
				"remark": "",
				"reason": "",
				"instanceid": "",
				"billsource": 1,
				"applydate": "2021-08-10 19:56:40",
				"transferflag": 0,
				"iscalculate": false,
				"isallnight": false,
				"otRuleSettleType": "2",
				"otActualSettleType": "0",
				"otTurnRate": "100",
				"staffcode": "A000051",
				"staffname": "13112345679",
				"orgname": "雨彤公司",
				"deptname": "雨彤人力部门",
				"overtimetypename": "公休日加班",
				"overtimebegintime": "2021-08-06 10:13:00",
				"overtimeendtime": "2021-08-06 16:00:00",
				"overtimelen": 5.75,
				"actuallen": 5.75,
				"otsignbegintime": "2021-08-06 10:13:00",
				"otsignendtime": "2021-08-06 16:00:00",
				"billstatus": 4
			}
		],
		"pageable": {
			"sort": {
				"sorted": false,
				"unsorted": true,
				"empty": true
			},
			"pageNumber": 0,
			"pageSize": 10,
			"offset": 0,
			"paged": true,
			"unpaged": false
		},
		"last": true,
		"totalPages": 1,
		"totalElements": 1,
		"first": true,
		"numberOfElements": 1,
		"sort": {
			"sorted": false,
			"unsorted": true,
			"empty": true
		},
		"size": 10,
		"number": 0,
		"empty": false
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
50002	获取用户信息失败	header中增加正确的userId参数
50003	未找到当前用户关联的员工信息	staffId为空并且userId没有关联的人员信息时会出现该错误
50004	开始日期不能晚于结束日期!	开始日期要早于结束日期
50005	参数异常	pageSize大于0的整数
50006	日期格式不符合要求,应为yyyy-MM-dd格式	yyyy-MM-dd格式的日期

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

