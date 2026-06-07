---
title: "待转固数据保存"
apiId: "1935921839876866056"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 待转固数据保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer Document (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/ToFixed/save

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
| data | object | 否 | 是 | 转固单数据 |
| accentity | string | 否 | 否 | 会计主体ID（ID和编码必填其一） 示例：2011723288189861898 |
| accentityCode | string | 否 | 否 | 会计主体编码（ID和编码必填其一） 示例：ABC |
| code | string | 否 | 否 | 转固单编码（手工编码方式下必填） 示例：ZGD005129 |
| vouchdate | string | 否 | 是 | 转固单日期（格式yyyy-MM-dd） 示例：2024-07-30 |
| bustype | string | 否 | 否 | 交易类型ID（ID和编码必填其一） 示例：2027990365040017412 |
| bustype_code | string | 否 | 否 | 交易类型编码（ID和编码必填其一） 示例：ABC |
| inputWay | string | 否 | 是 | 录入方式（集成录入：0；手动录入：1） 示例：0 |
| purchaseBillType | string | 否 | 否 | 转固单单据类型（采购到货：0；采购入库：1；材料出库：2；资产卡片：3；费控：4；专项成本：5；项目成本：6；采购结算：7） 示例：0 |
| sourceId | string | 否 | 否 | 上游单据主表ID 示例：2027399351889821705 |
| oriBillId | string | 否 | 否 | 源头单据ID 示例：2027399351889821705 |
| busiPostStatus | string | 否 | 否 | 业务过账过账状态 示例：0 |
| id | string | 否 | 否 | 转固单ID（新增时没有；编辑时必填） 示例：2054068607702794245 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 单据状态（开立态：0） 示例：0 |
| fromInterface | boolean | 否 | 是 | 是否来自接口新增（统一值：true） 示例：true |
| srcAppId | string | 否 | 否 | 来源应用ID（ID和编码必填其一） 示例：125 |
| srcAppId_code | string | 否 | 否 | 来源应用编码（ID和编码必填其一） 示例：abc |
| oriBillNo | string | 否 | 是 | 来源单据编码 示例：DH240624000006 |
| firstVouchdate | string | 否 | 是 | 来源单据日期 示例：2024-06-24 |
| remarks | object | 否 | 否 | 备注 |
| bodies | object | 是 | 是 | 转固单表体 |
| _status | string | 否 | 是 | 操作标识 (新增：Insert；编辑：Update) 示例：Update |
| billnum | string | 否 | 是 | 单据编码（固定值：FaToFixed） 示例：FaToFixed 默认值：FaToFixed |

## 3. 请求示例

Url: /yonbip/EFI/ToFixed/save?access_token=访问令牌
Body: {
	"data": {
		"accentity": "2011723288189861898",
		"accentityCode": "ABC",
		"code": "ZGD005129",
		"vouchdate": "2024-07-30",
		"bustype": "2027990365040017412",
		"bustype_code": "ABC",
		"inputWay": "0",
		"purchaseBillType": "0",
		"sourceId": "2027399351889821705",
		"oriBillId": "2027399351889821705",
		"busiPostStatus": "0",
		"id": "2054068607702794245",
		"verifyState": 0,
		"fromInterface": true,
		"srcAppId": "125",
		"srcAppId_code": "abc",
		"oriBillNo": "DH240624000006",
		"firstVouchdate": "2024-06-24",
		"remarks": {
			"zh_TW": "",
			"zh_CN": "",
			"en_US": ""
		},
		"bodies": [
			{
				"sourceId": "2027399351889821705",
				"vendorId": "2022919434696392711",
				"vendorCode": "abc",
				"accExclTaxPrice": 10.62,
				"addWayId": "1789824584511389697",
				"addWayId_name": "直接购入",
				"exchangeRate": 1,
				"accTaxAmount": 2.76,
				"id": "2054068607702794246",
				"srcBillId": "2027399351889821705",
				"sourceChildId": "2027399351889821706",
				"inclTaxPrice": 12.0006,
				"toFixedId": "2054068607702794245",
				"mgtDeptId": "2011723623199932421",
				"mgtDeptCode": "abc",
				"accInclTaxPrice": 12,
				"materialId": "2022913421750566919",
				"materialId_code": "D000001",
				"taxRate": 13,
				"exchangeRateTypeId": "0000LKMAE85K35S5J90000",
				"exchangeRateTypeId_code": "abc",
				"usageUserId": "2024323751562182658",
				"usageUserIdCode": "abc",
				"taxAmount": 2.76,
				"rowNo": "10",
				"exclTaxPrice": 10.62,
				"exclTaxAmount": 21.24,
				"unitId": "1786167660387500039",
				"unitIdCode": "abc",
				"accExclTaxAmount": 21.24,
				"accInclTaxAmount": 24,
				"quantity": 2,
				"inclTaxAmount": 24,
				"srcBillTradeTypeId": "1780959419839807508",
				"usageDeptId": "2011723623199932421",
				"usageDeptId_code": "abc",
				"srcSettlementOrderName": {
					"zh_TW": "",
					"zh_CN": "",
					"en_US": ""
				},
				"oriCurrtypeId": "1780959454188011553",
				"oriCurrtypeIdCode": "abc",
				"taxItemId": "10004",
				"taxItemId_name": "基准",
				"_status": "Unchanged",
				"remarks": {
					"zh_TW": "",
					"zh_CN": "",
					"en_US": ""
				},
				"FaToFixedDtlDescList": [
					{
						"costCenterId": "1841898503097286658",
						"costCenterId_code": "abc",
						"profitCenterId": "1841898503097286658",
						"profitCenterCode": "abc",
						"usageDeptId": "1841898503097286658",
						"usageDeptId_code": "abc",
						"projectId": "1841898503097286658",
						"projectCode": "abc",
						"wbs": "1856671575678910467",
						"wbsCode": "abc",
						"activity": 1841898503097286658,
						"activityCode": "abc",
						"proportion": 100
					}
				],
				"toFixedType": "0",
				"nonDeduTaxRate": 13,
				"assetId": "1841898503097286658",
				"assetId_code": "pkm008801250212000279",
				"assetCategoryId": "1841898503097286658",
				"assetCategoryId_categoryFullName": "房屋及建筑物",
				"usageStateId": "1780959548702982164",
				"usageStateId_name": "在用",
				"beginUseDate": "2024-12-01",
				"costProjectId": "1841898503097286658",
				"costProjectId_code": "abc",
				"srcNonDeduTaxAmount": 12.34,
				"placeId": "1841898503097286658",
				"placeId_location_code": "abc",
				"contractNo": "abc",
				"nonDeduTaxAmount": 12.34,
				"mgtCostCenterId": "1841898503097286658",
				"mgtCostCenterCode": "abc",
				"mgtProfitCenterId": "1841898503097286658",
				"mgtProfitCenterCode": "abc"
			}
		],
		"_status": "Update"
	},
	"billnum": "FaToFixed"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回转固单数据 |
| accentity | string | 否 | 会计主体 示例：2011723288189861898 |
| id | string | 否 | 转固单ID 示例：2054068607702794245 |
| ytenantId | string | 否 | 租户ID 示例：0000LKMAE85K35S5J90000 |
| code | string | 否 | 转固单编码 示例：ZGD005129 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accentity": "2011723288189861898",
		"id": "2054068607702794245",
		"ytenantId": "0000LKMAE85K35S5J90000",
		"code": "ZGD005129"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

503	异常	环境问题，刷新重试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-26

更新

请求说明

更新

请求参数 (4)

2	2025-06-26

更新

请求参数 (62)

更新

返回参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

