---
title: "投资预提生单"
apiId: "2236683332784488457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Accrual"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Accrual]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资预提生单

> `ContentType	application/json` 请求方式	POST | 分类: Investment Accrual (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/investaccrual/openapi/create

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 资金组织 示例：收入中台演示销售组织 |
| deptid | string | 否 | 否 | 部门 示例：销售部 |
| costCenter | string | 否 | 否 | 成本中心 示例：成本中心A |
| profitCenter | string | 否 | 否 | 利润中心 示例：集团利润中心 |
| protocolNumber | string | 否 | 是 | 协议号(可传入协议ID/编码/协议号) 示例：定期存款A |
| purchaseCode | string | 否 | 是 | 申购单号 示例：定期存款A001 |
| beginDate | string | 否 | 否 | 预提起息日（未传值由系统默认计算） 示例：2024-07-24 |
| endDate | string | 否 | 是 | 预提止息日 示例：2024-08-24 |
| interestAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 预提金额合计（计息币种）未传值由系统默认计算 示例：1000000.00 |
| exchangerateType | string | 否 | 否 | 本币币种汇率类型 示例：基准汇率 |
| exchangeRate | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 本币币种汇率 示例：1.00 |
| appointRate | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 利息约定汇率 示例：1.000000 |
| localAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 预提金额合计（本币币种） 示例：1000000.00 |
| investAccrualDetail | object | 是 | 否 | 预提明细（未传值由系统默认计算） |
| detail_beginDate | string | 否 | 否 | 预提起息日 示例：2024-07-24 |
| detail_endDate | string | 否 | 否 | 预提止息日 示例：2024-08-24 |
| detail_interestDays | string | 否 | 否 | 计息天数 示例：30 |
| detail_interestRate | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 利率，不带百分号的值 示例：2.5%传2.5 |
| detail_wdIntereestAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 预提金额（计息币种） 示例：1000000.00 |
| detail_withholdingLocalAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 预提金额（本币币种） 示例：1000000.00 |
| detail_receiptBalance | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 申购单余额（协议币种） 示例：100000.00 |

## 3. 请求示例

Url: /yonbip/ctm/fm/investaccrual/openapi/create?access_token=访问令牌
Body: {
	"accentity": "收入中台演示销售组织",
	"deptid": "销售部",
	"costCenter": "成本中心A",
	"profitCenter": "集团利润中心",
	"protocolNumber": "定期存款A",
	"purchaseCode": "定期存款A001",
	"beginDate": "2024-07-24",
	"endDate": "2024-08-24",
	"interestAmount": 1000000,
	"exchangerateType": "基准汇率",
	"exchangeRate": 1,
	"appointRate": 1,
	"localAmount": 1000000,
	"investAccrualDetail": [
		{
			"detail_beginDate": "2024-07-24",
			"detail_endDate": "2024-08-24",
			"detail_interestDays": "30",
			"detail_interestRate": NaN,
			"detail_wdIntereestAmount": 1000000,
			"detail_withholdingLocalAmount": 1000000,
			"detail_receiptBalance": 100000
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| data | object | 否 | 数据集 |
| code | string | 否 | 单据编码 示例：TZYT2504170004 |
| id | string | 否 | 单据ID 示例：2354458534394462224 |
| message | string | 否 | 返回消息 |
| timestamp | string | 否 | 时间戳 示例：1735611415146 |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"code": "TZYT2504170004",
		"id": "2354458534394462224"
	},
	"message": "",
	"timestamp": "1735611415146"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

0	成功

501	参数错误

401	权限错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-25

更新

请求说明

新增

请求参数 protocolNumber

新增

请求参数 appointRate

新增

请求参数 detail_receiptBalance

更新

请求参数 (10)

删除

请求参数 action

新增

返回参数 id

更新

返回参数 (4)

删除

返回参数 statusMsg


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

