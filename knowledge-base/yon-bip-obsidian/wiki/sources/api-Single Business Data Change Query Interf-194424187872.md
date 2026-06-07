---
title: "单条业务数据变更查询接口V2"
apiId: "1944241878722936832"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Audit Log - Business Log"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Audit Log - Business Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 单条业务数据变更查询接口V2

>  请求方式	GET | Audit Log - Business Log (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/log-pub/business/rest/search/historyList
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
busiObjId	string	query	否	业务对象id(必填)
busiObjCode	string	query	否	业务对象编码
busiObjTypeCode	string	query	否	业务类型编码
struct	string	query	否	默认-1（全部数据），1、UI元数据接入 2、业务对象接入
page	number
小数位数:0,最大长度:4	query	否	当前页（从0开始）
pageSize	number
小数位数:0,最大长度:4	query	否	页面最大条数（默认值为10条）

## 3. 请求示例

Url: /yonbip/digitalModel/log-pub/business/rest/search/historyList?access_token=访问令牌&busiObjId=&busiObjCode=&busiObjTypeCode=&struct=&page=&pageSize=

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
code	string	否	状态码
data	object	是	data
data	object	否	数据体
status	string	否	状态
displayCode	string	否	异常码
level	number
小数位数:2,最大长度:10	否	异常等级

## 5. 正确返回示例

{
	"code": "",
	"data": [
		{
			"data": {
				"secretName": "",
				"docSecretName": "",
				"countrySecretCode": "",
				"countrySecretName": "",
				"businessSecretCode": "",
				"businessSecretName": "",
				"orgId": "",
				"orgName": "",
				"deptId": "",
				"deptName": "",
				"identity": "",
				"caepOrg": "",
				"caepRole": "",
				"token": "bttSVQyQ0Ryd3JzQTZIVmhEWGhmMHRzdEJOVGtZNGdxMk50M0dMWHdhT01ka0gzdG9zN2VzbmxaTkpEQ1pKUlhUMl9fYmlwLXRlc3QueW9ueW91Y2xvdWQuY29t__1bd1883da6131a90e8a1d2fe67ac2d13_1709263203829TG9f86d081TGdccore0iuap-apcom-workbench166b7e06YT",
				"businessId": "b24b2d21-6a24-42e1-89d5-506d2d66e0a3",
				"mdId": "",
				"mdUri": "",
				"busiObjTypeCode": "",
				"busiObjTypeName": "取消管理员",
				"busiObjTypeName2": "",
				"busiObjTypeName3": "",
				"defaultBusiObjTypeName": "",
				"busiObjId": "e43ba3e6-cb93-40e5-8042-e0d35065c0df",
				"busiObjCode": "YHT-239-4871705563275552",
				"busiObjName": "周鹏",
				"newBusiObj": "",
				"operCode": "",
				"operationName": "取消管理员",
				"operationName4Select": "取消管理员",
				"detail": "管理员在2024-03-01 11:32:32对取消管理员:YHT-239-4871705563275552(周鹏)进行了取消管理员",
				"operator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"operatorName": "管理员",
				"operationDate": "2024-03-01 11:32:32",
				"tenantId": "0000L6YQ8AVLFUZPXD0000",
				"sysId": "",
				"ip": "10.6.229.66",
				"operResult": "success",
				"ts": "2024-03-01 11:32:32",
				"operDateForExport": "",
				"struct": 2,
				"domain": "",
				"serviceCode": "GZTACT017",
				"serviceName": "用户",
				"serviceName2": "user",
				"serviceName3": "用戶",
				"serviceName4": "",
				"applicationCode": "GZTACT",
				"applicationName": "权限管理",
				"applicationName2": "Authorization",
				"applicationName3": "權限管理",
				"applicationName4": "",
				"labelCode": "PF",
				"labelName": "数字化建模",
				"labelName2": "Digital Modeling",
				"labelName3": "數字化建模",
				"labelName4": "",
				"compress": 0,
				"csUriStem": "",
				"csRefer": "",
				"csVersion": "",
				"serverIp": "",
				"serverPort": "",
				"deviceInfo": "",
				"dataLevel": "",
				"businessIdentity": "",
				"defaultOperationName": "",
				"errorFlag": 0,
				"errorContent": "",
				"id": "b24b2d21-6a24-42e1-89d5-506d2d66e0a3",
				"differentMsg": "",
				"ytenantId": "0000L6YQ8AVLFUZPXD0000"
			},
			"status": ""
		}
	],
	"displayCode": "",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
status	0	状态值
msg	查询业务日志失败	
errorCode	000000	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-26	
新增
返回参数 (74)
更新
返回参数 displayCode
更新
返回参数 level
删除
返回参数 (72)
	2	2025-06-30	
更新
请求说明
新增
返回参数 displayCode
新增
返回参数 level
更新
返回参数 (37)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

