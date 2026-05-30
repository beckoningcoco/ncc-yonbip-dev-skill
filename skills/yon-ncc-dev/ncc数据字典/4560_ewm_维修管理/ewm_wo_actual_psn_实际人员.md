# |<<

**实际人员 (ewm_wo_actual_psn / nc.vo.ewm.workorder.WOActualPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_actual_psn | 工单实际人员主键 | pk_wo_actual_psn | char(20) | √ | 主键 (UFID) |
| 2 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 3 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 4 | pk_job_type | 工种编码 | pk_job_type | varchar(20) |  | 工种 (craft) |
| 5 | pk_psndoc | 人员编码 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | man_hours | 实际工时(小时) | man_hours | decimal(28, 8) |  | 数值 (UFDouble) | 0 | [0 , ] |
| 7 | rate | 实际费率 | rate | decimal(28, 8) |  | 金额 (UFMoney) | 0 | [0 , ] |
| 8 | money | 实际成本 | money | decimal(28, 8) |  | 金额 (UFMoney) | 0 | [0 , ] |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 11 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 12 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |