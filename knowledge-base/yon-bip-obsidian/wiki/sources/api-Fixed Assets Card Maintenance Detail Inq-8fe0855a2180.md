---
title: "固定资产盘点单保存"
apiId: "8fe0855a218041f1af3d7eaeb3c2ae81"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Assets"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点单保存

>  请求方式	POST | Fixed Assets (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/inventory/save
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
data	object	否	是	保存入参
id	long	否	否	盘点单主表ID (insert的时候id不需要，update的时候id必输) 示例：2662645148930816
accentity	string	否	是	会计主体ID (支持id和code) 示例：102901
planDate	string	否	否	计划盘点日期（新增时必填，修改时可填可不填） 示例：2022-01-18
code	string	否	否	盘点单号，取编码规则，自动编码时可不传，手工编码时必传。 示例：ZP001
remarks	object	否	否	盘点单主表备注 支持多语
_status	string	否	是	当前数据编辑的状态，分别为Update，Insert。Insert时ID可以为空 示例：Insert
bodyvos	object	是	否	保存入参子表数据,为数组

## 3. 请求示例

Url: /yonbip/fi/inventory/save?access_token=访问令牌
Body: {
	"data": {
		"id": 2662645148930816,
		"accentity": "102901",
		"planDate": "2022-01-18",
		"code": "ZP001",
		"remarks": {
			"zh_CN": "中文",
			"en_US": "english",
			"zh_TW": "繁体"
		},
		"_status": "Insert",
		"bodyvos": [
			{
				"id": 2662645148930815,
				"inventoryBillId": "2662645148930816",
				"assetName": {
					"zh_CN": "维护建卡-四月份建卡",
					"en_US": "english",
					"zh_TW": "繁体"
				},
				"assetCategoryId": "0201",
				"inventoryDate": "2022-01-18",
				"afUsageStateId": "02",
				"afQuantity": 1,
				"afManageDeptId": "fa-111",
				"afDepartments": [
					{
						"proportion": 100,
						"deptId": "cw1",
						"id": "2662645148930817",
						"mainId": 2662645148930815,
						"_status": "Insert"
					}
				],
				"afPlaceId": "2541843533025536",
				"afCustodianId": "mm001m",
				"afUserId": "mm001m",
				"afLocation": {
					"zh_CN": "位置1",
					"en_US": "location",
					"zh_TW": "位置1"
				},
				"remarks": {
					"zh_CN": "子表备注",
					"en_US": "mark",
					"zh_TW": "子表备注"
				},
				"_status": "Insert"
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
data	object	是	调用完成时的返回数据
code	string	否	单据编码 示例：GDZCPDcode24425487
modifyDate	string	否	修改日期 示例：2022-05-27 18:01:28
isWfControlled	boolean	否	是否支持审批流 true 支持 false 不支持 示例：false
accbook	string	否	固定资产账簿 示例：119165A4-BF89-4581-9B7D-AF0DA41B0DE3
modifier	string	否	修改人 示例：海波
modifierId	long	否	修改人ID 示例：2569941594820864
accentity	string	否	会计主体id 示例：2523201940656896
planDate	string	否	计划盘点日期 示例：2022-05-27 00:00:00
modifyTime	string	否	修改时间 示例：2022-05-27 18:01:28
id	long	否	盘点单ID 示例：1464117302865690600
transtypeId	string	否	交易类型 示例：2491134054667124
pubts	string	否	时间戳 示例：2022-05-27 18:01:28
remarks	object	否	备注 支持多语
bodyvos	object	是	盘点单子表数据
message	string	否	返回信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"code": "GDZCPDcode24425487",
			"modifyDate": "2022-05-27 18:01:28",
			"isWfControlled": false,
			"accbook": "119165A4-BF89-4581-9B7D-AF0DA41B0DE3",
			"modifier": "海波",
			"modifierId": 2569941594820864,
			"accentity": "2523201940656896",
			"planDate": "2022-05-27 00:00:00",
			"modifyTime": "2022-05-27 18:01:28",
			"id": 1464117302865690600,
			"transtypeId": "2491134054667124",
			"pubts": "2022-05-27 18:01:28",
			"remarks": {
				"zh_TW": "remarkszh_TW",
				"en_US": "remarksen_US",
				"zh_CN": "remarkszh_CN"
			},
			"bodyvos": [
				{
					"afUsageDeptName": "缓存部门117751459:100.0",
					"inventoryDate": "2022-05-27 00:00:00",
					"afManageDeptId": "2523201963282688",
					"afCustodianId": "2523202371965952",
					"afQuantity": 2,
					"afDepartments": [
						{
							"deptName": "缓存部门117751459",
							"proportion": 100,
							"deptId": "2523201963282688",
							"id": 1464117302865690600,
							"mainId": 1464117302865690600,
							"tenant": 2491133023621376
						}
					],
					"inventoryBillId": 1464117302865690600,
					"inventoryResult": "3",
					"afPlaceId": "2599983263420672",
					"afUserId": "2523202371965952",
					"assetCategoryId": 2491045678651139,
					"afLocation": {
						"zh_TW": "afLocationzh_TW",
						"en_US": "afLocationen_US",
						"zh_CN": "afLocationzh_CN"
					},
					"assetName": {
						"zh_TW": "assetName1zh_TW",
						"en_US": "assetName1en_US",
						"zh_CN": "assetName1zh_CN"
					},
					"id": 1464117302865690600,
					"afUsageStateId": 2489916068075286,
					"remarks": {
						"zh_TW": "remarkszh_TW",
						"en_US": "remarksen_US",
						"zh_CN": "remarkszh_CN"
					}
				}
			]
		}
	],
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	当前单据不是最新状态，请刷新重试	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (9)
更新
返回参数 (51)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

