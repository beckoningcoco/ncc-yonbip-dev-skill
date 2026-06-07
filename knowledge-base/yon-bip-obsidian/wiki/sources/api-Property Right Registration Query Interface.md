---
title: "物权登记查询接口"
apiId: "2278980918026174467"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Security Interest"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Security Interest]
platform_version: "BIP"
source_type: community-api-docs
---

# 物权登记查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Security Interest (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/queryPropertyRight

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
| accentity | string | 否 | 是 | 资金组织 示例：宝可梦宇宙 |
| code | string | 否 | 是 | 物权编码 示例：GRMREM250529001 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/queryPropertyRight?access_token=访问令牌
Body: {
	"accentity": "宝可梦宇宙",
	"code": "GRMREM250529001"
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| msgs | string | 是 | msgs 示例：[""] |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| successRecords | object | 是 | successRecords |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | totalCount 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgs": [
			""
		],
		"sucessCount": 1,
		"failCount": 0,
		"successRecords": [
			{
				"serialNumber": "123456789914",
				"accentity": "2312820403671296",
				"prName": "小鹰号航母14",
				"prSourceType": 1,
				"unitProperty": 1,
				"unitName": "冰露",
				"prTypeName": "土地使用权",
				"purpose": 1,
				"currency": "2163654411424512",
				"prPrice": 10000,
				"startDate": "2022-01-23 00:00:00",
				"endDate": "2023-03-23 00:00:00",
				"assessDate": "2022-03-01 00:00:00",
				"assessUnit": "1538815442944000005",
				"assessPrice": "5000",
				"rate": 50,
				"prType": 2454172890452234,
				"pledgePrice": 2500,
				"id": "1515200243853426696",
				"auditStatus": 1,
				"prStatus": 1,
				"code": "GRMREM220804001",
				"usePledgePrice": 0,
				"tenant": 2163654053351680
			}
		],
		"totalCount": 1
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

