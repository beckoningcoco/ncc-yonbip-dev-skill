---
title: "增值税即征即退计算表-编辑"
apiId: "2324185067427987464"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation table of immediate withdrawal"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation table of immediate withdrawal]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税即征即退计算表-编辑

> `ContentType	application/json` 请求方式	POST | 分类: Calculation table of immediate withdrawal (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/tax-rebate-collection/update

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
| sourceId | string | 否 | 是 | 来源ID(最大长度200，唯一校验) 示例：22344 |
| period | string | 否 | 否 | 税款所属期(格式：YYYY-MM) 示例：2024-05 |
| taxRebatePolicyType | string | 否 | 否 | 即征即退类型(30:即征即退30%、50:即征即退50%、70:即征即退70%、100:即征即退100%、3:超税负3%即征即退、6:超税负6%即征即退) 示例：30 |
| salesAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 销售额 示例：1.00 |
| salesTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 销项税额 示例：0.13 |
| preTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 上期留抵税额 示例：1.01 |
| inputTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 进项税额 示例：1.02 |
| outTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 进项转出税额 示例：0.11 |
| realTaxRebateTaxAmount | number |
| 小数位数:2,最大长度:5 | 否 | 否 | 即征即退实际退税额 示例：20.01 |
| remark | string | 否 | 否 | 备注(最大长度500) |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tax-rebate-collection/update?access_token=访问令牌
Body: {
	"sourceId": "22344",
	"period": "2024-05",
	"taxRebatePolicyType": "30",
	"salesAmount": 1,
	"salesTaxAmount": 0.13,
	"preTaxAmount": 1.01,
	"inputTaxAmount": 1.02,
	"outTaxAmount": 0.11,
	"realTaxRebateTaxAmount": 20.01,
	"remark": ""
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
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


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

