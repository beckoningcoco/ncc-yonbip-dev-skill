---
title: "根据表单实例ID查询公文详情"
apiId: "2054872711493582856"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Official Documents"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Official Documents]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据表单实例ID查询公文详情

>  请求方式	GET | Official Documents (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/official/document/info
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
formInstanceId	string	query	是	表单实例ID（pkboins）

## 3. 请求示例

Url: /yonbip/uspace/openapi/official/document/info?access_token=访问令牌&formInstanceId=

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
flag	string	否	返回状态，0正常，1失败
desc	string	否	返回描述
data	object	否	返回数据
id	string	否	公文ID
tenantId	string	否	租户ID
userId	string	否	用户ID
orgId	string	否	组织ID
formTemplateId	string	否	表单模板ID（pkbo）
formInstanceId	string	否	表单实例ID（pkboins）
processInstanceId	string	否	流程实例ID
processDefinitionId	string	否	流程定义ID
title	string	否	公文标题
type	string	否	公文分类，1发文，0收文
fileId	string	否	正文文件id（wps租户使用）
filePath	string	否	正文word文件地址
pdfPath	string	否	正文pdf文件地址
signPdfPath	string	否	签章文件pdf路径（使用电子合同或点聚签章租户）
ofdPath	string	否	OFD文件路径
documentTypeId	string	否	公文类型ID
documentTypeName	string	否	公文类型名称
initiatorId	string	否	流程发起人ID
initiatorDeptId	string	否	公文流程发起部门ID
sendDocumentNo	string	否	发文字号
sourceDocumentNo	string	否	来文文号
receiveDocumentNo	string	否	收文编号
approveStatus	string	否	公文审批状态
formUrl	string	否	公文单据详情地址

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"flag": "",
		"desc": "",
		"data": {
			"id": "",
			"tenantId": "",
			"userId": "",
			"orgId": "",
			"formTemplateId": "",
			"formInstanceId": "",
			"processInstanceId": "",
			"processDefinitionId": "",
			"title": "",
			"type": "",
			"fileId": "",
			"filePath": "",
			"pdfPath": "",
			"signPdfPath": "",
			"ofdPath": "",
			"documentTypeId": "",
			"documentTypeName": "",
			"initiatorId": "",
			"initiatorDeptId": "",
			"sendDocumentNo": "",
			"sourceDocumentNo": "",
			"receiveDocumentNo": "",
			"approveStatus": "",
			"formUrl": ""
		}
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

