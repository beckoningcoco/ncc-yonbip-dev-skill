# |<<

**工序计划 (mm_dmo_procedure_v / nc.vo.mmpac.dmo.entity.DmoProcedureVerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3664.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_procedure_v | 离散生产订单工序版本 | pk_procedure_v | char(20) | √ | 主键 (UFID) |
| 2 | pk_procedure | 离散生产订单工序 | pk_procedure | char(20) | √ | 主键 (UFID) |
| 3 | vprocedureno | 工序号 | vprocedureno | varchar(20) |  | 字符串 (String) |
| 4 | brework | 返工工序 | brework | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | fnextwork | 后续加工 | fnextwork | int |  | 后续加工类型 (DmoProcFnextworkEnum) |  | 1=下一道序; |