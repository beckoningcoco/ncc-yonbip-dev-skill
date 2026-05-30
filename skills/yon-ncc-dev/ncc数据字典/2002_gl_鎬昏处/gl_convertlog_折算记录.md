# |<<

**折算记录 (gl_convertlog / nc.vo.gl.convertlog.convertlog)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srcvoucher | 来源凭证 | pk_srcvoucher | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_srcsob | 来源账簿 | pk_srcsob | char(20) |  | 主键 (UFID) |
| 4 | pk_dessob | 目的账簿 | pk_dessob | char(20) |  | 主键 (UFID) |
| 5 | pk_fcrule | 折算规则 | pk_fcrule | char(20) |  | 主键 (UFID) |
| 6 | converttime | 折算日期 | converttime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | issuccess | 是否成功 | issuccess | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_desvoucher | 生成凭证 | pk_desvoucher | char(20) |  | 主键 (UFID) |
| 9 | failreason | 失败原因 | failreason | int |  | 整数 (Integer) |
| 10 | pk_org | 折算主体 | pk_org | char(20) |  | 主键 (UFID) |
| 11 | isoccur | 是否发生 | isoccur | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 13 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |