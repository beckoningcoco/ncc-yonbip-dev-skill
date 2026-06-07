---
title: "形态转换撤回"
apiId: "2077031083410456582"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transformation Sheet"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transformation Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 形态转换撤回

> `ContentType	application/json` 请求方式	POST | 分类: Transformation Sheet (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/morphologyconversion/batchunsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	其他

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 形态转换单[st.morphologyconversion.MorphologyConversion] |
| id | number |
| 小数位数:0,最大长度:30 | 否 | 是 | 形态转换单主表id 示例：2282796996055296 |

## 3. 请求示例

Url: /yonbip/scm/morphologyconversion/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2282796996055296
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"org": "1900568695608832",
				"orgCode": "wzyqzn",
				"orgName": "王章宇全职能",
				"accountOrg": "1900568695608832",
				"accountOrgName": "王章宇全职能",
				"businesstypeId": "110000000000030",
				"businesstypeCode": "A70001",
				"businesstypeName": "物料转换",
				"conversionType": 1,
				"beforeWarehouse_iSerialManage": false,
				"afterWarehouse_iSerialManage": false,
				"beforeWarehouse_isGoodsPositionStock": false,
				"afterWarehouse_isGoodsPositionStock": false,
				"mcType": "1",
				"code": "XTZH20210604000001",
				"vouchdate": "2021-06-04 00:00:00",
				"status": 0,
				"beforeWarehouse": 2098549054656768,
				"beforeWarehouseName": "wzy仓库1",
				"afterWarehouse": 2117194568421632,
				"afterWarehouseName": "王章宇仓库2",
				"natCurrency_priceDigit": "2",
				"natCurrency_moneyDigit": "3",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"verifystate": 0,
				"isWfControlled": false,
				"returncount": 0,
				"remark": "test01",
				"operator": "王章宇",
				"creator": "王章宇",
				"createDate": "2021-06-04 16:50:52",
				"createTime": "2021-06-04 16:50:52",
				"morphologyconversiondetail": [
					{
						"groupNumber": 1,
						"lineType": 1,
						"warehouse": 2098549054656768,
						"warehouseName": "wzy仓库1",
						"hasDefaultInit": true,
						"productCode": "-001000002",
						"productsku": 2039290938478848,
						"productskuCode": "-001000002",
						"productskuName": "Z-组装子件1",
						"product": 2039290921636096,
						"productName": "Z-组装子件1",
						"mainUnitId": 1850769497837824,
						"mainUnitName": "Kg",
						"unit_Precision": "4",
						"stockUnitId": 1910505265844480,
						"stockUnit_name": "个",
						"invExchRate": 2,
						"isBatchManage": "0",
						"isExpiryDateManage": "0",
						"isSerialNoManage": false,
						"isSerialNoManage_source": "0",
						"taxRate": "0",
						"stockUnitId_Precision": "2",
						"unitExchangeType": 0,
						"warehouseMaterialCheckRule": "1",
						"stockStatusDoc": 2006555827382257,
						"stockStatusDoc_name": "合格",
						"qty": 6,
						"subQty": 3,
						"id": 2287151547076865,
						"remark": "test01",
						"morphologyConversionId": 2287151547076864,
						"pubts": "2021-06-04 16:50:52",
						"yTenantId": "lzu07egu"
					}
				],
				"resubmitCheckKey": "st_morphologyconversion_add_de293310-c511-11eb-a156-4539d1e0ce83",
				"id": 2287151547076864,
				"pubts": "2021-06-04 16:50:53",
				"creatorId": 1897893375529216,
				"barCode": "st_morphologyconversion|2287151547076864",
				"tenant": 1849710349897984,
				"yTenantId": "lzu07egu"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

