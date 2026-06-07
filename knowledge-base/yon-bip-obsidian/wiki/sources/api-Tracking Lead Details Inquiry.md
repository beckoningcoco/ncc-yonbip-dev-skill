---
title: "跟踪线索详情查询"
apiId: "2198614400530644993"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Tracking Lead"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tracking Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟踪线索详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Tracking Lead (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/reservation/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 跟踪线索ID |
| code | string | query | 否 | 跟踪线索编码 |

## 3. 请求示例

Url: /yonbip/scm/reservation/detail?access_token=访问令牌&id=&code=

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
| 小数位数:0,最大长度:10 | 否 | 操作代码 示例：200 |
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 否 | 跟踪线索详情 |
| code | string | 否 | 跟踪线索编码 示例：UO-916020220714000001 |
| reservebillcode | string | 否 | 销售订单编码 示例：UO-916020220714000001 |
| name | string | 否 | 跟踪线索名称 示例：P_YS_SCM_USTOCK_1591005712165109764UO-916020220714000001 |
| reservecust | string | 否 | 客户ID 示例：1508720349390307332 |
| typeid | string | 否 | 需求跟踪方式ID 示例：1697052002426829324 |
| typeid_name | string | 否 | 需求跟踪方式 示例：销售订单 |
| id | string | 否 | 跟踪线索ID 示例：1591639898531561480 |
| demandtype | string | 否 | 需求跟踪方式编码 示例：1 |
| pubts | string | 否 | 时间戳 示例：2025-02-07 11:35:54 |
| reservebillid | number |
| 小数位数:0,最大长度:19 | 否 | 销售订单ID 示例：0 |
| traceId | string | 否 | traceId 示例：27819176d88b7312 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "UO-916020220714000001",
		"reservebillcode": "UO-916020220714000001",
		"name": "P_YS_SCM_USTOCK_1591005712165109764UO-916020220714000001",
		"reservecust": "1508720349390307332",
		"typeid": "1697052002426829324",
		"typeid_name": "销售订单",
		"id": "1591639898531561480",
		"demandtype": "1",
		"pubts": "2025-02-07 11:35:54",
		"reservebillid": 0
	},
	"traceId": "27819176d88b7312"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	联系技术人员


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

