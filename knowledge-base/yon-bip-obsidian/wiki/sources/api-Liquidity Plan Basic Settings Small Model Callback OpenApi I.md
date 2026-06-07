---
title: "流动性方案基础设置小模型回调OpenApi接口"
apiId: "2267144263029489667"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Decision Support"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Decision Support]
platform_version: "BIP"
source_type: community-api-docs
---

# 流动性方案基础设置小模型回调OpenApi接口

> `ContentType	application/json` 请求方式	POST | 分类: Decision Support (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lqprediction/basicsetting/modeltraining/update

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
| scheme_code | string | 否 | 是 | 方案编码 示例：LFSLF000020 |
| vmodel | string | 否 | 否 | 模型版本，business_type=1时不能为空 示例：V0.1，business_type=1时不能为空 |
| algmodel | string | 否 | 是 | 算法 示例：prophet |
| pklmodel | string | 否 | 是 | 已训练的模型 示例：已训练的模型base64 |
| goal | string | 否 | 否 | 提示词，business_type=1时不能为空 示例：提示词示例，business_type=1时不能为空 |
| ytenant_id | string | 否 | 否 | 租户id |
| execscript | string | 否 | 是 | base64格式训练脚本 示例：base64格式的训练脚本 |
| modelname | string | 否 | 否 | 模型名称,business_type=1时不能为空 示例：初始自动生成，business_type=1时不能为空 |
| setItem | string | 否 | 是 | 预测项，income：收入模型 outcom：支出模型 示例：income |
| business_type | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 1-基础脚本回调 2-模型调优回调 示例：1 |
| metric | string | 否 | 否 | 偏差 |
| code | string | 否 | 是 | 1：成功 0：失败 示例：1 |
| task_id | string | 否 | 否 | 任务id |

## 3. 请求示例

Url: /yonbip/ctm/lqprediction/basicsetting/modeltraining/update?access_token=访问令牌
Body: {
	"scheme_code": "LFSLF000020",
	"vmodel": "V0.1，business_type=1时不能为空",
	"algmodel": "prophet",
	"pklmodel": "已训练的模型base64",
	"goal": "提示词示例，business_type=1时不能为空",
	"ytenant_id": "",
	"execscript": "base64格式的训练脚本",
	"modelname": "初始自动生成，business_type=1时不能为空",
	"setItem": "income",
	"business_type": 1,
	"metric": "",
	"code": "1",
	"task_id": ""
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
| data | object | 否 | data 示例：保存成功 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：保存成功 |

## 5. 正确返回示例

{
	"data": "保存成功",
	"code": "200",
	"message": "保存成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-23

更新

请求参数 (8)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

