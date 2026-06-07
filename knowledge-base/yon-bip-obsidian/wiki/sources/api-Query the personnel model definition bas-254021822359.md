---
title: "根据模型ID查询人员模型定义"
apiId: "2540218223599550471"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Talent Discovery"
domain: "DIHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Talent Discovery]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据模型ID查询人员模型定义

>  请求方式	GET | Talent Discovery (DIHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/talent/openApi/hrtalent/superPeopleConf/queryPeopleModelDefine
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	id

## 3. 请求示例

Url: /yonbip/HCC/talent/openApi/hrtalent/superPeopleConf/queryPeopleModelDefine?access_token=访问令牌&id=

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
postCategory	string	否	postCategory 示例：0
upFloat	number
小数位数:0,最大长度:10	否	upFloat 示例：2
floatRange	number
小数位数:0,最大长度:10	否	floatRange 示例：0
ytenant	string	否	ytenant 示例：0000MNZIRA861NUZ2H0000
dimCode	string	否	dimCode 示例：age
weight	number
小数位数:0,最大长度:10	否	weight 示例：10
dimCate	string	否	dimCate 示例：1
type	string	否	type 示例：number
contentName	string	否	contentName 示例：年龄
scene	string	否	scene 示例：3
dimSource	string	否	dimSource 示例：0
dimName	string	否	dimName 示例：年龄
id	string	否	id 示例：2522969282825945090
state	string	否	state 示例：1
mainId	string	否	mainId 示例：2522969282825945089
pubts	string	否	pubts 示例：2026-04-23 10:44:41
downFloat	number
小数位数:0,最大长度:10	否	downFloat 示例：2
traceId	string	否	traceId 示例：68fb3c2970e3518d
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"postCategory": "0",
			"upFloat": 2,
			"floatRange": 0,
			"ytenant": "0000MNZIRA861NUZ2H0000",
			"dimCode": "age",
			"weight": 10,
			"dimCate": "1",
			"type": "number",
			"contentName": "年龄",
			"scene": "3",
			"dimSource": "0",
			"dimName": "年龄",
			"id": "2522969282825945090",
			"state": "1",
			"mainId": "2522969282825945089",
			"pubts": "2026-04-23 10:44:41",
			"downFloat": 2
		}
	],
	"traceId": "68fb3c2970e3518d",
	"uploadable": "0"
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
	1	2026-05-21	
更新
请求参数 id
删除
请求参数 terminalType

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

