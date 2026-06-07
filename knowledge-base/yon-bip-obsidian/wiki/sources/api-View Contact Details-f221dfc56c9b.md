---
title: "查看联系人详情"
apiId: "f221dfc56c9b4c8a9687c7a2d325cdb0"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Contact"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contact]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看联系人详情

>  请求方式	GET | Contact (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/contact/getbyid
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	联系人主键    示例: 12345

## 3. 请求示例

Url: /yonbip/crm/contact/getbyid?access_token=访问令牌&id=12345

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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
superiorContact	long	否	上级联系人ID 示例：2178170853380352
country	string	否	国家id 示例：0040be98-735b-44c0-afe5-54d11a96037b
masterOrgKeyField	string	否	主组织字段 示例：org
attitude_name	string	否	态度 示例：中立
contactType	long	否	联系人分类ID 示例：2094828346708260
contactType_code	string	否	联系人分类编码 示例：senior_contact
contactImageList	object	是	图片子表
contactType_name	string	否	联系人分类 示例：高管人员
id	long	否	主键id 示例：2183759876428032
customer_isPotential	boolean	否	是否潜客 示例：false
customer_code	string	否	客户编码 示例：000137
longitude	double	否	经度 示例：116.478994
qq	string	否	QQ 示例：324123123
ower	string	否	负责人ID 示例：2095941795828736
saleArea	long	否	销售区域ID 示例：2095888084340992
areaCodeMobile	string	否	手机号 示例：+86-1851908987
telephone	string	否	备用手机号 示例：1851908987
role_name	string	否	角色 示例：技术决策人
country_code	string	否	国家编码 示例：CN
isDefault	boolean	否	默认联系人 示例：true
phone	string	否	电话 示例：1851908987
name	string	否	姓名 示例：郝悦
job	string	否	职务 示例：销售
isremind	boolean	否	生日提醒 示例：false
hobby	string	否	兴趣爱好 示例：跑步
attitude	long	否	态度ID 示例：2094828346708236
birthday	string	否	生日 示例：2021-03-03 00:00:00
role	long	否	角色ID 示例：2094828346708233
gender	long	否	性别(0:未知;1:男;2:女) 示例：2
latitude	double	否	纬度 示例：39.916161
superiorContact_name	string	否	上级联系人 示例：wangyuyu
ower_name	string	否	负责人 示例：刘灿
regionCode	string	否	注册地区编码 示例：110101000000
country_name	string	否	国家 示例：中国大陆
pubts	string	否	时间戳 示例：2021-03-23 15:55:25
org_name	string	否	销售组织名称 示例：集团
email	string	否	邮箱 示例：189203212312@193.com
creator	string	否	创建人 示例：刘灿
address	string	否	地址 示例：北京市朝阳区八里庄街道红北社区
org	string	否	销售组织ID 示例：2095880010126336
timeNotFollowedUp	string	否	未跟进时长 示例：未跟进
saleArea_name	string	否	销售区域 示例：北京
dept_name	string	否	部门 示例：销管部门
dept	string	否	部门ID 示例：2095882496889088
createTime	string	否	创建时间 示例：2021-03-23 15:55:25
weChat	string	否	微信 示例：34312312
workDept	string	否	任职部门 示例：销售
customerDept_name	string	否	客户部门 示例：销售
customer_name	string	否	客户 示例：潜客001
remarks	string	否	备注 示例：备注
customer	long	否	客户ID 示例：2095960786538752
modifier	string	否	修改人 示例：刘灿
modifyTime	string	否	修改时间 示例：2021-04-28 09:49:51
pictureSettingDetail	object	否	图片设置详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"superiorContact": 2178170853380352,
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"masterOrgKeyField": "org",
		"attitude_name": "中立",
		"contactType": 2094828346708260,
		"contactType_code": "senior_contact",
		"contactImageList": [
			{
				"imgName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/d72bde50-e0e6-4dab-8a22-25f2fa0749fc.png",
				"size": 84885,
				"contactId": 2183759876428032,
				"sort": 0,
				"id": 2183759876444416,
				"type": "image/png"
			}
		],
		"contactType_name": "高管人员",
		"id": 2183759876428032,
		"customer_isPotential": false,
		"customer_code": "000137",
		"longitude": 116.478994,
		"qq": "324123123",
		"ower": "2095941795828736",
		"saleArea": 2095888084340992,
		"areaCodeMobile": "+86-1851908987",
		"telephone": "1851908987",
		"role_name": "技术决策人",
		"country_code": "CN",
		"isDefault": true,
		"phone": "1851908987",
		"name": "郝悦",
		"job": "销售",
		"isremind": false,
		"hobby": "跑步",
		"attitude": 2094828346708236,
		"birthday": "2021-03-03 00:00:00",
		"role": 2094828346708233,
		"gender": 2,
		"latitude": 39.916161,
		"superiorContact_name": "wangyuyu",
		"ower_name": "刘灿",
		"regionCode": "110101000000",
		"country_name": "中国大陆",
		"pubts": "2021-03-23 15:55:25",
		"org_name": "集团",
		"email": "189203212312@193.com",
		"creator": "刘灿",
		"address": "北京市朝阳区八里庄街道红北社区",
		"org": "2095880010126336",
		"timeNotFollowedUp": "未跟进",
		"saleArea_name": "北京",
		"dept_name": "销管部门",
		"dept": "2095882496889088",
		"createTime": "2021-03-23 15:55:25",
		"weChat": "34312312",
		"workDept": "销售",
		"customerDept_name": "销售",
		"customer_name": "潜客001",
		"remarks": "备注",
		"customer": 2095960786538752,
		"modifier": "刘灿",
		"modifyTime": "2021-04-28 09:49:51",
		"pictureSettingDetail": {
			"isAllowAlbum": true,
			"isUseWatermark": true,
			"isAllowPhotograph": true,
			"watchmarkvalues": "[\"creator\", \"customer_name\", \"currentTime\", \"currentLocation\"]"
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
999	获取失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-09	
更新
请求说明
新增
返回参数 areaCodeMobile
新增
返回参数 customerDept_name
更新
返回参数 telephone
	2	2025-06-25	
更新
返回参数 (66)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

