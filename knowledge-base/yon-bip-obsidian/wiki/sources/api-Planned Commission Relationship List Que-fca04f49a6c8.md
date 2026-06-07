---
title: "计划委托关系列表查询"
apiId: "fca04f49a6c84c76b16fe9b34ac1d9ed"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Plan Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Plan Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划委托关系列表查询

>  请求方式	POST | Plan Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/planDelegate/list
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
inventoryOrg	string	否	否	库存组织 示例：19516140228167
inventoryOrgCode	string	否	否	库存组织编码 示例：xxx
planClass	string	否	否	物流计划分类 示例：1951614022816768
planClassCode	string	否	否	物流计划分类编码 示例：345
planOrg	string	否	否	计划组织 示例：1951591063933184
planOrgCode	string	否	否	计划组织编码 示例：ghj
enable	string	否	否	启用状态 0-未启用；1-启用；2-停用 示例：1

## 3. 请求示例

Url: /yonbip/digitalModel/planDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20",
	"inventoryOrg": "19516140228167",
	"inventoryOrgCode": "xxx",
	"planClass": "1951614022816768",
	"planClassCode": "345",
	"planOrg": "1951591063933184",
	"planOrgCode": "ghj",
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	后端服务返回的数据部分
pageIndex	long	否	当前页 示例：1
pageSize	long	否	每页页数 示例：20
recordCount	long	否	总条数 示例：1
recordList	object	是	返回数据列表
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	最后一页 示例：1
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator_userName": "YonSuite默认用户",
				"inventory_org_name": "tlw验随单参数",
				"planClass": "1978520156082432",
				"planOrg_name": "组织0329-1",
				"planClass_Code": "计划分类1",
				"planClass_Name": "计划分类1",
				"planOrg": "1930355100128256",
				"enable": 0,
				"inventory_org": "1955870188671488",
				"id": "2353502743531776",
				"creationtime": "2021-07-21 13:46:48",
				"pubts": "2021-07-21 13:46:48"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-000514
	根据id未查询到任何数据,请输入正确的id	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

