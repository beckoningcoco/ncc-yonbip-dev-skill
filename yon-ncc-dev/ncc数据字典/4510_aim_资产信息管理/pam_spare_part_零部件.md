# |<<

**零部件 (pam_spare_part / nc.vo.aim.equip.SparePartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spare_part | 备品备件主键 | pk_spare_part | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | ass_unit | 单位 | ass_unit | varchar(20) |  | 计量单位 (measdoc) |
| 8 | ass_num | 数量 | ass_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | change_rate | 换算率 | change_rate | varchar(50) |  | 字符串 (String) |
| 10 | unit | 主单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 11 | num | 主数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | serial_num | 存货序列号 | serial_num | varchar(150) |  | 字符串 (String) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |