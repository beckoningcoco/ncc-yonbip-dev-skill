---
title: "项目-人员列表查询"
apiId: "44c79b6596ed47f3ab5834ad198e7165"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project - Personnel"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project - Personnel]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目-人员列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Project - Personnel (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/projectpsn/list

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
| pageSize | long | 否 | 是 | 每页行数 示例：20 |
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| cfinaceorg | string | 否 | 否 | 业务单元id 示例：1961970750984448 |
| pk_project | string | 否 | 否 | 项目id 示例：2044930442187776 |
| pk_handlepsn | string | 否 | 否 | 人员id 示例：2156611487420672 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段(pubts:时间戳;cfinaceorg.code:业务单元编码;pk_project.code:项目编码;pk_handlepsn.code:人员编码) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/projectpsn/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"cfinaceorg": "1961970750984448",
	"pk_project": "2044930442187776",
	"pk_handlepsn": "2156611487420672",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-07-01 00:00:00",
			"value2": "2021-07-31 23:59:59"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 单页数量 示例：20 |
| recordCount | long | 否 | 总数 示例：1 |
| recordList | object | 是 | 数据列表 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "sunl",
				"pk_handlepsn_name": "厦门-孙璐",
				"modifier": "sunl",
				"pk_project": "2044930442187776",
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"modifyTime": "2021-08-06 18:28:15",
				"cfinaceorg": "1961970750984448",
				"createTime": "2021-08-06 18:26:45",
				"pk_project_name": "福建项目03",
				"id": 2374793608122701,
				"pubts": "2021-08-06 18:28:14",
				"pk_handlepsn": "2156611487420672",
				"stopstatus": 0,
				"vmemo": "项目-人员新增数据"
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

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

