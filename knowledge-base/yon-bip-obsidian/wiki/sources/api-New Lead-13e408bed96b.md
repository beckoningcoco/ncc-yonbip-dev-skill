---
title: "线索新增"
apiId: "13e408bed96b414193c6887416a7fb22"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lead"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 线索新增

>  请求方式	POST | Lead (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/save
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
billnum	string	否	是	单据编号 示例：sfa_cluecard
data	object	否	是	线索新增数据
systemSource	string	否	是	系统来源,外系统必填 示例：mk
code	string	否	是	线索编码，mk系统id字段 示例：1234567898765
name	string	否	是	线索名称，不可重复 示例：线索名称1111
source_code	string	否	是	线索来源编码，需要在平台基础档案中配置 示例：advertisement_1
status	string	否	否	0-待分配，1-跟进中，2-已转化，3-已关闭；没填默认是 1 示例：0
clueType_code	string	否	是	线索交易类型编码，须在crm中配置特定交易类型 示例：mk
contactPerson	string	否	否	联系人 示例：杨鹏达
contactDept	string	否	否	任职部门 示例：crm
jobTitle	string	否	否	职务 示例：hr
companyName	string	否	否	公司名称 示例：xxx公司
clueHighSeas_code	string	否	否	所属公海编码，为线索指定了公海池、又指定了销售组织/负责人/部门/销售区域的，优先把线索放入公海。 （1）指定的公海池设有业务归属的（即指定了公海的销售组织、部门、销售区域），线索进入公海时会把公海的销售组织、部门、销售区域填写到线索的销售组织、部门、销售区域中。 （2）指定的公海池未设业务归属的，线索进入公海时会把销售组织/负责人/部门/销售区域清空。 示例：公海001
natureOfTheEnterprise_code	string	否	否	企业性质编码 示例：2095908506555648
industry_code	string	否	否	行业编码 示例：2095907552137472
employeeCount	long	否	否	员工数 示例：12256
annualTurnover	long	否	否	年营业额 示例：1234
nationalPhone	string	否	否	国际化手机号 示例：+86-17866505921
cellPhone	string	否	否	手机 示例：18435168295
phone	string	否	否	电话 示例：123456
qq	string	否	否	qq 示例：12345
wechat	string	否	否	微信 示例：ghjk
mailbox	string	否	否	邮箱 示例：vsjdbjk@qq.com
url	string	否	否	网址 示例：wertyuikjh.com
country_code	string	否	否	国家编码 示例：chn
regionCode	string	否	否	行政区划 示例：130404000000
address	string	否	否	详细地址 示例：北京市海淀区西北旺镇丰贤中路永丰产业园
ower_code	string	否	否	负责人编码 示例：ower01
activity	string	否	否	营销活动；支持id或者code传入；该字段传入后会在线索表头显示营销活动名称，不会在线索营销活动相关对象有营销活动数据。 示例：营销活动的id或者code
dept_code	string	否	否	部门编码 示例：销管部门
saleArea_code	string	否	否	销售区域编码 示例：销售区域2
org_code	string	否	是	销售组织编码，需在平台配置销售组织 示例：org01
creatorId	string	否	否	创建人id 示例：2321312
assignor_code	string	否	否	分配人编码 示例：assignor01
description	string	否	否	描述 示例：红红火火恍恍惚惚或或或或或或或或或或或或或或或或或或或或或或
_status	string	否	是	Insert,此接口为保存接口，必填Insert 示例：Insert 默认值：Insert
subList	object	是	否	线索子表新增数据

## 3. 请求示例

Url: /yonbip/crm/bill/save?access_token=访问令牌
Body: {
	"billnum": "sfa_cluecard",
	"data": {
		"systemSource": "mk",
		"code": "1234567898765",
		"name": "线索名称1111",
		"source_code": "advertisement_1",
		"status": "0",
		"clueType_code": "mk",
		"contactPerson": "杨鹏达",
		"contactDept": "crm",
		"jobTitle": "hr",
		"companyName": "xxx公司",
		"clueHighSeas_code": "公海001",
		"natureOfTheEnterprise_code": "2095908506555648",
		"industry_code": "2095907552137472",
		"employeeCount": 12256,
		"annualTurnover": 1234,
		"nationalPhone": "+86-17866505921",
		"cellPhone": "18435168295",
		"phone": "123456",
		"qq": "12345",
		"wechat": "ghjk",
		"mailbox": "vsjdbjk@qq.com",
		"url": "wertyuikjh.com",
		"country_code": "chn",
		"regionCode": "130404000000",
		"address": "北京市海淀区西北旺镇丰贤中路永丰产业园",
		"ower_code": "ower01",
		"activity": "营销活动的id或者code",
		"dept_code": "销管部门",
		"saleArea_code": "销售区域2",
		"org_code": "org01",
		"creatorId": "2321312",
		"assignor_code": "assignor01",
		"description": "红红火火恍恍惚惚或或或或或或或或或或或或或或或或或或或或或或",
		"_status": "Insert",
		"subList": [
			{
				"materials": "2063715799929454596",
				"materialClass": "1604380498125858",
				"productClass": "160438049812185757",
				"brand": "1978502841332924425",
				"productLine": "1618534202067124226",
				"salesUnit": "1492246942088429580",
				"quantity": 10,
				"remarks": "子表备注",
				"_status": "Insert"
			}
		]
	}
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	long	否	返回编码，200为保存成功，999为保存失败 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	线索相应保存信息
code	string	否	线索编码 示例：00000销售区域202336
name	string	否	线索名称 示例：线索名称1111
source_code	string	否	线索来源编码 示例：advertisement_1
source	long	否	线索来源id 示例：2094828346708226
source_name	string	否	线索来源名称 示例：广告
status	long	否	线索状态，0：待分配，1：跟进中，2：已转化，3：已关闭 示例：0
clueType	long	否	线索类型ID 示例：2217782890795264
clueType_transType	string	否	交易类型ID 示例：2217782287880448
clueType_name	string	否	线索类型 示例：网络线索
contactPerson	string	否	联系人 示例：杨鹏达
contactDept	string	否	任职部门 示例：crm
jobTitle	string	否	职务 示例：hr
companyName	string	否	公司名称 示例：xxx公司
natureOfTheEnterprise	string	否	企业性质ID 示例：2095908506555648
natureOfTheEnterprise_name	string	否	企业性质 示例：中外合资
industry	long	否	行业ID 示例：2095907552137472
industry_name	string	否	行业 示例：互联网
employeeCount	string	否	员工数 示例：12256
annualTurnover	string	否	年营业额 示例：1234
nationalPhone	string	否	国际化手机号 示例：+86-17866505921
cellPhone	string	否	手机 示例：18435168295
phone	string	否	电话 示例：123456
qq	string	否	qq 示例：12345
wechat	string	否	微信 示例：ghjk
mailbox	string	否	邮箱 示例：vsjdbjk@qq.com
url	string	否	网址 示例：wertyuikjh.com
country	string	否	国家ID 示例：6cefdb2b-180f-4ba5-8710-fa5a27a108bb
country_name	string	否	国家 示例：阿联酋
regionCode	string	否	注册地区编码 示例：130404000000
address	string	否	详细地址 示例：北京市海淀区西北旺镇丰贤中路永丰产业园
ower	string	否	负责人ID 示例：2095941795828736
ower_name	string	否	负责人 示例：刘灿
dept	string	否	部门ID 示例：2095882496889088
dept_name	string	否	部门 示例：销管部门
saleArea	long	否	销售区域ID 示例：2176956696400128
saleArea_name	string	否	销售区域 示例：销售区域2
saleArea_code	string	否	销售区域code 示例：销售区域2
org	string	否	销售组织ID 示例：2095880010126336
org_name	string	否	销售组织 示例：集团
description	string	否	描述 示例：红红火火恍恍惚惚
creator	string	否	创建人名称 示例：刘灿
assignor_code	string	否	分配人编码 示例：00000001
assignor	string	否	分配人id 示例：1232132
id	long	否	此线索id 示例：2284203307962624
tenant	long	否	租户id 示例：2095650430619904
subList	object	否	线索子表新增数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "00000销售区域202336",
		"name": "线索名称1111",
		"source_code": "advertisement_1",
		"source": 2094828346708226,
		"source_name": "广告",
		"status": 0,
		"clueType": 2217782890795264,
		"clueType_transType": "2217782287880448",
		"clueType_name": "网络线索",
		"contactPerson": "杨鹏达",
		"contactDept": "crm",
		"jobTitle": "hr",
		"companyName": "xxx公司",
		"natureOfTheEnterprise": "2095908506555648",
		"natureOfTheEnterprise_name": "中外合资",
		"industry": 2095907552137472,
		"industry_name": "互联网",
		"employeeCount": "12256",
		"annualTurnover": "1234",
		"nationalPhone": "+86-17866505921",
		"cellPhone": "18435168295",
		"phone": "123456",
		"qq": "12345",
		"wechat": "ghjk",
		"mailbox": "vsjdbjk@qq.com",
		"url": "wertyuikjh.com",
		"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
		"country_name": "阿联酋",
		"regionCode": "130404000000",
		"address": "北京市海淀区西北旺镇丰贤中路永丰产业园",
		"ower": "2095941795828736",
		"ower_name": "刘灿",
		"dept": "2095882496889088",
		"dept_name": "销管部门",
		"saleArea": 2176956696400128,
		"saleArea_name": "销售区域2",
		"saleArea_code": "销售区域2",
		"org": "2095880010126336",
		"org_name": "集团",
		"description": "红红火火恍恍惚惚",
		"creator": "刘灿",
		"assignor_code": "00000001",
		"assignor": "1232132",
		"id": 2284203307962624,
		"tenant": 2095650430619904,
		"subList": {
			"materials": "2063715799929454596",
			"manageClass": "1604380498125858",
			"productClass": "160438049812185757",
			"brand": "1978502841332924425",
			"productLine": "1618534202067124226",
			"saleUnit": "1492246942088429580",
			"quantity": 10,
			"remarks": "子表备注"
		}
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
999	线索名称 (线索名称1111)已经存在	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-09	
新增
返回参数 nationalPhone
	2	2025-12-23	
新增
请求参数 nationalPhone
更新
请求参数 systemSource
系统来源字段描述更新
	3	2025-07-14	
新增
请求参数 (9)
更新
请求参数 _status
新增
返回参数 (8)
子表code调用报错，改回id
	4	2025-07-01	
新增
请求参数 clueHighSeas_code
子表回滚

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

