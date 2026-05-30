# |<<

**物料附卡 (pam_std_job_materiel / nc.vo.am.stdjob.StdJobMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_std_job_materiel | 物料附卡标识 | pk_std_job_materiel | char(20) | √ | 主键 (UFID) |
| 2 | pk_std_job_task | 作业序号 | pk_std_job_task | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 6 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 7 | sequence_num | 序号 | sequence_num | int |  | 整数 (Integer) |
| 8 | pk_material | 物料主键 | pk_material | varchar(20) |  | 字符串 (String) |
| 9 | pk_material_v | 物料档案 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 15 | reference_price | 主参考单价 | reference_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | total_price | 参考成本 | total_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |