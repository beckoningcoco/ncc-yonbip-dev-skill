---
title: "固定资产新增审核"
apiId: "2019219706915323914"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "New FA"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, New FA]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产新增审核

> `ContentType	application/json` 请求方式	POST | 分类: New FA (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/AdditionBill/audit

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 固定资产新增id 示例：1483387421116596230 |

## 3. 请求示例

Url: /yonbip/EFI/AdditionBill/audit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| errorDetail | string | 否 | 错误信息 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产新增信息 |
| accentity | string | 否 | 会计主体id 示例：1570033155012821001 |
| accentity_code | string | 否 | 会计主体编码 示例：05341 |
| accentity_name | string | 否 | 会计主体名称 示例：fa-塞梅多 |
| addWayId | string | 否 | 增加方式id 示例：1550289989236424710 |
| addWayId_name | string | 否 | 增加方式名称 示例：直接购入 |
| assetBookCategoryId | string | 否 | 固定资产类别id 示例：1821814488791253011 |
| assetBookCategoryId_code | string | 否 | 固定资产类别编码 示例：000012 |
| assetModel | object | 否 | 固定资产型号 |
| id | string | 否 | 单据id 示例：1699951268584226817 |
| auditTime | string | 否 | 审核时间 示例：2024-06-14 15:39:17 |
| auditor_userName | string | 否 | 审核人 示例：张三 |
| beginTime | string | 否 | 开始使用日期 示例：2022-09-01 |
| billTradeTypeId | string | 否 | 单据交易类型 示例：1625145041486348446 |
| billTypeId | string | 否 | 单据类型id 示例：1368133571272769536 |
| blnLease | boolean | 否 | 使用权资产, 枚举，true：是，false: 否 示例：false |
| blnPreAdd | boolean | 否 | 是否预建, 枚举，true：是，false: 否 示例：false |
| blnTaxAcceleratedDepr | boolean | 否 | 税收加速折旧 示例：false |
| busiObj | string | 否 | 业务对象 示例：AdditionBill |
| busiPostStatus | string | 否 | 过账状态(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：3 |
| cBillNo | string | 否 | 单据billnum 示例：fa_additionbill |
| name | object | 否 | 固定资产名称 |
| calid | string | 否 | 核算信息id 示例：1996182327001612295 |
| code | string | 否 | 新增单编码 示例：0000230410003151 |
| createTime | string | 否 | 创建时间 示例：2024-05-13 15:43:28 |
| creator | string | 否 | 创建人id 示例：d71edef3-6f11-4a84-af5d-e3f14ff03bb5 |
| creator_name | string | 否 | 创建人 示例：王五 |
| tagno | string | 否 | 标签号 示例：123 |
| specification | object | 否 | 固定资产规格 |
| auditor | string | 否 | 审核人id 示例：60c475cb-fed9-4ca7-acfc-8ddfd2e17187 |
| quantity | BigDecimal | 否 | 数量 示例：2 |
| fcOriValue | BigDecimal | 否 | 原币原值 示例：1000 |
| oriCurrtypeId | string | 否 | 原币币种id 示例：1550289628449210394 |
| location | object | 否 | 存放地点 |
| usageStateId | string | 否 | 使用状态id 示例：1550289997826359315 |
| modifier_name | string | 否 | 修改人 示例：赵六 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2 |
| modifyTime | string | 否 | 修改时间 示例：2024-06-07 10:37:54 |
| ytenantId | string | 否 | 租户id 示例：0000LCAALQGPE642KN0000 |

## 5. 正确返回示例

{
	"code": "200",
	"errorDetail": "",
	"message": "操作成功",
	"data": {
		"accentity": "1570033155012821001",
		"accentity_code": "05341",
		"accentity_name": "fa-塞梅多",
		"addWayId": "1550289989236424710",
		"addWayId_name": "直接购入",
		"assetBookCategoryId": "1821814488791253011",
		"assetBookCategoryId_code": "000012",
		"assetModel": {
			"zh_CN": "型号1"
		},
		"id": "1699951268584226817",
		"auditTime": "2024-06-14 15:39:17",
		"auditor_userName": "张三",
		"beginTime": "2022-09-01",
		"billTradeTypeId": "1625145041486348446",
		"billTypeId": "1368133571272769536",
		"blnLease": false,
		"blnPreAdd": false,
		"blnTaxAcceleratedDepr": false,
		"busiObj": "AdditionBill",
		"busiPostStatus": "3",
		"cBillNo": "fa_additionbill",
		"name": {
			"zh_CN": "多账簿23"
		},
		"calid": "1996182327001612295",
		"code": "0000230410003151",
		"createTime": "2024-05-13 15:43:28",
		"creator": "d71edef3-6f11-4a84-af5d-e3f14ff03bb5",
		"creator_name": "王五",
		"tagno": "123",
		"specification": {
			"zh_CN": "规格1"
		},
		"auditor": "60c475cb-fed9-4ca7-acfc-8ddfd2e17187",
		"quantity": 2,
		"fcOriValue": 1000,
		"oriCurrtypeId": "1550289628449210394",
		"location": {
			"zh_CN": "12楼"
		},
		"usageStateId": "1550289997826359315",
		"modifier_name": "赵六",
		"verifyState": 2,
		"modifyTime": "2024-06-07 10:37:54",
		"ytenantId": "0000LCAALQGPE642KN0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	单据已审核	输入有效且未审核的单据id


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

