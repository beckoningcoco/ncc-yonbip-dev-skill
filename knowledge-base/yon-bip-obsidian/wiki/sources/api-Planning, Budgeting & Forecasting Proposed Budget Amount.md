---
title: "计划预算推预算数"
apiId: "1846869824756514816"
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

# 计划预算推预算数

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/pushDataForBpOpen

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
| callbackFlag | string | 否 | 是 | 是否需要回调 |
| dataFlag | string | 否 | 是 | 数据标识 |
| batchPushInfoPK | string | 否 | 是 | 当前批次主键 |
| cubeCode | string | 否 | 是 | 预算模型编码 |
| sysCode | string | 否 | 是 | 预算编码 |
| requestUniqueId | string | 否 | 是 | 请求唯一ID |
| data | object | 否 | 是 | 推数分页数据 |
| total | int | 否 | 是 | 总计 |
| pageSize | int | 否 | 是 | 每页个数 |
| pageNum | int | 否 | 是 | 页数 |
| pageIndex | int | 否 | 是 | 当前页 |
| list | object | 是 | 是 | 维度信息 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/pushDataForBpOpen?access_token=访问令牌
Body: {
	"callbackFlag": "",
	"dataFlag": "",
	"batchPushInfoPK": "",
	"cubeCode": "",
	"sysCode": "",
	"requestUniqueId": "",
	"data": {
		"total": 0,
		"pageSize": 0,
		"pageNum": 0,
		"pageIndex": 0,
		"list": [
			{
				"budget": "",
				"StartDate": "",
				"EndDate": "",
				"field": "",
				"field_name": "",
				"field_id": ""
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 提示信息 |
| data | object | 否 | 数据 |
| success | boolean | 否 | 是否成功 |
| error | object | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {},
	"success": true,
	"error": {}
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

