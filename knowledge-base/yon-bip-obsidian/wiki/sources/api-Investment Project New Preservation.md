---
title: "投资项目新增保存V2"
apiId: "2008851398195150850"
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

# 投资项目新增保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Investment Project Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/investment/save_idempotent

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | 单据编码 默认值：bd_investproject_card |
| data | object | 否 | 是 | 投资项目详情 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 投资项目id，有值则修改。对于旧数据没有存id传777888999，根据编码匹配修改 |
| name | string | 否 | 是 | 投资项目名称 示例：test070401 |
| code | string | 否 | 是 | 投资项目编码,编码格式只能是数字字母和_ 示例：070401 |
| estimatedate | string | 否 | 否 | 预计开始日期，格式yyyy-MM-dd 示例：2022-01-02 |
| esfinishdate | string | 否 | 否 | 预计完工日期，格式yyyy-MM-dd 示例：2022-03-01 |
| orgsum | double | 否 | 否 | 计划投资总金额(本位币) 示例：324 |
| dealsum | double | 否 | 否 | 计划投资总金额(交易币) 示例：33333 |
| actualsum | double | 否 | 否 | 实际总金额 示例：3221 |
| budgetyear | string | 否 | 否 | 预算年度，格式yyyy-MM-dd 示例：2022-01-01 |
| amount | double | 否 | 否 | 数量 示例：2323.32 |
| assetstage | string | 否 | 否 | 固定资产类别id或code 示例：2495071591908658 |
| orgid | string | 否 | 否 | 所属组织id或code 示例：2590070492549378 |
| classid | string | 否 | 否 | 所属部门id或code 示例：2611325344240384 |
| payid | string | 否 | 否 | 所属投资支出类别id或code 示例：1483906450725011457 |
| investtype | string | 否 | 否 | 投资目的id或code 示例：1483906450725011457 |
| costcenter | string | 否 | 否 | 成本中心id或code 示例：1483905497233358856 |
| orgcoin | string | 否 | 否 | 组织本位币id或code 示例：2584061445083909 |
| dealcoin | string | 否 | 否 | 交易币种id或code 示例：2584061445083909 |
| description | string | 否 | 否 | 项目说明 示例：我是test新增rest接口説明 |
| stageid | string | 否 | 否 | 所属投资阶段id或code 示例：1492225020698034185 |
| person | string | 否 | 否 | 负责人id或code 示例：2608328521814272 |
| years | int | 否 | 否 | 耐用年限 示例：22 |
| actualdate | string | 否 | 否 | 实际开始日期 示例：2022-01-01 |
| actfinishdate | string | 否 | 否 | 实际完成日期 示例：2022-01-01 |
| planyear | int | 否 | 否 | 计划年数 示例：33 |
| inneraccount | string | 否 | 否 | 对内会计主体id或code 示例：1544831996231417857 |
| def1 | string | 否 | 否 | 自定义项1 |
| def2 | string | 否 | 否 | 自定义项2 |
| def3 | string | 否 | 否 | 自定义项3 |
| sourceId | string | 否 | 否 | 数据来源id，传本档案的数据id 示例：1111 |
| sourceType | string | 否 | 否 | 数据来源类型，1为外部创建，2为项目云，后续接入需要加枚举 示例：1 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert 默认值：Insert |
| enable | int | 否 | 是 | 状态, 0:未启用、1:启用、2:停用 默认值：1 |
| sysid | string | 否 | 是 | 应用标识 默认值：diwork |

## 3. 请求示例

