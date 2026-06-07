---
title: "固定资产新增弃审"
apiId: "2019967400592539648"
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

# 固定资产新增弃审

> `ContentType	application/json` 请求方式	POST | 分类: New FA (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/AdditionBill/unaudit

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 固定资产新增id 示例：1483387421116596230 |

## 3. 请求示例

Url: /yonbip/EFI/AdditionBill/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

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
| accentity | string | 否 | 会计主体id 示例：1722376503994351622 |
| name | object | 否 | 固定资产名称 |
| blnTaxAcceleratedDepr | boolean | 否 | 税收加速折旧 示例：false |
| tagno | string | 否 | 标签号 示例：123 |
| specification | object | 否 | 固定资产规格 |
| assetModel | object | 否 | 固定资产型号 |
| beginTime | string | 否 | 开始使用日期 示例：2022-09-01 |
| quantity | BigDecimal | 否 | 数量 示例：2 |
| fcOriValue | BigDecimal | 否 | 原币原值 示例：1000 |
| oriCurrtypeId | string | 否 | 原币币种id 示例：1550289628449210394 |
| addWayId | string | 否 | 增加方式id 示例：1550289989236424710 |
| location | object | 否 | 存放地点 |
| billTradeTypeId | string | 否 | 单据交易类型 示例：1625145041486348446 |
| blnLease | boolean | 否 | 使用权资产, 枚举，true：是，false: 否 示例：false |
| usageStateId | string | 否 | 使用状态id 示例：1550289997826359315 |
| bodies | object | 是 | 新增单核算信息 |
| assignments | object | 是 | 新增单分配信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "0000230410003151",
		"id": "1699951268584226817",
		"accentity": "1722376503994351622",
		"name": {
			"zh_CN": "多账簿23"
		},
		"blnTaxAcceleratedDepr": false,
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
		"location": {
			"zh_CN": "12楼"
		},
		"billTradeTypeId": "1625145041486348446",
		"blnLease": false,
		"usageStateId": "1550289997826359315",
		"bodies": [
			{
				"accbookStartDate": "2022-09-01",
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
				"grpUnitDeprAmount": 0,
				"initOrgAccumDeprAmount": "0",
				"grpAccumDeprAmount": "0",
				"accentity": "1722376503994351622",
				"grpPeriodDeprRate": "0",
				"id": "1996182327001612295",
				"orgYearDeprAmount": "0",
				"period": "2022-08",
				"residualWorkload": 0,
				"accbook": "1722872667231485967",
				"booktype": "2",
				"createAssetDate": "2022-08-01",
				"orgRateTypeId": "1625145024310673448",
				"isDepr": true,
				"grpNetValue": 0,
				"monthWorkload": 0,
				"grpYearDeprAmount": "0",
				"monthDeprRate": 0,
				"orgPeriodDeprRate": 0,
				"accbookCurrtypeId": "1722379476143702022",
				"gblNetAmount": 0,
				"orgAddedTaxAmount": 0,
				"orgScrapValueAmount": 300,
				"orgAccumDeprAmount": 6000,
				"orgNetAmount": 0,
				"accConvertParam": "2",
				"pubts": "2024-06-07 10:37:54",
				"periodId": "1625145591262609454",
				"creator": "d71edef3-6f11-4a84-af5d-e3f14ff03bb5",
				"recoverableCostAmount": 9500.002,
				"grpNetAmount": 0,
				"grpCurYearImpAmount": 0,
				"totalWorkload": 0,
				"orgNetValue": 6000,
				"additionBillId": "1699951268584226817",
				"addedTaxAmount": 0,
				"isMonthdepr": false,
				"createTime": "2024-05-13 15:43:28",
				"modifier": "048b6001-2719-45dc-a8ce-7ed7cc3bd1e4",
				"orgOriValueAmount": 6000,
				"dr": "0",
				"orgCurYearImpAmount": 0,
				"gblPeriodDeprAmount": 0,
				"modifyTime": "2024-06-07 10:37:54",
				"gblPeriodDeprRate": 0,
				"orgCurrtypeId": "1625145024310673435",
				"initGblAccumDeprAmount": 0,
				"grpPeriodDeprAmount": "0",
				"orgRecoverableCostAmount": 5700
			}
		],
		"assignments": [
			{
				"deptCode": "cg",
				"proportion": "1",
				"accentity": "1722376503994351622",
				"id": "1996182327001612294",
				"pubts": "2024-05-13 15:43:28",
				"creator": "d71edef3-6f11-4a84-af5d-e3f14ff03bb5",
				"deptId": "1722378419549765641",
				"ytenant_id": "0000LCAALQGPE642KN0000",
				"additionBillId": "1699951268584226817",
				"createTime": "2024-05-13 15:43:28",
				"remarks": {
					"zh_CN": "备注信息"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	该单据为开立态，请先去提交！	输入有效且已审核的新增单id


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

