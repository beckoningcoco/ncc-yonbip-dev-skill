---
title: "任务执行参照接口"
apiId: "1970010995312558085"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Data Pipeline"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Data Pipeline]
platform_version: "BIP"
source_type: community-api-docs
---

# 任务执行参照接口

> `ContentType	application/json` 请求方式	POST | 分类: EPM Data Pipeline (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/task/externalTaskReference

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
| cubeId | string | 否 | 否 | 模型id |
| serviceCode | string | 否 | 是 | 产品类型，合并为1，预算为2 |

## 3. 请求示例

Url: /yonbip/qyjx/task/externalTaskReference?access_token=访问令牌
Body: {
	"cubeId": "",
	"serviceCode": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| id | string | 否 | 任务或者任务组id |
| taskName | string | 否 | 任务或者任务组名称 |
| taskType | string | 否 | 用于区别是任务还是任务组，，，1代表任务；2代表任务组 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"taskName": "",
		"taskType": ""
	}
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

