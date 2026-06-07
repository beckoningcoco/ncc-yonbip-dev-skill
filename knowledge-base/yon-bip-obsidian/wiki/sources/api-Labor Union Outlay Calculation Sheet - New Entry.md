---
title: "工会经费计算表-新增"
apiId: "1898202749895442441"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Trade union funds calculation sheet"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Trade union funds calculation sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 工会经费计算表-新增

> `ContentType	application/json` 请求方式	POST | 分类: Trade union funds calculation sheet (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/tradeunionfundledger/add

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
| orgCode | string | 否 | 是 | 组织编码 示例：rzs2 |
| collectionProject | string | 否 | 否 | 征收项目 示例：其他收入 |
| collectionItem | string | 否 | 否 | 征收品目 示例：工会经费 |
| taxRate | number |
| 小数位数:4,最大长度:13 | 否 | 否 | 税（费）率 示例：0.02 |
| totalWages | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 企业职工工资总额 示例：1200.00 |
| taxPeriodStart | string | 否 | 是 | 税（费）款所属期起yyyy-MM-dd 示例：2023-10-01 |
| taxPeriodEnd | string | 否 | 是 | 税（费）款所属期止yyyy-MM-dd 示例：2023-10-30 |
| taxOffice | string | 否 | 否 | 主管税务机关 示例：国家税务总局绥中县税务局前所税务分局办税厅 |
| sourceId | string | 否 | 是 | 来源ID 示例：2 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/tradeunionfundledger/add?access_token=访问令牌
Body: [{
	"orgCode": "rzs2",
	"collectionProject": "其他收入",
	"collectionItem": "工会经费",
	"taxRate": 0.02,
	"totalWages": 1200,
	"taxPeriodStart": "2023-10-01",
	"taxPeriodEnd": "2023-10-30",
	"taxOffice": "国家税务总局绥中县税务局前所税务分局办税厅",
	"sourceId": "2"
}]

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
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-19

更新

请求参数 collectionProject

征收项目改为非必填


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

