---
title: "账簿批量保存/启用/停用/删除"
apiId: "2044368973823737863"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Book"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Book]
platform_version: "BIP"
source_type: community-api-docs
---

# 账簿批量保存/启用/停用/删除

> `ContentType	application/json` 请求方式	POST | 分类: Account Book (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/accountBook/openapi

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| enableModelParam | object | 否 | 否 | 账簿启停用信息 |
| accountBookIds | string | 是 | 否 | 账簿id |
| sonModels | string | 是 | 否 | 启用模块编码，GL 总账 AR 应收管理 AP 应付管理 FA 固定资产 IA 存货核算 CC 成本中心 PCM 产品成本 RA 责任会计 SC 专项成本 CE 成本估算 RVN 收入管理 IS 内部结算 PRC 项目成本 |
| enabled | boolean | 否 | 否 | true 启用，false 停用 |
| addAccountBooks | object | 是 | 否 | 新增账簿 |
| code | string | 否 | 否 | 编码 |
| name | string | 否 | 否 | 名称，多语传map |
| shortname | string | 否 | 否 | 简称，多语传map |
| accpurpose | string | 否 | 否 | 核算目的 |
| controlscope | string | 否 | 否 | 管控范围 |
| accentity | string | 否 | 否 | 会计主体 |
| accountbooktype | string | 否 | 否 | 账簿类型 |
| accountingclassifi | string | 否 | 否 | 账簿分类,1 主账簿，2 报告账簿 |
| description | string | 否 | 否 | 描述 |
| sortnum | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 排序码 |
| accsubjectchart | string | 否 | 否 | 科目表 |
| currency | string | 否 | 否 | 本位币 |
| accperiodscheme | string | 否 | 否 | 会计期间方案 |
| ratetype | string | 否 | 否 | 汇率类型 |
| profitlossratetype | string | 否 | 否 | 汇兑损益汇率类型 |
| accstandard | string | 否 | 否 | 会计准则 |
| cashflowtype | string | 否 | 否 | 现金流量类型 |
| currencyreducedparam | string | 否 | 否 | 币种折算参数 |
| exchangeratescheme | string | 否 | 否 | 默认汇率方案 |
| accountBookGL | object | 否 | 否 | 总账 |
| accountBookAR | object | 否 | 否 | 应收管理 |
| accountBookAP | object | 否 | 否 | 应付管理 |
| accountBookFA | object | 否 | 否 | 固定资产 |
| accountBookIA | object | 否 | 否 | 存货核算 |
| accountBookCC | object | 否 | 否 | 成本中心 |
| accountBookPCM | object | 否 | 否 | 产品成本 |
| accountBookRA | object | 否 | 否 | 责任会计 |
| accountBookSC | object | 否 | 否 | 专项成本 |
| accountBookCE | object | 否 | 否 | 成本估算 |
| accountBookRVN | object | 否 | 否 | 收入管理 |
| accountBookIS | object | 否 | 否 | 内部结算 |
| accountBookPRC | object | 否 | 否 | 项目成本 |
| updateAccountBooks | object | 是 | 否 | 更新账簿 |
| id | string | 否 | 否 | id |
| code | string | 否 | 否 | 编码 |
| name | string | 否 | 否 | 名称，多语传map |
| shortname | string | 否 | 否 | 简称，多语传map |
| accpurpose | string | 否 | 否 | 核算目的 |
| controlscope | string | 否 | 否 | 管控范围 |
| accentity | string | 否 | 否 | 会计主体 |
| accountbooktype | string | 否 | 否 | 账簿类型 |
| accountingclassifi | string | 否 | 否 | 账簿分类,1 主账簿，2 报告账簿 |
| description | string | 否 | 否 | 描述 |
| sortnum | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 排序码 |
| accsubjectchart | string | 否 | 否 | 科目表 |
| currency | string | 否 | 否 | 本位币 |
| accperiodscheme | string | 否 | 否 | 会计期间方案 |
| ratetype | string | 否 | 否 | 汇率类型 |
| profitlossratetype | string | 否 | 否 | 汇兑损益汇率类型 |
| accstandard | string | 否 | 否 | 会计准则 |
| cashflowtype | string | 否 | 否 | 现金流量类型 |
| currencyreducedparam | string | 否 | 否 | 币种折算参数 |
| exchangeratescheme | string | 否 | 否 | 默认汇率方案 |
| accountBookGL | object | 否 | 否 | 总账 |
| accountBookAR | object | 否 | 否 | 应收管理 |
| accountBookAP | object | 否 | 否 | 应付管理 |
| accountBookFA | object | 否 | 否 | 固定资产 |
| accountBookIA | object | 否 | 否 | 存货核算 |
| accountBookCC | object | 否 | 否 | 成本中心 |
| accountBookPCM | object | 否 | 否 | 产品成本 |
| accountBookRA | object | 否 | 否 | 责任会计 |
| accountBookSC | object | 否 | 否 | 专项成本 |
| accountBookCE | object | 否 | 否 | 成本估算 |
| accountBookRVN | object | 否 | 否 | 收入管理 |
| accountBookIS | object | 否 | 否 | 内部结算 |
| accountBookPRC | object | 否 | 否 | 项目成本 |
| deleteIds | string | 是 | 否 | id集合 |

## 3. 请求示例

Url: /yonbip/AMP/accountBook/openapi?access_token=访问令牌
Body: {
	"enableModelParam": {
		"accountBookIds": [
			""
		],
		"sonModels": [
			""
		],
		"enabled": true
	},
	"addAccountBooks": [
		{
			"code": "",
			"name": "",
			"shortname": "",
			"accpurpose": "",
			"controlscope": "",
			"accentity": "",
			"accountbooktype": "",
			"accountingclassifi": "",
			"description": "",
			"sortnum": 0,
			"accsubjectchart": "",
			"currency": "",
			"accperiodscheme": "",
			"ratetype": "",
			"profitlossratetype": "",
			"accstandard": "",
			"cashflowtype": "",
			"currencyreducedparam": "",
			"exchangeratescheme": "",
			"accountBookGL": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookAR": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookAP": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookFA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookIA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookCC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookPCM": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookRA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookSC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookCE": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookRVN": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookIS": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookPRC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			}
		}
	],
	"updateAccountBooks": [
		{
			"id": "",
			"code": "",
			"name": "",
			"shortname": "",
			"accpurpose": "",
			"controlscope": "",
			"accentity": "",
			"accountbooktype": "",
			"accountingclassifi": "",
			"description": "",
			"sortnum": 0,
			"accsubjectchart": "",
			"currency": "",
			"accperiodscheme": "",
			"ratetype": "",
			"profitlossratetype": "",
			"accstandard": "",
			"cashflowtype": "",
			"currencyreducedparam": "",
			"exchangeratescheme": "",
			"accountBookGL": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookAR": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookAP": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookFA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookIA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookCC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookPCM": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookRA": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookSC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookCE": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookRVN": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookIS": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			},
			"accountBookPRC": {
				"startperiodid": "",
				"startperiod": "",
				"enabled": ""
			}
		}
	],
	"deleteIds": [
		""
	]
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
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| data | object | 否 | data |
| resultCode | string | 否 | resultCode 示例：200 |
| message | string | 否 | 提示信息 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"data": {
			"enableModelParam": {
				"accountBookIds": {},
				"sonModels": {},
				"enabled": true
			},
			"addAccountBooks": [
				{
					"id": "",
					"code": "",
					"name": "",
					"shortname": "",
					"accpurpose": "",
					"controlscope": "",
					"accentity": "",
					"accountbooktype": "",
					"accountingclassifi": "",
					"description": "",
					"sortnum": 0,
					"accsubjectchart": "",
					"currency": "",
					"accperiodscheme": "",
					"ratetype": "",
					"profitlossratetype": "",
					"accstandard": "",
					"cashflowtype": "",
					"currencyreducedparam": "",
					"exchangeratescheme": "",
					"accountBookGL": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookAR": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookAP": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookFA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookIA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookCC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookPCM": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookRA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookSC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookCE": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookRVN": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookIS": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookPRC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					}
				}
			],
			"updateAccountBooks": [
				{
					"id": "",
					"code": "",
					"name": "",
					"shortname": "",
					"accpurpose": "",
					"controlscope": "",
					"accentity": "",
					"accountbooktype": "",
					"accountingclassifi": "",
					"description": "",
					"sortnum": 0,
					"accsubjectchart": "",
					"currency": "",
					"accperiodscheme": "",
					"ratetype": "",
					"profitlossratetype": "",
					"accstandard": "",
					"cashflowtype": "",
					"currencyreducedparam": "",
					"exchangeratescheme": "",
					"accountBookGL": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookAR": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookAP": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookFA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookIA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookCC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookPCM": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookRA": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookSC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookCE": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookRVN": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookIS": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					},
					"accountBookPRC": {
						"startperiodid": "",
						"startperiod": "",
						"enabled": ""
					}
				}
			],
			"deleteIds": {}
		},
		"resultCode": "200"
	},
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

更新

请求说明

新增

请求参数 sortnum

新增

请求参数 sortnum

更新

请求参数 (148)

新增

返回参数 sortnum

新增

返回参数 sortnum

更新

返回参数 (117)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

