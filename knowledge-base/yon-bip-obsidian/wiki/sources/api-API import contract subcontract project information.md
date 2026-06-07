---
title: "Api导入合同分包项目信息"
apiId: "1758128971417387008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Management Journal"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Management Journal]
platform_version: "BIP"
source_type: community-api-docs
---

# Api导入合同分包项目信息

> `ContentType	application/json` 请求方式	POST | 分类: Subcontract Management Journal (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/import-contract-subproject

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
| contracts | object | 是 | 否 | 导入合同 |
| amountExcludingTax | number |
| 小数位数:4,最大长度:24 | 否 | 否 | 合同金额（不含税） 示例：123 |
| terminationDate | string | 否 | 否 | 合同终止日期，时间格式yyyy-MM-dd 示例：2023-05-12 |
| stampTaxItem | string | 否 | 否 | 印花税税目（传入的为code） 示例：rrrr |
| subItem | string | 否 | 否 | 印花税子目（传入的为code） 示例：aaa |
| sisNonTaxContract | string | 否 | 否 | 是否不征税合同（Y、是；N、否） 示例：Y |
| code | string | 否 | 是 | 合同编号,合同编号长度不能超过50个字符 示例：AA |
| name | string | 否 | 是 | 合同名称,合同名称长度不能超过550个字符 示例：ASS |
| amount | string | 否 | 否 | 合同金额，合同金额不可大于9999999999999.99 示例：323 |
| signDate | string | 否 | 否 | 合同签订日期，日期格式为yyyy-MM-dd 示例：2023-05-21 |
| validDate | string | 否 | 否 | 合同有效期，日期格式为yyyy-MM-dd 示例：2023-09-12 |
| paymentType | string | 否 | 否 | 收支类型 1:收入类；2：支出类，收支类型的值不正确 示例：1 |
| contractType | string | 否 | 否 | 合同类型 1采购合同;2销售合同;3加工合同;4承揽合同;5建设工程勘察合同;6建设工程设计合同;7建筑安装工程承包合同;8财产租赁合同;9货物运输合同;10仓储保管合同;11借款合同;12财产保险合同;13技术合同;14产权转移书据;15不征税合同; 示例：1 |
| relativeName | string | 否 | 否 | 合同相对方名称，合同相对方名称长度不能超过600个字符 示例：xxxx |
| relativeNsrsbh | string | 否 | 否 | 合同相对方税号，合同相对方税号长度不能超过20个字符 示例：xxxx |
| contractStatus | string | 否 | 否 | 合同状态 1：正常；2：终止 示例：1 |
| isFrame | string | 否 | 否 | 是否框架合同Y:是 N:否 示例：Y |
| note | string | 否 | 否 | 备注 示例：eee |
| isContainsTax | string | 否 | 否 | 是否含税金额计税（Y、是；N、 否） 示例：Y |
| contractTypeCode | string | 否 | 否 | 合同类型编码 示例：dddd |
| subprojects | object | 是 | 是 | 导入分包项目 |
| orgCode | string | 否 | 是 | 组织编码,组织编码长度不能超过50个字符 示例：dadf |
| projectName | string | 否 | 是 | 项目名称长度不能超过350个字符 示例：gggg |
| subprojectCode | string | 否 | 否 | 分包项目编号长度不能超过50个字符 示例：gggg |
| subprojectName | string | 否 | 否 | 分包项目名称长度不能超过200个字符 示例：gggg |
| supplierName | string | 否 | 是 | 分包企业名称长度不能超过50个字符 示例：ssss |
| supplierNsrsbh | string | 否 | 是 | 分包企业税号长度不能超过20个字符 示例：ASDGGFDD |
| contractCodes | string | 是 | 是 | 合同编号 示例：["SSDD"] |
| orgCode | string | 否 | 是 | 组织编码,组织编码长度不能超过50个字符 示例：code001 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/import-contract-subproject?access_token=访问令牌
Body: {
	"contracts": [
		{
			"amountExcludingTax": 123,
			"terminationDate": "2023-05-12",
			"stampTaxItem": "rrrr",
			"subItem": "aaa",
			"sisNonTaxContract": "Y",
			"code": "AA",
			"name": "ASS",
			"amount": "323",
			"signDate": "2023-05-21",
			"validDate": "2023-09-12",
			"paymentType": "1",
			"contractType": "1",
			"relativeName": "xxxx",
			"relativeNsrsbh": "xxxx",
			"contractStatus": "1",
			"isFrame": "Y",
			"note": "eee",
			"isContainsTax": "Y",
			"contractTypeCode": "dddd"
		}
	],
	"subprojects": [
		{
			"orgCode": "dadf",
			"projectName": "gggg",
			"subprojectCode": "gggg",
			"subprojectName": "gggg",
			"supplierName": "ssss",
			"supplierNsrsbh": "ASDGGFDD",
			"contractCodes": [
				"SSDD"
			]
		}
	],
	"orgCode": "code001"
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
| message | string | 否 | 信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统错误，具体的错误信息	根据错误信息修改


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-30

更新

请求说明

更新

请求参数 orgCode

20260115-修复 orgCode为null


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

