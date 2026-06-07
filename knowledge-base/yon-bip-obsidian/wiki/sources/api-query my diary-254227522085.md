---
title: "查询可见汇报模板列表"
apiId: "2542275220854538250"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Work Report"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询可见汇报模板列表

>  请求方式	GET | Work Report (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/oa-logger/template/v2/list
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/SCCC/oa-logger/template/v2/list?access_token=访问令牌

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
小数位数:0,最大长度:10	否	响应状态码 示例：0
data	object	否	响应数据
list	object	是	模板列表
totalCount	number
小数位数:0,最大长度:10	否	总数量 示例：1

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"list": [
			{
				"id": "templateId",
				"commonObjectId": "templateId",
				"createTime": 1710000000000,
				"updateTime": 1710000000000,
				"ytenantid": "tenantId",
				"commonUserId": "commonUserId",
				"commonTenantId": "commonTenantId",
				"commonOrgIds": [
					"commonOrgId"
				],
				"title": "模板名称",
				"userName": "创建人名称",
				"orgPublic": true,
				"content": "模板内容",
				"describe": "模板描述",
				"version": "1710000000000",
				"visibleRangeReadonly": 0,
				"diaryTimeStatus": 0,
				"diaryTimeDefault": 1,
				"diaryTimeRequired": 1,
				"diaryTimeType": 1,
				"requiredLocation": 0,
				"operateLogs": [
					{
						"commonUserId": "operatorUserId",
						"operateDesc": "操作描述",
						"actionType": "ADD",
						"createTime": 1710000000000
					}
				],
				"makeUpType": "UNLIMITED",
				"makeUpDays": 0,
				"makeUpHours": 0,
				"holidayMode": false,
				"thirdSourceType": [
					"CRM"
				],
				"onlyCurrentPosition": false,
				"reportObjectTypes": [
					"DEPT",
					"DEPARTMENT_MANAGER",
					"FIXED_RANGE",
					"CUSTOMIZE_RANGE",
					"CHARGE_LEADER"
				],
				"enableDepartmentManager": false,
				"fixedDiaryRange": false,
				"visibleRangeStr": "[{\"dataType\":1,\"teamId\":\"deptId\",\"teamName\":\"部门\"}]",
				"diaryRangeStr": "[{\"dataType\":1,\"teamId\":\"deptId\",\"teamName\":\"部门\"}]",
				"copy": false,
				"templateVisibleRange": [
					{
						"dataType": 1,
						"commonUserId": "commonUserId",
						"commonTenantId": "commonTenantId",
						"commonTenantName": "租户名称",
						"teamId": "deptOrGroupId",
						"teamName": "部门或群组名称",
						"userName": "用户名称",
						"avatar": "avatarUrl",
						"commonObjectId": "objectId",
						"objectName": "对象名称",
						"createTime": "2026-05-11T10:00:00.000+00:00",
						"visibleType": 0,
						"dataFlag": 0
					}
				],
				"diaryRange": [
					{
						"dataType": 1,
						"commonUserId": "commonUserId",
						"commonTenantId": "commonTenantId",
						"commonTenantName": "租户名称",
						"teamId": "deptOrGroupId",
						"teamName": "部门或群组名称",
						"userName": "用户名称",
						"avatar": "avatarUrl",
						"commonObjectId": "objectId",
						"objectName": "对象名称",
						"createTime": "2026-05-11T10:00:00.000+00:00",
						"visibleType": 0,
						"dataFlag": 0
					}
				],
				"verifiers": [
					{
						"commonTenantId": "commonTenantId",
						"commonUserId": "commonUserId",
						"commonObjectId": "commonObjectId",
						"name": "用户名称",
						"userName": "用户名称",
						"sex": "sex",
						"deptName": "部门名称",
						"email": "user@example.com",
						"mobile": "13800000000",
						"birthday": "1990-01-01",
						"commonOrgId": "commonOrgId",
						"orgName": "组织名称",
						"commonDeptId": "commonDeptId",
						"duty": "职务",
						"avatar": "avatarUrl",
						"isAllowRemind": true
					}
				],
				"orgs": [
					{
						"commonDeptId": "commonDeptId",
						"commonTenantId": "commonTenantId",
						"deptName": "部门名称",
						"parentId": "parentDeptId",
						"createTime": "2026-05-11T10:00:00.000+00:00",
						"updateTime": "2026-05-11T10:00:00.000+00:00",
						"leaderUserId": "leaderUserId",
						"haveSub": true,
						"parentPath": "parent1,parent2",
						"type": "0"
					}
				],
				"dataType": 1,
				"recordStatus": 0,
				"dataStatus": 1,
				"visibleRange": 1,
				"messageSenders": [
					"commonUserId"
				],
				"enableEdit": true,
				"enableDelete": true,
				"templateAdmin": [
					{
						"commonTenantId": "commonTenantId",
						"commonUserId": "commonUserId",
						"commonObjectId": "commonObjectId",
						"name": "用户名称",
						"userName": "用户名称",
						"sex": "sex",
						"deptName": "部门名称",
						"email": "user@example.com",
						"mobile": "13800000000",
						"birthday": "1990-01-01",
						"commonOrgId": "commonOrgId",
						"orgName": "组织名称",
						"commonDeptId": "commonDeptId",
						"duty": "职务",
						"avatar": "avatarUrl",
						"isAllowRemind": true
					}
				],
				"templateAdminStr": "[{\"commonUserId\":\"commonUserId\",\"userName\":\"用户名称\"}]",
				"todo": false,
				"fixRangeNotify": 0
			}
		],
		"totalCount": 1
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

