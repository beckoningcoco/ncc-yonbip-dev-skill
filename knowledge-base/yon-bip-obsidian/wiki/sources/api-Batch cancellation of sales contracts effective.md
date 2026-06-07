---
title: "销售合同批量取消生效"
apiId: "80dfaf9575594371b799b004dd0c1cd7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同批量取消生效

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/sact/sactuneffect

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
| data | object | 否 | 否 | 请求数据 |
| id | long | 是 | 否 | 销售合同id 示例：[2155419223904768] |
| salesOrgId | string | 否 | 否 | 销售组织id（和单据编号code一起使用） 示例：2013831551734016 |
| code | string | 是 | 否 | 单据编号 示例：["SACT20210303000017"] |

## 3. 请求示例

Url: /yonbip/sd/sact/sactuneffect?access_token=访问令牌
Body: {
	"data": {
		"id": [
			2155419223904768
		],
		"salesOrgId": "2013831551734016",
		"code": [
			"SACT20210303000017"
		]
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
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 否 | 调用的返回数据 |
| count | long | 否 | 返回数据总数 示例：1 |
| sucessCount | long | 否 | 返回成功数 示例：1 |
| failCount | long | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回数据 |
| failInfos | string | 是 | 失败单据信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{}
		],
		"failInfos": [
			""
		]
	}
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

