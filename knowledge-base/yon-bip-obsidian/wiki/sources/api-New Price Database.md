---
title: "价格库新增"
apiId: "2043528637724491779"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Price Database"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Price Database]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格库新增

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Price Database (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/priceRepository/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 价格库信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 单据id，更新单据时必填 示例：3322 |
| remarks | string | 否 | 否 | 备注 示例：fdds |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：fa2 |
| costDomainId_code | string | 否 | 否 | 成本域编码,成本域d和成本域编码不能同时为空，id和编码同时存在，以id为准 示例：66805 |
| accbook | string | 否 | 否 | 账簿id,账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：1570037501541220371 |
| accbook_code | string | 否 | 否 | 账簿编码,账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：e11 |
| priceType_code | string | 否 | 是 | 价格类型编码 示例：004 默认值：004 |
| priceType | string | 否 | 否 | 价格类型id |
| blnDefault | boolean | 否 | 是 | 是否默认 true是 false否 示例：true 默认值：true |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, Update更新) 示例：Insert 默认值：Insert |
| bodies | object | 是 | 是 | 价格库新增明细信息 |

## 3. 请求示例

Url: /yonbip/EFI/priceRepository/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "3322",
		"remarks": "fdds",
		"accentity": "1563514751881838598",
		"accentity_code": "fa2",
		"costDomainId_code": "66805",
		"accbook": "1570037501541220371",
		"accbook_code": "e11",
		"priceType_code": "004",
		"priceType": "",
		"blnDefault": true,
		"_status": "Insert",
		"bodies": [
			{
				"materialId": "3123123",
				"material_code": "121",
				"batchNo": "1",
				"orgPrice": 1,
				"accbookPrice": 25,
				"_status": "Insert",
				"effectDate": "2024-07-12",
				"profitCenter_code": "see",
				"orgThisCostAmount": "1",
				"header": "3322",
				"id": "1233",
				"accbookThisCostAmount": 1,
				"costElements": [
					{
						"component": "1564985907040223235",
						"component_code": "E5005",
						"element_costelementId_code": "6601",
						"_status": "Insert",
						"element_maMaterialSku_materialId_code": "edaa",
						"element_activityId_code": "ERT",
						"num": 1,
						"accbookPrice": 2,
						"accbookThisCostAmount": 1,
						"orgThisCostAmount": "1",
						"orgPrice": "1",
						"id": "456678",
						"detail": "123321"
					}
				]
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 价格库详情信息 |
| costDomainId | string | 否 | 成本域id 示例：24240529012741 |
| id | string | 否 | 单据id 示例：1699951268584226817 |
| accentity | string | 否 | 会计主体id 示例：1570033155012821001 |
| priceType_name | string | 否 | 成本来源名称 示例：参考成本 |
| blnDefault | boolean | 否 | 是否默认 true是 false否 示例：true |
| pubts | string | 否 | 时间戳 示例：2024-06-04 11:06:05 |
| accbook | string | 否 | 账簿id 示例：1550289989236424710 |
| remarks | string | 否 | 备注 示例：调整用 |
| bodies | object | 是 | 子表信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"costDomainId": "24240529012741",
		"id": "1699951268584226817",
		"accentity": "1570033155012821001",
		"priceType_name": "参考成本",
		"blnDefault": true,
		"pubts": "2024-06-04 11:06:05",
		"accbook": "1550289989236424710",
		"remarks": "调整用",
		"bodies": [
			{
				"effectDate": "2024-06-04",
				"accbookPrice": 60,
				"material": "1526410752645660678",
				"batchNo": "100",
				"pubts": "2024-06-04 11:06:05",
				"accbookCurrtypeId": "1550290015006228493",
				"header": "1550290015006228493",
				"id": "2012367112268939275"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	查看请求数据是否正确


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

