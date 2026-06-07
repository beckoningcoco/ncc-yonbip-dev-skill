---
title: "获取当日日报"
apiId: "176d05d4c8244f29871a85dd52ea2a33"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Daily Report Today"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Report Today]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取当日日报

>  请求方式	GET | Daily Report Today (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/report/getAttendTodayRpt
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageSize	int	query	是	页大小（不能超过100）    示例: 10    默认值: 10
deptId	string	query	否	部门ID，可通过组织部门相关接口获取    示例: baafe1f39bed43c9bd9fee91a5d37a67
pageNum	int	query	是	当前页数    示例: 1    默认值: 1

## 3. 请求示例

Url: /yonbip/hrcloud/time/report/getAttendTodayRpt?access_token=访问令牌&pageSize=10&deptId=baafe1f39bed43c9bd9fee91a5d37a67&pageNum=1

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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回结果集
content	object	是	结果集内容
pageable	object	否	分页实体
totalElements	long	否	总数据条数 示例：50
totalPages	long	否	总页数 示例：5
last	boolean	否	是否是最后一页，true：是，false：否 示例：false
numberOfElements	long	否	当前页数据条数 示例：10
sort	object	否	排序实体
first	boolean	否	是否第一页，true：是，false：否 示例：true
size	long	否	每页数据条数 示例：10
number	long	否	页码 示例：0
empty	boolean	否	为空 true：是，false：否 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"calendar": "2022-12-03 00:00:00",
				"deptId": "2219236394995968",
				"deptName": "123",
				"earlycount": 0,
				"id": "7a0529287a5848858c61dc470fa8b411",
				"isabsent": "0",
				"isapprove": "0",
				"isearly": "0",
				"islater": "0",
				"isnormal": "1",
				"orgId": "2217445630218752",
				"orgName": "一点点全职能",
				"shiftId": "2e2ac8594fec495c8c3baf950e505186",
				"shiftName": "【特殊】固定跨夜2【19:00~12:00】",
				"staffCode": "A000003",
				"staffId": "2230832810103040",
				"staffName": "111",
				"pubts": "2022-12-27 00:20:43",
				"workdays": 1,
				"workhours": 11,
				"turnleavelen": 0,
				"ruleid": "2e32224fec495c8c3baf950e505186",
				"tenant": "0000L6YQ8AVLFUZPXD0000",
				"dr": 0
			}
		],
		"pageable": {
			"sort": {
				"unsorted": true,
				"sorted": false,
				"empty": true
			},
			"pageSize": 10,
			"pageNumber": 0,
			"offset": 0,
			"paged": true,
			"unpaged": false
		},
		"totalElements": 50,
		"totalPages": 5,
		"last": false,
		"numberOfElements": 10,
		"sort": {
			"unsorted": true,
			"sorted": false,
			"empty": true
		},
		"first": true,
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
310078	后端接口响应超时，请稍后重试！	确认租户信息重试

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

