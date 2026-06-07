---
title: "智能收单激活设备"
apiId: "1442559109676138496"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单激活设备

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/appDevice/v1/openDevice
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
data	object	否	是	参数实体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
location	string	否	是	设备地址：设备所在地址|管理系统中可修改 示例：8号楼4B
deviceName	string	否	是	设备名称 示例：收单机001
openDeviceKey	string	否	是	绑定设备授权key：管理员登录接口返回值，用于校验是否正确登录 示例：d3eed07a-eedf-46d5-a8fc-b1c6c2ff288a
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/openDevice?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"location": "8号楼4B",
		"deviceName": "收单机001",
		"openDeviceKey": "d3eed07a-eedf-46d5-a8fc-b1c6c2ff288a",
		"deviceCode": "yonyou00001",
		"manufacturer": "yonyou"
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
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023060400014	设备开通失败	联系开发处理
1023060400015	该用户已绑定设备，无法重复绑定	使用新用户登录绑定设备
1023060400016	登录信息已过期，请重新登录	管理员重新登陆验证
1023060400017	同一租户下其他设备在开通，请稍后重试	重试绑定操作
1023060400018	该租户智能收单应用许可数量已到上限	该租户智能收单应用许可数量已到上限
1023060400013	数据重复提交	更新幂等key值提交
1023060400039	该设备编号已绑定，无法重复绑定	更换设备编号绑定

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

