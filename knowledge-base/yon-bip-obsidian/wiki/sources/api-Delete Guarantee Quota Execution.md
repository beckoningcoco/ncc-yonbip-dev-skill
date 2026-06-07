---
title: "担保额度执行删除"
apiId: "2086050153976823812"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quota Execution"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quota Execution]
platform_version: "BIP"
source_type: community-api-docs
---

# 担保额度执行删除

> `ContentType	application/json` 请求方式	POST | 分类: Quota Execution (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/deleteEnforcement

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
| id | string | 否 | 是 | 担保合同ID 示例：2160249321788276745 |
| srcitem | string | 否 | 是 | 来源系统：104-授信管理、105-投融资管理、106-商业汇票、107-保函管理、108-信用证管理、109-外部系统 示例：104 |
| businessCode | string | 否 | 是 | 来源业务单据 示例：CAMCONT202412201177 |
| executionOrderType | string | 否 | 是 | 执行单类型：1-占用、2-释放 示例：1 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/deleteEnforcement?access_token=访问令牌
Body: [{
	"id": "2160249321788276745",
	"srcitem": "104",
	"businessCode": "CAMCONT202412201177",
	"executionOrderType": "1"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	接口错误


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

