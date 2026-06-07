---
title: "资产类别保存"
apiId: "2006595062878175232"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产类别保存

> `ContentType	application/json` 请求方式	POST | 分类: Asset Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/am/category/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 数据 |
| category_code | string | 否 | 是 | 类别编码 示例：1ghq0ATHHT |
| category_name | object | 否 | 是 | 类别名称 |
| special_flag | boolean | 否 | 否 | 特种设备 示例：false 默认值：false |
| assetBusiness | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 资产业务分类枚举，1:房屋，2：土地 3：商铺 示例：1 |
| line_category | boolean | 否 | 否 | 线性类别 示例：false 默认值：false |
| associate_fa_flag | boolean | 否 | 否 | 固定资产核算 示例：false 默认值：false |
| avg_use_life | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 平均使用寿命（月） 示例：4 |
| design_life | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 设计寿命（月） 示例：6 |
| name_pre_flag | boolean | 否 | 否 | 下级名称继承标志 示例：false 默认值：false |
| portrait_flag | boolean | 否 | 否 | 资产画像 示例：false |
| memo | string | 否 | 否 | 备注 示例：4444 |
| enablestate | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 启用状态 示例：2 默认值：2 |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 层级 示例：4 默认值：1 |
| path | string | 否 | 否 | 路径 示例：VETY |
| isEnd | boolean | 否 | 是 | 是否末级 示例：false 默认值：false |
| parent | string | 否 | 否 | 父类别主键 示例：1796528951150510082 |
| bodyvos | object | 是 | 否 | 子表(技术参数) |
| lineparam | object | 是 | 否 | 线性参数 |
| keyparts | object | 是 | 否 | 资产部位 |

## 3. 请求示例

