---
title: "获取单据附件下载地址接口"
apiId: "9751b45b631248048bd1b76a70e002f1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取单据附件下载地址接口

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/common/getFileDownloadUrl

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
| pk_billtype | string | 否 | 是 | 单据类型(znbzbx_memoapply:通用申请单;znbzbx_busistrip:出差申请单;znbzbx_expensebill:通用报销单;znbzbx_travelexpbill:差旅报销单) 示例：znbzbx_expensebill |
| billID | long | 否 | 是 | 单据ID 示例：1951632932835584 |
| filePathObjs | object | 是 | 是 | 附件信息 |
| vfilepath | string | 否 | 是 | 附件路径 示例：1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png |
| vfilename | string | 否 | 是 | 文件名 示例：示例图片.png |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/common/getFileDownloadUrl?access_token=访问令牌
Body: {
	"pk_billtype": "znbzbx_expensebill",
	"billID": 1951632932835584,
	"filePathObjs": [
		{
			"vfilepath": "1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png",
			"vfilename": "示例图片.png"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 附件信息 示例：1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png": "https://cwy-ybz-yancao.oss-cn-beijing.aliyuncs.com/1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png?Expires=1628494182&OSSAccessKeyId=LTAI4G8N5WM6uPcs9Jhw79f3&Signature=0C9jq6XtE9UKzabBW3PTzyZyMyo%3D&response-content-disposition=attachmen%3Bfilename%3D%25E7%25A4%25BA%25E4%25BE%258B%25E5%259B%25BE%25E7%2589%2587.png |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": "1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png\": \"https://cwy-ybz-yancao.oss-cn-beijing.aliyuncs.com/1951632932835584/znbzbx_expensebill/Q6Nyxa4Q99pmSLYKkuGFhRvPHi8vAjAh/QjmQPZeVUg.png?Expires=1628494182&OSSAccessKeyId=LTAI4G8N5WM6uPcs9Jhw79f3&Signature=0C9jq6XtE9UKzabBW3PTzyZyMyo%3D&response-content-disposition=attachmen%3Bfilename%3D%25E7%25A4%25BA%25E4%25BE%258B%25E5%259B%25BE%25E7%2589%2587.png"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000100002	参数为空	根据文档中的必填项检查一下传输值是否存在

1021000999999	服务器异常	请联系系统管理员

1021000100001	参数错误	请去除接口中不包含属性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

