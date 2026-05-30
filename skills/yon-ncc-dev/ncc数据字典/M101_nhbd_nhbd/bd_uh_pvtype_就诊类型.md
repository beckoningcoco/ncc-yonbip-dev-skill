# |<<

**就诊类型 (bd_uh_pvtype / nc.vo.nhbd.wf.PVTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvtype | 就诊类型主键 | pk_pvtype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | suffix | 分表时后缀名 | suffix | varchar(50) |  | 字符串 (String) |
| 7 | pk_udcate | 发票自定义分类 | pk_udcate | char(20) |  | 主键 (UFID) |
| 8 | flag_cred | 信用管理标识 | flag_cred | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | flag_sys | 系统定义标识 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_active | 启用标识 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | innercode | 内连码 | innercode | varchar(50) |  | 字符串 (String) |
| 12 | father_pk | 上级 | father_pk | varchar(50) |  | 字符串 (String) |