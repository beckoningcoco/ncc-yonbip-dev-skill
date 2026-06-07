---
title: "待结算数据详情查询"
apiId: "e95f07efe2284360ab54821b168bd0b1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Pending Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Pending Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 待结算数据详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Data Pending Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/query/settleddetail

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 否 | 数据 |
| transNumber | string | 否 | 否 | 待结算单据id（待结算单据id和待结算单据编码二选一必填；同时填入时，以待结算单据id为准） |
| code | string | 否 | 否 | 待结算单据编码（待结算单据id和待结算单据编码二选一必填；同时填入时，以待结算单据id为准） |
| transNumberList | string | 是 | 否 | 待结算单据id数组（待结算单据id和待结算单据编码二选一必填；同时填入时，以待结算单据id为准）批量查询优先使用该方式 |
| codeList | string | 是 | 否 | 待结算单据编码（待结算单据id和待结算单据编码二选一必填；同时填入时，以待结算单据id为准）批量查询 |
| businessIds | string | 是 | 否 | 业务单据主键id集合(优先使用业务单据明细id查询,其次是业务单据主键id查询，同时填入时，以业务单据明细id为准)结合来源系统进行查询 |
| businessDetailsIds | string | 是 | 否 | 业务单据明细主键id集合(优先使用业务单据明细id查询,其次是业务单据主键id查询，同时填入时，以业务单据明细id为准)结合来源系统进行查询 |
| wdataorigin | string | 否 | 否 | 来源系统:1:资金结算 3:资金调度 4:商业汇票 5:应收应付系统 8:现金管理 10:费用管理 12:结算中心 13:应收管理 14:应付管理 16:投融资管理 18:项目管理 19:营销费用 20:第三方 21:跨境运营 22:跨境资金调度 23:销售财务 24:汽车云-售后财务 25:汽车云-其他结算 26:授信管理 27:担保管理 30: 信用证管理 31:保函管理 32衍生品管理 : 33 建筑云 34:零售服务 35:B2C订单中心 |
| businessbillnums | string | 是 | 否 | 业务单据编号(优先使用业务单据明细id查询,其次是业务单据主键id查询，最后用业务单据编号)结合来源系统进行查询 |

## 3. 请求示例

Url: /yonbip/ctm/api/query/settleddetail?access_token=访问令牌
Body: {
	"data": {
		"transNumber": "",
		"code": "",
		"transNumberList": [
			""
		],
		"codeList": [
			""
		],
		"businessIds": [
			""
		],
		"businessDetailsIds": [
			""
		],
		"wdataorigin": "",
		"businessbillnums": [
			""
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 是 | 数据 |
| dataSettledId | long | 否 | 待结算id |
| wdataOrigin | string | 否 | 数据来源，枚举值详见返回示例 |
| businessBillId | string | 否 | 业务单据id |
| businessBillNum | string | 否 | 业务单据编号 |
| businessBillType | string | 否 | 业务单据类型，枚举值详见返回示例 |
| businessDetailsId | string | 否 | 业务单据明细id |
| relatedsettlementBillno | string | 否 | 关联结算单编号 |
| settlementId | long | 否 | 结算单ID |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | pubts |
| tradeTypeId | string | 否 | 交易类型ID |
| tradeTypeCode | string | 否 | 交易类型code |
| tradeTypeName | string | 否 | 交易类型 |
| wsettleStatus | string | 否 | 待结算数据状态，枚举值详见返回示例 |
| wsettlementResult | string | 否 | 待结算数据结果，枚举值详见返回示例 |
| successsettlementAmount | double | 否 | 累计结算成功金额 |
| stoppedamount | double | 否 | 累计结算止付金额 |
| expectsettlemethodId | long | 否 | 结算方式ID |
| expectsettlemethodCode | string | 否 | 结算方式编码 |
| expectsettlemethod_name | string | 否 | 结算方式名称 |
| settlemetBankAccountId | string | 否 | 结算银行账户id |
| settlemetBankAccount | string | 否 | 结算银行账户 |
| settlemetCashAccount | string | 否 | 结算现金账户 |
| creatorId | long | 否 | 创建人id |
| creator | string | 否 | 创建人 |
| auditor | string | 否 | 审核人 |
| auditTime | string | 否 | 审核时间 |
| payDownData | string | 否 | 支付完成日期 |
| isRelateCheckBill | string | 否 | 是否关联对账单 是1 否0 |
| dataSettledDistribute | object | 是 | 结算明细分配金额表 |
| settleFinishDateTime | string | 否 | 结算操作完成时间 |
| riskTypeName | string | 否 | 风险类型名称 |
| riskType | string | 否 | 风险类型 |
| riskConStatusName | string | 否 | 风险确认状态名称 |
| riskConStatus | string | 否 | 风险确认状态 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"dataSettledId": 0,
			"wdataOrigin": "",
			"businessBillId": "",
			"businessBillNum": "",
			"businessBillType": "",
			"businessDetailsId": "",
			"relatedsettlementBillno": "",
			"settlementId": 0,
			"createTime": "2026-06-07 12:09:38",
			"pubts": "2026-06-07 12:09:38",
			"tradeTypeId": "",
			"tradeTypeCode": "",
			"tradeTypeName": "",
			"wsettleStatus": "",
			"wsettlementResult": "",
			"successsettlementAmount": 0,
			"stoppedamount": 0,
			"expectsettlemethodId": 0,
			"expectsettlemethodCode": "",
			"expectsettlemethod_name": "",
			"settlemetBankAccountId": "",
			"settlemetBankAccount": "",
			"settlemetCashAccount": "",
			"creatorId": 0,
			"creator": "",
			"auditor": "",
			"auditTime": "",
			"payDownData": "",
			"isRelateCheckBill": "",
			"dataSettledDistribute": [
				{
					"dataSettledDistributeId": 0,
					"settleBenchDetailId": 0,
					"expectsettlemethodId": 0,
					"expectsettlemethodCode": "",
					"expectsettlemethod_name": "",
					"settlemetBankAccountId": "",
					"settlemetBankAccount": "",
					"settlemetCashAccount": "",
					"distributeType": "",
					"successDistributeMoney": 0,
					"statementdetailstatus": 0,
					"creatorId": 0,
					"creator": "",
					"auditor": "",
					"auditTime": "",
					"distributiondatestr": "",
					"isRelateCheckBill": "",
					"relateBankCheckBillId": 0,
					"checkIdentificationCode": "",
					"relateClaimBillId": 0,
					"bankTicket": 0,
					"isSubcontract": 0,
					"billRangeStart": "",
					"billRangeEnd": "",
					"auditorId": "",
					"auditorCode": "",
					"submitter": "",
					"submitterCode": "",
					"submitterName": "",
					"payer": "",
					"payerCode": "",
					"payerName": "",
					"bankReturnMsg": "",
					"responseBankCode": "",
					"responseBankInfo": ""
				}
			],
			"settleFinishDateTime": "",
			"riskTypeName": "",
			"riskType": "",
			"riskConStatusName": "",
			"riskConStatus": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	请求数据不能为空	根据message修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-11

更新

请求说明

新增

返回参数 (14)

增加返回信息

2	2025-05-15

新增

请求参数 businessbillnums

删除

返回参数 fundPurposeId

删除

返回参数 fundPurposeCode

删除

返回参数 fundPurposeName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

