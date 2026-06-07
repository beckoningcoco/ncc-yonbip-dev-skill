---
title: "映射维护新增接口"
apiId: "2406643563860328451"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 映射维护新增接口

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-sepmbcdc/fieldValueMapping/openSave

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
| isOverwrite | boolean | 否 | 否 | 是否覆盖导入(true：覆盖导入；false：增量导入) 示例：false 默认值：false |
| fieldMappingImportList | object | 是 | 是 | 批量导入数组 |
| budgetModelCode | string | 否 | 是 | 预算系统编码 示例：Cube1 |
| sysCode | string | 否 | 是 | 业务系统编码 示例：RBSM |
| billCode | string | 否 | 否 | 业务对象编码 示例：znbzbx_memoapply |
| ruleCode | string | 否 | 否 | 规则编码 示例：Rule1 |
| budgetFieldPk | string | 否 | 是 | 预算字段编码 示例：ENTITY |
| bizCloumCode | string | 否 | 是 | 公共档案编码 示例：ucf-org-center&bd.adminOrg.AdminOrgVO |
| fieldMappingExcelVos | object | 是 | 否 | 映射维护数组 |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-sepmbcdc/fieldValueMapping/openSave?access_token=访问令牌
Body: {
	"isOverwrite": false,
	"fieldMappingImportList": [
		{
			"budgetModelCode": "Cube1",
			"sysCode": "RBSM",
			"billCode": "znbzbx_memoapply",
			"ruleCode": "Rule1",
			"budgetFieldPk": "ENTITY",
			"bizCloumCode": "ucf-org-center&bd.adminOrg.AdminOrgVO",
			"fieldMappingExcelVos": [
				{
					"mappingTypeName": "一对一",
					"budgetFieldValue": "1001",
					"bizCloumValue": "1001;1002",
					"budgetAcc": "kmb2",
					"subAcc": "kmb2"
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
| code | number |
| 小数位数:2,最大长度:10 | 否 | 响应码 示例：200 |
| message | string | 否 | 接口信息 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	FAIL


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

