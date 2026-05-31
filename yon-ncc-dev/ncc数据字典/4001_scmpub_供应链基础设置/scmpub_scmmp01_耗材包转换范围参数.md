# |<<

**耗材包转换范围参数 (scmpub_scmmp01 / nc.vo.scmpub.pub.Scmmp01VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5240.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scmmp01 | 主键 | pk_scmmp01 | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_422x | 物资需求申请 | bill_422x | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bill_20 | 请购单 | bill_20 | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bill_21 | 采购订单 | bill_21 | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bill_45 | 采购入库 | bill_45 | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bill_4a | 其他入库 | bill_4a | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bill_4455 | 出库申请 | bill_4455 | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bill_4k | 转库 | bill_4k | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bill_5a | 调入申请 | bill_5a | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bill_5x | 调拨订单 | bill_5x | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |