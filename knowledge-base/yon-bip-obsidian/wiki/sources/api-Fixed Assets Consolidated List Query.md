---
title: "固定资产合并列表查询"
apiId: "1899808294583140354"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Consolidation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产合并列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Consolidation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FixedAssetMerge/list

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 当前页码 示例：1 默认值：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| accentity | string | 否 | 否 | 会计主体id 示例：1550299274967253000 |
| code | string | 否 | 否 | 合并单编码 示例：HB001 |
| mergeAssetCode | string | 否 | 否 | 合并后固定资产编码 示例：0025149309 |
| open_vouchdate_begin | string | 否 | 否 | 合并日期开始(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 |
| open_vouchdate_end | string | 否 | 否 | 合并日期结束(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 |
| verifyState | string | 否 | 否 | 单据状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| simple | object | 否 | 否 | simple |
| open_pubts_begin | string | 否 | 否 | pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |
| open_pubts_end | string | 否 | 否 | pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetMerge/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"accentity": "1550299274967253000",
	"code": "HB001",
	"mergeAssetCode": "0025149309",
	"open_vouchdate_begin": "2024-01-01",
	"open_vouchdate_end": "2024-01-01",
	"verifyState": "0",
	"simple": {
		"open_pubts_begin": "2020-09-09 12:00:00",
		"open_pubts_end": "2020-09-09 12:00:00"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产合并单信息 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页查询数据大小,限制500 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"vouchdate": "2023-01-25",
				"code": "HB002507",
				"id": "1888556820287979531",
				"accentity": "1852258943573164042",
				"verifyState": 0,
				"remarks": {
					"zh_CN": ""
				}
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

