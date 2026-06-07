---
title: "支付指令批量状态变更保存接口"
apiId: "2350902086728155137"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Instruction"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Instruction]
platform_version: "BIP"
source_type: community-api-docs
---

# 支付指令批量状态变更保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Payment Instruction (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/instruct/batchSaveStateChange

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
| errorHandType | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 异常处理类型：1 状态变更 2指令止付 默认值：1 |
| singleOrBatch | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 0单笔/1批量（ 默认单笔） 默认值：0 |
| instructId | string | 否 | 是 | 指令ID |
| instructDetailId | string | 否 | 否 | 指令明细ID(支付指令为批量时，指令明细ID必输) |
| targetPayStatus | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 处理后指令状态 4：成功 5失败 6止付 |
| processDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 处理日期 |
| processReason | string | 否 | 否 | 处理原因 |

## 3. 请求示例

Url: /yonbip/ctm/api/instruct/batchSaveStateChange?access_token=访问令牌
Body: [{
	"errorHandType": 0,
	"singleOrBatch": 0,
	"instructId": "",
	"instructDetailId": "",
	"targetPayStatus": 0,
	"processDate": "2026-06-07",
	"processReason": ""
}]

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
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：success |

## 5. 正确返回示例

{
	"code": 200,
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	操作失败	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-18

更新

请求参数 instructDetailId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

