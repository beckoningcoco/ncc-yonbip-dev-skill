# |<<

**医嘱项目字典 (bd_item / nc.vo.nhbd.bditem.BDItemVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | 主键 | pk_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_psn_phy | 医生工号 | pk_psn_phy | varchar(20) |  | 字符串 (String) |
| 5 | pk_srv | 项目主键 | pk_srv | varchar(20) |  | 字符串 (String) |
| 6 | cost_time | 花费时间 | cost_time | int |  | 整数 (Integer) |
| 7 | dt_type_item | 类型dt | dt_type_item | varchar(20) |  | 字符串 (String) |
| 8 | pk_type_item | 类型pk | pk_type_item | varchar(20) |  | 字符串 (String) |
| 9 | note | 备注 | note | varchar(400) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |