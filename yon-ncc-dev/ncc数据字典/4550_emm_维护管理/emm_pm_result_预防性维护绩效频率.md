# |<<

**预防性维护绩效频率 (emm_pm_result / nc.vo.emm.premaintain.PMResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pm_result | 主键 | pk_pm_result | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_measure_point | 测量点主键 | pk_measure_point | varchar(50) |  | 字符串 (String) |
| 7 | pk_measure_point_b | 测量点 | pk_measure_point_b | varchar(20) |  | 测量点明细 (measpointBodyVO) |
| 8 | pk_measure_item | 测量项目 | pk_measure_item | varchar(20) |  | 测量项目 (measureitems) |
| 9 | pk_measdoc | 测量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 10 | initial_num | 起始读数 | initial_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 11 | gen_rate | 生成频率 | gen_rate | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 12 | ahead_num | 提前量 | ahead_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pre_start_num | 上一工单开始读数 | pre_start_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pre_end_num | 上一工单结束读数 | pre_end_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | next_num | 下一工单读数 | next_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | alter_flag | 可变计划 | alter_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | persist_flag | 已调整 | persist_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_adjuster | 调整人 | pk_adjuster | varchar(20) |  | 用户 (user) |
| 19 | adjust_date | 调整日期 | adjust_date | char(19) |  | 日期时间 (UFDateTime) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |