---
title: "企业报表获取维度成员接口"
apiId: "1890049501793615877"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Foundation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业报表获取维度成员接口

>  请求方式	POST | EPM Foundation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/br/v1.0/members
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
dimHierId	string	否	是	体系id 示例：1573853158885556245
isLazy	string	否	是	是否懒加载，1为懒加载，0为全加载 示例：0
propIds	string	是	否	属性id集合，用于返回额外属性 示例：["weight","subdatatype"]
treeFatherKey	string	否	否	父级key，用于懒加载
sysCode	string	否	是	sysCode 示例：BR

## 3. 请求示例

Url: /yonbip/qyjx/br/v1.0/members?access_token=访问令牌
Body: {
	"dimHierId": "1573853158885556245",
	"isLazy": "0",
	"propIds": [
		"weight",
		"subdatatype"
	],
	"treeFatherKey": "",
	"sysCode": "BR"
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
code	long	否	状态码 示例：200
data	object	是	data
treeKey	string	否	成员treeKey 示例：0000
treeFatherKey	string	否	父级treeFatherKey 示例：00
id	string	否	成员id 示例：1728199620485447684
code	string	否	成员编码 示例：22
name	object	否	成员多语名称
values	object	否	额外返回属性，propId:propValue
pname	object	否	父多语名称
pid	string	否	父成员id 示例：1790088063490719750
pcode	string	否	父成员编码 示例：res04
success	boolean	否	success 示例：true

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"treeKey": "0000",
			"treeFatherKey": "00",
			"id": "1728199620485447684",
			"code": "22",
			"name": {
				"simplifiedName": "22",
				"englishName": "",
				"traditionalName": ""
			},
			"values": {
				"subdatatype": 0,
				"weight": "1"
			},
			"pname": {
				"simplifiedName": "res04",
				"englishName": "",
				"traditionalName": ""
			},
			"pid": "1790088063490719750",
			"pcode": "res04"
		}
	],
	"success": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

