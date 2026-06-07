---
title: "诊断报告列表查询"
apiId: "ee8f1b0cfe1f4781a5b95826565384d7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Diagnostic Report"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Diagnostic Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 诊断报告列表查询

>  请求方式	POST | Diagnostic Report (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/rom/dimrpt
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
name	string	否	否	诊断报告名名称
status	string	否	否	单据状态【0：开立，1：已核准】
code	string	否	否	单据编码
orgId	string	否	否	创建组织ID
equipmentId	string	否	否	设备ID
equipment	string	否	否	设备编号或者名称
customId	string	否	否	客户ID
customerLevelId	string	否	否	客户级别ID
isReported	boolean	否	否	是否已经生成报告
businessStatus	string	否	否	业务状态【0：待发布，1：已发布】
pageIndex	number
小数位数:0,最大长度:10	否	否	当前页
pageSize	number
小数位数:0,最大长度:10	否	否	每页数目
vouchdateBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期开始
vouchdateEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期结束
fromDateTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	从日期开始
fromDateTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	从日期结束
toDateTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	到日期开始
toDateTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	到日期结束
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间开始
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间结束
orgIdList	string	是	否	组织Id列表
customIdList	string	是	否	客户Id列表
equipmentIdList	string	是	否	设备ID列表
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间
auditTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审核时间开始时间
auditTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审核时间结束时间
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间开始时间
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间结束时间
billTypeId	string	否	否	交易类型ID

## 3. 请求示例

Url: /yonbip/pes/rom/dimrpt?access_token=访问令牌
Body: {
	"name": "",
	"status": "",
	"code": "",
	"orgId": "",
	"equipmentId": "",
	"equipment": "",
	"customId": "",
	"customerLevelId": "",
	"isReported": true,
	"businessStatus": "",
	"pageIndex": 0,
	"pageSize": 0,
	"vouchdateBegin": "2026-06-07 13:19:08",
	"vouchdateEnd": "2026-06-07 13:19:08",
	"fromDateTimeBegin": "2026-06-07 13:19:08",
	"fromDateTimeEnd": "2026-06-07 13:19:08",
	"toDateTimeBegin": "2026-06-07 13:19:08",
	"toDateTimeEnd": "2026-06-07 13:19:08",
	"createTimeBegin": "2026-06-07 13:19:08",
	"createTimeEnd": "2026-06-07 13:19:08",
	"orgIdList": [
		""
	],
	"customIdList": [
		""
	],
	"equipmentIdList": [
		""
	],
	"pubtsBegin": "2026-06-07 13:19:08",
	"pubtsEnd": "2026-06-07 13:19:08",
	"auditTimeBegin": "2026-06-07 13:19:08",
	"auditTimeEnd": "2026-06-07 13:19:08",
	"modifyTimeBegin": "2026-06-07 13:19:08",
	"modifyTimeEnd": "2026-06-07 13:19:08",
	"billTypeId": ""
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
code	number
小数位数:0,最大长度:10	否	操作状态 示例：200
message	string	否	返回消息
data	object	否	数据对象
result	object	是	列表详情
totalCount	number
小数位数:0,最大长度:10	否	总条数 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"result": [
			{
				"intervalCycle": "0",
				"returncount": 0,
				"fileTime": "2023-08-16 15:17:28",
				"verifystate": 2,
				"templateContentId": "1795014786119368712",
				"code": "DR202308160002",
				"equipmentCode": "202307050001",
				"qrcode": "{\"fileID\":\"e093614e-9652-4a46-b13a-4a68db773b30\",\"fileList\":[{\"name\":\"Snipaste_2023-08-15_18-49-01.png\"}]}",
				"modifier": "昵称-18487118793",
				"creatorId": "1535867093816705031",
				"modifierId": "1535867093816705031",
				"equipmentId": "1763718123920818184",
				"customId": "1530103393719681028",
				"orgId": "1536002273621573641",
				"vouchdate": "2023-08-16 00:00:00",
				"modifyTime": "2023-08-16 15:17:21",
				"reportTemplateName": "456",
				"reprortUrl": "https://bip-test.yonyoucloud.com/yonbip-mm-eps/ucf-wh/diagnosticReport/pdf/index.html?fileId=64dc780856212272a0ebfb12&tenantid=0000L6YTYEY5FUZPXE0000",
				"transTypeId": "1525696834604892583",
				"equipmentName": "test",
				"id": "1795025635206758404",
				"transTypeName": "诊断报告",
				"qrcodeName": "23",
				"toDateTime": "2023-08-17 00:00:00",
				"isReported": 1,
				"auditDate": "2023-08-16 00:00:00",
				"createDate": "2023-08-16 00:00:00",
				"templateContentName": "123",
				"creator": "6bd861b6-bdf4-4a62-97a7-69bc0a9e4550",
				"orgName": "设备后服务",
				"modifyDate": "2023-08-16 00:00:00",
				"isWfControlled": 0,
				"auditor": "昵称-18487118793",
				"businessStatus": "0",
				"customName": "红绸",
				"reportTemplateId": "1795015713832304649",
				"dispatchStatus": 0,
				"qrcodeId": "1795000492468207624",
				"auditorId": "",
				"fromDateTime": "2023-08-16 00:00:00",
				"createTime": "2023-08-16 14:48:07",
				"auditTime": "2023-08-16 15:17:24",
				"name": "最后",
				"fileId": "64dc780856212272a0ebfb12",
				"status": "1"
			}
		],
		"totalCount": 1
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

