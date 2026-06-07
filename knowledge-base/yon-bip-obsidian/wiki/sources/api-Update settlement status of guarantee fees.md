---
title: "担保费用更新结算状态"
apiId: "2406613172671741952"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Guarantee Expense"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Guarantee Expense]
platform_version: "BIP"
source_type: community-api-docs
---

# 担保费用更新结算状态

> `ContentType	application/json` 请求方式	POST | 分类: Guarantee Expense (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/costUpdateStatus

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 费用ID 示例：123 |
| accentity | string | 否 | 否 | 资金组织 示例：456 |
| code | string | 否 | 否 | 单据编号 示例：GRMFEE123 |
| settleStatus | string | 否 | 否 | 枚举值:0=待结算、1=结算中、2=结算成功、3=部分结算成功、4=结算失败 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/costUpdateStatus?access_token=访问令牌
Body: {
	"id": "123",
	"accentity": "456",
	"code": "GRMFEE123",
	"settleStatus": ""
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
| message | string | 否 | 返回数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	接口错误	接口未调用成功

200	成功	接口调用成功


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

