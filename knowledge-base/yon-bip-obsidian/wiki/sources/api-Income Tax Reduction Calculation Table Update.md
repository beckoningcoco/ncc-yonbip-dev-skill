---
title: "所得税减免计算表更新"
apiId: "2080021342752079878"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Income tax reduction calculation sheet"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Income tax reduction calculation sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 所得税减免计算表更新

> `ContentType	application/json` 请求方式	POST | 分类: Income tax reduction calculation sheet (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/tax-preferential-policies/batch-update

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
| data | object | 是 | 否 | data |
| id | string | 否 | 是 | 数据唯一标识，具有唯一性，调用新增接口成功后返回的id 示例：2066057235821232136 |
| orgCode | string | 否 | 否 | 组织编码 示例：123400004854555888 |
| period | string | 否 | 否 | 所属期，yyyy-MM格式，可选；当subject="从事国家重点扶持的公共基础设施项目（除农村饮水工程）投资经营的所得定期减免企业所得税"、 "设在西部地区的鼓励类产业企业减按 15%的税率征收企业所得税"、"国家需要重点扶持的高新技术企业减按 15%的税率征收企业所得税"、"符合条件的小型微利企业减免企业所得税"时，所属期可选，即使传值也会被忽略； 当subject不等于上述4个项目名称时，所属期必填 示例：2024-05 |
| type | string | 否 | 否 | 减免分类（1-不征税收入；2-免税收入；3-减计收入；4-所得减免；5-减免所得税优惠；6-民族自治地方减免；7-抵免所得税额） 示例：1 |
| subject | string | 否 | 否 | 项目名称 见开放平台接口信息补充描述-企业所得税管理fapiao.yonyoucloud.com/apidoc/appendix/ 示例：101 |
| reductionDegree | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 减征幅度%（范围是0-100，不包含边界；只有项目名称为减征时必填，其余时不能填） 示例：20 |
| propertyCode | string | 否 | 否 | 减免性质代码（propertyCode和reductionCode只需填写其中一个，若同时填写，以propertyCode为准） 示例：04012704 |
| reductionCode | string | 否 | 否 | 减免性质代码及名称（propertyCode和reductionCode只需填写其中一个，若同时填写，以propertyCode为准） 示例：MSSR021|一般股息红利等权益性投资收益免征企业所得税 |
| enjoymentPeriodStart | string | 否 | 否 | 享受期起 yyyy-MM格式，如 2024-08 可选，在subject项目名称等于某些项目时必填，其他情况下可选 示例：2024-08 |
| enjoymentPeriodEnd | string | 否 | 否 | 享受期止 yyyy-MM格式，如2024-10 可选 示例：2024-10 |
| reductionMoney | number |
| 小数位数:2,最大长度:18 | 否 | 否 | 减免收入/所得金额，在subject等于某些项目名称下，减免收入/所得金额和减免所得税额二者至少一个必填，当subject不等于某些项目名称下，减免收入/所得金额和减免所得税全部为空 示例：123 |
| incomeTaxMoney | string | 否 | 否 | 所得税额，在subject等于某些项目名称下，减免收入/所得金额和减免所得税额二者至少一个必填，当subject不等于某些项目名称下，减免收入/所得金额和减免所得税全部为空 示例：10 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/tax-preferential-policies/batch-update?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2066057235821232136",
			"orgCode": "123400004854555888",
			"period": "2024-05",
			"type": "1",
			"subject": "101",
			"reductionDegree": 20,
			"propertyCode": "04012704",
			"reductionCode": "MSSR021|一般股息红利等权益性投资收益免征企业所得税",
			"enjoymentPeriodStart": "2024-08",
			"enjoymentPeriodEnd": "2024-10",
			"reductionMoney": 123,
			"incomeTaxMoney": "10"
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
				"message": "数据唯一标识sourceUnique不能为空"
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

1	2025-12-09

更新

请求参数 type

减免分类增加"抵免所得税额"

2	2025-10-10

更新

请求说明

新增

请求参数 orgCode

新增

请求参数 propertyCode

更新

请求参数 reductionCode

删除

请求参数 nsrsbh

新增字段：减免性质代码

3	2025-09-28

新增

请求参数 orgCode

删除

请求参数 nsrsbh

主组织变为税务组织，因此接口入参由纳税人识别号改为组织编码


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

