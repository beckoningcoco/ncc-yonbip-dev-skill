---
title: "合并报表-报表数据中心右键查看某个多维数据的维度向量信息"
apiId: "1892379762096603143"
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

# 合并报表-报表数据中心右键查看某个多维数据的维度向量信息

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/tbb/form/getdimVector

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
| uniKeys | string | 是 | 是 | 当前单元格维度向量生成的uniqkey 示例：["1.1.1.3.1.e.1.1jc.1.f.1.7.1.3.1.3.4.3.1.2.1.2.1.2."] |
| dvMap | object | 否 | 否 | 有公式的单元格只有dvMap |
| showType | string | 否 | 是 | 报表数据中心右键日志上侧维度信息显示样式() 示例：CODEANDNAME 默认值：CODEANDNAME |
| pk_cube | string | 否 | 是 | 应用模型主键 示例：1825348602618708280 |
| trailCode | string | 否 | 否 | 当前单元格需要显示的审计线索编码 示例：<EO> |
| entityCode | string | 否 | 否 | 当前单元格需要显示的主体编码 示例：AutoApiBcsEntity0101 |
| sysParamJson | object | 否 | 是 | sysParamJson |
| appcode | string | 否 | 是 | 调用接口节点编码，默认BCS13002 示例：BCS13002 默认值：* |

## 3. 请求示例

