---
title: "合同信息详情查询"
apiId: "1858251505282842626"
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

# 合同信息详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Registration (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contract/detail/detailbyId

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 合同id    示例: 1858682436506353673 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| children | object | 是 | 否 | 子表 |
| alias | string | 否 | 否 | 子表编码（分别是clm_contract_rectermList（收款协议），clm_appointmentList（履约事项），clm_contract_paytermList（付款协议），clm_contract_counterpartList（合同相对方），clm_contract_itemList（合同详细信息），clmEventRecordList（大事记信息），clm_contract_status_flow（合同状态流水），clmContractRiskRecordList（合同风险记录）） 示例：clm_appointmentList |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/detail/detailbyId?access_token=访问令牌&id=1858682436506353673
Body: {
	"children": [
		{
			"alias": "clm_appointmentList"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| status | string | 否 | 合同状态 示例：1 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| busiObj | string | 否 | 业务对象 示例：clmContract |
| memo | string | 否 | 备注 示例：合同备注 |
| ctSummary | string | 否 | 合同概要 示例：合同概要 |
| type | string | 否 | 合同类型id，来源档案：iuap-apcom-contract.contractTypeTreeRef 示例：1852916168056635392 |
| valiDate | string | 否 | 合同生效日期 示例：2023-11-09 |
| signSubjectId | string | 否 | 签约组织id，来源档案：aa.baseorg.OrgMV 示例：1809173068584583170 |
| planInvallidate | string | 否 | 计划失效日期 示例：2023-11-16 |
| urgentLevel | string | 否 | 紧急程度 示例：1 |
| signType | string | 否 | 签署方式 示例：0 |
| clm_contract_counterpartList | object | 是 | 合同相对方 |
| id | string | 否 | 合同id 示例：1858893345170391047 |
| clm_contract_rectermList | object | 是 | 收款协议 |
| clm_contract_paytermList | object | 是 | 付款协议 |
| deptId | string | 否 | 部门id，来源档案：bd.adminOrg.AdminOrgVO 示例：1809173334883565572 |
| version | string | 否 | 合同版本号 示例：0 |
| secretLevel | string | 否 | 密级 示例：0 |
| concludeType | string | 否 | 签订类型 示例：1 |
| personId | string | 否 | 承办人id，来源档案：bd.staff.StaffNew 示例：1857970073239552010 |
| ctPeriod | string | 否 | 合同期限 示例：0 |
| clm_contract_itemList | object | 是 | 标的物明细 |
| orgId | string | 否 | 主组织id，来源档案：ucf-org-center.org_pure_tree_ref 示例：1809173068584583170 |
| contractFileStatus | string | 否 | 合同归档状态 示例：0 |
| econtractTempId | string | 否 | 合同模板id，来源档案：DZHTFW.econtract.econtractTemplate 示例：1810748342340681731 |
| ctClass | string | 否 | 合同类别 示例：1 |
| creator | string | 否 | 创建人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| isBackDate | string | 否 | 是否倒签 示例：0 |
| businessFileId | string | 否 | 合同文本附件id |
| importantLevel | string | 否 | 重要程度 示例：2 |
| reDirection | string | 否 | 收支方向 示例：0 |
| clm_appointmentList | object | 是 | 履约计划 |
| signAddress | string | 否 | 签订地点 示例：北京 |
| createMethod | string | 否 | 合同生成方式 示例：1 |
| signDate | string | 否 | 合同签订日期 示例：2023-11-09 |
| settleAccountType | string | 否 | 结算方式id，来源档案：aa.settlemethod.SettleMethod 示例：1809147754069360760 |
| invaliDate | string | 否 | 合同终止日期 示例：2023-11-16 |
| maintenanceType | string | 否 | 维护类型 示例：1 |
| lawType | string | 否 | 法律类别id，来源档案：DZHTFW.econtract.contractLegalType 示例：1846082600192442376 |
| performAddress | string | 否 | 履约地点 示例：用友 |
| ytenantId | string | 否 | 租户id 示例：0000LM4K5NIS40WWEG0000 |
| isHaveTax | string | 否 | 合同金额是否含税 示例：1 |
| settleOrgid | string | 否 | 结算组织id，来源档案：org.func.FinanceOrg 示例：1810592246039314440 |
| code | string | 否 | 合同编码 示例：005468 |
| title | string | 否 | 合同名称 示例：我的组织翻1译2334 |
| planValidate | string | 否 | 计划生效日期 示例：2023-11-16 |
| finalizeStatus | string | 否 | 定稿状态 示例：0 |
| econtractVersion | string | 否 | 合同模板版本号 示例：1810748342340681732 |
| isOpenContract | string | 否 | 是否开口合同 示例：0 |
| bustype | string | 否 | 交易类型id，来源档案：bd.bill.TransType 示例：1810505376027639818 |
| bWatermark | string | 否 | 是否无水印 示例：0 |
| mny | long | 否 | 合同金额 示例：10 |
| isMaterial | string | 否 | 物料分类合同 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"status": "1",
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
		"clm_contract_counterpartList": [
			{
				"supplierId": "1815801431496065031",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"dr": 0,
				"id": "1858893345170491047-",
				"contractId": "1858893345170391047",
				"merchantType": "2"
			}
		],
		"id": "1858893345170391047",
		"clm_contract_rectermList": [
			{
				"memo": "收款协议备注",
				"type": "1809147204306731326",
				"planPaymentMny": 2,
				"paymentScale": 0.2,
				"id": "1858893345170391049",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPaymentDate": "2023-11-09 00:00:00",
				"condition": "收款",
				"upToDate": "2023-11-09 00:00:00",
				"contractId": "1858893345170391047",
				"mny": 200
			}
		],
		"clm_contract_paytermList": [
			{
				"memo": "付款协议备注",
				"type": "1809147204306731328",
				"payMoney": 100,
				"id": "1858893345170391050",
				"payCondition": "付款",
				"payRatio": 0.1,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPayMoney": 1,
				"planPayDate": "2023-11-09",
				"contractId": "1858893345170391047",
				"payDate": "2023-11-09"
			}
		],
		"deptId": "1809173334883565572",
		"version": "0",
		"secretLevel": "0",
		"concludeType": "1",
		"personId": "1857970073239552010",
		"ctPeriod": "0",
		"clm_contract_itemList": [
			{
				"num": 1,
				"taxprice": 10,
				"price": 9.85,
				"unitId": "1835815764334477318",
				"id": "1858893345170391053",
				"tax": 0.15,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"materialId": "1835816348468903942",
				"taxmny": 10,
				"mny": 9.85,
				"contractId": "1858893345170391047",
				"materialId___code": "0001000001",
				"unitId___code": "A001",
				"taxRate.ntaxrate": "1.5",
				"taxRate___code": "VATR6"
			}
		],
		"orgId": "1809173068584583170",
		"contractFileStatus": "0",
		"econtractTempId": "1810748342340681731",
		"ctClass": "1",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"isBackDate": "0",
		"businessFileId": "",
		"importantLevel": "2",
		"reDirection": "0",
		"clm_appointmentList": [
			{
				"accomRemark": "计划备注",
				"endDate": "2023-11-10",
				"accomState": true,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"contractId": "1858893345170391047",
				"name": "我的计划",
				"id": "1858893345170391051",
				"planEndDate": "2023-11-10"
			}
		],
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
		"finalizeStatus": "0",
		"econtractVersion": "1810748342340681732",
		"isOpenContract": "0",
		"bustype": "1810505376027639818",
		"bWatermark": "0",
		"mny": 10,
		"isMaterial": "0"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务异常	异常信息

999	接口调用错误	异常信息,请联系管理员

1001001000003	参数错误	异常信息,请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-14

更新

请求说明

新增

返回参数 status

返回示例新增合同状态字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

