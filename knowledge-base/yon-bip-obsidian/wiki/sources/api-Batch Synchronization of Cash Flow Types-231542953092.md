---
title: "现金流量类型批量同步（集成流）"
apiId: "2315429530922647555"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量类型批量同步（集成流）

>  请求方式	POST | Cash Flow Type (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/cashflowtype/bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
key	string	否	否	来源系统的唯一主键 示例：objid 默认值：objid
billnum	string	否	否	单据编码 示例：fiepub_cashflowtypecard 默认值：fiepub_cashflowtypecard
data	object	是	否	请求数据
accentity	string	否	否	会计主体Id 示例：1526180336229679105
accentity_code	string	否	否	会计主体编码 示例：pkm00
code	string	否	否	编码 示例：XJLL
name	object	否	否	名称
accstandard	string	否	否	会计准则id 示例：1550316042397941760
accstandard_code	string	否	否	会计准则编码 示例：33
description	object	否	否	描述
_status	string	否	否	操作状态 示例：Insert
objid	string	否	否	来源系统的唯一主键 示例：111111

## 3. 请求示例

Url: /yonbip/FCC/cashflowtype/bill/save?access_token=访问令牌
Body: {
	"key": "objid",
	"billnum": "fiepub_cashflowtypecard",
	"data": [
		{
			"accentity": "1526180336229679105",
			"accentity_code": "pkm00",
			"code": "XJLL",
			"name": {
				"zh_CN": "现金流量类型1",
				"en_US": "",
				"zh_TW": ""
			},
			"accstandard": "1550316042397941760",
			"accstandard_code": "33",
			"description": {
				"zh_CN": "描述",
				"en_US": "",
				"zh_TW": ""
			},
			"_status": "Insert",
			"objid": "111111"
		}
	]
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
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

