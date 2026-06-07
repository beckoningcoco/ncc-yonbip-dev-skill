---
title: "固定资产新增列表查询"
apiId: "2060617402047004678"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "New FA"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, New FA]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产新增列表查询

> `ContentType	application/json` 请求方式	POST | 分类: New FA (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/AdditionBill/list

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
| code | string | 否 | 否 | 新增单编码 示例：XZ231403 |
| assetCode | string | 否 | 否 | 固定资产编码 示例：1232131 |
| accentity | string | 否 | 否 | 会计主体id 示例：432423111111 |
| accentity_code | string | 否 | 否 | 会计主体code, 与id同时传入时以id为准 |
| bodies.accbook | string | 否 | 否 | 账簿id 示例：564645 |
| bodies.accbook_code | string | 否 | 否 | 账簿code, 账簿id与code同时传入以id为准 示例：W01 |
| bodies.period | string | 否 | 否 | 账簿会计期间 示例：2024-05 |
| name | string | 否 | 否 | 固定资产名称 示例：测试固定资产001 |
| bodies.assetCategoryId | string | 否 | 否 | 固定资产类别id 示例：394888820094 |
| bodies.assetCategoryId_code | string | 否 | 否 | 固定资产类别code, 与id同时传入以id为准, 只支持默认类别结构下的资产类别 示例：01 |
| tagno | string | 否 | 否 | 标签号 示例：T001 |
| usageStateId | string | 否 | 否 | 使用状态id 示例：34993877223 |
| usageStateCode | string | 否 | 否 | 使用状态code, 与id同时传入以id为准 示例：01 |
| addWayId | string | 否 | 否 | 增加方式id 示例：33998373411 |
| addWayCode | string | 否 | 否 | 增加方式code, 与id同时传入以id为准 示例：01 |
| creator | string | 否 | 否 | 创建人 示例：系统管理员 |
| auditor | string | 否 | 否 | 审核人 示例：系统管理员 |
| busiPostStatus | string | 否 | 否 | 过账状态 0未过账 1过账成功 2过账失败 3过帐中 示例：1 |
| simple | object | 否 | 否 | 查询条件 |
| open_auditTime_begin | string | 否 | 否 | 审核日期开始日期(大于等于), 格式为yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_beginTime_begin | string | 否 | 否 | 开始使用日期开始日期(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_beginTime_end | string | 否 | 否 | 开始使用日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于此时间), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| bodies.isInit | string | 否 | 否 | 是否期初单,0新增单,1期初单 示例：0 默认值：0 |

## 3. 请求示例

Url: /yonbip/EFI/AdditionBill/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"verifyState": "1",
	"code": "XZ231403",
	"assetCode": "1232131",
	"accentity": "432423111111",
	"accentity_code": "",
	"bodies.accbook": "564645",
	"bodies.accbook_code": "W01",
	"bodies.period": "2024-05",
	"name": "测试固定资产001",
	"bodies.assetCategoryId": "394888820094",
	"bodies.assetCategoryId_code": "01",
	"tagno": "T001",
	"usageStateId": "34993877223",
	"usageStateCode": "01",
	"addWayId": "33998373411",
	"addWayCode": "01",
	"creator": "系统管理员",
	"auditor": "系统管理员",
	"busiPostStatus": "1",
	"simple": {
		"open_auditTime_begin": "2023-04-13 14:59:24",
		"open_auditTime_end": "2023-04-13 14:59:24",
		"open_beginTime_begin": "2023-04-13 14:59:24",
		"open_beginTime_end": "2023-04-13 14:59:24",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24",
		"bodies.isInit": "0"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产新增单信息 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| recordCount | string | 否 | 总记录数 示例：100 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页查询数据大小，限制500 示例：10 |
| recordList | object | 是 | 查询结果集 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordCount": "100",
		"pageSize": 10,
		"recordList": [
			{
				"accumImpAmount": 0,
				"bodies_createAssetDate": "2024-05-01",
				"method_isDepreciation": true,
				"accbookStartDate": "2024-05-01",
				"accentity": "2002113908648706053",
				"blnTaxAcceleratedDepr": false,
				"oriValue": 1000,
				"accbook_name": "罗德岛主账簿",
				"bodies_exchangeRateType_name": "基准利率-ding",
				"bodies_orgAddedTaxAmount": 0,
				"beginTime": "2024-05-01",
				"id": "2058449079117021195",
				"bodies_orgOriValueAmount": 1000,
				"bodies_assetBookCategoryId": "2010229816290181129",
				"period": "2024-05",
				"lifeMonth": 4,
				"accbook": "2002134756421533700",
				"booktype": "1",
				"bodies_orgCurrtypeId_name": "人民币",
				"bodies_orgAccumDeprAmount": 0,
				"auditTime": "2024-08-05 13:17:02",
				"monthWorkload": 0,
				"bodies_isMonthdepr": false,
				"bodies_orgRate": 1,
				"accbookCurrtypeId": "1623643074168094746",
				"accbookCurrtypeId_name": "人民币",
				"usageStateId_name": "在用",
				"auditor_name": "u8c_vip管理员",
				"bodies_addedTaxAmount": 0,
				"deprConvention": "1535553672786739205",
				"bodies_orgRateOps": 1,
				"disposalConvention_name": "次月计提",
				"pubts": "2024-08-05 13:17:23",
				"disposalConvention": "1535553672786739206",
				"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"totalWorkload": 0,
				"bodies_exchangeRateType": "1679114604013158401",
				"lifeYear": 4,
				"accentity_code": "ArKnights",
				"bodies_orgCurYearImpAmount": 0,
				"deprMethodId_name": "直线法（一）",
				"depr_rate_precision": 8,
				"createTime": "2024-08-05 13:16:52",
				"bodies_orgAccumImpAmount": 0,
				"accentity_name": "罗德岛",
				"oriCurrtypeId_name": "人民币",
				"deprConvention_name": "当月计提",
				"addWayId": "1689815892968865977",
				"exchangeRate": 1,
				"deprMethodId": "1525698311065253436",
				"curYearImpAmount": 0,
				"bodies_orgCurrtypeId": "1623643074168094746",
				"deprAmount": 0,
				"assetCode": "ArKnight0000240805000002",
				"netValue": 1000,
				"exchangeRateOps": 1,
				"addWayId_name": "直接购入",
				"deprStartDate": "2024-05-01",
				"bodies_orgNetValue": 1000,
				"verifyState": 2,
				"existingWorkload": 0,
				"name": "lx-tt-0805",
				"bodies_orgRateTypeId_name": "基准利率-ding",
				"yearDeprAmount": 0,
				"bodies_orgYearDeprAmount": 0,
				"code": "XZ135872",
				"calid": "2058449079117021197",
				"bodies_scrapValueType": "0",
				"busiPostStatus": "1",
				"assetId": "2058449079117021192",
				"fcOriValue": 1000,
				"scrapValueRate": 4,
				"scrapValue": 40,
				"quantity": 1,
				"bodies_orgScrapValueAmount": 40,
				"netAmount": 1000,
				"assetModel": "",
				"specification": "",
				"usageStateId": "1741444973293731819",
				"accbook_code": "ArKnights",
				"bodies_orgNetAmount": 1000,
				"oriCurrtypeId": "1623643074168094746",
				"location": "",
				"creator_name": "u8c_vip管理员",
				"bodies_assetBookCategoryId_name": "TEST",
				"isInit": false
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-18

新增

返回参数 bodies_orgRateOps

新增

返回参数 exchangeRateOps


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

