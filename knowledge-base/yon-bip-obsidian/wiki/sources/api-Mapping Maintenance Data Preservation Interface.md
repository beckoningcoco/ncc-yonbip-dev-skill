---
title: "映射维护数据保存接口"
apiId: "2293858916670373891"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Data Pipeline"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Data Pipeline]
platform_version: "BIP"
source_type: community-api-docs
---

# 映射维护数据保存接口

> `ContentType	application/json` 请求方式	POST | 分类: EPM Data Pipeline (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/columnMapping/saveColumnMappings

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
| productType | string | 否 | 是 | 计划预算请输入：BP；合并报表请输入：BCS |
| cubeCode | string | 否 | 是 | 预算请输入维度体系编码；合并请输入模型编码 |
| tDimCode | string | 否 | 是 | 请输入目标维度编码 |
| outSysCode | string | 否 | 否 | 请输入外部系统编码 |
| ruleCode | string | 否 | 否 | 请输入导入规则编码 |
| saveType | string | 否 | 是 | 请输入字符串-1测试接口，根据接口返回提示语选择所需场景参数 |
| columnMappingInfosVOS | object | 是 | 是 | 具体配的映射维护数据 |
| mappingType | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 映射类型：一对一请传：1；IN请传：2；BETWEEN请传：3；多维匹配请传：4；模糊匹配请传：5 |
| sDimVal | string | 否 | 是 | 映射维护-源值 |
| tDimVal | string | 否 | 是 | 映射维护-目标值 |
| changeSign | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 是否更改正负号，请输入0或1（0代表不更改正负号； 1代表更改正负号） |
| name | string | 否 | 否 | 规则名称，映射维护匹配类型为模糊匹配时，规则名称必填 |
| description | string | 否 | 否 | 说明 |
| cDimCode | string | 否 | 否 | 重分类维度 |
| cDimVal | string | 否 | 否 | 重分类到 |
| getOriginalTargetValue | string | 否 | 否 | 原目标是否取值 |
| getValueType | string | 否 | 否 | 取值类型 |
| tcDimCode | string | 否 | 否 | 目标维度 |
| tcDimVal | string | 否 | 否 | 目标维度值 |
| groupSort | string | 否 | 否 | 分组 |

## 3. 请求示例

Url: /yonbip/FCC/columnMapping/saveColumnMappings?access_token=访问令牌
Body: {
	"productType": "",
	"cubeCode": "",
	"tDimCode": "",
	"outSysCode": "",
	"ruleCode": "",
	"saveType": "",
	"columnMappingInfosVOS": [
		{
			"mappingType": 0,
			"sDimVal": "",
			"tDimVal": "",
			"changeSign": 0,
			"name": "",
			"description": "",
			"cDimCode": "",
			"cDimVal": "",
			"getOriginalTargetValue": "",
			"getValueType": "",
			"tcDimCode": "",
			"tcDimVal": "",
			"groupSort": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

