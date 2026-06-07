---
title: "客户管理组织保存/更新V1"
apiId: "2455556515440885769"
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

# 客户管理组织保存/更新V1

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/merchant/createOrg/v1/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 否 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add |
| subEntityUpdateStrategy | string | 否 | 否 | 子表更新策略：全量覆盖（OVERWRITE）、增量更新（INCREMENT） 1）全量覆盖（OVERWRITE） 按主键或匹配规则查找数据库中的旧数据（优先主键：主键不为空时用主键匹配，主键为空时按匹配规则字段组合匹配）： - 匹配成功（前端子表数据在数据库中找到对应记录）：将主键覆盖为数据库主键，状态设为 UPDATED，前端未传入的属性从数据库补充 - 匹配失败（前端子表数据在数据库中找不到对应记录）：状态设为 NEW - 差异数据处理（数据库中有但前端未匹配到的记录）：按差异策略（SubEntityDiffDataStrategy）处理，默认为 DELETE 2）增量更新（INCREMENT） 按主键或匹配规则查找数据库中的旧数据（优先规则同全量覆盖）： - 匹配成功：将主键覆盖为数据库主键，前端未传入的属性从数据库补充；再按前端数据的 op_status 判断——非删除态（active）设为 UPDATED，删除态（delete）设为 DELETED - 匹配失败（前端子表数据在数据库中找不到对应记录）：按前端数据的 op_status 判断——删除态（delete）设为 DELETED，非删除态（active）设为 NEW - 差异数据处理（数据库中有但前端未匹配到的记录）：差异策略固定为 UNCHANGED，不可配置 示例：overwrite 默认值：overwrite |
| merchantAgentInvoiceInfos.diffDataStrategy | string | 否 | 否 | 发票信息差异更新标识，unchanged：不处理；stop：停用；delete：删除; 默认不处理 示例：unchanged 默认值：unchanged |
| merchantAgentFinancialInfos.diffDataStrategy | string | 否 | 否 | 银行信息差异更新标识，unchanged：不处理；stop：停用；delete：删除 ;默认不处理 示例：unchanged 默认值：unchanged |
| merchantAddressInfos.diffDataStrategy | string | 否 | 否 | 地址信息差异更新标识，unchanged：不处理；stop：停用；delete：删除 ; 默认不处理 示例：unchanged 默认值：unchanged |
| merchantContacterInfos.diffDataStrategy | string | 否 | 否 | 联系人信息差异更新标识，unchanged：不处理；stop：停用；delete：删除 ; 默认不处理 示例：unchanged 默认值：unchanged |
| data | object | 是 | 否 | 传参集合 |
| sourceUnique | string | 否 | 是 | 来源数据唯一标识; 示例：id |
| id | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 客户id；更新时需要更改客户编码需要传值。优先级高于客户编码；跟_status控制是否为更新或者新增；客户id有值或者_status字段为Update将做更新保存； 示例：123456 |
| code | string | 否 | 是 | 客户编码；必填。更新时，不传客户id，客户编码作为唯一条件去更新 示例：code |
| name | object | 否 | 否 | 客户名称；简体必填 |
| createOrg | string | 否 | 否 | 管理组织id；必填；填写组织id 示例：666666 |
| createOrg___code | string | 否 | 否 | 管理组织；必填；填写组织编码 |
| transType | string | 否 | 否 | 客户类型id; 示例：客户类型id |
| transType___code | string | 否 | 否 | 客户类型；填写交易类型编码，不传默认为默认交易类型 |
| shortname | object | 否 | 否 | 客户简称； |
| country | string | 否 | 否 | 国家id; 示例：国家id |
| country___code | string | 否 | 否 | 国家；填写国家编码 |
| newTimeZone | string | 否 | 否 | 时区(夏令时)；填写时区枚举编码； 示例：Africa/Abidjan |
| language | string | 否 | 否 | 语言id; 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0 |
| language___code | string | 否 | 否 | 语言；填写语言编码； 示例：zh_CN |
| parentManageOrg | string | 否 | 否 | 上级发展组织id; 示例：上级组织id |
| parentManageOrg___code | string | 否 | 否 | 上级发展组织；填写组织编码 示例：上级组织编码 |
| parentCustomer | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 上级客户id 示例：1733407568979558408 |
| parentCustomer___code | string | 否 | 否 | 上级客户；填写客户编码 |
| suppliers | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 对应供应商id； 示例：对应供应商id |
| suppliers___code | string | 否 | 否 | 对应供应商；填写供应商编码 |
| retailInvestors | boolean | 否 | 否 | 是否散户；true：是，false：否 示例：true |
| internalOrg | boolean | 否 | 否 | 是否内部组织，true：是，false：否 示例：false |
| internalOrgId | string | 否 | 否 | 内部组织id； 示例：内部组织id |
| internalOrgId___code | string | 否 | 否 | 内部组织；填写组织编码，是否内部组织为是时必填，为否时不需要填写 |
| taxPayingCategories | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 纳税类别；0：一般纳税人，1：小规模纳税人，2：海外纳税，99：其他；不传时默认为一般纳税人 示例：0 |
| customerClass | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 客户分类id； 示例：1733407568979558408 |
| customerClass___code | string | 否 | 否 | 客户分类；填写客户分类编码 |
| customerIndustry | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 客户行业id； 示例：1733407568979558408 |
| customerIndustry___code | string | 否 | 否 | 客户行业；填写客户行业编码 |
| developmentPartner | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 发展伙伴id； 示例：1733407568979558408 |
| developmentPartner___code | string | 否 | 否 | 发展伙伴；填写发展伙伴编码，引用的档案为客户档案 |
| enterpriseName | string | 否 | 否 | 企业名称；企业类型为企业时填写 示例：企业名称 |
| enterpriseNature | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 企业类型；0：企业，1：个人，2：其他 示例：0 |
| personName | string | 否 | 否 | 姓名；企业类型为个人时填写并必填 示例：姓名 |
| orgName | string | 否 | 否 | 组织名称；企业类型为其他时填写 示例：组织名称 |
| licenseType | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 证照类型；0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件；企业类型为企业,证照类型只能输入(统一社会信用代码、其他证照)；企业类型为个人,证照类型只能输入(居民身份证、护照、其他身份证件)；企业类型为其他,证照类型只能输入(统一社会信用代码、营业执照、其他证照) 示例：0 |
| creditCode | string | 否 | 否 | 证照号码/个人证照号；企业类型为企业/其他，为证照号码；企业类型为个人，为个人证照号 示例：证照号码 |
| leaderName | string | 否 | 否 | 法人代表；企业类型为企业时填写！ 示例：法人代表 |
| leaderNameIdNo | string | 否 | 否 | 法人代表身份证号；企业类型为企业时填写！ 示例：法人代表身份证号 |
| personCharge | string | 否 | 否 | 负责人；企业类型为其他时填写！ 示例：负责人 |
| personChargeIdNo | string | 否 | 否 | 负责人身份证号；企业类型为其他时填写！ 示例：负责人身份证号 |
| businessLicenseNo | string | 否 | 否 | 经营许可证号；当企业类型为企业时，填写！否则不填！ 示例：经营许可证号 |
| businessterm | date |
| 格式:yyyy-MM-dd | 否 | 否 | 营业期限至；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 |
| buildTime | date |
| 格式:yyyy-MM-dd | 否 | 否 | 成立时间；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 |
| contactName | string | 否 | 否 | 联系人；资质信息页签下 示例：联系人 |
| contactTel | string | 否 | 否 | 联系电话；资质信息页签下 示例：联系电话 |
| address | object | 否 | 否 | 详细地址；资质信息页签下 |
| regionCode | string | 否 | 否 | 注册地区；资质信息页签下；填写地址档案编码 示例：110101000000 |
| email | string | 否 | 否 | 邮箱；资质信息页签下 示例：邮箱 |
| fax | string | 否 | 否 | 传真；资质信息页签下 示例：传真 |
| enterNature | string | 否 | 否 | 企业性质id 示例：企业性质id |
| enterNature___code | string | 否 | 否 | 企业性质；资质信息页签下，填写企业性质编码！ |
| currencyCode | string | 否 | 否 | 注册资金币种；资质信息页签下 示例：注册资金币种 |
| money | string | 否 | 否 | 注册资金(万计)；资质信息页签下；支持小数点后2位 示例：1.23 |
| peopleNum | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 员工人数；资质信息页签下 示例：100 |
| scopeModel | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 经营模式；0：生产加工，1：批发经销；资质信息页签下 示例：0 |
| yearMoney | string | 否 | 否 | 年营业额(万计)；资质信息页签下；支持小数点后2位 示例：100 |
| scope | object | 否 | 否 | 经营范围；资质信息页签下 |
| website | string | 否 | 否 | 网址；资质信息页签下 示例：网址 |
| wid | string | 否 | 否 | 微信公众号；资质信息页签下 示例：微信公众号 |
| postCode | string | 否 | 否 | 邮编；资质信息页签下 示例：邮编 |
| merchantAddressInfos | object | 是 | 否 | 客户档案地址信息 |
| merchantContacterInfos | object | 是 | 否 | 联系人信息 |
| merchantAgentFinancialInfos | object | 是 | 否 | 银行信息 |
| merchantAgentInvoiceInfos | object | 是 | 否 | 发票信息 |
| merchantApplyRanges | object | 是 | 否 | 客户适用范围，新增时如果不传默认只有管理组织，编辑时只有管理组织修改客户时，该参数可以填写； |
| merchantAppliedDetail | object | 否 | 否 | 客户档案业务信息(客户适用范围详情) |
| merchantRole | object | 否 | 否 | 客户角色信息(营销角色) |
| merchantsManager | object | 否 | 否 | 客户管理员信息 |
| customerAreas | object | 是 | 否 | 客户档案销售区域 |
| principals | object | 是 | 否 | 客户档案负责人 |
| invoicingCustomers | object | 是 | 否 | 客户档案开票客户 |

