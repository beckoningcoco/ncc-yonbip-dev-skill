---
title: "采购合同变更自定义项特征更新"
apiId: "2057682384619831302"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Contract Change"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购合同变更自定义项特征更新

>  请求方式	POST | Purchase Contract Change (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/contract/updateContractChangeDefineCharacter
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	单据信息
id	number
小数位数:1,最大长度:20	否	否	采购合同ID；如填写了ID和code已ID为准 示例：1879562417295616
contractMaterialList	object	是	否	采购合同变更物料子表信息
contractPayTermList	object	是	否	采购合同付款协议子表

## 3. 请求示例

Url: /yonbip/cpu/contract/updateContractChangeDefineCharacter?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1879562417295616,
			"contractMaterialList": [
				{
					"id": 0
				}
			],
			"contractPayTermList": [
				{
					"id": 0
				}
			]
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
小数位数:2,最大长度:10	否	状态码 示例：200
message	string	否	调用信息 示例：操作成功
data	object	否	调用的返回数据 示例：{"data":"123"}
count	number
小数位数:1,最大长度:10	否	返回数据总数 示例：1
successCount	number
小数位数:1,最大长度:10	否	返回成功数 示例：1
failCount	number
小数位数:1,最大长度:10	否	返回失败数 示例：0
messages	object	否	返回信息 示例：{"data":"123"}

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"data": "123"
	},
	"count": 1,
	"successCount": 1,
	"failCount": 0,
	"messages": {
		"data": "123"
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
	1	2025-10-30	
更新
请求说明
更新
请求参数 contractPayTermList
付款协议子表改列表

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

