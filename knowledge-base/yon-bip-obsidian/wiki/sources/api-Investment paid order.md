---
title: "投资付费生单"
apiId: "2356096858251591686"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资付费生单

> `ContentType	application/json` 请求方式	POST | 分类: Investment Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/investpayment/openapi/create

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
| protocolNumber | string | 否 | 是 | 协议号(可传入id/编码/协议号) 示例：TZ2507070009 |
| purchaseCode | string | 否 | 否 | 申购号(可传入id/编码/申购单号) 示例：SG2507070001 |
| feeItem | string | 否 | 是 | 费用项目(可传入id/名称) 示例：入库费用 |
| feeCurrency | string | 否 | 是 | 付费币种(可传入id/名称) 示例：人民币 |
| feeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 费用金额(付费币种) 示例：100000 |
| paymentDate | string | 否 | 是 | 付费日期 示例：2025-09-18 |
| paymentAccid | string | 否 | 是 | 付费账户(可传入id/账号) 示例：777777605 |
| fundPaymentType | string | 否 | 否 | 资金支付模式(主动付款:1,被动付款:0) 示例：0 |
| rateType | string | 否 | 否 | 本币币种汇率类型(可传入id/名称) 示例：基准汇率 |
| rate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 本币币种汇率 示例：1 |
| initFlag | string | 否 | 否 | 是否期初 是 :yes,否 :no 示例：no |
| deptid | string | 否 | 否 | 部门 |
| costCenter | string | 否 | 否 | 成本中心 |
| profitCenter | string | 否 | 否 | 利润中心 |
| agencyOutlayAcc | string | 否 | 否 | 代理支出账户 |
| settledAddition | string | 否 | 否 | 已结算补单(是:yes,否:no) 示例：yes |
| settleStatus | string | 否 | 否 | 结算状态(待结算:0,结算成功:2) 示例：2 |
| settleMethod | string | 否 | 否 | 结算方式(可传入id/名称) 示例：银行转账 |
| abstractInfo | string | 否 | 否 | 用途 示例：用途 |
| postscriptInfo | string | 否 | 否 | 附言 示例：附言 |
| payeeUnit | string | 否 | 否 | 收款方单位(可传入id/名称) 示例：财务公司 |
| otherType | string | 否 | 否 | 对方类型(可传入id/名称) |
| otherTypeObject | string | 否 | 否 | 对方银行账号(可传入id/编码/名称) 示例：财务公司 |

## 3. 请求示例

Url: /yonbip/ctm/fm/investpayment/openapi/create?access_token=访问令牌
Body: {
	"protocolNumber": "TZ2507070009",
	"purchaseCode": "SG2507070001",
	"feeItem": "入库费用",
	"feeCurrency": "人民币",
	"feeAmount": 100000,
	"paymentDate": "2025-09-18",
	"paymentAccid": "777777605",
	"fundPaymentType": "0",
	"rateType": "基准汇率",
	"rate": 1,
	"initFlag": "no",
	"deptid": "",
	"costCenter": "",
	"profitCenter": "",
	"agencyOutlayAcc": "",
	"accentity": "1541096895095504906",
	"settledAddition": "yes",
	"settleStatus": "2",
	"settleMethod": "银行转账",
	"abstractInfo": "用途",
	"postscriptInfo": "附言",
	"payeeUnit": "财务公司",
	"otherType": "",
	"otherTypeObject": "财务公司"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：0 |
| data | object | 否 | data |
| code | string | 否 | code 示例：ZQ2411220002 |
| id | string | 否 | 单据ID 示例：2354458534394462224 |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp 示例：1732265723706 |

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"code": "ZQ2411220002",
		"id": "2354458534394462224"
	},
	"message": "",
	"timestamp": "1732265723706"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-31

更新

请求参数 initFlag

修改初始化字段为期初


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

