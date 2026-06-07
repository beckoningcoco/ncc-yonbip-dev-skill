---
title: "抵扣统计表查询"
apiId: "2205483728271572998"
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

# 抵扣统计表查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/deduction/statistics

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
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：1234567 |
| peroid | string | 否 | 是 | 税款所属期 示例：202501 |
| deductionType | string | 否 | 是 | 抵扣类型 1：客运服务抵扣统计表 2：路桥费抵扣统计表 示例：2 |
| projectCode | string | 否 | 否 | 项目编码 示例：1234 |
| projectId | string | 否 | 否 | 项目ID 示例：1234 |
| orgId | string | 否 | 否 | 业务单元ID 示例：123 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/deduction/statistics?access_token=访问令牌
Body: {
	"nsrsbh": "1234567",
	"peroid": "202501",
	"deductionType": "2",
	"projectCode": "1234",
	"projectId": "1234",
	"orgId": "123"
}

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
| message | string | 否 | 消息 示例：查询成功 |
| data | object | 否 | 数据 |
| nsrsbh | string | 否 | 纳税人识别号 示例：12345 |
| period | string | 否 | 税款所属期 示例：202501 |
| deductionType | string | 否 | 抵扣类型 示例：1 |
| entrys | object | 否 | 抵扣明细 示例：[{1:1,2:2},{3:3}] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"nsrsbh": "12345",
		"period": "202501",
		"deductionType": "1",
		"entrys": [
			{
				"1": 1,
				"2": 2
			},
			{
				"3": 3
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	系统异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-21

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

