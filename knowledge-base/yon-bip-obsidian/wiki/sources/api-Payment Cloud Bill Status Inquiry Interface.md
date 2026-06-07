---
title: "收付云票据状态查询接口"
apiId: "dce62ce9b2214d73a22523162a4eae3f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 收付云票据状态查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/drft/api/bill/queryStatus

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
| billNo | string | 否 | 否 | 票据号，如果传入此参数请求流水号可不填，两者保证一个必填 示例：131330320008220190327397820204 |
| srcItem | long | 否 | 是 | 来源 50商业汇票 51四方 示例：51 |
| pk_register | long | 否 | 否 | pk_register 示例：10000 |
| billrangestart | long | 否 | 否 | billrangestart 示例：1 |
| billrangeend | long | 否 | 否 | billrangeend 示例：10000 |

## 3. 请求示例

Url: /yonbip/ctm/drft/api/bill/queryStatus?access_token=访问令牌
Body: {
	"billNo": "131330320008220190327397820204",
	"srcItem": 51,
	"pk_register": 10000,
	"billrangestart": 1,
	"billrangeend": 10000
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| billNo | string | 否 | billNo 示例：131330320008220229 |
| billType | string | 否 | billType 示例：AC01 |
| businessDate | string | 否 | businessDate 示例：20210420 |
| businessNum | string | 否 | businessNum 示例：20210420 |
| ecdsStatus | string | 否 | ecdsStatus 示例：100006 |
| ecdsStatusName | string | 否 | ecdsStatusName 示例：背书已签收 |
| extend | string | 否 | extend |
| noteStatus | string | 否 | noteStatus 示例：10 |
| noteStatusName | string | 否 | noteStatusName 示例：在背书 |
| srcItem | long | 否 | srcItem 示例：51 |
| availableRange | string | 否 | availableRange |
| oneAvailableMoney | BigDecimal | 否 | oneAvailableMoney 示例：100 |
| availableMoney | BigDecimal | 否 | availableMoney 示例：100 |
| useMoney | BigDecimal | 否 | useMoney 示例：100 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"billNo": "131330320008220229",
		"billType": "AC01",
		"businessDate": "20210420",
		"businessNum": "20210420",
		"ecdsStatus": "100006",
		"ecdsStatusName": "背书已签收",
		"extend": "",
		"noteStatus": "10",
		"noteStatusName": "在背书",
		"srcItem": 51,
		"availableRange": "",
		"oneAvailableMoney": 100,
		"availableMoney": 100,
		"useMoney": 100
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403004	日期格式错误

1022020403002	参数为空


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

