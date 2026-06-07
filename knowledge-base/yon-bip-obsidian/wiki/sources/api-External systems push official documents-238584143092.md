---
title: "外部系统推送公文"
apiId: "2385841430926983168"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Official Documents"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Official Documents]
platform_version: "BIP"
source_type: community-api-docs
---

# 外部系统推送公文

>  请求方式	POST | Official Documents (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/openapi/official/push/document
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
outerOrgId	string	否	否	外部单位ID
sourceTenantId	string	否	否	外部单位所属租户ID（用友租户）
outerOrgDocumentId	string	否	是	外部单位公文ID
outerOrgIssueItemId	string	否	是	外部单位分发记录ID
sourceSendOrgName	string	否	是	外部单位分发公文的发文组织名称
targetTenantId	string	否	是	公文分发目标租户ID
targetReceiveOrgId	string	否	是	公文分发目标租户收文组织ID
targetReceiveOrgName	string	否	是	公文分发目标租户收文组织名称
documentTitle	string	否	是	外部单位公文标题
secretDate	string	否	否	外部单位公文保密期限
secretScore	string	否	否	外部单位公文秘密等级
urgentScore	string	否	否	外部单位公文紧急程度
sendDocumentNo	string	否	否	外部单位公文发文字号
documentDepartmentText	string	否	否	外部单位公文发文单位
copySenderText	string	否	否	外部单位公文抄送信息
mainSenderText	string	否	否	外部单位公文主送信息
outerFormUrl	string	否	否	外部公文单据预览地址
documentTypeName	string	否	否	外部单位公文类型名称
files	object	是	是	外部单位公文文件列表
type	string	否	是	文件类型：word正文：CONTENT_TXT_DOC；PDF正文：CONTENT_PDF_DOC；OFD正文：CONTENT_OFD_DOC；其他公文附件：ATTACHMENT_DOC 默认值：CONTENT_TXT_DOC
name	string	否	是	文件名
path	string	否	是	文件下载地址

## 3. 请求示例

Url: /yonbip/SCCC/openapi/official/push/document?access_token=访问令牌
Body: [{
	"outerOrgId": "",
	"sourceTenantId": "",
	"outerOrgDocumentId": "",
	"outerOrgIssueItemId": "",
	"sourceSendOrgName": "",
	"targetTenantId": "",
	"targetReceiveOrgId": "",
	"targetReceiveOrgName": "",
	"documentTitle": "",
	"secretDate": "",
	"secretScore": "",
	"urgentScore": "",
	"sendDocumentNo": "",
	"documentDepartmentText": "",
	"copySenderText": "",
	"mainSenderText": "",
	"outerFormUrl": "",
	"documentTypeName": "",
	"files": [
		{
			"type": "",
			"name": "",
			"path": ""
		}
	]
}]

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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

