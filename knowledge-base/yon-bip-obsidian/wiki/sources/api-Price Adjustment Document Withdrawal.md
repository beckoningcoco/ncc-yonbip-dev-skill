---
title: "调价单撤回"
apiId: "1861050277755879430"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单撤回

> `ContentType	application/json` 请求方式	POST | 分类: Price Adjustment (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/fieis/adjust/cancel

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| code | string | 否 | 是 | 调价单编码 示例：TJDEIS20231102000559 |

## 3. 请求示例

Url: /yonbip/CO/fieis/adjust/cancel?access_token=访问令牌
Body: {
	"code": "TJDEIS20231102000559"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 提示信息 示例："操作成功，已成功撤销调价单 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "\"操作成功，已成功撤销调价单"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	错误信息:未找到调价单编码：TJDEIS20231102000559	请输入正确的调价单编码


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

