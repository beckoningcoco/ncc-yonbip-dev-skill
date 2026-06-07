---
title: "抵扣勾选明细查询"
apiId: "1760039501722288128"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 抵扣勾选明细查询

> `ContentType` 请求方式	GET | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/vat/qrrz-detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| nsrsbh | string | query | 是 | 纳税人识别号    示例: 12341234123432 |
| month | string | query | 是 | 月份（yyyyMM）    示例: 202301 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/vat/qrrz-detail?access_token=访问令牌&nsrsbh=12341234123432&month=202301

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
| data | object | 是 | 数据 |
| fpDm | string | 否 | 发票代码 示例：1100164160 |
| fpHm | string | 否 | 发票号码 示例：00461160 |
| fplx | string | 否 | 发票类型 4：增值税专用发票，6：货运专用发票，5：机动车发票 示例：4 |
| fpzt | long | 否 | 发票状态 0：正常，1：失控，2：作废，3：红冲，4：异常 示例：0 |
| gmfNsrsbh | string | 否 | 购买方纳税人识别号 示例：91110108801489416U |
| hjje | BigDecimal | 否 | 合计金额 示例：1883.5 |
| hjse | BigDecimal | 否 | 合计税额 示例：56.5 |
| kprq | string | 否 | 开票日期 yyyy-MM-dd 示例：2020-01-10 |
| period | string | 否 | 税期 yyyyMM 示例：202004 |
| usage | string | 否 | 发票用途 1.抵扣 2.不抵扣 示例：1 |
| verifyStatus | long | 否 | 认证状态 2：未勾选，3：已勾选未认证，4：已认证 示例：4 |
| verifyTime | string | 否 | 认证时间 yyyy-MM-dd 示例：2020-04-27 |
| verifyType | long | 否 | 认证类型 1：勾选 0：扫描 示例：1 |
| xsfMc | string | 否 | 销售方名称 示例：北京东城税务局第一税务所 |
| xsfNsrsbh | string | 否 | 销售方纳税人识别号 示例：11010100DK01021 |
| yxse | BigDecimal | 否 | 有效税额 示例：56.5 |
| message | string | 否 | 消息 示例：SUCCESS |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"fpDm": "1100164160",
			"fpHm": "00461160",
			"fplx": "4",
			"fpzt": 0,
			"gmfNsrsbh": "91110108801489416U",
			"hjje": 1883.5,
			"hjse": 56.5,
			"kprq": "2020-01-10",
			"period": "202004",
			"usage": "1",
			"verifyStatus": 4,
			"verifyTime": "2020-04-27",
			"verifyType": 1,
			"xsfMc": "北京东城税务局第一税务所",
			"xsfNsrsbh": "11010100DK01021",
			"yxse": 56.5
		}
	],
	"message": "SUCCESS"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-23

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

