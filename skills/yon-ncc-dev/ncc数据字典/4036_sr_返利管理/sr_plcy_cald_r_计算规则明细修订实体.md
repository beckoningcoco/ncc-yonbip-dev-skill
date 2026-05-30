# |<<

**计算规则明细修订实体 (sr_plcy_cald_r / nc.vo.sr.policy.revise.entity.PlcyCaldetReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_caldet_r | 计算规则明细修订实体 | pk_plcy_caldet_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_caldet | 计算规则明细实体 | pk_plcy_caldet | char(20) |  | 主键 (UFID) |
| 3 | njudgevaluefrom | 返利依据值从 | njudgevaluefrom | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | njudgevalueto | 返利依据值到 | njudgevalueto | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nprice | 返利价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | vmnyformula | 返利金额 | vmnyformula | varchar(500) |  | 返利取数函数 (formula) |
| 7 | cgrandrowno | 行号 | cgrandrowno | varchar(20) |  | 字符串 (String) |
| 8 | pk_plcy_calrule | 计算规则子实体 | pk_plcy_calrule | char(20) |  | 主键 (UFID) |
| 9 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |
| 10 | pk_plcy_calrule_r | 计算规则修订实体 | pk_plcy_calrule_r | char(20) |  | 主键 (UFID) |