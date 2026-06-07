---
title: "固定资产盘点批量弃审并删除"
apiId: "1975371045772722177"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Stocktaking"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Stocktaking]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点批量弃审并删除

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Stocktaking (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaInventory/batchUnAuditAndDelete

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
| code | string | 否 | 否 | 单据编码 示例：PD123 |
| id | string | 否 | 否 | 单据id，id和编码同时存在以id为准 示例：1111 |

## 3. 请求示例

Url: /yonbip/EFI/FaInventory/batchUnAuditAndDelete?access_token=访问令牌
Body: [{
	"code": "PD123",
	"id": "1111"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 明细 |
| success | object | 是 | 成功数据 |
| failed | object | 是 | 失败数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "956863017997565954"
			}
		],
		"failed": [
			{
				"id": "956863017997565954",
				"message": "错误信息"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	单据[gl00048]删除报错,错误原因:当前单据不是最新状态，请刷新重试。	重新查询单据后再删除


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

