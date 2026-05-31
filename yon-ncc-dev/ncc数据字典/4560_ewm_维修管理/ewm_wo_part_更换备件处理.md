# |<<

**更换备件处理 (ewm_wo_part / nc.vo.ewm.workorder.WOPartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1965.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_part | 主键 | pk_wo_part | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_material | 备件 | pk_material | varchar(20) |  | 字符串 (String) |
| 4 | pk_material_v | 备件编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | pk_dispose_means | 处理方法 | pk_dispose_means | varchar(20) |  | 更换备件处理方法 (disposemeans) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 8 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 9 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 10 | replacedate | 更换日期 | replacedate | char(19) |  | 日期 (UFDate) |
| 11 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 16 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |