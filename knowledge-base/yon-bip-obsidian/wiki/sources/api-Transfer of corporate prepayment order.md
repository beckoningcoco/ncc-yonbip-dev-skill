---
title: "对公预付单转交"
apiId: "1847710152275787781"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Prepayment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Prepayment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 对公预付单转交

> `ContentType	application/json` 请求方式	POST | 分类: Prepayment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/loanbill/loanTransfer

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
| thirdsysbill | string | 否 | 是 | 第三方系统单据id |
| code | string | 否 | 是 | 费控单据编号 示例：PPAY230927000003 |
| pk_handlepsn | string | 否 | 是 | 接收人 示例：1684324090204127241 |
| chandleorg | string | 否 | 是 | 接收人组织 示例：1684323128113627140 |
| vhandledeptid | string | 否 | 是 | 接收人部门 示例：1684323394431483911 |
| cfinaceorg | string | 否 | 是 | 费用承担组织 示例：1684323128113627140 |
| vfinacedeptid | string | 否 | 是 | 费用承担部门 示例：1684323394431483911 |
| pk_busimemo | long | 否 | 是 | 费用项目 示例：1684485048393269248 |
| caccountorg | string | 否 | 是 | 会计主体 示例：1684323128113627140 |
| vreason | string | 否 | 否 | 说明 示例：说明 |
| loanBillId | long | 否 | 是 | 费控单据id 示例：1826061326695268357 |
| pk_billtype | string | 否 | 是 | 单据类型 示例：znbzbx_pubprepay |
| thirdsysflag | string | 否 | 是 | 三方系统标识 示例：sop |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/loanbill/loanTransfer?access_token=访问令牌
Body: {
	"thirdsysbill": "",
	"code": "PPAY230927000003",
	"pk_handlepsn": "1684324090204127241",
	"chandleorg": "1684323128113627140",
	"vhandledeptid": "1684323394431483911",
	"cfinaceorg": "1684323128113627140",
	"vfinacedeptid": "1684323394431483911",
	"pk_busimemo": 1684485048393269248,
	"caccountorg": "1684323128113627140",
	"vreason": "说明",
	"loanBillId": 1826061326695268357,
	"pk_billtype": "znbzbx_pubprepay",
	"thirdsysflag": "sop"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | long | 否 | code 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | message 示例：操作成功 |
| traceId | string | 否 | traceId 示例：148993999ae35806 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"traceId": "148993999ae35806"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	借款转交失败	费用承担组织、部门没有费用权限


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-29

更新

请求说明

不是标准data，不支持幂等，回退修改

2	2026-01-08

更新

请求说明

添加幂等

3	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

