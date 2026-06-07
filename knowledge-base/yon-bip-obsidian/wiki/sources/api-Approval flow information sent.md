---
title: "审批流信息发送"
apiId: "1774231740109815812"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Task Flow Message Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task Flow Message Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 审批流信息发送

> `ContentType	application/json` 请求方式	POST | 分类: Task Flow Message Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/bp/workflowdef/sendMsgAction

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| processId | string | query | 否 | 长任务Id |
| sheetIds | string | query | 否 | 表单Id |
| receiveMail | string | query | 否 | 接收邮箱 |
| nodeId | string | query | 否 | 节点主键 |
| subInsName | string | query | 否 | 子流程实例名称 |
| pk_subwfdef | string | query | 否 | 子流程主键 |
| userId | string | query | 否 | 用户Id |
| systemCode | string | query | 否 | 系统编码 |
| processParam | string | query | 否 | 客开参数 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| buttonType | string | 否 | 否 | 操作类型 |
| dimCode | object | 否 | 否 | 维度编码 |

## 3. 请求示例

Url: /yonbip/qyjx/bp/workflowdef/sendMsgAction?access_token=访问令牌&processId=&sheetIds=&receiveMail=&nodeId=&subInsName=&pk_subwfdef=&userId=&systemCode=&processParam=
Body: {
	"buttonType": "",
	"dimCode": {}
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

