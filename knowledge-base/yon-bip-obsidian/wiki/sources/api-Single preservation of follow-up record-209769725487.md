---
title: "跟进记录单个保存"
apiId: "2097697254879002625"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Follow-up Record"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Follow-up Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟进记录单个保存

>  请求方式	POST | Follow-up Record (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/followupsave
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
bustype	string	否	否	交易类型 示例：1981914333946314761
bustype_code	string	否	否	交易类型编码 示例：11
id	string	否	否	跟进记录单据id 示例：3458687988
followContext	string	否	是	跟进内容 示例：12121
code	string	否	是	跟进记录编码 示例：20240927001947
followTime	string	否	是	跟进日期 示例：2024-09-26 00:00:00
followMethodDoc	string	否	否	跟进方式ID
followMethodDoc_code	string	否	否	跟进方式编码
clue	string	否	否	线索ID 示例：1873865223209746438
clue_code	string	否	否	线索编码 示例：20231130000001
customer	string	否	否	客户ID 示例：2037705795915218951
customer_code	string	否	否	客户编码 示例：BIPZK000105
opptReport	string	否	否	商机报备ID 示例：2068860938947657734
opptReport_code	string	否	否	商机报备编码 示例：20240819000711
dept	string	否	否	部门 示例：1873791092092043270
oppt	string	否	否	商机ID 示例：2091952418294071303
dept_code	string	否	否	部门编码
oppt_code	string	否	否	商机编码 示例：20240919000774
creatorId	string	否	否	创建人ID 示例：1873799286880731136
contractDraft	string	否	否	合同草案ID 示例：2024427174400360457
contractDraft_code	string	否	否	合同草案编码
org	string	否	是	组织 示例：2003546520857608202
org_code	string	否	否	组织编码 示例：CONTACT001
saleArea	string	否	否	销售区域 示例：2002120677626740745
saleArea_code	string	否	否	销售区域编码 示例：zyy
ower	string	否	否	负责人 示例：1873799286893314056
ower_code	string	否	否	负责人编码 示例：0001
creator	string	否	否	创建人 示例：昵称-李亚苹111
followUpContextRichText	string	否	否	下次跟进内容
createTime	string	否	否	创建时间 示例：2024-09-27 09:15:20
contact	string	否	否	联系人
motion	string	否	否	关联动作
_status	string	否	是	单据状态 示例：Insert
opptStage	string	否	否	关联阶段id 示例：32486596799
followContactList	object	是	否	联系人子表集合（对应联系人多选）
followMotionList	object	是	否	关联动作集合(对应跟进动作多选)
followNextContactList	object	是	否	下次联系人
systemSource	string	否	否	OPENAPI标识 示例：followupOpenAPIAdd

## 3. 请求示例

Url: /yonbip/crm/bill/followupsave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"bustype": "1981914333946314761",
		"bustype_code": "11",
		"id": "3458687988",
		"followContext": "12121",
		"code": "20240927001947",
		"followTime": "2024-09-26 00:00:00",
		"followMethodDoc": "",
		"followMethodDoc_code": "",
		"clue": "1873865223209746438",
		"clue_code": "20231130000001",
		"customer": "2037705795915218951",
		"customer_code": "BIPZK000105",
		"opptReport": "2068860938947657734",
		"opptReport_code": "20240819000711",
		"dept": "1873791092092043270",
		"oppt": "2091952418294071303",
		"dept_code": "",
		"oppt_code": "20240919000774",
		"creatorId": "1873799286880731136",
		"contractDraft": "2024427174400360457",
		"contractDraft_code": "",
		"org": "2003546520857608202",
		"org_code": "CONTACT001",
		"saleArea": "2002120677626740745",
		"saleArea_code": "zyy",
		"ower": "1873799286893314056",
		"ower_code": "0001",
		"creator": "昵称-李亚苹111",
		"followUpContextRichText": "",
		"createTime": "2024-09-27 09:15:20",
		"contact": "",
		"motion": "",
		"_status": "Insert",
		"opptStage": "32486596799",
		"followContactList": [
			{
				"id": "",
				"contact": "226476587",
				"_status": "Insert"
			}
		],
		"followMotionList": [
			{
				"id": "",
				"motion": "23547657555",
				"_status": "Insert"
			}
		],
		"followNextContactList": [
			{
				"id": "",
				"contact": "226476587",
				"_status": "Insert"
			}
		]
	},
	"systemSource": "followupOpenAPIAdd"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:10	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
