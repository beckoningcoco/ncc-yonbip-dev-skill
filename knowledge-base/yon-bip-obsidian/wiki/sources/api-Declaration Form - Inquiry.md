---
title: "申报表-查询"
apiId: "2206179787856150532"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Return"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 申报表-查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Return (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/declareDraft/query

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
| orgCode | string | 是 | 是 | 组织编码 示例：["123"] |
| declareStart | string | 否 | 否 | 税款所属期起 示例：2024-10-01 |
| declareEnd | string | 否 | 否 | 税款所属期止 示例：2024-10-31 |
| taxTypeList | number |
| 小数位数:0,最大长度:2 | 是 | 否 | 申报内容参考：https://docs.yonyoucloud.com/l/0A8C426B2d7e 【友空间云文档】税种枚举.docx 示例：[1,2] |
| state | number |
| 小数位数:0,最大长度:2 | 是 | 否 | 状态: 1-保存,2-审批中,3-审批通过,4-审批不通过 示例：[1] |
| pageIndex | number |
| 小数位数:-1,最大长度:4 | 否 | 是 | 页数 示例：1 |
| pageSize | number |
| 小数位数:-1,最大长度:4 | 否 | 是 | 每页数量（大于0小于1000） 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/declareDraft/query?access_token=访问令牌
Body: {
	"orgCode": [
		"123"
	],
	"declareStart": "2024-10-01",
	"declareEnd": "2024-10-31",
	"taxTypeList": [
		1,
		2
	],
	"state": [
		1
	],
	"pageIndex": 1,
	"pageSize": 1
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
| message | string | 否 | 提示信息 示例：操作成功 |
| datas | object | 是 | 缴款单数据 |
| draftList | object | 是 | 申报表数据 |
| pageIndex | number |
| 小数位数:-1,最大长度:4 | 否 | 页数 示例：1 |
| pageSize | number |
| 小数位数:-1,最大长度:4 | 否 | 每页数量 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"datas": [
		{
			"draftList": [
				{
					"draftId": "123",
					"orgCode": "123",
					"nsrmc": "测试",
					"nsrsbh": "123",
					"taxType": "增值税",
					"declareCycle": "月",
					"declareStart": "2025-01-01",
					"declareEnd": "2025-01-31",
					"reportType": "新产生的申报表",
					"zeroDeclareFlag": "零申报",
					"creditPayable": 100.1,
					"area": "北京",
					"mainTaxOfficeName": "北京",
					"state": "保存",
					"projectName": "测试",
					"taxMethod": "一般计税"
				}
			],
			"pageIndex": 1,
			"pageSize": 1
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	错误提示信息	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-22

更新

请求说明

1


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

