---
title: "根据指定条件查询租户下的角色"
apiId: "1784651682981347334"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据指定条件查询租户下的角色

>  请求方式	POST | BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/tenantauth/tenantrole/findRolesByRoleOrRoleGroupAndTenantId
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
codes	string	是	否	角色编码 示例：["testRole1"]
names	string	是	否	角色名称 示例：["testRole1"]
groupCodes	string	是	否	角色组编码 示例：["groupCode1"]
systemCode	string	否	否	系统编码 BIP："diwork" ；非BIP：咨询研发 示例："diwork"

## 3. 请求示例

Url: /yonbip/digitalModel/tenantauth/tenantrole/findRolesByRoleOrRoleGroupAndTenantId?access_token=访问令牌
Body: {
	"codes": [
		"testRole1"
	],
	"names": [
		"testRole1"
	],
	"groupCodes": [
		"groupCode1"
	],
	"systemCode": "\"diwork\""
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
code	string	否	状态码 成功：200 失败：999 示例：200
data	object	是	返回数据
id	string	否	角色ID 示例：010b6217-e457-412e-8d33-7384f5002356
code	string	否	角色编码 示例：test6666
name	string	否	角色名称 示例：test6666
roleName2	string	否	角色名称多语英文 示例：name2
roleName3	string	否	角色名称多语繁体 示例：name3
isactive	long	否	是否激活 1-激活 2-非激活 示例：1
createDate	string	否	创建日期 示例：2023-06-30 10:17:48
systemCode	string	否	系统编码 示例：diwork
versionNum	long	否	版本号 示例：4
orgId	string	否	组织ID 示例：666666
sysRole	boolean	否	系统角色 false：非系统角色 true：系统角色 示例：false
hideRole	boolean	否	隐藏角色 false：非隐藏角色 true：隐藏角色 示例：false
creator	string	否	创建人 示例：7e9a7047-bf83-436e-a198-61be32652012
modifier	string	否	修改人 示例：cfa5500f-e94f-441b-a6b6-009d3f91026c
multilingualDesc	string	否	角色描述 示例：desc
multilingualDesc2	string	否	角色描述多语英文 示例：desc2
multilingualDesc3	string	否	角色描述多语繁体 示例：desc3
roleName	string	否	角色名称 示例：test6666
snowflakeId	string	否	雪花ID 示例：1760004308671135744
roleType	long	否	角色类型 1：管理类 2：业务类 3：通用类 示例：2
subTenantId	string	否	商家组织ID “0”：非商家 其余是组织ID 示例：0
threeMemberType	long	否	三员标识 0：普通管理员 91：初始-系统管理员 92：初始-安全保密管理员 93：初始-安全审计员 94：系统管理员 95：安全保密管理员 96：安全审计员 示例：0
defaultRole	long	否	默认角色 0-非默认角色 1-默认角色 示例：0
message	string	否	提示语 示例：success
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"id": "010b6217-e457-412e-8d33-7384f5002356",
			"code": "test6666",
			"name": "test6666",
			"roleName2": "name2",
			"roleName3": "name3",
			"isactive": 1,
			"createDate": "2023-06-30 10:17:48",
			"systemCode": "diwork",
			"versionNum": 4,
			"orgId": "666666",
			"sysRole": false,
			"hideRole": false,
			"creator": "7e9a7047-bf83-436e-a198-61be32652012",
			"modifier": "cfa5500f-e94f-441b-a6b6-009d3f91026c",
			"multilingualDesc": "desc",
			"multilingualDesc2": "desc2",
			"multilingualDesc3": "desc3",
			"roleName": "test6666",
			"snowflakeId": "1760004308671135744",
			"roleType": 2,
			"subTenantId": "0",
			"threeMemberType": 0,
			"defaultRole": 0
		}
	],
	"message": "success",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-554-110010
	上下文读取友户通租户Id失败！	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
"999"	服务端逻辑异常	查看具体返回信息或咨询支持人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

