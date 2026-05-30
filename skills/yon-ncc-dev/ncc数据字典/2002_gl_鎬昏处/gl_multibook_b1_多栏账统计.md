# |<<

**多栏账统计 (gl_multibook_b1 / nc.vo.gl.multbook.gl_multbook_b1)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_statcol | 统计栏目主键 | pk_statcol | char(20) | √ | 主键 (UFID) |
| 2 | pk_multicol | 多栏账外键 | pk_multicol | char(20) |  | 主键 (UFID) |
| 3 | statindex | 统计栏目序号 | statindex | int |  | 整数 (Integer) |
| 4 | pk_value | 统计栏目外键 | pk_value | char(20) |  | 主键 (UFID) |
| 5 | statcolcode | 统计栏目编码 | statcolcode | char(20) |  | 主键 (UFID) |
| 6 | statcolname | 统计栏目名称 | statcolname | varchar(50) |  | 字符串 (String) |
| 7 | dsplocation | 统计栏目显示位置 | dsplocation | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 9 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 10 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 11 | pk_accountingbook | 账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |