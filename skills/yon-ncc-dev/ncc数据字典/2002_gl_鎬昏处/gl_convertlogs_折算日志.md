# |<<

**折算日志 (gl_convertlogs / nc.vo.gl.convertlogs.convertlogs)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertlog | 主键 | pk_convertlog | char(20) | √ | 主键 (UFID) |
| 2 | pk_srcorgbook | 来源账簿 | pk_srcorgbook | char(20) |  | 主键 (UFID) |
| 3 | pk_desorgbook | 目的账簿 | pk_desorgbook | char(20) |  | 主键 (UFID) |
| 4 | pk_bootorgbook | 原始账簿 | pk_bootorgbook | char(20) |  | 主键 (UFID) |
| 5 | pk_srcvoucher | 来源凭证 | pk_srcvoucher | char(20) |  | 主键 (UFID) |
| 6 | pk_rootvoucher | 原始凭证 | pk_rootvoucher | char(20) |  | 主键 (UFID) |
| 7 | pk_desvoucher | 生成凭证 | pk_desvoucher | char(20) |  | 主键 (UFID) |
| 8 | extends1 | 扩展字段1 | extends1 | varchar(40) |  | 字符串 (String) |
| 9 | extends2 | 扩展字段2 | extends2 | varchar(40) |  | 字符串 (String) |
| 10 | extends3 | 扩展字段3 | extends3 | varchar(40) |  | 字符串 (String) |
| 11 | extends4 | 扩展字段4 | extends4 | varchar(40) |  | 字符串 (String) |
| 12 | extends5 | 扩展字段5 | extends5 | varchar(40) |  | 字符串 (String) |
| 13 | extends6 | 扩展字段6 | extends6 | varchar(40) |  | 字符串 (String) |
| 14 | extends7 | 扩展字段7 | extends7 | varchar(40) |  | 字符串 (String) |
| 15 | extends8 | 扩展字段8 | extends8 | varchar(40) |  | 字符串 (String) |
| 16 | extends9 | 扩展字段9 | extends9 | varchar(40) |  | 字符串 (String) |
| 17 | extends10 | 扩展字段10 | extends10 | varchar(40) |  | 字符串 (String) |
| 18 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 19 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 20 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 21 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |