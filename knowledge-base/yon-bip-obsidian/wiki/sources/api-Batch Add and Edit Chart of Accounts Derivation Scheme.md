---
title: "科目表派生方案批量新增编辑"
apiId: "2145360139057102853"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Chart of Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Chart of Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目表派生方案批量新增编辑

> `ContentType	application/json` 请求方式	POST | 分类: Chart of Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/openapi/subjectchartcontrol/schema/saveorupdate

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| data | object | 是 | 是 | 科目表派生方案参数集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 方案编码 示例：apiSchme |
| name | object | 否 | 是 | 方案名称 |
| accsubjectchartCode | string | 否 | 是 | 所属科目表编码 示例：chartCtrlApi |
| objid | string | 否 | 是 | 外部同步派生方案objid，根据是否存在相同objid判断是新增还是更新（长度不超36位） 示例：apiSchme |
| sourceUnique | string | 否 | 是 | 来源系统唯一标识（=objid） 示例：apiSchme |
| controlrange | string | 否 | 否 | 派生范围。1，全部派生；2，部分派生 示例：2 默认值：2 |
| controlstyle | string | 否 | 否 | 管控方式。1：严格管控；2：允许末级科目添加下级；3：无管控限制；4：自定义管控；5：管控至科目层级； 示例：3 默认值：3 |
| attrCtrlDimExt | string | 否 | 否 | 辅助核算项属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| attrCtrlDeficitCheck | string | 否 | 否 | 余额赤字检查属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| attrCtrlNumCheck | string | 否 | 否 | 数量核算属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| attrCtrlMeasureDoc | string | 否 | 否 | 默认计量单位属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| attrCtrlHasNum | string | 否 | 否 | 数量必填属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| attrCtrlExtendService | string | 否 | 否 | 受控应用属性控制。1：严格控制；2：部分控制；3：不控制 示例：3 默认值：3 |
| shemecharts | object | 是 | 否 | 派生科目表信息 |

## 3. 请求示例

Url: /yonbip/AMP/openapi/subjectchartcontrol/schema/saveorupdate?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"code": "apiSchme",
			"name": {
				"zh_CN": "apiSchme"
			},
			"accsubjectchartCode": "chartCtrlApi",
			"objid": "apiSchme",
			"sourceUnique": "apiSchme",
			"controlrange": "2",
			"controlstyle": "3",
			"attrCtrlDimExt": "3",
			"attrCtrlDeficitCheck": "3",
			"attrCtrlNumCheck": "3",
			"attrCtrlMeasureDoc": "3",
			"attrCtrlHasNum": "3",
			"attrCtrlExtendService": "3",
			"shemecharts": [
				{
					"accentity": "100001",
					"code": "chartCtrlApi-01",
					"name": {
						"zh_CN": "chartCtrlApi-01"
					},
					"objid": "chartCtrlApi-01"
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 返回数据结果 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 操作总数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 操作失败数 示例：1 |
| infos | object | 是 | 操作成功数据信息集合。没有成功数据返回空集合 |
| messages | object | 是 | 操作失败数据信息集合。没有失败数据返回空集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"infos": [
			{
				"data": {
					"id": "2144789595501363205",
					"code": "apiSchme",
					"name": {
						"zh_CN": "apiSchme"
					},
					"objid": "apiSchme",
					"accsubjectchart": "200001",
					"sourceUnique": "apiSchme",
					"targetUnique": "2144789595501363205",
					"shemecharts": [
						{
							"id": "1234567543212345",
							"accentity": "100001",
							"code": "chartCtrlApi-01",
							"name": {
								"zh_CN": "chartCtrlApi-01"
							},
							"objid": "chartCtrlApi-01"
						}
					]
				}
			}
		],
		"messages": [
			{
				"code": "apiSchme02",
				"name": {
					"zh_CN": "apiSchme02"
				},
				"accsubjectchartCode": "testChart02",
				"objid": "apiSchme02",
				"sourceUnique": "chartCtrlApi-02",
				"shemecharts": [
					{
						"accentity": "100002",
						"code": "chartCtrlApi-02",
						"name": {
							"zh_CN": "chartCtrlApi-02"
						},
						"objid": "chartCtrlApi-02"
					}
				],
				"message": "派生方案所属科目表[testChart02]不存在！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	科目表派生方案objid不能为空！	派生方案外部同步数据objid必填，不能传空值


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

