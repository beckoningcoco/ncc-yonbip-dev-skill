---
title: "核算委托关系列表查询"
apiId: "f9bd3ec3c81a44199ac39bcda466227a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 核算委托关系列表查询

>  请求方式	POST | Accounting Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/accountDelegate/list
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
pageIndex	string	否	是	当前页数 示例：1
pageSize	string	否	是	每页数量 示例：20
adminOrg	string	否	否	业务单元 示例：1951614022816768
adminOrgCode	string	否	否	业务单元编码 示例：56rt
finOrg	string	否	否	会计主体 示例：1951591063933184
finOrgCode	string	否	否	会计主体编码 示例：xxcs
enable	string	否	否	启用状态 0-未启用；1-启用；2-停用 示例：1

## 3. 请求示例

Url: /yonbip/digitalModel/accountDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"adminOrg": "1951614022816768",
	"adminOrgCode": "56rt",
	"finOrg": "1951591063933184",
	"finOrgCode": "xxcs",
	"enable": "1"
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
code	long	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	后端服务返回的数据部分
pageIndex	long	否	当前页 示例：1
pageSize	long	否	每页数量 示例：20
recordCount	long	否	总条数 示例：0
recordList	object	是	记录列表
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	最后一页 示例：0
displayCode	string	否	业务异常码 示例：000-545-100001
level	string	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"admin_org_name": "U8EX",
				"creator": "3c8a4587-ee13-4740-be79-dff184bd9501",
				"creator_userName": "不要乱改我叫吴签",
				"fin_org": "1325945239736576",
				"modifiedtime": "2020-09-08 13:59:45",
				"admin_org": "1293220592521473",
				"enable": 2,
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"modifier_userName": "不要乱改我叫吴签",
				"fin_org_name": "ks002",
				"id": "1512951222325504",
				"creationtime": "2019-12-05 18:53:34",
				"pubts": "2019-12-05 18:53:34",
				"data_source": "bd.delegate.AccountingDelegateVO"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
	},
	"displayCode": "000-545-100001",
	"level": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-000514
	根据id未查询到任何数据,请输入正确的id	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

