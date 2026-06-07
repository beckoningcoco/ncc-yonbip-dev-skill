---
title: "业务单元保存"
apiId: "a8a71934dd03420d8c17be0ccd062e1a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元保存

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgunit/save

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
| data | object | 否 | 是 | 组织单元[org.func.BaseOrg] |
| code | string | 否 | 是 | 编码 |
| name | object | 否 | 否 | 名称,支持多语 |
| shortname | object | 否 | 否 | 简称 |
| companytype | string | 否 | 否 | 组织形态id |
| companytype_name | string | 否 | 否 | 组织形态名称 |
| parent | string | 否 | 否 | 上级组织单元id |
| parent_name | string | 否 | 否 | 上级组织单元名称 |
| orgtype | boolean | 否 | 否 | 是否部门型组织，true 是部门型组织，false 不是部门型组织，非必输，默认是改成 false |
| depttype | string | 否 | 否 | 部门性质id |
| depttype_name | string | 否 | 否 | 部门性质名称 |
| principal | string | 否 | 否 | 负责人id |
| principal_name | string | 否 | 否 | 负责人名称 |
| branchleader | string | 否 | 否 | 分管领导id |
| branchleader_name | string | 否 | 否 | 分管领导名称 |
| corpid | string | 否 | 否 | 对应合同主体id |
| corpid_name | string | 否 | 否 | 对应合同主体名称 |
| locationid | string | 否 | 否 | 工作地点id |
| locationid_name | string | 否 | 否 | 工作地点名称 |
| taxpayerid | string | 否 | 否 | 统一社会信用代码 |
| taxpayername | string | 否 | 否 | 纳税人名称 |
| usedtaxpayerid | string | 否 | 否 | 曾用统一社会信用代码 |
| usedtaxpayername | string | 否 | 否 | 曾用纳税人名称 |
| taxpayertype | string | 否 | 否 | 纳税人类型, 1:一般纳税人、2:小规模纳税人、 |
| exchangerate | string | 否 | 否 | 汇率类型id |
| exchangerate_name | string | 否 | 否 | 汇率类型名称 |
| language | string | 否 | 否 | 语言 |
| language_select_language | string | 否 | 否 | 语言 |
| timezone | string | 否 | 否 | 时区 |
| contact | string | 否 | 否 | 联系人 |
| telephone | string | 否 | 否 | 联系电话 |
| enable | int | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| id | string | 否 | 否 | 主键 新增时无需填写，修改时必填 |
| objid | string | 否 | 否 | 外部系统主键 |
| financeOrg | object | 否 | 否 | 会计主体 |
| fundsOrg | object | 否 | 否 | 资金组织 |
| salesOrg | object | 否 | 否 | 销售组织 |
| purchaseOrg | object | 否 | 否 | 采购组织 |
| inventoryOrg | object | 否 | 否 | 库存组织 |
| factoryOrg | object | 否 | 否 | 工厂组织 |
| assetsOrg | object | 否 | 否 | 资产组织 |
| taxpayerOrg | object | 否 | 否 | 纳税主体 |
| adminOrg | object | 否 | 否 | 行政组织职能 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| baseOrgExt | object | 否 | 否 | 业务单元人力信息集 |
| externalData | object | 否 | 否 | 扩展参数 |
| typelist | string | 是 | 否 | 职能类型列表,adminorg:人力组织、salesorg:销售组织、purchaseorg:采购组织、inventoryorg:库存组织、factoryorg:工厂组织、financeorg:会计主体、fundsorg：资金组织、assetsorg:资产组织、taxpayerorg:纳税主体（typelist 里职能编码不为空时，职能保存的处理以typelist 为准） |

## 3. 请求示例

Url: /yonbip/digitalModel/orgunit/save?access_token=访问令牌
Body: {
	"data": {
		"code": "",
		"name": {
			"zh_CN": "",
			"en_US": "",
			"zh_TW": ""
		},
		"shortname": {
			"zh_CN": "",
			"en_US": "",
			"zh_TW": ""
		},
		"companytype": "",
		"companytype_name": "",
		"parent": "",
		"parent_name": "",
		"orgtype": true,
		"depttype": "",
		"depttype_name": "",
		"principal": "",
		"principal_name": "",
		"branchleader": "",
		"branchleader_name": "",
		"corpid": "",
		"corpid_name": "",
		"locationid": "",
		"locationid_name": "",
		"taxpayerid": "",
		"taxpayername": "",
		"usedtaxpayerid": "",
		"usedtaxpayername": "",
		"taxpayertype": "",
		"exchangerate": "",
		"exchangerate_name": "",
		"language": "",
		"language_select_language": "",
		"timezone": "",
		"contact": "",
		"telephone": "",
		"enable": 0,
		"id": "",
		"objid": "",
		"financeOrg": {
			"parentid": "",
			"parentid_name": "",
			"currency": "",
			"currency_name": "",
			"periodschema": "",
			"periodschema_name": "",
			"isexternalaccounting": "",
			"enable": 0,
			"id": ""
		},
		"fundsOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"parentid": "",
			"parentid_name": "",
			"enable": 0,
			"id": ""
		},
		"salesOrg": {
			"parentid": "",
			"parentid_name": "",
			"enable": 0,
			"id": ""
		},
		"purchaseOrg": {
			"enable": 0,
			"id": ""
		},
		"inventoryOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"enable": 0,
			"id": ""
		},
		"factoryOrg": {
			"enable": 0,
			"id": ""
		},
		"assetsOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"enable": 0,
			"id": ""
		},
		"taxpayerOrg": {
			"parentid": "",
			"parentid_name": "",
			"enable": 0,
			"id": "",
			"isTaxpayer": 1
		},
		"adminOrg": {
			"enable": 0,
			"id": "",
			"parentorgid": "",
			"adminOrgExt": {
				"id": "",
				"approvalOrg": "",
				"approvalCode": "",
				"orgRank": "",
				"unitLevel": "",
				"authorizedStrength": "",
				"managepositionid": "",
				"listingType": ""
			}
		},
		"_status": "",
		"baseOrgExt": {
			"id": "",
			"otherPrincipal": "",
			"industry": "",
			"economyType": "",
			"enterpriseSize": "",
			"businessSegment": "",
			"establishmentDate": "",
			"creditCode": "",
			"fax": ""
		}
	},
	"externalData": {
		"typelist": [
			""
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 编码 |
| name | muti_lang | 否 | 名称,支持多语 |
| shortname | muti_lang | 否 | 简称,支持多语 |
| companytype | string | 否 | 组织形态id |
| companytype_name | string | 否 | 组织形态名称 |
| parent | string | 否 | 上级组织单元id |
| parent_name | string | 否 | 上级组织单元名称 |
| orgtype | string | 否 | 是否部门 (1部门 0非部门） |
| depttype | string | 否 | 部门性质id |
| depttype_name | string | 否 | 部门性质名称 |
| principal | string | 否 | 负责人id |
| principal_name | string | 否 | 负责人名称 |
| branchleader | string | 否 | 分管领导id |
| branchleader_name | string | 否 | 分管领导名称 |
| corpid | string | 否 | 对应合同主体id |
| corpid_name | string | 否 | 对应合同主体名称 |
| locationid | string | 否 | 工作地点id |
| locationid_name | string | 否 | 工作地点名称 |
| taxpayerid | string | 否 | 统一社会信用代码 |
| taxpayername | string | 否 | 纳税人名称 |
| usedtaxpayerid | string | 否 | 曾用统一社会信用代码 |
| usedtaxpayername | string | 否 | 曾用纳税人名称 |
| taxpayertype | string | 否 | 纳税人类型, 1:一般纳税人、2:小规模纳税人、 |
| exchangerate | string | 否 | 汇率类型id |
| exchangerate_name | string | 否 | 汇率类型名称 |
| language | string | 否 | 语言 |
| language_select_language | string | 否 | 语言 |
| timezone | string | 否 | 时区 |
| contact | string | 否 | 联系人 |
| telephone | string | 否 | 联系电话 |
| address | muti_lang | 否 | 联系地址,支持多语 |
| description | muti_lang | 否 | 描述,支持多语 |
| effectivedate | string | 否 | 生效日期,格式为yyyy-MM-dd HHmmss |
| expirationdate | string | 否 | 失效日期,格式为yyyy-MM-dd HHmmss |
| enable | int | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| id | string | 否 | 主键 |
| orgid | string | 否 | 组织单元主键 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| objid | string | 否 | 外部系统主键 |
| businessid | string | 否 | 友企联同步业务主键 |
| synchts | string | 否 | 友企联同步时间戳,格式为yyyy-MM-dd HHmmss |
| financeOrg | object | 否 | 会计主体 |
| fundsOrg | object | 否 | 资金组织 |
| salesOrg | object | 否 | 销售组织 |
| purchaseOrg | object | 否 | 采购组织 |
| inventoryOrg | object | 否 | 库存组织 |
| factoryOrg | object | 否 | 工厂组织 |
| assetsOrg | object | 否 | 资产组织 |
| taxpayerOrg | object | 否 | 纳税主体 |
| adminOrg | object | 否 | 行政组织 |
| functypes | string | 否 | 职能类型, orgunit:组织单元、salesorg:销售组织、purchaseorg:采购组织、inventoryorg:库存组织、factoryorg:工厂组织、financeorg:会计主体、assetsorg:资产组织、taxpayerorg:纳税主体、 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"name": "",
		"shortname": "",
		"companytype": "",
		"companytype_name": "",
		"parent": "",
		"parent_name": "",
		"orgtype": "",
		"depttype": "",
		"depttype_name": "",
		"principal": "",
		"principal_name": "",
		"branchleader": "",
		"branchleader_name": "",
		"corpid": "",
		"corpid_name": "",
		"locationid": "",
		"locationid_name": "",
		"taxpayerid": "",
		"taxpayername": "",
		"usedtaxpayerid": "",
		"usedtaxpayername": "",
		"taxpayertype": "",
		"exchangerate": "",
		"exchangerate_name": "",
		"language": "",
		"language_select_language": "",
		"timezone": "",
		"contact": "",
		"telephone": "",
		"address": "",
		"description": "",
		"effectivedate": "",
		"expirationdate": "",
		"enable": 0,
		"id": "",
		"orgid": "",
		"pubts": "",
		"objid": "",
		"businessid": "",
		"synchts": "",
		"financeOrg": {
			"parentid": "",
			"parentid_name": "",
			"currency": "",
			"currency_name": "",
			"periodschema": "",
			"periodschema_name": "",
			"isexternalaccounting": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"fundsOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"parentid": "",
			"parentid_name": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"salesOrg": {
			"parentid": "",
			"parentid_name": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"purchaseOrg": {
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"inventoryOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"factoryOrg": {
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"assetsOrg": {
			"finorgid": "",
			"finorgid_name": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": ""
		},
		"taxpayerOrg": {
			"parentid": "",
			"parentid_name": "",
			"effectivedate": "",
			"expirationdate": "",
			"enable": 0,
			"id": "",
			"pubts": "",
			"dr": "",
			"isTaxpayer": 1
		},
		"adminOrg": {
			"enable": 0,
			"id": "",
			"parentorgid": ""
		},
		"functypes": ""
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000001

编码已存在


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-14

更新

请求说明

新增

请求参数 parentid

更新

请求参数 (45)

删除

请求参数 (9)

删除

返回参数 (12)

新增

异常码 000-545-000001

2	2025-09-04

新增

请求参数 (20)

增加信息集

3	2025-07-02

新增

请求参数 isTaxpayer

新增

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

