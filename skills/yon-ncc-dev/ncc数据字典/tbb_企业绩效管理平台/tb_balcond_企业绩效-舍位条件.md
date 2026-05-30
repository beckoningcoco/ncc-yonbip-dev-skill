# |<<

**企业绩效-舍位条件 (tb_balcond / nc.vo.tb.balcond.BalcondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5696.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancecond | 主键 | pk_balancecond | char(20) | √ | 主键 (UFID) |
| 2 | condname | 条件名称 | condname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | unitname | 计量单位 | unitname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | swbit | 舍位位数 | swbit | int |  | 整数 (Integer) |
| 5 | databit | 小数位位数 | databit | int |  | 整数 (Integer) |
| 6 | version | 数版本号 | version | int |  | 整数 (Integer) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |