---
title: "公共撤回"
apiId: "2358344766821761026"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment and Financing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment and Financing]
platform_version: "BIP"
source_type: community-api-docs
---

# 公共撤回

> `ContentType	application/json` 请求方式	POST | 分类: Investment and Financing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/common/openapi/unSubmit

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
| id | number |
| 小数位数:0,最大长度:32 | 否 | 否 | 单据ID(id与code必传其一) 示例：2352762589262381063 |
| code | string | 否 | 否 | 单据编号(id与code必传其一) 示例：SX2509060001 |
| billNo | string | 否 | 是 | 单据类型编码 示例：tlm_interestcollection |

## 3. 请求示例

Url: /yonbip/ctm/fm/common/openapi/unSubmit?access_token=访问令牌
Body: {
	"id": 2352762589262381063,
	"code": "SX2509060001",
	"billNo": "tlm_interestcollection"
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
| 小数位数:0,最大长度:10 | 否 | 响应码 示例：200 |
| message | string | 否 | 成功或失败消息 示例：成功 |
| timestamp | string | 否 | 时间戳 示例：1732265723706 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "成功",
	"timestamp": "1732265723706"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

