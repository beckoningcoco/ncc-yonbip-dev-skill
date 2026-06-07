---
title: "询价单状态查询"
apiId: "1671684516857511944"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "RFQ"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, RFQ]
platform_version: "BIP"
source_type: community-api-docs
---

# 询价单状态查询

>  请求方式	GET | RFQ (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/buyoffer/detailById/{id}
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	path	是	询价单id或询价单号    示例: 123456789/XJD20230323000032

## 3. 请求示例

Url: /yonbip/cpu/buyoffer/detailById/123456789%2FXJD20230323000032?access_token=访问令牌

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
code	string	否	状态码 示例：200
data	object	否	询价单信息
buyofferId	long	否	询价单id 示例：1674648035586998300
vBuyOfferBillCode	string	否	询价单号 示例：XJ-0org01-20230114-0001
detailEntityList	object	是	询价单子表
currencyName	string	否	询价币种 示例：人民币
corpSubAccountName	string	否	采购员名称 示例：叶孤城
corpSubAccountId	string	否	采购员id 示例：1653282746555957251
currencyId	string	否	询价币种id 示例：1525696886140829722
status	string	否	询价单状态（0：待询价，1：接受报价中，2：已有报价，3：电商已下订单，4：已经向ERP下订单，9：已支付，11：云采询价中，12：1688取消询价，云采询价单删除，13：未发布，14：已开启，15：已定标，17：审批中（1. 有审批流：提交之后、未最终审批前；2.没有审批流：不存在此状态），18：已推荐供应商，20：已流标，21：已下单，22：已开标，23：谈判已保存，24：已推合同，25：询价终止，26：终止谈判，27：已推ERP价格审批单，28：已作废，35：谈判已发布，36：谈判详情已发布） 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"buyofferId": 1674648035586998300,
		"vBuyOfferBillCode": "XJ-0org01-20230114-0001",
		"detailEntityList": [
			{
				"puorgDocId": "1530661361518379016",
				"productCode": "st01000013",
				"bmemo": "这是备注",
				"puorgDocName": "用友集团cn",
				"reqdeptId": "1576096678078840833",
				"reqdeptName": "用友集团部门",
				"reqOrgid": "1654148165281513475",
				"productName": "这是物料",
				"reqOrgName": "北京航天万源科技有限公司",
				"reqCodeErp": "147811",
				"reqRownoErp": "2"
			}
		],
		"currencyName": "人民币",
		"corpSubAccountName": "叶孤城",
		"corpSubAccountId": "1653282746555957251",
		"currencyId": "1525696886140829722",
		"status": "1"
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (21)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

