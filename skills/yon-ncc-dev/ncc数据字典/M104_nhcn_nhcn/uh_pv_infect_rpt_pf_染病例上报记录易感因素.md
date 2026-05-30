# |<<

**染病例上报记录易感因素 (uh_pv_infect_rpt_pf / nc.vo.nhcn.infectrpt.InfectRptPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect_rpt_pf | 主键 | pk_infect_rpt_pf | char(20) | √ | 主键 (UFID) |
| 2 | pk_predisposing_factors | 易感因素主键 | pk_predisposing_factors | char(20) |  | 主键 (UFID) |
| 3 | dt_predisposing_factors | 易感因素编码0 | dt_predisposing_factors | varchar(50) |  | 字符串 (String) |
| 4 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 5 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 6 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 7 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 8 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |