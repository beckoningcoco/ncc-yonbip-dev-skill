---
title: "企业绩效组织体系-体系成员详情"
apiId: "1585730753694531588"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Organization System"
domain: "PF"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 企业绩效组织体系-体系成员详情

>  请求方式	GET | Organization System (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/epmorg/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
org_epm_organization_id	string	query	是	主体单元关系主键，可以通过 企业绩效组织体系-体系成员树 获取

## 3. 请求示例

Url: /yonbip/digitalModel/epmorg/detail?access_token=访问令牌&org_epm_organization_id=

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
code	string	否	请求状态码 示例：200
message	string	否	请求结果描述 示例：操作成功
data	object	否	主体单元数据
org_epm_organization_id	string	否	主体单元关系主键 示例：2435807102996736
id	string	否	主体单元成员主键 示例：2435806204645633
code	string	否	主体单元编码 示例：100003
name	muti_lang	否	主体单元名称，返回多个语种名称
shortcode	string	否	简码 示例：JM
shortname	string	否	简称 示例：简称
aggr	string	否	汇总属性 1加，0忽略，-1减 示例：1
currency	string	否	本位币主键 示例：2322393516396800
currency_code	string	否	本位币编码 示例：CNY
currency_name	string	否	本位币名称 示例：人民币
org_source	string	否	组织类型 0业务单元加部门，1会计主体，2部门，3成本中心，4虚组织，5销售区域，7业务单元，8虚节点，9审批汇报树 示例：0
groupcode	string	否	组编码 示例：#004
is_balance_unit	int	否	是否差额单位 0否，1是 示例：0
class_type_name	string	否	组织形态 示例：公司
org_form_name	string	否	部门性质 示例：公司
parent_id	string	否	父级主体单元关系主键 示例：2435806204645633
parent_name	string	否	父级主体单元成员名称 示例：用友
org_epm_systems_id	string	否	预算报表组织体系主键 示例：2333877929743616

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"org_epm_organization_id": "2435807102996736",
		"id": "2435806204645633",
		"code": "100003",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"shortcode": "JM",
		"shortname": "简称",
		"aggr": "1",
		"currency": "2322393516396800",
		"currency_code": "CNY",
		"currency_name": "人民币",
		"org_source": "0",
		"groupcode": "#004",
		"is_balance_unit": 0,
		"class_type_name": "公司",
		"org_form_name": "公司",
		"parent_id": "2435806204645633",
		"parent_name": "用友",
		"org_epm_systems_id": "2333877929743616"
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

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

