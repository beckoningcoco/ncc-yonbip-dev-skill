---
title: "获取人员及其最新任职信息"
apiId: "00e6056d512e47f6bc794e1bc32523d4"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取人员及其最新任职信息

>  请求方式	GET | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getStaff
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ids	string	query	是	人员ids，支持查询多个人员已英文逗号隔开    示例: 462431984637128041783
withJob	boolean	query	否	是否查询最新任职（true查询，false不查询，默认为true）    示例: true

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/getStaff?access_token=访问令牌&ids=462431984637128041783&withJob=true

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
message	string	否	操作结果 示例：查询成功
data	object	是	数据
_md	string	否	元数据 示例：staff
cert_type	string	否	证件类型 示例：0002-e756-4390-8c50-251e26b06594
code	string	否	员工编码 示例：A13600009112
enable	long	否	是否启用 示例：1
tenantid	string	否	租户ID 示例：co0eyvdu
id	string	否	ID 示例：1961577933574590
creator	string	否	创建人 示例：b6513bef-1273-48e9-a065-826112bf6769
cert_no	string	否	证件号码 示例：13600009112
sysid	string	否	产品线标识 示例：diwork
mobile	string	否	手机号 示例：13600009112
shortname	string	否	简称 示例：l13600009112
user_id	string	否	用户ID 示例：595581ef-2f1f-4fc9-9142-c7b35d698ef7
org_id	string	否	部门ID 示例：1815496398098688
name	string	否	姓名 示例：刘13600009112
creationtime	long	否	创建时间 示例：1602925216000
dr	long	否	逻辑删除标识 示例：0
entityFullName	string	否	元数据类名 示例：com.yonyou.hrcloud.staff.model.Staff
entityMetaDefinedName	string	否	元数据定义 示例：staff
entityNameSpace	string	否	元数据空间名 示例：hrcloud
es	long	否	es标识 示例：0
integrity	long	否	数值 示例：0
staff_job	object	是	人员任职信息
ts	long	否	时间戳 示例：1602925526954

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"_md": "staff",
			"cert_type": "0002-e756-4390-8c50-251e26b06594",
			"code": "A13600009112",
			"enable": 1,
			"tenantid": "co0eyvdu",
			"id": "1961577933574590",
			"creator": "b6513bef-1273-48e9-a065-826112bf6769",
			"cert_no": "13600009112",
			"sysid": "diwork",
			"mobile": "13600009112",
			"shortname": "l13600009112",
			"user_id": "595581ef-2f1f-4fc9-9142-c7b35d698ef7",
			"org_id": "1815496398098688",
			"name": "刘13600009112",
			"creationtime": 1602925216000,
			"dr": 0,
			"entityFullName": "com.yonyou.hrcloud.staff.model.Staff",
			"entityMetaDefinedName": "staff",
			"entityNameSpace": "hrcloud",
			"es": 0,
			"integrity": 0,
			"staff_job": [
				{
					"_md": "staff_job",
					"begindate": 1577808000000,
					"modifier": "b6513bef-1273-48e9-a065-826112bf6769",
					"deptid": "1815496398098688",
					"lastflag": true,
					"trnsevent": 1,
					"modifiedtime": 1602925216000,
					"tenantid": "co0eyvdu",
					"id": "00056a0e474541b894cc0abc30369f40",
					"staffFte": "100%",
					"showorder": 9999999,
					"creator": "b6513bef-1273-48e9-a065-826112bf6769",
					"recordnum": 0,
					"orgid": "1812832506745088",
					"assgid": 1,
					"orgrelid": "b396d5e9a4d1435995a8e55141d18d85",
					"trnstype": "co0eyvdu0000000000002",
					"creationtime": 1602925216000,
					"ismainjob": true,
					"psnclid": "1957497983275264",
					"endflag": false,
					"dr": 0,
					"entityFullName": "com.yonyou.hrcloud.staff.model.StaffJob",
					"entityMetaDefinedName": "staff_job",
					"entityNameSpace": "hrcloud",
					"es": 0,
					"extJSON": {},
					"staffId": "1961577933574590",
					"staff_id": "1961577933574590",
					"ts": 1607567304000,
					"isweaken": false,
					"effectiveNumber": "0",
					"staffjobCode": "ASG001",
					"staffjobId": "1961577933574590"
				}
			],
			"ts": 1602925526954
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-12	
新增
返回参数 (27)
更新
返回参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

