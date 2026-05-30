# |<<

**对账账户实体 (gl_contrastaccount / nc.vo.cmp.cb.ContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2371.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastaccount | 对账账户Oid | pk_contrastaccount | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | contrastaccountname | 对帐帐户名称 | contrastaccountname | varchar(50) |  | 字符串 (String) |
| 5 | contrastsource | 来源 | contrastsource | integer |  | 整数 (Integer) |
| 6 | pk_currtype | 币种信息Oid | pk_currtype | varchar(50) |  | 字符串 (String) |
| 7 | contrastaspect | 对帐方向 | contrastaspect | integer |  | 整数 (Integer) |
| 8 | memo | 备用字段 | memo | varchar(181) |  | 字符串 (String) |
| 9 | pk_sob | 账簿Oid | pk_sob | varchar(20) |  | 字符串 (String) |
| 10 | iscontally | 是否包含未记账 | iscontally | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |