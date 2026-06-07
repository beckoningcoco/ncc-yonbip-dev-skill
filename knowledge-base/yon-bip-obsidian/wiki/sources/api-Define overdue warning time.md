---
title: "定义超期预警时间"
apiId: "2534260923552497664"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SSC Task"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SSC Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 定义超期预警时间

> `ContentType	application/json` 请求方式	POST | 分类: SSC Task (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/task/updateExpireTime

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| taskPoolId | string | 否 | 是 | 作业id 示例：123219832109321 |
| timeoutTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 超期时间 示例：统一时区【UTC+08:00】 |
| warningTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 预警时间 示例：统一时区【UTC+08:00】 |

## 3. 请求示例

Url: /yonbip/FCC/task/updateExpireTime?access_token=访问令牌
Body: {
	"taskPoolId": "123219832109321",
	"timeoutTime": "统一时区【UTC+08:00】",
	"warningTime": "统一时区【UTC+08:00】"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 成功为200，错误提示为其他值 示例：200 |
| message | string | 否 | 成功提示或错误提示 示例：操作成功 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023020400002	客户端参数不能为空:	必传参数校验，根据提示补充缺失参数


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

