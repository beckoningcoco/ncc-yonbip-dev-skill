---
title: "合并报表-报表数据中心某个应用模型下导出指定自选表数据或模板-非长轮询接口"
apiId: "1996184818084741122"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-报表数据中心某个应用模型下导出指定自选表数据或模板-非长轮询接口

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/openAPI/report/optionalformexportnolang
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
pk_cube	string	否	是	应用模型编码
information	object	否	否	已打开表参数维维度信息Map<String,String>
exportFormat	string	否	是	导出格式:EXCEL\PDF 默认值：EXCEL
exportScheme	string	否	否	PDF导出方案：如果导出格式为PDF，则必填，导出方案主键
exportTemplate	boolean	否	否	是否导出模板 默认值：false
sheetNameMethod	string	否	否	导出execl中页签表单命名：名称：name; 导出execl中页签表单命名：编码：code; 导出execl中页签表单命名：编码和名称：codeAndName; 默认值：codeAndName
pkSheets	string	否	否	自选导出的表单编码集合
numberOfFiles	string	否	是	导出文件个数标识：0-单文件导出，1-多文件导出 默认值：0
subTable	string	否	是	文件拆分依据 文件拆分依据：0-表单分文件 1-多选维度分文件 2-按照表单和多选维度进行拆分 默认值：0
uploadFileServer	string	否	是	OpenAPI 中会用到，如果为true, 表示上传文件服务器并将文件ID返回，如果为false，则返回文件流的BASE64字符串 默认值：false
dimCode	object	否	是	导出表单参数维信息

## 3. 请求示例

Url: /yonbip/qyjx/openAPI/report/optionalformexportnolang?access_token=访问令牌
Body: {
	"pk_cube": "",
	"information": {},
	"exportFormat": "",
	"exportScheme": "",
	"exportTemplate": true,
	"sheetNameMethod": "",
	"pkSheets": "",
	"numberOfFiles": "",
	"subTable": "",
	"uploadFileServer": "",
	"dimCode": {}
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
code	string	否	状态码 示例：200
data	object	否	导出文件 base64 字符串
fileInLongOperate	string	否	返回文件服务器ID或文件的Base64字符串
message	string	否	本次导出的日志信息
success	string	否	接口返回状态 示例：success

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"fileInLongOperate": "",
		"message": "",
		"success": "success"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-20	
更新
请求说明
新增
返回参数 success
更新
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

