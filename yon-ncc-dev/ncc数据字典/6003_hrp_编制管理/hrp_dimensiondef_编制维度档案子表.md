# |<<

**编制维度档案子表 (hrp_dimensiondef / nc.vo.hrp.budgetdimensiondoc.DimensionDefDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2737.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimensiondef | 维度子表主键 | pk_dimensiondef | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimension | 编制维度主键 | pk_dimension | char(20) |  | 主键 (UFID) |
| 3 | dimensiondef_code | 编码 | dimensiondef_code | varchar(28) | √ | 字符串 (String) |
| 4 | dimensiondef_name | 名称 | dimensiondef_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | stat_condition_sql | 条件定义sql | stat_condition_sql | varchar(3000) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |