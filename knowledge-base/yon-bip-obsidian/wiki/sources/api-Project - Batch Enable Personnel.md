---
title: "项目-人员批量启用"
apiId: "6e2c141248a54670be08066a93dd720e"
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

# 项目-人员批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Project - Personnel (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/projectpsn/unstop

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 是 | 主键 示例：2424367333396738 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/projectpsn/unstop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2424367333396738
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | long | 否 | 主键 示例：2531661957828864 |
| stopstatus | boolean | 否 | 停用状态(true:停用;false:启用) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-11-24 14:34:12 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"id": 2531661957828864,
		"stopstatus": false,
		"pubts": "2021-11-24 14:34:12"
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

