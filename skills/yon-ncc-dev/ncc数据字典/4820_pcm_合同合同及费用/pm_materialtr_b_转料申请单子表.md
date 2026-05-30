# |<<

**转料申请单子表 (pm_materialtr_b / nc.vo.pcm.materialtransf.MaterialTransfBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4484.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialtr_b | 申请单子表主键 | pk_materialtr_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | pk_wbs | 转入项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 10 | nnum | 数量 | nnum | varchar(28) |  | 数值 (UFDouble) |
| 11 | pk_dest_cbsnode | 转入CBS | pk_dest_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 12 | pk_src_cbsnode | 转出CBS | pk_src_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 13 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 14 | pk_stockorg_v | 库存组织版本 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 15 | pk_storage | 仓库 | pk_storage | varchar(20) |  | 仓库 (stordoc) |
| 16 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |