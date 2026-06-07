---
title: "科目表批量同步（集成流）"
apiId: "2319026986928308232"
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

# 科目表批量同步（集成流）

> `ContentType	application/json` 请求方式	POST | 分类: Chart of Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/accsubjectchartversion/bill/save

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| key | string | 否 | 否 | 来源系统的唯一主键 默认值：objid |
| billnum | string | 否 | 否 | billnum 示例：epub_accsubjectchart 默认值：epub_accsubjectchart |
| data | object | 是 | 否 | data |
| expirationDate | string | 否 | 否 | expirationDate 示例：9999-12-31 默认值：9999-12-31 |
| versionStatus | string | 否 | 否 | versionStatus 示例：1 |
| versionName | string | 否 | 否 | versionName 示例：0000-01-01 |
| effectiveDate | string | 否 | 否 | effectiveDate 示例：0000-01-01 |
| accentity | string | 否 | 否 | accentity 示例：2011160475582595081 |
| accentity_code | string | 否 | 否 | accentity_code 示例：tsr0602002 |
| accentity_name | string | 否 | 否 | accentity_name 示例：tsr0602002 |
| refchart_name | string | 否 | 否 | refchart_name |
| parentchart_name | string | 否 | 否 | parentchart_name |
| accelement | string | 否 | 否 | accelement 示例：2136265021721149851 |
| accelement_name | string | 否 | 否 | accelement_name 示例：IFRS会计准则要素表 |
| accelement_code | string | 否 | 否 | accelement_code 示例：09 |
| code | string | 否 | 否 | code 示例：111111 |
| name | object | 否 | 否 | name |
| subjectCodeControlRule | number |
| 小数位数:0,最大长度:10 | 否 | 否 | subjectCodeControlRule 示例：1 |
| subjectcoderule | string | 否 | 否 | subjectcoderule 示例：4-2-2-2 |
| subjectCodeSeparator | number |
| 小数位数:0,最大长度:10 | 否 | 否 | subjectCodeSeparator 示例：1 |
| subjectCodeLength | number |
| 小数位数:0,最大长度:10 | 否 | 否 | subjectCodeLength 示例：0 |
| showstyle | string | 否 | 否 | showstyle 示例：allSubName |
| bsharesub | boolean | 否 | 否 | bsharesub 示例：false |
| bstrongctrl | boolean | 否 | 否 | bstrongctrl 示例：false |
| chartUse_name | string | 否 | 否 | chartUse_name 示例：会计科目 |
| extcontrolrule | string | 否 | 否 | extcontrolrule 示例：2 |
| description | object | 否 | 否 | description |
| id | string | 否 | 否 | id 示例：2319020218084491268 |
| pubts | string | 否 | 否 | pubts 示例：2025-07-22 15:31:26 |
| chartUse | string | 否 | 否 | chartUse 示例：2136265021721150214 |
| creatorId_name | string | 否 | 否 | creatorId_name 示例：测试环境管理员（勿改） |
| createTime | string | 否 | 否 | createTime 示例：2025-07-22 15:31:25 |
| _status | string | 否 | 否 | _status 示例：Update |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| objid | string | 否 | 否 | 来源系统的唯一主键 默认值：1111111 |

## 3. 请求示例

