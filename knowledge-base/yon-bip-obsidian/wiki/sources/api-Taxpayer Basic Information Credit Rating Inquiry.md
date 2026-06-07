---
title: "纳税人基本信息信用评级查询"
apiId: "2158017931642404871"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Common Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 纳税人基本信息信用评级查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Common Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/api/taxBaseArch/getEval

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
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：91110000600001760P |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/api/taxBaseArch/getEval?access_token=访问令牌
Body: [{
	"nsrsbh": "91110000600001760P"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应编码 示例：200 |
| datas | object | 是 | 信用评级对象 |
| nsrsbh | string | 否 | 纳税人识别号 示例：91110000600001760P |
| nsrmc | string | 否 | 纳税人名称 示例：用友网络科技有限公司 |
| evaluationYear | number |
| 小数位数:0,最大长度:4 | 否 | 评价年度 示例：2024 |
| creditRating | string | 否 | 信用级别 示例：A |
| systemScore | number |
| 小数位数:1,最大长度:4 | 否 | 系统得分 示例：99.9 |
| message | string | 否 | 消息 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"datas": [
		{
			"nsrsbh": "91110000600001760P",
			"nsrmc": "用友网络科技有限公司",
			"evaluationYear": 2024,
			"creditRating": "A",
			"systemScore": 99.9
		}
	],
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	纳税人识别号不存在	纳税人识别号不存在


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

