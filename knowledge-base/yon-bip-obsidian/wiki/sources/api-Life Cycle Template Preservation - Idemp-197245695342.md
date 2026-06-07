---
title: "生命周期模板保存-幂等"
apiId: "1972456953420972033"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Life Cycle Template"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Life Cycle Template]
platform_version: "BIP"
source_type: community-api-docs
---

# 生命周期模板保存-幂等

>  请求方式	POST | Life Cycle Template (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/lifeCycleTemplate/idempotent/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	生命周期模板对象
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	是	生命周期模板编码 示例：0114
name	object	否	是	生命周期模板多语对象
stopstatus	string	否	否	是否停用（1：是；0：否）若为空默认为 0 示例：1
lifeCycleDetail	object	是	否	生命周期模板明细信息

## 3. 请求示例

Url: /yonbip/digitalModel/lifeCycleTemplate/idempotent/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "0114",
		"name": {
			"simplifiedName": "0114",
			"englishName": "0114",
			"traditionalName": "0114"
		},
		"stopstatus": "1",
		"lifeCycleDetail": [
			{
				"materialStatusCode": "21",
				"isDefault": "0",
				"entityStatus": "Insert"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
id	string	否	生命周期模板Id 示例：1654770892589236228
code	string	否	生命周期模板编码 示例：0114
name	object	否	生命周期模板名称多语对象
stopstatus	int	否	是否停用（1：是；0：否） 示例：1
lifeCycleDetail	object	是	生命周期明细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1654770892589236228",
		"code": "0114",
		"name": {
			"simplifiedName": "0114",
			"englishName": "0114",
			"traditionalName": "0114"
		},
		"stopstatus": 1,
		"lifeCycleDetail": [
			{
				"materialStatusId": "1609333900978421765",
				"materialStatusCode": "21",
				"materialStatusName": "21",
				"isDefault": 0
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
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

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

