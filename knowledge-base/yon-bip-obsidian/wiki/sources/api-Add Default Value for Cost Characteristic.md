---
title: "成本特征默认值新增"
apiId: "2343427675409350656"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Component"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Component]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本特征默认值新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/sensitivedefault/bill/save

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
| billnum | string | 否 | 否 | 单据编码 默认值：fiepub_sensitivedefault |
| data | object | 是 | 否 | 数据 |
| id | string | 否 | 否 | id 示例：2343423878646202372 |
| orgIdName | string | 否 | 否 | 组织 示例：*ASAP |
| orgId | string | 否 | 否 | 组织id 示例：1811332586637623306 |
| orgId_code | string | 否 | 否 | 组织编码 示例：*ASAP |
| material_code | string | 否 | 否 | 物料编码 示例：0000234221 |
| material | string | 否 | 否 | 物料id 示例：2313814829361004545 |
| material_name | string | 否 | 否 | 物料名称 示例：LZC-主产品 |
| defaultValue | string | 否 | 是 | 特征默认值 示例：2313811728421355523 |
| defaultValueName | string | 否 | 是 | 特征默认值名称 示例：台式机 |
| characteristicName | string | 否 | 是 | 特征 示例：电脑主机类型 |
| characteristicId | string | 否 | 是 | 特征id 示例：2313812759196729353 |
| characteristicCode | string | 否 | 是 | 特征编码 示例：LZC_DN |
| cellConfig | string | 否 | 否 | 特征默认值展示格式,cRefType为ucfbasedoc.+characteristicCode的值 示例：{"cExtProps":"{\"isNewRefer\":true,\"displayname\":\"name\"}","cControlType":"refer","cName":"LZC_DN","cRefType":"ucfbasedoc.LZC_DN","cShowCaption":"电脑主机类型","cItemName":"LZC_DN","cFieldName":"LZC_DN","refReturn":"id","cCaption":"电脑主机类型"} 默认值：{"cExtProps":"{\"isNewRefer\":true,\"displayname\":\"name\"}","cControlType":"refer","refReturn":"id","cRefType":"ucfbasedoc.LZC_DN"} |
| _status | string | 否 | 是 | _status 示例：Update |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/sensitivedefault/bill/save?access_token=访问令牌
Body: {
	"billnum": "",
	"data": [
		{
			"id": "2343423878646202372",
			"orgIdName": "*ASAP",
			"orgId": "1811332586637623306",
			"orgId_code": "*ASAP",
			"material_code": "0000234221",
			"material": "2313814829361004545",
			"material_name": "LZC-主产品",
			"defaultValue": "2313811728421355523",
			"defaultValueName": "台式机",
			"characteristicName": "电脑主机类型",
			"characteristicId": "2313812759196729353",
			"characteristicCode": "LZC_DN",
			"cellConfig": "{\"cExtProps\":\"{\\\"isNewRefer\\\":true,\\\"displayname\\\":\\\"name\\\"}\",\"cControlType\":\"refer\",\"cName\":\"LZC_DN\",\"cRefType\":\"ucfbasedoc.LZC_DN\",\"cShowCaption\":\"电脑主机类型\",\"cItemName\":\"LZC_DN\",\"cFieldName\":\"LZC_DN\",\"refReturn\":\"id\",\"cCaption\":\"电脑主机类型\"}",
			"_status": "Update"
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
| id | string | 否 | id 示例：2343462567711604742 |
| orgIdName | string | 否 | 组织 示例：*ASAP |
| orgId | string | 否 | 组织id 示例：1811332586637623306 |
| orgId_code | string | 否 | 组织编码 示例：*ASAP |
| material_code | string | 否 | 物料编码 示例：0000234221 |
| material | string | 否 | 物料 示例：2313814829361004545 |
| material_name | string | 否 | 物料名称 示例：LZC-主产品 |
| defaultValue | string | 否 | 默认值 示例：2313811728421355523 |
| defaultValueName | string | 否 | 特征默认值名称 示例：笔记本 |
| characteristicName | string | 否 | 特征 示例：电脑主机类型 |
| characteristicId | string | 否 | 特征id 示例：2313812759196729353 |
| characteristicCode | string | 否 | 特征编码 示例：LZC_DN |
| cellConfig | string | 否 | 特征默认值配置 示例：{"cExtProps":"{\"isNewRefer\":true,\"displayname\":\"name\"}","cControlType":"refer","refReturn":"id"} |
| dataType | string | 否 | dataType 示例：refer |
| orderNum | number |
| 小数位数:0,最大长度:10 | 否 | 排序号 示例：0 |
| creatorId | string | 否 | 创建人id 示例：1525641755939569667 |
| creator | string | 否 | 创建人 示例：u8c_vip管理员 |
| createTime | string | 否 | 创建时间 示例：2025-08-24 13:55:49 |
| createDate | string | 否 | 创建日期 示例：2025-08-24 13:55:49 |
| pubts | string | 否 | 时间戳 示例：2025-08-24 13:55:49 |
| creatorId_name | string | 否 | 创建人 示例：u8c_vip管理员 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2343462567711604742",
		"orgIdName": "*ASAP",
		"orgId": "1811332586637623306",
		"orgId_code": "*ASAP",
		"material_code": "0000234221",
		"material": "2313814829361004545",
		"material_name": "LZC-主产品",
		"defaultValue": "2313811728421355523",
		"defaultValueName": "笔记本",
		"characteristicName": "电脑主机类型",
		"characteristicId": "2313812759196729353",
		"characteristicCode": "LZC_DN",
		"cellConfig": "{\"cExtProps\":\"{\\\"isNewRefer\\\":true,\\\"displayname\\\":\\\"name\\\"}\",\"cControlType\":\"refer\",\"refReturn\":\"id\"}",
		"dataType": "refer",
		"orderNum": 0,
		"creatorId": "1525641755939569667",
		"creator": "u8c_vip管理员",
		"createTime": "2025-08-24 13:55:49",
		"createDate": "2025-08-24 13:55:49",
		"pubts": "2025-08-24 13:55:49",
		"creatorId_name": "u8c_vip管理员"
	}
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

