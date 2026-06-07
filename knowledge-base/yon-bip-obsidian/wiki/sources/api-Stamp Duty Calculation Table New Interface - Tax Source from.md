---
title: "印花税计算表新增接口-税源来自单据"
apiId: "1918048264749318149"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stamp Tax Calculation Table"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stamp Tax Calculation Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 印花税计算表新增接口-税源来自单据

> `ContentType	application/json` 请求方式	POST | 分类: Stamp Tax Calculation Table (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/stamptax/addWithoutContract

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
| datas | object | 是 | 否 | 数据集合 |
| lyid | string | 否 | 是 | 来源唯一id 示例：117346264 |
| orgCode | string | 否 | 是 | 组织编码 示例：org2357 |
| deptCode | string | 否 | 否 | 部门编码 示例：BM00 |
| je | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 发生金额 示例：12.00 |
| adjustJe | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 调整金额 示例：1.00 |
| adjustedJe | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 调整后计税金额 示例：11.00 |
| paidTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 已缴税额 示例：3.00 |
| periodType | string | 否 | 否 | 填报周期(季1，年3，次4） 示例：1 |
| voucherType | string | 否 | 是 | 税目编码 示例：05_007 |
| subVoucherType | string | 否 | 否 | 子目编码 示例：05_007_00 |
| contractName | string | 否 | 否 | 应税凭证名称(默认等于税目-子目，如果子目为空则等于税目) 示例：应税凭证名称示例 |
| billNo | string | 否 | 是 | 单据号 示例：12398 |
| billDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期yyyy-MM-dd 示例：2023-12-01 |
| businessTypeCode | string | 否 | 否 | 业务类型编码 示例：btc2367 |
| businessTypeName | string | 否 | 是 | 业务类型名称 示例：zhklangf |
| contractCount | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 应税凭证数量 示例：1 默认值：1 |
| taxableVoucherCode | string | 否 | 否 | 应税凭证编号 示例：YSPZBH |
| oriCurrencyCode | string | 否 | 否 | 业务币种 示例：CNY |
| exchangeRate | number |
| 小数位数:8,最大长度:32 | 否 | 否 | 汇率 示例：0.675 |
| exchangeRateBusDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 汇率日期 示例：2025-11-26 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/stamptax/addWithoutContract?access_token=访问令牌
Body: {
	"datas": [
		{
			"lyid": "117346264",
			"orgCode": "org2357",
			"deptCode": "BM00",
			"je": 12,
			"adjustJe": 1,
			"adjustedJe": 11,
			"paidTax": 3,
			"periodType": "1",
			"voucherType": "05_007",
			"subVoucherType": "05_007_00",
			"contractName": "应税凭证名称示例",
			"billNo": "12398",
			"billDate": "2023-12-01",
			"businessTypeCode": "btc2367",
			"businessTypeName": "zhklangf",
			"contractCount": 1,
			"taxableVoucherCode": "YSPZBH",
			"oriCurrencyCode": "CNY",
			"exchangeRate": 0.675,
			"exchangeRateBusDate": "2025-11-26"
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
| code | string | 否 | 操作码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 操作描述 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-26

更新

请求说明

新增

请求参数 exchangeRateBusDate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

