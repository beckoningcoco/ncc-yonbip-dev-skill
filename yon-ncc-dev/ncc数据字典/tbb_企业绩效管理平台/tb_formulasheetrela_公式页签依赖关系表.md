# |<<

**公式页签依赖关系表 (tb_formulasheetrela / nc.vo.tb.form.FormulaSheetRelaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5722.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 字符串 (String) |
| 2 | pk_workbook | 套表主键 | pk_workbook | varchar(20) |  | 字符串 (String) |
| 3 | pk_sheet_target | 目标页签主键 | pk_sheet_target | varchar(20) |  | 字符串 (String) |
| 4 | pk_sheet_orig | 依赖页签主键 | pk_sheet_orig | varchar(20) |  | 字符串 (String) |
| 5 | formula_type | 公式类别 | formula_type | char(1) |  | 字符串 (String) |
| 6 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 7 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 8 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 9 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 10 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |