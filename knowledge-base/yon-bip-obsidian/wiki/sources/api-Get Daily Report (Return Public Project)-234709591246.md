---
title: "获取日报(返回公共项目)"
apiId: "2347095912467136515"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取日报(返回公共项目)

>  请求方式	POST | Daily Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/report/open-api/report/attendExternal/getAttendDayRptCommon
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
beginDate	date
格式:yyyy-MM-dd	否	是	开始日期 示例：2025-08-01
endDate	date
格式:yyyy-MM-dd	否	是	结束日期（开始时间-结束时间间隔最多为1周） 示例：2025-08-07
pageSize	number
小数位数:2,最大长度:10	否	是	页大小，最大1000 示例：1
pageNum	number
小数位数:2,最大长度:10	否	是	当前页数 示例：1
staffIds	string	否	否	员工id(多个用英文逗号分割) ，来源是员工信息相关接口。（schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds 六选一必填，同时传值时取交集） 示例：12,23
staffCodes	string	否	否	员工编号(多个用英文逗号分割) ，来源是员工信息相关接口。（schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds六选一必填，同时传值时取交集） 示例：000001
userIds	string	否	否	用户id(多个用英文逗号分割)。（schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds六选一必填，同时传值时取交集） 示例：8680debb-e1f3-474a-9140-5a65914f82f3
deptIds	string	否	否	部门id(多个用英文逗号分割)。（schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds六选一必填，同时传值时取交集） 示例：12,23
orgIds	string	否	否	组织id(多个用英文逗号分割)。（schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds六选一必填，同时传值时取交集） 示例：12,23
schemeIds	string	否	否	假勤方案id，可通过"获取假勤方案"api获取 （schemeIds、staffIds、staffCodes、userIds、orgIds、deptIds 六选一必填，同时传值时取交集）。 示例：baafe1f39bed43c9bd9fee91a5d37a67
isShowOrgCode	boolean	否	否	是否查询组织部门编码 示例：true

## 3. 请求示例

Url: /yonbip/HCC/time/report/open-api/report/attendExternal/getAttendDayRptCommon?access_token=访问令牌
Body: {
	"beginDate": "2025-08-01",
	"endDate": "2025-08-07",
	"pageSize": 1,
	"pageNum": 1,
	"staffIds": "12,23",
	"staffCodes": "000001",
	"userIds": "8680debb-e1f3-474a-9140-5a65914f82f3",
	"deptIds": "12,23",
	"orgIds": "12,23",
	"schemeIds": "baafe1f39bed43c9bd9fee91a5d37a67",
	"isShowOrgCode": true
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	返回结果集
data	object	否	结果集内容
title	object	是	标题

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": {
			"content": [
				{
					"calendar": "2025-08-07 00:00:00",
					"actualworkhours": 0,
					"outcnt": 0,
					"latelong": 0,
					"storeunit": 1,
					"orgId": "123",
					"dr": 0,
					"isapprove": "0",
					"isabsent": "0",
					"isleave": "0",
					"isnormal": "1",
					"isoutside": "",
					"absentcount": 0,
					"absenthour": 0,
					"leavecnt": 0,
					"monthRptContributionLen": 0,
					"id": "1609102883284844558",
					"pubts": "2025-12-09 02:30:30",
					"tenant": "0000L6YQ8AVLFUZPXD0000",
					"earlylong": 0,
					"workhours": 218.5,
					"staffCode": "AH00000289",
					"shiftId": "123",
					"shiftName": "常白班",
					"ruleId": "123",
					"deptId": "1525653687361339397",
					"store": 1,
					"latecount": 0,
					"actualworkdays": 0,
					"resigncnt": 0,
					"workdays": 23,
					"tripcnt": 0,
					"outsidecount": 0,
					"unnormallen": 57,
					"earlycount": 0,
					"staffId": "123123",
					"staffName": "张三",
					"orgCode": "111",
					"orgName": "生产组织",
					"deptCode": "222",
					"deptName": "生产部门"
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
		"title": [
			{
				"key": "staffCode",
				"name": "员工编号",
				"iDataType": "0",
				"iDataTypeName": "整型",
				"unit": "1",
				"unitName": "小时"
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
401	staffCodes,staffIds,userIds,schemeIds,orgIds,deptIds中至少传入一项	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-03	
更新
请求说明
更新
请求参数 staffCodes
新增
返回参数 (8)
更新
返回参数 (67)
删除
返回参数 (14)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

