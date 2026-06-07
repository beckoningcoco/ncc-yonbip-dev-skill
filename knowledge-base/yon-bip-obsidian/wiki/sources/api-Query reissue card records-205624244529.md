---
title: "查询补卡记录"
apiId: "2056242445294239753"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Processing Application Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Processing Application Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询补卡记录

>  请求方式	POST | Processing Application Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/fillAttendance/queryBill
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
staffId	string	是	否	员工id集合（申请员工id（可通过员工信息相关接口获取） 示例：["1921194663303708703"]
staffCode	string	是	否	员工编码集合（申请员工编码（可通过员工信息相关接口获取） 示例：["00000010","00000011"]
orgId	string	是	否	组织id集合 示例：["1921174425419907080"]
deptId	string	是	否	部门id集合 示例：["1921174983782432771"]
submitDate	string	否	否	提交日期范围 示例：2024-07-01|2024-07-31
auditDate	string	否	否	审批日期范围 示例：2024-07-01|2024-07-31
fillDate	string	否	否	补卡日期范围 示例：2024-07-01|2024-07-31
approveStatus	string	是	否	审批状态集合 示例：[1]
pageSize	number
小数位数:-1,最大长度:2	否	否	页大小（不能超过100） 示例：100 默认值：100
pageIndex	number
小数位数:0,最大长度:10	否	否	页码 示例：1 默认值：1

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/fillAttendance/queryBill?access_token=访问令牌
Body: {
	"staffId": [
		"1921194663303708703"
	],
	"staffCode": [
		"00000010",
		"00000011"
	],
	"orgId": [
		"1921174425419907080"
	],
	"deptId": [
		"1921174983782432771"
	],
	"submitDate": "2024-07-01|2024-07-31",
	"auditDate": "2024-07-01|2024-07-31",
	"fillDate": "2024-07-01|2024-07-31",
	"approveStatus": [
		1
	],
	"pageSize": 100,
	"pageIndex": 1
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
content	object	否	结果集内容
pageable	object	否	分页实体
last	boolean	否	是否最后一页 示例：false
totalElements	number
小数位数:0,最大长度:10	否	总数居条数 示例：1000
totalPages	number
小数位数:0,最大长度:10	否	总页数 示例：10
first	boolean	否	是否第一页 示例：true
numberOfElements	number
小数位数:0,最大长度:10	否	当前页数据条数 示例：100
size	number
小数位数:0,最大长度:10	否	每页数据条数 示例：100
number	number
小数位数:0,最大长度:10	否	页码 示例：1
empty	boolean	否	是否为空 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": {
			"approveStatus": 4,
			"deptName": "test部门",
			"staffCode": "00001",
			"orgName": "test组织",
			"deptId": "1921174983782432771",
			"orgId": "1921174425419907080",
			"fillTypeId": "2019932053011169280",
			"fillDate": "2024-06-27",
			"submitTime": "2024-07-01 09:27:25",
			"auditTime": "2024-07-01 09:27:25",
			"staffName": "test员工",
			"fillTypeName": "漏打卡",
			"fillReason": "漏打卡",
			"id": "2032354867987611655",
			"fillTime": "2024-06-27 17:30:00",
			"mainId": "2032354867987611654",
			"staffId": "1921194663303708703"
		},
		"pageable": {
			"pageSize": 100,
			"pageNumber": 1,
			"offset": 0,
			"paged": true,
			"unpaged": false
		},
		"last": false,
		"totalElements": 1000,
		"totalPages": 10,
		"first": true,
		"numberOfElements": 100,
		"size": 100,
		"number": 1,
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-02	
新增
请求参数 staffCode
	2	2025-12-15	
更新
请求说明
新增
请求参数 auditDate
新增
返回参数 auditTime
新增审批日期范围查询参数和审批日期结果返回

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

