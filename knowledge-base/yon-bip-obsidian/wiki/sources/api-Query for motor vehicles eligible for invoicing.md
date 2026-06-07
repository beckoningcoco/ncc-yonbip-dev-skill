---
title: "可开具发票的机动车查询"
apiId: "2172812685121421312"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 可开具发票的机动车查询

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/etax/query/vehicle/list/avalible

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
| xsfNsrsbh | string | 否 | 是 | 销售方纳税人识别号 示例：91310115090099AAAAAA |
| allElcUserName | string | 否 | 否 | 电子税局基础通道账号 示例：13113140098 |
| vehicleLshs | string | 是 | 否 | 车辆识别代号/车架号 示例：["CLSBDH2310191209","CLSBDH2310191314","CLSBDH22310310910"] 最大请求量：100 |
| pageSize | number |
| 小数位数:0,最大长度:100 | 否 | 否 | 每页数据数量 示例：100 默认值：100 |
| pageNumber | number |
| 小数位数:0,最大长度:100 | 否 | 否 | 当前分页号 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/tax/api/etax/query/vehicle/list/avalible?access_token=访问令牌
Body: {
	"xsfNsrsbh": "91310115090099AAAAAA",
	"allElcUserName": "13113140098",
	"vehicleLshs": [
		"CLSBDH2310191209",
		"CLSBDH2310191314",
		"CLSBDH22310310910"
	],
	"pageSize": 100,
	"pageNumber": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| message | string | 否 | 操作信息 示例：查询成功 |
| data | string | 否 | 响应信息 |
| datas | object | 是 | 查询结果 |
| clsbdh | string | 否 | 车辆识别代号/车架号 示例：CLSBDH2310191209 |
| makeout | boolean | 否 | 是否可开具发票 示例：true |
| remark | string | 否 | 不可开具发票原因 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"datas": [
		{
			"clsbdh": "CLSBDH2310191209",
			"makeout": true,
			"remark": "null"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

