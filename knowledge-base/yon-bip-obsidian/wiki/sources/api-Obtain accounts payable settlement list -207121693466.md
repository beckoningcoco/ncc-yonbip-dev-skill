---
title: "获取应付结算清单文件"
apiId: "2071216934667943938"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AP Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AP Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取应付结算清单文件

>  请求方式	POST | AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/payable/file/url
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
fileId	string	是	否	文件id 示例：["mfdfs23421","n95sdavdas"] 最大请求量：20

## 3. 请求示例

Url: /yonbip/EFI/payable/file/url?access_token=访问令牌
Body: {
	"fileId": [
		"mfdfs23421",
		"n95sdavdas"
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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	返回数据
downLoadUrl	string	否	下载地址 示例：https://xxx.oss-cn-beijing-internal.aliyuncs.com/iuap-apcom-file-private/iuap-apcom-file/0000KN5SBWCXXXE9SF0000/2024072616/dfec9f76-1d2f-4481-b759-1b371a0ff65e.png?Expires=1722963021&OSSAccessKeyId=BFFAI5tByXGxxx8mi4vNB75r&Signature=vYZdkMiLPwQTvmibUlJ5HG
fileName	string	否	文件名称 示例：1721982353779821.png
id	string	否	文件id 示例：6565cf9f1xxa4b52490a9958

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"downLoadUrl": "https://xxx.oss-cn-beijing-internal.aliyuncs.com/iuap-apcom-file-private/iuap-apcom-file/0000KN5SBWCXXXE9SF0000/2024072616/dfec9f76-1d2f-4481-b759-1b371a0ff65e.png?Expires=1722963021&OSSAccessKeyId=BFFAI5tByXGxxx8mi4vNB75r&Signature=vYZdkMiLPwQTvmibUlJ5HG",
			"fileName": "1721982353779821.png",
			"id": "6565cf9f1xxa4b52490a9958"
		}
	]
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
	1	2025-07-02	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

