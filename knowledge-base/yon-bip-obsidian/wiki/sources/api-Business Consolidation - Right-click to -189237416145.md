---
title: "合并报表-报表数据中心多维数据单元格右键查看单元格历史功能"
apiId: "1892374161459249154"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-报表数据中心多维数据单元格右键查看单元格历史功能

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/tbb/form/querydatacelllognew
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
uniKey	string	否	是	当前单元格的uniqkey(根据维度向量生成的主键) 示例：1.1.1.1.1.d.1.1l7.2.1.1.7.1.3.1.3.4.3.1.2.1.2.1.2.
showType	string	否	是	报表数据中心右键日志上侧维度信息显示样式() 示例：CODEANDNAME 默认值：CODEANDNAME
pk_cube	string	否	是	应用模型主键 示例：1825348602618708280
numberFormat	string	否	否	数据展示样式
sysParamJson	object	否	是	sysParamJson
appcode	string	否	是	调用接口节点编码，默认BCS13002 示例：BCS13002 默认值：*

## 3. 请求示例

Url: /yonbip/qyjx/tbb/form/querydatacelllognew?access_token=访问令牌
Body: {
	"uniKey": "1.1.1.1.1.d.1.1l7.2.1.1.7.1.3.1.3.4.3.1.2.1.2.1.2.",
	"showType": "CODEANDNAME",
	"pk_cube": "1825348602618708280",
	"numberFormat": "",
	"sysParamJson": {
		"appcode": "BCS13002"
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
creator	string	否	创建人
code	string	否	响应码 示例：200
data	object	否	data
busiFormulas	object	是	busiFormulas
tableDatas	object	是	tableDatas
success	boolean	否	success 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"busiFormulas": [
			{
				"values": {
					"formulaInfo": {
						"display": "Actual 实际数；2023 2023年；11 11月；YTD 当年累计；AutoApiBcsEntity0101 自动化接口合并报表主体0101；<EO> 本币初始数；AutoApiBcsAccount0101 自动化接口合并报表科目0101；[ICP_None] [ICP_None]；CNY CNY(人民币)；[Scope_None] [Scope_None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]",
						"scale": -1,
						"value": "Actual 实际数；2023 2023年；11 11月；YTD 当年累计；AutoApiBcsEntity0101 自动化接口合并报表主体0101；<EO> 本币初始数；AutoApiBcsAccount0101 自动化接口合并报表科目0101；[ICP_None] [ICP_None]；CNY CNY(人民币)；[Scope_None] [Scope_None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]"
					}
				},
				"cellNames": [
					"formulaInfo"
				],
				"cells": [
					{
						"display": "Actual 实际数；2023 2023年；11 11月；YTD 当年累计；AutoApiBcsEntity0101 自动化接口合并报表主体0101；<EO> 本币初始数；AutoApiBcsAccount0101 自动化接口合并报表科目0101；[ICP_None] [ICP_None]；CNY CNY(人民币)；[Scope_None] [Scope_None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]",
						"scale": -1,
						"value": "Actual 实际数；2023 2023年；11 11月；YTD 当年累计；AutoApiBcsEntity0101 自动化接口合并报表主体0101；<EO> 本币初始数；AutoApiBcsAccount0101 自动化接口合并报表科目0101；[ICP_None] [ICP_None]；CNY CNY(人民币)；[Scope_None] [Scope_None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]；[None] [None]"
					}
				]
			}
		],
		"tableDatas": [
			{
				"rows": [
					{
						"values": {
							"userAccount": {
								"display": "YHT-636-7031634291397743",
								"scale": -1,
								"value": "YHT-636-7031634291397743"
							},
							"position": {
								"display": "凌东冬",
								"scale": -1,
								"value": "凌东冬"
							},
							"value": {
								"display": "444",
								"scale": -1,
								"value": "444"
							},
							"logAction": {
								"display": "录入",
								"scale": -1,
								"value": "录入"
							},
							"txtValue": {
								"scale": -1
							},
							"content": {
								"display": "2023-12-25 18:41:48",
								"scale": -1,
								"value": "2023-12-25 18:41:48"
							}
						},
						"cellNames": [
							"userAccount",
							"position",
							"value",
							"logAction",
							"txtValue",
							"content"
						],
						"cells": [
							{
								"display": "YHT-636-7031634291397743",
								"scale": -1,
								"value": "YHT-636-7031634291397743"
							}
						]
					}
				],
				"listRows": [
					{
						"values": {
							"userAccount": {
								"display": "YHT-636-7031634291397743",
								"scale": -1,
								"value": "YHT-636-7031634291397743"
							},
							"position": {
								"display": "凌东冬",
								"scale": -1,
								"value": "凌东冬"
							},
							"value": {
								"display": "444",
								"scale": -1,
								"value": "444"
							},
							"logAction": {
								"display": "录入",
								"scale": -1,
								"value": "录入"
							},
							"txtValue": {
								"scale": -1
							},
							"content": {
								"display": "2023-12-25 18:41:48",
								"scale": -1,
								"value": "2023-12-25 18:41:48"
							}
						},
						"cellNames": [
							"userAccount",
							"position",
							"value",
							"logAction",
							"txtValue",
							"content"
						],
						"cells": [
							{
								"display": "YHT-636-7031634291397743",
								"scale": -1,
								"value": "YHT-636-7031634291397743"
							}
						]
					}
				]
			}
		]
	},
	"success": true
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
	1	2026-04-20	
更新
请求说明
更新
返回参数 code

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

