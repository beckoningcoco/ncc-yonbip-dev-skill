# |<<

**BOM物料树节点 (mm_bom_material / nc.vo.bd.bom.bom0202.entity.BomMaterialTreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3633.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | nodeid | 节点 | nodeid | char(20) | √ | 主键 (UFID) |
| 2 | parent_nodeid | 父节点 | parent_nodeid | char(20) |  | 主键 (UFID) |
| 3 | pk_material | 物料版本 | pk_material | char(20) |  | 主键 (UFID) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 8 | parent_materialvid | 父节点物料 | parent_materialvid | char(20) |  | 主键 (UFID) |
| 9 | version | 物料版本号 | version | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | bomtype | BOM类型 | bomtype | int |  | BOM类型 (bomtype) |  | 1=生产BOM; |