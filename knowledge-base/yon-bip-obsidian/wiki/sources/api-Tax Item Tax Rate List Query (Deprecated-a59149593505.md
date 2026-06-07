---
title: "税目税率列表查询（废弃）"
apiId: "a59149593505416cb550e50c4a99aa78"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 税目税率列表查询（废弃）

>  请求方式	POST | Material Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/taxrate/findByList
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
pageSize	long	否	是	分页大小，最大支持500条 示例：10
pageIndex	long	否	是	第几页 示例：1
code	string	否	否	编码
name	string	否	否	名称

## 3. 请求示例

Url: /yonbip/digitalModel/taxrate/findByList?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"code": "",
	"name": ""
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageIndex	int	否	第几页
pageSize	int	否	每页的大小
pageCount	int	否	一共多少页
beginPageIndex	int	否	第一页
endPageIndex	int	否	最后一页
recordCount	int	否	记录的数量
pubts	string	否	时间戳
recordList	object	是	数据集合

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"dr": "",
				"id": "",
				"code": "",
				"name": "",
				"ntaxRate": "",
				"scope": "",
				"taxFree": true,
				"noTaxation": true,
				"pubts": "",
				"enable": "",
				"log": ""
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
999	操作失败	

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

