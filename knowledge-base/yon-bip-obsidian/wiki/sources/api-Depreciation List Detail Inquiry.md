---
title: "折旧清单详情查询"
apiId: "1f7779ce39cd435e8125978f2a2b536f"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Depreciation List"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Depreciation List]
platform_version: "BIP"
source_type: community-api-docs
---

# 折旧清单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Depreciation List (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/depreciationlist/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据主表id    示例: 2148248202318336 |

## 3. 请求示例

Url: /yonbip/fi/depreciationlist/detail?access_token=访问令牌&id=2148248202318336

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回固定资产数据 |
| fixedstatus | string | 否 | 卡片状态, 1:正常、2:处置、 示例：1 |
| returncount | long | 否 | 退回次数 示例：0 |
| managedepredept_code | string | 否 | 管理部门编码 示例：01 |
| verifystate | long | 否 | 审批状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| code | string | 否 | 编码 示例：0001210126000002 |
| category_name | string | 否 | 资产类别名称 示例：土地 |
| moredepartment | boolean | 否 | 是否多部门使用 示例：false |
| createassetdate | string | 否 | 建卡日期 示例：2021-01-26 00:00:00 |
| masterOrgKeyField | string | 否 | 主组织键领域 示例：accentity |
| bodies | object | 是 | 折旧清单信息 |
| modifier | string | 否 | 修改人名称 示例：17835411342 |
| project | string | 否 | 项目 示例：2146982582637056 |
| calid | long | 否 | ID 示例：2148248202318337 |
| accentity_name | string | 否 | 会计主体名称 示例：固定资产 |
| project_name | string | 否 | 项目名称 示例：导入项目1 |
| accentity | string | 否 | 会计主体 示例：2148237326782720 |
| usedepredept_name | string | 否 | 使用部门名称 示例：采购 |
| categoryParentId | long | 否 | 资产类别一级节点id 示例：2142662516806416 |
| modifyTime | string | 否 | 修改时间 示例：2021-03-01 15:35:46 |
| usedepredept_code | string | 否 | 使用部门编码 示例：01 |
| addway | long | 否 | 增加方式id 示例：2112934640867002 |
| addway_name | string | 否 | 增加方式名称 示例：直接购入 |
| usedepredept | string | 否 | 使用部门id 示例：2148245505003776 |
| id | long | 否 | id 示例：2148248202318336 |
| pubts | string | 否 | 时间戳 示例：2021-03-01 15:35:50 |
| category_isEnd | boolean | 否 | 固定资产类别是否末级 示例：true |
| usagestate_stateDepre | boolean | 否 | 资产状态折旧状态 示例：true |
| managedepredept | string | 否 | 管理部门id 示例：2148245505003776 |
| creator | string | 否 | 创建人 示例：13521729025 |
| amount | long | 否 | 数量 示例：1 |
| category_code | string | 否 | 固定资产类别编码 示例：01 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| managedepredept_name | string | 否 | 管理部门名称 示例：采购 |
| specification | object | 否 | 规格型号,支持多语 |
| begintime | string | 否 | 开始使用时间 示例：2021-01-26 00:00:00 |
| project_code | string | 否 | 项目编码 示例：02 |
| accentity_code | string | 否 | 会计主体编码 示例：0226 |
| depreciationrecords | object | 是 | 折旧记录 |
| tradetype | string | 否 | 交易类型 示例：2145521022210305 |
| createTime | string | 否 | 创建时间 示例：2021-02-26 13:51:04 |
| usagestate_name | string | 否 | 使用状态名称 示例：在用 |
| usagestate | long | 否 | 使用状态id 示例：2112934987388602 |
| name | object | 否 | 设备名称,支持多语 |
| assetsmodel | object | 否 | 资产模型 |
| location | object | 否 | 存放地点,支持多语 |
| category | long | 否 | 固定资产类别 示例：2142662516806416 |
| status | string | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"fixedstatus": "1",
		"returncount": 0,
		"managedepredept_code": "01",
		"verifystate": 0,
		"code": "0001210126000002",
		"category_name": "土地",
		"moredepartment": false,
		"createassetdate": "2021-01-26 00:00:00",
		"masterOrgKeyField": "accentity",
		"bodies": [
			{
				"scrapvalue": 500,
				"monthdepreciationvalue": 15.83,
				"depreciationmethod_name": "平均年限法(二)",
				"method_isDepreciation": true,
				"lifemonth": 600,
				"unitdepreciation": 0,
				"addedtax": 0,
				"accruedoriginalvalue": 10000,
				"natCurrency": "2145519866484224",
				"id": 2148248202318337,
				"residualworkload": 0,
				"extractedperiod": 1,
				"exchangeRateType_code": "01",
				"exchangeRateType_digit": 6,
				"period": "2021-01",
				"taxrate": 0,
				"depreciationMethodPath": "3",
				"monthdepreciationrate": 0.001583,
				"natCurrency_moneyDigit": 2,
				"auditTime": "2021-03-01 00:00:00",
				"natCurrency_priceDigit": 2,
				"scrapvaluerate": 5,
				"existingworkload": 0,
				"monthworkload": 0,
				"netvalue": 9984.17,
				"currency_moneyDigit": 2,
				"exchangerate": 1,
				"busiaccbook_code": "0226_0001",
				"depreciationmethod": 67971,
				"depreciationstatus": "0",
				"natCurrency_name": "人民币",
				"currency": "2145519866484224",
				"pubts": "2021-03-01 15:35:55",
				"fcoriginalvalue": 10000,
				"depreciation": 15.83,
				"auditstatus": 1,
				"busiaccbook": 2148237766856960,
				"currency_name": "人民币",
				"fixedassetsinfo": 2148248202318336,
				"sumyeardeprevalue": 0,
				"monthdepreciation": true,
				"workloadunit": {},
				"auditor": "17835411342",
				"totalworkload": 0,
				"voucherstatus": "2",
				"exchangeRateType": "gf3g1m9k",
				"initflag": false,
				"impairment": 0,
				"exchangeRateType_name": "基准汇率",
				"busiaccbook_name": "固定资产_默认业务账簿",
				"netamount": 9984.17
			}
		],
		"modifier": "17835411342",
		"project": "2146982582637056",
		"calid": 2148248202318337,
		"accentity_name": "固定资产",
		"project_name": "导入项目1",
		"accentity": "2148237326782720",
		"usedepredept_name": "采购",
		"categoryParentId": 2142662516806416,
		"modifyTime": "2021-03-01 15:35:46",
		"usedepredept_code": "01",
		"addway": 2112934640867002,
		"addway_name": "直接购入",
		"usedepredept": "2148245505003776",
		"id": 2148248202318336,
		"pubts": "2021-03-01 15:35:50",
		"category_isEnd": true,
		"usagestate_stateDepre": true,
		"managedepredept": "2148245505003776",
		"creator": "13521729025",
		"amount": 1,
		"category_code": "01",
		"isWfControlled": false,
		"managedepredept_name": "采购",
		"specification": {},
		"begintime": "2021-01-26 00:00:00",
		"project_code": "02",
		"accentity_code": "0226",
		"depreciationrecords": [
			{
				"periodcode": "2021-01",
				"monthdepreciationvalue": 15.83,
				"fixedassetsinfo": 2148248202318336,
				"monthdepreciationrate": 0.001583,
				"unitdepreciation": 0,
				"natCurrency_name": "人民币",
				"accruedoriginalvalue": 10000,
				"yeardepreciation": 15.83,
				"natCurrency": "2145519866484224",
				"natCurrency_moneyDigit": 2,
				"natCurrency_priceDigit": 2,
				"id": 2152598000144896,
				"depreciation": 15.83
			}
		],
		"tradetype": "2145521022210305",
		"createTime": "2021-02-26 13:51:04",
		"usagestate_name": "在用",
		"usagestate": 2112934987388602,
		"name": {
			"zh_CN": "豪宅"
		},
		"assetsmodel": {},
		"location": {},
		"category": 2142662516806416,
		"status": "1"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	折旧清单详情查询无错误码，只会出现查询时data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (115)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

