---
title: "导入建筑业项目涉税信息"
apiId: "1760130331709014019"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax-related items information of construction industry"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax-related items information of construction industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 导入建筑业项目涉税信息

> `ContentType	application/json` 请求方式	POST | 分类: Tax-related items information of construction industry (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/project/import

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
| orgCode | string | 否 | 是 | 税务组织编码 示例：ceshi |
| projectCode | string | 否 | 是 | 项目编号 示例：0099 |
| projectName | string | 否 | 是 | 项目名称 示例：项目名称 |
| taxMethod | string | 否 | 是 | 计税方式；1-一般计税，2-简易征收（老项目），3-简易征收（甲供材）、4-简易征收（其他） 示例：1 |
| accountOrgCode | string | 否 | 是 | 核算单位编码 示例：1 |
| taxRelatedType | string | 否 | 是 | 项目涉税类型；1-建筑服务，2-出租不动产，3-销售不动产 示例：1 |
| isFinish | string | 否 | 否 | 项目完工状态：0否，1-是 示例：0 |
| isCrossRegion | string | 否 | 是 | 是否跨区涉:0-否，1-是 示例：0 |
| taxOfficeName | string | 否 | 否 | 主管税务机关（是否跨区为否时，生效） 示例：123 |
| invoiceAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 期初已开票金额 示例：0.00 |
| contractCodes | object | 否 | 否 | 合同编号 |
| sourceId | string | 否 | 否 | 来源id，可以传自己系统的id（如果是自增id，可以传UUID） 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/project/import?access_token=访问令牌
Body: [{
	"orgCode": "ceshi",
	"projectCode": "0099",
	"projectName": "项目名称",
	"taxMethod": "1",
	"accountOrgCode": "1",
	"taxRelatedType": "1",
	"isFinish": "0",
	"isCrossRegion": "0",
	"taxOfficeName": "123",
	"invoiceAmount": 0,
	"contractCodes": {},
	"sourceId": "1"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应描述 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据具体返回信息调整数据

1001	参数异常	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

