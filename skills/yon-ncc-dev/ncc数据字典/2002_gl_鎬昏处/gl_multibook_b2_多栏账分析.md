# |<<

**多栏账分析 (gl_multibook_b2 / nc.vo.gl.multbook.gl_multbook_b2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_analycol | 分析栏目主键 | pk_analycol | char(20) | √ | 主键 (UFID) |
| 2 | pk_multicol | 多栏账外键 | pk_multicol | char(20) |  | 主键 (UFID) |
| 3 | analyindex | 分析栏目序号 | analyindex | int |  | 整数 (Integer) |
| 4 | pk_analycolvalue | 分析栏目外键 | pk_analycolvalue | char(20) |  | 主键 (UFID) |
| 5 | analycolcode | 分析栏目编码 | analycolcode | char(40) |  | 主键 (UFID) |
| 6 | analycolname | 分析栏目名称 | analycolname | varchar(40) |  | 字符串 (String) |
| 7 | analyori | 分析方向 | analyori | int |  | 整数 (Integer) |
| 8 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 9 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 10 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 11 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |