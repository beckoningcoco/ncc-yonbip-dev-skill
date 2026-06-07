---
title: "信用分调整"
apiId: "2022209828787585032"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Credits"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Credits]
platform_version: "BIP"
source_type: community-api-docs
---

# 信用分调整

> `ContentType	application/json` 请求方式	POST | 分类: Credits (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/credit/archive/adjustCreditScore

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| staffId | string | 否 | 是 | 员工id 示例：1998965414169149440 |
| type | number |
| 小数位数:0,最大长度:2 | 否 | 是 | 调整类型 0-调至信用方案最低信用等级上限 1-调至信用方案默认分 示例：0 默认值：0 |
| reason | string | 否 | 是 | 调整原因 示例：学习完加分 |
| data | object | 否 | 否 | 其他参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| adjustScore | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 调整的分数 |

## 3. 请求示例

Url: /yonbip/ssc/credit/archive/adjustCreditScore?access_token=访问令牌
Body: {
	"staffId": "1998965414169149440",
	"type": 0,
	"reason": "学习完加分",
	"data": {
		"resubmitCheckKey": "",
		"adjustScore": 0
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 成功为200，错误提示为其他值 示例：200 |
| message | string | 否 | 成功提示或错误提示 示例：操作成功 |
| data | object | 否 | 业务数据 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023502100000	服务端逻辑异常	稍后重试或联系管理员

1023502100001	无启用的信用方案，接口调用失败，请检查并修正。

1023502100002	信用方案未初始化，接口调用失败，请检查并修正。

1023502100003	您的信用分已达到提单信用阈值上限，当前无法通过学习平台增加信用分。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-08-07

更新

请求说明

新增

请求参数 data

新增

请求参数 adjustScore

调试


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

