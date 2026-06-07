---
title: "成本模拟执行"
apiId: "1576126493839327237"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Simulation"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Simulation]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本模拟执行

> `ContentType	application/json` 请求方式	POST | 分类: Cost Simulation (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CO/eces/simulationExec/execute

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
| data | object | 是 | 是 | 请求数据体 |
| ident | string | 否 | 是 | 线索ID 示例：156498216171914212 |
| simulationSchemeId | string | 否 | 否 | 模拟方案ID 模拟方案ID和模拟方案编码不能同时为空 示例：1564981904021127168 |
| simulationSchemeCode | string | 否 | 否 | 模拟方案编码 模拟方案ID和模拟方案编码不能同时为空 示例：ckh01-auto |
| bomBuildFun | string | 否 | 是 | bom构建方法枚举 分解到底展开到顶 downtobottom_uptotop 分解到底不展开 downtobottom_noup 展开到顶不分解 uptotop_nobottom 分解一层展开到顶 downtobottomone_uptotop 分解一层不展开 downtobottomone_noup 示例：downtobottom_uptotop |
| accbook | string | 否 | 否 | 账簿ID 账簿ID和账簿编码不能同时为空 示例：1526428353414299664 |
| accbookCode | string | 否 | 否 | 账簿编码 账簿ID和账簿编码不能同时为空 示例：0811 |
| stockorg | string | 否 | 否 | 库存组织ID 库存组织ID和库存组织编码不能同时为空 示例：1526419205141299206 |
| stockorgCode | string | 否 | 否 | 库存组织编码 库存组织ID和库存组织编码不能同时为空 示例：0811 |
| simulationDate | string | 否 | 是 | 模拟日期 示例：2022-10-18 |
| accentity | string | 否 | 否 | 会计主体ID 会计主体ID和会计主体编码不能同时为空 示例：1526419205141299206 |
| accentityCode | string | 否 | 否 | 会计主体编码 会计主体ID和会计主体编码不能同时为空 示例：0811 |
| costTypeId | string | 否 | 否 | 成本类型ID 成本类型ID和成本类型编码不能同时为空 示例：1526429341282992133 |
| costTypeCode | string | 否 | 否 | 成本类型编码 成本类型ID和成本类型编码不能同时为空 示例：Y02 |
| blnUpdateMaProduct | boolean | 否 | 否 | 是否更新核算物料 true 创建核算物料;false 不生成核算物料 示例：true 默认值：true |
| materialModel | string | 否 | 是 | 物料选择方式枚举 物料分类 materialClass 物料 material 物料+特征 materialCharacteristic 示例：material |
| products | object | 是 | 否 | 物料集合,当materialModel枚举值是material,此值必填 |
| materialClasses | object | 是 | 否 | 物料分类集合 当materialModel枚举值是materialClass,此值必填 |
| maProductId | string | 是 | 否 | 核算物料ID集合 List<String> 当materialModel枚举值是materialCharacteristic,此值必填 示例：["1576094788390748162"] |

## 3. 请求示例

Url: /yonbip/CO/eces/simulationExec/execute?access_token=访问令牌
Body: {
	"data": [
		{
			"ident": "156498216171914212",
			"simulationSchemeId": "1564981904021127168",
			"simulationSchemeCode": "ckh01-auto",
			"bomBuildFun": "downtobottom_uptotop",
			"accbook": "1526428353414299664",
			"accbookCode": "0811",
			"stockorg": "1526419205141299206",
			"stockorgCode": "0811",
			"simulationDate": "2022-10-18",
			"accentity": "1526419205141299206",
			"accentityCode": "0811",
			"costTypeId": "1526429341282992133",
			"costTypeCode": "Y02",
			"blnUpdateMaProduct": true,
			"materialModel": "material",
			"products": [
				{
					"productId": "1583376768013172745",
					"productCode": "000341"
				}
			],
			"materialClasses": [
				{
					"materialClassId": "1514645308311076873",
					"materialClassCode": "000001"
				}
			],
			"maProductId": [
				"1576094788390748162"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回的模拟执行信息 |
| idend | string | 否 | 线索ID 示例：156498216171914212 |
| successed | boolean | 否 | true 执行成功 false 执行失败 示例：true |
| msg | string | 否 | 模拟执行返回信息 示例：提交成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"idend": "156498216171914212",
			"successed": true,
			"msg": "提交成功"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	系统异常	根据返回提示信息做相应处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

请求参数 (10)

更新

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

