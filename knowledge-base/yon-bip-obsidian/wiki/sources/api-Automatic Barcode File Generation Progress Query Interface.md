---
title: "自动生成条码档案进度查询接口"
apiId: "2287102855810121729"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Barcode Generation"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Barcode Generation]
platform_version: "BIP"
source_type: community-api-docs
---

# 自动生成条码档案进度查询接口

> `ContentType	application/json` 请求方式	GET | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/yonbip-scm-stock/api/barcode/generate/process

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| asyncKey | string | query | 是 | 异步生码键值 |

## 3. 请求示例

Url: /yonbip/scm/barcode/yonbip-scm-stock/api/barcode/generate/process?access_token=访问令牌&asyncKey=

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
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| percentage | number |
| 小数位数:0,最大长度:10 | 否 | 进度的值，0到100的整数，进度值为100代表生码任务执行完成 示例：100 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 本次应该生成的条码个数 示例：1000 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 已经执行生码操作的条码个数 示例：1000 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功生成的条码个数 示例：1000 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 没有生成的条码个数 示例：0 |
| message | string | 是 | 生码错误信息 |

## 5. 正确返回示例

{
	"code": 200,
	"percentage": 100,
	"totalCount": 1000,
	"count": 1000,
	"successCount": 1000,
	"failCount": 0,
	"message": [
		""
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	生码异常


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

