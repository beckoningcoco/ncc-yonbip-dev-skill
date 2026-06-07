---
title: "成本结转结构新增/编辑"
apiId: "2341431073941487621"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Carry-forward Structure"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Carry-forward Structure]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本结转结构新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Cost Carry-forward Structure (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/costcarry/save

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
| data | object | 否 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | id 示例：1526276921384501257 |
| code | string | 否 | 否 | code 示例：JZJG-ZHJM-009 |
| name | string | 否 | 否 | name 示例：结转结构测试0101 |
| accbookTypeId | string | 否 | 否 | 账簿类型ID |
| subjectId | string | 否 | 否 | 科目表ID 示例：1526225313130348545 |
| factorId | string | 否 | 否 | 要素表ID，设置独立要素的时候会用到 |
| accbookId | string | 否 | 否 | 账簿ID |
| structurePurpose | string | 否 | 否 | 结构用途枚举，完工结转：CompletionCarryover,费用分配：CostAllocation,成本跨组织转移：CostCrossOrgTransfer,成本结算：CostSettlement,闲置产能结转：IdleCapacityTransfer 示例：CostSettlement |
| orderCategory | string | 否 | 否 | 成本对象明细类型枚举，单品订单：SCOrder,采购订单：DPOrder,维修订单：WXOrder,产品成本对象：XMOrder,项目订单：PrcObject 示例：XMOrder |
| settleMode | string | 否 | 否 | 结算方式枚举，按维度结算：contentSettle,按明细结算：detailSettle,按方法结算：methodSettle 示例：detailSettle |
| costCarryLines | object | 是 | 否 | costCarryLines |
| _status | string | 否 | 否 | 枚举值：Update，Insert，需要调用方赋值 示例：Update |

## 3. 请求示例

Url: /yonbip/FCC/costcarry/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1526276921384501257",
		"code": "JZJG-ZHJM-009",
		"name": "结转结构测试0101",
		"accbookTypeId": "",
		"subjectId": "1526225313130348545",
		"factorId": "",
		"accbookId": "",
		"structurePurpose": "CostSettlement",
		"orderCategory": "XMOrder",
		"settleMode": "detailSettle",
		"costCarryLines": [
			{
				"id": "2086860631370104841",
				"pId": "1526276921384501257",
				"costType": "正常成本",
				"elementFromId": "1673912754371559434",
				"elementFromCode": "510102",
				"elementToId": "1806179072564789259",
				"elementToCode": "510102",
				"elementGroupId": "",
				"carryForwardObjectType": ",维修订单 ：OBJECT_TYPE_XS_ORDER",
				"carryForwardType": "DetOutAndSumIn",
				"orderTypeId": "2283993505655685128",
				"costCenterClassId": "",
				"elementExportId": "",
				"elementImportId": "1806179450521911300",
				"_status": "Update"
			}
		],
		"_status": "Update"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | id 示例：1526276921384501257 |
| code | string | 否 | code 示例：JZJG-ZHJM-009 |
| name | string | 否 | name 示例：结转结构测试0101 |
| subjectId | string | 否 | subjectId 示例：1526225313130348545 |
| structurePurpose | string | 否 | structurePurpose 示例：CostSettlement |
| orderCategory | string | 否 | orderCategory 示例：XMOrder |
| settleMode | string | 否 | settleMode 示例：detailSettle |
| costCarryLines | object | 是 | costCarryLines |
| modifier | string | 否 | modifier 示例：u8c_vip管理员 |
| modifierId_name | string | 否 | modifierId_name 示例：u8c_vip管理员 |
| modifierId | string | 否 | modifierId 示例：1525641755939569667 |
| modifyTime | string | 否 | modifyTime 示例：2025-08-21 16:47:41 |
| modifyDate | string | 否 | modifyDate 示例：2025-08-21 16:47:41 |
| pubts | string | 否 | pubts 示例：2025-08-21 16:47:41 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：2909930715861584 |
| ytenant | string | 否 | ytenant 示例：0000L6YQ8AVLFUZPXD0000 |
| traceId | string | 否 | traceId 示例：a134f1fa446404f6 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "1526276921384501257",
		"code": "JZJG-ZHJM-009",
		"name": "结转结构测试0101",
		"subjectId": "1526225313130348545",
		"structurePurpose": "CostSettlement",
		"orderCategory": "XMOrder",
		"settleMode": "detailSettle",
		"costCarryLines": [
			{
				"id": "2086860631370104841",
				"pId": "1526276921384501257",
				"costType": "正常成本",
				"elementFromId": "1673912754371559434",
				"elementFromCode": "510102",
				"elementToId": "1806179072564789259",
				"elementToCode": "510102",
				"carryForwardObjectType": "OBJECT_TYPE_SPECIAL_ORDER",
				"carryForwardType": "DetOutAndSumIn",
				"orderTypeId": "2283993505655685128",
				"elementImportId": "1806179450521911300",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"modifier": "u8c_vip管理员",
		"modifierId_name": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyTime": "2025-08-21 16:47:41",
		"modifyDate": "2025-08-21 16:47:41",
		"pubts": "2025-08-21 16:47:41",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000"
	},
	"traceId": "a134f1fa446404f6",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

