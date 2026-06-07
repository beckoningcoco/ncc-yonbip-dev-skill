---
title: "出差申请单详情查询"
apiId: "d785d0ebb8274b10ae46532fe6595207"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Travel Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差申请单详情查询

>  请求方式	GET | Travel Request (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/znbz/rbsm/api/bill/busistrip/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。）
billNo	string	query	否	单据编号(单据id和单据编号二选一必填)

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/busistrip/detail?access_token=访问令牌&id=&billNo=

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
code	string	否	返回编码 示例：200
displayCode	string	否	异常码
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回数据
vhandledeptid	string	否	申请人部门ID 示例：1961983235248384
chandleorg	string	否	申请人组织ID 示例：1961970750984448
returncount	long	否	退回次数 示例：0
verifystate	long	否	审批状态(0:初始开立;1:审批中;2:审批完成;3:不通过流程终止;4:驳回到制单) 示例：1
code	string	否	单据号 示例：0589
napplymny	BigDecimal	否	申请金额 示例：10000
masterOrgKeyField	string	否	主组织字段 示例：cfinaceorg
pk_handlepsn_name	string	否	申请人姓名 引用：员工(新)StaffNew 示例：刘睿琪
bustype_name	string	否	交易类型名称 示例：出差申请单-1
dapplydate	string	否	申请日期 示例：2020-12-15 00:00:00
creatorId	long	否	创建人 示例：1951632935211264
MemoapplyBVO	object	是	事项申请单子表集合
chandleorg_name	string	否	申请人组织名称 示例：福建中烟工业有限责任公司
isloanfinished	boolean	否	是否借款参照完成(true:已完成;false:未完成) 示例：false
vouchdate	string	否	单据日期 示例：2020-12-15 00:00:00
isusebody	boolean	否	是否启用表体明细(true:启用;false:未启用) 示例：true
cfinaceorg	string	否	费用承担组织ID 示例：1961970750984448
denddate	string	否	出差截止日期 示例：2020-12-24 00:00:00
isendbtrstype	long	否	传商旅方式 示例：0
ismulticurrency	boolean	否	是否多币种(true:是;false:不是) 示例：false
id	long	否	单据ID 示例：2044913734209792
pubts	string	否	时间戳 示例：2021-07-19 12:21:45
vreason	string	否	出差事由 示例：hgs测试
isclose	boolean	否	是否关闭(true:已关闭;false:未关闭) 示例：false
createDate	string	否	创建日期 示例：2020-12-15 00:00:00
vfinacedeptid_name	string	否	费用承担部门名称 示例：烟叶一科-福建中烟
vattachmentass	string	否	单据附件id 示例：c49pMrCkHYETZmAM6tpMCZfSz6rw2QFC
creator	string	否	创建人名称 示例：19904568888
isWfControlled	boolean	否	是否审批流控制(true:是;false:不是) 示例：true
vfinacedeptid	string	否	费用承担部门ID 示例：1961983235248384
isfinished	boolean	否	是否结束(true:结束;false:未结束) 示例：false
dcostdate	string	否	发生日期 示例：2020-12-15 00:00:00
transTypeKeyField	string	否	交易类型字段 示例：bustype
bustype	string	否	交易类型 示例：1990931237671168
vapplyname	string	否	申请名称 示例：(北京市-杭州市)hgs测试
cfinaceorg_name	string	否	费用承担组织 示例：福建中烟工业有限责任公司
createTime	string	否	创建时间 示例：2020-12-15 13:53:49
dbegindate	string	否	出差起始日期 示例：2020-12-16 00:00:00
vhandledeptid_name	string	否	申请人部门 示例：烟叶一科-福建中烟
pk_handlepsn	string	否	申请人 示例：1996658905977088
pk_billtype	string	否	单据类型 示例：znbzbx_busistrip
status	long	否	单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "1961983235248384",
		"chandleorg": "1961970750984448",
		"returncount": 0,
		"verifystate": 1,
		"code": "0589",
		"napplymny": 10000,
		"masterOrgKeyField": "cfinaceorg",
		"pk_handlepsn_name": "刘睿琪",
		"bustype_name": "出差申请单-1",
		"dapplydate": "2020-12-15 00:00:00",
		"creatorId": 1951632935211264,
		"MemoapplyBVO": [
			{
				"vhandledeptid": "1961983235248384",
				"chandleorg": "1961970750984448",
				"pk_busimemo_name": "差旅费有申请",
				"pk_busimemotype_name": "差旅类",
				"napplymny": 10000,
				"pk_handlepsn_name": "刘睿琪",
				"pk_endaddr_name": "杭州市",
				"chandleorg_name": "福建中烟工业有限责任公司",
				"pk_endaddr": "c14ff7f8-5cf3-11e9-817e-7cd30abea0c0",
				"pk_busimemotype": 1989855665315328,
				"isloanfinished": false,
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"cfinaceorg": "1961970750984448",
				"denddate": "2020-12-24 00:00:00",
				"id": 2044913734209793,
				"isclose": false,
				"vfinacedeptid_name": "烟叶一科-福建中烟",
				"vfinacedeptid": "1961983235248384",
				"isfinished": false,
				"pk_busimemo": 1989858063179264,
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"pk_memoapply": 2044913734209792,
				"dbegindate": "2020-12-16 00:00:00",
				"vhandledeptid_name": "烟叶一科-福建中烟",
				"pk_begaddr_name": "北京市",
				"pk_handlepsn": "1996658905977088"
			}
		],
		"chandleorg_name": "福建中烟工业有限责任公司",
		"isloanfinished": false,
		"vouchdate": "2020-12-15 00:00:00",
		"isusebody": true,
		"cfinaceorg": "1961970750984448",
		"denddate": "2020-12-24 00:00:00",
		"isendbtrstype": 0,
		"ismulticurrency": false,
		"id": 2044913734209792,
		"pubts": "2021-07-19 12:21:45",
		"vreason": "hgs测试",
		"isclose": false,
		"createDate": "2020-12-15 00:00:00",
		"vfinacedeptid_name": "烟叶一科-福建中烟",
		"vattachmentass": "c49pMrCkHYETZmAM6tpMCZfSz6rw2QFC",
		"creator": "19904568888",
		"isWfControlled": true,
		"vfinacedeptid": "1961983235248384",
		"isfinished": false,
		"dcostdate": "2020-12-15 00:00:00",
		"transTypeKeyField": "bustype",
		"bustype": "1990931237671168",
		"vapplyname": "(北京市-杭州市)hgs测试",
		"cfinaceorg_name": "福建中烟工业有限责任公司",
		"createTime": "2020-12-15 13:53:49",
		"dbegindate": "2020-12-16 00:00:00",
		"vhandledeptid_name": "烟叶一科-福建中烟",
		"pk_handlepsn": "1996658905977088",
		"pk_billtype": "znbzbx_busistrip",
		"status": 3
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1021000999999	服务器异常	请联系系统管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-25	
更新
返回参数 verifystate
重新发布
	2	2025-07-11	
新增
返回参数 displayCode

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

