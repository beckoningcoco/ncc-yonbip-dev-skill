---
title: "获取补签卡类型"
apiId: "1612628716428984326"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Processing Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Processing Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取补签卡类型

>  请求方式	GET | Processing Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/fillAttendance/getAttendanceType
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/fillAttendance/getAttendanceType?access_token=访问令牌

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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	返回信息结果集
id	string	否	补签卡类型主键 示例：e1dpehzh0000001
ts	long	否	时间戳 示例：1615356384000
es	long	否	是否支持 ElasticSearch，0=不支持，1=支持 示例：0
creationtime	long	否	创建时间 示例：1601361526000
creator	string	否	创建人 示例：f322bb55-d693-46eb-ab4c-6868fa2c1bad
modifiedtime	long	否	更新时间 示例：1615356384000
modifier	string	否	更新人 示例：23c0506b-ca7b-4ef7-8a18-7e297cf071ad
tenantid	string	否	租户id 示例：e1dpehzh
ytenantId	string	否	全局租户id 示例：e1dpehzh
typeCode	string	否	类型编码 示例：0001
typeName	string	否	类型名称 示例：漏打卡
status	long	否	状态: 0＝系统附带, 1=自定义 示例：1
showorder	long	否	显示顺序 示例：0
isenable	long	否	是否启用，2=停用，1=启用 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "e1dpehzh0000001",
			"ts": 1615356384000,
			"es": 0,
			"creationtime": 1601361526000,
			"creator": "f322bb55-d693-46eb-ab4c-6868fa2c1bad",
			"modifiedtime": 1615356384000,
			"modifier": "23c0506b-ca7b-4ef7-8a18-7e297cf071ad",
			"tenantid": "e1dpehzh",
			"ytenantId": "e1dpehzh",
			"typeCode": "0001",
			"typeName": "漏打卡",
			"status": 1,
			"showorder": 0,
			"isenable": 1
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
401	获取补签卡类型失败	检查补签卡类型

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

