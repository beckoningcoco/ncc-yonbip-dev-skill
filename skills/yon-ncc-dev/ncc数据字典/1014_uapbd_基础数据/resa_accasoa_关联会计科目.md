# |<<

**关联会计科目 (resa_accasoa / nc.vo.resa.factor.FactorBDAsoaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accasoa | 标识 | pk_accasoa | char(20) | √ | 主键 (UFID) |
| 2 | pk_factor | 核算要素标识 | pk_factor | char(20) | √ | 主键 (UFID) |
| 3 | pk_accchart | 科目表标识 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 4 | pk_account | 科目标识 | pk_account | varchar(20) |  | 会计科目 (accasoa) |