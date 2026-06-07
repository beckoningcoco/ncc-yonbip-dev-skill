---
title: "智能收单同步组织信息"
apiId: "1442566385350737920"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单同步组织信息

> `ContentType	application/json` 请求方式	POST | 分类: Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/appDevice/v1/taxpayerOrgs

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
| deviceCode | string | 否 | 是 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001 |
| manufacturer | string | 否 | 是 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/taxpayerOrgs?access_token=访问令牌
Body: {
	"deviceCode": "yonyou00001",
	"manufacturer": "yonyou"
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
| data | object | 是 | 返回数据 |
| orgCode | string | 否 | 业务单元code：同一租户内唯一 示例：taxPayerOrg1 |
| orgName | string | 否 | 业务单元名称 示例：税务组织1 |
| authBeginDate | string | 否 | 业务单元授权有效开始时间 示例：2022-04-01 |
| authEndDate | string | 否 | 业务单元授权有效结束日期 示例：2023-03-31 |
| yTenantId | string | 否 | 友户通租户id 示例：0000KR63PRZP59AUWY0000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"orgCode": "taxPayerOrg1",
			"orgName": "税务组织1",
			"authBeginDate": "2022-04-01",
			"authEndDate": "2023-03-31",
			"yTenantId": "0000KR63PRZP59AUWY0000"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023060400031	同步组织信息失败	联系开发解决


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

