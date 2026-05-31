# |<<

**现金流量业务规则 (gl_busrule / nc.vo.gl.busrule.busrule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2359.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busrule | 业务规则标识 | pk_busrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(50) |  | 字符串 (String) |
| 5 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |
| 6 | pk_setofbook | 账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | busrulecode | 业务规则编码 | busrulecode | char(20) |  | 主键 (UFID) |
| 8 | busrulename | 业务规则名称 | busrulename | char(40) |  | 主键 (UFID) |
| 9 | memo | 备注 | memo | char(20) |  | 主键 (UFID) |