bustype	string	否	交易类型 示例：1981914333946314761
bustype_code	string	否	交易类型编码 示例：11
bustype_name	string	否	交易类型名称 示例：投标测算审批
followContext	string	否	跟进内容 示例：12121
followContextRichText	string	否	跟进内容富文本框 示例：<div class="mdf_rich_text" forprinttag="true"><div>12121</div></div>
code	string	否	跟进记录编码 示例：20240927001947
followTime	string	否	跟进日期 示例：2024-09-26 00:00:00
followMethodDoc	string	否	跟进方式 示例：1869243606466822260
followMethodDoc_code	string	否	跟进方式编码 示例：other
followMethodDoc_name	string	否	跟进方式名称 示例：其他
followUpMethod	string	否	跟进方式 示例：4
clue	string	否	线索 示例：1873865223209746438
clue_code	string	否	线索编码 示例：20231130000001
clue_name	string	否	线索名称 示例：lyp线索01
followUpContext	string	否	下次跟进内容 示例：xiacigenjin
customer	string	否	客户 示例：2037705795915218951
merchantAppliedDetail_isPotential	boolean	否	潜在客户 示例：false
opptReport	string	否	商机报备 示例：2068860938947657734
opptReport_code	string	否	商机报备编码 示例：20240819000711
opptStage_code	string	否	商机阶段编码 示例：SJJD001
customer_name	string	否	客户名称 示例：zlq0708daily-200
opptReport_name	string	否	商机报备 示例：报备0819-207
customerIndustry	string	否	行业 示例：1921756419275620353
followUpContextRichText	string	否	下次跟进富文本框格式 示例：<div class="mdf_rich_text" forprinttag="true"><div>xiacigenjin</div></div>
customerIndustry_Name	string	否	行业名称 示例：11
dept_name	string	否	部门名称 示例：销管一部
oppt	string	否	商机 示例：2091952418294071303
creatorId	string	否	创建人ID 示例：1873799286880731136
oppt_code	string	否	商机编码 示例：20240919000774
oppt_name	string	否	商机名称 示例：销售组织
process	string	否	商机流程阶段 示例：2013084758469771273
contractDraft	string	否	合同草案ID 示例：2024427174400360457
contractDraft_name	string	否	合同草案 示例：1111
opptStage	string	否	商机阶段 示例：1869243597876888647
opptStage_name	string	否	商机阶段 示例：挖掘商机
processStage	string	否	商机流程阶段 示例：2013084758469771274
org	string	否	组织 示例：2003546520857608202
org_name	string	否	组织名称 示例：联系组织
org_code	string	否	组织编码 示例：CONTACT001
saleArea	string	否	销售区域 示例：2002120677626740745
saleArea_code	string	否	销售区域编码 示例：zyy
saleArea_name	string	否	销售区域名称 示例：zyy
dept	string	否	部门 示例：1873791092092043270
dept_code	string	否	部门编码 示例：XG01
cust	string	否	客户 示例：2037705795915218951
cust_code	string	否	客户编码 示例：BIPZK000105
cust_name	string	否	客户名称 示例：zlq0708daily-200
ower	string	否	负责人ID 示例：1873799286893314056
ower_name	string	否	负责人名称 示例：李亚苹
creator	string	否	创建人 示例：昵称-李亚苹111
ower_code	string	否	负责人编码 示例：0001
createTime	string	否	创建时间 示例：2024-09-27 09:15:20
customer_code	string	否	客户编码 示例：BIPZK000105
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
isWfControlled	boolean	否	是否审批流控制 示例：false
id	string	否	单据ID 示例：2097659622360350723
finishedcondition	number
小数位数:0,最大长度:10	否	完成条件 示例：0
createDate	string	否	创建日期 示例：2024-09-27 09:15:20
pubts	string	否	时间戳 示例：2024-09-27 09:15:22
tenant	number
小数位数:0,最大长度:16	否	租户 示例：3565297349284304
ytenant	string	否	租户 示例：0000LPC9GERU37IUX00000
yTenantId	string	否	租户 示例：0000LPC9GERU37IUX00000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"bustype": "1981914333946314761",
		"bustype_code": "11",
		"bustype_name": "投标测算审批",
		"followContext": "12121",
		"followContextRichText": "<div class=\"mdf_rich_text\" forprinttag=\"true\"><div>12121</div></div>",
		"code": "20240927001947",
		"followTime": "2024-09-26 00:00:00",
		"followMethodDoc": "1869243606466822260",
		"followMethodDoc_code": "other",
		"followMethodDoc_name": "其他",
		"followUpMethod": "4",
		"clue": "1873865223209746438",
		"clue_code": "20231130000001",
		"clue_name": "lyp线索01",
		"followUpContext": "xiacigenjin",
		"customer": "2037705795915218951",
		"merchantAppliedDetail_isPotential": false,
		"opptReport": "2068860938947657734",
		"opptReport_code": "20240819000711",
		"opptStage_code": "SJJD001",
		"customer_name": "zlq0708daily-200",
		"opptReport_name": "报备0819-207",
		"customerIndustry": "1921756419275620353",
		"followUpContextRichText": "<div class=\"mdf_rich_text\" forprinttag=\"true\"><div>xiacigenjin</div></div>",
		"customerIndustry_Name": "11",
		"dept_name": "销管一部",
		"oppt": "2091952418294071303",
		"creatorId": "1873799286880731136",
		"oppt_code": "20240919000774",
		"oppt_name": "销售组织",
		"process": "2013084758469771273",
		"contractDraft": "2024427174400360457",
		"contractDraft_name": "1111",
		"opptStage": "1869243597876888647",
		"opptStage_name": "挖掘商机",
		"processStage": "2013084758469771274",
		"org": "2003546520857608202",
		"org_name": "联系组织",
		"org_code": "CONTACT001",
		"saleArea": "2002120677626740745",
		"saleArea_code": "zyy",
		"saleArea_name": "zyy",
		"dept": "1873791092092043270",
		"dept_code": "XG01",
		"cust": "2037705795915218951",
		"cust_code": "BIPZK000105",
		"cust_name": "zlq0708daily-200",
		"ower": "1873799286893314056",
		"ower_name": "李亚苹",
		"creator": "昵称-李亚苹111",
		"ower_code": "0001",
		"createTime": "2024-09-27 09:15:20",
		"customer_code": "BIPZK000105",
		"verifystate": 0,
		"isWfControlled": false,
		"id": "2097659622360350723",
		"finishedcondition": 0,
		"createDate": "2024-09-27 09:15:20",
		"pubts": "2024-09-27 09:15:22",
		"tenant": 3565297349284304,
		"ytenant": "0000LPC9GERU37IUX00000",
		"yTenantId": "0000LPC9GERU37IUX00000"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-18	
更新
请求说明
新增
请求参数 (4)
	2	2025-08-28	
更新
请求说明
新增
请求参数 (12)
更新
请求参数 systemSource

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

