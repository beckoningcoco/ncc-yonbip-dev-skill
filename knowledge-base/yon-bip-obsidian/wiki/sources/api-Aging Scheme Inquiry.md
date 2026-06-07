---
title: "账龄方案查询"
apiId: "2279084289299054595"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Aging Scheme"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Aging Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 账龄方案查询

> `ContentType	application/json` 请求方式	POST | 分类: Aging Scheme (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/accountage/bill/list

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
| pageIndex | string | 否 | 否 | 分页序号 示例：1 |
| pageSize | string | 否 | 否 | 分页大小 示例：20 |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/accountage/bill/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "20"
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数量 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页序号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 数据数量 示例：1 |
| recordList | object | 是 | 数据集合 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 分页总数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页开始序号 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页结束序号 示例：1 |
| traceId | string | 否 | traceId 示例：dd272ff6b1c2bd4e |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"code": "20230506003",
				"modifyDate": "2025-04-24 00:00:00",
				"creatorId": "1525641755939569667",
				"modifierId": "1525641755939569667",
				"active": false,
				"default_status": false,
				"timeunit": "1",
				"creatorId_name": "u8c_vip管理员",
				"unitnumber": "1",
				"modifyTime": "2025-04-24 19:13:41",
				"createTime": "2023-05-06 14:03:23",
				"modifierId_name": "u8c_vip管理员",
				"name": "天的方案",
				"id": "1719301204245741574",
				"pubts": "2023-05-06 14:03:24",
				"tenant": 2909930715861584,
				"createDate": "2023-05-06 00:00:00"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "dd272ff6b1c2bd4e",
	"uploadable": "0"
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

