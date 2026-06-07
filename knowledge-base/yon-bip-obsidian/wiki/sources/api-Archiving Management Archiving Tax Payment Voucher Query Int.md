---
title: "档案服务归档税务完税凭证查询接口"
apiId: "2004372159590825985"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "One-key declaration"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, One-key declaration]
platform_version: "BIP"
source_type: community-api-docs
---

# 档案服务归档税务完税凭证查询接口

> `ContentType	application/json` 请求方式	POST | 分类: One-key declaration (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/archive/check

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
| accountYear | string | 否 | 是 | 【yyyy】会计年 示例：2023 |
| accountMonth | string | 否 | 是 | 【MM】会计月 示例：01 |
| orgInfo | object | 否 | 是 | 全宗信息 |
| code | string | 否 | 是 | 全宗编码（对应业务单元编码） 示例：nzj0328 |
| type | string | 否 | 否 | unit 业务单元 book 核算账簿（默认） 示例：book |
| upperLevels | string | 否 | 否 | 向上采集级别 示例：0 |
| cateCode | string | 否 | 否 | 目录前缀\或者单据类型（NSSBB\WSZM\OTHER）,为空默认全部 示例：NSSBB |
| taxablePeriod | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 税务资料所属期，1是征期，2是税款所属期 示例：1 |
| srcSys | string | 否 | 否 | 来源系统 示例：maotai |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/archive/check?access_token=访问令牌
Body: {
	"accountYear": "2023",
	"accountMonth": "01",
	"orgInfo": {
		"code": "nzj0328",
		"type": "book"
	},
	"upperLevels": "0",
	"cateCode": "NSSBB",
	"taxablePeriod": 1,
	"srcSys": "maotai"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 是 | data |
| pk | string | 否 | 单据主键 示例：1726773837544030208 |
| type | string | 否 | 单据类型编码 示例：WSPZ |
| ts | string | 否 | yyyy-MM-dd HH:mm:ss 示例：yyyy-MM-dd HH:mm:ss |
| attachmentPkList | object | 是 | 附件PK集合 |
| upperDocs | object | 是 | 上游单据、回单、发票列表 |
| base64Encode | string | 否 | 归档文件的base64编码(会根据srcSys确定是否返回值) |
| message | string | 否 | message 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"data": [
		{
			"pk": "1726773837544030208",
			"type": "WSPZ",
			"ts": "yyyy-MM-dd  HH:mm:ss",
			"attachmentPkList": [
				{}
			],
			"upperDocs": [
				{
					"pk": "",
					"type": "",
					"ts": ""
				}
			],
			"base64Encode": ""
		}
	],
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-05

更新

请求说明

新增

请求参数 taxablePeriod

新增

请求参数 srcSys

新增

返回参数 base64Encode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

