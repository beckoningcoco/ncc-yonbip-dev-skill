---
title: "智能赋码"
apiId: "2096344486209650694"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能赋码

> `ContentType	application/json` 请求方式	GET | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/etax/aiMatchSpInfo

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| xmmc | string | query | 是 | 商品名称    示例: 水果 |

## 3. 请求示例

Url: /yonbip/tax/api/etax/aiMatchSpInfo?access_token=访问令牌&xmmc=%E6%B0%B4%E6%9E%9C

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| message | string | 否 | 操作信息 示例：智能赋码成功 |
| data | string | 否 | 响应信息 |
| datas | object | 是 | 匹配结果 |
| slvList | string | 是 | 税率集合 示例：["0.13"] |
| spsjbm | string | 否 | 商品实际编码 示例：1030206000000000000 |
| zzscezsbj | string | 否 | 增值税差额征税标记 示例：N |
| spfwjc | string | 否 | 商品服务简称 示例：调味品 |
| qyrq | string | 否 | 启用日期 示例：2019-04-01 |
| sphfwssflhbbm | string | 否 | 商品和服务税收分类合并编码 示例：1030206030000000000 |
| sfhzx | string | 否 | 是否汇总项 示例：N |
| sfbzsbz | string | 否 | 是否不征税标志 示例：N |
| zslList | string | 是 | 征收率集合 示例：["0.03"] |
| sm | string | 否 | 说明 |
| zt | string | 否 | 状态 示例：Y |
| zzsslhzzsl | string | 否 | ??? 示例：13% |
| zzstsglList | string | 是 | 增值税特殊管理集合 示例：["简易征收"] |
| zsljh | string | 否 | 征收率 示例：3% |
| hyjh | string | 否 | ??? 示例：140603 |
| hwhlwmc | string | 否 | 货物或劳务名称 示例：醋及醋代用品 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "智能赋码成功",
	"datas": [
		{
			"slvList": [
				"0.13"
			],
			"spsjbm": "1030206000000000000",
			"zzscezsbj": "N",
			"spfwjc": "调味品",
			"qyrq": "2019-04-01",
			"sphfwssflhbbm": "1030206030000000000",
			"sfhzx": "N",
			"sfbzsbz": "N",
			"zslList": [
				"0.03"
			],
			"sm": "",
			"zt": "Y",
			"zzsslhzzsl": "13%",
			"zzstsglList": [
				"简易征收"
			],
			"zsljh": "3%",
			"hyjh": "140603",
			"hwhlwmc": "醋及醋代用品"
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

