---
title: "资源申报删除"
apiId: "2451085737968795656"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Manual Resource Report"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Manual Resource Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 资源申报删除

> `ContentType	application/json` 请求方式	POST | 分类: Manual Resource Report (CO)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/ecc/resourceDeclaration/del

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 单据id |
| code | string | 否 | 否 | 单据编码 |

## 3. 请求示例

Url: /yonbip/FCC/ecc/resourceDeclaration/del?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "",
			"code": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：success |
| data | object | 否 | 数据 |
| count | number |
| 小数位数:0,最大长度:38 | 否 | 数量 示例：2 |
| sucessCount | number |
| 小数位数:0,最大长度:38 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:38 | 否 | 失败数量 示例：1 |
| failInfos | object | 是 | 失败信息 |
| infos | object | 是 | 成功信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"failInfos": [
			{
				"id": 222454126880793643456,
				"code": "20260114150634",
				"message": "单据数据错误!"
			}
		],
		"infos": [
			{
				"id": 222454126880793643456,
				"code": "20260114150634"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

