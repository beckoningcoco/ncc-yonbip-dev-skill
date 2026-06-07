---
title: "取数规则数据查询"
apiId: "2164534204391489541"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Retrieval Rule Configuration"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Retrieval Rule Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 取数规则数据查询

> `ContentType	application/json` 请求方式	POST | 分类: Retrieval Rule Configuration (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/dataTypeConf/getBills

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
| dataConfigId | string | 否 | 是 | 取数规则配置ID，可以传编码或者ID |
| beginDate | string | 否 | 是 | 取数开始日期，格式 yyyy-MM-dd |
| endDate | string | 否 | 是 | 取数结束日期，格式 yyyy-MM-dd |
| salesOrgId | string | 否 | 否 | 取数组织ID，可以传编码或者ID，多个用,拼接，如AAA,BBB,CCC |

## 3. 请求示例

Url: /yonbip/EFI/revenue/dataTypeConf/getBills?access_token=访问令牌
Body: {
	"dataConfigId": "",
	"beginDate": "",
	"endDate": "",
	"salesOrgId": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态标识 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常	接口返回信息处理


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

