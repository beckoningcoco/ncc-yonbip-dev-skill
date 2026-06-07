---
title: "内部账户结息批量生单"
apiId: "2262725085296066564"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Account Interest Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Account Interest Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 内部账户结息批量生单

> `ContentType	application/json` 请求方式	POST | 分类: Internal Account Interest Settlement Document (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/createInterestSettlementsInBatch

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
| data | object | 是 | 否 | 生单的批量请求数组 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| reqSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例："2267209091374907392" |
| settlementCenter | string | 否 | 是 | 结算中心（支持编码和名称） 示例："JT000000001"或者"集团结算中心" |
| finOrg | string | 否 | 是 | 开户资金组织（支持编码和名称） 示例："JSZX00001"或者"一级结算中心" |
| innerAcct | string | 否 | 是 | 内部账号（支持账号和名称） 示例："drzh005"或者"测试导入5" |
| settlementEndDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 结息结束日 示例：2025-01-01 |
| settlementAmt | string | 否 | 否 | 结息金额（如果填写，则按照结息金额进行结息；如果未填写，则系统自动计算结息金额：合计利息=活期存款利息测算+协定存款利息测算-活期透支利息测算） 示例："10000.00" |
| approvalStatus | string | 否 | 是 | 审批状态（枚举类型：Saved-已保存，Audited-审批通过） 示例：Saved |
| remark | string | 否 | 否 | 备注 示例："结算中心内部账户利息" |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/createInterestSettlementsInBatch?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"reqSeqNo": "\"2267209091374907392\"",
			"settlementCenter": "\"JT000000001\"或者\"集团结算中心\"",
			"finOrg": "\"JSZX00001\"或者\"一级结算中心\"",
			"innerAcct": "\"drzh005\"或者\"测试导入5\"",
			"settlementEndDate": "2025-01-01",
			"settlementAmt": "\"10000.00\"",
			"approvalStatus": "Saved",
			"remark": "\"结算中心内部账户利息\""
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
| failList | object | 否 | 生单失败结果 |

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
				"settlementCode": "NBJX250424000306"
			}
		],
		"failList": {
			"reqSeqNo": "2267209091374907392",
			"success": false,
			"failMsg": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

