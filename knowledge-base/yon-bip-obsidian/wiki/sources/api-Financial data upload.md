---
title: "财务数据上传"
apiId: "0f578a62006c43df92bc6694d9beaa5f"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 财务数据上传

> `ContentType	multipart/form-data` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/income-tax/api/gl/upload

请求方式	POST

ContentType	multipart/form-data

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| nsrsbh | string | 否 | 否 | 税号，与组织编码择一必填 示例：123 |
| orgcode | string | 否 | 否 | 组织编码，与税号择一必填 示例：123 |
| file | file | 否 | 是 | 文件流，使用zip压缩 示例：文件，无示例 |
| version | string | 否 | 否 | 财务数据版本：2010、2025 默认值：2010 |
| format | string | 否 | 否 | 财务数据上传格式：XML、JSON 默认值：XML |

## 3. 请求示例

Url: /yonbip/tax/income-tax/api/gl/upload?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 操作信息 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	没有根据组织编码或者纳税人识别号找到对应的组织	按照提示解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-10

新增

请求参数 version

新增

请求参数 format

支持新版24589文件上传


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

