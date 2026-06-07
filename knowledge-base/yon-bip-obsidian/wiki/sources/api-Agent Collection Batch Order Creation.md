---
title: "代理收款批量生单"
apiId: "2261756544383713294"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Agent Collection (V3)"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Agent Collection (V3)]
platform_version: "BIP"
source_type: community-api-docs
---

# 代理收款批量生单

> `ContentType	application/json` 请求方式	POST | 分类: Agent Collection (V3) (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/createAgentCollectionsInBatch

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
| data | object | 是 | 是 | 生单的批量请求数组 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| reqSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例："2267209091374907392" |
| settlementCenter | string | 否 | 是 | 结算中心（支持编码和名称） 示例："JT000000001"或者"集团结算中心" |
| billDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 示例：2025-01-01 |
| finOrg | string | 否 | 是 | 业务资金组织（支持编码和名称） 示例："JSZX00001"或者"一级结算中心" |
| businessType | string | 否 | 是 | 交易类型（支持编码，目前仅支持代理收款，枚举类型：stct_agentCollection-代理收款） 示例："stct_agentCollection" |
| settlementMethod | string | 否 | 是 | 结算方式（支持编码和名称，目前仅支持业务属性为银行业务的结算方式） 示例："银行转账"或者"system_0001" |
| incomeAndExpenditure | boolean | 否 | 否 | 是否统收统支 示例：true 默认值：false |
| originalCurrency | string | 否 | 是 | 原币币种（支持编码和名称） 示例："CNY"或者"人民币" |
| originalCurrencyAmt | string | 否 | 是 | 原币金额 示例："10000.00" |
| exchangeType | string | 否 | 否 | 汇率类型（支持编码和名称） 示例："01"或者"基准汇率" |
| expectedSettlementDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 期望结算日期 示例：2025-01-01 |
| agentCollectionAccount | string | 否 | 否 | 代理收款银行账号（支持账号和名称，应是平台的已启用企业银行账户档案，且币种等于原币币种，当结算方式的业务属性为银行业务且是否统收统支为否时必填，当结算方式的业务属性为银行业务且是否统收统支为是时非必填） 示例："drzh005"或者"测试导入5" |
| agentCollectionCashAccount | string | 否 | 否 | 代理收款现金账号（目前生单不支持生单缴存场景，该字段不要传值，待后续支持） |
| relatedTransactionId | string | 否 | 否 | 关联流水ID（需要传递关联现金流水的ID） 示例："1787399511118080" |
| unifiedReconciliationCode | string | 否 | 否 | 财资统一对账码 示例："_axyyko0_" |
| entryType | string | 否 | 否 | 入账类型（当关联流水ID有值时该字段必填，当关联流水ID无值时，默认正常入账；枚举类型：1-正常入账，2-挂账，3-冲挂账） 示例："1" |
| expenseProject | string | 否 | 否 | 费用项目（支持编码和名称） 示例："FFa002"或者"大交通" |
| project | string | 否 | 否 | 项目（支持编码和名称） 示例："01050019"或者”一级曾项目“ |
| wbsDoc | string | 否 | 否 | WBS档案（支持编码和名称） 示例："000000011"或者"项目0403001" |
| projectActivity | string | 否 | 否 | 项目活动（支持编码和名称） 示例："01050033"或者"北京西站项目" |
| billNumber | string | 否 | 否 | 票据号（目前生单不支持票据场景，该字段不要传值，待后续支持） |
| sourceDataSettled | boolean | 否 | 是 | 是否结算补单（关联流水ID有值时，是否结算补单应当为是） 示例：true |
| remark | string | 否 | 否 | 备注 示例："代理收款生单 |
| payerType | string | 否 | 是 | 付方类型（枚举类型：Customer-客户，Supplier-供应商，Employee-员工，Other-其他，FundBusObj-资金业务对象，InnerUnit-内部单位） 示例："Customer" |
| dept | string | 否 | 否 | 人员部门（支持编码和名称，当付方类型为人员时，该字段必填，付方类型不为人员时，该字段应当为空） 示例："0927"或者"部门0927" |
| payerName | string | 否 | 是 | 付方名称（支持编码或名称） 示例："ygys000006"或者"通用供应商" |
| payerAccount | string | 否 | 否 | 付方银行账号（付方类型为其他时，该字段为手工填写文本；其他场景根据付方类型，填写对应账户的编码或名称） 示例："drzh005"或者"测试导入5" |
| payerAccountName | string | 否 | 否 | 付方账户名称（付方类型为其他时，手工填写文本；其他场景该字段无需传值） 示例："工商N02账户" |
| payerOpenBankName | string | 否 | 否 | 付方开户行名称（付方类型为其他时，手工填写文本；其他场景该字段无需传值） 示例："中国工商银行股份有限公司北京万柳支行" |
| innerAcct | string | 否 | 是 | 收方内部账户（支持账号或名称，账户开户类型应当为结算中心开户，且必须是业务资金组织的使用权账户，账户币种应和原币币种一致） 示例："drzh005"或者"测试导入5" |
| recProject | string | 否 | 否 | 转入项目（支持编码和名称） 示例："FFa002"或者"大交通" |
| billStatus | string | 否 | 是 | 单据状态（枚举类型：AwaitingReview-待复核，Reviewed-已复核） 示例：Reviewed |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/createAgentCollectionsInBatch?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"reqSeqNo": "\"2267209091374907392\"",
			"settlementCenter": "\"JT000000001\"或者\"集团结算中心\"",
			"billDate": "2025-01-01",
			"finOrg": "\"JSZX00001\"或者\"一级结算中心\"",
			"businessType": "\"stct_agentCollection\"",
			"settlementMethod": "\"银行转账\"或者\"system_0001\"",
			"incomeAndExpenditure": true,
			"originalCurrency": "\"CNY\"或者\"人民币\"",
			"originalCurrencyAmt": "\"10000.00\"",
			"exchangeType": "\"01\"或者\"基准汇率\"",
			"expectedSettlementDate": "2025-01-01",
			"agentCollectionAccount": "\"drzh005\"或者\"测试导入5\"",
			"agentCollectionCashAccount": "",
			"relatedTransactionId": "\"1787399511118080\"",
			"unifiedReconciliationCode": "\"_axyyko0_\"",
			"entryType": "\"1\"",
			"expenseProject": "\"FFa002\"或者\"大交通\"",
			"project": "\"01050019\"或者”一级曾项目“",
			"wbsDoc": "\"000000011\"或者\"项目0403001\"",
			"projectActivity": "\"01050033\"或者\"北京西站项目\"",
			"billNumber": "",
			"sourceDataSettled": true,
			"remark": "\"代理收款生单",
			"payerType": "\"Customer\"",
			"dept": "\"0927\"或者\"部门0927\"",
			"payerName": "\"ygys000006\"或者\"通用供应商\"",
			"payerAccount": "\"drzh005\"或者\"测试导入5\"",
			"payerAccountName": "\"工商N02账户\"",
			"payerOpenBankName": "\"中国工商银行股份有限公司北京万柳支行\"",
			"innerAcct": "\"drzh005\"或者\"测试导入5\"",
			"recProject": "\"FFa002\"或者\"大交通\"",
			"billStatus": "Reviewed"
		}
	]
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
| code | string | 否 | 批量生单请求状态码，成功时返回200，失败时返回500 示例：200 |
| message | string | 否 | 批量生单失败信息 示例：抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。 |
| data | object | 否 | 批量生单结果 |
| successCnt | number |
| 小数位数:0,最大长度:10 | 否 | 生单成功条数 示例：12 |
| failCnt | number |
| 小数位数:0,最大长度:10 | 否 | 生单失败条数 示例：0 |
| successList | object | 是 | 生单成功结果 |
| failList | object | 是 | 生单失败结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。",
	"data": {
		"successCnt": 12,
		"failCnt": 0,
		"successList": [
			{
				"reqSeqNo": "2267209091374907392",
				"success": true,
				"agentCollectionCode": "AGTC250427000002"
			}
		],
		"failList": [
			{
				"reqSeqNo": "2267209091374907392",
				"success": false,
				"failMsg": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-22

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

