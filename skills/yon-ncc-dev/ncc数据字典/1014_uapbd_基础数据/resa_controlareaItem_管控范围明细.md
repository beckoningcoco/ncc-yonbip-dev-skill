# |<<

**管控范围明细 (resa_controlareaItem / nc.vo.resa.controlarea.ControlareaItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4890.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_controlareaitem | 管控范围明细主键 | pk_controlareaitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_factorchart | 成本要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 3 | pk_accchart | 管理科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 4 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |