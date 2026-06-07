---
title: "成本收集器新增/保存"
apiId: "2501579907504537607"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financials Foundation"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financials Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本收集器新增/保存

> `ContentType	application/json` 请求方式	POST | 分类: Financials Foundation (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/AMP/FP/iuap-apdoc-finbd/costcollectoritem/bill/save

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
| billnum | string | 否 | 是 | 单据编码 示例：bd_costcollectoritem01card 默认值：bd_costcollectoritem01card |
| data | object | 否 | 是 | 数据信息 |
| id | string | 否 | 否 | id 示例：2501032659959939076 |
| accentity | string | 否 | 是 | 业务单元 示例：1525652227072458756 |
| accentity_name | string | 否 | 否 | 业务单元名称 示例：收入中台演示销售组织1 |
| code | string | 否 | 是 | 编码 示例：1001 |
| name | object | 否 | 是 | 名称 |
| department | string | 否 | 否 | 部门 示例：1572400755637223425 |
| department_name | string | 否 | 否 | 部门名称 示例：收付总公司部门2 |
| product | string | 否 | 否 | 产品 示例：2450390769306959883 |
| product_name | string | 否 | 否 | 产品名称 示例：LZC-主产品批次 |
| costClass | string | 否 | 否 | 成本类别 示例：1565558700959072259 |
| costClass_name | string | 否 | 否 | 成本类别名称 示例：物料成本分类 |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 启用状态 示例：1 |
| _status | string | 否 | 是 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/FCC/AMP/FP/iuap-apdoc-finbd/costcollectoritem/bill/save?access_token=访问令牌
Body: {
	"billnum": "bd_costcollectoritem01card",
	"data": {
		"id": "2501032659959939076",
		"accentity": "1525652227072458756",
		"accentity_name": "收入中台演示销售组织1",
		"code": "1001",
		"name": {
			"zh_CN": "测试1001"
		},
		"department": "1572400755637223425",
		"department_name": "收付总公司部门2",
		"product": "2450390769306959883",
		"product_name": "LZC-主产品批次",
		"costClass": "1565558700959072259",
		"costClass_name": "物料成本分类",
		"enable": 1,
		"_status": "Insert"
	}
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
| traceId | string | 否 | traceId 示例：96af86dd25ed14b3 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"traceId": "96af86dd25ed14b3",
		"uploadable": "0"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

