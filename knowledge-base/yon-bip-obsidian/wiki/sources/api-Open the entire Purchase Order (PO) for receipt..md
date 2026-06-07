---
title: "采购订单整单到货打开"
apiId: "1712677875164905472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单整单到货打开

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/arrivalOpen

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
| data | object | 是 | 是 | 订单数据 |
| id | string | 否 | 是 | 订单主表ID 示例：1702313749704081410 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/arrivalOpen?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1702313749704081410"
		}
	]
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 否 | 数据 |
| count | long | 否 | 计数 示例：1 |
| sucessCount | long | 否 | 成功计数 示例：1 |
| failCount | long | 否 | 失败计数 示例：0 |
| messages | object | 是 | 消息 示例：["CG000006000578单据到货打开成功"] |
| infos | object | 是 | 信息 示例：["CG000006000578单据到货打开成功"] |
| failInfos | object | 是 | 失败信息 示例：["CG000006000578单据到货打开失败"] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"CG000006000578单据到货打开成功"
		],
		"infos": [
			"CG000006000578单据到货打开成功"
		],
		"failInfos": [
			"CG000006000578单据到货打开失败"
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-25

更新

请求说明

入参转换模式统一修改为：入参映射（透传未知参数）


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

