# |<<

**折算规则 (gl_convertrule / nc.vo.gl.soblink.convertrule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_convertrule | 折算规则标识 | pk_convertrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | rulename | 规则名称 | rulename | varchar(30) |  | 字符串 (String) |
| 4 | rulecode | 规则编码 | rulecode | int |  | 整数 (Integer) |
| 5 | createorg | 创建机构 | createorg | char(20) |  | 主键 (UFID) |
| 6 | subjcodesame | 科目编码一致 | subjcodesame | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | subjmatcherro | 无对应科目处理方式 | subjmatcherro | int |  | 整数 (Integer) |
| 8 | defaultsubj | 默认科目 | defaultsubj | char(20) |  | 主键 (UFID) |
| 9 | curconvertstyle | 货币折算关系 | curconvertstyle | int |  | 整数 (Integer) |
| 10 | curconverttime | 折算日期 | curconverttime | int |  | 整数 (Integer) |
| 11 | lastmodify | 最后修改时间 | lastmodify | char(19) |  | 日期时间 (UFDateTime) |
| 12 | conditionvo | 折算条件 | conditionvo | image |  | BLOB (BLOB) |
| 13 | vouchertypeautomatch | 凭证类别自动匹配 | vouchertypeautomatch | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | defaultrule | 默认规则 | defaultrule | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_org | 所属财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 16 | sourcerule | 来源规则 | sourcerule | char(20) |  | 主键 (UFID) |
| 17 | cashflow | 是否携带现金流量 | cashflow | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | checkstyle | 是否携带现金流量2 | checkstyle | varchar(50) |  | 字符串 (String) |
| 19 | verify | 是否携带现金流量3 | verify | varchar(50) |  | 字符串 (String) |
| 20 | pk_docmaptemplet | 对照模版 | pk_docmaptemplet | varchar(20) |  | 基础档案对照模版 (docmaptemplete) |
| 21 | pk_soblink | 关联关系 | pk_soblink | varchar(20) |  | 折算账簿关联定义 (soblink) |
| 22 | pk_accountingbook | 核算账簿标识 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 23 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 24 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 26 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |