---
title: "采购委托关系数据同步"
apiId: "40a1d87863bc43cf95c58d9211b61953"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购委托关系数据同步

>  请求方式	GET | Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/purchasedelegate/qrydelegate/sync
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
inventoryOrg	string	query	否	需求组织    示例: 1293220592521473
managementClass	string	query	否	物料分类    示例: 1441879321350400
product	string	query	否	物料    示例: 1471806659481856
purchaseOrg	string	query	否	采购组织    示例: 1293331735318784
receiveOrg	string	query	否	默认收货组织    示例: 1293256121766144
billingOrg	string	query	否	收票组织    示例: 1293331735318784
pageIndex	int	query	否	当前页数    示例: 1
pageSize	int	query	否	当前行数    示例: 10

## 3. 请求示例

Url: /yonbip/digitalModel/purchasedelegate/qrydelegate/sync?access_token=访问令牌&inventoryOrg=1293220592521473&managementClass=1441879321350400&product=1471806659481856&purchaseOrg=1293331735318784&receiveOrg=1293256121766144&billingOrg=1293331735318784&pageIndex=1&pageSize=10

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
code	int	否	返回码，调用成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据集合
pageIndex	int	否	当前页数 示例：0
pageSize	int	否	每页行数 示例：0
recordCount	int	否	总数 示例：13
recordList	object	是	数据链表
pageCount	int	否	总页数 示例：0
beginPageIndex	int	否	开始页码（第一页） 示例：0
endPageIndex	int	否	结束页码（有多少页） 示例：0
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 13,
		"recordList": [
			{
				"inventoryOrg": "1195381116621056",
				"managementClass": "1443329389039872",
				"product_name": "xhCS11060001",
				"product": "1471806659481856",
				"billingOrg": "0548746360f64217bf34f6940a4247a5",
				"inventoryOrg_name": "FIZM组织-库存",
				"receiveOrg": "1293331735318784",
				"receiveOrg_name": "yyonly采购",
				"isDefault": 0,
				"enable": 1,
				"billingOrg_name": "盖天力公司",
				"purchaseOrg_name": "CZM采购组织",
				"id": "1498332505723136",
				"pubts": "2019-11-25 11:02:38",
				"dr": 1,
				"purchaseOrg": "1265104932065536"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-000512
	查询数据为空	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑错误	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
删除
请求参数 pubts
新增
返回参数 displayCode
新增
返回参数 level
更新
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

