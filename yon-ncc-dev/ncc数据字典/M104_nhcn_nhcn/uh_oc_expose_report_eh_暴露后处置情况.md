# |<<

**暴露后处置情况 (uh_oc_expose_report_eh / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportEhVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_eh | 主键 | pk_oc_expose_report_eh | char(20) | √ | 主键 (UFID) |
| 2 | flag_wr | 皮肤清水冲洗 | flag_wr | char(50) |  | 字符串 (String) |
| 3 | time_wr | 皮肤冲洗时间 | time_wr | varchar(50) |  | 字符串 (String) |
| 4 | flag_ls | 皮肤皂液或洗手液清洗 | flag_ls | char(50) |  | 字符串 (String) |
| 5 | flag_sb | 皮肤挤出伤口血液 | flag_sb | char(50) |  | 字符串 (String) |
| 6 | flag_ld | 皮肤局部消毒 | flag_ld | char(50) |  | 字符串 (String) |
| 7 | pk_disinfectant | 皮肤消毒剂名称主键 | pk_disinfectant | char(20) |  | 主键 (UFID) |
| 8 | dt_disinfectant | 皮肤消毒剂名称 | dt_disinfectant | varchar(50) |  | 字符串 (String) |
| 9 | pk_flushing_solution | 黏膜冲洗溶液主键 | pk_flushing_solution | char(20) |  | 主键 (UFID) |
| 10 | dt_flushing_solution | 黏膜冲洗溶液 | dt_flushing_solution | varchar(50) |  | 字符串 (String) |
| 11 | time_fs | 黏膜冲洗时间 | time_fs | varchar(50) |  | 字符串 (String) |
| 12 | other | 其它 | other | varchar(50) |  | 字符串 (String) |
| 13 | what_happened | 事情具体经过 | what_happened | varchar(50) |  | 字符串 (String) |
| 14 | handling_opinions | 病区处理意见 | handling_opinions | varchar(50) |  | 字符串 (String) |
| 15 | recommended_disposal | 建议处置情况 | recommended_disposal | varchar(50) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 17 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 18 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 19 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 20 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |