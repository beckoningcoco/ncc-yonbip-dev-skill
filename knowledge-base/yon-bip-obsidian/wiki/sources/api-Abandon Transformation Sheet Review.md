---
title: "形态转换单弃审"
apiId: "b2a5b2d1e8ae4ae8add26068fb3dfbf8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transformation Sheet"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transformation Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 形态转换单弃审

> `ContentType	application/json` 请求方式	POST | 分类: Transformation Sheet (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/morphologyconversion/batchunaudit

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
| data | object | 是 | 是 | 其他出库单[st.othoutrecord.OthOutRecord] |
| id | long | 否 | 是 | 主表id 示例：1915883316809984 |

## 3. 请求示例

Url: /yonbip/scm/morphologyconversion/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1915883316809984
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总数 示例：2 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：1 |
| messages | object | 是 | 返回消息 |
| infos | object | 是 | 成功信息 |
| failInfos | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{}
		],
		"infos": [
			{
				"id": 2528880654733824,
				"verifystate": 0,
				"status": 0,
				"pubts": "yyyy-MM-dd HH:mm:ss"
			}
		],
		"failInfos": [
			{
				"id": 2528880654733824,
				"message": "id为 2357572429534208 的单据已经为“开立”状态，请刷新确认"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据提示检查，再操作即可


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

