# |<<

**销售协同明细 (scm_coopsetup_b / nc.vo.scmf.coop.entity.CoopBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5212.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_coopsetup_b | 销售协同明细PK | pk_coopsetup_b | char(20) | √ | 主键 (UFID) |
| 2 | csourcefieldnameid | 源协同项 | csourcefieldnameid | varchar(20) |  | 字符串 (String) |
| 3 | ctargetfieldnameid | 目标协同项 | ctargetfieldnameid | varchar(50) |  | 字符串 (String) |
| 4 | fvaluemodule | 取值方式 | fvaluemodule | int |  | 取值方式 (enum) |  | 1=固定值; |