---
title: "项目团队新增|信息更正|变更"
apiId: "1971104863349112839"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Team"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Team]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目团队新增|信息更正|变更

>  请求方式	POST | Project Team (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/projectorgs/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
id	string	否	否	id,新增操作为空;信息更正,变更操作不为空，必填 示例：123
vid	string	否	否	vid,新增操作为空;变更,信息更正操作不为空,必填 示例：123456
name	string	否	是	团队名称 示例：data
code	string	否	是	团队编码 示例：code
shortname	string	否	否	简称 示例：111
project_id	string	否	否	项目id 示例：123456
parentid	string	否	否	上级团队id 示例：3546464
_status	string	否	是	操作标识，Insert新增,变更; Update信息更正 示例：Insert
principal	string	否	否	负责人id 示例：123456
starttime	date
格式:yyyy-MM-dd	否	否	生效日期,非时间轴不填，时间轴为必填项；信息更正不可修改;新增,变更可以修改 示例：2024-05-01

## 3. 请求示例

Url: /yonbip/hrcloud/projectorgs/save?access_token=访问令牌
Body: {
	"data": {
		"id": "123",
		"vid": "123456",
		"name": "data",
		"code": "code",
		"shortname": "111",
		"project_id": "123456",
		"parentid": "3546464",
		"_status": "Insert",
		"principal": "123456",
		"starttime": "2024-05-01"
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	编码 示例：200表示成功
message	string	否	说明 示例：操作成功
data	object	否	返回数据
id	string	否	主键 示例：39398903
vid	string	否	时间轴id 示例：123456
code	string	否	团队编码 示例：123
name	string	否	团队名称 示例：93930
shortname	string	否	简称 示例：简称
enable	number
小数位数:0,最大长度:1	否	启用状态：1启用，2停用 示例：1
parentid	string	否	上级团队Id 示例：998837222223
parentid_name	string	否	上级团队名称 示例：name
project_id	string	否	项目id 示例：123456
project_id_name	string	否	项目名称 示例：AAA
principal	string	否	负责人id 示例：123456
principal_name	string	否	负责人 示例：小红
starttime	date
格式:yyyy-MM-dd	否	生效日期 示例：2024-05-01

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"id": "39398903",
		"vid": "123456",
		"code": "123",
		"name": "93930",
		"shortname": "简称",
		"enable": 1,
		"parentid": "998837222223",
		"parentid_name": "name",
		"project_id": "123456",
		"project_id_name": "AAA",
		"principal": "123456",
		"principal_name": "小红",
		"starttime": "2024-05-01"
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
999	请联系开发人员	

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

