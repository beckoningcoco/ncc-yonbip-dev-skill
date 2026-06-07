---
title: "根据类型和起始时间从协同获取增量删除附件信息"
apiId: "1809763618022490118"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据类型和起始时间从协同获取增量删除附件信息

>  请求方式	POST | Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/attachment/querydeletedattachment
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
beginTime	string	否	是	起始时间 示例：2023-09-05 12:00:00
businessType	string	否	是	附件类型：取以下对应code： 客户附件:MERCHANT_ATTACHMENT; 示例：MERCHANT_ATTACHMENT
pageIndex	long	否	是	当前页索引 示例：1
pageSize	long	否	是	页大小 示例：10

## 3. 请求示例

Url: /yonbip/digitalModel/attachment/querydeletedattachment?access_token=访问令牌
Body: {
	"beginTime": "2023-09-05 12:00:00",
	"businessType": "MERCHANT_ATTACHMENT",
	"pageIndex": 1,
	"pageSize": 10
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
success	boolean	否	成功标识 示例：false
message	string	否	提示信息 示例：处理成功
code	long	否	状态码：200代表成功 示例：200
data	object	否	返回值数据对象
pageIndex	long	否	当前页索引 示例：1
pageSize	long	否	页大小 示例：10
recordCount	long	否	数据条数 示例：160
recordList	object	是	数据列表

## 5. 正确返回示例

{
	"success": false,
	"message": "处理成功",
	"code": 200,
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 160,
		"recordList": [
			{
				"archiveId": "12345",
				"attachmentBusinessId": "abcd1234",
				"attachmentFileId": "abcd1234",
				"syncTime": "2023-09-05 12:00:00"
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
-1	系统异常，请稍后再说	系统异常，请联系管理员处理

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

