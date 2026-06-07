---
title: "授信申请删除"
apiId: "969d8826f3334ec1bcb1858c766bc457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credit Application"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credit Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 授信申请删除

>  请求方式	POST | Credit Application (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/creditsettingtmp/batchdelete
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
data	object	是	否	对象信用设置数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	是	单据id 示例：2189313682821632

## 3. 请求示例

Url: /yonbip/sd/creditsettingtmp/batchdelete?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": 2189313682821632
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	long	否	提示信息状态码 示例：200
data	object	否	提示信息
count	long	否	操作数量 示例：1
failCount	long	否	失败数量 示例：0
failCountAI	long	否	操作失败数量 示例：0
infos	object	否	返回数据
messages	object	否	信息
successCountAI	long	否	操作成功数量 示例：1
sucessCount	long	否	成功数量 示例：1
message	string	否	提示信息 示例：操作成功

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"count": 1,
		"failCount": 0,
		"failCountAI": 0,
		"infos": {},
		"messages": {},
		"successCountAI": 1,
		"sucessCount": 1
	},
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-22	
更新
请求说明
	2	2025-06-25	
更新
请求参数 data
更新
请求参数 id
更新
返回参数 (10)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

