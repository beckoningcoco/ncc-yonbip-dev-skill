---
title: "科目表查询"
apiId: "ebbcfcb2bea643d3a4789c617f6189bd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Chart of Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Chart of Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目表查询

> `ContentType	application/json` 请求方式	POST | 分类: Chart of Accounts (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/accsubjectchart/getSubjectChart

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pk_org | string | 否 | 否 | 会计主体id（会计主体id和会计主体编码二选一必填，id和编码同时存在时以id为准） 示例：2112699999883520 |
| code | string | 否 | 否 | 会计主体编码（会计主体id和会计主体编码二选一必填，id和编码同时存在时以id为准） 示例：1002 |
| conditions | object | 是 | 否 | 自定义查询条件 |
| field | string | 否 | 否 | 作为查询条件的字段。示例：pubts 示例：pubts |
| operator | string | 否 | 否 | 操作符,>=,=,<= 示例：>= 示例：>= |
| value | string | 否 | 否 | 值。示例：2024-05-23 14:00:37 示例：2024-05-23 14:00:37 |

## 3. 请求示例

Url: /yonbip/fi/fipub/accsubjectchart/getSubjectChart?access_token=访问令牌
Body: {
	"pk_org": "2112699999883520",
	"code": "1002",
	"conditions": [
		{
			"field": "pubts",
			"operator": ">=",
			"value": "2024-05-23 14:00:37"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 是 | 返回值信息 |
| id | string | 否 | 科目表id 示例：0CA9C285-2C2C-4B53-8D09-B07892638B2F |
| creator | object | 否 | 创建人信息 |
| creationtime | string | 否 | 创建时间 示例：2021-09-24 14:20:44 |
| modifier | object | 否 | 编辑人 |
| modifiedtime | string | 否 | 编辑时间 示例：2021-09-24 14:20:44 |
| pk_org | object | 否 | 组织信息 |
| pk_group | string | 否 | 集团 |
| description | string | 否 | 备注 |
| ts | string | 否 | 时间（系统字段） 示例：2021-09-24 14:20:44 |
| dr | long | 否 | 是否删除（0:否;1:是） 示例：0 |
| state | long | 否 | 冗余字段 示例：0 |
| tenantid | string | 否 | 租户id 示例：0000KMZX55KYFGLJ4A0000 |
| srctplid | string | 否 | figlbase中同步过来的科目表id |
| ytenantid | string | 否 | 租户id 示例：0000KMZX55KYFGLJ4A0000 |
| code | string | 否 | 科目表编码 示例：0924CESHI |
| name | string | 否 | 科目表名称 示例：0924CESHI |
| name2 | string | 否 | 科目表英文名称 |
| name3 | string | 否 | 科目表繁体名称 |
| name4 | string | 否 | name(4-6)科目表名称预留字段 |
| parentid | string | 否 | 父级科目id |
| classifyid | string | 否 | 冗余字段 |
| enable | boolean | 否 | 是否可用 示例：0:否;1:是 |
| def1 | string | 否 | def(1-30预留字段) |
| parentchart | string | 否 | 父级科目表id |
| bodies | string | 否 | 包含的科目集合 |
| childrenCharts | string | 否 | 包含的子级科目表 |
| showStyle | string | 否 | 科目名称显示格式 示例：逐级:allSubName;本级:ownName |
| accelement | object | 否 | 会计要素表信息 |
| system | string | 否 | 是否预置 |
| subjectcoderule | string | 否 | 科目编码规则 示例：3-2-2-2 |
| subjectNameSeparator | string | 否 | 科目名称分隔符 示例：_ |
| description2 | string | 否 | description（2-6）备注预留字段 |
| sharesub | boolean | 否 | 是否共享下级（false:否;true:是） 示例：true |
| refaccsubjectchart | object | 否 | 引用科目表信息 |
| strongctrl | boolean | 否 | 是否强管控（false:否;true:是） 示例：true |
| srccoreid | string | 否 | 派生的核心租户的数据id |
| accountbookIds | object | 是 | 引用科目表的账簿信息 |
| code | long | 否 | 返回值成功编码 示例：200 |

## 5. 正确返回示例

{
	"data": [
		{
			"id": "0CA9C285-2C2C-4B53-8D09-B07892638B2F",
			"creator": {
				"id": "1838579e-6b2a-40e0-8c36-9d64817ba53c",
				"code": "YHT-517-1691592812680175",
				"name": "中国梦之队yyds"
			},
			"creationtime": "2021-09-24 14:20:44",
			"modifier": {
				"id": "e07fcbc1-cf30-42fc-851f-75373cccc162",
				"code": "YHT-5307-45121566353554703",
				"name": "13611215882"
			},
			"modifiedtime": "2021-09-24 14:20:44",
			"pk_org": {
				"id": "2204731904725760",
				"code": "1002",
				"name": "采购部"
			},
			"pk_group": "",
			"description": "",
			"ts": "2021-09-24 14:20:44",
			"dr": 0,
			"state": 0,
			"tenantid": "0000KMZX55KYFGLJ4A0000",
			"srctplid": "",
			"ytenantid": "0000KMZX55KYFGLJ4A0000",
			"code": "0924CESHI",
			"name": "0924CESHI",
			"name2": "",
			"name3": "",
			"name4": "",
			"parentid": "",
			"classifyid": "",
			"enable": "",
			"def1": "",
			"parentchart": "",
			"bodies": "",
			"childrenCharts": "",
			"showStyle": "逐级:allSubName;本级:ownName",
			"accelement": {
				"id": "0a053785-9383-11eb-9643-b8599ff2368a",
				"code": "01",
				"name": "专合社会计要素表"
			},
			"system": "",
			"subjectcoderule": "3-2-2-2",
			"subjectNameSeparator": "_",
			"description2": "",
			"sharesub": true,
			"refaccsubjectchart": {
				"id": "0a3d3fce-9383-11eb-9643-b8599ff2368a",
				"code": "SpecialCooperativesChart#0003",
				"name": "专合社科目表"
			},
			"strongctrl": true,
			"srccoreid": "",
			"accountbookIds": [
				{
					"id": "EF536CEB-A737-4E85-A016-447AE45D4168",
					"code": "001_0001",
					"name": "旭日公司",
					"accsubjectchart": "1493247429067669504"
				}
			]
		}
	],
	"code": 200
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code=0,success=false	表示查询有报错	查看message的信息


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

