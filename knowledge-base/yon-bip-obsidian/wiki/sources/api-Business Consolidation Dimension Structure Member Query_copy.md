---
title: "合并报表-多维批量取数"
apiId: "2460633037950418952"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-多维批量取数

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/tbb/form/batchFetchData

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
| pk_cube | string | 否 | 是 | 模型主键 示例：2442029636209082373 |
| scenario | string | 否 | 是 | 业务方案成员编码 示例：Actual |
| year | string | 否 | 是 | 年 示例：2024 |
| period | string | 否 | 是 | 期间 示例：3 |
| version | string | 否 | 是 | 版本 示例：v0 |
| entityList | string | 是 | 是 | 组织编码列表 最大请求量：10000 |
| fetchRule | boolean | 否 | 否 | 企业报表取数 示例：true |
| fetchPipeline | boolean | 否 | 否 | 归集取数 示例：true |
| calc | boolean | 否 | 否 | 取数后计算 示例：true |

## 3. 请求示例

Url: /yonbip/FCC/tbb/form/batchFetchData?access_token=访问令牌
Body: {
	"pk_cube": "2442029636209082373",
	"scenario": "Actual",
	"year": "2024",
	"period": "3",
	"version": "v0",
	"entityList": [
		""
	],
	"fetchRule": true,
	"fetchPipeline": true,
	"calc": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 请求状态码 示例：200 |
| data | string | 否 | 长任务id 示例：2520737720814010369 |
| success | boolean | 否 | 接口请求成功标识 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"data": "2520737720814010369",
	"success": true
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

