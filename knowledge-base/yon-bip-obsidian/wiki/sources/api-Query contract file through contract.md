---
title: "通过合同查询合同文件"
apiId: "2282663551847890951"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Contract Registration"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过合同查询合同文件

> `ContentType	application/json` 请求方式	GET | 分类: Contract Registration (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contract/getFileObjectByBillId

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| billId | string | query | 是 | 合同 ID    示例: 2232791878959890435 |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/getFileObjectByBillId?access_token=访问令牌&billId=2232791878959890435

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| errorDetail | string | 否 | 错误信息 |
| data | object | 是 | 返回数据 |
| downloadUrl | string | 是 | 下载地址 |
| filePhase | string | 否 | 文件阶段(1:送审文件;2:送签文件;3:签署完成文件) 示例：1 |
| fileClass | string | 否 | 文件分类(1:合同正文;2:正文附件) 示例：1 |
| fileBussinessid | string | 否 | 文件组件 id |
| fileMakeWay | string | 否 | 文件生成方式(1:不限制;2:模板生成;3:本地上传;4:范本生成;5:智能起草) 示例：1 |
| contractTemplateId | string | 否 | 电子合同模板 id |
| attachmentClass | string | 否 | 正文附件分类(1:明确型;2:其他) 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"errorDetail": "",
	"data": [
		{
			"downloadUrl": [
				""
			],
			"filePhase": "1",
			"fileClass": "1",
			"fileBussinessid": "",
			"fileMakeWay": "1",
			"contractTemplateId": "",
			"attachmentClass": "1"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500135	id不能为空	单据 ID 不能为空

500136	未查询到该合同，请检查数据!	单据 ID 不对


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

