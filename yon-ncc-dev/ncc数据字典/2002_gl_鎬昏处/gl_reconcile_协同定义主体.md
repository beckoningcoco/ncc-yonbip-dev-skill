# |<<

**协同定义主体 (gl_reconcile / nc.vo.gl.reconcile.reconcile)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | code | 协同业务编号 | code | varchar(15) |  | 字符串 (String) |
| 2 | name | 协同业务名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | shortname | 协同业务简称 | shortname | char(10) |  | 日期 (UFDate) |
| 4 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 5 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 6 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 7 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |