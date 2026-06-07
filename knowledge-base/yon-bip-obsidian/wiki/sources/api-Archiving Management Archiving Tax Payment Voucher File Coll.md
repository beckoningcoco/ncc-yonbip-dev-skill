---
title: "档案服务归档税务完税凭证文件采集接口"
apiId: "1759264277305229323"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "One-key declaration"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, One-key declaration]
platform_version: "BIP"
source_type: community-api-docs
---

# 档案服务归档税务完税凭证文件采集接口

> `ContentType	application/json` 请求方式	POST | 分类: One-key declaration (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/archive/docList

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
| requestType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 传空或值为1走原来的采集逻辑，值为2用来查数量 |
| accountMonth | string | 否 | 是 | 【MM】会计月 示例：01 |
| accountYear | string | 否 | 是 | 【yyyy】会计年 示例：2023 |
| accountDate | string | 否 | 否 | 【yyyy-MM-dd】日期，按天采集时必填，格式yyyy-MM-dd |
| callbackUrl | string | 否 | 否 | 档案回调地址 示例：https://****/yonbip-fi-eafmid/cloudrecord-imw/api/nc/v2/doc/push?corpId=1690359953843814406&tenantId=0000LFRUUK7D7ECT1M0000&taskCode=S202301-471426&ts=1680255371629&signature=7c1172a16d62e1483420e56978d015ba |
| fileServer | object | 否 | 否 | 文件服务器配置 |
| accessKey | string | 否 | 否 | 用户名 示例：**** |
| bucketName | string | 否 | 否 | 桶名只有serverType为minio时候为必须 示例：**** |
| endpoint | string | 否 | 否 | 文件服务地址 示例：https://****/yonbip-fi-eaffile/cloudrecord-file |
| secretKey | string | 否 | 否 | 密码 示例：**** |
| serverType | string | 否 | 否 | 文件服务类型，默认gateway 示例：gateway |
| orgInfo | object | 否 | 是 | 全宗信息 |
| code | string | 否 | 是 | 全宗编码（对应业务单元编码） 示例：nzj0328 |
| type | string | 否 | 否 | unit 业务单元 book 核算账簿（默认） 示例：book |
| range | string | 否 | 否 | 采集时间范围 示例：month |
| showUpper | long | 否 | 否 | 是否采集上游单据数据 0：否 1：是 示例：0 |
| srcSys | string | 否 | 否 | 来源系统 档案-IDOC 示例：IDOC |
| taskId | string | 否 | 否 | 采集任务编码，长度限制500 示例：S202301-471426 |
| type | string | 否 | 否 | 档案类型（前缀）（NSSBB\WSZM\OTHER）,为空默认全部 示例：NSSBB |
| taxablePeriod | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 税务资料所属期，1是征期，2是税款所属期 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/archive/docList?access_token=访问令牌
Body: {
	"requestType": 0,
	"accountMonth": "01",
	"accountYear": "2023",
	"accountDate": "",
	"callbackUrl": "https://****/yonbip-fi-eafmid/cloudrecord-imw/api/nc/v2/doc/push?corpId=1690359953843814406&tenantId=0000LFRUUK7D7ECT1M0000&taskCode=S202301-471426&ts=1680255371629&signature=7c1172a16d62e1483420e56978d015ba",
	"fileServer": {
		"accessKey": "****",
		"bucketName": "****",
		"endpoint": "https://****/yonbip-fi-eaffile/cloudrecord-file",
		"secretKey": "****",
		"serverType": "gateway"
	},
	"orgInfo": {
		"code": "nzj0328",
		"type": "book"
	},
	"range": "month",
	"showUpper": 0,
	"srcSys": "IDOC",
	"taskId": "S202301-471426",
	"type": "NSSBB",
	"taxablePeriod": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | message 示例：操作成功 |
| data | string | 否 | data 示例：null |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-24

更新

请求说明

新增

请求参数 requestType

新增

请求参数 taxablePeriod

更新

请求参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

