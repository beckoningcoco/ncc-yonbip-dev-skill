---
title: "业务单元批量保存"
apiId: "1cd9cbbb8b534c66967d0e1b93e907b9"
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

# 业务单元批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/orgunit/batchSave

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
| data | object | 是 | 是 | 组织单元[org.func.BaseOrg] |
| code | string | 否 | 是 | 编码 |
| name | muti_lang | 否 | 是 | 名称,支持多语 |
| shortname | muti_lang | 否 | 否 | 简称,支持多语 |
| companytype | string | 否 | 否 | 组织形态id，与companytype_code,两者必须输入一个 |
| companytype_code | string | 否 | 否 | 组织形态code, 与companytype两者必须输入一个 |
| parent | string | 否 | 否 | 上级组织单元id；支持id或编码，如需传，id和编码只需填一个即可 |
| parent_code | string | 否 | 否 | 上级组织单元编码；支持id或编码，如需传，id和编码只需填一个即可 |
| deptparentid | string | 否 | 否 | 所属上级id,是部门时进行录入，当上级组织单元含有人力资源职能时，默认是上级组织单元id;不包含人力职能时默认为空。手动修改时录入值范围是上级人力资源下的部门，支持id或编码，如需传，id和编码只需填一个即可 |
| deptparentid_code | string | 否 | 否 | 所属上级编码,是部门时进行录入，当上级组织单元含有人力资源职能时，默认是上级组织单元code;不包含人力职能时默认为空。手动修改时录入值范围是上级人力资源下的部门，支持id或编码，如需传，id和编码只需填一个即可 |
| parentorgid | string | 否 | 否 | 所属人力组织id,是部门型组织且没有人力职能时必输进行录入，除此之外无需录入。当上级组织单元含有人力资源职能时，默认是上级组织单元id;不包含人力职能时默认为空。支持id或编码，如需传，id和编码只需填一个即可 |
| parentorgid_code | string | 否 | 否 | 所属人力组织编码,是部门型组织且没有人力职能时必输进行录入，除此之外无需录入。当上级组织单元含有人力资源职能时，默认是上级组织单元code;不包含人力职能时默认为空。支持id或编码，如需传，id和编码只需填一个即可 |
| orgtype | string | 否 | 是 | 是否部门型组织 1-组织；2-部门型组织，如果新增部门，建议到部门批量保存接口进行新增 默认值：1 |
| depttype | string | 否 | 否 | 部门性质id；支持id或编码，如需传，id和编码只填一个即可 |
| depttype_code | string | 否 | 否 | 部门性质编码, 1: 销售部门,2: 管理部门,3: 基本生产部门,4: 辅助生产部门,5: 福利部门,6: 研发部门,7: 基建部门；支持id或编码，如需传，id和编码只填一个即可 |
| principal | string | 否 | 否 | 负责人id；支持id或编码，如需传，id和编码只需填一个即可 |
| principal_code | string | 否 | 否 | 负责人编码；支持id或编码，如需传，id和编码只需填一个即可 |
| branchleader | string | 否 | 否 | 分管领导id；支持id或编码，如需传，id和编码只需填一个即可 |
| branchleader_code | string | 否 | 否 | 分管领导编码；支持id或编码，如需传，id和编码只需填一个即可 |
| taxpayerid | string | 否 | 否 | 统一社会信用代码 |
| taxpayername | string | 否 | 否 | 纳税人名称 |
| usedtaxpayerid | string | 否 | 否 | 曾用统一社会信用代码 |
| usedtaxpayername | string | 否 | 否 | 曾用纳税人名称 |
| taxpayertype | string | 否 | 否 | 纳税人类型, 1:一般纳税人、2:小规模纳税人、 |
| exchangerate | string | 否 | 否 | 汇率类型id，与exchangerate_code两者必须输入一个 |
| exchangerate_code | string | 否 | 否 | 汇率类型编码，与exchangerate两者必须输入一个 |
| language | string | 否 | 否 | 语言id；支持id或名称，如需传，id和名称只填一个即可 |
| language_select_language | string | 否 | 否 | 语言名称；支持id或名称，如需传，id和名称只填一个即可 |
| timezone | string | 否 | 否 | 时区id；支持id或名称，如需传，id和名称只填一个即可 |
| contact | string | 否 | 否 | 联系人 |
| telephone | string | 否 | 否 | 联系电话 |
| objid | string | 否 | 否 | 外部系统主键 |
| address | muti_lang | 否 | 否 | 联系地址,支持多语 |
| description | muti_lang | 否 | 否 | 描述,支持多语 |
| enable | string | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 不传默认未启用 |
| id | string | 否 | 否 | 业务单元主键，新增时无需填写，修改时必输 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| financeOrg | object | 否 | 否 | 会计主体 |
| fundsOrg | object | 否 | 否 | 资金组织 |
| salesOrg | object | 否 | 否 | 销售组织 |
| purchaseOrg | object | 否 | 否 | 采购组织 |
| inventoryOrg | object | 否 | 否 | 库存组织 |
| factoryOrg | object | 否 | 否 | 工厂组织 |
| assetsOrg | object | 否 | 否 | 资产组织 |
| taxpayerOrg | object | 否 | 否 | 纳税主体 |
| adminOrg | object | 否 | 否 | 行政组织 |
| baseOrgExt | object | 否 | 否 | 业务单元人力信息集 |

