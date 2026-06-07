---
title: "土地税源信息-新增"
apiId: "1862556625867898885"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Land tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Land tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 土地税源信息-新增

> `ContentType	application/json` 请求方式	POST | 分类: Land tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/land-tax/save

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
| lyid | string | 否 | 是 | 唯一来源标识 示例：1231313123 |
| orgCode | string | 否 | 是 | 组织编码 示例：91110106MACNT33F8Q |
| isArchived | string | 否 | 否 | 是否在税局备案。说明：1-是、0-否 示例：1 |
| landNumber | string | 否 | 否 | 土地编号。说明：当isArchived=1时，该字段必填 示例：123123123 |
| taxPayerType | string | 否 | 否 | 纳税人类型。说明：1-土地使用权人、2-集体土地使用人、3-无偿使用人、4-代管人、5-实际使用人 示例：1 |
| landType | string | 否 | 否 | 土地性质。说明：1-国有、2-集体 示例：1 |
| taxPayerNsrsbh | string | 否 | 否 | 土地使用权人识别号 示例：1233123123 |
| taxPayerName | string | 否 | 否 | 土地使用权人名称 示例：用友网络股份有限公司 |
| landCertNumber | string | 否 | 否 | 不动产权证号 示例：123123 |
| landSn | string | 否 | 否 | 不动产单元代码 示例：123123123 |
| landName | string | 否 | 否 | 土地名称 示例：用友产业园宅基地 |
| landObtainTime | string | 否 | 是 | 土地取得时间。说明：yyyy-MM-dd 示例：2023-11-01 |
| landObtainMethod | string | 否 | 是 | 土地取得方式。说明：1-划拨、2-出让、3-租赁、4-转让、5-其他 示例：1 |
| landArea | Decimal | 否 | 是 | 占用土地面积 示例：123.11 |
| landUses | string | 否 | 否 | 土地用途。说明：1-商业用地、2-综合用地、3-住宅用地、4-工业用地、5-房地产开发企业的开发用地、6-其他用地 示例：1 |
| groundDate | string | 否 | 否 | 宗地号 示例：123123 |
| landValue | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 土地价值 示例：13.23 |
| province | string | 否 | 否 | 土地行政区划（省） 示例：河南省 |
| city | string | 否 | 否 | 土地行政区划（市） 示例：焦作市 |
| county | string | 否 | 否 | 土地所处街道（县/区） 示例：温县 |
| town | string | 否 | 否 | 土地所处街道（乡镇/街道） 示例：温泉镇 |
| landAddress | string | 否 | 否 | 土地详细地址 示例：后东南王村 |
| taxOfficeName | string | 否 | 否 | 主管税务所名称 示例：国家税务总局合肥市瑶海区第一税务分局办税厅 |
| landCertType | string | 否 | 否 | 不动产权证类型，1：不动产权证，2：土地使用证，3：其他 示例：2 |
| projectCode | string | 否 | 否 | 项目编码 示例：100001 |
| baseRegionCode | string | 否 | 否 | 行政区划代码 示例：110000000000 |
| landInfoChangeRecordList | object | 是 | 否 | 土地税源信息变更记录 |
| sourceId | string | 否 | 是 | 明细来源业务id 示例：234353534532 |
| sourceCode | string | 否 | 否 | 明细来源业务编号 示例：435435435345345 |
| actualChangeDate | string | 否 | 是 | 实际取得/变更月份 示例：2025-05 |
| actualOccupiedArea | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 实际占用土地面积 示例：1000 |
| changeDate | string | 否 | 否 | 取得/变更月份 示例：2025-05 |
| occupiedArea | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 占用土地面积 示例：100 |
| landValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 土地价值 示例：100 |
| landLevel | string | 否 | 否 | 土地等级 示例：城镇土地使用税一级 |
| taxRate | number |
| 小数位数:8,最大长度:12 | 否 | 否 | 税额标准 示例：0.5 |
| totalConstructionArea | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 总建筑面积 示例：100 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/land-tax/save?access_token=访问令牌
Body: [{
	"lyid": "1231313123",
	"orgCode": "91110106MACNT33F8Q",
	"isArchived": "1",
	"landNumber": "123123123",
	"taxPayerType": "1",
	"landType": "1",
	"taxPayerNsrsbh": "1233123123",
	"taxPayerName": "用友网络股份有限公司",
	"landCertNumber": "123123",
	"landSn": "123123123",
	"landName": "用友产业园宅基地",
	"landObtainTime": "2023-11-01",
	"landObtainMethod": "1",
	"landArea": 123.11,
	"landUses": "1",
	"groundDate": "123123",
	"landValue": 13.23,
	"province": "河南省",
	"city": "焦作市",
	"county": "温县",
	"town": "温泉镇",
	"landAddress": "后东南王村",
	"taxOfficeName": "国家税务总局合肥市瑶海区第一税务分局办税厅",
	"landCertType": "2",
	"projectCode": "100001",
	"baseRegionCode": "110000000000",
	"landInfoChangeRecordList": [
		{
			"sourceId": "234353534532",
			"sourceCode": "435435435345345",
			"actualChangeDate": "2025-05",
			"actualOccupiedArea": 1000,
			"changeDate": "2025-05",
			"occupiedArea": 100,
			"landValue": 100,
			"landLevel": "城镇土地使用税一级",
			"taxRate": 0.5,
			"totalConstructionArea": 100
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |
| datas | object | 是 | 返回结果 |
| id | string | 否 | 税务云数据id 示例：1862574441378086915 |
| lyid | string | 否 | 数据来源标识 示例：123 |
| code | string | 否 | 土地税源编号 示例：TDSY20241212000001 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"datas": [
		{
			"id": "1862574441378086915",
			"lyid": "123",
			"code": "TDSY20241212000001"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-25

新增

请求参数 (12)

修改税额标准精度

2	2025-07-03

新增

请求参数 baseRegionCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

