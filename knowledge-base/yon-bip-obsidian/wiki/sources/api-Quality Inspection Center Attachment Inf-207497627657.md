---
title: "安装计划列表查询"
apiId: "2074976276570963968"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quality Inspection Center"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quality Inspection Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 安装计划列表查询

>  请求方式	POST | Quality Inspection Center (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/install/installPlan/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	long	否	否	当前页 示例：1 默认值：1
pageSize	long	否	否	每页数目 示例：20 默认值：20
orgId	string	否	否	组织ID 示例：2672378841223424
orgCode	string	否	否	组织编码
name	string	否	否	名称 示例：测试
equipmentId	string	否	否	设备ID 示例：2698906412815104
equipmentCode	string	否	否	设备编码
customerId	string	否	否	客户ID 示例：2672392036274688
customerCode	string	否	否	客户编码
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建时间开始时间
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建时间结束时间
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改时间开始时间
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改时间结束时间

## 3. 请求示例

Url: /yonbip/pes/install/installPlan/query?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
	"orgId": "2672378841223424",
	"orgCode": "",
	"name": "测试",
	"equipmentId": "2698906412815104",
	"equipmentCode": "",
	"customerId": "2672392036274688",
	"customerCode": "",
	"pubtsBegin": "2026-06-07 13:19:21",
	"pubtsEnd": "2026-06-07 13:19:21",
	"createTimeBegin": "2026-06-07 13:19:21",
	"createTimeEnd": "2026-06-07 13:19:21",
	"modifyTimeBegin": "2026-06-07 13:19:21",
	"modifyTimeEnd": "2026-06-07 13:19:21"
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	string	否	操作状态 示例：200
message	string	否	错误描述
data	object	否	返回数据
pageIndex	long	否	当前页码 示例：1
pageSize	long	否	每页查询数 示例：20
recordCount	long	否	查询总数据 示例：1
recordList	object	是	数据列表
pageCount	long	否	页总数 示例：1
beginPageIndex	long	否	开始页 示例：1
endPageIndex	long	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2313645455331584",
				"name": "安装计划名称",
				"orgId": "0012",
				"orgName": "组织名称",
				"status": "Published",
				"equipmentId": "32141254325",
				"equipmentName": "设备名称",
				"equipmentCode": "1",
				"customerId": "123452",
				"customerName": "客户名称",
				"installPlanTemplate": "33452453244345431",
				"installPlanTemplateName": "安装计划模板名称",
				"isFinished": "1",
				"isDebugged": "1",
				"checked": "1",
				"isUsed": "1",
				"remarks": "描述"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
0	未传入优惠券档案id	coupon_id值填写有误
1001001000003	操作错误，不同错误信息不同	
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-05-27	
新增
返回参数 userDefineCharacter
新增返回自定义特征字段

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

