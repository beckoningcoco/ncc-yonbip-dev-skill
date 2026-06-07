---
title: "资产报废申请提交"
apiId: "2362848486709788682"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Scrap Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Scrap Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产报废申请提交

>  请求方式	POST | Asset Scrap Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/aumscrapapplycard/commit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	资产报废申请参数项
id	string	否	是	资产报废申请主键 示例：1993237860615454742

## 3. 请求示例

Url: /yonbip/ACC/aumscrapapplycard/commit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1993237860615454742"
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	number
小数位数:0,最大长度:10	否	返回结果编码 示例：200
message	string	否	异常信息 示例：操作成功！
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	总条数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败条数 示例：0
messages	string	是	异常信息
infos	object	是	数据详情
failInfos	string	是	错误信息
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"_entityName": "aum.reduce.ScrapApplyHeadVO",
				"pk_recorder": "2117122782081843200",
				"returncount": 0,
				"verifystate": 1,
				"bill_date": "2025-07-29 00:00:00",
				"modifier": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
				"pk_org": "2112522880685178882",
				"apply_date": "2025-07-29 00:00:00",
				"pk_transitype": "2324180011500699651",
				"modifiedtime": "2025-09-19 15:19:23",
				"userDefines": {
					"_entityName": "",
					"ytenant": "0000M232Z6A20YFPC30000",
					"id": "2324182150392840197",
					"dr": 0,
					"_status": ""
				},
				"pk_applydept__name": "营销部门",
				"bill_type": "4A12",
				"id": "2324182150392840194",
				"creator__name": "刘龙",
				"pubts": "2025-09-19 15:19:37",
				"tenant": "0000M232Z6A20YFPC30000",
				"creator": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
				"billmaketime": "2025-07-29 14:26:53",
				"pk_org__name": "东新科技股份优先公司",
				"isWfControlled": true,
				"sysid": "AUM",
				"pk_transitype__name": "报废申请",
				"billmaker__name": "刘龙",
				"bill_status": 3,
				"modifier__name": "刘龙",
				"pk_applydept": "2112523026714066947",
				"pk_recorder__name": "刘龙",
				"billmaker": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
				"transi_type": "4A12-0Z",
				"creationtime": "2025-07-29 14:26:53",
				"_status": "",
				"bodyvos": [
					{
						"_entityName": "",
						"progress_status": 1,
						"userDefines": {
							"_entityName": "",
							"ytenant": "0000M232Z6A20YFPC30000",
							"id": "2324182150392840196",
							"dr": 0,
							"_status": ""
						},
						"dr": 0,
						"ytenant": "0000M232Z6A20YFPC30000",
						"pk_equip": "2267098487378673669",
						"pk_addreducestyle": "2107554866241470817",
						"scrap_flag": false,
						"pk_org": "2112522880685178882",
						"pk_currency_fi": "2107554866232033332",
						"id": "2324182150392840195",
						"tenant": "0000M232Z6A20YFPC30000",
						"main_id": "2324182150392840194",
						"pk_ownerunit_equip": "2112522880685178882",
						"pk_ownerorg_equip": "2112522880685178882",
						"pk_mandept_equip": "2112523026714066947",
						"pk_manager_equip": "2117122782081843200",
						"pk_usedorg_equip": "2112522880685178882",
						"pk_user_equip": "2117122782081843200",
						"_status": ""
					}
				],
				"dr": 0,
				"ytenant": "0000M232Z6A20YFPC30000",
				"submitFilledFromDetail": true,
				"bill_code": "BFSQ202507290001",
				"bill_date_name": "2025-07-29",
				"apply_date_name": "2025-07-29",
				"creationtime_name": "2025-07-29 14:26:53",
				"verifystate_name": "审批中",
				"modifiedtime_name": "2025-09-19 15:19:23",
				"billmaketime_name": "2025-07-29 14:26:53",
				"bill_status_name": "审核中"
			}
		],
		"failInfos": [
			""
		]
	},
	"errorDetail": ""
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
999	报错具体提示信息	结合报错提示信息查找原因

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

