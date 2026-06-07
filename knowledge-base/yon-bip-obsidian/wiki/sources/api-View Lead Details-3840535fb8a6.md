---
title: "查看线索详情"
apiId: "3840535fb8a6431ab8dbdbd14eaaf9f8"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Lead"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看线索详情

>  请求方式	GET | Lead (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/clue/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	线索主键    示例: 2331017261748480

## 3. 请求示例

Url: /yonbip/crm/clue/getbyid?access_token=访问令牌&id=2331017261748480

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
code	long	否	返回状态码，200为成功，999为失败 示例：200
message	string	否	返回提示信息 示例：操作成功
data	object	否	返回数据data
clueType	string	否	线索类型id 示例：2306836267438336
dept_code	string	否	部门编码 示例：001
country	string	否	国家id 示例：bf902533-f309-11e8-817e-7cd30abea0c0
masterOrgKeyField	string	否	主组织字段 示例：org
jobTitle	string	否	职务 示例：hhhh
companyName	string	否	公司名称 示例：sadfsd
headDef	object	否	扩展表字段
source	long	否	线索来源id 示例：2247503890210325
employeeCount	string	否	员工数 示例：2
annualTurnover	string	否	年营业额 示例：2
id	long	否	主表主键 示例：2331017261748480
tenant	long	否	租户id 示例：2292495487783168
longitude	string	否	经度 示例：116.245116
qq	string	否	qq 示例：23456
ower	string	否	负责人主键 示例：2293808586100992
tenant_name	string	否	租户名称 示例：0608日常旗舰CRM
saleArea	long	否	销售区域主键 示例：2306812570702080
isTransferOppm	boolean	否	是否转化商机 示例：false
creatorId_name	string	否	创建人名称 示例：刘灿
mailbox	string	否	邮箱 示例：xxx@qq.com
phone	string	否	电话 示例：1234567
clueType_isBringAction	string	否	是否自动带入跟进记录，1为带入，0为不带入 示例：1
clueType_name	string	否	线索类型名称 示例：普通线索
name	string	否	线索名称 示例：ceshi线索1111
clueType_hasCustomer	string	否	是否包含客户，1为包含，0为不包含 示例：1
clueType_transType	string	否	交易类型Id 示例：2292497085845762
org_code	string	否	销售组织编码 示例：060901
status	long	否	线索状态，状态有四个枚举值0123，含义：0为待分配，1为跟进中，2为已转化，3为已关闭 示例：1
code	string	否	线索编码 示例：20210705000419
latitude	string	否	纬度 示例：40.07655
activity	long	否	营销活动id 示例：1494426234366984195
creatorId	long	否	创建人id 示例：2293809183756544
ower_code	string	否	负责人编码 示例：00000001
contactPerson	string	否	联系人 示例：yyyy
description	string	否	描述 示例：这是描述
clueType_transCustomer	long	否	转化对象(客户)，1为转化新客户，0为转化老客户 示例：1
industry	long	否	行业 示例：2315405551603968
isTransferLinkman	boolean	否	是否转化联系人 示例：false
ower_name	string	否	负责人名称 示例：刘灿
regionCode	string	否	注册地区编码 示例：110108000000
timeNotFollowedValue	string	否	未跟进时长 示例：未跟进
saleArea_code	string	否	销售区域编码 示例：0101
pictureSettingDetail	object	否	图片设置详情
clueType_hasLinkMan	string	否	是否包含联系人 示例：1
country_name	string	否	国家名称 示例：南极洲
isTransferCustomer	boolean	否	是否转化客户 示例：false
pubts	string	否	时间戳 示例：2021-07-05 16:33:23
org_name	string	否	销售组织名称 示例：北京分公司
source_name	string	否	线索来源名称 示例：企业画像
stopstatus	boolean	否	停启用状态,false：启用 ； true：停用 示例：false：启用 ； true：停用
createDate	string	否	创建日期 示例：2021-07-05 00:00:00
creator	string	否	创建人 示例：刘灿
industry_name	string	否	行业名称 示例：互联网金融
modifier	string	否	修改人名称 示例：刘灿
modifierId	long	否	修改人id 示例：1866938938003712
modifyTime	string	否	修改时间 示例：2021-07-17 20:49:12
modifyDate	string	否	修改日期 示例：2021-07-17 00:00:00
modifierId_name	string	否	修改人 示例：刘灿
subList	object	是	子表信息
address	string	否	详细地址 示例：北京市海淀区西北旺镇丰秀东路中关村壹号
org	string	否	销售组织id 示例：2293806909461248
clueType_code	string	否	线索类型编码 示例：leads001
saleArea_name	string	否	销售区域名称 示例：海淀区
wechat	string	否	微信 示例：defrgthyuji
dept_name	string	否	部门名称 示例：销售部
dept	string	否	部门id 示例：2293807299121408
natureOfTheEnterprise_name	string	否	企业性质名称 示例：嘎嘎嘎
contactDept	string	否	任职部门 示例：112321
url	string	否	网址 示例：wqert
createTime	string	否	创建时间 示例：2021-07-05 16:33:22
natureOfTheEnterprise	string	否	企业性质ID 示例：2308477780758784
clueType_hasBusiOppo	string	否	是否包含商机 示例：1
source_code	string	否	线索来源编码 示例：business_portraits
cellPhone	string	否	手机 示例：18435168295

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"clueType": "2306836267438336",
		"dept_code": "001",
		"country": "bf902533-f309-11e8-817e-7cd30abea0c0",
		"masterOrgKeyField": "org",
		"jobTitle": "hhhh",
		"companyName": "sadfsd",
		"headDef": {
			"id": "",
			"define2": "是",
			"define1": "2",
			"define3": "true"
		},
		"source": 2247503890210325,
		"employeeCount": "2",
		"annualTurnover": "2",
		"id": 2331017261748480,
		"tenant": 2292495487783168,
		"longitude": "116.245116",
		"qq": "23456",
		"ower": "2293808586100992",
		"tenant_name": "0608日常旗舰CRM",
		"saleArea": 2306812570702080,
		"isTransferOppm": false,
		"creatorId_name": "刘灿",
		"mailbox": "xxx@qq.com",
		"phone": "1234567",
		"clueType_isBringAction": "1",
		"clueType_name": "普通线索",
		"name": "ceshi线索1111",
		"clueType_hasCustomer": "1",
		"clueType_transType": "2292497085845762",
		"org_code": "060901",
		"status": 1,
		"code": "20210705000419",
		"latitude": "40.07655",
		"activity": 1494426234366984195,
		"creatorId": 2293809183756544,
		"ower_code": "00000001",
		"contactPerson": "yyyy",
		"description": "这是描述",
		"clueType_transCustomer": 1,
		"industry": 2315405551603968,
		"isTransferLinkman": false,
		"ower_name": "刘灿",
		"regionCode": "110108000000",
		"timeNotFollowedValue": "未跟进",
		"saleArea_code": "0101",
		"pictureSettingDetail": {
			"isAllowAlbum": true,
			"isUseWatermark": false,
			"id": 22635,
			"isAllowPhotograph": true
		},
		"clueType_hasLinkMan": "1",
		"country_name": "南极洲",
		"isTransferCustomer": false,
		"pubts": "2021-07-05 16:33:23",
		"org_name": "北京分公司",
		"source_name": "企业画像",
		"stopstatus": "",
		"createDate": "2021-07-05 00:00:00",
		"creator": "刘灿",
		"industry_name": "互联网金融",
		"modifier": "刘灿",
		"modifierId": 1866938938003712,
		"modifyTime": "2021-07-17 20:49:12",
		"modifyDate": "2021-07-17 00:00:00",
		"modifierId_name": "刘灿",
		"subList": [
			{
				"materialClass": 2306830275285248,
				"productClass_name": "饮品",
				"productClass": 2295316367970560,
				"quantity": 2,
				"salesUnit_name": "瓶",
				"materialClass_name": "北京饮料",
				"brand_name": "F品牌",
				"materials_name": "七喜可乐",
				"productLine_name": "UU",
				"salesUnit_precision": 2,
				"productLine": 2321048857399552,
				"materials": 2306833548267776,
				"salesUnit": 2295317204439296,
				"clue": 2331017261748480,
				"id": 2331017261748481,
				"pubts": "2021-07-05 16:33:23",
				"brand": 2321049481040128
			}
		],
		"address": "北京市海淀区西北旺镇丰秀东路中关村壹号",
		"org": "2293806909461248",
		"clueType_code": "leads001",
		"saleArea_name": "海淀区",
		"wechat": "defrgthyuji",
		"dept_name": "销售部",
		"dept": "2293807299121408",
		"natureOfTheEnterprise_name": "嘎嘎嘎",
		"contactDept": "112321",
		"url": "wqert",
		"createTime": "2021-07-05 16:33:22",
		"natureOfTheEnterprise": "2308477780758784",
		"clueType_hasBusiOppo": "1",
		"source_code": "business_portraits",
		"cellPhone": "18435168295"
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

