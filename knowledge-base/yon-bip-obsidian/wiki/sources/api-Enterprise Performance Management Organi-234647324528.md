---
title: "企业绩效组织体系-成员新增V2"
apiId: "2346473245287907335"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Organization System"
domain: "PF"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 企业绩效组织体系-成员新增V2

>  请求方式	POST | Organization System (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PFC/epmorg/save
请求方式	POST
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
Body参数
名称	类型	数组	必填	描述
billnum	string	否	是	单据编码 示例：org_epmorgitem 默认值：org_epmorgitem
data	object	否	是	插入的数据集
code	string	否	是	主体单元编码 示例：12345
name	object	否	是	主体单元名称
shortcode	string	否	否	简码 示例：我是简码
shortname	string	否	否	简称 示例：我是简称
parent	string	否	否	父节点id(可从企业绩效组织体系-体系成员树 中获取，可不填) 示例：1760005923670065153
parent_name	string	否	否	父节点名称 示例：我是父亲
physical_org	string	否	否	对应实体组织id(可从企业绩效组织体系-体系成员树 中获取，可不填) 示例：1760005932259999747
physical_org_name	string	否	否	对应实体组织名称 示例：我是实体组织
aggr	string	否	是	汇总属性（汇总属性范围：-1/0/1,其中： "-1": "减", "0": "忽略", "1": "加"） 示例：0 默认值：0
currency	string	否	否	币种id 示例：1749840182749167645
currency_code	string	否	否	币种编码 示例：CNY
currency_name	string	否	否	币种名称 示例：人民币
org_source	string	否	是	组织类型；组织类型为必填项，新增虚组织，组织类型默认为4 示例：4 默认值：4
groupcode	string	否	否	组编码，组编码必须以#开头 示例：#erer
is_banlance_unit	boolean	否	否	是否差额单位 示例：false 默认值：false
org_form	string	否	否	部门性质id 示例：1752734423795630082
org_form_name	string	否	否	部门性质名称 示例：销售部门
_status	string	否	是	状态；新增时状态默认为“Insert” 示例：Insert 默认值：Insert
org_epm_systems_id	string	否	是	体系id(可从企业绩效组织体系-体系树 中获取) 示例：1760005923670065153
selectDate	Date	否	是	新增日期 示例：2023-08-08
enable	string	否	否	启用状态(Y:启用；N:停用) 示例：Y 默认值：Y

## 3. 请求示例

Url: /yonbip/PFC/epmorg/save?access_token=访问令牌
Body: {
	"billnum": "org_epmorgitem",
	"data": {
		"code": "12345",
		"name": {
			"zh_CN": "组织名称",
			"en_US": "english",
			"zh_TW": "繁体"
		},
		"shortcode": "我是简码",
		"shortname": "我是简称",
		"parent": "1760005923670065153",
		"parent_name": "我是父亲",
		"physical_org": "1760005932259999747",
		"physical_org_name": "我是实体组织",
		"aggr": "0",
		"currency": "1749840182749167645",
		"currency_code": "CNY",
		"currency_name": "人民币",
		"org_source": "4",
		"groupcode": "#erer",
		"is_banlance_unit": false,
		"org_form": "1752734423795630082",
		"org_form_name": "销售部门",
		"_status": "Insert",
		"org_epm_systems_id": "1760005923670065153",
		"selectDate": "2023-08-08",
		"enable": "Y"
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
code	string	否	成功状态码 示例：200
message	string	否	描述信息 示例：操作成功
data	object	否	返回结果集
code	string	否	成员编码 示例：yonyou
name	object	否	成员名称
aggr	string	否	汇总属性 示例：1
creationtime	DateTime	否	时间 示例：2023-08-03 17:19:28
creator	string	否	创建者 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
creator_userName	string	否	创建者用户名 示例：测试管理员111
currency	string	否	币种 示例：1681603975633698821
currency_code	string	否	币种编码 示例：CNY
currency_name	string	否	币种名称 示例：人名币
dr	string	否	删除标识 示例：0
enable	string	否	启用状态 示例：Y
groupcode	string	否	组编码 示例：#7
is_banlance_unit	string	否	是否差额单位 示例：false
org_epm_systems_id	string	否	emp组织体系id 示例：1539024272724852740
org_form	string	否	部门性质 示例：1661435831408132103
org_form_name	string	否	部门性质名称 示例：222333
org_source	string	否	组织类型 示例：4
parent	string	否	父节点 示例：1732759887911321601
parent_name	string	否	父节点名称 示例：test05241
physical_org	string	否	对应实体组织 示例：1780090625156710415
physical_org_name	string	否	对应实体组织名称 示例：0726
selectDate	Date	否	插入日期 示例：2023-08-03
shortcode	string	否	简码 示例：002
shortname	string	否	简称 示例：org
sysid	string	否	系统标识 示例：diwork
id	string	否	id 示例：2346468331772444680

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "yonyou",
		"name": {
			"zh_CN": "中文名",
			"en_US": "成员英文",
			"zh_TW": "繁体"
		},
		"aggr": "1",
		"creationtime": "2023-08-03 17:19:28",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"creator_userName": "测试管理员111",
		"currency": "1681603975633698821",
		"currency_code": "CNY",
		"currency_name": "人名币",
		"dr": "0",
		"enable": "Y",
		"groupcode": "#7",
		"is_banlance_unit": "false",
		"org_epm_systems_id": "1539024272724852740",
		"org_form": "1661435831408132103",
		"org_form_name": "222333",
		"org_source": "4",
		"parent": "1732759887911321601",
		"parent_name": "test05241",
		"physical_org": "1780090625156710415",
		"physical_org_name": "0726",
		"selectDate": "2023-08-03",
		"shortcode": "002",
		"shortname": "org",
		"sysid": "diwork",
		"id": "2346468331772444680"
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

