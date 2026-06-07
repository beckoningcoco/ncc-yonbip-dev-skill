---
title: "获取日报"
apiId: "c755e8eb-0900-4139-8fbc-28ed0369e021"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Daily Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取日报

>  请求方式	GET | Daily Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/report/open-api/report/attendExternal/getAttendDayRpt
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
endDate	long	query	是	结束时间（毫秒，开始时间结束时间间隔最多为1周）    示例: 1606752000000
schemeId	string	query	是	假勤方案id，可通过"获取假勤方案"api获取    示例: baafe1f39bed43c9bd9fee91a5d37a67
pageSize	int	query	是	页大小（不能超过100）    示例: 1
beginDate	long	query	是	开始时间（毫秒）    示例: 1606752000000
pageNum	int	query	是	当前页数    示例: 1
staffIds	string	query	否	员工id(多个用英文逗号分割) ，来源是员工信息相关接口    示例: 12,23

## 3. 请求示例

Url: /yonbip/hrcloud/time/report/open-api/report/attendExternal/getAttendDayRpt?access_token=访问令牌&endDate=1606752000000&schemeId=baafe1f39bed43c9bd9fee91a5d37a67&pageSize=1&beginDate=1606752000000&pageNum=1&staffIds=12%2C23

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
data	object	否	结果集数据
columns	string	否	不是固定列的考勤项目编码包括显示和不显示的 示例：actualworkhours,actualworkdays,workhours
itemdata	object	是	统计项数据
title	object	是	标题

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": {
			"content": {
				"absenthour": 9,
				"actualworkhours": 0,
				"isabsent": false,
				"pubts": "2022-12-18 00:27:38",
				"tenant": "0000L25J6NPT9USAVJ0000",
				"outcnt": 1,
				"resigncnt": 1,
				"calendar": 1606752000000,
				"deptId": "1827225091838208",
				"deptName": "测试部test",
				"earlylong": "0",
				"id": "c9f779d63d494291a45bc3ad4cd3fdbd",
				"isapprove": false,
				"isnormal": false,
				"isleave": false,
				"isoutside": false,
				"latelong": 0,
				"leavecnt": 0,
				"monthRptContributionLen": 0,
				"orgId": "1735596367876352",
				"orgName": "1002",
				"outsidecount": 0,
				"shiftId": "da1d65dd22314e5ab7c62eef2c33ab4c",
				"shiftName": "日弹",
				"staffCode": "A00191",
				"store": 1,
				"latecount": 1,
				"storeunit": NaN,
				"staffId": "1827316457427200",
				"staffName": "固化12",
				"dr": 0,
				"workdays": 0,
				"actualworkdays": 0,
				"tripcnt": 0,
				"earlycount": 0,
				"attendDetail": "上班1:缺卡;下班1:缺卡;上班2:缺卡;下班2:缺卡;旷工总时长:9.02小时",
				"unnormallen": [
					0
				],
				"ruleid": "3058854253760768",
				"workhours": "9.0",
				"staffConfirmState": 0
			},
			"pageable": {
				"pageSize": 1,
				"pageNumber": 0,
				"offset": 0,
				"unpaged": false,
				"paged": true,
				"sort": {
					"sorted": "true",
					"empty": true,
					"unsorted": false
				}
			},
			"totalElements": 8,
			"totalPages": 8,
			"last": false,
			"sort": {
				"empty": true,
				"sorted": NaN,
				"unsorted": false
			},
			"first": true,
			"numberOfElements": 1,
			"size": 1,
			"number": 0,
			"empty": false
		},
		"columns": "actualworkhours,actualworkdays,workhours",
		"itemdata": [
			{
				"key": "fV1",
				"columnKey": "f_V_1",
				"pkTimeItem": "3039026964304128",
				"itemMainId": "f_v_1",
				"displayOrder": 11,
				"itemCode": "0000L25J6NPT9USAVJ00000000000001",
				"iDataType": "日期型",
				"ifLdDecimal": 2,
				"iFromFlag": "0",
				"reportType": "0",
				"isShow": true,
				"itemName": "123",
				"showFlag": "1",
				"userId": "1111",
				"title": "123",
				"iDataTypeName": "字符型",
				"sortEnable": true,
				"itemDataCode": "staffCode",
				"itemSource": "",
				"width": 0,
				"dataIndex": "staffCode"
			}
		],
		"title": [
			{
				"pkTimeItem": "staffCode",
				"sortIndex": 0,
				"iDataType": "0:整形 1：数值型 2：字符型 3：布尔型 4：日期型",
				"displayOrder": 0,
				"ifLdDecimal": 0,
				"dateItemFormatStr": "2022-11-01",
				"title": "员工编号",
				"itemSource": "0",
				"fixed": "left",
				"width": 10,
				"sortEnable": true,
				"dataIndex": "staffName",
				"reportType": "0",
				"itemCode": "actualworkhours",
				"iFromFlag": "0",
				"userId": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"showFlag": "1",
				"isShow": true,
				"itemMainId": "0000L25J6NPT9USAVJ00000000000001",
				"itemDataCode": "actualworkhours",
				"key": "fV1"
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
401	查询时间间隔最多1周	修改开始结束时间

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

