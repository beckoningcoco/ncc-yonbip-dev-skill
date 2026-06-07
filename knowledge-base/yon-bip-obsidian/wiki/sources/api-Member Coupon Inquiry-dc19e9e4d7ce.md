---
title: "会员优惠券查询"
apiId: "dc19e9e4d7ce4ec2af83847f0e54b3dd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Coupon"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Coupon]
platform_version: "BIP"
source_type: community-api-docs
---

# 会员优惠券查询

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/member/query
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
id	long	否	是	会员ID 示例：173663
filter	object	否	是	查询条件
weekDays	string	是	否	设置时间间隔按周指定(周一MONDAY;周二THURSDAY;周三WEDNESDAY;周四THURSDAY;周五FRIDAY;周六SATURDAY;周日SUNDAY) 示例：["FRIDAY","SATURDAY"]
timeDuration	object	是	否	指定时间段(卡券可用时段 如：8:00-20:00)
sortList	object	是	否	字段排序规则（name:排序字段，order:排序方式（desc:倒序，asc:正序））
pager	object	否	是	分页信息
status	int	是	否	卡券状态（ 0未使用 1 已使用 -1 已废弃 2 已过期）备注：status不传时只返回未使用的优惠券 示例：[1]
sn	string	否	否	卡券编码 示例：21111111111

## 3. 请求示例

Url: /yonbip/sd/coupon/member/query?access_token=访问令牌
Body: {
	"id": 173663,
	"filter": {
		"weekDays": [
			"FRIDAY",
			"SATURDAY"
		],
		"timeDuration": [
			{
				"fromTime": "16:00:00",
				"toTime": "20:00:00"
			}
		],
		"sortList": [
			{
				"name": "dReceiveDate",
				"order": "desc"
			}
		],
		"pager": {
			"pageIndex": 1,
			"pageSize": 1
		},
		"status": [
			1
		],
		"sn": "21111111111"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	是	数据对象
archiveId	string	否	卡券档案ID 示例：2437295532970752
backTime	string	否	返还时间
cancelTime	string	否	废弃时间
consumeTime	string	否	核销时间
counting	int	否	次数 示例：1
couponAllscope	string	否	适用范围(1:全部) 示例：1
couponExchangeRules	object	是	兑换规则
couponExcluesionList	object	是	互斥优惠券
couponScopeIds	string	否	适用商家ID
createTime	string	否	创建时间
decrease	BigDecimal	否	抵扣金额 示例：1
discount	BigDecimal	否	折扣
effectiveTime	string	否	生效时间 示例：2021-09-18 00:00:00
exceptionType	int	否	例外商品类型（0：无 3:商品 4:SKU ） 示例：0
exipireTime	string	否	失效时间 示例：2021-09-26 23:59:59
iUnlimitShop	string	否	是否限制商家(1：商家不限制0：商家限制 null:商家不限制) 示例：1
id	string	否	卡券ID 示例：15957792
member	boolean	否	是否是会员(true:是 false:否) 示例：true
name	string	否	卡券名称 示例：test
operatorId	string	否	操作人
ownerId	string	否	所属者ID(会员ID) 示例：2005347094417666
quota	BigDecimal	否	启用金额 示例：1
quotaScope	int	否	启用金额依据(1:适用商品金额 2：整单金额) 示例：1
receiveTime	string	否	领取时间 示例：2021-09-18T18:27:55
scopeLevel	string	否	卡券管理维度(0:平台 1：组织 2：商家)
scopeType	int	否	适用商品类型(1:全部 2:分类3:商品4:sku5:兑换规则) 示例：1
scopes	object	否	兑换券时, scopes 展示例外商品, couponExchangeRules展示兑换规则
sendTime	string	否	发放时间
shopOrOrg	string	否	适用范围(0：不限制1:商家2：组织) 示例：0
sn	string	否	sn码 示例：243729553297075281317631450383
sourceId	string	否	来源系统ID
sourceType	string	否	来源类型（0:U会员,1:u8,2:零售,3:u商城,4:CRM）
status	long	否	状态(-1：废弃0:未使用 1:使用 2：已过期) 示例：0
storeCodes	string	否	门店编码
storeIds	string	否	线下门店
storeOutCode	string	否	商家编码
syncWeChatCoupon	int	否	是否同步微信(0:否1是) 示例：0
ts	string	否	时间戳
type	int	否	卡券类型(1:代金券 2:折扣券5:计次卡6:兑换券7:运费券) 示例：1
typeName	string	否	卡券类型 示例：代金券

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"archiveId": "2437295532970752",
			"backTime": "",
			"cancelTime": "",
			"consumeTime": "",
			"counting": 1,
			"couponAllscope": "1",
			"couponExchangeRules": [
				{
					"scope": [
						{
							"extraCosts": "",
							"scopeId": "",
							"weekDays": [
								""
							],
							"couponQuantity": "",
							"goodsQuantity": "",
							"scopeSkuId": ""
						}
					]
				}
			],
			"couponExcluesionList": [
				{
					"name": "",
					"couponId": ""
				}
			],
			"couponScopeIds": "",
			"createTime": "",
			"decrease": 1,
			"discount": 0,
			"effectiveTime": "2021-09-18 00:00:00",
			"exceptionType": 0,
			"exipireTime": "2021-09-26 23:59:59",
			"iUnlimitShop": "1",
			"id": "15957792",
			"member": true,
			"name": "test",
			"operatorId": "",
			"ownerId": "2005347094417666",
			"quota": 1,
			"quotaScope": 1,
			"receiveTime": "2021-09-18T18:27:55",
			"scopeLevel": "",
			"scopeType": 1,
			"scopes": {
				"scopeException": [
					{
						"scopeSkuIdException": "",
						"scopeIdException": ""
					}
				]
			},
			"sendTime": "",
			"shopOrOrg": "0",
			"sn": "243729553297075281317631450383",
			"sourceId": "",
			"sourceType": "",
			"status": 0,
			"storeCodes": "",
			"storeIds": "",
			"storeOutCode": "",
			"syncWeChatCoupon": 0,
			"ts": "",
			"type": 1,
			"typeName": "代金券"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
404	未查询到数据	查询条件填写有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (12)
更新
返回参数 (54)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

