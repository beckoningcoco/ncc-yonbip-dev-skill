---
title: "全票种不查验保存"
apiId: "9a622b07df9e41b4a8ff00547791cc54"
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

# 全票种不查验保存

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/bill-collections/direct-save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：111222333456111 |
| orgcode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：4351 |
| submitter | string | 否 | 否 | 提交人（长度不超过50） 示例：zhangsan |
| srcBillCode | string | 否 | 否 | 来源单据号（长度不超过200） 示例：4456554 |
| srcBillid | string | 否 | 否 | 来源单据id（长度不超过100） |
| srcSystem | string | 否 | 否 | 来源系统（长度不超过50） |
| srcBillType | string | 否 | 否 | 来源单据类型（长度不超过100） 示例：3442133 |
| taxRebate | string | 否 | 否 | 即征即退标识(N:否,Y:是,P:部分) 示例：N |
| bills | object | 是 | 否 | 具体信息（单次请求票据数量小于等于100，超出请分批请求） |
| billType | string | 否 | 是 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书/tax_payment_proof:完税证明 示例：taxi |
| data | object | 否 | 是 | 发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ 示例：发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ |
| imageId | string | 否 | 否 | 图片id（调用OCR或者源文件解析返回，建议优先使用此字段） 示例：1795431794855690240 |
| free | object | 否 | 否 | 进项企业票夹-全部票据特征 示例：{"test":"test"} |
| contractId | string | 否 | 否 | 合同ID（合同标识不能超过50字符） 示例：664478546 |
| contractNo | string | 否 | 否 | 合同编号（合同编号不能超过50字符） 示例：553422 |
| contractName | string | 否 | 否 | 合同名称（合同名称不能超过100字符） 示例：meituan |
| busiFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 业务标识 0：报销；1：采购 不填时默认为报销 示例：0 |
| saveMode | string | 否 | 否 | 保存模式(0:同时保存到票据中心和台账 1:保存到票据中心 2:从票据中心保存到台账) 示例：0 默认值：0 |
| free | object | 否 | 否 | 进项业务台账特征 示例：{"test":"test"} |
| failMode | string | 否 | 否 | 保存模式(batch:批量成功/失败 single:逐条成功/失败) 示例：batch 默认值：batch |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill-collections/direct-save?access_token=访问令牌
Body: {
	"nsrsbh": "111222333456111",
	"orgcode": "4351",
	"submitter": "zhangsan",
	"srcBillCode": "4456554",
	"srcBillid": "",
	"srcSystem": "",
	"srcBillType": "3442133",
	"taxRebate": "N",
	"bills": [
		{
			"billType": "taxi",
			"data": "发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/",
			"imageId": "1795431794855690240",
			"free": {
				"test": "test"
			}
		}
	],
	"contractId": "664478546",
	"contractNo": "553422",
	"contractName": "meituan",
	"busiFlag": 0,
	"saveMode": "0",
	"free": {
		"test": "test"
	},
	"failMode": "batch"
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
| data | object | 是 | 数据 |
| code | string | 否 | 状态码 示例：9001 |
| fpDm | string | 否 | 发票代码 示例：1234567890 |
| fpHm | string | 否 | 发票号码 示例：99965679 |
| msg | string | 否 | 提示信息 示例：发票代码1234567890，发票号码：99965679的发票进入疑票,匹配规则：1112 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"code": "9001",
			"fpDm": "1234567890",
			"fpHm": "99965679",
			"msg": "发票代码1234567890，发票号码：99965679的发票进入疑票,匹配规则：1112"
		}
	],
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按照提示信息解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-11

新增

请求参数 free

2	2025-09-29

更新

请求说明

新增

请求参数 failMode

更新

请求参数 nsrsbh

更新

请求参数 orgcode

删除

请求参数 free


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

