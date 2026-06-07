---
title: "工单附件上传"
apiId: "2206280968671592451"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "Service Contract"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单附件上传

>  请求方式	POST | Service Contract (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/{businessId}/upload
请求方式	POST
ContentType	multipart/form-data
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
businessId	string	path	是	业务主键
filename	string	query	否	文件名称【不传默认文件名称：时间戳+6随机数+文件后缀/传文件名称:文件名称+默认文件名称】
Body参数
名称	类型	数组	必填	描述
file	file	否	是	附件【支持的文件类型PDF|pdf|docx|DOCX|doc|DOC|zip|ZIP|rar|RAR|xls|XLS|xlsx|XLSX|txt|TXT|jpg|JPG|png|PNG|bmp|BMP|jpeg|JPEG|gif|GIF|bpmn|xml|XML|p12|mp4|mp5】

## 3. 请求示例

Url: /yonbip/pes/{businessId}/upload?access_token=访问令牌&filename=

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
code	int	否	请求状态码 示例：200
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
message	string	否	返回信息 示例：附件上传成功
data	object	否	返回数据集
fileId	string	否	文件 ID 示例：61bc3c847d2b0500270709c8
size	long	否	文件大小 示例：1962
name	string	否	文件名称 示例：ceshi12121639968058.xml
downloadUrl	string	否	下载 Url
filePath	string	否	文件路径 示例：iuap-apcom-file/2021/12/17/15/10/f18b92af-c9ce-408e-a3ec-fc10fd92ede1.xml
extension	string	否	文件后缀 示例：.xml
baseName	string	否	文件名称 示例：ceshi12121639968058
businessData	string	否	业务内容

## 5. 正确返回示例

{
	"code": 200,
	"message": "附件上传成功",
	"data": {
		"fileId": "61bc3c847d2b0500270709c8",
		"size": 1962,
		"name": "ceshi12121639968058.xml",
		"downloadUrl": "",
		"filePath": "iuap-apcom-file/2021/12/17/15/10/f18b92af-c9ce-408e-a3ec-fc10fd92ede1.xml",
		"extension": ".xml",
		"baseName": "ceshi12121639968058",
		"businessData": ""
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
1001001000003	取决于错误类型，不同错误信息不同	
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
更新
返回参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

