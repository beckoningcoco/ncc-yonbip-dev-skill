---
title: "部门升级为组织"
apiId: "a7df40a6444c4917a3bfac3e6c00fb9d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门升级为组织

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/upgrade

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
| name | muti_lang | 否 | 是 | 名称,支持多语 |
| shortname | muti_lang | 否 | 否 | 简称,支持多语 |
| companytype | string | 否 | 否 | 组织形态id |
| parent | string | 否 | 否 | 上级组织单元id |
| depttype | string | 否 | 否 | 部门性质id |
| principal | string | 否 | 否 | 负责人id |
| branchleader | string | 否 | 否 | 分管领导id |
| corpid | string | 否 | 否 | 对应合同主体id |
| locationid | string | 否 | 否 | 工作地点id |
| taxpayerid | string | 否 | 否 | 纳税人识别号 |
| taxpayername | string | 否 | 否 | 纳税人名称 |
| usedtaxpayerid | string | 否 | 否 | 曾用纳税人识别号 |
| usedtaxpayername | string | 否 | 否 | 曾用纳税人名称 |
| taxpayertype | string | 否 | 否 | 纳税人类型, 1:一般纳税人、2:小规模纳税人、 |
| exchangerate | string | 否 | 否 | 汇率类型id |
| contact | string | 否 | 否 | 联系人 |
| telephone | string | 否 | 否 | 联系电话 |
| address | muti_lang | 否 | 否 | 联系地址,支持多语 |
| description | muti_lang | 否 | 否 | 描述,支持多语 |
| effectivedate | string | 否 | 否 | 生效日期,格式为yyyy-MM-dd HHmmss |
| expirationdate | string | 否 | 否 | 失效日期,格式为yyyy-MM-dd HHmmss |
| enable | int | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| id | string | 否 | 是 | 主键id |
| orgid | string | 否 | 是 | 组织单元主键id,同主键id |
| objid | string | 否 | 否 | 友企联同步主键 |
| businessid | string | 否 | 否 | 友企联同步业务主键 |
| adminOrg | object | 否 | 是 | 人力资源组织 |
| financeOrg | object | 否 | 否 | 会计主体 |
| salesOrg | object | 否 | 否 | 销售组织 |
| purchaseOrg | object | 否 | 否 | 采购组织 |
| inventoryOrg | object | 否 | 否 | 库存组织 |
| factoryOrg | object | 否 | 否 | 工厂组织 |
| assetsOrg | object | 否 | 否 | 资产组织 |
| taxpayerOrg | object | 否 | 否 | 纳税主体 |
| externalData | object | 否 | 否 | 扩展参数 |
| typelist | string | 是 | 否 | 职能类型列表,salesorg:销售组织、purchaseorg:采购组织、inventoryorg:库存组织、factoryorg:工厂组织、financeorg:会计主体、assetsorg:资产组织、taxpayerorg:纳税主体、adminorg人力资源组织 |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/upgrade?access_token=访问令牌
Body: {
	"data": {
		"code": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"shortname": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"companytype": "",
		"parent": "",
		"depttype": "",
		"principal": "",
		"branchleader": "",
		"corpid": "",
		"locationid": "",
		"taxpayerid": "",
		"taxpayername": "",
		"usedtaxpayerid": "",
		"usedtaxpayername": "",
		"taxpayertype": "",
		"exchangerate": "",
		"contact": "",
		"telephone": "",
		"address": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"description": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"effectivedate": "",
		"expirationdate": "",
		"enable": 0,
		"id": "",
		"orgid": "",
		"objid": "",
		"businessid": "",
		"adminOrg": {
			"parentorgid": "",
			"id": ""
		},
		"financeOrg": {
			"parentid": "",
			"currency": "",
			"periodschema": "",
			"isexternalaccounting": "",
			"enable": 0,
			"id": ""
		},
		"salesOrg": {
			"parentid": "",
			"enable": 0,
			"id": ""
		},
		"purchaseOrg": {
			"enable": 0,
			"id": ""
		},
		"inventoryOrg": {
			"finorgid": "",
			"enable": 0,
			"id": ""
		},
		"factoryOrg": {
			"enable": 0,
			"id": ""
		},
		"assetsOrg": {
			"parentid": "",
			"enable": 0,
			"id": ""
		},
		"taxpayerOrg": {
			"parentid": "",
			"enable": 0,
			"id": ""
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 内容 |
| orgtype | boolean | 否 | 组织类型 false组织 true部门 示例：true |
| code | string | 否 | 编码 示例：f2 |
| exchangerate | string | 否 | 汇率类型 示例：kmhiadxk |
| taxpayername | string | 否 | 纳税人名称 示例：001AAAA |
| expirationdate | string | 否 | 失效日期 示例：9999-12-31 00:00:00 |
| orgid | string | 否 | 组织id 示例：2221857282674944 |
| companytype | string | 否 | 组织形态 示例：45ebda24614f424abe5dfb04e00f737j |
| name | object | 否 | 名称 |
| companytype_name | string | 否 | 组织形态名称 示例：其他组织 |
| id | string | 否 | 主键id 示例：2221857282674944 |
| exchangerate_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| corpid | string | 否 | 合同主体id 示例：4342c3daef42443387cdf92d31732738 |
| corpid_name | string | 否 | 合同主体名称 示例：合同主体2020-03-24 16:30:21 |
| depttyp | string | 否 | 部门性质id 示例：561d9c8b5ede4f57bf28d96ced5cefbe |
| depttype_name | string | 否 | 部门性质 示例：研发部门 |
| locationid | string | 否 | 工作地点id 示例：b006d4acf02947d4bc6df3d2a080aa6c |
| locationid_name | string | 否 | 工作地点 示例：工作地点2020-04-13 16:30:19 |
| branchleader | string | 否 | 分管领导id 示例：1889066421195008 |
| branchleader_name | string | 否 | 分管领导 示例：ss |
| principal | string | 否 | 负责人id 示例：1889146172363008 |
| principal_name | string | 否 | 负责人 示例：ss |
| pubts | string | 否 | 时间戳 示例：2021-07-30 18:35:40 |
| taxpayerid | string | 否 | 纳税人识别号 示例：001A |
| dr | long | 否 | 删除标识 0未删除 1已删除 示例：0 |
| isbizunit | long | 否 | 是否业务单元 0否 1是 示例：1 |
| modifier | string | 否 | 修改人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| modifiedtime | string | 否 | 修改时间 示例：2021-07-30 18:35:40 |
| parentid | string | 否 | 上级id |
| innercode | string | 否 | 内部码 示例：1OC1 |
| level | long | 否 | 级别 示例：1 |
| yhtTenant | string | 否 | 友互通租户 示例：kmhiadxk |
| tenant | string | 否 | 租户 示例：kmhiadxk |
| yhtTenantId | string | 否 | 友互通租户id 示例：kmhiadxk |
| multiLangName | object | 否 | 多语 |
| assetsOrg | object | 否 | 资产组织 |
| inventoryOrg | object | 否 | 库存组织 |
| salesOrg | object | 否 | 销售组织 |
| adminOrg | object | 否 | 人力资源组织 |
| factoryOrg | object | 否 | 工厂组织 |
| taxpayerOrg | object | 否 | 纳税主体 |
| financeOrg | object | 否 | 会计主体 |
| purchaseOrg | object | 否 | 采购组织 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgtype": true,
		"code": "f2",
		"exchangerate": "kmhiadxk",
		"taxpayername": "001AAAA",
		"expirationdate": "9999-12-31 00:00:00",
		"orgid": "2221857282674944",
		"companytype": "45ebda24614f424abe5dfb04e00f737j",
		"name": {
			"zh_CN": "f2"
		},
		"companytype_name": "其他组织",
		"id": "2221857282674944",
		"exchangerate_name": "基准汇率",
		"corpid": "4342c3daef42443387cdf92d31732738",
		"corpid_name": "合同主体2020-03-24 16:30:21",
		"depttyp": "561d9c8b5ede4f57bf28d96ced5cefbe",
		"depttype_name": "研发部门",
		"locationid": "b006d4acf02947d4bc6df3d2a080aa6c",
		"locationid_name": "工作地点2020-04-13 16:30:19",
		"branchleader": "1889066421195008",
		"branchleader_name": "ss",
		"principal": "1889146172363008",
		"principal_name": "ss",
		"pubts": "2021-07-30 18:35:40",
		"taxpayerid": "001A",
		"dr": 0,
		"isbizunit": 1,
		"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"modifiedtime": "2021-07-30 18:35:40",
		"parentid": "",
		"innercode": "1OC1",
		"level": 1,
		"yhtTenant": "kmhiadxk",
		"tenant": "kmhiadxk",
		"yhtTenantId": "kmhiadxk",
		"multiLangName": {
			"zh_CN": "f2"
		},
		"assetsOrg": {
			"enable": 0,
			"orgtype": 2,
			"tenant": "kmhiadxk",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"displayorder": 1,
			"yhtTenant": "kmhiadxk",
			"creationtime": "2021-07-30 18:35:40",
			"id": "2221857282674944",
			"parentid": "",
			"yTenantId": "kmhiadxk",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"level": 1,
			"code": "f2",
			"finorgid": "2221857282674944",
			"taxpayerid": "001A",
			"dr": 0,
			"exchangerate": "kmhiadxk",
			"yhtTenantId": "kmhiadxk",
			"name": {
				"zh_CN": "f2"
			},
			"orgid": "2221857282674944",
			"sysid": "diwork",
			"innercode": "QASX",
			"taxpayername": "001AAAA"
		},
		"inventoryOrg": {
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"parentid": "",
			"yhtTenant": "kmhiadxk",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"innercode": "GIPX",
			"orgtype": 2,
			"id": "2221857282674944",
			"taxpayername": "001AAAA",
			"exchangerate": "kmhiadxk",
			"creationtime": "2021-07-30 18:35:40",
			"code": "f2",
			"finorgid": "2221857282674944",
			"finorgid_name": "会计主体名称",
			"tenant": "kmhiadxk",
			"yhtTenantId": "kmhiadxk",
			"taxpayerid": "001A",
			"name": {
				"zh_CN": "f2"
			},
			"level": 1,
			"enable": 0,
			"sysid": "diwork",
			"yTenantId": "kmhiadxk",
			"displayorder": 4,
			"dr": 0,
			"orgid": "2221857282674944"
		},
		"salesOrg": {
			"tenant": "kmhiadxk",
			"exchangerate": "kmhiadxk",
			"sysid": "diwork",
			"yhtTenantId": "kmhiadxk",
			"enable": 0,
			"id": "2221857282674944",
			"innercode": "Z7LE",
			"yhtTenant": "kmhiadxk",
			"taxpayername": "001AAAA",
			"code": "f2",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"creationtime": "2021-07-30 18:35:40",
			"orgid": "2221857282674944",
			"parentid": "",
			"dr": 0,
			"yTenantId": "kmhiadxk",
			"level": 1,
			"orgtype": 2,
			"name": {
				"zh_CN": "f2"
			},
			"displayorder": 3,
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"taxpayerid": "001A"
		},
		"adminOrg": {
			"isbizunit": 0,
			"taxpayername": "001AAAA",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"code": "f2",
			"taxpayerid": "001A",
			"orgtype": 2,
			"yhtTenant": "kmhiadxk",
			"exchangerate": "kmhiadxk",
			"tenant": "kmhiadxk",
			"name": {
				"zh_CN": "f2"
			},
			"parentorgid_name": "测试001",
			"parentorgid": "2221717577978368",
			"yhtTenantId": "kmhiadxk",
			"id": "2221857282674944",
			"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"modifiedtime": "2021-07-30 18:35:40",
			"parentid": "2221717577978368"
		},
		"factoryOrg": {
			"id": "2221857282674944",
			"taxpayername": "001AAAA",
			"yhtTenant": "kmhiadxk",
			"tenant": "kmhiadxk",
			"displayorder": 3,
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"name": {
				"zh_CN": "f2"
			},
			"yhtTenantId": "kmhiadxk",
			"taxpayerid": "001A",
			"enable": 0,
			"yTenantId": "kmhiadxk",
			"level": 1,
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"orgtype": 2,
			"exchangerate": "kmhiadxk",
			"code": "f2",
			"orgid": "2221857282674944",
			"creationtime": "2021-07-30 18:35:40",
			"dr": 0,
			"innercode": "NRIR",
			"parentid": "",
			"sysid": "diwork"
		},
		"taxpayerOrg": {
			"tenant": "kmhiadxk",
			"enable": 0,
			"orgtype": 2,
			"yhtTenantId": "kmhiadxk",
			"exchangerate": "kmhiadxk",
			"sysid": "diwork",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"innercode": "4JYL",
			"yTenantId": "kmhiadxk",
			"name": {
				"zh_CN": "f2"
			},
			"level": 1,
			"dr": 0,
			"taxpayername": "001AAAA",
			"id": "2221857282674944",
			"creationtime": "2021-07-30 18:35:40",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"displayorder": 1,
			"orgid": "2221857282674944",
			"taxpayerid": "001A",
			"parentid": "",
			"code": "f2",
			"yhtTenant": "kmhiadxk"
		},
		"financeOrg": {
			"tenant": "kmhiadxk",
			"currency_name": "人民币",
			"parentid": "",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"dr": 0,
			"orgtype": 2,
			"displayorder": 6,
			"code": "f2",
			"isexternalaccounting": 1,
			"innercode": "B999",
			"level": 1,
			"taxpayerid": "001A",
			"periodschema": 2219042295730432,
			"name": {
				"zh_CN": "f2"
			},
			"yhtTenantId": "kmhiadxk",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"currency": "2219042358972928",
			"periodschema_name": "基准会计期间方案",
			"yhtTenant": "kmhiadxk",
			"exchangerate": "kmhiadxk",
			"id": "2221857282674944",
			"orgid": "2221857282674944",
			"creationtime": "2021-07-30 18:35:40",
			"sysid": "diwork",
			"taxpayername": "001AAAA",
			"yTenantId": "kmhiadxk",
			"enable": 0
		},
		"purchaseOrg": {
			"dr": 0,
			"orgid": "2221857282674944",
			"taxpayername": "001AAAA",
			"code": "f2",
			"enable": 0,
			"yhtTenantId": "kmhiadxk",
			"orgtype": 2,
			"yhtTenant": "kmhiadxk",
			"parentid": "",
			"id": "2221857282674944",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"sysid": "diwork",
			"tenant": "kmhiadxk",
			"companytype": "45ebda24614f424abe5dfb04e00f737j",
			"taxpayerid": "001A",
			"yTenantId": "kmhiadxk",
			"innercode": "KWME",
			"displayorder": 31832,
			"name": {
				"zh_CN": "f2"
			},
			"level": 1,
			"creationtime": "2021-07-30 18:35:40",
			"exchangerate": "kmhiadxk"
		}
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-100001

所属组织不存在


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

