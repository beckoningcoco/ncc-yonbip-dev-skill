---
title: "存货产品入库分配清单查询"
apiId: "2153393566137188354"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Finished Goods Receipt Cost Allocation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Finished Goods Receipt Cost Allocation]
platform_version: "BIP"
source_type: community-api-docs
---

# 存货产品入库分配清单查询

> `ContentType	application/json` 请求方式	POST | 分类: Finished Goods Receipt Cost Allocation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fieia/queryProductAllocList

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
| accpurpose | number |
| 小数位数:0,最大长度:32 | 否 | 是 | 核算目的 |
| accentity | string | 否 | 是 | 会计主体 |
| accbook | string | 否 | 是 | 账簿 |
| periodCode | string | 否 | 是 | 会计期间 |
| allocDimension | string | 否 | 是 | 存货对象分配维度 示例：物料分类："1";存货对象："3";物料："2" |

## 3. 请求示例

Url: /yonbip/fi/fieia/queryProductAllocList?access_token=访问令牌
Body: {
	"accpurpose": 0,
	"accentity": "",
	"accbook": "",
	"periodCode": "",
	"allocDimension": "物料分类：\"1\";存货对象：\"3\";物料：\"2\""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| accpurpose | number |
| 小数位数:0,最大长度:32 | 否 | 核算目的 |
| accentity | string | 否 | 会计主体 |
| accbook | string | 否 | 账簿 |
| periodCode | string | 否 | 期间 |
| materialId | string | 否 | 物料id |
| materialClass | string | 否 | 物料分类 |
| num | number |
| 小数位数:2,最大长度:32 | 否 | 数量 |
| accbookCurrtypeId | string | 否 | 币种id |
| accbookAmount | number |
| 小数位数:8,最大长度:32 | 否 | 金额 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"accpurpose": 0,
		"accentity": "",
		"accbook": "",
		"periodCode": "",
		"materialId": "",
		"materialClass": "",
		"num": 0,
		"accbookCurrtypeId": "",
		"accbookAmount": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	调用接口成功

999	服务异常，参数缺失	调用接口失败


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

