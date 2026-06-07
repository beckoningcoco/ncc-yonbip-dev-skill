---
title: "现金流量项目批量同步（集成流）"
apiId: "2318971315566411785"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量项目批量同步（集成流）

>  请求方式	POST | Cash Flow Item (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/cashflowitem/bill/save
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
key	string	否	否	来源系统的唯一主键 默认值：objid
billnum	string	否	否	billnum 示例：fiepub_cashflowitemcard 默认值：fiepub_cashflowitemcard
data	object	是	否	data
accentity	string	否	否	accentity 示例：1529219429332156419
accentity_code	string	否	否	accentity_code 示例：*CHDR
directionattribute	string	否	否	directionattribute 示例：IN
accentity_name	string	否	否	accentity_name 示例：*存货调入
id	string	否	否	id 示例：2253513540089413639
pubts	string	否	否	pubts 示例：2025-04-25 13:42:12
code	string	否	否	code 示例：001
cashflowtype	string	否	否	cashflowtype 示例：2253130008091426823
cashflowtype_name	string	否	否	cashflowtype_name 示例：特征-01
cashflowtype_code	string	否	否	cashflowtype_code 示例：11111
name	object	否	否	name
parent	string	否	否	parent
parent_code	string	否	否	parent_code
parent_name	string	否	否	parent_name 示例：--
mainattachedtable	boolean	否	否	mainattachedtable 示例：true
description	object	否	否	description
_status	string	否	否	_status 示例：Update
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
objid	string	否	否	来源系统的唯一主键 默认值：11111

## 3. 请求示例

Url: /yonbip/FCC/cashflowitem/bill/save?access_token=访问令牌
Body: {
	"key": "",
	"billnum": "fiepub_cashflowitemcard",
	"data": [
		{
			"accentity": "1529219429332156419",
			"accentity_code": "*CHDR",
			"directionattribute": "IN",
			"accentity_name": "*存货调入",
			"id": "2253513540089413639",
			"pubts": "2025-04-25 13:42:12",
			"code": "001",
			"cashflowtype": "2253130008091426823",
			"cashflowtype_name": "特征-01",
			"cashflowtype_code": "11111",
			"name": {
				"zh_CN": "001"
			},
			"parent": "",
			"parent_code": "",
			"parent_name": "--",
			"mainattachedtable": true,
			"description": {},
			"_status": "Update",
			"resubmitCheckKey": "fiepub_cashflowitemcard_edit_7a7a8afd-6fce-490b-b3b9-50b5c7bb7333",
			"objid": ""
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
accentity	string	否	accentity 示例：1529219429332156419
accentity_code	string	否	accentity_code 示例：*CHDR
accentity_name	string	否	accentity_name 示例：*存货调入
id	string	否	id 示例：2253513540089413639
pubts	string	否	pubts 示例：2025-07-22 13:40:14
code	string	否	code 示例：001
cashflowtype	string	否	cashflowtype 示例：2253130008091426823
cashflowtype_name	string	否	cashflowtype_name 示例：特征-01
cashflowtype_code	string	否	cashflowtype_code 示例：1111
name	object	否	name
parent_name	string	否	parent_name 示例：--
mainattachedtable	boolean	否	mainattachedtable 示例：true
description	object	否	description
isEnd	boolean	否	isEnd 示例：true
modifier	string	否	modifier 示例：u8c_vip管理员
modifierId	string	否	modifierId 示例：1525641755939569667
modifyTime	string	否	modifyTime 示例：2025-07-22 13:40:14
modifyDate	string	否	modifyDate 示例：2025-07-22 13:40:14
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：2909930715861584
ytenant	string	否	ytenant 示例：0000L6YQ8AVLFUZPXD0000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accentity": "1529219429332156419",
		"accentity_code": "*CHDR",
		"accentity_name": "*存货调入",
		"id": "2253513540089413639",
		"pubts": "2025-07-22 13:40:14",
		"code": "001",
		"cashflowtype": "2253130008091426823",
		"cashflowtype_name": "特征-01",
		"cashflowtype_code": "1111",
		"name": {
			"zh_CN": "001"
		},
		"parent_name": "--",
		"mainattachedtable": true,
		"description": {},
		"isEnd": true,
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyTime": "2025-07-22 13:40:14",
		"modifyDate": "2025-07-22 13:40:14",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000"
	}
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