Url: /yonbip/am/category/save?access_token=访问令牌
Body: {
	"data": [
		{
			"category_code": "1ghq0ATHHT",
			"category_name": {
				"zh_TW": "",
				"en_US": "1234",
				"zh_CN": "测试类别1ghq0ATHHT"
			},
			"special_flag": false,
			"assetBusiness": 1,
			"line_category": false,
			"associate_fa_flag": false,
			"avg_use_life": 4,
			"design_life": 6,
			"name_pre_flag": false,
			"portrait_flag": false,
			"memo": "4444",
			"enablestate": 2,
			"level": 4,
			"path": "VETY",
			"isEnd": false,
			"parent": "1796528951150510082",
			"bodyvos": [
				{
					"pk_measuredoc__code": "HUR",
					"show_name": {
						"zh_TW": "",
						"en_US": "",
						"zh_CN": "字符串(小时)"
					},
					"default_value": "10",
					"default_value_id": "",
					"input_length": 5,
					"param_index": 1,
					"pk_measuredoc": "1971569905141022728",
					"classid": "PRESET01_0000LUT9Q1KVH9R6RM0000",
					"nullflag": true,
					"pk_measuredoc__name": "小时",
					"param_name": {
						"zh_TW": "",
						"en_US": "",
						"zh_CN": "字符串"
					},
					"input_digit": 2,
					"archive_name": "",
					"archive_code": "",
					"archive_domain": "",
					"archive_return": "cate_name",
					"archive_define_name": ""
				}
			],
			"lineparam": [
				{
					"param_name": {
						"zh_TW": "",
						"en_US": "",
						"zh_CN": "线性参数"
					},
					"classid__entity_name": "字符串",
					"classid": "PRESET01_0000LUT9Q1KVH9R6RM0000",
					"classid__entity_code": "String",
					"archive_name": "",
					"pk_measuredoc__name": "小时",
					"pk_measuredoc": "1971569905141022728",
					"input_length": 10,
					"input_digit": NaN,
					"archive_code": "ampub_operation_status_ref",
					"archive_domain": "ucf-amc-ambd",
					"archive_return": "specia_name"
				}
			],
			"keyparts": [
				{
					"name": "AA",
					"memo": "AA"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | http返回码(200:成功，其他：异常) 示例：200 |
| message | string | 否 | 返回的信息 示例：操作成功！ |
| data | object | 否 | 返回数据 |
| _entityName | string | 否 | 实体名称 示例：ampub.ambase.CategoryVO |
| fk_parent | string | 否 | 父级主键 示例：1982187055693168647 |
| category_code | string | 否 | 类别编码 示例：TEST3 |
| category_name | object | 否 | 类别名称 |
| special_flag | boolean | 否 | 特种设备标记 示例：false |
| assetBusiness | number |
| 小数位数:0,最大长度:10 | 否 | 资产业务分类枚举 示例：1 |
| line_category | boolean | 否 | 线性类别 示例：true |
| name_pre_flag | boolean | 否 | 下级名称继承标志 示例：false |
| associate_fa_flag | boolean | 否 | 固定资产核算 示例：true |
| avg_use_life | number |
| 小数位数:0,最大长度:10 | 否 | 平均使用寿命 示例：2 |
| design_life | number |
| 小数位数:0,最大长度:10 | 否 | 设计寿命 示例：1 |
| portrait_flag | boolean | 否 | 资产画像 示例：true |
| memo | string | 否 | 备注 示例：备注 |
| enablestate | number |
| 小数位数:0,最大长度:10 | 否 | 启用状态 示例：2 |
| parent | string | 否 | 父类别 示例：1982187055693168647 |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 层级 示例：3 |
| isEnd | boolean | 否 | 是否末级 示例：false |
| sync_status | number |
| 小数位数:0,最大长度:10 | 否 | 同步状态 示例：0 |
| bodyvos | object | 是 | 子对象 |
| attachgroup | object | 是 | 附件分组 |
| lineparam | object | 是 | 线性参数 |
| keyparts | object | 是 | 资产部位 |
| innercode | string | 否 | 内部编码 示例：JYPQ0OKVXXVK |
| path | string | 否 | 路径 示例：JYPQ0OKVXXVK |
| id | string | 否 | 主键 示例：2006587503652896770 |
| sysid | string | 否 | 系统id 示例：AMBD |
| creator | string | 否 | 创建人ID 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| creator__name | string | 否 | 创建人名称 示例：昵称-haoxxia |
| creationtime | string | 否 | 创建时间 示例：2024-05-27 16:12:10 |
| pubts | string | 否 | 时间戳 示例：2024-05-27 16:12:10 |
| errorDetail | object | 是 | 失败信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_entityName": "ampub.ambase.CategoryVO",
		"fk_parent": "1982187055693168647",
		"category_code": "TEST3",
		"category_name": {
			"zh_CN": "测试三级类别",
			"en_US": "",
			"zh_TW": ""
		},
		"special_flag": false,
		"assetBusiness": 1,
		"line_category": true,
		"name_pre_flag": false,
		"associate_fa_flag": true,
		"avg_use_life": 2,
		"design_life": 1,
		"portrait_flag": true,
		"memo": "备注",
		"enablestate": 2,
		"parent": "1982187055693168647",
		"level": 3,
		"isEnd": false,
		"sync_status": 0,
		"bodyvos": [
			{
				"_entityName": "",
				"param_index": 10,
				"classid__entity_name": "字符串",
				"classid": "PRESET01_0000LJPGZ3RX3YAKG10000",
				"classid__entity_code": "String",
				"archive_name": "",
				"pk_measuredoc__name": "克",
				"input_length": 10,
				"input_digit": "",
				"nullflag": true,
				"default_value": "",
				"default_value_id": "",
				"cellConfig": {
					"cControlType": "Input",
					"iMaxLength": "10"
				},
				"param_name": {
					"zh_CN": "技术参数1",
					"en_US": "",
					"zh_TW": ""
				},
				"show_name": {
					"zh_CN": "技术参数1(克)",
					"en_US": "(克)",
					"zh_TW": "(克)"
				},
				"pk_measuredoc": "1811456608112214018",
				"id": "2006587503652896771",
				"pk_category": "2006587503652896770"
			}
		],
		"attachgroup": [
			{}
		],
		"lineparam": [
			{
				"_entityName": "",
				"param_name": {
					"zh_CN": "测试线性参数",
					"en_US": "",
					"zh_TW": ""
				},
				"classid__entity_name": "整数",
				"classid": "PRESET02_0000LJPGZ3RX3YAKG10000",
				"classid__entity_code": "Integer",
				"archive_name": "",
				"pk_measuredoc__name": "小时",
				"pk_measuredoc": "1763914051751510021",
				"input_length": "",
				"input_digit": "",
				"id": "2006587503652896772",
				"pk_category": "2006587503652896770"
			}
		],
		"keyparts": [
			{
				"_entityName": "",
				"name": "部位1",
				"memo": "部位1 ",
				"id": "2006587503652896773",
				"pk_category": "2006587503652896770"
			}
		],
		"innercode": "JYPQ0OKVXXVK",
		"path": "JYPQ0OKVXXVK",
		"id": "2006587503652896770",
		"sysid": "AMBD",
		"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"creator__name": "昵称-haoxxia",
		"creationtime": "2024-05-27 16:12:10",
		"pubts": "2024-05-27 16:12:10"
	},
	"errorDetail": [
		{}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

