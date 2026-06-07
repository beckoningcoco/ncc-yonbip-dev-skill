---
title: "档案参照信息查询"
apiId: "bda45f24bdc844f3a073b9ac4fc789df"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Ledger"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 档案参照信息查询

> `ContentType	application/json` 请求方式	POST | 分类: General Ledger (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/ficloud/refbase_ctr/queryRefJSON

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
| refCode | string | 否 | 否 | 来源档案编码 示例：ucfdef_Test09 |
| refType | string | 否 | 否 | 来源档案类型 示例：list |
| displayFields | string | 是 | 否 | 显示信息 示例：["id","code","name"] |
| funcode | string | 否 | 否 | 档案编码 示例：setting_multidimension |

## 3. 请求示例

Url: /yonbip/fi/ficloud/refbase_ctr/queryRefJSON?access_token=访问令牌
Body: {
	"refCode": "ucfdef_Test09",
	"refType": "list",
	"displayFields": [
		"id",
		"code",
		"name"
	],
	"funcode": "setting_multidimension"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| success | boolean | 否 | 返回成功标识 示例：true |
| message | string | 否 | 返回描述 |
| data | object | 是 | 返回数据 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 编码 示例：01 |
| name | string | 否 | 名称 示例：OEM采购 |
| id | string | 否 | 主键 示例：353c6d2ff9694b0ebdef93a0f6c05392 |
| code | long | 否 | 编码 示例：0 |
| total | long | 否 | 总计 示例：0 |

## 5. 正确返回示例

{
	"success": true,
	"message": "",
	"data": [
		{
			"code": "01",
			"name": "OEM采购",
			"id": "353c6d2ff9694b0ebdef93a0f6c05392"
		}
	],
	"code": 0,
	"total": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

success	false


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

