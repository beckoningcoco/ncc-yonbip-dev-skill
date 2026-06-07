---
title: "云采超市订单详情查询"
apiId: "ee3c63608c8740a789a21ac5aceccd1d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市订单详情查询

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/queryMallOrder
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	long	否	否	超市订单id（与超市订单号二选一必填，id和code同时填写为且的关系） 示例：100002223
code	string	否	否	超市订单号（与超市订单id二选一必填，id和code同时填写为且的关系） 示例：20211216190007

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/queryMallOrder?access_token=访问令牌
Body: {
	"id": 100002223,
	"code": "20211216190007"
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
code	string	否	响应码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	数据
yc_orderid	string	否	超市订单id 示例：100002223
yc_orderCode	string	否	云采超市订单编码 示例：20211216190007
erp_orderid	string	否	外系统超市订单id 示例：adsdas
erp_orderCode	string	否	外系统超市订单编码 示例：asdasdas
amount	double	否	总金额 示例：752.2
approveStatus	string	否	审批状态（0：未审批；1：审批通过；2：审批驳回） 示例：0
invoiceInfo	string	否	发票信息 示例：{}
memo	string	否	备注
orderDate	long	否	订单日期 示例：1639654099000
receiptAddress	string	否	收货地址 示例：河南新乡市延津县马庄乡
yc_supplierId	string	否	供应商ID 示例：12312321
yc_supplierCode	string	否	供应商编码 示例：code12321
yc_supplierName	string	否	供应商名称 示例：供应商1
yc_billmakerCode	string	否	云采制单人员编码 示例：18210528371
erp_billmakerCode	string	否	外系统制单人编码 示例：YHT-1120-16601587543393123
yc_financialOrgCode	string	否	云采财务组织编码 示例：default_org
erp_financialOrgId	string	否	外系统财务组织ID 示例：1223123
erp_financialOrgCode	string	否	外系统财务组织编码 示例：default_org
yc_financialOrgName	string	否	云采财务组织名称 示例：九州科技
yc_puOrgCode	string	否	云采采购组织编码 示例：default_org
erp_puOrgId	string	否	外系统采购组织ID 示例：123123
erp_puOrgCode	string	否	外系统采购组织编码 示例：default_org
yc_puOrgName	string	否	云采采购组织名称 示例：九州科技
yc_puDeptCode	string	否	云采采购部门编码 示例：default_dept
erp_puDeptId	string	否	外系统采购部门ID 示例：123213
erp_puDeptCode	string	否	外系统采购部门编码 示例：default_dept
yc_puDeptName	string	否	云采采购部门名称 示例：九州科技默认部门
yc_puReqOrgCode	string	否	云采需求组织编码 示例：default_org
erp_puReqDeptId	string	否	外系统需求组织ID 示例：123123
erp_puReqOrgCode	string	否	外系统需求组织编码 示例：default_org
yc_puReqOrgName	string	否	云采需求组织名称 示例：九州科技
yc_puReqDeptCode	string	否	云采需求部门编码 示例：default_dept
erp_puReqOrgId	string	否	外系统需求组织 示例：123123123
erp_puReqDeptCode	string	否	外系统需求部门编码 示例：default_dept
yc_puReqDeptName	string	否	云采需求部门名称 示例：九州科技默认部门
yc_consigneeCode	string	否	收货人编码 示例：code233
yc_consigneeName	string	否	收货人名称 示例：张三
yc_consigneeTel	string	否	收货人电话 示例：18244444444
vdef1	string	否	自定义项1 示例：1
vdef2	string	否	自定义项2 示例：2
vdef3	string	否	自定义项3 示例：3
vdef4	string	否	自定义项4 示例：4
vdef5	string	否	自定义项5 示例：5
vdef6	string	否	自定义项6 示例：6
vdef7	string	否	自定义项7 示例：7
vdef8	string	否	自定义项8 示例：8
vdef9	string	否	自定义项9 示例：9
vdef10	string	否	自定义项10 示例：10
yc_carriage	double	否	订单头运费 示例：10.0
status	string	否	超市订单状态(SAVED:已保存；REJECTED:采购商审批不通过；TO_BE_PAID:待支付；TO_BE_CONFIREMED:审批后待确认状态；TO_BE_APPROVED:开启供应商协同，供应商确认后采购商审批状态；COMMITED:已提交；APPROVED:已生效；CANCELED:已取消；TO_BE_CANCELED:取消中;SHIPPED:已发货但未收货；RECEIVED:已签收；DENY:拒签；INVOICING:开票中；INVOICED:已开票；TO_BE_REFUND:退款失败；) 示例：RECEIVED
ec_order_code	string	否	电商单号 示例：JD35675335
bodys	object	是	明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"yc_orderid": "100002223",
		"yc_orderCode": "20211216190007",
		"erp_orderid": "adsdas",
		"erp_orderCode": "asdasdas",
		"amount": 752.2,
		"approveStatus": "0",
		"invoiceInfo": "{}",
		"memo": "",
		"orderDate": 1639654099000,
		"receiptAddress": "河南新乡市延津县马庄乡",
		"yc_supplierId": "12312321",
		"yc_supplierCode": "code12321",
		"yc_supplierName": "供应商1",
		"yc_billmakerCode": "18210528371",
		"erp_billmakerCode": "YHT-1120-16601587543393123",
		"yc_financialOrgCode": "default_org",
		"erp_financialOrgId": "1223123",
		"erp_financialOrgCode": "default_org",
		"yc_financialOrgName": "九州科技",
		"yc_puOrgCode": "default_org",
		"erp_puOrgId": "123123",
		"erp_puOrgCode": "default_org",
		"yc_puOrgName": "九州科技",
		"yc_puDeptCode": "default_dept",
		"erp_puDeptId": "123213",
		"erp_puDeptCode": "default_dept",
		"yc_puDeptName": "九州科技默认部门",
		"yc_puReqOrgCode": "default_org",
		"erp_puReqDeptId": "123123",
		"erp_puReqOrgCode": "default_org",
		"yc_puReqOrgName": "九州科技",
		"yc_puReqDeptCode": "default_dept",
		"erp_puReqOrgId": "123123123",
		"erp_puReqDeptCode": "default_dept",
		"yc_puReqDeptName": "九州科技默认部门",
		"yc_consigneeCode": "code233",
		"yc_consigneeName": "张三",
		"yc_consigneeTel": "18244444444",
		"vdef1": "1",
		"vdef2": "2",
		"vdef3": "3",
		"vdef4": "4",
		"vdef5": "5",
		"vdef6": "6",
		"vdef7": "7",
		"vdef8": "8",
		"vdef9": "9",
		"vdef10": "10",
		"yc_carriage": 10,
		"status": "RECEIVED",
		"ec_order_code": "JD35675335",
		"bodys": [
			{
				"yc_orderDetailId": "10301",
				"skuCode": "221-43648-160",
				"ware_name": "恋泽芯耐磨工作服套装男士纯棉电焊防烫建筑工地汽修春秋工装军绿户外劳保服 精品E款 【精品420】套装 2XL 175码（",
				"yc_materialCode": "code1233",
				"materialName": "布料",
				"planDeliverDate": 1639584000000,
				"quantity": 10,
				"price": 75.22,
				"tax_price": 85,
				"tax_rate": 13,
				"tax": 97.8,
				"amount": 752.2,
				"tax_amount": 850,
				"propertySelections": "",
				"purposeId": "12321321",
				"purposeName": "办公",
				"sourceType": "0",
				"giftsFlag": "0"
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
999	订单不存在!	检查入参

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