Url: /yonbip/FCC/accsubjectchartversion/bill/save?access_token=访问令牌
Body: {
	"key": "",
	"billnum": "epub_accsubjectchart",
	"data": [
		{
			"expirationDate": "9999-12-31",
			"versionStatus": "1",
			"versionName": "0000-01-01",
			"effectiveDate": "0000-01-01",
			"accentity": "2011160475582595081",
			"accentity_code": "tsr0602002",
			"accentity_name": "tsr0602002",
			"refchart_name": "",
			"parentchart_name": "",
			"accelement": "2136265021721149851",
			"accelement_name": "IFRS会计准则要素表",
			"accelement_code": "09",
			"code": "111111",
			"name": {
				"zh_CN": "11111"
			},
			"subjectCodeControlRule": 1,
			"subjectcoderule": "4-2-2-2",
			"subjectCodeSeparator": 1,
			"subjectCodeLength": 0,
			"showstyle": "allSubName",
			"bsharesub": false,
			"bstrongctrl": false,
			"chartUse_name": "会计科目",
			"extcontrolrule": "2",
			"description": {},
			"id": "2319020218084491268",
			"pubts": "2025-07-22 15:31:26",
			"chartUse": "2136265021721150214",
			"creatorId_name": "测试环境管理员（勿改）",
			"createTime": "2025-07-22 15:31:25",
			"_status": "Update",
			"resubmitCheckKey": "epub_accsubjectchart_edit_83ced18e-efc9-493b-a69c-65cb702b573c",
			"objid": ""
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| expirationDate | string | 否 | expirationDate 示例：9999-12-31 |
| versionStatus | string | 否 | versionStatus 示例：1 |
| versionName | string | 否 | versionName 示例：0000-01-01 |
| effectiveDate | string | 否 | effectiveDate 示例：0000-01-01 |
| accentity | string | 否 | accentity 示例：2011160475582595081 |
| accentity_code | string | 否 | accentity_code 示例：tsr0602002 |
| accentity_name | string | 否 | accentity_name 示例：tsr0602002 |
| accelement | string | 否 | accelement 示例：2136265021721149851 |
| accelement_name | string | 否 | accelement_name 示例：IFRS会计准则要素表 |
| code | string | 否 | code 示例：111111 |
| name | object | 否 | name |
| subjectCodeControlRule | number |
| 小数位数:0,最大长度:10 | 否 | subjectCodeControlRule 示例：1 |
| subjectcoderule | string | 否 | subjectcoderule 示例：4-2-2-2 |
| subjectCodeSeparator | number |
| 小数位数:0,最大长度:10 | 否 | subjectCodeSeparator 示例：1 |
| showstyle | string | 否 | showstyle 示例：allSubName |
| bsharesub | boolean | 否 | bsharesub 示例：false |
| bstrongctrl | boolean | 否 | bstrongctrl 示例：false |
| chartUse_name | string | 否 | chartUse_name 示例：会计科目 |
| extcontrolrule | string | 否 | extcontrolrule 示例：2 |
| description | object | 否 | description |
| id | string | 否 | id 示例：2319020218084491268 |
| pubts | string | 否 | pubts 示例：2025-07-22 15:40:15 |
| chartUse | string | 否 | chartUse 示例：2136265021721150214 |
| creatorId_name | string | 否 | creatorId_name 示例：测试环境管理员（勿改） |
| createTime | string | 否 | createTime 示例：2025-07-22 15:31:25 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| subjectNameSeparator | string | 否 | subjectNameSeparator 示例：_ |
| bsystem | boolean | 否 | bsystem 示例：false |
| addstyle | string | 否 | addstyle 示例：1 |
| accsubjectchartOid | string | 否 | accsubjectchartOid 示例：2319020218084491268 |
| accsubjectchartVid | string | 否 | accsubjectchartVid 示例：2319020218084491268 |
| modifier | string | 否 | modifier 示例：测试环境管理员（勿改） |
| modifierId | string | 否 | modifierId 示例：1992423783812038662 |
| modifyTime | string | 否 | modifyTime 示例：2025-07-22 15:40:15 |
| modifyDate | string | 否 | modifyDate 示例：2025-07-22 15:40:15 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：3800245594314944 |
| ytenant | string | 否 | ytenant 示例：0000LVXF6KUZ5NHGCH0000 |
| creatorId | string | 否 | creatorId 示例：1992423783812038662 |
| modifierId_name | string | 否 | modifierId_name 示例：测试环境管理员（勿改） |
| traceId | string | 否 | traceId 示例：90253af168c51541 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"expirationDate": "9999-12-31",
		"versionStatus": "1",
		"versionName": "0000-01-01",
		"effectiveDate": "0000-01-01",
		"accentity": "2011160475582595081",
		"accentity_code": "tsr0602002",
		"accentity_name": "tsr0602002",
		"accelement": "2136265021721149851",
		"accelement_name": "IFRS会计准则要素表",
		"code": "111111",
		"name": {
			"zh_CN": "11111"
		},
		"subjectCodeControlRule": 1,
		"subjectcoderule": "4-2-2-2",
		"subjectCodeSeparator": 1,
		"showstyle": "allSubName",
		"bsharesub": false,
		"bstrongctrl": false,
		"chartUse_name": "会计科目",
		"extcontrolrule": "2",
		"description": {},
		"id": "2319020218084491268",
		"pubts": "2025-07-22 15:40:15",
		"chartUse": "2136265021721150214",
		"creatorId_name": "测试环境管理员（勿改）",
		"createTime": "2025-07-22 15:31:25",
		"resubmitCheckKey": "epub_accsubjectchart_edit_83ced18e-efc9-493b-a69c-65cb702b573c",
		"subjectNameSeparator": "_",
		"bsystem": false,
		"addstyle": "1",
		"accsubjectchartOid": "2319020218084491268",
		"accsubjectchartVid": "2319020218084491268",
		"modifier": "测试环境管理员（勿改）",
		"modifierId": "1992423783812038662",
		"modifyTime": "2025-07-22 15:40:15",
		"modifyDate": "2025-07-22 15:40:15",
		"tenant": 3800245594314944,
		"ytenant": "0000LVXF6KUZ5NHGCH0000",
		"creatorId": "1992423783812038662",
		"modifierId_name": "测试环境管理员（勿改）"
	},
	"traceId": "90253af168c51541",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

