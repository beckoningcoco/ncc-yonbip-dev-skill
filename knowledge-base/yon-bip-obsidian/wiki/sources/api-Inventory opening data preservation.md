---
title: "存货期初数据保存"
apiId: "1850542047568592905"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opening Inventory"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opening Inventory]
platform_version: "BIP"
source_type: community-api-docs
---

# 存货期初数据保存

> `ContentType	application/json` 请求方式	POST | 分类: Opening Inventory (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fieia/accopen/upgrade/create

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 存货升级期初数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | ncc主键 示例：89856 |
| accentity | string | 否 | 否 | 会计主体 示例：121212 |
| accbook | string | 否 | 否 | 账簿 示例：32131 |
| periodCode | string | 否 | 否 | 会计期间 示例：2023-06 |
| bookDate | string | 否 | 否 | 记账日期 示例：2023-06-11 |
| code | string | 否 | 否 | 会计事务号 示例：ia0510 |
| datatype | int | 否 | 否 | 数据类型0财务 1责任 示例：1 |
| srcAppCode | string | 否 | 否 | 来源系统码 示例：NC65 |
| stockOrgId | string | 否 | 否 | 库存组织 示例：12321312 |
| warehouseId | string | 否 | 否 | 仓库 示例：5651515 |
| costDomainId | string | 否 | 否 | 成本域 示例：121223 |
| batchNo | string | 否 | 否 | 批次号 示例：1 |
| materialId | string | 否 | 否 | 物料id 示例：22321 |
| projectId | string | 否 | 否 | 项目id 示例：11202 |
| customerId | string | 否 | 否 | 客户id 示例：3213 |
| priceMethod | string | 否 | 否 | 计价方式 示例：0-先进先出，1-移动平均，2-全月平均，3-标准价 |
| num | BigDecimal | 否 | 否 | 数量 示例：3 |
| noSettleNum | BigDecimal | 否 | 否 | 未结算数量 示例：2 |
| currencyId | string | 否 | 否 | 原币 示例：2122 |
| costPrice | BigDecimal | 否 | 否 | 成本单价 示例：11 |
| costAmount | BigDecimal | 否 | 否 | 结存金额 示例：8 |
| taxPrice | BigDecimal | 否 | 否 | 含税单价 示例：7 |
| taxAmount | BigDecimal | 否 | 否 | 含税金额 示例：99 |
| notaxPrice | BigDecimal | 否 | 否 | 无税单价 示例：1 |
| notaxAmount | BigDecimal | 否 | 否 | 无税金额 示例：55 |
| rateDate | string | 否 | 否 | 汇率日期 示例：2023-08-09 |
| orgCurrtypeId | string | 否 | 否 | 组织本币id 示例：2132 |
| orgPrice | BigDecimal | 否 | 否 | 组织本币单价 示例：1 |
| orgAmount | string | 否 | 否 | 组织本币金额 示例：2 |
| inoutDirection | string | 否 | 否 | 出入库方向 示例：0-出库，1-入库 |
| billDirection | string | 否 | 否 | 单据方向 示例：0-出库，1-入库 |
| blnAllowZero | string | 否 | 否 | 零成本 示例：0 |
| accbookCurrtypeId | string | 否 | 否 | 账薄本币币种 示例：1232131 |
| accbookPrice | BigDecimal | 否 | 否 | 账薄本币单价 示例：12 |
| accbookAmount | BigDecimal | 否 | 否 | 账簿本币金额 示例：16 |
| accbookBalanceAmount | BigDecimal | 否 | 否 | 账簿本币结余金额 示例：13 |

## 3. 请求示例

Url: /yonbip/EFI/fieia/accopen/upgrade/create?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "89856",
			"accentity": "121212",
			"accbook": "32131",
			"periodCode": "2023-06",
			"bookDate": "2023-06-11",
			"code": "ia0510",
			"datatype": 1,
			"srcAppCode": "NC65",
			"stockOrgId": "12321312",
			"warehouseId": "5651515",
			"costDomainId": "121223",
			"batchNo": "1",
			"materialId": "22321",
			"projectId": "11202",
			"customerId": "3213",
			"priceMethod": "0-先进先出，1-移动平均，2-全月平均，3-标准价",
			"num": 3,
			"noSettleNum": 2,
			"currencyId": "2122",
			"costPrice": 11,
			"costAmount": 8,
			"taxPrice": 7,
			"taxAmount": 99,
			"notaxPrice": 1,
			"notaxAmount": 55,
			"rateDate": "2023-08-09",
			"orgCurrtypeId": "2132",
			"orgPrice": 1,
			"orgAmount": "2",
			"inoutDirection": "0-出库，1-入库",
			"billDirection": "0-出库，1-入库",
			"blnAllowZero": "0",
			"accbookCurrtypeId": "1232131",
			"accbookPrice": 12,
			"accbookAmount": 16,
			"accbookBalanceAmount": 13
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 返回内容 |
| count | long | 否 | 总数 示例：7 |
| successCount | long | 否 | 成功数 示例：7 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | object | 是 | 返回信息 |
| infos | object | 是 | 返回infos信息 |
| traceId | string | 否 | traceId 示例：3875b3b125992cc9 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 7,
		"successCount": 7,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "1001A6100000001P5KR9",
					"targetUnique": "1873213126914080800"
				}
			}
		]
	},
	"traceId": "3875b3b125992cc9"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310008	310008	参数校验失败


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

