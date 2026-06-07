---
title: "客户申请单列表查询"
apiId: "1654831632098525184"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户申请单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerApply/list

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
| pageIndex | long | 否 | 是 | 页序号 示例：1 |
| pageSize | long | 否 | 是 | 分页大小 示例：10 |
| merchantCode | string | 否 | 否 | 客户编码 示例：001 |
| merchantName | string | 否 | 否 | 客户名称 示例：客户名称 |
| applyType | string | 否 | 否 | 申请类型 新增：0 变更：1 示例：0 |
| applyCode | string | 否 | 否 | 申请编码 示例：002 |
| bizOperatorCode | string | 否 | 否 | 申请业务员；填写code 示例：code01 |
| bizOperator | string | 否 | 否 | 申请业务员；填写id；来源档案为员工档案； 示例：123456 |
| createDate | string | 否 | 否 | 申请日期；例如：2022-02-01 示例：2022-02-01 |
| auditor | string | 否 | 否 | 审核人 名称 示例：测试名称 |
| effectType | string | 否 | 否 | 生效类型0:立即生效 1:未来生效 示例：0 |
| creator | string | 否 | 否 | 创建人 名称 示例：创建名称 |
| effectStatus | string | 否 | 否 | 生效状态 0：未处理，1：处理中，2：成功，3：失败 示例：0 |
| effectTime | string | 否 | 否 | 生效时间 例如：2022-02-01 00:00:00 示例：2023-02-01 00:00:00 |
| verifyState | string | 否 | 否 | 审批状态 0：开立，1：审批中，2：审批完成，3：流程终止，4：驳回 示例：0 |
| applyDepartmentCode | string | 否 | 否 | 申请部门；填写code 示例：code01 |
| applyDepartment | string | 否 | 否 | 申请部门；填写id；来源档案为部门档案 示例：123456 |
| principalProfessSalesman | string | 否 | 否 | 负责人 名称 示例：负责人 |
| principalSpecialManagementDep | string | 否 | 否 | 负责部门 名称 示例：负责部门 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，大于(包含)当前值 示例：2024-04-10 14:50:00 |
| timestamp | string | 否 | 否 | 时间戳 例如：2023-02-08 00:00:00 示例：2023-02-08 00:00:00 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerApply/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"merchantCode": "001",
	"merchantName": "客户名称",
	"applyType": "0",
	"applyCode": "002",
	"bizOperatorCode": "code01",
	"bizOperator": "123456",
	"createDate": "2022-02-01",
	"auditor": "测试名称",
	"effectType": "0",
	"creator": "创建名称",
	"effectStatus": "0",
	"effectTime": "2023-02-01 00:00:00",
	"verifyState": "0",
	"applyDepartmentCode": "code01",
	"applyDepartment": "123456",
	"principalProfessSalesman": "负责人",
	"principalSpecialManagementDep": "负责部门",
	"pubts": "2024-04-10 14:50:00",
	"timestamp": "2023-02-08 00:00:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求返回的数据 |
