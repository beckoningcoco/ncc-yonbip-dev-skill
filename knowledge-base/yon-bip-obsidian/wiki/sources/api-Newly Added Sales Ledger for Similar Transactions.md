---
title: "视同销售台账新增"
apiId: "2079896599705681920"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Deemed sales account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Deemed sales account]
platform_version: "BIP"
source_type: community-api-docs
---

# 视同销售台账新增

> `ContentType	application/json` 请求方式	POST | 分类: Deemed sales account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/tax-deem-sale/batch-save

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
| data | object | 是 | 否 | 是一个数组 |
| sourceUnique | string | 否 | 是 | 数据唯一标识，不能为空，同一批次里的数据不可重复 示例：B204B87B-8542-09CA-7003-D58BBDF159BF |
| orgCode | string | 否 | 是 | 组织编码 示例：0706 |
| projectCode | string | 否 | 否 | 项目编码 示例：*****999B- |
| saleType | string | 否 | 是 | 视同销售类型 1 非货币性资产交换 2 用于市场推广或销售 3 用于交际应酬 4 用于职工奖励或福利 5 用于股息分配 6 用于对外捐赠 7 用于对外投资项目 8 提供劳务视同销售 9 其他 示例：6 |
| busCode | string | 否 | 是 | 业务编码 示例：20240818002 |
| busName | string | 否 | 是 | 业务名称 示例：捐款 |
| busTime | string | 否 | 是 | 发生时间，yyyy-MM-dd格式 示例：2024-08-11 |
| saleIncome | number |
| 小数位数:2,最大长度:18 | 否 | 否 | 视同销售收入，视同销售收入]和视同销售成本不能同时为零 示例：120 |
| saleCost | number |
| 小数位数:2,最大长度:18 | 否 | 否 | 视同销售成本，视同销售收入]和视同销售成本不能同时为零 示例：21 |
| inOrOut | string | 否 | 否 | inner自产/outer外购 示例：inner |
| vnote | string | 否 | 否 | 备注，不能超过500个字符 示例：捐款2 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/tax-deem-sale/batch-save?access_token=访问令牌
Body: {
	"data": [
		{
			"sourceUnique": "B204B87B-8542-09CA-7003-D58BBDF159BF",
			"orgCode": "0706",
			"projectCode": "*****999B-",
			"saleType": "6",
			"busCode": "20240818002",
			"busName": "捐款",
			"busTime": "2024-08-11",
			"saleIncome": 120,
			"saleCost": 21,
			"inOrOut": "inner",
			"vnote": "捐款2"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 否 | 返回对象 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：1 |
| infos | object | 是 | 成功数据 |
| messages | object | 是 | 失败数据 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"infos": [
			{
				"sourceUnique": "1",
				"id": "1"
			}
		],
		"messages": [
			{
				"sourceUnique": "1",
				"message": "依据组织编码【1】查询组织为空"
			}
		]
	},
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-10

更新

请求说明

更新

请求参数 orgCode

更新

请求参数 saleType


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

