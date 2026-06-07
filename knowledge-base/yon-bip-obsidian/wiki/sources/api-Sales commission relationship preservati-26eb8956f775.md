---
title: "sysid	string	否	系统标识 示例：diwork"
apiId: "26eb8956f7754400942c3379e9e40d49"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# sysid	string	否	系统标识 示例：diwork

>  请求方式	POST | Sales Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/salesDelegate/save
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
data	object	否	是	数据集合
salesOrg	string	否	否	销售组织id，销售组织id和销售组织编码不能同时为空，id和编码同时存在，以id为准 示例：2148246259470592
salesOrgCode	string	否	否	销售组织编码，销售组织id和销售组织编码不能同时为空，id和编码同时存在，以id为准 示例：456
inventoryOrg	string	否	否	库存组织id，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：2173731750269440
inventoryOrgCode	string	否	否	库存组织编码，库存组织id和库存组织编码不能同时为空，id和编码同时存在，以id为准 示例：tyu
billingOrg	string	否	否	开票组织id，开票组织id和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：2148051396645120
billingOrgCode	string	否	否	开票组织编码，开票组织d和开票组织编码不能同时为空，id和编码同时存在，以id为准 示例：5678
enable	string	否	是	状态 0：未启用；1：启用 示例：1
isDefault	string	否	是	是否默认0：否；1：是 示例：0

## 3. 请求示例

Url: /yonbip/digitalModel/salesDelegate/save?access_token=访问令牌
Body: {
	"data": {
		"salesOrg": "2148246259470592",
		"salesOrgCode": "456",
		"inventoryOrg": "2173731750269440",
		"inventoryOrgCode": "tyu",
		"billingOrg": "2148051396645120",
		"billingOrgCode": "5678",
		"enable": "1",
		"isDefault": "0"
	}
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
code	long	否	响应码 示例：200
message	string	否	响应内容 示例：操作成功
data	object	否	响应数据
salesOrg	string	否	销售组织ID 示例：2148246259470592
inventoryOrg	string	否	库存组织ID 示例：2173731750269440
billingOrg	string	否	开票组织ID 示例：2148051396645120
isDefault	string	否	是否默认 示例：0
enable	long	否	是否启用 示例：1
dr	long	否	是否删除 示例：0
id	string	否	委托关系ID 示例：2352290713604352
creator	string	否	创建人 示例：1838579e-6b2a-40e0-8c36-9d64817ba53c
creationtime	string	否	创建时间 示例：2021-07-20 17:13:51
dataSource	string	否	数据源 示例：bd.delegate.SalesDelegateVO
pubts	string	否	发布时间 示例：2021-07-20 17:13:51
yhtTenant	string	否	租户ID 示例：wcdygd34
tenant	string	否	租户ID 示例：wcdygd34
yhtTenantId	string	否	租户ID 示例：wcdygd34
yTenantId	string	否	租户ID 示例：wcdygd34
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"salesOrg": "2148246259470592",
		"inventoryOrg": "2173731750269440",
		"billingOrg": "2148051396645120",
		"isDefault": "0",
		"enable": 1,
		"dr": 0,
		"id": "2352290713604352",
		"creator": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
		"creationtime": "2021-07-20 17:13:51",
		"dataSource": "bd.delegate.SalesDelegateVO",
		"sysid": "diwork",
		"pubts": "2021-07-20 17:13:51",
		"yhtTenant": "wcdygd34",
		"tenant": "wcdygd34",
		"yhtTenantId": "wcdygd34",
		"yTenantId": "wcdygd34"
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
999	销售组织+库存组织已经存在，不允许重复，请检	

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

