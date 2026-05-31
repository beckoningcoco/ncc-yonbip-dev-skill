# |<<

**人力资源管理_职务类别 (om_jobtype / nc.vo.org.JobTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobtype | 主键 | pk_jobtype | char(20) | √ | 主键 (UFID) |
| 2 | jobtypecode | 编码 | jobtypecode | varchar(50) | √ | 字符串 (String) |
| 3 | jobtypename | 名称 | jobtypename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | jobtypedesc | 职务类别概要 | jobtypedesc | varchar(1024) |  | 备注 (Memo) |
| 5 | father_pk | 上级职务类别 | father_pk | varchar(20) |  | 人力资源管理_职务类别 (jobtype) |
| 6 | pk_group | 所属集团 | pk_group | char(20) |  | 组织_集团 (group) |
| 7 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |