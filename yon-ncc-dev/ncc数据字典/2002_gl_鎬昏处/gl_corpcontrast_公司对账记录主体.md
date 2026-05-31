# |<<

**公司对账记录主体 (gl_corpcontrast / nc.vo.gl.contrast.result.CorpContrastVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2392.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corpcontrast | 对账标识 | pk_corpcontrast | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_setofbook | 执行方账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 4 | year | 会计年度（本方凭证的年度） | year | char(4) |  | 主键 (UFID) |
| 5 | period | 会计期间（本方凭证的期间） | period | char(2) |  | 主键 (UFID) |
| 6 | pk_contrastrule | 科目对应关系 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 7 | btotalcontrast | 是否总额勾对 N-逐笔勾对 Y-总额勾对 | btotalcontrast | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | contrastdate | 对账日期 | contrastdate | char(19) |  | 日期 (UFDate) |
| 9 | coperatorid | 操作员 | coperatorid | char(20) |  | 主键 (UFID) |
| 10 | pk_selfbook | 本方帐簿类型 | pk_selfbook | char(20) |  | 主键 (UFID) |
| 11 | pk_selforg | 本方主体 | pk_selforg | char(20) |  | 主键 (UFID) |
| 12 | pk_otherbook | 对方帐簿类型 | pk_otherbook | char(20) |  | 主键 (UFID) |
| 13 | pk_otherorg | 对方主体 | pk_otherorg | char(20) |  | 主键 (UFID) |
| 14 | pk_otheraccountingbook | 对方帐簿 | pk_otheraccountingbook | char(20) |  | 主键 (UFID) |
| 15 | pk_selfaccountingbook | 本方帐簿 | pk_selfaccountingbook | char(20) |  | 主键 (UFID) |
| 16 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 17 | contrastperiod | 对账期间 | contrastperiod | varchar(50) |  | 字符串 (String) |
| 18 | batchno | 批次号 | batchno | varchar(50) |  | 字符串 (String) |