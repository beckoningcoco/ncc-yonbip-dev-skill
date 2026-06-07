---
title: "维度管理丨维度成员丨维度成员和属性查询"
apiId: "1892993469956227078"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Dimension Table"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Dimension Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 维度管理丨维度成员丨维度成员和属性查询

>  请求方式	POST | Dimension Table (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/bp/v1.0/members
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
dimHierId	string	否	否	维度体系主键 示例：1884911973486297098
dimLevelId	string	否	否	维度层主键 示例：TB_DIMLEV_MEASURE_00
cubeId	string	否	否	应用模型主键 示例：1889341287354073097
treeFatherKey	string	否	否	父节点主键 示例：05
propIds	string	是	否	属性主键集合 示例：["TB_DP_MEASURE_ENLIST","TB_DP_MEASURE_0GROUP"]
isLazy	string	否	否	是否是懒加载 示例：1 默认值：0

## 3. 请求示例

Url: /yonbip/qyjx/bp/v1.0/members?access_token=访问令牌
Body: {
	"dimHierId": "1884911973486297098",
	"dimLevelId": "TB_DIMLEV_MEASURE_00",
	"cubeId": "1889341287354073097",
	"treeFatherKey": "05",
	"propIds": [
		"TB_DP_MEASURE_ENLIST",
		"TB_DP_MEASURE_0GROUP"
	],
	"isLazy": "1"
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
creator	string	否	创建人
code	long	否	返回状态码 示例：200
data	object	是	data
pid	string	否	父成员id 示例：1815957553462378505
id	string	否	当前成员id 示例：1815957553462378504
pcode	string	否	父成员编码 示例：CurrRate
multiLang	object	否	多语对象
code	string	否	成员编码 示例：ClosingRate
treeKey	string	否	成员唯一主键 示例：0501
treeFatherKey	string	否	父成员唯一主键 示例：05
values	object	否	额外属性集合
pmultiLang	object	否	父成员多语对象
success	boolean	否	success 示例：true

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"pid": "1815957553462378505",
			"id": "1815957553462378504",
			"pcode": "CurrRate",
			"multiLang": {
				"simplifiedName": "ClosingRate",
				"englishName": "ClosingRate",
				"traditionalName": "ClosingRate"
			},
			"code": "ClosingRate",
			"treeKey": "0501",
			"treeFatherKey": "05",
			"values": {},
			"pmultiLang": {
				"simplifiedName": "CurrRate",
				"englishName": "CurrRate",
				"traditionalName": "CurrRate"
			}
		}
	],
	"success": true
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

