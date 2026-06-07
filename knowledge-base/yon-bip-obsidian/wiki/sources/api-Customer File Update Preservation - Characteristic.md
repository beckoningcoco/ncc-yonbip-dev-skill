---
title: "客户档案更新保存-特征"
apiId: "1692632592779575303"
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

# 客户档案更新保存-特征

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/newupdate

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | long | 否 | 否 | 客户id；更新时需要更改客户编码需要传值。优先级高于客户编码； 示例：123456 |
| code | string | 否 | 是 | 客户编码；必填。更新时，不传客户id，客户编码作为唯一条件去更新 示例：code |
| name | object | 否 | 是 | 客户名称；简体必填 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| createOrgCode | string | 否 | 是 | 管理组织；必填；填写组织编码 示例：管理组织编码 |
| belongOrgCode | string | 否 | 否 | 使用组织；填写组织编码；更新时必填，不传默认为管理组织 示例：使用组织编码 |
| transTypeCode | string | 否 | 否 | 客户类型；填写交易类型编码，不传默认为默认交易类型 示例：客户类型 |
| shortname | object | 否 | 否 | 客户简称 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| countryName | string | 否 | 否 | 国家；填写国家名称 示例：国家 |
| countryCode | string | 否 | 否 | 国家；填写国家编码;国家编码与国家名称同传时，编码成效 示例：CN |
| newTimeZone | string | 否 | 否 | 时区(夏令时)；填写时区枚举编码； 示例：Africa/Abidjan |
| languageCode | string | 否 | 否 | 语言；填写语言编码； 示例：zh_CN |
| parentManageOrgCode | string | 否 | 否 | 上级发展组织；填写组织编码 示例：上级组织编码 |
| parentCustomerCode | string | 否 | 否 | 上级客户；填写客户编码 示例：上级客户编码 |
| suppliersCode | string | 否 | 否 | 对应供应商；填写供应商编码 示例：供应商编码 |
| retailInvestors | boolean | 否 | 否 | 是否散户；true：是，false：否 示例：true |
| internalOrg | boolean | 否 | 否 | 是否内部组织，true：是，false：否 示例：false |
| internalOrgIdCode | string | 否 | 否 | 内部组织；填写组织编码，是否内部组织为是时必填，为否时不需要填写 示例：内部组织编码 |
| taxPayingCategories | short | 否 | 否 | 纳税类别；0：一般纳税人，1：小规模纳税人，2：海外纳税，99：其他；不传时默认为一般纳税人 示例：0 |
| customerClassCode | string | 否 | 否 | 客户分类；填写客户分类编码 示例：客户分类编码 |
| customerIndustryCode | string | 否 | 否 | 客户行业；填写客户行业编码 示例：客户行业编码 |
| developmentPartnerCode | string | 否 | 否 | 发展伙伴；填写发展伙伴编码，引用的档案为客户档案 示例：伙伴编码 |
| enterpriseNature | short | 否 | 是 | 企业类型；0：企业，1：个人，2：其他 示例：0 |
| enterpriseName | string | 否 | 否 | 企业名称；企业类型为企业时填写 示例：企业名称 |
| personName | string | 否 | 否 | 姓名；企业类型为个人时填写并必填 示例：姓名 |
| orgName | string | 否 | 否 | 组织名称；企业类型为其他时填写 示例：组织名称 |
| licenseType | short | 否 | 否 | 证照类型；0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件；企业类型为企业,证照类型只能输入(统一社会信用代码、其他证照)；企业类型为个人,证照类型只能输入(居民身份证、护照、其他身份证件)；企业类型为其他,证照类型只能输入(统一社会信用代码、营业执照、其他证照) 示例：0 |
| creditCode | string | 否 | 否 | 证照号码/个人证照号；企业类型为企业/其他，为证照号码；企业类型为个人，为个人证照号 示例：证照号码 |
| leaderName | string | 否 | 否 | 法人代表；企业类型为企业时填写！ 示例：法人代表 |
| leaderNameIdNo | string | 否 | 否 | 法人代表身份证号；企业类型为企业时填写！ 示例：法人代表身份证号 |
| personCharge | string | 否 | 否 | 负责人；企业类型为其他时填写！ 示例：负责人 |
| personChargeIdNo | string | 否 | 否 | 负责人身份证号；企业类型为其他时填写！ 示例：负责人身份证号 |
| businessLicenseNo | string | 否 | 否 | 经营许可证号；当企业类型为企业时，填写！否则不填！ 示例：经营许可证号 |
| businessterm | DateTime | 否 | 否 | 营业期限至；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 16:36:17 |
| buildTime | DateTime | 否 | 否 | 成立时间；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 16:36:17 |
| contactName | string | 否 | 否 | 联系人；资质信息页签下 示例：联系人 |
| contactTel | string | 否 | 否 | 联系电话；资质信息页签下 示例：联系电话 |
| address | object | 否 | 否 | 详细地址；资质信息页签下 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| regionCode | string | 否 | 否 | 注册地区；资质信息页签下；填写地址档案编码 示例：110101000000 |
| email | string | 否 | 否 | 邮箱；资质信息页签下 示例：邮箱 |
| fax | string | 否 | 否 | 传真；资质信息页签下 示例：传真 |
| enterNatureCode | string | 否 | 否 | 企业性质；资质信息页签下，填写企业性质编码！ 示例：企业性质 |
| currencyCode | string | 否 | 否 | 注册资金币种；资质信息页签下 示例：注册资金币种 |
| money | string | 否 | 否 | 注册资金(万计)；资质信息页签下；支持小数点后2位 示例：1.23 |
| peopleNum | long | 否 | 否 | 员工人数；资质信息页签下 示例：100 |
| scopeModel | short | 否 | 否 | 经营模式；0：生产加工，1：批发经销；资质信息页签下 示例：0 |
| yearMoney | string | 否 | 否 | 年营业额(万计)；资质信息页签下；支持小数点后2位 示例：100 |
| scope | object | 否 | 否 | 经营范围；资质信息页签下 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| website | string | 否 | 否 | 网址；资质信息页签下 示例：网址 |
| wid | string | 否 | 否 | 微信公众号；资质信息页签下 示例：微信公众号 |
| postCode | string | 否 | 否 | 邮编；资质信息页签下 示例：邮编 |
| merchantAddressInfos | object | 是 | 否 | 客户档案地址信息 |
| id | long | 否 | 否 | 地址id；新增时不传，更新、删除时必传 示例：123456 |
| addressCode | string | 否 | 是 | 地址编码；必输字段 示例：地址编码 |
| shipregionCode | string | 否 | 否 | 运输区域；填写运输区域编码 示例：运输区域 |
| regionCode | string | 否 | 否 | 行政区划；填写地址档案编码 示例：110101000000 |
| address | string | 否 | 是 | 详细地址；必填 示例：详细地址 |
| zipCode | string | 否 | 否 | 邮政编码；地址信息页签下 示例：邮政编码 |
| receiver | string | 否 | 否 | 联系人姓名；地址信息页签下 示例：联系人姓名 |
| mobile | string | 否 | 否 | 联系人手机；地址信息页签下 示例：联系人手机 |
| telePhone | string | 否 | 否 | 固定电话；地址信息页签下 示例：固定电话 |
| email | string | 否 | 否 | 邮箱；地址信息页签下 示例：邮箱 |
| qq | string | 否 | 否 | QQ；地址信息页签下 示例：QQ |
| weChat | string | 否 | 否 | 微信；地址信息页签下 示例：微信 |
| remarks | string | 否 | 否 | 备注；地址信息页签下 示例：备注 |
| stopStatus | string | 否 | 否 | 启用状态；地址信息页签下；'0'：启用，'1'：停用，该字段是string类型 示例："0" |
| isDefault | boolean | 否 | 是 | 默认地址；必填；地址信息页签下；地址信息的默认值只能设置一个；true：是；false：否； 示例：true |
| entityStatus | string | 否 | 否 | 客户档案地址信息实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| merchantContactInfos | object | 是 | 否 | 联系人信息 |
| id | long | 否 | 否 | 联系人id；新增时不传，更新、删除时必传， 示例：123456 |
| fullName | object | 否 | 是 | 联系人姓名；必填字段； |
| gender | short | 否 | 否 | 性别；0：未知，1：男，2：女 示例：0 |
| positionName | string | 否 | 否 | 职务 示例：职务 |
| areaCodeMobile | string | 否 | 否 | 手机号 示例：本字段必须填写区号和手机号，格式为“+区号-手机号” 示例+86-13812121212 |
| mobile | string | 否 | 否 | 备用手机号 示例：本字段是由原手机号字段更名得来，支持输入文本内容 |
| telePhone | string | 否 | 否 | 固定电话 示例：固定电话 |
| email | string | 否 | 否 | 邮箱 示例：邮箱 |
| qq | string | 否 | 否 | QQ 示例：QQ |
| weChat | string | 否 | 否 | 微信 示例：微信 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| isDefault | boolean | 否 | 是 | 默认联系人；必填；联系人信息的默认值只能设置一个；true：是；false：否； 示例：true |
| entityStatus | string | 否 | 否 | 客户档案联系人信息实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| merchantAgentFinancialInfos | object | 是 | 否 | 银行信息 |
| id | long | 否 | 否 | 银行信息id；新增时不传，更新、删除时必传； 示例：12456 |
| countryName | string | 否 | 否 | 国家；填写国家名称 示例：国家 |
| provinceCode | string | 否 | 否 | 省份；填写省份编码 示例：省份 |
| currencyName | string | 否 | 是 | 币种；必填；填写币种名称 示例：币种 |
| accountType | string | 否 | 是 | 账户类型；必填；0：对公账号，1：对私账号 示例：0 |
| bankName | string | 否 | 是 | 银行类别；必填；填写银行类别名称 示例：银行类别 |
| openBankName | string | 否 | 是 | 银行网点；必填；填写银行网点名称 示例：银行网点 |
| bankAccount | string | 否 | 是 | 银行账号；必填 示例：银行账号 |
| bankAccountName | object | 否 | 是 | 账户名称；必填 |
| jointLineNo | string | 否 | 否 | 联行号 示例：联行号 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| accountOpeningAddress | object | 否 | 否 | 开户地址 |
| accountOpeningDate | DateTime | 否 | 否 | 开户日期；例如：YYYY-MM-DD 示例：2023-05-19 16:52:31 |
| stopStatus | boolean | 否 | 否 | 启用状态；银行信息页签下；false：启用，true：停用; 示例：false |
| isDefault | boolean | 否 | 是 | 默认银行账号；必填；银行信息页签下；银行信息的默认值只能设置一个；true：是；false：否； 示例：true |
| entityStatus | string | 否 | 否 | 客户档案银行信息实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| merchantAgentInvoiceInfos | object | 是 | 否 | 发票信息 |
| id | long | 否 | 否 | 发票信息id；新增时不传，更新时必传； 示例：123456 |
| bdBillingTypeName | string | 否 | 否 | 发票类型；填写发票类型名称 示例：发票类型 |
| title | string | 否 | 是 | 发票抬头；新增必填 示例：发票抬头 |
| taxNo | string | 否 | 否 | 税号 示例：税号 |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 示例：收票手机号 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 示例：收票邮箱 |
| telephone | string | 否 | 否 | 电话 示例：电话 |
| address | object | 否 | 否 | 详细地址 |
| bankName | string | 否 | 否 | 银行类别；填写银行类别名称 示例：银行类别 |
| bankDotName | string | 否 | 否 | 银行网点；填写银行网点名称 示例：银行网点 |
| bankAccount | string | 否 | 否 | 银行账号 示例：银行账号 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| isDefault | boolean | 否 | 是 | 默认发票信息；必填；发票信息页签下；发票信息的默认值只能设置一个；true：是；false：否； 示例：true |
| entityStatus | string | 否 | 否 | 客户档案发票信息实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| merchantApplyRanges | object | 是 | 否 | 客户适用范围，新增时如果不传默认只有管理组织，编辑时只有管理组织修改客户时，该参数可以填写； |
| orgIdCode | string | 否 | 是 | 组织；填写组织编码 示例：组织 |
| merchantAppliedDetail | object | 否 | 否 | 客户档案业务信息(客户适用范围详情) |
| searchCode | string | 否 | 否 | 助记码 示例：助记码 |
| customerLevelCode | string | 否 | 否 | 客户级别；填写客户级别编码 示例：客户级别 |
| customerTypeCode | string | 否 | 否 | 销售渠道；填写销售渠道编码 示例：销售渠道 |
| deliveryWarehouseCode | string | 否 | 否 | 发货仓库；填写发货仓库编码 示例：发货仓库 |
| transactionCurrencyName | string | 否 | 否 | 交易币种；填写交易币种名称 示例：交易币种 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型；填写汇率类型编码 示例：汇率类型 |
| taxRateNtaxRate | string | 否 | 否 | 销项税率；填写税率档案编码 示例：销项税率 |
| payWay | short | 否 | 否 | 支付方式；0：款到发货，99：其他 示例：0 |
| creditServiceDay | int | 否 | 否 | 信用期限 示例：10 |
| collectionAgreementName | string | 否 | 否 | 收款协议；填写收款协议名称 示例：收款协议 |
| settlementMethodName | string | 否 | 否 | 结算方式；填写结算方式名称 示例：结算方式 |
| shipmentMethodName | string | 否 | 否 | 发运方式；填写发运方式名称 示例：发运方式 |
| signBack | boolean | 否 | 否 | 需要签回；true：是，false:否 示例：true |
| isTradeCustomers | string | 否 | 否 | 是否交易客户；字符类型；'0'：是，'1':否 示例："0" |
| priceMarking | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 价格标识 0：含税优先，1：无税优先 示例：0 |
| merchantRole | object | 否 | 否 | 客户角色信息(营销角色) |
| merchantOptions | boolean | 否 | 否 | 营销伙伴；true：是，false：否 示例：false |
| businessRole | string | 否 | 否 | 业务角色；不填默认为1为业务默认值；2：B2B商城客户，3：2B商家，4：零售加盟商，5：2C商家，6：伙伴客户。选择多个业务角色 半角逗号分隔；没有开通订货管理，不能录入B2B商城客户；没有开通渠道运营中心1.0，不能录入2B商家；没有开通友零售，不能录入零售加盟商；没有开通U商城，不能录入2C商家；没有开通伙伴管理，不能录入伙伴客户；营销伙伴为否，业务角色只允许填写【B2B商城客户】 示例："1" |
| merchantsManager | object | 否 | 否 | 客户管理员信息 |
| countryCode | string | 否 | 否 | 手机区号；填写手机号是必填；例如：86 示例："86" |
| mobile | string | 否 | 否 | 手机号；客户管理员手机号或者邮箱至少有一项必填 示例：手机号 |
| fullName | string | 否 | 否 | 姓名；客户管理员姓名非空时,手机或者邮箱必输；如果手机号或者邮箱用户管理存在，会和用户管理名称保持一致； 示例：姓名 |
| email | string | 否 | 否 | 邮箱；客户管理员手机号或者邮箱至少有一项必填 示例：邮箱 |
| customerAreas | object | 是 | 否 | 客户档案销售区域 |
| id | long | 否 | 否 | 客户档案销售区域子表id，更新和删除时必填 示例：123456 |
| saleAreaIdCode | string | 否 | 是 | 客户档案销售区域子表销售区域；填写销售区域编码；必填 示例：销售区域 |
| isDefault | boolean | 否 | 是 | 是否默认销售区域；必填；true：是，false：否；默认销售区域只能并且必须设置一个 示例：true |
| entityStatus | string | 否 | 否 | 客户档案销售区域实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| principals | object | 是 | 否 | 客户档案负责人 |
| id | long | 否 | 否 | 客户档案负责人子表id，更新和删除时必填 示例：123456 |
| specialManagementDepCode | string | 否 | 否 | 客户档案负责人子表专管部门；填写部门编码；专管部门和专管业务员至少有一项必填 示例：专管部门 |
| professSalesmanCode | string | 否 | 否 | 客户档案负责人子表专管业务员；填写业务员编码；专管部门和专管业务员至少有一项必填 示例：专管业务员 |
| isDefault | boolean | 否 | 是 | 是否默认负责人；必填；true：是，false：否；默认负责人只能并且必须设置一个 示例：true |
| entityStatus | string | 否 | 否 | 客户档案负责人实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| invoicingCustomers | object | 是 | 否 | 客户档案开票客户 |
| id | long | 否 | 否 | 客户档案开票客户子表id，更新和删除时必填 示例：123456 |
| invoicingCustomersIdCode | string | 否 | 是 | 客户档案开票客户子表开票客户；填写开票客户编码 示例：开票客户 |
| isDefault | boolean | 否 | 是 | 是否默认开票客户；必填；true：是，false：否；默认开票客户只能并且必须设置一个 示例：true |
| entityStatus | string | 否 | 否 | 客户档案开票客户实体状态；"Insert":新增，"Update":更新，"Delete":删除。不传默认为新增 示例：Insert |
| blank | boolean | 否 | 否 | 控制不传字段数据是否全部置空处理；默认为false 示例：false |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/newupdate?access_token=访问令牌
Body: {
	"id": 123456,
	"code": "code",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"createOrgCode": "管理组织编码",
	"belongOrgCode": "使用组织编码",
	"transTypeCode": "客户类型",
	"shortname": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"countryName": "国家",
	"countryCode": "CN",
	"newTimeZone": "Africa/Abidjan",
	"languageCode": "zh_CN",
	"parentManageOrgCode": "上级组织编码",
	"parentCustomerCode": "上级客户编码",
	"suppliersCode": "供应商编码",
	"retailInvestors": true,
	"internalOrg": false,
	"internalOrgIdCode": "内部组织编码",
	"taxPayingCategories": 0,
	"customerClassCode": "客户分类编码",
	"customerIndustryCode": "客户行业编码",
	"developmentPartnerCode": "伙伴编码",
	"enterpriseNature": 0,
	"enterpriseName": "企业名称",
	"personName": "姓名",
	"orgName": "组织名称",
	"licenseType": 0,
	"creditCode": "证照号码",
	"leaderName": "法人代表",
	"leaderNameIdNo": "法人代表身份证号",
	"personCharge": "负责人",
	"personChargeIdNo": "负责人身份证号",
	"businessLicenseNo": "经营许可证号",
	"businessterm": "2223-01-01 16:36:17",
	"buildTime": "2223-01-01 16:36:17",
	"contactName": "联系人",
	"contactTel": "联系电话",
	"address": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"regionCode": "110101000000",
	"email": "邮箱",
	"fax": "传真",
	"enterNatureCode": "企业性质",
	"currencyCode": "注册资金币种",
	"money": "1.23",
	"peopleNum": 100,
	"scopeModel": 0,
	"yearMoney": "100",
	"scope": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"website": "网址",
	"wid": "微信公众号",
	"postCode": "邮编",
	"merchantAddressInfos": [
		{
			"id": 123456,
			"addressCode": "地址编码",
			"shipregionCode": "运输区域",
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
			"entityStatus": "Insert"
		}
	],
	"merchantContactInfos": [
		{
			"id": 123456,
			"fullName": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
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
			"entityStatus": "Insert"
		}
	],
	"merchantAgentFinancialInfos": [
		{
			"id": 12456,
			"countryName": "国家",
			"provinceCode": "省份",
			"currencyName": "币种",
			"accountType": "0",
			"bankName": "银行类别",
			"openBankName": "银行网点",
			"bankAccount": "银行账号",
			"bankAccountName": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"jointLineNo": "联行号",
			"remarks": "备注",
			"accountOpeningAddress": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"accountOpeningDate": "2023-05-19 16:52:31",
			"stopStatus": false,
			"isDefault": true,
			"entityStatus": "Insert"
		}
	],
	"merchantAgentInvoiceInfos": [
		{
			"id": 123456,
			"bdBillingTypeName": "发票类型",
			"title": "发票抬头",
			"taxNo": "税号",
			"receievInvoiceMobile": "收票手机号",
			"receievInvoiceEmail": "收票邮箱",
			"telephone": "电话",
			"address": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"bankName": "银行类别",
			"bankDotName": "银行网点",
			"bankAccount": "银行账号",
			"remarks": "备注",
			"isDefault": true,
			"entityStatus": "Insert"
		}
	],
	"merchantApplyRanges": [
		{
			"orgIdCode": "组织"
		}
	],
	"merchantAppliedDetail": {
		"searchCode": "助记码",
		"customerLevelCode": "客户级别",
		"customerTypeCode": "销售渠道",
		"deliveryWarehouseCode": "发货仓库",
		"transactionCurrencyName": "交易币种",
		"exchangeRateTypeCode": "汇率类型",
		"taxRateNtaxRate": "销项税率",
		"payWay": 0,
		"creditServiceDay": 10,
		"collectionAgreementName": "收款协议",
		"settlementMethodName": "结算方式",
		"shipmentMethodName": "发运方式",
		"signBack": true,
		"isTradeCustomers": "\"0\"",
		"priceMarking": 0
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
			"saleAreaIdCode": "销售区域",
			"isDefault": true,
			"entityStatus": "Insert"
		}
	],
	"principals": [
		{
			"id": 123456,
			"specialManagementDepCode": "专管部门",
			"professSalesmanCode": "专管业务员",
			"isDefault": true,
			"entityStatus": "Insert"
		}
	],
	"invoicingCustomers": [
		{
			"id": 123456,
			"invoicingCustomersIdCode": "开票客户",
			"isDefault": true,
			"entityStatus": "Insert"
		}
	],
	"blank": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 错误码，成功时为200 示例：200 |
| success | boolean | 否 | 返回值的成功标志 示例：true |
| data | object | 是 | 返回值客户id |
| id | number |
| 小数位数:0,最大长度:21 | 否 | id 示例：123456 |
| code | string | 否 | 编码 示例：编码 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": [
		{
			"id": 123456,
			"code": "编码"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-09

新增

请求参数 contactDepartment

联系人信息下增加任职部门字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

