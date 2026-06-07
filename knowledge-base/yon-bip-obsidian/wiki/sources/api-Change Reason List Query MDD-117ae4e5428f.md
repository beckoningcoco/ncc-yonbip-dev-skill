---
title: "变动原因列表查询MDD"
apiId: "117ae4e5428f4015b0105dd3db276045"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reason of Change"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reason of Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 变动原因列表查询MDD

>  请求方式	POST | Reason of Change (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/changereason/list
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
pageIndex	long	否	否	页码 示例：1 默认值：1
pageSize	long	否	否	每页大小 示例：10 默认值：10
transferAndResignation	long	否	否	变动事件：3调动，4离职 示例：3
simple	object	否	否	扩展查询
pubts	string	否	否	查询大于等于该时间戳的数据 示例：2024-03-13 20:15:10
enable	long	否	否	停启用状态：1启用，0停用 示例：1
trans_type	string	否	否	变动类型id
transtypecode	string	否	否	变动类型code

## 3. 请求示例

Url: /yonbip/hrcloud/changereason/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"transferAndResignation": 3,
	"simple": {
		"pubts": "2024-03-13 20:15:10"
	},
	"enable": 1,
	"trans_type": "",
	"transtypecode": ""
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
code	string	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	每页条数 示例：10
recordCount	long	否	总数量 示例：40
recordList	object	是	数据列表
pageCount	long	否	页数 示例：4
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	终止页 示例：4

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 40,
		"recordList": [
			{
				"trans_type_name": "组织内变动",
				"code": "3001001",
				"enable": 1,
				"name": "汇报关系变化",
				"memo": "这是描述",
				"id": "2504973473992960",
				"pubts": "2021-11-05 13:50:48",
				"trans_type": "2504973428986113"
			}
		],
		"pageCount": 4,
		"beginPageIndex": 1,
		"endPageIndex": 4
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
403	Forbidden: DomainKey uniform no valid!	转换后端访问地址

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

