---
title: "采购商城收货地址保存"
apiId: "2044545668778295299"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ship-to Address"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ship-to Address]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购商城收货地址保存

>  请求方式	POST | Ship-to Address (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/mdd/openapi/deliveraddress/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
consigneeOrgCode	string	否	是	收货组织编码 示例：CODE001
consigneeCode	string	否	是	收货人编码 示例：CODE001
phoneNumber	string	否	是	手机/固定电话 示例：13888888888
warehouseCode	string	否	否	收货仓库编码 示例：CODE001
detailAddress	string	否	是	详细地址 示例：xx小区xx号楼xx单元xx室
zip	string	否	否	邮编 示例：10010
extraErpId	string	否	否	关联ERP地址档案的ERPID 示例：W1E1R1R2R3E8E54S1111A11
metaDeliverAddressMappings	object	是	是	收货地址映射
channelCode	string	否	是	平台编码(std:BIP,jd:京东,stb:史泰博,ehsy:西域,suning:苏宁,colipu:晨光文具,deli:得力,zjwc:浙江物产,officemate:欧菲斯,grainger:固安捷,vipmro:工品汇,ehsy_ol:西域工业,yckj:一出集团,supcon:中控) 示例：std
area0	string	否	是	收货地址省编码 示例：9
area1	string	否	是	收货地址市编码 示例：644
area2	string	否	是	收货地址县区编码 示例：647
area3	string	否	否	收货地址街道编码 示例：24613

## 3. 请求示例

Url: /yonbip/cpu/mdd/openapi/deliveraddress/save?access_token=访问令牌
Body: {
	"consigneeOrgCode": "CODE001",
	"consigneeCode": "CODE001",
	"phoneNumber": "13888888888",
	"warehouseCode": "CODE001",
	"detailAddress": "xx小区xx号楼xx单元xx室",
	"zip": "10010",
	"extraErpId": "W1E1R1R2R3E8E54S1111A11",
	"metaDeliverAddressMappings": [
		{
			"channelCode": "std",
			"area0": "9",
			"area1": "644",
			"area2": "647",
			"area3": "24613"
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
code	string	否	编码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	返回数据
id	string	否	收货地址id 示例：2127535200098844679

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2127535200098844679"
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
999	未找到对应员工!	请求参数有误

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

