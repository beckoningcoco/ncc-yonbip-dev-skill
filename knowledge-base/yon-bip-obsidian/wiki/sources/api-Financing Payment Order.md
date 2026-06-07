---
title: "融资付费生单"
apiId: "2120717145716817929"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financing Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financing Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资付费生单

> `ContentType	application/json` 请求方式	POST | 分类: Financing Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/financepayfee/openapi/create

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
| protocolNumber | string | 否 | 是 | 协议号(可传入ID/编码/名称) 示例：2129757648045211651 |
| debtcode | string | 否 | 否 | 借据号(可传入借据ID/编码/借据号) 示例：2129757794074099721 |
| payFeePlan | string | 否 | 否 | 付费计划(金融产品中定义的付费计划) 示例：2342342243234 |
| agentOutAccid | string | 否 | 否 | 代理支出账户 示例：121312312556456 |
| payeeType | string | 否 | 是 | 收款方类型 (客户:customer 供应商:supplier 资金业务对象:capital_business) 示例：customer |
| feeCurrency | string | 否 | 是 | 付费币种(可传入ID/编码) 示例：1623643074168094746 |
| feeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 费用金额(付费币种) 示例：100000 |
| rateType | string | 否 | 否 | 本币币种汇率类型 示例：0000L6YQ8AVLFUZPXD0000 |
| supplier | string | 否 | 否 | 供应商id 示例：8765523426346 |
| customerBankAccount | string | 否 | 否 | 客户银行账号 示例：121423453465 |
| abstractInfo | string | 否 | 否 | 摘要 示例：openAPI测试 |
| costCenter | string | 否 | 否 | 成本中心 示例：4364564645645 |
| postscriptInfo | string | 否 | 否 | 附言 示例：openAPI测试 |
| otherTypeObject | string | 否 | 否 | 资金业务对象银行账户id 示例：5345346457657 |
| isPayFeePlan | string | 否 | 否 | 是否计划付费 (计划付费:isFeePlan 非计划付费:notFeePlan) 示例：notFeePlan |
| apportionBeginDate | string | 否 | 否 | 分摊开始日期 示例：2023-11-01 |
| settledAddition | string | 否 | 否 | 已结算补单( yes:是 no:否) 示例：yes |
| paymentAccid | string | 否 | 是 | 付费账户 示例：1541098836418101253 |
| settleStatus | string | 否 | 否 | 结算状态 (待结算 0,结算成功:2) 示例：2 |
| deptid | string | 否 | 否 | 部门 示例：154109883641810125 |
| payeeUnit | string | 否 | 否 | 收款方单位 示例：154109883641810125 |
| profitCenter | string | 否 | 否 | 利润中心 示例：154109883641810125 |
| otherBankAccount | string | 否 | 否 | 对方银行账号 示例：154109883641810125 |
| otherOpenAccountBank | string | 否 | 否 | 对方账户开户行 |
| firstAssessmentDate | string | 否 | 否 | 首次分摊日 示例：2024-07-05 00:00:00 |
| fundPaymentType | string | 否 | 否 | 资金支付模式( 1:主动 0被动) 示例：0 |
| rate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 本币币种汇率 示例：2 |
| initAssessedDate | string | 否 | 否 | 期初分摊日 示例：2024-07-01 00:00:00 |
| settleMethod | string | 否 | 否 | 结算方式 示例：1525649083156923163 |
| allocationType | string | 否 | 否 | 分摊类型( 不分摊:non-contribution 按期限分摊:apportionment_term 按合同分摊:contract_apportionment) 示例：non-contribution |
| supplierBankAccount | string | 否 | 否 | 供应商银行账号 示例：154109883641810125 |
| allocationWay | string | 否 | 否 | 分摊方式( fee_rate:费率‰ commitment_proportion 承担比例%) 示例：commitment_proportion |
| assessmentPeriod | string | 否 | 否 | 分摊周期 (月:month 季度:quarter 半年:halfYear 年:year) 示例：month |
| apportionEndDate | string | 否 | 否 | 分摊结束日期 示例：2024-11-01 00:00:00 |
| paymentDate | string | 否 | 否 | 付费日期 示例：2024-06-06 00:00:00 |
| isInit | string | 否 | 否 | 是否期初 (期初 :1 非期初 :0) 示例：0 |
| feeItem | string | 否 | 否 | 费用项目 示例：1556183697867145218 |
| customer | string | 否 | 否 | 客户id 示例：1541825484770246657 |

## 3. 请求示例

Url: /yonbip/ctm/fm/financepayfee/openapi/create?access_token=访问令牌
Body: {
	"protocolNumber": "2129757648045211651",
	"debtcode": "2129757794074099721",
	"payFeePlan": "2342342243234",
	"agentOutAccid": "121312312556456",
	"payeeType": "customer",
	"feeCurrency": "1623643074168094746",
	"accentity": "1541096895095504906",
	"feeAmount": 100000,
	"rateType": "0000L6YQ8AVLFUZPXD0000",
	"supplier": "8765523426346",
	"customerBankAccount": "121423453465",
	"abstractInfo": "openAPI测试",
	"costCenter": "4364564645645",
	"postscriptInfo": "openAPI测试",
	"otherTypeObject": "5345346457657",
	"isPayFeePlan": "notFeePlan",
	"apportionBeginDate": "2023-11-01",
	"settledAddition": "yes",
	"paymentAccid": "1541098836418101253",
	"settleStatus": "2",
	"deptid": "154109883641810125",
	"payeeUnit": "154109883641810125",
	"profitCenter": "154109883641810125",
	"otherBankAccount": "154109883641810125",
	"otherOpenAccountBank": "",
	"firstAssessmentDate": "2024-07-05 00:00:00",
	"fundPaymentType": "0",
	"rate": 2,
	"initAssessedDate": "2024-07-01 00:00:00",
	"settleMethod": "1525649083156923163",
	"allocationType": "non-contribution",
	"supplierBankAccount": "154109883641810125",
	"allocationWay": "commitment_proportion",
	"assessmentPeriod": "month",
	"apportionEndDate": "2024-11-01 00:00:00",
	"paymentDate": "2024-06-06 00:00:00",
	"isInit": "0",
	"feeItem": "1556183697867145218",
	"customer": "1541825484770246657"
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：0 |
| data | object | 否 | 结果集 |
| code | string | 否 | 单据编码 示例：FF2411220002 |
| id | string | 否 | 单据ID 示例：2342342342324 |
| message | string | 否 | 返回消息 |
| timestamp | string | 否 | 时间戳 示例：1732265723706 |

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"code": "FF2411220002",
		"id": "2342342342324"
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

请求说明

更新

请求参数 (25)

删除

请求参数 createMethod

删除

请求参数 otherType

删除

请求参数 otherBankType

新增

返回参数 id

更新

返回参数 (5)

删除

返回参数 statusMsg

将初始化字段修改为期初

2	2025-09-09

新增

请求参数 settledAddition

更新

请求参数 settleStatus


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

