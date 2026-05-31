# |<<

**汇总薪资类别 (wa_unitctg / nc.vo.wa.unitclass.UnitClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_unitctg | 薪资类别合并表主键 | pk_wa_unitctg | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 薪资类别表主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | classedid | 被合并工资类别ID | classedid | varchar(20) |  | 薪资方案 (WaClassVO) |
| 4 | iunittype | 合并类型 | iunittype | int |  | 整数 (Integer) |