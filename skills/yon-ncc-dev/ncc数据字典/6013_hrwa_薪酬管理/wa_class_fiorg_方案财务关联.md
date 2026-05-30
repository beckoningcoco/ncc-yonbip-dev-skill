# |<<

**方案财务关联 (wa_class_fiorg / nc.vo.wa.category.WaFiorgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_class_fiorg | 主键 | pk_class_fiorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 方案主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | pk_financeorg | 财务组织主键 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |