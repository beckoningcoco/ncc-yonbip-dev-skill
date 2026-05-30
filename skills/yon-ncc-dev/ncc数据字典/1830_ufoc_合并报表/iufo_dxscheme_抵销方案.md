# |<<

**抵销方案 (iufo_dxscheme / nc.vo.hbbb.dxscheme.DXSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxscheme | 抵销方案主键 | pk_dxscheme | char(20) | √ | 主键 (UFID) |
| 2 | code | 抵销方案编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 抵销方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | parent_id | 所属分类 | parent_id | varchar(20) |  | 抵销方案分类 (dxssort) |
| 8 | isaddvouch | 允许下级增加抵销分录 | isaddvouch | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |