---
title: "车辆税源信息-更新"
apiId: "2063706660353343488"
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

# 车辆税源信息-更新

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/vehicle/edit/taxVehicleInfo

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
| records | object | 是 | 是 | 车辆税源的新增信息 |
| sourceId | string | 否 | 否 | 来源ID(唯一来源标识) 示例：0123456789 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：MT0000001 |
| taxVehicleInfoCode | string | 否 | 否 | 车辆税源编号 示例：CLSY20240809000003 |
| vehicleIdentificationCode | string | 否 | 否 | 车辆识别代码(车架号)， 存在待申报或者已申报状态车船税/车购税税金明细时，编辑态不可编辑 示例：1234567890123 |
| vehicleNum | string | 否 | 否 | 车辆号码，存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：00078942 |
| isSelfDeclareVehicle | string | 否 | 否 | 是否自主申报车船税(0-否、1-是) 示例：0 |
| isSelfDeclarePurchase | string | 否 | 否 | 是否自主申报车购税，枚举：1=是、0=否 示例：0 |
| isVehicleRegistration | string | 否 | 否 | 是否办理车辆登记（0-否，1-是），存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：0 |
| vehicleCategory | string | 否 | 否 | 车辆大类（1-乘用车，2-商用车，3-挂车，4-其他车辆，5-摩托车），存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：1 |
| vehicleType | string | 否 | 否 | 车辆类型（1-1.0升(含)以下的乘用车,2-1.0升以上至1.6升(含)的乘用车,3-1.6升以上至2.0升(含)的乘用车,4-2.0升以上至2.5升(含)的乘用车,5-2.5升以上至3.0升(含)的乘用车,6-3.0升以上至4.0升(含)的乘用车,7-4.0升以上的乘用车,8-核定载客人数20人以下客车,9-核定载客人数20人(含)以上客车,10-货车,11-挂车,12-专用作业车,13-轮式专用机械车,14-摩托车） 示例：1， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 |
| licenseNum | string | 否 | 否 | 合格证编号（长度≤50），存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 示例：452345123 |
| vehicleBrand | string | 否 | 否 | 车辆品牌（长度≤50），存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：298734 |
| vehicleModel | string | 否 | 否 | 车辆型号(厂牌型号)（长度≤50），存在待申报或者已申报状态车船税/车购税税金明细时，编辑态不可编辑 示例：13452345 |
| engineNum | string | 否 | 否 | 发动机号码（长度≤50），存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：92167534931 |
| vehicleRegistrationDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 车辆登记注册日期（YYYY-MM-DD），存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：2024-08-01 |
| engineSize | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 排气量(升)。存在待申报或者已申报状态车船税/车购税税金明细时，编辑态不可编辑 示例：12.01 |
| approvedGuest | number |
| 小数位数:0,最大长度:15 | 否 | 否 | 核定载客，存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：45 |
| integrityQuality | number |
| 小数位数:6,最大长度:15 | 否 | 否 | 整备质量(吨)，存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：1000.05 |
| taxUnit | string | 否 | 否 | 计税单位(1-吨、3-米)，存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：1 |
| unitAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 单位税额(最大长度13，精度2) 示例：11.11 |
| taxObligationEndDate | string | 否 | 否 | 纳税义务终止日期(yyyy-MM-dd) 示例：2024-01-01 |
| province | string | 否 | 否 | 省/直辖市， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：北京市 |
| city | string | 否 | 否 | 市， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：市辖区 |
| area | string | 否 | 否 | 区， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：海淀区 |
| town | string | 否 | 否 | 城镇/街道， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：西北旺地区 |
| vehicleTaxOffice | string | 否 | 否 | 车船税主管税务所(科、分局)， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑 示例：国家税务总局合肥市瑶海区第一税务分局办税厅 |
| taxDeducation | string | 否 | 否 | 减免税性质代码和名称 示例：0012061010|新能源船舶免征车船税|《中华人民共和国车船税法》 中华人民共和国主席令第43号第四条 |
| deductionRatio | number |
| 小数位数:2,最大长度:2 | 否 | 否 | 车船税减免比例(%) 示例：11 |
| vehicleUniformInvoiceCode | string | 否 | 否 | 机动车销售统一发票代码， 存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| vehicleUniformInvoiceNum | string | 否 | 否 | 机动车销售统一发票号码， 存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| invoiceDate | string | 否 | 否 | 开票日期， 存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| noTaxUnitPrice | string | 否 | 否 | 不含税价格，存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| purchaseRate | string | 否 | 否 | 车购税适用税率(%)，存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| purchaseTaxOffice | string | 否 | 否 | 车购税主管税务机关，存在待申报或者已申报状态车购税税金明细时，编辑态不可编辑 |
| regionCode | string | 否 | 否 | 行政区划代码（（省、市、区、镇/街道组合）与行政区划代码同时上送时，根据行政区划代码匹配平台档案，存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑） |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/vehicle/edit/taxVehicleInfo?access_token=访问令牌
Body: {
	"records": [
		{
			"sourceId": "0123456789",
			"orgCode": "MT0000001",
			"taxVehicleInfoCode": "CLSY20240809000003",
			"vehicleIdentificationCode": "1234567890123",
			"vehicleNum": "00078942",
			"isSelfDeclareVehicle": "0",
			"isSelfDeclarePurchase": "0",
			"isVehicleRegistration": "0",
			"vehicleCategory": "1",
			"vehicleType": "1， 存在待申报或者已申报状态车船税税金明细时，编辑态不可编辑",
			"licenseNum": "452345123",
			"vehicleBrand": "298734",
			"vehicleModel": "13452345",
			"engineNum": "92167534931",
			"vehicleRegistrationDate": "2024-08-01",
			"engineSize": 12.01,
			"approvedGuest": 45,
			"integrityQuality": 1000.05,
			"taxUnit": "1",
			"unitAmount": 11.11,
			"taxObligationEndDate": "2024-01-01",
			"province": "北京市",
			"city": "市辖区",
			"area": "海淀区",
			"town": "西北旺地区",
			"vehicleTaxOffice": "国家税务总局合肥市瑶海区第一税务分局办税厅",
			"taxDeducation": "0012061010|新能源船舶免征车船税|《中华人民共和国车船税法》 中华人民共和国主席令第43号第四条",
			"deductionRatio": 11,
			"vehicleUniformInvoiceCode": "",
			"vehicleUniformInvoiceNum": "",
			"invoiceDate": "",
			"noTaxUnitPrice": "",
			"purchaseRate": "",
			"purchaseTaxOffice": "",
			"regionCode": ""
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	错误提示信息	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-19

更新

请求参数 (9)

2	2025-12-19

更新

请求说明

更新

请求参数 vehicleType

更新

请求参数 isSelfDeclarePurchase

3	2025-07-03

更新

请求说明

新增

请求参数 regionCode

更新

请求参数 (4)

4	2025-05-15

更新

请求参数 vehicleNum

更新

请求参数 vehicleType

更新

请求参数 isSelfDeclarePurchase


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

