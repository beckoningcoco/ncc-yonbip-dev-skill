---
title: "《投资资产台账》新增接口"
apiId: "2061442688590282757"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment asset account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment asset account]
platform_version: "BIP"
source_type: community-api-docs
---

# 《投资资产台账》新增接口

> `ContentType	application/json` 请求方式	POST | 分类: Investment asset account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/investment-ledger/batch-save

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
| data | object | 是 | 是 | 新增数据 |
| sourceUnique | string | 否 | 是 | 来源标识 示例：1122 |
| orgCode | string | 否 | 是 | 组织编码 示例：wpzy |
| projectCode | string | 否 | 否 | 项目编码 示例：12312 |
| assetCode | string | 否 | 是 | 资产编码 示例：wwaa12 |
| assetName | string | 否 | 是 | 资产名称 示例：wwaa12 |
| assetType | string | 否 | 是 | 资产类型(枚举,{1:交易性金融资产,2:可供出售金融资产,3:持有至到期投资,4:衍生工具,5:交易性金融负债,6:长期股权投资,7:短期投资,8:长期债券投资,9:其他}) 示例：1 默认值：1 |
| investedCompanyName | string | 否 | 否 | 被投资企业名称 示例：北京xx公司 |
| investedCompanyNsrsbh | string | 否 | 否 | 被投资企业纳税人识别号 示例：12344 |
| investmentProperty | string | 否 | 是 | 投资性质(枚举,{1:直接投资,2:股票投资(不含H股),3:股票投资—沪港通H股,4:股票投资—深港通H股,5:创新企业CDR,6:永续债}) 示例：1 |
| investedCompanyType | string | 否 | 是 | 被投资企业类型(枚举,{1:股份有限公司,2:有限责任公司,3:合伙企业,4:独资企业,5:非居民企业,6:其他企业类型}) 示例：1 默认值：1 |
| listingAndCirculationDate | string | 否 | 否 | 该股上市流通日期(有条件必填，当“投资性质”为“股票投资”时，必填；否则不能填写) 示例：2024-05-06 |
| investmentInitialDate | string | 否 | 是 | 初始投资日期 示例：2024-05-06 |
| remarks | string | 否 | 否 | 备注 示例：备注222 |
| detailsList | object | 是 | 是 | 投资台账子表数据 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/investment-ledger/batch-save?access_token=访问令牌
Body: {
	"data": [
		{
			"sourceUnique": "1122",
			"orgCode": "wpzy",
			"projectCode": "12312",
			"assetCode": "wwaa12",
			"assetName": "wwaa12",
			"assetType": "1",
			"investedCompanyName": "北京xx公司",
			"investedCompanyNsrsbh": "12344",
			"investmentProperty": "1",
			"investedCompanyType": "1",
			"listingAndCirculationDate": "2024-05-06",
			"investmentInitialDate": "2024-05-06",
			"remarks": "备注222",
			"detailsList": [
				{
					"sourceUnique": "1244",
					"investmentDate": "2024-05-06",
					"voucherDate": "2024-05-06",
					"voucherType": "12",
					"voucherCode": "3333",
					"voucherNo": "1234",
					"acccountingItemNo": "1234",
					"accountingItemName": "1244",
					"initialInvestmentCost": 13.22,
					"investmentCostRevenueAmount": 100.34,
					"investmentRatio": 0.6,
					"accountingMethods": "1",
					"initialShareNetValue": 12.56
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 否 | 返回对象 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：1 |
| infos | object | 是 | 成功数据 |
| messages | object | 是 | 失败数据 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"infos": [
			{
				"sourceUnique": "1",
				"id": "1"
			}
		],
		"messages": [
			{
				"sourceUnique": "1",
				"message": "依据组织编码【1】查询组织为空"
			}
		]
	},
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-21

更新

请求说明

新增

请求参数 sourceUnique

新增字段：来源标识

2	2025-09-28

删除

请求参数 sourceUnique

修改目录到企业所得税下


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

