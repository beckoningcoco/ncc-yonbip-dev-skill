---
title: "渠道数据推送交易池"
apiId: "2252256128289210374"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Revenue Middle Platform"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Revenue Middle Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 渠道数据推送交易池

> `ContentType	application/json` 请求方式	POST | 分类: Revenue Middle Platform (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/platDataImport/pushData

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
| platType | string | 否 | 是 | 渠道类型 |
| platDataType | string | 否 | 是 | 渠道数据类型 |
| merchantCode | string | 否 | 是 | 商户号 |
| batchNo | string | 否 | 是 | 批次号 |
| dataComparisonNo | string | 否 | 是 | 对数码 |
| data | object | 是 | 是 | 数据 |
| source_unique | string | 否 | 否 | 唯一Key |

## 3. 请求示例

Url: /yonbip/EFI/revenue/platDataImport/pushData?access_token=访问令牌
Body: {
	"platType": "",
	"platDataType": "",
	"merchantCode": "",
	"batchNo": "",
	"dataComparisonNo": "",
	"data": [
		{
			"source_unique": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功！ |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-21

新增

请求参数 dataComparisonNo


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

