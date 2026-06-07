---
title: "凭证类别新增"
apiId: "9becfc6ed51846da9577a9e3468d4d9e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证类别新增

> `ContentType	application/json` 请求方式	POST | 分类: Voucher Type (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/vouchertype/save

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
| pk_org | object | 否 | 是 | 会计主体 |
| id | string | 否 | 是 | 主键 示例：globalorg |
| code | string | 否 | 否 | 编码 示例：globalorg |
| name | string | 否 | 否 | 名称 示例：企业账号级 |
| code | string | 否 | 是 | 凭证类型编码 示例：12321 |
| name | string | 否 | 是 | 凭证类型中文名 示例：中文名称 |
| name2 | string | 否 | 否 | 凭证类型英文名 |
| name3 | string | 否 | 否 | 凭证类型繁体 |
| name4 | string | 否 | 否 | 凭证类型多语预留 |
| name5 | string | 否 | 否 | 凭证类型多语预留 |
| name6 | string | 否 | 否 | 凭证类型多语预留 |
| voucherstr | string | 否 | 是 | 凭证字中文 示例：凭证字 |
| voucherstr2 | string | 否 | 否 | 凭证字英文 |
| voucherstr3 | string | 否 | 否 | 凭证字繁体 |
| voucherstr4 | string | 否 | 否 | 凭证字多语预留 |
| voucherstr5 | string | 否 | 否 | 凭证字多语预留 |
| voucherstr6 | string | 否 | 否 | 凭证字多语预留 |
| description | string | 否 | 否 | 描述中文 示例：备注中文 |
| description2 | string | 否 | 否 | 描述英文 |
| description3 | string | 否 | 否 | 描述繁体 |
| description4 | string | 否 | 否 | 描述多语预留 |
| description5 | string | 否 | 否 | 描述多语预留 |
| description6 | string | 否 | 否 | 描述多语预留 |

## 3. 请求示例

Url: /yonbip/fi/vouchertype/save?access_token=访问令牌
Body: {
	"pk_org": {
		"id": "globalorg",
		"code": "globalorg",
		"name": "企业账号级"
	},
	"code": "12321",
	"name": "中文名称",
	"name2": "",
	"name3": "",
	"name4": "",
	"name5": "",
	"name6": "",
	"voucherstr": "凭证字",
	"voucherstr2": "",
	"voucherstr3": "",
	"voucherstr4": "",
	"voucherstr5": "",
	"voucherstr6": "",
	"description": "备注中文",
	"description2": "",
	"description3": "",
	"description4": "",
	"description5": "",
	"description6": ""
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
| success | boolean | 否 | 返回结果 示例：true |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 凭证类型主键 示例：E4DF5B92-0589-4ECE-9925-4ED393B022BF |
| code | long | 否 | 返回状态编码 示例：1 |
| total | long | 否 | 总数 示例：0 |

## 5. 正确返回示例

{
	"success": true,
	"message": "",
	"data": {
		"id": "E4DF5B92-0589-4ECE-9925-4ED393B022BF"
	},
	"code": 1,
	"total": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-28

更新

请求说明

修改参数透传


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

