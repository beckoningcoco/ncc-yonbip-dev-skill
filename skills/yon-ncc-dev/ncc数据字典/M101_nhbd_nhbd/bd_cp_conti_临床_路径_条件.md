# |<<

**临床_路径_条件 (bd_cp_conti / com.yonyou.yh.nhis.bd.cp.vo.CPathCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cpconti | 临床路径入径条件主键 | pk_cpconti | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_cp | 临床路径 | pk_cp | varchar(20) |  | 临床_路径 (bdcpath) |
| 5 | code_conti | 条件编码 | code_conti | varchar(30) |  | 字符串 (String) |
| 6 | name_conti | 条件名称 | name_conti | varchar(50) |  | 字符串 (String) |
| 7 | tblname | 表名 | tblname | varchar(100) |  | 字符串 (String) |
| 8 | fldname | 字段名 | fldname | varchar(100) |  | 字符串 (String) |
| 9 | sqls | SQL串 | sqls | varchar(4000) |  | 字符串 (String) |
| 10 | val_conti | 条件数值 | val_conti | varchar(256) |  | 字符串 (String) |
| 11 | dt_op | 运算关系编码 | dt_op | varchar(50) |  | 字符串 (String) |
| 12 | pk_op | 运算关系 | pk_op | varchar(50) |  | 字符串 (String) |