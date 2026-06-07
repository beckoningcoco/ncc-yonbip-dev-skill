---
title: "项目-人员保存"
apiId: "bd8cab22be8146ac87d40d824eb60c75"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project - Personnel"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project - Personnel]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目-人员保存

> `ContentType	application/json` 请求方式	POST | 分类: Project - Personnel (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/projectpsn/save

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
| data | object | 否 | 是 | 请求参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 档案id(_status为Update更新时必填) |
| cfinaceorg | string | 否 | 是 | 业务单元(支持id和code) 示例：1961970750984448 |
| pk_project | string | 否 | 是 | 项目(支持id和code) 示例：2043840925930496 |
| pk_handlepsn | string | 否 | 是 | 员工(支持id和code) 示例：2302283524903168 |
| vmemo | string | 否 | 否 | 备注 示例：项目-人员新增 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/projectpsn/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"cfinaceorg": "1961970750984448",
		"pk_project": "2043840925930496",
		"pk_handlepsn": "2302283524903168",
		"vmemo": "项目-人员新增",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 主键 示例：2531647508861184 |
| cfinaceorg | string | 否 | 业务单元id 示例：1961970750984448 |
| pk_project | string | 否 | 项目id 示例：2043840925930496 |
| pk_handlepsn | string | 否 | 人员id 引用：员工(新)StaffNew 示例：2302283524903168 |
| vmemo | string | 否 | 备注 示例：项目-人员新增 |
| creator | string | 否 | 创建人 示例：黄东发 |
| createTime | string | 否 | 创建时间 示例：2021-11-24 10:05:01 |
| creatorId | long | 否 | 创建人id 示例：1987089360785664 |
| createDate | string | 否 | 创建日期 示例：2021-11-24 10:05:01 |
| pubts | string | 否 | 时间戳 示例：2021-11-24 10:05:01 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"resubmitCheckKey": "OPENAPI_bd8cab22be8146ac87d40d824eb60c75_csrka3z7_liu1129-0004",
		"id": 2531647508861184,
		"cfinaceorg": "1961970750984448",
		"pk_project": "2043840925930496",
		"pk_handlepsn": "2302283524903168",
		"vmemo": "项目-人员新增",
		"creator": "黄东发",
		"createTime": "2021-11-24 10:05:01",
		"creatorId": 1987089360785664,
		"createDate": "2021-11-24 10:05:01",
		"pubts": "2021-11-24 10:05:01"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

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

