---
title: "成本中心类别批量同步（集成流）"
apiId: "2325084256612646918"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心类别批量同步（集成流）

>  请求方式	POST | Cost Center Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/costcenterclass/bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
key	string	否	否	来源系统的唯一主键 默认值：objid
billnum	string	否	否	billnum 示例：bd_costcenterclass 默认值：bd_costcenterclass
data	object	是	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	code 示例：MDL
name	object	否	否	name
description	object	否	否	description
_status	string	否	否	保存的状态,Insert:新增，Update:更新 示例：Insert
id	string	否	否	成本中心类别主键， 修改时必填 示例：2306358396789456901
objid	string	否	否	来源系统的唯一主键 默认值：111111

## 3. 请求示例

Url: /yonbip/FCC/costcenterclass/bill/save?access_token=访问令牌
Body: {
	"key": "",
	"billnum": "bd_costcenterclass",
	"data": [
		{
			"resubmitCheckKey": "",
			"code": "MDL",
			"name": {
				"zh_CN": "基本生产99",
				"en_US": "",
				"zh_TW": "",
				"id_ID": "",
				"ja_JP": ""
			},
			"description": {
				"zh_CN": "描述字段",
				"en_US": "",
				"zh_TW": "",
				"id_ID": "",
				"ja_JP": ""
			},
			"_status": "Insert",
			"id": "2306358396789456901",
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
code	string	否	code 示例：基本生产9
name	object	否	name
preset	boolean	否	preset 示例：false
description	object	否	description
id	string	否	id 示例：1764769772447727620
pubts	string	否	pubts 示例：2025-07-05 10:13:02
creatorId_name	string	否	creatorId_name 示例：测试环境管理员
createTime	string	否	createTime 示例：2023-07-06 20:24:01
createDate	string	否	createDate 示例：2023-07-06 00:00:00
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
modifier	string	否	modifier 示例：yanhc
modifierId	string	否	modifierId 示例：2154354418950078469
modifyTime	string	否	modifyTime 示例：2025-07-05 10:13:02
modifyDate	string	否	modifyDate 示例：2025-07-05 10:13:02
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：2910033146761808
ytenant	string	否	ytenant 示例：0000L6YTYEY5FUZPXE0000
traceId	string	否	traceId 示例：b15f18431e2cb901
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "基本生产9",
		"name": {
			"zh_CN": "基本生产9"
		},
		"preset": false,
		"description": {},
		"id": "1764769772447727620",
		"pubts": "2025-07-05 10:13:02",
		"creatorId_name": "测试环境管理员",
		"createTime": "2023-07-06 20:24:01",
		"createDate": "2023-07-06 00:00:00",
		"resubmitCheckKey": "bd_costcenterclass_edit_884a6d8e-d76e-4a8d-ba26-ef7926d8d7b1",
		"modifier": "yanhc",
		"modifierId": "2154354418950078469",
		"modifyTime": "2025-07-05 10:13:02",
		"modifyDate": "2025-07-05 10:13:02",
		"tenant": 2910033146761808,
		"ytenant": "0000L6YTYEY5FUZPXE0000"
	},
	"traceId": "b15f18431e2cb901",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	传参不能为空！	传参data集合不能为空集合，需要有正确的传参！

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

