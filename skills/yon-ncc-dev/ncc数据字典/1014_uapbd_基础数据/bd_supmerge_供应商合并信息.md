# |<<

**供应商合并信息 (bd_supmerge / nc.vo.bd.supplier.merge.SupmergeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/976.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supmerge | 供应商合并信息主键 | pk_supmerge | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | pk_target | 目的供应商主键 | pk_target | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | pk_source | 源供应商主键 | pk_source | varchar(20) |  | 字符串 (String) |
| 6 | target_org | 目的供应商所属组织 | target_org | varchar(20) |  | 组织 (org) |
| 7 | target_code | 目的供应商编码 | target_code | varchar(40) |  | 字符串 (String) |
| 8 | target_name | 目的供应商名称 | target_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | source_code | 源供应商编码 | source_code | varchar(40) |  | 字符串 (String) |
| 10 | source_name | 源供应商名称 | source_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 11 | source_org | 源供应商所属组织 | source_org | varchar(20) |  | 组织 (org) |
| 12 | sourcesupplier | 源供应商信息 | sourcesupplier | image |  | BLOB (BLOB) |
| 13 | operator | 操作员 | operator | varchar(20) |  | 用户 (user) |
| 14 | operatetime | 操作时间 | operatetime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |