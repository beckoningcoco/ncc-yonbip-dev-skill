---
title: "合并报表-获取某个应用模型包含的所有维度层"
apiId: "1893151919881846792"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Information Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Information Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-获取某个应用模型包含的所有维度层

>  请求方式	POST | Dimension Information Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/bcs/v1.0/dimlevels
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
cubeId	string	否	是	模型Id

## 3. 请求示例

Url: /yonbip/qyjx/bcs/v1.0/dimlevels?access_token=访问令牌
Body: {
	"cubeId": ""
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
code	string	否	返回状态码 示例：200
data	object	是	数据对象
dimLevelId	string	否	维度层主键 示例：1889341287354073097
dimLevelCode	string	否	维度层编码 示例：cs
shortCode	string	否	简码
multiLang	object	否	维度多语对象

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"dimLevelId": "1889341287354073097",
			"dimLevelCode": "cs",
			"shortCode": "",
			"multiLang": {
				"text": "cs",
				"text2": "",
				"text3": "",
				"text4": "",
				"text5": "",
				"text6": "",
				"currLangIndex": 1
			}
		}
	]
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
	1	2026-04-20	
更新
请求说明
新增
返回参数 currLangIndex
更新
返回参数 (7)
删除
返回参数 success

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

