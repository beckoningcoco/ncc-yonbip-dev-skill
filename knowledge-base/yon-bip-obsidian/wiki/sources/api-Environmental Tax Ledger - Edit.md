---
title: "环保税台账-编辑"
apiId: "2250589706720378881"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Property Behavior Tax Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Property Behavior Tax Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 环保税台账-编辑

> `ContentType	application/json` 请求方式	POST | 分类: Property Behavior Tax Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/ept/collection/edit

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
| baseId | number |
| 小数位数:0,最大长度:22 | 否 | 否 | 税源明细ID，可通过环保税税源查询接口获 示例：125298465781527333 |
| busiId | string | 否 | 否 | 税源明细来源ID，通过环保税税源查询接口获取，与baseId二者必传其中之一 示例：f2324467d33e4c4bb2b623f04052f311 |
| sourceId | string | 否 | 是 | 台账来源ID 示例：2252984657815273480 |
| sourceCode | string | 否 | 否 | 台账来源编号 示例：e0224467d33e4c4bb2b623f04052f311 |
| period | string | 否 | 是 | 税款所属期 示例：2025-04-01 |
| taxSubheadingCode | string | 否 | 否 | 征收子目编码 示例：HB04300383100101 |
| emissions | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 排放量，按期针对大气和水 示例：4.55 |
| actualDensity | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 实际浓度值，按期针对大气和水 示例：3.8 |
| monthDensity | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 月均浓度，按期针对大气和水 示例：2.9 |
| highestDensity | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 最高浓度，按期针对大气和水 示例：3.95 |
| calculationBase | number |
| 小数位数:8,最大长度:21 | 否 | 否 | 计算基数，按期针对大气和水，排污系数计算方式 示例：6.888 |
| pollutantsEmissions | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 污染排放量 示例：5.66 |
| taxBasis | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 计税依据（或污染当量数） 示例：9.08 |
| monthlyReportAcquired | string | 否 | 否 | 是否取得当月监测机构监测报告(Y:是；N:否) |
| featureIndexValue | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 特征指标数量 示例：567.88 |
| unit | string | 否 | 否 | 特征单位 示例：吨 |
| chCoeff | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 特征系数 示例：3.45 |
| cTaxSubheadingCode | string | 否 | 否 | 特征指标编码 示例：HB04300383100201 |
| solidWasteProduction | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 本月固体废物的产生量（吨） 示例：5.99 |
| solidWasteStorage | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 本月固体废物的贮存量（吨） 示例：56.88 |
| solidWasteDispVol | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 本月固体废物的处置量（吨） 示例：34.99 |
| solidWasteCmphUltion | number |
| 小数位数:6,最大长度:19 | 否 | 否 | 本月固体废物的综合利用量（吨） 示例：32.12 |
| thirdPartyEvalAcquired | string | 否 | 否 | 是否取得第三方综合利用评价报告(Y:是；N:否) |
| noisePeriod | string | 否 | 否 | 噪声时段（昼间（代码：1）、夜间（代码：2）） 示例：1 |
| bMonitorDecibel | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 监测分贝数 示例：13 |
| bExcStanLessDays | string | 否 | 否 | 超标不足15天（是（代码：1）、否（代码：2）） 示例：1 |
| bMoreThanStan | string | 否 | 否 | 两处以上噪声超标（是（代码：Y）、否（代码：N）） 示例：N |
| autoMatch | string | 否 | 否 | 自动匹配减免政策(Y:是；N:否) |
| reduceCode | string | 否 | 否 | 减免税政策编码 示例：0016064001 |
| paidTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 已缴税额 示例：56743.88 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/ept/collection/edit?access_token=访问令牌
Body: [{
	"baseId": 125298465781527333,
	"busiId": "f2324467d33e4c4bb2b623f04052f311",
	"sourceId": "2252984657815273480",
	"sourceCode": "e0224467d33e4c4bb2b623f04052f311",
	"period": "2025-04-01",
	"taxSubheadingCode": "HB04300383100101",
	"emissions": 4.55,
	"actualDensity": 3.8,
	"monthDensity": 2.9,
	"highestDensity": 3.95,
	"calculationBase": 6.888,
	"pollutantsEmissions": 5.66,
	"taxBasis": 9.08,
	"monthlyReportAcquired": "",
	"featureIndexValue": 567.88,
	"unit": "吨",
	"chCoeff": 3.45,
	"cTaxSubheadingCode": "HB04300383100201",
	"solidWasteProduction": 5.99,
	"solidWasteStorage": 56.88,
	"solidWasteDispVol": 34.99,
	"solidWasteCmphUltion": 32.12,
	"thirdPartyEvalAcquired": "",
	"noisePeriod": "1",
	"bMonitorDecibel": 13,
	"bExcStanLessDays": "1",
	"bMoreThanStan": "N",
	"autoMatch": "",
	"reduceCode": "0016064001",
	"paidTax": 56743.88
}]

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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-15

新增

请求参数 monthlyReportAcquired

新增

请求参数 thirdPartyEvalAcquired

新增

请求参数 autoMatch

更新

请求参数 (4)

删除

请求参数 eable

2	2025-09-30

更新

请求说明

更新

请求参数 eable

删除

请求参数 pollutionCoefficient

删除

请求参数 dischargeCoefficient

3	2025-09-03

删除

请求参数 pollutionCoefficient

删除

请求参数 dischargeCoefficient

4	2025-05-23

更新

请求参数 (7)

5	2025-05-22

新增

请求参数 busiId

更新

请求参数 baseId

6	2025-05-13

删除

请求参数 exceedingDecibel

删除

请求参数 compreCoefExceNoise


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

