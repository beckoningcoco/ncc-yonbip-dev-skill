---
title: "合同信息状态变更"
apiId: "1982072912734060551"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Registration"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同信息状态变更

> `ContentType	application/json` 请求方式	POST | 分类: Contract Registration (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/CLMS/v1.0/contract/updateStatus

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 合同数据 |
| id | string | 否 | 是 | 合同 id 示例：1985017284638277638 |
| status | string | 否 | 是 | 当前合同状态（8：生效；9：冻结；10：办结；11：终止） 示例：8 默认值：8 |
| clm_contract_status_flowList | object | 是 | 是 | 合同流程记录(每次只能在数组中添加一个对象，用于想修改结果的最终状态，填写多个，以第一个为准) |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/updateStatus?access_token=访问令牌
Body: {
	"data": {
		"id": "1985017284638277638",
		"status": "8",
		"clm_contract_status_flowList": [
			{
				"operation": "13",
				"cause": "冻结合同"
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
| busiObj | string | 否 | 业务对象 示例：clmContract |
| memo | string | 否 | 备注 示例：合同备注 |
| ctSummary | string | 否 | 合同概要 示例：合同概要 |
| type | string | 否 | 合同类型id，来源档案：iuap-apcom-contract.contractTypeTreeRef 示例：1852916168056635392 |
| valiDate | string | 否 | 合同生效日期 示例：2023-11-09 |
| signSubjectId | string | 否 | 签约组织id，来源档案：aa.baseorg.OrgMV 示例：1809173068584583170 |
| planInvallidate | string | 否 | 计划失效日期 示例：2023-11-16 |
| urgentLevel | string | 否 | 紧急程度 1-一般 2-紧急 3-特急 示例：1 |
| signType | string | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：0 |
| id | string | 否 | 合同id 示例：1858893345170391047 |
| version | string | 否 | 合同版本号 示例：0 |
| secretLevel | string | 否 | 密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0 |
| concludeType | string | 否 | 签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 |
| personId | string | 否 | 承办人id，来源档案：bd.staff.StaffNew 示例：1857970073239552010 |
| ctPeriod | string | 否 | 合同期限 0-固定期限 1-无固定期限 示例：0 |
| orgId | string | 否 | 主组织id，来源档案：ucf-org-center.org_pure_tree_ref 示例：1809173068584583170 |
| contractFileStatus | string | 否 | 合同归档状态 0-未归档 1-已归档 示例：0 |
| econtractTempId | string | 否 | 合同模板id 示例：1810748342340681731 |
| ctClass | string | 否 | 合同性质 1-普通合同 2-框架协议 示例：1 |
| creator | string | 否 | 创建人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| isBackDate | string | 否 | 是否倒签 示例：0 |
| businessFileId | string | 否 | 合同文本附件id |
| importantLevel | string | 否 | 重要程度 1-一般 2-普通 3-重大 示例：2 |
| reDirection | string | 否 | 收支方向 0-无 1-收款 2-付款 示例：0 |
| signAddress | string | 否 | 签订地点 示例：北京 |
| createMethod | string | 否 | 合同生成方式 示例：1 |
| signDate | string | 否 | 合同签订日期 示例：2023-11-09 |
| settleAccountType | string | 否 | 结算方式id，来源档案：aa.settlemethod.SettleMethod 示例：1809147754069360760 |
| invaliDate | string | 否 | 合同终止日期 示例：2023-11-16 |
| maintenanceType | string | 否 | 维护类型 示例：1 |
| lawType | string | 否 | 法律类别id，来源档案：DZHTFW.econtract.contractLegalType 示例：1846082600192442376 |
| performAddress | string | 否 | 履约地点 示例：用友 |
| ytenantId | string | 否 | 租户id 示例：0000LM4K5NIS40WWEG0000 |
| isHaveTax | string | 否 | 合同金额是否含税 1-是 0-否 示例：1 |
| settleOrgid | string | 否 | 结算组织id，来源档案：org.func.FinanceOrg 示例：1810592246039314440 |
| code | string | 否 | 合同编码 示例：005468 |
| title | string | 否 | 合同名称 示例：我的组织翻1译2334 |
| planValidate | string | 否 | 计划生效日期 示例：2023-11-16 |
| econtractVersion | string | 否 | 合同模板版本号 示例：1810748342340681732 |
| isOpenContract | string | 否 | 是否开口合同 示例：0 |
| bustype | string | 否 | 交易类型id，来源档案：bd.bill.TransType 示例：1810505376027639818 |
| bWatermark | string | 否 | 是否无水印 示例：0 |
| mny | BigDecimal | 否 | 合同金额 示例：10 |
| isMaterial | string | 否 | 物料分类合同 1-是 0-否 示例：0 |
| clm_contract_status_flowList | object | 是 | 状态流转记录 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "clmContract",
		"memo": "合同备注",
		"ctSummary": "合同概要",
		"type": "1852916168056635392",
		"valiDate": "2023-11-09",
		"signSubjectId": "1809173068584583170",
		"planInvallidate": "2023-11-16",
		"urgentLevel": "1",
		"signType": "0",
		"id": "1858893345170391047",
		"version": "0",
		"secretLevel": "0",
		"concludeType": "1",
		"personId": "1857970073239552010",
		"ctPeriod": "0",
		"orgId": "1809173068584583170",
		"contractFileStatus": "0",
		"econtractTempId": "1810748342340681731",
		"ctClass": "1",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"isBackDate": "0",
		"businessFileId": "",
		"importantLevel": "2",
		"reDirection": "0",
		"signAddress": "北京",
		"createMethod": "1",
		"signDate": "2023-11-09",
		"settleAccountType": "1809147754069360760",
		"invaliDate": "2023-11-16",
		"maintenanceType": "1",
		"lawType": "1846082600192442376",
		"performAddress": "用友",
		"ytenantId": "0000LM4K5NIS40WWEG0000",
		"isHaveTax": "1",
		"settleOrgid": "1810592246039314440",
		"code": "005468",
		"title": "我的组织翻1译2334",
		"planValidate": "2023-11-16",
		"econtractVersion": "1810748342340681732",
		"isOpenContract": "0",
		"bustype": "1810505376027639818",
		"bWatermark": "0",
		"mny": 10,
		"isMaterial": "0",
		"clm_contract_status_flowList": [
			{
				"creator": "59cd9d72-38dd-456e-be27-e347bf9aa88b",
				"cause": "合同已废弃",
				"id": "",
				"operation": "15",
				"operator": "",
				"status": "10"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务异常	异常信息

999	接口调用错误	异常信息,请联系管理员

310008	参数错误	参数结构错误

500064	合同状态变更失败，不支持当前操作！	合同状态不是当前单据最新状态，或者修改动作不符合规范

500063	合同信息不存在	此 id 下的合同不存在


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

