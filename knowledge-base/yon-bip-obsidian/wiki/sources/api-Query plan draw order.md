---
title: "查询计划编制单"
apiId: "2198735037572055048"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Plan Preparation"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Plan Preparation]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询计划编制单

> `ContentType	application/json` 请求方式	POST | 分类: Plan Preparation (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/capitalPlanDraw/queryCapitalPlanDraw

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| planOrg | string | 否 | 是 | 业务单据对应的计划组织，支持id和编码 示例：152564370585577 |
| currency | string | 否 | 是 | 币种，支持id和code、name查询 示例：152564370585577,CNY |
| period | string | 否 | 是 | 期间，支持id和期间编码 示例：152564370585578,202502 |
| approvalStatus | string | 否 | 否 | 审批状态，1-已保存 2-审批中 3-已驳回 4-审批通过 5-已终止 示例：1,2,3 |
| capitalPlanStatus | string | 否 | 否 | 编制状态，1-编制中,3-待汇总,4-已汇总未生效,5-已生效,7-汇总退回,8-汇总中 示例：1,3,4 |

## 3. 请求示例

Url: /yonbip/ctm/capitalPlanDraw/queryCapitalPlanDraw?access_token=访问令牌
Body: {
	"planOrg": "152564370585577",
	"currency": "152564370585577,CNY",
	"period": "152564370585578,202502",
	"approvalStatus": "1,2,3",
	"capitalPlanStatus": "1,3,4"
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
| code | string | 否 | 状态码 示例：“200” |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 是 | 返回信息 |
| accentity | string | 否 | 资金组织id |
| approvalStatus | string | 否 | 审批状态 |
| basebilltype | string | 否 | 单据类型 |
| beginDate | string | 否 | 开始日期 |
| bustype | string | 否 | 交易类型 |
| capitalPlanCycle | string | 否 | 计划周期 |
| capitalPlanName | string | 否 | 计划名称 |
| capitalPlanStatus | string | 否 | 编制状态 |
| code | string | 否 | 计划编号 |
| createDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建日期 |
| creator | string | 否 | 创建人 |
| creatorId | string | 否 | 创建人id |
| currency | string | 否 | 币种id |
| currency_name | string | 否 | 币种名称 |
| endDate | string | 否 | 结束日期 |
| id | string | 否 | id |
| incomeAmt | string | 否 | 收入总额度 |
| payAmt | string | 否 | 支出总额度 |
| period | string | 否 | 期间id |
| period_periodNo | string | 否 | 期间编号 |
| planOrg | string | 否 | 计划组织id |
| planOrg_planOrgName | string | 否 | 计划组织名称 |
| rateType | string | 否 | 汇率类型 |
| rateTypeName | string | 否 | 汇率类型名称 |
| strategSetId | string | 否 | 策略id |
| capitalPlanDraw_b | object | 是 | 子表 |
| capitalPlanDrawRollItem | object | 是 | 计划编制滚动表 |

## 5. 正确返回示例

{
	"code": "“200”",
	"message": "操作成功",
	"data": [
		{
			"accentity": "",
			"approvalStatus": "",
			"basebilltype": "",
			"beginDate": "",
			"bustype": "",
			"capitalPlanCycle": "",
			"capitalPlanName": "",
			"capitalPlanStatus": "",
			"code": "",
			"createDate": "2026-06-07 12:08:15",
			"creator": "",
			"creatorId": "",
			"currency": "",
			"currency_name": "",
			"endDate": "",
			"id": "",
			"incomeAmt": "",
			"payAmt": "",
			"period": "",
			"period_periodNo": "",
			"planOrg": "",
			"planOrg_planOrgName": "",
			"rateType": "",
			"rateTypeName": "",
			"strategSetId": "",
			"capitalPlanDraw_b": [
				{
					"compileDetail": "",
					"currency": "",
					"id": "",
					"isEnd": true,
					"level": "",
					"mainid": "",
					"parent": "",
					"path": "",
					"project": "",
					"project_code": "",
					"project_name": "",
					"project_sort": "",
					"receiptType": "",
					"thisPeriodPlanAmt": ""
				}
			],
			"capitalPlanDrawRollItem": [
				{
					"amount": "",
					"beginDate": "",
					"cycleType": "",
					"cycleValue": "",
					"endDate": "",
					"id": "",
					"isDecompose": "",
					"isEnd": "",
					"isRoll": "",
					"isTotal": "",
					"mainid": "",
					"period": "",
					"capitalPlanDrawBId": "",
					"projectId": "",
					"totalAmount": "",
					"capitalPlanDetail": [
						{
							"accentity": "",
							"amount": "",
							"capitalPlanCycle": "",
							"capitalPlanRollItemId": "",
							"code": "",
							"currency": "",
							"forecast": "",
							"id": "",
							"isInternal": true,
							"isInternalOffset": true,
							"isWholesale": "",
							"localAmount": "",
							"localCurrency": "",
							"localCurrency_name": "",
							"monthPeriod": "",
							"planOrg": "",
							"planSettleDate": "",
							"projectId": "",
							"rate": "",
							"rateType": "",
							"rateTypeName": "",
							"receiptType": "",
							"weekPeriod": "",
							"business": "",
							"business_name": "",
							"confirmStatus": "",
							"contractCode": "",
							"contractName": "",
							"expenseProject": "",
							"expenseProject_name": "",
							"internalCode": "",
							"internalId": "",
							"internalName": "",
							"oppAcc": "",
							"oppAccId": "",
							"oppAccName": "",
							"oppBankName": "",
							"oppBankType": "",
							"oppId": "",
							"oppName": "",
							"oppType": "",
							"paymentType": "",
							"paymentType_name": "",
							"project": "",
							"project_name": "",
							"remark": "",
							"settleMode": "",
							"settleMode_name": "",
							"bankAccount": "",
							"bankAccount_account": "",
							"cashAccount": "",
							"cashAccount_name": "",
							"dept": "",
							"dept_name": "",
							"billNumberId": "",
							"billNumber": ""
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息

10000001	参数为空


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

