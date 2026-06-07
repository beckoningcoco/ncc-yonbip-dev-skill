---
title: "客户商品对照表单个保存"
apiId: "2304172782419705865"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Product Mapping"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Product Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户商品对照表单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Customer Product Mapping (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/SCC/sa_agentproduct/singleSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 客户商品对照表 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | id，新增时无需填写，修改时必填 示例：123123123123 |
| salesOrgId | string | 否 | 是 | 销售组织，传id或者code 示例：2002678173047193607 |
| agentId | string | 否 | 是 | 客户，传id或者code 示例：2002679942559563778 |
| productId | string | 否 | 是 | 商品，传id或者code 示例：2002687707843133447 |
| skuId | string | 否 | 否 | 商品SKUid或SKUcode 示例：2002687716433068046 |
| taxId | string | 否 | 否 | 税目税率id 示例：10005 |
| masterUnitId | string | 否 | 否 | 主计量单位，传id或者code 示例：1972290265788448775 |
| iProductUnitId | string | 否 | 否 | 计价单位，传id或者code 示例：1972290265788448775 |
| iProductAuxUnitId | string | 否 | 否 | 销售单位，传id或者code 示例：1972290265788448775 |
| invExchRate | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 销售换算率 示例：1 |
| invPriceExchRate | number |
| 小数位数:8,最大长度:29 | 否 | 否 | 计价换算率 示例：1 |
| unitExchangeType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 销售单位是否浮动换算率，0 非；1 是 示例：0 |
| unitExchangeTypePrice | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 计价单位是否浮动换算率，0 非；1 是 示例：0 |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 启用状态 示例：0：未启用，1：启用 默认值：1 |
| detail | object | 是 | 否 | 子表，目前只支持传入一行 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/SCC/sa_agentproduct/singleSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "123123123123",
		"salesOrgId": "2002678173047193607",
		"agentId": "2002679942559563778",
		"productId": "2002687707843133447",
		"skuId": "2002687716433068046",
		"taxId": "10005",
		"masterUnitId": "1972290265788448775",
		"iProductUnitId": "1972290265788448775",
		"iProductAuxUnitId": "1972290265788448775",
		"invExchRate": 1,
		"invPriceExchRate": 1,
		"unitExchangeType": 0,
		"unitExchangeTypePrice": 0,
		"enable": NaN,
		"detail": [
			{
				"id": "12312312312132",
				"agentProductId": "123123123123",
				"agentProductName": "箱子",
				"agentProductCode": "code",
				"agentSkuCode": "P0001",
				"agentSkuName": "小箱子",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | data |
| ecsuiteuser | string | 否 | 气泡联系人 |
| id | string | 否 | id 示例：2304163161871745030 |
| pubts | string | 否 | 时间戳 示例：2025-07-02 15:06:26 |
| salesOrgId | string | 否 | 销售组织id 示例：2002678173047193607 |
| salesOrgId_name | string | 否 | 销售组织名称 示例：销售组织 |
| agentId | string | 否 | 客户id 示例：2002679942559563778 |
| agentRelationId | string | 否 | 客户关系id 示例：2002679942559563920 |
| agentId_code | string | 否 | 客户编码 示例：00000000000014 |
| productClassId | string | 否 | 商品分类id 示例：1999099975636615173 |
| productId | string | 否 | 商品id 示例：2048828558696513536 |
| masterUnitId | string | 否 | 主计量单位id 示例：1971675509954707469 |
| qtyName | string | 否 | 主计量 示例：小时 |
| iProductUnitId | string | 否 | 计价单位id 示例：1971675509954707469 |
| productUnitName | string | 否 | 计价单位名称 示例：小时 |
| invPriceExchRate | number |
| 小数位数:0,最大长度:10 | 否 | 计价换算率 示例：1 |
| unitExchangeType | string | 否 | 销售单位是否浮动换算率，0 非；1 是 示例：0 |
| unitExchangeTypePrice | string | 否 | 计价单位是否浮动换算率，0 非；1 是 示例：0 |
| iProductAuxUnitId | string | 否 | 销售单位id 示例：1971675509954707469 |
| unitName | string | 否 | 销售单位名称 示例：小时 |
| invExchRate | number |
| 小数位数:0,最大长度:10 | 否 | 销售换算率 示例：1 |
| enable | number |
| 小数位数:0,最大长度:1 | 否 | 启用状态 示例：1 |
| detail | object | 是 | detail |
| agentProductApplyRange | object | 是 | 客户商品对照适用范围 |
| code | string | 否 | code 示例：2304163161871745030 |
| modifier | string | 否 | 修改人 示例：修改人 |
| modifierId | string | 否 | 修改人id 示例：1996866807406264325 |
| modifyTime | string | 否 | modifyTime 示例：2025-07-02 15:06:26 |
| modifyDate | string | 否 | modifyDate 示例：2025-07-02 15:06:26 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2304163161871745030",
		"pubts": "2025-07-02 15:06:26",
		"salesOrgId": "2002678173047193607",
		"salesOrgId_name": "销售组织",
		"agentId": "2002679942559563778",
		"agentRelationId": "2002679942559563920",
		"agentId_code": "00000000000014",
		"productClassId": "1999099975636615173",
		"productId": "2048828558696513536",
		"masterUnitId": "1971675509954707469",
		"qtyName": "小时",
		"iProductUnitId": "1971675509954707469",
		"productUnitName": "小时",
		"invPriceExchRate": 1,
		"unitExchangeType": "0",
		"unitExchangeTypePrice": "0",
		"iProductAuxUnitId": "1971675509954707469",
		"unitName": "小时",
		"invExchRate": 1,
		"enable": 1,
		"detail": [
			{
				"agentProductCode": "123",
				"agentProductId": "2304163161871745030",
				"id": "2304163161871745031",
				"agentProductName": "123",
				"ytenant": "0000LUTH33Q009RSW10000"
			}
		],
		"agentProductApplyRange": [
			{
				"agentProductId": "2304163161871745030",
				"orgId": "2002678173047193607",
				"customerId": "2002679942559563778",
				"id": "2304163161871745032"
			}
		],
		"code": "2304163161871745030",
		"modifier": "修改人",
		"modifierId": "1996866807406264325",
		"modifyTime": "2025-07-02 15:06:26",
		"modifyDate": "2025-07-02 15:06:26"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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

