---
title: "资金收款单列表查询"
apiId: "1437911267858710528"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "ctm"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 资金收款单列表查询

>  请求方式	POST | Collection Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/fi/fundcollection/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 示例：1 默认值：1
pageSize	int	否	是	每页行数 示例：10 默认值：10
code	string	否	否	单据编码 示例：FDR20220517000530
accentity	string	否	否	资金组织id 示例：2404308656854308
accentity_code	string	否	否	资金组织编码 示例：110
verifystate	string	否	否	审批状态；0：初始开立，1：审批中，2：审批完成，3：流程终止，4：驳回到制单 示例：0
open_vouchdate_begin	string	否	否	单据日期开始日期,格式为:yyyy-MM-dd 示例：2022-05-01
open_vouchdate_end	string	否	否	单据日期结束日期,格式为:yyyy-MM-dd 示例：2022-05-17
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	属性名(条件) ，1：defines.define4(表头自由自定义项4) ，2：pubts(时间戳) 示例：pubts
op	string	否	否	比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between
value1	string	否	否	值1 示例：2022-05-01 13:52:47
value2	string	否	否	值2 示例：2022-05-17 13:52:47

## 3. 请求示例

Url: /yonbip/fi/fundcollection/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "FDR20220517000530",
	"accentity": "2404308656854308",
	"accentity_code": "110",
	"verifystate": "0",
	"open_vouchdate_begin": "2022-05-01",
	"open_vouchdate_end": "2022-05-17",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2022-05-01 13:52:47",
			"value2": "2022-05-17 13:52:47"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回的数据
pageIndex	long	否	页号 示例：1
pageSize	long	否	每页数量 示例：500
recordCount	long	否	总页数 示例：3
recordList	object	是	返回的数据列表
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页号 示例：1
endPageIndex	long	否	终止页号 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 500,
		"recordCount": 3,
		"recordList": [
			{
				"verifystate": "0",
				"currency_moneyDigit": 4,
				"currency_priceDigit": 3,
				"code": "FDR20220519000560",
				"currency_name": "人民币",
				"oriSum": 800,
				"isWfControlled": false,
				"tradetype_name": "其他收款",
				"natSum": 800,
				"accentity_name": "快乐柠檬",
				"accentity": "2412834925744384",
				"voucherstatus": 2,
				"vouchdate": "2022-05-19 00:00:00",
				"tradetype": "2571644308067072",
				"natCurrency_name": "人民币",
				"natCurrency": "2404308656854308",
				"accentityRaw_name": "快乐柠檬",
				"natCurrency_moneyDigit": 4,
				"natCurrency_priceDigit": 3,
				"currency": "2404308656854308",
				"id": 2780931073561344,
				"pubts": "2022-05-19 12:29:23",
				"accentityRaw": "2412834925744385",
				"defines": {
					"define4": "票据+人员"
				}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-23	
更新
请求说明
更新
请求参数 accentity
更新
请求参数 accentity_code
新增
返回参数 accentityRaw_name
新增
返回参数 accentityRaw
更新
返回参数 accentity_name
更新
返回参数 accentity

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

