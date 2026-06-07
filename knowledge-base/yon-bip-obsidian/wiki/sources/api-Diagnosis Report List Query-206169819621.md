---
title: "诊断报告详情查询"
apiId: "2061698196214644736"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Diagnostic Report"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Diagnostic Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 诊断报告详情查询

>  请求方式	GET | Diagnostic Report (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/rom/dimrptDetail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	诊断报告主键ID

## 3. 请求示例

Url: /yonbip/pes/rom/dimrptDetail?access_token=访问令牌&id=

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
message	string	否	操作消息
data	object	否	数据对象
intervalCycle	string	否	间隔周期 示例：0
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
fileTime	string	否	报告文件生成时间 示例：2023-08-16 15:17:28
verifystate	number
小数位数:0,最大长度:10	否	审批状态【0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4,驳回到制单】 示例：2
templateContentId	string	否	模板内容ID 示例：1795014786119368712
code	string	否	编码 示例：DR202308160002
equipmentCode	string	否	设备编码 示例：202307050001
qrcode	string	否	服务二维码 示例：{"fileID":"e093614e-9652-4a46-b13a-4a68db773b30","fileList":[{"name":"Snipaste_2023-08-15_18-49-01.png"}]}
modifier	string	否	修改人 示例：昵称-18487118793
creatorId	string	否	创建人ID 示例：1535867093816705031
modifierId	string	否	修改人ID 示例：1535867093816705031
equipmentId	string	否	设备ID 示例：1763718123920818184
customId	string	否	客户ID 示例：1530103393719681028
orgId	string	否	组织ID 示例：1536002273621573641
vouchdate	string	否	单据日期 示例：2023-08-16 00:00:00
modifyTime	string	否	修改时间 示例：2023-08-16 15:17:21
reportTemplateName	string	否	诊断报告模板名称 示例：456
reprortUrl	string	否	报告URL 示例：https://bip-test.yonyoucloud.com/yonbip-mm-eps/ucf-wh/diagnosticReport/pdf/index.html?fileId=64dc780856212272a0ebfb12&tenantid=0000L6YTYEY5FUZPXE0000
transTypeId	string	否	交易类型ID 示例：1525696834604892583
equipmentName	string	否	设备名称 示例：test
id	string	否	主键ID 示例：1795025635206758404
transTypeName	string	否	交易类型名称 示例：诊断报告
qrcodeName	string	否	二维码名称 示例：23
toDateTime	string	否	到时间 示例：2023-08-17 00:00:00
isReported	number
小数位数:0,最大长度:10	否	是否生成报告【0 否，1是】 示例：1
auditDate	string	否	审核日期 示例：2023-08-16 00:00:00
createDate	string	否	创建日期 示例：2023-08-16 00:00:00
templateContentName	string	否	模板内容名称 示例：123
creator	string	否	创建人 示例：6bd861b6-bdf4-4a62-97a7-69bc0a9e4550
orgName	string	否	组织名称 示例：设备后服务
modifyDate	string	否	修改日期 示例：2023-08-16 00:00:00
isWfControlled	number
小数位数:0,最大长度:10	否	是否审批流控制【0 否，1是】 示例：0
auditor	string	否	审核人 示例：昵称-18487118793
businessStatus	string	否	业务状态业务状态【0：待发布，1：已发布】 示例：0
customName	string	否	客户名称 示例：红绸
reportTemplateId	string	否	诊断报告模板ID 示例：1795015713832304649
dispatchStatus	number
小数位数:0,最大长度:10	否	调度启用状态【0 否，1是】 示例：0
reportDetail	object	是	诊断报告详情集合
qrcodeId	string	否	服务二维码ID 示例：1795000492468207624
auditorId	string	否	审核人ID
fromDateTime	string	否	从时间 示例：2023-08-16 00:00:00
createTime	string	否	创建时间 示例：2023-08-16 14:48:07
auditTime	string	否	审核时间 示例：2023-08-16 15:17:24
name	string	否	名称 示例：最后
fileId	string	否	报告文件ID 示例：64dc780856212272a0ebfb12
status	string	否	状态【0 开立，1 已核准】 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
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
		"reportDetail": [
			{
				"equipmentIndex": "1757816486695534594",
				"reportId": "1795025635206758404",
				"reportTemplateDetailId": "1795015713832304650",
				"equipmentIndexUomName": "小时",
				"id": "1795025635206758405",
				"reportTemplateDetailDataSource": "entity",
				"equipmentIndexName": "妈祖",
				"equipmentIndexCode": "满足",
				"equipmentIndexUomId": "1525697375763955716"
			}
		],
		"qrcodeId": "1795000492468207624",
		"auditorId": "",
		"fromDateTime": "2023-08-16 00:00:00",
		"createTime": "2023-08-16 14:48:07",
		"auditTime": "2023-08-16 15:17:24",
		"name": "最后",
		"fileId": "64dc780856212272a0ebfb12",
		"status": "1"
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

