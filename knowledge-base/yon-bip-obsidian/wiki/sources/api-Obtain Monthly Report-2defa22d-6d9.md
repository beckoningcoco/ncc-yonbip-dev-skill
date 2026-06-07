---
title: "获取月报"
apiId: "2defa22d-6d99-4153-9903-138dd221e343"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Monthly Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Monthly Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取月报

>  请求方式	GET | Monthly Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/report/getAttendMonthRpt
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
schemeId	string	query	是	假勤方案id，可通过"获取假勤方案"api获取    示例: baafe1f39bed43c9bd9fee91a5d37a67
pageSize	int	query	是	页大小（不能超过100）    示例: 1
year	int	query	是	年份    示例: 2020
pageNum	int	query	是	当前页数    示例: 1
month	int	query	是	月份    示例: 11
staffIds	string	query	否	员工id(多个用英文逗号分割) ，可通过员工信息相关接口获取    示例: 12,23

## 3. 请求示例

Url: /yonbip/hrcloud/time/report/getAttendMonthRpt?access_token=访问令牌&schemeId=baafe1f39bed43c9bd9fee91a5d37a67&pageSize=1&year=2020&pageNum=1&month=11&staffIds=12%2C23

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
message	string	否	提示信息 示例：操作成功
data	object	否	返回结果集
data	object	否	结果集内容
itemdata	object	是	统计项数据
title	object	是	标题

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": {
			"content": [
				{
					"begindate": "2022-12-01 00:00:00",
					"tsyear": "2022",
					"actualworkhours": 0,
					"outcnt": 0,
					"latelong": 0,
					"storeunit": 1,
					"orgId": "1525652227072458756",
					"dr": 0,
					"limittime": 0,
					"isapprove": "0",
					"outsidecnt": 0,
					"absentcount": 6,
					"absenthour": 57,
					"leavecnt": 0,
					"id": "1609102883284844558",
					"pubts": "2022-12-09 02:30:30",
					"tenant": "0000L6YQ8AVLFUZPXD0000",
					"earlylong": 0,
					"workhours": 218.5,
					"staffCode": "AH00000289",
					"tsmonth": "12",
					"deptId": "1525653687361339397",
					"store": 1,
					"isallduty": "0",
					"latecount": 0,
					"actualworkdays": 0,
					"resigncnt": 0,
					"workdays": 23,
					"enddate": "2022-12-31 00:00:00",
					"tripcnt": 0,
					"unnormallen": 57,
					"earlycount": 0,
					"staffId": "1577715176393670657",
					"staffName": "liutaoq",
					"deptName": "皮卡丘",
					"orgName": "宝可梦宇宙aa",
					"staffConfirmState": 0,
					"sendConfirmTime": "",
					"holidayJsDeduc": 0,
					"weekendJsDeduc": 0,
					"workJsDeduc": 0,
					"alreadyDeduc": 0
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
			"numberOfElements": 1,
			"first": true,
			"sort": {
				"sorted": false,
				"unsorted": true,
				"empty": true
			},
			"size": 10,
			"number": 0,
			"empty": false
		},
		"itemdata": [
			{
				"ifLdDecimal": 0,
				"iDataType": 1,
				"pkTimeItem": "3089467133219072",
				"itemCode": "f_n_1",
				"displayOrder": 15,
				"itemMainId": "0000L5GEL0E5DX261G00000000000001",
				"iFromFlag": 3,
				"iDataTypeName": "数值",
				"userId": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"showFlag": "1",
				"isShow": false,
				"reportType": "1",
				"itemName": "员工编号",
				"ifLdWidth": "20",
				"width": "150",
				"itemSource": "0",
				"itemDataCode": "f_n_1",
				"trunType": 0,
				"sortEnable": true,
				"key": "fN1",
				"dataIndex": "fN1",
				"columnKey": "f_n_1",
				"title": "员工编号"
			}
		],
		"title": [
			{
				"ifLdDecimal": 0,
				"iDataType": 2,
				"pkTimeItem": "staffCode",
				"displayOrder": -4,
				"iFromFlag": 3,
				"title": "员工编号",
				"dateItemFormatStr": "",
				"reportType": "1",
				"dataIndex": "fN1",
				"width": 80,
				"fixed": "left",
				"itemSource": "0",
				"sortEnable": true,
				"key": "staffCode"
			}
		]
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