Url: /yonbip/qyjx/tbb/form/getdimVector?access_token=访问令牌
Body: {
	"uniKeys": [
		"1.1.1.3.1.e.1.1jc.1.f.1.7.1.3.1.3.4.3.1.2.1.2.1.2."
	],
	"dvMap": {},
	"showType": "CODEANDNAME",
	"pk_cube": "1825348602618708280",
	"trailCode": "<EO>",
	"entityCode": "AutoApiBcsEntity0101",
	"sysParamJson": {
		"appcode": "BCS13002"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码 示例：200 |
| data | object | 否 | data |
| nonEditable | string | 否 | 当前单元格不可编辑原因说明 示例：["1.单元格维度组合无效","2.主体活动状态为否时，<PCT>以上审计线索成员数据无效","3.非base数据","4.科目IsCalculated属性为Y","5.合并任务运行中","6.当前用户没有写入权限","7.非汇率科目主体非末级/审计线索非<EO>/币种非本位币 汇率科目主体非[None]/审计线索非[None]/币种非[None]","8.数据期间非<已启动>","9.所属阶段非<未提交>","10.单元格设置为只读属性","11.当前表单为任务表单：非【合并任务】页签打开/表单状态非<编制中>或<已退回>"] |
| baseinfo | object | 是 | 当前单元格基础信息 |
| unikeys | object | 否 | unikeys 示例：350.gkm.1qgj.ci.7v.e.efvd.mjm.18a.2s2.69.10mk.r6h. |
| scope | string | 否 | scope格式 示例："'SCENARIO':'Actual'/*实际数*/,\n'YEARS':'2025'/*2025年*/,\n'PERIOD':'10'/*10月*/,\n'VIEW':'YTD'/*当年累计*/,\n'ENTITY':'A'/*A*/,\n'TRAIL':'OriginalSingle'/*初始数*/,\n'ACCOUNT':'2211'/*应付账款*/,\n'ICP':'A32'/*A32*/,\n'CURRENCY':'CNY'/*CNY*/,\n'SCOPE':'[Scope_None]'/*[ |
| twoDimFromMultiDim | string | 否 | 取数公式格式 示例："SCENARIO=Actual#YEARS=2025#PERIOD=10#VIEW=YTD#ENTITY=A#TRAIL=OriginalSingle#ACCOUNT=2211#ICP=A32#CURRENCY=CNY#SCOPE=[Scope_None]#VERSION=v0#C1=CS01#C2=[None]" |
| formula | string | 否 | 脚本格式 示例："'SCENARIO':'Actual'/*实际数*/,'YEARS':'2025'/*2025年*/,'PERIOD':'10'/*10月*/,'VIEW':'YTD'/*当年累计*/,'ENTITY':'A'/*A*/,'TRAIL':'OriginalSingle'/*初始数*/,'ACCOUNT':'2211'/*应付账款*/,'ICP':'A32'/*A32*/,'CURRENCY':'CNY'/*CNY*/,'SCOPE':'[Scope_None]'/*[Scope_None]*/,'VER |
| diminfo | object | 是 | 当前单元格维度相关信息 |
| script | string | 否 | 脚本格式 示例：SCENARIO=Actual#YEARS=2025#PERIOD=10#VIEW=YTD#ENTITY=A#TRAIL=OriginalSingle#ACCOUNT=2211#ICP=A32#CURRENCY=CNY#SCOPE=[Scope_None]#VERSION=v0#C1=CS01#C2=[None] |
| ruleLine | string | 否 | 规则行 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"nonEditable": "[\"1.单元格维度组合无效\",\"2.主体活动状态为否时，<PCT>以上审计线索成员数据无效\",\"3.非base数据\",\"4.科目IsCalculated属性为Y\",\"5.合并任务运行中\",\"6.当前用户没有写入权限\",\"7.非汇率科目主体非末级/审计线索非<EO>/币种非本位币\n  汇率科目主体非[None]/审计线索非[None]/币种非[None]\",\"8.数据期间非<已启动>\",\"9.所属阶段非<未提交>\",\"10.单元格设置为只读属性\",\"11.当前表单为任务表单：非【合并任务】页签打开/表单状态非<编制中>或<已退回>\"]",
		"baseinfo": [
			{
				"cellTitle": "所属应用模型:",
				"value": "自动化合并报表模型",
				"code": "AutoBcsCube",
				"uniName": ""
			}
		],
		"unikeys": "350.gkm.1qgj.ci.7v.e.efvd.mjm.18a.2s2.69.10mk.r6h.",
		"scope": "\"'SCENARIO':'Actual'/*实际数*/,\\n'YEARS':'2025'/*2025年*/,\\n'PERIOD':'10'/*10月*/,\\n'VIEW':'YTD'/*当年累计*/,\\n'ENTITY':'A'/*A*/,\\n'TRAIL':'OriginalSingle'/*初始数*/,\\n'ACCOUNT':'2211'/*应付账款*/,\\n'ICP':'A32'/*A32*/,\\n'CURRENCY':'CNY'/*CNY*/,\\n'SCOPE':'[Scope_None]'/*[",
		"twoDimFromMultiDim": "\"SCENARIO=Actual#YEARS=2025#PERIOD=10#VIEW=YTD#ENTITY=A#TRAIL=OriginalSingle#ACCOUNT=2211#ICP=A32#CURRENCY=CNY#SCOPE=[Scope_None]#VERSION=v0#C1=CS01#C2=[None]\"",
		"formula": "\"'SCENARIO':'Actual'/*实际数*/,'YEARS':'2025'/*2025年*/,'PERIOD':'10'/*10月*/,'VIEW':'YTD'/*当年累计*/,'ENTITY':'A'/*A*/,'TRAIL':'OriginalSingle'/*初始数*/,'ACCOUNT':'2211'/*应付账款*/,'ICP':'A32'/*A32*/,'CURRENCY':'CNY'/*CNY*/,'SCOPE':'[Scope_None]'/*[Scope_None]*/,'VER",
		"diminfo": [
			{
				"cellTitle": "业务方案:",
				"value": "Actual 实际数",
				"code": "Actual 实际数",
				"uniName": "SCENARIOActual"
			}
		],
		"script": "SCENARIO=Actual#YEARS=2025#PERIOD=10#VIEW=YTD#ENTITY=A#TRAIL=OriginalSingle#ACCOUNT=2211#ICP=A32#CURRENCY=CNY#SCOPE=[Scope_None]#VERSION=v0#C1=CS01#C2=[None]",
		"ruleLine": ""
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

新增

返回参数 (6)

更新

返回参数 code

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

