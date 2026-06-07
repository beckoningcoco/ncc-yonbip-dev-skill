---
title: "友智库RAG数据推送"
apiId: "2279716611555852295"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "YonKnow"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonKnow]
platform_version: "BIP"
source_type: community-api-docs
---

# 友智库RAG数据推送

>  请求方式	POST | YonKnow (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/iuap-aip-ps/intellis/entire/pushData/batch
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
indexName	string	否	否	indexName 示例：iuap_aip_ps_esindex_common_v1
eventType	string	否	否	eventType 示例：ADD
isBatch	boolean	否	否	isBatch 示例：true
itsDatasource	string	否	否	itsDatasource 示例：RAG ID 友智库提供
entityList	object	是	否	entityList
id	string	否	否	id 示例：b408acbd-69c1-4418-a898-576e6b7725c1_zh_CN1
isParse	boolean	否	否	isParse 示例：false
vector	string	否	否	vector 示例：0
body	object	否	否	body

## 3. 请求示例

Url: /yonbip/aipaas/iuap-aip-ps/intellis/entire/pushData/batch?access_token=访问令牌
Body: {
	"indexName": "iuap_aip_ps_esindex_common_v1",
	"eventType": "ADD",
	"isBatch": true,
	"itsDatasource": "RAG ID 友智库提供",
	"entityList": [
		{
			"id": "b408acbd-69c1-4418-a898-576e6b7725c1_zh_CN1",
			"isParse": false,
			"vector": "0",
			"body": {
				"id": "b408acbd-69c1-4418-a898-576e6b7725c1_zh_CN1",
				"its_parent_id": "aff3a8da-0d60-4d8d-b1ef-8b418cb6c08b",
				"its_parent_path": [
					"2251554949098635272",
					"aff3a8da-0d60-4d8d-b1ef-8b418cb6c08b"
				],
				"its_resource_type": 3,
				"fileName": "会员测试中文",
				"attachment_content": "解析内容",
				"attachment_summary": "摘要",
				"fileType": "文件类型，如pdf docx txt md pptx xlsx csv",
				"fileUrl": "文件地址（业务地址）",
				"its_file_url": "文件解析下载地址，用于文件解析，地址保障可免登录下载",
				"its_file_ts": 1744519762741,
				"language": "zh_CN 语种",
				"createtime": 1744519762741,
				"ts": 1744519762741,
				"ytenant_id": "0",
				"data_id": "b408acbd-69c1-4418-a898-576e6b7725c1",
				"biz_content": "扩展字段，支持分词",
				"its_info": "JSON字符，存放领域业务数据",
				"domain_code": "领域编码",
				"product_line": "产品线编码",
				"service_code": "菜单编码",
				"type": "业务类型",
				"its_attr_1": "扩展字段1总共有10个"
			}
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
status	number
小数位数:0,最大长度:10	否	status 示例：1
data	boolean	否	data 示例：true
msg	string	否	msg 示例：执行成功
ext	string	否	ext
errorCode	string	否	errorCode
message	string	否	message
traceId	string	否	traceId 示例：ccbc7a2aaf827aee
displayCode	string	否	displayCode
level	number
小数位数:0,最大长度:10	否	level 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": true,
		"msg": "执行成功",
		"ext": "",
		"errorCode": "",
		"message": "",
		"traceId": "ccbc7a2aaf827aee",
		"displayCode": "",
		"level": 0
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

