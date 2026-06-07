---
title: "投资项目修改"
apiId: "1624339657835675655"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Project Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Project Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资项目修改

> `ContentType	application/json` 请求方式	POST | 分类: Investment Project Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/investment/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 是 | 投资项目id，为兼容华新投资计划的历史数据未存投资项目id，此时在编辑时id需传777888999,这种情况下根据code作唯一性判断 示例：1624309859230941184 |
| orgid | string | 否 | 否 | 所属组织id或code 示例：1556193765280972809 |
| classid | string | 否 | 否 | 立项部门id或code 示例：1556207303008452617 |
| person | string | 否 | 否 | 负责人id或code 示例：1564271232955711493 |
| stageid | string | 否 | 否 | 投资阶段id或code 示例：1552173366664757252 |
| name | string | 否 | 否 | 投资项目名称 示例：cj1031投资项目 |
| description | string | 否 | 否 | 项目说明 示例：cj1031投资项目说明 |
| payid | string | 否 | 否 | 投资支出类别id或code 示例：1531419397495717893 |
| assetstage | string | 否 | 否 | 固定资产类别id或code,公有云不对该字段处理，专属化对该字段处理 示例：1526218750432378880 |
| years | int | 否 | 否 | 耐用年限 示例：16 |
| estimatedate | string | 否 | 否 | 预计开始日期，格式yyyy-MM-dd 示例：2022-12-01 |
| esfinishdate | string | 否 | 否 | 预计完工日期，格式yyyy-MM-dd 示例：2022-12-02 |
| actualdate | string | 否 | 否 | 实际开始日期，格式yyyy-MM-dd 示例：2022-12-03 |
| actfinishdate | string | 否 | 否 | 实际完工日期，格式yyyy-MM-dd 示例：2022-12-04 |
| orgcoin | string | 否 | 否 | 组织本位币id或code 示例：1525643705855773169 |
| orgsum | double | 否 | 否 | 计划总投资金额-本位币(元) 示例：16 |
| dealcoin | string | 否 | 否 | 交易币种id或code 示例：1525643705855773169 |
| dealsum | double | 否 | 否 | 计划总投资金额-交易币(元) 示例：16 |
| actualsum | double | 否 | 否 | 实际总金额 示例：16 |
| costcenter | string | 否 | 否 | 成本中心id或code 示例：1580525167313420290 |
| budgetyear | string | 否 | 否 | 预算年度，格式yyyy-MM-dd 示例：2023-01-01 |
| investtype | string | 否 | 否 | 投资目的id或code 示例：1531419397495717893 |
| planyear | int | 否 | 否 | 计划年数 示例：16 |
| amount | double | 否 | 否 | 数量 示例：16 |
| inneraccount | string | 否 | 否 | 对内会计主体id或code 示例：1544831996231417857 |
| sourceId | string | 否 | 否 | 数据来源id 示例：1111 |
| sourceType | string | 否 | 否 | 数据来源类型 示例：1 默认值：1：外部创建，2：项目云 |

## 3. 请求示例

