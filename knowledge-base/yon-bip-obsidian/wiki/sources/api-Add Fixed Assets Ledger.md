---
title: "固定资产台账新增"
apiId: "1759401570229813256"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Corporate Income Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Corporate Income Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产台账新增

> `ContentType	application/json` 请求方式	POST | 分类: Corporate Income Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/depreciation/collection/add

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
| datas | object | 是 | 是 | 固定资产台账集合 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：0324zxh01 |
| fixedAssetsCode | string | 否 | 是 | 资产编码 示例：0400591 |
| fixedAssetsName | string | 否 | 是 | 资产名称 示例：冷却塔 |
| spec | string | 否 | 否 | 规格 示例：2 |
| model | string | 否 | 否 | 型号 示例：3 |
| typeName | string | 否 | 是 | 固定资产类别，枚举：房屋、建筑物，飞机、火车、轮船、机器、机械和其他生产设备，与生产经营活动有关的器具、工具、家具等，飞机、火车、轮船以外的运输工具，电子设备，其他 示例：飞机、火车、轮船、机器、机械和其他生产设备 |
| buyDate | string | 否 | 是 | 购入时间（yyyy-MM-dd） 示例：2021-05-31 |
| buildDate | string | 否 | 是 | 建卡时间（yyyy-MM-dd） 示例：2021-08-01 |
| accountOrginAmt | BigDecimal | 否 | 是 | 原值（会计） 示例：16346660.09 |
| accountNetAmt | BigDecimal | 否 | 否 | 净残值（会计） 示例：0 |
| accountMethodName | string | 否 | 是 | 折旧方法（会计）枚举：年限平均法,年数总和法,双倍余额递减法,一次性扣除； 示例：年限平均法 |
| accountTotalMonth | long | 否 | 是 | 使用月限（会计） 示例：60 |
| accountUseMonth | long | 否 | 否 | 已计提期数（会计） 示例：1 |
| accountLaveMonth | long | 否 | 是 | 剩余折旧月限（会计） 示例：59 |
| accountTotalAmt | BigDecimal | 否 | 否 | 累计折旧（会计） 示例：0 |
| accountYearAmt | BigDecimal | 否 | 否 | 年初折旧（会计） 示例：0 |
| taxOrginAmt | BigDecimal | 否 | 否 | 税收加速折旧：计税基础 示例：16346660.09 |
| taxNetAmt | BigDecimal | 否 | 否 | 税收加速折旧：净残值 示例：0 |
| taxProjectName | string | 否 | 否 | 加速折旧项目，默认：500万元以下设备器具一次性扣除 示例：500万元以下设备器具一次性扣除 |
| taxMethodName | string | 否 | 否 | 税收加速折旧：折旧方法 示例：一次性扣除 |
| taxTotalMonth | long | 否 | 否 | 税收加速折旧：使用月限 示例：1 |
| taxUseMonth | long | 否 | 否 | 税收加速折旧：已计提期数 示例：1 |
| taxLaveMonth | long | 否 | 否 | 税收加速折旧：剩余折旧月限 示例：0 |
| taxTotalAmt | BigDecimal | 否 | 否 | 税收加速折旧：累计折旧 示例：16346660.09 |
| taxYearAmt | BigDecimal | 否 | 否 | 税收加速折旧：年初折旧 示例：1 |
| normalNetAmt | BigDecimal | 否 | 否 | 税收一般折旧：净残值 示例：0 |

## 3. 请求示例

Url: /yonbip/tax/api/depreciation/collection/add?access_token=访问令牌
Body: {
	"datas": [
		{
			"orgCode": "0324zxh01",
			"fixedAssetsCode": "0400591",
			"fixedAssetsName": "冷却塔",
			"spec": "2",
			"model": "3",
			"typeName": "飞机、火车、轮船、机器、机械和其他生产设备",
			"buyDate": "2021-05-31",
			"buildDate": "2021-08-01",
			"accountOrginAmt": 16346660.09,
			"accountNetAmt": 0,
			"accountMethodName": "年限平均法",
			"accountTotalMonth": 60,
			"accountUseMonth": 1,
			"accountLaveMonth": 59,
			"accountTotalAmt": 0,
			"accountYearAmt": 0,
			"taxOrginAmt": 16346660.09,
			"taxNetAmt": 0,
			"taxProjectName": "500万元以下设备器具一次性扣除",
			"taxMethodName": "一次性扣除",
			"taxTotalMonth": 1,
			"taxUseMonth": 1,
			"taxLaveMonth": 0,
			"taxTotalAmt": 16346660.09,
			"taxYearAmt": 1,
			"normalNetAmt": 0
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
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 异常信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体返回信息调整数据

1001	参数校验异常	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-10

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

