# |<<

**对账账户权限 (gl_power_contrastacc / nc.vo.cmp.contrastacc.contrastacc)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_power | 权限Oid | pk_power | char(20) | √ | 主键 (UFID) |
| 2 | pk_role | 角色Oid | pk_role | varchar(20) |  | 字符串 (String) |
| 3 | resource_data_id | 资源数据Oid | resource_data_id | varchar(100) |  | 字符串 (String) |
| 4 | orgtypecode | 主体类型编码 | orgtypecode | varchar(20) |  | 字符串 (String) |
| 5 | pk_org | 主体Oid | pk_org | varchar(20) |  | 字符串 (String) |
| 6 | iscommon_power | 是否公共权限 | iscommon_power | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_corp | 公司Oid | pk_corp | varchar(4) |  | 字符串 (String) |
| 8 | pk_contrastaccount | 对账账户Oid | pk_contrastaccount | varchar(20) |  | 字符串 (String) |
| 9 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |