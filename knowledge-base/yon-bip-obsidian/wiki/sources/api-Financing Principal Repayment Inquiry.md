---
title: "融资还本查询"
apiId: "1661431210127130625"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Principal Repayment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Principal Repayment]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资还本查询

> `ContentType	application/json` 请求方式	POST | 分类: Financing Principal Repayment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tlmRepaymentOpenApi/query/repaymentlist

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 当前页 示例：1 |
| pageSize | int | 否 | 是 | 页条数 示例：10 |
| accentity | string | 否 | 否 | 会计主体（会计主体与编码择一必填） 示例：1526218947994583046 |
| accentityCode | string | 否 | 否 | 会计主体编码 示例：A01 |
| protocolNumberName | string | 否 | 否 | 协议号 示例：QQDADQD |
| debtCodeName | string | 否 | 否 | 借据号 示例：QQDADQD_copy |
| financialProduct | long | 否 | 否 | 金融产品主键 示例：123 |
| financialProductCode | string | 否 | 否 | 金融产品编码 示例：P000299 |
| rpAgreementAmount | BigDecimal | 否 | 否 | 还本金额 示例：100 |
| repaymentBeginDate | Date | 否 | 否 | 还本日期-开始（包含当天） 示例：2023-03-16 |
| repaymentEndDate | Date | 否 | 否 | 还本日期-结束（包含当天） 示例：2023-04-16 |

## 3. 请求示例

Url: /yonbip/ctm/tlmRepaymentOpenApi/query/repaymentlist?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"accentity": "1526218947994583046",
	"accentityCode": "A01",
	"protocolNumberName": "QQDADQD",
	"debtCodeName": "QQDADQD_copy",
	"financialProduct": 123,
	"financialProductCode": "P000299",
	"rpAgreementAmount": 100,
	"repaymentBeginDate": "2023-03-16",
	"repaymentEndDate": "2023-04-16"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 当前页数 示例：10 |
| recordCount | long | 否 | 总条数 示例：22 |
| data | object | 是 | 还本数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 22,
		"data": [
			{
				"accentity": "1524864006176636931",
				"accentityCode": "10001",
				"accentityName": "科技集团",
				"protocolNumber": 1533784309641510916,
				"protocolNumberName": "shake_copy_copy",
				"debtCode": 1533784438490529796,
				"debtCodeName": "shake_copy_copy0001",
				"financialProduct": 1533775341749796866,
				"financialProductCode": "P000101",
				"financialProductName": "委托贷款",
				"financingOrgType": "TBOT0005",
				"financingOrgTypeName": "银行",
				"financingOrgForBank": "2908725640286464",
				"financingOrgForBankName": "中国银行股份有限公司马鞍山佳山路支行",
				"protocolCurrency": "1524777565678469141",
				"protocolCurrencyName": "人民币",
				"ptCurrency": "1524777565678469141",
				"ptCurrencyName": "人民币",
				"repaymentDate": "2022-10-22",
				"rpAgreementAmount": 100000,
				"rpSettleStatus": "结算成功",
				"auditStatus": "审批通过",
				"ifPayInterestSameTime": "是",
				"payInterestCurrency": "1524777565678469141",
				"payInterestCurrencyName": "人民币",
				"relatePayInterestDocNo": "FX2208290001",
				"createMethod": "人工"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

400	服务出错	服务出错+具体原因


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

