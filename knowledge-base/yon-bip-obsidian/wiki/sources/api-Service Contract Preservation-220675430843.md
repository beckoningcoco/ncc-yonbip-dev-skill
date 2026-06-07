---
title: "服务合同查询"
apiId: "2206754308433117189"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Contract"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 服务合同查询

>  请求方式	POST | Service Contract (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/servicecontract/batchquery
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页条数 示例：20 默认值：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件

## 3. 请求示例

Url: /yonbip/pes/servicecontract/batchquery?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "orgId",
				"op": "eq",
				"value1": "1653986425502695431"
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：5
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：2
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2107515919367405570",
				"orgId": "2077666111408570376",
				"orgIdName": "业务单元qs",
				"executiveOrgId": "2077666111408570376",
				"executiveOrgIdName": "业务单元qs",
				"code": "SC202410010001",
				"name": "AAA",
				"contypeId": "2107509528461836293",
				"contypeIdName": "测试类",
				"customerId": "2084316567613997060",
				"customerIdName": "客户qs01",
				"projectId": "2084316567633397060",
				"projectIdName": "项目01",
				"linkman": "2097122983284834306",
				"linkmanName": "测试",
				"phone": "13681547440",
				"dateSign": "2024-10-01 00:00:00",
				"dateEffect": "2024-10-02 00:00:00",
				"dateExpire": "2025-10-02 00:00:00",
				"contractAmount": 500000,
				"tcId": "2097144553284834306",
				"tcIdName": "人民币",
				"isEffective": 0,
				"memo": "描述信息AAAA",
				"creator": "昵称",
				"createTime": "2024-10-10 15:59:04",
				"modifier": "昵称",
				"modifyTime": "2024-10-21 17:25:42",
				"pubts": "2024-10-21 17:25:43",
				"smsContractsDetailList": [
					{
						"id": "2107515919367405571",
						"smsContractsId": "2107515919367405570",
						"equId": "2085133389735081987",
						"equIdName": "设备001",
						"productId": "2085195489735081987",
						"productIdCode": "0002000002",
						"productIdName": "费用物料",
						"serialNum": "46546516941656",
						"serviceLevel": "2085144589735081987",
						"serviceLevelName": "高级",
						"maintenanceLevel": "2085145589735081987",
						"maintenanceLevelName": "初级",
						"num": 10,
						"unit": "2085144589735081987",
						"unitName": "台",
						"dateEffect": "2024-10-02 00:00:00",
						"dateExpire": "2025-10-02 00:00:00",
						"memo": "描述信息BBB",
						"pubts": "2024-10-10 15:59:04"
					}
				],
				"contractSORecordList": [
					{
						"id": "2157260969250914313",
						"smsContractsId": "2107515919367405570",
						"soId": "2120861774335442952",
						"soCode": "SWO20241028000046",
						"soTosId": "1941828098406219789",
						"soTosName": "保养",
						"soTransactionTypeId": "1941828596623476293",
						"soTransactionTypeName": "服务工单",
						"soStatus": "confirmed",
						"verifystate": 0,
						"voucherStatus": 0,
						"soCreatedAt": "2024-10-28 15:06:55",
						"soCompletedAt": "2024-10-29 15:06:55",
						"soServiceOrgId": "2077666111408570376",
						"soServiceOrgName": "业务单元qs",
						"soPosId": "2084341959480049672",
						"soPosName": "服务点qs01",
						"soSeId": "2084341813442773000",
						"soSeName": "曲爽",
						"pubts": "2024-12-16 16:37:10"
					}
				]
			}
		],
		"pageCount": 5,
		"beginPageIndex": 2,
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
999	服务端逻辑异常	

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

