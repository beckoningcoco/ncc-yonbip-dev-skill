---
title: "采购云获取附件下载地址"
apiId: "1940465588847509513"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购云获取附件下载地址

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/fileServiceOpenApi/getFileDownLoadUrl
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
billCode	string	否	是	单据编号 示例：QTRK20231009552748
businessType	string	否	是	单据标识，采购云统一：diwork_yuncai 示例：diwork_yuncai
businessid	string	否	是	附件关联ID，一般为单据页面下指定附件字段对应存储的附件id，例如外部附件(externalFileId) ：4758e16e-7b0e-4461-9389-f05b3f659226 示例：4758e16e-7b0e-4461-9389-f05b3f659226

## 3. 请求示例

Url: /yonbip/cpu/fileServiceOpenApi/getFileDownLoadUrl?access_token=访问令牌
Body: [{
	"billCode": "QTRK20231009552748",
	"businessType": "diwork_yuncai",
	"businessid": "4758e16e-7b0e-4461-9389-f05b3f659226"
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
code	string	否	状态 示例：200
message	string	否	信息 示例：操作成功
data	object	是	返回数据
billCode	string	否	单据编号 示例：QTRK20231009552748
downLoadUrl	string	否	下载地址 示例：https://bip-daily.yonyoucloud.com/iuap-apcom-file/rest/v1/file/list/zip/stream?fromDevice=sdk&token=1&fileIds=2,6&isWaterMar=false
businessid	string	否	附件关联id 示例：4758e16e-7b0e-4461-9389-f05b3f659226

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"billCode": "QTRK20231009552748",
			"downLoadUrl": "https://bip-daily.yonyoucloud.com/iuap-apcom-file/rest/v1/file/list/zip/stream?fromDevice=sdk&token=1&fileIds=2,6&isWaterMar=false",
			"businessid": "4758e16e-7b0e-4461-9389-f05b3f659226"
		}
	]
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
	1	2025-06-24	
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

