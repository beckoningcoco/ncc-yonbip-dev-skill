---
title: "票夹管理的关联权限修改"
apiId: "1758138781122691077"
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

# 票夹管理的关联权限修改

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/employee/edit

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
| email | string | 否 | 否 | 用户的邮箱，传入的参数，用户的手机号邮箱不能同时为空的 示例：123@qq.com |
| orgCode | string | 否 | 是 | 组织的编码 示例：aacc |
| authOpt | string | 否 | 是 | 功能的权限：1：报销2：采购3：采购和报销8：票据中心 示例：1 |
| mobile | string | 否 | 否 | 用户的手机号，传入的参数，用户的手机号邮箱不能同时为空的 示例：13566667777 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/employee/edit?access_token=访问令牌
Body: [{
	"email": "123@qq.com",
	"orgCode": "aacc",
	"authOpt": "1",
	"mobile": "13566667777"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 是 | 部分接口的返回数据情况 ，如果实际是空,则不会返回这个字段。请集成方对字段不存在进行合理的字段存在校验 |
| mobile | string | 否 | 电话 示例：13566667777 |
| email | string | 否 | 邮箱 示例：123344@qq.com |
| authOpt | string | 否 | 权限 示例：1 |
| orgCode | string | 否 | 组织编码 示例：awss |
| errMsg | string | 否 | 错误信息 示例：aass |
| oldOrgCode | string | 否 | 旧组织编码 示例：assd |
| enableStatus | string | 否 | 状态 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
		{
			"mobile": "13566667777",
			"email": "123344@qq.com",
			"authOpt": "1",
			"orgCode": "awss",
			"errMsg": "aass",
			"oldOrgCode": "assd",
			"enableStatus": "1"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	修改权限时，每批次的大小不能超过100条数据	系统错误


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

