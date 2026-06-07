---
title: "每日金价列表查询"
apiId: "1437196782863384576"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Gold Price"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Gold Price]
platform_version: "BIP"
source_type: community-api-docs
---

# 每日金价列表查询

>  请求方式	POST | Daily Gold Price (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/aurumprice/list
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
pageSize	int	否	否	分页大小 示例：100 默认值：100
pageIndex	int	否	否	分页尺寸 示例：1 默认值：1
code	string	否	否	单据编号 示例：MRJJ20220421000001
vouchdate	string	否	否	单据日期 示例：2022-04-21
status	string	否	否	单据状态0未审批1已审批 示例：0

## 3. 请求示例

Url: /yonbip/sd/uretail/aurumprice/list?access_token=访问令牌
Body: {
	"pageSize": 100,
	"pageIndex": 1,
	"code": "MRJJ20220421000001",
	"vouchdate": "2022-04-21",
	"status": "0"
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
code	string	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据节点
pageIndex	long	否	分页码 示例：1
pageSize	long	否	分页大小 示例：100
recordCount	long	否	记录数 示例：2
recordList	object	是	记录集
pageCount	long	否	分页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	截止页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 2,
		"recordList": [
			{
				"creator": "周某某的号",
				"code": "MRJJ20220512000001",
				"modifyDate": "2022-05-07 00:00:00",
				"modifier": "周某某的号",
				"auditor": "周某某的号",
				"memo": "备注",
				"vouchdate": "2022-05-12 00:00:00",
				"modifyTime": "2022-05-07 16:52:26",
				"createTime": "2022-05-07 15:22:56",
				"auditTime": "2022-05-07 16:45:34",
				"id": 2764114757079808,
				"pubts": "2022-05-07 16:52:26",
				"tplid": 0,
				"status": 0,
				"auditDate": "2022-05-07 00:00:00",
				"createDate": "2022-05-07 00:00:00"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
	1	2025-06-25	
更新
返回参数 (26)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

