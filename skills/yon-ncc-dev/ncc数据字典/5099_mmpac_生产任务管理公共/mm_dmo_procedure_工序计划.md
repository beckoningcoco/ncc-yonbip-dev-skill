# |<<

**工序计划 (mm_dmo_procedure / nc.vo.mmpac.dmo.entity.DmoProcedureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_procedure | 离散生产订单工序 | pk_procedure | char(20) | √ | 主键 (UFID) |
| 2 | vprocedureno | 工序号 | vprocedureno | varchar(20) |  | 字符串 (String) |
| 3 | vproceduretype | 工序编码 | vproceduretype | varchar(20) |  | 标准工序 (pd_rc) |
| 4 | brework | 返工工序 | brework | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | npcstime | 单位定额 | npcstime | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | fnextwork | 后续加工 | fnextwork | int |  | 后续加工 (PMOFNextworkEnum) |  | 1=下一道序; |