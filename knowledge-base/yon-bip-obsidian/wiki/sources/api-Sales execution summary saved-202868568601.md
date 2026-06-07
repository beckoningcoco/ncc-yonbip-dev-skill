---
title: "销售执行汇总保存"
apiId: "2028685686015524864"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Hybrid Cloud Integration"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Hybrid Cloud Integration]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售执行汇总保存

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/openapi/imi/imiSaleExecSummary/save
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
data	object	是	是	数据节点
pk_org	string	否	否	销售组织
cordercustid	string	否	否	订单客户
cmarbascalssid	string	否	否	物料基本分类
cmaterialvid	string	否	否	物料
cmaterialvid_code	string	否	否	物料编码
cmaterialvid_name	string	否	否	物料名称
corigcurrencyid	string	否	否	币种
norigmny	number
小数位数:8,最大长度:20	否	否	无税金额
ncostmny	number
小数位数:8,最大长度:20	否	否	成本金额
dbilldate	string	否	否	单据日期
taudittime	string	否	否	审批日期
srcsaleordercode	string	否	否	ERP销售订单编码
srcsaleorderbid	string	否	否	ERP销售订单行id
ts	string	否	否	ts
bipbillcode	string	否	否	BIP订单号
cdeptvid	string	否	否	部门ID
cemployeename	string	否	否	业务员
vnote	string	否	否	备注
cunitid	string	否	否	主单位
nnum	number
小数位数:8,最大长度:20	否	否	主数量
norigtaxprice	number
小数位数:8,最大长度:20	否	否	主含税单价
assistunitid	string	否	否	辅单位
assistnum	number
小数位数:8,最大长度:20	否	否	辅数量
assistorigtaxprice	number
小数位数:8,最大长度:20	否	否	辅含税单价
norigtaxmny	number
小数位数:8,最大长度:20	否	否	价税合计
ntaxrate	number
小数位数:8,最大长度:20	否	否	税率
param	string	否	否	回传参数

## 3. 请求示例

Url: /yonbip/crm/openapi/imi/imiSaleExecSummary/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "",
			"cordercustid": "",
			"cmarbascalssid": "",
			"cmaterialvid": "",
			"cmaterialvid_code": "",
			"cmaterialvid_name": "",
			"corigcurrencyid": "",
			"norigmny": 0,
			"ncostmny": 0,
			"dbilldate": "",
			"taudittime": "",
			"srcsaleordercode": "",
			"srcsaleorderbid": "",
			"ts": "",
			"bipbillcode": "",
			"cdeptvid": "",
			"cemployeename": "",
			"vnote": "",
			"cunitid": "",
			"nnum": 0,
			"norigtaxprice": 0,
			"assistunitid": "",
			"assistnum": 0,
			"assistorigtaxprice": 0,
			"norigtaxmny": 0,
			"ntaxrate": 0,
			"param": ""
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	状态码
message	string	否	状态信息
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	总条数
sucessCount	number
小数位数:0,最大长度:10	否	成功条数
failCount	number
小数位数:0,最大长度:10	否	失败条数
messages	object	是	错误信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				},
				"asyncKey": "",
				"url": ""
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	响应结果错误	响应结果错误

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

