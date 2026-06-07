---
title: "合同涉税信息-变更"
apiId: "1758103141491408905"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同涉税信息-变更

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/modify

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
| orgId | number |
| 小数位数:0,最大长度:16 | 否 | 否 | 组织id 示例：2342223 |
| orgCode | string | 否 | 否 | 组织编码 示例：aacs |
| departmentCode | string | 否 | 否 | 部门编码 示例：code001 |
| code | string | 否 | 是 | 合同编号 示例：CCSD |
| name | string | 否 | 是 | 合同名称 示例：合同名称 |
| contractIdentifiNumber | string | 否 | 否 | 合同识别号 示例：321321 |
| isFrame | string | 否 | 否 | 是否框架合同Y：是,N：否 示例：Y |
| sisNonTaxContract | string | 否 | 否 | 是否不征税合同（Y、是；N、否） 示例：Y |
| isContainsTax | string | 否 | 否 | 是否含税金额计税（Y、是；N、 否） 示例：Y |
| contractStatus | string | 否 | 否 | 合同状态 1：正常；2：终止 示例：1 |
| paymentType | string | 否 | 否 | 收支类型 1:收入类；2：支出类；3：有收有支 示例：1 |
| signDate | string | 否 | 否 | 合同签订日期,日期格式yyyy-MM-dd 示例：2023-05-01 |
| terminationDate | string | 否 | 否 | 合同终止日期，日期格式yyyy-MM-dd 示例：2023-05-01 |
| validDate | string | 否 | 否 | 合同有效期，日期格式yyyy-MM-dd 示例：2023-05-01 |
| stampTaxItem | string | 否 | 否 | 印花税税目（传入的为code） 示例：税目编码 |
| subItem | string | 否 | 否 | 印花税子目（传入的为code） 示例：子目编码 |
| currencyCode | string | 否 | 否 | 币种简称 示例：CNY |
| relativeName | string | 否 | 否 | 合同相对方名称 示例：合同相对方名称 |
| relativeNsrsbh | string | 否 | 否 | 合同相对方税号 示例：合同相对方税号 |
| amount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 发生金额（含税），含税金额计税为是时，必填，否则非必填 示例：100 |
| amountExcludingTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 发生金额（不含税），含税金额计税为否时，必填，否则非必填 示例：80 |
| taxPeriod | number |
| 小数位数:0,最大长度:3 | 否 | 否 | 填报周期，3-年，4-次，1-季 示例：1 |
| stampStatus | string | 否 | 否 | 印花税申报状态，0-初始化，2-已申报,不上送时，默认赋值初始化 示例：0 |
| note | string | 否 | 否 | 备注 示例：备注 |
| contractOriginId | string | 否 | 否 | 来源id 示例：15156156156 |
| generateStamp | boolean | 否 | 否 | 是否自动生成印花税（true：自动生成，false：不进行生成） 示例：true |
| contractDefineTerm | object | 否 | 否 | 合同主表特征项 示例：{"key":"value"} |
| contractDetailDefineTerm | object | 否 | 否 | 合同子表特征项 示例：{"key":"value"} |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/modify?access_token=访问令牌
Body: [{
	"orgId": 2342223,
	"orgCode": "aacs",
	"departmentCode": "code001",
	"code": "CCSD",
	"name": "合同名称",
	"contractIdentifiNumber": "321321",
	"isFrame": "Y",
	"sisNonTaxContract": "Y",
	"isContainsTax": "Y",
	"contractStatus": "1",
	"paymentType": "1",
	"signDate": "2023-05-01",
	"terminationDate": "2023-05-01",
	"validDate": "2023-05-01",
	"stampTaxItem": "税目编码",
	"subItem": "子目编码",
	"currencyCode": "CNY",
	"relativeName": "合同相对方名称",
	"relativeNsrsbh": "合同相对方税号",
	"amount": 100,
	"amountExcludingTax": 80,
	"taxPeriod": 1,
	"stampStatus": "0",
	"note": "备注",
	"contractOriginId": "15156156156",
	"generateStamp": true,
	"contractDefineTerm": {
		"key": "value"
	},
	"contractDetailDefineTerm": {
		"key": "value"
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：修改成功 |
| data | object | 是 | 响应数据 |
| contractCode | string | 否 | 合同编码 示例：32111 |
| contractDetailId | string | 否 | 合同明细id 示例：212121 |
| stampId | string | 否 | 印花税id 示例：231321 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "修改成功",
	"data": [
		{
			"contractCode": "32111",
			"contractDetailId": "212121",
			"stampId": "231321"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据具体返回信息调整数据

8002	错误提示	提示生成印花税台账中不符合的字段报错信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

更新

请求参数 (7)

2	2025-09-01

新增

请求参数 stampStatus

1015迭代

3	2025-07-08

新增

请求参数 contractDefineTerm

新增

请求参数 contractDetailDefineTerm

20250715-添加特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

