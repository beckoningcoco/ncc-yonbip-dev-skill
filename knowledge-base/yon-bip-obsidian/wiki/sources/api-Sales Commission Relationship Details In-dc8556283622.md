---
title: "销售委托关系详情查询"
apiId: "dc8556283622445cb765373e1237e82a"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Sales Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售委托关系详情查询

>  请求方式	GET | Sales Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/salesDelegate/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	主键    示例: 2352290713604352

## 3. 请求示例

Url: /yonbip/digitalModel/salesDelegate/detail?access_token=访问令牌&id=2352290713604352

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
salesOrg_name	string	否	销售组织名称 示例：春风5
billingOrg_name	string	否	会计组织名称 示例：维维公司1
salesOrg	string	否	销售组织ID 示例：2148246259470592
inventoryOrg	string	否	库存组织ID 示例：2173731750269440
billingOrg	string	否	会计组织ID 示例：2148051396645120
inventoryOrg_name	string	否	库存组织名称 示例：Z销售部
isDefault	long	否	是否默认 示例：0
enable	long	否	启用状态 0-未启用；1-启用 示例：2
id	string	否	主键 示例：2352290713604352
pubts	string	否	时间戳 示例：2021-07-20 17:28:11
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"salesOrg_name": "春风5",
		"billingOrg_name": "维维公司1",
		"salesOrg": "2148246259470592",
		"inventoryOrg": "2173731750269440",
		"billingOrg": "2148051396645120",
		"inventoryOrg_name": "Z销售部",
		"isDefault": 0,
		"enable": 2,
		"id": "2352290713604352",
		"pubts": "2021-07-20 17:28:11"
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

