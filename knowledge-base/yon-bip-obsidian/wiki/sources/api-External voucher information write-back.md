---
title: "外部凭证信息回写"
apiId: "2023606217154232329"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 外部凭证信息回写

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/integration/voucher/batchRewriteExternalMarking

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 入参 |
| ysVoucherId | string | 否 | 否 | YS的凭证ID 示例：2011935682821357576 |
| externalMainMarking | string | 否 | 否 | 三方系统存储主键（逆向需要使用） 示例：记-1-u9-001 |
| externalSecondaryMarking | string | 否 | 否 | 三方系统存储编号（一般就是凭证号） 示例：记-1-u9-辅助 |
| externalSystemType | string | 否 | 否 | 来源（U8、U9、SAP、ORACLE、OTHER） 示例：U9 |
| externalIntegrationStatus | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 传送状态（20:传成功 -20:传失败 30:无需传） 示例：20 |
| externalIntegrationMsg | string | 否 | 否 | 三方同步信息 示例：传送成功 |

## 3. 请求示例

Url: /yonbip/EFI/integration/voucher/batchRewriteExternalMarking?access_token=访问令牌
Body: {
	"data": [
		{
			"ysVoucherId": "2011935682821357576",
			"externalMainMarking": "记-1-u9-001",
			"externalSecondaryMarking": "记-1-u9-辅助",
			"externalSystemType": "U9",
			"externalIntegrationStatus": 20,
			"externalIntegrationMsg": "传送成功"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 业务处理状态码 200-成功 404-失败 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功！ |
| data | object | 是 | 详细数据处理结果 |
| code | string | 否 | 单条数据处理状态码 200-成功 404-失败 示例：200 |
| message | string | 否 | 单条数据处理提示信息 示例：操作成功！ |
| ysVoucherId | string | 否 | ys凭证ID 示例：2011935682821357576 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": [
		{
			"code": "200",
			"message": "操作成功！",
			"ysVoucherId": "2011935682821357576"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

新增

请求参数 externalIntegrationStatus

新增

请求参数 externalIntegrationMsg

更新

请求参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

