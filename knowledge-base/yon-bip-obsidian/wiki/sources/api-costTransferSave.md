---
title: "成本转移新增"
apiId: "2449019360480067586"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Transfer"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本转移新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Transfer (CO)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/ecc/costTransfer/saveBatch

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 数据集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accpurposeCode | string | 否 | 是 | 核算目的code |
| accentity | string | 否 | 是 | 会计主体id 示例：1943574303263424517 |
| accbook | string | 否 | 是 | 账簿id 示例：1950756854373023763 |
| bookedDate | string | 否 | 是 | 记账日期 示例：1999-01-01 |
| fiEventRecordNo | string | 否 | 否 | 会计事务记录号 |
| costObjectType | string | 否 | 否 | 转出成本对象大类 默认值：CCO |
| transferType | string | 否 | 是 | 转移类型，0 ：成本中心间转移 1：转出到科目 |
| busiOrg | string | 否 | 是 | 业务单元id 示例：1943574303263424517 |
| description | string | 否 | 否 | 描述信息 |
| creator | string | 否 | 否 | 创建人id |
| freeCh | object | 否 | 否 | 自定义特征，map形式，key: 特征编码 value: 文本类型输入文本，档案类型输入档案id |
| items | object | 是 | 是 | 成本转移明细信息 |
| srcClue | string | 否 | 是 | 来源线索 |
| fiEventSrc | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 会计事务来源 默认值：7 |

## 3. 请求示例

Url: /yonbip/FCC/ecc/costTransfer/saveBatch?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"accpurposeCode": "",
			"accentity": "1943574303263424517",
			"accbook": "1950756854373023763",
			"bookedDate": "1999-01-01",
			"fiEventRecordNo": "",
			"costObjectType": "",
			"transferType": "",
			"busiOrg": "1943574303263424517",
			"description": "",
			"creator": "",
			"freeCh": {},
			"items": [
				{
					"rowNo": "",
					"costCenter": "",
					"oriCostElementCode": "",
					"costElementCode": "",
					"activity": "",
					"materialSKU": "",
					"profitCenter": "",
					"specialItem": "",
					"wbsDoc": "",
					"projectScheduleTask": "",
					"osmSupplierId": "",
					"busiDept": "",
					"supplier": "",
					"personnel": "",
					"expenseItem": "",
					"senderFreeCh": "",
					"oppCostCenter": "",
					"oppCostElementCode": "",
					"oppProfitCenter": "",
					"oppSpecialItem": "",
					"oppWbsDoc": "",
					"oppProjectScheduleTask": "",
					"oppOsmSupplierId": "",
					"oppBusiDept": "",
					"oppSupplier": "",
					"oppPersonnel": "",
					"oppExpenseItem": "",
					"receiverFreeCh": "",
					"orgAmount": 0,
					"amount": 0,
					"grpAmount": 0,
					"gblAmount": 0,
					"accRate": 0,
					"grpRate": 0,
					"gblRate": 0,
					"accRateType": "",
					"grpRateType": "",
					"gblRateType": "",
					"accRateOps": 0,
					"grpRateOps": 0,
					"gblRateOps": 0
				}
			],
			"srcClue": "",
			"fiEventSrc": 0
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：sucess |
| data | object | 否 | 数据 |
| count | number |
| 小数位数:0,最大长度:38 | 否 | 操作总数量 示例：2 |
| sucessCount | number |
| 小数位数:0,最大长度:38 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:38 | 否 | 失败数量 示例：1 |
| failInfos | object | 是 | 失败信息 |
| infos | object | 是 | 成功信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "sucess",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"failInfos": [
			{
				"accentity": "222454126880793643456",
				"code": "SRD30284",
				"org": "",
				"message": "单据数据错误!"
			}
		],
		"infos": [
			{
				"id": "222454126880793643456",
				"code": "RDS2224541268807936"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

