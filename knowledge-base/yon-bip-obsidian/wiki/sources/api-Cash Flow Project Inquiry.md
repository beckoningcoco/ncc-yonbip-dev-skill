---
title: "现金流量项目查询"
apiId: "1530849386687365128"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量项目查询

> `ContentType	application/json` 请求方式	POST | 分类: Cash Flow Item (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fipub/basedoc/querybd/getCashflowitemList

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
| fields | string | 是 | 否 | 动态查询字段，支持 id:现金流量项目id(示例：23374923894),code:现金流量项目编码(0001),name:现金流量项目名称(示例：现金流量项目名称), cashflowtype:现金流量类型id(示例：5555555),mainattachedtable:是否主表(示例：true),directionattribute:方向属性(示例：IN),description:描述(示例：描述), pubts:时间戳(示例：2021-10-30 02:47:08),parent:上级现金流量项目id(示例：23374923894) ,level:层级(示例：1),path:路径(示例：23374923894|2221111),isEnd:是否末级(示例：true)等 示例：[ "id", "code", "name" ] |
| pageIndex | long | 否 | 否 | 页号 示例：1 |
| pageSize | long | 否 | 否 | 每页行数 示例：20 |
| conditions | object | 是 | 否 | 自定义查询条件 |
| value | string | 否 | 否 | 查询字段的值 示例：2019-10-23 14:00:37 |
| field | string | 否 | 否 | 动态查询字段，支持 id:现金流量项目id(示例：23374923894),code:现金流量项目编码(01),name:现金流量项目名称(示例：现金流量项目名称),accentity:会计主体id或编码(示例：666666), cashflowtype:现金流量类型id(示例：5555555),mainattachedtable:是否主表(示例：false),directionattribute:方向属性(示例：IN),description:描述(示例：描述), pubts:时间戳(示例：2021-10-30 02:47:08),parent:上级现金流量项目id(示例：23374923894) ,level:层级(示例：1),path:路径(示例：23374923894|2221111),isEnd:是否末级(示例：true)等,用来控制接口返回字段信息 示例：ts |
| operator | string | 否 | 否 | 查询字段操作符:like,<>,>=,>,=,<,<= 示例：>= |

## 3. 请求示例

Url: /yonbip/AMP/fipub/basedoc/querybd/getCashflowitemList?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name"
	],
	"pageIndex": 1,
	"pageSize": 20,
	"conditions": [
		{
			"value": "2019-10-23 14:00:37",
			"field": "ts",
			"operator": ">="
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
| code | string | 否 | 接口调用返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 业务数据 |
| name | string | 否 | 现金流量项目名称 示例：项目类型 |
| code | string | 否 | 现金流量项目编码 示例：7897 |
| cashflowtype | string | 否 | 现金流量类型id 示例：1530831657091203076 |
| level | int | 否 | 层级 示例：1 |
| mainattachedtable | boolean | 否 | 是否主表 示例：true:主表;false:附表 |
| isEnd | boolean | 否 | 是否末级 示例：false:非末级;true:末级 |
| pubts | string | 否 | 时间戳 示例：时间戳 |
| directionattribute | string | 否 | 方向属性 示例：IN |
| path | string | 否 | 路径 示例：1530845967922233352| |
| id | string | 否 | 现金流量项目id 示例：018AF72B-04FC-46A2-8536-63776C3BA759 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"name": "项目类型",
			"code": "7897",
			"cashflowtype": "1530831657091203076",
			"level": 1,
			"mainattachedtable": "",
			"isEnd": "",
			"pubts": "时间戳",
			"directionattribute": "IN",
			"path": "1530845967922233352|",
			"id": "018AF72B-04FC-46A2-8536-63776C3BA759"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	接口查询异常


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

