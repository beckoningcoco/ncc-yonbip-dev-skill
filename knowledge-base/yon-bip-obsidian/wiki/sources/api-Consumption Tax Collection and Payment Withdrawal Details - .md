---
title: "消费税代收代缴收回明细-更新"
apiId: "1902744617675128840"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 消费税代收代缴收回明细-更新

> `ContentType	application/json` 请求方式	POST | 分类: Consumption Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/consignment/collect-remit/update

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| records | object | 是 | 是 | 新增代收代缴收回明细记录 |
| code | string | 否 | 是 | 单据code,可唯一识别某条单据 示例：111222333 |
| orgCode | string | 否 | 是 | 组织编码 示例：MT0000001 |
| goodsTaxName | string | 否 | 是 | 应税消费品名称 示例：白酒（复合计税） |
| productCode | string | 否 | 否 | 产品code 示例：2534000004 |
| period | string | 否 | 是 | 税款所属期，格式yyyy-MM 示例：2024-01 |
| actualInStorageNum | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 账面入库数量，当选择的消费品的计价方式为“从价定率”时该字段可不传，其他情况必传 示例：1.1 |
| processFeeWithoutTax | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 不含税加工费 示例：2.2 |
| packageCost | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 包材成本 示例：3.3 |
| baseLiquorCost | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 基酒成本 示例：4.4 |
| trusteeProfileCode | string | 否 | 是 | 受托方档案code 示例：1111 |
| taxPayCertNum | string | 否 | 否 | 税收缴款书(代扣代缴专用)号码 示例：11111 |
| taxPayCertDate | string | 否 | 否 | 税收缴款书(代扣代缴专用)开具日期,格式yyyy-MM-dd 示例：2024-01-11 |
| registerSerialNum | string | 否 | 否 | 受托方登记序号 示例：222222 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/consignment/collect-remit/update?access_token=访问令牌
Body: {
	"records": [
		{
			"code": "111222333",
			"orgCode": "MT0000001",
			"goodsTaxName": "白酒（复合计税）",
			"productCode": "2534000004",
			"period": "2024-01",
			"actualInStorageNum": 1.1,
			"processFeeWithoutTax": 2.2,
			"packageCost": 3.3,
			"baseLiquorCost": 4.4,
			"trusteeProfileCode": "1111",
			"taxPayCertNum": "11111",
			"taxPayCertDate": "2024-01-11",
			"registerSerialNum": "222222"
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 具体描述信息 示例：成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	具体错误信息


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

