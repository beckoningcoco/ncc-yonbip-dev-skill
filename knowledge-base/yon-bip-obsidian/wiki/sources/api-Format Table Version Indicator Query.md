---
title: "格式表版本指标查询"
apiId: "2160173180608053257"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 格式表版本指标查询

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bcs/item/queryByTime

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
| sheetCode | string | 否 | 否 | sheetCode 示例：12051334 |
| cubeCode | string | 否 | 否 | cubeCode 示例：s14 |
| year | string | 否 | 否 | year 示例：2024 |
| period | string | 否 | 否 | period 示例：1 |

## 3. 请求示例

Url: /yonbip/qyjx/bcs/item/queryByTime?access_token=访问令牌
Body: {
	"sheetCode": "12051334",
	"cubeCode": "s14",
	"year": "2024",
	"period": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| data | object | 是 | data |
| pkObj | string | 否 | pkObj 示例：2149003233286160392 |
| pkSheet | string | 否 | pkSheet 示例：2149003233286160384 |
| itemcode | string | 否 | itemcode 示例：ZB1 |
| name | string | 否 | name 示例：_版本0 |
| name2 | string | 否 | name2 |
| name3 | string | 否 | name3 |
| name4 | string | 否 | name4 |
| name5 | string | 否 | name5 |
| name6 | string | 否 | name6 |
| isdefault | number |
| 小数位数:0,最大长度:10 | 否 | isdefault 示例：0 |
| datatype | number |
| 小数位数:0,最大长度:10 | 否 | datatype 示例：5 |
| textlength | number |
| 小数位数:0,最大长度:10 | 否 | textlength 示例：50 |
| enumvalue | string | 否 | enumvalue |
| dimref | string | 否 | dimref |
| sumtype | string | 否 | sumtype 示例：0 |
| sheetlink | string | 否 | sheetlink |
| itemtype | string | 否 | itemtype 示例：0 |
| tableName | string | 否 | tableName 示例：tb_tdtxt1 |
| colName | string | 否 | colName 示例：txtvalue1 |
| createno | number |
| 小数位数:0,最大长度:10 | 否 | createno 示例：1 |
| editFormula | string | 否 | editFormula 示例：2 |
| timesumtype | string | 否 | timesumtype 示例：0 |
| converttype | string | 否 | converttype 示例：0 |
| ytenantId | string | 否 | ytenantId 示例：0000L6YQ8AVLFUZPXD0000 |
| systemcode | string | 否 | systemcode 示例：BCS |
| ts | string | 否 | ts 示例：2024-12-05 13:35:03 |
| creator | string | 否 | creator 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| creationtime | string | 否 | creationtime 示例：2024-12-05 13:35:03 |
| modifier | string | 否 | modifier 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifiedtime | string | 否 | modifiedtime 示例：2024-12-05 13:36:36 |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | dr 示例：0 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"pkObj": "2149003233286160392",
			"pkSheet": "2149003233286160384",
			"itemcode": "ZB1",
			"name": "_版本0",
			"name2": "",
			"name3": "",
			"name4": "",
			"name5": "",
			"name6": "",
			"isdefault": 0,
			"datatype": 5,
			"textlength": 50,
			"enumvalue": "",
			"dimref": "",
			"sumtype": "0",
			"sheetlink": "",
			"itemtype": "0",
			"tableName": "tb_tdtxt1",
			"colName": "txtvalue1",
			"createno": 1,
			"editFormula": "2",
			"timesumtype": "0",
			"converttype": "0",
			"ytenantId": "0000L6YQ8AVLFUZPXD0000",
			"systemcode": "BCS",
			"ts": "2024-12-05 13:35:03",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"creationtime": "2024-12-05 13:35:03",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"modifiedtime": "2024-12-05 13:36:36",
			"dr": 0
		}
	],
	"success": true
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

