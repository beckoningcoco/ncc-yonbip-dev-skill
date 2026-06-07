---
title: "背书办理"
apiId: "2016db17ef4d4f40bb78158b0f0f3eeb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Endorsement Processing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Endorsement Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 背书办理

> `ContentType	application/json` 请求方式	POST | 分类: Endorsement Processing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/drft/api/endore/apply

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
| accentity | string | 否 | 是 | 会计主体名称 示例：四方继保 |
| billNo | string | 否 | 是 | 票据编号 示例：131330320008220190327397820204 |
| endorsee | string | 否 | 是 | 被背书人 示例：张三 |
| endorseeAcctname | string | 否 | 是 | 被背书人账户名称 示例：李四 |
| endorseeAcctno | string | 否 | 是 | 被背书人账号 示例：1807071109022100593 |
| endorseeBankcode | string | 否 | 是 | 被背书人账号银行代码 示例：110010288000 |
| endorseeBankname | string | 否 | 是 | 被背书人账号银行名称 示例：中国工商银行 |
| endorseeBanktype | string | 否 | 是 | 被背书人跨行标志 00=本行 10=跨行 示例：00 |
| endorseeCurrtype | string | 否 | 否 | 被背书人账号币种类别 示例：CNY 默认值：CNY |
| extend | string | 否 | 否 | 扩展字段 属于备用字段 可用于开发测试等 |
| indorserAcctname | string | 否 | 是 | 背书人账户名称 示例：涨榔听硼闺王亮化僵侦柱 |
| indorserAcctno | string | 否 | 是 | 背书人账号 示例：110010288000 |
| indorserBankcode | string | 否 | 是 | 背书人账号银行代码 示例：110010288000 |
| indorserBankname | string | 否 | 是 | 背书人账号银行名称 示例：中国工商银行 |
| indorserCurrtype | string | 否 | 否 | 背书人账号币种类别 示例：CNY 默认值：CNY |
| indorseDate | string | 否 | 是 | 背书申请日期 示例：20210607 |
| isTransfer | long | 否 | 否 | 转让标记 1:可再转让 0:不得转让 示例：1 |
| srcItem | long | 否 | 是 | 事项来源 四方51 示例：51 |
| pk_register | long | 否 | 否 | 票据号主键 示例：10000 |
| billrangestart | long | 否 | 否 | 收票登记-开始区间 示例：1 |
| billrangeend | long | 否 | 否 | 收票登记-结束区间 示例：10 |
| transmoney | BigDecimal | 否 | 否 | 交易金额 示例：1000 |
| transrangestart | long | 否 | 否 | 背书区间开始 示例：1 |
| transrangeend | long | 否 | 否 | 背书区间结束 示例：10 |
| serialNum | string | 否 | 否 | 收付云业务流水号 示例：001 |
| billType | string | 否 | 否 | 票据类型 示例：AC01 |

## 3. 请求示例

Url: /yonbip/ctm/drft/api/endore/apply?access_token=访问令牌
Body: {
	"accentity": "四方继保",
	"billNo": "131330320008220190327397820204",
	"endorsee": "张三",
	"endorseeAcctname": "李四",
	"endorseeAcctno": "1807071109022100593",
	"endorseeBankcode": "110010288000",
	"endorseeBankname": "中国工商银行",
	"endorseeBanktype": "00",
	"endorseeCurrtype": "CNY",
	"extend": "",
	"indorserAcctname": "涨榔听硼闺王亮化僵侦柱",
	"indorserAcctno": "110010288000",
	"indorserBankcode": "110010288000",
	"indorserBankname": "中国工商银行",
	"indorserCurrtype": "CNY",
	"indorseDate": "20210607",
	"isTransfer": 1,
	"srcItem": 51,
	"pk_register": 10000,
	"billrangestart": 1,
	"billrangeend": 10,
	"transmoney": 1000,
	"transrangestart": 1,
	"transrangeend": 10,
	"serialNum": "001",
	"billType": "AC01"
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
| code | string | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 返回的参数信息 |
| billNo | string | 否 | 票据编号 示例：131330320008220229 |
| serialNum | string | 否 | 收付云业务流水号 示例：20210604020013 |
| businessNum | string | 否 | 流水号 示例：endore210617000232 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"billNo": "131330320008220229",
		"serialNum": "20210604020013",
		"businessNum": "endore210617000232"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403002	参数为空

1022020403007	请求流水号重复 单据已经生成

1022020403500	服务器异常

1022020403004	日期格式错误

1022000403005	业务错误


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

