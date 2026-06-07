---
title: "车辆税源信息-查询"
apiId: "2298379727092580360"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Vehicle tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 车辆税源信息-查询

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/vehicle/query/taxVehicleInfo

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
| taxVehicleInfoCode | string | 否 | 否 | 车辆税源编号 |
| sourceIdList | string | 是 | 是 | 来源ID 示例：["1","2"] 默认值：[1] |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/vehicle/query/taxVehicleInfo?access_token=访问令牌
Body: {
	"taxVehicleInfoCode": "",
	"sourceIdList": [
		"1",
		"2"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| id | string | 否 | id |
| code | string | 否 | 编码 |
| taxpayerId | string | 否 | 纳税主体ID |
| declarationMethod | string | 否 | 申报方式 |
| selfDeclare | string | 否 | 是否自主申报车船税 |
| vehicleRegistration | string | 否 | 是否办理车辆登记 |
| vehicleNum | string | 否 | 车辆号码 |
| vehicleIdentificationCode | string | 否 | 车辆识别代码(车架号) |
| vehicleCategory | string | 否 | 车辆大类 |
| vehicleType | string | 否 | 车辆类型 |
| vehicleBrand | string | 否 | 车辆品牌 |
| vehicleModel | string | 否 | 车辆型号(厂牌型号) |
| engineNum | string | 否 | 发动机编号 |
| licenseNum | string | 否 | 合格证编号 |
| vehicleRegistrationDate | string | 否 | 车辆登记注册日期 |
| engineSize | number |
| 小数位数:0,最大长度:10 | 否 | 排气量(升) 示例：0 |
| approvedGuest | number |
| 小数位数:0,最大长度:10 | 否 | 核定载客 示例：0 |
| integrityQuality | number |
| 小数位数:6,最大长度:28 | 否 | 整备质量(吨) 示例：0 |
| taxUnit | string | 否 | 计税单位 |
| unitAmount | number |
| 小数位数:0,最大长度:10 | 否 | 单位税额 示例：0 |
| taxObligationEndDate | string | 否 | 纳税义务终止日期 |
| province | string | 否 | 省/直辖市（废弃） |
| city | string | 否 | 市（废弃） |
| area | string | 否 | 区（废弃） |
| town | string | 否 | 城镇/街道（废弃） |
| baseRegionId | string | 否 | 行政区划Id |
| addressDetail | string | 否 | 详细地址 |
| vehicleTaxOfficeId | string | 否 | 主管税务所(科、分局) |
| taxDeducationCodeId | number |
| 小数位数:0,最大长度:10 | 否 | 减免税性质代码和名称 示例：0 |
| deductionRatio | number |
| 小数位数:0,最大长度:10 | 否 | 减免比例(%) 示例：0 |
| vehicleUniformInvoiceCode | string | 否 | 机动车销售统一发票代码 |
| vehicleUniformInvoiceNum | string | 否 | 机动车销售统一发票号码 |
| invoiceDate | string | 否 | 开票日期 |
| noTaxUnitPrice | number |
| 小数位数:0,最大长度:10 | 否 | 不含税价格 示例：0 |
| rateId | string | 否 | 适用税率(%) |
| sourceId | string | 否 | 数据来源 |
| ytenantId | string | 否 | 租户id |
| createTime | string | 否 | 创建时间 |
| modifyTime | string | 否 | 修改时间 |
| creator | string | 否 | 创建人 |
| modifier | string | 否 | 修改人 |
| orgId | string | 否 | 主组织ID(税务组织ID） |
| transferDate | string | 否 | 转让时间 |
| hullLength | number |
| 小数位数:0,最大长度:10 | 否 | 艇身长度(米) 示例：0 |
| projectId | string | 否 | 项目id |
| purchaseTaxOfficeId | string | 否 | 车购税主管税务机关 |
| isSelfDeclarePurchase | string | 否 | 是否自主申报车购税 |
| billState | string | 否 | 单据状态 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"code": "",
		"taxpayerId": "",
		"declarationMethod": "",
		"selfDeclare": "",
		"vehicleRegistration": "",
		"vehicleNum": "",
		"vehicleIdentificationCode": "",
		"vehicleCategory": "",
		"vehicleType": "",
		"vehicleBrand": "",
		"vehicleModel": "",
		"engineNum": "",
		"licenseNum": "",
		"vehicleRegistrationDate": "",
		"engineSize": 0,
		"approvedGuest": 0,
		"integrityQuality": 0,
		"taxUnit": "",
		"unitAmount": 0,
		"taxObligationEndDate": "",
		"province": "",
		"city": "",
		"area": "",
		"town": "",
		"baseRegionId": "",
		"addressDetail": "",
		"vehicleTaxOfficeId": "",
		"taxDeducationCodeId": 0,
		"deductionRatio": 0,
		"vehicleUniformInvoiceCode": "",
		"vehicleUniformInvoiceNum": "",
		"invoiceDate": "",
		"noTaxUnitPrice": 0,
		"rateId": "",
		"sourceId": "",
		"ytenantId": "",
		"createTime": "",
		"modifyTime": "",
		"creator": "",
		"modifier": "",
		"orgId": "",
		"transferDate": "",
		"hullLength": 0,
		"projectId": "",
		"purchaseTaxOfficeId": "",
		"isSelfDeclarePurchase": "",
		"billState": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-03

更新

返回参数 (40)

2	2025-09-03

更新

请求说明

新增

请求参数 taxVehicleInfoCode

新增

请求参数 sourceIdList

删除

请求参数 taxVehicleInfoCode

删除

请求参数 sourceIdList


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

