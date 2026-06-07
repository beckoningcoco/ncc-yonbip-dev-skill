---
title: "删除银行黑名单（废弃）"
apiId: "1855779098756907008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Blacklist Settings"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Blacklist Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 删除银行黑名单（废弃）

> `ContentType	application/json` 请求方式	POST | 分类: Bank Blacklist Settings (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/blacklist/delete

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
| accentity | string | 否 | 是 | 会计主体(编码) |
| orgType | string | 否 | 是 | 机构类型(10:银行类别 20:银行网点) |
| bank | string | 否 | 是 | 银行类别(编码) |
| bankdot | string | 否 | 否 | 机构类型为银行网点时，银行网点不能为空(编码) |

## 3. 请求示例

Url: /yonbip/ctm/blacklist/delete?access_token=访问令牌
Body: {
	"accentity": "",
	"orgType": "",
	"bank": "",
	"bankdot": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	参考message提示	根据message提示修改请求数据


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

