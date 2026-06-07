---
title: "批量新增消费税视同销售计算表"
apiId: "1834280416632635393"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax Deemed Sales Calculation Sheet"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax Deemed Sales Calculation Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量新增消费税视同销售计算表

>  请求方式	POST | Consumption Tax Deemed Sales Calculation Sheet (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/as-sales/batch-add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgCode	string	否	是	主组织编码 示例：MT0000001
periodDate	string	否	是	所属日期，格式：yyyy-MM-dd 示例：2023-10-01
goodsTaxName	string	否	是	应税消费品名称 示例：白酒（复合计税）
productCode	string	否	否	产品编码 示例：2534000004
transactionType	string	否	是	交易类型，枚举值（1-自产自用应税消费品用于生产非应税消费品 2-自产自用应税消费品用于在建工程 3-自产自用应税消费品用于管理部门 4-自产自用应税消费品用于非生产机构 5-自产自用应税消费品用于提供劳务 6-自产自用应税消费品用于馈赠 7-自产自用应税消费品用于赞助 8-自产自用应税消费品用于集资 9-自产自用应税消费品用于广告 10-自产自用应税消费品用于样品 11-自产自用应税消费品用于职工福利 12-自产自用应税消费品用于奖励 13-自产自用应税消费品用于其他） 示例：11
tax	string	否	否	征免税，枚举值（1:征税，2:免税），产品编码为空则必传 示例：1
completePolicy	string	否	否	减（免）性质代码。产品编码为空，征免税为免税时必填 示例：0002061004|节能环保涂料免税|《财政部 国家税务总局关于对电池涂料征收消费的通知》财税〔2015〕16号第二条第三款
reliefProductName	string	否	否	减免项目名称。产品编码为空，征免税为免税时必填 示例：节能环保涂料免税
saleNumber	BigDecimal	否	否	销售数量 示例：81
originalValue	BigDecimal	否	否	账面销售数量 示例：6
remark	string	否	否	备注 示例：备注信息
sourceId	string	否	是	来源ID 示例：aaf9469e1eb1581fbd66a977e4df3601
projectCode	string	否	否	项目编码 示例：30001

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/as-sales/batch-add?access_token=访问令牌
Body: [{
	"orgCode": "MT0000001",
	"periodDate": "2023-10-01",
	"goodsTaxName": "白酒（复合计税）",
	"productCode": "2534000004",
	"transactionType": "11",
	"tax": "1",
	"completePolicy": "0002061004|节能环保涂料免税|《财政部 国家税务总局关于对电池涂料征收消费的通知》财税〔2015〕16号第二条第三款",
	"reliefProductName": "节能环保涂料免税",
	"saleNumber": 81,
	"originalValue": 6,
	"remark": "备注信息",
	"sourceId": "aaf9469e1eb1581fbd66a977e4df3601",
	"projectCode": "30001"
}]

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
displayCode	string	否	异常码
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	消息 示例：成功
data	object	否	数据 示例：[{"id":"1843482212234166276","sourceId":"aaf9469e1eb1581fbd66a977e4df3601"}]
id	string	否	新增数据主键ID 示例：1843482212234166276
sourceId	string	否	业务来源ID 示例：aaf9469e1eb1581fbd66a977e4df3601

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"id": "1843482212234166276",
			"sourceId": "aaf9469e1eb1581fbd66a977e4df3601"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	系统异常	错误提示信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-24	
更新
请求说明
新增
请求参数 defineTerm

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

