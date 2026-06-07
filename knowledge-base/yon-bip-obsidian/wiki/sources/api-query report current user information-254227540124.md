---
title: "查看工作汇报当前用户信息"
apiId: "2542275401243164678"
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

# 查看工作汇报当前用户信息

>  请求方式	GET | Work Report (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/main/getUserInfo
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

Url: /yonbip/SCCC/main/getUserInfo?access_token=访问令牌

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
avatar	string	否	头像 示例：avatarUrl
userName	string	否	用户名称 示例：用户名称
name	string	否	名称 示例：用户名称
deptName	string	否	部门名称 示例：部门名称
hasRichTxt	boolean	否	是否支持富文本 示例：true
commonDeptId	string	否	公共部门ID 示例：commonDeptId
commonUserId	string	否	公共用户ID 示例：commonUserId
commonTenantId	string	否	公共租户ID 示例：commonTenantId
groupManager	boolean	否	是否群组管理员 示例：false
tenantId	string	否	租户ID 示例：tenantId
yhtUserId	string	否	友互通用户ID 示例：yhtUserId
privateEnv	boolean	否	是否私有化环境 示例：false
dbType	string	否	数据库类型 示例：mysqlFlag
AI	boolean	否	是否启用AI 示例：true
AISummary	boolean	否	是否启用AI总结 示例：true
hasXT	boolean	否	是否启用协同 示例：true
hasAI	boolean	否	是否具备AI能力 示例：true
admin	boolean	否	是否管理员 示例：false
tenantAdmin	boolean	否	是否租户管理员 示例：false
isAdmin	boolean	否	是否管理员 示例：false
diaryManager	boolean	否	是否工作汇报管理员 示例：false
diaryExamer	boolean	否	是否工作汇报审核人 示例：false
isDiwork	boolean	否	是否Diwork用户 示例：true
orgAdmin	boolean	否	是否组织管理员 示例：false
commonOrgId	string	否	公共组织ID 示例：commonOrgId
orgName	string	否	组织名称 示例：组织名称
tenantName	string	否	租户名称 示例：租户名称
deptManager	boolean	否	是否部门负责人 示例：false
showStatistics	number
小数位数:0,最大长度:10	否	是否显示统计 示例：0
showConfig	number
小数位数:0,最大长度:10	否	是否显示配置 示例：0
baseDataType	string	否	基础数据类型 示例：baseDataType
isReminder	boolean	否	是否提醒人 示例：false
isVerifier	boolean	否	是否审核人 示例：false
verifierRange	object	否	审核人范围
reminderRange	object	否	提醒人范围
templateAdmin	boolean	否	是否模板管理员 示例：false
compressRatio	string	否	压缩比例 示例：compressRatio

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"avatar": "avatarUrl",
		"userName": "用户名称",
		"name": "用户名称",
		"deptName": "部门名称",
		"hasRichTxt": true,
		"commonDeptId": "commonDeptId",
		"commonUserId": "commonUserId",
		"commonTenantId": "commonTenantId",
		"groupManager": false,
		"tenantId": "tenantId",
		"yhtUserId": "yhtUserId",
		"privateEnv": false,
		"dbType": "mysqlFlag",
		"AI": true,
		"AISummary": true,
		"hasXT": true,
		"hasAI": true,
		"admin": false,
		"tenantAdmin": false,
		"isAdmin": false,
		"diaryManager": false,
		"diaryExamer": false,
		"isDiwork": true,
		"orgAdmin": false,
		"commonOrgId": "commonOrgId",
		"orgName": "组织名称",
		"tenantName": "租户名称",
		"deptManager": false,
		"showStatistics": 0,
		"showConfig": 0,
		"baseDataType": "baseDataType",
		"isReminder": false,
		"isVerifier": false,
		"verifierRange": {
			"id": "roleId",
			"commonTenantId": "commonTenantId",
			"commonUserId": "commonUserId",
			"type": "VERIFIER"
		},
		"reminderRange": {
			"id": "roleId",
			"commonTenantId": "commonTenantId",
			"commonUserId": "commonUserId",
			"type": "REMINDER"
		},
		"templateAdmin": false,
		"compressRatio": "compressRatio"
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

