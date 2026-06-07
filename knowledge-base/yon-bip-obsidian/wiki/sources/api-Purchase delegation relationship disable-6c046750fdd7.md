---
title: "采购委托关系停用"
apiId: "6c046750fdd7456987f05b03b28aa27a"
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

# 采购委托关系停用

>  请求方式	POST | Purchase Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/purchaseDelegate/stop
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
data	object	否	是	参数内容
id	string	否	是	采购委托主键id 示例：2342175281172736

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseDelegate/stop?access_token=访问令牌
Body: {
	"data": {
		"id": "2342175281172736"
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
code	long	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	内容
_entityName	string	否	实体名称
_keyName	string	否	集合中的key值
id	string	否	主键 示例：2192414706536704
_status	string	否	状态
enable	long	否	状态 0未启用 1.启用 2停用 示例：2
dr	long	否	删除标识 0-未删除；1-已删除 示例：0
yhtTenant	string	否	友互通租户 示例：0000KM326ZLK32VJ0L0000
tenant	string	否	租户 示例：0000KM326ZLK32VJ0L0000
yhtTenantId	string	否	友互通租户id 示例：0000KM326ZLK32VJ0L0000
pubts	string	否	时间戳 示例：2021-07-21 15:34:35
billingOrg	string	否	开票组织id 示例：2166975486939648
inventoryOrg	string	否	需求组织id 示例：2166975486939648
purchaseOrg	string	否	采购组织id 示例：2166975486939648
isDefault	string	否	是否默认 0否 1是 示例：1
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"id": "2192414706536704",
		"_status": "",
		"enable": 2,
		"dr": 0,
		"yhtTenant": "0000KM326ZLK32VJ0L0000",
		"tenant": "0000KM326ZLK32VJ0L0000",
		"yhtTenantId": "0000KM326ZLK32VJ0L0000",
		"pubts": "2021-07-21 15:34:35",
		"billingOrg": "2166975486939648",
		"inventoryOrg": "2166975486939648",
		"purchaseOrg": "2166975486939648",
		"isDefault": "1"
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
删除
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

