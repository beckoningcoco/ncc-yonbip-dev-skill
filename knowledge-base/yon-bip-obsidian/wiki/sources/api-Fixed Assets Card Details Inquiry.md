---
title: "固定资产卡片详情查询"
apiId: "1699893492666859521"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Card"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产卡片详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Card (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/famain/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 单据id    示例: 1699886715214233607 |

## 3. 请求示例

Url: /yonbip/EFI/famain/detail?access_token=访问令牌&id=1699886715214233607

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产卡片查询详情信息 |
| code | string | 否 | 固定资产编码 示例：0000230410003151 |
| id | string | 否 | 单据id 示例：1699951268584226817 |
| accentity | string | 否 | 会计主体id 示例：1570033155012821001 |
| name | object | 否 | 固定资产名称 |
| tagno | string | 否 | 标签号 示例：123 |
| specification | object | 否 | 固定资产规格 |
| assetModel | object | 否 | 固定资产型号 |
| beginTime | string | 否 | 开始使用日期 示例：2022-09-01 |
| quantity | BigDecimal | 否 | 数量 示例：2 |
| fcOriValue | BigDecimal | 否 | 原币原值 示例：1000 |
| oriCurrtypeId | string | 否 | 原币币种id 示例：1550289628449210394 |
| addWayId | string | 否 | 增加方式id 示例：1550289989236424710 |
| custodian_name | string | 否 | 保管人 示例：二号宇昂 |
| unitId_name | string | 否 | 单位名称 示例：个 |
| location | object | 否 | 存放地点 |
| usageStateId | string | 否 | 使用状态id 示例：1550289997826359315 |
| bodies | object | 是 | 子表信息 |
| assignments | object | 是 | 分配信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "0000230410003151",
		"id": "1699951268584226817",
		"accentity": "1570033155012821001",
		"name": {
			"zh_CN": "多账簿23"
		},
		"tagno": "123",
		"specification": {
			"zh_CN": "规格1"
		},
		"assetModel": {
			"zh_CN": "型号1"
		},
		"beginTime": "2022-09-01",
		"quantity": 2,
		"fcOriValue": 1000,
		"oriCurrtypeId": "1550289628449210394",
		"addWayId": "1550289989236424710",
		"custodian_name": "二号宇昂",
		"unitId_name": "个",
		"location": {
			"zh_CN": "12楼"
		},
		"usageStateId": "1550289997826359315",
		"bodies": [
			{
				"oriCurrtypeId_name": "印尼盾",
				"accbookStartDate": "2022-09-01",
				"accbook_name": "主1",
				"oriCurrtypeId": "123213212",
				"exchangeRateType": "0000L8A6ELW126E96Q0000",
				"yearDeprAmount": 12,
				"deprAmount": 60,
				"accumImpAmount": 80,
				"curYearImpAmount": 11,
				"netValue": 100,
				"netAmount": 200,
				"oricostAmount": 100,
				"oriValue": 9,
				"lifeMonth": 12,
				"lifeYear": 1,
				"scrapValueType": "1",
				"scrapValue": 5,
				"extractedPeriod": 0,
				"deprMethodId": "1550290015006228493",
				"assetBookCategoryId": "1594672600730042376",
				"reduceWayId": "1848769256678752295",
				"reduceWayId_code": "02",
				"reduceWayId_name": "盘亏",
				"disposalDate": "2022-08-12",
				"deprStatus": "0"
			}
		],
		"assignments": [
			{
				"deptCode": "cg",
				"proportion": "1",
				"productCode": "00001",
				"userId": "2070255145449947139",
				"userId_name": "壹壹",
				"custodian": "2070255145449947139",
				"custodian_name": "壹壹",
				"mgmtDeptId": "2053201531117240325",
				"mgmtDeptId_name": "资产部"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

请求说明

更新

返回参数 (11)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

