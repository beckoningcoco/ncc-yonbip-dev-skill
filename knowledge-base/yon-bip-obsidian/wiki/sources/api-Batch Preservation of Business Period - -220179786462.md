---
title: "业务期间批量保存-新集成"
apiId: "2201797864627109897"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Period"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Period]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务期间批量保存-新集成

>  请求方式	POST | Business Period (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/businessperiod/batchSave
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
matchRule	string	否	是	对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id
unmatchedStrategy	string	否	是	按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add
data	object	是	否	业务数据
sourceUnique	string	否	是	源系统唯一标识 示例：99ea7655dsc
id	string	否	否	主键ID 示例：2201718029802799106
code	string	否	是	编码 示例：aa
name	object	否	是	名称(根据租户开通的语种传入，当前为开通中英繁情况下传入格式)
endDate	date
格式:yyyy-MM-dd	否	否	结束时间 示例：2026-02-13
description	object	否	否	描述(根据租户开通的语种传入，当前为开通中英繁情况下传入格式)
type	string	否	是	类型(day:日度,week:周度,doubleWeek:双周度,month:月度,quarter:季度,half:半年) 示例：month
enable	number
小数位数:0,最大长度:10	否	否	启用状态(0:未启用;1:启用;2:停用) 示例：0
BusinessYearVOList	object	是	否	期间年
startDate	date
格式:yyyy-MM-dd	否	是	起始日期 示例：2025-02-14
applicationScope	string	否	否	应用范围,逗号分割 feeControl-APPScope:费控,marketingExpense-APPScope:营销 示例：feeControl-APPScope,marketingExpense-APPScope

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/businessperiod/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"sourceUnique": "99ea7655dsc",
			"id": "2201718029802799106",
			"code": "aa",
			"name": {
				"zh_CN": "001-cn",
				"en_US": "001-en",
				"zh_TW": "001-fan"
			},
			"endDate": "2026-02-13",
			"description": {
				"zh_CN": "简体1",
				"en_US": "en",
				"zh_TW": "fan"
			},
			"type": "month",
			"enable": 0,
			"BusinessYearVOList": [
				{
					"code": "2025",
					"startDate": "2025-02-14",
					"endDate": "2026-02-13",
					"BusinessPeriodVOList": [
						{
							"code": "2025-01",
							"startDate": "2025-02-14",
							"endDate": "2025-03-13",
							"type": "month",
							"startPeriod___code": "1111211",
							"endPeriod___code": "1111311",
							"periodType": "month"
						}
					]
				}
			],
			"startDate": "2025-02-14",
			"applicationScope": "feeControl-APPScope,marketingExpense-APPScope"
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	调用成功时的返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功总数 示例：9
failCount	number
小数位数:0,最大长度:10	否	失败总数 示例：1
messages	object	是	失败数据信息
infos	object	是	成功数据信息
displayCode	string	否	业务异常码 示例：000-525-000067
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-525-000066
	传入的数据列表为空或存在空对象，请检查代码	
000-525-000067
	执行批量操作时，数据必须包含sourceUnique	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-18	
更新
请求说明
更新
请求参数 type
更新
请求参数 periodType
优化描述
	2	2025-07-01	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

