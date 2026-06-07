---
title: "获取单据附件列表接口"
apiId: "c1d71b48631744958c98aac9c8ed4bf1"
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

# 获取单据附件列表接口

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/common/getFileManageTree

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

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/common/getFileManageTree?access_token=访问令牌
Body: {
	"pk_billtype": "znbzbx_expensebill",
	"billID": 1951632932835584
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 是 | 附件数据 |
| id | string | 否 | 文件(夹)名id |
| code | string | 否 | 文件(夹)名编码 |
| text | string | 否 | 文件(夹)名 示例：文件目录 (1份) |
| leaf | boolean | 否 | 是否叶子结点(false:非叶子节点;true:叶子节点) 示例：false |
| disabled | boolean | 否 | 是否禁用（false：非禁言；true：禁用） 示例：false |
| expanded | boolean | 否 | 是否展开（false:不展开；true:展开） 示例：true |
| url | string | 否 | 文件名 |
| children | object | 是 | 子节点 |
| type | long | 否 | 文件夹类型(0:普通附件;1:发票附件) 示例：0 |
| hidden | boolean | 否 | 隐藏状态(true:隐藏;false:不隐藏) 示例：false |
| properties | object | 否 | 节点扩展属性 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": [
		{
			"id": "",
			"code": "",
			"text": "文件目录  (1份)",
			"leaf": false,
			"disabled": false,
			"expanded": true,
			"url": "",
			"children": [
				{
					"id": "附1",
					"code": "附1",
					"text": "附1  (1份)",
					"leaf": false,
					"disabled": false,
					"expanded": true,
					"url": "附1",
					"children": [
						{
							"id": "附1/fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg",
							"code": "附1/fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg",
							"text": "fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg",
							"leaf": true,
							"disabled": false,
							"expanded": false,
							"url": "附1/fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg",
							"type": 0,
							"hidden": false,
							"properties": {
								"orientation": 0,
								"creator": "测试人员",
								"filesrc": "https://cwy-ybz-yancao.oss-cn-beijing.aliyuncs.com/19516835584/znbzbx_expensebill",
								"ipagecount": 1,
								"previewurl": "https://znbz-fs-yonbip-daily.yyuap.com/preview?tenantId=1951/Ksrs9gwXNY.jpg&serviceCode=znbz-daily&fileName=fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg",
								"inecessity": 0,
								"vfilepath": "1951632932835584/znbzbx_expensebill/VHQDBp3DqJviIWMS00FhpohTUFtW5xLT/Ksrs9gwXNY.jpg",
								"ifiletype": 0,
								"thumbimg": "https://cwy-ybz-yancao.oss-cn-beijing.aliyuncs.com/195163293283%3D&response-content-disposition=inline&x-oss-process=image%2Fresize%2Cw_200%2Ch_200",
								"time": "2021-09-07 19:41:15",
								"segmentList": [
									"附1",
									"fcfaaf51f3deb48f2d1f6480f11f3a292df5787e.jpg"
								]
							}
						}
					],
					"type": 0,
					"hidden": false,
					"properties": {
						"creator": "测试人员",
						"ipagecount": 1,
						"isMust": "false",
						"vfilepath": "",
						"ifiletype": 0,
						"ipagenum": 1,
						"time": "2021-09-07 19:43:27",
						"segmentList": [
							"附1"
						]
					}
				}
			],
			"type": 0,
			"hidden": false,
			"properties": {
				"ipagecount": 1,
				"ipagenum": 1,
				"segmentList": [
					""
				]
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


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

