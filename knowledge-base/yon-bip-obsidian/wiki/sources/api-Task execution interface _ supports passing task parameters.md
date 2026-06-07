---
title: "任务执行接口_可支持传任务参数"
apiId: "2054636780350078979"
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

# 任务执行接口_可支持传任务参数

> `ContentType	application/json` 请求方式	POST | 分类: EPM Data Pipeline (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/task/externalExecuteTaskWithParams

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
| periodNameStart | string | 否 | 否 | 起始期间，预算产品用 |
| taskType | number |
| 小数位数:0,最大长度:2 | 否 | 是 | 1代表任务；2代表任务组 |
| taskName | string | 否 | 否 | 任务或者任务组名称，和任务id填一个就行 |
| taskId | string | 否 | 否 | 任务或者任务组id和名称填一个就行 |
| periodNameEnd | string | 否 | 否 | 结束期间，预算产品用 |
| systemSource | string | 否 | 否 | 服务编码 |
| step | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 维度类型任务：1代表导入到接口，2代表导入到系统；数据类型任务：1代表按任务，2代表按公司，3代表不清数。 不传该参数时：维度类型任务默认为2；数据类型任务默认为1 |
| periodName | string | 否 | 否 | 合并产品的任务使用：执行任务的期间 |
| parametersMap | object | 否 | 否 | 任务执行时所需要的参数，该部分传参后，以该部分为准，任务参数没传，以任务创建那设置的参数为准。例如：任务有两个任务参数，参数编码分别为：entity和accbook。可在传参时填入该编码，如下请求示例。 |

## 3. 请求示例

Url: /yonbip/qyjx/task/externalExecuteTaskWithParams?access_token=访问令牌
Body: {
	"periodNameStart": "",
	"taskType": 0,
	"taskName": "",
	"taskId": "",
	"periodNameEnd": "",
	"systemSource": "",
	"step": 0,
	"periodName": "",
	"parametersMap": {}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

