---
title: "查询开启额度控制编制单"
apiId: "1649685797434556418"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Plan Summary"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Plan Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询开启额度控制编制单

> `ContentType	application/json` 请求方式	POST | 分类: Inquire Plan Summary (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/energy/queryItemIds

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
| accentity | string | 否 | 是 | 资金组织，支持id/code 示例：1533791344826253318 |
| currency | string | 否 | 是 | 币种，支持id/code 示例：2618396391264768 |
| businessDate | Date | 否 | 是 | 业务日期，业务单据对应的业务日期 示例：2023-02-01 |
| dept | string | 否 | 否 | 部门，支持id/code 示例：1533791344826253318 |

## 3. 请求示例

Url: /yonbip/ctm/energy/queryItemIds?access_token=访问令牌
Body: {
	"accentity": "1533791344826253318",
	"currency": "2618396391264768",
	"businessDate": "2023-02-01",
	"dept": "1533791344826253318"
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
| code | string | 否 | 状态码 示例："200" |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | long | 是 | 返回数据，开启额度控制的编制单子表id列表 示例：[2990668867905537,2990668867905538,2990668867905540] |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		2990668867905537,
		2990668867905538,
		2990668867905540
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	参数为空

999	逻辑异常,附带错误信息


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