Url: /yonbip/digitalModel/investment/save_idempotent?access_token=访问令牌
Body: {
	"billnum": "",
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"name": "test070401",
		"code": "070401",
		"estimatedate": "2022-01-02",
		"esfinishdate": "2022-03-01",
		"orgsum": 324,
		"dealsum": 33333,
		"actualsum": 3221,
		"budgetyear": "2022-01-01",
		"amount": 2323.32,
		"assetstage": "2495071591908658",
		"orgid": "2590070492549378",
		"classid": "2611325344240384",
		"payid": "1483906450725011457",
		"investtype": "1483906450725011457",
		"costcenter": "1483905497233358856",
		"orgcoin": "2584061445083909",
		"dealcoin": "2584061445083909",
		"description": "我是test新增rest接口説明",
		"stageid": "1492225020698034185",
		"person": "2608328521814272",
		"years": 22,
		"actualdate": "2022-01-01",
		"actfinishdate": "2022-01-01",
		"planyear": 33,
		"inneraccount": "1544831996231417857",
		"def1": "",
		"def2": "",
		"def3": "",
		"sourceId": "1111",
		"sourceType": "1",
		"_status": "Insert",
		"enable": 0,
		"sysid": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 投资项目编码 示例：070401 |
| orgcoin | string | 否 | 组织本位币id 示例：2584061445083909 |
| assetstage | string | 否 | 固定资产类别 示例：2495071591908658 |
| orgsum | double | 否 | 计划投资总金额(本位币) 示例：324.22 |
| description | string | 否 | 投资项目说明 示例：我是test新增rest接口説明 |
| dealcoin | string | 否 | 交易币种id 示例：2584061445083909 |
| dealsum | double | 否 | 计划投资总金额(交易币) 示例：33333 |
| years | int | 否 | 耐用年限 示例：22 |
| actualdate | string | 否 | 实际开始日期,格式yyyy-MM-dd HH:mm:ss 示例：2022-01-01 00:00:00 |
| investtype | string | 否 | 投资目的id 示例：1483906450725011457 |
| esfinishdate | string | 否 | 预计完成日期,格式yyyy-MM-dd HH:mm:ss 示例：2022-03-01 00:00:00 |
| enable | int | 否 | 状态, 0:未启用、1:启用、2:停用、 示例：1 |
| planyear | int | 否 | 计划年数 示例：33 |
| tenantid | string | 否 | 租户 示例：0000KXTSGNMY81WBO00000 |
| id | string | 否 | 投资项目主键 示例：1492250850633449481 |
| payid | string | 否 | 投资支出类别id 示例：1483906450725011457 |
| costcenter | string | 否 | 成本中心id 示例：1483905497233358856 |
| creator | string | 否 | 创建人 示例：9a996f31-4315-4b93-b33f-f3e0fb0f39d2 |
| amount | double | 否 | 数量 示例：2323.32 |
| sysid | string | 否 | 应用标识 示例：diwork |
| orgid | string | 否 | 组织id 示例：2590070492549378 |
| estimatedate | string | 否 | 预计开始日期，格式yyyy-MM-dd HH:mm:ss 示例：2022-01-02 00:00:00 |
| actfinishdate | string | 否 | 实际完成日期，格式yyyy-MM-dd HH:mm:ss 示例：2022-01-01 00:00:00 |
| ytenant_id | string | 否 | 友互通租户主键 示例：0000KXTSGNMY81WBO00000 |
| classid | string | 否 | 部门id 示例：2611325344240384 |
| budgetyear | string | 否 | 预算年度，格式yyyy-MM-dd HH:mm:ss 示例：2022-01-01 00:00:00 |
| person | string | 否 | 负责人id 示例：2608328521814272 |
| name | string | 否 | 投资项目名称 示例：test070401 |
| actualsum | double | 否 | 实际总金额 示例：3221 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-07-04 15:47:43 |
| stageid | string | 否 | 投资阶段id 示例：1492225020698034185 |
| _status | string | 否 | 新增 示例：Insert |
| yhtTenantId | string | 否 | 友互通租户主键 示例：0000KXTSGNMY81WBO00000 |
| yhtTenant | string | 否 | 友互通租户主键 示例：0000KXTSGNMY81WBO00000 |
| tenant | string | 否 | 租户 示例：0000KXTSGNMY81WBO00000 |
| yTenantId | string | 否 | 友互通租户主键 示例：0000KXTSGNMY81WBO00000 |
| inneraccount | string | 否 | 对内会计主体id 示例：1544831996231417857 |
| def1 | string | 否 | 自定义项1 |
| def2 | string | 否 | 自定义项2 |
| def3 | string | 否 | 自定义项3 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "070401",
		"orgcoin": "2584061445083909",
		"assetstage": "2495071591908658",
		"orgsum": 324.22,
		"description": "我是test新增rest接口説明",
		"dealcoin": "2584061445083909",
		"dealsum": 33333,
		"years": 22,
		"actualdate": "2022-01-01 00:00:00",
		"investtype": "1483906450725011457",
		"esfinishdate": "2022-03-01 00:00:00",
		"enable": 1,
		"planyear": 33,
		"tenantid": "0000KXTSGNMY81WBO00000",
		"id": "1492250850633449481",
		"payid": "1483906450725011457",
		"costcenter": "1483905497233358856",
		"creator": "9a996f31-4315-4b93-b33f-f3e0fb0f39d2",
		"amount": 2323.32,
		"sysid": "diwork",
		"orgid": "2590070492549378",
		"estimatedate": "2022-01-02 00:00:00",
		"actfinishdate": "2022-01-01 00:00:00",
		"ytenant_id": "0000KXTSGNMY81WBO00000",
		"classid": "2611325344240384",
		"budgetyear": "2022-01-01 00:00:00",
		"person": "2608328521814272",
		"name": "test070401",
		"actualsum": 3221,
		"creationtime": "2022-07-04 15:47:43",
		"stageid": "1492225020698034185",
		"_status": "Insert",
		"yhtTenantId": "0000KXTSGNMY81WBO00000",
		"yhtTenant": "0000KXTSGNMY81WBO00000",
		"tenant": "0000KXTSGNMY81WBO00000",
		"yTenantId": "0000KXTSGNMY81WBO00000",
		"inneraccount": "1544831996231417857",
		"def1": "",
		"def2": "",
		"def3": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

