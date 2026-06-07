---
title: "表单版本使用的指标信息查询"
apiId: "1956806298747535362"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Reports"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Reports]
platform_version: "BIP"
source_type: community-api-docs
---

# 表单版本使用的指标信息查询

>  请求方式	POST | Financial Reports (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/queryData/externalVerInfo
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
sheetCode	string	否	是	表单编码 示例：bd001
version	string	否	是	表单版本号；来源于查询表单版本接口 示例：0

## 3. 请求示例

Url: /yonbip/qyjx/queryData/externalVerInfo?access_token=访问令牌
Body: {
	"sheetCode": "bd001",
	"version": "0"
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
fixItems	object	是	固定指标集合
name	string	否	指标名称 示例：指标001
code	string	否	指标编码 示例：ZB001
type	string	否	指标类型：0-货币；1-数量；3-枚举；5-文本；6-日期；7-参照；8-档案；11-单价；13-百分比；14-长文本；15-附件 示例：1
digits	string	否	数值类指标的精度 示例：5
enumvalue	string	否	枚举指标的枚举值范围，以;分割 示例：北京;山东;河北;天津;广东
textlength	string	否	文本、长文本指标的长度 示例：50
row	string	否	指标所在的行:从0开始算起 示例：1
col	string	否	指标所在列:从0 示例：1
floatItems	object	是	浮动指标集合
varId	string	否	浮动区id：为了区分不同的浮动区 示例：F_1
items	object	否	单个浮动区指标集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"fixItems": [
			{
				"name": "指标001",
				"code": "ZB001",
				"type": "1",
				"digits": "5",
				"enumvalue": "北京;山东;河北;天津;广东",
				"textlength": "50",
				"row": "1",
				"col": "1"
			}
		],
		"floatItems": [
			{
				"varId": "F_1",
				"items": {
					"name": "指标002",
					"code": "ZB002",
					"type": "0",
					"digits": "10",
					"enumvalue": "北京;山东;河北;天津;广东",
					"textlength": "20",
					"row": "0",
					"col": "0"
				}
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
1026111600003	表单{0}对应的表单组不存在	
1026111600006	表单{0}对应的版本{1}不存在	

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