## 3. 请求示例

Url: /yonbip/digitalModel/orgunit/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "",
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"shortname": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"companytype": "",
			"companytype_code": "",
			"parent": "",
			"parent_code": "",
			"deptparentid": "",
			"deptparentid_code": "",
			"parentorgid": "",
			"parentorgid_code": "",
			"orgtype": "",
			"depttype": "",
			"depttype_code": "",
			"principal": "",
			"principal_code": "",
			"branchleader": "",
			"branchleader_code": "",
			"taxpayerid": "",
			"taxpayername": "",
			"usedtaxpayerid": "",
			"usedtaxpayername": "",
			"taxpayertype": "",
			"exchangerate": "",
			"exchangerate_code": "",
			"language": "",
			"language_select_language": "",
			"timezone": "",
			"contact": "",
			"telephone": "",
			"objid": "",
			"address": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"description": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"enable": "",
			"id": "",
			"_status": "",
			"financeOrg": {
				"parentid": "",
				"parentid_code": "",
				"currency": "",
				"currency_name": "",
				"periodschema": "",
				"periodschema_code": "",
				"isexternalaccounting": "",
				"isinternalaccounting": "",
				"enable": "",
				"id": ""
			},
			"fundsOrg": {
				"finorgid": "",
				"finorgid_code": "",
				"parentid": "",
				"parentid_code": "",
				"enable": 0,
				"id": ""
			},
			"salesOrg": {
				"parentid": "",
				"parentid_code": "",
				"enable": "",
				"id": ""
			},
			"purchaseOrg": {
				"contactOrg": "",
				"contactOrg_code": "",
				"enable": "",
				"id": ""
			},
			"inventoryOrg": {
				"enable": "",
				"id": ""
			},
			"factoryOrg": {
				"enable": "",
				"id": ""
			},
			"assetsOrg": {
				"enable": "",
				"id": ""
			},
			"taxpayerOrg": {
				"parentid": "",
				"parentid_code": "",
				"enable": "",
				"id": "",
				"isTaxpayer": 1
			},
			"adminOrg": {
				"parentorgid": "",
				"parentorgid_code": "",
				"corpid": "",
				"corpid_code": "",
				"locationid": "",
				"locationid_code": "",
				"id": "",
				"enable": "",
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
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分，非必选项 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回详情 |
| failInfos | string | 是 | 失败详情 |
| fundsOrg | object | 否 | 资金组织 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "codewaer",
				"exchangerate": "0000KO42POTJDOJAJU0000",
				"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
				"description": {
					"en_US": "desc",
					"zh_CN": "描述"
				},
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
				"enable": 0,
				"contact": "王五",
				"exchangerate_code": "01",
				"parent_code": "0001",
				"orgtype": 1,
				"branchleader_code": "qwett",
				"address": {
					"en_US": "sea",
					"zh_CN": "太平洋"
				},
				"language_select_language": "简体中文",
				"telephone": "13223455432",
				"shortname": {
					"en_US": "codewaer",
					"zh_CN": "codewaer"
				},
				"companytype_code": "company",
				"taxpayerid": "123456732123423",
				"taxpayername": "张三",
				"usedtaxpayerid": "234567",
				"usedtaxpayername": "李四",
				"principal_code": "12345",
				"companytype": "45ebda24614f424abe5dfb04e00f737c",
				"name": {
					"en_US": "codewaer",
					"zh_CN": "codewaer"
				},
				"taxpayertype": 1,
				"principal": "5673212342",
				"branchleader": "5673212342",
				"depttype_code": "1",
				"depttype": "12345673212342",
				"parentorgid": "2428433024717568",
				"parentid": "2428433024717568",
				"sysid": "diwork",
				"dr": 0,
				"id": "2582889174651136",
				"isbizunit": 1,
				"orgid": "2582889174651136",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2021-12-30 14:50:44",
				"innercode": "W239JNZG1MJI",
				"level": 3,
				"displayorder": 1000140,
				"objid": "PK001",
				"pubts": "2021-12-30 14:50:44",
				"yhtTenant": "0000KO42POTJDOJAJU0000",
				"tenant": "0000KO42POTJDOJAJU0000",
				"yhtTenantId": "0000KO42POTJDOJAJU0000",
				"yTenantId": "0000KO42POTJDOJAJU0000",
				"multiLangName": "codewaer",
				"purchaseOrg": {
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"usedtaxpayername": "李四",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"telephone": "13223455432",
					"taxpayertype": 1,
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"contactOrg": "2246020692726016",
					"taxpayerid": "123456732123423",
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"displayorder": 32092,
					"creationtime": "2021-12-30 14:50:44",
					"usedtaxpayerid": "234567",
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"pubts": "2021-12-30 14:50:44",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"dr": 0,
					"orgid": "2582889174651136",
					"taxpayername": "张三",
					"code": "codewaer",
					"enable": 0,
					"orgtype": 1,
					"contactOrg_code": "cc",
					"parentid": "",
					"id": "2582889174651136",
					"sysid": "diwork",
					"tenant": "0000KO42POTJDOJAJU0000",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"innercode": "NE8U",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"level": 1,
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"contact": "王五",
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					}
				},
				"adminOrg": {
					"isbizunit": 1,
					"orgid": "2582889174651136",
					"taxpayername": "张三",
					"taxpayerid": "123456732123423",
					"orgtype": 1,
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"usedtaxpayerid": "234567",
					"corpid": "2342189771133184",
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"parentid": "2246020692726016",
					"displayorder": 1000117,
					"pubts": "2021-12-30 14:50:44",
					"effectivedate": "2021-12-30 00:00:00",
					"expirationdate": "9999-12-31 00:00:00",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"creationtime": "2021-12-30 14:50:44",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"code": "codewaer",
					"locationid_code": "1",
					"dr": 0,
					"corpid_code": "1",
					"telephone": "13223455432",
					"sysid": "diwork",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"tenant": "0000KO42POTJDOJAJU0000",
					"innercode": "WEOGTYBQZ5M9",
					"taxpayertype": 1,
					"usedtaxpayername": "李四",
					"enable": 0,
					"locationid": "2342189375459584",
					"parentorgid": "2246020692726016",
					"parentorgid_code": "cc",
					"id": "2582889174651136",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"level": 3,
					"contact": "王五"
				},
				"assetsOrg": {
					"orgtype": 1,
					"displayorder": 43,
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"parentid": "",
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"pubts": "2021-12-30 14:50:44",
					"usedtaxpayername": "李四",
					"level": 1,
					"code": "codewaer",
					"finorgid": "2582889174651136",
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"taxpayerid": "123456732123423",
					"taxpayertype": 1,
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"orgid": "2582889174651136",
					"contact": "王五",
					"sysid": "diwork",
					"innercode": "1BQL",
					"enable": 0,
					"tenant": "0000KO42POTJDOJAJU0000",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"creationtime": "2021-12-30 14:50:44",
					"id": "2582889174651136",
					"expirationdate": "9999-12-31 00:00:00",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"telephone": "13223455432",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"dr": 0,
					"finorgid_code": "cc",
					"usedtaxpayerid": "234567",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"effectivedate": "2021-12-30 00:00:00",
					"taxpayername": "张三"
				},
				"salesOrg": {
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"sysid": "diwork",
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"id": "2582889174651136",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"taxpayername": "张三",
					"telephone": "13223455432",
					"code": "codewaer",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"orgid": "2582889174651136",
					"dr": 0,
					"usedtaxpayerid": "234567",
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"level": 2,
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"orgtype": 1,
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"parentid_code": "cc",
					"taxpayerid": "123456732123423",
					"tenant": "0000KO42POTJDOJAJU0000",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"enable": 0,
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"taxpayertype": 1,
					"usedtaxpayername": "李四",
					"innercode": "MQOLUIB2",
					"contact": "王五",
					"creationtime": "2021-12-30 14:50:44",
					"parentid": "2246020692726016",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"pubts": "2021-12-30 14:50:44",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"displayorder": 65,
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724"
				},
				"factoryOrg": {
					"usedtaxpayername": "李四",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"taxpayername": "张三",
					"displayorder": 44,
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"level": 1,
					"orgtype": 1,
					"code": "codewaer",
					"orgid": "2582889174651136",
					"usedtaxpayerid": "234567",
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"dr": 0,
					"sysid": "diwork",
					"contact": "王五",
					"pubts": "2021-12-30 14:50:44",
					"id": "2582889174651136",
					"telephone": "13223455432",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"tenant": "0000KO42POTJDOJAJU0000",
					"taxpayertype": 1,
					"taxpayerid": "123456732123423",
					"enable": 0,
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"creationtime": "2021-12-30 14:50:44",
					"innercode": "IJNK",
					"parentid": ""
				},
				"taxpayerOrg": {
					"tenant": "0000KO42POTJDOJAJU0000",
					"enable": 0,
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"sysid": "diwork",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"innercode": "IE2O",
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"pubts": "2021-12-30 14:50:44",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"taxpayername": "张三",
					"creationtime": "2021-12-30 14:50:44",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"displayorder": 30,
					"orgid": "2582889174651136",
					"parentid": "",
					"contact": "王五",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"orgtype": 1,
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"level": 1,
					"dr": 0,
					"id": "2582889174651136",
					"usedtaxpayername": "李四",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"taxpayerid": "123456732123423",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"usedtaxpayerid": "234567",
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"taxpayertype": 1,
					"telephone": "13223455432",
					"parentid_code": "cc",
					"code": "codewaer",
					"isTaxpayer": 1
				},
				"financeOrg": {
					"telephone": "13223455432",
					"tenant": "0000KO42POTJDOJAJU0000",
					"currency_name": "人民币-修改001",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"dr": 0,
					"periodschema_code": "0001",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"contact": "王五",
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"orgid": "2582889174651136",
					"creationtime": "2021-12-30 14:50:44",
					"sysid": "diwork",
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"parentid": "2246020692726016",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"orgtype": 1,
					"displayorder": 92,
					"code": "codewaer",
					"isexternalaccounting": 1,
					"taxpayertype": 1,
					"pubts": "2021-12-30 14:50:44",
					"innercode": "JB1TTPHL",
					"level": 2,
					"taxpayerid": "123456732123423",
					"periodschema": 2237606134469120,
					"usedtaxpayerid": "234567",
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"parentid_code": "cc",
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"currency": "2237606328800512",
					"id": "2582889174651136",
					"taxpayername": "张三",
					"enable": 0,
					"usedtaxpayername": "李四"
				},
				"inventoryOrg": {
					"yhtTenant": "0000KO42POTJDOJAJU0000",
					"finorgid_code": "cc",
					"contact": "王五",
					"innercode": "9MTS",
					"orgtype": 1,
					"taxpayername": "张三",
					"exchangerate": "0000KO42POTJDOJAJU0000",
					"telephone": "13223455432",
					"finorgid": "2582889174651136",
					"tenant": "0000KO42POTJDOJAJU0000",
					"yhtTenantId": "0000KO42POTJDOJAJU0000",
					"taxpayerid": "123456732123423",
					"expirationdate": "9999-12-31 00:00:00",
					"name": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"timezone": "1400df68-45f6-41b0-a6fb-f92c5992c150",
					"level": 1,
					"sysid": "diwork",
					"displayorder": 59,
					"dr": 0,
					"shortname": {
						"en_US": "codewaer",
						"zh_CN": "codewaer"
					},
					"orgid": "2582889174651136",
					"companytype": "45ebda24614f424abe5dfb04e00f737c",
					"parentid": "",
					"pubts": "2021-12-30 14:50:44",
					"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
					"address": {
						"en_US": "sea",
						"zh_CN": "太平洋"
					},
					"id": "2582889174651136",
					"creationtime": "2021-12-30 14:50:44",
					"usedtaxpayerid": "234567",
					"code": "codewaer",
					"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
					"usedtaxpayername": "李四",
					"enable": 0,
					"yTenantId": "0000KO42POTJDOJAJU0000",
					"taxpayertype": 1,
					"description": {
						"en_US": "desc",
						"zh_CN": "描述"
					},
					"effectivedate": "2021-12-30 00:00:00"
				}
			}
		],
		"failInfos": [
			""
		],
		"fundsOrg": {
			"yhtTenant": "00000KDHDKAN123",
			"finorgid_code": "",
			"contact": "",
			"innercode": "",
			"orgtype": 0,
			"taxpayername": "",
			"exchangerate": "",
			"telephone": "",
			"finorgid": "",
			"tenant": "",
			"yhtTenantId": "",
			"taxpayerid": "",
			"expirationdate": "",
			"name": {
				"en_US": "",
				"zh_CN": ""
			},
			"orgid": "",
			"timezone": "",
			"level": "",
			"sysid": "",
			"displayorder": "",
			"dr": "",
			"shortname": {
				"en_US": "",
				"zh_CN": ""
			},
			"id": "",
			"creationtime": "",
			"usedtaxpayerid": "",
			"code": "",
			"language": "",
			"usedtaxpayername": "",
			"enable": "",
			"yTenantId": "",
			"taxpayertype": "",
			"description": {
				"en_US": "",
				"zh_CN": ""
			},
			"effectivedate": "",
			"parentid": "",
			"parentid_code": ""
		}
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000513

组织已停用，不能设置职能组织


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-04

新增

请求参数 (19)

增加信息集

2	2025-07-02

新增

请求参数 isTaxpayer

新增

返回参数 isTaxpayer

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

