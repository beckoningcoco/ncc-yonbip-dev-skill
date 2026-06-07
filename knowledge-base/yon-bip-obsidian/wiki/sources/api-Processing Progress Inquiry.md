---
title: "处理进度查询"
apiId: "2082219867785658376"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Application Settings"
domain: "FADMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Application Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 处理进度查询

> `ContentType	application/json` 请求方式	POST | 分类: Application Settings (FADMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fadmp/api/progress/progress

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| tag | string | query | 是 | 进度组 |
| uuid | string | query | 是 | 进度id |

## 3. 请求示例

Url: /yonbip/fadmp/api/progress/progress?access_token=访问令牌&tag=&uuid=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| msg | string | 否 | 当前进度 示例：【初始化】5、所有任务处理完成！ |
| startTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 进度启动时间 示例：2024-09-19 11:43:44 |
| endTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 进度结束时间 示例：2024-09-19 11:51:37 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"msg": "【初始化】5、所有任务处理完成！",
		"startTime": "2024-09-19 11:43:44",
		"endTime": "2024-09-19 11:51:37"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

