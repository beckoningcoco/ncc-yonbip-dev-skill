---
title: "选配参数文件-配置保存"
apiId: "2200234943235227650"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Configuration Parameter File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Configuration Parameter File]
platform_version: "BIP"
source_type: community-api-docs
---

# 选配参数文件-配置保存

> `ContentType	application/json` 请求方式	POST | 分类: Configuration Parameter File (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/vc/variant/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| data | object | 否 | 是 | 数据结构 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主键， 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 参数文件编号，可空，默认走编码规则 |
| description | string | 否 | 是 | 参数文件描述 |
| productId | string | 否 | 否 | 物料ID和物料CODE二选一必传 |
| productCode | string | 否 | 否 | 物料ID和物料CODE二选一必传 |
| _status | string | 否 | 是 | 插入：Insert，更新：Update |
| effectiveDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 生效时间 |
| expiryDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 失效时间 |
| orgId | string | 否 | 否 | 组织ID和组织CODE二选一必传 |
| orgCode | string | 否 | 否 | 组织ID和组织CODE二选一必传 |
| purpose | string | 否 | 是 | 用途 1：销售订单 |
| checkDerivedMaterial | string | 否 | 否 | 是否进行派生物料检查 0：否，1：是 |
| replaceDerivedMaterial | string | 否 | 是 | 必须替换派生物料环节 no_control：不控制，quote_salesquotation：销售报价，sact_salescontract：销售合同，voucher_order：销售订单 |
| vcType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 选配特征类型。 0-特征选配 1-组件选配 示例：0 |
| VCAttrGroupList | object | 是 | 否 | 分组子表 |
| VCComponent | object | 是 | 否 | 组件选配特征子表 |

## 3. 请求示例

Url: /yonbip/mfg/vc/variant/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "",
		"description": "",
		"productId": "",
		"productCode": "",
		"_status": "",
		"effectiveDate": "2026-06-07 11:50:09",
		"expiryDate": "2026-06-07 11:50:09",
		"orgId": "",
		"orgCode": "",
		"purpose": "",
		"checkDerivedMaterial": "",
		"replaceDerivedMaterial": "",
		"vcType": 0,
		"VCAttrGroupList": [
			{
				"id": "",
				"name": "",
				"seq": 0,
				"type": 0,
				"_status": "",
				"pGroupNo": "1",
				"pGroupId": "12244232422",
				"groupNo": "1",
				"VCAttrList": [
					{
						"id": "",
						"characteristic": "",
						"seq": 0,
						"visible": 0,
						"_status": ""
					}
				]
			}
		],
		"VCComponent": [
			{
				"id": "",
				"variantConfigurationAttrGroup": "",
				"groupNo": "1",
				"numEdit": 0,
				"groupEx": 0,
				"mustSelect": 0,
				"componentProductId": "253323233",
				"groupFirst": 0,
				"componentProductCode": "WFL000012",
				"isShow": 1,
				"_status": "Insert",
				"bomComponentId": "125673234333",
				"bomId": "2357732232332",
				"pBomId": "135678885444"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | 主键 |
| code | string | 否 | 参数文件编码 示例：VC202412260003 |
| description | string | 否 | 参数文件描述 |
| characteristicsId | string | 否 | 选配特征组ID |
| purpose | number |
| 小数位数:0,最大长度:10 | 否 | 用途 |
| modifier | string | 否 | 修改人 |
| orgId | string | 否 | 工厂ID |
| productName | string | 否 | 物料名称 |
| effectiveDate | string | 否 | 生效时间 示例：2024-12-26 00:00:00 |
| expiryDate | string | 否 | 失效时间 |
| vouchdate | string | 否 | 单据日期 |
| modifyDate | string | 否 | 修改日期 示例：2025-02-17 00:00:00 |
| createDate | string | 否 | 创建日期 |
| pubts | string | 否 | 时间戳 |
| vcFreeCharacteristics | object | 否 | 选配特征组 |
| productTplId | string | 否 | 物料模板ID |
| creator | string | 否 | 创建人 |
| productId | string | 否 | 物料ID |
| checkDerivedMaterial | string | 否 | 进行派生物料检查 0：否 1： 是 |
| vcType | number |
| 小数位数:0,最大长度:10 | 否 | 选配类型 0：特征选配 1：组件选配 |
| versionCode | string | 否 | BOM版本 示例：1.00 |
| productCode | string | 否 | 物料编码 |
| replaceDerivedMaterial | string | 否 | 必须替换派生物料环节 示例：no_control |
| VCAttrGroupList | object | 是 | VCAttrGroupList |
| VCComponent | object | 是 | 组件选配特征子表 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "",
		"code": "VC202412260003",
		"description": "",
		"characteristicsId": "",
		"purpose": 0,
		"modifier": "",
		"orgId": "",
		"productName": "",
		"effectiveDate": "2024-12-26 00:00:00",
		"expiryDate": "",
		"vouchdate": "",
		"modifyDate": "2025-02-17 00:00:00",
		"createDate": "",
		"pubts": "",
		"vcFreeCharacteristics": {
			"productTplId": "",
			"characteristicsId": "",
			"id": "",
			"wsz": 0,
			"wjcda": "",
			"wjcda_name": "",
			"ytenant": ""
		},
		"productTplId": "",
		"creator": "",
		"productId": "",
		"checkDerivedMaterial": "",
		"vcType": 0,
		"versionCode": "1.00",
		"productCode": "",
		"replaceDerivedMaterial": "no_control",
		"VCAttrGroupList": [
			{
				"name": "AA",
				"type": 0,
				"_status": "Update",
				"seq": 0,
				"id": "",
				"pubts": "2024-12-26 10:16:35",
				"groupNo": "1",
				"pGroupNo": "1",
				"pGroupId": "12343232333",
				"VCAttrList": [
					{
						"seq": 0,
						"_status": "Update",
						"characteristic": "wjcda",
						"defaultValue": "1847880842935271433",
						"id": "2164486521817661446",
						"pubts": "2024-12-26 10:16:35",
						"defaultValueName": "组装拆卸",
						"visible": 1
					}
				]
			}
		],
		"VCComponent": [
			{
				"id": "1124343545",
				"variantConfigurationAttrGroup": "125232323",
				"groupName": "AA",
				"groupNo": "1",
				"numEdit": 0,
				"groupEx": 0,
				"mustSelect": 0,
				"componentProductId": "253323233",
				"componentProductCode": "WFL000012",
				"isShow": 1,
				"bomId": "2357732232332",
				"bomComponentId": "125673234333",
				"pBomId": "135678885444",
				"componentFreeCT": {}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-20

删除

请求参数 componentFreeCT

2	2026-03-20

新增

请求参数 (20)

更新

请求参数 (27)

新增

返回参数 (19)

更新

返回参数 (28)

3	2026-03-20

新增

请求参数 (20)

更新

请求参数 (27)

新增

返回参数 (19)

更新

返回参数 (28)

4	2026-03-20

新增

请求参数 (20)

更新

请求参数 (27)

新增

返回参数 (19)

更新

返回参数 (28)

5	2025-09-04

新增

请求参数 _status

更新

请求参数 id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

