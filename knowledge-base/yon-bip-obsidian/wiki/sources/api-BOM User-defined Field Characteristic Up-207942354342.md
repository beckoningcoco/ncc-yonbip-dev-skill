---
title: "物料清单自定义项特征更新"
apiId: "2079423543421435904"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BOM Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BOM Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料清单自定义项特征更新

>  请求方式	POST | BOM Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/bom/updateDefineCharacter
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	number
小数位数:0,最大长度:19	否	否	物料清单id，只有id和自定义项特征同时传的时候才会处理，如果有一个不传会直接跳过不处理 示例：2074904507678982145
bomComponent	object	是	否	bom子件
bomByProduct	object	是	否	bom产出品

## 3. 请求示例

Url: /yonbip/mfg/bom/updateDefineCharacter?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": 2074904507678982145,
			"bomComponent": [
				{
					"id": 2074904507678982146,
					"bomAlternate": [
						{
							"id": 2074904507678982147
						}
					]
				}
			],
			"bomByProduct": [
				{
					"id": 2074904507678982148
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
id	number
小数位数:0,最大长度:19	否	id 示例：2074904507678982145
bomComponent	object	是	bomComponent
bomByProduct	object	是	bomByProduct

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": 2074904507678982145,
			"bomComponent": [
				{
					"id": 2074904507678982146,
					"bomAlternate": [
						{
							"id": 2074904507678982147
						}
					]
				}
			],
			"bomByProduct": [
				{
					"id": 2074904507678982148
				}
			]
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