## 3. 请求示例

Url: /yonbip/PFC/merchant/createOrg/v1/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"subEntityUpdateStrategy": "overwrite",
	"merchantAgentInvoiceInfos.diffDataStrategy": "unchanged",
	"merchantAgentFinancialInfos.diffDataStrategy": "unchanged",
	"merchantAddressInfos.diffDataStrategy": "unchanged",
	"merchantContacterInfos.diffDataStrategy": "unchanged",
	"data": [
		{
			"sourceUnique": "id",
			"id": 123456,
			"code": "code",
			"name": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"createOrg": "666666",
			"createOrg___code": "",
			"transType": "客户类型id",
			"transType___code": "",
			"shortname": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"country": "国家id",
			"country___code": "",
			"newTimeZone": "Africa/Abidjan",
			"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
			"language___code": "zh_CN",
			"parentManageOrg": "上级组织id",
			"parentManageOrg___code": "上级组织编码",
			"parentCustomer": 1733407568979558408,
			"parentCustomer___code": "",
			"suppliers": NaN,
			"suppliers___code": "",
			"retailInvestors": true,
			"internalOrg": false,
			"internalOrgId": "内部组织id",
			"internalOrgId___code": "",
			"taxPayingCategories": 0,
			"customerClass": 1733407568979558408,
			"customerClass___code": "",
			"customerIndustry": 1733407568979558408,
			"customerIndustry___code": "",
			"developmentPartner": 1733407568979558408,
			"developmentPartner___code": "",
			"enterpriseName": "企业名称",
			"enterpriseNature": 0,
			"personName": "姓名",
			"orgName": "组织名称",
			"licenseType": 0,
			"creditCode": "证照号码",
			"leaderName": "法人代表",
			"leaderNameIdNo": "法人代表身份证号",
			"personCharge": "负责人",
			"personChargeIdNo": "负责人身份证号",
			"businessLicenseNo": "经营许可证号",
			"businessterm": "2223-01-01",
			"buildTime": "2223-01-01",
			"contactName": "联系人",
			"contactTel": "联系电话",
			"address": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"regionCode": "110101000000",
			"email": "邮箱",
			"fax": "传真",
			"enterNature": "企业性质id",
			"enterNature___code": "",
			"currencyCode": "注册资金币种",
			"money": "1.23",
			"peopleNum": 100,
			"scopeModel": 0,
			"yearMoney": "100",
			"scope": {
				"zh_CN": "简体",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"website": "网址",
			"wid": "微信公众号",
			"postCode": "邮编",
			"merchantAddressInfos": [
				{
					"id": 123456,
					"addressCode": "",
					"shipregion": 1733407568979558408,
					"shipregion___code": "",
					"regionCode": "110101000000",
					"address": "详细地址",
					"zipCode": "邮政编码",
					"receiver": "联系人姓名",
					"mobile": "联系人手机",
					"telePhone": "固定电话",
					"email": "邮箱",
					"qq": "QQ",
					"weChat": "微信",
					"remarks": "备注",
					"stopStatus": "\"0\"",
					"isDefault": true,
					"op_status": "active",
					"sourceUnique": "123456"
				}
			],
			"merchantContacterInfos": [
				{
					"id": 123456,
					"fullName": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"gender": 0,
					"positionName": "职务",
					"areaCodeMobile": "本字段必须填写区号和手机号，格式为“+区号-手机号” 示例+86-13812121212",
					"mobile": "本字段是由原手机号字段更名得来，支持输入文本内容",
					"telePhone": "固定电话",
					"email": "邮箱",
					"qq": "QQ",
					"weChat": "微信",
					"remarks": "备注",
					"isDefault": true,
					"op_status": "active",
					"sourceUnique": "123456"
				}
			],
			"merchantAgentFinancialInfos": [
				{
					"id": 12456,
					"country": "国家Id",
					"country___code": "国家",
					"province": 1733407568979558408,
					"province___code": "省份",
					"currency": "币种Id",
					"currency___code": "CNY",
					"accountType": "账户类型",
					"bank": "银行类别Id",
					"bank___code": "",
					"openBank": "银行网点id",
					"openBank___code": "",
					"bankAccount": "",
					"bankAccountName": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"jointLineNo": "联行号",
					"remarks": "备注",
					"accountOpeningAddress": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"accountOpeningDate": "2023-05-19 16:52:31",
					"stopstatus": false,
					"isDefault": true,
					"op_status": "active",
					"sourceUnique": "123456"
				}
			],
			"merchantAgentInvoiceInfos": [
				{
					"id": 123456,
					"bdBillingType": "发票类型Id",
					"bdBillingType___code": "",
					"title": "发票抬头",
					"taxNo": "税号",
					"receievInvoiceMobile": "收票手机号",
					"receievInvoiceEmail": "收票邮箱",
					"telephone": "电话",
					"address": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"name": "银行类别Id",
					"name___code": "",
					"bankName": "",
					"bankName___code": "",
					"bankAccount": "",
					"remarks": "备注",
					"isDefault": true,
					"op_status": "active",
					"sourceUnique": "123456"
				}
			],
			"merchantApplyRanges": [
				{
					"orgId": "组织id",
					"orgId___code": "组织"
				}
			],
			"merchantAppliedDetail": {
				"merchantLevelId": 1733407568979558408,
				"merchantLevelId___code": "",
				"merchantTypeId": 1733407568979558408,
				"merchantTypeId___code": "销售渠道",
				"deliveryWarehouseId": 1733407568979558408,
				"deliveryWarehouseId___code": "发货仓库",
				"transactionCurrencyId": "交易币种id",
				"transactionCurrencyId___code": "",
				"exchangeRateTypeId": "汇率类型id",
				"exchangeRateTypeId___code": "",
				"taxRateId": 1733407568979558408,
				"taxRateId___code": "销项税率",
				"payway": 0,
				"creditServiceDayId": 10,
				"collectionAgreementId": 1733407568979558408,
				"collectionAgreementId___code": "收款协议",
				"shipmentMethodId": 1733407568979558408,
				"shipmentMethodId__code": "",
				"shipmentMethod": 1733407568979558408,
				"shipmentMethod___code": "",
				"signBack": true,
				"isTradeCustomers": "\"0\"",
				"stopstatus": false,
				"searchCode": ""
			},
			"merchantRole": {
				"merchantOptions": false,
				"businessRole": "\"1\""
			},
			"merchantsManager": {
				"countryCode": "\"86\"",
				"mobile": "手机号",
				"fullName": "姓名",
				"email": "邮箱"
			},
			"customerAreas": [
				{
					"id": 123456,
					"saleAreaId": 1733407568979558408,
					"saleAreaId___code": "销售区域",
					"isDefault": true,
					"op_status": "active"
				}
			],
			"principals": [
				{
					"id": 123456,
					"specialManagementDep": "专管部门id",
					"specialManagementDep___code": "",
					"professSalesman": "专管业务员id",
					"professSalesman___code": "",
					"isDefault": true,
					"op_status": "active"
				}
			],
			"invoicingCustomers": [
				{
					"id": 123456,
					"invoicingCustomersId": "1733407568979558408",
					"invoicingCustomersId___code": "",
					"isDefault": true,
					"op_status": "active"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | object | 是 | messages 示例：[] |
| infos | object | 是 | infos |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [],
		"infos": [
			{
				"created": true,
				"sourceUnique": "2217416229843369990",
				"targetUnique": "2217416229843369991",
				"id": "2217416229843369991"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

