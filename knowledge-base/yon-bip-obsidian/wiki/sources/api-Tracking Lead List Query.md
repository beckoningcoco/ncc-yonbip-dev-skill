---
title: "跟踪线索列表查询"
apiId: "2197174770414911496"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tracking Lead"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tracking Lead]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟踪线索列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Tracking Lead (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/reservation/list

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：10 默认值：10 |
| code | string | 否 | 否 | 跟踪线索编码 |
| name | string | 否 | 否 | 跟踪线索名称 |
| wbs | string | 否 | 否 | WBS任务ID |
| prpject | string | 否 | 否 | 项目ID |
| simpleVOs | object | 是 | 否 | simpleVOs |
| field | string | 否 | 否 | field |
| op | string | 否 | 否 | op |
| value1 | string | 否 | 否 | value1 |
| value2 | string | 否 | 否 | value2 |

## 3. 请求示例

Url: /yonbip/scm/reservation/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "",
	"name": "",
	"wbs": "",
	"prpject": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
| 小数位数:0,最大长度:10 | 否 | 操作符 示例：200 |
| message | string | 否 | 操作信息 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：1 |
| recordList | object | 是 | 详情信息 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"code": "UO-916020220714000001",
				"modifyDate": "2025-02-07 00:00:00",
				"modifier": "昵称-赵建军",
				"modifierId": "1502460400189308930",
				"reservecust": "1508720349390307332",
				"typeid_name": "销售订单",
				"reservebillid": 0,
				"reservebilltype": "voucher_order",
				"modifyTime": "2025-02-07 11:35:54",
				"reservebillcode": "UO-916020220714000001",
				"name": "P_YS_SCM_USTOCK_1591005712165109764UO-916020220714000001",
				"reservebillautoid": 0,
				"typeid": "1697052002426829324",
				"id": "1591639898531561480",
				"pubts": "2025-02-07 11:35:54",
				"demandtype": "1"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
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

