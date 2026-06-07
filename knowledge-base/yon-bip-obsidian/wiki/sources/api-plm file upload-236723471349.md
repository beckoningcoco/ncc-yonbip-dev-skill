---
title: "研发云文件上传"
apiId: "2367234713491341323"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "General Document Service"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Document Service]
platform_version: "BIP"
source_type: community-api-docs
---

# 研发云文件上传

>  请求方式	POST | General Document Service (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/doc/v1/file/uploadSingleFile
请求方式	POST
ContentType	multipart/form-data
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
fromId	string	否	是	随机数用于区分同一文件多次上传 示例：2354640623812739073
file	file	否	是	file

## 3. 请求示例

Url: /yonbip/RDC/openapi/doc/v1/file/uploadSingleFile?access_token=访问令牌

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
success	string	否	success 示例：true
code	number
小数位数:0,最大长度:10	否	code 示例：200
errorCode	string	否	errorCode
data	object	否	data
fileFullName	string	否	文件全名 示例：租户级的API导出关键
fileName	string	否	文件名（不带.后缀） 示例：租户级的API导出关键
fileSize	number
小数位数:0,最大长度:10	否	文件字节长度 示例：1180
fileSizeText	string	否	文件长度 示例：1.15KB
fileExtension	string	否	文件后缀 示例：txt
id	string	否	传入的fromId 示例：000000
url	string	否	url 示例：016TRJ8jNA46iWxzXEx79b44839297f08f32b3cf15be57e855ccba68a6a20d3d37eff2db3ff2e4137a35eedcb3aab64750bf621a2486be49790
md5	string	否	md5 示例：2b5ced3f-91d3-469e-9201-296eec84a140
time	string	否	time 示例：2025-09-25 14:29:12
shadowLinkCode	string	否	影子文件编码 示例：68d4e137e4b06ec995e5e6f0
tenantId	string	否	租户id
message	string	否	message 示例：操作成功！

## 5. 正确返回示例

{
	"success": "true",
	"code": 200,
	"errorCode": "",
	"data": {
		"fileFullName": "租户级的API导出关键",
		"fileName": "租户级的API导出关键",
		"fileSize": 1180,
		"fileSizeText": "1.15KB",
		"fileExtension": "txt",
		"id": "000000",
		"url": "016TRJ8jNA46iWxzXEx79b44839297f08f32b3cf15be57e855ccba68a6a20d3d37eff2db3ff2e4137a35eedcb3aab64750bf621a2486be49790",
		"md5": "2b5ced3f-91d3-469e-9201-296eec84a140",
		"time": "2025-09-25 14:29:12",
		"shadowLinkCode": "68d4e137e4b06ec995e5e6f0",
		"tenantId": ""
	},
	"message": "操作成功！"
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
	1	2026-05-08	
更新
请求说明
1

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

