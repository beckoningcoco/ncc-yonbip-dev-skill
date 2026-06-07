---
title: "消费税产品明细表"
apiId: "1760198965286404131"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 消费税产品明细表

> `ContentType	application/json` 请求方式	POST | 分类: Consumption Tax Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/tax/product/detail

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
| orgids | string | 是 | 是 | 会计主体id 示例：[1111] |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/tax/product/detail?access_token=访问令牌
Body: {
	"orgids": [
		1111
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| datas | object | 是 | 产品信息 |
| categCode | string | 否 | 应税消费品类别编码 示例：CATE202203140009 |
| categName | string | 否 | 应税消费品类别名称 示例：酒 |
| taxCalculationMethod | string | 否 | 计税方式 示例：6 |
| taxCalculationMethodName | string | 否 | 计税方式 示例：从价定率 |
| ratioRate | BigDecimal | 否 | 比例税率 示例：0 |
| quotaRate | BigDecimal | 否 | 定额税率 示例：0 |
| calcCode | string | 否 | 计量单位编码 示例：CALC202203140005 |
| calcName | string | 否 | 计量单位名称 示例：吨 |
| goodsTaxCode | string | 否 | 应税消费品编码 示例：TAXCG202203140011 |
| goodsTaxName | string | 否 | 应税消费品名称 示例：黄酒 |
| bpreTax | string | 否 | 是否准予税前扣除(N否，Y是) 示例：Y |
| bpreTaxName | string | 否 | 是否准予税前扣除 示例：是 |
| productDetailResp | object | 是 | 商品信息详情 |
| msg | string | 否 | 响应信息 示例：操作成功 |
| code | string | 否 | 响应编码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"datas": [
			{
				"categCode": "CATE202203140009",
				"categName": "酒",
				"taxCalculationMethod": "6",
				"taxCalculationMethodName": "从价定率",
				"ratioRate": 0,
				"quotaRate": 0,
				"calcCode": "CALC202203140005",
				"calcName": "吨",
				"goodsTaxCode": "TAXCG202203140011",
				"goodsTaxName": "黄酒",
				"bpreTax": "Y",
				"bpreTaxName": "是",
				"productDetailResp": [
					{
						"orgid": 11111,
						"productCode": "jiumian",
						"productName": "酒免",
						"benable": "Y",
						"benableName": "是",
						"tax": "1",
						"taxName": "增值税",
						"completePolicy": "0006064016|SXA031901158|充填开采置换出来的煤炭减征资源税|《财政部 税务总局关于继续执行的资源税优惠政策的公告》 财政部 税务总局公告2020年第32号第四条,",
						"reliefProductName": "123123"
					}
				]
			}
		],
		"msg": "操作成功",
		"code": "0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体返回信息调整数据


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

