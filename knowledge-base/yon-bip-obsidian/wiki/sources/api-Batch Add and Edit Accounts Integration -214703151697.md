---
title: "会计科目批量新增编辑集成API"
apiId: "2147031516975726592"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计科目批量新增编辑集成API

>  请求方式	POST | Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/AMP/integrate/accsubject/batchsave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	会计科目参数集合
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	科目id（新增时不传，编辑时必传） 示例：E59AB3C3-8358-4B40-8018-C6DC62DF5F39
code	string	否	是	科目编码 示例：111
name	string	否	是	科目名称中文 示例：1111
name2	string	否	否	科目名称英文
name3	string	否	否	科目名称繁体
direction	string	否	是	余额方向（借:Debit;贷:Credit） 示例：Credit
deficitcheckstrategy	string	否	是	余额赤字检查（不检查:NoCheck;警告:Warning;错误:Error） 示例：NoCheck
cashCategory	string	否	是	现金分类（现金:Cash;银行:Bank;现金等价物:CashEquivalent;其他:Other） 示例：Cash
numcheck	boolean	否	否	数量核算 示例：true
measuredoc	object	否	否	默认计量单位
currency	object	否	否	币种
accproperty	object	否	是	会计要素
vr23	boolean	否	否	辅助核算编码（vr1...vr100） 示例：true
proplist	object	是	否	辅助核算控制
accsubjectchart	string	否	是	科目表主键 示例：03087A28-D983-43D3-8779-7449AA87C3FA
settlementmode	boolean	否	否	结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true
billtime	boolean	否	否	银行对账时间结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true
billno	boolean	否	否	银行对账码结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true
bankverifycode	boolean	否	否	银行对账结算方式(现金分类为银行时可传值，现金分类不为银行时不传值) 示例：true
parent	string	否	否	上级会计科目id
objid	string	否	是	外部系统同步数据objid 示例：111111
sourceUnique	string	否	是	来源系统唯一标识（=objid） 示例：111111
enabled	boolean	否	否	是否启用（true：启用；false：停用。新增不传默认启用） 示例：true

## 3. 请求示例

Url: /yonbip/AMP/integrate/accsubject/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "E59AB3C3-8358-4B40-8018-C6DC62DF5F39",
			"code": "111",
			"name": "1111",
			"name2": "",
			"name3": "",
			"direction": "Credit",
			"deficitcheckstrategy": "NoCheck",
			"cashCategory": "Cash",
			"numcheck": true,
			"measuredoc": {
				"id": "1914762922856704",
				"code": "111"
			},
			"currency": {
				"id": "1887942111187462",
				"code": "BMD"
			},
			"accproperty": {
				"id": "1a46d69f-bab3-11ea-b73a-060cee0005d2",
				"code": "05"
			},
			"vr23": true,
			"proplist": [
				{
					"vrs": "vr1",
					"propkey": "allowempty",
					"propvalue": "1"
				}
			],
			"accsubjectchart": "03087A28-D983-43D3-8779-7449AA87C3FA",
			"settlementmode": true,
			"billtime": true,
			"billno": true,
			"bankverifycode": true,
			"parent": "",
			"objid": "111111",
			"sourceUnique": "111111",
			"enabled": true
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
code	string	否	返回状态编码 示例：200
message	string	否	返回信息
data	object	否	返回数据
count	int	否	该次同步数量 示例：2
sucessCount	int	否	该次同步成功数量 示例：1
failCount	int	否	该次同步失败数量 示例：1
messages	object	是	同步失败数据信息
infos	object	是	同步成功数据信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "222222",
				"objid": "222222",
				"message": "未查询到科目表"
			}
		],
		"infos": [
			{
				"data": {
					"code": "111",
					"name": "111",
					"id": "111",
					"objid": "111111",
					"sourceUnique": "111111",
					"targetUnique": "111"
				}
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
999	传参data不能为空！	请求body传参data是必填项集合，且data中至少要有一个科目参数

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

