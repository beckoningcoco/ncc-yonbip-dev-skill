---
title: "实物管理扫码登记"
apiId: "1719302930911723524"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Document Submission Registration"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Document Submission Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 实物管理扫码登记

>  请求方式	POST | Document Submission Registration (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/pdm/postbox/docregister
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
data	object	否	是	请求参数
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
deviceNo	string	否	是	设备编号：邮单筒出厂唯一编号 示例：US90A*****059020
barCode	string	否	是	单据条码：当前租户某类型单据对应的条码（条码格式：单据类型编码|单据ID） 示例：ssc_general********|*****056074244

## 3. 请求示例

Url: /yonbip/ssc/pdm/postbox/docregister?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"deviceNo": "US90A*****059020",
		"barCode": "ssc_general********|*****056074244"
	}
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
code	string	否	请求返回编码 示例：200
message	string	否	请求返回信息 示例：操作成功
data	object	否	请求返回数据
deviceNo	string	否	设备编号：邮单筒出厂唯一编号 示例：US90A*****059020
postboxNo	string	否	投递筒号：单据建议投递筒号 示例：1
billTypeName	string	否	单据类型：单据类型名称 示例：通用****单
billCode	string	否	单据编号：登记成功的单据编号 示例：TYG*******0001
alertMsg	string	否	投递提示信息 示例：实物登记已完成，请将单据实物投入1号筒

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"deviceNo": "US90A*****059020",
		"postboxNo": "1",
		"billTypeName": "通用****单",
		"billCode": "TYG*******0001",
		"alertMsg": "实物登记已完成，请将单据实物投入1号筒"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
036-507-020001	服务端逻辑异常	服务端报错，请联系开发人员
036-507-020002	当前数据正在被新增或修改，请稍后再试	并发错误，请检查单据状态，重新操作
036-507-020004	操作失败，xxx参数不能为空	缺少必要参数，请补全
036-507-020006	操作失败，未找到该设备的绑定信息！ 设备编号：xxxxxxxxx	设备未绑定
036-507-020009	实物登记失败，单据条码格式不正确	单据条码格式错误
036-507-020010	实物登记失败，请联系管理员检查实物单据映射配置	实物单据映射未配置或配置有误，请联系管理员检查“实物单据映射”配置（单据类型、提单人组织、提单人等字段）
036-507-020011	实物登记失败，未找到匹配的投递筒号，请检查设备注册配置！设备编号：xxxxxx	根据设备注册信息，单据类型或交易类型不允许在该设备投递
036-507-020012	实物登记失败，非交单已登记状态的单据不允许再次登记	单据已登记，且当前单据状态不允许再次登记
036-507-020013	实物登记失败，该单据存在投递记录且已被取件	该单据存在投递记录且已被取件
036-507-020015	实物登记失败，投递筒已满	投递筒已达最大投递限制，请联系管理员处理
036-507-020016	未购买实物管理服务授权许可，请尽快加购/实物管理授权许可已过期，请及时续费	实物管理许可未购买或者不在许可期间内，需要加购实物管理
036-507-020018	实物登记失败，无法获取可被登记的单据	根据条码未找到单据，请检查后重新登记
036-507-020003	操作失败，请联系系统管理员修改API调用设置，将实物管理API关联的用户身份修改为员工	API调用受限，请联系管理员将API关联的用户身份修改为员工

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

