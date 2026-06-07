---
title: "采购委托关系列表查询"
apiId: "f26eb5c0a15a4a67a10f870ecd397197"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购委托关系列表查询

>  请求方式	POST | Purchase Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/purchaseDelegate/list
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
pageIndex	int	否	是	页码
pageSize	int	否	是	数量
inventoryOrg	string	否	否	需求组织id 示例：2077270497267968
inventoryOrgCode	string	否	否	需求组织编码 示例：cc123
purchaseOrg	string	否	否	采购组织id 示例：2077265414787328
purchaseOrgCode	string	否	否	采购组织编码 示例：cc123
billingOrg	string	否	否	开票组织id 示例：2077270907539712
billingOrgCode	string	否	否	开票组织编码 示例：cc123
receiveOrg	string	否	否	收货组织id 示例：2077265414787328
receiveOrgCode	string	否	否	收货组织编码 示例：cc123
managementClass	long	否	否	物料分类id 示例：2344868588081408
managementClassCode	string	否	否	物料分类编码 示例：12311
product	long	否	否	物料id 示例：2338139603065088
productCode	string	否	否	物料编码 示例：cc123

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseDelegate/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"inventoryOrg": "2077270497267968",
	"inventoryOrgCode": "cc123",
	"purchaseOrg": "2077265414787328",
	"purchaseOrgCode": "cc123",
	"billingOrg": "2077270907539712",
	"billingOrgCode": "cc123",
	"receiveOrg": "2077265414787328",
	"receiveOrgCode": "cc123",
	"managementClass": 2344868588081408,
	"managementClassCode": "12311",
	"product": 2338139603065088,
	"productCode": "cc123"
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
code	long	否	请求编码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	内容
pageIndex	long	否	页码 示例：1
pageSize	long	否	数量 示例：20
recordCount	long	否	总条数 示例：0
recordList	object	是	记录列表
pageCount	long	否	总页数 示例：0
beginPageIndex	long	否	当前页 示例：1
endPageIndex	long	否	最后一页 示例：1
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

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
				"product": 2176909670207744,
				"product_name": "0318 新物料",
				"inventory_org": "2166975486939648",
				"inventory_org_name": "cc1234",
				"billing_org": "2166975486939648",
				"billing_org_name": "cc1234",
				"purchase_org": "2166975486939648",
				"purchase_org_name": "cc1234",
				"enable": 1,
				"isDefault": "1",
				"id": "2192414137274624",
				"receiveOrg": "2166975486939648",
				"receiveOrg_name": "cc1234",
				"managementClass": 2206628491333888,
				"managementClass_name": "whg分类",
				"pubts": "2021-06-07 14:40:39"
			}
		],
		"pageCount": 0,
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

