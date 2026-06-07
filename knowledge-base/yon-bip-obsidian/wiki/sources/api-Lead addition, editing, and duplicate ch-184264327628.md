---
title: "线索新增编辑查重"
apiId: "1842643276285345793"
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

# 线索新增编辑查重

>  请求方式	POST | Lead (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/cluecheckrepeatddd
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
systemSource	string	否	是	来源标识 示例：mt
action	string	否	是	动作，该值类型字符串，值为browse，不可更改 示例：browse
mainBillNum	string	否	是	单据编码，该值类型字符串，值为sfa_cluecard，不可更改 示例：sfa_cluecard
data	object	否	是	线索查重请求参数，具体使用那个参数根据查重设置而定，这里列出全部支持查重的字段，规则适用条件使用过滤条件时，过滤条件字段必须要作为查重参数传入。
address	string	否	否	详细地址 示例：详细地址
annualTurnover	string	否	否	年营业额 示例：22
nationalPhone	string	否	否	国际化手机号 示例：+86-17866505921
cellPhone	string	否	否	手机 示例：15612349876
clueType	string	否	否	线索类型 示例：3982709
companyName	string	否	否	公司名称 示例：公司名称
contactDept	string	否	否	任职部门 示例：任职部门
contactPerson	string	否	否	联系人 示例：联系人
country	string	否	否	国家ID 示例：23972093872
dept	string	否	否	部门ID 示例：9273092732323
description	string	否	否	描述 示例：描述
employeeCount	string	否	否	员工数 示例：43
industry	string	否	否	行业ID 示例：210973209732
jobTitle	string	否	否	职务 示例：职务
mailbox	string	否	否	邮箱 示例：ashdsas@qq.com
name	string	否	否	线索名称 示例：线索名称
natureOfTheEnterprise	string	否	否	企业性质 示例：企业性质
org	string	否	否	销售组织ID 示例：2398920739837
ower	string	否	否	负责人 示例：39874093744334
phone	string	否	否	电话 示例：83838383
qq	string	否	否	QQ 示例：1279870
regionCode	string	否	否	行政区划 示例：110202
saleArea	string	否	否	销售区域 示例：29030293
source	string	否	否	线索来源ID 示例：2122790732
status	string	否	否	线索状态;0-待分配,1-跟进中,2-已转化客户 示例：0
url	string	否	否	网址 示例：www.baidu.com
wechat	string	否	否	微信号 示例：yonyou
tabInfo	object	是	是	适配信息
billNum	string	否	是	单据编码，该值类型字符串，值为sfa_cluecard，不可更改 示例：sfa_cluecard
mappingType	string	否	是	适配类型，值为0，不可更改 示例：0

## 3. 请求示例

Url: /yonbip/crm/bill/cluecheckrepeatddd?access_token=访问令牌
Body: {
	"systemSource": "mt",
	"action": "browse",
	"mainBillNum": "sfa_cluecard",
	"data": {
		"address": "详细地址",
		"annualTurnover": "22",
		"nationalPhone": "+86-17866505921",
		"cellPhone": "15612349876",
		"clueType": "3982709",
		"companyName": "公司名称",
		"contactDept": "任职部门",
		"contactPerson": "联系人",
		"country": "23972093872",
		"dept": "9273092732323",
		"description": "描述",
		"employeeCount": "43",
		"industry": "210973209732",
		"jobTitle": "职务",
		"mailbox": "ashdsas@qq.com",
		"name": "线索名称",
		"natureOfTheEnterprise": "企业性质",
		"org": "2398920739837",
		"ower": "39874093744334",
		"phone": "83838383",
		"qq": "1279870",
		"regionCode": "110202",
		"saleArea": "29030293",
		"source": "2122790732",
		"status": "0",
		"url": "www.baidu.com",
		"wechat": "yonyou"
	},
	"tabInfo": [
		{
			"billNum": "sfa_cluecard",
			"mappingType": "0"
		}
	]
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
code	long	否	请求返回编码 示例：200
message	string	否	请求返回信息 示例：操作成功
data	object	否	请求返回数据
url_v	string	否	网址 示例：www.xxx.com
country	string	否	国家编码 示例：1001Z01000000005J1WB
wechat_v	string	否	微信 示例：wieixn
companyName_v	string	否	公司名称 示例：公司名称
jobTitle_v	string	否	职务 示例：职务
industry	string	否	行业ID 示例：1686563958580314116
billNum	string	否	单据编码：联合查重时区分数据，sfa_cluecard表示该条数据是线索数据，cust_contactcard表示该条数据是联系人数据，cust_customerCard表示该条数据是客户数据 示例：sfa_cluecard
ower_name	string	否	负责人名称 示例：李亚苹
description_v	string	否	描述 示例：描述
country_name	string	否	国家 示例：安道尔
regionCode_v	string	否	行政区划 示例：北京市/市辖区/东城区
clueType_transType_name	string	否	线索类型 示例：测试转化
org_name	string	否	组织名称 示例：CRM集团
contactDept_v	string	否	任职部门 示例：任职部门
source_name	string	否	线索来源 示例：广告
nationalPhone_v	string	否	国际化手机号 示例：+86-17866505921
cellPhone_v	string	否	手机 示例：15911116789
ower	string	否	负责人ID 示例：1680081873703796744
qq_v	string	否	q q 示例：23798273
industry_name	string	否	行业名称 示例：医疗科技
mailbox_v	string	否	邮箱 示例：rrrrr@qq.com
phone_v	string	否	电话 示例：27772622
org	string	否	组织ID 示例：1680077467067875331
status_name	string	否	线索状态 示例：跟进中
saleArea_name	string	否	销售区域 示例：北京区
contactPerson_v	string	否	联系人 示例：联系人
saleArea	string	否	销售区域ID 示例：1680085146443710471
dept_name	string	否	部门 示例：销管一部
dept	string	否	部门ID 示例：1680078154248486914
natureOfTheEnterprise_name	string	否	企业性质 示例：高端企业
activity_theme	string	否	营销活动 示例：自由项验证
employeeCount_v	string	否	员工数 示例：999
annualTurnover_v	string	否	年营业额 示例：111
regionCode_Code	string	否	行政区划编码 示例：110101000000
natureOfTheEnterprise	string	否	企业性质ID 示例：1805483588601249800
clueType_transType	string	否	线索类型ID 示例：1825337933936197633
name_v	string	否	线索名字 示例：线索1019001
highSeasName	string	否	所属公海 示例：公海1
address_v	string	否	详细地址 示例：北京市海淀区
oldClueHighSeasId_name	string	否	来源公海 示例：公海2
merchantAppliedDetail_merchantApplyRangeExtId_orgId	string	否	客户组织ID，客户数据时有返回 示例：1679121192591556617
merchantAppliedDetail!belongOrg_Name"	string	否	客户组织名字，客户数据时有返回 示例：zmy组织
code_v	string	否	客户编码，客户数据时有返回 示例：000254

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"url_v": "www.xxx.com",
		"country": "1001Z01000000005J1WB",
		"wechat_v": "wieixn",
		"companyName_v": "公司名称",
		"jobTitle_v": "职务",
		"industry": "1686563958580314116",
		"billNum": "sfa_cluecard",
		"ower_name": "李亚苹",
		"description_v": "描述",
		"country_name": "安道尔",
		"regionCode_v": "北京市/市辖区/东城区",
		"clueType_transType_name": "测试转化",
		"org_name": "CRM集团",
		"contactDept_v": "任职部门",
		"source_name": "广告",
		"nationalPhone_v": "+86-17866505921",
		"cellPhone_v": "15911116789",
		"ower": "1680081873703796744",
		"qq_v": "23798273",
		"industry_name": "医疗科技",
		"mailbox_v": "rrrrr@qq.com",
		"phone_v": "27772622",
		"org": "1680077467067875331",
		"status_name": "跟进中",
		"saleArea_name": "北京区",
		"contactPerson_v": "联系人",
		"saleArea": "1680085146443710471",
		"dept_name": "销管一部",
		"dept": "1680078154248486914",
		"natureOfTheEnterprise_name": "高端企业",
		"activity_theme": "自由项验证",
		"employeeCount_v": "999",
		"annualTurnover_v": "111",
		"regionCode_Code": "110101000000",
		"natureOfTheEnterprise": "1805483588601249800",
		"clueType_transType": "1825337933936197633",
		"name_v": "线索1019001",
		"highSeasName": "公海1",
		"address_v": "北京市海淀区",
		"oldClueHighSeasId_name": "公海2",
		"merchantAppliedDetail_merchantApplyRangeExtId_orgId": "1679121192591556617",
		"merchantAppliedDetail!belongOrg_Name\"": "zmy组织",
		"code_v": "000254"
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
999	请设置查重规则	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-09	
新增
请求参数 nationalPhone
新增
返回参数 nationalPhone_v
线索编辑查重支持国际化手机号字段

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

