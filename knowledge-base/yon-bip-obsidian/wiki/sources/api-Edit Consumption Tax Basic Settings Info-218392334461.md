---
title: "编辑消费税基础设置信息"
apiId: "2183923344611999747"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 编辑消费税基础设置信息

>  请求方式	POST | Consumption Tax Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/basicinfo/edit
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
record	object	否	是	消费税基础设置记录
sourceId	string	否	否	数据提供方提供的ID，作为编辑时的唯一识别标识，与新增接口的sourceId相对应 示例：fds323fhjtocbpp2
orgCode	string	否	否	税务组织编码 示例：FTO001
goodsTaxName	string	否	否	应税消费品名称 示例：白酒（复合计税）
goodsTaxNameOffice	string	否	否	应税消费品名称（申报表） 示例：白酒（复合计税）
goodsTaxNameOfficeProcess	string	否	否	应税消费品名称（委托加工） 示例：白酒（复合计税）
calcNameDeclare	string	否	否	计量单位（申报表） 示例：升
products	object	是	否	产品明细记录

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/basicinfo/edit?access_token=访问令牌
Body: {
	"record": {
		"sourceId": "fds323fhjtocbpp2",
		"orgCode": "FTO001",
		"goodsTaxName": "白酒（复合计税）",
		"goodsTaxNameOffice": "白酒（复合计税）",
		"goodsTaxNameOfficeProcess": "白酒（复合计税）",
		"calcNameDeclare": "升",
		"products": [
			{
				"productCode": "T001",
				"coefficientUnit": 2,
				"productDate": "2024-11-11",
				"outsideSale": "Y",
				"tax": "2",
				"completePolicy": "0002061004|节能环保涂料免税|《财政部 国家税务总局关于对电池涂料征收消费的通知》财税〔2015〕16号第二条第三款",
				"reliefProductName": "某某项目名称",
				"benable": "Y"
			}
		]
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
creator	string	否	创建人
displayCode	string	否	异常码
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	消息 示例：成功
data	object	否	数据
id	string	否	新增数据主键ID 示例：1843482212234166276
sourceId	string	否	业务来源ID 示例：aaf9469e1eb1581fbd66a977e4df3601

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"id": "1843482212234166276",
		"sourceId": "aaf9469e1eb1581fbd66a977e4df3601"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
037-502-102999
	获取所有的会计主体异常	

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
请求参数 calcNameDeclare
	2	2025-07-03	
更新
请求说明
更新
请求参数 orgCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

