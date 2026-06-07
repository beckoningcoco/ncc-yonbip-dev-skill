---
title: "查询编制方案维度项"
apiId: "2394049319595933699"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Headcount Dimension (Deprecated)"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Headcount Dimension (Deprecated)]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询编制方案维度项

>  请求方式	POST | Headcount Dimension (Deprecated) (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/staffing/schema/querySchemaDimensionItem
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
schemaId	string	否	是	指定编制方案ID，不可以为null 示例：462431984637128041783
dimensionCode	string	否	是	指定维度 code，不可以为null 示例：Position
dimensionItemCodes	string	否	是	指定一个或多个维度项 code，用逗号隔开，不可以为null 示例：001

## 3. 请求示例

Url: /yonbip/HCC/staffing/schema/querySchemaDimensionItem?access_token=访问令牌
Body: {
	"schemaId": "462431984637128041783",
	"dimensionCode": "Position",
	"dimensionItemCodes": "001"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回码 示例：200
message	string	否	操作结果 示例：查询成功
data	object	是	数据
schemaDimensionId	number
小数位数:0,最大长度:10	否	方案的维度id 示例：1585862497503019016
dimensionName	string	否	维度名 示例：岗位
schemaDimensionItemId	number
小数位数:0,最大长度:10	否	方案的维度项id 示例：1721540763504869378
dimensionItemName	string	否	维度项名 示例：测试工程师
dimensionCode	string	否	维度编码 示例：Position
dimensionItemCode	string	否	维度项编码 示例：001

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"schemaDimensionId": 1585862497503019016,
			"dimensionName": "岗位",
			"schemaDimensionItemId": 1721540763504869378,
			"dimensionItemName": "测试工程师",
			"dimensionCode": "Position",
			"dimensionItemCode": "001"
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
500	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-11	
新增
返回参数 dimensionCode
新增
返回参数 dimensionItemCode
v1.03
	2	2025-11-06	
新增
请求参数 dimensionItemCodes
删除
请求参数 dimensionItemCode
更新
返回参数 data
v1.02

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

