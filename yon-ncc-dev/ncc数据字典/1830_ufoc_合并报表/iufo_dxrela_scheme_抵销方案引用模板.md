# |<<

**抵销方案引用模板 (iufo_dxrela_scheme / nc.vo.hbbb.dxscheme.DXRelaInSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3425.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rela_scheme | 主键 | pk_rela_scheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_dxscheme | 抵销方案 | pk_dxscheme | varchar(20) |  | 抵销方案 (dxscheme) |
| 3 | pk_relation | 模板主键 | pk_relation | varchar(20) |  | 调整及抵销模板 (dxrelation) |
| 4 | type | 模板类别 | type | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |