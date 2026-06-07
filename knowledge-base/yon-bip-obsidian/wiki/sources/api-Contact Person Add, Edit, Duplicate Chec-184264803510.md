---
title: "联系人新增编辑查重"
apiId: "1842648035109109769"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contact"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contact]
platform_version: "BIP"
source_type: community-api-docs
---

# 联系人新增编辑查重

>  请求方式	POST | Contact (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/contactcheckrepeat
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
action	string	否	是	动作，必须为browse，不可更改 示例：browse
mainBillNum	string	否	是	单据编码，必须为cust_contactcard，不可更改 示例：cust_contactcard
data	object	否	是	联系人查重请求数据，具体使用那个参数根据查重设置而定，这里列出全部支持查重的字段；规则适用条件使用过滤条件时，过滤条件字段必须要作为查重参数传入。
address	string	否	否	家庭地址 示例：家庭地址
attitude	string	否	否	态度ID 示例：23729873
birthday	string	否	否	生日 示例：2023-10-19
contactType	string	否	否	联系人分类ID 示例：230927037
country	string	否	否	国家ID 示例：293709823798232
customer	string	否	否	客户ID 示例：239792370
dept	string	否	否	部门ID 示例：203802
email	string	否	否	邮箱 示例：27973@qq.com
gender	string	否	否	性别;0-未知；1-男；2-女 示例：0
hobby	string	否	否	兴趣爱好 示例：兴趣爱好
job	string	否	否	职务 示例：职务
name	string	否	否	姓名 示例：姓名
org	string	否	否	销售组织ID 示例：23970984
ower	string	否	否	负责人ID 示例：23080923840
phone	string	否	否	电话 示例：2896298
qq	string	否	否	QQ 示例：98798
regionCode	string	否	否	行政区划 示例：110101
remarks	string	否	否	备注 示例：备注
role	string	否	否	角色ID 示例：2198790873
saleArea	string	否	否	销售区域ID 示例：32720893732
superiorContact	string	否	否	上级联系人ID 示例：2937982763
areaCodeMobile	string	否	否	手机号 示例：+86-15900001111
telephone	string	否	否	备用手机号 示例：15900001111
weChat	string	否	否	微信号 示例：23979237sss
workDept	string	否	否	任职部门ID 示例：2937902
billnum	string	否	是	单据编号 示例：cust_contactcard
tabInfo	object	是	是	查询参数
billNum	string	否	是	单据编码，必须为cust_contactcard，不可更改 示例：cust_contactcard
mappingType	string	否	是	适配类型，必须为0 不可更改 示例：0

## 3. 请求示例

Url: /yonbip/crm/bill/contactcheckrepeat?access_token=访问令牌
Body: {
	"systemSource": "mt",
	"action": "browse",
	"mainBillNum": "cust_contactcard",
	"data": {
		"address": "家庭地址",
		"attitude": "23729873",
		"birthday": "2023-10-19",
		"contactType": "230927037",
		"country": "293709823798232",
		"customer": "239792370",
		"dept": "203802",
		"email": "27973@qq.com",
		"gender": "0",
		"hobby": "兴趣爱好",
		"job": "职务",
		"name": "姓名",
		"org": "23970984",
		"ower": "23080923840",
		"phone": "2896298",
		"qq": "98798",
		"regionCode": "110101",
		"remarks": "备注",
		"role": "2198790873",
		"saleArea": "32720893732",
		"superiorContact": "2937982763",
		"areaCodeMobile": "+86-15900001111",
		"telephone": "15900001111",
		"weChat": "23979237sss",
		"workDept": "2937902"
	},
	"billnum": "cust_contactcard",
	"tabInfo": [
		{
			"billNum": "cust_contactcard",
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
message	string	否	请求返回消息 示例：操作成功
data	object	否	请求返回查重数据
wechat_v	string	否	微信 示例：weixin
attitude_name	string	否	态度名称 示例：支持
hobby_v	string	否	兴趣爱好 示例：兴趣爱好
email_v	string	否	邮箱 示例：111@qq.com
ower_name	string	否	负责人姓名 示例：马继铖
contactType_name	string	否	联系人分类 示例：普通联系人
country_name	string	否	国家名称 示例：中国
birthday_v	Date	否	生日 示例：2023-09-13
regionCode_v	string	否	行政区划名称 示例：北京市/市辖区/东城区
org_name	string	否	组织名称 示例：CRM集团
ower	string	否	负责人Id 示例：1680082612438171648
qq_v	string	否	qq 示例：23890276
phone_v	string	否	电话 示例：27666623
org	string	否	组织ID 示例：1680077467067875331
saleArea_name	string	否	销售区域名字 示例：北京区
saleArea	string	否	销售区域 示例：1680085146443710471
dept_name	string	否	部门 示例：销管一部
areaCodeMobile_v	string	否	手机号 示例：+86-15912349876
telephone_v	string	否	备用手机号 示例：15912349876
dept	string	否	部门ID 示例：1680079520048087049
gender_name	string	否	性别 示例：未知
workDept_v	string	否	任职部门 示例：任职部门
role_name	string	否	角色名称 示例：商务决策人
regionCode_Code	string	否	行政区划编码 示例：110101000000
customer_name	string	否	联系人所属客户名字 示例：转客户1020-11
remarks_v	string	否	备注 示例：这里是备注消息
job_v	string	否	职务 示例：职务
name_v	string	否	联系人名字 示例：转人1020-11
customer	string	否	联系人所属客户的ID 示例：1843341156928192519
address_v	string	否	家庭地址 示例：北京市海淀区xx小区
superiorContact_name	string	否	上级联系人 示例：联系人1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"wechat_v": "weixin",
		"attitude_name": "支持",
		"hobby_v": "兴趣爱好",
		"email_v": "111@qq.com",
		"ower_name": "马继铖",
		"contactType_name": "普通联系人",
		"country_name": "中国",
		"birthday_v": "2023-09-13",
		"regionCode_v": "北京市/市辖区/东城区",
		"org_name": "CRM集团",
		"ower": "1680082612438171648",
		"qq_v": "23890276",
		"phone_v": "27666623",
		"org": "1680077467067875331",
		"saleArea_name": "北京区",
		"saleArea": "1680085146443710471",
		"dept_name": "销管一部",
		"areaCodeMobile_v": "+86-15912349876",
		"telephone_v": "15912349876",
		"dept": "1680079520048087049",
		"gender_name": "未知",
		"workDept_v": "任职部门",
		"role_name": "商务决策人",
		"regionCode_Code": "110101000000",
		"customer_name": "转客户1020-11",
		"remarks_v": "这里是备注消息",
		"job_v": "职务",
		"name_v": "转人1020-11",
		"customer": "1843341156928192519",
		"address_v": "北京市海淀区xx小区",
		"superiorContact_name": "联系人1"
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
请求参数 areaCodeMobile
更新
请求参数 telephone
新增
返回参数 areaCodeMobile_v
更新
返回参数 telephone_v

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

