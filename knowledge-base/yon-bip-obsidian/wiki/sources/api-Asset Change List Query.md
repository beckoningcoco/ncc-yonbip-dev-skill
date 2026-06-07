---
title: "资产变动列表查询"
apiId: "0d77b1c1ad814c3a97786bb014a2657c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/changebill/list

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| code | string | 否 | 否 | 变动单编码 |
| accentity | string | 否 | 否 | 会计主体 |
| period | string | 否 | 否 | 会计期间 |
| changetypeid | string | 否 | 否 | 变动类型 |
| open_businessdate_begin | string | 否 | 否 | 单据日期开始时间 示例：2020-09-01 00:00:00 |
| open_businessdate_end | string | 否 | 否 | 单据日期结束时间 示例：2020-09-30 23:59:59 |
| open_auditDate_begin | string | 否 | 否 | 审核日期开始时间 示例：2020-10-30 23:00:59 |
| open_auditDate_end | string | 否 | 否 | 审核日期结束时间 示例：2020-10-31 12:59:21 |

## 3. 请求示例

Url: /yonbip/fi/changebill/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"code": "",
	"accentity": "",
	"period": "",
	"changetypeid": "",
	"open_businessdate_begin": "2020-09-01 00:00:00",
	"open_businessdate_end": "2020-09-30 23:59:59",
	"open_auditDate_begin": "2020-10-30 23:00:59",
	"open_auditDate_end": "2020-10-31 12:59:21"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 记录列表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"accpurpose": "",
				"accpurpose_name": "",
				"accentity": "",
				"accentity_name": "",
				"busiaccbook": "",
				"busiaccbook_name": "",
				"auditstatus": "",
				"isnoweffect": "",
				"code": "",
				"description": "",
				"tradetype": "",
				"tradetype_name": "",
				"billtype": "",
				"billtype_name": "",
				"status": "",
				"voucherstatus": "",
				"isWfControlled": "",
				"verifystate": "",
				"returncount": "",
				"period": "",
				"periodcode": "",
				"changetypeid": "",
				"changetype": "",
				"changetype_optionname": "",
				"changetype_name": "",
				"businessdate": "2020-09-03 00:00:00",
				"auditDate": "2020-09-03 00:00:00",
				"changedate": "2020-09-04 13:00:00",
				"createTime": "2020-09-05 03:20:00",
				"modifyTime": "2020-09-07 03:20:00",
				"creator": "",
				"pubts": "",
				"modifier": "",
				"id": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	资产变动列表查询无错误码，只会出现查询时data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 (6)

更新

返回参数 (45)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

