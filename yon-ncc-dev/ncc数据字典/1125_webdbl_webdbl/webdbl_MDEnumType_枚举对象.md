# |<<

**枚举对象 (webdbl_MDEnumType / uap.lfw.md.vo.MDEnumTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enumtype | 主键 | pk_enumtype | char(20) | √ | 主键 (UFID) |
| 2 | enumtypecode | 枚举名称 | enumtypecode | varchar(50) |  | 字符串 (String) |
| 3 | enumtypename | 显示名 | enumtypename | varchar(50) |  | 字符串 (String) |
| 4 | enumtable | 默认表名 | enumtable | varchar(50) |  | 字符串 (String) |
| 5 | returntype | 返回类型 | returntype | varchar(50) |  | 字符串 (String) |
| 6 | pk_md | 元数据主键 | pk_md | char(50) |  | 主键 (UFID) |
| 7 | pk_commonobject | 公共对象主键 | pk_commonobject | char(50) |  | 主键 (UFID) |
| 8 | pk_group | 协同集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 协同组织 | pk_org | varchar(20) |  | 组织 (org) |