# |<<

**易耗品存量 (rum_stocks / nc.vo.rum.stocks.StocksVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stocks | 存量主键 | pk_stocks | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 8 | union_key | 组合键 | union_key | varchar(60) |  | 字符串 (String) |
| 9 | pk_unit | 单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 11 | changerate | 换算率 | changerate | varchar(50) |  | 字符串 (String) |
| 12 | pk_main_unit | 主单位 | pk_main_unit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | main_num | 主数量 | main_num | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 14 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 15 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 16 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 17 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 18 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 19 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 20 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 21 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 22 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 23 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |