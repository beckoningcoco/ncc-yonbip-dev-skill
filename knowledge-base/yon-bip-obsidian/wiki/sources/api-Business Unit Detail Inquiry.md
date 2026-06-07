---
title: "业务单元详情查询"
apiId: "9abe743973574ae088a85b1b0d9e2b84"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgunit/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/digitalModel/orgunit/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| parent | string | 否 | 上级组织单元id |
| enable | long | 否 | 状态, 0:未启用、1:启用、2:停用、 示例：1 |
| id | string | 否 | 主键 示例：1791386861752549384 |
| orgtype | boolean | 否 | 是否部门 2-部门，1组织 示例：false |
| shortname | object | 否 | 简称 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2023-10-20 10:00:45 |
| creator | string | 否 | 创建人 示例：ec4326d0-d490-4d5a-9105-260b51fd16d0 |
| address | object | 否 | 地址 |
| taxpayername | string | 否 | 纳税人名称 示例：孙大丽丽 |
| modifier | string | 否 | 修改人 示例：ec4326d0-d490-4d5a-9105-260b51fd16d0 |
| creator_userName | string | 否 | 创建人名称 示例：yhtmanager |
| modifier_userName | string | 否 | 修改人名称 示例：yhtmanager |
| objid | string | 否 | 外部系统主键 示例：werw324234 |
| companytype | string | 否 | 组织形态id 示例：45ebda24614f424abe5dfb04e00f737c |
| companytype_name | string | 否 | 组织形态名称 示例：公司 |
| orgid | string | 否 | 组织id 示例：1791386861752549384 |
| name | object | 否 | 名称 |
| taxpayertype | long | 否 | 纳税人类型, 1:一般纳税人、2:小规模纳税人 示例：1 |
| creationtime | string | 否 | 创建时间 示例：2023-08-11 17:08:02 |
| code | string | 否 | 编码 示例：OcIvUKZo |
| exchangerate | string | 否 | 汇率类型 示例：di8yltqe |
| description | object | 否 | 描述 |
| modifiedtime | string | 否 | 修改时间 示例：2023-08-11 17:08:05 |
| exchangerate_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| taxpayerid | string | 否 | 纳税人识别号 示例：YBSWY0165137890529 |
| assetsOrg | object | 否 | 资产组织 |
| factoryOrg | object | 否 | 工厂组织 |
| taxpayerOrg | object | 否 | 纳税主体 |
| purchaseOrg | object | 否 | 采购组织 |
| qualityOrg | object | 否 | 质检中心 |
| maintainOrg | object | 否 | 维修组织 |
| financeOrg | object | 否 | 财务组织 |
| fundsOrg | object | 否 | 资金组织 |
| sharingsOrg | object | 否 | 共享中心 |
| adminOrg | object | 否 | 行政组织 |
| inventoryOrg | object | 否 | 库存组织 |
| planOrg | object | 否 | 计划组织 |
| salesOrg | object | 否 | 销售组织 |
| settlementOrg | object | 否 | 结算中心 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"parent": "",
		"enable": 1,
		"id": "1791386861752549384",
		"orgtype": false,
		"shortname": {
			"zh_CN": "自动化_普通组织"
		},
		"pubts": "2023-10-20 10:00:45",
		"creator": "ec4326d0-d490-4d5a-9105-260b51fd16d0",
		"address": {},
		"taxpayername": "孙大丽丽",
		"modifier": "ec4326d0-d490-4d5a-9105-260b51fd16d0",
		"creator_userName": "yhtmanager",
		"modifier_userName": "yhtmanager",
		"objid": "werw324234",
		"companytype": "45ebda24614f424abe5dfb04e00f737c",
		"companytype_name": "公司",
		"orgid": "1791386861752549384",
		"name": {
			"zh_CN": "自动化_普通组织"
		},
		"taxpayertype": 1,
		"creationtime": "2023-08-11 17:08:02",
		"code": "OcIvUKZo",
		"exchangerate": "di8yltqe",
		"description": {},
		"modifiedtime": "2023-08-11 17:08:05",
		"exchangerate_name": "基准汇率",
		"taxpayerid": "YBSWY0165137890529",
		"assetsOrg": {
			"enable": 1,
			"finorgid": "1791386861752549384",
			"finorgid_name": "自动化_普通组织",
			"dr": 0,
			"id": "1791386861752549384",
			"parentid": "",
			"pubts": "2023-08-11 17:08:06",
			"effectivedate": "2023-08-11 17:08:02"
		},
		"factoryOrg": {
			"pubts": "2023-08-11 17:08:06",
			"effectivedate": "2023-08-11 17:08:02",
			"id": "1791386861752549384",
			"dr": 0,
			"enable": 1
		},
		"taxpayerOrg": {
			"id": "1791386861752549384",
			"enable": 1,
			"parentid": "",
			"pubts": "2023-08-11 17:08:06",
			"dr": 0,
			"effectivedate": "2023-08-11 17:08:02"
		},
		"purchaseOrg": {
			"id": "1791386861752549384",
			"dr": 0,
			"effectivedate": "2023-08-11 17:08:02",
			"enable": 1,
			"pubts": "2023-08-11 17:08:05"
		},
		"qualityOrg": {
			"pubts": "2023-08-11 17:08:06",
			"effectivedate": "2023-08-11 17:08:02",
			"id": "1791386861752549384",
			"dr": 0,
			"enable": 1
		},
		"maintainOrg": {
			"finorgid_name": "自动化_普通组织",
			"dr": 0,
			"enable": 1,
			"finorgid": "1791386861752549384",
			"pubts": "2023-08-11 17:08:05",
			"id": "1791386861752549384"
		},
		"financeOrg": {
			"periodschema": 1572314607377186800,
			"currency_name": "人民币",
			"parentid": "",
			"dr": 0,
			"currency": "1572314641722245659",
			"periodschema_name": "基准会计期间方案",
			"effectivedate": "2023-08-11 17:08:02",
			"id": "1791386861752549384",
			"isexternalaccounting": true,
			"pubts": "2023-08-15 12:43:59",
			"isinternalaccounting": false,
			"enable": 1
		},
		"fundsOrg": {
			"finrogid": "1234567",
			"finorgid_name": "名称",
			"parentid": "",
			"enable": 1,
			"pubts": "",
			"dr": "",
			"effectivedate": ""
		},
		"sharingsOrg": {
			"enable": 1,
			"pubts": "2023-08-11 17:08:05",
			"parentid": "",
			"dr": 0,
			"id": "1791386861752549384"
		},
		"adminOrg": {
			"employerOrg": 1,
			"effectivedate": "2023-08-11 17:08:02",
			"expirationdate": "9999-12-31 00:00:00",
			"enable": 1,
			"dr": 0,
			"id": "1791386861752549384",
			"canEmployee": 1,
			"parentid": "",
			"displayorder": 1000004,
			"pubts": "2023-08-14 14:50:40"
		},
		"inventoryOrg": {
			"finorgid_name": "自动化_普通组织",
			"pubts": "2023-08-11 17:08:05",
			"enable": 1,
			"id": "1791386861752549384",
			"dr": 0,
			"finorgid": "1791386861752549384",
			"effectivedate": "2023-08-11 17:08:02"
		},
		"planOrg": {
			"dr": 0,
			"id": "1791386861752549384",
			"effectivedate": "2023-08-11 17:08:02",
			"pubts": "2023-08-11 17:08:06",
			"enable": 1
		},
		"salesOrg": {
			"enable": 1,
			"id": "1791386861752549384",
			"parentid": "",
			"dr": 0,
			"pubts": "2023-08-15 12:43:35",
			"effectivedate": "2023-08-11 17:08:02"
		},
		"settlementOrg": {
			"id": "1791386861752549384",
			"enable": 1,
			"pubts": "2023-08-11 17:08:05",
			"dr": 0
		}
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

