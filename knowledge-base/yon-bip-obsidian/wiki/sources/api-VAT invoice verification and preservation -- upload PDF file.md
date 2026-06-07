---
title: "增值税发票查验并保存--上传pdf文件"
apiId: "a09e36a29bc249ad8356c0e8f31edd87"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税发票查验并保存--上传pdf文件

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/reimburseCollection/v3/uploadpdf

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
| usercode | string | 否 | 否 | 用户账号（账号邮箱手机不能同时为空） 示例：XXXXXX |
| useremail | string | 否 | 否 | 用户邮箱（账号邮箱手机不能同时为空） 示例：yy@yy.com |
| usermobile | string | 否 | 否 | 用户手机号（账号邮箱手机不能同时为空） 示例：13311111111 |
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：101011111111111 |
| busiFlag | string | 否 | 否 | 业务标识 0：报销；1：采购，非必填默认0（报销） 示例：0 |
| orgcode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：321 |
| pdfFiles | object | 是 | 否 | pdf信息 |
| srcBillType | string | 否 | 否 | 来源业务系统 示例：来源业务系统 |
| srcBillCode | string | 否 | 否 | 来源业务系统单据号 示例：业务系统单据号 |
| fileName | string | 否 | 是 | 发票文件名 示例：通信费1.pdf |
| content | string | 否 | 是 | 对应的发票文件：通过Base64编码字节流，转换为字符串 示例：XXXXXXXXXXXXXXXXXXX1 |
| classification | string | 否 | 否 | 发票分类：设置发票分类,为空自动解析；目前支持：”交通”,”餐饮”,”通讯”,”其他” 示例：通讯 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/reimburseCollection/v3/uploadpdf?access_token=访问令牌
Body: {
	"usercode": "XXXXXX",
	"useremail": "yy@yy.com",
	"usermobile": "13311111111",
	"nsrsbh": "101011111111111",
	"busiFlag": "0",
	"orgcode": "321",
	"pdfFiles": [
		{
			"srcBillType": "来源业务系统",
			"srcBillCode": "业务系统单据号",
			"fileName": "通信费1.pdf",
			"content": "XXXXXXXXXXXXXXXXXXX1",
			"classification": "通讯"
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
| message | string | 否 | 操作信息 示例：SUCCESS |
| data | object | 是 | 数据 |
| fileName | string | 否 | 文件名 示例：报销发票.pdf |
| invoice | object | 否 | 票面信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": [
		{
			"fileName": "报销发票.pdf",
			"invoice": {
				"fhr": "王*",
				"fpDm": "012001800311",
				"fpHm": "22206150",
				"fpMw": "03+/>88<38<6-+6217*6<77+/8812558787268/7+88348890/883<6-35<1>247920</+12+863482>15/238+116/72501392319*7997*742/",
				"gmfMc": "*公司",
				"gmfNsrsbh": "91110000600001760P",
				"hjje": 874.01,
				"issuspect": "N",
				"fplx": "1",
				"items": [
					{
						"dw": "次",
						"ggxh": "无",
						"se": 26.22,
						"sl": 0.03,
						"xmdj": 874.01,
						"xmje": 874.01,
						"xmmc": "*运输服务*客运服务费",
						"xmsl": 1
					}
				],
				"jqbh": "499099800969",
				"jshj": 900.23,
				"jym": "05493580104372157911",
				"kpr": "牛*",
				"kprq": "2019-04-01",
				"skr": "李*",
				"xsfDzdh": "天津经济技术开发区南港工业区综合服务区办公楼C座103室12单元022-59002850",
				"xsfMc": "滴滴出行科技有限公司",
				"xsfNsrsbh": "911201163409833307",
				"xsfYhzh": "招商银行股份有限公司天津自由贸易试验区分行122905939910401"
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按照返回错误信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

更新

请求说明

更新

请求参数 nsrsbh

更新

请求参数 orgcode

2	2025-09-29

更新

请求说明

更新

请求参数 nsrsbh

更新

请求参数 orgcode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

