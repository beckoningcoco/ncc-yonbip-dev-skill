---
title: "完税资料下载"
apiId: "1893699940528947209"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Payment Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Payment Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 完税资料下载

> `ContentType	application/json` 请求方式	POST | 分类: Tax Payment Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/archive/certificate-download

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
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：91341226MA8QYRMK8P |
| mainTaxOfficeName | string | 否 | 是 | 主管税务机关 示例：国家税务总局北京市东城区税务局第四税务所 |
| reportName | string | 否 | 是 | 申报表名称 示例：增值税—一般纳税人 |
| declareStart | string | 否 | 是 | 税款所属期起，格式yyyy-MM-dd 示例：2023-11-01 |
| declareEnd | string | 否 | 是 | 税款所属期止，格式yyyy-MM-dd 示例：2023-11-30 |
| certificateType | string | 是 | 否 | 下载完税资料类型[1：纳税申报表；2：完税凭证；3：其他涉税资料；未传该参数时下载所有类型] 示例：[1,2] |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/archive/certificate-download?access_token=访问令牌
Body: {
	"nsrsbh": "91341226MA8QYRMK8P",
	"mainTaxOfficeName": "国家税务总局北京市东城区税务局第四税务所",
	"reportName": "增值税—一般纳税人",
	"declareStart": "2023-11-01",
	"declareEnd": "2023-11-30",
	"certificateType": [
		1,
		2
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回状态码，失败时显示此参数 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 否 | 具体数据信息，失败时显示此参数 |
| code | string | 否 | 具体失败编码，失败时显示此参数 示例：9999 |
| msg | string | 否 | 详细描述信息，失败时显示此参数 示例：接口成功返回的是文件的二进制流信息，非json格式 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"code": "9999",
		"msg": "接口成功返回的是文件的二进制流信息，非json格式"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	根据具体问题返回具体的异常信息


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

