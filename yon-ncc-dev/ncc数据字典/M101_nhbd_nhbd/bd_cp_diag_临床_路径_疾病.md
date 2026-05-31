# |<<

**临床_路径_疾病 (bd_cp_diag / com.yonyou.yh.nhis.bd.cp.vo.CPathDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cpdiag | 临床路径疾病主键 | pk_cpdiag | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 5 | pk_cp | 临床路径 | pk_cp | varchar(20) |  | 临床_路径 (bdcpath) |
| 6 | pk_diag | 诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |