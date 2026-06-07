---
title: "每日头寸余额查询"
apiId: "1608752834941026312"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Account Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Account Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 每日头寸余额查询

> `ContentType	application/json` 请求方式	POST | 分类: Internal Account Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/queryBalance

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 会计主体不可为空 示例：1572343332030906370 |
| endDate | Date | 否 | 是 | 结束日期不可为空 示例：2022-12-08 |
| code | string | 否 | 否 | 内部账户编码 示例：INT0000000716000012 |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/queryBalance?access_token=访问令牌
Body: {
	"accentity": "1572343332030906370",
	"endDate": "2022-12-08",
	"code": "INT0000000716000012"
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
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 是 | data |
| balanceAmount | double | 否 | balanceAmount 示例：1109930.52 |
| accentity | string | 否 | accentity 示例：1570888059691466756 |
| accentityName | string | 否 | accentityName 示例：快乐柠檬第一个分公司 |
| traceId | string | 否 | traceId 示例：85e96d17d2ba5f4a |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"balanceAmount": 1109930.52,
			"accentity": "1570888059691466756",
			"accentityName": "快乐柠檬第一个分公司"
		}
	],
	"traceId": "85e96d17d2ba5f4a"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	参数为空

10000002	会计主体参数为空

10000003	会计主体不存在

10000004	结束日期参数为空

10000005	会计主体下不存在内部账户


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

