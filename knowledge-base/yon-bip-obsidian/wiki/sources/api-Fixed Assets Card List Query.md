---
title: "固定资产卡片列表查询"
apiId: "1699884851192659977"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Card"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产卡片列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Card (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/famain/list

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
| pageIndex | string | 否 | 是 | 当前页码 示例：1 默认值：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| accentity | string | 否 | 否 | 会计主体id 示例：1550299274967253000 |
| name | string | 否 | 否 | 固定资产名称 示例：停用资产 |
| bodies.accbook | string | 否 | 否 | 账簿 示例：123a |
| bodies.assetCategoryId | string | 否 | 否 | 固定资产类别 示例：1 |
| code | string | 否 | 否 | 固定资产编码 示例：0000230408003099 |
| tagno | string | 否 | 否 | 标签号 示例：1468336086076358677 |
| bodies.isInit | string | 否 | 否 | 是否期初 true是 false否 示例：true |
| creator | string | 否 | 否 | 创建人名称 示例：张三 |
| impairmentunitId | string | 否 | 否 | 减值单元id 示例：1 |
| usageStateId | string | 否 | 否 | 使用状态 示例：1 |
| addWayId | string | 否 | 否 | 增加方式id 示例：1471403105020018693 |
| simple | object | 否 | 否 | 查询方式 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:29 |

## 3. 请求示例

Url: /yonbip/EFI/famain/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"accentity": "1550299274967253000",
	"name": "停用资产",
	"bodies.accbook": "123a",
	"bodies.assetCategoryId": "1",
	"code": "0000230408003099",
	"tagno": "1468336086076358677",
	"bodies.isInit": "true",
	"creator": "张三",
	"impairmentunitId": "1",
	"usageStateId": "1",
	"addWayId": "1471403105020018693",
	"simple": {
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:29"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产卡片查询信息 |
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
				"accentity": "1570033155012821001",
				"pubts": "2022-10-24 17:59:46",
				"accbook": "1570037501541220371",
				"code": "0000230410003121",
				"name": {
					"zh_CN": "批增5张"
				},
				"bodies_assetBookCategoryId": "1594672600730042376",
				"assetSubcategoryId": "2222",
				"addWayId": "1550289989236424710",
				"usageStateId": "1550289997826359315",
				"location": {
					"zh_CN": "3楼"
				},
				"quantity": 1,
				"unitId": "234324",
				"tagno": "22",
				"impairmentunitId": "5654543",
				"impairmentunitId_code": "221",
				"periodId": "1550289645640613906",
				"period": "2022-09",
				"bodies_createAssetDate": "2022-09-01",
				"oriValue": 100.37,
				"oricostAmount": 100.37,
				"scrapValue": 5.02,
				"netAmount": 29.58,
				"netValue": 59.9,
				"deprMethodId": "1550290015006228494",
				"lifeYear": 0,
				"lifeMonth": 10,
				"extractedPeriod": 3,
				"deprAmount": 40.47,
				"accumImpAmount": 30.32,
				"accbookStartDate": "2021-04-02",
				"deprConvention": "1232211111",
				"disposalConvention": "112123231",
				"deprStartDate": "2023-04-10",
				"bodies_fixedStatus": "1",
				"accbookCurrtypeId": "1550289628449210394",
				"deprStatus": "0",
				"id": "1699886715214233607",
				"oriCurrtypeId": "1550289628449210394",
				"isInit": false,
				"creator": "15fa85d8-13af-4fc6-9f9d-8f73f03f497f",
				"createTime": "2023-04-10 10:14:20",
				"bodies_reduceWayId": "1848769256678752295",
				"bodies_reduceWayId_name": "盘亏",
				"bodies_disposalDate": "2022-08-12",
				"userId": "2070255145449947139",
				"userId_name": "壹壹",
				"custodian": "2070255145449947139",
				"custodian_name": "壹壹",
				"mgmtDeptId": "2053201531117240325",
				"mgmtDeptId_name": "资产部",
				"vendorId": "1959783389679058944",
				"vendorId_code": "01",
				"vendorId_name": "内-1"
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

新增

请求参数 freeChId

删除

返回参数 blnSuperDepr


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

