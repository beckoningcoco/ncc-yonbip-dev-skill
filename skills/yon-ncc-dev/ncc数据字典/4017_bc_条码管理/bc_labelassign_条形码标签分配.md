# |<<

**条形码标签分配 (bc_labelassign / nc.vo.bc.labelassign.entity.AssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign | 条形码标签分配 | pk_assign | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | cmaterialclass | 物料基本分类编码 | cmaterialclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cmaterialoid | 物料最新版本 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_barcoderule | 物料条形码规则 | pk_barcoderule | varchar(20) |  | 条码规则 (barcoderule_v) |
| 9 | pk_barcodelabel | 条形码标签 | pk_barcodelabel | varchar(20) |  | 条码标签 (bc_barcodelabel) |
| 10 | bdefault | 默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |