---
title: "费用录入删除"
apiId: "2263496409877053447"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Entry"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用录入删除

> `ContentType	application/json` 请求方式	POST | 分类: Expense Entry (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/ecc/expenseinput/del

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
| accpurpose | string | 否 | 否 | 核算目的id 示例：核算目的id，与新增时一致 |
| accentity | string | 否 | 是 | 会计主体id 示例：会计主体id， 与新增时一致 |
| accbook | string | 否 | 是 | 账簿id 示例：账簿id，与新增时一致 |
| bookedDate | string | 否 | 是 | 单据日期 示例：与新增时一致，根据业务日期找到所属期间信息 |
| srcClue | string | 否 | 是 | 来源线索 示例：来源线索id，与新增时一致 |

## 3. 请求示例

Url: /yonbip/CO/ecc/expenseinput/del?access_token=访问令牌
Body: {
	"accpurpose": "核算目的id，与新增时一致",
	"accentity": "会计主体id， 与新增时一致",
	"accbook": "账簿id，与新增时一致",
	"bookedDate": "与新增时一致，根据业务日期找到所属期间信息",
	"srcClue": "来源线索id，与新增时一致"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

