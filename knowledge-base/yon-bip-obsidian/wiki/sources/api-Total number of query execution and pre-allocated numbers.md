---
title: "查询执行数预占数总数"
apiId: "1840196313165594627"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询执行数预占数总数

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openquerydatatotal

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
| cubeCode | string | 否 | 是 | 模型编码（必填）来自预算侧注册到中台的code 示例：wxy0802 |
| sysCode | string | 否 | 是 | 系统编码 预算系统代码，标识具体的预算系统，如"EBDG"、"BP"等 示例：EBDG |
| ytenantId | string | 否 | 是 | 租户id 示例：0000LBKKA57LFQL3Q80000 |
| endTime | string | 否 | 否 | 结束时间 示例：2023-12-31 23:59:59 |
| startTime | string | 否 | 否 | 开始时间 示例：2023-01-01 00:00:00 |
| dimDatas | object | 是 | 是 | 查询维度条件(以下条件均为示例条件，由用户注册的模型维度决定) |
| vfinacedeptid | string | 否 | 否 | 示例维度费用承担部门 示例：8758 |
| pk_busimemo | string | 否 | 否 | 示例维度费用项目 示例：02,cy |
| cfinaceorg | string | 否 | 否 | 示例维度费用承担组织 示例：48912 |
| month | string | 否 | 否 | 示例维度期间 示例：2024-04 |
| StartDate | string | 否 | 否 | 示例维度开始日期 示例：2024-04-01 |
| EndDate | string | 否 | 否 | 示例维度结束日期 示例：2024-04-30 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/openquerydatatotal?access_token=访问令牌
Body: {
	"cubeCode": "wxy0802",
	"sysCode": "EBDG",
	"ytenantId": "0000LBKKA57LFQL3Q80000",
	"endTime": "2023-12-31 23:59:59",
	"startTime": "2023-01-01 00:00:00",
	"dimDatas": [
		{
			"vfinacedeptid": "8758",
			"pk_busimemo": "02,cy",
			"cfinaceorg": "48912",
			"month": "2024-04",
			"StartDate": "2024-04-01",
			"EndDate": "2024-04-30"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| success | boolean | 否 | 响应成功标识 示例：true |
| data | object | 否 | 返回对象 |
| total | int | 否 | 总数 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"total": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	系统错误


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

