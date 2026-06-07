---
title: "公务卡流水导入新增"
apiId: "1991760039669399555"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Corporate Card Transaction"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Corporate Card Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 公务卡流水导入新增

> `ContentType	application/json` 请求方式	POST | 分类: Corporate Card Transaction (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/yonbip-fi-expsrbsm/api/bill/officialrecord/importRecords

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
| transactionserialnumber | string | 否 | 是 | 交易流水号 示例：2132131123321320385 |
| handlecode | string | 否 | 是 | 持卡人员工编号 示例：00009706 |
| handlecardnumber | string | 否 | 是 | 持卡人卡号（唯一） 示例：333333333333330111111 |
| transactionmny | string | 否 | 是 | 交易金额 示例：200 |
| transactioncurrency | string | 否 | 是 | 交易币种 示例：CNY |
| merchantname | string | 否 | 是 | 商户名称 示例：京东集团 |
| transactioncategory | string | 否 | 否 | 交易分类 示例：购物 |
| customercode | string | 否 | 否 | 客户号 示例：000011111166666 |
| transactiontime | string | 否 | 是 | 交易时间 示例：2024-04-30 15:34:22 |
| postingdate | string | 否 | 否 | 入账日期 示例：2024-04-30 |
| officialCardRecordDcs | object | 否 | 否 | 特征 |
| tezheng | string | 否 | 否 | 特征A 示例：2132131123321320325 |
| dangan001 | string | 否 | 否 | 特征B 示例：1570148586468409347 |

## 3. 请求示例

Url: /yonbip/znbz/yonbip-fi-expsrbsm/api/bill/officialrecord/importRecords?access_token=访问令牌
Body: [{
	"transactionserialnumber": "2132131123321320385",
	"handlecode": "00009706",
	"handlecardnumber": "333333333333330111111",
	"transactionmny": "200",
	"transactioncurrency": "CNY",
	"merchantname": "京东集团",
	"transactioncategory": "购物",
	"customercode": "000011111166666",
	"transactiontime": "2024-04-30 15:34:22",
	"postingdate": "2024-04-30",
	"officialCardRecordDcs": {
		"tezheng": "2132131123321320325",
		"dangan001": "1570148586468409347"
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | message 示例：操作成功 |
| traceId | string | 否 | traceId 示例：38c5fd4d36e30335 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"traceId": "38c5fd4d36e30335"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

新增

请求参数 postingdate

新增参数入账日期

2	2025-07-11

新增

请求参数 tezheng

删除

请求参数 dddtez00022

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

