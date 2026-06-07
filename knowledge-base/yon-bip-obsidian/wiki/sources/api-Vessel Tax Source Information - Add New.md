---
title: "船舶税源信息-新增"
apiId: "2059320596787363845"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ship tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ship tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 船舶税源信息-新增

> `ContentType	application/json` 请求方式	POST | 分类: Ship tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/vessel/add

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
| records | object | 是 | 是 | 船舶税源的新增信息 |
| sourceId | string | 否 | 是 | 来源ID(唯一来源标识) 示例：0123456789 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：MT0000001 |
| projectCode | string | 否 | 否 | 项目编码 示例：00000001 |
| isSelfDeclaration | string | 否 | 是 | 是否自主申报车船税(0-否、1-是) 示例：0 |
| vesselNumber | string | 否 | 否 | 船舶登记号(文本长度≤50,不支持录入特殊符号) 示例：测试 |
| vesselCode | string | 否 | 是 | 船舶识别号(只能输入大写字母和数字,且为13位) 示例：1234567890123 |
| vesselType | string | 否 | 是 | 船舶类型(1-机动船舶,2-净吨位不超过200吨的机动船舶,3-净吨位超过200吨但不超过2000吨的机动船舶,4-净吨位超过2000吨但不超过10000吨的机动船舶,5-净吨位超过10000吨的机动船舶,6-拖船、非机动驳船,7-净吨位不超过200吨的拖船、非机动驳船,8-净吨位超过200吨但不超过2000吨的拖船、非机动驳船,9-净吨位超过2000吨但不超过10000吨的拖船、非机动驳船,10-净吨位超过10000吨的拖船、非机动驳船,11-游艇,12-艇身长度不超过10米的游艇,13-艇身长度超过10米但不超过18米的游艇,14-艇身长度超过18米但不超过30米的游艇,15-艇身长度超过30米的游艇,16辅助动力帆艇) 示例：1 |
| shipNameCn | string | 否 | 是 | 中文船名(文本长度≤50) 示例：测试 |
| initVesselNumber | string | 否 | 是 | 初次登记号码(文本长度≤50) 示例：123 |
| vesselPort | string | 否 | 否 | 船籍港(文本长度≤50) 示例：123 |
| issueDate | string | 否 | 否 | 发证日期(yyyy-MM-dd) 示例：2024-01-01 |
| acquisitionDate | string | 否 | 是 | 取得所有权日期(yyyy-MM-dd) 示例：2024-01-01 |
| completionDate | string | 否 | 否 | 建成日期(yyyy-MM-dd) 示例：2024-01-01 |
| netTonnage | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 净吨位(最大长度13，精度2) 示例：11.11 |
| power | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 主机功率(最大长度13，精度2) 示例：11.11 |
| hullLength | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 艇身长度(米)(最大长度13，精度2) 示例：11.11 |
| taxUnit | string | 否 | 否 | 计税单位(1-吨、3-米) 示例：1 |
| unitAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 单位税额(最大长度13，精度2) 示例：11.11 |
| terminationDate | string | 否 | 否 | 纳税义务终止日期(yyyy-MM-dd) 示例：2024-01-01 |
| province | string | 否 | 否 | 省/直辖市 示例：北京市 |
| city | string | 否 | 否 | 市 示例：市辖区 |
| area | string | 否 | 否 | 区 示例：海淀区 |
| town | string | 否 | 否 | 城镇/街道 示例：西北旺地区 |
| taxOfficeId_swjgmc | string | 否 | 否 | 主管税务所(科、分局) 示例：国家税务总局合肥市瑶海区第一税务分局办税厅 |
| taxDeducationCodeId_completePolicy | string | 否 | 否 | 减免税性质代码和名称 示例：0012129999|其他特殊原因减免车船税|《中华人民共和国车船税法》 中华人民共和国主席令第43号第四条 |
| deductionRatio | number |
| 小数位数:2,最大长度:2 | 否 | 否 | 减免比例(%) 示例：11 |
| regionCode | string | 否 | 否 | 行政区划代码（（省、市、区、镇/街道组合）与行政区划代码同时上送时，根据行政区划代码匹配平台档案） |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/vessel/add?access_token=访问令牌
Body: {
	"records": [
		{
			"sourceId": "0123456789",
			"orgCode": "MT0000001",
			"projectCode": "00000001",
			"isSelfDeclaration": "0",
			"vesselNumber": "测试",
			"vesselCode": "1234567890123",
			"vesselType": "1",
			"shipNameCn": "测试",
			"initVesselNumber": "123",
			"vesselPort": "123",
			"issueDate": "2024-01-01",
			"acquisitionDate": "2024-01-01",
			"completionDate": "2024-01-01",
			"netTonnage": 11.11,
			"power": 11.11,
			"hullLength": 11.11,
			"taxUnit": "1",
			"unitAmount": 11.11,
			"terminationDate": "2024-01-01",
			"province": "北京市",
			"city": "市辖区",
			"area": "海淀区",
			"town": "西北旺地区",
			"taxOfficeId_swjgmc": "国家税务总局合肥市瑶海区第一税务分局办税厅",
			"taxDeducationCodeId_completePolicy": "0012129999|其他特殊原因减免车船税|《中华人民共和国车船税法》 中华人民共和国主席令第43号第四条",
			"deductionRatio": 11,
			"regionCode": ""
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：成功 |
| data | object | 否 | 数据 示例：[{"code":"1843482212234166276","sourceId":"0123456789"}] |
| code | string | 否 | 船舶税源编号 示例：CBSY20240805000001 |
| sourceId | string | 否 | 来源ID 示例：0123456789 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"code": "1843482212234166276",
			"sourceId": "0123456789"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	错误提示信息	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明

新增

请求参数 regionCode

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

