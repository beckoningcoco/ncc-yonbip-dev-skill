# |<<

**物料价格库 (mapub_materialpricebase / nc.vo.mapub.materialpricebase.entity.MaterialPriceBaseHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3593.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialpriceid | 物料价格库 | cmaterialpriceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vpricecode | 价格库编码 | vpricecode | varchar(200) |  | 字符串 (String) |
| 6 | vpricename | 价格库名称 | vpricename | varchar(50) |  | 字符串 (String) |
| 7 | ccrrencyid | 币种 | ccrrencyid | varchar(20) |  | 币种 (currtype) |
| 8 | vpricesourcenum | 价格来源数 | vpricesourcenum | varchar(1000) |  | 字符串 (String) |
| 9 | dbegindate | 生效日期 | dbegindate | char(19) |  | 日期 (UFDate) |
| 10 | denddate | 失效日期 | denddate | char(19) |  | 日期 (UFDate) |
| 11 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 12 | blockingflag | 锁定 | blockingflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |