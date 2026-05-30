# |<<

**统计指标交易类型扩展 (nresa_inditranstype_h / nc.vo.mapub.indi.inditranstype.IndiTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3874.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inditranstype | 交易类型扩展主键 | pk_inditranstype | char(20) | √ | 主键 (UFID) |
| 2 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_inditemplate | 指标模板 | pk_inditemplate | varchar(20) |  | 指标模板 (IndiTemplate) |
| 6 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 7 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |