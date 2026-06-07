---
title: "混合云BIP供应链采购订单行关闭ERP采购订单"
apiId: "1759434297880608774"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 混合云BIP供应链采购订单行关闭ERP采购订单

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorOrderRwClose
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
ycId	int	否	否	采购订单主表id
ycOrderno	string	否	否	云采订单编号
supEnterpriseId	int	否	否	供应商的租户id
closeType	string	否	否	关闭类型传NC
purEnterpriseId	int	否	否	采购商的租户id
ncOrderOtherId	string	否	否	订单编号-来源于其他系统
ncOrderSourceId	string	否	否	nc订单pkSourceId
pk_order	string	否	否	nc订单pk
enterpriseId	int	否	否	采购商租户id
irespstatus	string	否	否	订单状态
vreason	string	否	否	供应商拒绝-变更理由
id	int	否	否	云采采购订单id
orderOtherId	string	否	否	订单编号_来源于其他系统
yb_ycorder_commons	object	是	否	BIP供应链采购订单公共子表
id	int	否	否	销售订单子表的采购订单子表id
pk_order_b	string	否	否	销售订单子表的nc采购订单子表id
pk_order	string	否	否	销售订单记录的nc采购订单pk
nconfirmnum	float	否	否	销售订单子表的-ConQuantity有值且不等于0取确认数量否则取数量
nqtorigtaxprice	float	否	否	销售订单子表的-确认含税单价有值且不等于0取确认含税单价否则取含税单价
rowReason	string	否	否	拒绝理由-确认-拒绝
dplanarrvdate	int	否	否	确认到货日期
istorestatus	string	否	否	订单执行情况维护
openeType	string	否	否	打开类型传NC
closeType	string	否	否	关闭类型传NC
ncOrderSourceId	string	否	否	订单编号-来源于其他系统
ncOrderDetailId	string	否	否	订单明细ID-来源于外系统
ycDetailId	int	否	否	采购订单子表id
ycarrivebid	string	否	否	供应链到货单子表id-删除NC到货单
ncOrderDetailId	string	否	否	订单明细ID-来源于外系统
ycDetailId	string	否	否	采购订单子表id
openeType	string	否	否	打开类型传NC
ncinvoiceid	string	否	否	ERP发票主键ID
ycarrivebid	int	否	否	供应链到货单子表ID

## 3. 请求示例

Url: /yonbip/cpu/connectorOrderRwClose?access_token=访问令牌
Body: [{
	"ycId": 0,
	"ycOrderno": "",
	"supEnterpriseId": 0,
	"closeType": "",
	"purEnterpriseId": 0,
	"ncOrderOtherId": "",
	"ncOrderSourceId": "",
	"pk_order": "",
	"enterpriseId": 0,
	"irespstatus": "",
	"vreason": "",
	"id": 0,
	"orderOtherId": "",
	"yb_ycorder_commons": [
		{
			"id": 0,
			"pk_order_b": "",
			"pk_order": "",
			"nconfirmnum": 0,
			"nqtorigtaxprice": 0,
			"rowReason": "",
			"dplanarrvdate": 0,
			"istorestatus": "",
			"openeType": "",
			"closeType": "",
			"ncOrderSourceId": "",
			"ncOrderDetailId": "",
			"ycDetailId": 0,
			"ycarrivebid": ""
		}
	],
	"ncOrderDetailId": "",
	"ycDetailId": "",
	"openeType": "",
	"ncinvoiceid": "",
	"ycarrivebid": 0
}]

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
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

