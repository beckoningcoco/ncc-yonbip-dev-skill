---
title: "供应商分类批量详情保存"
apiId: "2216632896441548802"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类批量详情保存

>  请求方式	POST | Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/vendorclassification/batchSaveV3
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
matchRule	string	否	否	主键匹配规则， id-基于主键查询、 code-基于编码匹配、sourceUnique-基于来源唯一键匹配，默认为sourceUnique 示例：sourceUnique
unmatchedStrategy	string	否	否	主键匹配失败处理逻辑，error-匹配不到抛出异常（参数为空时新增） add-匹配不到新增数据，默认为 add 示例：add
idStrategy	string	否	否	id生成策略， new-新⽣成、 incoming-使⽤传⼊值，默认new 示例：new
data	object	是	是	供应商分类数据
sourceUnique	string	否	否	来源系统的唯一标识，主键，即以前的erpCode,匹配成功更新，匹配失败新增 示例：2117111134124245000
code	string	否	否	编码 示例：01
name	string	否	否	名称 示例：金牌供应商
org	string	否	否	管理组织id 示例：666666
org_code	string	否	否	管理组织编码，和org不能同时为空 示例：global00
parent	string	否	否	上级供应商id 示例：2117111134124245000
parent_code	string	否	否	上级分类编码 示例：02
order	number
小数位数:0,最大长度:10	否	否	排序号 示例：1
isEnabled	boolean	否	否	是否启用 示例：true

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/batchSaveV3?access_token=访问令牌
Body: {
	"matchRule": "sourceUnique",
	"unmatchedStrategy": "add",
	"idStrategy": "new",
	"data": [
		{
			"sourceUnique": "2117111134124245000",
			"code": "01",
			"name": "金牌供应商",
			"org": "666666",
			"org_code": "global00",
			"parent": "2117111134124245000",
			"parent_code": "02",
			"order": 1,
			"isEnabled": true
		}
	]
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
data	object	是	集成平台要求返回格式
count	number
小数位数:0,最大长度:10	否	总数量 示例：2
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
successCount	number
小数位数:0,最大长度:10	否	成功数量 示例：2
level	string	否	数据层级 示例：o1
messages	object	是	失败消息
infos	object	是	成功信息
originData	object	否	原始返回数据结果

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": [
			{
				"count": 2,
				"failCount": 0,
				"successCount": 2,
				"level": "o1",
				"messages": [
					{
						"sourceUnique": "1006E11000000011110",
						"message": "名称重复"
					}
				],
				"infos": [
					{
						"data": {
							"sourceUnique": "1006E11000000011110",
							"targetUnique": "1763102517780021123"
						}
					}
				],
				"originData": {
					"count": "",
					"sucessCount": "",
					"failCount": "",
					"messages": {},
					"infos": {
						"org": "",
						"id": "",
						"name": ""
					}
				}
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
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

