---
title: "物料需求单行打开"
apiId: "2406578288947363848"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Demand Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Demand Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料需求单行打开

> `ContentType	application/json` 请求方式	POST | 分类: Material Demand Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/ycpraybill/lineopen

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
| data | object | 是 | 否 | 业务数据 |
| id | number |
| 小数位数:0,最大长度:20 | 否 | 是 | 物料需求单Id 示例：2373415451939072 |
| prayBillDetails | object | 是 | 否 | 物料需求单子表 |

## 3. 请求示例

Url: /yonbip/SCC/ycpraybill/lineopen?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2373415451939072,
			"prayBillDetails": [
				{
					"id": 2373415451939073
				}
			]
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 接口返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总计数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功计数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败计数 示例：0 |
| messages | string | 是 | 操作失败提示信息 示例：[""] |
| infos | object | 是 | 操作成功单据信息 |

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
			{
				"verifystate": 2,
				"id": 2373415451939072,
				"closeReasonId": 1934739297702144,
				"closer": "19998888888",
				"closerId": 1452977546072320,
				"closeTime": "2021-06-01 16:57:02",
				"closeDate": "2021-06-01 00:00:00"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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

