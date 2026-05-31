# |<<

**现金流量辅助项对应规则 (gl_subtoass / nc.vo.gl.subjrelation.subjtovo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2484.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subtoass | 辅助项对应规则标识 | pk_subtoass | char(20) | √ | 主键 (UFID) |
| 2 | checktype | 辅助核算类型 | checktype | char(20) |  | 主键 (UFID) |
| 3 | checkvalue | 辅助核算值 | checkvalue | char(20) |  | 主键 (UFID) |
| 4 | freevalueid | 辅助核算ID | freevalueid | char(20) |  | 主键 (UFID) |
| 5 | pk_debitsubject | 借方科目 | pk_debitsubject | char(20) |  | 主键 (UFID) |
| 6 | pk_creditsubject | 贷方科目 | pk_creditsubject | char(20) |  | 主键 (UFID) |
| 7 | valuecode | 辅助核算编码 | valuecode | varchar(100) |  | 字符串 (String) |
| 8 | valuename | 辅助核算名称 | valuename | varchar(100) |  | 字符串 (String) |