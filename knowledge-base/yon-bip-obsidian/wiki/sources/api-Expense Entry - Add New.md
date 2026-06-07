---
title: "费用录入新增"
apiId: "2253533133713440774"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Entry"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 费用录入新增

> `ContentType	application/json` 请求方式	POST | 分类: Expense Entry (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/ecc/expenseinput/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accpurpose | string | 否 | 否 | 核算目的id |
| accentity | string | 否 | 是 | 会计主体id 示例：1943574303263424517 |
| accbook | string | 否 | 是 | 账簿id 示例：1950756854373023763 |
| bookedDate | string | 否 | 是 | 单据日期 示例：1999-01-01 |
| fiEventRecordNo | string | 否 | 否 | 会计事务记录号 |
| costObjectType | string | 否 | 是 | 成本对象类型，CCO: 成本中心费用录入 PCO: 产品费用录入 SPO: 专项成本费用录入 PRO: 项目成本费用录入 示例：PCO |
| busiOrg | string | 否 | 是 | 业务单元 示例：1943574303263424517 |
| srcClue | string | 否 | 是 | 来源线索，需要保证唯一 示例：uniqueId |
| srcBillVersion | string | 否 | 否 | 来源版本号，默认为时间戳 |
| description | string | 否 | 否 | 描述信息 |
| creator | string | 否 | 否 | 创建人id |
| freeCh | object | 否 | 否 | 自定义特征，map形式，key: 特征编码 value: 文本类型输入文本，档案类型输入档案id |
| items | object | 是 | 是 | 费用录入明细信息 |
| rowNo | string | 否 | 否 | 行号，根据明细数组自动生成（10，20...）,用于报错提示 |
| productCoCode | string | 否 | 否 | 产品成本对象编码，优先使用编码匹配产品成本对象 |
| productCode | string | 否 | 否 | 产品编码，匹配产品成本对象 |
| product_skuSensitive | object | 否 | 否 | 产品特征，map形式，key: 特征编码 value: 文本类型输入文本，档案类型输入档案id |
| orderCode | string | 否 | 否 | 订单号，匹配产品成本对象 |
| orderRow | string | 否 | 否 | 订单行号，匹配产品成本对象 |
| ProductionDeptCode | string | 否 | 否 | 生产部门编码，匹配产品成本对象 |
| opSn | string | 否 | 否 | 工序顺序号，匹配产品成本对象 |
| materialCode | string | 否 | 否 | 物料编码 |
| material_skuSensitive | object | 否 | 否 | 物料特征，map形式，key: 特征编码 value: 文本类型输入文本，档案类型输入档案id |
| batchno | string | 否 | 否 | 物料批次号（启用批次核算） |
| quantity | string | 否 | 否 | 物料数量 |
| costCenter | string | 否 | 否 | 成本中心id |
| specialCo | string | 否 | 否 | 专项/项目成本对象id |
| company | string | 否 | 否 | 公司id，非法人核算目的必填 |
| costElementCode | string | 否 | 是 | 成本要素编码 |
| oppSubjectCode | string | 否 | 否 | 对方科目编码 |
| specialItem | string | 否 | 否 | 项目id |
| wbsDoc | string | 否 | 否 | wbsid |
| projectScheduleTask | string | 否 | 否 | 活动id |
| osmSupplierId | string | 否 | 否 | 委外商id |
| busiDept | string | 否 | 否 | 部门id |
| supplier | string | 否 | 否 | 供应商id |
| personnel | string | 否 | 否 | 人员id |
| expenseItem | string | 否 | 否 | 费用项目id |
| orgAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 组织币实际成本，启用组织币时，必填 |
| amount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币实际成本，没有启用组织币时，必填 |
| grpAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 集团币实际成本 |
| gblAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 全局币实际成本 |
| accRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币汇率 |
| grpRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 集团币汇率 |
| gblRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 全局币汇率 |
| accRateType | string | 否 | 否 | 本币汇率类型，传入汇率类型档案id |
| grpRateType | string | 否 | 否 | 集团币汇率类型，传入汇率类型档案id |
| gblRateType | string | 否 | 否 | 全局币汇率类型 |
| accRateOps | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 本币汇率折算方式，枚举类型，1 : * ，2 : / |
| grpRateOps | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 集团币汇率折算方式，枚举类型，1 : * ，2 : / |
| gblRateOps | number |
| 小数位数:0,最大长度:2 | 否 | 否 | 全局币汇率折算方式，枚举类型，1 : * ，2 : / |
| freeCh | object | 否 | 否 | 自定义特征，map形式，key: 特征编码 value: 文本类型输入文本，档案类型输入档案id |

## 3. 请求示例

Url: /yonbip/CO/ecc/expenseinput/save?access_token=访问令牌
Body: {
	"accpurpose": "",
	"accentity": "1943574303263424517",
	"accbook": "1950756854373023763",
	"bookedDate": "1999-01-01",
	"fiEventRecordNo": "",
	"costObjectType": "PCO",
	"busiOrg": "1943574303263424517",
	"srcClue": "uniqueId",
	"srcBillVersion": "",
	"description": "",
	"creator": "",
	"freeCh": {},
	"items": [
		{
			"rowNo": "",
			"productCoCode": "",
			"productCode": "",
			"product_skuSensitive": {},
			"orderCode": "",
			"orderRow": "",
			"ProductionDeptCode": "",
			"opSn": "",
			"materialCode": "",
			"material_skuSensitive": {},
			"batchno": "",
			"quantity": "",
			"costCenter": "",
			"specialCo": "",
			"company": "",
			"costElementCode": "",
			"oppSubjectCode": "",
			"specialItem": "",
			"wbsDoc": "",
			"projectScheduleTask": "",
			"osmSupplierId": "",
			"busiDept": "",
			"supplier": "",
			"personnel": "",
			"expenseItem": "",
			"orgAmount": 0,
			"amount": 0,
			"grpAmount": 0,
			"gblAmount": 0,
			"accRate": 0,
			"grpRate": 0,
			"gblRate": 0,
			"accRateType": "",
			"grpRateType": "",
			"gblRateType": "",
			"accRateOps": 0,
			"grpRateOps": 0,
			"gblRateOps": 0,
			"freeCh": {}
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

1	2026-03-11

新增

请求参数 specialCo

更新

请求参数 (46)

删除

请求参数 description

2	2025-11-28

新增

请求参数 expenseItem

3	2025-09-24

更新

请求说明

新增

请求参数 (12)

4	2025-06-25

更新

请求说明

新增

请求参数 productCoCode

更新

请求参数 amount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

