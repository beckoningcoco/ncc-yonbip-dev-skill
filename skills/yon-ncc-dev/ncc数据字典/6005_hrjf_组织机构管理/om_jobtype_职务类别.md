# |<<

**职务类别 (om_jobtype / nc.vo.om.job.JobTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobtype | 职务类别主键 | pk_jobtype | char(20) | √ | 主键 (UFID) |
| 2 | jobtypecode | 职务类别编码 | jobtypecode | varchar(28) |  | 字符串 (String) |
| 3 | jobtypename | 职务类别名称 | jobtypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | jobtypedesc | 职务类别概要/描述 | jobtypedesc | varchar(1024) |  | 备注 (Memo) |
| 5 | father_pk | 父职务类别 | father_pk | varchar(20) |  | 职务类别 (jobtype) |
| 6 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | type_level | 层级 | type_level | int |  | 整数 (Integer) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_grade_source | 职级来源old | pk_grade_source | char(20) |  | 主键 (UFID) |
| 10 | pk_group | pk_group | pk_group | char(20) |  | 主键 (UFID) |
| 11 | pvtjobgrade | 自建职级 | pvtjobgrade | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 13 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |