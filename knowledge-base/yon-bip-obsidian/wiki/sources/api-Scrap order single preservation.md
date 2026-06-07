---
title: "报废单单个保存"
apiId: "2180116989971791875"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Scrap Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Scrap Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 报废单单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Scrap Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storescrapped/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 报废单参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 是 | 库存组织id或code 示例：1811432178442043398 |
| code | string | 否 | 否 | 单据编码（为空时，系统自动生成） 示例：BFD002 |
| vouchdate | string | 否 | 否 | 单据日期 示例：2025-01-15 00:00:00 |
| warehouse | string | 否 | 是 | 仓库id或code 示例：1866246999206002689 |
| bustype | string | 否 | 否 | 交易类型id 示例：1806868320431898873 |
| bustype_name | string | 否 | 否 | 交易类型名称 示例：报废 |
| accountOrg | string | 否 | 否 | 会计主体id或code 示例：1811432178442043398 |
| storeScrappeds | object | 是 | 是 | 报废单子表数据 |
| _status | string | 否 | 是 | 状态，Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/scm/storescrapped/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1811432178442043398",
		"code": "BFD002",
		"vouchdate": "2025-01-15 00:00:00",
		"warehouse": "1866246999206002689",
		"bustype": "1806868320431898873",
		"bustype_name": "报废",
		"accountOrg": "1811432178442043398",
		"storeScrappeds": [
			{
				"_status": "Insert",
				"source": "stockanalysis_scrappedchange_list",
				"makeRuleCode": "stockanalysisToScrappedChangeReceive",
				"outreserveid": "0",
				"warehouse": "1866246999206002689",
				"product": "1811963148082610179",
				"product_cCode": "0007000011",
				"product_cName": "CSE材料序列1",
				"productsku": "0",
				"unit": "1807059437868810248",
				"inreserveid": "0",
				"invExchRate": "1",
				"stockStatusDoc": "1806868277480652940",
				"org": "1811432178442043398",
				"stockUnitId": "1807059437868810248",
				"unitExchangeType": 0,
				"isSerialNoManage": true,
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"qty": 1,
				"subQty": 1,
				"inStockStatusDoc": "1806868277480652944",
				"storeScrappedsSNs": [
					{
						"snCharacter": {},
						"sn": "CSEXLR24719001",
						"_status": "Insert"
					}
				],
				"outgoodsposition": ""
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 请求响应码，200时表示成功 示例：200 |
| message | string | 否 | 请求响应信息 示例：操作成功 |
| data | object | 否 | 请求响应数据 |
| code | string | 否 | 单据编码 示例：BFD002 |
| bustype_name | string | 否 | 交易类型 示例：报废 |
| vouchdate | string | 否 | 单据日期 示例：2025-01-15 00:00:00 |
| id | string | 否 | 主表id 示例：2180086495822479367 |
| org_name | string | 否 | 库存组织名称 示例：CSE出 |
| createDate | string | 否 | 创建日期 示例：2025-01-16 10:44:32 |
| creator | string | 否 | 创建人 示例：昵称-柴守娥 |
| org | string | 否 | 库存组织id 示例：1811432178442043398 |
| changeType | string | 否 | 单据类型 示例：scrappedchange |
| goodchangeDefineCharacter | object | 否 | 报废单主表自定义项特征 |
| accountOrg | string | 否 | 会计主体id 示例：1811432178442043398 |
| warehouse | string | 否 | 仓库id 示例：1866246999206002689 |
| bustype | string | 否 | 交易类型id 示例：1806868320431898873 |
| warehouse_name | string | 否 | 仓库名称 示例：CSE仓库22 |
| storeScrappeds | object | 是 | 报废单子表数据 |
| accountOrg_name | string | 否 | 会计主体名称 示例：CSE出 |
| status | string | 否 | 单据状态 示例：0 |
| traceId | string | 否 | traceId 示例：49b6d89281ceed5e |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "BFD002",
		"bustype_name": "报废",
		"vouchdate": "2025-01-15 00:00:00",
		"id": "2180086495822479367",
		"org_name": "CSE出",
		"createDate": "2025-01-16 10:44:32",
		"creator": "昵称-柴守娥",
		"org": "1811432178442043398",
		"changeType": "scrappedchange",
		"goodchangeDefineCharacter": {},
		"accountOrg": "1811432178442043398",
		"warehouse": "1866246999206002689",
		"bustype": "1806868320431898873",
		"warehouse_name": "CSE仓库22",
		"storeScrappeds": [
			{
				"stockUnit_name": "千克",
				"product_cCode": "0007000011",
				"stockStatusDoc_name": "合格",
				"subQty": 1,
				"goodchangesCharacteristics": {},
				"outStockStatusDoc_name": "合格",
				"product_cName": "CSE材料序列1",
				"isExpiryDateManage": false,
				"id": "2180086495822479368",
				"mainid": "2180086495822479367",
				"isSerialNoManage": true,
				"warehouse": "1866246999206002689",
				"outreserveid": 0,
				"unit": "1807059437868810248",
				"warehouse_name": "CSE仓库22",
				"productsku": "0",
				"qty": 1,
				"inreserveid": "0",
				"invExchRate": 1,
				"storeScrappedsSNs": [
					{
						"id": "2180086495822479369",
						"sn": "CSEXLR24719001"
					}
				],
				"stockUnitId": "1807059437868810248",
				"goodchangesDefineCharacter": {},
				"makeRuleCode": "stockanalysisToScrappedChangeReceive",
				"stockStatusDoc": "1806868277480652940",
				"isBatchManage": false,
				"org_name": "CSE出",
				"product": "1811963148082610179",
				"outStockStatusDoc": "1806868277480652940",
				"makeRule": "1426035837914055030",
				"org": "1811432178442043398",
				"priceUOM_name": "千克",
				"stockType": "1806868286070587551",
				"unitExchangeType": 0,
				"inStockStatusDoc": "1806868277480652944",
				"inStockStatusDoc_name": "废品"
			}
		],
		"accountOrg_name": "CSE出",
		"status": "0"
	},
	"traceId": "49b6d89281ceed5e"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	服务端逻辑异常


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

