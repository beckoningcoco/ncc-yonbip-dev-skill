---
title: "进项转出编辑"
apiId: "2024365842244829191"
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

# 进项转出编辑

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/reimburseCollection/up-rollout

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
| outPeriod | string | 否 | 是 | 转出所属期 yyyy-MM 示例：2022-11 |
| outMoney | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 转出税额（转出方式为手工转出时必填） 示例：0.01 |
| vnote | string | 否 | 否 | 备注 示例：lll |
| voucherId | string | 否 | 否 | 凭证号 示例：12312 |
| voucherAccId | string | 否 | 否 | 凭证号ID 示例：1 |
| accountDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 记账日期yyyy-MM-dd 示例：2023-10-10 |
| srcBillcode | string | 否 | 否 | 来源单据号 示例：1 |
| unDistinctItTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 不能区分的进项税额（转出方式为按比例转出时必填） 示例：100 |
| outRatio | number |
| 小数位数:4,最大长度:5 | 否 | 否 | 转出比例（转出方式为按比例转出时必填） 示例：0.13 |
| projectCode | string | 否 | 否 | 项目编码 示例：xmbm |
| srcId | string | 否 | 否 | 数据来源ID(srcId和id不可同时为空) 示例：1 |
| id | string | 否 | 否 | 系统ID(srcId和id不可同时为空) 示例：111 |
| taxRebate | string | 否 | 否 | 即征即退标识 Y-是；N-否；P-部分 示例：N |
| accountPeriod | string | 否 | 否 | 会计期间yyyy-MM 示例：2025-02 |
| defineTerm | object | 否 | 否 | 特征 示例：{"sg_einvoice_type": "380","camboo": true} |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/reimburseCollection/up-rollout?access_token=访问令牌
Body: {
	"outPeriod": "2022-11",
	"outMoney": 0.01,
	"vnote": "lll",
	"voucherId": "12312",
	"voucherAccId": "1",
	"accountDate": "2023-10-10",
	"srcBillcode": "1",
	"unDistinctItTax": 100,
	"outRatio": 0.13,
	"projectCode": "xmbm",
	"srcId": "1",
	"id": "111",
	"taxRebate": "N",
	"accountPeriod": "2025-02",
	"defineTerm": {
		"sg_einvoice_type": "380",
		"camboo": true
	}
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
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	根据返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-03

新增

请求参数 defineTerm


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

