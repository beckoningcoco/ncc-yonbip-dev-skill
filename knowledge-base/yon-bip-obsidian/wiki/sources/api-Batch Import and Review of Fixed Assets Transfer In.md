---
title: "固定资产调入批量调入并审核"
apiId: "1964998424860819457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-In"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-In]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调入批量调入并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer-In (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateIn/batchconfirmandaudit

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
| sourceId | string | 否 | 是 | 来源单据唯一id 示例：1234567809 |
| id | string | 否 | 是 | 调入id 示例：1676456946972491779 |
| auditor | string | 否 | 否 | 审核人ID 示例：363477434 |
| auditTime | string | 否 | 否 | 审核时间, 格式:yyyy-MM-dd HH:mm:ss 示例：2024-03-10 12:00:00 |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateIn/batchconfirmandaudit?access_token=访问令牌
Body: [{
	"sourceId": "1234567809",
	"id": "1676456946972491779",
	"auditor": "363477434",
	"auditTime": "2024-03-10 12:00:00"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回生成固定资产调入信息 |
| success | object | 是 | 生成成功的数据 |
| failed | object | 是 | 生成失败的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1956863017997565954",
				"code": "ZCDR000088",
				"sourceId": "1234567809"
			}
		],
		"failed": [
			{
				"sourceId": "1234567808",
				"message": "调入编码ZCDR000088已确认调入，请勿重复确认调入"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	处理过程中遇到未知错误	参数为空时会报错，请填写相关参数


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

