---
title: "结算明细结果回传"
apiId: "1772853296130162692"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算明细结果回传

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/api/settlement/feedback

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| settleDetailAId | string | 否 | 是 | 结算明细ID 示例：1741573848087134216 |
| statementdetailstatus | int | 否 | 是 | 结算明细状态 3：结算成功 4：结算失败 7:部分成功；部分成功时可以增加代发明细数据进行回写 示例：3 |
| actualExchangePaymentRate | string | 否 | 否 | 实际结算汇率 示例：7.26646 |
| actualExchangePaymentAmount | string | 否 | 否 | 实际结算金额 示例：72.35 |
| natRate | string | 否 | 否 | 本币汇率 示例：0.8222 |
| natAmt | string | 否 | 否 | 本币金额 示例：72.88 |
| description | string | 否 | 否 | 备注 示例：结算方式银行转账 |
| isrefund | string | 否 | 否 | 是否退票 1:是;0:否；回传退票为是时，结算明细状态应为结算成功 |
| settlemode | number |
| 小数位数:-1,最大长度:100 | 否 | 否 | 结算方式ID |
| failTotalAmt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 失败总金额，回传批量代发明细时必填 |
| successTotalAmt | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 成功总金额，回传批量代发明细时必填 |
| settlesuccessdate | string | 否 | 否 | 结算成功日期 |
| settlesuccesstime | string | 否 | 否 | 结算成功时间 |
| ourbankaccount | string | 否 | 否 | 本方银行账号ID ID、编码、名称 |
| indextradeseqno | string | 否 | 否 | 指令交易流水号 |
| settlefailreason | string | 否 | 否 | 结算失败原因 |
| refundDate | string | 否 | 否 | 退票时间 yyyy-MM-dd HH:mm:ss |
| isUpdateBusinessInfo | boolean | 否 | 否 | 是否更新业务信息 若为是，业务信息有值是更新；若为否，业务信息不进行更新（除结算明细状态、是否退票、结算失败原因、结算成功时间、备注之外，其他字段均定义为业务信息） |
| dataBatchDetailList | object | 是 | 否 | 批量代发明细结果列表，在结算明细状态为部分成功时填入，根据该列表修改代发明细数据 |
| paystatus | number |
| 小数位数:-1,最大长度:2 | 否 | 否 | 支付状态：4（已成功）、5（已失败） |
| bussBatchDetailId | string | 否 | 否 | 代发明细对应的业务明细id，在结算明细状态为部分成功且要更新代发明细时，必填 |

## 3. 请求示例

Url: /yonbip/ctm/api/settlement/feedback?access_token=访问令牌
Body: {
	"settleDetailAId": "1741573848087134216",
	"statementdetailstatus": 3,
	"actualExchangePaymentRate": "7.26646",
	"actualExchangePaymentAmount": "72.35",
	"natRate": "0.8222",
	"natAmt": "72.88",
	"description": "结算方式银行转账",
	"isrefund": "",
	"settlemode": 0,
	"failTotalAmt": 0,
	"successTotalAmt": 0,
	"settlesuccessdate": "",
	"settlesuccesstime": "",
	"ourbankaccount": "",
	"indextradeseqno": "",
	"settlefailreason": "",
	"refundDate": "",
	"isUpdateBusinessInfo": true,
	"dataBatchDetailList": [
		{
			"paystatus": 0,
			"bussBatchDetailId": ""
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	结算明细ID不能为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-08

更新

请求说明

新增

请求参数 (4)

修改本币汇率字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

