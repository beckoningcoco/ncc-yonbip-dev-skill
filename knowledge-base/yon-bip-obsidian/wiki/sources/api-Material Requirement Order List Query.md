---
title: "物料需求单列表查询"
apiId: "1690426439863107587"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Demand Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Demand Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料需求单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Material Demand Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/cpu/demandreq/list

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
| pageSize | string | 否 | 否 | 一页大小 示例：10 默认值：10 |
| pageNum | string | 否 | 否 | 当前页数 示例：1 默认值：1 |
| id | string | 否 | 否 | 需求申请单id 示例：123141211 |
| vbillCode | string | 否 | 否 | 需求编号（支持模糊查询） 示例：PB2206130001 |
| currencyCode | string | 否 | 否 | 币种编码 示例：人民币默认为CNY |
| reqProjectId | string | 否 | 否 | 需求项目id（id与编码同时存在时，以code为主） 示例：1457191144105967622 |
| reqProjectCode | string | 否 | 否 | 需求项目编码（id与编码同时存在时，以code为主） 示例：00000001 |
| reqOrgId | string | 是 | 否 | 需求组织id（id与编码同时存在时，以code为主） 示例：["1450503124116570113","123141241"] |
| reqOrgCode | string | 是 | 否 | 需求组织编码（id与编码同时存在时，以code为主） 示例：["org01","THZGSmdd"] |
| reqContactsId | string | 否 | 否 | 需求人id（id与编码同时存在时，以code为主） 示例：1450509618123374592 |
| reqContactsCode | string | 否 | 否 | 需求人编码（id与编码同时存在时，以code为主） 示例：00001 |
| subject | string | 否 | 否 | 需求标题（支持模糊查询） 示例：43434 |
| status | string | 是 | 否 | 申请处理阶段(2：已生效，4：待提交，5：审批中) 示例：["4"] |
| approveDate | string | 否 | 否 | 审批时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| commitDate | string | 否 | 否 | 提报日期 示例：2021-05-06|2021-05-08 |
| pubts | string | 否 | 否 | 单据创建日期 示例：2021-05-06|2021-05-08 |
| mdfDate | string | 否 | 否 | 时间戳 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| reqCycleType | string | 是 | 否 | 需求周期（1:年计划；2：季度计划；3：月计划；4：紧急计划） 示例：["1","2"] |
| reqCycleYear | string | 否 | 否 | 周期年 示例：1 |
| reqCycleSeason | string | 否 | 否 | 周期季 示例：1 |
| reqCycleMonth | string | 否 | 否 | 周期月 示例：1 |
| transactionTypeId | string | 否 | 否 | 交易类型id（id与编码同时存在时，以code为主） 示例：54125135121 |
| transactionTypeCode | string | 否 | 否 | 交易类型编码（id与编码同时存在时，以code为主） 示例：01 |
| singleBudgetApplyid | string | 否 | 否 | 单项预算申请单id 示例：1709582724211671048 |
| isSum | boolean | 否 | 否 | 是否按照表头查询：true:表头、false:表头+明细 示例: false 默认值: true 示例：true 默认值：true |

## 3. 请求示例

Url: /yonbip/cpu/demandreq/list?access_token=访问令牌
Body: {
	"pageSize": "10",
	"pageNum": "1",
	"id": "123141211",
	"vbillCode": "PB2206130001",
	"currencyCode": "人民币默认为CNY",
	"reqProjectId": "1457191144105967622",
	"reqProjectCode": "00000001",
	"reqOrgId": [
		"1450503124116570113",
		"123141241"
	],
	"reqOrgCode": [
		"org01",
		"THZGSmdd"
	],
	"reqContactsId": "1450509618123374592",
	"reqContactsCode": "00001",
	"subject": "43434",
	"status": [
		"4"
	],
	"approveDate": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"commitDate": "2021-05-06|2021-05-08",
	"pubts": "2021-05-06|2021-05-08",
	"mdfDate": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"reqCycleType": [
		"1",
		"2"
	],
	"reqCycleYear": "1",
	"reqCycleSeason": "1",
	"reqCycleMonth": "1",
	"transactionTypeId": "54125135121",
	"transactionTypeCode": "01",
	"singleBudgetApplyid": "1709582724211671048",
	"isSum": true
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
| code | string | 否 | 状态码 示例：200 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 数据 |
| pageCount | long | 否 | 总页数 示例：2 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| recordList | object | 是 | 需求申请单列表 |
| recordCount | long | 否 | 结果总数 示例：15 |
| pageSize | long | 否 | 页面大小 示例：10 |
| endPageIndex | long | 否 | 最后页码 示例：2 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageCount": 2,
		"pageIndex": 1,
		"recordList": [
			{
				"vbillCode": "PB230104000001",
				"planDeptId": "1504702132623245313",
				"transactionTypeId": "150470213876519812",
				"transactionTypeId_name": "通用需求申请",
				"isSupplyPlan": 0,
				"subject": "12345",
				"reqdeptId": "1504702132623245313",
				"reqContactsId": "1504702519146184706",
				"reqPurpose": "这是用途",
				"memo": "这是备注",
				"praybillFilesId": "2d069bd9-2238-43f6-b7a1-bc26f3b139c8",
				"id": 3106410445558016,
				"reqOrgId": "1504701917874880515",
				"pubts": "2023-01-01 11:00:00",
				"ts": "2023-01-01 11:00:00",
				"reqCycleMonth": "1",
				"reqCycleSeason": "1",
				"reqCycleYear": "2",
				"reqCycleType": "1",
				"commitorId": 1234141,
				"commitorName": "张采购",
				"approveDate": "2023-01-01",
				"approverId": 124124,
				"approverName": "张采购",
				"reqUapProjectId": "1515282913378697216",
				"planPsnId_name": "张采购",
				"planPsnId": "1504702519146184706",
				"singleBudgetApplyid": 12412412,
				"reqContactsId_name": "张采购",
				"reqdeptId_name": "采购部",
				"commitDate": "2023-01-02",
				"reqUapProjectId_name": "ZY曙光项目",
				"reqOrgId_name": "YB自建",
				"reqBudgetMny": 0,
				"planDeptId_name": "采购部",
				"phone": "18989999102",
				"planTotalMny": 0,
				"currencyCode": "CNY",
				"status": "5"
			}
		],
		"recordCount": 15,
		"pageSize": 10,
		"endPageIndex": 2,
		"beginPageIndex": 1
	}
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

