---
title: "资金计划额度占用释放"
apiId: "1634767297257668613"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inquire Plan Summary"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inquire Plan Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金计划额度占用释放

> `ContentType	application/json` 请求方式	POST | 分类: Inquire Plan Summary (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/energy/occupyOrRelease

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| businessSerialNum | string | 否 | 是 | 业务流水号 示例：111111 |
| accentity | string | 否 | 是 | 资金组织,支持id和code查询 示例：1533791344826253318 |
| dept | string | 否 | 否 | 部门，支持id和code查询，控制方式为部门控制时必填 示例：1567925941000208391 |
| currency | string | 否 | 是 | 币种，支持id和code查询 示例：2618396391264768 |
| amount | BigDecimal | 否 | 是 | 占用释放金额 示例：100 |
| businessDate | Date | 否 | 是 | 业务日期 示例：2022-12-20 |
| capitalDrawItemId | string | 否 | 是 | 资金计划编制子表ID 示例：1514525547460821015 |
| receiptType | string | 否 | 是 | 收支类型，占用释放标识为true(占用)时，需要填2(支出) 示例：2 |
| forceOccupy | boolean | 否 | 否 | 是否强制占用 示例：false 默认值：false |
| sourceSystem | string | 否 | 是 | 财资公共 业务系统注册 示例：11111 |
| businessType | string | 否 | 是 | 业务单据类型；财资公共 业务系统注册 业务单据类型编码 示例：11111 |
| sourceBillId | string | 否 | 是 | 来源单据ID 示例：1514525786460821093 |
| settleMode | string | 否 | 否 | 结算方式 示例：1514525786460826754 |
| controlMode | short | 否 | 是 | 控制方式，枚举，0：不控制，1：按资金组织控制，2：按部门控制 示例：2 |
| flag | boolean | 否 | 是 | 占用释放标识，true占用，false释放 示例：true |
| ourAcc | string | 否 | 否 | 本方账号 |
| oppAcc | string | 否 | 否 | 对方账号 |
| oppAccName | string | 否 | 否 | 对方账户名称 |
| oppType | string | 否 | 否 | 对方类型 |
| sourceType | short | 否 | 是 | 来源单据类型,0:转账付款单,1:转账收款单,2:通用报销单,3:退款单,6:其他收款单,7:收款单,8:其他单笔付款单,9:其他批量付款单,10:付款单,11:差旅费报销单,12:对公预付单,13:还款单,14:个人借款单,15:薪资发放单,16:代理付款单,17:代理收款单,101:资金调度归集付款单,102:资金调度归集收款单,106:资金调度下拨付款单,107:资金调度下拨收款单,109:资金调度调度付款单,110:资金调度调度收款单,111:结算单,112:应付,113:应收,120:薪资发放 示例：7 |
| businessDetailNum | string | 否 | 是 | 业务单据明细编号 |
| sourceBillCode | string | 否 | 否 | 来源单据编码 示例：TEST202301120001 |

## 3. 请求示例

Url: /yonbip/ctm/energy/occupyOrRelease?access_token=访问令牌
Body: [{
	"businessSerialNum": "111111",
	"accentity": "1533791344826253318",
	"dept": "1567925941000208391",
	"currency": "2618396391264768",
	"amount": 100,
	"businessDate": "2022-12-20",
	"capitalDrawItemId": "1514525547460821015",
	"receiptType": "2",
	"forceOccupy": false,
	"sourceSystem": "11111",
	"businessType": "11111",
	"sourceBillId": "1514525786460821093",
	"settleMode": "1514525786460826754",
	"controlMode": 2,
	"flag": true,
	"ourAcc": "",
	"oppAcc": "",
	"oppAccName": "",
	"oppType": "",
	"sourceType": 7,
	"businessDetailNum": "",
	"sourceBillCode": "TEST202301120001"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | boolean | 否 | 返回信息 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": true
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	参数为空

999	逻辑异常,附带错误信息


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

