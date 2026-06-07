---
title: "员工信息列表查询__全球化_上传下发"
apiId: "2138733605805359109"
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

# 员工信息列表查询__全球化_上传下发

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/byd/listforstaff
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pubts	string	否	否	时间戳 示例：2020-11-23 16:11:09
codeList	string	是	否	编码 示例：["001"]
idList	string	是	否	id列表 示例：["111"]
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数,不超过500 示例：12 默认值：10
distributionSite	string	否	否	站点 示例：3232
subInfo	string	否	否	子集集合，逗号分隔，可不填，不填默认所有子集 示例：staffResume,staffCertificate
orgIdList	string	是	否	组织ID 示例：["2131231"]
deptIdList	string	是	否	部门ID 示例：["344543"]
country	string	否	否	国家地区ID 示例：0040be98-735b-44c0-afe5-54d11a96037b
queryObjs	string	否	否	查询条件 示例：[{"field": "字段名","op": "操作符，eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,not_like","val1": "比较值1","val2": "比较值2，只有between这种比较符需要第二个比较值"}] 最大请求量：5

## 3. 请求示例

Url: /yonbip/digitalModel/byd/listforstaff?access_token=访问令牌
Body: {
	"pubts": "2020-11-23 16:11:09",
	"codeList": [
		"001"
	],
	"idList": [
		"111"
	],
	"pageIndex": 1,
	"pageSize": 12,
	"distributionSite": "3232",
	"subInfo": "staffResume,staffCertificate",
	"orgIdList": [
		"2131231"
	],
	"deptIdList": [
		"344543"
	],
	"country": "0040be98-735b-44c0-afe5-54d11a96037b",
	"queryObjs": "[{\"field\": \"字段名\",\"op\": \"操作符，eq,neq,lt,gt,elt,egt,between,in,nin,like,leftlike,rightlike,is_null,is_not_null,not_like\",\"val1\": \"比较值1\",\"val2\": \"比较值2，只有between这种比较符需要第二个比较值\"}]"
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：5
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：323
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：65
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：5
traceId	string	否	traceId 示例：11ee7c538c12c16e
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"recordCount": 323,
		"recordList": [
			{
				"rejectiontimes": 0,
				"certType": "0002-e756-4390-8c50-251e26b06594",
				"code": "011600231",
				"education": "@@@@Z710000000005L5K",
				"sysId": "diwork",
				"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"orgId": "1881903443495878664",
				"dr": 0,
				"joinedDate": "2024-01-09 00:00:00",
				"modifyTime": "2024-01-18 20:03:01",
				"attachlist": "ad29672e-02b9-40f8-a975-521dda1a16d3",
				"enable": 1,
				"objid": "0001A610000000011XSJ",
				"candidateFlag": false,
				"unitId": "1881902223725166607",
				"id": "3643463657148673",
				"psnclId": "3589446263132423",
				"pubts": "2024-01-18 20:03:01",
				"tenant": "0000LE3ZNN0XFI0C970000",
				"creator": "yql_admin",
				"ytenant": "0000LE3ZNN0XFI0C970000",
				"deptId": "1881903443495878664",
				"mobile": "18745809078",
				"degree": "@@@@Z710000000005L6N",
				"userId": "05df2814-dafa-4d64-b9e2-1fd3783501e0",
				"yTenantId": "0000LE3ZNN0XFI0C970000",
				"cadresShoworder": 9999999,
				"certNo": "011600231",
				"staffResume": [
					{
						"extension": "{}",
						"creator": "sync",
						"ytenant": "0000LE3ZNN0XFI0C970000",
						"endDate": "2019-12-31 00:00:00",
						"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"recordNum": 3,
						"dr": 0,
						"yTenantId": "0000LE3ZNN0XFI0C970000",
						"workCorp": "一级组织",
						"beginDate": "2018-01-29 00:00:00",
						"modifyTime": "2024-04-26 13:41:48",
						"createTime": "2024-04-26 13:41:48",
						"workDept": "部门A",
						"id": "1983502690161262633",
						"pubts": "2024-04-26 13:41:47",
						"lastFlag": false,
						"staffId": "3769452216111365",
						"tenant": "0000LE3ZNN0XFI0C970000"
					}
				],
				"staffJob": [
					{
						"isMainJob": true,
						"lastestjob": 1,
						"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"postStatus": "1630252479179390976",
						"endFlag": true,
						"recordNum": 0,
						"orgId": "1881902223725166607",
						"dr": 0,
						"orgRelId": "2054117553170022408",
						"assgId": 1,
						"modifyTime": "2024-07-30 17:12:37",
						"enable": 1,
						"staffFte": "100%",
						"id": "2054117553170022407",
						"psnclId": "3589446263132423",
						"pubts": "2024-07-30 17:12:36",
						"trnsType": "1881903357584474121",
						"isweaken": true,
						"lastFlag": true,
						"tenant": "0000LE3ZNN0XFI0C970000",
						"trnsEvent": 4,
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"deptVid": "1881903443495878664",
						"ytenant": "0000LE3ZNN0XFI0C970000",
						"sysid": "diwork",
						"deptId": "1881903443495878664",
						"staffjobCode": "ASG001",
						"orgVid": "1881902223725166607",
						"yTenantId": "0000LE3ZNN0XFI0C970000",
						"effectiveNumber": 0,
						"beginDate": "2024-03-31 00:00:00",
						"createTime": "2024-07-30 17:12:37",
						"name": "ASG001",
						"showOrder": 9999999,
						"staffjobId": "2054117553170022407",
						"trnsReason": "1881903503610216457",
						"staffId": "3769452216111364"
					}
				],
				"createTime": "2024-01-18 20:02:54",
				"name": "0116员工1",
				"shortName": "0116yg1",
				"staffOrgRel": [
					{
						"isRegular": false,
						"isReturn": false,
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"code": "ER001",
						"staffCode": "10126001",
						"ytenant": "0000LE3ZNN0XFI0C970000",
						"endFlag": false,
						"recordNum": 0,
						"orgId": "1881902223725166607",
						"dr": 0,
						"yTenantId": "0000LE3ZNN0XFI0C970000",
						"secretaryAge": 0.8,
						"beginDate": "2024-01-02 00:00:00",
						"createTime": "2024-01-29 13:47:33",
						"employerVid": "1881902223725166607",
						"employer": "1881902223725166607",
						"id": "1918194697371648003",
						"groupWorkAge": 0,
						"pubts": "2024-10-20 02:55:20",
						"seniorityDate": "2024-01-02 00:00:00",
						"lastFlag": true,
						"staffId": "3658521721639169",
						"tenant": "0000LE3ZNN0XFI0C970000",
						"indocFlag": true
					}
				]
			}
		],
		"pageCount": 65,
		"beginPageIndex": 1,
		"endPageIndex": 5
	},
	"traceId": "11ee7c538c12c16e",
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
	1	2025-07-28	
更新
请求说明
新增
请求参数 queryObjs
	2	2025-06-30	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

