---
title: "供应商档案详情查询"
apiId: "691bc7a46da348c8b4d906c82050fd64"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendor/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID    示例: 2485170924622080 |
| orgId | string | query | 否 | 组织ID（不传则查询管理组织）    示例: 666666 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/detail?access_token=访问令牌&id=2485170924622080&orgId=666666

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| yhttenant | string | 否 | 对应企业 示例：d1573aae-795e-47bb-93e6-1116a932d325 |
| correspondingorg_name | string | 否 | 对应组织 示例：九江酷酷熊（河北）有限公司 |
| vendorzipcode | string | 否 | 邮政编码 示例：100000 |
| investigationFilePath | string | 否 | 考察报告附件id 示例：36f49140-4cd7-11ec-8e7d-c9f20806dd6c |
| correspondingorg | string | 否 | 对应组织id 示例：2236189999895296 |
| applySource | string | 否 | 供应商来源 示例：来着大西北 |
| parentVendor_name | string | 否 | 上级供应商 示例：今麦郎股份有限公司 |
| masterOrgKeyField | string | 否 | 标记主组织的字段 示例：org |
| busPerformanceFilePath | string | 否 | 经营业绩附件id 示例：36e6d5a0-4cd7-11ec-8e7d-c9f20806dd6c |
| vendoraddress | string | 否 | 通信地址 示例：北京市海淀区知春路 |
| entProfileFilePath | string | 否 | 企业介绍附件id 示例：36d32690-4cd7-11ec-8e7d-c9f20806dd6c |
| bcoordination | string | 否 | 是否协同（0:否，1:是） 示例：0 |
| parentVendor | string | 否 | 上级供应商id 示例：2237508814016768 |
| correspondingcust | string | 否 | 对应客户id 示例：2376609571737856 |
| taxitems_name | string | 否 | 税目字段(已经弃用，请使用业务信息中的税率字段) 示例：13% |
| companytype | string | 否 | 企业类型（枚举）"0" "生产商" "1" "代理商" "2" "服务商" "3" "其他" "4" "贸易商" 示例：1 |
| tenantErrorMsg | string | 否 | 生成租户失败原因 示例：租户名称重复 |
| licenseType | string | 否 | 证照类型（枚举）"businessLicense" "营业执照" "idCard" "居民身份证" "other" "其他" "passport" "护照" 示例：businessLicense |
| relationTenantId | string | 否 | 关联租户id 示例：0000KW4M0KHO42M9MT0000 |
| relationTenantUserCode | string | 否 | 账号 示例：157****6475 |
| vendorfax | string | 否 | 传真 示例：010-82343454 |
| language | string | 否 | 语言id 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0 |
| syncErpFlag | boolean | 否 | 是否同步ERP 示例：true |
| country | string | 否 | 国家id 示例：6cefdb2b-180f-4ba5-8710-fa5a27a108bb |
| country_code | string | 否 | 国家地区编码 示例：AE |
| country_name | string | 否 | 国家地区 示例：阿联酋 |
| investigationNotes | string | 否 | 考察情况说明 示例：考察通过，一切符合要求 |
| address | string | 否 | 注册地址 示例：北京市海淀区知春路 |
| trade | string | 否 | 所属行业(枚举)"1" "计算机硬件/网络设备" "10" "保险" "11" "房地产/建筑/建材/工程" "12" "家居/室内设计/装饰装潢" "13" "物业管理/商业中心" "14" "广告/会展/公关/市场推广" "15" "媒体/出版/影视/文化/艺术" "16" "印刷/包装/造纸" "17" "咨询/管理产业/法律/财会" "18" "教育/培训" "19" "检验/检测/认证" "2" "计算机软件" "20" "中介服务" "21" "贸易/进出口" "22" "零售/批发" "23" "快速消费品（食品/饮料/烟酒/化妆品）" "24" "耐用消费品（服装服饰/纺织/皮革/家具/家电）" "25" "办公用品及设备" "26" "礼品/玩具/工艺美术/收藏品" "27" "大型设备/机电设备/重工业" "28" "加工制造（原料加工/模具）" "29" "汽车/摩托车（制造/维护/配件/销售/服务）" "3" "IT服务（系统/数据/维护）/多领域经营" "30" "交通/运输/物流" "31" "医药/生物工程" "32" "医疗/护理/美容/保健" "33" "医疗设备/器械" "34" "酒店/餐饮" "35" "娱乐/体育/休闲" "36" "旅游/度假" "37" "石油/石化/化工" "38" "能源/矿产/采掘/冶炼" "39" "电气/电力/水利" "4" "互联网/电子商务" "40" "航空/航天" "41" "学术/科研" "42" "政府/公共事业/非盈利机构" "43" "环保" "44" "农/林/牧/渔" "45" "跨领域经营" "46" "其他" "5" "网络游戏" "6" "通讯（设备/运营/增值服务）" "7" "电子技术/半导体/集成电路" "8" "仪器仪表及工业自动化" "9" "金融/银行/投资/基金/证券" 示例：1 |
| wechatpublicaccount | string | 否 | 微信公众号 示例：用友采购云 |
| supplyType | string | 否 | 供应商类型（枚举）"0" "企业" "1" "个人" "2" "其他" 示例：1 |
| busPerformance | string | 否 | 经营业绩 示例：第一季度盈利1000万元 |
| capacity | string | 否 | 产能/供货能力 示例：每日生产拖拉机1000台 |
| relationEnterpriseId | string | 否 | 关联租户id |
| relationEnterpriseId_name | string | 否 | 关联租户 示例：东方红拖拉机工厂 |
| ycnCode | string | 否 | YCN编码 示例：YC00000011578 |
| serviceRange | string | 否 | 经营范围 示例：日常生活用品 |
| cooperationdate | DateTime | 否 | 首次合作日期 示例：2021-11-18 00:00:00 |
| registerFund | string | 否 | 注册资本 示例：2000000 |
| registerCurrency | string | 否 | 注册币种id 示例：2152588146692357 |
| registerCurrency_name | string | 否 | 注册资本币种 示例：美元 |
| foundDate | string | 否 | 成立日期 示例：2021-11-01 00:00:00 |
| vendorWebUrl | string | 否 | 网站地址 示例：https://www.baidu.com |
| legalBody | string | 否 | 法定代表人 示例：王宝强 |
| entProfile | string | 否 | 企业介绍 示例：公司成立于1998年... |
| extSystemCode | string | 否 | 档案来源（枚举）"0" "档案自建" "1" "ERP同步" "10" "竞价定标" "11" "法定招投标资格预审" "12" "法定招投标资格后审" "13" "法定招投标中标" "14" "excel导入" "2" "自主准入注册" "3" "内部准入申请" "4" "询价报价" "5" "询价中标" "6" "招标资格预审" "7" "招标资格后审" "8" "招标中标" "9" "竞价资格预审" 示例：1 |
| org | string | 否 | 行政组织id 示例：666666 |
| taxPayingCategories | long | 否 | 纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税、 示例：0 |
| vendorApplyRangeId | long | 否 | 供应商与组织关联表id 示例：1891832769630465 |
| vendorclass_code | string | 否 | 所属分类编码 示例：gysfl002 |
| vendorphone | string | 否 | 固定电话 示例：010-67861245 |
| code | string | 否 | 编码 示例：l0020011 |
| customItems | object | 否 | 自定义项 |
| creditcode | string | 否 | 统一社会信用代码 示例：001 |
| datasource | string | 否 | 档案来源, 0:零售系统、1:后台下发、2:物料中心、 示例：2 |
| vendoremail | string | 否 | 电子邮箱 示例：test@yonyou.com |
| internalunit | boolean | 否 | 内部组织, true:是、false:否、 示例：true |
| isApplied | boolean | 否 | 是否被分配者使用 示例：true |
| name | muti_lang | 否 | 供应商名称 |
| vendorclass | long | 否 | 所属分类id 示例：1511100333773056 |
| timeZone | string | 否 | 时区 示例：4f0e92c3-3b43-44b0-a1b8-ba85a312e6bf |
| vendorextends | object | 否 | 业务属性（非主属性），使用组织可以编辑 |
| vendorOrgs | object | 是 | 供应商适用组织[aa.vendor.VendorOrg] |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 10:31:48 |
| org_name | string | 否 | 组织名称 示例：企业账号级 |
| timeZone_Name | string | 否 | 时区 示例：(UTC+06:30) 缅甸标准时间 |
| vendorApplyRange_org_name | string | 否 | 使用组织 名称 示例：企业账号级 |
| regionCode | string | 否 | 开户地区 示例：140404000000 |
| vendorbanks | object | 是 | 供应商银行 |
| retailInvestors | boolean | 否 | 散户, true:是、false:否、 示例：false |
| vendorApplyRange_org | string | 否 | 使用组织主键 id 示例：666666 |
| vendorcontactss | object | 是 | 供应商联系人[aa.vendor.VendorContacts] |
| isCreator | boolean | 否 | 是否创建者, true:是、false:否、 示例：true |
| org_code | string | 否 | 组织编码 示例：global00 |
| id | long | 否 | 供应商档案id 示例：1891832769614080 |
| vendorclass_name | string | 否 | 所属分类 名称 示例：供应商分类002 |
| vendorAddresses | object | 是 | 地址信息 |
| vendorQualifies | object | 是 | 资质子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"yhttenant": "d1573aae-795e-47bb-93e6-1116a932d325",
		"correspondingorg_name": "九江酷酷熊（河北）有限公司",
		"vendorzipcode": "100000",
		"investigationFilePath": "36f49140-4cd7-11ec-8e7d-c9f20806dd6c",
		"correspondingorg": "2236189999895296",
		"applySource": "来着大西北",
		"parentVendor_name": "今麦郎股份有限公司",
		"masterOrgKeyField": "org",
		"busPerformanceFilePath": "36e6d5a0-4cd7-11ec-8e7d-c9f20806dd6c",
		"vendoraddress": "北京市海淀区知春路",
		"entProfileFilePath": "36d32690-4cd7-11ec-8e7d-c9f20806dd6c",
		"bcoordination": "0",
		"parentVendor": "2237508814016768",
		"correspondingcust": "2376609571737856",
		"taxitems_name": "13%",
		"companytype": "1",
		"tenantErrorMsg": "租户名称重复",
		"licenseType": "businessLicense",
		"relationTenantId": "0000KW4M0KHO42M9MT0000",
		"relationTenantUserCode": "157****6475",
		"vendorfax": "010-82343454",
		"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
		"syncErpFlag": true,
		"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
		"country_code": "AE",
		"country_name": "阿联酋",
		"investigationNotes": "考察通过，一切符合要求",
		"address": "北京市海淀区知春路",
		"trade": "1",
		"wechatpublicaccount": "用友采购云",
		"supplyType": "1",
		"busPerformance": "第一季度盈利1000万元",
		"capacity": "每日生产拖拉机1000台",
		"relationEnterpriseId": "",
		"relationEnterpriseId_name": "东方红拖拉机工厂",
		"ycnCode": "YC00000011578",
		"serviceRange": "日常生活用品",
		"cooperationdate": "2021-11-18 00:00:00",
		"registerFund": "2000000",
		"registerCurrency": "2152588146692357",
		"registerCurrency_name": "美元",
		"foundDate": "2021-11-01 00:00:00",
		"vendorWebUrl": "https://www.baidu.com",
		"legalBody": "王宝强",
		"entProfile": "公司成立于1998年...",
		"extSystemCode": "1",
		"org": "666666",
		"taxPayingCategories": 0,
		"vendorApplyRangeId": 1891832769630465,
		"vendorclass_code": "gysfl002",
		"vendorphone": "010-67861245",
		"code": "l0020011",
		"customItems": {
			"define12": "供应商属性名称05",
			"vendor": 1891832769614080,
			"define14": "供应商属性名称01",
			"define16": "供应商属性01",
			"define17": "111",
			"define18": "212",
			"define19": "122",
			"define13": "供应商属性名称03"
		},
		"creditcode": "001",
		"datasource": "2",
		"vendoremail": "test@yonyou.com",
		"internalunit": true,
		"isApplied": true,
		"name": {
			"zh_TW": "繁体",
			"en_US": "英文",
			"zh_CN": "中文"
		},
		"vendorclass": 1511100333773056,
		"timeZone": "4f0e92c3-3b43-44b0-a1b8-ba85a312e6bf",
		"vendorextends": {
			"paymentagreement": "2531705594271232",
			"priceTag": "0",
			"freezestatus": "0",
			"createDate": "2021-09-08 00:00:00",
			"accessstatus": "1",
			"invoiceBizType": "1",
			"taxrate": "0",
			"taxitems": "2152588149248262",
			"shipvia_name": "公路运输-普通",
			"department": "1511053754585344",
			"department_code": "dep_caigou",
			"department_name": "采购部",
			"taxname": "免税",
			"paymentagreement_name": "日结",
			"person": "2155369089470720",
			"person_name": "王宝强",
			"currencyname": "韩元",
			"creditServiceDay": 1,
			"createTime": "2020-08-29 10:31:49",
			"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"stopstatus": false,
			"simplename": "供应商11",
			"deliveryvendor": 1891832769614080,
			"invoicevendor": 1890752469471488,
			"vendorApplyRangeId": 1891832769630465,
			"settlemethod": 1511070801350912,
			"settlemethod_name": "现金结算",
			"exchangeratetype": "41a219073e1e4b78ba9f63adabc1b224",
			"exchangeratetype_name": "基准汇率",
			"modifyTime": "2020-08-29 15:00:24",
			"helpcode": "GYS02",
			"creator": "YonSuite默认用户",
			"id": 1891832769614081,
			"invoicevendor_name": "供应商档案01",
			"shipvia": 1511117517148416,
			"deliveryvendor_name": "供应商11",
			"modifier": "YS测试1",
			"vendor": 1891832769614080,
			"financialSynergy": false
		},
		"vendorOrgs": [
			{
				"org": "666666",
				"org_code": "global00",
				"isCreator": true,
				"id": 1891832769630465,
				"org_name": "企业账号级",
				"isApplied": true,
				"vendororg": 1891832769614080
			}
		],
		"pubts": "2020-08-29 10:31:48",
		"org_name": "企业账号级",
		"timeZone_Name": "(UTC+06:30) 缅甸标准时间",
		"vendorApplyRange_org_name": "企业账号级",
		"regionCode": "140404000000",
		"vendorbanks": [
			{
				"bankFilePath": "665aaf57-1d79-4e84-80f4-6899f6ec4ce9",
				"correspondentcode": "NIANHANG911",
				"accountname": {
					"zh_TW": "繁体",
					"en_US": "英文",
					"zh_CN": "中文"
				},
				"stopstatus": false,
				"country": "bf8fafe3-f309-11e8-817e-7cd30abea0c0",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"memo": {},
				"id": 1891832769614082,
				"bank": "ffcac237-cda2-11e7-8e8e-7cd30abe",
				"province": "江苏省",
				"defaultbank": true,
				"openaccountbank": "000e99e8-a6a8-41d9-a521-6f15496c63f7",
				"bank_name": "中国农业银行",
				"country_name": "安道尔",
				"account": "001",
				"openaccountbank_name": "中国农业银行股份有限公司阜南鹿城分理处",
				"accountType": 0,
				"vendor": 1891832769614080,
				"currency_name": "人民币"
			}
		],
		"retailInvestors": false,
		"vendorApplyRange_org": "666666",
		"vendorcontactss": [
			{
				"mobileCountrycode": "86",
				"gender": "1",
				"contactemail": "18611240001@163.com",
				"umallcontact": false,
				"defaultcontact": false,
				"id": 1891832769630464,
				"memo": {},
				"position": {
					"zh_TW": "繁体",
					"en_US": "英文",
					"zh_CN": "中文"
				},
				"udhcontact": false,
				"customcontact": false,
				"vendor": 1891832769614080,
				"contactname": "测试",
				"contactmobile": "15110288765"
			}
		],
		"isCreator": true,
		"org_code": "global00",
		"id": 1891832769614080,
		"vendorclass_name": "供应商分类002",
		"vendorAddresses": [
			{
				"id": 2489631238279424,
				"addressName": "公司的办公楼",
				"country": "0040be98-735b-44c0-afe5-54d11a96037b",
				"country_code": "CN",
				"country_name": "中国",
				"addressType": 1,
				"longitude": "116.435524",
				"latitude": "39.980470",
				"detailAddress": "北京市朝阳区太阳宫(地铁站)",
				"contact": "2489287703957761",
				"contactphone": "010-5623897",
				"contactmobile": "15701656478",
				"contactname": "张三",
				"WeChat": "vx_wj0232s212",
				"qq": "5451309674",
				"isDefault": false,
				"region": "340828000000",
				"vendor": 2489287702810880,
				"memo": "这是个备注",
				"zipcode": "100000"
			}
		],
		"vendorQualifies": [
			{
				"id": 2503713075122432,
				"fileMust": true,
				"qualifydoc_name": "营业执照",
				"filePath": "450440af-2a76-4532-9306-53d0b2cc2eb2",
				"remark": "这是备注",
				"qualifydoc": 1,
				"qualifyCode": "512321547513214",
				"longEffective": true,
				"qualifyDate": "2021-11-04 00:00:00",
				"qualifyExpDate": "2021-11-05 00:00:00",
				"qualifydoc_description": "这是证件的描述",
				"vendor": "所属供应商的id",
				"qualifyGrade": 150,
				"qualifyGrade_name": "一级"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-17

更新

请求参数 orgId

删除

请求参数 vendorApplyRangeId

更新

返回参数 (41)

隐藏vendorApplyRangeid参数


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

