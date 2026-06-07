---
title: "合并报表-查询组织成员树"
apiId: "2350189732024025090"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Information Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Information Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-查询组织成员树

> `ContentType	application/json` 请求方式	POST | 分类: Dimension Information Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/bcs/entity/members

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
| cubeId | string | 否 | 是 | 模型主键 |
| userId | string | 否 | 否 | 用户主键 |
| authEnum | string | 否 | 否 | 权限级别（READ，ALL） |

## 3. 请求示例

Url: /yonbip/FCC/bcs/entity/members?access_token=访问令牌
Body: {
	"cubeId": "",
	"userId": "",
	"authEnum": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| data | object | 是 | 数据对象 |
| treeKey | string | 否 | 当前层级 示例：00 |
| treeFatherKey | string | 否 | 父级 示例：root |
| code | string | 否 | 组织成员编码 示例：HB100 |
| name | string | 否 | 组织成员名称 示例：本部 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"treeKey": "00",
			"treeFatherKey": "root",
			"code": "HB100",
			"name": "本部"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

请求说明

新增

返回参数 (4)

更新

返回参数 code

更新

返回参数 data

删除

返回参数 success


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

