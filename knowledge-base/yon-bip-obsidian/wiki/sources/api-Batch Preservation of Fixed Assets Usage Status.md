---
title: "固定资产使用状态批量保存"
apiId: "1798787528428879876"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Usage Status"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Usage Status]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产使用状态批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Usage Status (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/Usagestate/save

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
| data | object | 是 | 是 | 固定资产使用状态信息 |
| code | string | 否 | 是 | 使用状态编码 示例：20 |
| name | string | 否 | 是 | 使用状态名称 示例：市场波动情况停用 |
| isDepreciation | boolean | 否 | 是 | 是否折旧 示例：true |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请删除数据后重新保存) 示例：Insert 默认值：Insert |

## 3. 请求示例

Url: /yonbip/EFI/Usagestate/save?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "20",
			"name": "市场波动情况停用",
			"isDepreciation": true,
			"_status": "Insert"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回信息明细 |
| failInfos | string | 是 | 失败信息明细 |
| infos | object | 是 | 返回数据明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"failInfos": [
			""
		],
		"infos": [
			{
				"code": "30",
				"enable": "1",
				"id": "1817225608276475905",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"isDepreciation": true,
				"createTime": "2023-09-15 12:41:44",
				"name": {
					"zh_CN": "天气波动情况停用"
				},
				"creator_userName": "默认用户"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

