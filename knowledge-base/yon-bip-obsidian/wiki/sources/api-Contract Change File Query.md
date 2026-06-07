---
title: "合同变更文件查询"
apiId: "2481715941487935495"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Change"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同变更文件查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contractChange/queryContractChangeFile

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
| billId | string | 否 | 否 | 单据id 示例：220111111111111111111 |

## 3. 请求示例

Url: /yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contractChange/queryContractChangeFile?access_token=访问令牌
Body: {
	"billId": "220111111111111111111"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 接口状态 示例：200:成功 |
| message | string | 否 | 接口信息 示例：操作成功 |
| data | object | 是 | 文件信息 |
| filePhase | string | 否 | 文件阶段 示例：1:送审文件，2:送签文件，3:签署完成文件 |
| fileBussinessid | string | 否 | 文件业务id 示例：1582b42b-f48b-4e15-b6a1-b2f2e2301e5e |
| fileMsgVos | object | 是 | 文件信息 |

## 5. 正确返回示例

{
	"code": "200:成功",
	"message": "操作成功",
	"data": [
		{
			"filePhase": "1:送审文件，2:送签文件，3:签署完成文件",
			"fileBussinessid": "1582b42b-f48b-4e15-b6a1-b2f2e2301e5e",
			"fileMsgVos": [
				{
					"fileId": "2000000000000000000",
					"fileName": "文件名",
					"downloadUrl": "/iuap-apcom-file/ucf-wh/basefile/file?cacheKey%3D5e017419-e"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

