---
title: "委外申请单自定义项特征更新"
apiId: "7aa90465f3d1472f918bdf03beb3da5a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Requisition"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请单自定义项特征更新

>  请求方式	POST | Subcontracting Requisition (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractrequisition/updateDefineCharacter
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
data	object	是	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	number
小数位数:0,最大长度:32	否	是	委外申请单id，只有id和自定义项特征同时传的时候才会处理，如果有一个不传会直接跳过不处理 示例：2074904507678982145
subcontractRequisitionProduct	object	是	否	委外申请单产品行数据集合

## 3. 请求示例

Url: /yonbip/mfg/subcontractrequisition/updateDefineCharacter?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": 2074904507678982145,
			"subcontractRequisitionProduct": [
				{
					"id": 2074904507678982146,
					"subcontractRequisitionMaterial": [
						{
							"id": 2074904507678982147
						}
					],
					"subcontractRequisitionByProduct": [
						{
							"id": 2074904507678982148
						}
					],
					"subcontractRequisitionProcess": [
						{
							"id": 2074904507678982149
						}
					]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口调用返回数据
id	number
小数位数:0,最大长度:32	否	委外申请单id 示例：2664860774224640
pubts	string	否	时间戳 示例：2022-05-19 17:42:25
subcontractRequisitionProduct	object	是	申请单产品行数据集

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2664860774224640,
		"pubts": "2022-05-19 17:42:25",
		"subcontractRequisitionProduct": [
			{
				"id": 2251405962793216,
				"pubts": "2022-05-19 17:42:25",
				"subcontractRequisitionMaterial": [
					{
						"id": 2251405962793217,
						"pubts": "2022-05-19 17:42:25"
					}
				],
				"subcontractRequisitionByProduct": [
					{
						"id": 0,
						"pubts": "2022-05-19 17:42:25"
					}
				],
				"subcontractRequisitionProcess": [
					{
						"id": 0,
						"pubts": "2022-05-19 17:42:25"
					}
				]
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

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

