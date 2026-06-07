---
title: "船舶税源信息-查询"
apiId: "2298388540365475550"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ship tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ship tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 船舶税源信息-查询

> `ContentType	application/json` 请求方式	POST | 分类: Ship tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/vessel/query

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
| taxVesseInfoCode | string | 否 | 否 | 船舶税源编号 |
| sourceIdList | string | 是 | 是 | 来源ID 示例：[1,2] 默认值：[1] 最大请求量：50 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/vessel/query?access_token=访问令牌
Body: {
	"taxVesseInfoCode": "",
	"sourceIdList": [
		1,
		2
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
| code | string | 否 | 编码 示例：编码 |
| taxpayerId | string | 否 | 纳税主体ID |
| orgId | string | 否 | 税务组织ID |
| declarationMethod | string | 否 | 申报方式 |
| isSelfDeclaration | string | 否 | 是否自主申报车船税 |
| vesselNumber | string | 否 | 船舶登记号 |
| vesselCode | string | 否 | 船舶识别号 |
| vesselType | string | 否 | 船舶类型 |
| shipNameCn | string | 否 | 中文船名 |
| initVesselNumber | string | 否 | 初次登记号码 |
| vesselPort | string | 否 | 船籍港 |
| issueDate | string | 否 | 发证日期 |
| acquisitionDate | string | 否 | 取得所有权日期 |
| completionDate | string | 否 | 建成日期 |
| netTonnage | number |
| 小数位数:0,最大长度:10 | 否 | 净吨位 示例：0 |
| power | number |
| 小数位数:0,最大长度:10 | 否 | 主机功率 示例：0 |
| hullLength | number |
| 小数位数:0,最大长度:10 | 否 | 艇身长度(米) 示例：0 |
| taxUnit | string | 否 | 计税单位 |
| unitAmount | number |
| 小数位数:0,最大长度:10 | 否 | 单位税额 示例：0 |
| terminationDate | string | 否 | 纳税义务终止日期 |
| province | string | 否 | 省/直辖市（废弃） |
| city | string | 否 | 市（废弃） |
| area | string | 否 | 区（废弃） |
| town | string | 否 | 镇/街道（废弃） |
| baseRegionId | string | 否 | 行政区划Id |
| vesselRegister | string | 否 | 船舶登记地 |
| taxOfficeId | string | 否 | 主管税务所(科、分局) |
| taxDeducationCodeId | string | 否 | 减免税性质代码和名称 |
| deductionRatio | number |
| 小数位数:0,最大长度:10 | 否 | 减免比例(%) 示例：0 |
| vehicleCategory | string | 否 | 车辆大类 |
| approvedGuest | number |
| 小数位数:0,最大长度:10 | 否 | 核定载客 示例：0 |
| transferDate | string | 否 | 转让时间 |
| sourceBy | string | 否 | 数据来源 |
| sourceId | string | 否 | 来源ID |
| projectId | string | 否 | 项目id |
| ytenantId | string | 否 | 租户id |
| createTime | string | 否 | 创建时间 |
| modifyTime | string | 否 | 修改时间 |
| creator | string | 否 | 创建人 |
| modifier | string | 否 | 修改人 |
| billState | string | 否 | 单据状态 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"code": "编码",
		"taxpayerId": "",
		"orgId": "",
		"declarationMethod": "",
		"isSelfDeclaration": "",
		"vesselNumber": "",
		"vesselCode": "",
		"vesselType": "",
		"shipNameCn": "",
		"initVesselNumber": "",
		"vesselPort": "",
		"issueDate": "",
		"acquisitionDate": "",
		"completionDate": "",
		"netTonnage": 0,
		"power": 0,
		"hullLength": 0,
		"taxUnit": "",
		"unitAmount": 0,
		"terminationDate": "",
		"province": "",
		"city": "",
		"area": "",
		"town": "",
		"baseRegionId": "",
		"vesselRegister": "",
		"taxOfficeId": "",
		"taxDeducationCodeId": "",
		"deductionRatio": 0,
		"vehicleCategory": "",
		"approvedGuest": 0,
		"transferDate": "",
		"sourceBy": "",
		"sourceId": "",
		"projectId": "",
		"ytenantId": "",
		"createTime": "",
		"modifyTime": "",
		"creator": "",
		"modifier": "",
		"billState": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-03

更新

请求说明

新增

请求参数 taxVesseInfoCode

新增

请求参数 sourceIdList

删除

请求参数 taxVehicleInfoCode

删除

请求参数 sourceIdList

0


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

