---
title: "供应商分类批量详情查询"
apiId: "2216615072299483136"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类批量详情查询

>  请求方式	POST | Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/vendorclassification/listV3
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页行数 示例：10 默认值：10
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	增量字段pubts 示例：2024-12-08 00:00:00
ids	string	否	否	id条件，多个id逗号隔开 示例：2151531886779826177,2151531886779826178
code	string	否	否	编码,模糊查询 示例：03004
name	string	否	否	名称,模糊查询 示例：金牌供应商
i18ndoc	boolean	否	否	是否查询多语，是的话，多语字段返回map结构 示例：false
vendorclassCondition	string	否	否	额外查询条件 示例：[{"field":"name","op":"eq","value1":"金牌供应商"}]
vendorclassField	string	否	否	额外查询字段 示例：parent.name
crowdOrgsNeedQuery	boolean	否	否	是否需要查询适用范围 示例：false
externalParam	string	否	否	额外参数，例：返回值需要null 示例：{"needReturnNullValue":false}

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/listV3?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"pubts": "2024-12-08 00:00:00",
	"ids": "2151531886779826177,2151531886779826178",
	"code": "03004",
	"name": "金牌供应商",
	"i18ndoc": false,
	"vendorclassCondition": "[{\"field\":\"name\",\"op\":\"eq\",\"value1\":\"金牌供应商\"}]",
	"vendorclassField": "parent.name",
	"crowdOrgsNeedQuery": false,
	"externalParam": "{\"needReturnNullValue\":false}"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageCount	string	否	分页数 示例：1
recordCount	string	否	记录数 示例：25
pageSize	string	否	分页数 示例：10
recordList	object	是	供应商分类数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageCount": "1",
		"recordCount": "25",
		"pageSize": "10",
		"recordList": [
			{
				"id": "2117111134124245000",
				"code": "0304",
				"name": "金牌供应商",
				"level": 1,
				"isEnd": true,
				"path": "2117111134124245000|2117111134124245001",
				"createTime": "2024-10-23 14:16:14",
				"modifyTime": "2025-03-06 14:17:48",
				"isEnabled": true,
				"order": "1",
				"org": "666666",
				"parent": "2107326227938279425",
				"parent_code": "02",
				"vcCrowd_vcCrowdOrgs": [
					{
						"org": "2107326227938279426",
						"org_code": "testA"
					}
				],
				"pubts": "2025-03-06 14:17:48"
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