| pageIndex | long | 否 | 页序号 示例：0 |
| pageSize | long | 否 | 分页大小 示例：10 |
| recordCount | long | 否 | 总记录数 示例：0 |
| recordList | object | 是 | 结果列表 |
| pageCount | long | 否 | 分页数量 示例：0 |
| beginPageIndex | long | 否 | 起始页序号 示例：1 |
| endPageIndex | long | 否 | 截至页序号 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"applyType": "0",
				"verifystate": 0,
				"applicationOrg_Name": "宝可梦宇宙aa",
				"bizOperator_Name": "test12",
				"applyDepartment": "2022081800003",
				"creatorId": 1525641755939569667,
				"customerData": "{\"invoicingCustomerss\":[{\"isDefault\":true,\"hasDefaultInit\":true,\"_id\":\"rowId_332\",\"_status\":\"Insert\"}],\"merchantRole!_status\":\"Insert\",\"transType_Name\":\"通用客户\",\"merchantRole!settlementMethod\":\"0\",\"source\":0,\"merchantAppliedDetail!stopstatus\":false,\"merchantAppliedDetail!frozenState\":0,\"merchantContacterInfos\":[],\"taxPayingCategories\":0,\"merchantRole!businessRole\":\"\",\"internalOrg\":false,\"merchantsManager!_status\":\"Insert\",\"orgName\":\"12--123\",\"invoicingCustomers_Name\":\"12--123\",\"merchantAgentFinancialInfos\":[],\"merchantAppliedDetail!payway\":99,\"merchantAgentInvoiceInfos\":[],\"_status\":\"Insert\",\"shortname\":{\"zh_CN\":\"12--123\"},\"scopeModel\":0,\"merchantAppliedDetail!searchcode\":\"12--123\",\"transType\":\"1525643705855772963\",\"merchantAttachments\":[],\"name\":{\"zh_CN\":\"12--123\"},\"merchantCharacter__isdealer1\":false,\"code\":\"00000000013431\",\"merchantBusinessRoleTime\":[{\"hasDefaultInit\":true,\"businessRole\":\"2\",\"_id\":\"rowId_333\",\"_status\":\"Insert\",\"RoleTimeStopstatus\":true}],\"merchantRole!merchantOptions\":\"false\",\"principals\":[{\"isDefault\":true,\"hasDefaultInit\":true,\"specialManagementDep_code\":\"false\",\"_id\":\"rowId_331\",\"_status\":\"Insert\"}],\"licenseType\":0,\"merchantCharacter__isdealer\":false,\"createOrg_code\":\"pkm00\",\"internalOrgId_Name\":\"\",\"merchantCharacter__hk_kfda_sfjxs\":false,\"customerAreas\":[{\"isDefault\":true,\"hasDefaultInit\":true,\"_id\":\"rowId_330\",\"_status\":\"Insert\"}],\"enterpriseName\":\"12--123\",\"merchantRole!toBImmigrationMode\":\"0\",\"merchantCharacter\":{\"inservicefeeflag\":false,\"isdealer1\":false,\"hk_kfda_sfjxs\":false,\"Q1206001\":false,\"isdealer\":false},\"merchantCharacter__inservicefeeflag\":false,\"merchantCorpImages\":[],\"createOrg\":\"1525652227072458756\",\"verfyMark\":0,\"customerDefine!_status\":\"Insert\",\"retailInvestors\":false,\"merchantAppliedDetail!signBack\":false,\"enterpriseNature\":0,\"merchantApplyRanges\":[{\"hasDefaultInit\":true,\"orgName\":\"宝可梦宇宙aa\",\"rangeType\":1,\"orgCode\":\"pkm00\",\"isApplied\":true,\"_id\":\"rowId_334\",\"_status\":\"Insert\",\"isCreator\":true,\"orgId\":\"1525652227072458756\",\"tenant\":2909930715861584}],\"merchantCharacter__Q1206001\":false,\"createOrg_name\":\"宝可梦宇宙aa\",\"createTime\":\"2023-01-18 10:29:27\",\"merchantAddressInfos\":[],\"merchantRole!cardType\":\"0\",\"merchantsManager!countryCode\":\"86\",\"merchantAppliedDetail!_status\":\"Insert\"}",
				"merchantName": "12--123",
				"bizOperator": "1530682312368324613",
				"id": 1639036898365145090,
				"pubts": "2023-01-18 10:37:19",
				"createDate": "2023-01-18 00:00:00",
				"merchantCode": "00000000013431",
				"creator": "yonyou2023",
				"applyDepartment_Name": "由基拉",
				"auditor": "默认用户",
				"effectType": "0",
				"effectStatus": "0",
				"applicationOrg": "1525652227072458756",
				"auditTime": "2023-01-18 10:30:32",
				"createTime": "2023-01-18 10:30:08",
				"applyCode": "20230118000305000000",
				"status": 0
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确


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

