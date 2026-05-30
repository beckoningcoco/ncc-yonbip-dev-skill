# |<<

**明细联查 (erm_detaillinkquery / nc.vo.ep.bx.BxDetailLinkQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detaillinkquery | 主键 | pk_detaillinkquery | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 业务单元主键 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | qryobj0pk | 查询对象1主键 | qryobj0pk | char(20) |  | 主键 (UFID) |
| 5 | qryobj0 | 查询对象1 | qryobj0 | varchar(100) |  | 字符串 (String) |
| 6 | qryobj1pk | 查询对象2主键 | qryobj1pk | char(20) |  | 主键 (UFID) |
| 7 | qryobj1 | 查询对象2 | qryobj1 | varchar(100) |  | 字符串 (String) |
| 8 | qryobj2pk | 查询对象3主键 | qryobj2pk | char(20) |  | 主键 (UFID) |
| 9 | qryobj2 | 查询对象3 | qryobj2 | varchar(100) |  | 字符串 (String) |
| 10 | qryobj3pk | 查询对象4主键 | qryobj3pk | char(20) |  | 主键 (UFID) |
| 11 | qryobj3 | 查询对象4 | qryobj3 | varchar(100) |  | 字符串 (String) |
| 12 | qryobj4pk | 查询对象5主键 | qryobj4pk | char(20) |  | 主键 (UFID) |
| 13 | qryobj4 | 查询对象5 | qryobj4 | varchar(100) |  | 字符串 (String) |
| 14 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 15 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 16 | djrq | 单据日期 | djrq | char(19) |  | 日期 (UFDate) |
| 17 | shrq | 审核日期 | shrq | char(19) |  | 日期 (UFDate) |
| 18 | effectdate | 生效日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 19 | zy | 摘要 | zy | varchar(200) |  | 备注 (Memo) |
| 20 | pk_jkbx | 单据主键 | pk_jkbx | char(20) |  | 主键 (UFID) |
| 21 | djbh | 单据号 | djbh | varchar(50) |  | 字符串 (String) |