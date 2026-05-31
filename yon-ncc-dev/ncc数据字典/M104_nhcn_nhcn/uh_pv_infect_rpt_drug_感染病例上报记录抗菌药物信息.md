# |<<

**感染病例上报记录抗菌药物信息 (uh_pv_infect_rpt_drug / nc.vo.nhcn.infectrpt.InfectRptDrugVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inf_rpt_drug | 抗菌药物主键 | pk_inf_rpt_drug | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 药品医嘱主键 | pk_ord | char(20) | √ | 主键 (UFID) |
| 3 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 4 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 5 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 6 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 7 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |