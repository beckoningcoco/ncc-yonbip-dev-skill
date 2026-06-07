---
title: "担保规模管理新增接口"
apiId: "2393846382381236227"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Guarantee Scale Management"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Guarantee Scale Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 担保规模管理新增接口

> `ContentType	application/json` 请求方式	POST | 分类: Guarantee Scale Management (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/addGuaranteeScaleManage

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
| accentity | string | 否 | 是 | 资金组织（id/编码/名称） 示例：测试专用 |
| lastYearProperty | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 上年末净资产 示例：10000 |
| lastYearRetainedProfits | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 上年末净利润 示例：5000 |
| assetLiabilityRatio | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 资产负债率(%) 示例：10 |
| availableGuaranteeRatio | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 可担保比例(%) 示例：100 |
| isInTable | string | 否 | 是 | 是否纳入并表（是：1；否：0） 示例：0 默认值：1 |
| guaranteeScaleDetail | object | 是 | 否 | 担保规模明细 |
| guarantorType | string | 否 | 否 | 被担保人类型（资金组织：TBOT0007；客户：customer；供应商：supplier） 示例：TBOT0007 |
| guarantor1 | string | 否 | 否 | 被担保人（资金组织）id / 编码 / 名称 示例：测试专用 |
| guarantor2 | string | 否 | 否 | 被担保人（客户）（id / 编码 / 名称） |
| guarantor3 | string | 否 | 否 | 被担保人（供应商）（id / 编码 / 名称） |
| investmentAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 投资金额 示例：1000 |
| equityRelationship | string | 否 | 否 | 股权关系（全资：0；控股：1；参股：2；无股权关系：3） 示例：0 |
| shareholdingRatio | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 持股比例（%）持股比例只能填0-100 示例：100 |
| isInTheMarket | string | 否 | 否 | 是否上市（是：1；否：0） 示例：1 |
| equityFunds | string | 否 | 否 | 少数股东含有员工持股计划或股权基金（是：1；否：0） 示例：1 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/addGuaranteeScaleManage?access_token=访问令牌
Body: {
	"accentity": "测试专用",
	"lastYearProperty": 10000,
	"lastYearRetainedProfits": 5000,
	"assetLiabilityRatio": 10,
	"availableGuaranteeRatio": 100,
	"isInTable": "0",
	"guaranteeScaleDetail": [
		{
			"guarantorType": "TBOT0007",
			"guarantor1": "测试专用",
			"guarantor2": "",
			"guarantor3": "",
			"investmentAmount": 1000,
			"equityRelationship": "0",
			"shareholdingRatio": 100,
			"isInTheMarket": "1",
			"equityFunds": "1"
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:2,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| code | string | 否 | code 示例：DBGM20251031133849 |
| id | string | 否 | 单据ID 示例：1838821803352391688 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "DBGM20251031133849",
		"id": "1838821803352391688"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

