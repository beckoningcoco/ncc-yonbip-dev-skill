---
title: "固定资产调整列表查询"
apiId: "1701547862549594112"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Information Adjustment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Information Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调整列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Information Adjustment (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetAdjustment/list

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
| pageSize | int | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| pageIndex | int | 否 | 是 | 当前页码 示例：1 默认值：1 |
| verifyState | string | 否 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：1 |
| code | string | 否 | 否 | 调整编码 示例：TZ231403 |
| assetCode | string | 否 | 否 | 固定资产编码 示例：1232131 |
| accentity | string | 否 | 否 | 会计主体id 示例：432423111111 |
| creator | string | 否 | 否 | 创建人名称 示例：张三 |
| auditor | string | 否 | 否 | 审核人名称 示例：张三 |
| busiPostStatus | string | 否 | 否 | 过账状态 0未过账 1过账成功 2过账失败 3过帐中 示例：1 |
| simple | object | 否 | 否 | 查询条件 |
| open_auditTime_begin | string | 否 | 否 | 审核日期开始日期(大于等于), 格式为yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_vouchdate_begin | string | 否 | 否 | 调整日期开始日期(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_vouchdate_end | string | 否 | 否 | 调整日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetAdjustment/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"verifyState": "1",
	"code": "TZ231403",
	"assetCode": "1232131",
	"accentity": "432423111111",
	"creator": "张三",
	"auditor": "张三",
	"busiPostStatus": "1",
	"simple": {
		"open_auditTime_begin": "2023-04-13 14:59:24",
		"open_auditTime_end": "2023-04-13 14:59:24",
		"open_vouchdate_begin": "2023-04-13 14:59:24",
		"open_vouchdate_end": "2023-04-13 14:59:24",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产使用状态信息 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| recordCount | int | 否 | 总记录数 示例：100 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordCount": 100,
		"pageSize": 1,
		"recordList": [
			{
				"id": "1629396775637352454",
				"code": "TZ000519",
				"accentity": "1572524545313079302",
				"remarks": {
					"zh_CN": "我要调整"
				},
				"vouchdate": "2022-09-30",
				"creator_name": "昵称-梦梦",
				"createTime": "2023-01-05 10:44:20",
				"auditor_name": "昵称-梦梦",
				"auditTime": "2023-01-05 12:41:15",
				"busiPostStatus": "1",
				"pubts": "2022-10-24 17:59:46",
				"verifyState": 2
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

请求参数 creator

更新

请求参数 auditor

更新

返回参数 (20)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

