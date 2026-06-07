---
title: "供应商档案增量附件查询"
apiId: "1867215703301423109"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案增量附件查询

>  请求方式	POST | Supplier (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/api/vendor/incrementAttachment
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
beginTime	string	否	是	起始时间 示例：2023-10-01 00:00:00
endTime	string	否	否	结束时间 示例：2024-01-26 00:00:00
businessType	string	否	是	附件业务类型 示例：iuap-apdoc-vendor 默认值：iuap-apdoc-vendor
pageIndex	int	否	是	当前页索引 示例：1 默认值：1
pageSize	int	否	是	每页数量 示例：10 默认值：10
isDeleted	boolean	否	是	查询新增附件为false 查询删除附件为true 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/digitalModel/api/vendor/incrementAttachment?access_token=访问令牌
Body: {
	"beginTime": "2023-10-01 00:00:00",
	"endTime": "2024-01-26 00:00:00",
	"businessType": "iuap-apdoc-vendor",
	"pageIndex": 1,
	"pageSize": 10,
	"isDeleted": false
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
pageIndex	int	否	当前页索引
pageSize	int	否	每页数量
recordCount	int	否	数据总数
recordList	object	是	数据列表
archiveId	string	否	供应商档案ID
attachmentBusinessType	string	否	附件业务类型
attachmentBusinessId	string	否	附件业务ID
attachmentFileId	string	否	文件ID
fileSize	long	否	文件大小
fileName	string	否	文件名称
downloadUrl	string	否	下载地址
fileExtension	string	否	文件后缀
filePath	string	否	文件路径
fileCreateTime	string	否	文件创建时间
syncTime	string	否	同步时间

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"archiveId": "",
				"attachmentBusinessType": "",
				"attachmentBusinessId": "",
				"attachmentFileId": "",
				"fileSize": 0,
				"fileName": "",
				"downloadUrl": "",
				"fileExtension": "",
				"filePath": "",
				"fileCreateTime": "",
				"syncTime": ""
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
999	error	异常

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

