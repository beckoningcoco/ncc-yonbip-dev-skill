# |<<

**物料存放规则 (ic_storectl / nc.vo.ic.mstorectl.StorectlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstorectlid | 物料存放规则主键 | cstorectlid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_corp | 公司 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 6 | cinventoryclassid | 物料分类 | cinventoryclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | fseparatespace | 是否单独存放 | fseparatespace | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ffixedspace | 是否固定货位 | ffixedspace | char(1) |  | 布尔类型 (UFBoolean) |