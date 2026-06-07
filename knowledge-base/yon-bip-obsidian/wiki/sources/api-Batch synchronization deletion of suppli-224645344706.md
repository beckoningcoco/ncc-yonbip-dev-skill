---
title: "供应商档案批量同步删除"
apiId: "2246453447063764993"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案批量同步删除

>  请求方式	POST | Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/vendor/batchDeleteV3
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	参数数组标识
id	string	否	否	供应商档案ID 示例：2246452906018471945
sourceUnique	string	否	否	源系统id，对应本系统erpCode 示例：2246452906018471946

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/batchDeleteV3?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2246452906018471945",
			"sourceUnique": "2246452906018471946"
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
code	long	否	返回码 示例：200
message	string	否	调用失败时的错误消息 示例：操作成功
data	object	否	返回数据
successCountAI	long	否	成功数量 示例：1
failCountAI	long	否	失败数量 示例：0
count	long	否	总数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	删除失败时返回错误消息
infos	string	是	详细信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-14	
更新
请求参数 (5)
	2	2025-12-22	
更新
请求说明
新增
请求参数 licenseType
更新
请求参数 (4)
删除
请求参数 (18)
删除
返回参数 (18)
	3	2025-08-24	
新增
请求参数 supplyType
	4	2025-04-25	
更新
请求说明
新增
请求参数 elecBillBankNode
新增
请求参数 elecBillBankNode_code
更新
请求参数 gender
新增
返回参数 elecBillBankNode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

