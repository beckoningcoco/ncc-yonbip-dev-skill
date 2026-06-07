---
title: "合并报表-凭证导出"
apiId: "1756489444956307456"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-凭证导出

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/vouch/open/exportEpmVouch

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
| pk_cube | string | 否 | 是 | 应用模型主键，来自于【合并报表获取租户模型接口】接口返回值 cubeId |
| queryVO | object | 否 | 是 | 查询条件 |
| month | string | 否 | 是 | 期间，例：5，取自 维度管理->TIME 期间->维度成员编码 |
| year | string | 否 | 是 | 年，例：2024，取自 维度管理->TIME 期间->维度成员编码 |
| pk_cube | string | 否 | 是 | 应用模型主键，来自于【合并报表获取租户模型接口】接口返回值 cubeId |
| scenario | string | 否 | 是 | 业务方案编码，例：Actual，取自 维度管理->SCENARIO 业务方案->维度成员编码 |
| pk_safeclass | string | 否 | 否 | 安全类主键，取自 合并报表->安全类-> 列表数据返回值字段 pkSafeclass |
| pk_vouchgroup | string | 否 | 否 | 凭证分组主键，取自 合并报表->凭证分组-> 列表数据返回值字段 pk_vouchgroup |
| trail | string | 否 | 否 | 审计线索编码，取值范围：[ConsAdjs]，[PAdjs]，<PCAdjs>，<EOAdjs>，[Elim] |
| vouch_state_str | string | 否 | 否 | 凭证状态，取值范围：1（保存），2（已提交），3（取消提交），4（已审核），5（已过账），6（未审核），7（未过账）；可以多选，多选时需要通过 ',' 英文逗号分割，例："1,2,3,4,5,6,7" |
| entity | string | 否 | 否 | 主体编码，取自 合并报表->ENTITY 主体 -> 主体单元编码，多选时需要通过 ',' 英文逗号分割 |
| sysParamJson | object | 否 | 是 | 系统参数 |
| appcode | string | 否 | 是 | 节点编码，固定值不需要修改，启用默认值就可以 默认值：BCS09008 |

## 3. 请求示例

Url: /yonbip/qyjx/vouch/open/exportEpmVouch?access_token=访问令牌
Body: {
	"pk_cube": "",
	"queryVO": {
		"month": "",
		"year": "",
		"pk_cube": "",
		"scenario": "",
		"pk_safeclass": "",
		"pk_vouchgroup": "",
		"trail": "",
		"vouch_state_str": "",
		"entity": ""
	},
	"sysParamJson": {
		"appcode": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 |
| data | object | 否 | 导出文件数据 |
| fileName | string | 否 | 导出文件名称 |
| file | string | 否 | 导出文件 base64 字符串 |

## 5. 正确返回示例

{
	"code": "",
	"data": {
		"fileName": "",
		"file": ""
	}
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

更新

返回参数 (4)

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

