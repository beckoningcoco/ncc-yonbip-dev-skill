---
title: "营销人员详情查询"
apiId: "1632512267621761031"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销人员详情查询

>  请求方式	GET | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/channelperson/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	人员id（人员id，code描述二选一必填）    示例: 1597473262895890437
code	string	query	否	人员编码（人员id，code描述二选一必填）    示例: 1

## 3. 请求示例

Url: /yonbip/sd/uretail/channelperson/detail?access_token=访问令牌&id=1597473262895890437&code=1

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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	返回详情信息
id	string	否	人员id 示例：1669611653851774978
staff	string	否	员工id 示例：1669611653851774978
cPhone	string	否	联系电话 示例：16677139207
code	string	否	用户编码 示例：199002
createTime	DateTime	否	创建时间 示例：2022-11-23 10:26:04
modifyTime	DateTime	否	修改时间 示例：2022-11-23 10:26:04
creator	string	否	创建人员 示例：u8c_vip@163.com
modifier	string	否	修改人员 示例：yonyou221108
cust	long	否	所属客户 示例：1534492618391027713
cust_name	string	否	所属客户 示例：所属客户名
erpCode	string	否	ERP编码 示例：199002
gender	long	否	性别（1 - 男；2 - 女） 示例：1
name	string	否	姓名 示例：人员姓名
yhtUserId	string	否	yht用户id 示例：16f447b7-09ca-4b25-8dd0-570a494a043f
cEmail	string	否	联系邮箱 示例：18300000000@163.com
isemployee	boolean	否	营业员 示例：false
dEntryTime	DateTime	否	入职日期 示例：2022-11-23 10:26:04
dLeaveTime	DateTime	否	离职日期 示例：9999-12-31 12:59:59
iQRCode	object	否	二维码信息
cIntro	string	否	介绍 示例：介绍
pubts	DateTime	否	时间戳 示例：2022-11-23 10:26:04
operatorStore	object	是	所属终端
identityType	string	否	身份类型（2 - 客户管理员；3 - 客户业务员；4 - 商家管理员；5 - 商家业务员） 示例：2,3
salesman	boolean	否	是否业务员（true - 是；false - 否） 示例：true
isclerk	boolean	否	是否终端人员（true - 是；false - 否） 示例：true
outUser	boolean	否	外部用户（true - 是；false - 否） 示例：true
generateUser	boolean	否	是否创建用户（true - 是；false - 否） 示例：true
merchantStaff	string	否	客户ID 示例：1597473262895890437
operatorRole	object	是	角色信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1669611653851774978",
		"staff": "1669611653851774978",
		"cPhone": "16677139207",
		"code": "199002",
		"createTime": "2022-11-23 10:26:04",
		"modifyTime": "2022-11-23 10:26:04",
		"creator": "u8c_vip@163.com",
		"modifier": "yonyou221108",
		"cust": 1534492618391027713,
		"cust_name": "所属客户名",
		"erpCode": "199002",
		"gender": 1,
		"name": "人员姓名",
		"yhtUserId": "16f447b7-09ca-4b25-8dd0-570a494a043f",
		"cEmail": "18300000000@163.com",
		"isemployee": false,
		"dEntryTime": "2022-11-23 10:26:04",
		"dLeaveTime": "9999-12-31 12:59:59",
		"iQRCode": {
			"id": 215433211,
			"iQRCodeType": 1
		},
		"cIntro": "介绍",
		"pubts": "2022-11-23 10:26:04",
		"operatorStore": [
			{
				"iStoreId": 1564095259555135490,
				"iStoreId_name": "门店名",
				"id": 1608792108049629187,
				"operatorId": "1597473262895890437"
			}
		],
		"identityType": "2,3",
		"salesman": true,
		"isclerk": true,
		"outUser": true,
		"generateUser": true,
		"merchantStaff": "1597473262895890437",
		"operatorRole": [
			{
				"iRoleId": "12729894-a518-4cd6-a236-1c8994fb0f4e",
				"iRoleId_name": "角色名",
				"operatorId": "1619047485015064579"
			}
		]
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
999	错误信息	请联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (41)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

