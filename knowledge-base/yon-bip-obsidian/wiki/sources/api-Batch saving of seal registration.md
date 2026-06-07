---
title: "印鉴登记批量保存"
apiId: "2032657826382872583"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Seal Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Seal Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 印鉴登记批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Seal Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tmsp/sealimpressionsign/batchsave

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
| accentity | string | 否 | 是 | 资金组织名称 示例：用友网络科技股份有限公司 |
| sealCode | string | 否 | 否 | 印鉴编号，用于描述企业内部定义的编号 示例：CH-01 |
| name | string | 否 | 是 | 印鉴名称 示例：用友网络科技股份有限公司财务章 |
| sealImpressionType | string | 否 | 是 | 印鉴类型档案的名称 示例：财务章 |
| linkPerson | string | 否 | 是 | 人名签章 示例：1 是 0 否 |
| person | string | 否 | 否 | 人员编码 示例：0000001 |
| takePerson | string | 否 | 否 | 保管人 示例：请输入员工编码 |
| wareHouseDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 入库日期 示例：2024-07-01 18:00:00 |
| expirationDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 有效期 示例：2024-07-01 18:00:00 |
| takePlace | string | 否 | 否 | 存放地点 示例：北京市海淀区 |
| notes | string | 否 | 否 | 备注 示例：备注 |
| enable | string | 否 | 是 | 启用状态 示例：1 启用 0停用 |

## 3. 请求示例

Url: /yonbip/ctm/tmsp/sealimpressionsign/batchsave?access_token=访问令牌
Body: [{
	"accentity": "用友网络科技股份有限公司",
	"sealCode": "CH-01",
	"name": "用友网络科技股份有限公司财务章",
	"sealImpressionType": "财务章",
	"linkPerson": "1 是 0 否",
	"person": "0000001",
	"takePerson": "请输入员工编码",
	"wareHouseDate": "2024-07-01 18:00:00",
	"expirationDate": "2024-07-01 18:00:00",
	"takePlace": "北京市海淀区",
	"notes": "备注",
	"enable": "1 启用 0停用"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 保存成功条数 示例：10 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| failMessage | object | 否 | 异常信息 示例：资金组织不能为空 |
| failRecord | object | 否 | 保存失败的记录 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"totalCount": 10,
		"successCount": 10,
		"failCount": 0,
		"failMessage": "资金组织不能为空",
		"failRecord": {
			"accentity": "用友网络科技股份有限公司",
			"name": "用友网络科技股份有限公司财务章",
			"sealImpressionType": "财务章"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1000001	传入参数为空

1000002	批量保存接口正常处理中,请稍后再试!

1000003	批量保存数量超过200限制


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-19

更新

请求说明

新增

请求参数 sealCode

添加印鉴编号字段

2	2024-10-30

更新

请求参数 accentity

更新

返回参数 failMessage

更新

返回参数 accentity

提示语修改


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

