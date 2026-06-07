---
title: "异构余额占比查询接口"
apiId: "2264114455669899271"
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

# 异构余额占比查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/isomeryControlBalance

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
| busiSysCode | string | 否 | 是 | 业务系统编码 |
| requestUniqueId | string | 否 | 是 | 请求唯一标识 |
| operateFlag | int | 否 | 否 | 操作类型(0 代表控制并记录数 据，1 代表记录数据不控制，2 控制不记录数据) |
| timeStamp | string | 否 | 是 | 发送的时间戳 |
| bills | object | 是 | 是 | 业务单据数组 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/isomeryControlBalance?access_token=访问令牌
Body: {
	"busiSysCode": "",
	"requestUniqueId": "",
	"operateFlag": 0,
	"timeStamp": "",
	"bills": [
		{}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| message | string | 否 | 接口信息 |
| code | long | 否 | 响应码 示例：200 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"message": "",
	"code": 200,
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	校验失败


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

