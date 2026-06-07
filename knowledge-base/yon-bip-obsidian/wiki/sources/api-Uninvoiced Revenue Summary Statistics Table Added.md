---
title: "未开票收入汇总统计表新增"
apiId: "2001426456286593031"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 未开票收入汇总统计表新增

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/invoice-will/save-invoicewillstat

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
| orgCode | string | 否 | 是 | 税务组织编码 示例：aaaa |
| list | object | 是 | 是 | 未开票新增数据集合 |
| srcBillid | string | 否 | 是 | 未开票数据来源id（删除数据时使用）（长度64） |
| gmfNsrsbh | string | 否 | 否 | 购买方纳税人识别号（长度20） |
| gmfMc | string | 否 | 否 | 购买方名称（长度100） |
| period | string | 否 | 是 | 所属期（yyyy-MM）（长度7） 示例：2024-05 |
| accountTime | string | 否 | 否 | 记账日期（yyyy-MM-dd）（长度10） 示例：2024-05-20 |
| kprq | string | 否 | 否 | 开票日期（yyyy-MM-dd）（长度10） 示例：2024-05-20 |
| matrclassCode | string | 否 | 是 | 分类编码(商品税收分类编码 ;商品大类编码（1货物，2劳务,3服务,4无形资产,5不动产,6不征税）) 示例：1 |
| taxRate | number |
| 小数位数:6,最大长度:7 | 否 | 是 | 税率（小数格式） 示例：0.13 |
| lslbs | string | 否 | 否 | 零税率标识 空：非零利率，0：出口退税，1：免税，2：不征收，3普通零税率 |
| incomeAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 确认收入金额 |
| incomeTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 确认税收税额 |
| billedAmt | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 开票金额 |
| billedTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 开票税额 |
| unbilledAmt | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 影响未开票金额 示例：1000 |
| unbilledTax | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 影响未开票税额 示例：130 |
| voucherNo | string | 否 | 否 | 凭证号（长度64） |
| taxRebate | string | 否 | 否 | 即征即退标识（Y：是，N：否） 默认值：N |
| projectCode | string | 否 | 否 | 项目编码 |
| srcBillCode | string | 否 | 否 | 来源单据号（长度200） 示例：123 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoice-will/save-invoicewillstat?access_token=访问令牌
Body: {
	"orgCode": "aaaa",
	"list": [
		{
			"srcBillid": "",
			"gmfNsrsbh": "",
			"gmfMc": "",
			"period": "2024-05",
			"accountTime": "2024-05-20",
			"kprq": "2024-05-20",
			"matrclassCode": "1",
			"taxRate": 0.13,
			"lslbs": "",
			"incomeAmt": 0,
			"incomeTax": 0,
			"billedAmt": 0,
			"billedTax": 0,
			"unbilledAmt": 1000,
			"unbilledTax": 130,
			"voucherNo": "",
			"taxRebate": "",
			"projectCode": "",
			"srcBillCode": "123"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	根据提示信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-25

新增

请求参数 defineTerm

更新

请求参数 (12)

feat:20260515迭代 未开票收入统计表-YPD改造 未开票收入接口支持特征

2	2025-07-03

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

