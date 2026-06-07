---
title: "耕地占用税计算表修改"
apiId: "2060753629806592008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calculation table of farmland occupation tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calculation table of farmland occupation tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 耕地占用税计算表修改

> `ContentType	application/json` 请求方式	POST | 分类: Calculation table of farmland occupation tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/farm/land/batch-update

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
| records | object | 是 | 是 | 入参集合 |
| sourceId | string | 否 | 是 | 来源ID 示例：1231 |
| taxOfficeName | string | 否 | 否 | 主管税务机关 |
| landOccupationMode | string | 否 | 否 | 占地方式：JPZAPCZY-经批准按批次转用；JPZDDXZZY-经批准单独选址转用；JPZLSZD-经批准临时占地；WPXZ-未批先占；SHGD-损毁耕地 示例：JPZAPCZY,SHGD |
| isReclamation | string | 否 | 否 | 复垦状态0不需复垦1需复垦 示例：0 |
| landInfoCode | string | 否 | 否 | 土地税源编号 示例：123123 |
| projectName | string | 否 | 否 | 项目批次名称 示例：1 |
| projectCode | string | 否 | 否 | 项目编码 示例：22 |
| approvedLandOccupationNo | string | 否 | 否 | 批准占地文号 示例：1 |
| approvedLandOccupationDepartment | string | 否 | 否 | 批准占地部门 示例：11 |
| approvedLandOccupationArea | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 经批准占地面积 示例：10.0 |
| notifyTime | string | 否 | 否 | 收到书面通知日期 示例：2024-07-08 |
| approveTime | string | 否 | 否 | 批准时间 示例：2024-07-08 |
| landOccupationDate | string | 否 | 否 | 认定的实际占地日期 示例：2024-07-08 |
| landOccupationArea | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 认定的实际占地面积 示例：1 |
| destroyMode | string | 否 | 否 | 损毁耕地：WS-挖损；CKTX-采矿塌陷；YZ-压占；WR-污染 示例：WS,CKTX |
| destroyDate | string | 否 | 否 | 认定的损毁耕地日期 示例：2024-07-08 |
| destroyArea | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 认定的损毁耕地面积 示例：11 |
| occupancyExpirationDate | string | 否 | 否 | 占用期满日期 示例：2024-07-08 |
| nonReclamationReason | string | 否 | 否 | 未复垦原因 |
| farmlandTaxInformationList | object | 是 | 否 | 耕地占用税税款信息 |

## 3. 请求示例

Url: /yonbip/tax/api/farm/land/batch-update?access_token=访问令牌
Body: {
	"records": [
		{
			"sourceId": "1231",
			"taxOfficeName": "",
			"landOccupationMode": "JPZAPCZY,SHGD",
			"isReclamation": "0",
			"landInfoCode": "123123",
			"projectName": "1",
			"projectCode": "22",
			"approvedLandOccupationNo": "1",
			"approvedLandOccupationDepartment": "11",
			"approvedLandOccupationArea": 10,
			"notifyTime": "2024-07-08",
			"approveTime": "2024-07-08",
			"landOccupationDate": "2024-07-08",
			"landOccupationArea": 1,
			"destroyMode": "WS,CKTX",
			"destroyDate": "2024-07-08",
			"destroyArea": 11,
			"occupancyExpirationDate": "2024-07-08",
			"nonReclamationReason": "",
			"farmlandTaxInformationList": [
				{
					"sourceId": "111",
					"province": "湖南省",
					"city": "长沙市",
					"area": "芙蓉区",
					"town": "东屯渡街道",
					"landUseType": "SLGC",
					"collectionItem": "其他",
					"cillectionSubItem": "子目2",
					"applicableTaxAmount": 30,
					"taxDeducationCompleteName": "0009129999|其他|其他",
					"taxableArea": 10,
					"taxReductionArea": 1,
					"taxPaid": 1,
					"baseRegionCode": ""
				}
			]
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
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	操作失败	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-28

删除

请求参数 (6)

调整参数

2	2025-07-03

新增

请求参数 taxOfficeName

新增

请求参数 baseRegionCode

更新

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

