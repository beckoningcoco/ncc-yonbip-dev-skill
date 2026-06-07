---
title: "待确认质检任务自动确认"
apiId: "2449650205257629702"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quality Management"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quality Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 待确认质检任务自动确认

> `ContentType	application/json` 请求方式	POST | 分类: Quality Management (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/openApi/inspectionTask/rectify

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
| taskIds | string | 是 | 是 | 质检任务id 示例：[ "1957704908798951433" ,"1957704908798951435"] 最大请求量：300 |

## 3. 请求示例

Url: /yonbip/FCC/openApi/inspectionTask/rectify?access_token=访问令牌
Body: {
	"taskIds": [
		"1957704908798951433",
		"1957704908798951435"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | totalCount 示例：3 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：2 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：1 |
| failedTasks | object | 是 | failedTasks |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"totalCount": 3,
		"successCount": 2,
		"failCount": 1,
		"failedTasks": [
			{
				"taskId": "001",
				"reason": "质检任务不存在"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

102304050500	质检任务不存在	质检任务不存在

102304050501	质检任务状态不是待确认状态	质检任务状态不是待确认状态

102304050502	质检任务存在处理中的申诉单	质检任务存在处理中的申诉单


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

