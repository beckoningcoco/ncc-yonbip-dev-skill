---
title: "成本收集器查询"
apiId: "2501479886323449862"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financials Foundation"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financials Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本收集器查询

> `ContentType	application/json` 请求方式	POST | 分类: Financials Foundation (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/AMP/FP/basedoc/querybd/costcollectoritem

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
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | pageSize 示例：20 默认值：20 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | pageIndex 示例：1 默认值：1 |
| simple | object | 否 | 否 | simple |
| id | string | 否 | 否 | ID |
| code | string | 否 | 否 | code 示例：1001 |
| name | string | 否 | 否 | name 示例：测试名称 |
| department | string | 否 | 否 | department 示例：1535232555358879744 |
| accentity | string | 否 | 否 | accentity 示例：1972294277132189702 |

## 3. 请求示例

Url: /yonbip/FCC/AMP/FP/basedoc/querybd/costcollectoritem?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simple": {
		"id": "",
		"code": "1001",
		"name": "测试名称",
		"department": "1535232555358879744",
		"accentity": "1972294277132189702"
	}
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 数据总数 示例：200 |
| recordList | object | 是 | 数据集合 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：10 |
| traceId | string | 否 | 调用链id 示例：96af86dd25ed14b3 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 200,
		"recordList": [
			{
				"id": "2501436636007497730",
				"accentity": "1972294277132189702",
				"accentity_code": "realco_compare",
				"accentity_name": "核算订单对照",
				"code": "1001",
				"name": "测试名称",
				"department": "1535232555358879744",
				"department_code": "LZC-D",
				"department_name": "研发部",
				"product": "2339662397845798913",
				"product_code": "LZC-ZCPDTP",
				"product_name": "LZC-主产品带图片",
				"costClass": "2497210517041446914",
				"costClass_code": "collector_class",
				"costClass_name": "收集器分类",
				"character": {},
				"enable": 1,
				"createTime": "2026-03-25 10:24:36",
				"createDate": "2026-03-25",
				"creator": "昵称-18810448078",
				"pubts": "2026-03-25 10:24:57",
				"modifyTime": "2026-03-25 11:57:57",
				"modifyDate": "2026-03-25",
				"modifier": "u8c_vip管理员"
			}
		],
		"pageCount": 10
	},
	"traceId": "96af86dd25ed14b3",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

