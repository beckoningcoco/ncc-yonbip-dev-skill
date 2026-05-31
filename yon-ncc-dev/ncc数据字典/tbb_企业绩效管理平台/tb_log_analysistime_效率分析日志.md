# |<<

**效率分析日志 (tb_log_analysistime / nc.vo.tb.obj.AnalysistimeLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5727.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 任务PK | pk_task | char(20) |  | 主键 (UFID) |
| 3 | taskname | 任务名称 | taskname | varchar(200) |  | 字符串 (String) |
| 4 | pk_sheet | 表单pk | pk_sheet | char(20) |  | 主键 (UFID) |
| 5 | actiontype | 操作类型 | actiontype | varchar(50) |  | 字符串 (String) |
| 6 | starttime | 开始时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | exetime | 执行时间 | exetime | int |  | 整数 (Integer) |
| 8 | ufotime | ufo取数耗时 | ufotime | int |  | 整数 (Integer) |
| 9 | rulecount | 规则数量 | rulecount | int |  | 整数 (Integer) |
| 10 | formulacount | 公式数量 | formulacount | int |  | 整数 (Integer) |
| 11 | lvcount | 较大维度成员数量 | lvcount | varchar(500) |  | 字符串 (String) |
| 12 | sheetcellcount | 表单内单元格数量 | sheetcellcount | varchar(1000) |  | 字符串 (String) |
| 13 | cellcount | 单元格数量 | cellcount | int |  | 整数 (Integer) |
| 14 | pk_user | 用户PK | pk_user | char(20) |  | 主键 (UFID) |
| 15 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 16 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 17 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 18 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 19 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |