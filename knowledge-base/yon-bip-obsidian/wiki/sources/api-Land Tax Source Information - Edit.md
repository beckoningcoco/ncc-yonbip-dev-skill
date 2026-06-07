---
title: "土地税源信息-编辑"
apiId: "1862570352583376904"
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

# 土地税源信息-编辑

> `ContentType	application/json` 请求方式	POST | 分类: Land tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/land-tax/edit

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
| id | string | 否 | 否 | 税务云id（税务云id、来源id和土地税源编号不可同时为空） 示例：123123123123123 |
| lyid | string | 否 | 否 | 来源id（税务云id、来源id和土地税源编号不可同时为空） 示例：1231313123 |
| code | string | 否 | 否 | 土地税源编号（税务云id、来源id和土地税源编号不可同时为空） 示例：TDSY20251217000014 |
| orgCode | string | 否 | 是 | 组织编码 示例：91110106MACNT33F8Q |
| isArchived | string | 否 | 否 | 是否已在税局备案 示例：1-是、0-否 |
| landNumber | string | 否 | 否 | 土地编号 示例：isArchived=1时，必填 |
| taxPayerType | string | 否 | 否 | 纳税人类型。说明：1-土地使用权人、2-集体土地使用人、3-无偿使用人、4-代管人、5-实际使用人 示例：1 |
| landType | string | 否 | 否 | 土地性质 示例：1-国有、2-集体 |
| taxPayerNsrsbh | string | 否 | 否 | 土地使用权人识别号 示例：1233123123 |
| taxPayerName | string | 否 | 否 | 土地使用权人名称 示例：用友网络股份有限公司 |
| landCertNumber | string | 否 | 否 | 不动产权证号 示例：123123 |
| landSn | string | 否 | 否 | 不动产单元代码 示例：123123123 |
| landName | string | 否 | 否 | 土地名称 示例：用友产业园宅基地 |
| landObtainTime | string | 否 | 是 | 土地取得时间 示例：2023-11-01；yyyy-MM-dd |
| landObtainMethod | string | 否 | 是 | 土地取得方式 示例：1-划拨、2-出让、3-租赁、4-转让、5-其他 |
| landArea | string | 否 | 是 | 占用土地面积 示例：200 |
| landUses | string | 否 | 否 | 土地用途 示例：1-商业用地、2-综合用地、3-住宅用地、4-工业用地、5-房地产开发企业的开发用地、6-其他用地 |
| groundDate | string | 否 | 否 | 宗地号 示例：123123 |
| province | string | 否 | 否 | 土地行政区划（省） 示例：河南省 |
| city | string | 否 | 否 | 土地行政区划（市） 示例：焦作市 |
| county | string | 否 | 否 | 土地所处街道（县/区） 示例：温县 |
| town | string | 否 | 否 | 土地所处街道（乡镇/街道） 示例：温泉镇 |
| landAddress | string | 否 | 否 | 土地详细地址 示例：后东南王村 |
| taxOfficeName | string | 否 | 否 | 主管税所名称 示例：国家税务总局合肥市瑶海区第一税务分局办税厅 |
| landCertType | string | 否 | 否 | 不动产权证类型，1：不动产权证，2：土地使用证，3：其他 示例：1 |
| projectCode | string | 否 | 否 | 项目编码 示例：A项目 |
| landValue | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 土地价值 示例：2000.36 |
| baseRegionCode | string | 否 | 否 | 行政区划代码 示例：110000000000 |
| landInfoChangeRecordList | object | 是 | 否 | 土地税源信息变更记录 |
| sourceId | string | 否 | 是 | 明细来源业务id 示例：423534534534 |
| sourceCode | string | 否 | 否 | 明细来源业务编号 示例：4324234234 |
| actualChangeDate | string | 否 | 是 | 实际取得/变更月份 示例：2025-05 |
| actualOccupiedArea | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 实际占用土地面积 示例：213 |
| changeDate | string | 否 | 否 | 取得/变更月份 示例：2025-05 |
| occupiedArea | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 占用土地面积 示例：324 |
| landValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 土地价值 示例：200 |
| landLevel | string | 否 | 否 | 土地等级 示例：一级土地 |
| taxRate | number |
| 小数位数:8,最大长度:12 | 否 | 否 | 税额标准 示例：0.01 |
| totalConstructionArea | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 总建筑面积 示例：200 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/land-tax/edit?access_token=访问令牌
Body: {
	"id": "123123123123123",
	"lyid": "1231313123",
	"code": "TDSY20251217000014",
	"orgCode": "91110106MACNT33F8Q",
	"isArchived": "1-是、0-否",
	"landNumber": "isArchived=1时，必填",
	"taxPayerType": "1",
	"landType": "1-国有、2-集体",
	"taxPayerNsrsbh": "1233123123",
	"taxPayerName": "用友网络股份有限公司",
	"landCertNumber": "123123",
	"landSn": "123123123",
	"landName": "用友产业园宅基地",
	"landObtainTime": "2023-11-01；yyyy-MM-dd",
	"landObtainMethod": "1-划拨、2-出让、3-租赁、4-转让、5-其他",
	"landArea": "200",
	"landUses": "1-商业用地、2-综合用地、3-住宅用地、4-工业用地、5-房地产开发企业的开发用地、6-其他用地",
	"groundDate": "123123",
	"province": "河南省",
	"city": "焦作市",
	"county": "温县",
	"town": "温泉镇",
	"landAddress": "后东南王村",
	"taxOfficeName": "国家税务总局合肥市瑶海区第一税务分局办税厅",
	"landCertType": "1",
	"projectCode": "A项目",
	"landValue": 2000.36,
	"baseRegionCode": "110000000000",
	"landInfoChangeRecordList": [
		{
			"sourceId": "423534534534",
			"sourceCode": "4324234234",
			"actualChangeDate": "2025-05",
			"actualOccupiedArea": 213,
			"changeDate": "2025-05",
			"occupiedArea": 324,
			"landValue": 200,
			"landLevel": "一级土地",
			"taxRate": 0.01,
			"totalConstructionArea": 200
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	操作失败	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-25

新增

请求参数 (13)

更新

请求参数 id

更新

请求参数 lyid

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

