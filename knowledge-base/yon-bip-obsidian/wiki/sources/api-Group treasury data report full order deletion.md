---
title: "集团司库数据上报整单删除"
apiId: "2183160017262215177"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Regulatory Reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 集团司库数据上报整单删除

> `ContentType	application/json` 请求方式	POST | 分类: Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/submit/api/group/bill/delete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| dataDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 数据日期 示例：2025-01-02 |
| submitType | string | 否 | 是 | 报送业务名称 银行贷款 BANK 银行账户 BANK_ACCOUNT 结算 SETTLEMENT 应付债券 PAY_BOND 客商 MERCHINFO 示例：BANK |

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/bill/delete?access_token=访问令牌
Body: {
	"dataDate": "2025-01-02",
	"submitType": "BANK"
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
| 小数位数:0,最大长度:10 | 否 | 接口返回状态码 |
| message | string | 否 | 接口返回描述信息 |

## 5. 正确返回示例

{
	"code": 0,
	"message": ""
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

