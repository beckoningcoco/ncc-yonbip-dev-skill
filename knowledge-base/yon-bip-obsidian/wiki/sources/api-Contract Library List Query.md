---
title: "合同库列表查询"
apiId: "2031957832610349062"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Center"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Center (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contractLib/list

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
| page | object | 否 | 否 | 分页 |
| pageIndex | long | 否 | 否 | 起始页 示例：1 默认值：1 |
| pageSize | long | 否 | 否 | 页数 示例：10 默认值：10 |
| extraCondition | object | 否 | 否 | 查询方案 |
| conditions | object | 是 | 否 | 条件组 |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contractLib/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"extraCondition": {
		"conditions": [
			{
				"items": [
					{
						"name": "title",
						"op": "like",
						"v1": "234567"
					}
				],
				"op": "and"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页数量 示例：10 |
| recordCount | long | 否 | 返回数据的数量 示例：1 |
| recordList | object | 是 | 返回列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"signAddress": "北京",
				"type_name": "1102",
				"bustype_name": "合同配置测试",
				"creator_userName": "默认用户",
				"memo": "合同备注",
				"ctSummary": "合同概要",
				"signDate": "2023-11-09",
				"valiDate": "2023-11-09",
				"type": "1852916168056635392",
				"signSubjectId": "1809173068584583170",
				"orgId_name": "用友网络",
				"planInvallidate": "2023-11-16",
				"settleAccountType": "1809147754069360760",
				"urgentLevel": "1",
				"signType": "0",
				"invaliDate": "2023-11-16",
				"id": "1866163316061634568",
				"currencyId": "1809147204294672426",
				"maintenanceType": "1",
				"lawType": "1846082600192442376",
				"performAddress": "用友",
				"physicalStamp": "1860937208466767878",
				"deptId": "1809173334883565572",
				"deptId_name": "项目云",
				"settleOrgid_name": "云之羽",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"secretLevel": "0",
				"version": "0",
				"concludeType": "1",
				"settleAccountType_name": "票据结算",
				"isHaveTax": "1",
				"personId": "1857970073239552010",
				"ctPeriod": "1",
				"settleOrgid": "1810592246039314440",
				"status": "1",
				"physicalStamp_name": "123321",
				"code": "005494",
				"title": "234567",
				"finalizeStatus": "0",
				"planValidate": "2023-11-16",
				"currencyId_name": "欧元",
				"orgId": "1809173068584583170",
				"lawType_name": "收入合同",
				"contractFileStatus": "0",
				"ctClass": "1",
				"pubts": "2023-11-20 11:13:24",
				"signSubjectId_name": "用友网络",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"settleAccountType_name3": "票據結算",
				"importantLevel": "2",
				"bustype": "1810505376027639818",
				"reDirection": "0",
				"createTime": "2023-11-20 11:13:23",
				"sourceSys": "6",
				"mny": 10,
				"isMaterial": "0",
				"personId_name": "李洪根"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务异常	异常信息

999	接口调用错误	异常信息，请联系管理员

1001001000003	参数错误	异常信息，请检查数据


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