Url: /yonbip/digitalModel/investment/update?access_token=访问令牌
Body: {
	"id": "1624309859230941184",
	"orgid": "1556193765280972809",
	"classid": "1556207303008452617",
	"person": "1564271232955711493",
	"stageid": "1552173366664757252",
	"name": "cj1031投资项目",
	"description": "cj1031投资项目说明",
	"payid": "1531419397495717893",
	"assetstage": "1526218750432378880",
	"years": 16,
	"estimatedate": "2022-12-01",
	"esfinishdate": "2022-12-02",
	"actualdate": "2022-12-03",
	"actfinishdate": "2022-12-04",
	"orgcoin": "1525643705855773169",
	"orgsum": 16,
	"dealcoin": "1525643705855773169",
	"dealsum": 16,
	"actualsum": 16,
	"costcenter": "1580525167313420290",
	"budgetyear": "2023-01-01",
	"investtype": "1531419397495717893",
	"planyear": 16,
	"amount": 16,
	"inneraccount": "1544831996231417857",
	"sourceId": "1111",
	"sourceType": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| code | string | 否 | 投资项目编码 示例：cj1031 |
| orgcoin | string | 否 | 组织本位币id 示例：1525643705855773169 |
| orgsum | double | 否 | 计划总投资金额-本位币(元) 示例：16 |
| description | string | 否 | 项目说明 示例：cj1031投资项目说明 |
| dealcoin | string | 否 | 交易币种id 示例：1525643705855773169 |
| dealsum | double | 否 | 计划总投资金额-交易币(元) 示例：16 |
| years | long | 否 | 耐用年限 示例：16 |
| dr | long | 否 | 逻辑删除标识 示例：0 |
| actualdate | string | 否 | 实际完工日期 示例：2022-12-03 00:00:00 |
| investtype | string | 否 | 投资目的id 示例：1531419397495717893 |
| esfinishdate | string | 否 | 预计完工日期 示例：2022-12-02 00:00:00 |
| enable | long | 否 | 启用状态，0未启用，1启用 示例：1 |
| planyear | long | 否 | 计划年数 示例：16 |
| id | string | 否 | 投资项目id 示例：1624309859230941184 |
| payid | string | 否 | 投资支出类别id 示例：1552173366664757252 |
| pubts | string | 否 | 上次操作的时间戳 示例：2022-12-29 14:15:55 |
| costcenter | string | 否 | 成本中心id 示例：1580525167313420290 |
| tenant | string | 否 | 租户id 示例：0000L6YQ8AVLFUZPXD0000 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| amount | double | 否 | 数量 示例：16 |
| sysid | string | 否 | 应用标识 示例：diwork |
| orgid | string | 否 | 组织id 示例：1556193765280972809 |
| estimatedate | string | 否 | 预计开始日期 示例：2022-12-01 00:00:00 |
| actfinishdate | string | 否 | 实际完工日期 示例：2022-12-04 00:00:00 |
| classid | string | 否 | 部门id 示例：1556207303008452617 |
| budgetyear | string | 否 | 预算年度 示例：2023-01-01 00:00:00 |
| person | string | 否 | 负责人id 示例：1564271232955711493 |
| name | string | 否 | 投资项目名称 示例：cj1031投资项目 |
| actualsum | double | 否 | 实际总金额 示例：16 |
| creationtime | string | 否 | 创建时间 示例：2022-12-29 14:15:55 |
| stageid | string | 否 | 投资阶段id 示例：1552173366664757252 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifiedtime | string | 否 | 修改时间 示例：2022-12-29 15:26:00 |
| assetstage | string | 否 | 固定资产类别id，公有云不对该字段处理，专属化对该字段处理 示例：1526218750432378880 |
| _status | string | 否 | 更新 示例：Update |
| inneraccount | string | 否 | 对内会计主体id 示例：1544831996231417857 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "cj1031",
		"orgcoin": "1525643705855773169",
		"orgsum": 16,
		"description": "cj1031投资项目说明",
		"dealcoin": "1525643705855773169",
		"dealsum": 16,
		"years": 16,
		"dr": 0,
		"actualdate": "2022-12-03 00:00:00",
		"investtype": "1531419397495717893",
		"esfinishdate": "2022-12-02 00:00:00",
		"enable": 1,
		"planyear": 16,
		"id": "1624309859230941184",
		"payid": "1552173366664757252",
		"pubts": "2022-12-29 14:15:55",
		"costcenter": "1580525167313420290",
		"tenant": "0000L6YQ8AVLFUZPXD0000",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"amount": 16,
		"sysid": "diwork",
		"orgid": "1556193765280972809",
		"estimatedate": "2022-12-01 00:00:00",
		"actfinishdate": "2022-12-04 00:00:00",
		"classid": "1556207303008452617",
		"budgetyear": "2023-01-01 00:00:00",
		"person": "1564271232955711493",
		"name": "cj1031投资项目",
		"actualsum": 16,
		"creationtime": "2022-12-29 14:15:55",
		"stageid": "1552173366664757252",
		"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"modifiedtime": "2022-12-29 15:26:00",
		"assetstage": "1526218750432378880",
		"_status": "Update",
		"inneraccount": "1544831996231417857"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	所传id对应的投资项目不存在！	传入存在的投资项目id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-03-19

新增

请求参数 sourceId

新增

请求参数 sourceType

增加sourceId和sourceType


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

