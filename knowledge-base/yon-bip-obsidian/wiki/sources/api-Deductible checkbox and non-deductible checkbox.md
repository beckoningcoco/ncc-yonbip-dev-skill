---
title: "抵扣勾选与不抵扣勾选"
apiId: "1759457679682568194"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 抵扣勾选与不抵扣勾选

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/vat/gxtj

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
| hmdms | object | 是 | 是 | 发票信息 |
| fpDm | string | 否 | 是 | 发票代码 没有时传空字符串 示例：3100111130 |
| fpHm | string | 否 | 是 | 发票号码 示例：11404542 |
| kprq | string | 否 | 是 | 开票日期 yyyyMMdd 示例：20170831 |
| yxse | BigDecimal | 否 | 否 | 有效税额（两位小数）预勾选此参数⽆效 示例：23 |
| undeductReason | long | 否 | 否 | 不抵扣原因，预勾选此参数⽆效，不抵扣勾选-必填 1-用于非应税项目 2-用于免税项目 3-用于集体福利和个人消费 4-非正常损失 5-其他 示例：1 |
| deductMode | long | 否 | 否 | 抵扣类型,预勾选时此参数无效 1.抵扣(不填默认为抵扣） 2.不抵扣 示例：1 |
| mobileOrEmail | string | 否 | 否 | 勾选人在税务云的手机或邮箱 示例：17090028043 |
| nsrsbh | string | 否 | 否 | 纳税人识别号(纳税人识别号与税务组织编码至少传入一项) 示例:SWOPENAPI519354 示例：91110000600001760P |
| orgcode | string | 否 | 否 | 税务组织编码(原:会计主体编码，纳税人识别号与税务组织编码至少传入一项) 示例: SWOPENAPI 示例：test |
| gxType | long | 否 | 否 | 勾选类型（不填时默认为2） 1.预勾选 2.勾选 示例：2 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/vat/gxtj?access_token=访问令牌
Body: {
	"hmdms": [
		{
			"fpDm": "3100111130",
			"fpHm": "11404542",
			"kprq": "20170831",
			"yxse": 23,
			"undeductReason": 1
		}
	],
	"deductMode": 1,
	"mobileOrEmail": "17090028043",
	"nsrsbh": "91110000600001760P",
	"orgcode": "test",
	"gxType": 2
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
| data | object | 否 | 返回数据 |
| hmdms | object | 是 | 勾选失败或检测错误的发票 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"hmdms": [
			{
				"fpDm": "1111",
				"fpHm": "11111111",
				"errorMsg": "发生错误"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-21

更新

请求说明

2	2025-07-07

更新

请求参数 nsrsbh

更新

请求参数 orgcode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

