---
title: "资金收款单提交"
apiId: "1815676843094704137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金收款单提交

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/fundcollection/submit

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
| fullname | string | 否 | 否 | 元数据fullname 默认值：cmp.fundcollection.FundCollection |
| billnum | string | 否 | 否 | 资金收款单billnum 默认值：cmp_fundcollection |
| data | object | 否 | 是 | 资金收款单数据 |
| id | string | 否 | 否 | id |
| submitTime | string | 否 | 否 | 提交时间 |
| submitter | string | 否 | 否 | 提交人 |

## 3. 请求示例

Url: /yonbip/ctm/fundcollection/submit?access_token=访问令牌
Body: {
	"fullname": "",
	"billnum": "",
	"data": {
		"id": "",
		"submitTime": "",
		"submitter": ""
	}
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	批量操作通常不存在错误码，如果删除失败，请参照messages的提示处理	参照返回messages的提示处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-01

新增

请求参数 submitTime

新增

请求参数 submitter

2	2025-04-23

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

