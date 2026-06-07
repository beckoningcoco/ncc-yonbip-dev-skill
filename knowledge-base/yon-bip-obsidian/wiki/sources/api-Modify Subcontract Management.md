---
title: "修改分包管理"
apiId: "1759482367154585607"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Management Journal"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Management Journal]
platform_version: "BIP"
source_type: community-api-docs
---

# 修改分包管理

> `ContentType	application/json` 请求方式	POST | 分类: Subcontract Management Journal (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/subproject/update

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
| orgCode | string | 否 | 否 | 税务组织编码 示例：税务组织编码 |
| projectName | string | 否 | 是 | 项目名称 示例：青岛公司 |
| projectCode | string | 否 | 是 | 项目编码 示例：0099 |
| subprojectCode | string | 否 | 否 | 分包项目编码 示例：001 |
| subprojectName | string | 否 | 否 | 分包项目名称 示例：测试项目 |
| supplierName | string | 否 | 是 | 分别企业名称 示例：烟台顺丰公司 |
| supplierNsrsbh | string | 否 | 是 | 分别企业税号仅支持的8位、9位、11位、12位、15位、16位、17位、18位、19位或20位纳税人识别号 示例：91370600056214307M |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/subproject/update?access_token=访问令牌
Body: [{
	"orgCode": "税务组织编码",
	"projectName": "青岛公司",
	"projectCode": "0099",
	"subprojectCode": "001",
	"subprojectName": "测试项目",
	"supplierName": "烟台顺丰公司",
	"supplierNsrsbh": "91370600056214307M"
}]

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
| message | string | 否 | 操作结果描述 示例：操作成功 |

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

1001	参数校验	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

