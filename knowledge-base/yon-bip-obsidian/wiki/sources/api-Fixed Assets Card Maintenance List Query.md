---
title: "固定资产卡片维护列表查询"
apiId: "033a2792eced477b83cb14a7e5ca9f7c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Assets"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产卡片维护列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Assets (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fixedassetsinfo/list

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
| code | string | 否 | 否 | 固定资产编码 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| name | string | 否 | 否 | 固定资产名称 |
| accentity | string | 否 | 否 | 会计主体 |
| category | long | 否 | 否 | 固定资产类别 |
| bodies.auditstatus | string | 否 | 否 | 审批状态, 0:未审核、1:已审核、 |
| usagestate | long | 否 | 否 | 资产状态 |
| usedepredept.name | string | 否 | 否 | 使用部门ID |
| bodies.depreciationmethod | long | 否 | 否 | 折旧方法 |
| fixedstatus | string | 否 | 否 | 卡片状态, 1:正常、2:处置、3:折旧完成、 |
| bodies.initflag | string | 否 | 否 | 期初标志, true:是、false:否、 |
| moredepartment | string | 否 | 否 | 是否多部门使用 |
| amount | long | 否 | 否 | 数量 |
| open_createassetdate_begin | string | 否 | 否 | 建卡日期开始日期 |
| open_createassetdate_end | string | 否 | 否 | 建卡日期结束日期 |
| open_begintime_begin | string | 否 | 否 | 开始使用时间起始时间 |
| open_begintime_end | string | 否 | 否 | 开始使用时间终止时间 |
| open_bodies.totalworkload_begin | int | 否 | 否 | 工作总量起始范围 |
| open_bodies.totalworkload_end | int | 否 | 否 | 工作总量终止范围 |
| open_bodies.existingworkload_begin | int | 否 | 否 | 累计工作量起始范围 |
| open_bodies.existingworkload_end | int | 否 | 否 | 累计工作量终止范围 |
| open_bodies.auditDate_begin | string | 否 | 否 | 审核日期起始时间 |
| open_bodies.auditDate_end | string | 否 | 否 | 审核日期终止时间 |
| bodies.period | string | 否 | 否 | 会计期间 |

## 3. 请求示例

Url: /yonbip/fi/fixedassetsinfo/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"code": "",
	"pageSize": 0,
	"name": "",
	"accentity": "",
	"category": 0,
	"bodies.auditstatus": "",
	"usagestate": 0,
	"usedepredept.name": "",
	"bodies.depreciationmethod": 0,
	"fixedstatus": "",
	"bodies.initflag": "",
	"moredepartment": "",
	"amount": 0,
	"open_createassetdate_begin": "",
	"open_createassetdate_end": "",
	"open_begintime_begin": "",
	"open_begintime_end": "",
	"open_bodies.totalworkload_begin": 0,
	"open_bodies.totalworkload_end": 0,
	"open_bodies.existingworkload_begin": 0,
	"open_bodies.existingworkload_end": 0,
	"open_bodies.auditDate_begin": "",
	"open_bodies.auditDate_end": "",
	"bodies.period": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| creator | string | 否 | 创建人 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 固定资产列表数据 |

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
				"accentity_code": "",
				"accentity_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"isWfControlled": "",
				"natCurrency_priceDigit": "",
				"verifystate": "",
				"natCurrency_moneyDigit": "",
				"returncount": 0,
				"code": "",
				"name": "",
				"status": "",
				"auditstatus": "",
				"voucherstatus": "",
				"fixedstatus": "",
				"depreciationstatus": "",
				"specification": "",
				"category": "",
				"category_name": "",
				"addway": "",
				"addway_name": "",
				"accruedoriginalvalue": 0,
				"netamount": 0,
				"unitdepreciation": 0,
				"netvalue": 0,
				"scrapvalue": 0,
				"busiaccbook": "",
				"busiaccbook_code": "",
				"busiaccbook_name": "",
				"scrapvaluerate": 0,
				"depreciationmethod": "",
				"depreciationmethod_name": "",
				"method_isDepreciation": "",
				"lifemonth": 0,
				"totalworkload": 0,
				"existingworkload": 0,
				"monthworkload": 0,
				"workloadunit": "",
				"calid": "",
				"id": "",
				"pubts": "",
				"usagestate": "",
				"usagestate_name": "",
				"usagestate_stateDepre": "",
				"usedepredeptandmore": "",
				"usedepredept": "",
				"usedepredept_name": "",
				"managedepredept": "",
				"managedepredept_name": "",
				"project": "",
				"project_name": "",
				"location": "",
				"period": "",
				"begintime": "",
				"custodian": "",
				"custodian_name": "",
				"user": "",
				"user_name": "",
				"createDate": "",
				"createassetdate": "",
				"extractedperiod": 0,
				"currency": "",
				"currency_name": "",
				"exchangerate": 0,
				"fcoriginalvalue": 0,
				"depreciation": 0,
				"monthdepreciationrate": 0,
				"monthdepreciationvalue": 0,
				"impairment": 0,
				"usedepredeptname": "",
				"addedtax": 0,
				"taxrate": 0,
				"currency_moneyDigit": 0,
				"initflag": "",
				"moredepartment": "",
				"auditDate": "",
				"amount": "",
				"createTime": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	固定资产卡片维护列表查询无错误码，只会出现查询时data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 (12)

更新

返回参数 (92)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

